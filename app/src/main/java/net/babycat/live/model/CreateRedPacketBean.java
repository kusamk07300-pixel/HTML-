package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;

/* JADX INFO: loaded from: classes4.dex */
public class CreateRedPacketBean {

    @SerializedName("code")
    private Integer code;

    @SerializedName("data")
    private DataDTO data;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private Integer time;

    public static class DataDTO {

        @SerializedName("coin")
        private Integer coin;

        @SerializedName("delay_time")
        private Integer delayTime;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private String f34818id;

        @SerializedName("nums")
        private Integer nums;

        @SerializedName("red_id")
        private String red_id;

        @SerializedName("remain_rob_time")
        private Integer remain_rob_time;

        @SerializedName("remain_time")
        private Integer remain_time;

        @SerializedName("rob_time")
        private Integer rob_time;

        @SerializedName("uid")
        private Integer uid;

        @SerializedName("user_info")
        private UserRedPacketDTO user_info;

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
            Integer delayTime = getDelayTime();
            Integer delayTime2 = dataDTO.getDelayTime();
            if (delayTime != null ? !delayTime.equals(delayTime2) : delayTime2 != null) {
                return false;
            }
            Integer coin = getCoin();
            Integer coin2 = dataDTO.getCoin();
            if (coin != null ? !coin.equals(coin2) : coin2 != null) {
                return false;
            }
            Integer nums = getNums();
            Integer nums2 = dataDTO.getNums();
            if (nums != null ? !nums.equals(nums2) : nums2 != null) {
                return false;
            }
            Integer rob_time = getRob_time();
            Integer rob_time2 = dataDTO.getRob_time();
            if (rob_time != null ? !rob_time.equals(rob_time2) : rob_time2 != null) {
                return false;
            }
            Integer remain_time = getRemain_time();
            Integer remain_time2 = dataDTO.getRemain_time();
            if (remain_time != null ? !remain_time.equals(remain_time2) : remain_time2 != null) {
                return false;
            }
            Integer remain_rob_time = getRemain_rob_time();
            Integer remain_rob_time2 = dataDTO.getRemain_rob_time();
            if (remain_rob_time != null ? !remain_rob_time.equals(remain_rob_time2) : remain_rob_time2 != null) {
                return false;
            }
            Integer uid = getUid();
            Integer uid2 = dataDTO.getUid();
            if (uid != null ? !uid.equals(uid2) : uid2 != null) {
                return false;
            }
            String red_id = getRed_id();
            String red_id2 = dataDTO.getRed_id();
            if (red_id != null ? !red_id.equals(red_id2) : red_id2 != null) {
                return false;
            }
            String id2 = getId();
            String id3 = dataDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            UserRedPacketDTO user_info = getUser_info();
            UserRedPacketDTO user_info2 = dataDTO.getUser_info();
            return user_info != null ? user_info.equals(user_info2) : user_info2 == null;
        }

        public Integer getCoin() {
            return this.coin;
        }

        public Integer getDelayTime() {
            return this.delayTime;
        }

        public String getId() {
            return this.f34818id;
        }

        public Integer getNums() {
            return this.nums;
        }

        public String getRed_id() {
            return this.red_id;
        }

        public Integer getRemain_rob_time() {
            return this.remain_rob_time;
        }

        public Integer getRemain_time() {
            return this.remain_time;
        }

        public Integer getRob_time() {
            return this.rob_time;
        }

        public Integer getUid() {
            return this.uid;
        }

        public UserRedPacketDTO getUser_info() {
            return this.user_info;
        }

        public int hashCode() {
            Integer delayTime = getDelayTime();
            int iHashCode = delayTime == null ? 43 : delayTime.hashCode();
            Integer coin = getCoin();
            int iHashCode2 = ((iHashCode + 59) * 59) + (coin == null ? 43 : coin.hashCode());
            Integer nums = getNums();
            int iHashCode3 = (iHashCode2 * 59) + (nums == null ? 43 : nums.hashCode());
            Integer rob_time = getRob_time();
            int iHashCode4 = (iHashCode3 * 59) + (rob_time == null ? 43 : rob_time.hashCode());
            Integer remain_time = getRemain_time();
            int iHashCode5 = (iHashCode4 * 59) + (remain_time == null ? 43 : remain_time.hashCode());
            Integer remain_rob_time = getRemain_rob_time();
            int iHashCode6 = (iHashCode5 * 59) + (remain_rob_time == null ? 43 : remain_rob_time.hashCode());
            Integer uid = getUid();
            int iHashCode7 = (iHashCode6 * 59) + (uid == null ? 43 : uid.hashCode());
            String red_id = getRed_id();
            int iHashCode8 = (iHashCode7 * 59) + (red_id == null ? 43 : red_id.hashCode());
            String id2 = getId();
            int iHashCode9 = (iHashCode8 * 59) + (id2 == null ? 43 : id2.hashCode());
            UserRedPacketDTO user_info = getUser_info();
            return (iHashCode9 * 59) + (user_info != null ? user_info.hashCode() : 43);
        }

        public void setCoin(Integer num) {
            this.coin = num;
        }

        public void setDelayTime(Integer num) {
            this.delayTime = num;
        }

        public void setId(String str) {
            this.f34818id = str;
        }

        public void setNums(Integer num) {
            this.nums = num;
        }

        public void setRed_id(String str) {
            this.red_id = str;
        }

        public void setRemain_rob_time(Integer num) {
            this.remain_rob_time = num;
        }

        public void setRemain_time(Integer num) {
            this.remain_time = num;
        }

        public void setRob_time(Integer num) {
            this.rob_time = num;
        }

        public void setUid(Integer num) {
            this.uid = num;
        }

        public void setUser_info(UserRedPacketDTO userRedPacketDTO) {
            this.user_info = userRedPacketDTO;
        }

        public String toString() {
            return "CreateRedPacketBean.DataDTO(delayTime=" + getDelayTime() + ", coin=" + getCoin() + ", nums=" + getNums() + ", rob_time=" + getRob_time() + ", remain_time=" + getRemain_time() + ", remain_rob_time=" + getRemain_rob_time() + ", uid=" + getUid() + ", red_id=" + getRed_id() + ", id=" + getId() + ", user_info=" + getUser_info() + ")";
        }
    }

    public static class UserRedPacketDTO {

        @SerializedName("avatar")
        private String avatar;

        @SerializedName("nickname")
        private String nickname;

        public boolean canEqual(Object obj) {
            return obj instanceof UserRedPacketDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserRedPacketDTO)) {
                return false;
            }
            UserRedPacketDTO userRedPacketDTO = (UserRedPacketDTO) obj;
            if (!userRedPacketDTO.canEqual(this)) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = userRedPacketDTO.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = userRedPacketDTO.getAvatar();
            return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public String getNickname() {
            return this.nickname;
        }

        public int hashCode() {
            String nickname = getNickname();
            int iHashCode = nickname == null ? 43 : nickname.hashCode();
            String avatar = getAvatar();
            return ((iHashCode + 59) * 59) + (avatar != null ? avatar.hashCode() : 43);
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public String toString() {
            return "CreateRedPacketBean.UserRedPacketDTO(nickname=" + getNickname() + ", avatar=" + getAvatar() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof CreateRedPacketBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateRedPacketBean)) {
            return false;
        }
        CreateRedPacketBean createRedPacketBean = (CreateRedPacketBean) obj;
        if (!createRedPacketBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = createRedPacketBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = createRedPacketBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = createRedPacketBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = createRedPacketBean.getData();
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
        return "CreateRedPacketBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
