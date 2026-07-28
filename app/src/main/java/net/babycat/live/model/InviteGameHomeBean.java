package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class InviteGameHomeBean {

    @SerializedName("code")
    private Integer code;

    @SerializedName("data")
    private DataDTO data;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private Integer time;

    public static class DataDTO {

        @SerializedName("game_id")
        private Integer gameId;

        @SerializedName("game_price")
        private Integer gamePrice;

        @SerializedName("game_price_five")
        private String gamePriceFive;

        @SerializedName("game_rewards")
        private List<GamePlayBoxBean> gameRewards;

        @SerializedName("game_rule")
        private String gameRule;

        @SerializedName("game_ticket_icon")
        private String gameTicketIcon;

        @SerializedName("game_ticket_num")
        private Integer gameTicketNum;

        @SerializedName("game_ticket_propid")
        private String gameTicketPropid;

        @SerializedName("play_mode_five")
        private Integer playModeFive;

        @SerializedName("play_mode_one")
        private Integer playModeOne;

        @SerializedName("rewards_log_list")
        private List<RewardsLogListDTO> rewardsLogList;

        @SerializedName("user_coin")
        private String userCoin;

        public static class RewardsLogListDTO {

            @SerializedName("reward_icon")
            private String rewardIcon;

            @SerializedName("reward_name")
            private String rewardName;

            @SerializedName("uid")
            private Integer uid;

            @SerializedName("user_avatar")
            private String userAvatar;

            @SerializedName("user_name")
            private String userName;

            public boolean canEqual(Object obj) {
                return obj instanceof RewardsLogListDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof RewardsLogListDTO)) {
                    return false;
                }
                RewardsLogListDTO rewardsLogListDTO = (RewardsLogListDTO) obj;
                if (!rewardsLogListDTO.canEqual(this)) {
                    return false;
                }
                Integer uid = getUid();
                Integer uid2 = rewardsLogListDTO.getUid();
                if (uid != null ? !uid.equals(uid2) : uid2 != null) {
                    return false;
                }
                String userName = getUserName();
                String userName2 = rewardsLogListDTO.getUserName();
                if (userName != null ? !userName.equals(userName2) : userName2 != null) {
                    return false;
                }
                String userAvatar = getUserAvatar();
                String userAvatar2 = rewardsLogListDTO.getUserAvatar();
                if (userAvatar != null ? !userAvatar.equals(userAvatar2) : userAvatar2 != null) {
                    return false;
                }
                String rewardName = getRewardName();
                String rewardName2 = rewardsLogListDTO.getRewardName();
                if (rewardName != null ? !rewardName.equals(rewardName2) : rewardName2 != null) {
                    return false;
                }
                String rewardIcon = getRewardIcon();
                String rewardIcon2 = rewardsLogListDTO.getRewardIcon();
                return rewardIcon != null ? rewardIcon.equals(rewardIcon2) : rewardIcon2 == null;
            }

            public String getRewardIcon() {
                return this.rewardIcon;
            }

            public String getRewardName() {
                return this.rewardName;
            }

            public Integer getUid() {
                return this.uid;
            }

            public String getUserAvatar() {
                return this.userAvatar;
            }

            public String getUserName() {
                return this.userName;
            }

            public int hashCode() {
                Integer uid = getUid();
                int iHashCode = uid == null ? 43 : uid.hashCode();
                String userName = getUserName();
                int iHashCode2 = ((iHashCode + 59) * 59) + (userName == null ? 43 : userName.hashCode());
                String userAvatar = getUserAvatar();
                int iHashCode3 = (iHashCode2 * 59) + (userAvatar == null ? 43 : userAvatar.hashCode());
                String rewardName = getRewardName();
                int iHashCode4 = (iHashCode3 * 59) + (rewardName == null ? 43 : rewardName.hashCode());
                String rewardIcon = getRewardIcon();
                return (iHashCode4 * 59) + (rewardIcon != null ? rewardIcon.hashCode() : 43);
            }

            public void setRewardIcon(String str) {
                this.rewardIcon = str;
            }

            public void setRewardName(String str) {
                this.rewardName = str;
            }

            public void setUid(Integer num) {
                this.uid = num;
            }

            public void setUserAvatar(String str) {
                this.userAvatar = str;
            }

            public void setUserName(String str) {
                this.userName = str;
            }

            public String toString() {
                return "InviteGameHomeBean.DataDTO.RewardsLogListDTO(uid=" + getUid() + ", userName=" + getUserName() + ", userAvatar=" + getUserAvatar() + ", rewardName=" + getRewardName() + ", rewardIcon=" + getRewardIcon() + ")";
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
            Integer gameId = getGameId();
            Integer gameId2 = dataDTO.getGameId();
            if (gameId != null ? !gameId.equals(gameId2) : gameId2 != null) {
                return false;
            }
            Integer gamePrice = getGamePrice();
            Integer gamePrice2 = dataDTO.getGamePrice();
            if (gamePrice != null ? !gamePrice.equals(gamePrice2) : gamePrice2 != null) {
                return false;
            }
            Integer playModeOne = getPlayModeOne();
            Integer playModeOne2 = dataDTO.getPlayModeOne();
            if (playModeOne != null ? !playModeOne.equals(playModeOne2) : playModeOne2 != null) {
                return false;
            }
            Integer playModeFive = getPlayModeFive();
            Integer playModeFive2 = dataDTO.getPlayModeFive();
            if (playModeFive != null ? !playModeFive.equals(playModeFive2) : playModeFive2 != null) {
                return false;
            }
            Integer gameTicketNum = getGameTicketNum();
            Integer gameTicketNum2 = dataDTO.getGameTicketNum();
            if (gameTicketNum != null ? !gameTicketNum.equals(gameTicketNum2) : gameTicketNum2 != null) {
                return false;
            }
            String userCoin = getUserCoin();
            String userCoin2 = dataDTO.getUserCoin();
            if (userCoin != null ? !userCoin.equals(userCoin2) : userCoin2 != null) {
                return false;
            }
            String gameRule = getGameRule();
            String gameRule2 = dataDTO.getGameRule();
            if (gameRule != null ? !gameRule.equals(gameRule2) : gameRule2 != null) {
                return false;
            }
            List<GamePlayBoxBean> gameRewards = getGameRewards();
            List<GamePlayBoxBean> gameRewards2 = dataDTO.getGameRewards();
            if (gameRewards != null ? !gameRewards.equals(gameRewards2) : gameRewards2 != null) {
                return false;
            }
            String gameTicketPropid = getGameTicketPropid();
            String gameTicketPropid2 = dataDTO.getGameTicketPropid();
            if (gameTicketPropid != null ? !gameTicketPropid.equals(gameTicketPropid2) : gameTicketPropid2 != null) {
                return false;
            }
            String gameTicketIcon = getGameTicketIcon();
            String gameTicketIcon2 = dataDTO.getGameTicketIcon();
            if (gameTicketIcon != null ? !gameTicketIcon.equals(gameTicketIcon2) : gameTicketIcon2 != null) {
                return false;
            }
            String gamePriceFive = getGamePriceFive();
            String gamePriceFive2 = dataDTO.getGamePriceFive();
            if (gamePriceFive != null ? !gamePriceFive.equals(gamePriceFive2) : gamePriceFive2 != null) {
                return false;
            }
            List<RewardsLogListDTO> rewardsLogList = getRewardsLogList();
            List<RewardsLogListDTO> rewardsLogList2 = dataDTO.getRewardsLogList();
            return rewardsLogList != null ? rewardsLogList.equals(rewardsLogList2) : rewardsLogList2 == null;
        }

        public Integer getGameId() {
            return this.gameId;
        }

        public Integer getGamePrice() {
            return this.gamePrice;
        }

        public String getGamePriceFive() {
            return this.gamePriceFive;
        }

        public List<GamePlayBoxBean> getGameRewards() {
            return this.gameRewards;
        }

        public String getGameRule() {
            return this.gameRule;
        }

        public String getGameTicketIcon() {
            return this.gameTicketIcon;
        }

        public Integer getGameTicketNum() {
            return this.gameTicketNum;
        }

        public String getGameTicketPropid() {
            return this.gameTicketPropid;
        }

        public Integer getPlayModeFive() {
            return this.playModeFive;
        }

        public Integer getPlayModeOne() {
            return this.playModeOne;
        }

        public List<RewardsLogListDTO> getRewardsLogList() {
            return this.rewardsLogList;
        }

        public String getUserCoin() {
            return this.userCoin;
        }

        public int hashCode() {
            Integer gameId = getGameId();
            int iHashCode = gameId == null ? 43 : gameId.hashCode();
            Integer gamePrice = getGamePrice();
            int iHashCode2 = ((iHashCode + 59) * 59) + (gamePrice == null ? 43 : gamePrice.hashCode());
            Integer playModeOne = getPlayModeOne();
            int iHashCode3 = (iHashCode2 * 59) + (playModeOne == null ? 43 : playModeOne.hashCode());
            Integer playModeFive = getPlayModeFive();
            int iHashCode4 = (iHashCode3 * 59) + (playModeFive == null ? 43 : playModeFive.hashCode());
            Integer gameTicketNum = getGameTicketNum();
            int iHashCode5 = (iHashCode4 * 59) + (gameTicketNum == null ? 43 : gameTicketNum.hashCode());
            String userCoin = getUserCoin();
            int iHashCode6 = (iHashCode5 * 59) + (userCoin == null ? 43 : userCoin.hashCode());
            String gameRule = getGameRule();
            int iHashCode7 = (iHashCode6 * 59) + (gameRule == null ? 43 : gameRule.hashCode());
            List<GamePlayBoxBean> gameRewards = getGameRewards();
            int iHashCode8 = (iHashCode7 * 59) + (gameRewards == null ? 43 : gameRewards.hashCode());
            String gameTicketPropid = getGameTicketPropid();
            int iHashCode9 = (iHashCode8 * 59) + (gameTicketPropid == null ? 43 : gameTicketPropid.hashCode());
            String gameTicketIcon = getGameTicketIcon();
            int iHashCode10 = (iHashCode9 * 59) + (gameTicketIcon == null ? 43 : gameTicketIcon.hashCode());
            String gamePriceFive = getGamePriceFive();
            int iHashCode11 = (iHashCode10 * 59) + (gamePriceFive == null ? 43 : gamePriceFive.hashCode());
            List<RewardsLogListDTO> rewardsLogList = getRewardsLogList();
            return (iHashCode11 * 59) + (rewardsLogList != null ? rewardsLogList.hashCode() : 43);
        }

        public void setGameId(Integer num) {
            this.gameId = num;
        }

        public void setGamePrice(Integer num) {
            this.gamePrice = num;
        }

        public void setGamePriceFive(String str) {
            this.gamePriceFive = str;
        }

        public void setGameRewards(List<GamePlayBoxBean> list) {
            this.gameRewards = list;
        }

        public void setGameRule(String str) {
            this.gameRule = str;
        }

        public void setGameTicketIcon(String str) {
            this.gameTicketIcon = str;
        }

        public void setGameTicketNum(Integer num) {
            this.gameTicketNum = num;
        }

        public void setGameTicketPropid(String str) {
            this.gameTicketPropid = str;
        }

        public void setPlayModeFive(Integer num) {
            this.playModeFive = num;
        }

        public void setPlayModeOne(Integer num) {
            this.playModeOne = num;
        }

        public void setRewardsLogList(List<RewardsLogListDTO> list) {
            this.rewardsLogList = list;
        }

        public void setUserCoin(String str) {
            this.userCoin = str;
        }

        public String toString() {
            return "InviteGameHomeBean.DataDTO(gameId=" + getGameId() + ", userCoin=" + getUserCoin() + ", gameRule=" + getGameRule() + ", gamePrice=" + getGamePrice() + ", playModeOne=" + getPlayModeOne() + ", playModeFive=" + getPlayModeFive() + ", gameRewards=" + getGameRewards() + ", gameTicketPropid=" + getGameTicketPropid() + ", gameTicketIcon=" + getGameTicketIcon() + ", gameTicketNum=" + getGameTicketNum() + ", gamePriceFive=" + getGamePriceFive() + ", rewardsLogList=" + getRewardsLogList() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof InviteGameHomeBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InviteGameHomeBean)) {
            return false;
        }
        InviteGameHomeBean inviteGameHomeBean = (InviteGameHomeBean) obj;
        if (!inviteGameHomeBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = inviteGameHomeBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = inviteGameHomeBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = inviteGameHomeBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = inviteGameHomeBean.getData();
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
        return "InviteGameHomeBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
