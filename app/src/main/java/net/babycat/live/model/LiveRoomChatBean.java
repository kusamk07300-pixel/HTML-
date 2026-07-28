package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class LiveRoomChatBean {

    @SerializedName("content")
    private String content;

    @SerializedName("recipient_nickname")
    private String recipientNickname;

    @SerializedName("role")
    private Integer role;

    @SerializedName("secret_key")
    private String secretKey;

    @SerializedName("user_info")
    private UserInfoDataBean userInfo;

    public boolean canEqual(Object obj) {
        return obj instanceof LiveRoomChatBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveRoomChatBean)) {
            return false;
        }
        LiveRoomChatBean liveRoomChatBean = (LiveRoomChatBean) obj;
        if (!liveRoomChatBean.canEqual(this)) {
            return false;
        }
        Integer role = getRole();
        Integer role2 = liveRoomChatBean.getRole();
        if (role != null ? !role.equals(role2) : role2 != null) {
            return false;
        }
        UserInfoDataBean userInfo = getUserInfo();
        UserInfoDataBean userInfo2 = liveRoomChatBean.getUserInfo();
        if (userInfo != null ? !userInfo.equals(userInfo2) : userInfo2 != null) {
            return false;
        }
        String recipientNickname = getRecipientNickname();
        String recipientNickname2 = liveRoomChatBean.getRecipientNickname();
        if (recipientNickname != null ? !recipientNickname.equals(recipientNickname2) : recipientNickname2 != null) {
            return false;
        }
        String content = getContent();
        String content2 = liveRoomChatBean.getContent();
        if (content != null ? !content.equals(content2) : content2 != null) {
            return false;
        }
        String secretKey = getSecretKey();
        String secretKey2 = liveRoomChatBean.getSecretKey();
        return secretKey != null ? secretKey.equals(secretKey2) : secretKey2 == null;
    }

    public String getContent() {
        return this.content;
    }

    public String getRecipientNickname() {
        return this.recipientNickname;
    }

    public Integer getRole() {
        return this.role;
    }

    public String getSecretKey() {
        return this.secretKey;
    }

    public UserInfoDataBean getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        Integer role = getRole();
        int iHashCode = role == null ? 43 : role.hashCode();
        UserInfoDataBean userInfo = getUserInfo();
        int iHashCode2 = ((iHashCode + 59) * 59) + (userInfo == null ? 43 : userInfo.hashCode());
        String recipientNickname = getRecipientNickname();
        int iHashCode3 = (iHashCode2 * 59) + (recipientNickname == null ? 43 : recipientNickname.hashCode());
        String content = getContent();
        int iHashCode4 = (iHashCode3 * 59) + (content == null ? 43 : content.hashCode());
        String secretKey = getSecretKey();
        return (iHashCode4 * 59) + (secretKey != null ? secretKey.hashCode() : 43);
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setRecipientNickname(String str) {
        this.recipientNickname = str;
    }

    public void setRole(Integer num) {
        this.role = num;
    }

    public void setSecretKey(String str) {
        this.secretKey = str;
    }

    public void setUserInfo(UserInfoDataBean userInfoDataBean) {
        this.userInfo = userInfoDataBean;
    }

    public String toString() {
        return "LiveRoomChatBean(userInfo=" + getUserInfo() + ", role=" + getRole() + ", recipientNickname=" + getRecipientNickname() + ", content=" + getContent() + ", secretKey=" + getSecretKey() + ")";
    }
}
