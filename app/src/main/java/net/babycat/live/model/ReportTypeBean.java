package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class ReportTypeBean {

    @SerializedName("addtime")
    private String addtime;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34881id;

    @SerializedName("list_order")
    private Integer listOrder;

    @SerializedName("name")
    private String name;

    public boolean canEqual(Object obj) {
        return obj instanceof ReportTypeBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReportTypeBean)) {
            return false;
        }
        ReportTypeBean reportTypeBean = (ReportTypeBean) obj;
        if (!reportTypeBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = reportTypeBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer listOrder = getListOrder();
        Integer listOrder2 = reportTypeBean.getListOrder();
        if (listOrder != null ? !listOrder.equals(listOrder2) : listOrder2 != null) {
            return false;
        }
        String name = getName();
        String name2 = reportTypeBean.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String addtime = getAddtime();
        String addtime2 = reportTypeBean.getAddtime();
        return addtime != null ? addtime.equals(addtime2) : addtime2 == null;
    }

    public String getAddtime() {
        return this.addtime;
    }

    public Integer getId() {
        return this.f34881id;
    }

    public Integer getListOrder() {
        return this.listOrder;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        Integer listOrder = getListOrder();
        int iHashCode2 = ((iHashCode + 59) * 59) + (listOrder == null ? 43 : listOrder.hashCode());
        String name = getName();
        int iHashCode3 = (iHashCode2 * 59) + (name == null ? 43 : name.hashCode());
        String addtime = getAddtime();
        return (iHashCode3 * 59) + (addtime != null ? addtime.hashCode() : 43);
    }

    public void setAddtime(String str) {
        this.addtime = str;
    }

    public void setId(Integer num) {
        this.f34881id = num;
    }

    public void setListOrder(Integer num) {
        this.listOrder = num;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return "ReportTypeBean(id=" + getId() + ", listOrder=" + getListOrder() + ", name=" + getName() + ", addtime=" + getAddtime() + ")";
    }
}
