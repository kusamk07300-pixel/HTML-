package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CurrencyRateBean {

    @SerializedName("coin_icon")
    private String coinIcon;

    @SerializedName("min")
    private String min;

    @SerializedName("open_seller")
    private Integer openSeller;

    @SerializedName("quick_list")
    private List<QuickExchangeDTO> quickList;

    @SerializedName("rate")
    private String rate;

    @SerializedName("rate_agent")
    private String rateAgent;

    @SerializedName("rate_user")
    private String rateUser;

    @SerializedName("real_ticket")
    private String realTicket;

    @SerializedName("ticket")
    private String ticket;

    public static class QuickExchangeDTO {

        @SerializedName("coin")
        private String coin;

        @SerializedName("ticket")
        private String ticket;

        public boolean canEqual(Object obj) {
            return obj instanceof QuickExchangeDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof QuickExchangeDTO)) {
                return false;
            }
            QuickExchangeDTO quickExchangeDTO = (QuickExchangeDTO) obj;
            if (!quickExchangeDTO.canEqual(this)) {
                return false;
            }
            String ticket = getTicket();
            String ticket2 = quickExchangeDTO.getTicket();
            if (ticket != null ? !ticket.equals(ticket2) : ticket2 != null) {
                return false;
            }
            String coin = getCoin();
            String coin2 = quickExchangeDTO.getCoin();
            return coin != null ? coin.equals(coin2) : coin2 == null;
        }

        public String getCoin() {
            return this.coin;
        }

        public String getTicket() {
            return this.ticket;
        }

        public int hashCode() {
            String ticket = getTicket();
            int iHashCode = ticket == null ? 43 : ticket.hashCode();
            String coin = getCoin();
            return ((iHashCode + 59) * 59) + (coin != null ? coin.hashCode() : 43);
        }

        public void setCoin(String str) {
            this.coin = str;
        }

        public void setTicket(String str) {
            this.ticket = str;
        }

        public String toString() {
            return "CurrencyRateBean.QuickExchangeDTO(ticket=" + getTicket() + ", coin=" + getCoin() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof CurrencyRateBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CurrencyRateBean)) {
            return false;
        }
        CurrencyRateBean currencyRateBean = (CurrencyRateBean) obj;
        if (!currencyRateBean.canEqual(this)) {
            return false;
        }
        Integer openSeller = getOpenSeller();
        Integer openSeller2 = currencyRateBean.getOpenSeller();
        if (openSeller != null ? !openSeller.equals(openSeller2) : openSeller2 != null) {
            return false;
        }
        String rate = getRate();
        String rate2 = currencyRateBean.getRate();
        if (rate != null ? !rate.equals(rate2) : rate2 != null) {
            return false;
        }
        String rateAgent = getRateAgent();
        String rateAgent2 = currencyRateBean.getRateAgent();
        if (rateAgent != null ? !rateAgent.equals(rateAgent2) : rateAgent2 != null) {
            return false;
        }
        String rateUser = getRateUser();
        String rateUser2 = currencyRateBean.getRateUser();
        if (rateUser != null ? !rateUser.equals(rateUser2) : rateUser2 != null) {
            return false;
        }
        String ticket = getTicket();
        String ticket2 = currencyRateBean.getTicket();
        if (ticket != null ? !ticket.equals(ticket2) : ticket2 != null) {
            return false;
        }
        String realTicket = getRealTicket();
        String realTicket2 = currencyRateBean.getRealTicket();
        if (realTicket != null ? !realTicket.equals(realTicket2) : realTicket2 != null) {
            return false;
        }
        String min = getMin();
        String min2 = currencyRateBean.getMin();
        if (min != null ? !min.equals(min2) : min2 != null) {
            return false;
        }
        String coinIcon = getCoinIcon();
        String coinIcon2 = currencyRateBean.getCoinIcon();
        if (coinIcon != null ? !coinIcon.equals(coinIcon2) : coinIcon2 != null) {
            return false;
        }
        List<QuickExchangeDTO> quickList = getQuickList();
        List<QuickExchangeDTO> quickList2 = currencyRateBean.getQuickList();
        return quickList != null ? quickList.equals(quickList2) : quickList2 == null;
    }

    public String getCoinIcon() {
        return this.coinIcon;
    }

    public String getMin() {
        return this.min;
    }

    public Integer getOpenSeller() {
        return this.openSeller;
    }

    public List<QuickExchangeDTO> getQuickList() {
        return this.quickList;
    }

    public String getRate() {
        return this.rate;
    }

    public String getRateAgent() {
        return this.rateAgent;
    }

    public String getRateUser() {
        return this.rateUser;
    }

    public String getRealTicket() {
        return this.realTicket;
    }

    public String getTicket() {
        return this.ticket;
    }

    public int hashCode() {
        Integer openSeller = getOpenSeller();
        int iHashCode = openSeller == null ? 43 : openSeller.hashCode();
        String rate = getRate();
        int iHashCode2 = ((iHashCode + 59) * 59) + (rate == null ? 43 : rate.hashCode());
        String rateAgent = getRateAgent();
        int iHashCode3 = (iHashCode2 * 59) + (rateAgent == null ? 43 : rateAgent.hashCode());
        String rateUser = getRateUser();
        int iHashCode4 = (iHashCode3 * 59) + (rateUser == null ? 43 : rateUser.hashCode());
        String ticket = getTicket();
        int iHashCode5 = (iHashCode4 * 59) + (ticket == null ? 43 : ticket.hashCode());
        String realTicket = getRealTicket();
        int iHashCode6 = (iHashCode5 * 59) + (realTicket == null ? 43 : realTicket.hashCode());
        String min = getMin();
        int iHashCode7 = (iHashCode6 * 59) + (min == null ? 43 : min.hashCode());
        String coinIcon = getCoinIcon();
        int iHashCode8 = (iHashCode7 * 59) + (coinIcon == null ? 43 : coinIcon.hashCode());
        List<QuickExchangeDTO> quickList = getQuickList();
        return (iHashCode8 * 59) + (quickList != null ? quickList.hashCode() : 43);
    }

    public void setCoinIcon(String str) {
        this.coinIcon = str;
    }

    public void setMin(String str) {
        this.min = str;
    }

    public void setOpenSeller(Integer num) {
        this.openSeller = num;
    }

    public void setQuickList(List<QuickExchangeDTO> list) {
        this.quickList = list;
    }

    public void setRate(String str) {
        this.rate = str;
    }

    public void setRateAgent(String str) {
        this.rateAgent = str;
    }

    public void setRateUser(String str) {
        this.rateUser = str;
    }

    public void setRealTicket(String str) {
        this.realTicket = str;
    }

    public void setTicket(String str) {
        this.ticket = str;
    }

    public String toString() {
        return "CurrencyRateBean(rate=" + getRate() + ", rateAgent=" + getRateAgent() + ", rateUser=" + getRateUser() + ", ticket=" + getTicket() + ", realTicket=" + getRealTicket() + ", min=" + getMin() + ", coinIcon=" + getCoinIcon() + ", openSeller=" + getOpenSeller() + ", quickList=" + getQuickList() + ")";
    }
}
