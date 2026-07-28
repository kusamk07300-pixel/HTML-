package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import x.w;

/* JADX INFO: loaded from: classes4.dex */
public class LikesFromBean {

    @SerializedName("create_time")
    private String createTime;

    @SerializedName(w.h.S_FROM)
    private FromDTO from;

    @SerializedName("from_uid")
    private Integer fromUid;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34858id;

    @SerializedName("uid")
    private Integer uid;

    @SerializedName("update_time")
    private String updateTime;

    public static class FromDTO {

        @SerializedName("age")
        private Integer age;

        @SerializedName("anchor_level")
        private Integer anchorLevel;

        @SerializedName("avatar")
        private String avatar;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34859id;

        @SerializedName("level")
        private Integer level;

        @SerializedName("nickname")
        private String nickname;

        @SerializedName("sex")
        private Integer sex;

        @SerializedName("vip_level")
        private Integer vipLevel;

        public boolean canEqual(Object obj) {
            return obj instanceof FromDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FromDTO)) {
                return false;
            }
            FromDTO fromDTO = (FromDTO) obj;
            if (!fromDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = fromDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            Integer sex = getSex();
            Integer sex2 = fromDTO.getSex();
            if (sex != null ? !sex.equals(sex2) : sex2 != null) {
                return false;
            }
            Integer level = getLevel();
            Integer level2 = fromDTO.getLevel();
            if (level != null ? !level.equals(level2) : level2 != null) {
                return false;
            }
            Integer anchorLevel = getAnchorLevel();
            Integer anchorLevel2 = fromDTO.getAnchorLevel();
            if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
                return false;
            }
            Integer age = getAge();
            Integer age2 = fromDTO.getAge();
            if (age != null ? !age.equals(age2) : age2 != null) {
                return false;
            }
            Integer vipLevel = getVipLevel();
            Integer vipLevel2 = fromDTO.getVipLevel();
            if (vipLevel != null ? !vipLevel.equals(vipLevel2) : vipLevel2 != null) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = fromDTO.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = fromDTO.getAvatar();
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
            return this.f34859id;
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

        public Integer getVipLevel() {
            return this.vipLevel;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer sex = getSex();
            int iHashCode2 = ((iHashCode + 59) * 59) + (sex == null ? 43 : sex.hashCode());
            Integer level = getLevel();
            int iHashCode3 = (iHashCode2 * 59) + (level == null ? 43 : level.hashCode());
            Integer anchorLevel = getAnchorLevel();
            int iHashCode4 = (iHashCode3 * 59) + (anchorLevel == null ? 43 : anchorLevel.hashCode());
            Integer age = getAge();
            int iHashCode5 = (iHashCode4 * 59) + (age == null ? 43 : age.hashCode());
            Integer vipLevel = getVipLevel();
            int iHashCode6 = (iHashCode5 * 59) + (vipLevel == null ? 43 : vipLevel.hashCode());
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
            this.f34859id = num;
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

        public void setVipLevel(Integer num) {
            this.vipLevel = num;
        }

        public String toString() {
            return "LikesFromBean.FromDTO(id=" + getId() + ", nickname=" + getNickname() + ", sex=" + getSex() + ", avatar=" + getAvatar() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ", age=" + getAge() + ", vipLevel=" + getVipLevel() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof LikesFromBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LikesFromBean)) {
            return false;
        }
        LikesFromBean likesFromBean = (LikesFromBean) obj;
        if (!likesFromBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = likesFromBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer uid = getUid();
        Integer uid2 = likesFromBean.getUid();
        if (uid != null ? !uid.equals(uid2) : uid2 != null) {
            return false;
        }
        Integer fromUid = getFromUid();
        Integer fromUid2 = likesFromBean.getFromUid();
        if (fromUid != null ? !fromUid.equals(fromUid2) : fromUid2 != null) {
            return false;
        }
        String createTime = getCreateTime();
        String createTime2 = likesFromBean.getCreateTime();
        if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
            return false;
        }
        String updateTime = getUpdateTime();
        String updateTime2 = likesFromBean.getUpdateTime();
        if (updateTime != null ? !updateTime.equals(updateTime2) : updateTime2 != null) {
            return false;
        }
        FromDTO from = getFrom();
        FromDTO from2 = likesFromBean.getFrom();
        return from != null ? from.equals(from2) : from2 == null;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public FromDTO getFrom() {
        return this.from;
    }

    public Integer getFromUid() {
        return this.fromUid;
    }

    public Integer getId() {
        return this.f34858id;
    }

    public Integer getUid() {
        return this.uid;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        Integer uid = getUid();
        int iHashCode2 = ((iHashCode + 59) * 59) + (uid == null ? 43 : uid.hashCode());
        Integer fromUid = getFromUid();
        int iHashCode3 = (iHashCode2 * 59) + (fromUid == null ? 43 : fromUid.hashCode());
        String createTime = getCreateTime();
        int iHashCode4 = (iHashCode3 * 59) + (createTime == null ? 43 : createTime.hashCode());
        String updateTime = getUpdateTime();
        int iHashCode5 = (iHashCode4 * 59) + (updateTime == null ? 43 : updateTime.hashCode());
        FromDTO from = getFrom();
        return (iHashCode5 * 59) + (from != null ? from.hashCode() : 43);
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setFrom(FromDTO fromDTO) {
        this.from = fromDTO;
    }

    public void setFromUid(Integer num) {
        this.fromUid = num;
    }

    public void setId(Integer num) {
        this.f34858id = num;
    }

    public void setUid(Integer num) {
        this.uid = num;
    }

    public void setUpdateTime(String str) {
        this.updateTime = str;
    }

    public String toString() {
        return "LikesFromBean(id=" + getId() + ", uid=" + getUid() + ", fromUid=" + getFromUid() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ", from=" + getFrom() + ")";
    }
}
