package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class ReportBean {

    @SerializedName("content")
    private String content;

    @SerializedName("selected")
    private boolean selected;

    public boolean canEqual(Object obj) {
        return obj instanceof ReportBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReportBean)) {
            return false;
        }
        ReportBean reportBean = (ReportBean) obj;
        if (!reportBean.canEqual(this) || isSelected() != reportBean.isSelected()) {
            return false;
        }
        String content = getContent();
        String content2 = reportBean.getContent();
        return content != null ? content.equals(content2) : content2 == null;
    }

    public String getContent() {
        return this.content;
    }

    public int hashCode() {
        int i10 = isSelected() ? 79 : 97;
        String content = getContent();
        return ((i10 + 59) * 59) + (content == null ? 43 : content.hashCode());
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setSelected(boolean z10) {
        this.selected = z10;
    }

    public String toString() {
        return "ReportBean(selected=" + isSelected() + ", content=" + getContent() + ")";
    }
}
