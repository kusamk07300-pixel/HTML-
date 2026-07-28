package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import com.tencent.qcloud.tuicore.TUIConstants;
import g0.o0;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RoomDetatisInfoBean implements Serializable {

    @SerializedName("code")
    private Integer code;

    @SerializedName("data")
    private DataDTO data;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private Integer time;

    public static class DataDTO implements Serializable {

        @SerializedName("admin_cnt")
        private Integer adminCnt;

        @SerializedName("admin_list")
        private List<AdminListDTO> adminList;

        @SerializedName("country_iso")
        private String countryIso;

        @SerializedName("country_name")
        private String countryName;

        @SerializedName("cover")
        private String cover;

        @SerializedName("custom_id")
        private Integer customId;

        @SerializedName("exp")
        private Double exp;

        @SerializedName("fans_count")
        private Integer fansCount;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34889id;

        @SerializedName("is_join")
        private Integer isJoin;

        @SerializedName("language_tag")
        private String language;

        @SerializedName("level")
        private Integer level;

        @SerializedName("master_info")
        private AdminListDTO masterInfo;

        @SerializedName("max_admin")
        private Integer maxAdmin;

        @SerializedName("name")
        private String name;

        @SerializedName(TUIConstants.TUIChat.NOTICE)
        private String notice;

        @SerializedName("owner_uid")
        private Integer ownerUid;

        @SerializedName("room_level")
        private RoomLevelDTO roomLevel;

        @SerializedName("room_name")
        private String roomName;

        public static class AdminListDTO implements Serializable {

            @SerializedName("age")
            private Integer age;

            @SerializedName("avatar")
            private String avatar;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @SerializedName("id")
            private Integer f34890id;

            @SerializedName("in_room")
            private Integer inRoom;

            @SerializedName("nickname")
            private String nickname;

            @SerializedName("sex")
            private Integer sex;

            @SerializedName("user_id")
            private Integer userId;

            @SerializedName("vip_level")
            private Integer vipLevel;

            public boolean canEqual(Object obj) {
                return obj instanceof AdminListDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof AdminListDTO)) {
                    return false;
                }
                AdminListDTO adminListDTO = (AdminListDTO) obj;
                if (!adminListDTO.canEqual(this)) {
                    return false;
                }
                Integer userId = getUserId();
                Integer userId2 = adminListDTO.getUserId();
                if (userId != null ? !userId.equals(userId2) : userId2 != null) {
                    return false;
                }
                Integer id2 = getId();
                Integer id3 = adminListDTO.getId();
                if (id2 != null ? !id2.equals(id3) : id3 != null) {
                    return false;
                }
                Integer sex = getSex();
                Integer sex2 = adminListDTO.getSex();
                if (sex != null ? !sex.equals(sex2) : sex2 != null) {
                    return false;
                }
                Integer inRoom = getInRoom();
                Integer inRoom2 = adminListDTO.getInRoom();
                if (inRoom != null ? !inRoom.equals(inRoom2) : inRoom2 != null) {
                    return false;
                }
                Integer age = getAge();
                Integer age2 = adminListDTO.getAge();
                if (age != null ? !age.equals(age2) : age2 != null) {
                    return false;
                }
                Integer vipLevel = getVipLevel();
                Integer vipLevel2 = adminListDTO.getVipLevel();
                if (vipLevel != null ? !vipLevel.equals(vipLevel2) : vipLevel2 != null) {
                    return false;
                }
                String nickname = getNickname();
                String nickname2 = adminListDTO.getNickname();
                if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                    return false;
                }
                String avatar = getAvatar();
                String avatar2 = adminListDTO.getAvatar();
                return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
            }

            public Integer getAge() {
                return this.age;
            }

            public String getAvatar() {
                return this.avatar;
            }

            public Integer getId() {
                return this.f34890id;
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

            public Integer getVipLevel() {
                return this.vipLevel;
            }

            public int hashCode() {
                Integer userId = getUserId();
                int iHashCode = userId == null ? 43 : userId.hashCode();
                Integer id2 = getId();
                int iHashCode2 = ((iHashCode + 59) * 59) + (id2 == null ? 43 : id2.hashCode());
                Integer sex = getSex();
                int iHashCode3 = (iHashCode2 * 59) + (sex == null ? 43 : sex.hashCode());
                Integer inRoom = getInRoom();
                int iHashCode4 = (iHashCode3 * 59) + (inRoom == null ? 43 : inRoom.hashCode());
                Integer age = getAge();
                int iHashCode5 = (iHashCode4 * 59) + (age == null ? 43 : age.hashCode());
                Integer vipLevel = getVipLevel();
                int iHashCode6 = (iHashCode5 * 59) + (vipLevel == null ? 43 : vipLevel.hashCode());
                String nickname = getNickname();
                int iHashCode7 = (iHashCode6 * 59) + (nickname == null ? 43 : nickname.hashCode());
                String avatar = getAvatar();
                return (iHashCode7 * 59) + (avatar != null ? avatar.hashCode() : 43);
            }

            public void setAge(Integer num) {
                this.age = num;
            }

            public void setAvatar(String str) {
                this.avatar = str;
            }

            public void setId(Integer num) {
                this.f34890id = num;
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

            public void setVipLevel(Integer num) {
                this.vipLevel = num;
            }

            public String toString() {
                return "RoomDetatisInfoBean.DataDTO.AdminListDTO(userId=" + getUserId() + ", id=" + getId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", sex=" + getSex() + ", inRoom=" + getInRoom() + ", age=" + getAge() + ", vipLevel=" + getVipLevel() + ")";
            }
        }

        public static class RoomLevelDTO implements Serializable {

            @SerializedName("currentExp")
            private String currentExp;

            @SerializedName("currentLevel")
            private LevelDTO currentLevel;

            @SerializedName("nextLevel")
            private LevelDTO nextLevel;

            @SerializedName("rate")
            private Integer rate;

            public static class LevelDTO implements Serializable {

                @SerializedName("exp")
                private Double exp;

                @SerializedName("expK")
                private String expK;

                @SerializedName("level")
                private Integer level;

                public boolean canEqual(Object obj) {
                    return obj instanceof LevelDTO;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof LevelDTO)) {
                        return false;
                    }
                    LevelDTO levelDTO = (LevelDTO) obj;
                    if (!levelDTO.canEqual(this)) {
                        return false;
                    }
                    Integer level = getLevel();
                    Integer level2 = levelDTO.getLevel();
                    if (level != null ? !level.equals(level2) : level2 != null) {
                        return false;
                    }
                    Double exp = getExp();
                    Double exp2 = levelDTO.getExp();
                    if (exp != null ? !exp.equals(exp2) : exp2 != null) {
                        return false;
                    }
                    String expK = getExpK();
                    String expK2 = levelDTO.getExpK();
                    return expK != null ? expK.equals(expK2) : expK2 == null;
                }

                public Double getExp() {
                    return this.exp;
                }

                public String getExpK() {
                    return this.expK;
                }

                public Integer getLevel() {
                    return this.level;
                }

                public int hashCode() {
                    Integer level = getLevel();
                    int iHashCode = level == null ? 43 : level.hashCode();
                    Double exp = getExp();
                    int iHashCode2 = ((iHashCode + 59) * 59) + (exp == null ? 43 : exp.hashCode());
                    String expK = getExpK();
                    return (iHashCode2 * 59) + (expK != null ? expK.hashCode() : 43);
                }

                public void setExp(Double d10) {
                    this.exp = d10;
                }

                public void setExpK(String str) {
                    this.expK = str;
                }

                public void setLevel(Integer num) {
                    this.level = num;
                }

                public String toString() {
                    return "RoomDetatisInfoBean.DataDTO.RoomLevelDTO.LevelDTO(level=" + getLevel() + ", exp=" + getExp() + ", expK=" + getExpK() + ")";
                }
            }

            public boolean canEqual(Object obj) {
                return obj instanceof RoomLevelDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof RoomLevelDTO)) {
                    return false;
                }
                RoomLevelDTO roomLevelDTO = (RoomLevelDTO) obj;
                if (!roomLevelDTO.canEqual(this)) {
                    return false;
                }
                Integer rate = getRate();
                Integer rate2 = roomLevelDTO.getRate();
                if (rate != null ? !rate.equals(rate2) : rate2 != null) {
                    return false;
                }
                LevelDTO currentLevel = getCurrentLevel();
                LevelDTO currentLevel2 = roomLevelDTO.getCurrentLevel();
                if (currentLevel != null ? !currentLevel.equals(currentLevel2) : currentLevel2 != null) {
                    return false;
                }
                LevelDTO nextLevel = getNextLevel();
                LevelDTO nextLevel2 = roomLevelDTO.getNextLevel();
                if (nextLevel != null ? !nextLevel.equals(nextLevel2) : nextLevel2 != null) {
                    return false;
                }
                String currentExp = getCurrentExp();
                String currentExp2 = roomLevelDTO.getCurrentExp();
                return currentExp != null ? currentExp.equals(currentExp2) : currentExp2 == null;
            }

            public String getCurrentExp() {
                return this.currentExp;
            }

            public LevelDTO getCurrentLevel() {
                return this.currentLevel;
            }

            public LevelDTO getNextLevel() {
                return this.nextLevel;
            }

            public Integer getRate() {
                return this.rate;
            }

            public int hashCode() {
                Integer rate = getRate();
                int iHashCode = rate == null ? 43 : rate.hashCode();
                LevelDTO currentLevel = getCurrentLevel();
                int iHashCode2 = ((iHashCode + 59) * 59) + (currentLevel == null ? 43 : currentLevel.hashCode());
                LevelDTO nextLevel = getNextLevel();
                int iHashCode3 = (iHashCode2 * 59) + (nextLevel == null ? 43 : nextLevel.hashCode());
                String currentExp = getCurrentExp();
                return (iHashCode3 * 59) + (currentExp != null ? currentExp.hashCode() : 43);
            }

            public void setCurrentExp(String str) {
                this.currentExp = str;
            }

            public void setCurrentLevel(LevelDTO levelDTO) {
                this.currentLevel = levelDTO;
            }

            public void setNextLevel(LevelDTO levelDTO) {
                this.nextLevel = levelDTO;
            }

            public void setRate(Integer num) {
                this.rate = num;
            }

            public String toString() {
                return "RoomDetatisInfoBean.DataDTO.RoomLevelDTO(currentLevel=" + getCurrentLevel() + ", nextLevel=" + getNextLevel() + ", currentExp=" + getCurrentExp() + ", rate=" + getRate() + ")";
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
            Integer id2 = getId();
            Integer id3 = dataDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            Integer ownerUid = getOwnerUid();
            Integer ownerUid2 = dataDTO.getOwnerUid();
            if (ownerUid != null ? !ownerUid.equals(ownerUid2) : ownerUid2 != null) {
                return false;
            }
            Integer customId = getCustomId();
            Integer customId2 = dataDTO.getCustomId();
            if (customId != null ? !customId.equals(customId2) : customId2 != null) {
                return false;
            }
            Integer maxAdmin = getMaxAdmin();
            Integer maxAdmin2 = dataDTO.getMaxAdmin();
            if (maxAdmin != null ? !maxAdmin.equals(maxAdmin2) : maxAdmin2 != null) {
                return false;
            }
            Integer adminCnt = getAdminCnt();
            Integer adminCnt2 = dataDTO.getAdminCnt();
            if (adminCnt != null ? !adminCnt.equals(adminCnt2) : adminCnt2 != null) {
                return false;
            }
            Integer fansCount = getFansCount();
            Integer fansCount2 = dataDTO.getFansCount();
            if (fansCount != null ? !fansCount.equals(fansCount2) : fansCount2 != null) {
                return false;
            }
            Integer level = getLevel();
            Integer level2 = dataDTO.getLevel();
            if (level != null ? !level.equals(level2) : level2 != null) {
                return false;
            }
            Double exp = getExp();
            Double exp2 = dataDTO.getExp();
            if (exp != null ? !exp.equals(exp2) : exp2 != null) {
                return false;
            }
            Integer isJoin = getIsJoin();
            Integer isJoin2 = dataDTO.getIsJoin();
            if (isJoin != null ? !isJoin.equals(isJoin2) : isJoin2 != null) {
                return false;
            }
            String roomName = getRoomName();
            String roomName2 = dataDTO.getRoomName();
            if (roomName != null ? !roomName.equals(roomName2) : roomName2 != null) {
                return false;
            }
            String name = getName();
            String name2 = dataDTO.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String cover = getCover();
            String cover2 = dataDTO.getCover();
            if (cover != null ? !cover.equals(cover2) : cover2 != null) {
                return false;
            }
            String language = getLanguage();
            String language2 = dataDTO.getLanguage();
            if (language != null ? !language.equals(language2) : language2 != null) {
                return false;
            }
            String countryName = getCountryName();
            String countryName2 = dataDTO.getCountryName();
            if (countryName != null ? !countryName.equals(countryName2) : countryName2 != null) {
                return false;
            }
            String countryIso = getCountryIso();
            String countryIso2 = dataDTO.getCountryIso();
            if (countryIso != null ? !countryIso.equals(countryIso2) : countryIso2 != null) {
                return false;
            }
            String notice = getNotice();
            String notice2 = dataDTO.getNotice();
            if (notice != null ? !notice.equals(notice2) : notice2 != null) {
                return false;
            }
            RoomLevelDTO roomLevel = getRoomLevel();
            RoomLevelDTO roomLevel2 = dataDTO.getRoomLevel();
            if (roomLevel != null ? !roomLevel.equals(roomLevel2) : roomLevel2 != null) {
                return false;
            }
            List<AdminListDTO> adminList = getAdminList();
            List<AdminListDTO> adminList2 = dataDTO.getAdminList();
            if (adminList != null ? !adminList.equals(adminList2) : adminList2 != null) {
                return false;
            }
            AdminListDTO masterInfo = getMasterInfo();
            AdminListDTO masterInfo2 = dataDTO.getMasterInfo();
            return masterInfo != null ? masterInfo.equals(masterInfo2) : masterInfo2 == null;
        }

        public Integer getAdminCnt() {
            return this.adminCnt;
        }

        public List<AdminListDTO> getAdminList() {
            return this.adminList;
        }

        public String getCountryIso() {
            return this.countryIso;
        }

        public String getCountryName() {
            return this.countryName;
        }

        public String getCover() {
            return this.cover;
        }

        public Integer getCustomId() {
            return this.customId;
        }

        public Double getExp() {
            return this.exp;
        }

        public Integer getFansCount() {
            return this.fansCount;
        }

        public Integer getId() {
            return this.f34889id;
        }

        public Integer getIsJoin() {
            return this.isJoin;
        }

        public String getLanguage() {
            return this.language;
        }

        public Integer getLevel() {
            return this.level;
        }

        public AdminListDTO getMasterInfo() {
            return this.masterInfo;
        }

        public Integer getMaxAdmin() {
            return this.maxAdmin;
        }

        public String getName() {
            return this.name;
        }

        public String getNotice() {
            return this.notice;
        }

        public Integer getOwnerUid() {
            return this.ownerUid;
        }

        public RoomLevelDTO getRoomLevel() {
            return this.roomLevel;
        }

        public String getRoomName() {
            return this.roomName;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer ownerUid = getOwnerUid();
            int iHashCode2 = ((iHashCode + 59) * 59) + (ownerUid == null ? 43 : ownerUid.hashCode());
            Integer customId = getCustomId();
            int iHashCode3 = (iHashCode2 * 59) + (customId == null ? 43 : customId.hashCode());
            Integer maxAdmin = getMaxAdmin();
            int iHashCode4 = (iHashCode3 * 59) + (maxAdmin == null ? 43 : maxAdmin.hashCode());
            Integer adminCnt = getAdminCnt();
            int iHashCode5 = (iHashCode4 * 59) + (adminCnt == null ? 43 : adminCnt.hashCode());
            Integer fansCount = getFansCount();
            int iHashCode6 = (iHashCode5 * 59) + (fansCount == null ? 43 : fansCount.hashCode());
            Integer level = getLevel();
            int iHashCode7 = (iHashCode6 * 59) + (level == null ? 43 : level.hashCode());
            Double exp = getExp();
            int iHashCode8 = (iHashCode7 * 59) + (exp == null ? 43 : exp.hashCode());
            Integer isJoin = getIsJoin();
            int iHashCode9 = (iHashCode8 * 59) + (isJoin == null ? 43 : isJoin.hashCode());
            String roomName = getRoomName();
            int iHashCode10 = (iHashCode9 * 59) + (roomName == null ? 43 : roomName.hashCode());
            String name = getName();
            int iHashCode11 = (iHashCode10 * 59) + (name == null ? 43 : name.hashCode());
            String cover = getCover();
            int iHashCode12 = (iHashCode11 * 59) + (cover == null ? 43 : cover.hashCode());
            String language = getLanguage();
            int iHashCode13 = (iHashCode12 * 59) + (language == null ? 43 : language.hashCode());
            String countryName = getCountryName();
            int iHashCode14 = (iHashCode13 * 59) + (countryName == null ? 43 : countryName.hashCode());
            String countryIso = getCountryIso();
            int iHashCode15 = (iHashCode14 * 59) + (countryIso == null ? 43 : countryIso.hashCode());
            String notice = getNotice();
            int iHashCode16 = (iHashCode15 * 59) + (notice == null ? 43 : notice.hashCode());
            RoomLevelDTO roomLevel = getRoomLevel();
            int iHashCode17 = (iHashCode16 * 59) + (roomLevel == null ? 43 : roomLevel.hashCode());
            List<AdminListDTO> adminList = getAdminList();
            int iHashCode18 = (iHashCode17 * 59) + (adminList == null ? 43 : adminList.hashCode());
            AdminListDTO masterInfo = getMasterInfo();
            return (iHashCode18 * 59) + (masterInfo != null ? masterInfo.hashCode() : 43);
        }

        public void setAdminCnt(Integer num) {
            this.adminCnt = num;
        }

        public void setAdminList(List<AdminListDTO> list) {
            this.adminList = list;
        }

        public void setCountryIso(String str) {
            this.countryIso = str;
        }

        public void setCountryName(String str) {
            this.countryName = str;
        }

        public void setCover(String str) {
            this.cover = str;
        }

        public void setCustomId(Integer num) {
            this.customId = num;
        }

        public void setExp(Double d10) {
            this.exp = d10;
        }

        public void setFansCount(Integer num) {
            this.fansCount = num;
        }

        public void setId(Integer num) {
            this.f34889id = num;
        }

        public void setIsJoin(Integer num) {
            this.isJoin = num;
        }

        public void setLanguage(String str) {
            this.language = str;
        }

        public void setLevel(Integer num) {
            this.level = num;
        }

        public void setMasterInfo(AdminListDTO adminListDTO) {
            this.masterInfo = adminListDTO;
        }

        public void setMaxAdmin(Integer num) {
            this.maxAdmin = num;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setNotice(String str) {
            this.notice = str;
        }

        public void setOwnerUid(Integer num) {
            this.ownerUid = num;
        }

        public void setRoomLevel(RoomLevelDTO roomLevelDTO) {
            this.roomLevel = roomLevelDTO;
        }

        public void setRoomName(String str) {
            this.roomName = str;
        }

        public String toString() {
            return "RoomDetatisInfoBean.DataDTO(id=" + getId() + ", roomName=" + getRoomName() + ", name=" + getName() + ", cover=" + getCover() + ", ownerUid=" + getOwnerUid() + ", customId=" + getCustomId() + ", maxAdmin=" + getMaxAdmin() + ", adminCnt=" + getAdminCnt() + ", fansCount=" + getFansCount() + ", language=" + getLanguage() + ", countryName=" + getCountryName() + ", countryIso=" + getCountryIso() + ", notice=" + getNotice() + ", level=" + getLevel() + ", exp=" + getExp() + ", roomLevel=" + getRoomLevel() + ", adminList=" + getAdminList() + ", masterInfo=" + getMasterInfo() + ", isJoin=" + getIsJoin() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof RoomDetatisInfoBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoomDetatisInfoBean)) {
            return false;
        }
        RoomDetatisInfoBean roomDetatisInfoBean = (RoomDetatisInfoBean) obj;
        if (!roomDetatisInfoBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = roomDetatisInfoBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = roomDetatisInfoBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = roomDetatisInfoBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = roomDetatisInfoBean.getData();
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
        return "RoomDetatisInfoBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
