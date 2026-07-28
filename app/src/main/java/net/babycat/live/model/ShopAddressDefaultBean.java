package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;

/* JADX INFO: loaded from: classes4.dex */
public class ShopAddressDefaultBean {

    @SerializedName("code")
    private Integer code;

    @SerializedName("data")
    private ShopAddressListBean data;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private Integer time;

    public boolean canEqual(Object obj) {
        return obj instanceof ShopAddressDefaultBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShopAddressDefaultBean)) {
            return false;
        }
        ShopAddressDefaultBean shopAddressDefaultBean = (ShopAddressDefaultBean) obj;
        if (!shopAddressDefaultBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = shopAddressDefaultBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = shopAddressDefaultBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = shopAddressDefaultBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        ShopAddressListBean data = getData();
        ShopAddressListBean data2 = shopAddressDefaultBean.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    public Integer getCode() {
        return this.code;
    }

    public ShopAddressListBean getData() {
        return this.data;
    }

    public String getMsg() {
        return this.msg;
    }

    public Integer getTime() {
        return this.time;
    }

    public int hashCode() {
        Integer code = getCode();
        int iHashCode = code == null ? 43 : code.hashCode();
        Integer time = getTime();
        int iHashCode2 = ((iHashCode + 59) * 59) + (time == null ? 43 : time.hashCode());
        String msg = getMsg();
        int iHashCode3 = (iHashCode2 * 59) + (msg == null ? 43 : msg.hashCode());
        ShopAddressListBean data = getData();
        return (iHashCode3 * 59) + (data != null ? data.hashCode() : 43);
    }

    public void setCode(Integer num) {
        this.code = num;
    }

    public void setData(ShopAddressListBean shopAddressListBean) {
        this.data = shopAddressListBean;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setTime(Integer num) {
        this.time = num;
    }

    public String toString() {
        return "ShopAddressDefaultBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
