package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class OnlineUserListBean {

    @SerializedName("anchor_level")
    Integer anchorLevel;

    @SerializedName("avatar")
    String avatar;

    @SerializedName("is_select")
    private boolean isSelect;

    @SerializedName("level")
    Integer level;

    @SerializedName("nickname")
    String nickName;

    @SerializedName("role")
    Integer role;

    @SerializedName("user_id")
    Integer userId;

    public boolean canEqual(Object obj) {
        return obj instanceof OnlineUserListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OnlineUserListBean)) {
            return false;
        }
        OnlineUserListBean onlineUserListBean = (OnlineUserListBean) obj;
        if (!onlineUserListBean.canEqual(this) || isSelect() != onlineUserListBean.isSelect()) {
            return false;
        }
        Integer userId = getUserId();
        Integer userId2 = onlineUserListBean.getUserId();
        if (userId != null ? !userId.equals(userId2) : userId2 != null) {
            return false;
        }
        Integer role = getRole();
        Integer role2 = onlineUserListBean.getRole();
        if (role != null ? !role.equals(role2) : role2 != null) {
            return false;
        }
        Integer level = getLevel();
        Integer level2 = onlineUserListBean.getLevel();
        if (level != null ? !level.equals(level2) : level2 != null) {
            return false;
        }
        Integer anchorLevel = getAnchorLevel();
        Integer anchorLevel2 = onlineUserListBean.getAnchorLevel();
        if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
            return false;
        }
        String avatar = getAvatar();
        String avatar2 = onlineUserListBean.getAvatar();
        if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
            return false;
        }
        String nickName = getNickName();
        String nickName2 = onlineUserListBean.getNickName();
        return nickName != null ? nickName.equals(nickName2) : nickName2 == null;
    }

    public Integer getAnchorLevel() {
        return this.anchorLevel;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public Integer getLevel() {
        return this.level;
    }

    public String getNickName() {
        return this.nickName;
    }

    public Integer getRole() {
        return this.role;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int i10 = isSelect() ? 79 : 97;
        Integer userId = getUserId();
        int iHashCode = ((i10 + 59) * 59) + (userId == null ? 43 : userId.hashCode());
        Integer role = getRole();
        int iHashCode2 = (iHashCode * 59) + (role == null ? 43 : role.hashCode());
        Integer level = getLevel();
        int iHashCode3 = (iHashCode2 * 59) + (level == null ? 43 : level.hashCode());
        Integer anchorLevel = getAnchorLevel();
        int iHashCode4 = (iHashCode3 * 59) + (anchorLevel == null ? 43 : anchorLevel.hashCode());
        String avatar = getAvatar();
        int iHashCode5 = (iHashCode4 * 59) + (avatar == null ? 43 : avatar.hashCode());
        String nickName = getNickName();
        return (iHashCode5 * 59) + (nickName != null ? nickName.hashCode() : 43);
    }

    public boolean isSelect() {
        return this.isSelect;
    }

    public void setAnchorLevel(Integer num) {
        this.anchorLevel = num;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setLevel(Integer num) {
        this.level = num;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setRole(Integer num) {
        this.role = num;
    }

    public void setSelect(boolean z10) {
        this.isSelect = z10;
    }

    public void setUserId(Integer num) {
        this.userId = num;
    }

    public String toString() {
        return "OnlineUserListBean(avatar=" + getAvatar() + ", userId=" + getUserId() + ", role=" + getRole() + ", nickName=" + getNickName() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ", isSelect=" + isSelect() + ")";
    }
}
