package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RoomDaliyTaskBean {

    @SerializedName("code")
    private Integer code;

    @SerializedName("data")
    private DataDTO data;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private Integer time;

    public static class DataDTO {

        @SerializedName("activity_list")
        private List<ActivityListDTO> activityList;

        @SerializedName("countdown_time")
        private Long countdownTime;

        @SerializedName("date_search")
        private List<String> dateSearch;

        @SerializedName("my_info")
        private MyInfoDTO myInfo;

        @SerializedName("rank_top10")
        private List<RankTop10DTO> rankTop10;

        @SerializedName("roomInfo")
        private RoomInfoDTO roomInfo;

        @SerializedName("rule_link")
        private String ruleLink;

        public static class ActivityListDTO {

            @SerializedName("current_coins_str")
            private String currentCoinsStr;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @SerializedName("id")
            private String f34885id;

            @SerializedName("owner_rewards")
            private String ownerRewards;

            @SerializedName("press_rate")
            private Integer pressRate;

            @SerializedName("target_coins")
            private String targetCoins;

            @SerializedName("target_coins_str")
            private String targetCoinsStr;

            @SerializedName("top_rewards1")
            private String topRewards1;

            @SerializedName("top_rewards2")
            private String topRewards2;

            @SerializedName("top_rewards3")
            private String topRewards3;

            @SerializedName("top_rewards4")
            private String topRewards4;

            @SerializedName("total_rewards_coins")
            private String totalRewardsCoins;

            public boolean canEqual(Object obj) {
                return obj instanceof ActivityListDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ActivityListDTO)) {
                    return false;
                }
                ActivityListDTO activityListDTO = (ActivityListDTO) obj;
                if (!activityListDTO.canEqual(this)) {
                    return false;
                }
                Integer pressRate = getPressRate();
                Integer pressRate2 = activityListDTO.getPressRate();
                if (pressRate != null ? !pressRate.equals(pressRate2) : pressRate2 != null) {
                    return false;
                }
                String id2 = getId();
                String id3 = activityListDTO.getId();
                if (id2 != null ? !id2.equals(id3) : id3 != null) {
                    return false;
                }
                String targetCoins = getTargetCoins();
                String targetCoins2 = activityListDTO.getTargetCoins();
                if (targetCoins != null ? !targetCoins.equals(targetCoins2) : targetCoins2 != null) {
                    return false;
                }
                String ownerRewards = getOwnerRewards();
                String ownerRewards2 = activityListDTO.getOwnerRewards();
                if (ownerRewards != null ? !ownerRewards.equals(ownerRewards2) : ownerRewards2 != null) {
                    return false;
                }
                String topRewards1 = getTopRewards1();
                String topRewards12 = activityListDTO.getTopRewards1();
                if (topRewards1 != null ? !topRewards1.equals(topRewards12) : topRewards12 != null) {
                    return false;
                }
                String topRewards2 = getTopRewards2();
                String topRewards22 = activityListDTO.getTopRewards2();
                if (topRewards2 != null ? !topRewards2.equals(topRewards22) : topRewards22 != null) {
                    return false;
                }
                String topRewards3 = getTopRewards3();
                String topRewards32 = activityListDTO.getTopRewards3();
                if (topRewards3 != null ? !topRewards3.equals(topRewards32) : topRewards32 != null) {
                    return false;
                }
                String topRewards4 = getTopRewards4();
                String topRewards42 = activityListDTO.getTopRewards4();
                if (topRewards4 != null ? !topRewards4.equals(topRewards42) : topRewards42 != null) {
                    return false;
                }
                String currentCoinsStr = getCurrentCoinsStr();
                String currentCoinsStr2 = activityListDTO.getCurrentCoinsStr();
                if (currentCoinsStr != null ? !currentCoinsStr.equals(currentCoinsStr2) : currentCoinsStr2 != null) {
                    return false;
                }
                String targetCoinsStr = getTargetCoinsStr();
                String targetCoinsStr2 = activityListDTO.getTargetCoinsStr();
                if (targetCoinsStr != null ? !targetCoinsStr.equals(targetCoinsStr2) : targetCoinsStr2 != null) {
                    return false;
                }
                String totalRewardsCoins = getTotalRewardsCoins();
                String totalRewardsCoins2 = activityListDTO.getTotalRewardsCoins();
                return totalRewardsCoins != null ? totalRewardsCoins.equals(totalRewardsCoins2) : totalRewardsCoins2 == null;
            }

            public String getCurrentCoinsStr() {
                return this.currentCoinsStr;
            }

            public String getId() {
                return this.f34885id;
            }

            public String getOwnerRewards() {
                return this.ownerRewards;
            }

            public Integer getPressRate() {
                return this.pressRate;
            }

            public String getTargetCoins() {
                return this.targetCoins;
            }

            public String getTargetCoinsStr() {
                return this.targetCoinsStr;
            }

            public String getTopRewards1() {
                return this.topRewards1;
            }

            public String getTopRewards2() {
                return this.topRewards2;
            }

            public String getTopRewards3() {
                return this.topRewards3;
            }

            public String getTopRewards4() {
                return this.topRewards4;
            }

            public String getTotalRewardsCoins() {
                return this.totalRewardsCoins;
            }

            public int hashCode() {
                Integer pressRate = getPressRate();
                int iHashCode = pressRate == null ? 43 : pressRate.hashCode();
                String id2 = getId();
                int iHashCode2 = ((iHashCode + 59) * 59) + (id2 == null ? 43 : id2.hashCode());
                String targetCoins = getTargetCoins();
                int iHashCode3 = (iHashCode2 * 59) + (targetCoins == null ? 43 : targetCoins.hashCode());
                String ownerRewards = getOwnerRewards();
                int iHashCode4 = (iHashCode3 * 59) + (ownerRewards == null ? 43 : ownerRewards.hashCode());
                String topRewards1 = getTopRewards1();
                int iHashCode5 = (iHashCode4 * 59) + (topRewards1 == null ? 43 : topRewards1.hashCode());
                String topRewards2 = getTopRewards2();
                int iHashCode6 = (iHashCode5 * 59) + (topRewards2 == null ? 43 : topRewards2.hashCode());
                String topRewards3 = getTopRewards3();
                int iHashCode7 = (iHashCode6 * 59) + (topRewards3 == null ? 43 : topRewards3.hashCode());
                String topRewards4 = getTopRewards4();
                int iHashCode8 = (iHashCode7 * 59) + (topRewards4 == null ? 43 : topRewards4.hashCode());
                String currentCoinsStr = getCurrentCoinsStr();
                int iHashCode9 = (iHashCode8 * 59) + (currentCoinsStr == null ? 43 : currentCoinsStr.hashCode());
                String targetCoinsStr = getTargetCoinsStr();
                int iHashCode10 = (iHashCode9 * 59) + (targetCoinsStr == null ? 43 : targetCoinsStr.hashCode());
                String totalRewardsCoins = getTotalRewardsCoins();
                return (iHashCode10 * 59) + (totalRewardsCoins != null ? totalRewardsCoins.hashCode() : 43);
            }

            public void setCurrentCoinsStr(String str) {
                this.currentCoinsStr = str;
            }

            public void setId(String str) {
                this.f34885id = str;
            }

            public void setOwnerRewards(String str) {
                this.ownerRewards = str;
            }

            public void setPressRate(Integer num) {
                this.pressRate = num;
            }

            public void setTargetCoins(String str) {
                this.targetCoins = str;
            }

            public void setTargetCoinsStr(String str) {
                this.targetCoinsStr = str;
            }

            public void setTopRewards1(String str) {
                this.topRewards1 = str;
            }

            public void setTopRewards2(String str) {
                this.topRewards2 = str;
            }

            public void setTopRewards3(String str) {
                this.topRewards3 = str;
            }

            public void setTopRewards4(String str) {
                this.topRewards4 = str;
            }

            public void setTotalRewardsCoins(String str) {
                this.totalRewardsCoins = str;
            }

            public String toString() {
                return "RoomDaliyTaskBean.DataDTO.ActivityListDTO(id=" + getId() + ", targetCoins=" + getTargetCoins() + ", ownerRewards=" + getOwnerRewards() + ", topRewards1=" + getTopRewards1() + ", topRewards2=" + getTopRewards2() + ", topRewards3=" + getTopRewards3() + ", topRewards4=" + getTopRewards4() + ", pressRate=" + getPressRate() + ", currentCoinsStr=" + getCurrentCoinsStr() + ", targetCoinsStr=" + getTargetCoinsStr() + ", totalRewardsCoins=" + getTotalRewardsCoins() + ")";
            }
        }

        public static class MyInfoDTO {

            @SerializedName("avatar")
            private String avatar;

            @SerializedName("min_limit")
            private String minLimit;

            @SerializedName("my_rank")
            private Integer myRank;

            @SerializedName("total_coin")
            private String totalCoin;

            @SerializedName("user_name")
            private String userName;

            public boolean canEqual(Object obj) {
                return obj instanceof MyInfoDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof MyInfoDTO)) {
                    return false;
                }
                MyInfoDTO myInfoDTO = (MyInfoDTO) obj;
                if (!myInfoDTO.canEqual(this)) {
                    return false;
                }
                Integer myRank = getMyRank();
                Integer myRank2 = myInfoDTO.getMyRank();
                if (myRank != null ? !myRank.equals(myRank2) : myRank2 != null) {
                    return false;
                }
                String userName = getUserName();
                String userName2 = myInfoDTO.getUserName();
                if (userName != null ? !userName.equals(userName2) : userName2 != null) {
                    return false;
                }
                String avatar = getAvatar();
                String avatar2 = myInfoDTO.getAvatar();
                if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
                    return false;
                }
                String totalCoin = getTotalCoin();
                String totalCoin2 = myInfoDTO.getTotalCoin();
                if (totalCoin != null ? !totalCoin.equals(totalCoin2) : totalCoin2 != null) {
                    return false;
                }
                String minLimit = getMinLimit();
                String minLimit2 = myInfoDTO.getMinLimit();
                return minLimit != null ? minLimit.equals(minLimit2) : minLimit2 == null;
            }

            public String getAvatar() {
                return this.avatar;
            }

            public String getMinLimit() {
                return this.minLimit;
            }

            public Integer getMyRank() {
                return this.myRank;
            }

            public String getTotalCoin() {
                return this.totalCoin;
            }

            public String getUserName() {
                return this.userName;
            }

            public int hashCode() {
                Integer myRank = getMyRank();
                int iHashCode = myRank == null ? 43 : myRank.hashCode();
                String userName = getUserName();
                int iHashCode2 = ((iHashCode + 59) * 59) + (userName == null ? 43 : userName.hashCode());
                String avatar = getAvatar();
                int iHashCode3 = (iHashCode2 * 59) + (avatar == null ? 43 : avatar.hashCode());
                String totalCoin = getTotalCoin();
                int iHashCode4 = (iHashCode3 * 59) + (totalCoin == null ? 43 : totalCoin.hashCode());
                String minLimit = getMinLimit();
                return (iHashCode4 * 59) + (minLimit != null ? minLimit.hashCode() : 43);
            }

            public void setAvatar(String str) {
                this.avatar = str;
            }

            public void setMinLimit(String str) {
                this.minLimit = str;
            }

            public void setMyRank(Integer num) {
                this.myRank = num;
            }

            public void setTotalCoin(String str) {
                this.totalCoin = str;
            }

            public void setUserName(String str) {
                this.userName = str;
            }

            public String toString() {
                return "RoomDaliyTaskBean.DataDTO.MyInfoDTO(myRank=" + getMyRank() + ", userName=" + getUserName() + ", avatar=" + getAvatar() + ", totalCoin=" + getTotalCoin() + ", minLimit=" + getMinLimit() + ")";
            }
        }

        public static class RankTop10DTO {

            @SerializedName("from_user_id")
            private Integer FromUserId;

            @SerializedName("avatar")
            private String avatar;

            @SerializedName("total_coin")
            private String totalCoin;

            @SerializedName("user_name")
            private String userName;

            public boolean canEqual(Object obj) {
                return obj instanceof RankTop10DTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof RankTop10DTO)) {
                    return false;
                }
                RankTop10DTO rankTop10DTO = (RankTop10DTO) obj;
                if (!rankTop10DTO.canEqual(this)) {
                    return false;
                }
                Integer fromUserId = getFromUserId();
                Integer fromUserId2 = rankTop10DTO.getFromUserId();
                if (fromUserId != null ? !fromUserId.equals(fromUserId2) : fromUserId2 != null) {
                    return false;
                }
                String totalCoin = getTotalCoin();
                String totalCoin2 = rankTop10DTO.getTotalCoin();
                if (totalCoin != null ? !totalCoin.equals(totalCoin2) : totalCoin2 != null) {
                    return false;
                }
                String userName = getUserName();
                String userName2 = rankTop10DTO.getUserName();
                if (userName != null ? !userName.equals(userName2) : userName2 != null) {
                    return false;
                }
                String avatar = getAvatar();
                String avatar2 = rankTop10DTO.getAvatar();
                return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
            }

            public String getAvatar() {
                return this.avatar;
            }

            public Integer getFromUserId() {
                return this.FromUserId;
            }

            public String getTotalCoin() {
                return this.totalCoin;
            }

            public String getUserName() {
                return this.userName;
            }

            public int hashCode() {
                Integer fromUserId = getFromUserId();
                int iHashCode = fromUserId == null ? 43 : fromUserId.hashCode();
                String totalCoin = getTotalCoin();
                int iHashCode2 = ((iHashCode + 59) * 59) + (totalCoin == null ? 43 : totalCoin.hashCode());
                String userName = getUserName();
                int iHashCode3 = (iHashCode2 * 59) + (userName == null ? 43 : userName.hashCode());
                String avatar = getAvatar();
                return (iHashCode3 * 59) + (avatar != null ? avatar.hashCode() : 43);
            }

            public void setAvatar(String str) {
                this.avatar = str;
            }

            public void setFromUserId(Integer num) {
                this.FromUserId = num;
            }

            public void setTotalCoin(String str) {
                this.totalCoin = str;
            }

            public void setUserName(String str) {
                this.userName = str;
            }

            public String toString() {
                return "RoomDaliyTaskBean.DataDTO.RankTop10DTO(totalCoin=" + getTotalCoin() + ", FromUserId=" + getFromUserId() + ", userName=" + getUserName() + ", avatar=" + getAvatar() + ")";
            }
        }

        public static class RoomInfoDTO {

            @SerializedName("activity_level")
            private Integer activityLevel;

            @SerializedName("room_id")
            private Integer roomId;

            @SerializedName("room_name")
            private String roomName;

            @SerializedName("room_owner_avatar")
            private String roomOwnerAvatar;

            @SerializedName("room_owner_id")
            private Integer roomOwnerId;

            @SerializedName("room_owner_name")
            private String roomOwnerName;

            public boolean canEqual(Object obj) {
                return obj instanceof RoomInfoDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof RoomInfoDTO)) {
                    return false;
                }
                RoomInfoDTO roomInfoDTO = (RoomInfoDTO) obj;
                if (!roomInfoDTO.canEqual(this)) {
                    return false;
                }
                Integer roomId = getRoomId();
                Integer roomId2 = roomInfoDTO.getRoomId();
                if (roomId != null ? !roomId.equals(roomId2) : roomId2 != null) {
                    return false;
                }
                Integer roomOwnerId = getRoomOwnerId();
                Integer roomOwnerId2 = roomInfoDTO.getRoomOwnerId();
                if (roomOwnerId != null ? !roomOwnerId.equals(roomOwnerId2) : roomOwnerId2 != null) {
                    return false;
                }
                Integer activityLevel = getActivityLevel();
                Integer activityLevel2 = roomInfoDTO.getActivityLevel();
                if (activityLevel != null ? !activityLevel.equals(activityLevel2) : activityLevel2 != null) {
                    return false;
                }
                String roomName = getRoomName();
                String roomName2 = roomInfoDTO.getRoomName();
                if (roomName != null ? !roomName.equals(roomName2) : roomName2 != null) {
                    return false;
                }
                String roomOwnerName = getRoomOwnerName();
                String roomOwnerName2 = roomInfoDTO.getRoomOwnerName();
                if (roomOwnerName != null ? !roomOwnerName.equals(roomOwnerName2) : roomOwnerName2 != null) {
                    return false;
                }
                String roomOwnerAvatar = getRoomOwnerAvatar();
                String roomOwnerAvatar2 = roomInfoDTO.getRoomOwnerAvatar();
                return roomOwnerAvatar != null ? roomOwnerAvatar.equals(roomOwnerAvatar2) : roomOwnerAvatar2 == null;
            }

            public Integer getActivityLevel() {
                return this.activityLevel;
            }

            public Integer getRoomId() {
                return this.roomId;
            }

            public String getRoomName() {
                return this.roomName;
            }

            public String getRoomOwnerAvatar() {
                return this.roomOwnerAvatar;
            }

            public Integer getRoomOwnerId() {
                return this.roomOwnerId;
            }

            public String getRoomOwnerName() {
                return this.roomOwnerName;
            }

            public int hashCode() {
                Integer roomId = getRoomId();
                int iHashCode = roomId == null ? 43 : roomId.hashCode();
                Integer roomOwnerId = getRoomOwnerId();
                int iHashCode2 = ((iHashCode + 59) * 59) + (roomOwnerId == null ? 43 : roomOwnerId.hashCode());
                Integer activityLevel = getActivityLevel();
                int iHashCode3 = (iHashCode2 * 59) + (activityLevel == null ? 43 : activityLevel.hashCode());
                String roomName = getRoomName();
                int iHashCode4 = (iHashCode3 * 59) + (roomName == null ? 43 : roomName.hashCode());
                String roomOwnerName = getRoomOwnerName();
                int iHashCode5 = (iHashCode4 * 59) + (roomOwnerName == null ? 43 : roomOwnerName.hashCode());
                String roomOwnerAvatar = getRoomOwnerAvatar();
                return (iHashCode5 * 59) + (roomOwnerAvatar != null ? roomOwnerAvatar.hashCode() : 43);
            }

            public void setActivityLevel(Integer num) {
                this.activityLevel = num;
            }

            public void setRoomId(Integer num) {
                this.roomId = num;
            }

            public void setRoomName(String str) {
                this.roomName = str;
            }

            public void setRoomOwnerAvatar(String str) {
                this.roomOwnerAvatar = str;
            }

            public void setRoomOwnerId(Integer num) {
                this.roomOwnerId = num;
            }

            public void setRoomOwnerName(String str) {
                this.roomOwnerName = str;
            }

            public String toString() {
                return "RoomDaliyTaskBean.DataDTO.RoomInfoDTO(roomId=" + getRoomId() + ", roomName=" + getRoomName() + ", roomOwnerId=" + getRoomOwnerId() + ", activityLevel=" + getActivityLevel() + ", roomOwnerName=" + getRoomOwnerName() + ", roomOwnerAvatar=" + getRoomOwnerAvatar() + ")";
            }
        }

        public boolean canEqual(Object obj) {
            return obj instanceof DataDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DataDTO)) {
                return false;
            }
            DataDTO dataDTO = (DataDTO) obj;
            if (!dataDTO.canEqual(this)) {
                return false;
            }
            Long countdownTime = getCountdownTime();
            Long countdownTime2 = dataDTO.getCountdownTime();
            if (countdownTime != null ? !countdownTime.equals(countdownTime2) : countdownTime2 != null) {
                return false;
            }
            RoomInfoDTO roomInfo = getRoomInfo();
            RoomInfoDTO roomInfo2 = dataDTO.getRoomInfo();
            if (roomInfo != null ? !roomInfo.equals(roomInfo2) : roomInfo2 != null) {
                return false;
            }
            List<ActivityListDTO> activityList = getActivityList();
            List<ActivityListDTO> activityList2 = dataDTO.getActivityList();
            if (activityList != null ? !activityList.equals(activityList2) : activityList2 != null) {
                return false;
            }
            List<RankTop10DTO> rankTop10 = getRankTop10();
            List<RankTop10DTO> rankTop102 = dataDTO.getRankTop10();
            if (rankTop10 != null ? !rankTop10.equals(rankTop102) : rankTop102 != null) {
                return false;
            }
            MyInfoDTO myInfo = getMyInfo();
            MyInfoDTO myInfo2 = dataDTO.getMyInfo();
            if (myInfo != null ? !myInfo.equals(myInfo2) : myInfo2 != null) {
                return false;
            }
            String ruleLink = getRuleLink();
            String ruleLink2 = dataDTO.getRuleLink();
            if (ruleLink != null ? !ruleLink.equals(ruleLink2) : ruleLink2 != null) {
                return false;
            }
            List<String> dateSearch = getDateSearch();
            List<String> dateSearch2 = dataDTO.getDateSearch();
            return dateSearch != null ? dateSearch.equals(dateSearch2) : dateSearch2 == null;
        }

        public List<ActivityListDTO> getActivityList() {
            return this.activityList;
        }

        public Long getCountdownTime() {
            return this.countdownTime;
        }

        public List<String> getDateSearch() {
            return this.dateSearch;
        }

        public MyInfoDTO getMyInfo() {
            return this.myInfo;
        }

        public List<RankTop10DTO> getRankTop10() {
            return this.rankTop10;
        }

        public RoomInfoDTO getRoomInfo() {
            return this.roomInfo;
        }

        public String getRuleLink() {
            return this.ruleLink;
        }

        public int hashCode() {
            Long countdownTime = getCountdownTime();
            int iHashCode = countdownTime == null ? 43 : countdownTime.hashCode();
            RoomInfoDTO roomInfo = getRoomInfo();
            int iHashCode2 = ((iHashCode + 59) * 59) + (roomInfo == null ? 43 : roomInfo.hashCode());
            List<ActivityListDTO> activityList = getActivityList();
            int iHashCode3 = (iHashCode2 * 59) + (activityList == null ? 43 : activityList.hashCode());
            List<RankTop10DTO> rankTop10 = getRankTop10();
            int iHashCode4 = (iHashCode3 * 59) + (rankTop10 == null ? 43 : rankTop10.hashCode());
            MyInfoDTO myInfo = getMyInfo();
            int iHashCode5 = (iHashCode4 * 59) + (myInfo == null ? 43 : myInfo.hashCode());
            String ruleLink = getRuleLink();
            int iHashCode6 = (iHashCode5 * 59) + (ruleLink == null ? 43 : ruleLink.hashCode());
            List<String> dateSearch = getDateSearch();
            return (iHashCode6 * 59) + (dateSearch != null ? dateSearch.hashCode() : 43);
        }

        public void setActivityList(List<ActivityListDTO> list) {
            this.activityList = list;
        }

        public void setCountdownTime(Long l10) {
            this.countdownTime = l10;
        }

        public void setDateSearch(List<String> list) {
            this.dateSearch = list;
        }

        public void setMyInfo(MyInfoDTO myInfoDTO) {
            this.myInfo = myInfoDTO;
        }

        public void setRankTop10(List<RankTop10DTO> list) {
            this.rankTop10 = list;
        }

        public void setRoomInfo(RoomInfoDTO roomInfoDTO) {
            this.roomInfo = roomInfoDTO;
        }

        public void setRuleLink(String str) {
            this.ruleLink = str;
        }

        public String toString() {
            return "RoomDaliyTaskBean.DataDTO(countdownTime=" + getCountdownTime() + ", roomInfo=" + getRoomInfo() + ", activityList=" + getActivityList() + ", rankTop10=" + getRankTop10() + ", myInfo=" + getMyInfo() + ", ruleLink=" + getRuleLink() + ", dateSearch=" + getDateSearch() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof RoomDaliyTaskBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoomDaliyTaskBean)) {
            return false;
        }
        RoomDaliyTaskBean roomDaliyTaskBean = (RoomDaliyTaskBean) obj;
        if (!roomDaliyTaskBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = roomDaliyTaskBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = roomDaliyTaskBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = roomDaliyTaskBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = roomDaliyTaskBean.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    public Integer getCode() {
        return this.code;
    }

    public DataDTO getData() {
        return this.data;
    }

    public String getMsg() {
        return this.msg;
    }

    public Integer getTime() {
        return this.time;
    }

    public int hashCode() {
        Integer code = getCode();
        int iHashCode = code == null ? 43 : code.hashCode();
        Integer time = getTime();
        int iHashCode2 = ((iHashCode + 59) * 59) + (time == null ? 43 : time.hashCode());
        String msg = getMsg();
        int iHashCode3 = (iHashCode2 * 59) + (msg == null ? 43 : msg.hashCode());
        DataDTO data = getData();
        return (iHashCode3 * 59) + (data != null ? data.hashCode() : 43);
    }

    public void setCode(Integer num) {
        this.code = num;
    }

    public void setData(DataDTO dataDTO) {
        this.data = dataDTO;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setTime(Integer num) {
        this.time = num;
    }

    public String toString() {
        return "RoomDaliyTaskBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
