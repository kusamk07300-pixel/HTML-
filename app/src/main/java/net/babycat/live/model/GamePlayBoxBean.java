package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class GamePlayBoxBean {

    @SerializedName("days")
    private String days;

    @SerializedName("fid")
    private String fid;

    @SerializedName("icon")
    private String icon;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private String f34836id;

    @SerializedName("text")
    private String text;

    @SerializedName("type")
    private String type;

    @SerializedName("vip_icon")
    private Integer vipIcon;

    public boolean canEqual(Object obj) {
        return obj instanceof GamePlayBoxBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GamePlayBoxBean)) {
            return false;
        }
        GamePlayBoxBean gamePlayBoxBean = (GamePlayBoxBean) obj;
        if (!gamePlayBoxBean.canEqual(this)) {
            return false;
        }
        Integer vipIcon = getVipIcon();
        Integer vipIcon2 = gamePlayBoxBean.getVipIcon();
        if (vipIcon != null ? !vipIcon.equals(vipIcon2) : vipIcon2 != null) {
            return false;
        }
        String id2 = getId();
        String id3 = gamePlayBoxBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        String fid = getFid();
        String fid2 = gamePlayBoxBean.getFid();
        if (fid != null ? !fid.equals(fid2) : fid2 != null) {
            return false;
        }
        String type = getType();
        String type2 = gamePlayBoxBean.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        String icon = getIcon();
        String icon2 = gamePlayBoxBean.getIcon();
        if (icon != null ? !icon.equals(icon2) : icon2 != null) {
            return false;
        }
        String text = getText();
        String text2 = gamePlayBoxBean.getText();
        if (text != null ? !text.equals(text2) : text2 != null) {
            return false;
        }
        String days = getDays();
        String days2 = gamePlayBoxBean.getDays();
        return days != null ? days.equals(days2) : days2 == null;
    }

    public String getDays() {
        return this.days;
    }

    public String getFid() {
        return this.fid;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.f34836id;
    }

    public String getText() {
        return this.text;
    }

    public String getType() {
        return this.type;
    }

    public Integer getVipIcon() {
        return this.vipIcon;
    }

    public int hashCode() {
        Integer vipIcon = getVipIcon();
        int iHashCode = vipIcon == null ? 43 : vipIcon.hashCode();
        String id2 = getId();
        int iHashCode2 = ((iHashCode + 59) * 59) + (id2 == null ? 43 : id2.hashCode());
        String fid = getFid();
        int iHashCode3 = (iHashCode2 * 59) + (fid == null ? 43 : fid.hashCode());
        String type = getType();
        int iHashCode4 = (iHashCode3 * 59) + (type == null ? 43 : type.hashCode());
        String icon = getIcon();
        int iHashCode5 = (iHashCode4 * 59) + (icon == null ? 43 : icon.hashCode());
        String text = getText();
        int iHashCode6 = (iHashCode5 * 59) + (text == null ? 43 : text.hashCode());
        String days = getDays();
        return (iHashCode6 * 59) + (days != null ? days.hashCode() : 43);
    }

    public void setDays(String str) {
        this.days = str;
    }

    public void setFid(String str) {
        this.fid = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setId(String str) {
        this.f34836id = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVipIcon(Integer num) {
        this.vipIcon = num;
    }

    public String toString() {
        return "GamePlayBoxBean(id=" + getId() + ", fid=" + getFid() + ", type=" + getType() + ", vipIcon=" + getVipIcon() + ", icon=" + getIcon() + ", text=" + getText() + ", days=" + getDays() + ")";
    }
}
