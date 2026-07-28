package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class AnthorDaySalary {

    @SerializedName("day")
    private String day;

    @SerializedName("diamonds")
    private Integer diamonds;

    @SerializedName("hours")
    private String hours;

    @SerializedName("valid_day")
    private String validDay;

    public boolean canEqual(Object obj) {
        return obj instanceof AnthorDaySalary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnthorDaySalary)) {
            return false;
        }
        AnthorDaySalary anthorDaySalary = (AnthorDaySalary) obj;
        if (!anthorDaySalary.canEqual(this)) {
            return false;
        }
        Integer diamonds = getDiamonds();
        Integer diamonds2 = anthorDaySalary.getDiamonds();
        if (diamonds != null ? !diamonds.equals(diamonds2) : diamonds2 != null) {
            return false;
        }
        String validDay = getValidDay();
        String validDay2 = anthorDaySalary.getValidDay();
        if (validDay != null ? !validDay.equals(validDay2) : validDay2 != null) {
            return false;
        }
        String hours = getHours();
        String hours2 = anthorDaySalary.getHours();
        if (hours != null ? !hours.equals(hours2) : hours2 != null) {
            return false;
        }
        String day = getDay();
        String day2 = anthorDaySalary.getDay();
        return day != null ? day.equals(day2) : day2 == null;
    }

    public String getDay() {
        return this.day;
    }

    public Integer getDiamonds() {
        return this.diamonds;
    }

    public String getHours() {
        return this.hours;
    }

    public String getValidDay() {
        return this.validDay;
    }

    public int hashCode() {
        Integer diamonds = getDiamonds();
        int iHashCode = diamonds == null ? 43 : diamonds.hashCode();
        String validDay = getValidDay();
        int iHashCode2 = ((iHashCode + 59) * 59) + (validDay == null ? 43 : validDay.hashCode());
        String hours = getHours();
        int iHashCode3 = (iHashCode2 * 59) + (hours == null ? 43 : hours.hashCode());
        String day = getDay();
        return (iHashCode3 * 59) + (day != null ? day.hashCode() : 43);
    }

    public void setDay(String str) {
        this.day = str;
    }

    public void setDiamonds(Integer num) {
        this.diamonds = num;
    }

    public void setHours(String str) {
        this.hours = str;
    }

    public void setValidDay(String str) {
        this.validDay = str;
    }

    public String toString() {
        return "AnthorDaySalary(diamonds=" + getDiamonds() + ", validDay=" + getValidDay() + ", hours=" + getHours() + ", day=" + getDay() + ")";
    }
}
