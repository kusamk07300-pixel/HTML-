package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class BalanceBean {

    @SerializedName("balance")
    String balance;

    public boolean canEqual(Object obj) {
        return obj instanceof BalanceBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BalanceBean)) {
            return false;
        }
        BalanceBean balanceBean = (BalanceBean) obj;
        if (!balanceBean.canEqual(this)) {
            return false;
        }
        String balance = getBalance();
        String balance2 = balanceBean.getBalance();
        return balance != null ? balance.equals(balance2) : balance2 == null;
    }

    public String getBalance() {
        return this.balance;
    }

    public int hashCode() {
        String balance = getBalance();
        return 59 + (balance == null ? 43 : balance.hashCode());
    }

    public void setBalance(String str) {
        this.balance = str;
    }

    public String toString() {
        return "BalanceBean(balance=" + getBalance() + ")";
    }
}
