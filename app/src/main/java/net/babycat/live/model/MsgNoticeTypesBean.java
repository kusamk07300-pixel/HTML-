package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import com.tencent.qcloud.tuicore.TUIConstants;

/* JADX INFO: loaded from: classes4.dex */
public class MsgNoticeTypesBean {

    @SerializedName(TUIConstants.TUIOfflinePush.NOTIFICATION_EXT_KEY)
    private String ext;

    @SerializedName("room_id")
    private String roomId;

    @SerializedName("type")
    private Integer type;

    @SerializedName("user_id")
    private Integer userId;

    public boolean canEqual(Object obj) {
        return obj instanceof MsgNoticeTypesBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MsgNoticeTypesBean)) {
            return false;
        }
        MsgNoticeTypesBean msgNoticeTypesBean = (MsgNoticeTypesBean) obj;
        if (!msgNoticeTypesBean.canEqual(this)) {
            return false;
        }
        Integer type = getType();
        Integer type2 = msgNoticeTypesBean.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        Integer userId = getUserId();
        Integer userId2 = msgNoticeTypesBean.getUserId();
        if (userId != null ? !userId.equals(userId2) : userId2 != null) {
            return false;
        }
        String ext = getExt();
        String ext2 = msgNoticeTypesBean.getExt();
        if (ext != null ? !ext.equals(ext2) : ext2 != null) {
            return false;
        }
        String roomId = getRoomId();
        String roomId2 = msgNoticeTypesBean.getRoomId();
        return roomId != null ? roomId.equals(roomId2) : roomId2 == null;
    }

    public String getExt() {
        return this.ext;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public int hashCode() {
        Integer type = getType();
        int iHashCode = type == null ? 43 : type.hashCode();
        Integer userId = getUserId();
        int iHashCode2 = ((iHashCode + 59) * 59) + (userId == null ? 43 : userId.hashCode());
        String ext = getExt();
        int iHashCode3 = (iHashCode2 * 59) + (ext == null ? 43 : ext.hashCode());
        String roomId = getRoomId();
        return (iHashCode3 * 59) + (roomId != null ? roomId.hashCode() : 43);
    }

    public void setExt(String str) {
        this.ext = str;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public void setUserId(Integer num) {
        this.userId = num;
    }

    public String toString() {
        return "MsgNoticeTypesBean(type=" + getType() + ", userId=" + getUserId() + ", ext=" + getExt() + ", roomId=" + getRoomId() + ")";
    }
}
