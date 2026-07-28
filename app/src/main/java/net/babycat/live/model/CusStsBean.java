package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;

/* JADX INFO: loaded from: classes4.dex */
public class CusStsBean {

    @SerializedName("code")
    private Integer code;

    @SerializedName("data")
    private StsBean data;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private Integer time;

    public boolean canEqual(Object obj) {
        return obj instanceof CusStsBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CusStsBean)) {
            return false;
        }
        CusStsBean cusStsBean = (CusStsBean) obj;
        if (!cusStsBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = cusStsBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = cusStsBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = cusStsBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        StsBean data = getData();
        StsBean data2 = cusStsBean.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    public Integer getCode() {
        return this.code;
    }

    public StsBean getData() {
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
        StsBean data = getData();
        return (iHashCode3 * 59) + (data != null ? data.hashCode() : 43);
    }

    public void setCode(Integer num) {
        this.code = num;
    }

    public void setData(StsBean stsBean) {
        this.data = stsBean;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setTime(Integer num) {
        this.time = num;
    }

    public String toString() {
        return "CusStsBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
