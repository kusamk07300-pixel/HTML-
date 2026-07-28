package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import net.babycat.live.model.NewJoinRoomBean;

/* JADX INFO: loaded from: classes4.dex */
public class MoveMicBean {

    @SerializedName("mic_info")
    private MicInfoDTO micInfo;

    @SerializedName("mic_no")
    private MicNoDTO micNo;

    public static class MicInfoDTO {

        @SerializedName("from_mic_no")
        private NewJoinRoomBean.AnchorsDTO fromMicNo;

        @SerializedName("to_mic_no")
        private NewJoinRoomBean.AnchorsDTO toMicNo;

        public boolean canEqual(Object obj) {
            return obj instanceof MicInfoDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MicInfoDTO)) {
                return false;
            }
            MicInfoDTO micInfoDTO = (MicInfoDTO) obj;
            if (!micInfoDTO.canEqual(this)) {
                return false;
            }
            NewJoinRoomBean.AnchorsDTO fromMicNo = getFromMicNo();
            NewJoinRoomBean.AnchorsDTO fromMicNo2 = micInfoDTO.getFromMicNo();
            if (fromMicNo != null ? !fromMicNo.equals(fromMicNo2) : fromMicNo2 != null) {
                return false;
            }
            NewJoinRoomBean.AnchorsDTO toMicNo = getToMicNo();
            NewJoinRoomBean.AnchorsDTO toMicNo2 = micInfoDTO.getToMicNo();
            return toMicNo != null ? toMicNo.equals(toMicNo2) : toMicNo2 == null;
        }

        public NewJoinRoomBean.AnchorsDTO getFromMicNo() {
            return this.fromMicNo;
        }

        public NewJoinRoomBean.AnchorsDTO getToMicNo() {
            return this.toMicNo;
        }

        public int hashCode() {
            NewJoinRoomBean.AnchorsDTO fromMicNo = getFromMicNo();
            int iHashCode = fromMicNo == null ? 43 : fromMicNo.hashCode();
            NewJoinRoomBean.AnchorsDTO toMicNo = getToMicNo();
            return ((iHashCode + 59) * 59) + (toMicNo != null ? toMicNo.hashCode() : 43);
        }

        public void setFromMicNo(NewJoinRoomBean.AnchorsDTO anchorsDTO) {
            this.fromMicNo = anchorsDTO;
        }

        public void setToMicNo(NewJoinRoomBean.AnchorsDTO anchorsDTO) {
            this.toMicNo = anchorsDTO;
        }

        public String toString() {
            return "MoveMicBean.MicInfoDTO(fromMicNo=" + getFromMicNo() + ", toMicNo=" + getToMicNo() + ")";
        }
    }

    public static class MicNoDTO {

        @SerializedName("from_mic")
        private Integer fromMic;

        @SerializedName("to_mic")
        private Integer toMic;

        public boolean canEqual(Object obj) {
            return obj instanceof MicNoDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MicNoDTO)) {
                return false;
            }
            MicNoDTO micNoDTO = (MicNoDTO) obj;
            if (!micNoDTO.canEqual(this)) {
                return false;
            }
            Integer fromMic = getFromMic();
            Integer fromMic2 = micNoDTO.getFromMic();
            if (fromMic != null ? !fromMic.equals(fromMic2) : fromMic2 != null) {
                return false;
            }
            Integer toMic = getToMic();
            Integer toMic2 = micNoDTO.getToMic();
            return toMic != null ? toMic.equals(toMic2) : toMic2 == null;
        }

        public Integer getFromMic() {
            return this.fromMic;
        }

        public Integer getToMic() {
            return this.toMic;
        }

        public int hashCode() {
            Integer fromMic = getFromMic();
            int iHashCode = fromMic == null ? 43 : fromMic.hashCode();
            Integer toMic = getToMic();
            return ((iHashCode + 59) * 59) + (toMic != null ? toMic.hashCode() : 43);
        }

        public void setFromMic(Integer num) {
            this.fromMic = num;
        }

        public void setToMic(Integer num) {
            this.toMic = num;
        }

        public String toString() {
            return "MoveMicBean.MicNoDTO(fromMic=" + getFromMic() + ", toMic=" + getToMic() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof MoveMicBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MoveMicBean)) {
            return false;
        }
        MoveMicBean moveMicBean = (MoveMicBean) obj;
        if (!moveMicBean.canEqual(this)) {
            return false;
        }
        MicNoDTO micNo = getMicNo();
        MicNoDTO micNo2 = moveMicBean.getMicNo();
        if (micNo != null ? !micNo.equals(micNo2) : micNo2 != null) {
            return false;
        }
        MicInfoDTO micInfo = getMicInfo();
        MicInfoDTO micInfo2 = moveMicBean.getMicInfo();
        return micInfo != null ? micInfo.equals(micInfo2) : micInfo2 == null;
    }

    public MicInfoDTO getMicInfo() {
        return this.micInfo;
    }

    public MicNoDTO getMicNo() {
        return this.micNo;
    }

    public int hashCode() {
        MicNoDTO micNo = getMicNo();
        int iHashCode = micNo == null ? 43 : micNo.hashCode();
        MicInfoDTO micInfo = getMicInfo();
        return ((iHashCode + 59) * 59) + (micInfo != null ? micInfo.hashCode() : 43);
    }

    public void setMicInfo(MicInfoDTO micInfoDTO) {
        this.micInfo = micInfoDTO;
    }

    public void setMicNo(MicNoDTO micNoDTO) {
        this.micNo = micNoDTO;
    }

    public String toString() {
        return "MoveMicBean(micNo=" + getMicNo() + ", micInfo=" + getMicInfo() + ")";
    }
}
