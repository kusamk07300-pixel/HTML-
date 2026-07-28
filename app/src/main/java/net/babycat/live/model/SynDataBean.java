package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import net.babycat.live.model.LiveRoomInfoBean;

/* JADX INFO: loaded from: classes4.dex */
public class SynDataBean {

    @SerializedName("countdown")
    private String countdown;

    @SerializedName("top3_list")
    private List<LiveRoomInfoBean.Top3List> top3List;

    @SerializedName("user_count")
    private String userCount;

    public boolean canEqual(Object obj) {
        return obj instanceof SynDataBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SynDataBean)) {
            return false;
        }
        SynDataBean synDataBean = (SynDataBean) obj;
        if (!synDataBean.canEqual(this)) {
            return false;
        }
        String userCount = getUserCount();
        String userCount2 = synDataBean.getUserCount();
        if (userCount != null ? !userCount.equals(userCount2) : userCount2 != null) {
            return false;
        }
        String countdown = getCountdown();
        String countdown2 = synDataBean.getCountdown();
        if (countdown != null ? !countdown.equals(countdown2) : countdown2 != null) {
            return false;
        }
        List<LiveRoomInfoBean.Top3List> top3List = getTop3List();
        List<LiveRoomInfoBean.Top3List> top3List2 = synDataBean.getTop3List();
        return top3List != null ? top3List.equals(top3List2) : top3List2 == null;
    }

    public String getCountdown() {
        return this.countdown;
    }

    public List<LiveRoomInfoBean.Top3List> getTop3List() {
        return this.top3List;
    }

    public String getUserCount() {
        return this.userCount;
    }

    public int hashCode() {
        String userCount = getUserCount();
        int iHashCode = userCount == null ? 43 : userCount.hashCode();
        String countdown = getCountdown();
        int iHashCode2 = ((iHashCode + 59) * 59) + (countdown == null ? 43 : countdown.hashCode());
        List<LiveRoomInfoBean.Top3List> top3List = getTop3List();
        return (iHashCode2 * 59) + (top3List != null ? top3List.hashCode() : 43);
    }

    public void setCountdown(String str) {
        this.countdown = str;
    }

    public void setTop3List(List<LiveRoomInfoBean.Top3List> list) {
        this.top3List = list;
    }

    public void setUserCount(String str) {
        this.userCount = str;
    }

    public String toString() {
        return "SynDataBean(userCount=" + getUserCount() + ", countdown=" + getCountdown() + ", top3List=" + getTop3List() + ")";
    }
}
