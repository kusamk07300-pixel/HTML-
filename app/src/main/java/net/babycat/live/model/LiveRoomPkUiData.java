package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class LiveRoomPkUiData {

    @SerializedName("end_time")
    private Integer endTime;

    @SerializedName("gift_rate")
    private Integer giftRate;

    @SerializedName("is_punish")
    private Integer isPunish;

    @SerializedName("pk_duration")
    private Integer pkDuration;

    @SerializedName("pk_gift_count")
    private Integer pkGiftCount;

    @SerializedName("pk_status")
    private Integer pkStatus;

    @SerializedName("punish_end_time")
    private Integer punishEndTime;

    @SerializedName("punish_time")
    private Integer punishTime;

    @SerializedName("room_id")
    private String roomId;

    @SerializedName("start_time")
    private Integer startTime;

    @SerializedName("time_left")
    private Integer timeLeft;

    @SerializedName("to_pk_gift_count")
    private Integer toPkGiftCount;

    @SerializedName("to_room_id")
    private Integer toRoomId;

    @SerializedName("to_top3")
    private List<listData> toTop3;

    @SerializedName("to_user_avatar")
    private String toUserAvatar;

    @SerializedName("to_user_id")
    private Integer toUserId;

    @SerializedName("to_user_nickname")
    private String toUserNickname;

    @SerializedName("top3")
    private List<listData> top3;

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("win")
    private Integer win;

    public static class listData {

        @SerializedName("avatar")
        private String avatar;

        @SerializedName("nickname")
        private String nickname;

        @SerializedName("score")
        private String score;

        @SerializedName("uid")
        private Integer uid;

        public boolean canEqual(Object obj) {
            return obj instanceof listData;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof listData)) {
                return false;
            }
            listData listdata = (listData) obj;
            if (!listdata.canEqual(this)) {
                return false;
            }
            Integer uid = getUid();
            Integer uid2 = listdata.getUid();
            if (uid != null ? !uid.equals(uid2) : uid2 != null) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = listdata.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = listdata.getAvatar();
            if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
                return false;
            }
            String score = getScore();
            String score2 = listdata.getScore();
            return score != null ? score.equals(score2) : score2 == null;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public String getNickname() {
            return this.nickname;
        }

        public String getScore() {
            return this.score;
        }

        public Integer getUid() {
            return this.uid;
        }

        public int hashCode() {
            Integer uid = getUid();
            int iHashCode = uid == null ? 43 : uid.hashCode();
            String nickname = getNickname();
            int iHashCode2 = ((iHashCode + 59) * 59) + (nickname == null ? 43 : nickname.hashCode());
            String avatar = getAvatar();
            int iHashCode3 = (iHashCode2 * 59) + (avatar == null ? 43 : avatar.hashCode());
            String score = getScore();
            return (iHashCode3 * 59) + (score != null ? score.hashCode() : 43);
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public void setScore(String str) {
            this.score = str;
        }

        public void setUid(Integer num) {
            this.uid = num;
        }

        public String toString() {
            return "LiveRoomPkUiData.listData(uid=" + getUid() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", score=" + getScore() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof LiveRoomPkUiData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveRoomPkUiData)) {
            return false;
        }
        LiveRoomPkUiData liveRoomPkUiData = (LiveRoomPkUiData) obj;
        if (!liveRoomPkUiData.canEqual(this)) {
            return false;
        }
        Integer userId = getUserId();
        Integer userId2 = liveRoomPkUiData.getUserId();
        if (userId != null ? !userId.equals(userId2) : userId2 != null) {
            return false;
        }
        Integer toRoomId = getToRoomId();
        Integer toRoomId2 = liveRoomPkUiData.getToRoomId();
        if (toRoomId != null ? !toRoomId.equals(toRoomId2) : toRoomId2 != null) {
            return false;
        }
        Integer toUserId = getToUserId();
        Integer toUserId2 = liveRoomPkUiData.getToUserId();
        if (toUserId != null ? !toUserId.equals(toUserId2) : toUserId2 != null) {
            return false;
        }
        Integer pkGiftCount = getPkGiftCount();
        Integer pkGiftCount2 = liveRoomPkUiData.getPkGiftCount();
        if (pkGiftCount != null ? !pkGiftCount.equals(pkGiftCount2) : pkGiftCount2 != null) {
            return false;
        }
        Integer toPkGiftCount = getToPkGiftCount();
        Integer toPkGiftCount2 = liveRoomPkUiData.getToPkGiftCount();
        if (toPkGiftCount != null ? !toPkGiftCount.equals(toPkGiftCount2) : toPkGiftCount2 != null) {
            return false;
        }
        Integer isPunish = getIsPunish();
        Integer isPunish2 = liveRoomPkUiData.getIsPunish();
        if (isPunish != null ? !isPunish.equals(isPunish2) : isPunish2 != null) {
            return false;
        }
        Integer giftRate = getGiftRate();
        Integer giftRate2 = liveRoomPkUiData.getGiftRate();
        if (giftRate != null ? !giftRate.equals(giftRate2) : giftRate2 != null) {
            return false;
        }
        Integer pkDuration = getPkDuration();
        Integer pkDuration2 = liveRoomPkUiData.getPkDuration();
        if (pkDuration != null ? !pkDuration.equals(pkDuration2) : pkDuration2 != null) {
            return false;
        }
        Integer pkStatus = getPkStatus();
        Integer pkStatus2 = liveRoomPkUiData.getPkStatus();
        if (pkStatus != null ? !pkStatus.equals(pkStatus2) : pkStatus2 != null) {
            return false;
        }
        Integer startTime = getStartTime();
        Integer startTime2 = liveRoomPkUiData.getStartTime();
        if (startTime != null ? !startTime.equals(startTime2) : startTime2 != null) {
            return false;
        }
        Integer endTime = getEndTime();
        Integer endTime2 = liveRoomPkUiData.getEndTime();
        if (endTime != null ? !endTime.equals(endTime2) : endTime2 != null) {
            return false;
        }
        Integer timeLeft = getTimeLeft();
        Integer timeLeft2 = liveRoomPkUiData.getTimeLeft();
        if (timeLeft != null ? !timeLeft.equals(timeLeft2) : timeLeft2 != null) {
            return false;
        }
        Integer punishTime = getPunishTime();
        Integer punishTime2 = liveRoomPkUiData.getPunishTime();
        if (punishTime != null ? !punishTime.equals(punishTime2) : punishTime2 != null) {
            return false;
        }
        Integer punishEndTime = getPunishEndTime();
        Integer punishEndTime2 = liveRoomPkUiData.getPunishEndTime();
        if (punishEndTime != null ? !punishEndTime.equals(punishEndTime2) : punishEndTime2 != null) {
            return false;
        }
        Integer win = getWin();
        Integer win2 = liveRoomPkUiData.getWin();
        if (win != null ? !win.equals(win2) : win2 != null) {
            return false;
        }
        String roomId = getRoomId();
        String roomId2 = liveRoomPkUiData.getRoomId();
        if (roomId != null ? !roomId.equals(roomId2) : roomId2 != null) {
            return false;
        }
        String toUserNickname = getToUserNickname();
        String toUserNickname2 = liveRoomPkUiData.getToUserNickname();
        if (toUserNickname != null ? !toUserNickname.equals(toUserNickname2) : toUserNickname2 != null) {
            return false;
        }
        String toUserAvatar = getToUserAvatar();
        String toUserAvatar2 = liveRoomPkUiData.getToUserAvatar();
        if (toUserAvatar != null ? !toUserAvatar.equals(toUserAvatar2) : toUserAvatar2 != null) {
            return false;
        }
        List<listData> top3 = getTop3();
        List<listData> top32 = liveRoomPkUiData.getTop3();
        if (top3 != null ? !top3.equals(top32) : top32 != null) {
            return false;
        }
        List<listData> toTop3 = getToTop3();
        List<listData> toTop32 = liveRoomPkUiData.getToTop3();
        return toTop3 != null ? toTop3.equals(toTop32) : toTop32 == null;
    }

    public Integer getEndTime() {
        return this.endTime;
    }

    public Integer getGiftRate() {
        return this.giftRate;
    }

    public Integer getIsPunish() {
        return this.isPunish;
    }

    public Integer getPkDuration() {
        return this.pkDuration;
    }

    public Integer getPkGiftCount() {
        return this.pkGiftCount;
    }

    public Integer getPkStatus() {
        return this.pkStatus;
    }

    public Integer getPunishEndTime() {
        return this.punishEndTime;
    }

    public Integer getPunishTime() {
        return this.punishTime;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public Integer getStartTime() {
        return this.startTime;
    }

    public Integer getTimeLeft() {
        return this.timeLeft;
    }

    public Integer getToPkGiftCount() {
        return this.toPkGiftCount;
    }

    public Integer getToRoomId() {
        return this.toRoomId;
    }

    public List<listData> getToTop3() {
        return this.toTop3;
    }

    public String getToUserAvatar() {
        return this.toUserAvatar;
    }

    public Integer getToUserId() {
        return this.toUserId;
    }

    public String getToUserNickname() {
        return this.toUserNickname;
    }

    public List<listData> getTop3() {
        return this.top3;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public Integer getWin() {
        return this.win;
    }

    public int hashCode() {
        Integer userId = getUserId();
        int iHashCode = userId == null ? 43 : userId.hashCode();
        Integer toRoomId = getToRoomId();
        int iHashCode2 = ((iHashCode + 59) * 59) + (toRoomId == null ? 43 : toRoomId.hashCode());
        Integer toUserId = getToUserId();
        int iHashCode3 = (iHashCode2 * 59) + (toUserId == null ? 43 : toUserId.hashCode());
        Integer pkGiftCount = getPkGiftCount();
        int iHashCode4 = (iHashCode3 * 59) + (pkGiftCount == null ? 43 : pkGiftCount.hashCode());
        Integer toPkGiftCount = getToPkGiftCount();
        int iHashCode5 = (iHashCode4 * 59) + (toPkGiftCount == null ? 43 : toPkGiftCount.hashCode());
        Integer isPunish = getIsPunish();
        int iHashCode6 = (iHashCode5 * 59) + (isPunish == null ? 43 : isPunish.hashCode());
        Integer giftRate = getGiftRate();
        int iHashCode7 = (iHashCode6 * 59) + (giftRate == null ? 43 : giftRate.hashCode());
        Integer pkDuration = getPkDuration();
        int iHashCode8 = (iHashCode7 * 59) + (pkDuration == null ? 43 : pkDuration.hashCode());
        Integer pkStatus = getPkStatus();
        int iHashCode9 = (iHashCode8 * 59) + (pkStatus == null ? 43 : pkStatus.hashCode());
        Integer startTime = getStartTime();
        int iHashCode10 = (iHashCode9 * 59) + (startTime == null ? 43 : startTime.hashCode());
        Integer endTime = getEndTime();
        int iHashCode11 = (iHashCode10 * 59) + (endTime == null ? 43 : endTime.hashCode());
        Integer timeLeft = getTimeLeft();
        int iHashCode12 = (iHashCode11 * 59) + (timeLeft == null ? 43 : timeLeft.hashCode());
        Integer punishTime = getPunishTime();
        int iHashCode13 = (iHashCode12 * 59) + (punishTime == null ? 43 : punishTime.hashCode());
        Integer punishEndTime = getPunishEndTime();
        int iHashCode14 = (iHashCode13 * 59) + (punishEndTime == null ? 43 : punishEndTime.hashCode());
        Integer win = getWin();
        int iHashCode15 = (iHashCode14 * 59) + (win == null ? 43 : win.hashCode());
        String roomId = getRoomId();
        int iHashCode16 = (iHashCode15 * 59) + (roomId == null ? 43 : roomId.hashCode());
        String toUserNickname = getToUserNickname();
        int iHashCode17 = (iHashCode16 * 59) + (toUserNickname == null ? 43 : toUserNickname.hashCode());
        String toUserAvatar = getToUserAvatar();
        int iHashCode18 = (iHashCode17 * 59) + (toUserAvatar == null ? 43 : toUserAvatar.hashCode());
        List<listData> top3 = getTop3();
        int iHashCode19 = (iHashCode18 * 59) + (top3 == null ? 43 : top3.hashCode());
        List<listData> toTop3 = getToTop3();
        return (iHashCode19 * 59) + (toTop3 != null ? toTop3.hashCode() : 43);
    }

    public void setEndTime(Integer num) {
        this.endTime = num;
    }

    public void setGiftRate(Integer num) {
        this.giftRate = num;
    }

    public void setIsPunish(Integer num) {
        this.isPunish = num;
    }

    public void setPkDuration(Integer num) {
        this.pkDuration = num;
    }

    public void setPkGiftCount(Integer num) {
        this.pkGiftCount = num;
    }

    public void setPkStatus(Integer num) {
        this.pkStatus = num;
    }

    public void setPunishEndTime(Integer num) {
        this.punishEndTime = num;
    }

    public void setPunishTime(Integer num) {
        this.punishTime = num;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public void setStartTime(Integer num) {
        this.startTime = num;
    }

    public void setTimeLeft(Integer num) {
        this.timeLeft = num;
    }

    public void setToPkGiftCount(Integer num) {
        this.toPkGiftCount = num;
    }

    public void setToRoomId(Integer num) {
        this.toRoomId = num;
    }

    public void setToTop3(List<listData> list) {
        this.toTop3 = list;
    }

    public void setToUserAvatar(String str) {
        this.toUserAvatar = str;
    }

    public void setToUserId(Integer num) {
        this.toUserId = num;
    }

    public void setToUserNickname(String str) {
        this.toUserNickname = str;
    }

    public void setTop3(List<listData> list) {
        this.top3 = list;
    }

    public void setUserId(Integer num) {
        this.userId = num;
    }

    public void setWin(Integer num) {
        this.win = num;
    }

    public String toString() {
        return "LiveRoomPkUiData(userId=" + getUserId() + ", roomId=" + getRoomId() + ", toUserNickname=" + getToUserNickname() + ", toUserAvatar=" + getToUserAvatar() + ", toRoomId=" + getToRoomId() + ", toUserId=" + getToUserId() + ", pkGiftCount=" + getPkGiftCount() + ", toPkGiftCount=" + getToPkGiftCount() + ", isPunish=" + getIsPunish() + ", giftRate=" + getGiftRate() + ", pkDuration=" + getPkDuration() + ", pkStatus=" + getPkStatus() + ", startTime=" + getStartTime() + ", endTime=" + getEndTime() + ", timeLeft=" + getTimeLeft() + ", punishTime=" + getPunishTime() + ", punishEndTime=" + getPunishEndTime() + ", win=" + getWin() + ", top3=" + getTop3() + ", toTop3=" + getToTop3() + ")";
    }
}
