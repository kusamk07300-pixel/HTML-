package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class ChargeBean {

    @SerializedName("trade_no")
    private String tradeNo;

    @SerializedName("type")
    private int type = 4;

    @SerializedName("payment_url")
    private String paymentUrl = "";

    public boolean canEqual(Object obj) {
        return obj instanceof ChargeBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChargeBean)) {
            return false;
        }
        ChargeBean chargeBean = (ChargeBean) obj;
        if (!chargeBean.canEqual(this) || getType() != chargeBean.getType()) {
            return false;
        }
        String tradeNo = getTradeNo();
        String tradeNo2 = chargeBean.getTradeNo();
        if (tradeNo != null ? !tradeNo.equals(tradeNo2) : tradeNo2 != null) {
            return false;
        }
        String paymentUrl = getPaymentUrl();
        String paymentUrl2 = chargeBean.getPaymentUrl();
        return paymentUrl != null ? paymentUrl.equals(paymentUrl2) : paymentUrl2 == null;
    }

    public String getPaymentUrl() {
        return this.paymentUrl;
    }

    public String getTradeNo() {
        return this.tradeNo;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        int type = getType() + 59;
        String tradeNo = getTradeNo();
        int iHashCode = (type * 59) + (tradeNo == null ? 43 : tradeNo.hashCode());
        String paymentUrl = getPaymentUrl();
        return (iHashCode * 59) + (paymentUrl != null ? paymentUrl.hashCode() : 43);
    }

    public void setPaymentUrl(String str) {
        this.paymentUrl = str;
    }

    public void setTradeNo(String str) {
        this.tradeNo = str;
    }

    public void setType(int i10) {
        this.type = i10;
    }

    public String toString() {
        return "ChargeBean(tradeNo=" + getTradeNo() + ", type=" + getType() + ", paymentUrl=" + getPaymentUrl() + ")";
    }
}
