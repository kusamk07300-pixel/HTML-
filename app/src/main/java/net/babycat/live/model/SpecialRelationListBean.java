package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class SpecialRelationListBean {

    @SerializedName("create_time")
    private String createTime;

    @SerializedName("gift")
    private String gift;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34905id;

    @SerializedName("name")
    private String name;

    @SerializedName("update_time")
    private String updateTime;

    public boolean canEqual(Object obj) {
        return obj instanceof SpecialRelationListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpecialRelationListBean)) {
            return false;
        }
        SpecialRelationListBean specialRelationListBean = (SpecialRelationListBean) obj;
        if (!specialRelationListBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = specialRelationListBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        String name = getName();
        String name2 = specialRelationListBean.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String gift = getGift();
        String gift2 = specialRelationListBean.getGift();
        if (gift != null ? !gift.equals(gift2) : gift2 != null) {
            return false;
        }
        String createTime = getCreateTime();
        String createTime2 = specialRelationListBean.getCreateTime();
        if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
            return false;
        }
        String updateTime = getUpdateTime();
        String updateTime2 = specialRelationListBean.getUpdateTime();
        return updateTime != null ? updateTime.equals(updateTime2) : updateTime2 == null;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getGift() {
        return this.gift;
    }

    public Integer getId() {
        return this.f34905id;
    }

    public String getName() {
        return this.name;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        String name = getName();
        int iHashCode2 = ((iHashCode + 59) * 59) + (name == null ? 43 : name.hashCode());
        String gift = getGift();
        int iHashCode3 = (iHashCode2 * 59) + (gift == null ? 43 : gift.hashCode());
        String createTime = getCreateTime();
        int iHashCode4 = (iHashCode3 * 59) + (createTime == null ? 43 : createTime.hashCode());
        String updateTime = getUpdateTime();
        return (iHashCode4 * 59) + (updateTime != null ? updateTime.hashCode() : 43);
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setGift(String str) {
        this.gift = str;
    }

    public void setId(Integer num) {
        this.f34905id = num;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setUpdateTime(String str) {
        this.updateTime = str;
    }

    public String toString() {
        return "SpecialRelationListBean(id=" + getId() + ", name=" + getName() + ", gift=" + getGift() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ")";
    }
}
