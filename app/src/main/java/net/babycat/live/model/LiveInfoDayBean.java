package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class LiveInfoDayBean {

    @SerializedName("day_host_minutes")
    String day_host_minutes;

    @SerializedName("day_live_minutes")
    String day_live_minutes;

    @SerializedName("day_total_income")
    String day_total_income;

    @SerializedName("day_total_minutes")
    String day_total_minutes;

    @SerializedName("month_gift_income")
    String month_gift_income;

    @SerializedName("month_host_minutes")
    String month_host_minutes;

    @SerializedName("month_live_minutes")
    String month_live_minutes;

    @SerializedName("month_total_minutes")
    String month_total_minutes;

    public boolean canEqual(Object obj) {
        return obj instanceof LiveInfoDayBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveInfoDayBean)) {
            return false;
        }
        LiveInfoDayBean liveInfoDayBean = (LiveInfoDayBean) obj;
        if (!liveInfoDayBean.canEqual(this)) {
            return false;
        }
        String day_total_income = getDay_total_income();
        String day_total_income2 = liveInfoDayBean.getDay_total_income();
        if (day_total_income != null ? !day_total_income.equals(day_total_income2) : day_total_income2 != null) {
            return false;
        }
        String day_total_minutes = getDay_total_minutes();
        String day_total_minutes2 = liveInfoDayBean.getDay_total_minutes();
        if (day_total_minutes != null ? !day_total_minutes.equals(day_total_minutes2) : day_total_minutes2 != null) {
            return false;
        }
        String day_live_minutes = getDay_live_minutes();
        String day_live_minutes2 = liveInfoDayBean.getDay_live_minutes();
        if (day_live_minutes != null ? !day_live_minutes.equals(day_live_minutes2) : day_live_minutes2 != null) {
            return false;
        }
        String day_host_minutes = getDay_host_minutes();
        String day_host_minutes2 = liveInfoDayBean.getDay_host_minutes();
        if (day_host_minutes != null ? !day_host_minutes.equals(day_host_minutes2) : day_host_minutes2 != null) {
            return false;
        }
        String month_gift_income = getMonth_gift_income();
        String month_gift_income2 = liveInfoDayBean.getMonth_gift_income();
        if (month_gift_income != null ? !month_gift_income.equals(month_gift_income2) : month_gift_income2 != null) {
            return false;
        }
        String month_total_minutes = getMonth_total_minutes();
        String month_total_minutes2 = liveInfoDayBean.getMonth_total_minutes();
        if (month_total_minutes != null ? !month_total_minutes.equals(month_total_minutes2) : month_total_minutes2 != null) {
            return false;
        }
        String month_live_minutes = getMonth_live_minutes();
        String month_live_minutes2 = liveInfoDayBean.getMonth_live_minutes();
        if (month_live_minutes != null ? !month_live_minutes.equals(month_live_minutes2) : month_live_minutes2 != null) {
            return false;
        }
        String month_host_minutes = getMonth_host_minutes();
        String month_host_minutes2 = liveInfoDayBean.getMonth_host_minutes();
        return month_host_minutes != null ? month_host_minutes.equals(month_host_minutes2) : month_host_minutes2 == null;
    }

    public String getDay_host_minutes() {
        return this.day_host_minutes;
    }

    public String getDay_live_minutes() {
        return this.day_live_minutes;
    }

    public String getDay_total_income() {
        return this.day_total_income;
    }

    public String getDay_total_minutes() {
        return this.day_total_minutes;
    }

    public String getMonth_gift_income() {
        return this.month_gift_income;
    }

    public String getMonth_host_minutes() {
        return this.month_host_minutes;
    }

    public String getMonth_live_minutes() {
        return this.month_live_minutes;
    }

    public String getMonth_total_minutes() {
        return this.month_total_minutes;
    }

    public int hashCode() {
        String day_total_income = getDay_total_income();
        int iHashCode = day_total_income == null ? 43 : day_total_income.hashCode();
        String day_total_minutes = getDay_total_minutes();
        int iHashCode2 = ((iHashCode + 59) * 59) + (day_total_minutes == null ? 43 : day_total_minutes.hashCode());
        String day_live_minutes = getDay_live_minutes();
        int iHashCode3 = (iHashCode2 * 59) + (day_live_minutes == null ? 43 : day_live_minutes.hashCode());
        String day_host_minutes = getDay_host_minutes();
        int iHashCode4 = (iHashCode3 * 59) + (day_host_minutes == null ? 43 : day_host_minutes.hashCode());
        String month_gift_income = getMonth_gift_income();
        int iHashCode5 = (iHashCode4 * 59) + (month_gift_income == null ? 43 : month_gift_income.hashCode());
        String month_total_minutes = getMonth_total_minutes();
        int iHashCode6 = (iHashCode5 * 59) + (month_total_minutes == null ? 43 : month_total_minutes.hashCode());
        String month_live_minutes = getMonth_live_minutes();
        int iHashCode7 = (iHashCode6 * 59) + (month_live_minutes == null ? 43 : month_live_minutes.hashCode());
        String month_host_minutes = getMonth_host_minutes();
        return (iHashCode7 * 59) + (month_host_minutes != null ? month_host_minutes.hashCode() : 43);
    }

    public void setDay_host_minutes(String str) {
        this.day_host_minutes = str;
    }

    public void setDay_live_minutes(String str) {
        this.day_live_minutes = str;
    }

    public void setDay_total_income(String str) {
        this.day_total_income = str;
    }

    public void setDay_total_minutes(String str) {
        this.day_total_minutes = str;
    }

    public void setMonth_gift_income(String str) {
        this.month_gift_income = str;
    }

    public void setMonth_host_minutes(String str) {
        this.month_host_minutes = str;
    }

    public void setMonth_live_minutes(String str) {
        this.month_live_minutes = str;
    }

    public void setMonth_total_minutes(String str) {
        this.month_total_minutes = str;
    }

    public String toString() {
        return "LiveInfoDayBean(day_total_income=" + getDay_total_income() + ", day_total_minutes=" + getDay_total_minutes() + ", day_live_minutes=" + getDay_live_minutes() + ", day_host_minutes=" + getDay_host_minutes() + ", month_gift_income=" + getMonth_gift_income() + ", month_total_minutes=" + getMonth_total_minutes() + ", month_live_minutes=" + getMonth_live_minutes() + ", month_host_minutes=" + getMonth_host_minutes() + ")";
    }
}
