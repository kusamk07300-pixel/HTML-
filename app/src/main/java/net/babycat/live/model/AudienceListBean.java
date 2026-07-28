package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class AudienceListBean {

    @SerializedName("anchor_level")
    private Integer anchorLevel;

    @SerializedName("anchor_level_icon")
    private String anchorLevelIcon;

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("avatar_frame")
    private String avatarFrame;

    @SerializedName("badge1_svga")
    private String badge1Svga;

    @SerializedName("badge2_svga")
    private String badge2Svga;

    @SerializedName("badge3_svga")
    private String badge3Svga;

    @SerializedName("gift_num")
    private Integer giftNum;

    @SerializedName("level")
    private Integer level;

    @SerializedName("level_icon")
    private String levelIcon;

    @SerializedName("nickname")
    private String nickname;

    @SerializedName("role")
    private Integer role;

    @SerializedName("sex")
    private Integer sex;

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("vip_level")
    private Integer vipLevel;

    public boolean canEqual(Object obj) {
        return obj instanceof AudienceListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudienceListBean)) {
            return false;
        }
        AudienceListBean audienceListBean = (AudienceListBean) obj;
        if (!audienceListBean.canEqual(this)) {
            return false;
        }
        Integer userId = getUserId();
        Integer userId2 = audienceListBean.getUserId();
        if (userId != null ? !userId.equals(userId2) : userId2 != null) {
            return false;
        }
        Integer role = getRole();
        Integer role2 = audienceListBean.getRole();
        if (role != null ? !role.equals(role2) : role2 != null) {
            return false;
        }
        Integer level = getLevel();
        Integer level2 = audienceListBean.getLevel();
        if (level != null ? !level.equals(level2) : level2 != null) {
            return false;
        }
        Integer anchorLevel = getAnchorLevel();
        Integer anchorLevel2 = audienceListBean.getAnchorLevel();
        if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
            return false;
        }
        Integer sex = getSex();
        Integer sex2 = audienceListBean.getSex();
        if (sex != null ? !sex.equals(sex2) : sex2 != null) {
            return false;
        }
        Integer vipLevel = getVipLevel();
        Integer vipLevel2 = audienceListBean.getVipLevel();
        if (vipLevel != null ? !vipLevel.equals(vipLevel2) : vipLevel2 != null) {
            return false;
        }
        Integer giftNum = getGiftNum();
        Integer giftNum2 = audienceListBean.getGiftNum();
        if (giftNum != null ? !giftNum.equals(giftNum2) : giftNum2 != null) {
            return false;
        }
        String nickname = getNickname();
        String nickname2 = audienceListBean.getNickname();
        if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
            return false;
        }
        String avatar = getAvatar();
        String avatar2 = audienceListBean.getAvatar();
        if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
            return false;
        }
        String avatarFrame = getAvatarFrame();
        String avatarFrame2 = audienceListBean.getAvatarFrame();
        if (avatarFrame != null ? !avatarFrame.equals(avatarFrame2) : avatarFrame2 != null) {
            return false;
        }
        String levelIcon = getLevelIcon();
        String levelIcon2 = audienceListBean.getLevelIcon();
        if (levelIcon != null ? !levelIcon.equals(levelIcon2) : levelIcon2 != null) {
            return false;
        }
        String anchorLevelIcon = getAnchorLevelIcon();
        String anchorLevelIcon2 = audienceListBean.getAnchorLevelIcon();
        if (anchorLevelIcon != null ? !anchorLevelIcon.equals(anchorLevelIcon2) : anchorLevelIcon2 != null) {
            return false;
        }
        String badge1Svga = getBadge1Svga();
        String badge1Svga2 = audienceListBean.getBadge1Svga();
        if (badge1Svga != null ? !badge1Svga.equals(badge1Svga2) : badge1Svga2 != null) {
            return false;
        }
        String badge2Svga = getBadge2Svga();
        String badge2Svga2 = audienceListBean.getBadge2Svga();
        if (badge2Svga != null ? !badge2Svga.equals(badge2Svga2) : badge2Svga2 != null) {
            return false;
        }
        String badge3Svga = getBadge3Svga();
        String badge3Svga2 = audienceListBean.getBadge3Svga();
        return badge3Svga != null ? badge3Svga.equals(badge3Svga2) : badge3Svga2 == null;
    }

    public Integer getAnchorLevel() {
        return this.anchorLevel;
    }

    public String getAnchorLevelIcon() {
        return this.anchorLevelIcon;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getAvatarFrame() {
        return this.avatarFrame;
    }

    public String getBadge1Svga() {
        return this.badge1Svga;
    }

    public String getBadge2Svga() {
        return this.badge2Svga;
    }

    public String getBadge3Svga() {
        return this.badge3Svga;
    }

    public Integer getGiftNum() {
        return this.giftNum;
    }

    public Integer getLevel() {
        return this.level;
    }

    public String getLevelIcon() {
        return this.levelIcon;
    }

    public String getNickname() {
        return this.nickname;
    }

    public Integer getRole() {
        return this.role;
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
        Integer role = getRole();
        int iHashCode2 = ((iHashCode + 59) * 59) + (role == null ? 43 : role.hashCode());
        Integer level = getLevel();
        int iHashCode3 = (iHashCode2 * 59) + (level == null ? 43 : level.hashCode());
        Integer anchorLevel = getAnchorLevel();
        int iHashCode4 = (iHashCode3 * 59) + (anchorLevel == null ? 43 : anchorLevel.hashCode());
        Integer sex = getSex();
        int iHashCode5 = (iHashCode4 * 59) + (sex == null ? 43 : sex.hashCode());
        Integer vipLevel = getVipLevel();
        int iHashCode6 = (iHashCode5 * 59) + (vipLevel == null ? 43 : vipLevel.hashCode());
        Integer giftNum = getGiftNum();
        int iHashCode7 = (iHashCode6 * 59) + (giftNum == null ? 43 : giftNum.hashCode());
        String nickname = getNickname();
        int iHashCode8 = (iHashCode7 * 59) + (nickname == null ? 43 : nickname.hashCode());
        String avatar = getAvatar();
        int iHashCode9 = (iHashCode8 * 59) + (avatar == null ? 43 : avatar.hashCode());
        String avatarFrame = getAvatarFrame();
        int iHashCode10 = (iHashCode9 * 59) + (avatarFrame == null ? 43 : avatarFrame.hashCode());
        String levelIcon = getLevelIcon();
        int iHashCode11 = (iHashCode10 * 59) + (levelIcon == null ? 43 : levelIcon.hashCode());
        String anchorLevelIcon = getAnchorLevelIcon();
        int iHashCode12 = (iHashCode11 * 59) + (anchorLevelIcon == null ? 43 : anchorLevelIcon.hashCode());
        String badge1Svga = getBadge1Svga();
        int iHashCode13 = (iHashCode12 * 59) + (badge1Svga == null ? 43 : badge1Svga.hashCode());
        String badge2Svga = getBadge2Svga();
        int iHashCode14 = (iHashCode13 * 59) + (badge2Svga == null ? 43 : badge2Svga.hashCode());
        String badge3Svga = getBadge3Svga();
        return (iHashCode14 * 59) + (badge3Svga != null ? badge3Svga.hashCode() : 43);
    }

    public void setAnchorLevel(Integer num) {
        this.anchorLevel = num;
    }

    public void setAnchorLevelIcon(String str) {
        this.anchorLevelIcon = str;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setAvatarFrame(String str) {
        this.avatarFrame = str;
    }

    public void setBadge1Svga(String str) {
        this.badge1Svga = str;
    }

    public void setBadge2Svga(String str) {
        this.badge2Svga = str;
    }

    public void setBadge3Svga(String str) {
        this.badge3Svga = str;
    }

    public void setGiftNum(Integer num) {
        this.giftNum = num;
    }

    public void setLevel(Integer num) {
        this.level = num;
    }

    public void setLevelIcon(String str) {
        this.levelIcon = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setRole(Integer num) {
        this.role = num;
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
        return "AudienceListBean(userId=" + getUserId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", avatarFrame=" + getAvatarFrame() + ", role=" + getRole() + ", level=" + getLevel() + ", levelIcon=" + getLevelIcon() + ", anchorLevelIcon=" + getAnchorLevelIcon() + ", anchorLevel=" + getAnchorLevel() + ", sex=" + getSex() + ", vipLevel=" + getVipLevel() + ", giftNum=" + getGiftNum() + ", badge1Svga=" + getBadge1Svga() + ", badge2Svga=" + getBadge2Svga() + ", badge3Svga=" + getBadge3Svga() + ")";
    }
}
