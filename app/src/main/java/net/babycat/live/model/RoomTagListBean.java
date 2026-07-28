package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class RoomTagListBean {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34892id;

    @SerializedName("is_select")
    private boolean isSelect;

    @SerializedName("name")
    private String name;

    public boolean canEqual(Object obj) {
        return obj instanceof RoomTagListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoomTagListBean)) {
            return false;
        }
        RoomTagListBean roomTagListBean = (RoomTagListBean) obj;
        if (!roomTagListBean.canEqual(this) || isSelect() != roomTagListBean.isSelect()) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = roomTagListBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        String name = getName();
        String name2 = roomTagListBean.getName();
        return name != null ? name.equals(name2) : name2 == null;
    }

    public Integer getId() {
        return this.f34892id;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int i10 = isSelect() ? 79 : 97;
        Integer id2 = getId();
        int iHashCode = ((i10 + 59) * 59) + (id2 == null ? 43 : id2.hashCode());
        String name = getName();
        return (iHashCode * 59) + (name != null ? name.hashCode() : 43);
    }

    public boolean isSelect() {
        return this.isSelect;
    }

    public void setId(Integer num) {
        this.f34892id = num;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSelect(boolean z10) {
        this.isSelect = z10;
    }

    public String toString() {
        return "RoomTagListBean(id=" + getId() + ", name=" + getName() + ", isSelect=" + isSelect() + ")";
    }
}
