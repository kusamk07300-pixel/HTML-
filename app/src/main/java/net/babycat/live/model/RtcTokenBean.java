package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class RtcTokenBean {

    @SerializedName("role")
    private String role;

    @SerializedName("rtc_token")
    private String rtcToken;

    public boolean canEqual(Object obj) {
        return obj instanceof RtcTokenBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RtcTokenBean)) {
            return false;
        }
        RtcTokenBean rtcTokenBean = (RtcTokenBean) obj;
        if (!rtcTokenBean.canEqual(this)) {
            return false;
        }
        String role = getRole();
        String role2 = rtcTokenBean.getRole();
        if (role != null ? !role.equals(role2) : role2 != null) {
            return false;
        }
        String rtcToken = getRtcToken();
        String rtcToken2 = rtcTokenBean.getRtcToken();
        return rtcToken != null ? rtcToken.equals(rtcToken2) : rtcToken2 == null;
    }

    public String getRole() {
        return this.role;
    }

    public String getRtcToken() {
        return this.rtcToken;
    }

    public int hashCode() {
        String role = getRole();
        int iHashCode = role == null ? 43 : role.hashCode();
        String rtcToken = getRtcToken();
        return ((iHashCode + 59) * 59) + (rtcToken != null ? rtcToken.hashCode() : 43);
    }

    public void setRole(String str) {
        this.role = str;
    }

    public void setRtcToken(String str) {
        this.rtcToken = str;
    }

    public String toString() {
        return "RtcTokenBean(role=" + getRole() + ", rtcToken=" + getRtcToken() + ")";
    }
}
