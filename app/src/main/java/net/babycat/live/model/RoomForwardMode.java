package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import com.tencent.qcloud.tuicore.TUIConstants;

/* JADX INFO: loaded from: classes4.dex */
public class RoomForwardMode {

    @SerializedName("muteAudio")
    private boolean muteAudio;

    @SerializedName("strRoomId")
    private String strRoomId;

    @SerializedName(TUIConstants.TUILive.USER_ID)
    private String userId;

    public boolean canEqual(Object obj) {
        return obj instanceof RoomForwardMode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoomForwardMode)) {
            return false;
        }
        RoomForwardMode roomForwardMode = (RoomForwardMode) obj;
        if (!roomForwardMode.canEqual(this) || isMuteAudio() != roomForwardMode.isMuteAudio()) {
            return false;
        }
        String strRoomId = getStrRoomId();
        String strRoomId2 = roomForwardMode.getStrRoomId();
        if (strRoomId != null ? !strRoomId.equals(strRoomId2) : strRoomId2 != null) {
            return false;
        }
        String userId = getUserId();
        String userId2 = roomForwardMode.getUserId();
        return userId != null ? userId.equals(userId2) : userId2 == null;
    }

    public String getStrRoomId() {
        return this.strRoomId;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int i10 = isMuteAudio() ? 79 : 97;
        String strRoomId = getStrRoomId();
        int iHashCode = ((i10 + 59) * 59) + (strRoomId == null ? 43 : strRoomId.hashCode());
        String userId = getUserId();
        return (iHashCode * 59) + (userId != null ? userId.hashCode() : 43);
    }

    public boolean isMuteAudio() {
        return this.muteAudio;
    }

    public void setMuteAudio(boolean z10) {
        this.muteAudio = z10;
    }

    public void setStrRoomId(String str) {
        this.strRoomId = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String toString() {
        return "RoomForwardMode(strRoomId=" + getStrRoomId() + ", userId=" + getUserId() + ", muteAudio=" + isMuteAudio() + ")";
    }
}
