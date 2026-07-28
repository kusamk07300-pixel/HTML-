package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class DynamicLikeBean {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34822id;

    @SerializedName("type")
    private Integer type;

    public boolean canEqual(Object obj) {
        return obj instanceof DynamicLikeBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DynamicLikeBean)) {
            return false;
        }
        DynamicLikeBean dynamicLikeBean = (DynamicLikeBean) obj;
        if (!dynamicLikeBean.canEqual(this)) {
            return false;
        }
        Integer type = getType();
        Integer type2 = dynamicLikeBean.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = dynamicLikeBean.getId();
        return id2 != null ? id2.equals(id3) : id3 == null;
    }

    public Integer getId() {
        return this.f34822id;
    }

    public Integer getType() {
        return this.type;
    }

    public int hashCode() {
        Integer type = getType();
        int iHashCode = type == null ? 43 : type.hashCode();
        Integer id2 = getId();
        return ((iHashCode + 59) * 59) + (id2 != null ? id2.hashCode() : 43);
    }

    public void setId(Integer num) {
        this.f34822id = num;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public String toString() {
        return "DynamicLikeBean(type=" + getType() + ", id=" + getId() + ")";
    }
}
