package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;
import net.babycat.live.model.RocketActivityBean;

/* JADX INFO: loaded from: classes4.dex */
public class RocketActivityLogBean {

    @SerializedName("code")
    private Integer code;

    @SerializedName("data")
    private DataDTO data;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private Integer time;

    public static class DataDTO {

        @SerializedName("coin_img")
        private String coinImg;

        @SerializedName("list")
        private List<ListDTO> list;

        @SerializedName("self_rewards")
        private List<RocketActivityBean.DataDTO.RocketlistDTO.RewardsDTO.LevelDTO> selfRewards;

        @SerializedName("Title")
        private String title;

        public static class ListDTO {

            @SerializedName("avatar")
            private String avatar;

            @SerializedName("nickname")
            private String nickname;

            @SerializedName("rank")
            private Integer rank;

            @SerializedName("reward")
            private List<RocketActivityBean.DataDTO.RocketlistDTO.RewardsDTO.LevelDTO> reward;

            @SerializedName("uid")
            private Integer uid;

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
                Integer rank = getRank();
                Integer rank2 = listDTO.getRank();
                if (rank != null ? !rank.equals(rank2) : rank2 != null) {
                    return false;
                }
                List<RocketActivityBean.DataDTO.RocketlistDTO.RewardsDTO.LevelDTO> reward = getReward();
                List<RocketActivityBean.DataDTO.RocketlistDTO.RewardsDTO.LevelDTO> reward2 = listDTO.getReward();
                if (reward != null ? !reward.equals(reward2) : reward2 != null) {
                    return false;
                }
                String nickname = getNickname();
                String nickname2 = listDTO.getNickname();
                if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                    return false;
                }
                String avatar = getAvatar();
                String avatar2 = listDTO.getAvatar();
                return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
            }

            public String getAvatar() {
                return this.avatar;
            }

            public String getNickname() {
                return this.nickname;
            }

            public Integer getRank() {
                return this.rank;
            }

            public List<RocketActivityBean.DataDTO.RocketlistDTO.RewardsDTO.LevelDTO> getReward() {
                return this.reward;
            }

            public Integer getUid() {
                return this.uid;
            }

            public int hashCode() {
                Integer uid = getUid();
                int iHashCode = uid == null ? 43 : uid.hashCode();
                Integer rank = getRank();
                int iHashCode2 = ((iHashCode + 59) * 59) + (rank == null ? 43 : rank.hashCode());
                List<RocketActivityBean.DataDTO.RocketlistDTO.RewardsDTO.LevelDTO> reward = getReward();
                int iHashCode3 = (iHashCode2 * 59) + (reward == null ? 43 : reward.hashCode());
                String nickname = getNickname();
                int iHashCode4 = (iHashCode3 * 59) + (nickname == null ? 43 : nickname.hashCode());
                String avatar = getAvatar();
                return (iHashCode4 * 59) + (avatar != null ? avatar.hashCode() : 43);
            }

            public void setAvatar(String str) {
                this.avatar = str;
            }

            public void setNickname(String str) {
                this.nickname = str;
            }

            public void setRank(Integer num) {
                this.rank = num;
            }

            public void setReward(List<RocketActivityBean.DataDTO.RocketlistDTO.RewardsDTO.LevelDTO> list) {
                this.reward = list;
            }

            public void setUid(Integer num) {
                this.uid = num;
            }

            public String toString() {
                return "RocketActivityLogBean.DataDTO.ListDTO(uid=" + getUid() + ", rank=" + getRank() + ", reward=" + getReward() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ")";
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
            String coinImg = getCoinImg();
            String coinImg2 = dataDTO.getCoinImg();
            if (coinImg != null ? !coinImg.equals(coinImg2) : coinImg2 != null) {
                return false;
            }
            String title = getTitle();
            String title2 = dataDTO.getTitle();
            if (title != null ? !title.equals(title2) : title2 != null) {
                return false;
            }
            List<RocketActivityBean.DataDTO.RocketlistDTO.RewardsDTO.LevelDTO> selfRewards = getSelfRewards();
            List<RocketActivityBean.DataDTO.RocketlistDTO.RewardsDTO.LevelDTO> selfRewards2 = dataDTO.getSelfRewards();
            if (selfRewards != null ? !selfRewards.equals(selfRewards2) : selfRewards2 != null) {
                return false;
            }
            List<ListDTO> list = getList();
            List<ListDTO> list2 = dataDTO.getList();
            return list != null ? list.equals(list2) : list2 == null;
        }

        public String getCoinImg() {
            return this.coinImg;
        }

        public List<ListDTO> getList() {
            return this.list;
        }

        public List<RocketActivityBean.DataDTO.RocketlistDTO.RewardsDTO.LevelDTO> getSelfRewards() {
            return this.selfRewards;
        }

        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String coinImg = getCoinImg();
            int iHashCode = coinImg == null ? 43 : coinImg.hashCode();
            String title = getTitle();
            int iHashCode2 = ((iHashCode + 59) * 59) + (title == null ? 43 : title.hashCode());
            List<RocketActivityBean.DataDTO.RocketlistDTO.RewardsDTO.LevelDTO> selfRewards = getSelfRewards();
            int iHashCode3 = (iHashCode2 * 59) + (selfRewards == null ? 43 : selfRewards.hashCode());
            List<ListDTO> list = getList();
            return (iHashCode3 * 59) + (list != null ? list.hashCode() : 43);
        }

        public void setCoinImg(String str) {
            this.coinImg = str;
        }

        public void setList(List<ListDTO> list) {
            this.list = list;
        }

        public void setSelfRewards(List<RocketActivityBean.DataDTO.RocketlistDTO.RewardsDTO.LevelDTO> list) {
            this.selfRewards = list;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public String toString() {
            return "RocketActivityLogBean.DataDTO(coinImg=" + getCoinImg() + ", title=" + getTitle() + ", selfRewards=" + getSelfRewards() + ", list=" + getList() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof RocketActivityLogBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RocketActivityLogBean)) {
            return false;
        }
        RocketActivityLogBean rocketActivityLogBean = (RocketActivityLogBean) obj;
        if (!rocketActivityLogBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = rocketActivityLogBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = rocketActivityLogBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = rocketActivityLogBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = rocketActivityLogBean.getData();
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
        return "RocketActivityLogBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
