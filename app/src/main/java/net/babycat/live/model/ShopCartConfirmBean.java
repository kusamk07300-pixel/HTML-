package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;
import xo.f;

/* JADX INFO: loaded from: classes4.dex */
public class ShopCartConfirmBean {

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
    private Integer f34894id;

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
    private List<ShopCartListBean> sub;

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

    public boolean canEqual(Object obj) {
        return obj instanceof ShopCartConfirmBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShopCartConfirmBean)) {
            return false;
        }
        ShopCartConfirmBean shopCartConfirmBean = (ShopCartConfirmBean) obj;
        if (!shopCartConfirmBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = shopCartConfirmBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer pid = getPid();
        Integer pid2 = shopCartConfirmBean.getPid();
        if (pid != null ? !pid.equals(pid2) : pid2 != null) {
            return false;
        }
        Integer type = getType();
        Integer type2 = shopCartConfirmBean.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        Integer userId = getUserId();
        Integer userId2 = shopCartConfirmBean.getUserId();
        if (userId != null ? !userId.equals(userId2) : userId2 != null) {
            return false;
        }
        Integer totalNum = getTotalNum();
        Integer totalNum2 = shopCartConfirmBean.getTotalNum();
        if (totalNum != null ? !totalNum.equals(totalNum2) : totalNum2 != null) {
            return false;
        }
        Integer payWay = getPayWay();
        Integer payWay2 = shopCartConfirmBean.getPayWay();
        if (payWay != null ? !payWay.equals(payWay2) : payWay2 != null) {
            return false;
        }
        Integer payStatus = getPayStatus();
        Integer payStatus2 = shopCartConfirmBean.getPayStatus();
        if (payStatus != null ? !payStatus.equals(payStatus2) : payStatus2 != null) {
            return false;
        }
        Integer status = getStatus();
        Integer status2 = shopCartConfirmBean.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        Integer refundStatus = getRefundStatus();
        Integer refundStatus2 = shopCartConfirmBean.getRefundStatus();
        if (refundStatus != null ? !refundStatus.equals(refundStatus2) : refundStatus2 != null) {
            return false;
        }
        Integer refundedNum = getRefundedNum();
        Integer refundedNum2 = shopCartConfirmBean.getRefundedNum();
        if (refundedNum != null ? !refundedNum.equals(refundedNum2) : refundedNum2 != null) {
            return false;
        }
        Integer deliverType = getDeliverType();
        Integer deliverType2 = shopCartConfirmBean.getDeliverType();
        if (deliverType != null ? !deliverType.equals(deliverType2) : deliverType2 != null) {
            return false;
        }
        Integer storeId = getStoreId();
        Integer storeId2 = shopCartConfirmBean.getStoreId();
        if (storeId != null ? !storeId.equals(storeId2) : storeId2 != null) {
            return false;
        }
        Integer staffId = getStaffId();
        Integer staffId2 = shopCartConfirmBean.getStaffId();
        if (staffId != null ? !staffId.equals(staffId2) : staffId2 != null) {
            return false;
        }
        Integer userComments = getUserComments();
        Integer userComments2 = shopCartConfirmBean.getUserComments();
        if (userComments != null ? !userComments.equals(userComments2) : userComments2 != null) {
            return false;
        }
        Integer isDel = getIsDel();
        Integer isDel2 = shopCartConfirmBean.getIsDel();
        if (isDel != null ? !isDel.equals(isDel2) : isDel2 != null) {
            return false;
        }
        Integer userDel = getUserDel();
        Integer userDel2 = shopCartConfirmBean.getUserDel();
        if (userDel != null ? !userDel.equals(userDel2) : userDel2 != null) {
            return false;
        }
        Integer experience = getExperience();
        Integer experience2 = shopCartConfirmBean.getExperience();
        if (experience != null ? !experience.equals(experience2) : experience2 != null) {
            return false;
        }
        Integer grouponStatus = getGrouponStatus();
        Integer grouponStatus2 = shopCartConfirmBean.getGrouponStatus();
        if (grouponStatus != null ? !grouponStatus.equals(grouponStatus2) : grouponStatus2 != null) {
            return false;
        }
        String orderNo = getOrderNo();
        String orderNo2 = shopCartConfirmBean.getOrderNo();
        if (orderNo != null ? !orderNo.equals(orderNo2) : orderNo2 != null) {
            return false;
        }
        String payOrderNo = getPayOrderNo();
        String payOrderNo2 = shopCartConfirmBean.getPayOrderNo();
        if (payOrderNo != null ? !payOrderNo.equals(payOrderNo2) : payOrderNo2 != null) {
            return false;
        }
        String postage = getPostage();
        String postage2 = shopCartConfirmBean.getPostage();
        if (postage != null ? !postage.equals(postage2) : postage2 != null) {
            return false;
        }
        String orderPrice = getOrderPrice();
        String orderPrice2 = shopCartConfirmBean.getOrderPrice();
        if (orderPrice != null ? !orderPrice.equals(orderPrice2) : orderPrice2 != null) {
            return false;
        }
        String payPrice = getPayPrice();
        String payPrice2 = shopCartConfirmBean.getPayPrice();
        if (payPrice != null ? !payPrice.equals(payPrice2) : payPrice2 != null) {
            return false;
        }
        String payPostage = getPayPostage();
        String payPostage2 = shopCartConfirmBean.getPayPostage();
        if (payPostage != null ? !payPostage.equals(payPostage2) : payPostage2 != null) {
            return false;
        }
        String vipDiscount = getVipDiscount();
        String vipDiscount2 = shopCartConfirmBean.getVipDiscount();
        if (vipDiscount != null ? !vipDiscount.equals(vipDiscount2) : vipDiscount2 != null) {
            return false;
        }
        String couponAmount = getCouponAmount();
        String couponAmount2 = shopCartConfirmBean.getCouponAmount();
        if (couponAmount != null ? !couponAmount.equals(couponAmount2) : couponAmount2 != null) {
            return false;
        }
        String integralDiscount = getIntegralDiscount();
        String integralDiscount2 = shopCartConfirmBean.getIntegralDiscount();
        if (integralDiscount != null ? !integralDiscount.equals(integralDiscount2) : integralDiscount2 != null) {
            return false;
        }
        Object payTime = getPayTime();
        Object payTime2 = shopCartConfirmBean.getPayTime();
        if (payTime != null ? !payTime.equals(payTime2) : payTime2 != null) {
            return false;
        }
        Object deliveryTime = getDeliveryTime();
        Object deliveryTime2 = shopCartConfirmBean.getDeliveryTime();
        if (deliveryTime != null ? !deliveryTime.equals(deliveryTime2) : deliveryTime2 != null) {
            return false;
        }
        Object cancelTime = getCancelTime();
        Object cancelTime2 = shopCartConfirmBean.getCancelTime();
        if (cancelTime != null ? !cancelTime.equals(cancelTime2) : cancelTime2 != null) {
            return false;
        }
        Object receivedTime = getReceivedTime();
        Object receivedTime2 = shopCartConfirmBean.getReceivedTime();
        if (receivedTime != null ? !receivedTime.equals(receivedTime2) : receivedTime2 != null) {
            return false;
        }
        Object closeTime = getCloseTime();
        Object closeTime2 = shopCartConfirmBean.getCloseTime();
        if (closeTime != null ? !closeTime.equals(closeTime2) : closeTime2 != null) {
            return false;
        }
        String source = getSource();
        String source2 = shopCartConfirmBean.getSource();
        if (source != null ? !source.equals(source2) : source2 != null) {
            return false;
        }
        String refundedPrice = getRefundedPrice();
        String refundedPrice2 = shopCartConfirmBean.getRefundedPrice();
        if (refundedPrice != null ? !refundedPrice.equals(refundedPrice2) : refundedPrice2 != null) {
            return false;
        }
        String returnMsg = getReturnMsg();
        String returnMsg2 = shopCartConfirmBean.getReturnMsg();
        if (returnMsg != null ? !returnMsg.equals(returnMsg2) : returnMsg2 != null) {
            return false;
        }
        String thirdCode = getThirdCode();
        String thirdCode2 = shopCartConfirmBean.getThirdCode();
        if (thirdCode != null ? !thirdCode.equals(thirdCode2) : thirdCode2 != null) {
            return false;
        }
        String verificationCode = getVerificationCode();
        String verificationCode2 = shopCartConfirmBean.getVerificationCode();
        if (verificationCode != null ? !verificationCode.equals(verificationCode2) : verificationCode2 != null) {
            return false;
        }
        String deliveryName = getDeliveryName();
        String deliveryName2 = shopCartConfirmBean.getDeliveryName();
        if (deliveryName != null ? !deliveryName.equals(deliveryName2) : deliveryName2 != null) {
            return false;
        }
        String deliveryCode = getDeliveryCode();
        String deliveryCode2 = shopCartConfirmBean.getDeliveryCode();
        if (deliveryCode != null ? !deliveryCode.equals(deliveryCode2) : deliveryCode2 != null) {
            return false;
        }
        String deliveryNo = getDeliveryNo();
        String deliveryNo2 = shopCartConfirmBean.getDeliveryNo();
        if (deliveryNo != null ? !deliveryNo.equals(deliveryNo2) : deliveryNo2 != null) {
            return false;
        }
        String remark = getRemark();
        String remark2 = shopCartConfirmBean.getRemark();
        if (remark != null ? !remark.equals(remark2) : remark2 != null) {
            return false;
        }
        String integral = getIntegral();
        String integral2 = shopCartConfirmBean.getIntegral();
        if (integral != null ? !integral.equals(integral2) : integral2 != null) {
            return false;
        }
        String createTime = getCreateTime();
        String createTime2 = shopCartConfirmBean.getCreateTime();
        if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
            return false;
        }
        String updateTime = getUpdateTime();
        String updateTime2 = shopCartConfirmBean.getUpdateTime();
        if (updateTime != null ? !updateTime.equals(updateTime2) : updateTime2 != null) {
            return false;
        }
        List<ShopCartListBean> sub = getSub();
        List<ShopCartListBean> sub2 = shopCartConfirmBean.getSub();
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
        return this.f34894id;
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

    public List<ShopCartListBean> getSub() {
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
        List<ShopCartListBean> sub = getSub();
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
        this.f34894id = num;
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

    public void setSub(List<ShopCartListBean> list) {
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
        return "ShopCartConfirmBean(id=" + getId() + ", pid=" + getPid() + ", type=" + getType() + ", orderNo=" + getOrderNo() + ", payOrderNo=" + getPayOrderNo() + ", userId=" + getUserId() + ", totalNum=" + getTotalNum() + ", postage=" + getPostage() + ", orderPrice=" + getOrderPrice() + ", payWay=" + getPayWay() + ", payPrice=" + getPayPrice() + ", payPostage=" + getPayPostage() + ", vipDiscount=" + getVipDiscount() + ", couponAmount=" + getCouponAmount() + ", integralDiscount=" + getIntegralDiscount() + ", payStatus=" + getPayStatus() + ", payTime=" + getPayTime() + ", deliveryTime=" + getDeliveryTime() + ", cancelTime=" + getCancelTime() + ", receivedTime=" + getReceivedTime() + ", closeTime=" + getCloseTime() + ", status=" + getStatus() + ", source=" + getSource() + ", refundStatus=" + getRefundStatus() + ", refundedPrice=" + getRefundedPrice() + ", refundedNum=" + getRefundedNum() + ", returnMsg=" + getReturnMsg() + ", thirdCode=" + getThirdCode() + ", deliverType=" + getDeliverType() + ", storeId=" + getStoreId() + ", verificationCode=" + getVerificationCode() + ", staffId=" + getStaffId() + ", deliveryName=" + getDeliveryName() + ", deliveryCode=" + getDeliveryCode() + ", deliveryNo=" + getDeliveryNo() + ", userComments=" + getUserComments() + ", remark=" + getRemark() + ", isDel=" + getIsDel() + ", userDel=" + getUserDel() + ", experience=" + getExperience() + ", integral=" + getIntegral() + ", grouponStatus=" + getGrouponStatus() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ", sub=" + getSub() + ")";
    }
}
