# Tencent TRTC/IM Stub & Bypass Guide

## Purpose
This guide explains which Tencent TRTC (Real-Time Communication) and IM (Instant Messaging) SDK initializations need to be temporarily stubbed or commented out so the app can launch and be tested without crashing on startup.

## Critical Initialization Points

### 1. MyApplication.java (Line 291)
**Location:** `app/src/main/java/net/babycat/live/app/MyApplication.java`

**Current Code:**
```java
RCSceneKitEngine.getInstance().initWithAppKey(this, null);
```

**Action:** Wrap in try-catch or comment out if `RCSceneKitEngine` is part of the RongCloud/TRTC integration:
```java
try {
    // RCSceneKitEngine.getInstance().initWithAppKey(this, null);
} catch (Exception e) {
    e.printStackTrace();
}
```

**Rationale:** This initializes the RongCloud scene kit which requires valid app credentials. For local testing, we bypass this.

---

### 2. LoginThirdPartyActivity.java
**Location:** `app/src/main/java/net/babycat/live/modules/auth/ui/LoginThirdPartyActivity.java`

**Key Method:** After successful third-party login (Google, etc.)

**Action:** Comment out IM SDK login/signature generation:
```java
// TENCENT IM SDK Login - STUB FOR TESTING
// String userSigIm = imUtils.generateUserSig(userId);
// this.f34978t.s("user_sig_im", userSigIm);
```

**Rationale:** The `user_sig_im` is required for Tencent IM authentication. For local testing, skip this and navigate directly to `MainActivity`.

---

### 3. NewVoiceChatRoomActivity.java (TRTC Room Join)
**Location:** `app/src/main/java/net/babycat/live/modules/voice/ui/NewVoiceChatRoomActivity.java`

**Key Methods:**
- `joinRoom()` or similar TRTC room join logic
- `enterRoom()` with TRTCCloud

**Action:** Replace TRTC room joining with dummy success:
```java
// TRTCCloud.sharedInstance().joinRoom(...);
// STUB: Simulate successful room join
handler.postDelayed(() -> {
    // Proceed to room UI
    onRoomJoinedSuccess();
}, 1000);
```

---

### 4. BabyCatRTCNotificationService
**Location:** `app/src/main/java/net/babycat/live/platform/util/BabyCatRTCNotificationService.java`

**Action:** Disable the service or make it return early:
```java
@Override
public int onStartCommand(Intent intent, int flags, int startId) {
    // STUB: Do not start foreground service for testing
    stopSelf();
    return START_NOT_STICKY;
}
```

**Rationale:** Foreground service requires proper notification channel setup and permissions.

---

### 5. TRTCCloud Initialization Calls
**Locations:** Various Activities that call `TRTCCloud`

**Search Pattern:** `TRTCCloud.`

**Action:** Replace with empty implementations:
```java
// STUB
com.tencent.rtmp.TRTCCloud.destroySharedInstance();
// or use reflection to avoid ClassNotFoundException
try {
    Class<?> trtcClass = Class.forName("com.tencent.rtmp.TRTCCloud");
    Method destroyMethod = trtcClass.getDeclaredMethod("destroySharedInstance");
    destroyMethod.invoke(null);
} catch (Exception e) {
    // Expected during testing without TRTC SDK
}
```

---

## Testing Flow After Stubbing

1. **Launch SplashActivity** → Should show splash screen and auto-redirect
2. **LoginThirdPartyActivity** → Click Google/Account login → Should skip IM auth and go to MainActivity
3. **MainActivity** → Should load the main UI (bottom navigation, room list)
4. **Voice Room** → Should open room UI without TRTC connection errors

---

## Known Issues If Not Stubbed

- **App crash on startup:** `NoClassDefFoundError` for TRTC classes
- **NullPointerException:** Missing IM user credentials
- **Network timeout:** TRTC SDK trying to connect to Tencent servers
- **Permission denied:** Foreground service notification issues

---

## How to Re-enable TRTC/IM Later

1. **Obtain Tencent Cloud credentials:**
   - Create account at https://console.cloud.tencent.com
   - Create TRTC and IM applications
   - Get SDKAppID, SecretKey, and AppKeys

2. **Restore initialization code** in `MyApplication.onCreate()`

3. **Add `tui_config.json` or equivalent** to assets folder

4. **Remove stub code** from above locations

5. **Verify permissions** in AndroidManifest.xml are sufficient

---

## Important Notes

- The obfuscated code (`in.b`, `co.c`, etc.) makes it hard to identify exact class names. You may need to decompile further or use debugger to trace exact entry points.
- Some UI components (e.g., `LiveTopLayoutView`, `LiveBottomMenuLayoutView`) may depend on TRTC state. Ensure they handle `null` gracefully.
- The `MySetActivity` (logging out) explicitly calls `TRTCCloud.destroySharedInstance()` — keep this for cleanup.
- EventBus events like `EVENT_SUSPENDED_ROOM_CLOSE` will still fire but may have no listeners if TRTC is not initialized.

---

## AndroidManifest Verification

The `AndroidManifest.xml` has been reviewed and contains:

### Correctly Declared Elements
- **Launcher Activity:** `SplashActivity` with MAIN/LAUNCHER intent filter
- **Main Activity:** `MainActivity` with portrait orientation
- **All 70+ Activities:** Properly declared with `android:exported="false"` and portrait orientation
- **Required Permissions:**
  - `INTERNET`, `ACCESS_NETWORK_STATE`, `ACCESS_WIFI_STATE`
  - `RECORD_AUDIO`, `CAMERA`, `MODIFY_AUDIO_SETTINGS`
  - `FOREGROUND_SERVICE`, `FOREGROUND_SERVICE_MICROPHONE`
  - `POST_NOTIFICATIONS` (Android 13+)
  - `READ_MEDIA_IMAGES`, `READ_MEDIA_VIDEO`, `READ_MEDIA_AUDIO`
  - `VIBRATE`, `WAKE_LOCK`
  - `BLUETOOTH`
- **Services:** `MyServices`, `BabyCatRTCNotificationService`, `TransportBackendDiscovery`
- **Content Providers:** FileProvider, LitePal, TUikit services
- **Third-party Activities:** Tencent TUikit (IM), Google Sign-In, UCrop, etc.

### Potential Issues
- `NewVoiceChatRoomActivity` uses `android:persistent="true"` which may cause issues if TRTC crashes
- `android:supportsPictureInPicture="true"` on voice rooms may need testing
- `android:networkSecurityConfig="@xml/network_security_config"` must exist

### Required Assets
Ensure these exist in `res/xml/`:
- `network_security_config.xml` (allows cleartext for development)
- `filepaths.xml` (for FileProvider)
- `util_code_provider_paths.xml`
- `ps_file_paths.xml`

## Quick Test Checklist

- [ ] Splash screen displays and auto-navigates
- [ ] Login screen appears with Google/Account options
- [ ] Login completes without IM/TRTC errors
- [ ] Main UI loads (tabs: Discover, Message, Profile)
- [ ] Room list displays
- [ ] Room detail opens
- [ ] Microphone/Camera permissions requested (if needed)
- [ ] No crashes in logcat related to TRTC/IM
