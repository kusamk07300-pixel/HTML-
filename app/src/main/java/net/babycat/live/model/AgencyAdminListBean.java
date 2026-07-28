package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class AgencyAdminListBean {

    @SerializedName("agency_id")
    private Integer agencyId;

    @SerializedName("days")
    private String days;

    @SerializedName("income")
    private Integer income;

    @SerializedName("members")
    private Integer members;

    @SerializedName("name")
    private String name;

    @SerializedName("total_diamond")
    private String totalDiamond;

    public boolean canEqual(Object obj) {
        return obj instanceof AgencyAdminListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AgencyAdminListBean)) {
            return false;
        }
        AgencyAdminListBean agencyAdminListBean = (AgencyAdminListBean) obj;
        if (!agencyAdminListBean.canEqual(this)) {
            return false;
        }
        Integer agencyId = getAgencyId();
        Integer agencyId2 = agencyAdminListBean.getAgencyId();
        if (agencyId != null ? !agencyId.equals(agencyId2) : agencyId2 != null) {
            return false;
        }
        Integer members = getMembers();
        Integer members2 = agencyAdminListBean.getMembers();
        if (members != null ? !members.equals(members2) : members2 != null) {
            return false;
        }
        Integer income = getIncome();
        Integer income2 = agencyAdminListBean.getIncome();
        if (income != null ? !income.equals(income2) : income2 != null) {
            return false;
        }
        String days = getDays();
        String days2 = agencyAdminListBean.getDays();
        if (days != null ? !days.equals(days2) : days2 != null) {
            return false;
        }
        String totalDiamond = getTotalDiamond();
        String totalDiamond2 = agencyAdminListBean.getTotalDiamond();
        if (totalDiamond != null ? !totalDiamond.equals(totalDiamond2) : totalDiamond2 != null) {
            return false;
        }
        String name = getName();
        String name2 = agencyAdminListBean.getName();
        return name != null ? name.equals(name2) : name2 == null;
    }

    public Integer getAgencyId() {
        return this.agencyId;
    }

    public String getDays() {
        return this.days;
    }

    public Integer getIncome() {
        return this.income;
    }

    public Integer getMembers() {
        return this.members;
    }

    public String getName() {
        return this.name;
    }

    public String getTotalDiamond() {
        return this.totalDiamond;
    }

    public int hashCode() {
        Integer agencyId = getAgencyId();
        int iHashCode = agencyId == null ? 43 : agencyId.hashCode();
        Integer members = getMembers();
        int iHashCode2 = ((iHashCode + 59) * 59) + (members == null ? 43 : members.hashCode());
        Integer income = getIncome();
        int iHashCode3 = (iHashCode2 * 59) + (income == null ? 43 : income.hashCode());
        String days = getDays();
        int iHashCode4 = (iHashCode3 * 59) + (days == null ? 43 : days.hashCode());
        String totalDiamond = getTotalDiamond();
        int iHashCode5 = (iHashCode4 * 59) + (totalDiamond == null ? 43 : totalDiamond.hashCode());
        String name = getName();
        return (iHashCode5 * 59) + (name != null ? name.hashCode() : 43);
    }

    public void setAgencyId(Integer num) {
        this.agencyId = num;
    }

    public void setDays(String str) {
        this.days = str;
    }

    public void setIncome(Integer num) {
        this.income = num;
    }

    public void setMembers(Integer num) {
        this.members = num;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setTotalDiamond(String str) {
        this.totalDiamond = str;
    }

    public String toString() {
        return "AgencyAdminListBean(agencyId=" + getAgencyId() + ", days=" + getDays() + ", totalDiamond=" + getTotalDiamond() + ", name=" + getName() + ", members=" + getMembers() + ", income=" + getIncome() + ")";
    }
}
