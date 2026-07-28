package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class AapplyWithdrawBean {

    @SerializedName("diamonds")
    private Integer diamonds;

    public boolean canEqual(Object obj) {
        return obj instanceof AapplyWithdrawBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AapplyWithdrawBean)) {
            return false;
        }
        AapplyWithdrawBean aapplyWithdrawBean = (AapplyWithdrawBean) obj;
        if (!aapplyWithdrawBean.canEqual(this)) {
            return false;
        }
        Integer diamonds = getDiamonds();
        Integer diamonds2 = aapplyWithdrawBean.getDiamonds();
        return diamonds != null ? diamonds.equals(diamonds2) : diamonds2 == null;
    }

    public Integer getDiamonds() {
        return this.diamonds;
    }

    public int hashCode() {
        Integer diamonds = getDiamonds();
        return 59 + (diamonds == null ? 43 : diamonds.hashCode());
    }

    public void setDiamonds(Integer num) {
        this.diamonds = num;
    }

    public String toString() {
        return "AapplyWithdrawBean(diamonds=" + getDiamonds() + ")";
    }
}
