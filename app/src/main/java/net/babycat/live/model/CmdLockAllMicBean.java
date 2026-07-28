package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CmdLockAllMicBean {

    @SerializedName("mic_nums")
    private List<Integer> micNums;

    @SerializedName("room_id")
    private String roomId;

    public boolean canEqual(Object obj) {
        return obj instanceof CmdLockAllMicBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CmdLockAllMicBean)) {
            return false;
        }
        CmdLockAllMicBean cmdLockAllMicBean = (CmdLockAllMicBean) obj;
        if (!cmdLockAllMicBean.canEqual(this)) {
            return false;
        }
        List<Integer> micNums = getMicNums();
        List<Integer> micNums2 = cmdLockAllMicBean.getMicNums();
        if (micNums != null ? !micNums.equals(micNums2) : micNums2 != null) {
            return false;
        }
        String roomId = getRoomId();
        String roomId2 = cmdLockAllMicBean.getRoomId();
        return roomId != null ? roomId.equals(roomId2) : roomId2 == null;
    }

    public List<Integer> getMicNums() {
        return this.micNums;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public int hashCode() {
        List<Integer> micNums = getMicNums();
        int iHashCode = micNums == null ? 43 : micNums.hashCode();
        String roomId = getRoomId();
        return ((iHashCode + 59) * 59) + (roomId != null ? roomId.hashCode() : 43);
    }

    public void setMicNums(List<Integer> list) {
        this.micNums = list;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public String toString() {
        return "CmdLockAllMicBean(micNums=" + getMicNums() + ", roomId=" + getRoomId() + ")";
    }
}
