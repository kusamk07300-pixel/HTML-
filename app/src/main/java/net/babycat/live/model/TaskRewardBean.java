package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class TaskRewardBean {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private String f34908id;

    public boolean canEqual(Object obj) {
        return obj instanceof TaskRewardBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TaskRewardBean)) {
            return false;
        }
        TaskRewardBean taskRewardBean = (TaskRewardBean) obj;
        if (!taskRewardBean.canEqual(this)) {
            return false;
        }
        String id2 = getId();
        String id3 = taskRewardBean.getId();
        return id2 != null ? id2.equals(id3) : id3 == null;
    }

    public String getId() {
        return this.f34908id;
    }

    public int hashCode() {
        String id2 = getId();
        return 59 + (id2 == null ? 43 : id2.hashCode());
    }

    public void setId(String str) {
        this.f34908id = str;
    }

    public String toString() {
        return "TaskRewardBean(id=" + getId() + ")";
    }
}
