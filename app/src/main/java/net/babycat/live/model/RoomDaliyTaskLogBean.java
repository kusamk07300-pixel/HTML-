package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RoomDaliyTaskLogBean {

    @SerializedName("code")
    private Integer code;

    @SerializedName("data")
    private DataDTO data;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private Integer time;

    public static class DataDTO {

        @SerializedName("do_receive")
        private Integer doReceive;

        @SerializedName("logs")
        private List<LogsDTO> logs;

        @SerializedName("receive_coins")
        private String receiveCoins;

        public static class LogsDTO {

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @SerializedName("id")
            private String f34886id;

            @SerializedName("owner_rewards")
            private String ownerRewards;

            @SerializedName("top10_rewards")
            private String top10Rewards;

            @SerializedName("ymd")
            private Integer ymd;

            public boolean canEqual(Object obj) {
                return obj instanceof LogsDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof LogsDTO)) {
                    return false;
                }
                LogsDTO logsDTO = (LogsDTO) obj;
                if (!logsDTO.canEqual(this)) {
                    return false;
                }
                Integer ymd = getYmd();
                Integer ymd2 = logsDTO.getYmd();
                if (ymd != null ? !ymd.equals(ymd2) : ymd2 != null) {
                    return false;
                }
                String id2 = getId();
                String id3 = logsDTO.getId();
                if (id2 != null ? !id2.equals(id3) : id3 != null) {
                    return false;
                }
                String ownerRewards = getOwnerRewards();
                String ownerRewards2 = logsDTO.getOwnerRewards();
                if (ownerRewards != null ? !ownerRewards.equals(ownerRewards2) : ownerRewards2 != null) {
                    return false;
                }
                String top10Rewards = getTop10Rewards();
                String top10Rewards2 = logsDTO.getTop10Rewards();
                return top10Rewards != null ? top10Rewards.equals(top10Rewards2) : top10Rewards2 == null;
            }

            public String getId() {
                return this.f34886id;
            }

            public String getOwnerRewards() {
                return this.ownerRewards;
            }

            public String getTop10Rewards() {
                return this.top10Rewards;
            }

            public Integer getYmd() {
                return this.ymd;
            }

            public int hashCode() {
                Integer ymd = getYmd();
                int iHashCode = ymd == null ? 43 : ymd.hashCode();
                String id2 = getId();
                int iHashCode2 = ((iHashCode + 59) * 59) + (id2 == null ? 43 : id2.hashCode());
                String ownerRewards = getOwnerRewards();
                int iHashCode3 = (iHashCode2 * 59) + (ownerRewards == null ? 43 : ownerRewards.hashCode());
                String top10Rewards = getTop10Rewards();
                return (iHashCode3 * 59) + (top10Rewards != null ? top10Rewards.hashCode() : 43);
            }

            public void setId(String str) {
                this.f34886id = str;
            }

            public void setOwnerRewards(String str) {
                this.ownerRewards = str;
            }

            public void setTop10Rewards(String str) {
                this.top10Rewards = str;
            }

            public void setYmd(Integer num) {
                this.ymd = num;
            }

            public String toString() {
                return "RoomDaliyTaskLogBean.DataDTO.LogsDTO(id=" + getId() + ", ymd=" + getYmd() + ", ownerRewards=" + getOwnerRewards() + ", top10Rewards=" + getTop10Rewards() + ")";
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
            Integer doReceive = getDoReceive();
            Integer doReceive2 = dataDTO.getDoReceive();
            if (doReceive != null ? !doReceive.equals(doReceive2) : doReceive2 != null) {
                return false;
            }
            String receiveCoins = getReceiveCoins();
            String receiveCoins2 = dataDTO.getReceiveCoins();
            if (receiveCoins != null ? !receiveCoins.equals(receiveCoins2) : receiveCoins2 != null) {
                return false;
            }
            List<LogsDTO> logs = getLogs();
            List<LogsDTO> logs2 = dataDTO.getLogs();
            return logs != null ? logs.equals(logs2) : logs2 == null;
        }

        public Integer getDoReceive() {
            return this.doReceive;
        }

        public List<LogsDTO> getLogs() {
            return this.logs;
        }

        public String getReceiveCoins() {
            return this.receiveCoins;
        }

        public int hashCode() {
            Integer doReceive = getDoReceive();
            int iHashCode = doReceive == null ? 43 : doReceive.hashCode();
            String receiveCoins = getReceiveCoins();
            int iHashCode2 = ((iHashCode + 59) * 59) + (receiveCoins == null ? 43 : receiveCoins.hashCode());
            List<LogsDTO> logs = getLogs();
            return (iHashCode2 * 59) + (logs != null ? logs.hashCode() : 43);
        }

        public void setDoReceive(Integer num) {
            this.doReceive = num;
        }

        public void setLogs(List<LogsDTO> list) {
            this.logs = list;
        }

        public void setReceiveCoins(String str) {
            this.receiveCoins = str;
        }

        public String toString() {
            return "RoomDaliyTaskLogBean.DataDTO(doReceive=" + getDoReceive() + ", receiveCoins=" + getReceiveCoins() + ", logs=" + getLogs() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof RoomDaliyTaskLogBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoomDaliyTaskLogBean)) {
            return false;
        }
        RoomDaliyTaskLogBean roomDaliyTaskLogBean = (RoomDaliyTaskLogBean) obj;
        if (!roomDaliyTaskLogBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = roomDaliyTaskLogBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = roomDaliyTaskLogBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = roomDaliyTaskLogBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = roomDaliyTaskLogBean.getData();
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
        return "RoomDaliyTaskLogBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
