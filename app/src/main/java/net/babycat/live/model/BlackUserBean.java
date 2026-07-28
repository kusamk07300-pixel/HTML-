package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;

/* JADX INFO: loaded from: classes4.dex */
public class BlackUserBean {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34807id;

    @SerializedName(o0.CATEGORY_STATUS)
    private Integer status;

    @SerializedName("touid")
    private Integer touid;

    @SerializedName("uid")
    private Integer uid;

    @SerializedName("user")
    private UserDTO user;

    public static class UserDTO {

        @SerializedName("age")
        private Integer age;

        @SerializedName("anchor_level")
        private String anchorLevel;

        @SerializedName("avatar")
        private String avatar;

        @SerializedName("avatar_frame")
        private String avatarFrame;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34808id;

        @SerializedName("level")
        private String level;

        @SerializedName("nickname")
        private String nickname;

        @SerializedName("online_roomid")
        private String onlineRoomid;

        @SerializedName("sex")
        private String sex;

        public boolean canEqual(Object obj) {
            return obj instanceof UserDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserDTO)) {
                return false;
            }
            UserDTO userDTO = (UserDTO) obj;
            if (!userDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = userDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            Integer age = getAge();
            Integer age2 = userDTO.getAge();
            if (age != null ? !age.equals(age2) : age2 != null) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = userDTO.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = userDTO.getAvatar();
            if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
                return false;
            }
            String sex = getSex();
            String sex2 = userDTO.getSex();
            if (sex != null ? !sex.equals(sex2) : sex2 != null) {
                return false;
            }
            String level = getLevel();
            String level2 = userDTO.getLevel();
            if (level != null ? !level.equals(level2) : level2 != null) {
                return false;
            }
            String anchorLevel = getAnchorLevel();
            String anchorLevel2 = userDTO.getAnchorLevel();
            if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
                return false;
            }
            String onlineRoomid = getOnlineRoomid();
            String onlineRoomid2 = userDTO.getOnlineRoomid();
            if (onlineRoomid != null ? !onlineRoomid.equals(onlineRoomid2) : onlineRoomid2 != null) {
                return false;
            }
            String avatarFrame = getAvatarFrame();
            String avatarFrame2 = userDTO.getAvatarFrame();
            return avatarFrame != null ? avatarFrame.equals(avatarFrame2) : avatarFrame2 == null;
        }

        public Integer getAge() {
            return this.age;
        }

        public String getAnchorLevel() {
            return this.anchorLevel;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public String getAvatarFrame() {
            return this.avatarFrame;
        }

        public Integer getId() {
            return this.f34808id;
        }

        public String getLevel() {
            return this.level;
        }

        public String getNickname() {
            return this.nickname;
        }

        public String getOnlineRoomid() {
            return this.onlineRoomid;
        }

        public String getSex() {
            return this.sex;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer age = getAge();
            int iHashCode2 = ((iHashCode + 59) * 59) + (age == null ? 43 : age.hashCode());
            String nickname = getNickname();
            int iHashCode3 = (iHashCode2 * 59) + (nickname == null ? 43 : nickname.hashCode());
            String avatar = getAvatar();
            int iHashCode4 = (iHashCode3 * 59) + (avatar == null ? 43 : avatar.hashCode());
            String sex = getSex();
            int iHashCode5 = (iHashCode4 * 59) + (sex == null ? 43 : sex.hashCode());
            String level = getLevel();
            int iHashCode6 = (iHashCode5 * 59) + (level == null ? 43 : level.hashCode());
            String anchorLevel = getAnchorLevel();
            int iHashCode7 = (iHashCode6 * 59) + (anchorLevel == null ? 43 : anchorLevel.hashCode());
            String onlineRoomid = getOnlineRoomid();
            int iHashCode8 = (iHashCode7 * 59) + (onlineRoomid == null ? 43 : onlineRoomid.hashCode());
            String avatarFrame = getAvatarFrame();
            return (iHashCode8 * 59) + (avatarFrame != null ? avatarFrame.hashCode() : 43);
        }

        public void setAge(Integer num) {
            this.age = num;
        }

        public void setAnchorLevel(String str) {
            this.anchorLevel = str;
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setAvatarFrame(String str) {
            this.avatarFrame = str;
        }

        public void setId(Integer num) {
            this.f34808id = num;
        }

        public void setLevel(String str) {
            this.level = str;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public void setOnlineRoomid(String str) {
            this.onlineRoomid = str;
        }

        public void setSex(String str) {
            this.sex = str;
        }

        public String toString() {
            return "BlackUserBean.UserDTO(id=" + getId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", sex=" + getSex() + ", age=" + getAge() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ", onlineRoomid=" + getOnlineRoomid() + ", avatarFrame=" + getAvatarFrame() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof BlackUserBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BlackUserBean)) {
            return false;
        }
        BlackUserBean blackUserBean = (BlackUserBean) obj;
        if (!blackUserBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = blackUserBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer uid = getUid();
        Integer uid2 = blackUserBean.getUid();
        if (uid != null ? !uid.equals(uid2) : uid2 != null) {
            return false;
        }
        Integer touid = getTouid();
        Integer touid2 = blackUserBean.getTouid();
        if (touid != null ? !touid.equals(touid2) : touid2 != null) {
            return false;
        }
        Integer status = getStatus();
        Integer status2 = blackUserBean.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        UserDTO user = getUser();
        UserDTO user2 = blackUserBean.getUser();
        return user != null ? user.equals(user2) : user2 == null;
    }

    public Integer getId() {
        return this.f34807id;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getTouid() {
        return this.touid;
    }

    public Integer getUid() {
        return this.uid;
    }

    public UserDTO getUser() {
        return this.user;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        Integer uid = getUid();
        int iHashCode2 = ((iHashCode + 59) * 59) + (uid == null ? 43 : uid.hashCode());
        Integer touid = getTouid();
        int iHashCode3 = (iHashCode2 * 59) + (touid == null ? 43 : touid.hashCode());
        Integer status = getStatus();
        int iHashCode4 = (iHashCode3 * 59) + (status == null ? 43 : status.hashCode());
        UserDTO user = getUser();
        return (iHashCode4 * 59) + (user != null ? user.hashCode() : 43);
    }

    public void setId(Integer num) {
        this.f34807id = num;
    }

    public void setStatus(Integer num) {
        this.status = num;
    }

    public void setTouid(Integer num) {
        this.touid = num;
    }

    public void setUid(Integer num) {
        this.uid = num;
    }

    public void setUser(UserDTO userDTO) {
        this.user = userDTO;
    }

    public String toString() {
        return "BlackUserBean(id=" + getId() + ", uid=" + getUid() + ", touid=" + getTouid() + ", status=" + getStatus() + ", user=" + getUser() + ")";
    }
}
