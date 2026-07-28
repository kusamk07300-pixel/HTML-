package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class GifRemoteBean {

    @SerializedName("gif_id")
    private String gifId;

    @SerializedName("gif_name")
    private String gifName;

    @SerializedName("is_dice")
    private boolean isDice;

    @SerializedName("is_vip")
    private Integer isVip;

    public boolean canEqual(Object obj) {
        return obj instanceof GifRemoteBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GifRemoteBean)) {
            return false;
        }
        GifRemoteBean gifRemoteBean = (GifRemoteBean) obj;
        if (!gifRemoteBean.canEqual(this) || isDice() != gifRemoteBean.isDice()) {
            return false;
        }
        Integer isVip = getIsVip();
        Integer isVip2 = gifRemoteBean.getIsVip();
        if (isVip != null ? !isVip.equals(isVip2) : isVip2 != null) {
            return false;
        }
        String gifId = getGifId();
        String gifId2 = gifRemoteBean.getGifId();
        if (gifId != null ? !gifId.equals(gifId2) : gifId2 != null) {
            return false;
        }
        String gifName = getGifName();
        String gifName2 = gifRemoteBean.getGifName();
        return gifName != null ? gifName.equals(gifName2) : gifName2 == null;
    }

    public String getGifId() {
        return this.gifId;
    }

    public String getGifName() {
        return this.gifName;
    }

    public Integer getIsVip() {
        return this.isVip;
    }

    public int hashCode() {
        int i10 = isDice() ? 79 : 97;
        Integer isVip = getIsVip();
        int iHashCode = ((i10 + 59) * 59) + (isVip == null ? 43 : isVip.hashCode());
        String gifId = getGifId();
        int iHashCode2 = (iHashCode * 59) + (gifId == null ? 43 : gifId.hashCode());
        String gifName = getGifName();
        return (iHashCode2 * 59) + (gifName != null ? gifName.hashCode() : 43);
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

    public void setGifName(String str) {
        this.gifName = str;
    }

    public void setIsVip(Integer num) {
        this.isVip = num;
    }

    public String toString() {
        return "GifRemoteBean(gifId=" + getGifId() + ", gifName=" + getGifName() + ", isVip=" + getIsVip() + ", isDice=" + isDice() + ")";
    }
}
