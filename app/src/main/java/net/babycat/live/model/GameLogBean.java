package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class GameLogBean {

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

        public static class ListDTO {

            @SerializedName("coin")
            private Integer coin;

            @SerializedName("content")
            private List<ContentDTO> content;

            @SerializedName("create_time")
            private String createTime;

            @SerializedName("game_id")
            private Integer gameId;

            @SerializedName("type")
            private Integer type;

            @SerializedName("uid")
            private Integer uid;

            public static class ContentDTO {

                @SerializedName("days")
                private String days;

                @SerializedName("fid")
                private String fid;

                @SerializedName("icon")
                private String icon;

                /* JADX INFO: renamed from: id, reason: collision with root package name */
                @SerializedName("id")
                private String f34835id;

                @SerializedName("text")
                private String text;

                @SerializedName("type")
                private String type;

                @SerializedName("vip_icon")
                private Integer vipIcon;

                public boolean canEqual(Object obj) {
                    return obj instanceof ContentDTO;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof ContentDTO)) {
                        return false;
                    }
                    ContentDTO contentDTO = (ContentDTO) obj;
                    if (!contentDTO.canEqual(this)) {
                        return false;
                    }
                    Integer vipIcon = getVipIcon();
                    Integer vipIcon2 = contentDTO.getVipIcon();
                    if (vipIcon != null ? !vipIcon.equals(vipIcon2) : vipIcon2 != null) {
                        return false;
                    }
                    String id2 = getId();
                    String id3 = contentDTO.getId();
                    if (id2 != null ? !id2.equals(id3) : id3 != null) {
                        return false;
                    }
                    String fid = getFid();
                    String fid2 = contentDTO.getFid();
                    if (fid != null ? !fid.equals(fid2) : fid2 != null) {
                        return false;
                    }
                    String type = getType();
                    String type2 = contentDTO.getType();
                    if (type != null ? !type.equals(type2) : type2 != null) {
                        return false;
                    }
                    String icon = getIcon();
                    String icon2 = contentDTO.getIcon();
                    if (icon != null ? !icon.equals(icon2) : icon2 != null) {
                        return false;
                    }
                    String text = getText();
                    String text2 = contentDTO.getText();
                    if (text != null ? !text.equals(text2) : text2 != null) {
                        return false;
                    }
                    String days = getDays();
                    String days2 = contentDTO.getDays();
                    return days != null ? days.equals(days2) : days2 == null;
                }

                public String getDays() {
                    return this.days;
                }

                public String getFid() {
                    return this.fid;
                }

                public String getIcon() {
                    return this.icon;
                }

                public String getId() {
                    return this.f34835id;
                }

                public String getText() {
                    return this.text;
                }

                public String getType() {
                    return this.type;
                }

                public Integer getVipIcon() {
                    return this.vipIcon;
                }

                public int hashCode() {
                    Integer vipIcon = getVipIcon();
                    int iHashCode = vipIcon == null ? 43 : vipIcon.hashCode();
                    String id2 = getId();
                    int iHashCode2 = ((iHashCode + 59) * 59) + (id2 == null ? 43 : id2.hashCode());
                    String fid = getFid();
                    int iHashCode3 = (iHashCode2 * 59) + (fid == null ? 43 : fid.hashCode());
                    String type = getType();
                    int iHashCode4 = (iHashCode3 * 59) + (type == null ? 43 : type.hashCode());
                    String icon = getIcon();
                    int iHashCode5 = (iHashCode4 * 59) + (icon == null ? 43 : icon.hashCode());
                    String text = getText();
                    int iHashCode6 = (iHashCode5 * 59) + (text == null ? 43 : text.hashCode());
                    String days = getDays();
                    return (iHashCode6 * 59) + (days != null ? days.hashCode() : 43);
                }

                public void setDays(String str) {
                    this.days = str;
                }

                public void setFid(String str) {
                    this.fid = str;
                }

                public void setIcon(String str) {
                    this.icon = str;
                }

                public void setId(String str) {
                    this.f34835id = str;
                }

                public void setText(String str) {
                    this.text = str;
                }

                public void setType(String str) {
                    this.type = str;
                }

                public void setVipIcon(Integer num) {
                    this.vipIcon = num;
                }

                public String toString() {
                    return "GameLogBean.DataDTO.ListDTO.ContentDTO(id=" + getId() + ", fid=" + getFid() + ", type=" + getType() + ", vipIcon=" + getVipIcon() + ", icon=" + getIcon() + ", text=" + getText() + ", days=" + getDays() + ")";
                }
            }

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
                Integer uid = getUid();
                Integer uid2 = listDTO.getUid();
                if (uid != null ? !uid.equals(uid2) : uid2 != null) {
                    return false;
                }
                Integer gameId = getGameId();
                Integer gameId2 = listDTO.getGameId();
                if (gameId != null ? !gameId.equals(gameId2) : gameId2 != null) {
                    return false;
                }
                Integer type = getType();
                Integer type2 = listDTO.getType();
                if (type != null ? !type.equals(type2) : type2 != null) {
                    return false;
                }
                Integer coin = getCoin();
                Integer coin2 = listDTO.getCoin();
                if (coin != null ? !coin.equals(coin2) : coin2 != null) {
                    return false;
                }
                String createTime = getCreateTime();
                String createTime2 = listDTO.getCreateTime();
                if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
                    return false;
                }
                List<ContentDTO> content = getContent();
                List<ContentDTO> content2 = listDTO.getContent();
                return content != null ? content.equals(content2) : content2 == null;
            }

            public Integer getCoin() {
                return this.coin;
            }

            public List<ContentDTO> getContent() {
                return this.content;
            }

            public String getCreateTime() {
                return this.createTime;
            }

            public Integer getGameId() {
                return this.gameId;
            }

            public Integer getType() {
                return this.type;
            }

            public Integer getUid() {
                return this.uid;
            }

            public int hashCode() {
                Integer uid = getUid();
                int iHashCode = uid == null ? 43 : uid.hashCode();
                Integer gameId = getGameId();
                int iHashCode2 = ((iHashCode + 59) * 59) + (gameId == null ? 43 : gameId.hashCode());
                Integer type = getType();
                int iHashCode3 = (iHashCode2 * 59) + (type == null ? 43 : type.hashCode());
                Integer coin = getCoin();
                int iHashCode4 = (iHashCode3 * 59) + (coin == null ? 43 : coin.hashCode());
                String createTime = getCreateTime();
                int iHashCode5 = (iHashCode4 * 59) + (createTime == null ? 43 : createTime.hashCode());
                List<ContentDTO> content = getContent();
                return (iHashCode5 * 59) + (content != null ? content.hashCode() : 43);
            }

            public void setCoin(Integer num) {
                this.coin = num;
            }

            public void setContent(List<ContentDTO> list) {
                this.content = list;
            }

            public void setCreateTime(String str) {
                this.createTime = str;
            }

            public void setGameId(Integer num) {
                this.gameId = num;
            }

            public void setType(Integer num) {
                this.type = num;
            }

            public void setUid(Integer num) {
                this.uid = num;
            }

            public String toString() {
                return "GameLogBean.DataDTO.ListDTO(uid=" + getUid() + ", gameId=" + getGameId() + ", type=" + getType() + ", coin=" + getCoin() + ", createTime=" + getCreateTime() + ", content=" + getContent() + ")";
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
            return "GameLogBean.DataDTO(list=" + getList() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof GameLogBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GameLogBean)) {
            return false;
        }
        GameLogBean gameLogBean = (GameLogBean) obj;
        if (!gameLogBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = gameLogBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = gameLogBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        Integer total = getTotal();
        Integer total2 = gameLogBean.getTotal();
        if (total != null ? !total.equals(total2) : total2 != null) {
            return false;
        }
        Boolean hasmore = getHasmore();
        Boolean hasmore2 = gameLogBean.getHasmore();
        if (hasmore != null ? !hasmore.equals(hasmore2) : hasmore2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = gameLogBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = gameLogBean.getData();
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
        return "GameLogBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ", total=" + getTotal() + ", hasmore=" + getHasmore() + ")";
    }
}
