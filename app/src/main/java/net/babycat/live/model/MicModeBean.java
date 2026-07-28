package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class MicModeBean {

    @SerializedName("code")
    private Integer code;

    @SerializedName("data")
    private List<DataDTO> data;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private Integer time;

    public static class DataDTO {

        @SerializedName("cover")
        private String cover;

        @SerializedName("create_time")
        private String createTime;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34863id;

        @SerializedName("is_pk")
        private Integer isPk;

        @SerializedName("is_select")
        private Integer isSelect;

        @SerializedName("mic_num")
        private Integer micNum;

        @SerializedName("name")
        private String name;

        @SerializedName("update_time")
        private String updateTime;

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
            Integer id2 = getId();
            Integer id3 = dataDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            Integer micNum = getMicNum();
            Integer micNum2 = dataDTO.getMicNum();
            if (micNum != null ? !micNum.equals(micNum2) : micNum2 != null) {
                return false;
            }
            Integer isPk = getIsPk();
            Integer isPk2 = dataDTO.getIsPk();
            if (isPk != null ? !isPk.equals(isPk2) : isPk2 != null) {
                return false;
            }
            Integer isSelect = getIsSelect();
            Integer isSelect2 = dataDTO.getIsSelect();
            if (isSelect != null ? !isSelect.equals(isSelect2) : isSelect2 != null) {
                return false;
            }
            String cover = getCover();
            String cover2 = dataDTO.getCover();
            if (cover != null ? !cover.equals(cover2) : cover2 != null) {
                return false;
            }
            String name = getName();
            String name2 = dataDTO.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String createTime = getCreateTime();
            String createTime2 = dataDTO.getCreateTime();
            if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
                return false;
            }
            String updateTime = getUpdateTime();
            String updateTime2 = dataDTO.getUpdateTime();
            return updateTime != null ? updateTime.equals(updateTime2) : updateTime2 == null;
        }

        public String getCover() {
            return this.cover;
        }

        public String getCreateTime() {
            return this.createTime;
        }

        public Integer getId() {
            return this.f34863id;
        }

        public Integer getIsPk() {
            return this.isPk;
        }

        public Integer getIsSelect() {
            return this.isSelect;
        }

        public Integer getMicNum() {
            return this.micNum;
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
            Integer micNum = getMicNum();
            int iHashCode2 = ((iHashCode + 59) * 59) + (micNum == null ? 43 : micNum.hashCode());
            Integer isPk = getIsPk();
            int iHashCode3 = (iHashCode2 * 59) + (isPk == null ? 43 : isPk.hashCode());
            Integer isSelect = getIsSelect();
            int iHashCode4 = (iHashCode3 * 59) + (isSelect == null ? 43 : isSelect.hashCode());
            String cover = getCover();
            int iHashCode5 = (iHashCode4 * 59) + (cover == null ? 43 : cover.hashCode());
            String name = getName();
            int iHashCode6 = (iHashCode5 * 59) + (name == null ? 43 : name.hashCode());
            String createTime = getCreateTime();
            int iHashCode7 = (iHashCode6 * 59) + (createTime == null ? 43 : createTime.hashCode());
            String updateTime = getUpdateTime();
            return (iHashCode7 * 59) + (updateTime != null ? updateTime.hashCode() : 43);
        }

        public void setCover(String str) {
            this.cover = str;
        }

        public void setCreateTime(String str) {
            this.createTime = str;
        }

        public void setId(Integer num) {
            this.f34863id = num;
        }

        public void setIsPk(Integer num) {
            this.isPk = num;
        }

        public void setIsSelect(Integer num) {
            this.isSelect = num;
        }

        public void setMicNum(Integer num) {
            this.micNum = num;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setUpdateTime(String str) {
            this.updateTime = str;
        }

        public String toString() {
            return "MicModeBean.DataDTO(id=" + getId() + ", micNum=" + getMicNum() + ", isPk=" + getIsPk() + ", cover=" + getCover() + ", name=" + getName() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ", isSelect=" + getIsSelect() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof MicModeBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MicModeBean)) {
            return false;
        }
        MicModeBean micModeBean = (MicModeBean) obj;
        if (!micModeBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = micModeBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = micModeBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = micModeBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        List<DataDTO> data = getData();
        List<DataDTO> data2 = micModeBean.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    public Integer getCode() {
        return this.code;
    }

    public List<DataDTO> getData() {
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
        List<DataDTO> data = getData();
        return (iHashCode3 * 59) + (data != null ? data.hashCode() : 43);
    }

    public void setCode(Integer num) {
        this.code = num;
    }

    public void setData(List<DataDTO> list) {
        this.data = list;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setTime(Integer num) {
        this.time = num;
    }

    public String toString() {
        return "MicModeBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
