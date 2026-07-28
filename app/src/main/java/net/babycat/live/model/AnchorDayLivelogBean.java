package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class AnchorDayLivelogBean {

    @SerializedName("diamond")
    String diamond;

    @SerializedName("diamond_salary")
    String diamondSalary;

    @SerializedName("duration")
    String duration;

    @SerializedName("gold_salary")
    String goldSalary;

    @SerializedName("level")
    String level;

    @SerializedName("on_mic_time")
    String on_mic_time;

    @SerializedName("online_days")
    String onlineDays;

    @SerializedName("owner_duration")
    String owner_duration;

    @SerializedName("ticket")
    String ticket;

    @SerializedName("total_salary")
    String totalSalary;

    @SerializedName("total_diamond")
    String total_diamond;

    /* JADX INFO: renamed from: ym, reason: collision with root package name */
    @SerializedName("ym")
    String f34798ym;

    public boolean canEqual(Object obj) {
        return obj instanceof AnchorDayLivelogBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnchorDayLivelogBean)) {
            return false;
        }
        AnchorDayLivelogBean anchorDayLivelogBean = (AnchorDayLivelogBean) obj;
        if (!anchorDayLivelogBean.canEqual(this)) {
            return false;
        }
        String totalSalary = getTotalSalary();
        String totalSalary2 = anchorDayLivelogBean.getTotalSalary();
        if (totalSalary != null ? !totalSalary.equals(totalSalary2) : totalSalary2 != null) {
            return false;
        }
        String diamond = getDiamond();
        String diamond2 = anchorDayLivelogBean.getDiamond();
        if (diamond != null ? !diamond.equals(diamond2) : diamond2 != null) {
            return false;
        }
        String level = getLevel();
        String level2 = anchorDayLivelogBean.getLevel();
        if (level != null ? !level.equals(level2) : level2 != null) {
            return false;
        }
        String total_diamond = getTotal_diamond();
        String total_diamond2 = anchorDayLivelogBean.getTotal_diamond();
        if (total_diamond != null ? !total_diamond.equals(total_diamond2) : total_diamond2 != null) {
            return false;
        }
        String diamondSalary = getDiamondSalary();
        String diamondSalary2 = anchorDayLivelogBean.getDiamondSalary();
        if (diamondSalary != null ? !diamondSalary.equals(diamondSalary2) : diamondSalary2 != null) {
            return false;
        }
        String goldSalary = getGoldSalary();
        String goldSalary2 = anchorDayLivelogBean.getGoldSalary();
        if (goldSalary != null ? !goldSalary.equals(goldSalary2) : goldSalary2 != null) {
            return false;
        }
        String onlineDays = getOnlineDays();
        String onlineDays2 = anchorDayLivelogBean.getOnlineDays();
        if (onlineDays != null ? !onlineDays.equals(onlineDays2) : onlineDays2 != null) {
            return false;
        }
        String on_mic_time = getOn_mic_time();
        String on_mic_time2 = anchorDayLivelogBean.getOn_mic_time();
        if (on_mic_time != null ? !on_mic_time.equals(on_mic_time2) : on_mic_time2 != null) {
            return false;
        }
        String ym2 = getYm();
        String ym3 = anchorDayLivelogBean.getYm();
        if (ym2 != null ? !ym2.equals(ym3) : ym3 != null) {
            return false;
        }
        String ticket = getTicket();
        String ticket2 = anchorDayLivelogBean.getTicket();
        if (ticket != null ? !ticket.equals(ticket2) : ticket2 != null) {
            return false;
        }
        String duration = getDuration();
        String duration2 = anchorDayLivelogBean.getDuration();
        if (duration != null ? !duration.equals(duration2) : duration2 != null) {
            return false;
        }
        String owner_duration = getOwner_duration();
        String owner_duration2 = anchorDayLivelogBean.getOwner_duration();
        return owner_duration != null ? owner_duration.equals(owner_duration2) : owner_duration2 == null;
    }

    public String getDiamond() {
        return this.diamond;
    }

    public String getDiamondSalary() {
        return this.diamondSalary;
    }

    public String getDuration() {
        return this.duration;
    }

    public String getGoldSalary() {
        return this.goldSalary;
    }

    public String getLevel() {
        return this.level;
    }

    public String getOn_mic_time() {
        return this.on_mic_time;
    }

    public String getOnlineDays() {
        return this.onlineDays;
    }

    public String getOwner_duration() {
        return this.owner_duration;
    }

    public String getTicket() {
        return this.ticket;
    }

    public String getTotalSalary() {
        return this.totalSalary;
    }

    public String getTotal_diamond() {
        return this.total_diamond;
    }

    public String getYm() {
        return this.f34798ym;
    }

    public int hashCode() {
        String totalSalary = getTotalSalary();
        int iHashCode = totalSalary == null ? 43 : totalSalary.hashCode();
        String diamond = getDiamond();
        int iHashCode2 = ((iHashCode + 59) * 59) + (diamond == null ? 43 : diamond.hashCode());
        String level = getLevel();
        int iHashCode3 = (iHashCode2 * 59) + (level == null ? 43 : level.hashCode());
        String total_diamond = getTotal_diamond();
        int iHashCode4 = (iHashCode3 * 59) + (total_diamond == null ? 43 : total_diamond.hashCode());
        String diamondSalary = getDiamondSalary();
        int iHashCode5 = (iHashCode4 * 59) + (diamondSalary == null ? 43 : diamondSalary.hashCode());
        String goldSalary = getGoldSalary();
        int iHashCode6 = (iHashCode5 * 59) + (goldSalary == null ? 43 : goldSalary.hashCode());
        String onlineDays = getOnlineDays();
        int iHashCode7 = (iHashCode6 * 59) + (onlineDays == null ? 43 : onlineDays.hashCode());
        String on_mic_time = getOn_mic_time();
        int iHashCode8 = (iHashCode7 * 59) + (on_mic_time == null ? 43 : on_mic_time.hashCode());
        String ym2 = getYm();
        int iHashCode9 = (iHashCode8 * 59) + (ym2 == null ? 43 : ym2.hashCode());
        String ticket = getTicket();
        int iHashCode10 = (iHashCode9 * 59) + (ticket == null ? 43 : ticket.hashCode());
        String duration = getDuration();
        int iHashCode11 = (iHashCode10 * 59) + (duration == null ? 43 : duration.hashCode());
        String owner_duration = getOwner_duration();
        return (iHashCode11 * 59) + (owner_duration != null ? owner_duration.hashCode() : 43);
    }

    public void setDiamond(String str) {
        this.diamond = str;
    }

    public void setDiamondSalary(String str) {
        this.diamondSalary = str;
    }

    public void setDuration(String str) {
        this.duration = str;
    }

    public void setGoldSalary(String str) {
        this.goldSalary = str;
    }

    public void setLevel(String str) {
        this.level = str;
    }

    public void setOn_mic_time(String str) {
        this.on_mic_time = str;
    }

    public void setOnlineDays(String str) {
        this.onlineDays = str;
    }

    public void setOwner_duration(String str) {
        this.owner_duration = str;
    }

    public void setTicket(String str) {
        this.ticket = str;
    }

    public void setTotalSalary(String str) {
        this.totalSalary = str;
    }

    public void setTotal_diamond(String str) {
        this.total_diamond = str;
    }

    public void setYm(String str) {
        this.f34798ym = str;
    }

    public String toString() {
        return "AnchorDayLivelogBean(totalSalary=" + getTotalSalary() + ", diamond=" + getDiamond() + ", level=" + getLevel() + ", total_diamond=" + getTotal_diamond() + ", diamondSalary=" + getDiamondSalary() + ", goldSalary=" + getGoldSalary() + ", onlineDays=" + getOnlineDays() + ", on_mic_time=" + getOn_mic_time() + ", ym=" + getYm() + ", ticket=" + getTicket() + ", duration=" + getDuration() + ", owner_duration=" + getOwner_duration() + ")";
    }
}
