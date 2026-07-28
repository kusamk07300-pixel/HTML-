package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class RoomInfoBean {

    @SerializedName("chat_room_id")
    private String chatroomId;

    @SerializedName("cover")
    private String cover;

    @SerializedName("master_uid")
    private Integer masterUid;

    @SerializedName("nickname")
    private String nickname;

    @SerializedName("room_id")
    private String roomId;

    @SerializedName("room_name")
    private String roomName;

    @SerializedName("tag")
    private String tag;

    @SerializedName("user_count")
    private Integer userCount;

    public boolean canEqual(Object obj) {
        return obj instanceof RoomInfoBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoomInfoBean)) {
            return false;
        }
        RoomInfoBean roomInfoBean = (RoomInfoBean) obj;
        if (!roomInfoBean.canEqual(this)) {
            return false;
        }
        Integer masterUid = getMasterUid();
        Integer masterUid2 = roomInfoBean.getMasterUid();
        if (masterUid != null ? !masterUid.equals(masterUid2) : masterUid2 != null) {
            return false;
        }
        Integer userCount = getUserCount();
        Integer userCount2 = roomInfoBean.getUserCount();
        if (userCount != null ? !userCount.equals(userCount2) : userCount2 != null) {
            return false;
        }
        String cover = getCover();
        String cover2 = roomInfoBean.getCover();
        if (cover != null ? !cover.equals(cover2) : cover2 != null) {
            return false;
        }
        String roomName = getRoomName();
        String roomName2 = roomInfoBean.getRoomName();
        if (roomName != null ? !roomName.equals(roomName2) : roomName2 != null) {
            return false;
        }
        String nickname = getNickname();
        String nickname2 = roomInfoBean.getNickname();
        if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
            return false;
        }
        String tag = getTag();
        String tag2 = roomInfoBean.getTag();
        if (tag != null ? !tag.equals(tag2) : tag2 != null) {
            return false;
        }
        String roomId = getRoomId();
        String roomId2 = roomInfoBean.getRoomId();
        if (roomId != null ? !roomId.equals(roomId2) : roomId2 != null) {
            return false;
        }
        String chatroomId = getChatroomId();
        String chatroomId2 = roomInfoBean.getChatroomId();
        return chatroomId != null ? chatroomId.equals(chatroomId2) : chatroomId2 == null;
    }

    public String getChatroomId() {
        return this.chatroomId;
    }

    public String getCover() {
        return this.cover;
    }

    public Integer getMasterUid() {
        return this.masterUid;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public String getRoomName() {
        return this.roomName;
    }

    public String getTag() {
        return this.tag;
    }

    public Integer getUserCount() {
        return this.userCount;
    }

    public int hashCode() {
        Integer masterUid = getMasterUid();
        int iHashCode = masterUid == null ? 43 : masterUid.hashCode();
        Integer userCount = getUserCount();
        int iHashCode2 = ((iHashCode + 59) * 59) + (userCount == null ? 43 : userCount.hashCode());
        String cover = getCover();
        int iHashCode3 = (iHashCode2 * 59) + (cover == null ? 43 : cover.hashCode());
        String roomName = getRoomName();
        int iHashCode4 = (iHashCode3 * 59) + (roomName == null ? 43 : roomName.hashCode());
        String nickname = getNickname();
        int iHashCode5 = (iHashCode4 * 59) + (nickname == null ? 43 : nickname.hashCode());
        String tag = getTag();
        int iHashCode6 = (iHashCode5 * 59) + (tag == null ? 43 : tag.hashCode());
        String roomId = getRoomId();
        int iHashCode7 = (iHashCode6 * 59) + (roomId == null ? 43 : roomId.hashCode());
        String chatroomId = getChatroomId();
        return (iHashCode7 * 59) + (chatroomId != null ? chatroomId.hashCode() : 43);
    }

    public void setChatroomId(String str) {
        this.chatroomId = str;
    }

    public void setCover(String str) {
        this.cover = str;
    }

    public void setMasterUid(Integer num) {
        this.masterUid = num;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public void setRoomName(String str) {
        this.roomName = str;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setUserCount(Integer num) {
        this.userCount = num;
    }

    public String toString() {
        return "RoomInfoBean(cover=" + getCover() + ", roomName=" + getRoomName() + ", nickname=" + getNickname() + ", tag=" + getTag() + ", roomId=" + getRoomId() + ", chatroomId=" + getChatroomId() + ", masterUid=" + getMasterUid() + ", userCount=" + getUserCount() + ")";
    }
}
