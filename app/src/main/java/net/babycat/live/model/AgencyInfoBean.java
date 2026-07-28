package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class AgencyInfoBean {

    @SerializedName("agency_id")
    Integer agencyId;

    @SerializedName("join_time")
    String joinTime;

    @SerializedName("level")
    String level;

    @SerializedName("name")
    String name;

    @SerializedName("nickname")
    String nickname;

    @SerializedName("own_uid")
    Integer ownUid;

    public boolean canEqual(Object obj) {
        return obj instanceof AgencyInfoBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AgencyInfoBean)) {
            return false;
        }
        AgencyInfoBean agencyInfoBean = (AgencyInfoBean) obj;
        if (!agencyInfoBean.canEqual(this)) {
            return false;
        }
        Integer agencyId = getAgencyId();
        Integer agencyId2 = agencyInfoBean.getAgencyId();
        if (agencyId != null ? !agencyId.equals(agencyId2) : agencyId2 != null) {
            return false;
        }
        Integer ownUid = getOwnUid();
        Integer ownUid2 = agencyInfoBean.getOwnUid();
        if (ownUid != null ? !ownUid.equals(ownUid2) : ownUid2 != null) {
            return false;
        }
        String joinTime = getJoinTime();
        String joinTime2 = agencyInfoBean.getJoinTime();
        if (joinTime != null ? !joinTime.equals(joinTime2) : joinTime2 != null) {
            return false;
        }
        String name = getName();
        String name2 = agencyInfoBean.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String nickname = getNickname();
        String nickname2 = agencyInfoBean.getNickname();
        if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
            return false;
        }
        String level = getLevel();
        String level2 = agencyInfoBean.getLevel();
        return level != null ? level.equals(level2) : level2 == null;
    }

    public Integer getAgencyId() {
        return this.agencyId;
    }

    public String getJoinTime() {
        return this.joinTime;
    }

    public String getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    public String getNickname() {
        return this.nickname;
    }

    public Integer getOwnUid() {
        return this.ownUid;
    }

    public int hashCode() {
        Integer agencyId = getAgencyId();
        int iHashCode = agencyId == null ? 43 : agencyId.hashCode();
        Integer ownUid = getOwnUid();
        int iHashCode2 = ((iHashCode + 59) * 59) + (ownUid == null ? 43 : ownUid.hashCode());
        String joinTime = getJoinTime();
        int iHashCode3 = (iHashCode2 * 59) + (joinTime == null ? 43 : joinTime.hashCode());
        String name = getName();
        int iHashCode4 = (iHashCode3 * 59) + (name == null ? 43 : name.hashCode());
        String nickname = getNickname();
        int iHashCode5 = (iHashCode4 * 59) + (nickname == null ? 43 : nickname.hashCode());
        String level = getLevel();
        return (iHashCode5 * 59) + (level != null ? level.hashCode() : 43);
    }

    public void setAgencyId(Integer num) {
        this.agencyId = num;
    }

    public void setJoinTime(String str) {
        this.joinTime = str;
    }

    public void setLevel(String str) {
        this.level = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setOwnUid(Integer num) {
        this.ownUid = num;
    }

    public String toString() {
        return "AgencyInfoBean(agencyId=" + getAgencyId() + ", ownUid=" + getOwnUid() + ", joinTime=" + getJoinTime() + ", name=" + getName() + ", nickname=" + getNickname() + ", level=" + getLevel() + ")";
    }
}
