package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class UserProfile {

    @SerializedName("age")
    private Integer age;

    @SerializedName("anchor_level")
    private Integer anchorLevel;

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("city")
    private String city;

    @SerializedName("country_code")
    private String countryCode;

    @SerializedName("fans_count")
    private Integer fansCount;

    @SerializedName("garland")
    private String garland;

    @SerializedName("gender")
    private Integer gender;

    @SerializedName("is_follow")
    private Integer isFollow;

    @SerializedName("is_friend")
    private Integer isFriend;

    @SerializedName("is_real")
    private Integer isReal;

    @SerializedName("is_vip")
    private Integer isVip;

    @SerializedName("level")
    private Integer level;

    @SerializedName("nickname")
    private String nickname;

    @SerializedName("sex")
    private Integer sex;

    @SerializedName("slogan")
    private String slogan;

    @SerializedName("user_heat")
    private Integer userHeat;

    @SerializedName("user_id")
    private Integer userId;

    public boolean canEqual(Object obj) {
        return obj instanceof UserProfile;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserProfile)) {
            return false;
        }
        UserProfile userProfile = (UserProfile) obj;
        if (!userProfile.canEqual(this)) {
            return false;
        }
        Integer userId = getUserId();
        Integer userId2 = userProfile.getUserId();
        if (userId != null ? !userId.equals(userId2) : userId2 != null) {
            return false;
        }
        Integer gender = getGender();
        Integer gender2 = userProfile.getGender();
        if (gender != null ? !gender.equals(gender2) : gender2 != null) {
            return false;
        }
        Integer age = getAge();
        Integer age2 = userProfile.getAge();
        if (age != null ? !age.equals(age2) : age2 != null) {
            return false;
        }
        Integer sex = getSex();
        Integer sex2 = userProfile.getSex();
        if (sex != null ? !sex.equals(sex2) : sex2 != null) {
            return false;
        }
        Integer level = getLevel();
        Integer level2 = userProfile.getLevel();
        if (level != null ? !level.equals(level2) : level2 != null) {
            return false;
        }
        Integer anchorLevel = getAnchorLevel();
        Integer anchorLevel2 = userProfile.getAnchorLevel();
        if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
            return false;
        }
        Integer isVip = getIsVip();
        Integer isVip2 = userProfile.getIsVip();
        if (isVip != null ? !isVip.equals(isVip2) : isVip2 != null) {
            return false;
        }
        Integer isReal = getIsReal();
        Integer isReal2 = userProfile.getIsReal();
        if (isReal != null ? !isReal.equals(isReal2) : isReal2 != null) {
            return false;
        }
        Integer fansCount = getFansCount();
        Integer fansCount2 = userProfile.getFansCount();
        if (fansCount != null ? !fansCount.equals(fansCount2) : fansCount2 != null) {
            return false;
        }
        Integer userHeat = getUserHeat();
        Integer userHeat2 = userProfile.getUserHeat();
        if (userHeat != null ? !userHeat.equals(userHeat2) : userHeat2 != null) {
            return false;
        }
        Integer isFollow = getIsFollow();
        Integer isFollow2 = userProfile.getIsFollow();
        if (isFollow != null ? !isFollow.equals(isFollow2) : isFollow2 != null) {
            return false;
        }
        Integer isFriend = getIsFriend();
        Integer isFriend2 = userProfile.getIsFriend();
        if (isFriend != null ? !isFriend.equals(isFriend2) : isFriend2 != null) {
            return false;
        }
        String nickname = getNickname();
        String nickname2 = userProfile.getNickname();
        if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
            return false;
        }
        String avatar = getAvatar();
        String avatar2 = userProfile.getAvatar();
        if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
            return false;
        }
        String countryCode = getCountryCode();
        String countryCode2 = userProfile.getCountryCode();
        if (countryCode != null ? !countryCode.equals(countryCode2) : countryCode2 != null) {
            return false;
        }
        String city = getCity();
        String city2 = userProfile.getCity();
        if (city != null ? !city.equals(city2) : city2 != null) {
            return false;
        }
        String garland = getGarland();
        String garland2 = userProfile.getGarland();
        if (garland != null ? !garland.equals(garland2) : garland2 != null) {
            return false;
        }
        String slogan = getSlogan();
        String slogan2 = userProfile.getSlogan();
        return slogan != null ? slogan.equals(slogan2) : slogan2 == null;
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

    public String getCity() {
        return this.city;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public Integer getFansCount() {
        return this.fansCount;
    }

    public String getGarland() {
        return this.garland;
    }

    public Integer getGender() {
        return this.gender;
    }

    public Integer getIsFollow() {
        return this.isFollow;
    }

    public Integer getIsFriend() {
        return this.isFriend;
    }

    public Integer getIsReal() {
        return this.isReal;
    }

    public Integer getIsVip() {
        return this.isVip;
    }

    public Integer getLevel() {
        return this.level;
    }

    public String getNickname() {
        return this.nickname;
    }

    public Integer getSex() {
        return this.sex;
    }

    public String getSlogan() {
        return this.slogan;
    }

    public Integer getUserHeat() {
        return this.userHeat;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public int hashCode() {
        Integer userId = getUserId();
        int iHashCode = userId == null ? 43 : userId.hashCode();
        Integer gender = getGender();
        int iHashCode2 = ((iHashCode + 59) * 59) + (gender == null ? 43 : gender.hashCode());
        Integer age = getAge();
        int iHashCode3 = (iHashCode2 * 59) + (age == null ? 43 : age.hashCode());
        Integer sex = getSex();
        int iHashCode4 = (iHashCode3 * 59) + (sex == null ? 43 : sex.hashCode());
        Integer level = getLevel();
        int iHashCode5 = (iHashCode4 * 59) + (level == null ? 43 : level.hashCode());
        Integer anchorLevel = getAnchorLevel();
        int iHashCode6 = (iHashCode5 * 59) + (anchorLevel == null ? 43 : anchorLevel.hashCode());
        Integer isVip = getIsVip();
        int iHashCode7 = (iHashCode6 * 59) + (isVip == null ? 43 : isVip.hashCode());
        Integer isReal = getIsReal();
        int iHashCode8 = (iHashCode7 * 59) + (isReal == null ? 43 : isReal.hashCode());
        Integer fansCount = getFansCount();
        int iHashCode9 = (iHashCode8 * 59) + (fansCount == null ? 43 : fansCount.hashCode());
        Integer userHeat = getUserHeat();
        int iHashCode10 = (iHashCode9 * 59) + (userHeat == null ? 43 : userHeat.hashCode());
        Integer isFollow = getIsFollow();
        int iHashCode11 = (iHashCode10 * 59) + (isFollow == null ? 43 : isFollow.hashCode());
        Integer isFriend = getIsFriend();
        int iHashCode12 = (iHashCode11 * 59) + (isFriend == null ? 43 : isFriend.hashCode());
        String nickname = getNickname();
        int iHashCode13 = (iHashCode12 * 59) + (nickname == null ? 43 : nickname.hashCode());
        String avatar = getAvatar();
        int iHashCode14 = (iHashCode13 * 59) + (avatar == null ? 43 : avatar.hashCode());
        String countryCode = getCountryCode();
        int iHashCode15 = (iHashCode14 * 59) + (countryCode == null ? 43 : countryCode.hashCode());
        String city = getCity();
        int iHashCode16 = (iHashCode15 * 59) + (city == null ? 43 : city.hashCode());
        String garland = getGarland();
        int iHashCode17 = (iHashCode16 * 59) + (garland == null ? 43 : garland.hashCode());
        String slogan = getSlogan();
        return (iHashCode17 * 59) + (slogan != null ? slogan.hashCode() : 43);
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

    public void setCity(String str) {
        this.city = str;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setFansCount(Integer num) {
        this.fansCount = num;
    }

    public void setGarland(String str) {
        this.garland = str;
    }

    public void setGender(Integer num) {
        this.gender = num;
    }

    public void setIsFollow(Integer num) {
        this.isFollow = num;
    }

    public void setIsFriend(Integer num) {
        this.isFriend = num;
    }

    public void setIsReal(Integer num) {
        this.isReal = num;
    }

    public void setIsVip(Integer num) {
        this.isVip = num;
    }

    public void setLevel(Integer num) {
        this.level = num;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setSex(Integer num) {
        this.sex = num;
    }

    public void setSlogan(String str) {
        this.slogan = str;
    }

    public void setUserHeat(Integer num) {
        this.userHeat = num;
    }

    public void setUserId(Integer num) {
        this.userId = num;
    }

    public String toString() {
        return "UserProfile(userId=" + getUserId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", gender=" + getGender() + ", age=" + getAge() + ", countryCode=" + getCountryCode() + ", sex=" + getSex() + ", city=" + getCity() + ", garland=" + getGarland() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ", slogan=" + getSlogan() + ", isVip=" + getIsVip() + ", isReal=" + getIsReal() + ", fansCount=" + getFansCount() + ", userHeat=" + getUserHeat() + ", isFollow=" + getIsFollow() + ", isFriend=" + getIsFriend() + ")";
    }
}
