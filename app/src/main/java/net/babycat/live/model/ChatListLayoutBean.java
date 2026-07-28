package net.babycat.live.model;

import o7.b;

/* JADX INFO: loaded from: classes4.dex */
public class ChatListLayoutBean implements b {
    public static final int CLEAR_CHAT = 4;
    public static final int DICE = 6;
    public static final int GIFT = 3;
    public static final int INTO = 1;
    public static final int LOCK_CHATROOM = 5;
    public static final int LUCK = 7;
    public static final int SPEAK = 2;
    public static final int TIPS = 0;
    private String anchor_level_icon;
    private String avatar;
    private String avatarFrame;
    private String chatBubble;
    private String content;
    private int fieldType;
    private String giftName;
    private String jctx;
    private String levelIconUrl;
    private Integer lucky;
    private String recipientNickname;
    private Integer role;
    private Integer userId;
    private UserInfoDataBean userInfo;
    private String userName;
    private Integer vip_level;

    public String getAnchor_level_icon() {
        return this.anchor_level_icon;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getAvatarFrame() {
        return this.avatarFrame;
    }

    public String getChatBubble() {
        return this.chatBubble;
    }

    public String getContent() {
        return this.content;
    }

    public int getFieldType() {
        return this.fieldType;
    }

    public String getGiftName() {
        return this.giftName;
    }

    @Override // o7.b
    public int getItemType() {
        return this.fieldType;
    }

    public String getJctx() {
        return this.jctx;
    }

    public String getLevelIconUrl() {
        return this.levelIconUrl;
    }

    public Integer getLucky() {
        return this.lucky;
    }

    public String getRecipientNickname() {
        return this.recipientNickname;
    }

    public Integer getRole() {
        return this.role;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public UserInfoDataBean getUserInfo() {
        return this.userInfo;
    }

    public String getUserName() {
        return this.userName;
    }

    public Integer getVip_level() {
        return this.vip_level;
    }

    public void setAnchor_level_icon(String str) {
        this.anchor_level_icon = str;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setAvatarFrame(String str) {
        this.avatarFrame = str;
    }

    public void setChatBubble(String str) {
        this.chatBubble = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setFieldType(int i10) {
        this.fieldType = i10;
    }

    public void setGiftName(String str) {
        this.giftName = str;
    }

    public void setJctx(String str) {
        this.jctx = str;
    }

    public void setLevelIconUrl(String str) {
        this.levelIconUrl = str;
    }

    public void setLucky(Integer num) {
        this.lucky = num;
    }

    public void setRecipientNickname(String str) {
        this.recipientNickname = str;
    }

    public void setRole(Integer num) {
        this.role = num;
    }

    public void setUserId(Integer num) {
        this.userId = num;
    }

    public void setUserInfo(UserInfoDataBean userInfoDataBean) {
        this.userInfo = userInfoDataBean;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public void setVip_level(Integer num) {
        this.vip_level = num;
    }
}
