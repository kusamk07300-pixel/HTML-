package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class CmdBaoMicBean {

    @SerializedName("data")
    RoomUpMicBean data;

    @SerializedName("room_id")
    private String roomId;

    @SerializedName("uid")
    Integer uid;

    public boolean canEqual(Object obj) {
        return obj instanceof CmdBaoMicBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CmdBaoMicBean)) {
            return false;
        }
        CmdBaoMicBean cmdBaoMicBean = (CmdBaoMicBean) obj;
        if (!cmdBaoMicBean.canEqual(this)) {
            return false;
        }
        Integer uid = getUid();
        Integer uid2 = cmdBaoMicBean.getUid();
        if (uid != null ? !uid.equals(uid2) : uid2 != null) {
            return false;
        }
        RoomUpMicBean data = getData();
        RoomUpMicBean data2 = cmdBaoMicBean.getData();
        if (data != null ? !data.equals(data2) : data2 != null) {
            return false;
        }
        String roomId = getRoomId();
        String roomId2 = cmdBaoMicBean.getRoomId();
        return roomId != null ? roomId.equals(roomId2) : roomId2 == null;
    }

    public RoomUpMicBean getData() {
        return this.data;
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
        RoomUpMicBean data = getData();
        int iHashCode2 = ((iHashCode + 59) * 59) + (data == null ? 43 : data.hashCode());
        String roomId = getRoomId();
        return (iHashCode2 * 59) + (roomId != null ? roomId.hashCode() : 43);
    }

    public void setData(RoomUpMicBean roomUpMicBean) {
        this.data = roomUpMicBean;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public void setUid(Integer num) {
        this.uid = num;
    }

    public String toString() {
        return "CmdBaoMicBean(uid=" + getUid() + ", data=" + getData() + ", roomId=" + getRoomId() + ")";
    }
}
