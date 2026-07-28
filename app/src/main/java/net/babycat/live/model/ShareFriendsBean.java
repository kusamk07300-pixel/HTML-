package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ShareFriendsBean {

    @SerializedName("code")
    private Integer code;

    @SerializedName("data")
    private DataDTO data;

    @SerializedName("hasmore")
    private boolean hasmore;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private Integer time;

    public static class DataDTO {

        @SerializedName("list")
        private List<ChatFriendsBean> list;

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
            List<ChatFriendsBean> list = getList();
            List<ChatFriendsBean> list2 = dataDTO.getList();
            return list != null ? list.equals(list2) : list2 == null;
        }

        public List<ChatFriendsBean> getList() {
            return this.list;
        }

        public int hashCode() {
            List<ChatFriendsBean> list = getList();
            return 59 + (list == null ? 43 : list.hashCode());
        }

        public void setList(List<ChatFriendsBean> list) {
            this.list = list;
        }

        public String toString() {
            return "ShareFriendsBean.DataDTO(list=" + getList() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof ShareFriendsBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShareFriendsBean)) {
            return false;
        }
        ShareFriendsBean shareFriendsBean = (ShareFriendsBean) obj;
        if (!shareFriendsBean.canEqual(this) || isHasmore() != shareFriendsBean.isHasmore()) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = shareFriendsBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = shareFriendsBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = shareFriendsBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = shareFriendsBean.getData();
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
        int i10 = isHasmore() ? 79 : 97;
        Integer code = getCode();
        int iHashCode = ((i10 + 59) * 59) + (code == null ? 43 : code.hashCode());
        Integer time = getTime();
        int iHashCode2 = (iHashCode * 59) + (time == null ? 43 : time.hashCode());
        String msg = getMsg();
        int iHashCode3 = (iHashCode2 * 59) + (msg == null ? 43 : msg.hashCode());
        DataDTO data = getData();
        return (iHashCode3 * 59) + (data != null ? data.hashCode() : 43);
    }

    public boolean isHasmore() {
        return this.hasmore;
    }

    public void setCode(Integer num) {
        this.code = num;
    }

    public void setData(DataDTO dataDTO) {
        this.data = dataDTO;
    }

    public void setHasmore(boolean z10) {
        this.hasmore = z10;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setTime(Integer num) {
        this.time = num;
    }

    public String toString() {
        return "ShareFriendsBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ", hasmore=" + isHasmore() + ")";
    }
}
