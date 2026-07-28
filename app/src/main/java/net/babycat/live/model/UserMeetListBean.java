package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class UserMeetListBean {

    @SerializedName("age")
    private Integer age;

    @SerializedName("anchor_level")
    private Integer anchorLevel;

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("birthday")
    private String birthday;

    @SerializedName("country")
    private String country;

    @SerializedName("country_code")
    private Integer countryCode;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34916id;

    @SerializedName("level")
    private Integer level;

    @SerializedName("nickname")
    private String nickname;

    @SerializedName("online_roomid")
    private Integer onlineRoomid;

    @SerializedName("sex")
    private Integer sex;

    @SerializedName("user_id")
    private Integer userId;

    public boolean canEqual(Object obj) {
        return obj instanceof UserMeetListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserMeetListBean)) {
            return false;
        }
        UserMeetListBean userMeetListBean = (UserMeetListBean) obj;
        if (!userMeetListBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = userMeetListBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer sex = getSex();
        Integer sex2 = userMeetListBean.getSex();
        if (sex != null ? !sex.equals(sex2) : sex2 != null) {
            return false;
        }
        Integer level = getLevel();
        Integer level2 = userMeetListBean.getLevel();
        if (level != null ? !level.equals(level2) : level2 != null) {
            return false;
        }
        Integer anchorLevel = getAnchorLevel();
        Integer anchorLevel2 = userMeetListBean.getAnchorLevel();
        if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
            return false;
        }
        Integer onlineRoomid = getOnlineRoomid();
        Integer onlineRoomid2 = userMeetListBean.getOnlineRoomid();
        if (onlineRoomid != null ? !onlineRoomid.equals(onlineRoomid2) : onlineRoomid2 != null) {
            return false;
        }
        Integer countryCode = getCountryCode();
        Integer countryCode2 = userMeetListBean.getCountryCode();
        if (countryCode != null ? !countryCode.equals(countryCode2) : countryCode2 != null) {
            return false;
        }
        Integer age = getAge();
        Integer age2 = userMeetListBean.getAge();
        if (age != null ? !age.equals(age2) : age2 != null) {
            return false;
        }
        Integer userId = getUserId();
        Integer userId2 = userMeetListBean.getUserId();
        if (userId != null ? !userId.equals(userId2) : userId2 != null) {
            return false;
        }
        String nickname = getNickname();
        String nickname2 = userMeetListBean.getNickname();
        if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
            return false;
        }
        String avatar = getAvatar();
        String avatar2 = userMeetListBean.getAvatar();
        if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
            return false;
        }
        String birthday = getBirthday();
        String birthday2 = userMeetListBean.getBirthday();
        if (birthday != null ? !birthday.equals(birthday2) : birthday2 != null) {
            return false;
        }
        String country = getCountry();
        String country2 = userMeetListBean.getCountry();
        return country != null ? country.equals(country2) : country2 == null;
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

    public String getBirthday() {
        return this.birthday;
    }

    public String getCountry() {
        return this.country;
    }

    public Integer getCountryCode() {
        return this.countryCode;
    }

    public Integer getId() {
        return this.f34916id;
    }

    public Integer getLevel() {
        return this.level;
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

    public Integer getUserId() {
        return this.userId;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        Integer sex = getSex();
        int iHashCode2 = ((iHashCode + 59) * 59) + (sex == null ? 43 : sex.hashCode());
        Integer level = getLevel();
        int iHashCode3 = (iHashCode2 * 59) + (level == null ? 43 : level.hashCode());
        Integer anchorLevel = getAnchorLevel();
        int iHashCode4 = (iHashCode3 * 59) + (anchorLevel == null ? 43 : anchorLevel.hashCode());
        Integer onlineRoomid = getOnlineRoomid();
        int iHashCode5 = (iHashCode4 * 59) + (onlineRoomid == null ? 43 : onlineRoomid.hashCode());
        Integer countryCode = getCountryCode();
        int iHashCode6 = (iHashCode5 * 59) + (countryCode == null ? 43 : countryCode.hashCode());
        Integer age = getAge();
        int iHashCode7 = (iHashCode6 * 59) + (age == null ? 43 : age.hashCode());
        Integer userId = getUserId();
        int iHashCode8 = (iHashCode7 * 59) + (userId == null ? 43 : userId.hashCode());
        String nickname = getNickname();
        int iHashCode9 = (iHashCode8 * 59) + (nickname == null ? 43 : nickname.hashCode());
        String avatar = getAvatar();
        int iHashCode10 = (iHashCode9 * 59) + (avatar == null ? 43 : avatar.hashCode());
        String birthday = getBirthday();
        int iHashCode11 = (iHashCode10 * 59) + (birthday == null ? 43 : birthday.hashCode());
        String country = getCountry();
        return (iHashCode11 * 59) + (country != null ? country.hashCode() : 43);
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

    public void setBirthday(String str) {
        this.birthday = str;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setCountryCode(Integer num) {
        this.countryCode = num;
    }

    public void setId(Integer num) {
        this.f34916id = num;
    }

    public void setLevel(Integer num) {
        this.level = num;
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

    public void setUserId(Integer num) {
        this.userId = num;
    }

    public String toString() {
        return "UserMeetListBean(id=" + getId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", sex=" + getSex() + ", birthday=" + getBirthday() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ", onlineRoomid=" + getOnlineRoomid() + ", countryCode=" + getCountryCode() + ", age=" + getAge() + ", userId=" + getUserId() + ", country=" + getCountry() + ")";
    }
}
