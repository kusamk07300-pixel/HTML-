package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SignTaskbean {

    @SerializedName("bonus_day")
    private Integer bonusDay;

    @SerializedName("bonus_list")
    private List<BonusListDTO> bonusList;

    @SerializedName("count_day")
    private Integer countDay;

    @SerializedName("is_show")
    private Integer isShow;

    public static class BonusListDTO {

        @SerializedName("day")
        private Integer day;

        @SerializedName("is_sign")
        private Integer isSign;

        @SerializedName("rewards")
        private List<RewardsListDTO> rewards;

        public boolean canEqual(Object obj) {
            return obj instanceof BonusListDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BonusListDTO)) {
                return false;
            }
            BonusListDTO bonusListDTO = (BonusListDTO) obj;
            if (!bonusListDTO.canEqual(this)) {
                return false;
            }
            Integer day = getDay();
            Integer day2 = bonusListDTO.getDay();
            if (day != null ? !day.equals(day2) : day2 != null) {
                return false;
            }
            Integer isSign = getIsSign();
            Integer isSign2 = bonusListDTO.getIsSign();
            if (isSign != null ? !isSign.equals(isSign2) : isSign2 != null) {
                return false;
            }
            List<RewardsListDTO> rewards = getRewards();
            List<RewardsListDTO> rewards2 = bonusListDTO.getRewards();
            return rewards != null ? rewards.equals(rewards2) : rewards2 == null;
        }

        public Integer getDay() {
            return this.day;
        }

        public Integer getIsSign() {
            return this.isSign;
        }

        public List<RewardsListDTO> getRewards() {
            return this.rewards;
        }

        public int hashCode() {
            Integer day = getDay();
            int iHashCode = day == null ? 43 : day.hashCode();
            Integer isSign = getIsSign();
            int iHashCode2 = ((iHashCode + 59) * 59) + (isSign == null ? 43 : isSign.hashCode());
            List<RewardsListDTO> rewards = getRewards();
            return (iHashCode2 * 59) + (rewards != null ? rewards.hashCode() : 43);
        }

        public void setDay(Integer num) {
            this.day = num;
        }

        public void setIsSign(Integer num) {
            this.isSign = num;
        }

        public void setRewards(List<RewardsListDTO> list) {
            this.rewards = list;
        }

        public String toString() {
            return "SignTaskbean.BonusListDTO(day=" + getDay() + ", isSign=" + getIsSign() + ", rewards=" + getRewards() + ")";
        }
    }

    public static class RewardsListDTO {

        @SerializedName("icon")
        private String icon;

        @SerializedName("text")
        private String text;

        public boolean canEqual(Object obj) {
            return obj instanceof RewardsListDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RewardsListDTO)) {
                return false;
            }
            RewardsListDTO rewardsListDTO = (RewardsListDTO) obj;
            if (!rewardsListDTO.canEqual(this)) {
                return false;
            }
            String icon = getIcon();
            String icon2 = rewardsListDTO.getIcon();
            if (icon != null ? !icon.equals(icon2) : icon2 != null) {
                return false;
            }
            String text = getText();
            String text2 = rewardsListDTO.getText();
            return text != null ? text.equals(text2) : text2 == null;
        }

        public String getIcon() {
            return this.icon;
        }

        public String getText() {
            return this.text;
        }

        public int hashCode() {
            String icon = getIcon();
            int iHashCode = icon == null ? 43 : icon.hashCode();
            String text = getText();
            return ((iHashCode + 59) * 59) + (text != null ? text.hashCode() : 43);
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setText(String str) {
            this.text = str;
        }

        public String toString() {
            return "SignTaskbean.RewardsListDTO(icon=" + getIcon() + ", text=" + getText() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof SignTaskbean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SignTaskbean)) {
            return false;
        }
        SignTaskbean signTaskbean = (SignTaskbean) obj;
        if (!signTaskbean.canEqual(this)) {
            return false;
        }
        Integer isShow = getIsShow();
        Integer isShow2 = signTaskbean.getIsShow();
        if (isShow != null ? !isShow.equals(isShow2) : isShow2 != null) {
            return false;
        }
        Integer countDay = getCountDay();
        Integer countDay2 = signTaskbean.getCountDay();
        if (countDay != null ? !countDay.equals(countDay2) : countDay2 != null) {
            return false;
        }
        Integer bonusDay = getBonusDay();
        Integer bonusDay2 = signTaskbean.getBonusDay();
        if (bonusDay != null ? !bonusDay.equals(bonusDay2) : bonusDay2 != null) {
            return false;
        }
        List<BonusListDTO> bonusList = getBonusList();
        List<BonusListDTO> bonusList2 = signTaskbean.getBonusList();
        return bonusList != null ? bonusList.equals(bonusList2) : bonusList2 == null;
    }

    public Integer getBonusDay() {
        return this.bonusDay;
    }

    public List<BonusListDTO> getBonusList() {
        return this.bonusList;
    }

    public Integer getCountDay() {
        return this.countDay;
    }

    public Integer getIsShow() {
        return this.isShow;
    }

    public int hashCode() {
        Integer isShow = getIsShow();
        int iHashCode = isShow == null ? 43 : isShow.hashCode();
        Integer countDay = getCountDay();
        int iHashCode2 = ((iHashCode + 59) * 59) + (countDay == null ? 43 : countDay.hashCode());
        Integer bonusDay = getBonusDay();
        int iHashCode3 = (iHashCode2 * 59) + (bonusDay == null ? 43 : bonusDay.hashCode());
        List<BonusListDTO> bonusList = getBonusList();
        return (iHashCode3 * 59) + (bonusList != null ? bonusList.hashCode() : 43);
    }

    public void setBonusDay(Integer num) {
        this.bonusDay = num;
    }

    public void setBonusList(List<BonusListDTO> list) {
        this.bonusList = list;
    }

    public void setCountDay(Integer num) {
        this.countDay = num;
    }

    public void setIsShow(Integer num) {
        this.isShow = num;
    }

    public String toString() {
        return "SignTaskbean(isShow=" + getIsShow() + ", bonusList=" + getBonusList() + ", countDay=" + getCountDay() + ", bonusDay=" + getBonusDay() + ")";
    }
}
