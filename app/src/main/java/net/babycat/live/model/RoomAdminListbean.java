package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RoomAdminListbean {

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

            @SerializedName("in_room")
            private Integer inRoom;

            @SerializedName("nickname")
            private String nickname;

            @SerializedName("sex")
            private Integer sex;

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
                Integer sex = getSex();
                Integer sex2 = listDTO.getSex();
                if (sex != null ? !sex.equals(sex2) : sex2 != null) {
                    return false;
                }
                Integer inRoom = getInRoom();
                Integer inRoom2 = listDTO.getInRoom();
                if (inRoom != null ? !inRoom.equals(inRoom2) : inRoom2 != null) {
                    return false;
                }
                String nickname = getNickname();
                String nickname2 = listDTO.getNickname();
                if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                    return false;
                }
                String avatar = getAvatar();
                String avatar2 = listDTO.getAvatar();
                return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
            }

            public String getAvatar() {
                return this.avatar;
            }

            public Integer getInRoom() {
                return this.inRoom;
            }

            public String getNickname() {
                return this.nickname;
            }

            public Integer getSex() {
                return this.sex;
            }

            public Integer getUserId() {
                return this.userId;
            }

            public int hashCode() {
                Integer userId = getUserId();
                int iHashCode = userId == null ? 43 : userId.hashCode();
                Integer sex = getSex();
                int iHashCode2 = ((iHashCode + 59) * 59) + (sex == null ? 43 : sex.hashCode());
                Integer inRoom = getInRoom();
                int iHashCode3 = (iHashCode2 * 59) + (inRoom == null ? 43 : inRoom.hashCode());
                String nickname = getNickname();
                int iHashCode4 = (iHashCode3 * 59) + (nickname == null ? 43 : nickname.hashCode());
                String avatar = getAvatar();
                return (iHashCode4 * 59) + (avatar != null ? avatar.hashCode() : 43);
            }

            public void setAvatar(String str) {
                this.avatar = str;
            }

            public void setInRoom(Integer num) {
                this.inRoom = num;
            }

            public void setNickname(String str) {
                this.nickname = str;
            }

            public void setSex(Integer num) {
                this.sex = num;
            }

            public void setUserId(Integer num) {
                this.userId = num;
            }

            public String toString() {
                return "RoomAdminListbean.DataDTO.ListDTO(userId=" + getUserId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", sex=" + getSex() + ", inRoom=" + getInRoom() + ")";
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
            return "RoomAdminListbean.DataDTO(list=" + getList() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof RoomAdminListbean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoomAdminListbean)) {
            return false;
        }
        RoomAdminListbean roomAdminListbean = (RoomAdminListbean) obj;
        if (!roomAdminListbean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = roomAdminListbean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = roomAdminListbean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = roomAdminListbean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = roomAdminListbean.getData();
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
        return "RoomAdminListbean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
