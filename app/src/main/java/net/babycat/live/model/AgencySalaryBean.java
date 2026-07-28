package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class AgencySalaryBean {

    @SerializedName("agency_salary")
    private Integer agencySalary;

    @SerializedName("create_time")
    private String createTime;

    @SerializedName("days")
    private Integer days;

    @SerializedName("diamonds")
    private Integer diamonds;

    @SerializedName("diamonds_rate")
    private String diamondsRate;

    @SerializedName("diamonds_salary")
    private Integer diamondsSalary;

    @SerializedName("gold_coins")
    private Integer goldCoins;

    @SerializedName("gold_salary")
    private Integer goldSalary;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34797id;

    @SerializedName("level")
    private Integer level;

    @SerializedName("total_salary")
    private Integer totalSalary;

    @SerializedName("update_time")
    private String updateTime;

    public boolean canEqual(Object obj) {
        return obj instanceof AgencySalaryBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AgencySalaryBean)) {
            return false;
        }
        AgencySalaryBean agencySalaryBean = (AgencySalaryBean) obj;
        if (!agencySalaryBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = agencySalaryBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer level = getLevel();
        Integer level2 = agencySalaryBean.getLevel();
        if (level != null ? !level.equals(level2) : level2 != null) {
            return false;
        }
        Integer goldCoins = getGoldCoins();
        Integer goldCoins2 = agencySalaryBean.getGoldCoins();
        if (goldCoins != null ? !goldCoins.equals(goldCoins2) : goldCoins2 != null) {
            return false;
        }
        Integer goldSalary = getGoldSalary();
        Integer goldSalary2 = agencySalaryBean.getGoldSalary();
        if (goldSalary != null ? !goldSalary.equals(goldSalary2) : goldSalary2 != null) {
            return false;
        }
        Integer diamonds = getDiamonds();
        Integer diamonds2 = agencySalaryBean.getDiamonds();
        if (diamonds != null ? !diamonds.equals(diamonds2) : diamonds2 != null) {
            return false;
        }
        Integer diamondsSalary = getDiamondsSalary();
        Integer diamondsSalary2 = agencySalaryBean.getDiamondsSalary();
        if (diamondsSalary != null ? !diamondsSalary.equals(diamondsSalary2) : diamondsSalary2 != null) {
            return false;
        }
        Integer totalSalary = getTotalSalary();
        Integer totalSalary2 = agencySalaryBean.getTotalSalary();
        if (totalSalary != null ? !totalSalary.equals(totalSalary2) : totalSalary2 != null) {
            return false;
        }
        Integer agencySalary = getAgencySalary();
        Integer agencySalary2 = agencySalaryBean.getAgencySalary();
        if (agencySalary != null ? !agencySalary.equals(agencySalary2) : agencySalary2 != null) {
            return false;
        }
        Integer days = getDays();
        Integer days2 = agencySalaryBean.getDays();
        if (days != null ? !days.equals(days2) : days2 != null) {
            return false;
        }
        String diamondsRate = getDiamondsRate();
        String diamondsRate2 = agencySalaryBean.getDiamondsRate();
        if (diamondsRate != null ? !diamondsRate.equals(diamondsRate2) : diamondsRate2 != null) {
            return false;
        }
        String createTime = getCreateTime();
        String createTime2 = agencySalaryBean.getCreateTime();
        if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
            return false;
        }
        String updateTime = getUpdateTime();
        String updateTime2 = agencySalaryBean.getUpdateTime();
        return updateTime != null ? updateTime.equals(updateTime2) : updateTime2 == null;
    }

    public Integer getAgencySalary() {
        return this.agencySalary;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public Integer getDays() {
        return this.days;
    }

    public Integer getDiamonds() {
        return this.diamonds;
    }

    public String getDiamondsRate() {
        return this.diamondsRate;
    }

    public Integer getDiamondsSalary() {
        return this.diamondsSalary;
    }

    public Integer getGoldCoins() {
        return this.goldCoins;
    }

    public Integer getGoldSalary() {
        return this.goldSalary;
    }

    public Integer getId() {
        return this.f34797id;
    }

    public Integer getLevel() {
        return this.level;
    }

    public Integer getTotalSalary() {
        return this.totalSalary;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        Integer level = getLevel();
        int iHashCode2 = ((iHashCode + 59) * 59) + (level == null ? 43 : level.hashCode());
        Integer goldCoins = getGoldCoins();
        int iHashCode3 = (iHashCode2 * 59) + (goldCoins == null ? 43 : goldCoins.hashCode());
        Integer goldSalary = getGoldSalary();
        int iHashCode4 = (iHashCode3 * 59) + (goldSalary == null ? 43 : goldSalary.hashCode());
        Integer diamonds = getDiamonds();
        int iHashCode5 = (iHashCode4 * 59) + (diamonds == null ? 43 : diamonds.hashCode());
        Integer diamondsSalary = getDiamondsSalary();
        int iHashCode6 = (iHashCode5 * 59) + (diamondsSalary == null ? 43 : diamondsSalary.hashCode());
        Integer totalSalary = getTotalSalary();
        int iHashCode7 = (iHashCode6 * 59) + (totalSalary == null ? 43 : totalSalary.hashCode());
        Integer agencySalary = getAgencySalary();
        int iHashCode8 = (iHashCode7 * 59) + (agencySalary == null ? 43 : agencySalary.hashCode());
        Integer days = getDays();
        int iHashCode9 = (iHashCode8 * 59) + (days == null ? 43 : days.hashCode());
        String diamondsRate = getDiamondsRate();
        int iHashCode10 = (iHashCode9 * 59) + (diamondsRate == null ? 43 : diamondsRate.hashCode());
        String createTime = getCreateTime();
        int iHashCode11 = (iHashCode10 * 59) + (createTime == null ? 43 : createTime.hashCode());
        String updateTime = getUpdateTime();
        return (iHashCode11 * 59) + (updateTime != null ? updateTime.hashCode() : 43);
    }

    public void setAgencySalary(Integer num) {
        this.agencySalary = num;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setDays(Integer num) {
        this.days = num;
    }

    public void setDiamonds(Integer num) {
        this.diamonds = num;
    }

    public void setDiamondsRate(String str) {
        this.diamondsRate = str;
    }

    public void setDiamondsSalary(Integer num) {
        this.diamondsSalary = num;
    }

    public void setGoldCoins(Integer num) {
        this.goldCoins = num;
    }

    public void setGoldSalary(Integer num) {
        this.goldSalary = num;
    }

    public void setId(Integer num) {
        this.f34797id = num;
    }

    public void setLevel(Integer num) {
        this.level = num;
    }

    public void setTotalSalary(Integer num) {
        this.totalSalary = num;
    }

    public void setUpdateTime(String str) {
        this.updateTime = str;
    }

    public String toString() {
        return "AgencySalaryBean(id=" + getId() + ", level=" + getLevel() + ", goldCoins=" + getGoldCoins() + ", goldSalary=" + getGoldSalary() + ", diamonds=" + getDiamonds() + ", diamondsSalary=" + getDiamondsSalary() + ", diamondsRate=" + getDiamondsRate() + ", totalSalary=" + getTotalSalary() + ", agencySalary=" + getAgencySalary() + ", days=" + getDays() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ")";
    }
}
