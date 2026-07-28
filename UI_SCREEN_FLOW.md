# UI Screen Flow Documentation

## Overview
This document describes all XML layouts in `res/layout/`, the components on each screen, and the visual flow through the Arvind Party app.

---

## 1. Shell / Entry Screens

### Splash Screen (`activity_splash.xml`)
**Type:** `RelativeLayout`
**Purpose:** App launch screen with branding and network diagnostics

**Key Components:**
- `RelativeLayout#rel_top` (root) - Background image (`qd_bg`)
- `ImageView` - App logo (`voice_logo`) centered
- `androidx.media3.ui.PlayerView#splash_mp4` - Optional video intro (transparent, initially hidden)
- `LinearLayout#ll_net_panel` - Network diagnostics panel (top-left, initially hidden)
  - `TextView#tv_user_id` - Shows current user ID
  - `TextView#tv_version` - App version string
  - `TextView#tv_net_quality` - Network quality indicator (green/yellow/red)
  - `TextView#tv_net_ip` - IP address display
  - `TextView#tv_net_realtime` - Upload/Download speeds and jitter
  - `TextView#tv_net_fail_time` - Network failure timestamps
  - `TextView#tv_retry_countdown` - Countdown timer for retries
  - `TextView#tv_net_error_detail` - Error details (red text)

**Flow:** Splash → (if logged in) MainActivity → LoginThirdPartyActivity

---

### Login / Authentication Screens

#### Third-Party Login (`activity_login_third_party.xml`)
**Type:** `RelativeLayout` with `NestedScrollView`
**Purpose:** Social login entry point

**Key Components:**
- `ImageView#logoin_bg` - Header background
- `ImageView#voice_logo` - App logo
- `TextView#get_start` - "Get Started" heading
- `TextView#sign_up_access` - Subtitle text
- `RelativeLayout#re_google` - Google Sign-In button
- `RelativeLayout#re_facebook` - Facebook Login (hidden in this build)
- `ImageView#iv_phone` - Phone login icon (hidden)
- `ImageView#iv_email` - Email login icon (hidden)
- `ImageView#iv_id` - Account ID login icon (visible)
- `LinearLayout#ll_agree` - Terms agreement checkbox
- `TextView#tv_protocol` - User agreement link
- `TextView#tv_user` - Privacy policy link
- `TextView#tv_privacy` - Additional terms link
- `TextView#tv_language` - Language switcher (hidden)

**Flow:** This is the entry point after splash. Users pick a login method.

#### Verification Code (`activity_verification_code.xml`)
**Purpose:** Enter SMS verification code

**Components:**
- 4x `TextView` fields for OTP input (styled with `bg_user_verify_code_active`)
- Countdown timer
- Resend button

#### Login Account/Phone/Email (`activity_login_account.xml`, `activity_login_phone.xml`, `activity_login_email.xml`)
**Purpose:** Username/password or credential entry for different login types

**Common Components:**
- EditText fields for credentials
- Login button
- Navigation to registration/reset

#### Login User Info (`activity_login_user_info.xml`)
**Purpose:** Post-login profile setup (first run)

**Components:**
- Avatar upload area
- Nickname input
- Signature input

---

## 2. Main Navigation Shell

### Main Activity (`activity_main.xml`)
**Type:** Primary host for bottom navigation and fragment container

**Purpose:** Central hub after login, contains Discover, Message, Profile tabs

**Key Components:**
- Bottom navigation bar container
- FrameLayout for fragment swapping
- Topbar for current section title

**Flow:** Bottom nav switches between:
1. Home/Discover (room list, rankings)
2. Message (chat list)
3. Profile (user center)

---

## 3. Voice Room Screens

### Voice Chat Room Main (`activity_voice_chat_room_main.xml`)
**Type:** Complex `RelativeLayout` with multiple overlay layers

**Purpose:** Live voice room experience

**Key Components:**

**Background & Media:**
- `ImageView#home_bj` - Room background image
- `androidx.media3.ui.PlayerView#bj_mp4` - Background video player (hidden)
- `ImageView#iv_movie` - Movie/game overlay banner (hidden)

**Top Section:**
- `net.babycat.live.modules.voice.view.LiveTopLayoutView#live_top` - Host info, viewer count, room title
- `ImageView#iv_avatar` - Room creator avatar
- `TextView#app_name` - App branding

**Middle Content:**
- `RelativeLayout#re_mian` - Main content area anchor
- `TextView#tv_gift_notice` - Gift announcement bar
- `net.babycat.live.modules.voice.view.LiveBulletChatLayoutView#live_bulle` - Danmaku/barrage layer
- `net.babycat.live.platform.widget.chat.LiveChatTabContainerView#live_chat` - Chat panel
- `net.babycat.live.modules.voice.view.LiveBulletSvgaView#live_bulle_svga` - Animated bullet chat

**Bottom Controls:**
- `RelativeLayout#rela_treasure` - Treasure/red packet icon with countdown
- `ImageView#iv_red_packet` - Red packet button
- `LinearLayout` (right-aligned vertical):
  - `ImageView#iv_rocket` - Rocket/like animation
  - `net.babycat.live.platform.widget.view.MyBanner#banner` - Promotional banners
  - `ImageView#iv_game` - Game entry button
- `net.babycat.live.modules.voice.view.LiveBottomMenuLayoutView#live_bottom` - Mic controls, gifts, settings
- `net.babycat.live.modules.voice.view.IntoRoomTextView#into_text` - User entry announcements

**Animations:**
- `net.babycat.live.platform.widget.view.GiftSVGAView#gift_svga` - Gift animations
- `net.babycat.live.platform.widget.view.GiftSVGAView#mount_svga` - Mount animations
- `com.opensource.svgaplayer.SVGAImageView#svga_lucky` - Lucky/Slot machine animation
- `com.opensource.svgaplayer.SVGAImageView#svga_bd` - Background animation
- `com.opensource.svgaplayer.SVGAImageView#svga_pk` - PK battle animation
- `com.opensource.svgaplayer.SVGAImageView#svga_rocket` - Rocket launch animation
- `com.opensource.svgaplayer.SVGAImageView#rocket_svga` - Rocket animation overlay
- `ImageView#play_imgs` - Placeholder for video stream
- `net.babycat.live.modules.voice.view.GiftComboView#gift_combo` - Combo counter display

**Identity & Effects:**
- `net.babycat.live.modules.voice.view.leliao.LiveIdentityEffectsLayoutView#live_getinto` - Entry effects
- `net.babycat.live.modules.voice.view.LiveGiftFloatingScreenView#live_gift_floating` - Floating gift display

**Full Screen Container:**
- `FrameLayout#full_screen_view_container` - For picture-in-picture or expanded views
- `RelativeLayout#sphere_item` - Loading/placeholder state with avatar and app name

**Flow:** Enter room → Show loading → Display room UI with mic list, chat, gift animations.

### Room Manager (`act_room_manger.xml`, `room_manager` module)
**Purpose:** Manage room settings, speakers, and permissions

**Components:**
- List of room managers/hosts
- Mic mode controls
- Room settings (name, visibility, etc.)

### Create Personal Room (`act_create_personal_room.xml`)
**Purpose:** Setup wizard for creating a new voice room

**Components:**
- Room name input
- Cover image upload
- Category/theme selection
- Privacy settings

### Room Detail (`activity_voice_room_detail.xml`)
**Purpose:** Room preview before joining

**Components:**
- Room cover/banner
- Host information
- Room stats (online count, likes)
- Join button

---

## 4. Profile & User Center Screens

### My Profile (`activity_my_profile.xml`)
**Purpose:** User profile editing and display

**Components:**
- Avatar cover image
- Profile header (avatar, name, ID, VIP badge)
- Stats row (followers, following, level)
- Action buttons (edit, share, QR code)
- Tab content: Moments, Gifts, Likes

### My Space (`activity_my_space.xml`)
**Purpose:** User's personal homepage/feed

**Components:**
- User info header
- Tab navigation (posts, media, about)
- Scrollable content area

### My Shop (`activity_my_shop.xml`)
**Purpose:** Virtual gift/prop shop

**Components:**
- Tab navigation for gift categories
- Grid of purchasable items
- Coin balance display

### My VIP (`activity_my_vip.xml`)
**Purpose:** VIP subscription and benefits

**Components:**
- ViewPager2 for VIP package tabs
- Pricing cards
- Benefit list

### My Medals (`activity_my_medal.xml`)
**Purpose:** Achievement badges display

**Components:**
- ViewPager2 for medal categories
- Grid of medal items with progress

### My Set / Settings (`activity_my_set.xml`)
**Purpose:** App settings and account management

**Components:**
- Account settings list (security, password, delete account)
- App preferences (notifications, language, cache)
- Legal links (terms, privacy, refund)
- Logout button

### Security Account (`act_security_account.xml`)
**Purpose:** Account security settings

**Components:**
- Password change
- Phone/email binding
- Account deletion flow

### My Friends (`activity_my_friends.xml`, `chat_friends.xml`)
**Purpose:** Friends and follows management

**Components:**
- Search bar
- List of friends with avatars
- Sort/filter tabs

### My Gift Wall (`activity_my_gift_wall.xml`)
**Purpose:** Display received gifts gallery

**Components:**
- Grid/waterfall of gift images
- Filter by sender/gift type

### My Exchange (`activity_my_exchange.xml`)
**Purpose:** Currency exchange (diamonds ↔ gold)

**Components:**
- Exchange rate display
- Amount input
- Transaction history

### My Pay / Recharge (`activity_my_pay.xml`)
**Purpose:** Top-up and billing

**Components:**
- Package selection cards
- Payment method selector
- Order list

### Withdrawal (`act_my_withdraw.xml`, `act_withdraw_info.xml`)
**Purpose:** Cash out earnings

**Components:**
- Balance display
- Withdrawal form (amount, method)
- Bank/PayPal details

### My Level (`activity_my_level.xml`, `activity_my_level_info.xml`)
**Purpose:** Level progression display

**Components:**
- Experience bar
- Level benefits
- Progress history

### My Props (`activity_my_props.xml`)
**Purpose:** Inventory of virtual items

**Components:**
- Tab categories (cards, frames, effects)
- Item list with rarity/expiry

### Family / Guild (`activity_family.xml`, `activity_creating_family.xml`, `act_my_family_info.xml`)
**Purpose:** Social groups/families system

**Components:**
- Family list/rankings
- Member management
- Contribution tracking

### My Anchor (Creator) (`activity_my_anchor.xml`)
**Purpose:** Broadcaster dashboard

**Components:**
- Earnings overview
- Live schedule
- Audience analytics

---

## 5. Discover & Feed Screens

### Home / Discover (`activity_home_ranking.xml`)
**Purpose:** Main discovery page with room rankings

**Components:**
- Banner carousel
- Category tabs
- Room list/grid with thumbnails
- Ranking tables

### Search (`act_search.xml`)
**Purpose:** Search rooms, users, and content

**Components:**
- Search input with history
- Hot search tags
- Results tabs (rooms, users)

### Dynamic Posts (`activity_dynamic_push.xml`, `activity_dynamic_detail.xml`)
**Purpose:** Social feed with user posts

**Components:**
- Post composer
- Image/video grid
- Like/comment/share actions
- Comment list

### Recharge Banner (`activity_recharge_banner.xml`)
**Purpose:** Promotional offers for top-ups

**Components:**
- Banner slider
- Package deals
- Limited-time offers

### Shop Commerce (`MyShopAddressActivity`, `ShopShoppingCartActivity`, `ShopOrderConfirmationActivity`)
**Purpose:** Integrated e-commerce flow

**Components:**
- Address selector
- Cart management
- Checkout form
- Order confirmation

---

## 6. Message & Chat Screens

### Chat Friends / Contact List (`activity_chat_friends.xml`)
**Purpose:** IM contact list integration

**Components:**
- Search bar
- Conversation list items
- Friend request badges
- Bottom tab nav (chats, contacts, notifications)

### Message Details (`act_message_details.xml`)
**Purpose:** Individual chat or system message view

**Components:**
- Message list with different bubble types
- Input area with emojis, gifts, voice
- Header with recipient info

### Activity Center (`activity_activity_center.xml`)
**Purpose:** In-app announcements and events

**Components:**
- Banner announcements
- Activity list
- Reward claims

### Notice News (`activity_notice_news.xml`)
**Purpose:** System and event notifications

**Components:**
- Notification list with icons
- Read/unread states
- Time stamps

### System Message (`activity_system_message.xml`)
**Purpose:** Official app notifications

**Components:**
- Message list (account, system, activity)
- Detail view for each

---

## 7. Wallet & Finance Screens

### My Withdraw (`act_my_withdraw.xml`)
**Purpose:** Withdrawal dashboard

**Components:**
- Balance display
- Quick amount selection
- Withdrawal methods

### Withdraw Info (`act_withdraw_info.xml`)
**Purpose:** Withdrawal confirmation and status

**Components:**
- Amount summary
- Method selection (bank, PayPal)
- History list

### Withdrawal Records (`activity_withdrawal_records.xml`)
**Purpose:** Withdrawal transaction history

**Components:**
- Refresh/load more list
- Status indicators (pending, completed, failed)

### Recharge Record (`activity_recharge_record.xml`)
**Purpose:** Top-up transaction history

**Components:**
- Date picker
- Transaction list with amounts
- Filter by status

### Transfer (`act_my_transfer.xml`, `act_my_transfer_records.xml`)
**Purpose:** Send/receive virtual currency

**Components:**
- Recipient search/select
- Amount input
- Transfer history

### Diamond Rewards (`act_diamond_rewards.xml`)
**Purpose:** Daily check-in and rewards

**Components:**
- Calendar grid
- Reward preview
- Claim button

---

## 8. Creator / Broadcaster Screens

### Agency Registration (`act_agency_registration.xml`)
**Purpose:** Apply for agency/broadcaster status

**Components:**
- Form with personal details
- Document upload
- Agreement checkbox

### Agency Salary (`act_agency_salary.xml`, `activity_agency_salary.xml`)
**Purpose:** Agency earnings dashboard

**Components:**
- Earnings overview
- Commission breakdown
- Commission settings

### Anchor Task (`activity_live_task.xml`, `activity_anchor_task.xml`)
**Purpose:** Daily/live task tracking

**Components:**
- Task list with progress bars
- Reward indicators
- Time remaining

### Host List (`activity_host_level.xml`)
**Purpose:** Manage hosts under agency

**Components:**
- Host list with levels
- Add host button
- Performance indicators

### Add Host (`act_add_host.xml`)
**Purpose:** Invite new host to agency

**Components:**
- Search/select user
- Invitation message

### Salary Bill (`activity_salary_bill.xml`)
**Purpose:** Detailed salary breakdown

**Components:**
- Date range picker
- Line items
- Total display

---

## 9. WebView & External Content

### WebView (`act_webview.xml`)
**Purpose:** In-app browser

**Components:**
- `WebView` with progress bar
- Topbar with title and close button
- JavaScript bridge for Native ↔ JS communication

**Flow:** Used for user agreements, privacy policies, help center, external links.

### End Interface (`act_end_interface.xml`)
**Purpose:** Live stream end screen

**Components:**
- Stream statistics
- Share buttons
- Replay link

### Live Anchor / Audience (`act_live_anchor.xml`, `activity_live_audience.xml`)
**Purpose:** Full-screen video live streaming views

**Components:**
- RTMP video view
- Live chat overlay
- Gift sending panel
- Viewer count

---

## 10. Supporting Layouts

### Bottom Navigation (`bottom_navigation_bar_container.xml`)
Standard bottom tab bar with icons + labels.

### Topbar (`platform/widget/view/Topbar`)
Reusable header with:
- Left icon (back/close)
- Center title
- Right action icon/text
- Status bar height consideration

### Room Management List (`adapter_room_manage_list.xml`)
RecyclerView item for room manager settings:
- Thumbnail
- Title
- Toggle switches

---

## Visual Flow Summary

```
SplashActivity (activity_splash)
    ├─ LoginThirdPartyActivity (activity_login_third_party)
    │   ├─ LoginPhoneActivity (activity_login_phone)
    │   ├─ LoginEmailActivity (activity_login_email)
    │   ├─ LoginAccountActivity (activity_login_account)
    │   ├─ VerificationCodeActivity (activity_verification_code)
    │   └─ LoginUserInfoActivity (activity_login_user_info)
    └─ MainActivity (activity_main)
        ├─ [Bottom Tab] Disover
        │   ├─ HomeRankingActivity (room list)
        │   ├─ SearchActivity (search)
        │   └─ VoiceRoomDetailActivity (room preview)
        ├─ [Bottom Tab] Message
        │   ├─ ChatFriendsActivity (IM)
        │   ├─ MessageDetailsActivity (chat)
        │   └─ ActivityCenterActivity (notifications)
        ├─ [Bottom Tab] Profile
        │   ├─ MyProfileActivity (user info)
        │   ├─ MySpaceActivity (homepage)
        │   ├─ MyShopActivity (gift shop)
        │   ├─ MyVipActivity (VIP)
        │   ├─ MyMedalActivity (achievements)
        │   ├─ MySetActivity (settings)
        │   └─ ChatFriendsActivity (friends)
        └─ [Direct] Voice Room
            ├─ NewVoiceChatRoomActivity (live voice room)
            ├─ RoomManagerActivity (room settings)
            ├─ CreatePersonalRoomActivity (create room)
            └─ EndInterfaceActivity (end stream)
```

---

## Layout Naming Conventions

- `activity_*` - Full-screen activities
- `act_*` - Compact activity layouts
- `fragment_*` - Fragment containers
- `adapter_*` - RecyclerView item layouts
- `dialog_*` - Dialog fragments
- `bottom_sheet_*` - Bottom sheet layouts

**Note:** Many layouts use `mm` (millimeters) for dimensions, suggesting a design-targeted approach for specific screen sizes.