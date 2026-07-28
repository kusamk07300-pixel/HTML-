package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class DiamondRewardsBean {

    @SerializedName("action")
    private Integer action;

    @SerializedName("tickets")
    private Long tickets;

    @SerializedName("ymd")
    private String ymd;

    public boolean canEqual(Object obj) {
        return obj instanceof DiamondRewardsBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DiamondRewardsBean)) {
            return false;
        }
        DiamondRewardsBean diamondRewardsBean = (DiamondRewardsBean) obj;
        if (!diamondRewardsBean.canEqual(this)) {
            return false;
        }
        Integer action = getAction();
        Integer action2 = diamondRewardsBean.getAction();
        if (action != null ? !action.equals(action2) : action2 != null) {
            return false;
        }
        Long tickets = getTickets();
        Long tickets2 = diamondRewardsBean.getTickets();
        if (tickets != null ? !tickets.equals(tickets2) : tickets2 != null) {
            return false;
        }
        String ymd = getYmd();
        String ymd2 = diamondRewardsBean.getYmd();
        return ymd != null ? ymd.equals(ymd2) : ymd2 == null;
    }

    public Integer getAction() {
        return this.action;
    }

    public Long getTickets() {
        return this.tickets;
    }

    public String getYmd() {
        return this.ymd;
    }

    public int hashCode() {
        Integer action = getAction();
        int iHashCode = action == null ? 43 : action.hashCode();
        Long tickets = getTickets();
        int iHashCode2 = ((iHashCode + 59) * 59) + (tickets == null ? 43 : tickets.hashCode());
        String ymd = getYmd();
        return (iHashCode2 * 59) + (ymd != null ? ymd.hashCode() : 43);
    }

    public void setAction(Integer num) {
        this.action = num;
    }

    public void setTickets(Long l10) {
        this.tickets = l10;
    }

    public void setYmd(String str) {
        this.ymd = str;
    }

    public String toString() {
        return "DiamondRewardsBean(action=" + getAction() + ", ymd=" + getYmd() + ", tickets=" + getTickets() + ")";
    }
}
