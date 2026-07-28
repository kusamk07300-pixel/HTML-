package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class ContributionBean {

    @SerializedName("anchor_level")
    private Integer anchorLevel;

    @SerializedName("avatar")
    private String avatar;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34813id;

    @SerializedName("level")
    private Integer level;

    @SerializedName("nickname")
    private String nickname;

    @SerializedName("sex")
    private Integer sex;

    @SerializedName("total_amount")
    private String totalAmount;

    public boolean canEqual(Object obj) {
        return obj instanceof ContributionBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContributionBean)) {
            return false;
        }
        ContributionBean contributionBean = (ContributionBean) obj;
        if (!contributionBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = contributionBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer sex = getSex();
        Integer sex2 = contributionBean.getSex();
        if (sex != null ? !sex.equals(sex2) : sex2 != null) {
            return false;
        }
        Integer level = getLevel();
        Integer level2 = contributionBean.getLevel();
        if (level != null ? !level.equals(level2) : level2 != null) {
            return false;
        }
        Integer anchorLevel = getAnchorLevel();
        Integer anchorLevel2 = contributionBean.getAnchorLevel();
        if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
            return false;
        }
        String nickname = getNickname();
        String nickname2 = contributionBean.getNickname();
        if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
            return false;
        }
        String avatar = getAvatar();
        String avatar2 = contributionBean.getAvatar();
        if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
            return false;
        }
        String totalAmount = getTotalAmount();
        String totalAmount2 = contributionBean.getTotalAmount();
        return totalAmount != null ? totalAmount.equals(totalAmount2) : totalAmount2 == null;
    }

    public Integer getAnchorLevel() {
        return this.anchorLevel;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public Integer getId() {
        return this.f34813id;
    }

    public Integer getLevel() {
        return this.level;
    }

    public String getNickname() {
        return this.nickname;
    }

    public Integer getSex() {
        return this.sex;
    }

    public String getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        Integer sex = getSex();
        int iHashCode2 = ((iHashCode + 59) * 59) + (sex == null ? 43 : sex.hashCode());
        Integer level = getLevel();
        int iHashCode3 = (iHashCode2 * 59) + (level == null ? 43 : level.hashCode());
        Integer anchorLevel = getAnchorLevel();
        int iHashCode4 = (iHashCode3 * 59) + (anchorLevel == null ? 43 : anchorLevel.hashCode());
        String nickname = getNickname();
        int iHashCode5 = (iHashCode4 * 59) + (nickname == null ? 43 : nickname.hashCode());
        String avatar = getAvatar();
        int iHashCode6 = (iHashCode5 * 59) + (avatar == null ? 43 : avatar.hashCode());
        String totalAmount = getTotalAmount();
        return (iHashCode6 * 59) + (totalAmount != null ? totalAmount.hashCode() : 43);
    }

    public void setAnchorLevel(Integer num) {
        this.anchorLevel = num;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setId(Integer num) {
        this.f34813id = num;
    }

    public void setLevel(Integer num) {
        this.level = num;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setSex(Integer num) {
        this.sex = num;
    }

    public void setTotalAmount(String str) {
        this.totalAmount = str;
    }

    public String toString() {
        return "ContributionBean(id=" + getId() + ", nickname=" + getNickname() + ", sex=" + getSex() + ", avatar=" + getAvatar() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ", totalAmount=" + getTotalAmount() + ")";
    }
}
