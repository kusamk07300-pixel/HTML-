package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class HostDataBean {

    @SerializedName("avatar")
    String avatar;

    @SerializedName("coins")
    String coins;

    @SerializedName("level")
    String level;

    @SerializedName("uid")
    Integer uid;

    @SerializedName("username")
    String username;

    @SerializedName("valid_days")
    String valid_days;

    @SerializedName("valid_hours")
    String valid_hours;

    public boolean canEqual(Object obj) {
        return obj instanceof HostDataBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HostDataBean)) {
            return false;
        }
        HostDataBean hostDataBean = (HostDataBean) obj;
        if (!hostDataBean.canEqual(this)) {
            return false;
        }
        Integer uid = getUid();
        Integer uid2 = hostDataBean.getUid();
        if (uid != null ? !uid.equals(uid2) : uid2 != null) {
            return false;
        }
        String coins = getCoins();
        String coins2 = hostDataBean.getCoins();
        if (coins != null ? !coins.equals(coins2) : coins2 != null) {
            return false;
        }
        String valid_days = getValid_days();
        String valid_days2 = hostDataBean.getValid_days();
        if (valid_days != null ? !valid_days.equals(valid_days2) : valid_days2 != null) {
            return false;
        }
        String valid_hours = getValid_hours();
        String valid_hours2 = hostDataBean.getValid_hours();
        if (valid_hours != null ? !valid_hours.equals(valid_hours2) : valid_hours2 != null) {
            return false;
        }
        String username = getUsername();
        String username2 = hostDataBean.getUsername();
        if (username != null ? !username.equals(username2) : username2 != null) {
            return false;
        }
        String avatar = getAvatar();
        String avatar2 = hostDataBean.getAvatar();
        if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
            return false;
        }
        String level = getLevel();
        String level2 = hostDataBean.getLevel();
        return level != null ? level.equals(level2) : level2 == null;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getCoins() {
        return this.coins;
    }

    public String getLevel() {
        return this.level;
    }

    public Integer getUid() {
        return this.uid;
    }

    public String getUsername() {
        return this.username;
    }

    public String getValid_days() {
        return this.valid_days;
    }

    public String getValid_hours() {
        return this.valid_hours;
    }

    public int hashCode() {
        Integer uid = getUid();
        int iHashCode = uid == null ? 43 : uid.hashCode();
        String coins = getCoins();
        int iHashCode2 = ((iHashCode + 59) * 59) + (coins == null ? 43 : coins.hashCode());
        String valid_days = getValid_days();
        int iHashCode3 = (iHashCode2 * 59) + (valid_days == null ? 43 : valid_days.hashCode());
        String valid_hours = getValid_hours();
        int iHashCode4 = (iHashCode3 * 59) + (valid_hours == null ? 43 : valid_hours.hashCode());
        String username = getUsername();
        int iHashCode5 = (iHashCode4 * 59) + (username == null ? 43 : username.hashCode());
        String avatar = getAvatar();
        int iHashCode6 = (iHashCode5 * 59) + (avatar == null ? 43 : avatar.hashCode());
        String level = getLevel();
        return (iHashCode6 * 59) + (level != null ? level.hashCode() : 43);
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setCoins(String str) {
        this.coins = str;
    }

    public void setLevel(String str) {
        this.level = str;
    }

    public void setUid(Integer num) {
        this.uid = num;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public void setValid_days(String str) {
        this.valid_days = str;
    }

    public void setValid_hours(String str) {
        this.valid_hours = str;
    }

    public String toString() {
        return "HostDataBean(uid=" + getUid() + ", coins=" + getCoins() + ", valid_days=" + getValid_days() + ", valid_hours=" + getValid_hours() + ", username=" + getUsername() + ", avatar=" + getAvatar() + ", level=" + getLevel() + ")";
    }
}
