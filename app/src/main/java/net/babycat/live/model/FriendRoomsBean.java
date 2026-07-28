package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class FriendRoomsBean {

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
        private List<DataDTOList> list;

        public static class DataDTOList {

            @SerializedName("age")
            private Integer age;

            @SerializedName("anchor_level")
            private Integer anchorLevel;

            @SerializedName("avatar")
            private String avatar;

            @SerializedName("avatar_frame")
            private String avatarFrame;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @SerializedName("id")
            private Integer f34831id;

            @SerializedName("level")
            private Integer level;

            @SerializedName("live_roomid")
            private Integer liveRoomid;

            @SerializedName("nickname")
            private String nickname;

            @SerializedName("online_roomid")
            private Integer onlineRoomid;

            @SerializedName("sex")
            private Integer sex;

            @SerializedName("vip_level")
            private Integer vipLevel;

            public boolean canEqual(Object obj) {
                return obj instanceof DataDTOList;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DataDTOList)) {
                    return false;
                }
                DataDTOList dataDTOList = (DataDTOList) obj;
                if (!dataDTOList.canEqual(this)) {
                    return false;
                }
                Integer id2 = getId();
                Integer id3 = dataDTOList.getId();
                if (id2 != null ? !id2.equals(id3) : id3 != null) {
                    return false;
                }
                Integer sex = getSex();
                Integer sex2 = dataDTOList.getSex();
                if (sex != null ? !sex.equals(sex2) : sex2 != null) {
                    return false;
                }
                Integer age = getAge();
                Integer age2 = dataDTOList.getAge();
                if (age != null ? !age.equals(age2) : age2 != null) {
                    return false;
                }
                Integer level = getLevel();
                Integer level2 = dataDTOList.getLevel();
                if (level != null ? !level.equals(level2) : level2 != null) {
                    return false;
                }
                Integer anchorLevel = getAnchorLevel();
                Integer anchorLevel2 = dataDTOList.getAnchorLevel();
                if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
                    return false;
                }
                Integer onlineRoomid = getOnlineRoomid();
                Integer onlineRoomid2 = dataDTOList.getOnlineRoomid();
                if (onlineRoomid != null ? !onlineRoomid.equals(onlineRoomid2) : onlineRoomid2 != null) {
                    return false;
                }
                Integer vipLevel = getVipLevel();
                Integer vipLevel2 = dataDTOList.getVipLevel();
                if (vipLevel != null ? !vipLevel.equals(vipLevel2) : vipLevel2 != null) {
                    return false;
                }
                Integer liveRoomid = getLiveRoomid();
                Integer liveRoomid2 = dataDTOList.getLiveRoomid();
                if (liveRoomid != null ? !liveRoomid.equals(liveRoomid2) : liveRoomid2 != null) {
                    return false;
                }
                String nickname = getNickname();
                String nickname2 = dataDTOList.getNickname();
                if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                    return false;
                }
                String avatar = getAvatar();
                String avatar2 = dataDTOList.getAvatar();
                if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
                    return false;
                }
                String avatarFrame = getAvatarFrame();
                String avatarFrame2 = dataDTOList.getAvatarFrame();
                return avatarFrame != null ? avatarFrame.equals(avatarFrame2) : avatarFrame2 == null;
            }

            public Integer getAge() {
                return this.age;
            }

            public Integer getAnchorLevel() {
                return this.anchorLevel;
            }

            public String getAvatar() {
                return this.avatar;
            }

            public String getAvatarFrame() {
                return this.avatarFrame;
            }

            public Integer getId() {
                return this.f34831id;
            }

            public Integer getLevel() {
                return this.level;
            }

            public Integer getLiveRoomid() {
                return this.liveRoomid;
            }

            public String getNickname() {
                return this.nickname;
            }

            public Integer getOnlineRoomid() {
                return this.onlineRoomid;
            }

            public Integer getSex() {
                return this.sex;
            }

            public Integer getVipLevel() {
                return this.vipLevel;
            }

            public int hashCode() {
                Integer id2 = getId();
                int iHashCode = id2 == null ? 43 : id2.hashCode();
                Integer sex = getSex();
                int iHashCode2 = ((iHashCode + 59) * 59) + (sex == null ? 43 : sex.hashCode());
                Integer age = getAge();
                int iHashCode3 = (iHashCode2 * 59) + (age == null ? 43 : age.hashCode());
                Integer level = getLevel();
                int iHashCode4 = (iHashCode3 * 59) + (level == null ? 43 : level.hashCode());
                Integer anchorLevel = getAnchorLevel();
                int iHashCode5 = (iHashCode4 * 59) + (anchorLevel == null ? 43 : anchorLevel.hashCode());
                Integer onlineRoomid = getOnlineRoomid();
                int iHashCode6 = (iHashCode5 * 59) + (onlineRoomid == null ? 43 : onlineRoomid.hashCode());
                Integer vipLevel = getVipLevel();
                int iHashCode7 = (iHashCode6 * 59) + (vipLevel == null ? 43 : vipLevel.hashCode());
                Integer liveRoomid = getLiveRoomid();
                int iHashCode8 = (iHashCode7 * 59) + (liveRoomid == null ? 43 : liveRoomid.hashCode());
                String nickname = getNickname();
                int iHashCode9 = (iHashCode8 * 59) + (nickname == null ? 43 : nickname.hashCode());
                String avatar = getAvatar();
                int iHashCode10 = (iHashCode9 * 59) + (avatar == null ? 43 : avatar.hashCode());
                String avatarFrame = getAvatarFrame();
                return (iHashCode10 * 59) + (avatarFrame != null ? avatarFrame.hashCode() : 43);
            }

            public void setAge(Integer num) {
                this.age = num;
            }

            public void setAnchorLevel(Integer num) {
                this.anchorLevel = num;
            }

            public void setAvatar(String str) {
                this.avatar = str;
            }

            public void setAvatarFrame(String str) {
                this.avatarFrame = str;
            }

            public void setId(Integer num) {
                this.f34831id = num;
            }

            public void setLevel(Integer num) {
                this.level = num;
            }

            public void setLiveRoomid(Integer num) {
                this.liveRoomid = num;
            }

            public void setNickname(String str) {
                this.nickname = str;
            }

            public void setOnlineRoomid(Integer num) {
                this.onlineRoomid = num;
            }

            public void setSex(Integer num) {
                this.sex = num;
            }

            public void setVipLevel(Integer num) {
                this.vipLevel = num;
            }

            public String toString() {
                return "FriendRoomsBean.DataDTO.DataDTOList(id=" + getId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", sex=" + getSex() + ", age=" + getAge() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ", onlineRoomid=" + getOnlineRoomid() + ", vipLevel=" + getVipLevel() + ", avatarFrame=" + getAvatarFrame() + ", liveRoomid=" + getLiveRoomid() + ")";
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
            List<DataDTOList> list = getList();
            List<DataDTOList> list2 = dataDTO.getList();
            return list != null ? list.equals(list2) : list2 == null;
        }

        public List<DataDTOList> getList() {
            return this.list;
        }

        public int hashCode() {
            List<DataDTOList> list = getList();
            return 59 + (list == null ? 43 : list.hashCode());
        }

        public void setList(List<DataDTOList> list) {
            this.list = list;
        }

        public String toString() {
            return "FriendRoomsBean.DataDTO(list=" + getList() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof FriendRoomsBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FriendRoomsBean)) {
            return false;
        }
        FriendRoomsBean friendRoomsBean = (FriendRoomsBean) obj;
        if (!friendRoomsBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = friendRoomsBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = friendRoomsBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = friendRoomsBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = friendRoomsBean.getData();
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
        return "FriendRoomsBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
