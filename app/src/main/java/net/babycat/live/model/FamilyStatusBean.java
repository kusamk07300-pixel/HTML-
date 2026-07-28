package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;

/* JADX INFO: loaded from: classes4.dex */
public class FamilyStatusBean {

    @SerializedName("familyid")
    private int familyid;

    @SerializedName("min_wealth_info")
    private String minWealthInfo;

    @SerializedName(o0.CATEGORY_STATUS)
    private int status;

    @SerializedName("uid")
    private int uid;

    public boolean canEqual(Object obj) {
        return obj instanceof FamilyStatusBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FamilyStatusBean)) {
            return false;
        }
        FamilyStatusBean familyStatusBean = (FamilyStatusBean) obj;
        if (!familyStatusBean.canEqual(this) || getUid() != familyStatusBean.getUid() || getStatus() != familyStatusBean.getStatus() || getFamilyid() != familyStatusBean.getFamilyid()) {
            return false;
        }
        String minWealthInfo = getMinWealthInfo();
        String minWealthInfo2 = familyStatusBean.getMinWealthInfo();
        return minWealthInfo != null ? minWealthInfo.equals(minWealthInfo2) : minWealthInfo2 == null;
    }

    public int getFamilyid() {
        return this.familyid;
    }

    public String getMinWealthInfo() {
        return this.minWealthInfo;
    }

    public int getStatus() {
        return this.status;
    }

    public int getUid() {
        return this.uid;
    }

    public int hashCode() {
        int uid = ((((getUid() + 59) * 59) + getStatus()) * 59) + getFamilyid();
        String minWealthInfo = getMinWealthInfo();
        return (uid * 59) + (minWealthInfo == null ? 43 : minWealthInfo.hashCode());
    }

    public void setFamilyid(int i10) {
        this.familyid = i10;
    }

    public void setMinWealthInfo(String str) {
        this.minWealthInfo = str;
    }

    public void setStatus(int i10) {
        this.status = i10;
    }

    public void setUid(int i10) {
        this.uid = i10;
    }

    public String toString() {
        return "FamilyStatusBean(uid=" + getUid() + ", status=" + getStatus() + ", familyid=" + getFamilyid() + ", minWealthInfo=" + getMinWealthInfo() + ")";
    }
}
