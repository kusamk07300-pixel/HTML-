package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import net.babycat.live.model.NewJoinRoomBean;

/* JADX INFO: loaded from: classes4.dex */
public class CmdKiksUserBean {

    @SerializedName("data")
    NewJoinRoomBean.AnchorsDTO data;

    @SerializedName("room_id")
    private String roomId;

    @SerializedName("uid")
    Integer uid;

    public boolean canEqual(Object obj) {
        return obj instanceof CmdKiksUserBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CmdKiksUserBean)) {
            return false;
        }
        CmdKiksUserBean cmdKiksUserBean = (CmdKiksUserBean) obj;
        if (!cmdKiksUserBean.canEqual(this)) {
            return false;
        }
        Integer uid = getUid();
        Integer uid2 = cmdKiksUserBean.getUid();
        if (uid != null ? !uid.equals(uid2) : uid2 != null) {
            return false;
        }
        NewJoinRoomBean.AnchorsDTO data = getData();
        NewJoinRoomBean.AnchorsDTO data2 = cmdKiksUserBean.getData();
        if (data != null ? !data.equals(data2) : data2 != null) {
            return false;
        }
        String roomId = getRoomId();
        String roomId2 = cmdKiksUserBean.getRoomId();
        return roomId != null ? roomId.equals(roomId2) : roomId2 == null;
    }

    public NewJoinRoomBean.AnchorsDTO getData() {
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
        NewJoinRoomBean.AnchorsDTO data = getData();
        int iHashCode2 = ((iHashCode + 59) * 59) + (data == null ? 43 : data.hashCode());
        String roomId = getRoomId();
        return (iHashCode2 * 59) + (roomId != null ? roomId.hashCode() : 43);
    }

    public void setData(NewJoinRoomBean.AnchorsDTO anchorsDTO) {
        this.data = anchorsDTO;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public void setUid(Integer num) {
        this.uid = num;
    }

    public String toString() {
        return "CmdKiksUserBean(uid=" + getUid() + ", data=" + getData() + ", roomId=" + getRoomId() + ")";
    }
}
