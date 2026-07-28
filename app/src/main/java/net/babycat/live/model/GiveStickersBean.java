package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class GiveStickersBean {

    @SerializedName("fileUrl")
    private String fileUrl;

    @SerializedName("showTime")
    private Integer showTime;

    public boolean canEqual(Object obj) {
        return obj instanceof GiveStickersBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiveStickersBean)) {
            return false;
        }
        GiveStickersBean giveStickersBean = (GiveStickersBean) obj;
        if (!giveStickersBean.canEqual(this)) {
            return false;
        }
        Integer showTime = getShowTime();
        Integer showTime2 = giveStickersBean.getShowTime();
        if (showTime != null ? !showTime.equals(showTime2) : showTime2 != null) {
            return false;
        }
        String fileUrl = getFileUrl();
        String fileUrl2 = giveStickersBean.getFileUrl();
        return fileUrl != null ? fileUrl.equals(fileUrl2) : fileUrl2 == null;
    }

    public String getFileUrl() {
        return this.fileUrl;
    }

    public Integer getShowTime() {
        return this.showTime;
    }

    public int hashCode() {
        Integer showTime = getShowTime();
        int iHashCode = showTime == null ? 43 : showTime.hashCode();
        String fileUrl = getFileUrl();
        return ((iHashCode + 59) * 59) + (fileUrl != null ? fileUrl.hashCode() : 43);
    }

    public void setFileUrl(String str) {
        this.fileUrl = str;
    }

    public void setShowTime(Integer num) {
        this.showTime = num;
    }

    public String toString() {
        return "GiveStickersBean(showTime=" + getShowTime() + ", fileUrl=" + getFileUrl() + ")";
    }
}
