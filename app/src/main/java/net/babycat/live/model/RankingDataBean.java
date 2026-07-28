package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RankingDataBean {

    @SerializedName("count_down")
    private String countDown;

    @SerializedName("list")
    private List<RankingListBean> list;

    @SerializedName("self")
    private RankingListBean self;

    public static class RankingListBean {

        @SerializedName("rank")
        private Integer rank;

        @SerializedName("room_id")
        private Integer roomId;

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

            @SerializedName("badge1")
            private String badge1;

            @SerializedName("badge2")
            private String badge2;

            @SerializedName("badge3")
            private String badge3;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @SerializedName("id")
            private Integer f34877id;

            @SerializedName("jctx")
            private String jctx;

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
                String jctx = getJctx();
                String jctx2 = userDTO.getJctx();
                if (jctx != null ? !jctx.equals(jctx2) : jctx2 != null) {
                    return false;
                }
                String badge1 = getBadge1();
                String badge12 = userDTO.getBadge1();
                if (badge1 != null ? !badge1.equals(badge12) : badge12 != null) {
                    return false;
                }
                String badge2 = getBadge2();
                String badge22 = userDTO.getBadge2();
                if (badge2 != null ? !badge2.equals(badge22) : badge22 != null) {
                    return false;
                }
                String badge3 = getBadge3();
                String badge32 = userDTO.getBadge3();
                return badge3 != null ? badge3.equals(badge32) : badge32 == null;
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

            public String getBadge1() {
                return this.badge1;
            }

            public String getBadge2() {
                return this.badge2;
            }

            public String getBadge3() {
                return this.badge3;
            }

            public Integer getId() {
                return this.f34877id;
            }

            public String getJctx() {
                return this.jctx;
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
                String nickname = getNickname();
                int iHashCode8 = (iHashCode7 * 59) + (nickname == null ? 43 : nickname.hashCode());
                String avatar = getAvatar();
                int iHashCode9 = (iHashCode8 * 59) + (avatar == null ? 43 : avatar.hashCode());
                String jctx = getJctx();
                int iHashCode10 = (iHashCode9 * 59) + (jctx == null ? 43 : jctx.hashCode());
                String badge1 = getBadge1();
                int iHashCode11 = (iHashCode10 * 59) + (badge1 == null ? 43 : badge1.hashCode());
                String badge2 = getBadge2();
                int iHashCode12 = (iHashCode11 * 59) + (badge2 == null ? 43 : badge2.hashCode());
                String badge3 = getBadge3();
                return (iHashCode12 * 59) + (badge3 != null ? badge3.hashCode() : 43);
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

            public void setBadge1(String str) {
                this.badge1 = str;
            }

            public void setBadge2(String str) {
                this.badge2 = str;
            }

            public void setBadge3(String str) {
                this.badge3 = str;
            }

            public void setId(Integer num) {
                this.f34877id = num;
            }

            public void setJctx(String str) {
                this.jctx = str;
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

            public String toString() {
                return "RankingDataBean.RankingListBean.UserDTO(id=" + getId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", sex=" + getSex() + ", age=" + getAge() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ", onlineRoomid=" + getOnlineRoomid() + ", vipLevel=" + getVipLevel() + ", jctx=" + getJctx() + ", badge1=" + getBadge1() + ", badge2=" + getBadge2() + ", badge3=" + getBadge3() + ")";
            }
        }

        public boolean canEqual(Object obj) {
            return obj instanceof RankingListBean;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RankingListBean)) {
                return false;
            }
            RankingListBean rankingListBean = (RankingListBean) obj;
            if (!rankingListBean.canEqual(this)) {
                return false;
            }
            Integer uid = getUid();
            Integer uid2 = rankingListBean.getUid();
            if (uid != null ? !uid.equals(uid2) : uid2 != null) {
                return false;
            }
            Integer total = getTotal();
            Integer total2 = rankingListBean.getTotal();
            if (total != null ? !total.equals(total2) : total2 != null) {
                return false;
            }
            Integer rank = getRank();
            Integer rank2 = rankingListBean.getRank();
            if (rank != null ? !rank.equals(rank2) : rank2 != null) {
                return false;
            }
            Integer roomId = getRoomId();
            Integer roomId2 = rankingListBean.getRoomId();
            if (roomId != null ? !roomId.equals(roomId2) : roomId2 != null) {
                return false;
            }
            UserDTO user = getUser();
            UserDTO user2 = rankingListBean.getUser();
            return user != null ? user.equals(user2) : user2 == null;
        }

        public Integer getRank() {
            return this.rank;
        }

        public Integer getRoomId() {
            return this.roomId;
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
            Integer roomId = getRoomId();
            int iHashCode4 = (iHashCode3 * 59) + (roomId == null ? 43 : roomId.hashCode());
            UserDTO user = getUser();
            return (iHashCode4 * 59) + (user != null ? user.hashCode() : 43);
        }

        public void setRank(Integer num) {
            this.rank = num;
        }

        public void setRoomId(Integer num) {
            this.roomId = num;
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
            return "RankingDataBean.RankingListBean(uid=" + getUid() + ", total=" + getTotal() + ", rank=" + getRank() + ", roomId=" + getRoomId() + ", user=" + getUser() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof RankingDataBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RankingDataBean)) {
            return false;
        }
        RankingDataBean rankingDataBean = (RankingDataBean) obj;
        if (!rankingDataBean.canEqual(this)) {
            return false;
        }
        List<RankingListBean> list = getList();
        List<RankingListBean> list2 = rankingDataBean.getList();
        if (list != null ? !list.equals(list2) : list2 != null) {
            return false;
        }
        RankingListBean self = getSelf();
        RankingListBean self2 = rankingDataBean.getSelf();
        if (self != null ? !self.equals(self2) : self2 != null) {
            return false;
        }
        String countDown = getCountDown();
        String countDown2 = rankingDataBean.getCountDown();
        return countDown != null ? countDown.equals(countDown2) : countDown2 == null;
    }

    public String getCountDown() {
        return this.countDown;
    }

    public List<RankingListBean> getList() {
        return this.list;
    }

    public RankingListBean getSelf() {
        return this.self;
    }

    public int hashCode() {
        List<RankingListBean> list = getList();
        int iHashCode = list == null ? 43 : list.hashCode();
        RankingListBean self = getSelf();
        int iHashCode2 = ((iHashCode + 59) * 59) + (self == null ? 43 : self.hashCode());
        String countDown = getCountDown();
        return (iHashCode2 * 59) + (countDown != null ? countDown.hashCode() : 43);
    }

    public void setCountDown(String str) {
        this.countDown = str;
    }

    public void setList(List<RankingListBean> list) {
        this.list = list;
    }

    public void setSelf(RankingListBean rankingListBean) {
        this.self = rankingListBean;
    }

    public String toString() {
        return "RankingDataBean(list=" + getList() + ", self=" + getSelf() + ", countDown=" + getCountDown() + ")";
    }
}
