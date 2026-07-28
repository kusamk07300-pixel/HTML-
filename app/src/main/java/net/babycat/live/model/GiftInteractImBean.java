package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class GiftInteractImBean {

    @SerializedName("action")
    private int action;

    @SerializedName("list")
    private List<GiftInteractBean> list;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("room_id")
    private String roomId;

    @SerializedName("uid")
    private long uid;

    public boolean canEqual(Object obj) {
        return obj instanceof GiftInteractImBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftInteractImBean)) {
            return false;
        }
        GiftInteractImBean giftInteractImBean = (GiftInteractImBean) obj;
        if (!giftInteractImBean.canEqual(this) || getAction() != giftInteractImBean.getAction() || getUid() != giftInteractImBean.getUid()) {
            return false;
        }
        String msg = getMsg();
        String msg2 = giftInteractImBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        String roomId = getRoomId();
        String roomId2 = giftInteractImBean.getRoomId();
        if (roomId != null ? !roomId.equals(roomId2) : roomId2 != null) {
            return false;
        }
        List<GiftInteractBean> list = getList();
        List<GiftInteractBean> list2 = giftInteractImBean.getList();
        return list != null ? list.equals(list2) : list2 == null;
    }

    public int getAction() {
        return this.action;
    }

    public List<GiftInteractBean> getList() {
        return this.list;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public long getUid() {
        return this.uid;
    }

    public int hashCode() {
        int action = getAction() + 59;
        long uid = getUid();
        int i10 = (action * 59) + ((int) (uid ^ (uid >>> 32)));
        String msg = getMsg();
        int iHashCode = (i10 * 59) + (msg == null ? 43 : msg.hashCode());
        String roomId = getRoomId();
        int iHashCode2 = (iHashCode * 59) + (roomId == null ? 43 : roomId.hashCode());
        List<GiftInteractBean> list = getList();
        return (iHashCode2 * 59) + (list != null ? list.hashCode() : 43);
    }

    public void setAction(int i10) {
        this.action = i10;
    }

    public void setList(List<GiftInteractBean> list) {
        this.list = list;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public void setUid(long j10) {
        this.uid = j10;
    }

    public String toString() {
        return "GiftInteractImBean(msg=" + getMsg() + ", action=" + getAction() + ", roomId=" + getRoomId() + ", uid=" + getUid() + ", list=" + getList() + ")";
    }
}
