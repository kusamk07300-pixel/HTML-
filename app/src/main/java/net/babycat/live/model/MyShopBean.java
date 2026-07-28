package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;

/* JADX INFO: loaded from: classes4.dex */
public class MyShopBean {

    @SerializedName("cate_type")
    private Integer cateType;

    @SerializedName("expire")
    private Integer expire;

    @SerializedName("file_type")
    private String fileType;

    @SerializedName("icon")
    private String icon;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34868id;

    @SerializedName("select")
    private Boolean isSelect = Boolean.FALSE;

    @SerializedName("name")
    private String name;

    @SerializedName("pay_type")
    private Integer payType;

    @SerializedName("price")
    private Integer price;

    @SerializedName("special_type")
    private Integer specialType;

    @SerializedName(o0.CATEGORY_STATUS)
    private Integer status;

    @SerializedName("term")
    private Integer term;

    @SerializedName("title")
    private String title;

    @SerializedName("url")
    private String url;

    public boolean canEqual(Object obj) {
        return obj instanceof MyShopBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyShopBean)) {
            return false;
        }
        MyShopBean myShopBean = (MyShopBean) obj;
        if (!myShopBean.canEqual(this)) {
            return false;
        }
        Boolean isSelect = getIsSelect();
        Boolean isSelect2 = myShopBean.getIsSelect();
        if (isSelect != null ? !isSelect.equals(isSelect2) : isSelect2 != null) {
            return false;
        }
        Integer status = getStatus();
        Integer status2 = myShopBean.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = myShopBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer payType = getPayType();
        Integer payType2 = myShopBean.getPayType();
        if (payType != null ? !payType.equals(payType2) : payType2 != null) {
            return false;
        }
        Integer cateType = getCateType();
        Integer cateType2 = myShopBean.getCateType();
        if (cateType != null ? !cateType.equals(cateType2) : cateType2 != null) {
            return false;
        }
        Integer term = getTerm();
        Integer term2 = myShopBean.getTerm();
        if (term != null ? !term.equals(term2) : term2 != null) {
            return false;
        }
        Integer price = getPrice();
        Integer price2 = myShopBean.getPrice();
        if (price != null ? !price.equals(price2) : price2 != null) {
            return false;
        }
        Integer expire = getExpire();
        Integer expire2 = myShopBean.getExpire();
        if (expire != null ? !expire.equals(expire2) : expire2 != null) {
            return false;
        }
        Integer specialType = getSpecialType();
        Integer specialType2 = myShopBean.getSpecialType();
        if (specialType != null ? !specialType.equals(specialType2) : specialType2 != null) {
            return false;
        }
        String name = getName();
        String name2 = myShopBean.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String title = getTitle();
        String title2 = myShopBean.getTitle();
        if (title != null ? !title.equals(title2) : title2 != null) {
            return false;
        }
        String fileType = getFileType();
        String fileType2 = myShopBean.getFileType();
        if (fileType != null ? !fileType.equals(fileType2) : fileType2 != null) {
            return false;
        }
        String icon = getIcon();
        String icon2 = myShopBean.getIcon();
        if (icon != null ? !icon.equals(icon2) : icon2 != null) {
            return false;
        }
        String url = getUrl();
        String url2 = myShopBean.getUrl();
        return url != null ? url.equals(url2) : url2 == null;
    }

    public Integer getCateType() {
        return this.cateType;
    }

    public Integer getExpire() {
        return this.expire;
    }

    public String getFileType() {
        return this.fileType;
    }

    public String getIcon() {
        return this.icon;
    }

    public Integer getId() {
        return this.f34868id;
    }

    public Boolean getIsSelect() {
        return this.isSelect;
    }

    public String getName() {
        return this.name;
    }

    public Integer getPayType() {
        return this.payType;
    }

    public Integer getPrice() {
        return this.price;
    }

    public Integer getSpecialType() {
        return this.specialType;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getTerm() {
        return this.term;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        Boolean isSelect = getIsSelect();
        int iHashCode = isSelect == null ? 43 : isSelect.hashCode();
        Integer status = getStatus();
        int iHashCode2 = ((iHashCode + 59) * 59) + (status == null ? 43 : status.hashCode());
        Integer id2 = getId();
        int iHashCode3 = (iHashCode2 * 59) + (id2 == null ? 43 : id2.hashCode());
        Integer payType = getPayType();
        int iHashCode4 = (iHashCode3 * 59) + (payType == null ? 43 : payType.hashCode());
        Integer cateType = getCateType();
        int iHashCode5 = (iHashCode4 * 59) + (cateType == null ? 43 : cateType.hashCode());
        Integer term = getTerm();
        int iHashCode6 = (iHashCode5 * 59) + (term == null ? 43 : term.hashCode());
        Integer price = getPrice();
        int iHashCode7 = (iHashCode6 * 59) + (price == null ? 43 : price.hashCode());
        Integer expire = getExpire();
        int iHashCode8 = (iHashCode7 * 59) + (expire == null ? 43 : expire.hashCode());
        Integer specialType = getSpecialType();
        int iHashCode9 = (iHashCode8 * 59) + (specialType == null ? 43 : specialType.hashCode());
        String name = getName();
        int iHashCode10 = (iHashCode9 * 59) + (name == null ? 43 : name.hashCode());
        String title = getTitle();
        int iHashCode11 = (iHashCode10 * 59) + (title == null ? 43 : title.hashCode());
        String fileType = getFileType();
        int iHashCode12 = (iHashCode11 * 59) + (fileType == null ? 43 : fileType.hashCode());
        String icon = getIcon();
        int iHashCode13 = (iHashCode12 * 59) + (icon == null ? 43 : icon.hashCode());
        String url = getUrl();
        return (iHashCode13 * 59) + (url != null ? url.hashCode() : 43);
    }

    public void setCateType(Integer num) {
        this.cateType = num;
    }

    public void setExpire(Integer num) {
        this.expire = num;
    }

    public void setFileType(String str) {
        this.fileType = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setId(Integer num) {
        this.f34868id = num;
    }

    public void setIsSelect(Boolean bool) {
        this.isSelect = bool;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPayType(Integer num) {
        this.payType = num;
    }

    public void setPrice(Integer num) {
        this.price = num;
    }

    public void setSpecialType(Integer num) {
        this.specialType = num;
    }

    public void setStatus(Integer num) {
        this.status = num;
    }

    public void setTerm(Integer num) {
        this.term = num;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "MyShopBean(isSelect=" + getIsSelect() + ", status=" + getStatus() + ", id=" + getId() + ", name=" + getName() + ", title=" + getTitle() + ", fileType=" + getFileType() + ", payType=" + getPayType() + ", cateType=" + getCateType() + ", icon=" + getIcon() + ", url=" + getUrl() + ", term=" + getTerm() + ", price=" + getPrice() + ", expire=" + getExpire() + ", specialType=" + getSpecialType() + ")";
    }
}
