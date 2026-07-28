package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class LiveRoomDiceBean {

    @SerializedName("content")
    private String content;

    @SerializedName("user_info")
    private UserInfoDataBean userInfo;

    public boolean canEqual(Object obj) {
        return obj instanceof LiveRoomDiceBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveRoomDiceBean)) {
            return false;
        }
        LiveRoomDiceBean liveRoomDiceBean = (LiveRoomDiceBean) obj;
        if (!liveRoomDiceBean.canEqual(this)) {
            return false;
        }
        UserInfoDataBean userInfo = getUserInfo();
        UserInfoDataBean userInfo2 = liveRoomDiceBean.getUserInfo();
        if (userInfo != null ? !userInfo.equals(userInfo2) : userInfo2 != null) {
            return false;
        }
        String content = getContent();
        String content2 = liveRoomDiceBean.getContent();
        return content != null ? content.equals(content2) : content2 == null;
    }

    public String getContent() {
        return this.content;
    }

    public UserInfoDataBean getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        UserInfoDataBean userInfo = getUserInfo();
        int iHashCode = userInfo == null ? 43 : userInfo.hashCode();
        String content = getContent();
        return ((iHashCode + 59) * 59) + (content != null ? content.hashCode() : 43);
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setUserInfo(UserInfoDataBean userInfoDataBean) {
        this.userInfo = userInfoDataBean;
    }

    public String toString() {
        return "LiveRoomDiceBean(userInfo=" + getUserInfo() + ", content=" + getContent() + ")";
    }
}
