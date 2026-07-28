package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RoomPayTypeBean {

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

            @SerializedName("icon")
            private String icon;

            @SerializedName("select")
            private Boolean isSelect = Boolean.FALSE;

            @SerializedName("name")
            private String name;

            @SerializedName("type")
            private String type;

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
                String icon = getIcon();
                String icon2 = listDTO.getIcon();
                if (icon != null ? !icon.equals(icon2) : icon2 != null) {
                    return false;
                }
                String type = getType();
                String type2 = listDTO.getType();
                return type != null ? type.equals(type2) : type2 == null;
            }

            public String getIcon() {
                return this.icon;
            }

            public Boolean getIsSelect() {
                return this.isSelect;
            }

            public String getName() {
                return this.name;
            }

            public String getType() {
                return this.type;
            }

            public int hashCode() {
                Boolean isSelect = getIsSelect();
                int iHashCode = isSelect == null ? 43 : isSelect.hashCode();
                String name = getName();
                int iHashCode2 = ((iHashCode + 59) * 59) + (name == null ? 43 : name.hashCode());
                String icon = getIcon();
                int iHashCode3 = (iHashCode2 * 59) + (icon == null ? 43 : icon.hashCode());
                String type = getType();
                return (iHashCode3 * 59) + (type != null ? type.hashCode() : 43);
            }

            public void setIcon(String str) {
                this.icon = str;
            }

            public void setIsSelect(Boolean bool) {
                this.isSelect = bool;
            }

            public void setName(String str) {
                this.name = str;
            }

            public void setType(String str) {
                this.type = str;
            }

            public String toString() {
                return "RoomPayTypeBean.DataDTO.ListDTO(name=" + getName() + ", icon=" + getIcon() + ", type=" + getType() + ", isSelect=" + getIsSelect() + ")";
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
            return "RoomPayTypeBean.DataDTO(list=" + getList() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof RoomPayTypeBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoomPayTypeBean)) {
            return false;
        }
        RoomPayTypeBean roomPayTypeBean = (RoomPayTypeBean) obj;
        if (!roomPayTypeBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = roomPayTypeBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = roomPayTypeBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = roomPayTypeBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = roomPayTypeBean.getData();
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
        return "RoomPayTypeBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
