package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;

/* JADX INFO: loaded from: classes4.dex */
public class FriendApplyBean {

    @SerializedName("create_time")
    private String createTime;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private int f34829id;

    @SerializedName("is_black")
    private int isBlack;

    @SerializedName("is_in_mic")
    private boolean isInMic;

    @SerializedName("room_id")
    private int roomId;

    @SerializedName(o0.CATEGORY_STATUS)
    private int status;

    @SerializedName("touid")
    private int touid;

    @SerializedName("uid")
    private int uid;

    @SerializedName("update_time")
    private String updateTime;

    @SerializedName("user")
    private UserBean user;

    public static class UserBean {

        @SerializedName("age")
        private int age;

        @SerializedName("anchor_level")
        private int anchorLevel;

        @SerializedName("avatar")
        private String avatar;

        @SerializedName("avatar_frame")
        private String avatarFrame;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private int f34830id;

        @SerializedName("level")
        private int level;

        @SerializedName("nickname")
        private String nickname;

        @SerializedName("online_roomid")
        private int onlineRoomid;

        @SerializedName("sex")
        private int sex;

        @SerializedName("vip_level")
        private int vipLevel;

        public boolean canEqual(Object obj) {
            return obj instanceof UserBean;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserBean)) {
                return false;
            }
            UserBean userBean = (UserBean) obj;
            if (!userBean.canEqual(this) || getId() != userBean.getId() || getSex() != userBean.getSex() || getAge() != userBean.getAge() || getLevel() != userBean.getLevel() || getAnchorLevel() != userBean.getAnchorLevel() || getOnlineRoomid() != userBean.getOnlineRoomid() || getVipLevel() != userBean.getVipLevel()) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = userBean.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = userBean.getAvatar();
            if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
                return false;
            }
            String avatarFrame = getAvatarFrame();
            String avatarFrame2 = userBean.getAvatarFrame();
            return avatarFrame != null ? avatarFrame.equals(avatarFrame2) : avatarFrame2 == null;
        }

        public int getAge() {
            return this.age;
        }

        public int getAnchorLevel() {
            return this.anchorLevel;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public String getAvatarFrame() {
            return this.avatarFrame;
        }

        public int getId() {
            return this.f34830id;
        }

        public int getLevel() {
            return this.level;
        }

        public String getNickname() {
            return this.nickname;
        }

        public int getOnlineRoomid() {
            return this.onlineRoomid;
        }

        public int getSex() {
            return this.sex;
        }

        public int getVipLevel() {
            return this.vipLevel;
        }

        public int hashCode() {
            int id2 = ((((((((((((getId() + 59) * 59) + getSex()) * 59) + getAge()) * 59) + getLevel()) * 59) + getAnchorLevel()) * 59) + getOnlineRoomid()) * 59) + getVipLevel();
            String nickname = getNickname();
            int iHashCode = (id2 * 59) + (nickname == null ? 43 : nickname.hashCode());
            String avatar = getAvatar();
            int iHashCode2 = (iHashCode * 59) + (avatar == null ? 43 : avatar.hashCode());
            String avatarFrame = getAvatarFrame();
            return (iHashCode2 * 59) + (avatarFrame != null ? avatarFrame.hashCode() : 43);
        }

        public void setAge(int i10) {
            this.age = i10;
        }

        public void setAnchorLevel(int i10) {
            this.anchorLevel = i10;
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setAvatarFrame(String str) {
            this.avatarFrame = str;
        }

        public void setId(int i10) {
            this.f34830id = i10;
        }

        public void setLevel(int i10) {
            this.level = i10;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public void setOnlineRoomid(int i10) {
            this.onlineRoomid = i10;
        }

        public void setSex(int i10) {
            this.sex = i10;
        }

        public void setVipLevel(int i10) {
            this.vipLevel = i10;
        }

        public String toString() {
            return "FriendApplyBean.UserBean(id=" + getId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", sex=" + getSex() + ", age=" + getAge() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ", onlineRoomid=" + getOnlineRoomid() + ", vipLevel=" + getVipLevel() + ", avatarFrame=" + getAvatarFrame() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof FriendApplyBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FriendApplyBean)) {
            return false;
        }
        FriendApplyBean friendApplyBean = (FriendApplyBean) obj;
        if (!friendApplyBean.canEqual(this) || getId() != friendApplyBean.getId() || getUid() != friendApplyBean.getUid() || getTouid() != friendApplyBean.getTouid() || getStatus() != friendApplyBean.getStatus() || getIsBlack() != friendApplyBean.getIsBlack() || isInMic() != friendApplyBean.isInMic() || getRoomId() != friendApplyBean.getRoomId()) {
            return false;
        }
        String createTime = getCreateTime();
        String createTime2 = friendApplyBean.getCreateTime();
        if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
            return false;
        }
        String updateTime = getUpdateTime();
        String updateTime2 = friendApplyBean.getUpdateTime();
        if (updateTime != null ? !updateTime.equals(updateTime2) : updateTime2 != null) {
            return false;
        }
        UserBean user = getUser();
        UserBean user2 = friendApplyBean.getUser();
        return user != null ? user.equals(user2) : user2 == null;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public int getId() {
        return this.f34829id;
    }

    public int getIsBlack() {
        return this.isBlack;
    }

    public int getRoomId() {
        return this.roomId;
    }

    public int getStatus() {
        return this.status;
    }

    public int getTouid() {
        return this.touid;
    }

    public int getUid() {
        return this.uid;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public UserBean getUser() {
        return this.user;
    }

    public int hashCode() {
        int id2 = ((((((((((((getId() + 59) * 59) + getUid()) * 59) + getTouid()) * 59) + getStatus()) * 59) + getIsBlack()) * 59) + (isInMic() ? 79 : 97)) * 59) + getRoomId();
        String createTime = getCreateTime();
        int iHashCode = (id2 * 59) + (createTime == null ? 43 : createTime.hashCode());
        String updateTime = getUpdateTime();
        int iHashCode2 = (iHashCode * 59) + (updateTime == null ? 43 : updateTime.hashCode());
        UserBean user = getUser();
        return (iHashCode2 * 59) + (user != null ? user.hashCode() : 43);
    }

    public boolean isInMic() {
        return this.isInMic;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setId(int i10) {
        this.f34829id = i10;
    }

    public void setInMic(boolean z10) {
        this.isInMic = z10;
    }

    public void setIsBlack(int i10) {
        this.isBlack = i10;
    }

    public void setRoomId(int i10) {
        this.roomId = i10;
    }

    public void setStatus(int i10) {
        this.status = i10;
    }

    public void setTouid(int i10) {
        this.touid = i10;
    }

    public void setUid(int i10) {
        this.uid = i10;
    }

    public void setUpdateTime(String str) {
        this.updateTime = str;
    }

    public void setUser(UserBean userBean) {
        this.user = userBean;
    }

    public String toString() {
        return "FriendApplyBean(id=" + getId() + ", uid=" + getUid() + ", touid=" + getTouid() + ", status=" + getStatus() + ", createTime=" + getCreateTime() + ", isBlack=" + getIsBlack() + ", updateTime=" + getUpdateTime() + ", user=" + getUser() + ", isInMic=" + isInMic() + ", roomId=" + getRoomId() + ")";
    }
}
