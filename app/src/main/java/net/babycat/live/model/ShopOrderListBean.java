package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;
import xo.f;

/* JADX INFO: loaded from: classes4.dex */
public class ShopOrderListBean {

    @SerializedName("cancel_time")
    private Object cancelTime;

    @SerializedName("close_time")
    private Object closeTime;

    @SerializedName("coupon_amount")
    private String couponAmount;

    @SerializedName("create_time")
    private String createTime;

    @SerializedName("deliver_type")
    private Integer deliverType;

    @SerializedName("delivery_code")
    private String deliveryCode;

    @SerializedName("delivery_name")
    private String deliveryName;

    @SerializedName("delivery_no")
    private String deliveryNo;

    @SerializedName("delivery_time")
    private Object deliveryTime;

    @SerializedName("experience")
    private Integer experience;

    @SerializedName("groupon_status")
    private Integer grouponStatus;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34902id;

    @SerializedName("integral")
    private String integral;

    @SerializedName("integral_discount")
    private String integralDiscount;

    @SerializedName("is_del")
    private Integer isDel;

    @SerializedName("order_no")
    private String orderNo;

    @SerializedName("order_price")
    private String orderPrice;

    @SerializedName("pay_order_no")
    private String payOrderNo;

    @SerializedName("pay_postage")
    private String payPostage;

    @SerializedName("pay_price")
    private String payPrice;

    @SerializedName("pay_status")
    private Integer payStatus;

    @SerializedName("pay_time")
    private Object payTime;

    @SerializedName("pay_way")
    private Integer payWay;

    @SerializedName("pid")
    private Integer pid;

    @SerializedName("postage")
    private String postage;

    @SerializedName("received_time")
    private Object receivedTime;

    @SerializedName("refund_status")
    private Integer refundStatus;

    @SerializedName("refunded_num")
    private Integer refundedNum;

    @SerializedName("refunded_price")
    private String refundedPrice;

    @SerializedName("remark")
    private String remark;

    @SerializedName("return_msg")
    private String returnMsg;

    @SerializedName(f.f44680p)
    private String source;

    @SerializedName("staff_id")
    private Integer staffId;

    @SerializedName(o0.CATEGORY_STATUS)
    private Integer status;

    @SerializedName("store_id")
    private Integer storeId;

    @SerializedName("sub")
    private List<SubDTO> sub;

    @SerializedName("third_code")
    private String thirdCode;

    @SerializedName("total_num")
    private Integer totalNum;

    @SerializedName("type")
    private Integer type;

    @SerializedName("update_time")
    private String updateTime;

    @SerializedName("user_comments")
    private Integer userComments;

    @SerializedName("user_del")
    private Integer userDel;

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("verification_code")
    private String verificationCode;

    @SerializedName("vip_discount")
    private String vipDiscount;

    public static class SubDTO {

        @SerializedName("cart_num")
        private Integer cartNum;

        @SerializedName("coupon_amount")
        private String couponAmount;

        @SerializedName("goods_id")
        private Integer goodsId;

        @SerializedName("goods_name")
        private String goodsName;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34903id;

        @SerializedName("integral_discount")
        private String integralDiscount;

        @SerializedName("logo")
        private String logo;

        @SerializedName("merchant_comments")
        private Integer merchantComments;

        @SerializedName("merchant_comments_time")
        private Object merchantCommentsTime;

        @SerializedName("order_id")
        private Integer orderId;

        @SerializedName("price")
        private String price;

        @SerializedName("refunded_flag")
        private Integer refundedFlag;

        @SerializedName("refunded_num")
        private Integer refundedNum;

        @SerializedName("refunded_price")
        private String refundedPrice;

        @SerializedName("rule")
        private String rule;

        @SerializedName("rule_id")
        private Integer ruleId;

        @SerializedName("user_comments")
        private Integer userComments;

        @SerializedName("user_comments_time")
        private Object userCommentsTime;

        @SerializedName("vip_discount")
        private String vipDiscount;

        public boolean canEqual(Object obj) {
            return obj instanceof SubDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SubDTO)) {
                return false;
            }
            SubDTO subDTO = (SubDTO) obj;
            if (!subDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = subDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            Integer orderId = getOrderId();
            Integer orderId2 = subDTO.getOrderId();
            if (orderId != null ? !orderId.equals(orderId2) : orderId2 != null) {
                return false;
            }
            Integer goodsId = getGoodsId();
            Integer goodsId2 = subDTO.getGoodsId();
            if (goodsId != null ? !goodsId.equals(goodsId2) : goodsId2 != null) {
                return false;
            }
            Integer ruleId = getRuleId();
            Integer ruleId2 = subDTO.getRuleId();
            if (ruleId != null ? !ruleId.equals(ruleId2) : ruleId2 != null) {
                return false;
            }
            Integer cartNum = getCartNum();
            Integer cartNum2 = subDTO.getCartNum();
            if (cartNum != null ? !cartNum.equals(cartNum2) : cartNum2 != null) {
                return false;
            }
            Integer refundedFlag = getRefundedFlag();
            Integer refundedFlag2 = subDTO.getRefundedFlag();
            if (refundedFlag != null ? !refundedFlag.equals(refundedFlag2) : refundedFlag2 != null) {
                return false;
            }
            Integer refundedNum = getRefundedNum();
            Integer refundedNum2 = subDTO.getRefundedNum();
            if (refundedNum != null ? !refundedNum.equals(refundedNum2) : refundedNum2 != null) {
                return false;
            }
            Integer userComments = getUserComments();
            Integer userComments2 = subDTO.getUserComments();
            if (userComments != null ? !userComments.equals(userComments2) : userComments2 != null) {
                return false;
            }
            Integer merchantComments = getMerchantComments();
            Integer merchantComments2 = subDTO.getMerchantComments();
            if (merchantComments != null ? !merchantComments.equals(merchantComments2) : merchantComments2 != null) {
                return false;
            }
            String goodsName = getGoodsName();
            String goodsName2 = subDTO.getGoodsName();
            if (goodsName != null ? !goodsName.equals(goodsName2) : goodsName2 != null) {
                return false;
            }
            String price = getPrice();
            String price2 = subDTO.getPrice();
            if (price != null ? !price.equals(price2) : price2 != null) {
                return false;
            }
            String logo = getLogo();
            String logo2 = subDTO.getLogo();
            if (logo != null ? !logo.equals(logo2) : logo2 != null) {
                return false;
            }
            String rule = getRule();
            String rule2 = subDTO.getRule();
            if (rule != null ? !rule.equals(rule2) : rule2 != null) {
                return false;
            }
            String couponAmount = getCouponAmount();
            String couponAmount2 = subDTO.getCouponAmount();
            if (couponAmount != null ? !couponAmount.equals(couponAmount2) : couponAmount2 != null) {
                return false;
            }
            String vipDiscount = getVipDiscount();
            String vipDiscount2 = subDTO.getVipDiscount();
            if (vipDiscount != null ? !vipDiscount.equals(vipDiscount2) : vipDiscount2 != null) {
                return false;
            }
            String integralDiscount = getIntegralDiscount();
            String integralDiscount2 = subDTO.getIntegralDiscount();
            if (integralDiscount != null ? !integralDiscount.equals(integralDiscount2) : integralDiscount2 != null) {
                return false;
            }
            String refundedPrice = getRefundedPrice();
            String refundedPrice2 = subDTO.getRefundedPrice();
            if (refundedPrice != null ? !refundedPrice.equals(refundedPrice2) : refundedPrice2 != null) {
                return false;
            }
            Object userCommentsTime = getUserCommentsTime();
            Object userCommentsTime2 = subDTO.getUserCommentsTime();
            if (userCommentsTime != null ? !userCommentsTime.equals(userCommentsTime2) : userCommentsTime2 != null) {
                return false;
            }
            Object merchantCommentsTime = getMerchantCommentsTime();
            Object merchantCommentsTime2 = subDTO.getMerchantCommentsTime();
            return merchantCommentsTime != null ? merchantCommentsTime.equals(merchantCommentsTime2) : merchantCommentsTime2 == null;
        }

        public Integer getCartNum() {
            return this.cartNum;
        }

        public String getCouponAmount() {
            return this.couponAmount;
        }

        public Integer getGoodsId() {
            return this.goodsId;
        }

        public String getGoodsName() {
            return this.goodsName;
        }

        public Integer getId() {
            return this.f34903id;
        }

        public String getIntegralDiscount() {
            return this.integralDiscount;
        }

        public String getLogo() {
            return this.logo;
        }

        public Integer getMerchantComments() {
            return this.merchantComments;
        }

        public Object getMerchantCommentsTime() {
            return this.merchantCommentsTime;
        }

        public Integer getOrderId() {
            return this.orderId;
        }

        public String getPrice() {
            return this.price;
        }

        public Integer getRefundedFlag() {
            return this.refundedFlag;
        }

        public Integer getRefundedNum() {
            return this.refundedNum;
        }

        public String getRefundedPrice() {
            return this.refundedPrice;
        }

        public String getRule() {
            return this.rule;
        }

        public Integer getRuleId() {
            return this.ruleId;
        }

        public Integer getUserComments() {
            return this.userComments;
        }

        public Object getUserCommentsTime() {
            return this.userCommentsTime;
        }

        public String getVipDiscount() {
            return this.vipDiscount;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer orderId = getOrderId();
            int iHashCode2 = ((iHashCode + 59) * 59) + (orderId == null ? 43 : orderId.hashCode());
            Integer goodsId = getGoodsId();
            int iHashCode3 = (iHashCode2 * 59) + (goodsId == null ? 43 : goodsId.hashCode());
            Integer ruleId = getRuleId();
            int iHashCode4 = (iHashCode3 * 59) + (ruleId == null ? 43 : ruleId.hashCode());
            Integer cartNum = getCartNum();
            int iHashCode5 = (iHashCode4 * 59) + (cartNum == null ? 43 : cartNum.hashCode());
            Integer refundedFlag = getRefundedFlag();
            int iHashCode6 = (iHashCode5 * 59) + (refundedFlag == null ? 43 : refundedFlag.hashCode());
            Integer refundedNum = getRefundedNum();
            int iHashCode7 = (iHashCode6 * 59) + (refundedNum == null ? 43 : refundedNum.hashCode());
            Integer userComments = getUserComments();
            int iHashCode8 = (iHashCode7 * 59) + (userComments == null ? 43 : userComments.hashCode());
            Integer merchantComments = getMerchantComments();
            int iHashCode9 = (iHashCode8 * 59) + (merchantComments == null ? 43 : merchantComments.hashCode());
            String goodsName = getGoodsName();
            int iHashCode10 = (iHashCode9 * 59) + (goodsName == null ? 43 : goodsName.hashCode());
            String price = getPrice();
            int iHashCode11 = (iHashCode10 * 59) + (price == null ? 43 : price.hashCode());
            String logo = getLogo();
            int iHashCode12 = (iHashCode11 * 59) + (logo == null ? 43 : logo.hashCode());
            String rule = getRule();
            int iHashCode13 = (iHashCode12 * 59) + (rule == null ? 43 : rule.hashCode());
            String couponAmount = getCouponAmount();
            int iHashCode14 = (iHashCode13 * 59) + (couponAmount == null ? 43 : couponAmount.hashCode());
            String vipDiscount = getVipDiscount();
            int iHashCode15 = (iHashCode14 * 59) + (vipDiscount == null ? 43 : vipDiscount.hashCode());
            String integralDiscount = getIntegralDiscount();
            int iHashCode16 = (iHashCode15 * 59) + (integralDiscount == null ? 43 : integralDiscount.hashCode());
            String refundedPrice = getRefundedPrice();
            int iHashCode17 = (iHashCode16 * 59) + (refundedPrice == null ? 43 : refundedPrice.hashCode());
            Object userCommentsTime = getUserCommentsTime();
            int iHashCode18 = (iHashCode17 * 59) + (userCommentsTime == null ? 43 : userCommentsTime.hashCode());
            Object merchantCommentsTime = getMerchantCommentsTime();
            return (iHashCode18 * 59) + (merchantCommentsTime != null ? merchantCommentsTime.hashCode() : 43);
        }

        public void setCartNum(Integer num) {
            this.cartNum = num;
        }

        public void setCouponAmount(String str) {
            this.couponAmount = str;
        }

        public void setGoodsId(Integer num) {
            this.goodsId = num;
        }

        public void setGoodsName(String str) {
            this.goodsName = str;
        }

        public void setId(Integer num) {
            this.f34903id = num;
        }

        public void setIntegralDiscount(String str) {
            this.integralDiscount = str;
        }

        public void setLogo(String str) {
            this.logo = str;
        }

        public void setMerchantComments(Integer num) {
            this.merchantComments = num;
        }

        public void setMerchantCommentsTime(Object obj) {
            this.merchantCommentsTime = obj;
        }

        public void setOrderId(Integer num) {
            this.orderId = num;
        }

        public void setPrice(String str) {
            this.price = str;
        }

        public void setRefundedFlag(Integer num) {
            this.refundedFlag = num;
        }

        public void setRefundedNum(Integer num) {
            this.refundedNum = num;
        }

        public void setRefundedPrice(String str) {
            this.refundedPrice = str;
        }

        public void setRule(String str) {
            this.rule = str;
        }

        public void setRuleId(Integer num) {
            this.ruleId = num;
        }

        public void setUserComments(Integer num) {
            this.userComments = num;
        }

        public void setUserCommentsTime(Object obj) {
            this.userCommentsTime = obj;
        }

        public void setVipDiscount(String str) {
            this.vipDiscount = str;
        }

        public String toString() {
            return "ShopOrderListBean.SubDTO(id=" + getId() + ", orderId=" + getOrderId() + ", goodsId=" + getGoodsId() + ", goodsName=" + getGoodsName() + ", price=" + getPrice() + ", logo=" + getLogo() + ", ruleId=" + getRuleId() + ", rule=" + getRule() + ", cartNum=" + getCartNum() + ", couponAmount=" + getCouponAmount() + ", vipDiscount=" + getVipDiscount() + ", integralDiscount=" + getIntegralDiscount() + ", refundedFlag=" + getRefundedFlag() + ", refundedPrice=" + getRefundedPrice() + ", refundedNum=" + getRefundedNum() + ", userComments=" + getUserComments() + ", userCommentsTime=" + getUserCommentsTime() + ", merchantComments=" + getMerchantComments() + ", merchantCommentsTime=" + getMerchantCommentsTime() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof ShopOrderListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShopOrderListBean)) {
            return false;
        }
        ShopOrderListBean shopOrderListBean = (ShopOrderListBean) obj;
        if (!shopOrderListBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = shopOrderListBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer pid = getPid();
        Integer pid2 = shopOrderListBean.getPid();
        if (pid != null ? !pid.equals(pid2) : pid2 != null) {
            return false;
        }
        Integer type = getType();
        Integer type2 = shopOrderListBean.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        Integer userId = getUserId();
        Integer userId2 = shopOrderListBean.getUserId();
        if (userId != null ? !userId.equals(userId2) : userId2 != null) {
            return false;
        }
        Integer totalNum = getTotalNum();
        Integer totalNum2 = shopOrderListBean.getTotalNum();
        if (totalNum != null ? !totalNum.equals(totalNum2) : totalNum2 != null) {
            return false;
        }
        Integer payWay = getPayWay();
        Integer payWay2 = shopOrderListBean.getPayWay();
        if (payWay != null ? !payWay.equals(payWay2) : payWay2 != null) {
            return false;
        }
        Integer payStatus = getPayStatus();
        Integer payStatus2 = shopOrderListBean.getPayStatus();
        if (payStatus != null ? !payStatus.equals(payStatus2) : payStatus2 != null) {
            return false;
        }
        Integer status = getStatus();
        Integer status2 = shopOrderListBean.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        Integer refundStatus = getRefundStatus();
        Integer refundStatus2 = shopOrderListBean.getRefundStatus();
        if (refundStatus != null ? !refundStatus.equals(refundStatus2) : refundStatus2 != null) {
            return false;
        }
        Integer refundedNum = getRefundedNum();
        Integer refundedNum2 = shopOrderListBean.getRefundedNum();
        if (refundedNum != null ? !refundedNum.equals(refundedNum2) : refundedNum2 != null) {
            return false;
        }
        Integer deliverType = getDeliverType();
        Integer deliverType2 = shopOrderListBean.getDeliverType();
        if (deliverType != null ? !deliverType.equals(deliverType2) : deliverType2 != null) {
            return false;
        }
        Integer storeId = getStoreId();
        Integer storeId2 = shopOrderListBean.getStoreId();
        if (storeId != null ? !storeId.equals(storeId2) : storeId2 != null) {
            return false;
        }
        Integer staffId = getStaffId();
        Integer staffId2 = shopOrderListBean.getStaffId();
        if (staffId != null ? !staffId.equals(staffId2) : staffId2 != null) {
            return false;
        }
        Integer userComments = getUserComments();
        Integer userComments2 = shopOrderListBean.getUserComments();
        if (userComments != null ? !userComments.equals(userComments2) : userComments2 != null) {
            return false;
        }
        Integer isDel = getIsDel();
        Integer isDel2 = shopOrderListBean.getIsDel();
        if (isDel != null ? !isDel.equals(isDel2) : isDel2 != null) {
            return false;
        }
        Integer userDel = getUserDel();
        Integer userDel2 = shopOrderListBean.getUserDel();
        if (userDel != null ? !userDel.equals(userDel2) : userDel2 != null) {
            return false;
        }
        Integer experience = getExperience();
        Integer experience2 = shopOrderListBean.getExperience();
        if (experience != null ? !experience.equals(experience2) : experience2 != null) {
            return false;
        }
        Integer grouponStatus = getGrouponStatus();
        Integer grouponStatus2 = shopOrderListBean.getGrouponStatus();
        if (grouponStatus != null ? !grouponStatus.equals(grouponStatus2) : grouponStatus2 != null) {
            return false;
        }
        String orderNo = getOrderNo();
        String orderNo2 = shopOrderListBean.getOrderNo();
        if (orderNo != null ? !orderNo.equals(orderNo2) : orderNo2 != null) {
            return false;
        }
        String payOrderNo = getPayOrderNo();
        String payOrderNo2 = shopOrderListBean.getPayOrderNo();
        if (payOrderNo != null ? !payOrderNo.equals(payOrderNo2) : payOrderNo2 != null) {
            return false;
        }
        String postage = getPostage();
        String postage2 = shopOrderListBean.getPostage();
        if (postage != null ? !postage.equals(postage2) : postage2 != null) {
            return false;
        }
        String orderPrice = getOrderPrice();
        String orderPrice2 = shopOrderListBean.getOrderPrice();
        if (orderPrice != null ? !orderPrice.equals(orderPrice2) : orderPrice2 != null) {
            return false;
        }
        String payPrice = getPayPrice();
        String payPrice2 = shopOrderListBean.getPayPrice();
        if (payPrice != null ? !payPrice.equals(payPrice2) : payPrice2 != null) {
            return false;
        }
        String payPostage = getPayPostage();
        String payPostage2 = shopOrderListBean.getPayPostage();
        if (payPostage != null ? !payPostage.equals(payPostage2) : payPostage2 != null) {
            return false;
        }
        String vipDiscount = getVipDiscount();
        String vipDiscount2 = shopOrderListBean.getVipDiscount();
        if (vipDiscount != null ? !vipDiscount.equals(vipDiscount2) : vipDiscount2 != null) {
            return false;
        }
        String couponAmount = getCouponAmount();
        String couponAmount2 = shopOrderListBean.getCouponAmount();
        if (couponAmount != null ? !couponAmount.equals(couponAmount2) : couponAmount2 != null) {
            return false;
        }
        String integralDiscount = getIntegralDiscount();
        String integralDiscount2 = shopOrderListBean.getIntegralDiscount();
        if (integralDiscount != null ? !integralDiscount.equals(integralDiscount2) : integralDiscount2 != null) {
            return false;
        }
        Object payTime = getPayTime();
        Object payTime2 = shopOrderListBean.getPayTime();
        if (payTime != null ? !payTime.equals(payTime2) : payTime2 != null) {
            return false;
        }
        Object deliveryTime = getDeliveryTime();
        Object deliveryTime2 = shopOrderListBean.getDeliveryTime();
        if (deliveryTime != null ? !deliveryTime.equals(deliveryTime2) : deliveryTime2 != null) {
            return false;
        }
        Object cancelTime = getCancelTime();
        Object cancelTime2 = shopOrderListBean.getCancelTime();
        if (cancelTime != null ? !cancelTime.equals(cancelTime2) : cancelTime2 != null) {
            return false;
        }
        Object receivedTime = getReceivedTime();
        Object receivedTime2 = shopOrderListBean.getReceivedTime();
        if (receivedTime != null ? !receivedTime.equals(receivedTime2) : receivedTime2 != null) {
            return false;
        }
        Object closeTime = getCloseTime();
        Object closeTime2 = shopOrderListBean.getCloseTime();
        if (closeTime != null ? !closeTime.equals(closeTime2) : closeTime2 != null) {
            return false;
        }
        String source = getSource();
        String source2 = shopOrderListBean.getSource();
        if (source != null ? !source.equals(source2) : source2 != null) {
            return false;
        }
        String refundedPrice = getRefundedPrice();
        String refundedPrice2 = shopOrderListBean.getRefundedPrice();
        if (refundedPrice != null ? !refundedPrice.equals(refundedPrice2) : refundedPrice2 != null) {
            return false;
        }
        String returnMsg = getReturnMsg();
        String returnMsg2 = shopOrderListBean.getReturnMsg();
        if (returnMsg != null ? !returnMsg.equals(returnMsg2) : returnMsg2 != null) {
            return false;
        }
        String thirdCode = getThirdCode();
        String thirdCode2 = shopOrderListBean.getThirdCode();
        if (thirdCode != null ? !thirdCode.equals(thirdCode2) : thirdCode2 != null) {
            return false;
        }
        String verificationCode = getVerificationCode();
        String verificationCode2 = shopOrderListBean.getVerificationCode();
        if (verificationCode != null ? !verificationCode.equals(verificationCode2) : verificationCode2 != null) {
            return false;
        }
        String deliveryName = getDeliveryName();
        String deliveryName2 = shopOrderListBean.getDeliveryName();
        if (deliveryName != null ? !deliveryName.equals(deliveryName2) : deliveryName2 != null) {
            return false;
        }
        String deliveryCode = getDeliveryCode();
        String deliveryCode2 = shopOrderListBean.getDeliveryCode();
        if (deliveryCode != null ? !deliveryCode.equals(deliveryCode2) : deliveryCode2 != null) {
            return false;
        }
        String deliveryNo = getDeliveryNo();
        String deliveryNo2 = shopOrderListBean.getDeliveryNo();
        if (deliveryNo != null ? !deliveryNo.equals(deliveryNo2) : deliveryNo2 != null) {
            return false;
        }
        String remark = getRemark();
        String remark2 = shopOrderListBean.getRemark();
        if (remark != null ? !remark.equals(remark2) : remark2 != null) {
            return false;
        }
        String integral = getIntegral();
        String integral2 = shopOrderListBean.getIntegral();
        if (integral != null ? !integral.equals(integral2) : integral2 != null) {
            return false;
        }
        String createTime = getCreateTime();
        String createTime2 = shopOrderListBean.getCreateTime();
        if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
            return false;
        }
        String updateTime = getUpdateTime();
        String updateTime2 = shopOrderListBean.getUpdateTime();
        if (updateTime != null ? !updateTime.equals(updateTime2) : updateTime2 != null) {
            return false;
        }
        List<SubDTO> sub = getSub();
        List<SubDTO> sub2 = shopOrderListBean.getSub();
        return sub != null ? sub.equals(sub2) : sub2 == null;
    }

    public Object getCancelTime() {
        return this.cancelTime;
    }

    public Object getCloseTime() {
        return this.closeTime;
    }

    public String getCouponAmount() {
        return this.couponAmount;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public Integer getDeliverType() {
        return this.deliverType;
    }

    public String getDeliveryCode() {
        return this.deliveryCode;
    }

    public String getDeliveryName() {
        return this.deliveryName;
    }

    public String getDeliveryNo() {
        return this.deliveryNo;
    }

    public Object getDeliveryTime() {
        return this.deliveryTime;
    }

    public Integer getExperience() {
        return this.experience;
    }

    public Integer getGrouponStatus() {
        return this.grouponStatus;
    }

    public Integer getId() {
        return this.f34902id;
    }

    public String getIntegral() {
        return this.integral;
    }

    public String getIntegralDiscount() {
        return this.integralDiscount;
    }

    public Integer getIsDel() {
        return this.isDel;
    }

    public String getOrderNo() {
        return this.orderNo;
    }

    public String getOrderPrice() {
        return this.orderPrice;
    }

    public String getPayOrderNo() {
        return this.payOrderNo;
    }

    public String getPayPostage() {
        return this.payPostage;
    }

    public String getPayPrice() {
        return this.payPrice;
    }

    public Integer getPayStatus() {
        return this.payStatus;
    }

    public Object getPayTime() {
        return this.payTime;
    }

    public Integer getPayWay() {
        return this.payWay;
    }

    public Integer getPid() {
        return this.pid;
    }

    public String getPostage() {
        return this.postage;
    }

    public Object getReceivedTime() {
        return this.receivedTime;
    }

    public Integer getRefundStatus() {
        return this.refundStatus;
    }

    public Integer getRefundedNum() {
        return this.refundedNum;
    }

    public String getRefundedPrice() {
        return this.refundedPrice;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getReturnMsg() {
        return this.returnMsg;
    }

    public String getSource() {
        return this.source;
    }

    public Integer getStaffId() {
        return this.staffId;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getStoreId() {
        return this.storeId;
    }

    public List<SubDTO> getSub() {
        return this.sub;
    }

    public String getThirdCode() {
        return this.thirdCode;
    }

    public Integer getTotalNum() {
        return this.totalNum;
    }

    public Integer getType() {
        return this.type;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public Integer getUserComments() {
        return this.userComments;
    }

    public Integer getUserDel() {
        return this.userDel;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public String getVerificationCode() {
        return this.verificationCode;
    }

    public String getVipDiscount() {
        return this.vipDiscount;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        Integer pid = getPid();
        int iHashCode2 = ((iHashCode + 59) * 59) + (pid == null ? 43 : pid.hashCode());
        Integer type = getType();
        int iHashCode3 = (iHashCode2 * 59) + (type == null ? 43 : type.hashCode());
        Integer userId = getUserId();
        int iHashCode4 = (iHashCode3 * 59) + (userId == null ? 43 : userId.hashCode());
        Integer totalNum = getTotalNum();
        int iHashCode5 = (iHashCode4 * 59) + (totalNum == null ? 43 : totalNum.hashCode());
        Integer payWay = getPayWay();
        int iHashCode6 = (iHashCode5 * 59) + (payWay == null ? 43 : payWay.hashCode());
        Integer payStatus = getPayStatus();
        int iHashCode7 = (iHashCode6 * 59) + (payStatus == null ? 43 : payStatus.hashCode());
        Integer status = getStatus();
        int iHashCode8 = (iHashCode7 * 59) + (status == null ? 43 : status.hashCode());
        Integer refundStatus = getRefundStatus();
        int iHashCode9 = (iHashCode8 * 59) + (refundStatus == null ? 43 : refundStatus.hashCode());
        Integer refundedNum = getRefundedNum();
        int iHashCode10 = (iHashCode9 * 59) + (refundedNum == null ? 43 : refundedNum.hashCode());
        Integer deliverType = getDeliverType();
        int iHashCode11 = (iHashCode10 * 59) + (deliverType == null ? 43 : deliverType.hashCode());
        Integer storeId = getStoreId();
        int iHashCode12 = (iHashCode11 * 59) + (storeId == null ? 43 : storeId.hashCode());
        Integer staffId = getStaffId();
        int iHashCode13 = (iHashCode12 * 59) + (staffId == null ? 43 : staffId.hashCode());
        Integer userComments = getUserComments();
        int iHashCode14 = (iHashCode13 * 59) + (userComments == null ? 43 : userComments.hashCode());
        Integer isDel = getIsDel();
        int iHashCode15 = (iHashCode14 * 59) + (isDel == null ? 43 : isDel.hashCode());
        Integer userDel = getUserDel();
        int iHashCode16 = (iHashCode15 * 59) + (userDel == null ? 43 : userDel.hashCode());
        Integer experience = getExperience();
        int iHashCode17 = (iHashCode16 * 59) + (experience == null ? 43 : experience.hashCode());
        Integer grouponStatus = getGrouponStatus();
        int iHashCode18 = (iHashCode17 * 59) + (grouponStatus == null ? 43 : grouponStatus.hashCode());
        String orderNo = getOrderNo();
        int iHashCode19 = (iHashCode18 * 59) + (orderNo == null ? 43 : orderNo.hashCode());
        String payOrderNo = getPayOrderNo();
        int iHashCode20 = (iHashCode19 * 59) + (payOrderNo == null ? 43 : payOrderNo.hashCode());
        String postage = getPostage();
        int iHashCode21 = (iHashCode20 * 59) + (postage == null ? 43 : postage.hashCode());
        String orderPrice = getOrderPrice();
        int iHashCode22 = (iHashCode21 * 59) + (orderPrice == null ? 43 : orderPrice.hashCode());
        String payPrice = getPayPrice();
        int iHashCode23 = (iHashCode22 * 59) + (payPrice == null ? 43 : payPrice.hashCode());
        String payPostage = getPayPostage();
        int iHashCode24 = (iHashCode23 * 59) + (payPostage == null ? 43 : payPostage.hashCode());
        String vipDiscount = getVipDiscount();
        int iHashCode25 = (iHashCode24 * 59) + (vipDiscount == null ? 43 : vipDiscount.hashCode());
        String couponAmount = getCouponAmount();
        int iHashCode26 = (iHashCode25 * 59) + (couponAmount == null ? 43 : couponAmount.hashCode());
        String integralDiscount = getIntegralDiscount();
        int iHashCode27 = (iHashCode26 * 59) + (integralDiscount == null ? 43 : integralDiscount.hashCode());
        Object payTime = getPayTime();
        int iHashCode28 = (iHashCode27 * 59) + (payTime == null ? 43 : payTime.hashCode());
        Object deliveryTime = getDeliveryTime();
        int iHashCode29 = (iHashCode28 * 59) + (deliveryTime == null ? 43 : deliveryTime.hashCode());
        Object cancelTime = getCancelTime();
        int iHashCode30 = (iHashCode29 * 59) + (cancelTime == null ? 43 : cancelTime.hashCode());
        Object receivedTime = getReceivedTime();
        int iHashCode31 = (iHashCode30 * 59) + (receivedTime == null ? 43 : receivedTime.hashCode());
        Object closeTime = getCloseTime();
        int iHashCode32 = (iHashCode31 * 59) + (closeTime == null ? 43 : closeTime.hashCode());
        String source = getSource();
        int iHashCode33 = (iHashCode32 * 59) + (source == null ? 43 : source.hashCode());
        String refundedPrice = getRefundedPrice();
        int iHashCode34 = (iHashCode33 * 59) + (refundedPrice == null ? 43 : refundedPrice.hashCode());
        String returnMsg = getReturnMsg();
        int iHashCode35 = (iHashCode34 * 59) + (returnMsg == null ? 43 : returnMsg.hashCode());
        String thirdCode = getThirdCode();
        int iHashCode36 = (iHashCode35 * 59) + (thirdCode == null ? 43 : thirdCode.hashCode());
        String verificationCode = getVerificationCode();
        int iHashCode37 = (iHashCode36 * 59) + (verificationCode == null ? 43 : verificationCode.hashCode());
        String deliveryName = getDeliveryName();
        int iHashCode38 = (iHashCode37 * 59) + (deliveryName == null ? 43 : deliveryName.hashCode());
        String deliveryCode = getDeliveryCode();
        int iHashCode39 = (iHashCode38 * 59) + (deliveryCode == null ? 43 : deliveryCode.hashCode());
        String deliveryNo = getDeliveryNo();
        int iHashCode40 = (iHashCode39 * 59) + (deliveryNo == null ? 43 : deliveryNo.hashCode());
        String remark = getRemark();
        int iHashCode41 = (iHashCode40 * 59) + (remark == null ? 43 : remark.hashCode());
        String integral = getIntegral();
        int iHashCode42 = (iHashCode41 * 59) + (integral == null ? 43 : integral.hashCode());
        String createTime = getCreateTime();
        int iHashCode43 = (iHashCode42 * 59) + (createTime == null ? 43 : createTime.hashCode());
        String updateTime = getUpdateTime();
        int iHashCode44 = (iHashCode43 * 59) + (updateTime == null ? 43 : updateTime.hashCode());
        List<SubDTO> sub = getSub();
        return (iHashCode44 * 59) + (sub != null ? sub.hashCode() : 43);
    }

    public void setCancelTime(Object obj) {
        this.cancelTime = obj;
    }

    public void setCloseTime(Object obj) {
        this.closeTime = obj;
    }

    public void setCouponAmount(String str) {
        this.couponAmount = str;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setDeliverType(Integer num) {
        this.deliverType = num;
    }

    public void setDeliveryCode(String str) {
        this.deliveryCode = str;
    }

    public void setDeliveryName(String str) {
        this.deliveryName = str;
    }

    public void setDeliveryNo(String str) {
        this.deliveryNo = str;
    }

    public void setDeliveryTime(Object obj) {
        this.deliveryTime = obj;
    }

    public void setExperience(Integer num) {
        this.experience = num;
    }

    public void setGrouponStatus(Integer num) {
        this.grouponStatus = num;
    }

    public void setId(Integer num) {
        this.f34902id = num;
    }

    public void setIntegral(String str) {
        this.integral = str;
    }

    public void setIntegralDiscount(String str) {
        this.integralDiscount = str;
    }

    public void setIsDel(Integer num) {
        this.isDel = num;
    }

    public void setOrderNo(String str) {
        this.orderNo = str;
    }

    public void setOrderPrice(String str) {
        this.orderPrice = str;
    }

    public void setPayOrderNo(String str) {
        this.payOrderNo = str;
    }

    public void setPayPostage(String str) {
        this.payPostage = str;
    }

    public void setPayPrice(String str) {
        this.payPrice = str;
    }

    public void setPayStatus(Integer num) {
        this.payStatus = num;
    }

    public void setPayTime(Object obj) {
        this.payTime = obj;
    }

    public void setPayWay(Integer num) {
        this.payWay = num;
    }

    public void setPid(Integer num) {
        this.pid = num;
    }

    public void setPostage(String str) {
        this.postage = str;
    }

    public void setReceivedTime(Object obj) {
        this.receivedTime = obj;
    }

    public void setRefundStatus(Integer num) {
        this.refundStatus = num;
    }

    public void setRefundedNum(Integer num) {
        this.refundedNum = num;
    }

    public void setRefundedPrice(String str) {
        this.refundedPrice = str;
    }

    public void setRemark(String str) {
        this.remark = str;
    }

    public void setReturnMsg(String str) {
        this.returnMsg = str;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setStaffId(Integer num) {
        this.staffId = num;
    }

    public void setStatus(Integer num) {
        this.status = num;
    }

    public void setStoreId(Integer num) {
        this.storeId = num;
    }

    public void setSub(List<SubDTO> list) {
        this.sub = list;
    }

    public void setThirdCode(String str) {
        this.thirdCode = str;
    }

    public void setTotalNum(Integer num) {
        this.totalNum = num;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public void setUpdateTime(String str) {
        this.updateTime = str;
    }

    public void setUserComments(Integer num) {
        this.userComments = num;
    }

    public void setUserDel(Integer num) {
        this.userDel = num;
    }

    public void setUserId(Integer num) {
        this.userId = num;
    }

    public void setVerificationCode(String str) {
        this.verificationCode = str;
    }

    public void setVipDiscount(String str) {
        this.vipDiscount = str;
    }

    public String toString() {
        return "ShopOrderListBean(id=" + getId() + ", pid=" + getPid() + ", type=" + getType() + ", orderNo=" + getOrderNo() + ", payOrderNo=" + getPayOrderNo() + ", userId=" + getUserId() + ", totalNum=" + getTotalNum() + ", postage=" + getPostage() + ", orderPrice=" + getOrderPrice() + ", payWay=" + getPayWay() + ", payPrice=" + getPayPrice() + ", payPostage=" + getPayPostage() + ", vipDiscount=" + getVipDiscount() + ", couponAmount=" + getCouponAmount() + ", integralDiscount=" + getIntegralDiscount() + ", payStatus=" + getPayStatus() + ", payTime=" + getPayTime() + ", deliveryTime=" + getDeliveryTime() + ", cancelTime=" + getCancelTime() + ", receivedTime=" + getReceivedTime() + ", closeTime=" + getCloseTime() + ", status=" + getStatus() + ", source=" + getSource() + ", refundStatus=" + getRefundStatus() + ", refundedPrice=" + getRefundedPrice() + ", refundedNum=" + getRefundedNum() + ", returnMsg=" + getReturnMsg() + ", thirdCode=" + getThirdCode() + ", deliverType=" + getDeliverType() + ", storeId=" + getStoreId() + ", verificationCode=" + getVerificationCode() + ", staffId=" + getStaffId() + ", deliveryName=" + getDeliveryName() + ", deliveryCode=" + getDeliveryCode() + ", deliveryNo=" + getDeliveryNo() + ", userComments=" + getUserComments() + ", remark=" + getRemark() + ", isDel=" + getIsDel() + ", userDel=" + getUserDel() + ", experience=" + getExperience() + ", integral=" + getIntegral() + ", grouponStatus=" + getGrouponStatus() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ", sub=" + getSub() + ")";
    }
}
