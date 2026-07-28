package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class MyRoomIdBean implements Serializable {

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("chatroom_id")
    private String chatroomId;

    @SerializedName("name")
    private String name;

    @SerializedName(TUIConstants.TUIChat.NOTICE)
    private String notice;

    @SerializedName("room_id")
    private String roomId;

    public boolean canEqual(Object obj) {
        return obj instanceof MyRoomIdBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyRoomIdBean)) {
            return false;
        }
        MyRoomIdBean myRoomIdBean = (MyRoomIdBean) obj;
        if (!myRoomIdBean.canEqual(this)) {
            return false;
        }
        String roomId = getRoomId();
        String roomId2 = myRoomIdBean.getRoomId();
        if (roomId != null ? !roomId.equals(roomId2) : roomId2 != null) {
            return false;
        }
        String chatroomId = getChatroomId();
        String chatroomId2 = myRoomIdBean.getChatroomId();
        if (chatroomId != null ? !chatroomId.equals(chatroomId2) : chatroomId2 != null) {
            return false;
        }
        String name = getName();
        String name2 = myRoomIdBean.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String avatar = getAvatar();
        String avatar2 = myRoomIdBean.getAvatar();
        if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
            return false;
        }
        String notice = getNotice();
        String notice2 = myRoomIdBean.getNotice();
        return notice != null ? notice.equals(notice2) : notice2 == null;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getChatroomId() {
        return this.chatroomId;
    }

    public String getName() {
        return this.name;
    }

    public String getNotice() {
        return this.notice;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public int hashCode() {
        String roomId = getRoomId();
        int iHashCode = roomId == null ? 43 : roomId.hashCode();
        String chatroomId = getChatroomId();
        int iHashCode2 = ((iHashCode + 59) * 59) + (chatroomId == null ? 43 : chatroomId.hashCode());
        String name = getName();
        int iHashCode3 = (iHashCode2 * 59) + (name == null ? 43 : name.hashCode());
        String avatar = getAvatar();
        int iHashCode4 = (iHashCode3 * 59) + (avatar == null ? 43 : avatar.hashCode());
        String notice = getNotice();
        return (iHashCode4 * 59) + (notice != null ? notice.hashCode() : 43);
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setChatroomId(String str) {
        this.chatroomId = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNotice(String str) {
        this.notice = str;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public String toString() {
        return "MyRoomIdBean(roomId=" + getRoomId() + ", chatroomId=" + getChatroomId() + ", name=" + getName() + ", avatar=" + getAvatar() + ", notice=" + getNotice() + ")";
    }
}
