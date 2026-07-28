package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class SpecialRelationBean {

    @SerializedName("gift")
    private String gift;

    public boolean canEqual(Object obj) {
        return obj instanceof SpecialRelationBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpecialRelationBean)) {
            return false;
        }
        SpecialRelationBean specialRelationBean = (SpecialRelationBean) obj;
        if (!specialRelationBean.canEqual(this)) {
            return false;
        }
        String gift = getGift();
        String gift2 = specialRelationBean.getGift();
        return gift != null ? gift.equals(gift2) : gift2 == null;
    }

    public String getGift() {
        return this.gift;
    }

    public int hashCode() {
        String gift = getGift();
        return 59 + (gift == null ? 43 : gift.hashCode());
    }

    public void setGift(String str) {
        this.gift = str;
    }

    public String toString() {
        return "SpecialRelationBean(gift=" + getGift() + ")";
    }
}
