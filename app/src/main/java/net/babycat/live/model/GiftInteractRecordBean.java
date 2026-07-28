package net.babycat.live.model;

/* JADX INFO: loaded from: classes4.dex */
public class GiftInteractRecordBean {
    private String giftIcon;
    private String giftName;
    private int giftNum;
    private int giftPrice;
    private long timestamp;

    public GiftInteractRecordBean() {
    }

    public boolean canEqual(Object obj) {
        return obj instanceof GiftInteractRecordBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftInteractRecordBean)) {
            return false;
        }
        GiftInteractRecordBean giftInteractRecordBean = (GiftInteractRecordBean) obj;
        if (!giftInteractRecordBean.canEqual(this) || getGiftPrice() != giftInteractRecordBean.getGiftPrice() || getGiftNum() != giftInteractRecordBean.getGiftNum() || getTimestamp() != giftInteractRecordBean.getTimestamp()) {
            return false;
        }
        String giftIcon = getGiftIcon();
        String giftIcon2 = giftInteractRecordBean.getGiftIcon();
        if (giftIcon != null ? !giftIcon.equals(giftIcon2) : giftIcon2 != null) {
            return false;
        }
        String giftName = getGiftName();
        String giftName2 = giftInteractRecordBean.getGiftName();
        return giftName != null ? giftName.equals(giftName2) : giftName2 == null;
    }

    public String getGiftIcon() {
        return this.giftIcon;
    }

    public String getGiftName() {
        return this.giftName;
    }

    public int getGiftNum() {
        return this.giftNum;
    }

    public int getGiftPrice() {
        return this.giftPrice;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int giftPrice = ((getGiftPrice() + 59) * 59) + getGiftNum();
        long timestamp = getTimestamp();
        int i10 = (giftPrice * 59) + ((int) (timestamp ^ (timestamp >>> 32)));
        String giftIcon = getGiftIcon();
        int iHashCode = (i10 * 59) + (giftIcon == null ? 43 : giftIcon.hashCode());
        String giftName = getGiftName();
        return (iHashCode * 59) + (giftName != null ? giftName.hashCode() : 43);
    }

    public void setGiftIcon(String str) {
        this.giftIcon = str;
    }

    public void setGiftName(String str) {
        this.giftName = str;
    }

    public void setGiftNum(int i10) {
        this.giftNum = i10;
    }

    public void setGiftPrice(int i10) {
        this.giftPrice = i10;
    }

    public void setTimestamp(long j10) {
        this.timestamp = j10;
    }

    public String toString() {
        return "GiftInteractRecordBean(giftIcon=" + getGiftIcon() + ", giftName=" + getGiftName() + ", giftPrice=" + getGiftPrice() + ", giftNum=" + getGiftNum() + ", timestamp=" + getTimestamp() + ")";
    }

    public GiftInteractRecordBean(String str, String str2, int i10, int i11) {
        this.giftIcon = str;
        this.giftName = str2;
        this.giftPrice = i10;
        this.giftNum = i11;
        this.timestamp = System.currentTimeMillis();
    }
}
