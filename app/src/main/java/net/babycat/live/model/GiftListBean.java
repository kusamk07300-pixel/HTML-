package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.io.File;
import ml.s;

/* JADX INFO: loaded from: classes4.dex */
public class GiftListBean {

    @SerializedName("cache_dir")
    private File CacheDir;

    @SerializedName("local_path")
    private String LocalPath;

    @SerializedName("gift_tag")
    private Integer giftTag;

    @SerializedName("gifticon")
    private String gifticon;

    @SerializedName("giftname")
    private String giftname;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34838id;

    @SerializedName("is_luck")
    private Integer isLuck;

    @SerializedName("is_selected")
    private boolean isSelected;

    @SerializedName("isplatgift")
    private Integer isplatgift;

    @SerializedName("jsonlink")
    private String jsonlink;

    @SerializedName("lucky")
    private Integer lucky;

    @SerializedName("mark")
    private Integer mark;

    @SerializedName("needcoin")
    private Integer needcoin;

    @SerializedName("reward_coins")
    private Integer rewardCoins;

    @SerializedName("sort")
    private Integer sort;

    @SerializedName(o0.CATEGORY_STATUS)
    private Integer status;

    @SerializedName("swflink")
    private String swflink;

    @SerializedName("swftime")
    private Integer swftime;

    @SerializedName("swftype")
    private Integer swftype;

    @SerializedName("tag")
    private String tag;

    @SerializedName(s.f33576v)
    private int tagId;

    @SerializedName("type")
    private Integer type;

    public boolean canEqual(Object obj) {
        return obj instanceof GiftListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftListBean)) {
            return false;
        }
        GiftListBean giftListBean = (GiftListBean) obj;
        if (!giftListBean.canEqual(this) || getTagId() != giftListBean.getTagId() || isSelected() != giftListBean.isSelected()) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = giftListBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer mark = getMark();
        Integer mark2 = giftListBean.getMark();
        if (mark != null ? !mark.equals(mark2) : mark2 != null) {
            return false;
        }
        Integer type = getType();
        Integer type2 = giftListBean.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        Integer needcoin = getNeedcoin();
        Integer needcoin2 = giftListBean.getNeedcoin();
        if (needcoin != null ? !needcoin.equals(needcoin2) : needcoin2 != null) {
            return false;
        }
        Integer sort = getSort();
        Integer sort2 = giftListBean.getSort();
        if (sort != null ? !sort.equals(sort2) : sort2 != null) {
            return false;
        }
        Integer swftype = getSwftype();
        Integer swftype2 = giftListBean.getSwftype();
        if (swftype != null ? !swftype.equals(swftype2) : swftype2 != null) {
            return false;
        }
        Integer swftime = getSwftime();
        Integer swftime2 = giftListBean.getSwftime();
        if (swftime != null ? !swftime.equals(swftime2) : swftime2 != null) {
            return false;
        }
        Integer isplatgift = getIsplatgift();
        Integer isplatgift2 = giftListBean.getIsplatgift();
        if (isplatgift != null ? !isplatgift.equals(isplatgift2) : isplatgift2 != null) {
            return false;
        }
        Integer isLuck = getIsLuck();
        Integer isLuck2 = giftListBean.getIsLuck();
        if (isLuck != null ? !isLuck.equals(isLuck2) : isLuck2 != null) {
            return false;
        }
        Integer status = getStatus();
        Integer status2 = giftListBean.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        Integer lucky = getLucky();
        Integer lucky2 = giftListBean.getLucky();
        if (lucky != null ? !lucky.equals(lucky2) : lucky2 != null) {
            return false;
        }
        Integer rewardCoins = getRewardCoins();
        Integer rewardCoins2 = giftListBean.getRewardCoins();
        if (rewardCoins != null ? !rewardCoins.equals(rewardCoins2) : rewardCoins2 != null) {
            return false;
        }
        Integer giftTag = getGiftTag();
        Integer giftTag2 = giftListBean.getGiftTag();
        if (giftTag != null ? !giftTag.equals(giftTag2) : giftTag2 != null) {
            return false;
        }
        String giftname = getGiftname();
        String giftname2 = giftListBean.getGiftname();
        if (giftname != null ? !giftname.equals(giftname2) : giftname2 != null) {
            return false;
        }
        String gifticon = getGifticon();
        String gifticon2 = giftListBean.getGifticon();
        if (gifticon != null ? !gifticon.equals(gifticon2) : gifticon2 != null) {
            return false;
        }
        String tag = getTag();
        String tag2 = giftListBean.getTag();
        if (tag != null ? !tag.equals(tag2) : tag2 != null) {
            return false;
        }
        String swflink = getSwflink();
        String swflink2 = giftListBean.getSwflink();
        if (swflink != null ? !swflink.equals(swflink2) : swflink2 != null) {
            return false;
        }
        String jsonlink = getJsonlink();
        String jsonlink2 = giftListBean.getJsonlink();
        if (jsonlink != null ? !jsonlink.equals(jsonlink2) : jsonlink2 != null) {
            return false;
        }
        String localPath = getLocalPath();
        String localPath2 = giftListBean.getLocalPath();
        if (localPath != null ? !localPath.equals(localPath2) : localPath2 != null) {
            return false;
        }
        File cacheDir = getCacheDir();
        File cacheDir2 = giftListBean.getCacheDir();
        return cacheDir != null ? cacheDir.equals(cacheDir2) : cacheDir2 == null;
    }

    public File getCacheDir() {
        return this.CacheDir;
    }

    public Integer getGiftTag() {
        return this.giftTag;
    }

    public String getGifticon() {
        return this.gifticon;
    }

    public String getGiftname() {
        return this.giftname;
    }

    public Integer getId() {
        return this.f34838id;
    }

    public Integer getIsLuck() {
        return this.isLuck;
    }

    public Integer getIsplatgift() {
        return this.isplatgift;
    }

    public String getJsonlink() {
        return this.jsonlink;
    }

    public String getLocalPath() {
        return this.LocalPath;
    }

    public Integer getLucky() {
        return this.lucky;
    }

    public Integer getMark() {
        return this.mark;
    }

    public Integer getNeedcoin() {
        return this.needcoin;
    }

    public Integer getRewardCoins() {
        return this.rewardCoins;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getSwflink() {
        return this.swflink;
    }

    public Integer getSwftime() {
        return this.swftime;
    }

    public Integer getSwftype() {
        return this.swftype;
    }

    public String getTag() {
        return this.tag;
    }

    public int getTagId() {
        return this.tagId;
    }

    public Integer getType() {
        return this.type;
    }

    public int hashCode() {
        int tagId = ((getTagId() + 59) * 59) + (isSelected() ? 79 : 97);
        Integer id2 = getId();
        int iHashCode = (tagId * 59) + (id2 == null ? 43 : id2.hashCode());
        Integer mark = getMark();
        int iHashCode2 = (iHashCode * 59) + (mark == null ? 43 : mark.hashCode());
        Integer type = getType();
        int iHashCode3 = (iHashCode2 * 59) + (type == null ? 43 : type.hashCode());
        Integer needcoin = getNeedcoin();
        int iHashCode4 = (iHashCode3 * 59) + (needcoin == null ? 43 : needcoin.hashCode());
        Integer sort = getSort();
        int iHashCode5 = (iHashCode4 * 59) + (sort == null ? 43 : sort.hashCode());
        Integer swftype = getSwftype();
        int iHashCode6 = (iHashCode5 * 59) + (swftype == null ? 43 : swftype.hashCode());
        Integer swftime = getSwftime();
        int iHashCode7 = (iHashCode6 * 59) + (swftime == null ? 43 : swftime.hashCode());
        Integer isplatgift = getIsplatgift();
        int iHashCode8 = (iHashCode7 * 59) + (isplatgift == null ? 43 : isplatgift.hashCode());
        Integer isLuck = getIsLuck();
        int iHashCode9 = (iHashCode8 * 59) + (isLuck == null ? 43 : isLuck.hashCode());
        Integer status = getStatus();
        int iHashCode10 = (iHashCode9 * 59) + (status == null ? 43 : status.hashCode());
        Integer lucky = getLucky();
        int iHashCode11 = (iHashCode10 * 59) + (lucky == null ? 43 : lucky.hashCode());
        Integer rewardCoins = getRewardCoins();
        int iHashCode12 = (iHashCode11 * 59) + (rewardCoins == null ? 43 : rewardCoins.hashCode());
        Integer giftTag = getGiftTag();
        int iHashCode13 = (iHashCode12 * 59) + (giftTag == null ? 43 : giftTag.hashCode());
        String giftname = getGiftname();
        int iHashCode14 = (iHashCode13 * 59) + (giftname == null ? 43 : giftname.hashCode());
        String gifticon = getGifticon();
        int iHashCode15 = (iHashCode14 * 59) + (gifticon == null ? 43 : gifticon.hashCode());
        String tag = getTag();
        int iHashCode16 = (iHashCode15 * 59) + (tag == null ? 43 : tag.hashCode());
        String swflink = getSwflink();
        int iHashCode17 = (iHashCode16 * 59) + (swflink == null ? 43 : swflink.hashCode());
        String jsonlink = getJsonlink();
        int iHashCode18 = (iHashCode17 * 59) + (jsonlink == null ? 43 : jsonlink.hashCode());
        String localPath = getLocalPath();
        int iHashCode19 = (iHashCode18 * 59) + (localPath == null ? 43 : localPath.hashCode());
        File cacheDir = getCacheDir();
        return (iHashCode19 * 59) + (cacheDir != null ? cacheDir.hashCode() : 43);
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setCacheDir(File file) {
        this.CacheDir = file;
    }

    public void setGiftTag(Integer num) {
        this.giftTag = num;
    }

    public void setGifticon(String str) {
        this.gifticon = str;
    }

    public void setGiftname(String str) {
        this.giftname = str;
    }

    public void setId(Integer num) {
        this.f34838id = num;
    }

    public void setIsLuck(Integer num) {
        this.isLuck = num;
    }

    public void setIsplatgift(Integer num) {
        this.isplatgift = num;
    }

    public void setJsonlink(String str) {
        this.jsonlink = str;
    }

    public void setLocalPath(String str) {
        this.LocalPath = str;
    }

    public void setLucky(Integer num) {
        this.lucky = num;
    }

    public void setMark(Integer num) {
        this.mark = num;
    }

    public void setNeedcoin(Integer num) {
        this.needcoin = num;
    }

    public void setRewardCoins(Integer num) {
        this.rewardCoins = num;
    }

    public void setSelected(boolean z10) {
        this.isSelected = z10;
    }

    public void setSort(Integer num) {
        this.sort = num;
    }

    public void setStatus(Integer num) {
        this.status = num;
    }

    public void setSwflink(String str) {
        this.swflink = str;
    }

    public void setSwftime(Integer num) {
        this.swftime = num;
    }

    public void setSwftype(Integer num) {
        this.swftype = num;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setTagId(int i10) {
        this.tagId = i10;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public String toString() {
        return "GiftListBean(id=" + getId() + ", mark=" + getMark() + ", type=" + getType() + ", giftname=" + getGiftname() + ", needcoin=" + getNeedcoin() + ", gifticon=" + getGifticon() + ", tag=" + getTag() + ", tagId=" + getTagId() + ", sort=" + getSort() + ", swftype=" + getSwftype() + ", swflink=" + getSwflink() + ", swftime=" + getSwftime() + ", isplatgift=" + getIsplatgift() + ", jsonlink=" + getJsonlink() + ", LocalPath=" + getLocalPath() + ", isLuck=" + getIsLuck() + ", status=" + getStatus() + ", isSelected=" + isSelected() + ", CacheDir=" + getCacheDir() + ", lucky=" + getLucky() + ", rewardCoins=" + getRewardCoins() + ", giftTag=" + getGiftTag() + ")";
    }
}
