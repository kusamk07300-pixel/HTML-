package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class GiftsRecordsbean {

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

            @SerializedName("from_user")
            private FromUserDTO fromUser;

            @SerializedName("from_user_id")
            private Integer fromUserId;

            @SerializedName("gift_icon")
            private String giftIcon;

            @SerializedName("gift_id")
            private Integer giftId;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @SerializedName("id")
            private Integer f34842id;

            @SerializedName("num")
            private Integer num;

            @SerializedName("to_user")
            private ToUserDTO toUser;

            @SerializedName("to_user_id")
            private Integer toUserId;

            public static class FromUserDTO {

                @SerializedName("avatar")
                private String avatar;

                @SerializedName("nickname")
                private String nickname;

                public boolean canEqual(Object obj) {
                    return obj instanceof FromUserDTO;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof FromUserDTO)) {
                        return false;
                    }
                    FromUserDTO fromUserDTO = (FromUserDTO) obj;
                    if (!fromUserDTO.canEqual(this)) {
                        return false;
                    }
                    String nickname = getNickname();
                    String nickname2 = fromUserDTO.getNickname();
                    if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                        return false;
                    }
                    String avatar = getAvatar();
                    String avatar2 = fromUserDTO.getAvatar();
                    return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
                }

                public String getAvatar() {
                    return this.avatar;
                }

                public String getNickname() {
                    return this.nickname;
                }

                public int hashCode() {
                    String nickname = getNickname();
                    int iHashCode = nickname == null ? 43 : nickname.hashCode();
                    String avatar = getAvatar();
                    return ((iHashCode + 59) * 59) + (avatar != null ? avatar.hashCode() : 43);
                }

                public void setAvatar(String str) {
                    this.avatar = str;
                }

                public void setNickname(String str) {
                    this.nickname = str;
                }

                public String toString() {
                    return "GiftsRecordsbean.DataDTO.ListDTO.FromUserDTO(nickname=" + getNickname() + ", avatar=" + getAvatar() + ")";
                }
            }

            public static class ToUserDTO {

                @SerializedName("avatar")
                private String avatar;

                @SerializedName("nickname")
                private String nickname;

                public boolean canEqual(Object obj) {
                    return obj instanceof ToUserDTO;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof ToUserDTO)) {
                        return false;
                    }
                    ToUserDTO toUserDTO = (ToUserDTO) obj;
                    if (!toUserDTO.canEqual(this)) {
                        return false;
                    }
                    String nickname = getNickname();
                    String nickname2 = toUserDTO.getNickname();
                    if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                        return false;
                    }
                    String avatar = getAvatar();
                    String avatar2 = toUserDTO.getAvatar();
                    return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
                }

                public String getAvatar() {
                    return this.avatar;
                }

                public String getNickname() {
                    return this.nickname;
                }

                public int hashCode() {
                    String nickname = getNickname();
                    int iHashCode = nickname == null ? 43 : nickname.hashCode();
                    String avatar = getAvatar();
                    return ((iHashCode + 59) * 59) + (avatar != null ? avatar.hashCode() : 43);
                }

                public void setAvatar(String str) {
                    this.avatar = str;
                }

                public void setNickname(String str) {
                    this.nickname = str;
                }

                public String toString() {
                    return "GiftsRecordsbean.DataDTO.ListDTO.ToUserDTO(nickname=" + getNickname() + ", avatar=" + getAvatar() + ")";
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
                Integer id2 = getId();
                Integer id3 = listDTO.getId();
                if (id2 != null ? !id2.equals(id3) : id3 != null) {
                    return false;
                }
                Integer giftId = getGiftId();
                Integer giftId2 = listDTO.getGiftId();
                if (giftId != null ? !giftId.equals(giftId2) : giftId2 != null) {
                    return false;
                }
                Integer fromUserId = getFromUserId();
                Integer fromUserId2 = listDTO.getFromUserId();
                if (fromUserId != null ? !fromUserId.equals(fromUserId2) : fromUserId2 != null) {
                    return false;
                }
                Integer toUserId = getToUserId();
                Integer toUserId2 = listDTO.getToUserId();
                if (toUserId != null ? !toUserId.equals(toUserId2) : toUserId2 != null) {
                    return false;
                }
                Integer num = getNum();
                Integer num2 = listDTO.getNum();
                if (num != null ? !num.equals(num2) : num2 != null) {
                    return false;
                }
                FromUserDTO fromUser = getFromUser();
                FromUserDTO fromUser2 = listDTO.getFromUser();
                if (fromUser != null ? !fromUser.equals(fromUser2) : fromUser2 != null) {
                    return false;
                }
                ToUserDTO toUser = getToUser();
                ToUserDTO toUser2 = listDTO.getToUser();
                if (toUser != null ? !toUser.equals(toUser2) : toUser2 != null) {
                    return false;
                }
                String giftIcon = getGiftIcon();
                String giftIcon2 = listDTO.getGiftIcon();
                return giftIcon != null ? giftIcon.equals(giftIcon2) : giftIcon2 == null;
            }

            public FromUserDTO getFromUser() {
                return this.fromUser;
            }

            public Integer getFromUserId() {
                return this.fromUserId;
            }

            public String getGiftIcon() {
                return this.giftIcon;
            }

            public Integer getGiftId() {
                return this.giftId;
            }

            public Integer getId() {
                return this.f34842id;
            }

            public Integer getNum() {
                return this.num;
            }

            public ToUserDTO getToUser() {
                return this.toUser;
            }

            public Integer getToUserId() {
                return this.toUserId;
            }

            public int hashCode() {
                Integer id2 = getId();
                int iHashCode = id2 == null ? 43 : id2.hashCode();
                Integer giftId = getGiftId();
                int iHashCode2 = ((iHashCode + 59) * 59) + (giftId == null ? 43 : giftId.hashCode());
                Integer fromUserId = getFromUserId();
                int iHashCode3 = (iHashCode2 * 59) + (fromUserId == null ? 43 : fromUserId.hashCode());
                Integer toUserId = getToUserId();
                int iHashCode4 = (iHashCode3 * 59) + (toUserId == null ? 43 : toUserId.hashCode());
                Integer num = getNum();
                int iHashCode5 = (iHashCode4 * 59) + (num == null ? 43 : num.hashCode());
                FromUserDTO fromUser = getFromUser();
                int iHashCode6 = (iHashCode5 * 59) + (fromUser == null ? 43 : fromUser.hashCode());
                ToUserDTO toUser = getToUser();
                int iHashCode7 = (iHashCode6 * 59) + (toUser == null ? 43 : toUser.hashCode());
                String giftIcon = getGiftIcon();
                return (iHashCode7 * 59) + (giftIcon != null ? giftIcon.hashCode() : 43);
            }

            public void setFromUser(FromUserDTO fromUserDTO) {
                this.fromUser = fromUserDTO;
            }

            public void setFromUserId(Integer num) {
                this.fromUserId = num;
            }

            public void setGiftIcon(String str) {
                this.giftIcon = str;
            }

            public void setGiftId(Integer num) {
                this.giftId = num;
            }

            public void setId(Integer num) {
                this.f34842id = num;
            }

            public void setNum(Integer num) {
                this.num = num;
            }

            public void setToUser(ToUserDTO toUserDTO) {
                this.toUser = toUserDTO;
            }

            public void setToUserId(Integer num) {
                this.toUserId = num;
            }

            public String toString() {
                return "GiftsRecordsbean.DataDTO.ListDTO(id=" + getId() + ", giftId=" + getGiftId() + ", fromUserId=" + getFromUserId() + ", toUserId=" + getToUserId() + ", num=" + getNum() + ", fromUser=" + getFromUser() + ", toUser=" + getToUser() + ", giftIcon=" + getGiftIcon() + ")";
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
            return "GiftsRecordsbean.DataDTO(list=" + getList() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof GiftsRecordsbean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftsRecordsbean)) {
            return false;
        }
        GiftsRecordsbean giftsRecordsbean = (GiftsRecordsbean) obj;
        if (!giftsRecordsbean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = giftsRecordsbean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = giftsRecordsbean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = giftsRecordsbean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = giftsRecordsbean.getData();
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
        return "GiftsRecordsbean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
