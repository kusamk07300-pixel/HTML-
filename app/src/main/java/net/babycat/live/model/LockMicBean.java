package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class LockMicBean {

    @SerializedName("mic_no")
    private Integer micNo;

    public boolean canEqual(Object obj) {
        return obj instanceof LockMicBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LockMicBean)) {
            return false;
        }
        LockMicBean lockMicBean = (LockMicBean) obj;
        if (!lockMicBean.canEqual(this)) {
            return false;
        }
        Integer micNo = getMicNo();
        Integer micNo2 = lockMicBean.getMicNo();
        return micNo != null ? micNo.equals(micNo2) : micNo2 == null;
    }

    public Integer getMicNo() {
        return this.micNo;
    }

    public int hashCode() {
        Integer micNo = getMicNo();
        return 59 + (micNo == null ? 43 : micNo.hashCode());
    }

    public void setMicNo(Integer num) {
        this.micNo = num;
    }

    public String toString() {
        return "LockMicBean(micNo=" + getMicNo() + ")";
    }
}
