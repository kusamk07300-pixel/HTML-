package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import net.babycat.live.model.FamilyHomeBean;

/* JADX INFO: loaded from: classes4.dex */
public class FamilyMemberListBean {

    @SerializedName("cnt")
    private FamilyHomeBean.MemberCnt cnt;

    @SerializedName("list")
    private List<FamilyUserBean> list;

    public boolean canEqual(Object obj) {
        return obj instanceof FamilyMemberListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FamilyMemberListBean)) {
            return false;
        }
        FamilyMemberListBean familyMemberListBean = (FamilyMemberListBean) obj;
        if (!familyMemberListBean.canEqual(this)) {
            return false;
        }
        List<FamilyUserBean> list = getList();
        List<FamilyUserBean> list2 = familyMemberListBean.getList();
        if (list != null ? !list.equals(list2) : list2 != null) {
            return false;
        }
        FamilyHomeBean.MemberCnt cnt = getCnt();
        FamilyHomeBean.MemberCnt cnt2 = familyMemberListBean.getCnt();
        return cnt != null ? cnt.equals(cnt2) : cnt2 == null;
    }

    public FamilyHomeBean.MemberCnt getCnt() {
        return this.cnt;
    }

    public List<FamilyUserBean> getList() {
        return this.list;
    }

    public int hashCode() {
        List<FamilyUserBean> list = getList();
        int iHashCode = list == null ? 43 : list.hashCode();
        FamilyHomeBean.MemberCnt cnt = getCnt();
        return ((iHashCode + 59) * 59) + (cnt != null ? cnt.hashCode() : 43);
    }

    public void setCnt(FamilyHomeBean.MemberCnt memberCnt) {
        this.cnt = memberCnt;
    }

    public void setList(List<FamilyUserBean> list) {
        this.list = list;
    }

    public String toString() {
        return "FamilyMemberListBean(list=" + getList() + ", cnt=" + getCnt() + ")";
    }
}
