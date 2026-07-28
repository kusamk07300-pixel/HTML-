package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class AgadminBean {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34794id;

    @SerializedName("nickname")
    private String nickname;

    @SerializedName("portrait")
    private String portrait;

    @SerializedName("rate")
    private String rate;

    public boolean canEqual(Object obj) {
        return obj instanceof AgadminBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AgadminBean)) {
            return false;
        }
        AgadminBean agadminBean = (AgadminBean) obj;
        if (!agadminBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = agadminBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        String nickname = getNickname();
        String nickname2 = agadminBean.getNickname();
        if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
            return false;
        }
        String portrait = getPortrait();
        String portrait2 = agadminBean.getPortrait();
        if (portrait != null ? !portrait.equals(portrait2) : portrait2 != null) {
            return false;
        }
        String rate = getRate();
        String rate2 = agadminBean.getRate();
        return rate != null ? rate.equals(rate2) : rate2 == null;
    }

    public Integer getId() {
        return this.f34794id;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getPortrait() {
        return this.portrait;
    }

    public String getRate() {
        return this.rate;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        String nickname = getNickname();
        int iHashCode2 = ((iHashCode + 59) * 59) + (nickname == null ? 43 : nickname.hashCode());
        String portrait = getPortrait();
        int iHashCode3 = (iHashCode2 * 59) + (portrait == null ? 43 : portrait.hashCode());
        String rate = getRate();
        return (iHashCode3 * 59) + (rate != null ? rate.hashCode() : 43);
    }

    public void setId(Integer num) {
        this.f34794id = num;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setPortrait(String str) {
        this.portrait = str;
    }

    public void setRate(String str) {
        this.rate = str;
    }

    public String toString() {
        return "AgadminBean(id=" + getId() + ", nickname=" + getNickname() + ", portrait=" + getPortrait() + ", rate=" + getRate() + ")";
    }
}
