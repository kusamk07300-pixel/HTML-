# Arvind Party - Refactored Android Project

## 1. Project Extraction Summary

This directory contains the refactored and cleaned source code and resources from the decompiled "Arvind Party" Android application (`babycat_release_06101853_1.0.4_4.apk_Decompiler.com`).

The extraction process focused on separating the core business logic, UI screens, and essential assets from proprietary SDKs (like Tencent TRTC/IM), obfuscated code, and standard libraries that should be managed by a build system like Gradle.

The result is a clean, organized project structure under `app/src/main/` that can be imported into a new Android Studio project. A PowerShell script, `refactor.ps1`, is included to demonstrate and automate the extraction process performed.

## 2. Extracted Components

### Core Application Logic
- **Main Package:** `net.babycat.live`
- **Location:** `app/src/main/java/net/babycat/live/`
- **Animation Engine:** The custom gift animation player from `com.tencent.qgame` has been retained.
  - **Location:** `app/src/main/java/com/tencent/qgame/`

### UI Screens / Modules
The application's features are organized into modules. The primary UI screens and Activities/Fragments can be found in the following locations, with corresponding XML layouts in `app/src/main/res/layout/`:

- **Authentication (`modules/auth`):**
  - Login (Phone, Email, Third-party): `activity_login_*.xml`
  - User Info Setup: `activity_login_user_info.xml`
- **Voice & Room (`modules/voice`, `modules/room`):**
  - Voice Chat Room: `activity_voice_chat_room_main.xml`
  - Room Details & Creation: `activity_voice_room_detail.xml`, `fragment_create_voice_room.xml`
  - Live Audience/Anchor Views: `act_live_anchor.xml`, `act_live_audience.xml`
- **User Profile & Social (`modules/profile`, `modules/feed`):**
  - User Profile/Space: `activity_my_profile.xml`, `activity_my_space.xml`
  - Friends & Followers: `activity_my_friends.xml`, `fragment_follow_list.xml`
  - Dynamic Feeds/Moments: `fragment_dynamic_list.xml`, `activity_dynamic_push.xml`
- **Creator & Agency (`modules/creator`):**
  - Agency/Family Home: `act_agency_registration.xml`, `activity_my_family_info.xml`
  - Salary & Revenue: `act_agency_salary.xml`, `activity_salary_bill.xml`
- **Gifting & Economy:**
  - Gift Dialogs: `custom_room_gift_list.xml`, `popup_select_gift.xml`
  - Recharge/Shop: `act_my_shop.xml`, `fragment_recharge_item.xml`
  - VIP & Levels: `activity_my_level.xml`, `activity_my_vip.xml`

### Data Models
An extensive set of data models (POJOs/Data Classes) has been extracted, representing the application's API entities.
- **Location:** `app/src/main/java/net/babycat/live/model/`
- **Examples:** `UserProfile.java`, `RoomInfoBean.java`, `GiftListBean.java`, `FamilyHomeBean.java`, `ChargeBean.java`.

### Key Assets
The following critical assets have been preserved:
- **Location:** `app/src/main/assets/`
- **AI Face/Filter Models:** `model/ai_face_processor.bundle`
- **App Configuration:** `province.json`, `MusicControlKit.json`
- **Gift Animations & Stickers:** The `res/raw`, `res/mipmap-xxxhdpi`, `assets/sticker` and `assets/svg` directories contain numerous `.webp`, `.gif`, and `.svga` files for gifts.
- **UI Themes & Styles:** All necessary XML resources (`colors.xml`, `styles.xml`, `strings.xml`, etc.) are in `res/values/`.
- **Fonts:** Custom fonts are located in `res/font/`.

## 3. Next Steps & Refactoring Guidance

### Step 1: Create a New Android Project
1.  Open Android Studio.
2.  Create a new, empty Android project. Give it a package name like `net.babycat.live`.
3.  Choose **Kotlin** or **Java** as the primary language (the extracted code is Java, but it can be mixed).

### Step 2: Integrate Extracted Files
1.  Close Android Studio.
2.  Navigate to the newly created project's `app/src/main/` directory.
3.  **Delete** the `java`, `res`, and `assets` directories that Android Studio just created.
4.  **Copy** the `java`, `res`, `assets`, and `AndroidManifest.xml` files from this `ArvindParty_Clean` directory into your new project's `app/src/main/` directory.

### Step 3: Configure `build.gradle` Dependencies
1.  Open the project in Android Studio again. It will show many errors because of missing dependencies.
2.  Open your `app/build.gradle` file.
3.  Add the standard libraries that were removed during the cleanup. Based on the decompiled source, you will likely need:
    ```gradle
    dependencies {
        // Networking
        implementation 'com.squareup.retrofit2:retrofit:2.9.0'
        implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
        implementation 'com.squareup.okhttp3:okhttp:4.9.3'
        implementation 'com.squareup.okhttp3:logging-interceptor:4.9.3'

        // Image Loading
        implementation 'com.github.bumptech.glide:glide:4.12.0'
        annotationProcessor 'com.github.bumptech.glide:compiler:4.12.0'

        // JSON Serialization
        implementation 'com.google.code.gson:gson:2.8.9'

        // Event Bus
        implementation 'org.greenrobot:eventbus:3.3.1'

        // AndroidX & Material Design (use latest versions)
        implementation 'androidx.core:core-ktx:1.9.0'
        implementation 'androidx.appcompat:appcompat:1.6.1'
        implementation 'com.google.android.material:material:1.8.0'
        implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
        implementation 'androidx.recyclerview:recyclerview:1.3.0'
        
        // Add other libraries as you discover them from unresolved imports...
    }
    ```
4. Enable databinding or viewbinding if the layouts use it. In `app/build.gradle` inside the `android` block:
    ```gradle
    buildFeatures {
        viewBinding true
        // or
        dataBinding true
    }
    ```

### Step 4: Replace RTC/IM with LiveKit
The original app used Tencent's proprietary TRTC and IM SDKs. The goal is to replace this with LiveKit.

1.  **Remove Tencent Stubs:** Search the codebase for `import com.tencent.*` (specifically `trtc` and `imsdk`) and identify the classes that directly interact with the old SDK. These will be your integration points.
2.  **Integrate LiveKit SDK:** Add the LiveKit Android SDK to your `build.gradle`.
    ```gradle
    implementation 'io.livekit:livekit-android:1.2.0' // Check for the latest version
    ```
3.  **Refactor Voice/Room Logic:**
    - The core logic for joining rooms, handling mic seats, and events is likely within `modules/voice/` and `modules/room/`.
    - You will need to map the concepts from the old SDK to LiveKit's concepts (Room, Participant, Track).
    - Look for a central class, perhaps named `RoomManager`, `VoiceManager`, or similar, that handles RTC events.
    - The `RtcTokenBean.java` model suggests the app fetches a token to join a room. You will need to adapt your Node.js backend to generate a LiveKit-compatible JWT access token instead.
    - Replace Tencent's `SurfaceView` or `TextureView` implementations used for video with LiveKit's `VideoTrack` attached to a `LiveKitVideoView`.

### Step 5: Backend Integration
The app communicates with a custom backend. The `model` classes provide a clear contract for the API endpoints.
- **API Client:** Look for the Retrofit interface definitions (likely in `platform/api` or a similar directory) to see the exact endpoint paths and request methods.
- **Node.js/Express Backend:** You will need to re-implement a backend that serves these endpoints. Use the model classes as a guide for the expected JSON request/response bodies.
- **Authentication:** The backend will need to handle user authentication and, when requested, generate the LiveKit access tokens mentioned in the previous step.
