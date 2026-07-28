package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ShopLiveListBean {

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
        private List<ListDTO> list;

        public static class ListDTO {

            @SerializedName("create_time")
            private String createTime;

            @SerializedName("goods_id")
            private Integer goodsId;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @SerializedName("id")
            private Integer f34899id;

            @SerializedName("images")
            private String images;

            @SerializedName("original_price")
            private String originalPrice;

            @SerializedName("price")
            private String price;

            @SerializedName("room_id")
            private Integer roomId;

            @SerializedName("serial_number")
            private Integer serialNumber;

            @SerializedName(o0.CATEGORY_STATUS)
            private Integer status;

            @SerializedName("title")
            private String title;

            @SerializedName("update_time")
            private String updateTime;

            @SerializedName("user_id")
            private Integer userId;

            public boolean canEqual(Object obj) {
                return obj instanceof ListDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ListDTO)) {
                    return false;
                }
                ListDTO listDTO = (ListDTO) obj;
                if (!listDTO.canEqual(this)) {
                    return false;
                }
                Integer id2 = getId();
                Integer id3 = listDTO.getId();
                if (id2 != null ? !id2.equals(id3) : id3 != null) {
                    return false;
                }
                Integer roomId = getRoomId();
                Integer roomId2 = listDTO.getRoomId();
                if (roomId != null ? !roomId.equals(roomId2) : roomId2 != null) {
                    return false;
                }
                Integer userId = getUserId();
                Integer userId2 = listDTO.getUserId();
                if (userId != null ? !userId.equals(userId2) : userId2 != null) {
                    return false;
                }
                Integer goodsId = getGoodsId();
                Integer goodsId2 = listDTO.getGoodsId();
                if (goodsId != null ? !goodsId.equals(goodsId2) : goodsId2 != null) {
                    return false;
                }
                Integer serialNumber = getSerialNumber();
                Integer serialNumber2 = listDTO.getSerialNumber();
                if (serialNumber != null ? !serialNumber.equals(serialNumber2) : serialNumber2 != null) {
                    return false;
                }
                Integer status = getStatus();
                Integer status2 = listDTO.getStatus();
                if (status != null ? !status.equals(status2) : status2 != null) {
                    return false;
                }
                String title = getTitle();
                String title2 = listDTO.getTitle();
                if (title != null ? !title.equals(title2) : title2 != null) {
                    return false;
                }
                String images = getImages();
                String images2 = listDTO.getImages();
                if (images != null ? !images.equals(images2) : images2 != null) {
                    return false;
                }
                String originalPrice = getOriginalPrice();
                String originalPrice2 = listDTO.getOriginalPrice();
                if (originalPrice != null ? !originalPrice.equals(originalPrice2) : originalPrice2 != null) {
                    return false;
                }
                String price = getPrice();
                String price2 = listDTO.getPrice();
                if (price != null ? !price.equals(price2) : price2 != null) {
                    return false;
                }
                String createTime = getCreateTime();
                String createTime2 = listDTO.getCreateTime();
                if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
                    return false;
                }
                String updateTime = getUpdateTime();
                String updateTime2 = listDTO.getUpdateTime();
                return updateTime != null ? updateTime.equals(updateTime2) : updateTime2 == null;
            }

            public String getCreateTime() {
                return this.createTime;
            }

            public Integer getGoodsId() {
                return this.goodsId;
            }

            public Integer getId() {
                return this.f34899id;
            }

            public String getImages() {
                return this.images;
            }

            public String getOriginalPrice() {
                return this.originalPrice;
            }

            public String getPrice() {
                return this.price;
            }

            public Integer getRoomId() {
                return this.roomId;
            }

            public Integer getSerialNumber() {
                return this.serialNumber;
            }

            public Integer getStatus() {
                return this.status;
            }

            public String getTitle() {
                return this.title;
            }

            public String getUpdateTime() {
                return this.updateTime;
            }

            public Integer getUserId() {
                return this.userId;
            }

            public int hashCode() {
                Integer id2 = getId();
                int iHashCode = id2 == null ? 43 : id2.hashCode();
                Integer roomId = getRoomId();
                int iHashCode2 = ((iHashCode + 59) * 59) + (roomId == null ? 43 : roomId.hashCode());
                Integer userId = getUserId();
                int iHashCode3 = (iHashCode2 * 59) + (userId == null ? 43 : userId.hashCode());
                Integer goodsId = getGoodsId();
                int iHashCode4 = (iHashCode3 * 59) + (goodsId == null ? 43 : goodsId.hashCode());
                Integer serialNumber = getSerialNumber();
                int iHashCode5 = (iHashCode4 * 59) + (serialNumber == null ? 43 : serialNumber.hashCode());
                Integer status = getStatus();
                int iHashCode6 = (iHashCode5 * 59) + (status == null ? 43 : status.hashCode());
                String title = getTitle();
                int iHashCode7 = (iHashCode6 * 59) + (title == null ? 43 : title.hashCode());
                String images = getImages();
                int iHashCode8 = (iHashCode7 * 59) + (images == null ? 43 : images.hashCode());
                String originalPrice = getOriginalPrice();
                int iHashCode9 = (iHashCode8 * 59) + (originalPrice == null ? 43 : originalPrice.hashCode());
                String price = getPrice();
                int iHashCode10 = (iHashCode9 * 59) + (price == null ? 43 : price.hashCode());
                String createTime = getCreateTime();
                int iHashCode11 = (iHashCode10 * 59) + (createTime == null ? 43 : createTime.hashCode());
                String updateTime = getUpdateTime();
                return (iHashCode11 * 59) + (updateTime != null ? updateTime.hashCode() : 43);
            }

            public void setCreateTime(String str) {
                this.createTime = str;
            }

            public void setGoodsId(Integer num) {
                this.goodsId = num;
            }

            public void setId(Integer num) {
                this.f34899id = num;
            }

            public void setImages(String str) {
                this.images = str;
            }

            public void setOriginalPrice(String str) {
                this.originalPrice = str;
            }

            public void setPrice(String str) {
                this.price = str;
            }

            public void setRoomId(Integer num) {
                this.roomId = num;
            }

            public void setSerialNumber(Integer num) {
                this.serialNumber = num;
            }

            public void setStatus(Integer num) {
                this.status = num;
            }

            public void setTitle(String str) {
                this.title = str;
            }

            public void setUpdateTime(String str) {
                this.updateTime = str;
            }

            public void setUserId(Integer num) {
                this.userId = num;
            }

            public String toString() {
                return "ShopLiveListBean.DataDTO.ListDTO(id=" + getId() + ", roomId=" + getRoomId() + ", userId=" + getUserId() + ", goodsId=" + getGoodsId() + ", title=" + getTitle() + ", images=" + getImages() + ", originalPrice=" + getOriginalPrice() + ", price=" + getPrice() + ", serialNumber=" + getSerialNumber() + ", status=" + getStatus() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ")";
            }
        }

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
            List<ListDTO> list = getList();
            List<ListDTO> list2 = dataDTO.getList();
            return list != null ? list.equals(list2) : list2 == null;
        }

        public List<ListDTO> getList() {
            return this.list;
        }

        public int hashCode() {
            List<ListDTO> list = getList();
            return 59 + (list == null ? 43 : list.hashCode());
        }

        public void setList(List<ListDTO> list) {
            this.list = list;
        }

        public String toString() {
            return "ShopLiveListBean.DataDTO(list=" + getList() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof ShopLiveListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShopLiveListBean)) {
            return false;
        }
        ShopLiveListBean shopLiveListBean = (ShopLiveListBean) obj;
        if (!shopLiveListBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = shopLiveListBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = shopLiveListBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        Integer total = getTotal();
        Integer total2 = shopLiveListBean.getTotal();
        if (total != null ? !total.equals(total2) : total2 != null) {
            return false;
        }
        Boolean hasmore = getHasmore();
        Boolean hasmore2 = shopLiveListBean.getHasmore();
        if (hasmore != null ? !hasmore.equals(hasmore2) : hasmore2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = shopLiveListBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = shopLiveListBean.getData();
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
        return "ShopLiveListBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ", total=" + getTotal() + ", hasmore=" + getHasmore() + ")";
    }
}
