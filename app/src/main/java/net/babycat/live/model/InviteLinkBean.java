package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class InviteLinkBean {

    @SerializedName("img")
    private String img;

    @SerializedName("invite_rule_url")
    private String inviteRuleUrl;

    @SerializedName("rewards")
    private RewardsDTO rewards;

    @SerializedName("rules")
    private List<RulesDTO> rules;

    @SerializedName("url")
    private String url;

    public static class RewardsDTO {

        @SerializedName("charge")
        private String charge;

        @SerializedName("dollar")
        private String dollar;

        @SerializedName("invite")
        private String invite;

        @SerializedName("send_gift")
        private String sendGift;

        public boolean canEqual(Object obj) {
            return obj instanceof RewardsDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RewardsDTO)) {
                return false;
            }
            RewardsDTO rewardsDTO = (RewardsDTO) obj;
            if (!rewardsDTO.canEqual(this)) {
                return false;
            }
            String invite = getInvite();
            String invite2 = rewardsDTO.getInvite();
            if (invite != null ? !invite.equals(invite2) : invite2 != null) {
                return false;
            }
            String charge = getCharge();
            String charge2 = rewardsDTO.getCharge();
            if (charge != null ? !charge.equals(charge2) : charge2 != null) {
                return false;
            }
            String sendGift = getSendGift();
            String sendGift2 = rewardsDTO.getSendGift();
            if (sendGift != null ? !sendGift.equals(sendGift2) : sendGift2 != null) {
                return false;
            }
            String dollar = getDollar();
            String dollar2 = rewardsDTO.getDollar();
            return dollar != null ? dollar.equals(dollar2) : dollar2 == null;
        }

        public String getCharge() {
            return this.charge;
        }

        public String getDollar() {
            return this.dollar;
        }

        public String getInvite() {
            return this.invite;
        }

        public String getSendGift() {
            return this.sendGift;
        }

        public int hashCode() {
            String invite = getInvite();
            int iHashCode = invite == null ? 43 : invite.hashCode();
            String charge = getCharge();
            int iHashCode2 = ((iHashCode + 59) * 59) + (charge == null ? 43 : charge.hashCode());
            String sendGift = getSendGift();
            int iHashCode3 = (iHashCode2 * 59) + (sendGift == null ? 43 : sendGift.hashCode());
            String dollar = getDollar();
            return (iHashCode3 * 59) + (dollar != null ? dollar.hashCode() : 43);
        }

        public void setCharge(String str) {
            this.charge = str;
        }

        public void setDollar(String str) {
            this.dollar = str;
        }

        public void setInvite(String str) {
            this.invite = str;
        }

        public void setSendGift(String str) {
            this.sendGift = str;
        }

        public String toString() {
            return "InviteLinkBean.RewardsDTO(invite=" + getInvite() + ", charge=" + getCharge() + ", sendGift=" + getSendGift() + ", dollar=" + getDollar() + ")";
        }
    }

    public static class RulesDTO {

        @SerializedName("coin")
        private String coin;

        @SerializedName("dollar")
        private String dollar;

        @SerializedName("title")
        private String title;

        public boolean canEqual(Object obj) {
            return obj instanceof RulesDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RulesDTO)) {
                return false;
            }
            RulesDTO rulesDTO = (RulesDTO) obj;
            if (!rulesDTO.canEqual(this)) {
                return false;
            }
            String title = getTitle();
            String title2 = rulesDTO.getTitle();
            if (title != null ? !title.equals(title2) : title2 != null) {
                return false;
            }
            String dollar = getDollar();
            String dollar2 = rulesDTO.getDollar();
            if (dollar != null ? !dollar.equals(dollar2) : dollar2 != null) {
                return false;
            }
            String coin = getCoin();
            String coin2 = rulesDTO.getCoin();
            return coin != null ? coin.equals(coin2) : coin2 == null;
        }

        public String getCoin() {
            return this.coin;
        }

        public String getDollar() {
            return this.dollar;
        }

        public String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String title = getTitle();
            int iHashCode = title == null ? 43 : title.hashCode();
            String dollar = getDollar();
            int iHashCode2 = ((iHashCode + 59) * 59) + (dollar == null ? 43 : dollar.hashCode());
            String coin = getCoin();
            return (iHashCode2 * 59) + (coin != null ? coin.hashCode() : 43);
        }

        public void setCoin(String str) {
            this.coin = str;
        }

        public void setDollar(String str) {
            this.dollar = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public String toString() {
            return "InviteLinkBean.RulesDTO(title=" + getTitle() + ", dollar=" + getDollar() + ", coin=" + getCoin() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof InviteLinkBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InviteLinkBean)) {
            return false;
        }
        InviteLinkBean inviteLinkBean = (InviteLinkBean) obj;
        if (!inviteLinkBean.canEqual(this)) {
            return false;
        }
        String url = getUrl();
        String url2 = inviteLinkBean.getUrl();
        if (url != null ? !url.equals(url2) : url2 != null) {
            return false;
        }
        String img = getImg();
        String img2 = inviteLinkBean.getImg();
        if (img != null ? !img.equals(img2) : img2 != null) {
            return false;
        }
        String inviteRuleUrl = getInviteRuleUrl();
        String inviteRuleUrl2 = inviteLinkBean.getInviteRuleUrl();
        if (inviteRuleUrl != null ? !inviteRuleUrl.equals(inviteRuleUrl2) : inviteRuleUrl2 != null) {
            return false;
        }
        RewardsDTO rewards = getRewards();
        RewardsDTO rewards2 = inviteLinkBean.getRewards();
        if (rewards != null ? !rewards.equals(rewards2) : rewards2 != null) {
            return false;
        }
        List<RulesDTO> rules = getRules();
        List<RulesDTO> rules2 = inviteLinkBean.getRules();
        return rules != null ? rules.equals(rules2) : rules2 == null;
    }

    public String getImg() {
        return this.img;
    }

    public String getInviteRuleUrl() {
        return this.inviteRuleUrl;
    }

    public RewardsDTO getRewards() {
        return this.rewards;
    }

    public List<RulesDTO> getRules() {
        return this.rules;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String url = getUrl();
        int iHashCode = url == null ? 43 : url.hashCode();
        String img = getImg();
        int iHashCode2 = ((iHashCode + 59) * 59) + (img == null ? 43 : img.hashCode());
        String inviteRuleUrl = getInviteRuleUrl();
        int iHashCode3 = (iHashCode2 * 59) + (inviteRuleUrl == null ? 43 : inviteRuleUrl.hashCode());
        RewardsDTO rewards = getRewards();
        int iHashCode4 = (iHashCode3 * 59) + (rewards == null ? 43 : rewards.hashCode());
        List<RulesDTO> rules = getRules();
        return (iHashCode4 * 59) + (rules != null ? rules.hashCode() : 43);
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setInviteRuleUrl(String str) {
        this.inviteRuleUrl = str;
    }

    public void setRewards(RewardsDTO rewardsDTO) {
        this.rewards = rewardsDTO;
    }

    public void setRules(List<RulesDTO> list) {
        this.rules = list;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "InviteLinkBean(url=" + getUrl() + ", img=" + getImg() + ", inviteRuleUrl=" + getInviteRuleUrl() + ", rewards=" + getRewards() + ", rules=" + getRules() + ")";
    }
}
