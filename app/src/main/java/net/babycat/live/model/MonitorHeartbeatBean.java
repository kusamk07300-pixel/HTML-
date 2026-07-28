package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class MonitorHeartbeatBean {

    @SerializedName("countdown")
    private String countdown;

    @SerializedName("likes")
    private int likes;

    @SerializedName("room_id")
    private String roomId;

    public boolean canEqual(Object obj) {
        return obj instanceof MonitorHeartbeatBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MonitorHeartbeatBean)) {
            return false;
        }
        MonitorHeartbeatBean monitorHeartbeatBean = (MonitorHeartbeatBean) obj;
        if (!monitorHeartbeatBean.canEqual(this) || getLikes() != monitorHeartbeatBean.getLikes()) {
            return false;
        }
        String roomId = getRoomId();
        String roomId2 = monitorHeartbeatBean.getRoomId();
        if (roomId != null ? !roomId.equals(roomId2) : roomId2 != null) {
            return false;
        }
        String countdown = getCountdown();
        String countdown2 = monitorHeartbeatBean.getCountdown();
        return countdown != null ? countdown.equals(countdown2) : countdown2 == null;
    }

    public String getCountdown() {
        return this.countdown;
    }

    public int getLikes() {
        return this.likes;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public int hashCode() {
        int likes = getLikes() + 59;
        String roomId = getRoomId();
        int iHashCode = (likes * 59) + (roomId == null ? 43 : roomId.hashCode());
        String countdown = getCountdown();
        return (iHashCode * 59) + (countdown != null ? countdown.hashCode() : 43);
    }

    public void setCountdown(String str) {
        this.countdown = str;
    }

    public void setLikes(int i10) {
        this.likes = i10;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public String toString() {
        return "MonitorHeartbeatBean(roomId=" + getRoomId() + ", countdown=" + getCountdown() + ", likes=" + getLikes() + ")";
    }
}
