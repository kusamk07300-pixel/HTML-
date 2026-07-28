package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class GiftListByTagBean {

    @SerializedName("code")
    private int code;

    @SerializedName("data")
    private DataDTO data;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private long time;

    public static class DataDTO {

        @SerializedName("list")
        private List<GiftItemDTO> list;

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
            List<GiftItemDTO> list = getList();
            List<GiftItemDTO> list2 = dataDTO.getList();
            return list != null ? list.equals(list2) : list2 == null;
        }

        public List<GiftItemDTO> getList() {
            return this.list;
        }

        public int hashCode() {
            List<GiftItemDTO> list = getList();
            return 59 + (list == null ? 43 : list.hashCode());
        }

        public void setList(List<GiftItemDTO> list) {
            this.list = list;
        }

        public String toString() {
            return "GiftListByTagBean.DataDTO(list=" + getList() + ")";
        }
    }

    public static class GiftItemDTO {

        @SerializedName("gift_tag")
        private int giftTag;

        @SerializedName("gifticon")
        private String gifticon;

        @SerializedName("giftname")
        private String giftname;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private int f34839id;

        @SerializedName("is_luck")
        private int isLuck;

        @SerializedName("is_mult")
        private int isMult;

        @SerializedName("isplatgift")
        private int isplatgift;

        @SerializedName("jsonlink")
        private String jsonlink;

        @SerializedName("mark")
        private int mark;

        @SerializedName("needcoin")
        private int needcoin;

        @SerializedName("relation_type")
        private int relationType;

        @SerializedName("sort")
        private int sort;

        @SerializedName(o0.CATEGORY_STATUS)
        private int status;

        @SerializedName("swflink")
        private String swflink;

        @SerializedName("swftime")
        private int swftime;

        @SerializedName("swftype")
        private int swftype;

        @SerializedName("type")
        private int type;

        public boolean canEqual(Object obj) {
            return obj instanceof GiftItemDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GiftItemDTO)) {
                return false;
            }
            GiftItemDTO giftItemDTO = (GiftItemDTO) obj;
            if (!giftItemDTO.canEqual(this) || getId() != giftItemDTO.getId() || getMark() != giftItemDTO.getMark() || getType() != giftItemDTO.getType() || getIsMult() != giftItemDTO.getIsMult() || getNeedcoin() != giftItemDTO.getNeedcoin() || getSort() != giftItemDTO.getSort() || getSwftype() != giftItemDTO.getSwftype() || getSwftime() != giftItemDTO.getSwftime() || getIsplatgift() != giftItemDTO.getIsplatgift() || getIsLuck() != giftItemDTO.getIsLuck() || getStatus() != giftItemDTO.getStatus() || getGiftTag() != giftItemDTO.getGiftTag() || getRelationType() != giftItemDTO.getRelationType()) {
                return false;
            }
            String giftname = getGiftname();
            String giftname2 = giftItemDTO.getGiftname();
            if (giftname != null ? !giftname.equals(giftname2) : giftname2 != null) {
                return false;
            }
            String gifticon = getGifticon();
            String gifticon2 = giftItemDTO.getGifticon();
            if (gifticon != null ? !gifticon.equals(gifticon2) : gifticon2 != null) {
                return false;
            }
            String swflink = getSwflink();
            String swflink2 = giftItemDTO.getSwflink();
            if (swflink != null ? !swflink.equals(swflink2) : swflink2 != null) {
                return false;
            }
            String jsonlink = getJsonlink();
            String jsonlink2 = giftItemDTO.getJsonlink();
            return jsonlink != null ? jsonlink.equals(jsonlink2) : jsonlink2 == null;
        }

        public int getGiftTag() {
            return this.giftTag;
        }

        public String getGifticon() {
            return this.gifticon;
        }

        public String getGiftname() {
            return this.giftname;
        }

        public int getId() {
            return this.f34839id;
        }

        public int getIsLuck() {
            return this.isLuck;
        }

        public int getIsMult() {
            return this.isMult;
        }

        public int getIsplatgift() {
            return this.isplatgift;
        }

        public String getJsonlink() {
            return this.jsonlink;
        }

        public int getMark() {
            return this.mark;
        }

        public int getNeedcoin() {
            return this.needcoin;
        }

        public int getRelationType() {
            return this.relationType;
        }

        public int getSort() {
            return this.sort;
        }

        public int getStatus() {
            return this.status;
        }

        public String getSwflink() {
            return this.swflink;
        }

        public int getSwftime() {
            return this.swftime;
        }

        public int getSwftype() {
            return this.swftype;
        }

        public int getType() {
            return this.type;
        }

        public int hashCode() {
            int id2 = ((((((((((((((((((((((((getId() + 59) * 59) + getMark()) * 59) + getType()) * 59) + getIsMult()) * 59) + getNeedcoin()) * 59) + getSort()) * 59) + getSwftype()) * 59) + getSwftime()) * 59) + getIsplatgift()) * 59) + getIsLuck()) * 59) + getStatus()) * 59) + getGiftTag()) * 59) + getRelationType();
            String giftname = getGiftname();
            int iHashCode = (id2 * 59) + (giftname == null ? 43 : giftname.hashCode());
            String gifticon = getGifticon();
            int iHashCode2 = (iHashCode * 59) + (gifticon == null ? 43 : gifticon.hashCode());
            String swflink = getSwflink();
            int iHashCode3 = (iHashCode2 * 59) + (swflink == null ? 43 : swflink.hashCode());
            String jsonlink = getJsonlink();
            return (iHashCode3 * 59) + (jsonlink != null ? jsonlink.hashCode() : 43);
        }

        public void setGiftTag(int i10) {
            this.giftTag = i10;
        }

        public void setGifticon(String str) {
            this.gifticon = str;
        }

        public void setGiftname(String str) {
            this.giftname = str;
        }

        public void setId(int i10) {
            this.f34839id = i10;
        }

        public void setIsLuck(int i10) {
            this.isLuck = i10;
        }

        public void setIsMult(int i10) {
            this.isMult = i10;
        }

        public void setIsplatgift(int i10) {
            this.isplatgift = i10;
        }

        public void setJsonlink(String str) {
            this.jsonlink = str;
        }

        public void setMark(int i10) {
            this.mark = i10;
        }

        public void setNeedcoin(int i10) {
            this.needcoin = i10;
        }

        public void setRelationType(int i10) {
            this.relationType = i10;
        }

        public void setSort(int i10) {
            this.sort = i10;
        }

        public void setStatus(int i10) {
            this.status = i10;
        }

        public void setSwflink(String str) {
            this.swflink = str;
        }

        public void setSwftime(int i10) {
            this.swftime = i10;
        }

        public void setSwftype(int i10) {
            this.swftype = i10;
        }

        public void setType(int i10) {
            this.type = i10;
        }

        public String toString() {
            return "GiftListByTagBean.GiftItemDTO(id=" + getId() + ", mark=" + getMark() + ", type=" + getType() + ", isMult=" + getIsMult() + ", giftname=" + getGiftname() + ", needcoin=" + getNeedcoin() + ", gifticon=" + getGifticon() + ", sort=" + getSort() + ", swftype=" + getSwftype() + ", swflink=" + getSwflink() + ", swftime=" + getSwftime() + ", isplatgift=" + getIsplatgift() + ", jsonlink=" + getJsonlink() + ", isLuck=" + getIsLuck() + ", status=" + getStatus() + ", giftTag=" + getGiftTag() + ", relationType=" + getRelationType() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof GiftListByTagBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftListByTagBean)) {
            return false;
        }
        GiftListByTagBean giftListByTagBean = (GiftListByTagBean) obj;
        if (!giftListByTagBean.canEqual(this) || getCode() != giftListByTagBean.getCode() || getTime() != giftListByTagBean.getTime()) {
            return false;
        }
        String msg = getMsg();
        String msg2 = giftListByTagBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = giftListByTagBean.getData();
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
        return "GiftListByTagBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
