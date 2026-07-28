package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class CmdGifRemoteBean {

    @SerializedName("gif_id")
    private String gifId;

    @SerializedName("is_dice")
    private boolean isDice;

    @SerializedName("mic_num")
    private int micNum;

    public boolean canEqual(Object obj) {
        return obj instanceof CmdGifRemoteBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CmdGifRemoteBean)) {
            return false;
        }
        CmdGifRemoteBean cmdGifRemoteBean = (CmdGifRemoteBean) obj;
        if (!cmdGifRemoteBean.canEqual(this) || getMicNum() != cmdGifRemoteBean.getMicNum() || isDice() != cmdGifRemoteBean.isDice()) {
            return false;
        }
        String gifId = getGifId();
        String gifId2 = cmdGifRemoteBean.getGifId();
        return gifId != null ? gifId.equals(gifId2) : gifId2 == null;
    }

    public String getGifId() {
        return this.gifId;
    }

    public int getMicNum() {
        return this.micNum;
    }

    public int hashCode() {
        int micNum = ((getMicNum() + 59) * 59) + (isDice() ? 79 : 97);
        String gifId = getGifId();
        return (micNum * 59) + (gifId == null ? 43 : gifId.hashCode());
    }

    public boolean isDice() {
        return this.isDice;
    }

    public void setDice(boolean z10) {
        this.isDice = z10;
    }

    public void setGifId(String str) {
        this.gifId = str;
    }

    public void setMicNum(int i10) {
        this.micNum = i10;
    }

    public String toString() {
        return "CmdGifRemoteBean(gifId=" + getGifId() + ", micNum=" + getMicNum() + ", isDice=" + isDice() + ")";
    }
}
