package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class ChargeWeekRankBean {

    @SerializedName("rank")
    private Integer rank;

    @SerializedName("total")
    private Integer total;

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

        @SerializedName("avatar_frame")
        private String avatarFrame;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34809id;

        @SerializedName("level")
        private Integer level;

        @SerializedName("nickname")
        private String nickname;

        @SerializedName("online_roomid")
        private Integer onlineRoomid;

        @SerializedName("sex")
        private Integer sex;

        @SerializedName("vip_level")
        private Integer vipLevel;

        @SerializedName("wealth_level")
        private Integer wealthLevel;

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
            Integer onlineRoomid = getOnlineRoomid();
            Integer onlineRoomid2 = userDTO.getOnlineRoomid();
            if (onlineRoomid != null ? !onlineRoomid.equals(onlineRoomid2) : onlineRoomid2 != null) {
                return false;
            }
            Integer vipLevel = getVipLevel();
            Integer vipLevel2 = userDTO.getVipLevel();
            if (vipLevel != null ? !vipLevel.equals(vipLevel2) : vipLevel2 != null) {
                return false;
            }
            Integer wealthLevel = getWealthLevel();
            Integer wealthLevel2 = userDTO.getWealthLevel();
            if (wealthLevel != null ? !wealthLevel.equals(wealthLevel2) : wealthLevel2 != null) {
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
            String avatarFrame = getAvatarFrame();
            String avatarFrame2 = userDTO.getAvatarFrame();
            return avatarFrame != null ? avatarFrame.equals(avatarFrame2) : avatarFrame2 == null;
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

        public String getAvatarFrame() {
            return this.avatarFrame;
        }

        public Integer getId() {
            return this.f34809id;
        }

        public Integer getLevel() {
            return this.level;
        }

        public String getNickname() {
            return this.nickname;
        }

        public Integer getOnlineRoomid() {
            return this.onlineRoomid;
        }

        public Integer getSex() {
            return this.sex;
        }

        public Integer getVipLevel() {
            return this.vipLevel;
        }

        public Integer getWealthLevel() {
            return this.wealthLevel;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer sex = getSex();
            int iHashCode2 = ((iHashCode + 59) * 59) + (sex == null ? 43 : sex.hashCode());
            Integer age = getAge();
            int iHashCode3 = (iHashCode2 * 59) + (age == null ? 43 : age.hashCode());
            Integer level = getLevel();
            int iHashCode4 = (iHashCode3 * 59) + (level == null ? 43 : level.hashCode());
            Integer anchorLevel = getAnchorLevel();
            int iHashCode5 = (iHashCode4 * 59) + (anchorLevel == null ? 43 : anchorLevel.hashCode());
            Integer onlineRoomid = getOnlineRoomid();
            int iHashCode6 = (iHashCode5 * 59) + (onlineRoomid == null ? 43 : onlineRoomid.hashCode());
            Integer vipLevel = getVipLevel();
            int iHashCode7 = (iHashCode6 * 59) + (vipLevel == null ? 43 : vipLevel.hashCode());
            Integer wealthLevel = getWealthLevel();
            int iHashCode8 = (iHashCode7 * 59) + (wealthLevel == null ? 43 : wealthLevel.hashCode());
            String nickname = getNickname();
            int iHashCode9 = (iHashCode8 * 59) + (nickname == null ? 43 : nickname.hashCode());
            String avatar = getAvatar();
            int iHashCode10 = (iHashCode9 * 59) + (avatar == null ? 43 : avatar.hashCode());
            String avatarFrame = getAvatarFrame();
            return (iHashCode10 * 59) + (avatarFrame != null ? avatarFrame.hashCode() : 43);
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

        public void setAvatarFrame(String str) {
            this.avatarFrame = str;
        }

        public void setId(Integer num) {
            this.f34809id = num;
        }

        public void setLevel(Integer num) {
            this.level = num;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public void setOnlineRoomid(Integer num) {
            this.onlineRoomid = num;
        }

        public void setSex(Integer num) {
            this.sex = num;
        }

        public void setVipLevel(Integer num) {
            this.vipLevel = num;
        }

        public void setWealthLevel(Integer num) {
            this.wealthLevel = num;
        }

        public String toString() {
            return "ChargeWeekRankBean.UserDTO(id=" + getId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", sex=" + getSex() + ", age=" + getAge() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ", onlineRoomid=" + getOnlineRoomid() + ", vipLevel=" + getVipLevel() + ", wealthLevel=" + getWealthLevel() + ", avatarFrame=" + getAvatarFrame() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof ChargeWeekRankBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChargeWeekRankBean)) {
            return false;
        }
        ChargeWeekRankBean chargeWeekRankBean = (ChargeWeekRankBean) obj;
        if (!chargeWeekRankBean.canEqual(this)) {
            return false;
        }
        Integer uid = getUid();
        Integer uid2 = chargeWeekRankBean.getUid();
        if (uid != null ? !uid.equals(uid2) : uid2 != null) {
            return false;
        }
        Integer total = getTotal();
        Integer total2 = chargeWeekRankBean.getTotal();
        if (total != null ? !total.equals(total2) : total2 != null) {
            return false;
        }
        Integer rank = getRank();
        Integer rank2 = chargeWeekRankBean.getRank();
        if (rank != null ? !rank.equals(rank2) : rank2 != null) {
            return false;
        }
        UserDTO user = getUser();
        UserDTO user2 = chargeWeekRankBean.getUser();
        return user != null ? user.equals(user2) : user2 == null;
    }

    public Integer getRank() {
        return this.rank;
    }

    public Integer getTotal() {
        return this.total;
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
        Integer total = getTotal();
        int iHashCode2 = ((iHashCode + 59) * 59) + (total == null ? 43 : total.hashCode());
        Integer rank = getRank();
        int iHashCode3 = (iHashCode2 * 59) + (rank == null ? 43 : rank.hashCode());
        UserDTO user = getUser();
        return (iHashCode3 * 59) + (user != null ? user.hashCode() : 43);
    }

    public void setRank(Integer num) {
        this.rank = num;
    }

    public void setTotal(Integer num) {
        this.total = num;
    }

    public void setUid(Integer num) {
        this.uid = num;
    }

    public void setUser(UserDTO userDTO) {
        this.user = userDTO;
    }

    public String toString() {
        return "ChargeWeekRankBean(uid=" + getUid() + ", total=" + getTotal() + ", rank=" + getRank() + ", user=" + getUser() + ")";
    }
}
