package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class FamilyUserBean {

    @SerializedName("familyid")
    private Integer familyid;

    @SerializedName("is_admin")
    private Integer isAdmin;

    @SerializedName("uid")
    private Integer uid;

    @SerializedName("user")
    private UserDTO user;

    public static class UserDTO {

        @SerializedName("age")
        private Integer age;

        @SerializedName("anchor_level")
        private Integer anchorLevel;

        @SerializedName("avatar")
        private String avatar;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34828id;

        @SerializedName("level")
        private Integer level;

        @SerializedName("nickname")
        private String nickname;

        @SerializedName("sex")
        private Integer sex;

        @SerializedName("vip")
        private Integer vip;

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
            Integer sex = getSex();
            Integer sex2 = userDTO.getSex();
            if (sex != null ? !sex.equals(sex2) : sex2 != null) {
                return false;
            }
            Integer age = getAge();
            Integer age2 = userDTO.getAge();
            if (age != null ? !age.equals(age2) : age2 != null) {
                return false;
            }
            Integer vip = getVip();
            Integer vip2 = userDTO.getVip();
            if (vip != null ? !vip.equals(vip2) : vip2 != null) {
                return false;
            }
            Integer level = getLevel();
            Integer level2 = userDTO.getLevel();
            if (level != null ? !level.equals(level2) : level2 != null) {
                return false;
            }
            Integer anchorLevel = getAnchorLevel();
            Integer anchorLevel2 = userDTO.getAnchorLevel();
            if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
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

        public Integer getAge() {
            return this.age;
        }

        public Integer getAnchorLevel() {
            return this.anchorLevel;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public Integer getId() {
            return this.f34828id;
        }

        public Integer getLevel() {
            return this.level;
        }

        public String getNickname() {
            return this.nickname;
        }

        public Integer getSex() {
            return this.sex;
        }

        public Integer getVip() {
            return this.vip;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer sex = getSex();
            int iHashCode2 = ((iHashCode + 59) * 59) + (sex == null ? 43 : sex.hashCode());
            Integer age = getAge();
            int iHashCode3 = (iHashCode2 * 59) + (age == null ? 43 : age.hashCode());
            Integer vip = getVip();
            int iHashCode4 = (iHashCode3 * 59) + (vip == null ? 43 : vip.hashCode());
            Integer level = getLevel();
            int iHashCode5 = (iHashCode4 * 59) + (level == null ? 43 : level.hashCode());
            Integer anchorLevel = getAnchorLevel();
            int iHashCode6 = (iHashCode5 * 59) + (anchorLevel == null ? 43 : anchorLevel.hashCode());
            String nickname = getNickname();
            int iHashCode7 = (iHashCode6 * 59) + (nickname == null ? 43 : nickname.hashCode());
            String avatar = getAvatar();
            return (iHashCode7 * 59) + (avatar != null ? avatar.hashCode() : 43);
        }

        public void setAge(Integer num) {
            this.age = num;
        }

        public void setAnchorLevel(Integer num) {
            this.anchorLevel = num;
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setId(Integer num) {
            this.f34828id = num;
        }

        public void setLevel(Integer num) {
            this.level = num;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public void setSex(Integer num) {
            this.sex = num;
        }

        public void setVip(Integer num) {
            this.vip = num;
        }

        public String toString() {
            return "FamilyUserBean.UserDTO(id=" + getId() + ", nickname=" + getNickname() + ", sex=" + getSex() + ", avatar=" + getAvatar() + ", age=" + getAge() + ", vip=" + getVip() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof FamilyUserBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FamilyUserBean)) {
            return false;
        }
        FamilyUserBean familyUserBean = (FamilyUserBean) obj;
        if (!familyUserBean.canEqual(this)) {
            return false;
        }
        Integer uid = getUid();
        Integer uid2 = familyUserBean.getUid();
        if (uid != null ? !uid.equals(uid2) : uid2 != null) {
            return false;
        }
        Integer familyid = getFamilyid();
        Integer familyid2 = familyUserBean.getFamilyid();
        if (familyid != null ? !familyid.equals(familyid2) : familyid2 != null) {
            return false;
        }
        Integer isAdmin = getIsAdmin();
        Integer isAdmin2 = familyUserBean.getIsAdmin();
        if (isAdmin != null ? !isAdmin.equals(isAdmin2) : isAdmin2 != null) {
            return false;
        }
        UserDTO user = getUser();
        UserDTO user2 = familyUserBean.getUser();
        return user != null ? user.equals(user2) : user2 == null;
    }

    public Integer getFamilyid() {
        return this.familyid;
    }

    public Integer getIsAdmin() {
        return this.isAdmin;
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
        Integer familyid = getFamilyid();
        int iHashCode2 = ((iHashCode + 59) * 59) + (familyid == null ? 43 : familyid.hashCode());
        Integer isAdmin = getIsAdmin();
        int iHashCode3 = (iHashCode2 * 59) + (isAdmin == null ? 43 : isAdmin.hashCode());
        UserDTO user = getUser();
        return (iHashCode3 * 59) + (user != null ? user.hashCode() : 43);
    }

    public void setFamilyid(Integer num) {
        this.familyid = num;
    }

    public void setIsAdmin(Integer num) {
        this.isAdmin = num;
    }

    public void setUid(Integer num) {
        this.uid = num;
    }

    public void setUser(UserDTO userDTO) {
        this.user = userDTO;
    }

    public String toString() {
        return "FamilyUserBean(uid=" + getUid() + ", familyid=" + getFamilyid() + ", isAdmin=" + getIsAdmin() + ", user=" + getUser() + ")";
    }
}
