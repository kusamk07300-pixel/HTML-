package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class HotListBean {

    @SerializedName("countrycodelist")
    private List<CountrycodelistDTO> countrycodelist;

    @SerializedName("list")
    private List<RoomListBean> list;

    @SerializedName("rank")
    private RankDTO rank;

    @SerializedName("slide")
    private List<BannerDataBean> slide;

    public static class CountrycodelistDTO {

        @SerializedName("code")
        private String code;

        @SerializedName("country")
        private String country;

        @SerializedName("is_select")
        private boolean isSelect;

        public CountrycodelistDTO() {
        }

        public boolean canEqual(Object obj) {
            return obj instanceof CountrycodelistDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CountrycodelistDTO)) {
                return false;
            }
            CountrycodelistDTO countrycodelistDTO = (CountrycodelistDTO) obj;
            if (!countrycodelistDTO.canEqual(this) || isSelect() != countrycodelistDTO.isSelect()) {
                return false;
            }
            String code = getCode();
            String code2 = countrycodelistDTO.getCode();
            if (code != null ? !code.equals(code2) : code2 != null) {
                return false;
            }
            String country = getCountry();
            String country2 = countrycodelistDTO.getCountry();
            return country != null ? country.equals(country2) : country2 == null;
        }

        public String getCode() {
            return this.code;
        }

        public String getCountry() {
            return this.country;
        }

        public int hashCode() {
            int i10 = isSelect() ? 79 : 97;
            String code = getCode();
            int iHashCode = ((i10 + 59) * 59) + (code == null ? 43 : code.hashCode());
            String country = getCountry();
            return (iHashCode * 59) + (country != null ? country.hashCode() : 43);
        }

        public boolean isSelect() {
            return this.isSelect;
        }

        public void setCode(String str) {
            this.code = str;
        }

        public void setCountry(String str) {
            this.country = str;
        }

        public void setSelect(boolean z10) {
            this.isSelect = z10;
        }

        public String toString() {
            return "HotListBean.CountrycodelistDTO(code=" + getCode() + ", country=" + getCountry() + ", isSelect=" + isSelect() + ")";
        }

        public CountrycodelistDTO(String str, String str2, boolean z10) {
            this.code = str;
            this.country = str2;
            this.isSelect = z10;
        }
    }

    public static class RankDTO {

        /* JADX INFO: renamed from: in, reason: collision with root package name */
        @SerializedName("in")
        private List<InDTO> f34844in;

        @SerializedName("out")
        private List<OutDTO> out;

        public static class CpDTO {

            @SerializedName("cpfriends")
            private List<CpfriendsDTO> cpfriends;

            @SerializedName("cplover")
            private List<CploverDTO> cplover;

            public static class CpfriendsDTO {

                @SerializedName("create_time")
                private String createTime;

                @SerializedName("exp")
                private Integer exp;

                /* JADX INFO: renamed from: id, reason: collision with root package name */
                @SerializedName("id")
                private Integer f34845id;

                @SerializedName("to_user")
                private ToUserDTO toUser;

                @SerializedName("touid")
                private Integer touid;

                @SerializedName("type")
                private Integer type;

                @SerializedName("uid")
                private Integer uid;

                @SerializedName("update_time")
                private String updateTime;

                @SerializedName("user")
                private UserDTO user;

                @SerializedName("week")
                private Integer week;

                @SerializedName("year")
                private Integer year;

                public static class ToUserDTO {

                    @SerializedName("avatar")
                    private String avatar;

                    /* JADX INFO: renamed from: id, reason: collision with root package name */
                    @SerializedName("id")
                    private String f34846id;

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
                        String id2 = getId();
                        String id3 = toUserDTO.getId();
                        if (id2 != null ? !id2.equals(id3) : id3 != null) {
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

                    public String getId() {
                        return this.f34846id;
                    }

                    public String getNickname() {
                        return this.nickname;
                    }

                    public int hashCode() {
                        String id2 = getId();
                        int iHashCode = id2 == null ? 43 : id2.hashCode();
                        String nickname = getNickname();
                        int iHashCode2 = ((iHashCode + 59) * 59) + (nickname == null ? 43 : nickname.hashCode());
                        String avatar = getAvatar();
                        return (iHashCode2 * 59) + (avatar != null ? avatar.hashCode() : 43);
                    }

                    public void setAvatar(String str) {
                        this.avatar = str;
                    }

                    public void setId(String str) {
                        this.f34846id = str;
                    }

                    public void setNickname(String str) {
                        this.nickname = str;
                    }

                    public String toString() {
                        return "HotListBean.RankDTO.CpDTO.CpfriendsDTO.ToUserDTO(id=" + getId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ")";
                    }
                }

                public static class UserDTO {

                    @SerializedName("avatar")
                    private String avatar;

                    /* JADX INFO: renamed from: id, reason: collision with root package name */
                    @SerializedName("id")
                    private String f34847id;

                    @SerializedName("nickname")
                    private String nickname;

                    public boolean canEqual(Object obj) {
                        return obj instanceof UserDTO;
                    }

                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof UserDTO)) {
                            return false;
                        }
                        UserDTO userDTO = (UserDTO) obj;
                        if (!userDTO.canEqual(this)) {
                            return false;
                        }
                        String id2 = getId();
                        String id3 = userDTO.getId();
                        if (id2 != null ? !id2.equals(id3) : id3 != null) {
                            return false;
                        }
                        String nickname = getNickname();
                        String nickname2 = userDTO.getNickname();
                        if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                            return false;
                        }
                        String avatar = getAvatar();
                        String avatar2 = userDTO.getAvatar();
                        return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
                    }

                    public String getAvatar() {
                        return this.avatar;
                    }

                    public String getId() {
                        return this.f34847id;
                    }

                    public String getNickname() {
                        return this.nickname;
                    }

                    public int hashCode() {
                        String id2 = getId();
                        int iHashCode = id2 == null ? 43 : id2.hashCode();
                        String nickname = getNickname();
                        int iHashCode2 = ((iHashCode + 59) * 59) + (nickname == null ? 43 : nickname.hashCode());
                        String avatar = getAvatar();
                        return (iHashCode2 * 59) + (avatar != null ? avatar.hashCode() : 43);
                    }

                    public void setAvatar(String str) {
                        this.avatar = str;
                    }

                    public void setId(String str) {
                        this.f34847id = str;
                    }

                    public void setNickname(String str) {
                        this.nickname = str;
                    }

                    public String toString() {
                        return "HotListBean.RankDTO.CpDTO.CpfriendsDTO.UserDTO(id=" + getId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ")";
                    }
                }

                public boolean canEqual(Object obj) {
                    return obj instanceof CpfriendsDTO;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof CpfriendsDTO)) {
                        return false;
                    }
                    CpfriendsDTO cpfriendsDTO = (CpfriendsDTO) obj;
                    if (!cpfriendsDTO.canEqual(this)) {
                        return false;
                    }
                    Integer id2 = getId();
                    Integer id3 = cpfriendsDTO.getId();
                    if (id2 != null ? !id2.equals(id3) : id3 != null) {
                        return false;
                    }
                    Integer uid = getUid();
                    Integer uid2 = cpfriendsDTO.getUid();
                    if (uid != null ? !uid.equals(uid2) : uid2 != null) {
                        return false;
                    }
                    Integer touid = getTouid();
                    Integer touid2 = cpfriendsDTO.getTouid();
                    if (touid != null ? !touid.equals(touid2) : touid2 != null) {
                        return false;
                    }
                    Integer type = getType();
                    Integer type2 = cpfriendsDTO.getType();
                    if (type != null ? !type.equals(type2) : type2 != null) {
                        return false;
                    }
                    Integer exp = getExp();
                    Integer exp2 = cpfriendsDTO.getExp();
                    if (exp != null ? !exp.equals(exp2) : exp2 != null) {
                        return false;
                    }
                    Integer year = getYear();
                    Integer year2 = cpfriendsDTO.getYear();
                    if (year != null ? !year.equals(year2) : year2 != null) {
                        return false;
                    }
                    Integer week = getWeek();
                    Integer week2 = cpfriendsDTO.getWeek();
                    if (week != null ? !week.equals(week2) : week2 != null) {
                        return false;
                    }
                    String createTime = getCreateTime();
                    String createTime2 = cpfriendsDTO.getCreateTime();
                    if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
                        return false;
                    }
                    String updateTime = getUpdateTime();
                    String updateTime2 = cpfriendsDTO.getUpdateTime();
                    if (updateTime != null ? !updateTime.equals(updateTime2) : updateTime2 != null) {
                        return false;
                    }
                    UserDTO user = getUser();
                    UserDTO user2 = cpfriendsDTO.getUser();
                    if (user != null ? !user.equals(user2) : user2 != null) {
                        return false;
                    }
                    ToUserDTO toUser = getToUser();
                    ToUserDTO toUser2 = cpfriendsDTO.getToUser();
                    return toUser != null ? toUser.equals(toUser2) : toUser2 == null;
                }

                public String getCreateTime() {
                    return this.createTime;
                }

                public Integer getExp() {
                    return this.exp;
                }

                public Integer getId() {
                    return this.f34845id;
                }

                public ToUserDTO getToUser() {
                    return this.toUser;
                }

                public Integer getTouid() {
                    return this.touid;
                }

                public Integer getType() {
                    return this.type;
                }

                public Integer getUid() {
                    return this.uid;
                }

                public String getUpdateTime() {
                    return this.updateTime;
                }

                public UserDTO getUser() {
                    return this.user;
                }

                public Integer getWeek() {
                    return this.week;
                }

                public Integer getYear() {
                    return this.year;
                }

                public int hashCode() {
                    Integer id2 = getId();
                    int iHashCode = id2 == null ? 43 : id2.hashCode();
                    Integer uid = getUid();
                    int iHashCode2 = ((iHashCode + 59) * 59) + (uid == null ? 43 : uid.hashCode());
                    Integer touid = getTouid();
                    int iHashCode3 = (iHashCode2 * 59) + (touid == null ? 43 : touid.hashCode());
                    Integer type = getType();
                    int iHashCode4 = (iHashCode3 * 59) + (type == null ? 43 : type.hashCode());
                    Integer exp = getExp();
                    int iHashCode5 = (iHashCode4 * 59) + (exp == null ? 43 : exp.hashCode());
                    Integer year = getYear();
                    int iHashCode6 = (iHashCode5 * 59) + (year == null ? 43 : year.hashCode());
                    Integer week = getWeek();
                    int iHashCode7 = (iHashCode6 * 59) + (week == null ? 43 : week.hashCode());
                    String createTime = getCreateTime();
                    int iHashCode8 = (iHashCode7 * 59) + (createTime == null ? 43 : createTime.hashCode());
                    String updateTime = getUpdateTime();
                    int iHashCode9 = (iHashCode8 * 59) + (updateTime == null ? 43 : updateTime.hashCode());
                    UserDTO user = getUser();
                    int iHashCode10 = (iHashCode9 * 59) + (user == null ? 43 : user.hashCode());
                    ToUserDTO toUser = getToUser();
                    return (iHashCode10 * 59) + (toUser != null ? toUser.hashCode() : 43);
                }

                public void setCreateTime(String str) {
                    this.createTime = str;
                }

                public void setExp(Integer num) {
                    this.exp = num;
                }

                public void setId(Integer num) {
                    this.f34845id = num;
                }

                public void setToUser(ToUserDTO toUserDTO) {
                    this.toUser = toUserDTO;
                }

                public void setTouid(Integer num) {
                    this.touid = num;
                }

                public void setType(Integer num) {
                    this.type = num;
                }

                public void setUid(Integer num) {
                    this.uid = num;
                }

                public void setUpdateTime(String str) {
                    this.updateTime = str;
                }

                public void setUser(UserDTO userDTO) {
                    this.user = userDTO;
                }

                public void setWeek(Integer num) {
                    this.week = num;
                }

                public void setYear(Integer num) {
                    this.year = num;
                }

                public String toString() {
                    return "HotListBean.RankDTO.CpDTO.CpfriendsDTO(id=" + getId() + ", uid=" + getUid() + ", touid=" + getTouid() + ", type=" + getType() + ", exp=" + getExp() + ", year=" + getYear() + ", week=" + getWeek() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ", user=" + getUser() + ", toUser=" + getToUser() + ")";
                }
            }

            public static class CploverDTO {

                @SerializedName("create_time")
                private String createTime;

                @SerializedName("exp")
                private Integer exp;

                /* JADX INFO: renamed from: id, reason: collision with root package name */
                @SerializedName("id")
                private Integer f34848id;

                @SerializedName("to_user")
                private ToUserDTO toUser;

                @SerializedName("touid")
                private Integer touid;

                @SerializedName("type")
                private Integer type;

                @SerializedName("uid")
                private Integer uid;

                @SerializedName("update_time")
                private String updateTime;

                @SerializedName("user")
                private UserDTO user;

                @SerializedName("week")
                private Integer week;

                @SerializedName("year")
                private Integer year;

                public static class ToUserDTO {

                    @SerializedName("avatar")
                    private String avatar;

                    /* JADX INFO: renamed from: id, reason: collision with root package name */
                    @SerializedName("id")
                    private String f34849id;

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
                        String id2 = getId();
                        String id3 = toUserDTO.getId();
                        if (id2 != null ? !id2.equals(id3) : id3 != null) {
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

                    public String getId() {
                        return this.f34849id;
                    }

                    public String getNickname() {
                        return this.nickname;
                    }

                    public int hashCode() {
                        String id2 = getId();
                        int iHashCode = id2 == null ? 43 : id2.hashCode();
                        String nickname = getNickname();
                        int iHashCode2 = ((iHashCode + 59) * 59) + (nickname == null ? 43 : nickname.hashCode());
                        String avatar = getAvatar();
                        return (iHashCode2 * 59) + (avatar != null ? avatar.hashCode() : 43);
                    }

                    public void setAvatar(String str) {
                        this.avatar = str;
                    }

                    public void setId(String str) {
                        this.f34849id = str;
                    }

                    public void setNickname(String str) {
                        this.nickname = str;
                    }

                    public String toString() {
                        return "HotListBean.RankDTO.CpDTO.CploverDTO.ToUserDTO(id=" + getId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ")";
                    }
                }

                public static class UserDTO {

                    @SerializedName("avatar")
                    private String avatar;

                    /* JADX INFO: renamed from: id, reason: collision with root package name */
                    @SerializedName("id")
                    private String f34850id;

                    @SerializedName("nickname")
                    private String nickname;

                    public boolean canEqual(Object obj) {
                        return obj instanceof UserDTO;
                    }

                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof UserDTO)) {
                            return false;
                        }
                        UserDTO userDTO = (UserDTO) obj;
                        if (!userDTO.canEqual(this)) {
                            return false;
                        }
                        String id2 = getId();
                        String id3 = userDTO.getId();
                        if (id2 != null ? !id2.equals(id3) : id3 != null) {
                            return false;
                        }
                        String nickname = getNickname();
                        String nickname2 = userDTO.getNickname();
                        if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                            return false;
                        }
                        String avatar = getAvatar();
                        String avatar2 = userDTO.getAvatar();
                        return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
                    }

                    public String getAvatar() {
                        return this.avatar;
                    }

                    public String getId() {
                        return this.f34850id;
                    }

                    public String getNickname() {
                        return this.nickname;
                    }

                    public int hashCode() {
                        String id2 = getId();
                        int iHashCode = id2 == null ? 43 : id2.hashCode();
                        String nickname = getNickname();
                        int iHashCode2 = ((iHashCode + 59) * 59) + (nickname == null ? 43 : nickname.hashCode());
                        String avatar = getAvatar();
                        return (iHashCode2 * 59) + (avatar != null ? avatar.hashCode() : 43);
                    }

                    public void setAvatar(String str) {
                        this.avatar = str;
                    }

                    public void setId(String str) {
                        this.f34850id = str;
                    }

                    public void setNickname(String str) {
                        this.nickname = str;
                    }

                    public String toString() {
                        return "HotListBean.RankDTO.CpDTO.CploverDTO.UserDTO(id=" + getId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ")";
                    }
                }

                public boolean canEqual(Object obj) {
                    return obj instanceof CploverDTO;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof CploverDTO)) {
                        return false;
                    }
                    CploverDTO cploverDTO = (CploverDTO) obj;
                    if (!cploverDTO.canEqual(this)) {
                        return false;
                    }
                    Integer id2 = getId();
                    Integer id3 = cploverDTO.getId();
                    if (id2 != null ? !id2.equals(id3) : id3 != null) {
                        return false;
                    }
                    Integer uid = getUid();
                    Integer uid2 = cploverDTO.getUid();
                    if (uid != null ? !uid.equals(uid2) : uid2 != null) {
                        return false;
                    }
                    Integer touid = getTouid();
                    Integer touid2 = cploverDTO.getTouid();
                    if (touid != null ? !touid.equals(touid2) : touid2 != null) {
                        return false;
                    }
                    Integer type = getType();
                    Integer type2 = cploverDTO.getType();
                    if (type != null ? !type.equals(type2) : type2 != null) {
                        return false;
                    }
                    Integer exp = getExp();
                    Integer exp2 = cploverDTO.getExp();
                    if (exp != null ? !exp.equals(exp2) : exp2 != null) {
                        return false;
                    }
                    Integer year = getYear();
                    Integer year2 = cploverDTO.getYear();
                    if (year != null ? !year.equals(year2) : year2 != null) {
                        return false;
                    }
                    Integer week = getWeek();
                    Integer week2 = cploverDTO.getWeek();
                    if (week != null ? !week.equals(week2) : week2 != null) {
                        return false;
                    }
                    String createTime = getCreateTime();
                    String createTime2 = cploverDTO.getCreateTime();
                    if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
                        return false;
                    }
                    String updateTime = getUpdateTime();
                    String updateTime2 = cploverDTO.getUpdateTime();
                    if (updateTime != null ? !updateTime.equals(updateTime2) : updateTime2 != null) {
                        return false;
                    }
                    UserDTO user = getUser();
                    UserDTO user2 = cploverDTO.getUser();
                    if (user != null ? !user.equals(user2) : user2 != null) {
                        return false;
                    }
                    ToUserDTO toUser = getToUser();
                    ToUserDTO toUser2 = cploverDTO.getToUser();
                    return toUser != null ? toUser.equals(toUser2) : toUser2 == null;
                }

                public String getCreateTime() {
                    return this.createTime;
                }

                public Integer getExp() {
                    return this.exp;
                }

                public Integer getId() {
                    return this.f34848id;
                }

                public ToUserDTO getToUser() {
                    return this.toUser;
                }

                public Integer getTouid() {
                    return this.touid;
                }

                public Integer getType() {
                    return this.type;
                }

                public Integer getUid() {
                    return this.uid;
                }

                public String getUpdateTime() {
                    return this.updateTime;
                }

                public UserDTO getUser() {
                    return this.user;
                }

                public Integer getWeek() {
                    return this.week;
                }

                public Integer getYear() {
                    return this.year;
                }

                public int hashCode() {
                    Integer id2 = getId();
                    int iHashCode = id2 == null ? 43 : id2.hashCode();
                    Integer uid = getUid();
                    int iHashCode2 = ((iHashCode + 59) * 59) + (uid == null ? 43 : uid.hashCode());
                    Integer touid = getTouid();
                    int iHashCode3 = (iHashCode2 * 59) + (touid == null ? 43 : touid.hashCode());
                    Integer type = getType();
                    int iHashCode4 = (iHashCode3 * 59) + (type == null ? 43 : type.hashCode());
                    Integer exp = getExp();
                    int iHashCode5 = (iHashCode4 * 59) + (exp == null ? 43 : exp.hashCode());
                    Integer year = getYear();
                    int iHashCode6 = (iHashCode5 * 59) + (year == null ? 43 : year.hashCode());
                    Integer week = getWeek();
                    int iHashCode7 = (iHashCode6 * 59) + (week == null ? 43 : week.hashCode());
                    String createTime = getCreateTime();
                    int iHashCode8 = (iHashCode7 * 59) + (createTime == null ? 43 : createTime.hashCode());
                    String updateTime = getUpdateTime();
                    int iHashCode9 = (iHashCode8 * 59) + (updateTime == null ? 43 : updateTime.hashCode());
                    UserDTO user = getUser();
                    int iHashCode10 = (iHashCode9 * 59) + (user == null ? 43 : user.hashCode());
                    ToUserDTO toUser = getToUser();
                    return (iHashCode10 * 59) + (toUser != null ? toUser.hashCode() : 43);
                }

                public void setCreateTime(String str) {
                    this.createTime = str;
                }

                public void setExp(Integer num) {
                    this.exp = num;
                }

                public void setId(Integer num) {
                    this.f34848id = num;
                }

                public void setToUser(ToUserDTO toUserDTO) {
                    this.toUser = toUserDTO;
                }

                public void setTouid(Integer num) {
                    this.touid = num;
                }

                public void setType(Integer num) {
                    this.type = num;
                }

                public void setUid(Integer num) {
                    this.uid = num;
                }

                public void setUpdateTime(String str) {
                    this.updateTime = str;
                }

                public void setUser(UserDTO userDTO) {
                    this.user = userDTO;
                }

                public void setWeek(Integer num) {
                    this.week = num;
                }

                public void setYear(Integer num) {
                    this.year = num;
                }

                public String toString() {
                    return "HotListBean.RankDTO.CpDTO.CploverDTO(id=" + getId() + ", uid=" + getUid() + ", touid=" + getTouid() + ", type=" + getType() + ", exp=" + getExp() + ", year=" + getYear() + ", week=" + getWeek() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ", user=" + getUser() + ", toUser=" + getToUser() + ")";
                }
            }

            public boolean canEqual(Object obj) {
                return obj instanceof CpDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CpDTO)) {
                    return false;
                }
                CpDTO cpDTO = (CpDTO) obj;
                if (!cpDTO.canEqual(this)) {
                    return false;
                }
                List<CploverDTO> cplover = getCplover();
                List<CploverDTO> cplover2 = cpDTO.getCplover();
                if (cplover != null ? !cplover.equals(cplover2) : cplover2 != null) {
                    return false;
                }
                List<CpfriendsDTO> cpfriends = getCpfriends();
                List<CpfriendsDTO> cpfriends2 = cpDTO.getCpfriends();
                return cpfriends != null ? cpfriends.equals(cpfriends2) : cpfriends2 == null;
            }

            public List<CpfriendsDTO> getCpfriends() {
                return this.cpfriends;
            }

            public List<CploverDTO> getCplover() {
                return this.cplover;
            }

            public int hashCode() {
                List<CploverDTO> cplover = getCplover();
                int iHashCode = cplover == null ? 43 : cplover.hashCode();
                List<CpfriendsDTO> cpfriends = getCpfriends();
                return ((iHashCode + 59) * 59) + (cpfriends != null ? cpfriends.hashCode() : 43);
            }

            public void setCpfriends(List<CpfriendsDTO> list) {
                this.cpfriends = list;
            }

            public void setCplover(List<CploverDTO> list) {
                this.cplover = list;
            }

            public String toString() {
                return "HotListBean.RankDTO.CpDTO(cplover=" + getCplover() + ", cpfriends=" + getCpfriends() + ")";
            }
        }

        public static class InDTO {

            @SerializedName("rank")
            private Integer rank;

            @SerializedName("total")
            private Integer total;

            @SerializedName("uid")
            private Integer uid;

            @SerializedName("user")
            private UserDTO user;

            public static class UserDTO {

                @SerializedName("anchor_level")
                private Integer anchorLevel;

                @SerializedName("avatar")
                private String avatar;

                /* JADX INFO: renamed from: id, reason: collision with root package name */
                @SerializedName("id")
                private Integer f34851id;

                @SerializedName("level")
                private Integer level;

                @SerializedName("nickname")
                private String nickname;

                public boolean canEqual(Object obj) {
                    return obj instanceof UserDTO;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof UserDTO)) {
                        return false;
                    }
                    UserDTO userDTO = (UserDTO) obj;
                    if (!userDTO.canEqual(this)) {
                        return false;
                    }
                    Integer id2 = getId();
                    Integer id3 = userDTO.getId();
                    if (id2 != null ? !id2.equals(id3) : id3 != null) {
                        return false;
                    }
                    Integer level = getLevel();
                    Integer level2 = userDTO.getLevel();
                    if (level != null ? !level.equals(level2) : level2 != null) {
                        return false;
                    }
                    Integer anchorLevel = getAnchorLevel();
                    Integer anchorLevel2 = userDTO.getAnchorLevel();
                    if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
                        return false;
                    }
                    String nickname = getNickname();
                    String nickname2 = userDTO.getNickname();
                    if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                        return false;
                    }
                    String avatar = getAvatar();
                    String avatar2 = userDTO.getAvatar();
                    return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
                }

                public Integer getAnchorLevel() {
                    return this.anchorLevel;
                }

                public String getAvatar() {
                    return this.avatar;
                }

                public Integer getId() {
                    return this.f34851id;
                }

                public Integer getLevel() {
                    return this.level;
                }

                public String getNickname() {
                    return this.nickname;
                }

                public int hashCode() {
                    Integer id2 = getId();
                    int iHashCode = id2 == null ? 43 : id2.hashCode();
                    Integer level = getLevel();
                    int iHashCode2 = ((iHashCode + 59) * 59) + (level == null ? 43 : level.hashCode());
                    Integer anchorLevel = getAnchorLevel();
                    int iHashCode3 = (iHashCode2 * 59) + (anchorLevel == null ? 43 : anchorLevel.hashCode());
                    String nickname = getNickname();
                    int iHashCode4 = (iHashCode3 * 59) + (nickname == null ? 43 : nickname.hashCode());
                    String avatar = getAvatar();
                    return (iHashCode4 * 59) + (avatar != null ? avatar.hashCode() : 43);
                }

                public void setAnchorLevel(Integer num) {
                    this.anchorLevel = num;
                }

                public void setAvatar(String str) {
                    this.avatar = str;
                }

                public void setId(Integer num) {
                    this.f34851id = num;
                }

                public void setLevel(Integer num) {
                    this.level = num;
                }

                public void setNickname(String str) {
                    this.nickname = str;
                }

                public String toString() {
                    return "HotListBean.RankDTO.InDTO.UserDTO(id=" + getId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ")";
                }
            }

            public boolean canEqual(Object obj) {
                return obj instanceof InDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof InDTO)) {
                    return false;
                }
                InDTO inDTO = (InDTO) obj;
                if (!inDTO.canEqual(this)) {
                    return false;
                }
                Integer uid = getUid();
                Integer uid2 = inDTO.getUid();
                if (uid != null ? !uid.equals(uid2) : uid2 != null) {
                    return false;
                }
                Integer total = getTotal();
                Integer total2 = inDTO.getTotal();
                if (total != null ? !total.equals(total2) : total2 != null) {
                    return false;
                }
                Integer rank = getRank();
                Integer rank2 = inDTO.getRank();
                if (rank != null ? !rank.equals(rank2) : rank2 != null) {
                    return false;
                }
                UserDTO user = getUser();
                UserDTO user2 = inDTO.getUser();
                return user != null ? user.equals(user2) : user2 == null;
            }

            public Integer getRank() {
                return this.rank;
            }

            public Integer getTotal() {
                return this.total;
            }

            public Integer getUid() {
                return this.uid;
            }

            public UserDTO getUser() {
                return this.user;
            }

            public int hashCode() {
                Integer uid = getUid();
                int iHashCode = uid == null ? 43 : uid.hashCode();
                Integer total = getTotal();
                int iHashCode2 = ((iHashCode + 59) * 59) + (total == null ? 43 : total.hashCode());
                Integer rank = getRank();
                int iHashCode3 = (iHashCode2 * 59) + (rank == null ? 43 : rank.hashCode());
                UserDTO user = getUser();
                return (iHashCode3 * 59) + (user != null ? user.hashCode() : 43);
            }

            public void setRank(Integer num) {
                this.rank = num;
            }

            public void setTotal(Integer num) {
                this.total = num;
            }

            public void setUid(Integer num) {
                this.uid = num;
            }

            public void setUser(UserDTO userDTO) {
                this.user = userDTO;
            }

            public String toString() {
                return "HotListBean.RankDTO.InDTO(uid=" + getUid() + ", total=" + getTotal() + ", rank=" + getRank() + ", user=" + getUser() + ")";
            }
        }

        public static class OutDTO {

            @SerializedName("rank")
            private Integer rank;

            @SerializedName("total")
            private Integer total;

            @SerializedName("uid")
            private Integer uid;

            @SerializedName("user")
            private UserDTO user;

            public static class UserDTO {

                @SerializedName("anchor_level")
                private Integer anchorLevel;

                @SerializedName("avatar")
                private String avatar;

                /* JADX INFO: renamed from: id, reason: collision with root package name */
                @SerializedName("id")
                private Integer f34852id;

                @SerializedName("level")
                private Integer level;

                @SerializedName("nickname")
                private String nickname;

                public boolean canEqual(Object obj) {
                    return obj instanceof UserDTO;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof UserDTO)) {
                        return false;
                    }
                    UserDTO userDTO = (UserDTO) obj;
                    if (!userDTO.canEqual(this)) {
                        return false;
                    }
                    Integer id2 = getId();
                    Integer id3 = userDTO.getId();
                    if (id2 != null ? !id2.equals(id3) : id3 != null) {
                        return false;
                    }
                    Integer level = getLevel();
                    Integer level2 = userDTO.getLevel();
                    if (level != null ? !level.equals(level2) : level2 != null) {
                        return false;
                    }
                    Integer anchorLevel = getAnchorLevel();
                    Integer anchorLevel2 = userDTO.getAnchorLevel();
                    if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
                        return false;
                    }
                    String nickname = getNickname();
                    String nickname2 = userDTO.getNickname();
                    if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                        return false;
                    }
                    String avatar = getAvatar();
                    String avatar2 = userDTO.getAvatar();
                    return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
                }

                public Integer getAnchorLevel() {
                    return this.anchorLevel;
                }

                public String getAvatar() {
                    return this.avatar;
                }

                public Integer getId() {
                    return this.f34852id;
                }

                public Integer getLevel() {
                    return this.level;
                }

                public String getNickname() {
                    return this.nickname;
                }

                public int hashCode() {
                    Integer id2 = getId();
                    int iHashCode = id2 == null ? 43 : id2.hashCode();
                    Integer level = getLevel();
                    int iHashCode2 = ((iHashCode + 59) * 59) + (level == null ? 43 : level.hashCode());
                    Integer anchorLevel = getAnchorLevel();
                    int iHashCode3 = (iHashCode2 * 59) + (anchorLevel == null ? 43 : anchorLevel.hashCode());
                    String nickname = getNickname();
                    int iHashCode4 = (iHashCode3 * 59) + (nickname == null ? 43 : nickname.hashCode());
                    String avatar = getAvatar();
                    return (iHashCode4 * 59) + (avatar != null ? avatar.hashCode() : 43);
                }

                public void setAnchorLevel(Integer num) {
                    this.anchorLevel = num;
                }

                public void setAvatar(String str) {
                    this.avatar = str;
                }

                public void setId(Integer num) {
                    this.f34852id = num;
                }

                public void setLevel(Integer num) {
                    this.level = num;
                }

                public void setNickname(String str) {
                    this.nickname = str;
                }

                public String toString() {
                    return "HotListBean.RankDTO.OutDTO.UserDTO(id=" + getId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ")";
                }
            }

            public boolean canEqual(Object obj) {
                return obj instanceof OutDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof OutDTO)) {
                    return false;
                }
                OutDTO outDTO = (OutDTO) obj;
                if (!outDTO.canEqual(this)) {
                    return false;
                }
                Integer uid = getUid();
                Integer uid2 = outDTO.getUid();
                if (uid != null ? !uid.equals(uid2) : uid2 != null) {
                    return false;
                }
                Integer total = getTotal();
                Integer total2 = outDTO.getTotal();
                if (total != null ? !total.equals(total2) : total2 != null) {
                    return false;
                }
                Integer rank = getRank();
                Integer rank2 = outDTO.getRank();
                if (rank != null ? !rank.equals(rank2) : rank2 != null) {
                    return false;
                }
                UserDTO user = getUser();
                UserDTO user2 = outDTO.getUser();
                return user != null ? user.equals(user2) : user2 == null;
            }

            public Integer getRank() {
                return this.rank;
            }

            public Integer getTotal() {
                return this.total;
            }

            public Integer getUid() {
                return this.uid;
            }

            public UserDTO getUser() {
                return this.user;
            }

            public int hashCode() {
                Integer uid = getUid();
                int iHashCode = uid == null ? 43 : uid.hashCode();
                Integer total = getTotal();
                int iHashCode2 = ((iHashCode + 59) * 59) + (total == null ? 43 : total.hashCode());
                Integer rank = getRank();
                int iHashCode3 = (iHashCode2 * 59) + (rank == null ? 43 : rank.hashCode());
                UserDTO user = getUser();
                return (iHashCode3 * 59) + (user != null ? user.hashCode() : 43);
            }

            public void setRank(Integer num) {
                this.rank = num;
            }

            public void setTotal(Integer num) {
                this.total = num;
            }

            public void setUid(Integer num) {
                this.uid = num;
            }

            public void setUser(UserDTO userDTO) {
                this.user = userDTO;
            }

            public String toString() {
                return "HotListBean.RankDTO.OutDTO(uid=" + getUid() + ", total=" + getTotal() + ", rank=" + getRank() + ", user=" + getUser() + ")";
            }
        }

        public boolean canEqual(Object obj) {
            return obj instanceof RankDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RankDTO)) {
                return false;
            }
            RankDTO rankDTO = (RankDTO) obj;
            if (!rankDTO.canEqual(this)) {
                return false;
            }
            List<InDTO> in2 = getIn();
            List<InDTO> in3 = rankDTO.getIn();
            if (in2 != null ? !in2.equals(in3) : in3 != null) {
                return false;
            }
            List<OutDTO> out = getOut();
            List<OutDTO> out2 = rankDTO.getOut();
            return out != null ? out.equals(out2) : out2 == null;
        }

        public List<InDTO> getIn() {
            return this.f34844in;
        }

        public List<OutDTO> getOut() {
            return this.out;
        }

        public int hashCode() {
            List<InDTO> in2 = getIn();
            int iHashCode = in2 == null ? 43 : in2.hashCode();
            List<OutDTO> out = getOut();
            return ((iHashCode + 59) * 59) + (out != null ? out.hashCode() : 43);
        }

        public void setIn(List<InDTO> list) {
            this.f34844in = list;
        }

        public void setOut(List<OutDTO> list) {
            this.out = list;
        }

        public String toString() {
            return "HotListBean.RankDTO(in=" + getIn() + ", out=" + getOut() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof HotListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HotListBean)) {
            return false;
        }
        HotListBean hotListBean = (HotListBean) obj;
        if (!hotListBean.canEqual(this)) {
            return false;
        }
        List<BannerDataBean> slide = getSlide();
        List<BannerDataBean> slide2 = hotListBean.getSlide();
        if (slide != null ? !slide.equals(slide2) : slide2 != null) {
            return false;
        }
        RankDTO rank = getRank();
        RankDTO rank2 = hotListBean.getRank();
        if (rank != null ? !rank.equals(rank2) : rank2 != null) {
            return false;
        }
        List<CountrycodelistDTO> countrycodelist = getCountrycodelist();
        List<CountrycodelistDTO> countrycodelist2 = hotListBean.getCountrycodelist();
        if (countrycodelist != null ? !countrycodelist.equals(countrycodelist2) : countrycodelist2 != null) {
            return false;
        }
        List<RoomListBean> list = getList();
        List<RoomListBean> list2 = hotListBean.getList();
        return list != null ? list.equals(list2) : list2 == null;
    }

    public List<CountrycodelistDTO> getCountrycodelist() {
        return this.countrycodelist;
    }

    public List<RoomListBean> getList() {
        return this.list;
    }

    public RankDTO getRank() {
        return this.rank;
    }

    public List<BannerDataBean> getSlide() {
        return this.slide;
    }

    public int hashCode() {
        List<BannerDataBean> slide = getSlide();
        int iHashCode = slide == null ? 43 : slide.hashCode();
        RankDTO rank = getRank();
        int iHashCode2 = ((iHashCode + 59) * 59) + (rank == null ? 43 : rank.hashCode());
        List<CountrycodelistDTO> countrycodelist = getCountrycodelist();
        int iHashCode3 = (iHashCode2 * 59) + (countrycodelist == null ? 43 : countrycodelist.hashCode());
        List<RoomListBean> list = getList();
        return (iHashCode3 * 59) + (list != null ? list.hashCode() : 43);
    }

    public void setCountrycodelist(List<CountrycodelistDTO> list) {
        this.countrycodelist = list;
    }

    public void setList(List<RoomListBean> list) {
        this.list = list;
    }

    public void setRank(RankDTO rankDTO) {
        this.rank = rankDTO;
    }

    public void setSlide(List<BannerDataBean> list) {
        this.slide = list;
    }

    public String toString() {
        return "HotListBean(slide=" + getSlide() + ", rank=" + getRank() + ", countrycodelist=" + getCountrycodelist() + ", list=" + getList() + ")";
    }
}
