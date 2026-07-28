package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class CloseRoomBean implements Serializable {

    @SerializedName("cover")
    private String cover;

    @SerializedName("income_count")
    private Integer incomeCount;

    @SerializedName("like_count")
    private Integer likeCount;

    @SerializedName("master_uid")
    private Integer masterUid;

    @SerializedName("nickname")
    private String nickname;

    @SerializedName("notice_msg")
    private String noticeMsg;

    @SerializedName("online_time")
    private String onlineTime;

    @SerializedName("room_id")
    private String roomId;

    @SerializedName("user_count")
    private Integer userCount;

    public boolean canEqual(Object obj) {
        return obj instanceof CloseRoomBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CloseRoomBean)) {
            return false;
        }
        CloseRoomBean closeRoomBean = (CloseRoomBean) obj;
        if (!closeRoomBean.canEqual(this)) {
            return false;
        }
        Integer masterUid = getMasterUid();
        Integer masterUid2 = closeRoomBean.getMasterUid();
        if (masterUid != null ? !masterUid.equals(masterUid2) : masterUid2 != null) {
            return false;
        }
        Integer userCount = getUserCount();
        Integer userCount2 = closeRoomBean.getUserCount();
        if (userCount != null ? !userCount.equals(userCount2) : userCount2 != null) {
            return false;
        }
        Integer likeCount = getLikeCount();
        Integer likeCount2 = closeRoomBean.getLikeCount();
        if (likeCount != null ? !likeCount.equals(likeCount2) : likeCount2 != null) {
            return false;
        }
        Integer incomeCount = getIncomeCount();
        Integer incomeCount2 = closeRoomBean.getIncomeCount();
        if (incomeCount != null ? !incomeCount.equals(incomeCount2) : incomeCount2 != null) {
            return false;
        }
        String roomId = getRoomId();
        String roomId2 = closeRoomBean.getRoomId();
        if (roomId != null ? !roomId.equals(roomId2) : roomId2 != null) {
            return false;
        }
        String cover = getCover();
        String cover2 = closeRoomBean.getCover();
        if (cover != null ? !cover.equals(cover2) : cover2 != null) {
            return false;
        }
        String nickname = getNickname();
        String nickname2 = closeRoomBean.getNickname();
        if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
            return false;
        }
        String onlineTime = getOnlineTime();
        String onlineTime2 = closeRoomBean.getOnlineTime();
        if (onlineTime != null ? !onlineTime.equals(onlineTime2) : onlineTime2 != null) {
            return false;
        }
        String noticeMsg = getNoticeMsg();
        String noticeMsg2 = closeRoomBean.getNoticeMsg();
        return noticeMsg != null ? noticeMsg.equals(noticeMsg2) : noticeMsg2 == null;
    }

    public String getCover() {
        return this.cover;
    }

    public Integer getIncomeCount() {
        return this.incomeCount;
    }

    public Integer getLikeCount() {
        return this.likeCount;
    }

    public Integer getMasterUid() {
        return this.masterUid;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getNoticeMsg() {
        return this.noticeMsg;
    }

    public String getOnlineTime() {
        return this.onlineTime;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public Integer getUserCount() {
        return this.userCount;
    }

    public int hashCode() {
        Integer masterUid = getMasterUid();
        int iHashCode = masterUid == null ? 43 : masterUid.hashCode();
        Integer userCount = getUserCount();
        int iHashCode2 = ((iHashCode + 59) * 59) + (userCount == null ? 43 : userCount.hashCode());
        Integer likeCount = getLikeCount();
        int iHashCode3 = (iHashCode2 * 59) + (likeCount == null ? 43 : likeCount.hashCode());
        Integer incomeCount = getIncomeCount();
        int iHashCode4 = (iHashCode3 * 59) + (incomeCount == null ? 43 : incomeCount.hashCode());
        String roomId = getRoomId();
        int iHashCode5 = (iHashCode4 * 59) + (roomId == null ? 43 : roomId.hashCode());
        String cover = getCover();
        int iHashCode6 = (iHashCode5 * 59) + (cover == null ? 43 : cover.hashCode());
        String nickname = getNickname();
        int iHashCode7 = (iHashCode6 * 59) + (nickname == null ? 43 : nickname.hashCode());
        String onlineTime = getOnlineTime();
        int iHashCode8 = (iHashCode7 * 59) + (onlineTime == null ? 43 : onlineTime.hashCode());
        String noticeMsg = getNoticeMsg();
        return (iHashCode8 * 59) + (noticeMsg != null ? noticeMsg.hashCode() : 43);
    }

    public void setCover(String str) {
        this.cover = str;
    }

    public void setIncomeCount(Integer num) {
        this.incomeCount = num;
    }

    public void setLikeCount(Integer num) {
        this.likeCount = num;
    }

    public void setMasterUid(Integer num) {
        this.masterUid = num;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setNoticeMsg(String str) {
        this.noticeMsg = str;
    }

    public void setOnlineTime(String str) {
        this.onlineTime = str;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public void setUserCount(Integer num) {
        this.userCount = num;
    }

    public String toString() {
        return "CloseRoomBean(roomId=" + getRoomId() + ", masterUid=" + getMasterUid() + ", cover=" + getCover() + ", nickname=" + getNickname() + ", userCount=" + getUserCount() + ", likeCount=" + getLikeCount() + ", incomeCount=" + getIncomeCount() + ", onlineTime=" + getOnlineTime() + ", noticeMsg=" + getNoticeMsg() + ")";
    }
}
