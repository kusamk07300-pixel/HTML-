package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class IMUnifiedDataBean {

    @SerializedName("data")
    private String data;

    @SerializedName("type")
    private int type;

    public IMUnifiedDataBean() {
    }

    public boolean canEqual(Object obj) {
        return obj instanceof IMUnifiedDataBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IMUnifiedDataBean)) {
            return false;
        }
        IMUnifiedDataBean iMUnifiedDataBean = (IMUnifiedDataBean) obj;
        if (!iMUnifiedDataBean.canEqual(this) || getType() != iMUnifiedDataBean.getType()) {
            return false;
        }
        String data = getData();
        String data2 = iMUnifiedDataBean.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    public String getData() {
        return this.data;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        int type = getType() + 59;
        String data = getData();
        return (type * 59) + (data == null ? 43 : data.hashCode());
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setType(int i10) {
        this.type = i10;
    }

    public String toString() {
        return "IMUnifiedDataBean(type=" + getType() + ", data=" + getData() + ")";
    }

    public IMUnifiedDataBean(int i10, String str) {
        this.type = i10;
        this.data = str;
    }
}
