package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import net.babycat.live.model.NewJoinRoomBean;

/* JADX INFO: loaded from: classes4.dex */
public class RoomUpMicBean {

    @SerializedName("mic_info")
    private NewJoinRoomBean.AnchorsDTO micInfo;

    @SerializedName("mic_no")
    private Integer micNo;

    @SerializedName("rtc_token")
    private String rtcToken;

    public boolean canEqual(Object obj) {
        return obj instanceof RoomUpMicBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoomUpMicBean)) {
            return false;
        }
        RoomUpMicBean roomUpMicBean = (RoomUpMicBean) obj;
        if (!roomUpMicBean.canEqual(this)) {
            return false;
        }
        Integer micNo = getMicNo();
        Integer micNo2 = roomUpMicBean.getMicNo();
        if (micNo != null ? !micNo.equals(micNo2) : micNo2 != null) {
            return false;
        }
        String rtcToken = getRtcToken();
        String rtcToken2 = roomUpMicBean.getRtcToken();
        if (rtcToken != null ? !rtcToken.equals(rtcToken2) : rtcToken2 != null) {
            return false;
        }
        NewJoinRoomBean.AnchorsDTO micInfo = getMicInfo();
        NewJoinRoomBean.AnchorsDTO micInfo2 = roomUpMicBean.getMicInfo();
        return micInfo != null ? micInfo.equals(micInfo2) : micInfo2 == null;
    }

    public NewJoinRoomBean.AnchorsDTO getMicInfo() {
        return this.micInfo;
    }

    public Integer getMicNo() {
        return this.micNo;
    }

    public String getRtcToken() {
        return this.rtcToken;
    }

    public int hashCode() {
        Integer micNo = getMicNo();
        int iHashCode = micNo == null ? 43 : micNo.hashCode();
        String rtcToken = getRtcToken();
        int iHashCode2 = ((iHashCode + 59) * 59) + (rtcToken == null ? 43 : rtcToken.hashCode());
        NewJoinRoomBean.AnchorsDTO micInfo = getMicInfo();
        return (iHashCode2 * 59) + (micInfo != null ? micInfo.hashCode() : 43);
    }

    public void setMicInfo(NewJoinRoomBean.AnchorsDTO anchorsDTO) {
        this.micInfo = anchorsDTO;
    }

    public void setMicNo(Integer num) {
        this.micNo = num;
    }

    public void setRtcToken(String str) {
        this.rtcToken = str;
    }

    public String toString() {
        return "RoomUpMicBean(micNo=" + getMicNo() + ", rtcToken=" + getRtcToken() + ", micInfo=" + getMicInfo() + ")";
    }
}
