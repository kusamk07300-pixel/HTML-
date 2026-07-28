package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class LockAllMicBean {

    @SerializedName("mic_no")
    private List<Integer> micNo;

    public boolean canEqual(Object obj) {
        return obj instanceof LockAllMicBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LockAllMicBean)) {
            return false;
        }
        LockAllMicBean lockAllMicBean = (LockAllMicBean) obj;
        if (!lockAllMicBean.canEqual(this)) {
            return false;
        }
        List<Integer> micNo = getMicNo();
        List<Integer> micNo2 = lockAllMicBean.getMicNo();
        return micNo != null ? micNo.equals(micNo2) : micNo2 == null;
    }

    public List<Integer> getMicNo() {
        return this.micNo;
    }

    public int hashCode() {
        List<Integer> micNo = getMicNo();
        return 59 + (micNo == null ? 43 : micNo.hashCode());
    }

    public void setMicNo(List<Integer> list) {
        this.micNo = list;
    }

    public String toString() {
        return "LockAllMicBean(micNo=" + getMicNo() + ")";
    }
}
