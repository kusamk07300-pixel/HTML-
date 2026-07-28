package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class InChantRoomBean {

    @SerializedName("comm_chat_room")
    String commChatRoom;

    @SerializedName("room_id")
    String roomId;

    @SerializedName("user_id")
    Integer userId;

    public boolean canEqual(Object obj) {
        return obj instanceof InChantRoomBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InChantRoomBean)) {
            return false;
        }
        InChantRoomBean inChantRoomBean = (InChantRoomBean) obj;
        if (!inChantRoomBean.canEqual(this)) {
            return false;
        }
        Integer userId = getUserId();
        Integer userId2 = inChantRoomBean.getUserId();
        if (userId != null ? !userId.equals(userId2) : userId2 != null) {
            return false;
        }
        String commChatRoom = getCommChatRoom();
        String commChatRoom2 = inChantRoomBean.getCommChatRoom();
        if (commChatRoom != null ? !commChatRoom.equals(commChatRoom2) : commChatRoom2 != null) {
            return false;
        }
        String roomId = getRoomId();
        String roomId2 = inChantRoomBean.getRoomId();
        return roomId != null ? roomId.equals(roomId2) : roomId2 == null;
    }

    public String getCommChatRoom() {
        return this.commChatRoom;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public int hashCode() {
        Integer userId = getUserId();
        int iHashCode = userId == null ? 43 : userId.hashCode();
        String commChatRoom = getCommChatRoom();
        int iHashCode2 = ((iHashCode + 59) * 59) + (commChatRoom == null ? 43 : commChatRoom.hashCode());
        String roomId = getRoomId();
        return (iHashCode2 * 59) + (roomId != null ? roomId.hashCode() : 43);
    }

    public void setCommChatRoom(String str) {
        this.commChatRoom = str;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public void setUserId(Integer num) {
        this.userId = num;
    }

    public String toString() {
        return "InChantRoomBean(commChatRoom=" + getCommChatRoom() + ", userId=" + getUserId() + ", roomId=" + getRoomId() + ")";
    }
}
