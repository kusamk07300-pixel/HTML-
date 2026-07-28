package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;

/* JADX INFO: loaded from: classes4.dex */
public class MicClearingBean {

    @SerializedName("mic_no")
    private String micNo;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("room_id")
    private Integer roomId;

    @SerializedName("uid")
    private String uid;

    public boolean canEqual(Object obj) {
        return obj instanceof MicClearingBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MicClearingBean)) {
            return false;
        }
        MicClearingBean micClearingBean = (MicClearingBean) obj;
        if (!micClearingBean.canEqual(this)) {
            return false;
        }
        Integer roomId = getRoomId();
        Integer roomId2 = micClearingBean.getRoomId();
        if (roomId != null ? !roomId.equals(roomId2) : roomId2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = micClearingBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        String micNo = getMicNo();
        String micNo2 = micClearingBean.getMicNo();
        if (micNo != null ? !micNo.equals(micNo2) : micNo2 != null) {
            return false;
        }
        String uid = getUid();
        String uid2 = micClearingBean.getUid();
        return uid != null ? uid.equals(uid2) : uid2 == null;
    }

    public String getMicNo() {
        return this.micNo;
    }

    public String getMsg() {
        return this.msg;
    }

    public Integer getRoomId() {
        return this.roomId;
    }

    public String getUid() {
        return this.uid;
    }

    public int hashCode() {
        Integer roomId = getRoomId();
        int iHashCode = roomId == null ? 43 : roomId.hashCode();
        String msg = getMsg();
        int iHashCode2 = ((iHashCode + 59) * 59) + (msg == null ? 43 : msg.hashCode());
        String micNo = getMicNo();
        int iHashCode3 = (iHashCode2 * 59) + (micNo == null ? 43 : micNo.hashCode());
        String uid = getUid();
        return (iHashCode3 * 59) + (uid != null ? uid.hashCode() : 43);
    }

    public void setMicNo(String str) {
        this.micNo = str;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setRoomId(Integer num) {
        this.roomId = num;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public String toString() {
        return "MicClearingBean(msg=" + getMsg() + ", roomId=" + getRoomId() + ", micNo=" + getMicNo() + ", uid=" + getUid() + ")";
    }
}
