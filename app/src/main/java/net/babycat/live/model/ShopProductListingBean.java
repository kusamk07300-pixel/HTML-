package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ShopProductListingBean {

    @SerializedName("code")
    private Integer code;

    @SerializedName("data")
    private DataDTO data;

    @SerializedName("hasmore")
    private Boolean hasmore;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private Integer time;

    @SerializedName("total")
    private Integer total;

    public static class DataDTO {

        @SerializedName("list")
        private List<ShopGoodsListBean> list;

        public boolean canEqual(Object obj) {
            return obj instanceof DataDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DataDTO)) {
                return false;
            }
            DataDTO dataDTO = (DataDTO) obj;
            if (!dataDTO.canEqual(this)) {
                return false;
            }
            List<ShopGoodsListBean> list = getList();
            List<ShopGoodsListBean> list2 = dataDTO.getList();
            return list != null ? list.equals(list2) : list2 == null;
        }

        public List<ShopGoodsListBean> getList() {
            return this.list;
        }

        public int hashCode() {
            List<ShopGoodsListBean> list = getList();
            return 59 + (list == null ? 43 : list.hashCode());
        }

        public void setList(List<ShopGoodsListBean> list) {
            this.list = list;
        }

        public String toString() {
            return "ShopProductListingBean.DataDTO(list=" + getList() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof ShopProductListingBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShopProductListingBean)) {
            return false;
        }
        ShopProductListingBean shopProductListingBean = (ShopProductListingBean) obj;
        if (!shopProductListingBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = shopProductListingBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = shopProductListingBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        Integer total = getTotal();
        Integer total2 = shopProductListingBean.getTotal();
        if (total != null ? !total.equals(total2) : total2 != null) {
            return false;
        }
        Boolean hasmore = getHasmore();
        Boolean hasmore2 = shopProductListingBean.getHasmore();
        if (hasmore != null ? !hasmore.equals(hasmore2) : hasmore2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = shopProductListingBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = shopProductListingBean.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    public Integer getCode() {
        return this.code;
    }

    public DataDTO getData() {
        return this.data;
    }

    public Boolean getHasmore() {
        return this.hasmore;
    }

    public String getMsg() {
        return this.msg;
    }

    public Integer getTime() {
        return this.time;
    }

    public Integer getTotal() {
        return this.total;
    }

    public int hashCode() {
        Integer code = getCode();
        int iHashCode = code == null ? 43 : code.hashCode();
        Integer time = getTime();
        int iHashCode2 = ((iHashCode + 59) * 59) + (time == null ? 43 : time.hashCode());
        Integer total = getTotal();
        int iHashCode3 = (iHashCode2 * 59) + (total == null ? 43 : total.hashCode());
        Boolean hasmore = getHasmore();
        int iHashCode4 = (iHashCode3 * 59) + (hasmore == null ? 43 : hasmore.hashCode());
        String msg = getMsg();
        int iHashCode5 = (iHashCode4 * 59) + (msg == null ? 43 : msg.hashCode());
        DataDTO data = getData();
        return (iHashCode5 * 59) + (data != null ? data.hashCode() : 43);
    }

    public void setCode(Integer num) {
        this.code = num;
    }

    public void setData(DataDTO dataDTO) {
        this.data = dataDTO;
    }

    public void setHasmore(Boolean bool) {
        this.hasmore = bool;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setTime(Integer num) {
        this.time = num;
    }

    public void setTotal(Integer num) {
        this.total = num;
    }

    public String toString() {
        return "ShopProductListingBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ", total=" + getTotal() + ", hasmore=" + getHasmore() + ")";
    }
}
