package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class PayRewardsBean {

    @SerializedName("remaining_time")
    Long remainingTime;

    @SerializedName("reward_info")
    List<RewardInfoDTO> rewardInfo;

    @SerializedName("weekCharge")
    Long weekCharge;

    public class RewardInfoDTO {

        @SerializedName("amount")
        Long amount;

        @SerializedName("rewards")
        List<RewardsItemDTO> rewards;

        public RewardInfoDTO() {
        }

        public boolean canEqual(Object obj) {
            return obj instanceof RewardInfoDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RewardInfoDTO)) {
                return false;
            }
            RewardInfoDTO rewardInfoDTO = (RewardInfoDTO) obj;
            if (!rewardInfoDTO.canEqual(this)) {
                return false;
            }
            Long amount = getAmount();
            Long amount2 = rewardInfoDTO.getAmount();
            if (amount != null ? !amount.equals(amount2) : amount2 != null) {
                return false;
            }
            List<RewardsItemDTO> rewards = getRewards();
            List<RewardsItemDTO> rewards2 = rewardInfoDTO.getRewards();
            return rewards != null ? rewards.equals(rewards2) : rewards2 == null;
        }

        public Long getAmount() {
            return this.amount;
        }

        public List<RewardsItemDTO> getRewards() {
            return this.rewards;
        }

        public int hashCode() {
            Long amount = getAmount();
            int iHashCode = amount == null ? 43 : amount.hashCode();
            List<RewardsItemDTO> rewards = getRewards();
            return ((iHashCode + 59) * 59) + (rewards != null ? rewards.hashCode() : 43);
        }

        public void setAmount(Long l10) {
            this.amount = l10;
        }

        public void setRewards(List<RewardsItemDTO> list) {
            this.rewards = list;
        }

        public String toString() {
            return "PayRewardsBean.RewardInfoDTO(amount=" + getAmount() + ", rewards=" + getRewards() + ")";
        }
    }

    public class RewardsItemDTO {

        @SerializedName("icon")
        String icon;

        @SerializedName("name")
        String name;

        @SerializedName("text")
        String text;

        @SerializedName("type")
        String type;

        @SerializedName("vip_icon")
        Integer vipIcon = 0;

        public RewardsItemDTO() {
        }

        public boolean canEqual(Object obj) {
            return obj instanceof RewardsItemDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RewardsItemDTO)) {
                return false;
            }
            RewardsItemDTO rewardsItemDTO = (RewardsItemDTO) obj;
            if (!rewardsItemDTO.canEqual(this)) {
                return false;
            }
            Integer vipIcon = getVipIcon();
            Integer vipIcon2 = rewardsItemDTO.getVipIcon();
            if (vipIcon != null ? !vipIcon.equals(vipIcon2) : vipIcon2 != null) {
                return false;
            }
            String icon = getIcon();
            String icon2 = rewardsItemDTO.getIcon();
            if (icon != null ? !icon.equals(icon2) : icon2 != null) {
                return false;
            }
            String name = getName();
            String name2 = rewardsItemDTO.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String text = getText();
            String text2 = rewardsItemDTO.getText();
            if (text != null ? !text.equals(text2) : text2 != null) {
                return false;
            }
            String type = getType();
            String type2 = rewardsItemDTO.getType();
            return type != null ? type.equals(type2) : type2 == null;
        }

        public String getIcon() {
            return this.icon;
        }

        public String getName() {
            return this.name;
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
            String icon = getIcon();
            int iHashCode2 = ((iHashCode + 59) * 59) + (icon == null ? 43 : icon.hashCode());
            String name = getName();
            int iHashCode3 = (iHashCode2 * 59) + (name == null ? 43 : name.hashCode());
            String text = getText();
            int iHashCode4 = (iHashCode3 * 59) + (text == null ? 43 : text.hashCode());
            String type = getType();
            return (iHashCode4 * 59) + (type != null ? type.hashCode() : 43);
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setName(String str) {
            this.name = str;
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
            return "PayRewardsBean.RewardsItemDTO(icon=" + getIcon() + ", name=" + getName() + ", text=" + getText() + ", vipIcon=" + getVipIcon() + ", type=" + getType() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PayRewardsBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PayRewardsBean)) {
            return false;
        }
        PayRewardsBean payRewardsBean = (PayRewardsBean) obj;
        if (!payRewardsBean.canEqual(this)) {
            return false;
        }
        Long remainingTime = getRemainingTime();
        Long remainingTime2 = payRewardsBean.getRemainingTime();
        if (remainingTime != null ? !remainingTime.equals(remainingTime2) : remainingTime2 != null) {
            return false;
        }
        Long weekCharge = getWeekCharge();
        Long weekCharge2 = payRewardsBean.getWeekCharge();
        if (weekCharge != null ? !weekCharge.equals(weekCharge2) : weekCharge2 != null) {
            return false;
        }
        List<RewardInfoDTO> rewardInfo = getRewardInfo();
        List<RewardInfoDTO> rewardInfo2 = payRewardsBean.getRewardInfo();
        return rewardInfo != null ? rewardInfo.equals(rewardInfo2) : rewardInfo2 == null;
    }

    public Long getRemainingTime() {
        return this.remainingTime;
    }

    public List<RewardInfoDTO> getRewardInfo() {
        return this.rewardInfo;
    }

    public Long getWeekCharge() {
        return this.weekCharge;
    }

    public int hashCode() {
        Long remainingTime = getRemainingTime();
        int iHashCode = remainingTime == null ? 43 : remainingTime.hashCode();
        Long weekCharge = getWeekCharge();
        int iHashCode2 = ((iHashCode + 59) * 59) + (weekCharge == null ? 43 : weekCharge.hashCode());
        List<RewardInfoDTO> rewardInfo = getRewardInfo();
        return (iHashCode2 * 59) + (rewardInfo != null ? rewardInfo.hashCode() : 43);
    }

    public void setRemainingTime(Long l10) {
        this.remainingTime = l10;
    }

    public void setRewardInfo(List<RewardInfoDTO> list) {
        this.rewardInfo = list;
    }

    public void setWeekCharge(Long l10) {
        this.weekCharge = l10;
    }

    public String toString() {
        return "PayRewardsBean(remainingTime=" + getRemainingTime() + ", weekCharge=" + getWeekCharge() + ", rewardInfo=" + getRewardInfo() + ")";
    }
}
