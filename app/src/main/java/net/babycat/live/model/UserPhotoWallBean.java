package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class UserPhotoWallBean {

    @SerializedName("code")
    private Integer code;

    @SerializedName("data")
    private DataDTO data;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    public static class DataDTO {

        @SerializedName("list")
        private List<SlideBean> list;

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
            List<SlideBean> list = getList();
            List<SlideBean> list2 = dataDTO.getList();
            return list != null ? list.equals(list2) : list2 == null;
        }

        public List<SlideBean> getList() {
            return this.list;
        }

        public int hashCode() {
            List<SlideBean> list = getList();
            return 59 + (list == null ? 43 : list.hashCode());
        }

        public void setList(List<SlideBean> list) {
            this.list = list;
        }

        public String toString() {
            return "UserPhotoWallBean.DataDTO(list=" + getList() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof UserPhotoWallBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserPhotoWallBean)) {
            return false;
        }
        UserPhotoWallBean userPhotoWallBean = (UserPhotoWallBean) obj;
        if (!userPhotoWallBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = userPhotoWallBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = userPhotoWallBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = userPhotoWallBean.getData();
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

    public int hashCode() {
        Integer code = getCode();
        int iHashCode = code == null ? 43 : code.hashCode();
        String msg = getMsg();
        int iHashCode2 = ((iHashCode + 59) * 59) + (msg == null ? 43 : msg.hashCode());
        DataDTO data = getData();
        return (iHashCode2 * 59) + (data != null ? data.hashCode() : 43);
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

    public String toString() {
        return "UserPhotoWallBean(msg=" + getMsg() + ", code=" + getCode() + ", data=" + getData() + ")";
    }
}
