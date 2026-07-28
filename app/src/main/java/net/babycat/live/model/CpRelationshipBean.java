package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class CpRelationshipBean {

    @SerializedName("to_user_info")
    private CpUserInfoDTO cpUserInfoDTO;

    @SerializedName("level")
    private Integer level;

    @SerializedName("type")
    private Integer type;

    public class CpUserInfoDTO {

        @SerializedName("age")
        private Integer age;

        @SerializedName("anchor_level")
        private Integer anchorLevel;

        @SerializedName("avatar")
        private String avatar;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34817id;

        @SerializedName("level")
        private Integer level;

        @SerializedName("nickname")
        private String nickname;

        @SerializedName("sex")
        private Integer sex;

        @SerializedName("vip_level")
        private Integer vip;

        public CpUserInfoDTO() {
        }

        public boolean canEqual(Object obj) {
            return obj instanceof CpUserInfoDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CpUserInfoDTO)) {
                return false;
            }
            CpUserInfoDTO cpUserInfoDTO = (CpUserInfoDTO) obj;
            if (!cpUserInfoDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = cpUserInfoDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            Integer level = getLevel();
            Integer level2 = cpUserInfoDTO.getLevel();
            if (level != null ? !level.equals(level2) : level2 != null) {
                return false;
            }
            Integer anchorLevel = getAnchorLevel();
            Integer anchorLevel2 = cpUserInfoDTO.getAnchorLevel();
            if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
                return false;
            }
            Integer sex = getSex();
            Integer sex2 = cpUserInfoDTO.getSex();
            if (sex != null ? !sex.equals(sex2) : sex2 != null) {
                return false;
            }
            Integer age = getAge();
            Integer age2 = cpUserInfoDTO.getAge();
            if (age != null ? !age.equals(age2) : age2 != null) {
                return false;
            }
            Integer vip = getVip();
            Integer vip2 = cpUserInfoDTO.getVip();
            if (vip != null ? !vip.equals(vip2) : vip2 != null) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = cpUserInfoDTO.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = cpUserInfoDTO.getAvatar();
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
            return this.f34817id;
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
            Integer level = getLevel();
            int iHashCode2 = ((iHashCode + 59) * 59) + (level == null ? 43 : level.hashCode());
            Integer anchorLevel = getAnchorLevel();
            int iHashCode3 = (iHashCode2 * 59) + (anchorLevel == null ? 43 : anchorLevel.hashCode());
            Integer sex = getSex();
            int iHashCode4 = (iHashCode3 * 59) + (sex == null ? 43 : sex.hashCode());
            Integer age = getAge();
            int iHashCode5 = (iHashCode4 * 59) + (age == null ? 43 : age.hashCode());
            Integer vip = getVip();
            int iHashCode6 = (iHashCode5 * 59) + (vip == null ? 43 : vip.hashCode());
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
            this.f34817id = num;
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
            return "CpRelationshipBean.CpUserInfoDTO(id=" + getId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ", sex=" + getSex() + ", age=" + getAge() + ", vip=" + getVip() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof CpRelationshipBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CpRelationshipBean)) {
            return false;
        }
        CpRelationshipBean cpRelationshipBean = (CpRelationshipBean) obj;
        if (!cpRelationshipBean.canEqual(this)) {
            return false;
        }
        Integer type = getType();
        Integer type2 = cpRelationshipBean.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        Integer level = getLevel();
        Integer level2 = cpRelationshipBean.getLevel();
        if (level != null ? !level.equals(level2) : level2 != null) {
            return false;
        }
        CpUserInfoDTO cpUserInfoDTO = getCpUserInfoDTO();
        CpUserInfoDTO cpUserInfoDTO2 = cpRelationshipBean.getCpUserInfoDTO();
        return cpUserInfoDTO != null ? cpUserInfoDTO.equals(cpUserInfoDTO2) : cpUserInfoDTO2 == null;
    }

    public CpUserInfoDTO getCpUserInfoDTO() {
        return this.cpUserInfoDTO;
    }

    public Integer getLevel() {
        return this.level;
    }

    public Integer getType() {
        return this.type;
    }

    public int hashCode() {
        Integer type = getType();
        int iHashCode = type == null ? 43 : type.hashCode();
        Integer level = getLevel();
        int iHashCode2 = ((iHashCode + 59) * 59) + (level == null ? 43 : level.hashCode());
        CpUserInfoDTO cpUserInfoDTO = getCpUserInfoDTO();
        return (iHashCode2 * 59) + (cpUserInfoDTO != null ? cpUserInfoDTO.hashCode() : 43);
    }

    public void setCpUserInfoDTO(CpUserInfoDTO cpUserInfoDTO) {
        this.cpUserInfoDTO = cpUserInfoDTO;
    }

    public void setLevel(Integer num) {
        this.level = num;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public String toString() {
        return "CpRelationshipBean(type=" + getType() + ", level=" + getLevel() + ", cpUserInfoDTO=" + getCpUserInfoDTO() + ")";
    }
}
