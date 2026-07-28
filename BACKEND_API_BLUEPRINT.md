# Backend API Blueprint

## Overview
This document outlines the exact REST API routes and payload structures needed for the custom Node.js/Express backend with LiveKit integration. Based on the Android app's data models and business logic, we've reverse-engineered the required endpoints.

---

## 1. Technology Stack

### Backend
- **Runtime:** Node.js 18+
- **Framework:** Express.js
- **Database:** PostgreSQL (primary) + Redis (cache/sessions)
- **ORM:** Prisma
- **Authentication:** JWT (RS256)
- **Real-time:** LiveKit Server SDK
- **File Storage:** Alibaba Cloud OSS / S3-compatible
- **Push Notifications:** Firebase Cloud Messaging

### Infrastructure
- **Load Balancer:** Nginx
- **Process Manager:** PM2
- **Container:** Docker (optional)

---

## 2. API Base URL Structure

```
Production: https://api.babycat.live/v1
Staging:    https://api-staging.babycat.live/v1
Local:      http://localhost:3000/v1
```

---

## 3. Authentication Endpoints

### 3.1 Initialize App
**Purpose:** Get app configuration, ads, banners  
**Called by:** `SplashActivity` → Presenter `getInitData()`

```http
GET /init
```

**Response:** `InitBean`
```json
{
  "code": 200,
  "data": {
    "token": null,
    "user": null,
    "config": {
      "min_version": "1.0.0",
      "force_update": false,
      "banner": [
        {
          "id": 1,
          "image": "https://cdn.example.com/banner1.jpg",
          "link": "https://example.com/promo",
          "type": "web"
        }
      ],
      "ad": {
        "splash": false,
        "banner": true
      }
    }
  }
}
```

---

### 3.2 Refresh Token
**Purpose:** Extend session without re-login  
**Called by:** `SplashActivity` → Presenter `refreshToken()`

```http
POST /auth/refresh
Content-Type: application/json

{
  "refresh_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
}
```

**Response:** `RefreshTokenBean`
```json
{
  "code": 200,
  "data": {
    "token": "new_jwt_token",
    "refresh_token": "new_refresh_token",
    "expires_in": 604800
  }
}
```

---

### 3.3 Third-Party Login (Google)
**Purpose:** Social authentication  
**Called by:** `LoginThirdPartyActivity`

```http
POST /auth/third-party
Content-Type: application/json

{
  "provider": "google",
  "id_token": "eyJhbGciOiJSUzI1NiIsImtpZCI6Ij...",
  "access_token": "ya29.a0AfB_by...",
  "email": "user@gmail.com"
}
```

**Response:** `LoginDataBean`
```json
{
  "code": 200,
  "data": {
    "user_id": 12345,
    "token": "jwt_access_token",
    "refresh_token": "jwt_refresh_token",
    "user_sig_im": "base64_encoded_im_signature",
    "is_new": true,
    "profile": {
      "nickname": "User123",
      "avatar": "https://cdn.example.com/avatars/12345.jpg",
      "signature": ""
    }
  }
}
```

---

### 3.4 Phone Login
**Purpose:** SMS-based authentication  
**Called by:** `LoginPhoneActivity`

```http
POST /auth/phone/send-code
Content-Type: application/json

{
  "phone": "+1234567890",
  "country_code": "1"
}
```

**Response:**
```json
{
  "code": 200,
  "message": "Code sent"
}
```

```http
POST /auth/phone/verify
Content-Type: application/json

{
  "phone": "+1234567890",
  "code": "123456"
}
```

**Response:** `LoginDataBean` (same as 3.3)

---

### 3.5 Email Login
**Purpose:** Email/password authentication  
**Called by:** `LoginEmailActivity`

```http
POST /auth/email/login
Content-Type: application/json

{
  "email": "user@example.com",
  "password": "hashed_or_plain"
}
```

**Response:** `LoginDataBean`

---

### 3.6 Account Login
**Purpose:** Username/password authentication  
**Called by:** `LoginAccountActivity`

```http
POST /auth/account/login
Content-Type: application/json

{
  "username": "user123",
  "password": "password123"
}
```

**Response:** `LoginDataBean`

---

## 4. User Profile Endpoints

### 4.1 Get My Profile
**Purpose:** Load user profile data  
**Called by:** `MyProfileActivity`

```http
GET /user/profile
Authorization: Bearer {token}
```

**Response:** `MyHomeBean`
```json
{
  "code": 200,
  "data": {
    "user_id": 12345,
    "nickname": "User123",
    "avatar": "https://cdn.example.com/avatar.jpg",
    "signature": "Living the life!",
    "gender": 1,
    "level": 5,
    "vip_level": 2,
    "guard_level": 0,
    "stats": {
      "followers": 1234,
      "following": 567,
      "likes": 8901,
      "diamonds": 50000,
      "gold": 1200
    },
    "photos": [
      "https://cdn.example.com/photo1.jpg",
      "https://cdn.example.com/photo2.jpg"
    ]
  }
}
```

---

### 4.2 Update Profile
**Purpose:** Edit user information  
**Called by:** `MyProfileActivity` → `rightClick()`

```http
POST /user/profile/update
Authorization: Bearer {token}
Content-Type: application/json

{
  "nickname": "New Name",
  "signature": "New bio",
  "gender": 1,
  "avatar": "https://cdn.example.com/new-avatar.jpg"
}
```

**Response:**
```json
{
  "code": 200,
  "message": "Profile updated"
}
```

---

### 4.3 Get My Space (Homepage)
**Purpose:** User's personal page with posts  
**Called by:** `MySpaceActivity`

```http
GET /user/space/{user_id}
Authorization: Bearer {token}
```

**Query Params:**
- `page` (int, default: 1)
- `limit` (int, default: 20)

**Response:** `MyHomeBean` with posts array

---

### 4.4 Upload Avatar
**Purpose:** Image upload with STS token  
**Called by:** `MyProfileActivity`

```http
POST /oss/sts
Authorization: Bearer {token}
```

**Response:** `App_aliyun_stsActModel`
```json
{
  "code": 200,
  "data": {
    "access_key_id": "STS.access_key",
    "access_key_secret": "secret",
    "security_token": "token",
    "bucket": "babycat-avatars",
    "endpoint": "https://oss-cn-hangzhou.aliyuncs.com",
    "expire_time": 3600,
    "upload_url": "https://babycat-avatars.oss-cn-hangzhou.aliyuncs.com"
  }
}
```

Client uploads directly to OSS:
```bash
curl -X POST \
  https://babycat-avatars.oss-cn-hangzhou.aliyuncs.com \
  -H "Authorization: Bearer {security_token}" \
  -F "file=@avatar.jpg" \
  -F "key=avatars/{user_id}/{uuid}.jpg"
```

---

## 5. Room Management Endpoints

### 5.1 Get Room List
**Purpose:** Discover available voice rooms  
**Called by:** `HomeRankingActivity`

```http
GET /room/list
Authorization: Bearer {token}
```

**Query Params:**
- `page` (int)
- `limit` (int)
- `category` (string, optional): "voice", "video", "game"
- `sort` (string, optional): "hot", "new", "recommend"

**Response:** `RoomListBean`
```json
{
  "code": 200,
  "data": {
    "list": [
      {
        "room_id": 1001,
        "chatroom_id": 50001,
        "name": "Party Room 1",
        "cover": "https://cdn.example.com/room1.jpg",
        "owner": {
          "user_id": 123,
          "nickname": "Host123",
          "avatar": "https://cdn.example.com/avatar.jpg",
          "level": 10
        },
        "online_count": 156,
        "like_count": 8900,
        "status": "live",
        "tags": ["music", "chat"],
        "mic_count": 8,
        "mic_used": 3
      }
    ],
    "total": 100,
    "page": 1
  }
}
```

---

### 5.2 Get Room Detail
**Purpose:** Room info before joining  
**Called by:** `VoiceRoomDetailActivity`

```http
GET /room/{room_id}
Authorization: Bearer {token}
```

**Response:** `RoomInfoBean`
```json
{
  "code": 200,
  "data": {
    "room_id": 1001,
    "name": "Party Room 1",
    "cover": "https://cdn.example.com/room1.jpg",
    "background": "https://cdn.example.com/bg.jpg",
    "owner": {
      "user_id": 123,
      "nickname": "Host123",
      "avatar": "https://cdn.example.com/avatar.jpg"
    },
    "online_count": 156,
    "like_count": 8900,
    "description": "Welcome to my party room!",
    "tags": ["music", "chat"],
    "mic_mode": "free",  // "free", "apply", "host_only"
    "is_private": false,
    "password": null,
    "announcement": "Be respectful!"
  }
}
```

---

### 5.3 Join Room
**Purpose:** Enter voice room  
**Called by:** `NewVoiceChatRoomActivity` → Presenter `joinRoom()`

```http
POST /room/{room_id}/join
Authorization: Bearer {token}
```

**Response:** `JoinRoomBean`
```json
{
  "code": 200,
  "data": {
    "room_id": 1001,
    "rtc_token": "livekit_access_token",
    "rtc_url": "wss://livekit.example.com",
    "user_role": "audience",  // "host", "admin", "audience"
    "mic_position": null,
    "room_settings": {
      "mic_mode": "free",
      "chat_enabled": true,
      "gift_enabled": true
    }
  }
}
```

**LiveKit Integration:**
- Client uses `rtc_token` to join LiveKit room named `room_1001`
- Server creates LiveKit room if not exists
- Token grants appropriate publish/subscribe permissions

---

### 5.4 Leave Room
**Purpose:** Exit voice room  
**Called by:** `NewVoiceChatRoomActivity`

```http
POST /room/{room_id}/leave
Authorization: Bearer {token}
Content-Type: application/json

{
  "reason": "user_initiated"  // "user_initiated", "kicked", "room_closed"
}
```

**Response:**
```json
{
  "code": 200,
  "message": "Left room"
}
```

---

### 5.5 Close Room
**Purpose:** Host ends live session  
**Called by:** `EndInterfaceActivity`

```http
POST /room/{room_id}/close
Authorization: Bearer {token}
```

**Response:**
```json
{
  "code": 200,
  "message": "Room closed"
}
```

---

### 5.6 Create Room
**Purpose:** Start new voice room  
**Called by:** `CreatePersonalRoomActivity`

```http
POST /room/create
Authorization: Bearer {token}
Content-Type: application/json

{
  "name": "My New Room",
  "cover": "https://cdn.example.com/cover.jpg",
  "category": "voice",
  "tags": ["music", "chat"],
  "is_private": false,
  "password": null,
  "mic_mode": "free",
  "announcement": "Welcome!"
}
```

**Response:** `RoomInfoBean`

---

### 5.7 Update Room
**Purpose:** Edit room settings  
**Called by:** `RoomManagerActivity`

```http
POST /room/{room_id}/update
Authorization: Bearer {token}
Content-Type: application/json

{
  "name": "Updated Name",
  "announcement": "New rules",
  "mic_mode": "apply",
  "is_private": true
}
```

---

### 5.8 Room Mic Management

#### 5.8.1 Get Mic List
```http
GET /room/{room_id}/mic
Authorization: Bearer {token}
```

**Response:** `RoomMicListBean`
```json
{
  "code": 200,
  "data": {
    "mic_list": [
      {
        "position": 1,
        "user_id": 123,
        "nickname": "User123",
        "avatar": "https://cdn.example.com/avatar.jpg",
        "is_muted": false,
        "is_speaking": true
      }
    ]
  }
}
```

#### 5.8.2 Mute/Unmute Mic
```http
POST /room/{room_id}/mic/toggle
Authorization: Bearer {token}
Content-Type: application/json

{
  "user_id": 123,
  "muted": true
}
```

#### 5.8.3 Kick User from Mic
```http
POST /room/{room_id}/mic/kick
Authorization: Bearer {token}
Content-Type: application/json

{
  "user_id": 123
}
```

---

## 6. Chat & Messaging Endpoints

### 6.1 Get Room Chat History
**Purpose:** Load chat messages  
**Called by:** `NewVoiceChatRoomActivity` → `LiveChatTabContainerView`

```http
GET /room/{room_id}/chat
Authorization: Bearer {token}
```

**Query Params:**
- `page` (int, default: 1)
- `limit` (int, default: 50)

**Response:** List of `LiveRoomChatBean`
```json
{
  "code": 200,
  "data": [
    {
      "message_id": 10001,
      "user_id": 123,
      "nickname": "User123",
      "avatar": "https://cdn.example.com/avatar.jpg",
      "type": "text",  // "text", "image", "voice", "gift", "system"
      "content": "Hello everyone!",
      "timestamp": 1699123456789,
      "is_self": false
    }
  ]
}
```

---

### 6.2 Send Chat Message
**Purpose:** Post message to room  
**Called by:** Chat input in `NewVoiceChatRoomActivity`

```http
POST /room/{room_id}/chat/send
Authorization: Bearer {token}
Content-Type: application/json

{
  "content": "Hello everyone!",
  "type": "text"
}
```

**Response:**
```json
{
  "code": 200,
  "data": {
    "message_id": 10002,
    "timestamp": 1699123467890
  }
}
```

**WebSocket Event (broadcast via Socket.IO or LiveKit DataChannel):**
```json
{
  "event": "chat_message",
  "data": {
    "message_id": 10002,
    "user_id": 456,
    "nickname": "User456",
    "avatar": "https://cdn.example.com/avatar2.jpg",
    "type": "text",
    "content": "Hello everyone!",
    "timestamp": 1699123467890
  }
}
```

---

### 6.3 Get Chat Friends List
**Purpose:** Load IM contacts  
**Called by:** `ChatFriendsActivity`

```http
GET /chat/friends
Authorization: Bearer {token}
```

**Response:** List of `ChatFriendsBean`

---

### 6.4 Get Private Messages
**Purpose:** Load DM history  
**Called by:** `MessageDetailsActivity`

```http
GET /chat/dm/{user_id}
Authorization: Bearer {token}
```

---

## 7. Gifting & Economy Endpoints

### 7.1 Get Gift List
**Purpose:** Fetch available gifts  
**Called by:** `NewVoiceChatRoomActivity` (gift panel)

```http
GET /gift/list
Authorization: Bearer {token}
```

**Query Params:**
- `room_id` (int, optional)

**Response:** `GiftListBean`
```json
{
  "code": 200,
  "data": {
    "categories": [
      {
        "id": 1,
        "name": "Popular",
        "gifts": [
          {
            "gift_id": 101,
            "name": "Rose",
            "icon": "https://cdn.example.com/gifts/rose.png",
            "svga": "https://cdn.example.com/gifts/rose.svga",
            "diamond_price": 1,
            "animation": "normal",
            "type": "normal"
          },
          {
            "gift_id": 102,
            "name": "Rocket",
            "icon": "https://cdn.example.com/gifts/rocket.png",
            "svga": "https://cdn.example.com/gifts/rocket.svga",
            "diamond_price": 100,
            "animation": "full",
            "type": "full_venue"
          }
        ]
      }
    ]
  }
}
```

---

### 7.2 Send Gift
**Purpose:** Purchase and send gift  
**Called by:** Gift selection → Confirm

```http
POST /gift/send
Authorization: Bearer {token}
Content-Type: application/json

{
  "room_id": 1001,
  "receiver_id": 123,
  "gift_id": 101,
  "count": 1,
  "is_full_venue": false
}
```

**Response:** `SendGiftBean`
```json
{
  "code": 200,
  "data": {
    "order_id": 50001,
    "gift_id": 101,
    "count": 1,
    "total_price": 1,
    "remaining_balance": 49999,
    "combo_count": 1
  }
}
```

**WebSocket Event (broadcast):**
```json
{
  "event": "gift_sent",
  "data": {
    "from_user": {
      "user_id": 456,
      "nickname": "User456",
      "avatar": "https://cdn.example.com/avatar2.jpg",
      "vip_level": 2
    },
    "to_user": {
      "user_id": 123,
      "nickname": "Host123"
    },
    "gift": {
      "gift_id": 101,
      "name": "Rose",
      "icon": "https://cdn.example.com/gifts/rose.png",
      "svga": "https://cdn.example.com/gifts/rose.svga"
    },
    "count": 1,
    "combo_count": 1,
    "timestamp": 1699123467890
  }
}
```

---

### 7.3 Get Recharge Packages
**Purpose:** Display top-up options  
**Called by:** `MyPayActivity`

```http
GET /recharge/packages
Authorization: Bearer {token}
```

**Response:** `RechargeHomeBean`
```json
{
  "code": 200,
  "data": {
    "packages": [
      {
        "product_id": "com.babycat.diamonds.100",
        "name": "100 Diamonds",
        "diamonds": 100,
        "price": 0.99,
        "currency": "USD",
        "google_play_sku": "diamonds_100"
      }
    ],
    "policies": {
      "refund_url": "https://example.com/refund",
      "privacy_url": "https://example.com/privacy"
    }
  }
}
```

---

### 7.4 Verify Purchase
**Purpose:** Validate Google Play receipt  
**Called by:** Billing callback

```http
POST /recharge/verify
Authorization: Bearer {token}
Content-Type: application/json

{
  "product_id": "com.babycat.diamonds.100",
  "purchase_token": "abc123.def456",
  "receipt_data": "eyJhbGciOiJIUzI1NiJ9...",
  "signature": "signature_string"
}
```

**Response:** `BalanceBean`
```json
{
  "code": 200,
  "data": {
    "diamond_balance": 50100,
    "gold_balance": 1200,
    "total_recharged": 99.99
  }
}
```

---

### 7.5 Get Balance
**Purpose:** Display user wallet  
**Called by:** Various wallet screens

```http
GET /wallet/balance
Authorization: Bearer {token}
```

**Response:** `BalanceBean`

---

### 7.6 Get Recharge History
**Purpose:** Transaction log  
**Called by:** `RechargeRecordActivity`

```http
GET /wallet/recharge/history
Authorization: Bearer {token}
```

**Query Params:**
- `page` (int)
- `start_date` (ISO date)
- `end_date` (ISO date)

**Response:** `PayLogBean`

---

### 7.7 Get Withdrawal History
**Purpose:** Cash-out log  
**Called by:** `WithdrawalRecordsActivity`

```http
GET /wallet/withdrawal/history
Authorization: Bearer {token}
```

**Response:** List of withdrawal records

---

## 8. Social & Feed Endpoints

### 8.1 Get Feed / Moments
**Purpose:** User posts and updates  
**Called by:** `MySpaceActivity`

```http
GET /feed/posts
Authorization: Bearer {token}
```

**Query Params:**
- `page` (int)
- `user_id` (int, optional)
- `type` (string, optional): "all", "following"

**Response:** `DynamicListBean`

---

### 8.2 Create Post
**Purpose:** Publish new moment  
**Called by:** `DynamicPushActivity`

```http
POST /feed/post
Authorization: Bearer {token}
Content-Type: multipart/form-data

{
  "text": "Check out my photos!",
  "images": [
    "https://cdn.example.com/posts/1.jpg",
    "https://cdn.example.com/posts/2.jpg"
  ],
  "visibility": "public"  // "public", "friends", "private"
}
```

---

### 8.3 Like Post
**Purpose:** Like/unlike feed item  
**Called by:** Feed detail

```http
POST /feed/{post_id}/like
Authorization: Bearer {token}
```

---

### 8.4 Comment on Post
```http
POST /feed/{post_id}/comment
Authorization: Bearer {token}
Content-Type: application/json

{
  "content": "Nice photo!",
  "parent_id": null  // for replies
}
```

---

## 9. Friends & Relationships

### 9.1 Get Friends List
**Purpose:** Display friends  
**Called by:** `MyFriendsActivity`

```http
GET /friends/list
Authorization: Bearer {token}
```

---

### 9.2 Send Friend Request
```http
POST /friends/request
Authorization: Bearer {token}
Content-Type: application/json

{
  "user_id": 789
}
```

---

### 9.3 Accept/Reject Friend Request
```http
POST /friends/request/{request_id}/respond
Authorization: Bearer {token}
Content-Type: application/json

{
  "action": "accept"  // "accept" or "reject"
}
```

---

### 9.4 Get User Info by ID
**Purpose:** View other user's profile  
**Called by:** Clicking avatar

```http
GET /user/{user_id}
Authorization: Bearer {token}
```

---

## 10. Search & Discovery

### 10.1 Search
**Purpose:** Global search  
**Called by:** `SearchActivity`

```http
GET /search
Authorization: Bearer {token}
```

**Query Params:**
- `q` (string): Search query
- `type` (string): "all", "user", "room"

**Response:**
```json
{
  "code": 200,
  "data": {
    "users": [
      {
        "user_id": 123,
        "nickname": "User123",
        "avatar": "https://cdn.example.com/avatar.jpg"
      }
    ],
    "rooms": [
      {
        "room_id": 1001,
        "name": "Party Room",
        "cover": "https://cdn.example.com/room.jpg",
        "online_count": 156
      }
    ]
  }
}
```

---

### 10.2 Get Rankings
**Purpose:** Leaderboards  
**Called by:** `HomeRankingActivity`

```http
GET /rankings
Authorization: Bearer {token}
```

**Query Params:**
- `type` (string): "wealth", "popularity", "new"
- `page` (int)

**Response:** `RankingDataBean`

---

## 11. Creator / Agency Endpoints

### 11.1 Get Agency Dashboard
**Purpose:** Broadcaster stats  
**Called by:** `MyAnchorActivity`

```http
GET /creator/agency/dashboard
Authorization: Bearer {token}
```

**Response:** `AgencyHomeBean`

---

### 11.2 Get Host List
```http
GET /creator/hosts
Authorization: Bearer {token}
```

**Response:** List of hosts with stats

---

### 11.3 Get Earnings
```http
GET /creator/earnings
Authorization: Bearer {token}
```

**Query Params:**
- `start_date` (ISO date)
- `end_date` (ISO date)

**Response:** `SalaryBillBean`

---

## 12. LiveKit Integration

### 12.1 LiveKit Room Token Generation
**Purpose:** Generate JWT for LiveKit  
**Called by:** Backend `POST /room/{room_id}/join`

```javascript
// Node.js server-side
const { AccessToken } = require('livekit-server-sdk');

const token = new AccessToken(apiKey, apiSecret, {
  identity: user.user_id.toString(),
  name: user.nickname,
  metadata: JSON.stringify({ user_id: user.user_id, role: 'audience' })
});

token.addGrant({ roomJoin: true, room: `room_${roomId}` });

const jwt = token.toJwt();
```

**Client-side (Android):**
```java
// LiveKit SDK joins room
Room room = new Room();
 room.connect(
   context,
   "wss://livekit.example.com",
   jwt,
   new RoomOptions()
 );
```

---

## 13. WebSocket Events (Real-time)

Use Socket.IO or LiveKit DataChannel for real-time features.

### 13.1 Gift Sent Event
```json
{
  "event": "gift:sent",
  "data": {
    "from_user_id": 456,
    "to_user_id": 123,
    "gift_id": 101,
    "count": 1,
    "combo_count": 5,
    "timestamp": 1699123467890
  }
}
```

### 13.2 User Joined Room
```json
{
  "event": "user:joined",
  "data": {
    "user_id": 456,
    "nickname": "User456",
    "role": "audience"
  }
}
```

### 13.3 Mic State Changed
```json
{
  "event": "mic:changed",
  "data": {
    "position": 1,
    "user_id": 123,
    "is_muted": false,
    "is_speaking": true
  }
}
```

### 13.4 Room Closed
```json
{
  "event": "room:closed",
  "data": {
    "room_id": 1001,
    "reason": "host_ended"
  }
}
```

---

## 14. Error Handling

### Standard Error Response
```json
{
  "code": 400,
  "message": "Invalid request",
  "errors": [
    {
      "field": "phone",
      "message": "Phone number is required"
    }
  ]
}
```

### Common Error Codes
| Code | Meaning |
|------|---------|
| 400 | Bad request (validation error) |
| 401 | Unauthorized (token missing/expired) |
| 403 | Forbidden (insufficient permissions) |
| 404 | Not found |
| 409 | Conflict (already exists) |
| 429 | Rate limit exceeded |
| 500 | Internal server error |

---

## 15. Rate Limiting

- **Auth endpoints:** 5 requests per minute per IP
- **General API:** 100 requests per minute per user
- **WebSocket messages:** 50 messages per minute per user

Implement using `express-rate-limit` + Redis.

---

## 16. File Upload Flow

1. Client requests STS token: `POST /oss/sts`
2. Backend returns temporary credentials
3. Client uploads directly to OSS/S3:
   ```
   PUT https://bucket.oss-region.aliyuncs.com/path/to/file.jpg
   Headers: Authorization: Bearer {security_token}
   Body: Binary file data
   ```
4. Client saves URL in profile update

**Supported formats:** jpg, png, gif, webp (max 10MB)

---

## 17. Implementation Checklist

### Phase 1: Core Auth
- [ ] `POST /auth/third-party` (Google OAuth)
- [ ] `POST /auth/phone/send-code`
- [ ] `POST /auth/phone/verify`
- [ ] `GET /init`
- [ ] `POST /auth/refresh`
- [ ] JWT middleware

### Phase 2: Rooms
- [ ] `GET /room/list`
- [ ] `GET /room/{id}`
- [ ] `POST /room/{id}/join` (generate LiveKit token)
- [ ] `POST /room/{id}/leave`
- [ ] `GET /room/{id}/mic`
- [ ] `POST /room/{id}/mic/toggle`
- [ ] LiveKit server deployment

### Phase 3: User Profile
- [ ] `GET /user/profile`
- [ ] `POST /user/profile/update`
- [ ] `POST /oss/sts`
- [ ] Avatar upload

### Phase 4: Chat & Gifts
- [ ] `GET /room/{id}/chat`
- [ ] `POST /room/{id}/chat/send`
- [ ] WebSocket server
- [ ] `GET /gift/list`
- [ ] `POST /gift/send`

### Phase 5: Wallet
- [ ] `GET /wallet/balance`
- [ ] `GET /recharge/packages`
- [ ] `POST /recharge/verify`
- [ ] `GET /wallet/withdrawal/history`

### Phase 6: Social
- [ ] `GET /friends/list`
- [ ] `POST /friends/request`
- [ ] `GET /feed/posts`
- [ ] `POST /feed/post`
- [ ] `POST /feed/{id}/like`

---

## 18. Database Schema (Prisma)

```prisma
model User {
  id          Int      @id @default(autoincrement())
  user_id     Int      @unique
  nickname    String
  avatar      String?
  signature   String?
  gender      Int?
  level       Int      @default(1)
  vip_level   Int      @default(0)
  diamonds    Int      @default(0)
  gold        Int      @default(0)
  token       String?
  refresh_token String?
  created_at  DateTime @default(now())
  updated_at  DateTime @updatedAt
  
  rooms       Room[]
  mic_sessions MicSession[]
  gifts_sent  GiftTransaction[]
  posts       Post[]
}

model Room {
  id          Int      @id @default(autoincrement())
  room_id     Int      @unique
  name        String
  cover       String
  background  String?
  owner_id    Int
  owner       User     @relation(fields: [owner_id], references: [user_id])
  online_count Int     @default(0)
  like_count  Int      @default(0)
  status      String   @default("live") // "live", "ended"
  mic_mode    String   @default("free")
  is_private  Boolean  @default(false)
  created_at  DateTime @default(now())
  
  messages    ChatMessage[]
  mic_sessions MicSession[]
  gifts       GiftTransaction[]
}

model ChatMessage {
  id          Int      @id @default(autoincrement())
  room_id     Int
  room        Room     @relation(fields: [room_id], references: [room_id])
  user_id     Int
  type        String   // "text", "image", "gift"
  content     String
  extra_data  Json?
  created_at  DateTime @default(now())
}

model Gift {
  id          Int      @id @default(autoincrement())
  gift_id     Int      @unique
  name        String
  icon        String
  svga_url    String?
  diamond_price Int
  type        String
  category_id Int
}

model GiftTransaction {
  id          Int      @id @default(autoincrement())
  from_user   User     @relation(fields: [from_user_id], references: [user_id])
  from_user_id Int
  to_user_id  Int
  room_id     Int
  gift_id     Int
  count       Int
  combo_count Int?
  total_price Int
  created_at  DateTime @default(now())
}
```

---

## 19. Testing Strategy

### Unit Tests
- Authentication flows
- Token refresh logic
- Room CRUD operations

### Integration Tests
- End-to-end login → join room → send gift → leave
- LiveKit token generation
- WebSocket event broadcasting

### Load Tests
- Simulate 1000 concurrent room joins
- 10,000 concurrent WebSocket connections
- Gift burst (100 gifts/sec)

---

## 20. Deployment

```bash
# Install dependencies
npm install

# Run migrations
npx prisma migrate deploy

# Seed initial data
npm run seed

# Start server
npm run start

# With PM2
pm2 start ecosystem.config.js
```

**Environment Variables:**
```env
DATABASE_URL=postgresql://user:pass@localhost:5432/babycat
REDIS_URL=redis://localhost:6379
JWT_SECRET=your_jwt_secret_key
JWT_REFRESH_SECRET=your_refresh_secret
ALIYUN_OSS_ACCESS_KEY=xxx
ALIYUN_OSS_SECRET=xxx
LIVEKIT_API_KEY=xxx
LIVEKIT_API_SECRET=xxx
GOOGLE_CLIENT_ID=xxx
GOOGLE_CLIENT_SECRET=xxx
```

---

## 21. Postman Collection

A Postman collection will be provided with all endpoints for testing.

---

## 22. Additional Notes

1. **CORS:** Configure CORS to allow Android app origins
2. **HTTPS:** Required for production (Let's Encrypt)
3. **Webhook:** Notify app of room events via FCM
4. **CDN:** Use Alibaba Cloud CDN for static assets
5. **Monitoring:** Track API latency, errors (Sentry)
6. **Scaling:** Stateless API servers; LiveKit separate cluster