package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class GiftWallBean {

    @SerializedName("gift_img")
    private String giftImg;

    @SerializedName("gift_name")
    private String giftName;

    @SerializedName("gift_num")
    private Integer giftNum;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34841id;

    public boolean canEqual(Object obj) {
        return obj instanceof GiftWallBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftWallBean)) {
            return false;
        }
        GiftWallBean giftWallBean = (GiftWallBean) obj;
        if (!giftWallBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = giftWallBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer giftNum = getGiftNum();
        Integer giftNum2 = giftWallBean.getGiftNum();
        if (giftNum != null ? !giftNum.equals(giftNum2) : giftNum2 != null) {
            return false;
        }
        String giftImg = getGiftImg();
        String giftImg2 = giftWallBean.getGiftImg();
        if (giftImg != null ? !giftImg.equals(giftImg2) : giftImg2 != null) {
            return false;
        }
        String giftName = getGiftName();
        String giftName2 = giftWallBean.getGiftName();
        return giftName != null ? giftName.equals(giftName2) : giftName2 == null;
    }

    public String getGiftImg() {
        return this.giftImg;
    }

    public String getGiftName() {
        return this.giftName;
    }

    public Integer getGiftNum() {
        return this.giftNum;
    }

    public Integer getId() {
        return this.f34841id;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        Integer giftNum = getGiftNum();
        int iHashCode2 = ((iHashCode + 59) * 59) + (giftNum == null ? 43 : giftNum.hashCode());
        String giftImg = getGiftImg();
        int iHashCode3 = (iHashCode2 * 59) + (giftImg == null ? 43 : giftImg.hashCode());
        String giftName = getGiftName();
        return (iHashCode3 * 59) + (giftName != null ? giftName.hashCode() : 43);
    }

    public void setGiftImg(String str) {
        this.giftImg = str;
    }

    public void setGiftName(String str) {
        this.giftName = str;
    }

    public void setGiftNum(Integer num) {
        this.giftNum = num;
    }

    public void setId(Integer num) {
        this.f34841id = num;
    }

    public String toString() {
        return "GiftWallBean(id=" + getId() + ", giftImg=" + getGiftImg() + ", giftNum=" + getGiftNum() + ", giftName=" + getGiftName() + ")";
    }
}
