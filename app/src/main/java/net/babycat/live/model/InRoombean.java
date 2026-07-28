package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class InRoombean {

    @SerializedName("is_in")
    private Integer isIn;

    @SerializedName("is_lock")
    private String isLock;

    @SerializedName("live_type")
    private Integer liveType;

    @SerializedName("master_uid")
    private Integer masterUid;

    public boolean canEqual(Object obj) {
        return obj instanceof InRoombean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InRoombean)) {
            return false;
        }
        InRoombean inRoombean = (InRoombean) obj;
        if (!inRoombean.canEqual(this)) {
            return false;
        }
        Integer isIn = getIsIn();
        Integer isIn2 = inRoombean.getIsIn();
        if (isIn != null ? !isIn.equals(isIn2) : isIn2 != null) {
            return false;
        }
        Integer masterUid = getMasterUid();
        Integer masterUid2 = inRoombean.getMasterUid();
        if (masterUid != null ? !masterUid.equals(masterUid2) : masterUid2 != null) {
            return false;
        }
        Integer liveType = getLiveType();
        Integer liveType2 = inRoombean.getLiveType();
        if (liveType != null ? !liveType.equals(liveType2) : liveType2 != null) {
            return false;
        }
        String isLock = getIsLock();
        String isLock2 = inRoombean.getIsLock();
        return isLock != null ? isLock.equals(isLock2) : isLock2 == null;
    }

    public Integer getIsIn() {
        return this.isIn;
    }

    public String getIsLock() {
        return this.isLock;
    }

    public Integer getLiveType() {
        return this.liveType;
    }

    public Integer getMasterUid() {
        return this.masterUid;
    }

    public int hashCode() {
        Integer isIn = getIsIn();
        int iHashCode = isIn == null ? 43 : isIn.hashCode();
        Integer masterUid = getMasterUid();
        int iHashCode2 = ((iHashCode + 59) * 59) + (masterUid == null ? 43 : masterUid.hashCode());
        Integer liveType = getLiveType();
        int iHashCode3 = (iHashCode2 * 59) + (liveType == null ? 43 : liveType.hashCode());
        String isLock = getIsLock();
        return (iHashCode3 * 59) + (isLock != null ? isLock.hashCode() : 43);
    }

    public void setIsIn(Integer num) {
        this.isIn = num;
    }

    public void setIsLock(String str) {
        this.isLock = str;
    }

    public void setLiveType(Integer num) {
        this.liveType = num;
    }

    public void setMasterUid(Integer num) {
        this.masterUid = num;
    }

    public String toString() {
        return "InRoombean(isIn=" + getIsIn() + ", masterUid=" + getMasterUid() + ", liveType=" + getLiveType() + ", isLock=" + getIsLock() + ")";
    }
}
