package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class MyIncomeHomBean {

    @SerializedName("diamonds")
    private Integer diamonds;

    @SerializedName("exchange_switch")
    private Integer exchangeSwitch;

    @SerializedName("is_join_agency")
    private Integer isJoinAgency;

    @SerializedName("transfer_switch")
    private Integer transferSwitch;

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("user_is_auth")
    private Integer userIsAuth;

    @SerializedName("user_name")
    private String userName;

    @SerializedName("withdraw_switch")
    private Integer withdrawSwitch;

    public boolean canEqual(Object obj) {
        return obj instanceof MyIncomeHomBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyIncomeHomBean)) {
            return false;
        }
        MyIncomeHomBean myIncomeHomBean = (MyIncomeHomBean) obj;
        if (!myIncomeHomBean.canEqual(this)) {
            return false;
        }
        Integer diamonds = getDiamonds();
        Integer diamonds2 = myIncomeHomBean.getDiamonds();
        if (diamonds != null ? !diamonds.equals(diamonds2) : diamonds2 != null) {
            return false;
        }
        Integer userId = getUserId();
        Integer userId2 = myIncomeHomBean.getUserId();
        if (userId != null ? !userId.equals(userId2) : userId2 != null) {
            return false;
        }
        Integer userIsAuth = getUserIsAuth();
        Integer userIsAuth2 = myIncomeHomBean.getUserIsAuth();
        if (userIsAuth != null ? !userIsAuth.equals(userIsAuth2) : userIsAuth2 != null) {
            return false;
        }
        Integer isJoinAgency = getIsJoinAgency();
        Integer isJoinAgency2 = myIncomeHomBean.getIsJoinAgency();
        if (isJoinAgency != null ? !isJoinAgency.equals(isJoinAgency2) : isJoinAgency2 != null) {
            return false;
        }
        Integer transferSwitch = getTransferSwitch();
        Integer transferSwitch2 = myIncomeHomBean.getTransferSwitch();
        if (transferSwitch != null ? !transferSwitch.equals(transferSwitch2) : transferSwitch2 != null) {
            return false;
        }
        Integer withdrawSwitch = getWithdrawSwitch();
        Integer withdrawSwitch2 = myIncomeHomBean.getWithdrawSwitch();
        if (withdrawSwitch != null ? !withdrawSwitch.equals(withdrawSwitch2) : withdrawSwitch2 != null) {
            return false;
        }
        Integer exchangeSwitch = getExchangeSwitch();
        Integer exchangeSwitch2 = myIncomeHomBean.getExchangeSwitch();
        if (exchangeSwitch != null ? !exchangeSwitch.equals(exchangeSwitch2) : exchangeSwitch2 != null) {
            return false;
        }
        String userName = getUserName();
        String userName2 = myIncomeHomBean.getUserName();
        return userName != null ? userName.equals(userName2) : userName2 == null;
    }

    public Integer getDiamonds() {
        return this.diamonds;
    }

    public Integer getExchangeSwitch() {
        return this.exchangeSwitch;
    }

    public Integer getIsJoinAgency() {
        return this.isJoinAgency;
    }

    public Integer getTransferSwitch() {
        return this.transferSwitch;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public Integer getUserIsAuth() {
        return this.userIsAuth;
    }

    public String getUserName() {
        return this.userName;
    }

    public Integer getWithdrawSwitch() {
        return this.withdrawSwitch;
    }

    public int hashCode() {
        Integer diamonds = getDiamonds();
        int iHashCode = diamonds == null ? 43 : diamonds.hashCode();
        Integer userId = getUserId();
        int iHashCode2 = ((iHashCode + 59) * 59) + (userId == null ? 43 : userId.hashCode());
        Integer userIsAuth = getUserIsAuth();
        int iHashCode3 = (iHashCode2 * 59) + (userIsAuth == null ? 43 : userIsAuth.hashCode());
        Integer isJoinAgency = getIsJoinAgency();
        int iHashCode4 = (iHashCode3 * 59) + (isJoinAgency == null ? 43 : isJoinAgency.hashCode());
        Integer transferSwitch = getTransferSwitch();
        int iHashCode5 = (iHashCode4 * 59) + (transferSwitch == null ? 43 : transferSwitch.hashCode());
        Integer withdrawSwitch = getWithdrawSwitch();
        int iHashCode6 = (iHashCode5 * 59) + (withdrawSwitch == null ? 43 : withdrawSwitch.hashCode());
        Integer exchangeSwitch = getExchangeSwitch();
        int iHashCode7 = (iHashCode6 * 59) + (exchangeSwitch == null ? 43 : exchangeSwitch.hashCode());
        String userName = getUserName();
        return (iHashCode7 * 59) + (userName != null ? userName.hashCode() : 43);
    }

    public void setDiamonds(Integer num) {
        this.diamonds = num;
    }

    public void setExchangeSwitch(Integer num) {
        this.exchangeSwitch = num;
    }

    public void setIsJoinAgency(Integer num) {
        this.isJoinAgency = num;
    }

    public void setTransferSwitch(Integer num) {
        this.transferSwitch = num;
    }

    public void setUserId(Integer num) {
        this.userId = num;
    }

    public void setUserIsAuth(Integer num) {
        this.userIsAuth = num;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public void setWithdrawSwitch(Integer num) {
        this.withdrawSwitch = num;
    }

    public String toString() {
        return "MyIncomeHomBean(diamonds=" + getDiamonds() + ", userName=" + getUserName() + ", userId=" + getUserId() + ", userIsAuth=" + getUserIsAuth() + ", isJoinAgency=" + getIsJoinAgency() + ", transferSwitch=" + getTransferSwitch() + ", withdrawSwitch=" + getWithdrawSwitch() + ", exchangeSwitch=" + getExchangeSwitch() + ")";
    }
}
