package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class PkEndBean {

    @SerializedName("time_left")
    private Integer timeLeft;

    @SerializedName("win")
    private Integer win;

    public boolean canEqual(Object obj) {
        return obj instanceof PkEndBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PkEndBean)) {
            return false;
        }
        PkEndBean pkEndBean = (PkEndBean) obj;
        if (!pkEndBean.canEqual(this)) {
            return false;
        }
        Integer win = getWin();
        Integer win2 = pkEndBean.getWin();
        if (win != null ? !win.equals(win2) : win2 != null) {
            return false;
        }
        Integer timeLeft = getTimeLeft();
        Integer timeLeft2 = pkEndBean.getTimeLeft();
        return timeLeft != null ? timeLeft.equals(timeLeft2) : timeLeft2 == null;
    }

    public Integer getTimeLeft() {
        return this.timeLeft;
    }

    public Integer getWin() {
        return this.win;
    }

    public int hashCode() {
        Integer win = getWin();
        int iHashCode = win == null ? 43 : win.hashCode();
        Integer timeLeft = getTimeLeft();
        return ((iHashCode + 59) * 59) + (timeLeft != null ? timeLeft.hashCode() : 43);
    }

    public void setTimeLeft(Integer num) {
        this.timeLeft = num;
    }

    public void setWin(Integer num) {
        this.win = num;
    }

    public String toString() {
        return "PkEndBean(win=" + getWin() + ", timeLeft=" + getTimeLeft() + ")";
    }
}
