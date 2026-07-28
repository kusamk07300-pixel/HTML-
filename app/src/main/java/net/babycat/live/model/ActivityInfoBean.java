package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;

/* JADX INFO: loaded from: classes4.dex */
public class ActivityInfoBean {

    @SerializedName("code")
    private Integer code;

    @SerializedName("data")
    private DataDTO data;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private Integer time;

    public static class DataDTO {

        @SerializedName("desc")
        private String desc;

        @SerializedName("end_time")
        private Integer endTime;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34793id;

        @SerializedName("image")
        private String image;

        @SerializedName("name")
        private String name;

        @SerializedName("start_time")
        private Integer startTime;

        @SerializedName("target")
        private Integer target;

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
            Integer startTime = getStartTime();
            Integer startTime2 = dataDTO.getStartTime();
            if (startTime != null ? !startTime.equals(startTime2) : startTime2 != null) {
                return false;
            }
            Integer endTime = getEndTime();
            Integer endTime2 = dataDTO.getEndTime();
            if (endTime != null ? !endTime.equals(endTime2) : endTime2 != null) {
                return false;
            }
            Integer target = getTarget();
            Integer target2 = dataDTO.getTarget();
            if (target != null ? !target.equals(target2) : target2 != null) {
                return false;
            }
            String name = getName();
            String name2 = dataDTO.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String image = getImage();
            String image2 = dataDTO.getImage();
            if (image != null ? !image.equals(image2) : image2 != null) {
                return false;
            }
            String desc = getDesc();
            String desc2 = dataDTO.getDesc();
            return desc != null ? desc.equals(desc2) : desc2 == null;
        }

        public String getDesc() {
            return this.desc;
        }

        public Integer getEndTime() {
            return this.endTime;
        }

        public Integer getId() {
            return this.f34793id;
        }

        public String getImage() {
            return this.image;
        }

        public String getName() {
            return this.name;
        }

        public Integer getStartTime() {
            return this.startTime;
        }

        public Integer getTarget() {
            return this.target;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer startTime = getStartTime();
            int iHashCode2 = ((iHashCode + 59) * 59) + (startTime == null ? 43 : startTime.hashCode());
            Integer endTime = getEndTime();
            int iHashCode3 = (iHashCode2 * 59) + (endTime == null ? 43 : endTime.hashCode());
            Integer target = getTarget();
            int iHashCode4 = (iHashCode3 * 59) + (target == null ? 43 : target.hashCode());
            String name = getName();
            int iHashCode5 = (iHashCode4 * 59) + (name == null ? 43 : name.hashCode());
            String image = getImage();
            int iHashCode6 = (iHashCode5 * 59) + (image == null ? 43 : image.hashCode());
            String desc = getDesc();
            return (iHashCode6 * 59) + (desc != null ? desc.hashCode() : 43);
        }

        public void setDesc(String str) {
            this.desc = str;
        }

        public void setEndTime(Integer num) {
            this.endTime = num;
        }

        public void setId(Integer num) {
            this.f34793id = num;
        }

        public void setImage(String str) {
            this.image = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setStartTime(Integer num) {
            this.startTime = num;
        }

        public void setTarget(Integer num) {
            this.target = num;
        }

        public String toString() {
            return "ActivityInfoBean.DataDTO(id=" + getId() + ", name=" + getName() + ", startTime=" + getStartTime() + ", endTime=" + getEndTime() + ", image=" + getImage() + ", desc=" + getDesc() + ", target=" + getTarget() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof ActivityInfoBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivityInfoBean)) {
            return false;
        }
        ActivityInfoBean activityInfoBean = (ActivityInfoBean) obj;
        if (!activityInfoBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = activityInfoBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = activityInfoBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = activityInfoBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = activityInfoBean.getData();
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
        return "ActivityInfoBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
