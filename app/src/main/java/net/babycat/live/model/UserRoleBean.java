package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class UserRoleBean {

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("is_agent")
    private Integer isAgent;

    @SerializedName("nickname")
    private String nickname;

    @SerializedName("uid")
    private Integer uid;

    public boolean canEqual(Object obj) {
        return obj instanceof UserRoleBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserRoleBean)) {
            return false;
        }
        UserRoleBean userRoleBean = (UserRoleBean) obj;
        if (!userRoleBean.canEqual(this)) {
            return false;
        }
        Integer isAgent = getIsAgent();
        Integer isAgent2 = userRoleBean.getIsAgent();
        if (isAgent != null ? !isAgent.equals(isAgent2) : isAgent2 != null) {
            return false;
        }
        Integer uid = getUid();
        Integer uid2 = userRoleBean.getUid();
        if (uid != null ? !uid.equals(uid2) : uid2 != null) {
            return false;
        }
        String nickname = getNickname();
        String nickname2 = userRoleBean.getNickname();
        if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
            return false;
        }
        String avatar = getAvatar();
        String avatar2 = userRoleBean.getAvatar();
        return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public Integer getIsAgent() {
        return this.isAgent;
    }

    public String getNickname() {
        return this.nickname;
    }

    public Integer getUid() {
        return this.uid;
    }

    public int hashCode() {
        Integer isAgent = getIsAgent();
        int iHashCode = isAgent == null ? 43 : isAgent.hashCode();
        Integer uid = getUid();
        int iHashCode2 = ((iHashCode + 59) * 59) + (uid == null ? 43 : uid.hashCode());
        String nickname = getNickname();
        int iHashCode3 = (iHashCode2 * 59) + (nickname == null ? 43 : nickname.hashCode());
        String avatar = getAvatar();
        return (iHashCode3 * 59) + (avatar != null ? avatar.hashCode() : 43);
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setIsAgent(Integer num) {
        this.isAgent = num;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setUid(Integer num) {
        this.uid = num;
    }

    public String toString() {
        return "UserRoleBean(isAgent=" + getIsAgent() + ", uid=" + getUid() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ")";
    }
}
