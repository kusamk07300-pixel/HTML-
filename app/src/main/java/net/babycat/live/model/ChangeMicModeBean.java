package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import net.babycat.live.model.NewJoinRoomBean;

/* JADX INFO: loaded from: classes4.dex */
public class ChangeMicModeBean {

    @SerializedName("down_mic")
    private List<NewJoinRoomBean.AnchorsDTO> downMic;

    @SerializedName("full_mic")
    private List<NewJoinRoomBean.AnchorsDTO> fullMic;

    public boolean canEqual(Object obj) {
        return obj instanceof ChangeMicModeBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChangeMicModeBean)) {
            return false;
        }
        ChangeMicModeBean changeMicModeBean = (ChangeMicModeBean) obj;
        if (!changeMicModeBean.canEqual(this)) {
            return false;
        }
        List<NewJoinRoomBean.AnchorsDTO> downMic = getDownMic();
        List<NewJoinRoomBean.AnchorsDTO> downMic2 = changeMicModeBean.getDownMic();
        if (downMic != null ? !downMic.equals(downMic2) : downMic2 != null) {
            return false;
        }
        List<NewJoinRoomBean.AnchorsDTO> fullMic = getFullMic();
        List<NewJoinRoomBean.AnchorsDTO> fullMic2 = changeMicModeBean.getFullMic();
        return fullMic != null ? fullMic.equals(fullMic2) : fullMic2 == null;
    }

    public List<NewJoinRoomBean.AnchorsDTO> getDownMic() {
        return this.downMic;
    }

    public List<NewJoinRoomBean.AnchorsDTO> getFullMic() {
        return this.fullMic;
    }

    public int hashCode() {
        List<NewJoinRoomBean.AnchorsDTO> downMic = getDownMic();
        int iHashCode = downMic == null ? 43 : downMic.hashCode();
        List<NewJoinRoomBean.AnchorsDTO> fullMic = getFullMic();
        return ((iHashCode + 59) * 59) + (fullMic != null ? fullMic.hashCode() : 43);
    }

    public void setDownMic(List<NewJoinRoomBean.AnchorsDTO> list) {
        this.downMic = list;
    }

    public void setFullMic(List<NewJoinRoomBean.AnchorsDTO> list) {
        this.fullMic = list;
    }

    public String toString() {
        return "ChangeMicModeBean(downMic=" + getDownMic() + ", fullMic=" + getFullMic() + ")";
    }
}
