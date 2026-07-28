package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class AvatarBean {

    @SerializedName("src")
    private String src;

    public boolean canEqual(Object obj) {
        return obj instanceof AvatarBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvatarBean)) {
            return false;
        }
        AvatarBean avatarBean = (AvatarBean) obj;
        if (!avatarBean.canEqual(this)) {
            return false;
        }
        String src = getSrc();
        String src2 = avatarBean.getSrc();
        return src != null ? src.equals(src2) : src2 == null;
    }

    public String getSrc() {
        return this.src;
    }

    public int hashCode() {
        String src = getSrc();
        return 59 + (src == null ? 43 : src.hashCode());
    }

    public void setSrc(String str) {
        this.src = str;
    }

    public String toString() {
        return "AvatarBean(src=" + getSrc() + ")";
    }
}
