package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class ShopGoodsDetailBean {

    @SerializedName("cate_id")
    private Integer cateId;

    @SerializedName("collects")
    private Integer collects;

    @SerializedName("commission")
    private String commission;

    @SerializedName("content")
    private ContentDTO content;

    @SerializedName("cost_price")
    private String costPrice;

    @SerializedName("create_time")
    private String createTime;

    @SerializedName("deliver_type")
    private String deliverType;

    @SerializedName("freight")
    private Integer freight;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34896id;

    @SerializedName("is_del")
    private Integer isDel;

    @SerializedName("is_hot")
    private Integer isHot;

    @SerializedName("is_new")
    private Integer isNew;

    @SerializedName("is_recommend")
    private Integer isRecommend;

    @SerializedName("is_show")
    private Integer isShow;

    @SerializedName("name")
    private String name;

    @SerializedName("original_price")
    private String originalPrice;

    @SerializedName("postage")
    private String postage;

    @SerializedName("price")
    private String price;

    @SerializedName("sales")
    private Integer sales;

    @SerializedName("seo_desc")
    private String seoDesc;

    @SerializedName("seo_keywords")
    private String seoKeywords;

    @SerializedName("seo_title")
    private String seoTitle;

    @SerializedName("shipping_tpl_id")
    private Integer shippingTplId;

    @SerializedName("slider_image")
    private String sliderImage;

    @SerializedName("spec")
    private Integer spec;

    @SerializedName("spu")
    private String spu;

    @SerializedName("stock")
    private Integer stock;

    @SerializedName("sub_name")
    private String subName;

    @SerializedName("type")
    private Integer type;

    @SerializedName("unit")
    private String unit;

    @SerializedName("update_time")
    private String updateTime;

    @SerializedName("user_label")
    private String userLabel;

    @SerializedName("video_src")
    private String videoSrc;

    @SerializedName("views")
    private Integer views;

    @SerializedName("volume")
    private String volume;

    @SerializedName("weight")
    private String weight;

    public static class ContentDTO {

        @SerializedName("content")
        private String content;

        @SerializedName("goods_id")
        private Integer goodsId;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34897id;

        public boolean canEqual(Object obj) {
            return obj instanceof ContentDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ContentDTO)) {
                return false;
            }
            ContentDTO contentDTO = (ContentDTO) obj;
            if (!contentDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = contentDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            Integer goodsId = getGoodsId();
            Integer goodsId2 = contentDTO.getGoodsId();
            if (goodsId != null ? !goodsId.equals(goodsId2) : goodsId2 != null) {
                return false;
            }
            String content = getContent();
            String content2 = contentDTO.getContent();
            return content != null ? content.equals(content2) : content2 == null;
        }

        public String getContent() {
            return this.content;
        }

        public Integer getGoodsId() {
            return this.goodsId;
        }

        public Integer getId() {
            return this.f34897id;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer goodsId = getGoodsId();
            int iHashCode2 = ((iHashCode + 59) * 59) + (goodsId == null ? 43 : goodsId.hashCode());
            String content = getContent();
            return (iHashCode2 * 59) + (content != null ? content.hashCode() : 43);
        }

        public void setContent(String str) {
            this.content = str;
        }

        public void setGoodsId(Integer num) {
            this.goodsId = num;
        }

        public void setId(Integer num) {
            this.f34897id = num;
        }

        public String toString() {
            return "ShopGoodsDetailBean.ContentDTO(id=" + getId() + ", goodsId=" + getGoodsId() + ", content=" + getContent() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof ShopGoodsDetailBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShopGoodsDetailBean)) {
            return false;
        }
        ShopGoodsDetailBean shopGoodsDetailBean = (ShopGoodsDetailBean) obj;
        if (!shopGoodsDetailBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = shopGoodsDetailBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer type = getType();
        Integer type2 = shopGoodsDetailBean.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        Integer cateId = getCateId();
        Integer cateId2 = shopGoodsDetailBean.getCateId();
        if (cateId != null ? !cateId.equals(cateId2) : cateId2 != null) {
            return false;
        }
        Integer sales = getSales();
        Integer sales2 = shopGoodsDetailBean.getSales();
        if (sales != null ? !sales.equals(sales2) : sales2 != null) {
            return false;
        }
        Integer views = getViews();
        Integer views2 = shopGoodsDetailBean.getViews();
        if (views != null ? !views.equals(views2) : views2 != null) {
            return false;
        }
        Integer collects = getCollects();
        Integer collects2 = shopGoodsDetailBean.getCollects();
        if (collects != null ? !collects.equals(collects2) : collects2 != null) {
            return false;
        }
        Integer spec = getSpec();
        Integer spec2 = shopGoodsDetailBean.getSpec();
        if (spec != null ? !spec.equals(spec2) : spec2 != null) {
            return false;
        }
        Integer stock = getStock();
        Integer stock2 = shopGoodsDetailBean.getStock();
        if (stock != null ? !stock.equals(stock2) : stock2 != null) {
            return false;
        }
        Integer isShow = getIsShow();
        Integer isShow2 = shopGoodsDetailBean.getIsShow();
        if (isShow != null ? !isShow.equals(isShow2) : isShow2 != null) {
            return false;
        }
        Integer isHot = getIsHot();
        Integer isHot2 = shopGoodsDetailBean.getIsHot();
        if (isHot != null ? !isHot.equals(isHot2) : isHot2 != null) {
            return false;
        }
        Integer isRecommend = getIsRecommend();
        Integer isRecommend2 = shopGoodsDetailBean.getIsRecommend();
        if (isRecommend != null ? !isRecommend.equals(isRecommend2) : isRecommend2 != null) {
            return false;
        }
        Integer isNew = getIsNew();
        Integer isNew2 = shopGoodsDetailBean.getIsNew();
        if (isNew != null ? !isNew.equals(isNew2) : isNew2 != null) {
            return false;
        }
        Integer isDel = getIsDel();
        Integer isDel2 = shopGoodsDetailBean.getIsDel();
        if (isDel != null ? !isDel.equals(isDel2) : isDel2 != null) {
            return false;
        }
        Integer shippingTplId = getShippingTplId();
        Integer shippingTplId2 = shopGoodsDetailBean.getShippingTplId();
        if (shippingTplId != null ? !shippingTplId.equals(shippingTplId2) : shippingTplId2 != null) {
            return false;
        }
        Integer freight = getFreight();
        Integer freight2 = shopGoodsDetailBean.getFreight();
        if (freight != null ? !freight.equals(freight2) : freight2 != null) {
            return false;
        }
        String name = getName();
        String name2 = shopGoodsDetailBean.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String subName = getSubName();
        String subName2 = shopGoodsDetailBean.getSubName();
        if (subName != null ? !subName.equals(subName2) : subName2 != null) {
            return false;
        }
        String unit = getUnit();
        String unit2 = shopGoodsDetailBean.getUnit();
        if (unit != null ? !unit.equals(unit2) : unit2 != null) {
            return false;
        }
        String sliderImage = getSliderImage();
        String sliderImage2 = shopGoodsDetailBean.getSliderImage();
        if (sliderImage != null ? !sliderImage.equals(sliderImage2) : sliderImage2 != null) {
            return false;
        }
        String videoSrc = getVideoSrc();
        String videoSrc2 = shopGoodsDetailBean.getVideoSrc();
        if (videoSrc != null ? !videoSrc.equals(videoSrc2) : videoSrc2 != null) {
            return false;
        }
        String price = getPrice();
        String price2 = shopGoodsDetailBean.getPrice();
        if (price != null ? !price.equals(price2) : price2 != null) {
            return false;
        }
        String costPrice = getCostPrice();
        String costPrice2 = shopGoodsDetailBean.getCostPrice();
        if (costPrice != null ? !costPrice.equals(costPrice2) : costPrice2 != null) {
            return false;
        }
        String originalPrice = getOriginalPrice();
        String originalPrice2 = shopGoodsDetailBean.getOriginalPrice();
        if (originalPrice != null ? !originalPrice.equals(originalPrice2) : originalPrice2 != null) {
            return false;
        }
        String postage = getPostage();
        String postage2 = shopGoodsDetailBean.getPostage();
        if (postage != null ? !postage.equals(postage2) : postage2 != null) {
            return false;
        }
        String spu = getSpu();
        String spu2 = shopGoodsDetailBean.getSpu();
        if (spu != null ? !spu.equals(spu2) : spu2 != null) {
            return false;
        }
        String weight = getWeight();
        String weight2 = shopGoodsDetailBean.getWeight();
        if (weight != null ? !weight.equals(weight2) : weight2 != null) {
            return false;
        }
        String volume = getVolume();
        String volume2 = shopGoodsDetailBean.getVolume();
        if (volume != null ? !volume.equals(volume2) : volume2 != null) {
            return false;
        }
        String userLabel = getUserLabel();
        String userLabel2 = shopGoodsDetailBean.getUserLabel();
        if (userLabel != null ? !userLabel.equals(userLabel2) : userLabel2 != null) {
            return false;
        }
        String deliverType = getDeliverType();
        String deliverType2 = shopGoodsDetailBean.getDeliverType();
        if (deliverType != null ? !deliverType.equals(deliverType2) : deliverType2 != null) {
            return false;
        }
        String seoTitle = getSeoTitle();
        String seoTitle2 = shopGoodsDetailBean.getSeoTitle();
        if (seoTitle != null ? !seoTitle.equals(seoTitle2) : seoTitle2 != null) {
            return false;
        }
        String seoKeywords = getSeoKeywords();
        String seoKeywords2 = shopGoodsDetailBean.getSeoKeywords();
        if (seoKeywords != null ? !seoKeywords.equals(seoKeywords2) : seoKeywords2 != null) {
            return false;
        }
        String seoDesc = getSeoDesc();
        String seoDesc2 = shopGoodsDetailBean.getSeoDesc();
        if (seoDesc != null ? !seoDesc.equals(seoDesc2) : seoDesc2 != null) {
            return false;
        }
        String commission = getCommission();
        String commission2 = shopGoodsDetailBean.getCommission();
        if (commission != null ? !commission.equals(commission2) : commission2 != null) {
            return false;
        }
        String createTime = getCreateTime();
        String createTime2 = shopGoodsDetailBean.getCreateTime();
        if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
            return false;
        }
        String updateTime = getUpdateTime();
        String updateTime2 = shopGoodsDetailBean.getUpdateTime();
        if (updateTime != null ? !updateTime.equals(updateTime2) : updateTime2 != null) {
            return false;
        }
        ContentDTO content = getContent();
        ContentDTO content2 = shopGoodsDetailBean.getContent();
        return content != null ? content.equals(content2) : content2 == null;
    }

    public Integer getCateId() {
        return this.cateId;
    }

    public Integer getCollects() {
        return this.collects;
    }

    public String getCommission() {
        return this.commission;
    }

    public ContentDTO getContent() {
        return this.content;
    }

    public String getCostPrice() {
        return this.costPrice;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getDeliverType() {
        return this.deliverType;
    }

    public Integer getFreight() {
        return this.freight;
    }

    public Integer getId() {
        return this.f34896id;
    }

    public Integer getIsDel() {
        return this.isDel;
    }

    public Integer getIsHot() {
        return this.isHot;
    }

    public Integer getIsNew() {
        return this.isNew;
    }

    public Integer getIsRecommend() {
        return this.isRecommend;
    }

    public Integer getIsShow() {
        return this.isShow;
    }

    public String getName() {
        return this.name;
    }

    public String getOriginalPrice() {
        return this.originalPrice;
    }

    public String getPostage() {
        return this.postage;
    }

    public String getPrice() {
        return this.price;
    }

    public Integer getSales() {
        return this.sales;
    }

    public String getSeoDesc() {
        return this.seoDesc;
    }

    public String getSeoKeywords() {
        return this.seoKeywords;
    }

    public String getSeoTitle() {
        return this.seoTitle;
    }

    public Integer getShippingTplId() {
        return this.shippingTplId;
    }

    public String getSliderImage() {
        return this.sliderImage;
    }

    public Integer getSpec() {
        return this.spec;
    }

    public String getSpu() {
        return this.spu;
    }

    public Integer getStock() {
        return this.stock;
    }

    public String getSubName() {
        return this.subName;
    }

    public Integer getType() {
        return this.type;
    }

    public String getUnit() {
        return this.unit;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public String getUserLabel() {
        return this.userLabel;
    }

    public String getVideoSrc() {
        return this.videoSrc;
    }

    public Integer getViews() {
        return this.views;
    }

    public String getVolume() {
        return this.volume;
    }

    public String getWeight() {
        return this.weight;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        Integer type = getType();
        int iHashCode2 = ((iHashCode + 59) * 59) + (type == null ? 43 : type.hashCode());
        Integer cateId = getCateId();
        int iHashCode3 = (iHashCode2 * 59) + (cateId == null ? 43 : cateId.hashCode());
        Integer sales = getSales();
        int iHashCode4 = (iHashCode3 * 59) + (sales == null ? 43 : sales.hashCode());
        Integer views = getViews();
        int iHashCode5 = (iHashCode4 * 59) + (views == null ? 43 : views.hashCode());
        Integer collects = getCollects();
        int iHashCode6 = (iHashCode5 * 59) + (collects == null ? 43 : collects.hashCode());
        Integer spec = getSpec();
        int iHashCode7 = (iHashCode6 * 59) + (spec == null ? 43 : spec.hashCode());
        Integer stock = getStock();
        int iHashCode8 = (iHashCode7 * 59) + (stock == null ? 43 : stock.hashCode());
        Integer isShow = getIsShow();
        int iHashCode9 = (iHashCode8 * 59) + (isShow == null ? 43 : isShow.hashCode());
        Integer isHot = getIsHot();
        int iHashCode10 = (iHashCode9 * 59) + (isHot == null ? 43 : isHot.hashCode());
        Integer isRecommend = getIsRecommend();
        int iHashCode11 = (iHashCode10 * 59) + (isRecommend == null ? 43 : isRecommend.hashCode());
        Integer isNew = getIsNew();
        int iHashCode12 = (iHashCode11 * 59) + (isNew == null ? 43 : isNew.hashCode());
        Integer isDel = getIsDel();
        int iHashCode13 = (iHashCode12 * 59) + (isDel == null ? 43 : isDel.hashCode());
        Integer shippingTplId = getShippingTplId();
        int iHashCode14 = (iHashCode13 * 59) + (shippingTplId == null ? 43 : shippingTplId.hashCode());
        Integer freight = getFreight();
        int iHashCode15 = (iHashCode14 * 59) + (freight == null ? 43 : freight.hashCode());
        String name = getName();
        int iHashCode16 = (iHashCode15 * 59) + (name == null ? 43 : name.hashCode());
        String subName = getSubName();
        int iHashCode17 = (iHashCode16 * 59) + (subName == null ? 43 : subName.hashCode());
        String unit = getUnit();
        int iHashCode18 = (iHashCode17 * 59) + (unit == null ? 43 : unit.hashCode());
        String sliderImage = getSliderImage();
        int iHashCode19 = (iHashCode18 * 59) + (sliderImage == null ? 43 : sliderImage.hashCode());
        String videoSrc = getVideoSrc();
        int iHashCode20 = (iHashCode19 * 59) + (videoSrc == null ? 43 : videoSrc.hashCode());
        String price = getPrice();
        int iHashCode21 = (iHashCode20 * 59) + (price == null ? 43 : price.hashCode());
        String costPrice = getCostPrice();
        int iHashCode22 = (iHashCode21 * 59) + (costPrice == null ? 43 : costPrice.hashCode());
        String originalPrice = getOriginalPrice();
        int iHashCode23 = (iHashCode22 * 59) + (originalPrice == null ? 43 : originalPrice.hashCode());
        String postage = getPostage();
        int iHashCode24 = (iHashCode23 * 59) + (postage == null ? 43 : postage.hashCode());
        String spu = getSpu();
        int iHashCode25 = (iHashCode24 * 59) + (spu == null ? 43 : spu.hashCode());
        String weight = getWeight();
        int iHashCode26 = (iHashCode25 * 59) + (weight == null ? 43 : weight.hashCode());
        String volume = getVolume();
        int iHashCode27 = (iHashCode26 * 59) + (volume == null ? 43 : volume.hashCode());
        String userLabel = getUserLabel();
        int iHashCode28 = (iHashCode27 * 59) + (userLabel == null ? 43 : userLabel.hashCode());
        String deliverType = getDeliverType();
        int iHashCode29 = (iHashCode28 * 59) + (deliverType == null ? 43 : deliverType.hashCode());
        String seoTitle = getSeoTitle();
        int iHashCode30 = (iHashCode29 * 59) + (seoTitle == null ? 43 : seoTitle.hashCode());
        String seoKeywords = getSeoKeywords();
        int iHashCode31 = (iHashCode30 * 59) + (seoKeywords == null ? 43 : seoKeywords.hashCode());
        String seoDesc = getSeoDesc();
        int iHashCode32 = (iHashCode31 * 59) + (seoDesc == null ? 43 : seoDesc.hashCode());
        String commission = getCommission();
        int iHashCode33 = (iHashCode32 * 59) + (commission == null ? 43 : commission.hashCode());
        String createTime = getCreateTime();
        int iHashCode34 = (iHashCode33 * 59) + (createTime == null ? 43 : createTime.hashCode());
        String updateTime = getUpdateTime();
        int iHashCode35 = (iHashCode34 * 59) + (updateTime == null ? 43 : updateTime.hashCode());
        ContentDTO content = getContent();
        return (iHashCode35 * 59) + (content != null ? content.hashCode() : 43);
    }

    public void setCateId(Integer num) {
        this.cateId = num;
    }

    public void setCollects(Integer num) {
        this.collects = num;
    }

    public void setCommission(String str) {
        this.commission = str;
    }

    public void setContent(ContentDTO contentDTO) {
        this.content = contentDTO;
    }

    public void setCostPrice(String str) {
        this.costPrice = str;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setDeliverType(String str) {
        this.deliverType = str;
    }

    public void setFreight(Integer num) {
        this.freight = num;
    }

    public void setId(Integer num) {
        this.f34896id = num;
    }

    public void setIsDel(Integer num) {
        this.isDel = num;
    }

    public void setIsHot(Integer num) {
        this.isHot = num;
    }

    public void setIsNew(Integer num) {
        this.isNew = num;
    }

    public void setIsRecommend(Integer num) {
        this.isRecommend = num;
    }

    public void setIsShow(Integer num) {
        this.isShow = num;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOriginalPrice(String str) {
        this.originalPrice = str;
    }

    public void setPostage(String str) {
        this.postage = str;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setSales(Integer num) {
        this.sales = num;
    }

    public void setSeoDesc(String str) {
        this.seoDesc = str;
    }

    public void setSeoKeywords(String str) {
        this.seoKeywords = str;
    }

    public void setSeoTitle(String str) {
        this.seoTitle = str;
    }

    public void setShippingTplId(Integer num) {
        this.shippingTplId = num;
    }

    public void setSliderImage(String str) {
        this.sliderImage = str;
    }

    public void setSpec(Integer num) {
        this.spec = num;
    }

    public void setSpu(String str) {
        this.spu = str;
    }

    public void setStock(Integer num) {
        this.stock = num;
    }

    public void setSubName(String str) {
        this.subName = str;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public void setUnit(String str) {
        this.unit = str;
    }

    public void setUpdateTime(String str) {
        this.updateTime = str;
    }

    public void setUserLabel(String str) {
        this.userLabel = str;
    }

    public void setVideoSrc(String str) {
        this.videoSrc = str;
    }

    public void setViews(Integer num) {
        this.views = num;
    }

    public void setVolume(String str) {
        this.volume = str;
    }

    public void setWeight(String str) {
        this.weight = str;
    }

    public String toString() {
        return "ShopGoodsDetailBean(id=" + getId() + ", type=" + getType() + ", name=" + getName() + ", subName=" + getSubName() + ", cateId=" + getCateId() + ", unit=" + getUnit() + ", sliderImage=" + getSliderImage() + ", videoSrc=" + getVideoSrc() + ", sales=" + getSales() + ", views=" + getViews() + ", collects=" + getCollects() + ", spec=" + getSpec() + ", price=" + getPrice() + ", costPrice=" + getCostPrice() + ", originalPrice=" + getOriginalPrice() + ", postage=" + getPostage() + ", spu=" + getSpu() + ", stock=" + getStock() + ", weight=" + getWeight() + ", volume=" + getVolume() + ", userLabel=" + getUserLabel() + ", isShow=" + getIsShow() + ", isHot=" + getIsHot() + ", isRecommend=" + getIsRecommend() + ", isNew=" + getIsNew() + ", isDel=" + getIsDel() + ", deliverType=" + getDeliverType() + ", shippingTplId=" + getShippingTplId() + ", freight=" + getFreight() + ", seoTitle=" + getSeoTitle() + ", seoKeywords=" + getSeoKeywords() + ", seoDesc=" + getSeoDesc() + ", commission=" + getCommission() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ", content=" + getContent() + ")";
    }
}
