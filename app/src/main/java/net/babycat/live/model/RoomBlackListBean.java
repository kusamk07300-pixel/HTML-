package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RoomBlackListBean {

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

            @SerializedName("avatar")
            private String avatar;

            @SerializedName("create_time")
            private String createTime;

            @SerializedName("nickname")
            private String nickname;

            @SerializedName("type")
            private Integer type;

            @SerializedName("user_id")
            private Integer userId;

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
                Integer userId = getUserId();
                Integer userId2 = listDTO.getUserId();
                if (userId != null ? !userId.equals(userId2) : userId2 != null) {
                    return false;
                }
                Integer type = getType();
                Integer type2 = listDTO.getType();
                if (type != null ? !type.equals(type2) : type2 != null) {
                    return false;
                }
                String nickname = getNickname();
                String nickname2 = listDTO.getNickname();
                if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                    return false;
                }
                String avatar = getAvatar();
                String avatar2 = listDTO.getAvatar();
                if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
                    return false;
                }
                String createTime = getCreateTime();
                String createTime2 = listDTO.getCreateTime();
                return createTime != null ? createTime.equals(createTime2) : createTime2 == null;
            }

            public String getAvatar() {
                return this.avatar;
            }

            public String getCreateTime() {
                return this.createTime;
            }

            public String getNickname() {
                return this.nickname;
            }

            public Integer getType() {
                return this.type;
            }

            public Integer getUserId() {
                return this.userId;
            }

            public int hashCode() {
                Integer userId = getUserId();
                int iHashCode = userId == null ? 43 : userId.hashCode();
                Integer type = getType();
                int iHashCode2 = ((iHashCode + 59) * 59) + (type == null ? 43 : type.hashCode());
                String nickname = getNickname();
                int iHashCode3 = (iHashCode2 * 59) + (nickname == null ? 43 : nickname.hashCode());
                String avatar = getAvatar();
                int iHashCode4 = (iHashCode3 * 59) + (avatar == null ? 43 : avatar.hashCode());
                String createTime = getCreateTime();
                return (iHashCode4 * 59) + (createTime != null ? createTime.hashCode() : 43);
            }

            public void setAvatar(String str) {
                this.avatar = str;
            }

            public void setCreateTime(String str) {
                this.createTime = str;
            }

            public void setNickname(String str) {
                this.nickname = str;
            }

            public void setType(Integer num) {
                this.type = num;
            }

            public void setUserId(Integer num) {
                this.userId = num;
            }

            public String toString() {
                return "RoomBlackListBean.DataDTO.ListDTO(userId=" + getUserId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", type=" + getType() + ", createTime=" + getCreateTime() + ")";
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
            return "RoomBlackListBean.DataDTO(list=" + getList() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof RoomBlackListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoomBlackListBean)) {
            return false;
        }
        RoomBlackListBean roomBlackListBean = (RoomBlackListBean) obj;
        if (!roomBlackListBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = roomBlackListBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = roomBlackListBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = roomBlackListBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = roomBlackListBean.getData();
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
        return "RoomBlackListBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
