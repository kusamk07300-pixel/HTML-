package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class GiftInteractBean {

    @SerializedName("act_desc")
    private String actDesc;

    @SerializedName("gift_icon")
    private String giftIcon;

    @SerializedName("gift_id")
    private int giftId;

    @SerializedName("gift_name")
    private String giftName;

    @SerializedName("gift_price")
    private String giftPrice;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private int f34837id;

    @SerializedName("swflink")
    private String swflink;

    @SerializedName("swftype")
    private Integer swftype;

    @SerializedName("type")
    private int type;

    @SerializedName("user_id")
    private int userId;

    public boolean canEqual(Object obj) {
        return obj instanceof GiftInteractBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftInteractBean)) {
            return false;
        }
        GiftInteractBean giftInteractBean = (GiftInteractBean) obj;
        if (!giftInteractBean.canEqual(this) || getId() != giftInteractBean.getId() || getUserId() != giftInteractBean.getUserId() || getGiftId() != giftInteractBean.getGiftId() || getType() != giftInteractBean.getType()) {
            return false;
        }
        Integer swftype = getSwftype();
        Integer swftype2 = giftInteractBean.getSwftype();
        if (swftype != null ? !swftype.equals(swftype2) : swftype2 != null) {
            return false;
        }
        String actDesc = getActDesc();
        String actDesc2 = giftInteractBean.getActDesc();
        if (actDesc != null ? !actDesc.equals(actDesc2) : actDesc2 != null) {
            return false;
        }
        String giftName = getGiftName();
        String giftName2 = giftInteractBean.getGiftName();
        if (giftName != null ? !giftName.equals(giftName2) : giftName2 != null) {
            return false;
        }
        String giftIcon = getGiftIcon();
        String giftIcon2 = giftInteractBean.getGiftIcon();
        if (giftIcon != null ? !giftIcon.equals(giftIcon2) : giftIcon2 != null) {
            return false;
        }
        String giftPrice = getGiftPrice();
        String giftPrice2 = giftInteractBean.getGiftPrice();
        if (giftPrice != null ? !giftPrice.equals(giftPrice2) : giftPrice2 != null) {
            return false;
        }
        String swflink = getSwflink();
        String swflink2 = giftInteractBean.getSwflink();
        return swflink != null ? swflink.equals(swflink2) : swflink2 == null;
    }

    public String getActDesc() {
        return this.actDesc;
    }

    public String getGiftIcon() {
        return this.giftIcon;
    }

    public int getGiftId() {
        return this.giftId;
    }

    public String getGiftName() {
        return this.giftName;
    }

    public String getGiftPrice() {
        return this.giftPrice;
    }

    public int getId() {
        return this.f34837id;
    }

    public String getSwflink() {
        return this.swflink;
    }

    public Integer getSwftype() {
        return this.swftype;
    }

    public int getType() {
        return this.type;
    }

    public int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int id2 = ((((((getId() + 59) * 59) + getUserId()) * 59) + getGiftId()) * 59) + getType();
        Integer swftype = getSwftype();
        int iHashCode = (id2 * 59) + (swftype == null ? 43 : swftype.hashCode());
        String actDesc = getActDesc();
        int iHashCode2 = (iHashCode * 59) + (actDesc == null ? 43 : actDesc.hashCode());
        String giftName = getGiftName();
        int iHashCode3 = (iHashCode2 * 59) + (giftName == null ? 43 : giftName.hashCode());
        String giftIcon = getGiftIcon();
        int iHashCode4 = (iHashCode3 * 59) + (giftIcon == null ? 43 : giftIcon.hashCode());
        String giftPrice = getGiftPrice();
        int iHashCode5 = (iHashCode4 * 59) + (giftPrice == null ? 43 : giftPrice.hashCode());
        String swflink = getSwflink();
        return (iHashCode5 * 59) + (swflink != null ? swflink.hashCode() : 43);
    }

    public void setActDesc(String str) {
        this.actDesc = str;
    }

    public void setGiftIcon(String str) {
        this.giftIcon = str;
    }

    public void setGiftId(int i10) {
        this.giftId = i10;
    }

    public void setGiftName(String str) {
        this.giftName = str;
    }

    public void setGiftPrice(String str) {
        this.giftPrice = str;
    }

    public void setId(int i10) {
        this.f34837id = i10;
    }

    public void setSwflink(String str) {
        this.swflink = str;
    }

    public void setSwftype(Integer num) {
        this.swftype = num;
    }

    public void setType(int i10) {
        this.type = i10;
    }

    public void setUserId(int i10) {
        this.userId = i10;
    }

    public String toString() {
        return "GiftInteractBean(id=" + getId() + ", userId=" + getUserId() + ", giftId=" + getGiftId() + ", actDesc=" + getActDesc() + ", giftName=" + getGiftName() + ", type=" + getType() + ", giftIcon=" + getGiftIcon() + ", giftPrice=" + getGiftPrice() + ", swflink=" + getSwflink() + ", swftype=" + getSwftype() + ")";
    }
}
