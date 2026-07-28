package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class ShopCartListBean {

    @SerializedName("create_time")
    private String createTime;

    @SerializedName("goods_id")
    private Integer goodsId;

    @SerializedName("goods_num")
    private Integer goodsNum;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34895id;

    @SerializedName("images")
    private String images;

    @SerializedName("is_select")
    private boolean isSelect;

    @SerializedName("original_price")
    private String originalPrice;

    @SerializedName("price")
    private String price;

    @SerializedName("rule_id")
    private Integer ruleId;

    @SerializedName("rule_text")
    private String ruleText;

    @SerializedName("title")
    private String title;

    @SerializedName("total_amount")
    private String totalAmount;

    @SerializedName("update_time")
    private String updateTime;

    @SerializedName("user_id")
    private Integer userId;

    public boolean canEqual(Object obj) {
        return obj instanceof ShopCartListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShopCartListBean)) {
            return false;
        }
        ShopCartListBean shopCartListBean = (ShopCartListBean) obj;
        if (!shopCartListBean.canEqual(this) || isSelect() != shopCartListBean.isSelect()) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = shopCartListBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer userId = getUserId();
        Integer userId2 = shopCartListBean.getUserId();
        if (userId != null ? !userId.equals(userId2) : userId2 != null) {
            return false;
        }
        Integer goodsId = getGoodsId();
        Integer goodsId2 = shopCartListBean.getGoodsId();
        if (goodsId != null ? !goodsId.equals(goodsId2) : goodsId2 != null) {
            return false;
        }
        Integer goodsNum = getGoodsNum();
        Integer goodsNum2 = shopCartListBean.getGoodsNum();
        if (goodsNum != null ? !goodsNum.equals(goodsNum2) : goodsNum2 != null) {
            return false;
        }
        Integer ruleId = getRuleId();
        Integer ruleId2 = shopCartListBean.getRuleId();
        if (ruleId != null ? !ruleId.equals(ruleId2) : ruleId2 != null) {
            return false;
        }
        String title = getTitle();
        String title2 = shopCartListBean.getTitle();
        if (title != null ? !title.equals(title2) : title2 != null) {
            return false;
        }
        String images = getImages();
        String images2 = shopCartListBean.getImages();
        if (images != null ? !images.equals(images2) : images2 != null) {
            return false;
        }
        String originalPrice = getOriginalPrice();
        String originalPrice2 = shopCartListBean.getOriginalPrice();
        if (originalPrice != null ? !originalPrice.equals(originalPrice2) : originalPrice2 != null) {
            return false;
        }
        String price = getPrice();
        String price2 = shopCartListBean.getPrice();
        if (price != null ? !price.equals(price2) : price2 != null) {
            return false;
        }
        String totalAmount = getTotalAmount();
        String totalAmount2 = shopCartListBean.getTotalAmount();
        if (totalAmount != null ? !totalAmount.equals(totalAmount2) : totalAmount2 != null) {
            return false;
        }
        String ruleText = getRuleText();
        String ruleText2 = shopCartListBean.getRuleText();
        if (ruleText != null ? !ruleText.equals(ruleText2) : ruleText2 != null) {
            return false;
        }
        String createTime = getCreateTime();
        String createTime2 = shopCartListBean.getCreateTime();
        if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
            return false;
        }
        String updateTime = getUpdateTime();
        String updateTime2 = shopCartListBean.getUpdateTime();
        return updateTime != null ? updateTime.equals(updateTime2) : updateTime2 == null;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public Integer getGoodsId() {
        return this.goodsId;
    }

    public Integer getGoodsNum() {
        return this.goodsNum;
    }

    public Integer getId() {
        return this.f34895id;
    }

    public String getImages() {
        return this.images;
    }

    public String getOriginalPrice() {
        return this.originalPrice;
    }

    public String getPrice() {
        return this.price;
    }

    public Integer getRuleId() {
        return this.ruleId;
    }

    public String getRuleText() {
        return this.ruleText;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTotalAmount() {
        return this.totalAmount;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int i10 = isSelect() ? 79 : 97;
        Integer id2 = getId();
        int iHashCode = ((i10 + 59) * 59) + (id2 == null ? 43 : id2.hashCode());
        Integer userId = getUserId();
        int iHashCode2 = (iHashCode * 59) + (userId == null ? 43 : userId.hashCode());
        Integer goodsId = getGoodsId();
        int iHashCode3 = (iHashCode2 * 59) + (goodsId == null ? 43 : goodsId.hashCode());
        Integer goodsNum = getGoodsNum();
        int iHashCode4 = (iHashCode3 * 59) + (goodsNum == null ? 43 : goodsNum.hashCode());
        Integer ruleId = getRuleId();
        int iHashCode5 = (iHashCode4 * 59) + (ruleId == null ? 43 : ruleId.hashCode());
        String title = getTitle();
        int iHashCode6 = (iHashCode5 * 59) + (title == null ? 43 : title.hashCode());
        String images = getImages();
        int iHashCode7 = (iHashCode6 * 59) + (images == null ? 43 : images.hashCode());
        String originalPrice = getOriginalPrice();
        int iHashCode8 = (iHashCode7 * 59) + (originalPrice == null ? 43 : originalPrice.hashCode());
        String price = getPrice();
        int iHashCode9 = (iHashCode8 * 59) + (price == null ? 43 : price.hashCode());
        String totalAmount = getTotalAmount();
        int iHashCode10 = (iHashCode9 * 59) + (totalAmount == null ? 43 : totalAmount.hashCode());
        String ruleText = getRuleText();
        int iHashCode11 = (iHashCode10 * 59) + (ruleText == null ? 43 : ruleText.hashCode());
        String createTime = getCreateTime();
        int iHashCode12 = (iHashCode11 * 59) + (createTime == null ? 43 : createTime.hashCode());
        String updateTime = getUpdateTime();
        return (iHashCode12 * 59) + (updateTime != null ? updateTime.hashCode() : 43);
    }

    public boolean isSelect() {
        return this.isSelect;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setGoodsId(Integer num) {
        this.goodsId = num;
    }

    public void setGoodsNum(Integer num) {
        this.goodsNum = num;
    }

    public void setId(Integer num) {
        this.f34895id = num;
    }

    public void setImages(String str) {
        this.images = str;
    }

    public void setOriginalPrice(String str) {
        this.originalPrice = str;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setRuleId(Integer num) {
        this.ruleId = num;
    }

    public void setRuleText(String str) {
        this.ruleText = str;
    }

    public void setSelect(boolean z10) {
        this.isSelect = z10;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTotalAmount(String str) {
        this.totalAmount = str;
    }

    public void setUpdateTime(String str) {
        this.updateTime = str;
    }

    public void setUserId(Integer num) {
        this.userId = num;
    }

    public String toString() {
        return "ShopCartListBean(id=" + getId() + ", userId=" + getUserId() + ", goodsId=" + getGoodsId() + ", title=" + getTitle() + ", images=" + getImages() + ", originalPrice=" + getOriginalPrice() + ", price=" + getPrice() + ", goodsNum=" + getGoodsNum() + ", totalAmount=" + getTotalAmount() + ", ruleId=" + getRuleId() + ", ruleText=" + getRuleText() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ", isSelect=" + isSelect() + ")";
    }
}
