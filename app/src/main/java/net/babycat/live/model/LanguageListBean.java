package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class LanguageListBean {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34857id;

    @SerializedName("name")
    private String name;

    public boolean canEqual(Object obj) {
        return obj instanceof LanguageListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LanguageListBean)) {
            return false;
        }
        LanguageListBean languageListBean = (LanguageListBean) obj;
        if (!languageListBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = languageListBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        String name = getName();
        String name2 = languageListBean.getName();
        return name != null ? name.equals(name2) : name2 == null;
    }

    public Integer getId() {
        return this.f34857id;
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
        this.f34857id = num;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return "LanguageListBean(id=" + getId() + ", name=" + getName() + ")";
    }
}
