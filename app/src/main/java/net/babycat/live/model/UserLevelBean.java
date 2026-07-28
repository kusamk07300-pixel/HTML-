package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class UserLevelBean {

    @SerializedName("consumption")
    ConsumptionBean consumption;

    @SerializedName("ticket")
    AuthorLevelBean ticket;

    public boolean canEqual(Object obj) {
        return obj instanceof UserLevelBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserLevelBean)) {
            return false;
        }
        UserLevelBean userLevelBean = (UserLevelBean) obj;
        if (!userLevelBean.canEqual(this)) {
            return false;
        }
        ConsumptionBean consumption = getConsumption();
        ConsumptionBean consumption2 = userLevelBean.getConsumption();
        if (consumption != null ? !consumption.equals(consumption2) : consumption2 != null) {
            return false;
        }
        AuthorLevelBean ticket = getTicket();
        AuthorLevelBean ticket2 = userLevelBean.getTicket();
        return ticket != null ? ticket.equals(ticket2) : ticket2 == null;
    }

    public ConsumptionBean getConsumption() {
        return this.consumption;
    }

    public AuthorLevelBean getTicket() {
        return this.ticket;
    }

    public int hashCode() {
        ConsumptionBean consumption = getConsumption();
        int iHashCode = consumption == null ? 43 : consumption.hashCode();
        AuthorLevelBean ticket = getTicket();
        return ((iHashCode + 59) * 59) + (ticket != null ? ticket.hashCode() : 43);
    }

    public void setConsumption(ConsumptionBean consumptionBean) {
        this.consumption = consumptionBean;
    }

    public void setTicket(AuthorLevelBean authorLevelBean) {
        this.ticket = authorLevelBean;
    }

    public String toString() {
        return "UserLevelBean(consumption=" + getConsumption() + ", ticket=" + getTicket() + ")";
    }
}
