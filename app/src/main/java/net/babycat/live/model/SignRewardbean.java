package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SignRewardbean {

    @SerializedName("code")
    private Integer code;

    @SerializedName("data")
    private DataCTDTO data;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private Integer time;

    public static class DataCTDTO {

        @SerializedName("list")
        private List<DataDTO> list;

        public boolean canEqual(Object obj) {
            return obj instanceof DataCTDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DataCTDTO)) {
                return false;
            }
            DataCTDTO dataCTDTO = (DataCTDTO) obj;
            if (!dataCTDTO.canEqual(this)) {
                return false;
            }
            List<DataDTO> list = getList();
            List<DataDTO> list2 = dataCTDTO.getList();
            return list != null ? list.equals(list2) : list2 == null;
        }

        public List<DataDTO> getList() {
            return this.list;
        }

        public int hashCode() {
            List<DataDTO> list = getList();
            return 59 + (list == null ? 43 : list.hashCode());
        }

        public void setList(List<DataDTO> list) {
            this.list = list;
        }

        public String toString() {
            return "SignRewardbean.DataCTDTO(list=" + getList() + ")";
        }
    }

    public static class DataDTO {

        @SerializedName("daily_coin")
        private int dailyCoin;

        @SerializedName("icon")
        private String icon;

        @SerializedName("text")
        private String text;

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
            if (!dataDTO.canEqual(this) || getDailyCoin() != dataDTO.getDailyCoin()) {
                return false;
            }
            String icon = getIcon();
            String icon2 = dataDTO.getIcon();
            if (icon != null ? !icon.equals(icon2) : icon2 != null) {
                return false;
            }
            String text = getText();
            String text2 = dataDTO.getText();
            return text != null ? text.equals(text2) : text2 == null;
        }

        public int getDailyCoin() {
            return this.dailyCoin;
        }

        public String getIcon() {
            return this.icon;
        }

        public String getText() {
            return this.text;
        }

        public int hashCode() {
            int dailyCoin = getDailyCoin() + 59;
            String icon = getIcon();
            int iHashCode = (dailyCoin * 59) + (icon == null ? 43 : icon.hashCode());
            String text = getText();
            return (iHashCode * 59) + (text != null ? text.hashCode() : 43);
        }

        public void setDailyCoin(int i10) {
            this.dailyCoin = i10;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setText(String str) {
            this.text = str;
        }

        public String toString() {
            return "SignRewardbean.DataDTO(icon=" + getIcon() + ", text=" + getText() + ", dailyCoin=" + getDailyCoin() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof SignRewardbean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SignRewardbean)) {
            return false;
        }
        SignRewardbean signRewardbean = (SignRewardbean) obj;
        if (!signRewardbean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = signRewardbean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = signRewardbean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = signRewardbean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataCTDTO data = getData();
        DataCTDTO data2 = signRewardbean.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    public Integer getCode() {
        return this.code;
    }

    public DataCTDTO getData() {
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
        DataCTDTO data = getData();
        return (iHashCode3 * 59) + (data != null ? data.hashCode() : 43);
    }

    public void setCode(Integer num) {
        this.code = num;
    }

    public void setData(DataCTDTO dataCTDTO) {
        this.data = dataCTDTO;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setTime(Integer num) {
        this.time = num;
    }

    public String toString() {
        return "SignRewardbean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
