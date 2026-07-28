package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import net.babycat.live.model.LiveRoomInfoBean;

/* JADX INFO: loaded from: classes4.dex */
public class StartPkBean {

    @SerializedName("gf_sign")
    private String gfSign;

    @SerializedName("lucky")
    private LuckyDTO lucky;

    @SerializedName("mic_amount_list")
    private List<MicAmountList> micAmountList;

    /* JADX INFO: renamed from: pk, reason: collision with root package name */
    @SerializedName("pk")
    private PkDTO f34906pk;

    @SerializedName("top3_list")
    private List<LiveRoomInfoBean.Top3List> top3List;

    @SerializedName("total_incomes")
    private Integer totalIncomes;

    public static class LuckyDTO {

        @SerializedName("act_type")
        private Integer actType;

        @SerializedName("lucky")
        private Integer lucky;

        @SerializedName("reward_coins")
        private Integer rewardCoins;

        public boolean canEqual(Object obj) {
            return obj instanceof LuckyDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LuckyDTO)) {
                return false;
            }
            LuckyDTO luckyDTO = (LuckyDTO) obj;
            if (!luckyDTO.canEqual(this)) {
                return false;
            }
            Integer lucky = getLucky();
            Integer lucky2 = luckyDTO.getLucky();
            if (lucky != null ? !lucky.equals(lucky2) : lucky2 != null) {
                return false;
            }
            Integer actType = getActType();
            Integer actType2 = luckyDTO.getActType();
            if (actType != null ? !actType.equals(actType2) : actType2 != null) {
                return false;
            }
            Integer rewardCoins = getRewardCoins();
            Integer rewardCoins2 = luckyDTO.getRewardCoins();
            return rewardCoins != null ? rewardCoins.equals(rewardCoins2) : rewardCoins2 == null;
        }

        public Integer getActType() {
            return this.actType;
        }

        public Integer getLucky() {
            return this.lucky;
        }

        public Integer getRewardCoins() {
            return this.rewardCoins;
        }

        public int hashCode() {
            Integer lucky = getLucky();
            int iHashCode = lucky == null ? 43 : lucky.hashCode();
            Integer actType = getActType();
            int iHashCode2 = ((iHashCode + 59) * 59) + (actType == null ? 43 : actType.hashCode());
            Integer rewardCoins = getRewardCoins();
            return (iHashCode2 * 59) + (rewardCoins != null ? rewardCoins.hashCode() : 43);
        }

        public void setActType(Integer num) {
            this.actType = num;
        }

        public void setLucky(Integer num) {
            this.lucky = num;
        }

        public void setRewardCoins(Integer num) {
            this.rewardCoins = num;
        }

        public String toString() {
            return "StartPkBean.LuckyDTO(lucky=" + getLucky() + ", actType=" + getActType() + ", rewardCoins=" + getRewardCoins() + ")";
        }
    }

    public static class MicAmountList {

        @SerializedName("in_gift_count_on_mic")
        private Integer inGiftCountOnMic;

        @SerializedName("mic_num")
        private Integer micNum;

        @SerializedName("pk_gift_count_on_mic")
        private Integer pkGiftCountOnMic;

        @SerializedName("user_id")
        private Integer userId;

        public boolean canEqual(Object obj) {
            return obj instanceof MicAmountList;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MicAmountList)) {
                return false;
            }
            MicAmountList micAmountList = (MicAmountList) obj;
            if (!micAmountList.canEqual(this)) {
                return false;
            }
            Integer userId = getUserId();
            Integer userId2 = micAmountList.getUserId();
            if (userId != null ? !userId.equals(userId2) : userId2 != null) {
                return false;
            }
            Integer micNum = getMicNum();
            Integer micNum2 = micAmountList.getMicNum();
            if (micNum != null ? !micNum.equals(micNum2) : micNum2 != null) {
                return false;
            }
            Integer inGiftCountOnMic = getInGiftCountOnMic();
            Integer inGiftCountOnMic2 = micAmountList.getInGiftCountOnMic();
            if (inGiftCountOnMic != null ? !inGiftCountOnMic.equals(inGiftCountOnMic2) : inGiftCountOnMic2 != null) {
                return false;
            }
            Integer pkGiftCountOnMic = getPkGiftCountOnMic();
            Integer pkGiftCountOnMic2 = micAmountList.getPkGiftCountOnMic();
            return pkGiftCountOnMic != null ? pkGiftCountOnMic.equals(pkGiftCountOnMic2) : pkGiftCountOnMic2 == null;
        }

        public Integer getInGiftCountOnMic() {
            return this.inGiftCountOnMic;
        }

        public Integer getMicNum() {
            return this.micNum;
        }

        public Integer getPkGiftCountOnMic() {
            return this.pkGiftCountOnMic;
        }

        public Integer getUserId() {
            return this.userId;
        }

        public int hashCode() {
            Integer userId = getUserId();
            int iHashCode = userId == null ? 43 : userId.hashCode();
            Integer micNum = getMicNum();
            int iHashCode2 = ((iHashCode + 59) * 59) + (micNum == null ? 43 : micNum.hashCode());
            Integer inGiftCountOnMic = getInGiftCountOnMic();
            int iHashCode3 = (iHashCode2 * 59) + (inGiftCountOnMic == null ? 43 : inGiftCountOnMic.hashCode());
            Integer pkGiftCountOnMic = getPkGiftCountOnMic();
            return (iHashCode3 * 59) + (pkGiftCountOnMic != null ? pkGiftCountOnMic.hashCode() : 43);
        }

        public void setInGiftCountOnMic(Integer num) {
            this.inGiftCountOnMic = num;
        }

        public void setMicNum(Integer num) {
            this.micNum = num;
        }

        public void setPkGiftCountOnMic(Integer num) {
            this.pkGiftCountOnMic = num;
        }

        public void setUserId(Integer num) {
            this.userId = num;
        }

        public String toString() {
            return "StartPkBean.MicAmountList(userId=" + getUserId() + ", micNum=" + getMicNum() + ", inGiftCountOnMic=" + getInGiftCountOnMic() + ", pkGiftCountOnMic=" + getPkGiftCountOnMic() + ")";
        }
    }

    public static class PkDTO {

        @SerializedName("blue")
        private BlueDTO blue;

        @SerializedName("end_time")
        private Integer endTime;

        @SerializedName("is_punish")
        private Integer isPunish;

        @SerializedName(TUIConstants.TUIChat.OWNER)
        private Integer owner;

        @SerializedName("pk_duration")
        private Integer pkDuration;

        @SerializedName("pk_status")
        private Integer pkStatus;

        @SerializedName("punish_end_time")
        private Integer punishEndTime;

        @SerializedName("punish_start_time")
        private Integer punishStartTime;

        @SerializedName("red")
        private RedDTO red;

        @SerializedName("start_time")
        private Integer startTime;

        @SerializedName("time_left")
        private Integer timeLeft;

        @SerializedName("win")
        private Integer win;

        public static class BlueDTO {

            @SerializedName("gift_num")
            private Integer giftNum;

            @SerializedName("gift_rate")
            private Integer giftRate;

            public boolean canEqual(Object obj) {
                return obj instanceof BlueDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof BlueDTO)) {
                    return false;
                }
                BlueDTO blueDTO = (BlueDTO) obj;
                if (!blueDTO.canEqual(this)) {
                    return false;
                }
                Integer giftNum = getGiftNum();
                Integer giftNum2 = blueDTO.getGiftNum();
                if (giftNum != null ? !giftNum.equals(giftNum2) : giftNum2 != null) {
                    return false;
                }
                Integer giftRate = getGiftRate();
                Integer giftRate2 = blueDTO.getGiftRate();
                return giftRate != null ? giftRate.equals(giftRate2) : giftRate2 == null;
            }

            public Integer getGiftNum() {
                return this.giftNum;
            }

            public Integer getGiftRate() {
                return this.giftRate;
            }

            public int hashCode() {
                Integer giftNum = getGiftNum();
                int iHashCode = giftNum == null ? 43 : giftNum.hashCode();
                Integer giftRate = getGiftRate();
                return ((iHashCode + 59) * 59) + (giftRate != null ? giftRate.hashCode() : 43);
            }

            public void setGiftNum(Integer num) {
                this.giftNum = num;
            }

            public void setGiftRate(Integer num) {
                this.giftRate = num;
            }

            public String toString() {
                return "StartPkBean.PkDTO.BlueDTO(giftNum=" + getGiftNum() + ", giftRate=" + getGiftRate() + ")";
            }
        }

        public static class RedDTO {

            @SerializedName("gift_num")
            private Integer giftNum;

            @SerializedName("gift_rate")
            private Integer giftRate;

            public boolean canEqual(Object obj) {
                return obj instanceof RedDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof RedDTO)) {
                    return false;
                }
                RedDTO redDTO = (RedDTO) obj;
                if (!redDTO.canEqual(this)) {
                    return false;
                }
                Integer giftNum = getGiftNum();
                Integer giftNum2 = redDTO.getGiftNum();
                if (giftNum != null ? !giftNum.equals(giftNum2) : giftNum2 != null) {
                    return false;
                }
                Integer giftRate = getGiftRate();
                Integer giftRate2 = redDTO.getGiftRate();
                return giftRate != null ? giftRate.equals(giftRate2) : giftRate2 == null;
            }

            public Integer getGiftNum() {
                return this.giftNum;
            }

            public Integer getGiftRate() {
                return this.giftRate;
            }

            public int hashCode() {
                Integer giftNum = getGiftNum();
                int iHashCode = giftNum == null ? 43 : giftNum.hashCode();
                Integer giftRate = getGiftRate();
                return ((iHashCode + 59) * 59) + (giftRate != null ? giftRate.hashCode() : 43);
            }

            public void setGiftNum(Integer num) {
                this.giftNum = num;
            }

            public void setGiftRate(Integer num) {
                this.giftRate = num;
            }

            public String toString() {
                return "StartPkBean.PkDTO.RedDTO(giftNum=" + getGiftNum() + ", giftRate=" + getGiftRate() + ")";
            }
        }

        public boolean canEqual(Object obj) {
            return obj instanceof PkDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PkDTO)) {
                return false;
            }
            PkDTO pkDTO = (PkDTO) obj;
            if (!pkDTO.canEqual(this)) {
                return false;
            }
            Integer owner = getOwner();
            Integer owner2 = pkDTO.getOwner();
            if (owner != null ? !owner.equals(owner2) : owner2 != null) {
                return false;
            }
            Integer isPunish = getIsPunish();
            Integer isPunish2 = pkDTO.getIsPunish();
            if (isPunish != null ? !isPunish.equals(isPunish2) : isPunish2 != null) {
                return false;
            }
            Integer pkDuration = getPkDuration();
            Integer pkDuration2 = pkDTO.getPkDuration();
            if (pkDuration != null ? !pkDuration.equals(pkDuration2) : pkDuration2 != null) {
                return false;
            }
            Integer pkStatus = getPkStatus();
            Integer pkStatus2 = pkDTO.getPkStatus();
            if (pkStatus != null ? !pkStatus.equals(pkStatus2) : pkStatus2 != null) {
                return false;
            }
            Integer startTime = getStartTime();
            Integer startTime2 = pkDTO.getStartTime();
            if (startTime != null ? !startTime.equals(startTime2) : startTime2 != null) {
                return false;
            }
            Integer endTime = getEndTime();
            Integer endTime2 = pkDTO.getEndTime();
            if (endTime != null ? !endTime.equals(endTime2) : endTime2 != null) {
                return false;
            }
            Integer timeLeft = getTimeLeft();
            Integer timeLeft2 = pkDTO.getTimeLeft();
            if (timeLeft != null ? !timeLeft.equals(timeLeft2) : timeLeft2 != null) {
                return false;
            }
            Integer punishStartTime = getPunishStartTime();
            Integer punishStartTime2 = pkDTO.getPunishStartTime();
            if (punishStartTime != null ? !punishStartTime.equals(punishStartTime2) : punishStartTime2 != null) {
                return false;
            }
            Integer punishEndTime = getPunishEndTime();
            Integer punishEndTime2 = pkDTO.getPunishEndTime();
            if (punishEndTime != null ? !punishEndTime.equals(punishEndTime2) : punishEndTime2 != null) {
                return false;
            }
            Integer win = getWin();
            Integer win2 = pkDTO.getWin();
            if (win != null ? !win.equals(win2) : win2 != null) {
                return false;
            }
            RedDTO red = getRed();
            RedDTO red2 = pkDTO.getRed();
            if (red != null ? !red.equals(red2) : red2 != null) {
                return false;
            }
            BlueDTO blue = getBlue();
            BlueDTO blue2 = pkDTO.getBlue();
            return blue != null ? blue.equals(blue2) : blue2 == null;
        }

        public BlueDTO getBlue() {
            return this.blue;
        }

        public Integer getEndTime() {
            return this.endTime;
        }

        public Integer getIsPunish() {
            return this.isPunish;
        }

        public Integer getOwner() {
            return this.owner;
        }

        public Integer getPkDuration() {
            return this.pkDuration;
        }

        public Integer getPkStatus() {
            return this.pkStatus;
        }

        public Integer getPunishEndTime() {
            return this.punishEndTime;
        }

        public Integer getPunishStartTime() {
            return this.punishStartTime;
        }

        public RedDTO getRed() {
            return this.red;
        }

        public Integer getStartTime() {
            return this.startTime;
        }

        public Integer getTimeLeft() {
            return this.timeLeft;
        }

        public Integer getWin() {
            return this.win;
        }

        public int hashCode() {
            Integer owner = getOwner();
            int iHashCode = owner == null ? 43 : owner.hashCode();
            Integer isPunish = getIsPunish();
            int iHashCode2 = ((iHashCode + 59) * 59) + (isPunish == null ? 43 : isPunish.hashCode());
            Integer pkDuration = getPkDuration();
            int iHashCode3 = (iHashCode2 * 59) + (pkDuration == null ? 43 : pkDuration.hashCode());
            Integer pkStatus = getPkStatus();
            int iHashCode4 = (iHashCode3 * 59) + (pkStatus == null ? 43 : pkStatus.hashCode());
            Integer startTime = getStartTime();
            int iHashCode5 = (iHashCode4 * 59) + (startTime == null ? 43 : startTime.hashCode());
            Integer endTime = getEndTime();
            int iHashCode6 = (iHashCode5 * 59) + (endTime == null ? 43 : endTime.hashCode());
            Integer timeLeft = getTimeLeft();
            int iHashCode7 = (iHashCode6 * 59) + (timeLeft == null ? 43 : timeLeft.hashCode());
            Integer punishStartTime = getPunishStartTime();
            int iHashCode8 = (iHashCode7 * 59) + (punishStartTime == null ? 43 : punishStartTime.hashCode());
            Integer punishEndTime = getPunishEndTime();
            int iHashCode9 = (iHashCode8 * 59) + (punishEndTime == null ? 43 : punishEndTime.hashCode());
            Integer win = getWin();
            int iHashCode10 = (iHashCode9 * 59) + (win == null ? 43 : win.hashCode());
            RedDTO red = getRed();
            int iHashCode11 = (iHashCode10 * 59) + (red == null ? 43 : red.hashCode());
            BlueDTO blue = getBlue();
            return (iHashCode11 * 59) + (blue != null ? blue.hashCode() : 43);
        }

        public void setBlue(BlueDTO blueDTO) {
            this.blue = blueDTO;
        }

        public void setEndTime(Integer num) {
            this.endTime = num;
        }

        public void setIsPunish(Integer num) {
            this.isPunish = num;
        }

        public void setOwner(Integer num) {
            this.owner = num;
        }

        public void setPkDuration(Integer num) {
            this.pkDuration = num;
        }

        public void setPkStatus(Integer num) {
            this.pkStatus = num;
        }

        public void setPunishEndTime(Integer num) {
            this.punishEndTime = num;
        }

        public void setPunishStartTime(Integer num) {
            this.punishStartTime = num;
        }

        public void setRed(RedDTO redDTO) {
            this.red = redDTO;
        }

        public void setStartTime(Integer num) {
            this.startTime = num;
        }

        public void setTimeLeft(Integer num) {
            this.timeLeft = num;
        }

        public void setWin(Integer num) {
            this.win = num;
        }

        public String toString() {
            return "StartPkBean.PkDTO(owner=" + getOwner() + ", red=" + getRed() + ", blue=" + getBlue() + ", isPunish=" + getIsPunish() + ", pkDuration=" + getPkDuration() + ", pkStatus=" + getPkStatus() + ", startTime=" + getStartTime() + ", endTime=" + getEndTime() + ", timeLeft=" + getTimeLeft() + ", punishStartTime=" + getPunishStartTime() + ", punishEndTime=" + getPunishEndTime() + ", win=" + getWin() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof StartPkBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartPkBean)) {
            return false;
        }
        StartPkBean startPkBean = (StartPkBean) obj;
        if (!startPkBean.canEqual(this)) {
            return false;
        }
        Integer totalIncomes = getTotalIncomes();
        Integer totalIncomes2 = startPkBean.getTotalIncomes();
        if (totalIncomes != null ? !totalIncomes.equals(totalIncomes2) : totalIncomes2 != null) {
            return false;
        }
        String gfSign = getGfSign();
        String gfSign2 = startPkBean.getGfSign();
        if (gfSign != null ? !gfSign.equals(gfSign2) : gfSign2 != null) {
            return false;
        }
        PkDTO pk2 = getPk();
        PkDTO pk3 = startPkBean.getPk();
        if (pk2 != null ? !pk2.equals(pk3) : pk3 != null) {
            return false;
        }
        LuckyDTO lucky = getLucky();
        LuckyDTO lucky2 = startPkBean.getLucky();
        if (lucky != null ? !lucky.equals(lucky2) : lucky2 != null) {
            return false;
        }
        List<MicAmountList> micAmountList = getMicAmountList();
        List<MicAmountList> micAmountList2 = startPkBean.getMicAmountList();
        if (micAmountList != null ? !micAmountList.equals(micAmountList2) : micAmountList2 != null) {
            return false;
        }
        List<LiveRoomInfoBean.Top3List> top3List = getTop3List();
        List<LiveRoomInfoBean.Top3List> top3List2 = startPkBean.getTop3List();
        return top3List != null ? top3List.equals(top3List2) : top3List2 == null;
    }

    public String getGfSign() {
        return this.gfSign;
    }

    public LuckyDTO getLucky() {
        return this.lucky;
    }

    public List<MicAmountList> getMicAmountList() {
        return this.micAmountList;
    }

    public PkDTO getPk() {
        return this.f34906pk;
    }

    public List<LiveRoomInfoBean.Top3List> getTop3List() {
        return this.top3List;
    }

    public Integer getTotalIncomes() {
        return this.totalIncomes;
    }

    public int hashCode() {
        Integer totalIncomes = getTotalIncomes();
        int iHashCode = totalIncomes == null ? 43 : totalIncomes.hashCode();
        String gfSign = getGfSign();
        int iHashCode2 = ((iHashCode + 59) * 59) + (gfSign == null ? 43 : gfSign.hashCode());
        PkDTO pk2 = getPk();
        int iHashCode3 = (iHashCode2 * 59) + (pk2 == null ? 43 : pk2.hashCode());
        LuckyDTO lucky = getLucky();
        int iHashCode4 = (iHashCode3 * 59) + (lucky == null ? 43 : lucky.hashCode());
        List<MicAmountList> micAmountList = getMicAmountList();
        int iHashCode5 = (iHashCode4 * 59) + (micAmountList == null ? 43 : micAmountList.hashCode());
        List<LiveRoomInfoBean.Top3List> top3List = getTop3List();
        return (iHashCode5 * 59) + (top3List != null ? top3List.hashCode() : 43);
    }

    public void setGfSign(String str) {
        this.gfSign = str;
    }

    public void setLucky(LuckyDTO luckyDTO) {
        this.lucky = luckyDTO;
    }

    public void setMicAmountList(List<MicAmountList> list) {
        this.micAmountList = list;
    }

    public void setPk(PkDTO pkDTO) {
        this.f34906pk = pkDTO;
    }

    public void setTop3List(List<LiveRoomInfoBean.Top3List> list) {
        this.top3List = list;
    }

    public void setTotalIncomes(Integer num) {
        this.totalIncomes = num;
    }

    public String toString() {
        return "StartPkBean(totalIncomes=" + getTotalIncomes() + ", gfSign=" + getGfSign() + ", pk=" + getPk() + ", lucky=" + getLucky() + ", micAmountList=" + getMicAmountList() + ", top3List=" + getTop3List() + ")";
    }
}
