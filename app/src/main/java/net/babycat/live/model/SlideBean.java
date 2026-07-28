package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class SlideBean {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34904id;

    @SerializedName("image")
    private String image;

    public boolean canEqual(Object obj) {
        return obj instanceof SlideBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SlideBean)) {
            return false;
        }
        SlideBean slideBean = (SlideBean) obj;
        if (!slideBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = slideBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        String image = getImage();
        String image2 = slideBean.getImage();
        return image != null ? image.equals(image2) : image2 == null;
    }

    public Integer getId() {
        return this.f34904id;
    }

    public String getImage() {
        return this.image;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        String image = getImage();
        return ((iHashCode + 59) * 59) + (image != null ? image.hashCode() : 43);
    }

    public void setId(Integer num) {
        this.f34904id = num;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public String toString() {
        return "SlideBean(image=" + getImage() + ", id=" + getId() + ")";
    }
}
