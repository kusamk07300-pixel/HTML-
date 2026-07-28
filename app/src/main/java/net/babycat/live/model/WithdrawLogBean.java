package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class WithdrawLogBean {

    @SerializedName("agadmin_id")
    Integer agadminId;

    @SerializedName("bank_name")
    String bankName;

    @SerializedName("coin")
    String coin;

    @SerializedName("create_time")
    String createTime;

    @SerializedName("diamond")
    String diamond;

    @SerializedName("iban")
    String iban;

    @SerializedName("is_agadmin")
    Integer is_agadmin;

    @SerializedName("mobile_number")
    String mobileNumber;

    @SerializedName("payment_type")
    Integer paymentType;

    @SerializedName("paypal_email")
    String paypalEmail;

    @SerializedName("state")
    Integer state;

    @SerializedName("withdraw_no")
    String withdrawNo;

    public boolean canEqual(Object obj) {
        return obj instanceof WithdrawLogBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WithdrawLogBean)) {
            return false;
        }
        WithdrawLogBean withdrawLogBean = (WithdrawLogBean) obj;
        if (!withdrawLogBean.canEqual(this)) {
            return false;
        }
        Integer paymentType = getPaymentType();
        Integer paymentType2 = withdrawLogBean.getPaymentType();
        if (paymentType != null ? !paymentType.equals(paymentType2) : paymentType2 != null) {
            return false;
        }
        Integer state = getState();
        Integer state2 = withdrawLogBean.getState();
        if (state != null ? !state.equals(state2) : state2 != null) {
            return false;
        }
        Integer agadminId = getAgadminId();
        Integer agadminId2 = withdrawLogBean.getAgadminId();
        if (agadminId != null ? !agadminId.equals(agadminId2) : agadminId2 != null) {
            return false;
        }
        Integer is_agadmin = getIs_agadmin();
        Integer is_agadmin2 = withdrawLogBean.getIs_agadmin();
        if (is_agadmin != null ? !is_agadmin.equals(is_agadmin2) : is_agadmin2 != null) {
            return false;
        }
        String diamond = getDiamond();
        String diamond2 = withdrawLogBean.getDiamond();
        if (diamond != null ? !diamond.equals(diamond2) : diamond2 != null) {
            return false;
        }
        String withdrawNo = getWithdrawNo();
        String withdrawNo2 = withdrawLogBean.getWithdrawNo();
        if (withdrawNo != null ? !withdrawNo.equals(withdrawNo2) : withdrawNo2 != null) {
            return false;
        }
        String createTime = getCreateTime();
        String createTime2 = withdrawLogBean.getCreateTime();
        if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
            return false;
        }
        String mobileNumber = getMobileNumber();
        String mobileNumber2 = withdrawLogBean.getMobileNumber();
        if (mobileNumber != null ? !mobileNumber.equals(mobileNumber2) : mobileNumber2 != null) {
            return false;
        }
        String paypalEmail = getPaypalEmail();
        String paypalEmail2 = withdrawLogBean.getPaypalEmail();
        if (paypalEmail != null ? !paypalEmail.equals(paypalEmail2) : paypalEmail2 != null) {
            return false;
        }
        String bankName = getBankName();
        String bankName2 = withdrawLogBean.getBankName();
        if (bankName != null ? !bankName.equals(bankName2) : bankName2 != null) {
            return false;
        }
        String iban = getIban();
        String iban2 = withdrawLogBean.getIban();
        if (iban != null ? !iban.equals(iban2) : iban2 != null) {
            return false;
        }
        String coin = getCoin();
        String coin2 = withdrawLogBean.getCoin();
        return coin != null ? coin.equals(coin2) : coin2 == null;
    }

    public Integer getAgadminId() {
        return this.agadminId;
    }

    public String getBankName() {
        return this.bankName;
    }

    public String getCoin() {
        return this.coin;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getDiamond() {
        return this.diamond;
    }

    public String getIban() {
        return this.iban;
    }

    public Integer getIs_agadmin() {
        return this.is_agadmin;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public Integer getPaymentType() {
        return this.paymentType;
    }

    public String getPaypalEmail() {
        return this.paypalEmail;
    }

    public Integer getState() {
        return this.state;
    }

    public String getWithdrawNo() {
        return this.withdrawNo;
    }

    public int hashCode() {
        Integer paymentType = getPaymentType();
        int iHashCode = paymentType == null ? 43 : paymentType.hashCode();
        Integer state = getState();
        int iHashCode2 = ((iHashCode + 59) * 59) + (state == null ? 43 : state.hashCode());
        Integer agadminId = getAgadminId();
        int iHashCode3 = (iHashCode2 * 59) + (agadminId == null ? 43 : agadminId.hashCode());
        Integer is_agadmin = getIs_agadmin();
        int iHashCode4 = (iHashCode3 * 59) + (is_agadmin == null ? 43 : is_agadmin.hashCode());
        String diamond = getDiamond();
        int iHashCode5 = (iHashCode4 * 59) + (diamond == null ? 43 : diamond.hashCode());
        String withdrawNo = getWithdrawNo();
        int iHashCode6 = (iHashCode5 * 59) + (withdrawNo == null ? 43 : withdrawNo.hashCode());
        String createTime = getCreateTime();
        int iHashCode7 = (iHashCode6 * 59) + (createTime == null ? 43 : createTime.hashCode());
        String mobileNumber = getMobileNumber();
        int iHashCode8 = (iHashCode7 * 59) + (mobileNumber == null ? 43 : mobileNumber.hashCode());
        String paypalEmail = getPaypalEmail();
        int iHashCode9 = (iHashCode8 * 59) + (paypalEmail == null ? 43 : paypalEmail.hashCode());
        String bankName = getBankName();
        int iHashCode10 = (iHashCode9 * 59) + (bankName == null ? 43 : bankName.hashCode());
        String iban = getIban();
        int iHashCode11 = (iHashCode10 * 59) + (iban == null ? 43 : iban.hashCode());
        String coin = getCoin();
        return (iHashCode11 * 59) + (coin != null ? coin.hashCode() : 43);
    }

    public void setAgadminId(Integer num) {
        this.agadminId = num;
    }

    public void setBankName(String str) {
        this.bankName = str;
    }

    public void setCoin(String str) {
        this.coin = str;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setDiamond(String str) {
        this.diamond = str;
    }

    public void setIban(String str) {
        this.iban = str;
    }

    public void setIs_agadmin(Integer num) {
        this.is_agadmin = num;
    }

    public void setMobileNumber(String str) {
        this.mobileNumber = str;
    }

    public void setPaymentType(Integer num) {
        this.paymentType = num;
    }

    public void setPaypalEmail(String str) {
        this.paypalEmail = str;
    }

    public void setState(Integer num) {
        this.state = num;
    }

    public void setWithdrawNo(String str) {
        this.withdrawNo = str;
    }

    public String toString() {
        return "WithdrawLogBean(paymentType=" + getPaymentType() + ", state=" + getState() + ", diamond=" + getDiamond() + ", withdrawNo=" + getWithdrawNo() + ", createTime=" + getCreateTime() + ", mobileNumber=" + getMobileNumber() + ", paypalEmail=" + getPaypalEmail() + ", bankName=" + getBankName() + ", iban=" + getIban() + ", agadminId=" + getAgadminId() + ", coin=" + getCoin() + ", is_agadmin=" + getIs_agadmin() + ")";
    }
}
