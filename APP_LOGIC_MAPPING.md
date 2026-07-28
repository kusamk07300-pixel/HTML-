# App Logic Mapping Documentation

## Overview
This document maps the core Java business logic in `java/net/babycat/live/`, lists the data models, and explains how UI activities handle user interactions. Note: The code has been obfuscated by a decompiler, so some class names are mangled (e.g., `in.b`, `co.c`).

---

## 1. Architecture Pattern

### MVP (Model-View-Presenter)
The app follows a custom MVP pattern with obfuscated base classes:

- **Base Activity:** `in.b` (extends Android native Activity)
- **Base Presenter:** `co.c`, `co.e`, etc. (generic presenter classes)
- **View Interface:** Activities implement interfaces like `b.InterfaceC0104b`

### Dependency Injection
- Uses Dagger Android (`DispatchingAndroidInjector<Activity>`)
- Main injection point: `MyApplication.onCreate()`

### Data Layer
- **Local:** LitePal (ORM), SharedPreferences (`x1` wrapper)
- **Network:** Retrofit + RxJava + Gson
- **Caching:** Media3 cache, HTTP response cache

---

## 2. Core Package Structure

```
java/net/babycat/live/
├── app/
│   └── MyApplication.java          # Application entry point
├── model/                          # Data models (100+ beans)
│   ├── InitBean.java
│   ├── LoginDataBean.java
│   ├── RoomListBean.java
│   ├── GiftListBean.java
│   └── [100+ model classes]
├── modules/
│   ├── auth/                       # Authentication flows
│   │   └── ui/
│   │       ├── SplashActivity.java
│   │       ├── LoginThirdPartyActivity.java
│   │       ├── LoginPhoneActivity.java
│   │       ├── LoginEmailActivity.java
│   │       ├── LoginAccountActivity.java
│   │       ├── VerificationCodeActivity.java
│   │       └── LoginUserInfoActivity.java
│   ├── room/                       # Room management
│   │   └── ui/
│   │       ├── CreatePersonalRoomActivity.java
│   │       └── RoomManagerActivity.java
│   ├── voice/                      # Voice/video room core
│   │   ├── ui/
│   │   │   ├── NewVoiceChatRoomActivity.java
│   │   │   ├── VoiceRoomDetailActivity.java
│   │   │   ├── RoomManagerActivity.java
│   │   │   ├── LiveAnchorActivity.java
│   │   │   ├── LiveAudienceActivity.java
│   │   │   └── EndInterfaceActivity.java
│   │   ├── view/                   # Custom views
│   │   │   ├── LiveBulletChatLayoutView.java
│   │   │   ├── LiveTopLayoutView.java
│   │   │   ├── LiveBottomMenuLayoutView.java
│   │   │   ├── GiftComboView.java
│   │   │   └── leliao/
│   │   │       └── LiveIdentityEffectsLayoutView.java
│   │   └── video/                  # Video subpackage
│   ├── profile/                    # User profile & wallet
│   │   └── ui/
│   │       ├── MyProfileActivity.java
│   │       ├── MySpaceActivity.java
│   │       ├── MySetActivity.java
│   │       ├── MyShopActivity.java
│   │       ├── MyVipActivity.java
│   │       ├── MyMedalActivity.java
│   │       ├── MyPayActivity.java
│   │       ├── MyWithdrawActivity.java
│   │       ├── MyExchangeActivity.java
│   │       ├── FamilyActivity.java
│   │       └── [20+ profile activities]
│   ├── discover/                   # Discovery & search
│   │   └── ui/
│   │       ├── HomeRankingActivity.java
│   │       ├── SearchActivity.java
│   │       ├── RechargeBannerActivity.java
│   │       └── Shop*Activity (e-commerce)
│   ├── message/                    # IM & notifications
│   │   └── ui/
│   │       ├── ChatFriendsActivity.java
│   │       ├── MessageDetailsActivity.java
│   │       ├── ActivityCenterActivity.java
│   │       ├── NoticeNewsActivity.java
│   │       └── SystemMessageActivity.java
│   ├── feed/                       # Social feed
│   │   └── ui/
│   │       ├── DynamicPushActivity.java
│   │       └── DynamicDetailActivity.java
│   ├── creator/                    # Broadcaster tools
│   │   └── ui/
│   │       ├── MyAnchorActivity.java
│   │       ├── HostManagerActivity.java
│   │       ├── AddHostActivity.java
│   │       ├── AnchorTaskActivity.java
│   │       └── [10+ creator activities]
│   └── badge/                      # Achievements
│       └── ui/
│           └── MyMedalActivity.java
├── platform/                       # Platform services
│   ├── util/
│   │   ├── NetworkMonitor.java
│   │   ├── t.java                  # IP/network utilities
│   │   ├── x1.java                 # SharedPreferences wrapper
│   │   └── [30+ utility classes]
│   ├── widget/
│   │   ├── view/
│   │   │   ├── Topbar.java
│   │   │   ├── MyBanner.java
│   │   │   ├── GiftSVGAView.java
│   │   │   └── LuckyGiftAnimationView.java
│   │   └── chat/
│   │       └── LiveChatTabContainerView.java
│   ├── service/
│   │   └── MyServices.java
│   └── core/
├── shell/                          # App shell
│   ├── SplashActivity.java
│   └── WebViewActivity.java
└── R.java                          # Resource constants
```

---

## 3. Key Data Models

### Authentication & User
| Model | Key Fields | Purpose |
|-------|------------|---------|
| `InitBean` | `token`, `userInfo` | App initialization data |
| `InitActModel` | Configuration | Activity model for init |
| `RefreshTokenBean` | `token` | JWT refresh token |
| `LoginDataBean` | `userId`, `token`, `userSigIm` | Login response |
| `App_aliyun_stsActModel` | STSToken | Alibaba Cloud STS for uploads |
| `CusStsBean` | Custom STS | Alternative STS provider |

### Room & Voice
| Model | Key Fields | Purpose |
|-------|------------|---------|
| `RoomListBean` | `roomId`, `chatroomId`, `cover`, `status` | Room list items |
| `RoomInfoBean` | `roomId`, `name`, `owner`, `onlineCount` | Room details |
| `LiveRoomInfoBean` | Extended room info | Live room metadata |
| `InRoombean` | User room state | Current room membership |
| `IntoRoomBean` | Room entry data | Transition data when joining |
| `JoinRoomBean` | Join parameters | Room join request |
| `LeaveRoomBean` | Exit reason | Room leave event |
| `CloseRoomBean` | Close reason | Room termination |
| `RoomMicBean` | Mic state, userId | Seat/mic management |
| `RoomMicListBean` | `List<RoomMicBean>` | Mic list |
| `ChangeMicModeBean` | Mic mode enum | Mic lock/unlock |
| `MoveMicBean` | Seat position | Move user to different seat |

### Chat & Messaging
| Model | Key Fields | Purpose |
|-------|------------|---------|
| `LiveRoomChatBean` | Message content, sender | Chat message |
| `CmdGiftNoticeBean` | Gift type, count | Gift notifications |
| `CmdGifRemoteBean` | Remote gift data | External gift triggers |
| `CmdBaoMicBean` | Bao mic data | Mic interaction |
| `BarrageDataBean` | Danmaku text | Barrage messages |
| `NoticeChatBean` | System notice | In-room announcements |

### Gifting & Economy
| Model | Key Fields | Purpose |
|-------|------------|---------|
| `BaseGiftBean` | `giftId`, `name`, `icon` | Base gift properties |
| `GiftListBean` | Gift catalog | Available gifts |
| `GiftTypeBean` | Category info | Gift categorization |
| `SendGiftBean` | `fromUser`, `giftId`, `count` | Gift send event |
| `GiftInteractBean` | Interaction data | Gift combo info |
| `DiamondRewardsBean` | Daily rewards | Check-in data |
| `ChargeBean` | Package info | Top-up packages |
| `RechargeHomeBean` | Recharge options | Store data |
| `BalanceBean` | Diamond, gold | User balance |
| `GoogleCoinBean` | Google Play balance | In-app purchase balance |

### User Profile
| Model | Key Fields | Purpose |
|-------|------------|---------|
| `MyHomeBean` | Profile stats | User home data |
| `MyRoomIdBean` | Room association | User's room ID |
| `MyGuardBean` | Guard level | Subscription tier |
| `MyPropsTypeBean` | Props categories | Inventory sections |
| `MyShopBean` | Shop items | User's shop |

### Agency / Creator
| Model | Key Fields | Purpose |
|-------|------------|---------|
| `AgentHomeBean` | Earnings, stats | Agent dashboard |
| `AgentMyLogBean` | Transaction log | Agent history |
| `AgencyHomeBean` | Agency overview | Agency stats |
| `AgencyInfoBean` | Agency details | Agency profile |
| `AgencyAdminBean` | Admin data | Admin settings |
| `MyAnchorActivity` related | Host data | Broadcaster tools |

---

## 4. Activity ↔ Presenter Mapping

### Base Classes (Obfuscated)
- **`in.b`** = Base Activity with Rx lifecycle, Presenter binding
- **`co.c`** = Splash presenter
- **`co.e`** = WebView presenter
- **`sm.a`** = CreatePersonalRoom presenter
- **`ul.a`** = DynamicDetail presenter
- **`bm.c`** = ChatFriends presenter
- **`e2`** = MyProfile presenter
- **`u2`** = MySpace presenter

### Example Mappings

#### SplashActivity
```java
public class SplashActivity extends in.b<co.c> implements b.InterfaceC0104b
```
- **Presenter:** `co.c`
- **View Interface:** `b.InterfaceC0104b`
- **Key Methods:**
  - `y4(InitBean initBean)` → `N5()` navigate to login or main
  - `U0(RefreshTokenBean)` → token refresh success
- **Flow:**
  1. `onCreate()` → `h5()` init views
  2. `NetworkMonitor` checks network quality
  3. Presenter calls API: `getInitData()` or `refreshToken()`
  4. On success → `y4()` or `U0()` → `N5()` → navigate

#### LoginThirdPartyActivity
```java
public class LoginThirdPartyActivity extends in.b<i> implements e.b
```
- **Presenter:** `i`
- **View Interface:** `e.b`
- **Interaction:**
  1. User clicks Google Sign-In
  2. `GoogleSignInClient` authenticates
  3. Presenter calls `thirdPartyLogin(googleAccount)`
  4. Response: `LoginDataBean` with `token`, `userSigIm`
  5. Save to SharedPreferences
  6. `o5(MainActivity.class)` navigate

#### NewVoiceChatRoomActivity
```java
public class NewVoiceChatRoomActivity extends b<a> implements c.b
```
- **Presenter:** `a`
- **View Interface:** `c.b`
- **Key Methods:**
  - `rightClick()` → Room options menu
  - Presenter handles:
    - `joinRoom(roomId)`
    - `leaveRoom()`
    - `sendGift(giftId, userId)`
    - `updateUserAvatar(userId, avatarUrl)`
- **Custom Views:**
  - `LiveTopLayoutView` - Room header (title, viewers, host)
  - `LiveBottomMenuLayoutView` - Controls (mic, chat, gifts)
  - `LiveBulletChatLayoutView` - Danmaku overlay

#### MyProfileActivity
```java
public class MyProfileActivity extends in.b<e2> implements i0.b
```
- **Presenter:** `e2`
- **View Interface:** `i0.b`
- **Key Actions:**
  - Upload avatar via `PictureSelector` → `GlideEngine`
  - Update profile: `map.put("nickname", newName)` → `P(map)`
  - Edit photos: Upload via Alibaba Cloud OSS (STS)

---

## 5. Business Logic Flow

### Authentication Flow
```
SplashActivity
    → Check SharedPreferences for token (x1.i("token"))
    → If token exists:
        → Call refreshToken API
        → On success → MainActivity
    → If no token:
        → LoginThirdPartyActivity
            → Google Sign-In
            → Get ID token
            → Call /api/auth/third-party
            → Receive LoginDataBean
            → Save: token, userSigIm, userId
            → Navigate to LoginUserInfoActivity (first run)
            → Then MainActivity
```

### Room Join Flow
```
User clicks room in HomeRankingActivity
    → Intent to VoiceRoomDetailActivity
    → User clicks "Join"
    → NewVoiceChatRoomActivity launched
        → Presenter: joinRoom(roomId)
        → API: getRoomInfo(roomId) → RoomInfoBean
        → Show loading
        → (STUB) TRTC join room
        → Show room UI:
            - LiveTopLayoutView: room title, host info
            - LiveBottomMenuLayoutView: mic, chat, gifts
            - LiveBulletChatLayoutView: danmaku
            - GiftSVGAView: animations
        → Listen for EventBus events:
            - CmdGiftNoticeBean (gift received)
            - CmdBaoMicBean (mic interaction)
            - BarrageDataBean (danmaku)
```

### Gift Sending Flow
```
User taps gift in NewVoiceChatRoomActivity
    → Presenter: getGiftList(roomId)
    → API: giftList → List<GiftListBean>
    → Show bottom sheet with gift grid
    → Select gift
    → Confirm
    → Presenter: sendGift(roomId, giftId, count)
    → API: POST /gift/send
    → Response: SendGiftBean
    → Local:
        - Deduct balance
        - Fire EventBus: CmdGiftNoticeBean
        - Play SVGA animation: GiftSVGAView
        - Show combo: GiftComboView
        - Update UI: Gift floating screen
```

### Chat Flow
```
User opens chat in NewVoiceChatRoomActivity
    → LiveChatTabContainerView handles:
        - Tab switching: Chat / DM / Notices
    → Presenter: getRoomChatHistory(roomId)
    → API: chatList → List<LiveRoomChatBean>
    → Render messages:
        - Text: Standard bubble
        - Voice: Audio playback
        - Image: Thumbnail + click to expand
    → User sends message:
        → Presenter: sendMessage(roomId, content)
        → API: POST /chat/send
        → Add to local list
        → Clear input
    → IM Integration (Tencent TUikit):
        - TUIChatActivity for private messages
        - TUIConversationActivity for chat list
        - Real-time: TIMCommon callbacks
```

### Profile Update Flow
```
User opens MyProfileActivity
    → Load current profile from Presenter
    → Display: avatar, name, bio, photos
    → Edit:
        - Avatar: PictureSelector → compress → upload to OSS (STS)
        - Name: EditText → rightClick() → API: updateProfile
        - Bio: EditText → API: updateBio
        - Photos: Multi-select → upload array → grid display
    → Save:
        → map.put("field", value)
        → ((e2) f27702e).P(map)
    → Refresh UI on success
```

### Wallet & Recharge Flow
```
User opens MyPayActivity
    → Presenter: getRechargePackages()
    → API: rechargeHome → RechargeHomeBean
    → Display package grid (diamonds)
    → Select package
    → BillingClient.launchBillingFlow()
    → Google Play handles purchase
    → Purchase success callback
    → Presenter: verifyPurchase(purchaseToken)
    → API: POST /order/verify
    → Update local balance: BalanceBean
    → Refresh UI
```

---

## 6. SharedPreferences Wrapper (`x1.java`)

This is a utility class for key-value storage:

```java
// Common keys
"token" → JWT auth token
"user_id" → Integer user ID
"user_sig_im" → Tencent IM signature
"isLogin" → Boolean login state
"voice_taskId" → Current room task ID
"main_taskId" → Main activity task ID
"isMic" → Mic enabled state
"room_id" → Current room ID
"language_select_sys" → Language preference
"full_venue_gift_close_time" → Timestamp
```

---

## 7. Network Monitor (`NetworkMonitor.java`)

Monitors network quality for TRTC:

- **Callback:** `f` interface with `a(g gVar)`
- **Data:** `gVar.qualityText` (Excellent/Good/Poor), `ipAddress`, `upBytesPerSec`, `jitterMs`
- **Quality Enum:** GOOD, POOR, UNKNOWN
- **Usage:** SplashActivity shows network panel to debug connection issues

---

## 8. EventBus Events

The app uses GreenRobot EventBus for cross-component communication:

| Event Type | Data Class | Source | Target |
|------------|------------|--------|--------|
| Room close | `b0` with event ID 1022 | TRTC/IM | Activities |
| Suspended room close | `ok.e.EVENT_SUSPENDED_ROOM_CLOSE` | System | Room managers |
| Gift notice | `CmdGiftNoticeBean` | Presenter | Room UI |
| Mic update | `CmdBaoMicBean` | Presenter | Room UI |
| Barrage | `BarrageDataBean` | Presenter | Danmaku view |

---

## 9. Key Utility Classes

| Class | Purpose |
|-------|---------|
| `t.java` | IP utils, device info, version checks |
| `w1.java` | App info / context utils |
| `n0.java` | Screen adaptation (autosize) |
| `s0.java` | Activity navigation (o5 method) |
| `d.f()` | Image loading helper (Glide) |
| `j9.d.H()` | Initialize third-party SDKs |
| `ye.b.l()` | Color theme setup |
| `mm.a` | BaseQuickAdapter for RecyclerView |
| `SmartRefreshLayout` | Pull-to-refresh library |

---

## 10. Third-Party Service Initialization (MyApplication.onCreate)

```java
1. AutoSizeConfig - Screen adaptation
2. Lingver - Language management
3. Crash reporting / DI (mn.d)
4. LitePal.initialize() - Local DB
5. SVGAParser - SVGA animations
6. HttpResponseCache - HTTP cache (128MB)
7. RCSceneKitEngine - RongCloud scene kit
8. Media3 Cache - ExoPlayer cache
9. Network service init (j9.d)
```

**Important:** Initialize `RCSceneKitEngine` BEFORE any TRTC operations.

---

## 11. Testing Entry Points

### Minimal Viable Flow
1. `SplashActivity.onCreate()`
   - Remove TRTC init if crashing
   - Mock `InitBean` response
2. `LoginThirdPartyActivity`
   - Skip Google Sign-In
   - Hardcode `LoginDataBean`
   - Call `o5(MainActivity.class)`
3. `MainActivity`
   - Verify bottom nav loads
   - Mock room list data
4. `NewVoiceChatRoomActivity`
   - Mock `RoomInfoBean`
   - Skip TRTC join
   - Verify UI layers display

---

## 12. Common Patterns

### Presenter Binding
```java
// Generic type parameter indicates presenter class
public class SomeActivity extends in.b<PresenterClass>
// Access presenter
((PresenterClass) this.f27702e).someMethod()
```

### Navigation
```java
// Simple activity start
o5(TargetActivity.class);
// With bundle
p5(TargetActivity.class, bundle);
```

### Data Binding (Custom)
```java
// Activities use custom binding instead of Android DataBinding
// Example from SplashActivity:
this.f37170q.setText(...)
// Fields are obfuscated but follow Hungarian notation:
// f = field
// A-Z = sequential declaration
```

### RxJava Integration
```java
Observable.timer(100L, TimeUnit.MILLISECONDS)
    .subscribeOn(Schedulers.newThread())
    .observeOn(AndroidSchedulers.mainThread())
    .subscribe(new Consumer<Long>() { ... });
```

---

## 13. Known Dependencies from Imports

### Google / Android
- `androidx.media3` - ExoPlayer for media
- `dagger.android` - Dependency injection
- `androidx.multidex` - Multi-dex support for 64K methods

### Social / IM
- `com.tencent.rtmp` - TRTC SDK
- `com.tencent.qcloud.tuikit` - Tencent IM UI components
- `cn.rongcloud.corekit` - RongCloud scene kit

### Networking
- `io.reactivex` - RxJava 2
- `com.squareup.retrofit2` - REST client
- `com.squareup.okhttp3` - HTTP client

### UI / UX
- `com.scwang.smart.refresh.layout` - SmartRefreshLayout
- `com.bumptech.glide` - Image loading
- `com.opensource.svgaplayer` - SVGA animations
- `com.lucksiege.picture` - Photo picker
- `com.gyf.immersionbar` - Immersive status bar
- `me.jessyan.autosize` - Screen adaptation
- `com.lxj.xpopup` - Popup dialogs
- `com.yalantis.ucrop` - Image cropping
- `com.blankj.utilcodex` - Utilities

### Database
- `org.litepal.guolindev` - LitePal ORM

---

## 14. Important Notes

1. **Obfuscation:** The decompiled code uses package-private names like `in.b`, `co.c`. These are ProGuard/R8 obfuscation artifacts. The original code would have meaningful class names.

2. **Generic Presenter Pattern:** The first generic type parameter in base classes (`in.b<co.c>`) is the presenter class. The second parameter (if any) is often a reactive model.

3. **Field Naming:** Instance fields are obfuscated to single letters with `f` prefix for private fields. Example: `f37170q` is a `TextView`.

4. **String Constants:** String literals in code are usually original (not obfuscated) and can help identify logic.

5. **Resource IDs:** The custom `R.java` maps `qmyy.babycat.live.R` to resource IDs.

---

## 15. Next Steps for Backend Integration

When building the custom Node.js + LiveKit backend:

1. **Replace Retrofit Services** (likely in `platform/http/`) to point to your backend
2. **Implement LiveKit Client** to replace TRTC:
   - `LiveKitRoomClient` for room management
   - `AudioTrack` and `VideoTrack` for media
3. **Replace Tencent IM** with:
   - LiveKit chat / DataChannel
   - Or keep Tencent IM for chat only
4. **Update Model Classes** to match new API responses
5. **Modify Auth Flow** to use JWT from your Node.js backend
6. **Update Stubbed Methods** with real implementations via stub guide