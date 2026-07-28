package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;

/* JADX INFO: loaded from: classes4.dex */
public class ShopGoodsProductDetailsBean {

    @SerializedName("code")
    private Integer code;

    @SerializedName("data")
    private ShopGoodsDetailBean data;

    @SerializedName("hasmore")
    private Boolean hasmore;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private Integer time;

    @SerializedName("total")
    private Integer total;

    public boolean canEqual(Object obj) {
        return obj instanceof ShopGoodsProductDetailsBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShopGoodsProductDetailsBean)) {
            return false;
        }
        ShopGoodsProductDetailsBean shopGoodsProductDetailsBean = (ShopGoodsProductDetailsBean) obj;
        if (!shopGoodsProductDetailsBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = shopGoodsProductDetailsBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = shopGoodsProductDetailsBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        Integer total = getTotal();
        Integer total2 = shopGoodsProductDetailsBean.getTotal();
        if (total != null ? !total.equals(total2) : total2 != null) {
            return false;
        }
        Boolean hasmore = getHasmore();
        Boolean hasmore2 = shopGoodsProductDetailsBean.getHasmore();
        if (hasmore != null ? !hasmore.equals(hasmore2) : hasmore2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = shopGoodsProductDetailsBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        ShopGoodsDetailBean data = getData();
        ShopGoodsDetailBean data2 = shopGoodsProductDetailsBean.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    public Integer getCode() {
        return this.code;
    }

    public ShopGoodsDetailBean getData() {
        return this.data;
    }

    public Boolean getHasmore() {
        return this.hasmore;
    }

    public String getMsg() {
        return this.msg;
    }

    public Integer getTime() {
        return this.time;
    }

    public Integer getTotal() {
        return this.total;
    }

    public int hashCode() {
        Integer code = getCode();
        int iHashCode = code == null ? 43 : code.hashCode();
        Integer time = getTime();
        int iHashCode2 = ((iHashCode + 59) * 59) + (time == null ? 43 : time.hashCode());
        Integer total = getTotal();
        int iHashCode3 = (iHashCode2 * 59) + (total == null ? 43 : total.hashCode());
        Boolean hasmore = getHasmore();
        int iHashCode4 = (iHashCode3 * 59) + (hasmore == null ? 43 : hasmore.hashCode());
        String msg = getMsg();
        int iHashCode5 = (iHashCode4 * 59) + (msg == null ? 43 : msg.hashCode());
        ShopGoodsDetailBean data = getData();
        return (iHashCode5 * 59) + (data != null ? data.hashCode() : 43);
    }

    public void setCode(Integer num) {
        this.code = num;
    }

    public void setData(ShopGoodsDetailBean shopGoodsDetailBean) {
        this.data = shopGoodsDetailBean;
    }

    public void setHasmore(Boolean bool) {
        this.hasmore = bool;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setTime(Integer num) {
        this.time = num;
    }

    public void setTotal(Integer num) {
        this.total = num;
    }

    public String toString() {
        return "ShopGoodsProductDetailsBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ", total=" + getTotal() + ", hasmore=" + getHasmore() + ")";
    }
}
