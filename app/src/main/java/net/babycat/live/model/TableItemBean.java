package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class TableItemBean {

    @SerializedName("title")
    private String title;

    @SerializedName("value")
    private String value;

    public boolean canEqual(Object obj) {
        return obj instanceof TableItemBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TableItemBean)) {
            return false;
        }
        TableItemBean tableItemBean = (TableItemBean) obj;
        if (!tableItemBean.canEqual(this)) {
            return false;
        }
        String title = getTitle();
        String title2 = tableItemBean.getTitle();
        if (title != null ? !title.equals(title2) : title2 != null) {
            return false;
        }
        String value = getValue();
        String value2 = tableItemBean.getValue();
        return value != null ? value.equals(value2) : value2 == null;
    }

    public String getTitle() {
        return this.title;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        String title = getTitle();
        int iHashCode = title == null ? 43 : title.hashCode();
        String value = getValue();
        return ((iHashCode + 59) * 59) + (value != null ? value.hashCode() : 43);
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        return "TableItemBean(title=" + getTitle() + ", value=" + getValue() + ")";
    }
}
