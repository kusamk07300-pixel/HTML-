package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AgentHomeBean {

    @SerializedName("coin")
    private String coin;

    @SerializedName("country_iso")
    private String countryIso;

    @SerializedName("incomeCoins")
    private String incomeCoins;

    @SerializedName("list")
    private List<ListDTO> list;

    @SerializedName("nickname")
    private String nickname;

    @SerializedName("rechargeCoins")
    private String rechargeCoins;

    public static class ListDTO {

        @SerializedName("addtime")
        private String addtime;

        @SerializedName("coin")
        private double coin;

        @SerializedName("user_id")
        private Integer userId;

        public boolean canEqual(Object obj) {
            return obj instanceof ListDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ListDTO)) {
                return false;
            }
            ListDTO listDTO = (ListDTO) obj;
            if (!listDTO.canEqual(this) || Double.compare(getCoin(), listDTO.getCoin()) != 0) {
                return false;
            }
            Integer userId = getUserId();
            Integer userId2 = listDTO.getUserId();
            if (userId != null ? !userId.equals(userId2) : userId2 != null) {
                return false;
            }
            String addtime = getAddtime();
            String addtime2 = listDTO.getAddtime();
            return addtime != null ? addtime.equals(addtime2) : addtime2 == null;
        }

        public String getAddtime() {
            return this.addtime;
        }

        public double getCoin() {
            return this.coin;
        }

        public Integer getUserId() {
            return this.userId;
        }

        public int hashCode() {
            long jDoubleToLongBits = Double.doubleToLongBits(getCoin());
            Integer userId = getUserId();
            int iHashCode = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 59) * 59) + (userId == null ? 43 : userId.hashCode());
            String addtime = getAddtime();
            return (iHashCode * 59) + (addtime != null ? addtime.hashCode() : 43);
        }

        public void setAddtime(String str) {
            this.addtime = str;
        }

        public void setCoin(double d10) {
            this.coin = d10;
        }

        public void setUserId(Integer num) {
            this.userId = num;
        }

        public String toString() {
            return "AgentHomeBean.ListDTO(userId=" + getUserId() + ", addtime=" + getAddtime() + ", coin=" + getCoin() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof AgentHomeBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AgentHomeBean)) {
            return false;
        }
        AgentHomeBean agentHomeBean = (AgentHomeBean) obj;
        if (!agentHomeBean.canEqual(this)) {
            return false;
        }
        String nickname = getNickname();
        String nickname2 = agentHomeBean.getNickname();
        if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
            return false;
        }
        String coin = getCoin();
        String coin2 = agentHomeBean.getCoin();
        if (coin != null ? !coin.equals(coin2) : coin2 != null) {
            return false;
        }
        String countryIso = getCountryIso();
        String countryIso2 = agentHomeBean.getCountryIso();
        if (countryIso != null ? !countryIso.equals(countryIso2) : countryIso2 != null) {
            return false;
        }
        String incomeCoins = getIncomeCoins();
        String incomeCoins2 = agentHomeBean.getIncomeCoins();
        if (incomeCoins != null ? !incomeCoins.equals(incomeCoins2) : incomeCoins2 != null) {
            return false;
        }
        String rechargeCoins = getRechargeCoins();
        String rechargeCoins2 = agentHomeBean.getRechargeCoins();
        if (rechargeCoins != null ? !rechargeCoins.equals(rechargeCoins2) : rechargeCoins2 != null) {
            return false;
        }
        List<ListDTO> list = getList();
        List<ListDTO> list2 = agentHomeBean.getList();
        return list != null ? list.equals(list2) : list2 == null;
    }

    public String getCoin() {
        return this.coin;
    }

    public String getCountryIso() {
        return this.countryIso;
    }

    public String getIncomeCoins() {
        return this.incomeCoins;
    }

    public List<ListDTO> getList() {
        return this.list;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getRechargeCoins() {
        return this.rechargeCoins;
    }

    public int hashCode() {
        String nickname = getNickname();
        int iHashCode = nickname == null ? 43 : nickname.hashCode();
        String coin = getCoin();
        int iHashCode2 = ((iHashCode + 59) * 59) + (coin == null ? 43 : coin.hashCode());
        String countryIso = getCountryIso();
        int iHashCode3 = (iHashCode2 * 59) + (countryIso == null ? 43 : countryIso.hashCode());
        String incomeCoins = getIncomeCoins();
        int iHashCode4 = (iHashCode3 * 59) + (incomeCoins == null ? 43 : incomeCoins.hashCode());
        String rechargeCoins = getRechargeCoins();
        int iHashCode5 = (iHashCode4 * 59) + (rechargeCoins == null ? 43 : rechargeCoins.hashCode());
        List<ListDTO> list = getList();
        return (iHashCode5 * 59) + (list != null ? list.hashCode() : 43);
    }

    public void setCoin(String str) {
        this.coin = str;
    }

    public void setCountryIso(String str) {
        this.countryIso = str;
    }

    public void setIncomeCoins(String str) {
        this.incomeCoins = str;
    }

    public void setList(List<ListDTO> list) {
        this.list = list;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setRechargeCoins(String str) {
        this.rechargeCoins = str;
    }

    public String toString() {
        return "AgentHomeBean(nickname=" + getNickname() + ", coin=" + getCoin() + ", countryIso=" + getCountryIso() + ", incomeCoins=" + getIncomeCoins() + ", rechargeCoins=" + getRechargeCoins() + ", list=" + getList() + ")";
    }
}
