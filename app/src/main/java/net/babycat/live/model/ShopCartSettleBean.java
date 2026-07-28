package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class ShopCartSettleBean {

    @SerializedName("order_id")
    private Integer orderId;

    public boolean canEqual(Object obj) {
        return obj instanceof ShopCartSettleBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShopCartSettleBean)) {
            return false;
        }
        ShopCartSettleBean shopCartSettleBean = (ShopCartSettleBean) obj;
        if (!shopCartSettleBean.canEqual(this)) {
            return false;
        }
        Integer orderId = getOrderId();
        Integer orderId2 = shopCartSettleBean.getOrderId();
        return orderId != null ? orderId.equals(orderId2) : orderId2 == null;
    }

    public Integer getOrderId() {
        return this.orderId;
    }

    public int hashCode() {
        Integer orderId = getOrderId();
        return 59 + (orderId == null ? 43 : orderId.hashCode());
    }

    public void setOrderId(Integer num) {
        this.orderId = num;
    }

    public String toString() {
        return "ShopCartSettleBean(orderId=" + getOrderId() + ")";
    }
}
