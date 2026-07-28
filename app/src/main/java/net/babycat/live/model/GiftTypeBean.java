package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class GiftTypeBean {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34840id;

    @SerializedName("name")
    private String name;

    public boolean canEqual(Object obj) {
        return obj instanceof GiftTypeBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftTypeBean)) {
            return false;
        }
        GiftTypeBean giftTypeBean = (GiftTypeBean) obj;
        if (!giftTypeBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = giftTypeBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        String name = getName();
        String name2 = giftTypeBean.getName();
        return name != null ? name.equals(name2) : name2 == null;
    }

    public Integer getId() {
        return this.f34840id;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        String name = getName();
        return ((iHashCode + 59) * 59) + (name != null ? name.hashCode() : 43);
    }

    public void setId(Integer num) {
        this.f34840id = num;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return "GiftTypeBean(id=" + getId() + ", name=" + getName() + ")";
    }
}
