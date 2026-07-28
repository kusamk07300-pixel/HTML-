package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class PayRuleBean {

    @SerializedName("coin")
    private String coin;

    @SerializedName("give")
    private Integer give;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34876id;

    @SerializedName("select")
    private Boolean isSelect = Boolean.FALSE;

    @SerializedName("money")
    private String money;

    @SerializedName("name")
    private String name;

    @SerializedName("product_id")
    private String productId;

    public boolean canEqual(Object obj) {
        return obj instanceof PayRuleBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PayRuleBean)) {
            return false;
        }
        PayRuleBean payRuleBean = (PayRuleBean) obj;
        if (!payRuleBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = payRuleBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer give = getGive();
        Integer give2 = payRuleBean.getGive();
        if (give != null ? !give.equals(give2) : give2 != null) {
            return false;
        }
        Boolean isSelect = getIsSelect();
        Boolean isSelect2 = payRuleBean.getIsSelect();
        if (isSelect != null ? !isSelect.equals(isSelect2) : isSelect2 != null) {
            return false;
        }
        String name = getName();
        String name2 = payRuleBean.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String coin = getCoin();
        String coin2 = payRuleBean.getCoin();
        if (coin != null ? !coin.equals(coin2) : coin2 != null) {
            return false;
        }
        String money = getMoney();
        String money2 = payRuleBean.getMoney();
        if (money != null ? !money.equals(money2) : money2 != null) {
            return false;
        }
        String productId = getProductId();
        String productId2 = payRuleBean.getProductId();
        return productId != null ? productId.equals(productId2) : productId2 == null;
    }

    public String getCoin() {
        return this.coin;
    }

    public Integer getGive() {
        return this.give;
    }

    public Integer getId() {
        return this.f34876id;
    }

    public Boolean getIsSelect() {
        return this.isSelect;
    }

    public String getMoney() {
        return this.money;
    }

    public String getName() {
        return this.name;
    }

    public String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        Integer give = getGive();
        int iHashCode2 = ((iHashCode + 59) * 59) + (give == null ? 43 : give.hashCode());
        Boolean isSelect = getIsSelect();
        int iHashCode3 = (iHashCode2 * 59) + (isSelect == null ? 43 : isSelect.hashCode());
        String name = getName();
        int iHashCode4 = (iHashCode3 * 59) + (name == null ? 43 : name.hashCode());
        String coin = getCoin();
        int iHashCode5 = (iHashCode4 * 59) + (coin == null ? 43 : coin.hashCode());
        String money = getMoney();
        int iHashCode6 = (iHashCode5 * 59) + (money == null ? 43 : money.hashCode());
        String productId = getProductId();
        return (iHashCode6 * 59) + (productId != null ? productId.hashCode() : 43);
    }

    public void setCoin(String str) {
        this.coin = str;
    }

    public void setGive(Integer num) {
        this.give = num;
    }

    public void setId(Integer num) {
        this.f34876id = num;
    }

    public void setIsSelect(Boolean bool) {
        this.isSelect = bool;
    }

    public void setMoney(String str) {
        this.money = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public String toString() {
        return "PayRuleBean(id=" + getId() + ", name=" + getName() + ", coin=" + getCoin() + ", give=" + getGive() + ", money=" + getMoney() + ", productId=" + getProductId() + ", isSelect=" + getIsSelect() + ")";
    }
}
