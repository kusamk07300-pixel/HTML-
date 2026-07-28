package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class PayLogBean {

    @SerializedName("coin")
    private Integer coin;

    @SerializedName("create_time")
    private String createTime;

    @SerializedName("money")
    private String money;

    @SerializedName("type")
    private Integer type;

    @SerializedName("user_id")
    private Integer userId;

    public boolean canEqual(Object obj) {
        return obj instanceof PayLogBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PayLogBean)) {
            return false;
        }
        PayLogBean payLogBean = (PayLogBean) obj;
        if (!payLogBean.canEqual(this)) {
            return false;
        }
        Integer coin = getCoin();
        Integer coin2 = payLogBean.getCoin();
        if (coin != null ? !coin.equals(coin2) : coin2 != null) {
            return false;
        }
        Integer type = getType();
        Integer type2 = payLogBean.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        Integer userId = getUserId();
        Integer userId2 = payLogBean.getUserId();
        if (userId != null ? !userId.equals(userId2) : userId2 != null) {
            return false;
        }
        String money = getMoney();
        String money2 = payLogBean.getMoney();
        if (money != null ? !money.equals(money2) : money2 != null) {
            return false;
        }
        String createTime = getCreateTime();
        String createTime2 = payLogBean.getCreateTime();
        return createTime != null ? createTime.equals(createTime2) : createTime2 == null;
    }

    public Integer getCoin() {
        return this.coin;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getMoney() {
        return this.money;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public int hashCode() {
        Integer coin = getCoin();
        int iHashCode = coin == null ? 43 : coin.hashCode();
        Integer type = getType();
        int iHashCode2 = ((iHashCode + 59) * 59) + (type == null ? 43 : type.hashCode());
        Integer userId = getUserId();
        int iHashCode3 = (iHashCode2 * 59) + (userId == null ? 43 : userId.hashCode());
        String money = getMoney();
        int iHashCode4 = (iHashCode3 * 59) + (money == null ? 43 : money.hashCode());
        String createTime = getCreateTime();
        return (iHashCode4 * 59) + (createTime != null ? createTime.hashCode() : 43);
    }

    public void setCoin(Integer num) {
        this.coin = num;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setMoney(String str) {
        this.money = str;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public void setUserId(Integer num) {
        this.userId = num;
    }

    public String toString() {
        return "PayLogBean(money=" + getMoney() + ", coin=" + getCoin() + ", type=" + getType() + ", userId=" + getUserId() + ", createTime=" + getCreateTime() + ")";
    }
}
