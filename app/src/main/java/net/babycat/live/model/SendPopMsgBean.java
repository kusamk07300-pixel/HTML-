package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;

/* JADX INFO: loaded from: classes4.dex */
public class SendPopMsgBean {

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("price")
    private Integer price;

    @SerializedName("room_id")
    private String roomId;

    @SerializedName("uid")
    private Integer uid;

    public boolean canEqual(Object obj) {
        return obj instanceof SendPopMsgBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendPopMsgBean)) {
            return false;
        }
        SendPopMsgBean sendPopMsgBean = (SendPopMsgBean) obj;
        if (!sendPopMsgBean.canEqual(this)) {
            return false;
        }
        Integer uid = getUid();
        Integer uid2 = sendPopMsgBean.getUid();
        if (uid != null ? !uid.equals(uid2) : uid2 != null) {
            return false;
        }
        Integer price = getPrice();
        Integer price2 = sendPopMsgBean.getPrice();
        if (price != null ? !price.equals(price2) : price2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = sendPopMsgBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        String roomId = getRoomId();
        String roomId2 = sendPopMsgBean.getRoomId();
        return roomId != null ? roomId.equals(roomId2) : roomId2 == null;
    }

    public String getMsg() {
        return this.msg;
    }

    public Integer getPrice() {
        return this.price;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public Integer getUid() {
        return this.uid;
    }

    public int hashCode() {
        Integer uid = getUid();
        int iHashCode = uid == null ? 43 : uid.hashCode();
        Integer price = getPrice();
        int iHashCode2 = ((iHashCode + 59) * 59) + (price == null ? 43 : price.hashCode());
        String msg = getMsg();
        int iHashCode3 = (iHashCode2 * 59) + (msg == null ? 43 : msg.hashCode());
        String roomId = getRoomId();
        return (iHashCode3 * 59) + (roomId != null ? roomId.hashCode() : 43);
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setPrice(Integer num) {
        this.price = num;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public void setUid(Integer num) {
        this.uid = num;
    }

    public String toString() {
        return "SendPopMsgBean(msg=" + getMsg() + ", uid=" + getUid() + ", roomId=" + getRoomId() + ", price=" + getPrice() + ")";
    }
}
