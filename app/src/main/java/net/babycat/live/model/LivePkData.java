package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class LivePkData {

    @SerializedName("auto_startpk")
    private int autoStartpk;

    @SerializedName("content")
    private String content;

    @SerializedName("duration")
    private int duration;

    @SerializedName("live_roomid")
    private String liveRoomid;

    @SerializedName("to_uid")
    private String toUid;

    @SerializedName("user_info")
    private UserInfoDataBean userInfo;

    public LivePkData() {
    }

    public boolean canEqual(Object obj) {
        return obj instanceof LivePkData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LivePkData)) {
            return false;
        }
        LivePkData livePkData = (LivePkData) obj;
        if (!livePkData.canEqual(this) || getDuration() != livePkData.getDuration() || getAutoStartpk() != livePkData.getAutoStartpk()) {
            return false;
        }
        UserInfoDataBean userInfo = getUserInfo();
        UserInfoDataBean userInfo2 = livePkData.getUserInfo();
        if (userInfo != null ? !userInfo.equals(userInfo2) : userInfo2 != null) {
            return false;
        }
        String liveRoomid = getLiveRoomid();
        String liveRoomid2 = livePkData.getLiveRoomid();
        if (liveRoomid != null ? !liveRoomid.equals(liveRoomid2) : liveRoomid2 != null) {
            return false;
        }
        String content = getContent();
        String content2 = livePkData.getContent();
        if (content != null ? !content.equals(content2) : content2 != null) {
            return false;
        }
        String toUid = getToUid();
        String toUid2 = livePkData.getToUid();
        return toUid != null ? toUid.equals(toUid2) : toUid2 == null;
    }

    public int getAutoStartpk() {
        return this.autoStartpk;
    }

    public String getContent() {
        return this.content;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getLiveRoomid() {
        return this.liveRoomid;
    }

    public String getToUid() {
        return this.toUid;
    }

    public UserInfoDataBean getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        int duration = ((getDuration() + 59) * 59) + getAutoStartpk();
        UserInfoDataBean userInfo = getUserInfo();
        int iHashCode = (duration * 59) + (userInfo == null ? 43 : userInfo.hashCode());
        String liveRoomid = getLiveRoomid();
        int iHashCode2 = (iHashCode * 59) + (liveRoomid == null ? 43 : liveRoomid.hashCode());
        String content = getContent();
        int iHashCode3 = (iHashCode2 * 59) + (content == null ? 43 : content.hashCode());
        String toUid = getToUid();
        return (iHashCode3 * 59) + (toUid != null ? toUid.hashCode() : 43);
    }

    public void setAutoStartpk(int i10) {
        this.autoStartpk = i10;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDuration(int i10) {
        this.duration = i10;
    }

    public void setLiveRoomid(String str) {
        this.liveRoomid = str;
    }

    public void setToUid(String str) {
        this.toUid = str;
    }

    public void setUserInfo(UserInfoDataBean userInfoDataBean) {
        this.userInfo = userInfoDataBean;
    }

    public String toString() {
        return "LivePkData(userInfo=" + getUserInfo() + ", liveRoomid=" + getLiveRoomid() + ", duration=" + getDuration() + ", autoStartpk=" + getAutoStartpk() + ", content=" + getContent() + ", toUid=" + getToUid() + ")";
    }

    public LivePkData(UserInfoDataBean userInfoDataBean, String str, int i10, int i11, String str2) {
        this.userInfo = userInfoDataBean;
        this.liveRoomid = str;
        this.duration = i10;
        this.autoStartpk = i11;
        this.content = str2;
    }
}
