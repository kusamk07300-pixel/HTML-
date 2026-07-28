package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;

/* JADX INFO: loaded from: classes4.dex */
public class RandomPkBean {

    @SerializedName("code")
    private Integer code;

    @SerializedName("data")
    private DataDTO data;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private Integer time;

    public static class DataDTO {

        @SerializedName("to_room_id")
        private Integer toRoomId;

        @SerializedName("to_user_id")
        private Integer toUserId;

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
            Integer toRoomId = getToRoomId();
            Integer toRoomId2 = dataDTO.getToRoomId();
            if (toRoomId != null ? !toRoomId.equals(toRoomId2) : toRoomId2 != null) {
                return false;
            }
            Integer toUserId = getToUserId();
            Integer toUserId2 = dataDTO.getToUserId();
            return toUserId != null ? toUserId.equals(toUserId2) : toUserId2 == null;
        }

        public Integer getToRoomId() {
            return this.toRoomId;
        }

        public Integer getToUserId() {
            return this.toUserId;
        }

        public int hashCode() {
            Integer toRoomId = getToRoomId();
            int iHashCode = toRoomId == null ? 43 : toRoomId.hashCode();
            Integer toUserId = getToUserId();
            return ((iHashCode + 59) * 59) + (toUserId != null ? toUserId.hashCode() : 43);
        }

        public void setToRoomId(Integer num) {
            this.toRoomId = num;
        }

        public void setToUserId(Integer num) {
            this.toUserId = num;
        }

        public String toString() {
            return "RandomPkBean.DataDTO(toRoomId=" + getToRoomId() + ", toUserId=" + getToUserId() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof RandomPkBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RandomPkBean)) {
            return false;
        }
        RandomPkBean randomPkBean = (RandomPkBean) obj;
        if (!randomPkBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = randomPkBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = randomPkBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = randomPkBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = randomPkBean.getData();
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
        return "RandomPkBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
