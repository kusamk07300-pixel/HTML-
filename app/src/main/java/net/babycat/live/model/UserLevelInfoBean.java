package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class UserLevelInfoBean {

    @SerializedName("levelAuthor")
    Integer levelAuthor;

    @SerializedName("levelUser")
    Long levelUser;

    @SerializedName("levelid")
    Integer levelid;

    public boolean canEqual(Object obj) {
        return obj instanceof UserLevelInfoBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserLevelInfoBean)) {
            return false;
        }
        UserLevelInfoBean userLevelInfoBean = (UserLevelInfoBean) obj;
        if (!userLevelInfoBean.canEqual(this)) {
            return false;
        }
        Integer levelid = getLevelid();
        Integer levelid2 = userLevelInfoBean.getLevelid();
        if (levelid != null ? !levelid.equals(levelid2) : levelid2 != null) {
            return false;
        }
        Long levelUser = getLevelUser();
        Long levelUser2 = userLevelInfoBean.getLevelUser();
        if (levelUser != null ? !levelUser.equals(levelUser2) : levelUser2 != null) {
            return false;
        }
        Integer levelAuthor = getLevelAuthor();
        Integer levelAuthor2 = userLevelInfoBean.getLevelAuthor();
        return levelAuthor != null ? levelAuthor.equals(levelAuthor2) : levelAuthor2 == null;
    }

    public Integer getLevelAuthor() {
        return this.levelAuthor;
    }

    public Long getLevelUser() {
        return this.levelUser;
    }

    public Integer getLevelid() {
        return this.levelid;
    }

    public int hashCode() {
        Integer levelid = getLevelid();
        int iHashCode = levelid == null ? 43 : levelid.hashCode();
        Long levelUser = getLevelUser();
        int iHashCode2 = ((iHashCode + 59) * 59) + (levelUser == null ? 43 : levelUser.hashCode());
        Integer levelAuthor = getLevelAuthor();
        return (iHashCode2 * 59) + (levelAuthor != null ? levelAuthor.hashCode() : 43);
    }

    public void setLevelAuthor(Integer num) {
        this.levelAuthor = num;
    }

    public void setLevelUser(Long l10) {
        this.levelUser = l10;
    }

    public void setLevelid(Integer num) {
        this.levelid = num;
    }

    public String toString() {
        return "UserLevelInfoBean(levelid=" + getLevelid() + ", levelUser=" + getLevelUser() + ", levelAuthor=" + getLevelAuthor() + ")";
    }
}
