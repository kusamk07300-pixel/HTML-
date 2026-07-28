package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import com.tencent.qcloud.tuicore.TUIConstants;

/* JADX INFO: loaded from: classes4.dex */
public class RoomDataBean {

    @SerializedName("name")
    private String name;

    @SerializedName(TUIConstants.TUIChat.NOTICE)
    private String notice;

    public RoomDataBean() {
    }

    public boolean canEqual(Object obj) {
        return obj instanceof RoomDataBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoomDataBean)) {
            return false;
        }
        RoomDataBean roomDataBean = (RoomDataBean) obj;
        if (!roomDataBean.canEqual(this)) {
            return false;
        }
        String name = getName();
        String name2 = roomDataBean.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String notice = getNotice();
        String notice2 = roomDataBean.getNotice();
        return notice != null ? notice.equals(notice2) : notice2 == null;
    }

    public String getName() {
        return this.name;
    }

    public String getNotice() {
        return this.notice;
    }

    public int hashCode() {
        String name = getName();
        int iHashCode = name == null ? 43 : name.hashCode();
        String notice = getNotice();
        return ((iHashCode + 59) * 59) + (notice != null ? notice.hashCode() : 43);
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNotice(String str) {
        this.notice = str;
    }

    public String toString() {
        return "RoomDataBean(name=" + getName() + ", notice=" + getNotice() + ")";
    }

    public RoomDataBean(String str, String str2) {
        this.name = str;
        this.notice = str2;
    }
}
