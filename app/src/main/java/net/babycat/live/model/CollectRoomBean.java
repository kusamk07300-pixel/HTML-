package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class CollectRoomBean {

    @SerializedName("create_time")
    private String createTime;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34812id;

    @SerializedName("room_id")
    private String roomId;

    @SerializedName("room_info")
    private RoomInfoBean roomInfo;

    public boolean canEqual(Object obj) {
        return obj instanceof CollectRoomBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CollectRoomBean)) {
            return false;
        }
        CollectRoomBean collectRoomBean = (CollectRoomBean) obj;
        if (!collectRoomBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = collectRoomBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        String roomId = getRoomId();
        String roomId2 = collectRoomBean.getRoomId();
        if (roomId != null ? !roomId.equals(roomId2) : roomId2 != null) {
            return false;
        }
        String createTime = getCreateTime();
        String createTime2 = collectRoomBean.getCreateTime();
        if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
            return false;
        }
        RoomInfoBean roomInfo = getRoomInfo();
        RoomInfoBean roomInfo2 = collectRoomBean.getRoomInfo();
        return roomInfo != null ? roomInfo.equals(roomInfo2) : roomInfo2 == null;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public Integer getId() {
        return this.f34812id;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public RoomInfoBean getRoomInfo() {
        return this.roomInfo;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        String roomId = getRoomId();
        int iHashCode2 = ((iHashCode + 59) * 59) + (roomId == null ? 43 : roomId.hashCode());
        String createTime = getCreateTime();
        int iHashCode3 = (iHashCode2 * 59) + (createTime == null ? 43 : createTime.hashCode());
        RoomInfoBean roomInfo = getRoomInfo();
        return (iHashCode3 * 59) + (roomInfo != null ? roomInfo.hashCode() : 43);
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setId(Integer num) {
        this.f34812id = num;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public void setRoomInfo(RoomInfoBean roomInfoBean) {
        this.roomInfo = roomInfoBean;
    }

    public String toString() {
        return "CollectRoomBean(id=" + getId() + ", roomId=" + getRoomId() + ", createTime=" + getCreateTime() + ", roomInfo=" + getRoomInfo() + ")";
    }
}
