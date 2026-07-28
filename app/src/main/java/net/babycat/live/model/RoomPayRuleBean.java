package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RoomPayRuleBean {

    @SerializedName("code")
    private Integer code;

    @SerializedName("data")
    private DataDTO data;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private Integer time;

    public static class DataDTO {

        @SerializedName("list")
        private List<ListDTO> list;

        public static class ListDTO {

            @SerializedName("coin")
            private Integer coin;

            @SerializedName("coin_ios")
            private Integer coinIos;

            @SerializedName("coin_paypal")
            private Integer coinPaypal;

            @SerializedName("create_time")
            private String createTime;

            @SerializedName("give")
            private Integer give;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @SerializedName("id")
            private Integer f34891id;

            @SerializedName("select")
            private Boolean isSelect = Boolean.FALSE;

            @SerializedName("list_order")
            private Integer listOrder;

            @SerializedName("money")
            private String money;

            @SerializedName("name")
            private String name;

            @SerializedName("product_id")
            private String productId;

            @SerializedName("update_time")
            private Object updateTime;

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
                Integer coin = getCoin();
                Integer coin2 = listDTO.getCoin();
                if (coin != null ? !coin.equals(coin2) : coin2 != null) {
                    return false;
                }
                Integer coinIos = getCoinIos();
                Integer coinIos2 = listDTO.getCoinIos();
                if (coinIos != null ? !coinIos.equals(coinIos2) : coinIos2 != null) {
                    return false;
                }
                Integer give = getGive();
                Integer give2 = listDTO.getGive();
                if (give != null ? !give.equals(give2) : give2 != null) {
                    return false;
                }
                Integer listOrder = getListOrder();
                Integer listOrder2 = listDTO.getListOrder();
                if (listOrder != null ? !listOrder.equals(listOrder2) : listOrder2 != null) {
                    return false;
                }
                Integer coinPaypal = getCoinPaypal();
                Integer coinPaypal2 = listDTO.getCoinPaypal();
                if (coinPaypal != null ? !coinPaypal.equals(coinPaypal2) : coinPaypal2 != null) {
                    return false;
                }
                Boolean isSelect = getIsSelect();
                Boolean isSelect2 = listDTO.getIsSelect();
                if (isSelect != null ? !isSelect.equals(isSelect2) : isSelect2 != null) {
                    return false;
                }
                String name = getName();
                String name2 = listDTO.getName();
                if (name != null ? !name.equals(name2) : name2 != null) {
                    return false;
                }
                String money = getMoney();
                String money2 = listDTO.getMoney();
                if (money != null ? !money.equals(money2) : money2 != null) {
                    return false;
                }
                String productId = getProductId();
                String productId2 = listDTO.getProductId();
                if (productId != null ? !productId.equals(productId2) : productId2 != null) {
                    return false;
                }
                String createTime = getCreateTime();
                String createTime2 = listDTO.getCreateTime();
                if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
                    return false;
                }
                Object updateTime = getUpdateTime();
                Object updateTime2 = listDTO.getUpdateTime();
                return updateTime != null ? updateTime.equals(updateTime2) : updateTime2 == null;
            }

            public Integer getCoin() {
                return this.coin;
            }

            public Integer getCoinIos() {
                return this.coinIos;
            }

            public Integer getCoinPaypal() {
                return this.coinPaypal;
            }

            public String getCreateTime() {
                return this.createTime;
            }

            public Integer getGive() {
                return this.give;
            }

            public Integer getId() {
                return this.f34891id;
            }

            public Boolean getIsSelect() {
                return this.isSelect;
            }

            public Integer getListOrder() {
                return this.listOrder;
            }

            public String getMoney() {
                return this.money;
            }

            public String getName() {
                return this.name;
            }

            public String getProductId() {
                return this.productId;
            }

            public Object getUpdateTime() {
                return this.updateTime;
            }

            public int hashCode() {
                Integer id2 = getId();
                int iHashCode = id2 == null ? 43 : id2.hashCode();
                Integer coin = getCoin();
                int iHashCode2 = ((iHashCode + 59) * 59) + (coin == null ? 43 : coin.hashCode());
                Integer coinIos = getCoinIos();
                int iHashCode3 = (iHashCode2 * 59) + (coinIos == null ? 43 : coinIos.hashCode());
                Integer give = getGive();
                int iHashCode4 = (iHashCode3 * 59) + (give == null ? 43 : give.hashCode());
                Integer listOrder = getListOrder();
                int iHashCode5 = (iHashCode4 * 59) + (listOrder == null ? 43 : listOrder.hashCode());
                Integer coinPaypal = getCoinPaypal();
                int iHashCode6 = (iHashCode5 * 59) + (coinPaypal == null ? 43 : coinPaypal.hashCode());
                Boolean isSelect = getIsSelect();
                int iHashCode7 = (iHashCode6 * 59) + (isSelect == null ? 43 : isSelect.hashCode());
                String name = getName();
                int iHashCode8 = (iHashCode7 * 59) + (name == null ? 43 : name.hashCode());
                String money = getMoney();
                int iHashCode9 = (iHashCode8 * 59) + (money == null ? 43 : money.hashCode());
                String productId = getProductId();
                int iHashCode10 = (iHashCode9 * 59) + (productId == null ? 43 : productId.hashCode());
                String createTime = getCreateTime();
                int iHashCode11 = (iHashCode10 * 59) + (createTime == null ? 43 : createTime.hashCode());
                Object updateTime = getUpdateTime();
                return (iHashCode11 * 59) + (updateTime != null ? updateTime.hashCode() : 43);
            }

            public void setCoin(Integer num) {
                this.coin = num;
            }

            public void setCoinIos(Integer num) {
                this.coinIos = num;
            }

            public void setCoinPaypal(Integer num) {
                this.coinPaypal = num;
            }

            public void setCreateTime(String str) {
                this.createTime = str;
            }

            public void setGive(Integer num) {
                this.give = num;
            }

            public void setId(Integer num) {
                this.f34891id = num;
            }

            public void setIsSelect(Boolean bool) {
                this.isSelect = bool;
            }

            public void setListOrder(Integer num) {
                this.listOrder = num;
            }

            public void setMoney(String str) {
                this.money = str;
            }

            public void setName(String str) {
                this.name = str;
            }

            public void setProductId(String str) {
                this.productId = str;
            }

            public void setUpdateTime(Object obj) {
                this.updateTime = obj;
            }

            public String toString() {
                return "RoomPayRuleBean.DataDTO.ListDTO(id=" + getId() + ", name=" + getName() + ", coin=" + getCoin() + ", coinIos=" + getCoinIos() + ", money=" + getMoney() + ", productId=" + getProductId() + ", give=" + getGive() + ", listOrder=" + getListOrder() + ", coinPaypal=" + getCoinPaypal() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ", isSelect=" + getIsSelect() + ")";
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
            return "RoomPayRuleBean.DataDTO(list=" + getList() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof RoomPayRuleBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoomPayRuleBean)) {
            return false;
        }
        RoomPayRuleBean roomPayRuleBean = (RoomPayRuleBean) obj;
        if (!roomPayRuleBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = roomPayRuleBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = roomPayRuleBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = roomPayRuleBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = roomPayRuleBean.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    public Integer getCode() {
        return this.code;
    }

    public DataDTO getData() {
        return this.data;
    }

    public String getMsg() {
        return this.msg;
    }

    public Integer getTime() {
        return this.time;
    }

    public int hashCode() {
        Integer code = getCode();
        int iHashCode = code == null ? 43 : code.hashCode();
        Integer time = getTime();
        int iHashCode2 = ((iHashCode + 59) * 59) + (time == null ? 43 : time.hashCode());
        String msg = getMsg();
        int iHashCode3 = (iHashCode2 * 59) + (msg == null ? 43 : msg.hashCode());
        DataDTO data = getData();
        return (iHashCode3 * 59) + (data != null ? data.hashCode() : 43);
    }

    public void setCode(Integer num) {
        this.code = num;
    }

    public void setData(DataDTO dataDTO) {
        this.data = dataDTO;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setTime(Integer num) {
        this.time = num;
    }

    public String toString() {
        return "RoomPayRuleBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
