package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class CmdWitchMicBitsBean {

    @SerializedName("change_mic_mode")
    private ChangeMicModeBean changeMicMode;

    @SerializedName("mic_num")
    private int micNum;

    public boolean canEqual(Object obj) {
        return obj instanceof CmdWitchMicBitsBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CmdWitchMicBitsBean)) {
            return false;
        }
        CmdWitchMicBitsBean cmdWitchMicBitsBean = (CmdWitchMicBitsBean) obj;
        if (!cmdWitchMicBitsBean.canEqual(this) || getMicNum() != cmdWitchMicBitsBean.getMicNum()) {
            return false;
        }
        ChangeMicModeBean changeMicMode = getChangeMicMode();
        ChangeMicModeBean changeMicMode2 = cmdWitchMicBitsBean.getChangeMicMode();
        return changeMicMode != null ? changeMicMode.equals(changeMicMode2) : changeMicMode2 == null;
    }

    public ChangeMicModeBean getChangeMicMode() {
        return this.changeMicMode;
    }

    public int getMicNum() {
        return this.micNum;
    }

    public int hashCode() {
        int micNum = getMicNum() + 59;
        ChangeMicModeBean changeMicMode = getChangeMicMode();
        return (micNum * 59) + (changeMicMode == null ? 43 : changeMicMode.hashCode());
    }

    public void setChangeMicMode(ChangeMicModeBean changeMicModeBean) {
        this.changeMicMode = changeMicModeBean;
    }

    public void setMicNum(int i10) {
        this.micNum = i10;
    }

    public String toString() {
        return "CmdWitchMicBitsBean(changeMicMode=" + getChangeMicMode() + ", micNum=" + getMicNum() + ")";
    }
}
