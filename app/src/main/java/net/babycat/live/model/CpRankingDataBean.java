package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CpRankingDataBean {

    @SerializedName("count_down")
    private String countDown;

    @SerializedName("list")
    private List<ListDTO> list;

    @SerializedName("self")
    private SelfDTO self;

    public static class ListDTO {

        @SerializedName("rank")
        private Integer rank;

        @SerializedName("to_user")
        private ToUserDTO toUser;

        @SerializedName("to_user_id")
        private Integer toUserId;

        @SerializedName("total")
        private Integer total;

        @SerializedName("uid")
        private Integer uid;

        @SerializedName("user")
        private UserDTO user;

        public static class ToUserDTO {

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
            private Integer f34814id;

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
                return obj instanceof ToUserDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ToUserDTO)) {
                    return false;
                }
                ToUserDTO toUserDTO = (ToUserDTO) obj;
                if (!toUserDTO.canEqual(this)) {
                    return false;
                }
                Integer id2 = getId();
                Integer id3 = toUserDTO.getId();
                if (id2 != null ? !id2.equals(id3) : id3 != null) {
                    return false;
                }
                Integer sex = getSex();
                Integer sex2 = toUserDTO.getSex();
                if (sex != null ? !sex.equals(sex2) : sex2 != null) {
                    return false;
                }
                Integer age = getAge();
                Integer age2 = toUserDTO.getAge();
                if (age != null ? !age.equals(age2) : age2 != null) {
                    return false;
                }
                Integer level = getLevel();
                Integer level2 = toUserDTO.getLevel();
                if (level != null ? !level.equals(level2) : level2 != null) {
                    return false;
                }
                Integer anchorLevel = getAnchorLevel();
                Integer anchorLevel2 = toUserDTO.getAnchorLevel();
                if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
                    return false;
                }
                Integer onlineRoomid = getOnlineRoomid();
                Integer onlineRoomid2 = toUserDTO.getOnlineRoomid();
                if (onlineRoomid != null ? !onlineRoomid.equals(onlineRoomid2) : onlineRoomid2 != null) {
                    return false;
                }
                Integer vipLevel = getVipLevel();
                Integer vipLevel2 = toUserDTO.getVipLevel();
                if (vipLevel != null ? !vipLevel.equals(vipLevel2) : vipLevel2 != null) {
                    return false;
                }
                String nickname = getNickname();
                String nickname2 = toUserDTO.getNickname();
                if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                    return false;
                }
                String avatar = getAvatar();
                String avatar2 = toUserDTO.getAvatar();
                if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
                    return false;
                }
                String jctx = getJctx();
                String jctx2 = toUserDTO.getJctx();
                if (jctx != null ? !jctx.equals(jctx2) : jctx2 != null) {
                    return false;
                }
                String badge1 = getBadge1();
                String badge12 = toUserDTO.getBadge1();
                if (badge1 != null ? !badge1.equals(badge12) : badge12 != null) {
                    return false;
                }
                String badge2 = getBadge2();
                String badge22 = toUserDTO.getBadge2();
                if (badge2 != null ? !badge2.equals(badge22) : badge22 != null) {
                    return false;
                }
                String badge3 = getBadge3();
                String badge32 = toUserDTO.getBadge3();
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
                return this.f34814id;
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
                this.f34814id = num;
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
                return "CpRankingDataBean.ListDTO.ToUserDTO(id=" + getId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", sex=" + getSex() + ", age=" + getAge() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ", onlineRoomid=" + getOnlineRoomid() + ", vipLevel=" + getVipLevel() + ", jctx=" + getJctx() + ", badge1=" + getBadge1() + ", badge2=" + getBadge2() + ", badge3=" + getBadge3() + ")";
            }
        }

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
            private Integer f34815id;

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
                return this.f34815id;
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
                this.f34815id = num;
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
                return "CpRankingDataBean.ListDTO.UserDTO(id=" + getId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", sex=" + getSex() + ", age=" + getAge() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ", onlineRoomid=" + getOnlineRoomid() + ", vipLevel=" + getVipLevel() + ", jctx=" + getJctx() + ", badge1=" + getBadge1() + ", badge2=" + getBadge2() + ", badge3=" + getBadge3() + ")";
            }
        }

        public boolean canEqual(Object obj) {
            return obj instanceof ListDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ListDTO)) {
                return false;
            }
            ListDTO listDTO = (ListDTO) obj;
            if (!listDTO.canEqual(this)) {
                return false;
            }
            Integer uid = getUid();
            Integer uid2 = listDTO.getUid();
            if (uid != null ? !uid.equals(uid2) : uid2 != null) {
                return false;
            }
            Integer toUserId = getToUserId();
            Integer toUserId2 = listDTO.getToUserId();
            if (toUserId != null ? !toUserId.equals(toUserId2) : toUserId2 != null) {
                return false;
            }
            Integer total = getTotal();
            Integer total2 = listDTO.getTotal();
            if (total != null ? !total.equals(total2) : total2 != null) {
                return false;
            }
            Integer rank = getRank();
            Integer rank2 = listDTO.getRank();
            if (rank != null ? !rank.equals(rank2) : rank2 != null) {
                return false;
            }
            UserDTO user = getUser();
            UserDTO user2 = listDTO.getUser();
            if (user != null ? !user.equals(user2) : user2 != null) {
                return false;
            }
            ToUserDTO toUser = getToUser();
            ToUserDTO toUser2 = listDTO.getToUser();
            return toUser != null ? toUser.equals(toUser2) : toUser2 == null;
        }

        public Integer getRank() {
            return this.rank;
        }

        public ToUserDTO getToUser() {
            return this.toUser;
        }

        public Integer getToUserId() {
            return this.toUserId;
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
            Integer toUserId = getToUserId();
            int iHashCode2 = ((iHashCode + 59) * 59) + (toUserId == null ? 43 : toUserId.hashCode());
            Integer total = getTotal();
            int iHashCode3 = (iHashCode2 * 59) + (total == null ? 43 : total.hashCode());
            Integer rank = getRank();
            int iHashCode4 = (iHashCode3 * 59) + (rank == null ? 43 : rank.hashCode());
            UserDTO user = getUser();
            int iHashCode5 = (iHashCode4 * 59) + (user == null ? 43 : user.hashCode());
            ToUserDTO toUser = getToUser();
            return (iHashCode5 * 59) + (toUser != null ? toUser.hashCode() : 43);
        }

        public void setRank(Integer num) {
            this.rank = num;
        }

        public void setToUser(ToUserDTO toUserDTO) {
            this.toUser = toUserDTO;
        }

        public void setToUserId(Integer num) {
            this.toUserId = num;
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
            return "CpRankingDataBean.ListDTO(uid=" + getUid() + ", toUserId=" + getToUserId() + ", total=" + getTotal() + ", rank=" + getRank() + ", user=" + getUser() + ", toUser=" + getToUser() + ")";
        }
    }

    public static class SelfDTO {

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

            @SerializedName("badge1")
            private String badge1;

            @SerializedName("badge2")
            private String badge2;

            @SerializedName("badge3")
            private String badge3;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @SerializedName("id")
            private Integer f34816id;

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
                return this.f34816id;
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
                this.f34816id = num;
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
                return "CpRankingDataBean.SelfDTO.UserDTO(id=" + getId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", sex=" + getSex() + ", age=" + getAge() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ", onlineRoomid=" + getOnlineRoomid() + ", vipLevel=" + getVipLevel() + ", jctx=" + getJctx() + ", badge1=" + getBadge1() + ", badge2=" + getBadge2() + ", badge3=" + getBadge3() + ")";
            }
        }

        public boolean canEqual(Object obj) {
            return obj instanceof SelfDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SelfDTO)) {
                return false;
            }
            SelfDTO selfDTO = (SelfDTO) obj;
            if (!selfDTO.canEqual(this)) {
                return false;
            }
            Integer uid = getUid();
            Integer uid2 = selfDTO.getUid();
            if (uid != null ? !uid.equals(uid2) : uid2 != null) {
                return false;
            }
            Integer total = getTotal();
            Integer total2 = selfDTO.getTotal();
            if (total != null ? !total.equals(total2) : total2 != null) {
                return false;
            }
            Integer rank = getRank();
            Integer rank2 = selfDTO.getRank();
            if (rank != null ? !rank.equals(rank2) : rank2 != null) {
                return false;
            }
            UserDTO user = getUser();
            UserDTO user2 = selfDTO.getUser();
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
            return "CpRankingDataBean.SelfDTO(uid=" + getUid() + ", total=" + getTotal() + ", rank=" + getRank() + ", user=" + getUser() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof CpRankingDataBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CpRankingDataBean)) {
            return false;
        }
        CpRankingDataBean cpRankingDataBean = (CpRankingDataBean) obj;
        if (!cpRankingDataBean.canEqual(this)) {
            return false;
        }
        List<ListDTO> list = getList();
        List<ListDTO> list2 = cpRankingDataBean.getList();
        if (list != null ? !list.equals(list2) : list2 != null) {
            return false;
        }
        SelfDTO self = getSelf();
        SelfDTO self2 = cpRankingDataBean.getSelf();
        if (self != null ? !self.equals(self2) : self2 != null) {
            return false;
        }
        String countDown = getCountDown();
        String countDown2 = cpRankingDataBean.getCountDown();
        return countDown != null ? countDown.equals(countDown2) : countDown2 == null;
    }

    public String getCountDown() {
        return this.countDown;
    }

    public List<ListDTO> getList() {
        return this.list;
    }

    public SelfDTO getSelf() {
        return this.self;
    }

    public int hashCode() {
        List<ListDTO> list = getList();
        int iHashCode = list == null ? 43 : list.hashCode();
        SelfDTO self = getSelf();
        int iHashCode2 = ((iHashCode + 59) * 59) + (self == null ? 43 : self.hashCode());
        String countDown = getCountDown();
        return (iHashCode2 * 59) + (countDown != null ? countDown.hashCode() : 43);
    }

    public void setCountDown(String str) {
        this.countDown = str;
    }

    public void setList(List<ListDTO> list) {
        this.list = list;
    }

    public void setSelf(SelfDTO selfDTO) {
        this.self = selfDTO;
    }

    public String toString() {
        return "CpRankingDataBean(list=" + getList() + ", self=" + getSelf() + ", countDown=" + getCountDown() + ")";
    }
}
