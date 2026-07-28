package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;

/* JADX INFO: loaded from: classes4.dex */
public class FullVenueGiftBean {

    @SerializedName(o0.c0.f25806t)
    private String background;

    @SerializedName("gift_coin")
    private String giftCoin;

    @SerializedName("gift_icon")
    private String giftIcon;

    @SerializedName("gift_name")
    private String giftName;

    @SerializedName("gift_num")
    private String giftNum;

    @SerializedName("receive_avatar")
    private String receiveAvatar;

    @SerializedName("receive_id")
    private String receiveId;

    @SerializedName("receive_name")
    private String receiveName;

    @SerializedName("room_id")
    private int roomId;

    @SerializedName("send_avatar")
    private String sendAvatar;

    @SerializedName("send_content")
    private String sendContent;

    @SerializedName("send_name")
    private String sendName;

    @SerializedName("send_user_id")
    private int sendUserId;

    @SerializedName("type")
    private Integer type;

    public boolean canEqual(Object obj) {
        return obj instanceof FullVenueGiftBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FullVenueGiftBean)) {
            return false;
        }
        FullVenueGiftBean fullVenueGiftBean = (FullVenueGiftBean) obj;
        if (!fullVenueGiftBean.canEqual(this) || getSendUserId() != fullVenueGiftBean.getSendUserId() || getRoomId() != fullVenueGiftBean.getRoomId()) {
            return false;
        }
        Integer type = getType();
        Integer type2 = fullVenueGiftBean.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        String sendName = getSendName();
        String sendName2 = fullVenueGiftBean.getSendName();
        if (sendName != null ? !sendName.equals(sendName2) : sendName2 != null) {
            return false;
        }
        String background = getBackground();
        String background2 = fullVenueGiftBean.getBackground();
        if (background != null ? !background.equals(background2) : background2 != null) {
            return false;
        }
        String giftName = getGiftName();
        String giftName2 = fullVenueGiftBean.getGiftName();
        if (giftName != null ? !giftName.equals(giftName2) : giftName2 != null) {
            return false;
        }
        String giftNum = getGiftNum();
        String giftNum2 = fullVenueGiftBean.getGiftNum();
        if (giftNum != null ? !giftNum.equals(giftNum2) : giftNum2 != null) {
            return false;
        }
        String receiveName = getReceiveName();
        String receiveName2 = fullVenueGiftBean.getReceiveName();
        if (receiveName != null ? !receiveName.equals(receiveName2) : receiveName2 != null) {
            return false;
        }
        String receiveId = getReceiveId();
        String receiveId2 = fullVenueGiftBean.getReceiveId();
        if (receiveId != null ? !receiveId.equals(receiveId2) : receiveId2 != null) {
            return false;
        }
        String sendAvatar = getSendAvatar();
        String sendAvatar2 = fullVenueGiftBean.getSendAvatar();
        if (sendAvatar != null ? !sendAvatar.equals(sendAvatar2) : sendAvatar2 != null) {
            return false;
        }
        String receiveAvatar = getReceiveAvatar();
        String receiveAvatar2 = fullVenueGiftBean.getReceiveAvatar();
        if (receiveAvatar != null ? !receiveAvatar.equals(receiveAvatar2) : receiveAvatar2 != null) {
            return false;
        }
        String giftIcon = getGiftIcon();
        String giftIcon2 = fullVenueGiftBean.getGiftIcon();
        if (giftIcon != null ? !giftIcon.equals(giftIcon2) : giftIcon2 != null) {
            return false;
        }
        String giftCoin = getGiftCoin();
        String giftCoin2 = fullVenueGiftBean.getGiftCoin();
        if (giftCoin != null ? !giftCoin.equals(giftCoin2) : giftCoin2 != null) {
            return false;
        }
        String sendContent = getSendContent();
        String sendContent2 = fullVenueGiftBean.getSendContent();
        return sendContent != null ? sendContent.equals(sendContent2) : sendContent2 == null;
    }

    public String getBackground() {
        return this.background;
    }

    public String getGiftCoin() {
        return this.giftCoin;
    }

    public String getGiftIcon() {
        return this.giftIcon;
    }

    public String getGiftName() {
        return this.giftName;
    }

    public String getGiftNum() {
        return this.giftNum;
    }

    public String getReceiveAvatar() {
        return this.receiveAvatar;
    }

    public String getReceiveId() {
        return this.receiveId;
    }

    public String getReceiveName() {
        return this.receiveName;
    }

    public int getRoomId() {
        return this.roomId;
    }

    public String getSendAvatar() {
        return this.sendAvatar;
    }

    public String getSendContent() {
        return this.sendContent;
    }

    public String getSendName() {
        return this.sendName;
    }

    public int getSendUserId() {
        return this.sendUserId;
    }

    public Integer getType() {
        return this.type;
    }

    public int hashCode() {
        int sendUserId = ((getSendUserId() + 59) * 59) + getRoomId();
        Integer type = getType();
        int iHashCode = (sendUserId * 59) + (type == null ? 43 : type.hashCode());
        String sendName = getSendName();
        int iHashCode2 = (iHashCode * 59) + (sendName == null ? 43 : sendName.hashCode());
        String background = getBackground();
        int iHashCode3 = (iHashCode2 * 59) + (background == null ? 43 : background.hashCode());
        String giftName = getGiftName();
        int iHashCode4 = (iHashCode3 * 59) + (giftName == null ? 43 : giftName.hashCode());
        String giftNum = getGiftNum();
        int iHashCode5 = (iHashCode4 * 59) + (giftNum == null ? 43 : giftNum.hashCode());
        String receiveName = getReceiveName();
        int iHashCode6 = (iHashCode5 * 59) + (receiveName == null ? 43 : receiveName.hashCode());
        String receiveId = getReceiveId();
        int iHashCode7 = (iHashCode6 * 59) + (receiveId == null ? 43 : receiveId.hashCode());
        String sendAvatar = getSendAvatar();
        int iHashCode8 = (iHashCode7 * 59) + (sendAvatar == null ? 43 : sendAvatar.hashCode());
        String receiveAvatar = getReceiveAvatar();
        int iHashCode9 = (iHashCode8 * 59) + (receiveAvatar == null ? 43 : receiveAvatar.hashCode());
        String giftIcon = getGiftIcon();
        int iHashCode10 = (iHashCode9 * 59) + (giftIcon == null ? 43 : giftIcon.hashCode());
        String giftCoin = getGiftCoin();
        int iHashCode11 = (iHashCode10 * 59) + (giftCoin == null ? 43 : giftCoin.hashCode());
        String sendContent = getSendContent();
        return (iHashCode11 * 59) + (sendContent != null ? sendContent.hashCode() : 43);
    }

    public void setBackground(String str) {
        this.background = str;
    }

    public void setGiftCoin(String str) {
        this.giftCoin = str;
    }

    public void setGiftIcon(String str) {
        this.giftIcon = str;
    }

    public void setGiftName(String str) {
        this.giftName = str;
    }

    public void setGiftNum(String str) {
        this.giftNum = str;
    }

    public void setReceiveAvatar(String str) {
        this.receiveAvatar = str;
    }

    public void setReceiveId(String str) {
        this.receiveId = str;
    }

    public void setReceiveName(String str) {
        this.receiveName = str;
    }

    public void setRoomId(int i10) {
        this.roomId = i10;
    }

    public void setSendAvatar(String str) {
        this.sendAvatar = str;
    }

    public void setSendContent(String str) {
        this.sendContent = str;
    }

    public void setSendName(String str) {
        this.sendName = str;
    }

    public void setSendUserId(int i10) {
        this.sendUserId = i10;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public String toString() {
        return "FullVenueGiftBean(sendUserId=" + getSendUserId() + ", sendName=" + getSendName() + ", background=" + getBackground() + ", roomId=" + getRoomId() + ", giftName=" + getGiftName() + ", giftNum=" + getGiftNum() + ", receiveName=" + getReceiveName() + ", receiveId=" + getReceiveId() + ", type=" + getType() + ", sendAvatar=" + getSendAvatar() + ", receiveAvatar=" + getReceiveAvatar() + ", giftIcon=" + getGiftIcon() + ", giftCoin=" + getGiftCoin() + ", sendContent=" + getSendContent() + ")";
    }
}
