package net.babycat.live.model;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ListBean<T> {
    private List<T> list;
    private String total;

    public boolean canEqual(Object obj) {
        return obj instanceof ListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListBean)) {
            return false;
        }
        ListBean listBean = (ListBean) obj;
        if (!listBean.canEqual(this)) {
            return false;
        }
        List<T> list = getList();
        List<T> list2 = listBean.getList();
        if (list != null ? !list.equals(list2) : list2 != null) {
            return false;
        }
        String total = getTotal();
        String total2 = listBean.getTotal();
        return total != null ? total.equals(total2) : total2 == null;
    }

    public List<T> getList() {
        return this.list;
    }

    public String getTotal() {
        return this.total;
    }

    public int hashCode() {
        List<T> list = getList();
        int iHashCode = list == null ? 43 : list.hashCode();
        String total = getTotal();
        return ((iHashCode + 59) * 59) + (total != null ? total.hashCode() : 43);
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void setTotal(String str) {
        this.total = str;
    }

    public String toString() {
        return "ListBean(list=" + getList() + ", total=" + getTotal() + ")";
    }
}
