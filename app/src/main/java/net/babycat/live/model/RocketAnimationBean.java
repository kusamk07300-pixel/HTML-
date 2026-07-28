package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class RocketAnimationBean {

    @SerializedName("file_link")
    private String fileLink;

    @SerializedName("top1_avatar")
    private String top1Avatar;

    public boolean canEqual(Object obj) {
        return obj instanceof RocketAnimationBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RocketAnimationBean)) {
            return false;
        }
        RocketAnimationBean rocketAnimationBean = (RocketAnimationBean) obj;
        if (!rocketAnimationBean.canEqual(this)) {
            return false;
        }
        String fileLink = getFileLink();
        String fileLink2 = rocketAnimationBean.getFileLink();
        if (fileLink != null ? !fileLink.equals(fileLink2) : fileLink2 != null) {
            return false;
        }
        String top1Avatar = getTop1Avatar();
        String top1Avatar2 = rocketAnimationBean.getTop1Avatar();
        return top1Avatar != null ? top1Avatar.equals(top1Avatar2) : top1Avatar2 == null;
    }

    public String getFileLink() {
        return this.fileLink;
    }

    public String getTop1Avatar() {
        return this.top1Avatar;
    }

    public int hashCode() {
        String fileLink = getFileLink();
        int iHashCode = fileLink == null ? 43 : fileLink.hashCode();
        String top1Avatar = getTop1Avatar();
        return ((iHashCode + 59) * 59) + (top1Avatar != null ? top1Avatar.hashCode() : 43);
    }

    public void setFileLink(String str) {
        this.fileLink = str;
    }

    public void setTop1Avatar(String str) {
        this.top1Avatar = str;
    }

    public String toString() {
        return "RocketAnimationBean(fileLink=" + getFileLink() + ", top1Avatar=" + getTop1Avatar() + ")";
    }
}
