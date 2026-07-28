package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class StickersListBean {

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

        @SerializedName(o0.CATEGORY_MESSAGE)
        private String msg;

        public static class ListDTO {

            @SerializedName("create_time")
            private String createTime;

            @SerializedName("fileurl")
            private String fileurl;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @SerializedName("id")
            private Integer f34907id;

            @SerializedName("img")
            private String img;

            @SerializedName("is_selected")
            private boolean isSelected;

            @SerializedName("is_use")
            private Integer isUse;

            @SerializedName("name")
            private String name;

            @SerializedName("sort")
            private Integer sort;

            @SerializedName(o0.CATEGORY_STATUS)
            private Integer status;

            @SerializedName("type")
            private Integer type;

            @SerializedName("uid")
            private Integer uid;

            @SerializedName("view_img")
            private String viewImg;

            @SerializedName("vip_level")
            private Integer vipLevel;

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
                if (!listDTO.canEqual(this) || isSelected() != listDTO.isSelected()) {
                    return false;
                }
                Integer id2 = getId();
                Integer id3 = listDTO.getId();
                if (id2 != null ? !id2.equals(id3) : id3 != null) {
                    return false;
                }
                Integer uid = getUid();
                Integer uid2 = listDTO.getUid();
                if (uid != null ? !uid.equals(uid2) : uid2 != null) {
                    return false;
                }
                Integer type = getType();
                Integer type2 = listDTO.getType();
                if (type != null ? !type.equals(type2) : type2 != null) {
                    return false;
                }
                Integer vipLevel = getVipLevel();
                Integer vipLevel2 = listDTO.getVipLevel();
                if (vipLevel != null ? !vipLevel.equals(vipLevel2) : vipLevel2 != null) {
                    return false;
                }
                Integer status = getStatus();
                Integer status2 = listDTO.getStatus();
                if (status != null ? !status.equals(status2) : status2 != null) {
                    return false;
                }
                Integer sort = getSort();
                Integer sort2 = listDTO.getSort();
                if (sort != null ? !sort.equals(sort2) : sort2 != null) {
                    return false;
                }
                Integer isUse = getIsUse();
                Integer isUse2 = listDTO.getIsUse();
                if (isUse != null ? !isUse.equals(isUse2) : isUse2 != null) {
                    return false;
                }
                String name = getName();
                String name2 = listDTO.getName();
                if (name != null ? !name.equals(name2) : name2 != null) {
                    return false;
                }
                String img = getImg();
                String img2 = listDTO.getImg();
                if (img != null ? !img.equals(img2) : img2 != null) {
                    return false;
                }
                String viewImg = getViewImg();
                String viewImg2 = listDTO.getViewImg();
                if (viewImg != null ? !viewImg.equals(viewImg2) : viewImg2 != null) {
                    return false;
                }
                String fileurl = getFileurl();
                String fileurl2 = listDTO.getFileurl();
                if (fileurl != null ? !fileurl.equals(fileurl2) : fileurl2 != null) {
                    return false;
                }
                String createTime = getCreateTime();
                String createTime2 = listDTO.getCreateTime();
                return createTime != null ? createTime.equals(createTime2) : createTime2 == null;
            }

            public String getCreateTime() {
                return this.createTime;
            }

            public String getFileurl() {
                return this.fileurl;
            }

            public Integer getId() {
                return this.f34907id;
            }

            public String getImg() {
                return this.img;
            }

            public Integer getIsUse() {
                return this.isUse;
            }

            public String getName() {
                return this.name;
            }

            public Integer getSort() {
                return this.sort;
            }

            public Integer getStatus() {
                return this.status;
            }

            public Integer getType() {
                return this.type;
            }

            public Integer getUid() {
                return this.uid;
            }

            public String getViewImg() {
                return this.viewImg;
            }

            public Integer getVipLevel() {
                return this.vipLevel;
            }

            public int hashCode() {
                int i10 = isSelected() ? 79 : 97;
                Integer id2 = getId();
                int iHashCode = ((i10 + 59) * 59) + (id2 == null ? 43 : id2.hashCode());
                Integer uid = getUid();
                int iHashCode2 = (iHashCode * 59) + (uid == null ? 43 : uid.hashCode());
                Integer type = getType();
                int iHashCode3 = (iHashCode2 * 59) + (type == null ? 43 : type.hashCode());
                Integer vipLevel = getVipLevel();
                int iHashCode4 = (iHashCode3 * 59) + (vipLevel == null ? 43 : vipLevel.hashCode());
                Integer status = getStatus();
                int iHashCode5 = (iHashCode4 * 59) + (status == null ? 43 : status.hashCode());
                Integer sort = getSort();
                int iHashCode6 = (iHashCode5 * 59) + (sort == null ? 43 : sort.hashCode());
                Integer isUse = getIsUse();
                int iHashCode7 = (iHashCode6 * 59) + (isUse == null ? 43 : isUse.hashCode());
                String name = getName();
                int iHashCode8 = (iHashCode7 * 59) + (name == null ? 43 : name.hashCode());
                String img = getImg();
                int iHashCode9 = (iHashCode8 * 59) + (img == null ? 43 : img.hashCode());
                String viewImg = getViewImg();
                int iHashCode10 = (iHashCode9 * 59) + (viewImg == null ? 43 : viewImg.hashCode());
                String fileurl = getFileurl();
                int iHashCode11 = (iHashCode10 * 59) + (fileurl == null ? 43 : fileurl.hashCode());
                String createTime = getCreateTime();
                return (iHashCode11 * 59) + (createTime != null ? createTime.hashCode() : 43);
            }

            public boolean isSelected() {
                return this.isSelected;
            }

            public void setCreateTime(String str) {
                this.createTime = str;
            }

            public void setFileurl(String str) {
                this.fileurl = str;
            }

            public void setId(Integer num) {
                this.f34907id = num;
            }

            public void setImg(String str) {
                this.img = str;
            }

            public void setIsUse(Integer num) {
                this.isUse = num;
            }

            public void setName(String str) {
                this.name = str;
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

            public void setType(Integer num) {
                this.type = num;
            }

            public void setUid(Integer num) {
                this.uid = num;
            }

            public void setViewImg(String str) {
                this.viewImg = str;
            }

            public void setVipLevel(Integer num) {
                this.vipLevel = num;
            }

            public String toString() {
                return "StickersListBean.DataDTO.ListDTO(id=" + getId() + ", name=" + getName() + ", img=" + getImg() + ", viewImg=" + getViewImg() + ", fileurl=" + getFileurl() + ", uid=" + getUid() + ", type=" + getType() + ", vipLevel=" + getVipLevel() + ", status=" + getStatus() + ", sort=" + getSort() + ", isUse=" + getIsUse() + ", createTime=" + getCreateTime() + ", isSelected=" + isSelected() + ")";
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
            if (list != null ? !list.equals(list2) : list2 != null) {
                return false;
            }
            String msg = getMsg();
            String msg2 = dataDTO.getMsg();
            return msg != null ? msg.equals(msg2) : msg2 == null;
        }

        public List<ListDTO> getList() {
            return this.list;
        }

        public String getMsg() {
            return this.msg;
        }

        public int hashCode() {
            List<ListDTO> list = getList();
            int iHashCode = list == null ? 43 : list.hashCode();
            String msg = getMsg();
            return ((iHashCode + 59) * 59) + (msg != null ? msg.hashCode() : 43);
        }

        public void setList(List<ListDTO> list) {
            this.list = list;
        }

        public void setMsg(String str) {
            this.msg = str;
        }

        public String toString() {
            return "StickersListBean.DataDTO(list=" + getList() + ", msg=" + getMsg() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof StickersListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StickersListBean)) {
            return false;
        }
        StickersListBean stickersListBean = (StickersListBean) obj;
        if (!stickersListBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = stickersListBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = stickersListBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        Integer total = getTotal();
        Integer total2 = stickersListBean.getTotal();
        if (total != null ? !total.equals(total2) : total2 != null) {
            return false;
        }
        Boolean hasmore = getHasmore();
        Boolean hasmore2 = stickersListBean.getHasmore();
        if (hasmore != null ? !hasmore.equals(hasmore2) : hasmore2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = stickersListBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = stickersListBean.getData();
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
        return "StickersListBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ", total=" + getTotal() + ", hasmore=" + getHasmore() + ")";
    }
}
