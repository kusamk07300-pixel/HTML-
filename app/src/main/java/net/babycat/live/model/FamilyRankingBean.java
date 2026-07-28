package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class FamilyRankingBean {

    @SerializedName("level_badge")
    private String badge;

    @SerializedName("family")
    private FamilyDoTO family;

    @SerializedName("familyid")
    private Integer familyid;

    @SerializedName("profit")
    private String profit;

    public static class FamilyDoTO {

        @SerializedName("badge")
        private String avatar;

        @SerializedName("briefing")
        private String briefing;

        @SerializedName("name")
        private String name;

        public boolean canEqual(Object obj) {
            return obj instanceof FamilyDoTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FamilyDoTO)) {
                return false;
            }
            FamilyDoTO familyDoTO = (FamilyDoTO) obj;
            if (!familyDoTO.canEqual(this)) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = familyDoTO.getAvatar();
            if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
                return false;
            }
            String name = getName();
            String name2 = familyDoTO.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String briefing = getBriefing();
            String briefing2 = familyDoTO.getBriefing();
            return briefing != null ? briefing.equals(briefing2) : briefing2 == null;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public String getBriefing() {
            return this.briefing;
        }

        public String getName() {
            return this.name;
        }

        public int hashCode() {
            String avatar = getAvatar();
            int iHashCode = avatar == null ? 43 : avatar.hashCode();
            String name = getName();
            int iHashCode2 = ((iHashCode + 59) * 59) + (name == null ? 43 : name.hashCode());
            String briefing = getBriefing();
            return (iHashCode2 * 59) + (briefing != null ? briefing.hashCode() : 43);
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setBriefing(String str) {
            this.briefing = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public String toString() {
            return "FamilyRankingBean.FamilyDoTO(avatar=" + getAvatar() + ", name=" + getName() + ", briefing=" + getBriefing() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof FamilyRankingBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FamilyRankingBean)) {
            return false;
        }
        FamilyRankingBean familyRankingBean = (FamilyRankingBean) obj;
        if (!familyRankingBean.canEqual(this)) {
            return false;
        }
        Integer familyid = getFamilyid();
        Integer familyid2 = familyRankingBean.getFamilyid();
        if (familyid != null ? !familyid.equals(familyid2) : familyid2 != null) {
            return false;
        }
        FamilyDoTO family = getFamily();
        FamilyDoTO family2 = familyRankingBean.getFamily();
        if (family != null ? !family.equals(family2) : family2 != null) {
            return false;
        }
        String profit = getProfit();
        String profit2 = familyRankingBean.getProfit();
        if (profit != null ? !profit.equals(profit2) : profit2 != null) {
            return false;
        }
        String badge = getBadge();
        String badge2 = familyRankingBean.getBadge();
        return badge != null ? badge.equals(badge2) : badge2 == null;
    }

    public String getBadge() {
        return this.badge;
    }

    public FamilyDoTO getFamily() {
        return this.family;
    }

    public Integer getFamilyid() {
        return this.familyid;
    }

    public String getProfit() {
        return this.profit;
    }

    public int hashCode() {
        Integer familyid = getFamilyid();
        int iHashCode = familyid == null ? 43 : familyid.hashCode();
        FamilyDoTO family = getFamily();
        int iHashCode2 = ((iHashCode + 59) * 59) + (family == null ? 43 : family.hashCode());
        String profit = getProfit();
        int iHashCode3 = (iHashCode2 * 59) + (profit == null ? 43 : profit.hashCode());
        String badge = getBadge();
        return (iHashCode3 * 59) + (badge != null ? badge.hashCode() : 43);
    }

    public void setBadge(String str) {
        this.badge = str;
    }

    public void setFamily(FamilyDoTO familyDoTO) {
        this.family = familyDoTO;
    }

    public void setFamilyid(Integer num) {
        this.familyid = num;
    }

    public void setProfit(String str) {
        this.profit = str;
    }

    public String toString() {
        return "FamilyRankingBean(family=" + getFamily() + ", profit=" + getProfit() + ", familyid=" + getFamilyid() + ", badge=" + getBadge() + ")";
    }
}
