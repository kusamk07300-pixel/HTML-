package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class ExchangeLogBean {

    @SerializedName("coin")
    private String coin;

    @SerializedName("create_time")
    private String createTime;

    @SerializedName("diamond")
    private String diamond;

    @SerializedName("touid")
    private Integer touid;

    @SerializedName("user_id")
    private Integer userId;

    public boolean canEqual(Object obj) {
        return obj instanceof ExchangeLogBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExchangeLogBean)) {
            return false;
        }
        ExchangeLogBean exchangeLogBean = (ExchangeLogBean) obj;
        if (!exchangeLogBean.canEqual(this)) {
            return false;
        }
        Integer userId = getUserId();
        Integer userId2 = exchangeLogBean.getUserId();
        if (userId != null ? !userId.equals(userId2) : userId2 != null) {
            return false;
        }
        Integer touid = getTouid();
        Integer touid2 = exchangeLogBean.getTouid();
        if (touid != null ? !touid.equals(touid2) : touid2 != null) {
            return false;
        }
        String coin = getCoin();
        String coin2 = exchangeLogBean.getCoin();
        if (coin != null ? !coin.equals(coin2) : coin2 != null) {
            return false;
        }
        String diamond = getDiamond();
        String diamond2 = exchangeLogBean.getDiamond();
        if (diamond != null ? !diamond.equals(diamond2) : diamond2 != null) {
            return false;
        }
        String createTime = getCreateTime();
        String createTime2 = exchangeLogBean.getCreateTime();
        return createTime != null ? createTime.equals(createTime2) : createTime2 == null;
    }

    public String getCoin() {
        return this.coin;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getDiamond() {
        return this.diamond;
    }

    public Integer getTouid() {
        return this.touid;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public int hashCode() {
        Integer userId = getUserId();
        int iHashCode = userId == null ? 43 : userId.hashCode();
        Integer touid = getTouid();
        int iHashCode2 = ((iHashCode + 59) * 59) + (touid == null ? 43 : touid.hashCode());
        String coin = getCoin();
        int iHashCode3 = (iHashCode2 * 59) + (coin == null ? 43 : coin.hashCode());
        String diamond = getDiamond();
        int iHashCode4 = (iHashCode3 * 59) + (diamond == null ? 43 : diamond.hashCode());
        String createTime = getCreateTime();
        return (iHashCode4 * 59) + (createTime != null ? createTime.hashCode() : 43);
    }

    public void setCoin(String str) {
        this.coin = str;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setDiamond(String str) {
        this.diamond = str;
    }

    public void setTouid(Integer num) {
        this.touid = num;
    }

    public void setUserId(Integer num) {
        this.userId = num;
    }

    public String toString() {
        return "ExchangeLogBean(userId=" + getUserId() + ", touid=" + getTouid() + ", coin=" + getCoin() + ", diamond=" + getDiamond() + ", createTime=" + getCreateTime() + ")";
    }
}
