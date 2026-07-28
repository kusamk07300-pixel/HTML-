package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class GiftInteractListBean {

    @SerializedName("code")
    private int code;

    @SerializedName("data")
    private DataDTO data;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private long time;

    public static class DataDTO {

        @SerializedName("desc")
        private String desc;

        @SerializedName("list")
        private List<GiftInteractBean> list;

        @SerializedName(o0.CATEGORY_STATUS)
        private int status;

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
            if (!dataDTO.canEqual(this) || getStatus() != dataDTO.getStatus()) {
                return false;
            }
            String desc = getDesc();
            String desc2 = dataDTO.getDesc();
            if (desc != null ? !desc.equals(desc2) : desc2 != null) {
                return false;
            }
            List<GiftInteractBean> list = getList();
            List<GiftInteractBean> list2 = dataDTO.getList();
            return list != null ? list.equals(list2) : list2 == null;
        }

        public String getDesc() {
            return this.desc;
        }

        public List<GiftInteractBean> getList() {
            return this.list;
        }

        public int getStatus() {
            return this.status;
        }

        public int hashCode() {
            int status = getStatus() + 59;
            String desc = getDesc();
            int iHashCode = (status * 59) + (desc == null ? 43 : desc.hashCode());
            List<GiftInteractBean> list = getList();
            return (iHashCode * 59) + (list != null ? list.hashCode() : 43);
        }

        public void setDesc(String str) {
            this.desc = str;
        }

        public void setList(List<GiftInteractBean> list) {
            this.list = list;
        }

        public void setStatus(int i10) {
            this.status = i10;
        }

        public String toString() {
            return "GiftInteractListBean.DataDTO(status=" + getStatus() + ", desc=" + getDesc() + ", list=" + getList() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof GiftInteractListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftInteractListBean)) {
            return false;
        }
        GiftInteractListBean giftInteractListBean = (GiftInteractListBean) obj;
        if (!giftInteractListBean.canEqual(this) || getCode() != giftInteractListBean.getCode() || getTime() != giftInteractListBean.getTime()) {
            return false;
        }
        String msg = getMsg();
        String msg2 = giftInteractListBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = giftInteractListBean.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    public int getCode() {
        return this.code;
    }

    public DataDTO getData() {
        return this.data;
    }

    public String getMsg() {
        return this.msg;
    }

    public long getTime() {
        return this.time;
    }

    public int hashCode() {
        int code = getCode() + 59;
        long time = getTime();
        int i10 = (code * 59) + ((int) (time ^ (time >>> 32)));
        String msg = getMsg();
        int iHashCode = (i10 * 59) + (msg == null ? 43 : msg.hashCode());
        DataDTO data = getData();
        return (iHashCode * 59) + (data != null ? data.hashCode() : 43);
    }

    public void setCode(int i10) {
        this.code = i10;
    }

    public void setData(DataDTO dataDTO) {
        this.data = dataDTO;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setTime(long j10) {
        this.time = j10;
    }

    public String toString() {
        return "GiftInteractListBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
