package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class ShopAddressListBean implements Serializable {

    @SerializedName("city")
    private String city;

    @SerializedName("county")
    private String county;

    @SerializedName("create_time")
    private String createTime;

    @SerializedName("detail")
    private String detail;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34893id;

    @SerializedName("is_default")
    private Integer isDefault;

    @SerializedName("is_del")
    private Integer isDel;

    @SerializedName("latitude")
    private String latitude;

    @SerializedName("longitude")
    private String longitude;

    @SerializedName("phone")
    private String phone;

    @SerializedName("post_code")
    private Integer postCode;

    @SerializedName("province")
    private String province;

    @SerializedName("real_name")
    private String realName;

    @SerializedName("update_time")
    private String updateTime;

    @SerializedName("user_id")
    private Integer userId;

    public boolean canEqual(Object obj) {
        return obj instanceof ShopAddressListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShopAddressListBean)) {
            return false;
        }
        ShopAddressListBean shopAddressListBean = (ShopAddressListBean) obj;
        if (!shopAddressListBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = shopAddressListBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer userId = getUserId();
        Integer userId2 = shopAddressListBean.getUserId();
        if (userId != null ? !userId.equals(userId2) : userId2 != null) {
            return false;
        }
        Integer postCode = getPostCode();
        Integer postCode2 = shopAddressListBean.getPostCode();
        if (postCode != null ? !postCode.equals(postCode2) : postCode2 != null) {
            return false;
        }
        Integer isDefault = getIsDefault();
        Integer isDefault2 = shopAddressListBean.getIsDefault();
        if (isDefault != null ? !isDefault.equals(isDefault2) : isDefault2 != null) {
            return false;
        }
        Integer isDel = getIsDel();
        Integer isDel2 = shopAddressListBean.getIsDel();
        if (isDel != null ? !isDel.equals(isDel2) : isDel2 != null) {
            return false;
        }
        String realName = getRealName();
        String realName2 = shopAddressListBean.getRealName();
        if (realName != null ? !realName.equals(realName2) : realName2 != null) {
            return false;
        }
        String phone = getPhone();
        String phone2 = shopAddressListBean.getPhone();
        if (phone != null ? !phone.equals(phone2) : phone2 != null) {
            return false;
        }
        String province = getProvince();
        String province2 = shopAddressListBean.getProvince();
        if (province != null ? !province.equals(province2) : province2 != null) {
            return false;
        }
        String city = getCity();
        String city2 = shopAddressListBean.getCity();
        if (city != null ? !city.equals(city2) : city2 != null) {
            return false;
        }
        String county = getCounty();
        String county2 = shopAddressListBean.getCounty();
        if (county != null ? !county.equals(county2) : county2 != null) {
            return false;
        }
        String detail = getDetail();
        String detail2 = shopAddressListBean.getDetail();
        if (detail != null ? !detail.equals(detail2) : detail2 != null) {
            return false;
        }
        String longitude = getLongitude();
        String longitude2 = shopAddressListBean.getLongitude();
        if (longitude != null ? !longitude.equals(longitude2) : longitude2 != null) {
            return false;
        }
        String latitude = getLatitude();
        String latitude2 = shopAddressListBean.getLatitude();
        if (latitude != null ? !latitude.equals(latitude2) : latitude2 != null) {
            return false;
        }
        String createTime = getCreateTime();
        String createTime2 = shopAddressListBean.getCreateTime();
        if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
            return false;
        }
        String updateTime = getUpdateTime();
        String updateTime2 = shopAddressListBean.getUpdateTime();
        return updateTime != null ? updateTime.equals(updateTime2) : updateTime2 == null;
    }

    public String getCity() {
        return this.city;
    }

    public String getCounty() {
        return this.county;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getDetail() {
        return this.detail;
    }

    public Integer getId() {
        return this.f34893id;
    }

    public Integer getIsDefault() {
        return this.isDefault;
    }

    public Integer getIsDel() {
        return this.isDel;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public String getPhone() {
        return this.phone;
    }

    public Integer getPostCode() {
        return this.postCode;
    }

    public String getProvince() {
        return this.province;
    }

    public String getRealName() {
        return this.realName;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        Integer userId = getUserId();
        int iHashCode2 = ((iHashCode + 59) * 59) + (userId == null ? 43 : userId.hashCode());
        Integer postCode = getPostCode();
        int iHashCode3 = (iHashCode2 * 59) + (postCode == null ? 43 : postCode.hashCode());
        Integer isDefault = getIsDefault();
        int iHashCode4 = (iHashCode3 * 59) + (isDefault == null ? 43 : isDefault.hashCode());
        Integer isDel = getIsDel();
        int iHashCode5 = (iHashCode4 * 59) + (isDel == null ? 43 : isDel.hashCode());
        String realName = getRealName();
        int iHashCode6 = (iHashCode5 * 59) + (realName == null ? 43 : realName.hashCode());
        String phone = getPhone();
        int iHashCode7 = (iHashCode6 * 59) + (phone == null ? 43 : phone.hashCode());
        String province = getProvince();
        int iHashCode8 = (iHashCode7 * 59) + (province == null ? 43 : province.hashCode());
        String city = getCity();
        int iHashCode9 = (iHashCode8 * 59) + (city == null ? 43 : city.hashCode());
        String county = getCounty();
        int iHashCode10 = (iHashCode9 * 59) + (county == null ? 43 : county.hashCode());
        String detail = getDetail();
        int iHashCode11 = (iHashCode10 * 59) + (detail == null ? 43 : detail.hashCode());
        String longitude = getLongitude();
        int iHashCode12 = (iHashCode11 * 59) + (longitude == null ? 43 : longitude.hashCode());
        String latitude = getLatitude();
        int iHashCode13 = (iHashCode12 * 59) + (latitude == null ? 43 : latitude.hashCode());
        String createTime = getCreateTime();
        int iHashCode14 = (iHashCode13 * 59) + (createTime == null ? 43 : createTime.hashCode());
        String updateTime = getUpdateTime();
        return (iHashCode14 * 59) + (updateTime != null ? updateTime.hashCode() : 43);
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCounty(String str) {
        this.county = str;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setDetail(String str) {
        this.detail = str;
    }

    public void setId(Integer num) {
        this.f34893id = num;
    }

    public void setIsDefault(Integer num) {
        this.isDefault = num;
    }

    public void setIsDel(Integer num) {
        this.isDel = num;
    }

    public void setLatitude(String str) {
        this.latitude = str;
    }

    public void setLongitude(String str) {
        this.longitude = str;
    }

    public void setPhone(String str) {
        this.phone = str;
    }

    public void setPostCode(Integer num) {
        this.postCode = num;
    }

    public void setProvince(String str) {
        this.province = str;
    }

    public void setRealName(String str) {
        this.realName = str;
    }

    public void setUpdateTime(String str) {
        this.updateTime = str;
    }

    public void setUserId(Integer num) {
        this.userId = num;
    }

    public String toString() {
        return "ShopAddressListBean(id=" + getId() + ", userId=" + getUserId() + ", realName=" + getRealName() + ", phone=" + getPhone() + ", province=" + getProvince() + ", city=" + getCity() + ", county=" + getCounty() + ", detail=" + getDetail() + ", postCode=" + getPostCode() + ", longitude=" + getLongitude() + ", latitude=" + getLatitude() + ", isDefault=" + getIsDefault() + ", isDel=" + getIsDel() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ")";
    }
}
