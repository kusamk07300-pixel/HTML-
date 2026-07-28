package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class PayTypeBean {

    @SerializedName("icon")
    private String icon;

    @SerializedName("select")
    private Boolean isSelect = Boolean.FALSE;

    @SerializedName("name")
    private String name;

    @SerializedName("type")
    private String type;

    public boolean canEqual(Object obj) {
        return obj instanceof PayTypeBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PayTypeBean)) {
            return false;
        }
        PayTypeBean payTypeBean = (PayTypeBean) obj;
        if (!payTypeBean.canEqual(this)) {
            return false;
        }
        Boolean isSelect = getIsSelect();
        Boolean isSelect2 = payTypeBean.getIsSelect();
        if (isSelect != null ? !isSelect.equals(isSelect2) : isSelect2 != null) {
            return false;
        }
        String name = getName();
        String name2 = payTypeBean.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String icon = getIcon();
        String icon2 = payTypeBean.getIcon();
        if (icon != null ? !icon.equals(icon2) : icon2 != null) {
            return false;
        }
        String type = getType();
        String type2 = payTypeBean.getType();
        return type != null ? type.equals(type2) : type2 == null;
    }

    public String getIcon() {
        return this.icon;
    }

    public Boolean getIsSelect() {
        return this.isSelect;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public int hashCode() {
        Boolean isSelect = getIsSelect();
        int iHashCode = isSelect == null ? 43 : isSelect.hashCode();
        String name = getName();
        int iHashCode2 = ((iHashCode + 59) * 59) + (name == null ? 43 : name.hashCode());
        String icon = getIcon();
        int iHashCode3 = (iHashCode2 * 59) + (icon == null ? 43 : icon.hashCode());
        String type = getType();
        return (iHashCode3 * 59) + (type != null ? type.hashCode() : 43);
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setIsSelect(Boolean bool) {
        this.isSelect = bool;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "PayTypeBean(name=" + getName() + ", icon=" + getIcon() + ", type=" + getType() + ", isSelect=" + getIsSelect() + ")";
    }
}
