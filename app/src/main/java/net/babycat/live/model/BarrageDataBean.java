package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class BarrageDataBean {

    @SerializedName("act_type")
    private int actType;

    @SerializedName("send_avatar")
    private String sendAvatar;

    @SerializedName("send_content")
    private String sendContent;

    @SerializedName("send_name")
    private String sendName;

    @SerializedName("send_user_id")
    private int sendUserId;

    public boolean canEqual(Object obj) {
        return obj instanceof BarrageDataBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BarrageDataBean)) {
            return false;
        }
        BarrageDataBean barrageDataBean = (BarrageDataBean) obj;
        if (!barrageDataBean.canEqual(this) || getActType() != barrageDataBean.getActType() || getSendUserId() != barrageDataBean.getSendUserId()) {
            return false;
        }
        String sendName = getSendName();
        String sendName2 = barrageDataBean.getSendName();
        if (sendName != null ? !sendName.equals(sendName2) : sendName2 != null) {
            return false;
        }
        String sendAvatar = getSendAvatar();
        String sendAvatar2 = barrageDataBean.getSendAvatar();
        if (sendAvatar != null ? !sendAvatar.equals(sendAvatar2) : sendAvatar2 != null) {
            return false;
        }
        String sendContent = getSendContent();
        String sendContent2 = barrageDataBean.getSendContent();
        return sendContent != null ? sendContent.equals(sendContent2) : sendContent2 == null;
    }

    public int getActType() {
        return this.actType;
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

    public int hashCode() {
        int actType = ((getActType() + 59) * 59) + getSendUserId();
        String sendName = getSendName();
        int iHashCode = (actType * 59) + (sendName == null ? 43 : sendName.hashCode());
        String sendAvatar = getSendAvatar();
        int iHashCode2 = (iHashCode * 59) + (sendAvatar == null ? 43 : sendAvatar.hashCode());
        String sendContent = getSendContent();
        return (iHashCode2 * 59) + (sendContent != null ? sendContent.hashCode() : 43);
    }

    public void setActType(int i10) {
        this.actType = i10;
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

    public String toString() {
        return "BarrageDataBean(sendName=" + getSendName() + ", sendAvatar=" + getSendAvatar() + ", sendContent=" + getSendContent() + ", actType=" + getActType() + ", sendUserId=" + getSendUserId() + ")";
    }
}
