package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class RoomFansBean {

    @SerializedName("age")
    private Integer age;

    @SerializedName("exp")
    private Integer exp;

    @SerializedName("is_admin")
    private Integer isAdmin;

    @SerializedName("level")
    private Integer level;

    @SerializedName("uid")
    private Integer uid;

    @SerializedName("user")
    private UserDTO user;

    public static class UserDTO {

        @SerializedName("avatar")
        private String avatar;

        @SerializedName("nickname")
        private String nickname;

        @SerializedName("sex")
        private Integer sex;

        @SerializedName("vip_level")
        private Integer vipLevel;

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
            Integer sex = getSex();
            Integer sex2 = userDTO.getSex();
            if (sex != null ? !sex.equals(sex2) : sex2 != null) {
                return false;
            }
            Integer vipLevel = getVipLevel();
            Integer vipLevel2 = userDTO.getVipLevel();
            if (vipLevel != null ? !vipLevel.equals(vipLevel2) : vipLevel2 != null) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = userDTO.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = userDTO.getAvatar();
            return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public String getNickname() {
            return this.nickname;
        }

        public Integer getSex() {
            return this.sex;
        }

        public Integer getVipLevel() {
            return this.vipLevel;
        }

        public int hashCode() {
            Integer sex = getSex();
            int iHashCode = sex == null ? 43 : sex.hashCode();
            Integer vipLevel = getVipLevel();
            int iHashCode2 = ((iHashCode + 59) * 59) + (vipLevel == null ? 43 : vipLevel.hashCode());
            String nickname = getNickname();
            int iHashCode3 = (iHashCode2 * 59) + (nickname == null ? 43 : nickname.hashCode());
            String avatar = getAvatar();
            return (iHashCode3 * 59) + (avatar != null ? avatar.hashCode() : 43);
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public void setSex(Integer num) {
            this.sex = num;
        }

        public void setVipLevel(Integer num) {
            this.vipLevel = num;
        }

        public String toString() {
            return "RoomFansBean.UserDTO(nickname=" + getNickname() + ", avatar=" + getAvatar() + ", sex=" + getSex() + ", vipLevel=" + getVipLevel() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof RoomFansBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoomFansBean)) {
            return false;
        }
        RoomFansBean roomFansBean = (RoomFansBean) obj;
        if (!roomFansBean.canEqual(this)) {
            return false;
        }
        Integer uid = getUid();
        Integer uid2 = roomFansBean.getUid();
        if (uid != null ? !uid.equals(uid2) : uid2 != null) {
            return false;
        }
        Integer exp = getExp();
        Integer exp2 = roomFansBean.getExp();
        if (exp != null ? !exp.equals(exp2) : exp2 != null) {
            return false;
        }
        Integer level = getLevel();
        Integer level2 = roomFansBean.getLevel();
        if (level != null ? !level.equals(level2) : level2 != null) {
            return false;
        }
        Integer age = getAge();
        Integer age2 = roomFansBean.getAge();
        if (age != null ? !age.equals(age2) : age2 != null) {
            return false;
        }
        Integer isAdmin = getIsAdmin();
        Integer isAdmin2 = roomFansBean.getIsAdmin();
        if (isAdmin != null ? !isAdmin.equals(isAdmin2) : isAdmin2 != null) {
            return false;
        }
        UserDTO user = getUser();
        UserDTO user2 = roomFansBean.getUser();
        return user != null ? user.equals(user2) : user2 == null;
    }

    public Integer getAge() {
        return this.age;
    }

    public Integer getExp() {
        return this.exp;
    }

    public Integer getIsAdmin() {
        return this.isAdmin;
    }

    public Integer getLevel() {
        return this.level;
    }

    public Integer getUid() {
        return this.uid;
    }

    public UserDTO getUser() {
        return this.user;
    }

    public int hashCode() {
        Integer uid = getUid();
        int iHashCode = uid == null ? 43 : uid.hashCode();
        Integer exp = getExp();
        int iHashCode2 = ((iHashCode + 59) * 59) + (exp == null ? 43 : exp.hashCode());
        Integer level = getLevel();
        int iHashCode3 = (iHashCode2 * 59) + (level == null ? 43 : level.hashCode());
        Integer age = getAge();
        int iHashCode4 = (iHashCode3 * 59) + (age == null ? 43 : age.hashCode());
        Integer isAdmin = getIsAdmin();
        int iHashCode5 = (iHashCode4 * 59) + (isAdmin == null ? 43 : isAdmin.hashCode());
        UserDTO user = getUser();
        return (iHashCode5 * 59) + (user != null ? user.hashCode() : 43);
    }

    public void setAge(Integer num) {
        this.age = num;
    }

    public void setExp(Integer num) {
        this.exp = num;
    }

    public void setIsAdmin(Integer num) {
        this.isAdmin = num;
    }

    public void setLevel(Integer num) {
        this.level = num;
    }

    public void setUid(Integer num) {
        this.uid = num;
    }

    public void setUser(UserDTO userDTO) {
        this.user = userDTO;
    }

    public String toString() {
        return "RoomFansBean(uid=" + getUid() + ", exp=" + getExp() + ", level=" + getLevel() + ", user=" + getUser() + ", age=" + getAge() + ", isAdmin=" + getIsAdmin() + ")";
    }
}
