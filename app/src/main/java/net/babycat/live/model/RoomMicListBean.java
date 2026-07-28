package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import net.babycat.live.model.NewJoinRoomBean;

/* JADX INFO: loaded from: classes4.dex */
public class RoomMicListBean {

    @SerializedName("list")
    private List<NewJoinRoomBean.AnchorsDTO> list;

    @SerializedName("total")
    private String total;

    public boolean canEqual(Object obj) {
        return obj instanceof RoomMicListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoomMicListBean)) {
            return false;
        }
        RoomMicListBean roomMicListBean = (RoomMicListBean) obj;
        if (!roomMicListBean.canEqual(this)) {
            return false;
        }
        List<NewJoinRoomBean.AnchorsDTO> list = getList();
        List<NewJoinRoomBean.AnchorsDTO> list2 = roomMicListBean.getList();
        if (list != null ? !list.equals(list2) : list2 != null) {
            return false;
        }
        String total = getTotal();
        String total2 = roomMicListBean.getTotal();
        return total != null ? total.equals(total2) : total2 == null;
    }

    public List<NewJoinRoomBean.AnchorsDTO> getList() {
        return this.list;
    }

    public String getTotal() {
        return this.total;
    }

    public int hashCode() {
        List<NewJoinRoomBean.AnchorsDTO> list = getList();
        int iHashCode = list == null ? 43 : list.hashCode();
        String total = getTotal();
        return ((iHashCode + 59) * 59) + (total != null ? total.hashCode() : 43);
    }

    public void setList(List<NewJoinRoomBean.AnchorsDTO> list) {
        this.list = list;
    }

    public void setTotal(String str) {
        this.total = str;
    }

    public String toString() {
        return "RoomMicListBean(list=" + getList() + ", total=" + getTotal() + ")";
    }
}
