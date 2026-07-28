package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class LeaveRoomBean {

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("level")
    private Integer level;

    @SerializedName("level_icon_url")
    private String levelIconUrl;

    @SerializedName("role")
    private Integer role;

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("user_name")
    private String userName;

    public boolean canEqual(Object obj) {
        return obj instanceof LeaveRoomBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LeaveRoomBean)) {
            return false;
        }
        LeaveRoomBean leaveRoomBean = (LeaveRoomBean) obj;
        if (!leaveRoomBean.canEqual(this)) {
            return false;
        }
        Integer level = getLevel();
        Integer level2 = leaveRoomBean.getLevel();
        if (level != null ? !level.equals(level2) : level2 != null) {
            return false;
        }
        Integer role = getRole();
        Integer role2 = leaveRoomBean.getRole();
        if (role != null ? !role.equals(role2) : role2 != null) {
            return false;
        }
        Integer userId = getUserId();
        Integer userId2 = leaveRoomBean.getUserId();
        if (userId != null ? !userId.equals(userId2) : userId2 != null) {
            return false;
        }
        String levelIconUrl = getLevelIconUrl();
        String levelIconUrl2 = leaveRoomBean.getLevelIconUrl();
        if (levelIconUrl != null ? !levelIconUrl.equals(levelIconUrl2) : levelIconUrl2 != null) {
            return false;
        }
        String userName = getUserName();
        String userName2 = leaveRoomBean.getUserName();
        if (userName != null ? !userName.equals(userName2) : userName2 != null) {
            return false;
        }
        String avatar = getAvatar();
        String avatar2 = leaveRoomBean.getAvatar();
        return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public Integer getLevel() {
        return this.level;
    }

    public String getLevelIconUrl() {
        return this.levelIconUrl;
    }

    public Integer getRole() {
        return this.role;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        Integer level = getLevel();
        int iHashCode = level == null ? 43 : level.hashCode();
        Integer role = getRole();
        int iHashCode2 = ((iHashCode + 59) * 59) + (role == null ? 43 : role.hashCode());
        Integer userId = getUserId();
        int iHashCode3 = (iHashCode2 * 59) + (userId == null ? 43 : userId.hashCode());
        String levelIconUrl = getLevelIconUrl();
        int iHashCode4 = (iHashCode3 * 59) + (levelIconUrl == null ? 43 : levelIconUrl.hashCode());
        String userName = getUserName();
        int iHashCode5 = (iHashCode4 * 59) + (userName == null ? 43 : userName.hashCode());
        String avatar = getAvatar();
        return (iHashCode5 * 59) + (avatar != null ? avatar.hashCode() : 43);
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setLevel(Integer num) {
        this.level = num;
    }

    public void setLevelIconUrl(String str) {
        this.levelIconUrl = str;
    }

    public void setRole(Integer num) {
        this.role = num;
    }

    public void setUserId(Integer num) {
        this.userId = num;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public String toString() {
        return "LeaveRoomBean(level=" + getLevel() + ", levelIconUrl=" + getLevelIconUrl() + ", role=" + getRole() + ", userName=" + getUserName() + ", userId=" + getUserId() + ", avatar=" + getAvatar() + ")";
    }
}
