package net.babycat.live.model;

import java.util.Date;
import java.util.List;
import o7.b;

/* JADX INFO: loaded from: classes4.dex */
public class ChatRoomLayoutBean implements b {
    public static final int EMOJI = 1;
    public static final int GIFT = 2;
    public static final int Text = 0;
    private Integer anchor_level;
    private String anchor_level_icon;
    private String avatar;
    private String content;
    private Date date;
    private String emoji;
    private int fieldType;
    private GiftListBean giftModel;
    private Integer giftNum;
    private Boolean isTop;
    private Integer level;
    private String level_icon;
    private String nickname;
    private String taName;
    private String toUserName;
    private List<OnlineUserListBean> userList;
    private Integer user_id;

    public Integer getAnchor_level() {
        return this.anchor_level;
    }

    public String getAnchor_level_icon() {
        return this.anchor_level_icon;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getContent() {
        return this.content;
    }

    public Date getDate() {
        return this.date;
    }

    public String getEmoji() {
        return this.emoji;
    }

    public int getFieldType() {
        return this.fieldType;
    }

    public GiftListBean getGiftModel() {
        return this.giftModel;
    }

    public Integer getGiftNum() {
        return this.giftNum;
    }

    @Override // o7.b
    public int getItemType() {
        return this.fieldType;
    }

    public Integer getLevel() {
        return this.level;
    }

    public String getLevel_icon() {
        return this.level_icon;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getTaName() {
        return this.taName;
    }

    public String getToUserName() {
        return this.toUserName;
    }

    public Boolean getTop() {
        return this.isTop;
    }

    public List<OnlineUserListBean> getUserList() {
        return this.userList;
    }

    public Integer getUser_id() {
        return this.user_id;
    }

    public void setAnchor_level(Integer num) {
        this.anchor_level = num;
    }

    public void setAnchor_level_icon(String str) {
        this.anchor_level_icon = str;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setEmoji(String str) {
        this.emoji = str;
    }

    public void setFieldType(int i10) {
        this.fieldType = i10;
    }

    public void setGiftModel(GiftListBean giftListBean) {
        this.giftModel = giftListBean;
    }

    public void setGiftNum(Integer num) {
        this.giftNum = num;
    }

    public void setLevel(Integer num) {
        this.level = num;
    }

    public void setLevel_icon(String str) {
        this.level_icon = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setTaName(String str) {
        this.taName = str;
    }

    public void setToUserName(String str) {
        this.toUserName = str;
    }

    public void setTop(Boolean bool) {
        this.isTop = bool;
    }

    public void setUserList(List<OnlineUserListBean> list) {
        this.userList = list;
    }

    public void setUser_id(Integer num) {
        this.user_id = num;
    }
}
