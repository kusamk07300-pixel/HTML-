package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;

/* JADX INFO: loaded from: classes4.dex */
public class AgencyAdminBean {

    @SerializedName("masterInfo")
    private MasterInfoDTO masterInfo;

    @SerializedName("totalsData")
    private TotalsDataDTO totalsData;

    public static class MasterInfoDTO {

        @SerializedName("admin_uid")
        private Integer adminUid;

        @SerializedName("country_iso")
        private String countryIso;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34795id;

        @SerializedName("name")
        private String name;

        @SerializedName(o0.CATEGORY_STATUS)
        private Integer status;

        public boolean canEqual(Object obj) {
            return obj instanceof MasterInfoDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MasterInfoDTO)) {
                return false;
            }
            MasterInfoDTO masterInfoDTO = (MasterInfoDTO) obj;
            if (!masterInfoDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = masterInfoDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            Integer adminUid = getAdminUid();
            Integer adminUid2 = masterInfoDTO.getAdminUid();
            if (adminUid != null ? !adminUid.equals(adminUid2) : adminUid2 != null) {
                return false;
            }
            Integer status = getStatus();
            Integer status2 = masterInfoDTO.getStatus();
            if (status != null ? !status.equals(status2) : status2 != null) {
                return false;
            }
            String name = getName();
            String name2 = masterInfoDTO.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String countryIso = getCountryIso();
            String countryIso2 = masterInfoDTO.getCountryIso();
            return countryIso != null ? countryIso.equals(countryIso2) : countryIso2 == null;
        }

        public Integer getAdminUid() {
            return this.adminUid;
        }

        public String getCountryIso() {
            return this.countryIso;
        }

        public Integer getId() {
            return this.f34795id;
        }

        public String getName() {
            return this.name;
        }

        public Integer getStatus() {
            return this.status;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer adminUid = getAdminUid();
            int iHashCode2 = ((iHashCode + 59) * 59) + (adminUid == null ? 43 : adminUid.hashCode());
            Integer status = getStatus();
            int iHashCode3 = (iHashCode2 * 59) + (status == null ? 43 : status.hashCode());
            String name = getName();
            int iHashCode4 = (iHashCode3 * 59) + (name == null ? 43 : name.hashCode());
            String countryIso = getCountryIso();
            return (iHashCode4 * 59) + (countryIso != null ? countryIso.hashCode() : 43);
        }

        public void setAdminUid(Integer num) {
            this.adminUid = num;
        }

        public void setCountryIso(String str) {
            this.countryIso = str;
        }

        public void setId(Integer num) {
            this.f34795id = num;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setStatus(Integer num) {
            this.status = num;
        }

        public String toString() {
            return "AgencyAdminBean.MasterInfoDTO(id=" + getId() + ", adminUid=" + getAdminUid() + ", name=" + getName() + ", countryIso=" + getCountryIso() + ", status=" + getStatus() + ")";
        }
    }

    public static class TotalsDataDTO {

        @SerializedName("bd_income_last_month")
        private String bdIncomeLastMonth;

        @SerializedName("bd_income_this_month")
        private String bdIncomeThisMonth;

        @SerializedName("income_last_month")
        private Integer incomeLastMonth;

        @SerializedName("income_this_month")
        private Integer incomeThisMonth;

        @SerializedName("income_this_month_invite_agency")
        private Integer incomeThisMonthInviteAgency;

        @SerializedName("reward_last_month")
        private Integer rewardLastMonth;

        @SerializedName("reward_this_month")
        private Integer rewardThisMonth;

        @SerializedName("total_agency_member_num")
        private Integer totalAgencyMemberNum;

        @SerializedName("total_agency_member_num_today")
        private Integer totalAgencyMemberNumToday;

        @SerializedName("total_agency_member_refund")
        private Integer totalAgencyMemberRefund;

        @SerializedName("total_agency_num")
        private Integer totalAgencyNum;

        public boolean canEqual(Object obj) {
            return obj instanceof TotalsDataDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TotalsDataDTO)) {
                return false;
            }
            TotalsDataDTO totalsDataDTO = (TotalsDataDTO) obj;
            if (!totalsDataDTO.canEqual(this)) {
                return false;
            }
            Integer totalAgencyNum = getTotalAgencyNum();
            Integer totalAgencyNum2 = totalsDataDTO.getTotalAgencyNum();
            if (totalAgencyNum != null ? !totalAgencyNum.equals(totalAgencyNum2) : totalAgencyNum2 != null) {
                return false;
            }
            Integer totalAgencyMemberNum = getTotalAgencyMemberNum();
            Integer totalAgencyMemberNum2 = totalsDataDTO.getTotalAgencyMemberNum();
            if (totalAgencyMemberNum != null ? !totalAgencyMemberNum.equals(totalAgencyMemberNum2) : totalAgencyMemberNum2 != null) {
                return false;
            }
            Integer totalAgencyMemberNumToday = getTotalAgencyMemberNumToday();
            Integer totalAgencyMemberNumToday2 = totalsDataDTO.getTotalAgencyMemberNumToday();
            if (totalAgencyMemberNumToday != null ? !totalAgencyMemberNumToday.equals(totalAgencyMemberNumToday2) : totalAgencyMemberNumToday2 != null) {
                return false;
            }
            Integer totalAgencyMemberRefund = getTotalAgencyMemberRefund();
            Integer totalAgencyMemberRefund2 = totalsDataDTO.getTotalAgencyMemberRefund();
            if (totalAgencyMemberRefund != null ? !totalAgencyMemberRefund.equals(totalAgencyMemberRefund2) : totalAgencyMemberRefund2 != null) {
                return false;
            }
            Integer rewardLastMonth = getRewardLastMonth();
            Integer rewardLastMonth2 = totalsDataDTO.getRewardLastMonth();
            if (rewardLastMonth != null ? !rewardLastMonth.equals(rewardLastMonth2) : rewardLastMonth2 != null) {
                return false;
            }
            Integer rewardThisMonth = getRewardThisMonth();
            Integer rewardThisMonth2 = totalsDataDTO.getRewardThisMonth();
            if (rewardThisMonth != null ? !rewardThisMonth.equals(rewardThisMonth2) : rewardThisMonth2 != null) {
                return false;
            }
            Integer incomeLastMonth = getIncomeLastMonth();
            Integer incomeLastMonth2 = totalsDataDTO.getIncomeLastMonth();
            if (incomeLastMonth != null ? !incomeLastMonth.equals(incomeLastMonth2) : incomeLastMonth2 != null) {
                return false;
            }
            Integer incomeThisMonth = getIncomeThisMonth();
            Integer incomeThisMonth2 = totalsDataDTO.getIncomeThisMonth();
            if (incomeThisMonth != null ? !incomeThisMonth.equals(incomeThisMonth2) : incomeThisMonth2 != null) {
                return false;
            }
            Integer incomeThisMonthInviteAgency = getIncomeThisMonthInviteAgency();
            Integer incomeThisMonthInviteAgency2 = totalsDataDTO.getIncomeThisMonthInviteAgency();
            if (incomeThisMonthInviteAgency != null ? !incomeThisMonthInviteAgency.equals(incomeThisMonthInviteAgency2) : incomeThisMonthInviteAgency2 != null) {
                return false;
            }
            String bdIncomeLastMonth = getBdIncomeLastMonth();
            String bdIncomeLastMonth2 = totalsDataDTO.getBdIncomeLastMonth();
            if (bdIncomeLastMonth != null ? !bdIncomeLastMonth.equals(bdIncomeLastMonth2) : bdIncomeLastMonth2 != null) {
                return false;
            }
            String bdIncomeThisMonth = getBdIncomeThisMonth();
            String bdIncomeThisMonth2 = totalsDataDTO.getBdIncomeThisMonth();
            return bdIncomeThisMonth != null ? bdIncomeThisMonth.equals(bdIncomeThisMonth2) : bdIncomeThisMonth2 == null;
        }

        public String getBdIncomeLastMonth() {
            return this.bdIncomeLastMonth;
        }

        public String getBdIncomeThisMonth() {
            return this.bdIncomeThisMonth;
        }

        public Integer getIncomeLastMonth() {
            return this.incomeLastMonth;
        }

        public Integer getIncomeThisMonth() {
            return this.incomeThisMonth;
        }

        public Integer getIncomeThisMonthInviteAgency() {
            return this.incomeThisMonthInviteAgency;
        }

        public Integer getRewardLastMonth() {
            return this.rewardLastMonth;
        }

        public Integer getRewardThisMonth() {
            return this.rewardThisMonth;
        }

        public Integer getTotalAgencyMemberNum() {
            return this.totalAgencyMemberNum;
        }

        public Integer getTotalAgencyMemberNumToday() {
            return this.totalAgencyMemberNumToday;
        }

        public Integer getTotalAgencyMemberRefund() {
            return this.totalAgencyMemberRefund;
        }

        public Integer getTotalAgencyNum() {
            return this.totalAgencyNum;
        }

        public int hashCode() {
            Integer totalAgencyNum = getTotalAgencyNum();
            int iHashCode = totalAgencyNum == null ? 43 : totalAgencyNum.hashCode();
            Integer totalAgencyMemberNum = getTotalAgencyMemberNum();
            int iHashCode2 = ((iHashCode + 59) * 59) + (totalAgencyMemberNum == null ? 43 : totalAgencyMemberNum.hashCode());
            Integer totalAgencyMemberNumToday = getTotalAgencyMemberNumToday();
            int iHashCode3 = (iHashCode2 * 59) + (totalAgencyMemberNumToday == null ? 43 : totalAgencyMemberNumToday.hashCode());
            Integer totalAgencyMemberRefund = getTotalAgencyMemberRefund();
            int iHashCode4 = (iHashCode3 * 59) + (totalAgencyMemberRefund == null ? 43 : totalAgencyMemberRefund.hashCode());
            Integer rewardLastMonth = getRewardLastMonth();
            int iHashCode5 = (iHashCode4 * 59) + (rewardLastMonth == null ? 43 : rewardLastMonth.hashCode());
            Integer rewardThisMonth = getRewardThisMonth();
            int iHashCode6 = (iHashCode5 * 59) + (rewardThisMonth == null ? 43 : rewardThisMonth.hashCode());
            Integer incomeLastMonth = getIncomeLastMonth();
            int iHashCode7 = (iHashCode6 * 59) + (incomeLastMonth == null ? 43 : incomeLastMonth.hashCode());
            Integer incomeThisMonth = getIncomeThisMonth();
            int iHashCode8 = (iHashCode7 * 59) + (incomeThisMonth == null ? 43 : incomeThisMonth.hashCode());
            Integer incomeThisMonthInviteAgency = getIncomeThisMonthInviteAgency();
            int iHashCode9 = (iHashCode8 * 59) + (incomeThisMonthInviteAgency == null ? 43 : incomeThisMonthInviteAgency.hashCode());
            String bdIncomeLastMonth = getBdIncomeLastMonth();
            int iHashCode10 = (iHashCode9 * 59) + (bdIncomeLastMonth == null ? 43 : bdIncomeLastMonth.hashCode());
            String bdIncomeThisMonth = getBdIncomeThisMonth();
            return (iHashCode10 * 59) + (bdIncomeThisMonth != null ? bdIncomeThisMonth.hashCode() : 43);
        }

        public void setBdIncomeLastMonth(String str) {
            this.bdIncomeLastMonth = str;
        }

        public void setBdIncomeThisMonth(String str) {
            this.bdIncomeThisMonth = str;
        }

        public void setIncomeLastMonth(Integer num) {
            this.incomeLastMonth = num;
        }

        public void setIncomeThisMonth(Integer num) {
            this.incomeThisMonth = num;
        }

        public void setIncomeThisMonthInviteAgency(Integer num) {
            this.incomeThisMonthInviteAgency = num;
        }

        public void setRewardLastMonth(Integer num) {
            this.rewardLastMonth = num;
        }

        public void setRewardThisMonth(Integer num) {
            this.rewardThisMonth = num;
        }

        public void setTotalAgencyMemberNum(Integer num) {
            this.totalAgencyMemberNum = num;
        }

        public void setTotalAgencyMemberNumToday(Integer num) {
            this.totalAgencyMemberNumToday = num;
        }

        public void setTotalAgencyMemberRefund(Integer num) {
            this.totalAgencyMemberRefund = num;
        }

        public void setTotalAgencyNum(Integer num) {
            this.totalAgencyNum = num;
        }

        public String toString() {
            return "AgencyAdminBean.TotalsDataDTO(totalAgencyNum=" + getTotalAgencyNum() + ", totalAgencyMemberNum=" + getTotalAgencyMemberNum() + ", totalAgencyMemberNumToday=" + getTotalAgencyMemberNumToday() + ", totalAgencyMemberRefund=" + getTotalAgencyMemberRefund() + ", rewardLastMonth=" + getRewardLastMonth() + ", rewardThisMonth=" + getRewardThisMonth() + ", incomeLastMonth=" + getIncomeLastMonth() + ", incomeThisMonth=" + getIncomeThisMonth() + ", incomeThisMonthInviteAgency=" + getIncomeThisMonthInviteAgency() + ", bdIncomeLastMonth=" + getBdIncomeLastMonth() + ", bdIncomeThisMonth=" + getBdIncomeThisMonth() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof AgencyAdminBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AgencyAdminBean)) {
            return false;
        }
        AgencyAdminBean agencyAdminBean = (AgencyAdminBean) obj;
        if (!agencyAdminBean.canEqual(this)) {
            return false;
        }
        MasterInfoDTO masterInfo = getMasterInfo();
        MasterInfoDTO masterInfo2 = agencyAdminBean.getMasterInfo();
        if (masterInfo != null ? !masterInfo.equals(masterInfo2) : masterInfo2 != null) {
            return false;
        }
        TotalsDataDTO totalsData = getTotalsData();
        TotalsDataDTO totalsData2 = agencyAdminBean.getTotalsData();
        return totalsData != null ? totalsData.equals(totalsData2) : totalsData2 == null;
    }

    public MasterInfoDTO getMasterInfo() {
        return this.masterInfo;
    }

    public TotalsDataDTO getTotalsData() {
        return this.totalsData;
    }

    public int hashCode() {
        MasterInfoDTO masterInfo = getMasterInfo();
        int iHashCode = masterInfo == null ? 43 : masterInfo.hashCode();
        TotalsDataDTO totalsData = getTotalsData();
        return ((iHashCode + 59) * 59) + (totalsData != null ? totalsData.hashCode() : 43);
    }

    public void setMasterInfo(MasterInfoDTO masterInfoDTO) {
        this.masterInfo = masterInfoDTO;
    }

    public void setTotalsData(TotalsDataDTO totalsDataDTO) {
        this.totalsData = totalsDataDTO;
    }

    public String toString() {
        return "AgencyAdminBean(masterInfo=" + getMasterInfo() + ", totalsData=" + getTotalsData() + ")";
    }
}
