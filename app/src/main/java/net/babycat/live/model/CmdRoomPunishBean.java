package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class CmdRoomPunishBean {

    @SerializedName("is_whether")
    private int isWhether;

    @SerializedName("mic_num")
    private int micNum;

    @SerializedName("room_id")
    private String roomId;

    @SerializedName("type")
    private int type;

    @SerializedName("uid")
    private int uid;

    public boolean canEqual(Object obj) {
        return obj instanceof CmdRoomPunishBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CmdRoomPunishBean)) {
            return false;
        }
        CmdRoomPunishBean cmdRoomPunishBean = (CmdRoomPunishBean) obj;
        if (!cmdRoomPunishBean.canEqual(this) || getType() != cmdRoomPunishBean.getType() || getUid() != cmdRoomPunishBean.getUid() || getMicNum() != cmdRoomPunishBean.getMicNum() || getIsWhether() != cmdRoomPunishBean.getIsWhether()) {
            return false;
        }
        String roomId = getRoomId();
        String roomId2 = cmdRoomPunishBean.getRoomId();
        return roomId != null ? roomId.equals(roomId2) : roomId2 == null;
    }

    public int getIsWhether() {
        return this.isWhether;
    }

    public int getMicNum() {
        return this.micNum;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public int getType() {
        return this.type;
    }

    public int getUid() {
        return this.uid;
    }

    public int hashCode() {
        int type = ((((((getType() + 59) * 59) + getUid()) * 59) + getMicNum()) * 59) + getIsWhether();
        String roomId = getRoomId();
        return (type * 59) + (roomId == null ? 43 : roomId.hashCode());
    }

    public void setIsWhether(int i10) {
        this.isWhether = i10;
    }

    public void setMicNum(int i10) {
        this.micNum = i10;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public void setType(int i10) {
        this.type = i10;
    }

    public void setUid(int i10) {
        this.uid = i10;
    }

    public String toString() {
        return "CmdRoomPunishBean(type=" + getType() + ", uid=" + getUid() + ", micNum=" + getMicNum() + ", isWhether=" + getIsWhether() + ", roomId=" + getRoomId() + ")";
    }
}
