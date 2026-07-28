package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class FunctionMenuBean {

    @SerializedName("image_id")
    private int imageId;

    @SerializedName("name")
    private String name;

    public boolean canEqual(Object obj) {
        return obj instanceof FunctionMenuBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FunctionMenuBean)) {
            return false;
        }
        FunctionMenuBean functionMenuBean = (FunctionMenuBean) obj;
        if (!functionMenuBean.canEqual(this) || getImageId() != functionMenuBean.getImageId()) {
            return false;
        }
        String name = getName();
        String name2 = functionMenuBean.getName();
        return name != null ? name.equals(name2) : name2 == null;
    }

    public int getImageId() {
        return this.imageId;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int imageId = getImageId() + 59;
        String name = getName();
        return (imageId * 59) + (name == null ? 43 : name.hashCode());
    }

    public void setImageId(int i10) {
        this.imageId = i10;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return "FunctionMenuBean(imageId=" + getImageId() + ", name=" + getName() + ")";
    }
}
