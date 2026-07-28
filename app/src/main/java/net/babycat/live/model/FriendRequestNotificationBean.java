package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class FriendRequestNotificationBean {

    @SerializedName("touid")
    private int touid;

    @SerializedName("id")
    private int uid;

    public boolean canEqual(Object obj) {
        return obj instanceof FriendRequestNotificationBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FriendRequestNotificationBean)) {
            return false;
        }
        FriendRequestNotificationBean friendRequestNotificationBean = (FriendRequestNotificationBean) obj;
        return friendRequestNotificationBean.canEqual(this) && getUid() == friendRequestNotificationBean.getUid() && getTouid() == friendRequestNotificationBean.getTouid();
    }

    public int getTouid() {
        return this.touid;
    }

    public int getUid() {
        return this.uid;
    }

    public int hashCode() {
        return ((getUid() + 59) * 59) + getTouid();
    }

    public void setTouid(int i10) {
        this.touid = i10;
    }

    public void setUid(int i10) {
        this.uid = i10;
    }

    public String toString() {
        return "FriendRequestNotificationBean(uid=" + getUid() + ", touid=" + getTouid() + ")";
    }
}
