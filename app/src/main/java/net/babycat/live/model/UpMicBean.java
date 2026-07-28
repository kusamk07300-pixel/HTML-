package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class UpMicBean {

    @SerializedName("mic_num")
    Integer micNum;

    public boolean canEqual(Object obj) {
        return obj instanceof UpMicBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpMicBean)) {
            return false;
        }
        UpMicBean upMicBean = (UpMicBean) obj;
        if (!upMicBean.canEqual(this)) {
            return false;
        }
        Integer micNum = getMicNum();
        Integer micNum2 = upMicBean.getMicNum();
        return micNum != null ? micNum.equals(micNum2) : micNum2 == null;
    }

    public Integer getMicNum() {
        return this.micNum;
    }

    public int hashCode() {
        Integer micNum = getMicNum();
        return 59 + (micNum == null ? 43 : micNum.hashCode());
    }

    public void setMicNum(Integer num) {
        this.micNum = num;
    }

    public String toString() {
        return "UpMicBean(micNum=" + getMicNum() + ")";
    }
}
