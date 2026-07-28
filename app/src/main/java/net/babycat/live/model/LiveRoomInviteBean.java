package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class LiveRoomInviteBean {

    @SerializedName("mic_num")
    private Integer micNum;

    @SerializedName("type")
    private Integer type;

    @SerializedName("user_id")
    private Integer userID;

    @SerializedName("user_name")
    private String userName;

    public boolean canEqual(Object obj) {
        return obj instanceof LiveRoomInviteBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveRoomInviteBean)) {
            return false;
        }
        LiveRoomInviteBean liveRoomInviteBean = (LiveRoomInviteBean) obj;
        if (!liveRoomInviteBean.canEqual(this)) {
            return false;
        }
        Integer userID = getUserID();
        Integer userID2 = liveRoomInviteBean.getUserID();
        if (userID != null ? !userID.equals(userID2) : userID2 != null) {
            return false;
        }
        Integer micNum = getMicNum();
        Integer micNum2 = liveRoomInviteBean.getMicNum();
        if (micNum != null ? !micNum.equals(micNum2) : micNum2 != null) {
            return false;
        }
        Integer type = getType();
        Integer type2 = liveRoomInviteBean.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        String userName = getUserName();
        String userName2 = liveRoomInviteBean.getUserName();
        return userName != null ? userName.equals(userName2) : userName2 == null;
    }

    public Integer getMicNum() {
        return this.micNum;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getUserID() {
        return this.userID;
    }

    public String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        Integer userID = getUserID();
        int iHashCode = userID == null ? 43 : userID.hashCode();
        Integer micNum = getMicNum();
        int iHashCode2 = ((iHashCode + 59) * 59) + (micNum == null ? 43 : micNum.hashCode());
        Integer type = getType();
        int iHashCode3 = (iHashCode2 * 59) + (type == null ? 43 : type.hashCode());
        String userName = getUserName();
        return (iHashCode3 * 59) + (userName != null ? userName.hashCode() : 43);
    }

    public void setMicNum(Integer num) {
        this.micNum = num;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public void setUserID(Integer num) {
        this.userID = num;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public String toString() {
        return "LiveRoomInviteBean(userName=" + getUserName() + ", userID=" + getUserID() + ", micNum=" + getMicNum() + ", type=" + getType() + ")";
    }
}
