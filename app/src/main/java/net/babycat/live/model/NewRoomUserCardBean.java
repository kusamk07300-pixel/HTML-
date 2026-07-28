package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;
import net.babycat.live.model.UserHomeBean;

/* JADX INFO: loaded from: classes4.dex */
public class NewRoomUserCardBean {

    @SerializedName("code")
    private Integer code;

    @SerializedName("data")
    private DataDTO data;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private Integer time;

    public static class DataDTO {

        @SerializedName("anchor_level")
        private Integer anchorLevel;

        @SerializedName("anchor_level_icon")
        private String anchorLevelIcon;

        @SerializedName("auth_type")
        private Integer authType;

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

        @SerializedName("badge_list")
        private List<String> badgeList;

        @SerializedName("color_id")
        private String colorId;

        @SerializedName("color_id_icon")
        private String colorIdIcon;

        @SerializedName("country_iso")
        private String countryIso;

        @SerializedName("gifts")
        private List<UserHomeBean.GiftsDTO> gifts;

        @SerializedName("goodnum")
        private String goodnum;

        @SerializedName("is_chat")
        Integer isChat;

        @SerializedName("is_fans")
        private Integer isFans;

        @SerializedName("is_follow")
        private Integer isFollow;

        @SerializedName("is_manger")
        private Boolean isManger;

        @SerializedName("is_no_mic")
        private Integer isNoMic;

        @SerializedName("is_no_say")
        private Integer isNoSay;

        @SerializedName("level")
        private Integer level;

        @SerializedName("level_icon")
        private String levelIcon;

        @SerializedName("likes_total")
        private Integer likesTotal;

        @SerializedName("location")
        private String location;

        @SerializedName("mic_num")
        private Integer micNum;

        @SerializedName("nickname")
        private String nickname;

        @SerializedName("role")
        private Integer role;

        @SerializedName("sex")
        private Integer sex;

        @SerializedName("id")
        private Integer userId;

        @SerializedName("v_card")
        private String vCard;

        @SerializedName("vip_level")
        private Integer vipLevel;

        @SerializedName("wealth_level")
        private Integer wealthLevel;

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
            Integer userId = getUserId();
            Integer userId2 = dataDTO.getUserId();
            if (userId != null ? !userId.equals(userId2) : userId2 != null) {
                return false;
            }
            Integer role = getRole();
            Integer role2 = dataDTO.getRole();
            if (role != null ? !role.equals(role2) : role2 != null) {
                return false;
            }
            Integer vipLevel = getVipLevel();
            Integer vipLevel2 = dataDTO.getVipLevel();
            if (vipLevel != null ? !vipLevel.equals(vipLevel2) : vipLevel2 != null) {
                return false;
            }
            Integer level = getLevel();
            Integer level2 = dataDTO.getLevel();
            if (level != null ? !level.equals(level2) : level2 != null) {
                return false;
            }
            Integer anchorLevel = getAnchorLevel();
            Integer anchorLevel2 = dataDTO.getAnchorLevel();
            if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
                return false;
            }
            Integer sex = getSex();
            Integer sex2 = dataDTO.getSex();
            if (sex != null ? !sex.equals(sex2) : sex2 != null) {
                return false;
            }
            Integer micNum = getMicNum();
            Integer micNum2 = dataDTO.getMicNum();
            if (micNum != null ? !micNum.equals(micNum2) : micNum2 != null) {
                return false;
            }
            Integer isFollow = getIsFollow();
            Integer isFollow2 = dataDTO.getIsFollow();
            if (isFollow != null ? !isFollow.equals(isFollow2) : isFollow2 != null) {
                return false;
            }
            Integer isNoSay = getIsNoSay();
            Integer isNoSay2 = dataDTO.getIsNoSay();
            if (isNoSay != null ? !isNoSay.equals(isNoSay2) : isNoSay2 != null) {
                return false;
            }
            Integer isNoMic = getIsNoMic();
            Integer isNoMic2 = dataDTO.getIsNoMic();
            if (isNoMic != null ? !isNoMic.equals(isNoMic2) : isNoMic2 != null) {
                return false;
            }
            Integer likesTotal = getLikesTotal();
            Integer likesTotal2 = dataDTO.getLikesTotal();
            if (likesTotal != null ? !likesTotal.equals(likesTotal2) : likesTotal2 != null) {
                return false;
            }
            Boolean isManger = getIsManger();
            Boolean isManger2 = dataDTO.getIsManger();
            if (isManger != null ? !isManger.equals(isManger2) : isManger2 != null) {
                return false;
            }
            Integer authType = getAuthType();
            Integer authType2 = dataDTO.getAuthType();
            if (authType != null ? !authType.equals(authType2) : authType2 != null) {
                return false;
            }
            Integer wealthLevel = getWealthLevel();
            Integer wealthLevel2 = dataDTO.getWealthLevel();
            if (wealthLevel != null ? !wealthLevel.equals(wealthLevel2) : wealthLevel2 != null) {
                return false;
            }
            Integer isChat = getIsChat();
            Integer isChat2 = dataDTO.getIsChat();
            if (isChat != null ? !isChat.equals(isChat2) : isChat2 != null) {
                return false;
            }
            Integer isFans = getIsFans();
            Integer isFans2 = dataDTO.getIsFans();
            if (isFans != null ? !isFans.equals(isFans2) : isFans2 != null) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = dataDTO.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = dataDTO.getAvatar();
            if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
                return false;
            }
            String avatarFrame = getAvatarFrame();
            String avatarFrame2 = dataDTO.getAvatarFrame();
            if (avatarFrame != null ? !avatarFrame.equals(avatarFrame2) : avatarFrame2 != null) {
                return false;
            }
            String vCard = getVCard();
            String vCard2 = dataDTO.getVCard();
            if (vCard != null ? !vCard.equals(vCard2) : vCard2 != null) {
                return false;
            }
            String badge1Svga = getBadge1Svga();
            String badge1Svga2 = dataDTO.getBadge1Svga();
            if (badge1Svga != null ? !badge1Svga.equals(badge1Svga2) : badge1Svga2 != null) {
                return false;
            }
            String badge2Svga = getBadge2Svga();
            String badge2Svga2 = dataDTO.getBadge2Svga();
            if (badge2Svga != null ? !badge2Svga.equals(badge2Svga2) : badge2Svga2 != null) {
                return false;
            }
            String badge3Svga = getBadge3Svga();
            String badge3Svga2 = dataDTO.getBadge3Svga();
            if (badge3Svga != null ? !badge3Svga.equals(badge3Svga2) : badge3Svga2 != null) {
                return false;
            }
            String levelIcon = getLevelIcon();
            String levelIcon2 = dataDTO.getLevelIcon();
            if (levelIcon != null ? !levelIcon.equals(levelIcon2) : levelIcon2 != null) {
                return false;
            }
            String anchorLevelIcon = getAnchorLevelIcon();
            String anchorLevelIcon2 = dataDTO.getAnchorLevelIcon();
            if (anchorLevelIcon != null ? !anchorLevelIcon.equals(anchorLevelIcon2) : anchorLevelIcon2 != null) {
                return false;
            }
            String colorId = getColorId();
            String colorId2 = dataDTO.getColorId();
            if (colorId != null ? !colorId.equals(colorId2) : colorId2 != null) {
                return false;
            }
            String colorIdIcon = getColorIdIcon();
            String colorIdIcon2 = dataDTO.getColorIdIcon();
            if (colorIdIcon != null ? !colorIdIcon.equals(colorIdIcon2) : colorIdIcon2 != null) {
                return false;
            }
            String goodnum = getGoodnum();
            String goodnum2 = dataDTO.getGoodnum();
            if (goodnum != null ? !goodnum.equals(goodnum2) : goodnum2 != null) {
                return false;
            }
            String location = getLocation();
            String location2 = dataDTO.getLocation();
            if (location != null ? !location.equals(location2) : location2 != null) {
                return false;
            }
            List<String> badgeList = getBadgeList();
            List<String> badgeList2 = dataDTO.getBadgeList();
            if (badgeList != null ? !badgeList.equals(badgeList2) : badgeList2 != null) {
                return false;
            }
            List<UserHomeBean.GiftsDTO> gifts = getGifts();
            List<UserHomeBean.GiftsDTO> gifts2 = dataDTO.getGifts();
            if (gifts != null ? !gifts.equals(gifts2) : gifts2 != null) {
                return false;
            }
            String countryIso = getCountryIso();
            String countryIso2 = dataDTO.getCountryIso();
            return countryIso != null ? countryIso.equals(countryIso2) : countryIso2 == null;
        }

        public Integer getAnchorLevel() {
            return this.anchorLevel;
        }

        public String getAnchorLevelIcon() {
            return this.anchorLevelIcon;
        }

        public Integer getAuthType() {
            return this.authType;
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

        public List<String> getBadgeList() {
            return this.badgeList;
        }

        public String getColorId() {
            return this.colorId;
        }

        public String getColorIdIcon() {
            return this.colorIdIcon;
        }

        public String getCountryIso() {
            return this.countryIso;
        }

        public List<UserHomeBean.GiftsDTO> getGifts() {
            return this.gifts;
        }

        public String getGoodnum() {
            return this.goodnum;
        }

        public Integer getIsChat() {
            return this.isChat;
        }

        public Integer getIsFans() {
            return this.isFans;
        }

        public Integer getIsFollow() {
            return this.isFollow;
        }

        public Boolean getIsManger() {
            return this.isManger;
        }

        public Integer getIsNoMic() {
            return this.isNoMic;
        }

        public Integer getIsNoSay() {
            return this.isNoSay;
        }

        public Integer getLevel() {
            return this.level;
        }

        public String getLevelIcon() {
            return this.levelIcon;
        }

        public Integer getLikesTotal() {
            return this.likesTotal;
        }

        public String getLocation() {
            return this.location;
        }

        public Integer getMicNum() {
            return this.micNum;
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

        public String getVCard() {
            return this.vCard;
        }

        public Integer getVipLevel() {
            return this.vipLevel;
        }

        public Integer getWealthLevel() {
            return this.wealthLevel;
        }

        public int hashCode() {
            Integer userId = getUserId();
            int iHashCode = userId == null ? 43 : userId.hashCode();
            Integer role = getRole();
            int iHashCode2 = ((iHashCode + 59) * 59) + (role == null ? 43 : role.hashCode());
            Integer vipLevel = getVipLevel();
            int iHashCode3 = (iHashCode2 * 59) + (vipLevel == null ? 43 : vipLevel.hashCode());
            Integer level = getLevel();
            int iHashCode4 = (iHashCode3 * 59) + (level == null ? 43 : level.hashCode());
            Integer anchorLevel = getAnchorLevel();
            int iHashCode5 = (iHashCode4 * 59) + (anchorLevel == null ? 43 : anchorLevel.hashCode());
            Integer sex = getSex();
            int iHashCode6 = (iHashCode5 * 59) + (sex == null ? 43 : sex.hashCode());
            Integer micNum = getMicNum();
            int iHashCode7 = (iHashCode6 * 59) + (micNum == null ? 43 : micNum.hashCode());
            Integer isFollow = getIsFollow();
            int iHashCode8 = (iHashCode7 * 59) + (isFollow == null ? 43 : isFollow.hashCode());
            Integer isNoSay = getIsNoSay();
            int iHashCode9 = (iHashCode8 * 59) + (isNoSay == null ? 43 : isNoSay.hashCode());
            Integer isNoMic = getIsNoMic();
            int iHashCode10 = (iHashCode9 * 59) + (isNoMic == null ? 43 : isNoMic.hashCode());
            Integer likesTotal = getLikesTotal();
            int iHashCode11 = (iHashCode10 * 59) + (likesTotal == null ? 43 : likesTotal.hashCode());
            Boolean isManger = getIsManger();
            int iHashCode12 = (iHashCode11 * 59) + (isManger == null ? 43 : isManger.hashCode());
            Integer authType = getAuthType();
            int iHashCode13 = (iHashCode12 * 59) + (authType == null ? 43 : authType.hashCode());
            Integer wealthLevel = getWealthLevel();
            int iHashCode14 = (iHashCode13 * 59) + (wealthLevel == null ? 43 : wealthLevel.hashCode());
            Integer isChat = getIsChat();
            int iHashCode15 = (iHashCode14 * 59) + (isChat == null ? 43 : isChat.hashCode());
            Integer isFans = getIsFans();
            int iHashCode16 = (iHashCode15 * 59) + (isFans == null ? 43 : isFans.hashCode());
            String nickname = getNickname();
            int iHashCode17 = (iHashCode16 * 59) + (nickname == null ? 43 : nickname.hashCode());
            String avatar = getAvatar();
            int iHashCode18 = (iHashCode17 * 59) + (avatar == null ? 43 : avatar.hashCode());
            String avatarFrame = getAvatarFrame();
            int iHashCode19 = (iHashCode18 * 59) + (avatarFrame == null ? 43 : avatarFrame.hashCode());
            String vCard = getVCard();
            int iHashCode20 = (iHashCode19 * 59) + (vCard == null ? 43 : vCard.hashCode());
            String badge1Svga = getBadge1Svga();
            int iHashCode21 = (iHashCode20 * 59) + (badge1Svga == null ? 43 : badge1Svga.hashCode());
            String badge2Svga = getBadge2Svga();
            int iHashCode22 = (iHashCode21 * 59) + (badge2Svga == null ? 43 : badge2Svga.hashCode());
            String badge3Svga = getBadge3Svga();
            int iHashCode23 = (iHashCode22 * 59) + (badge3Svga == null ? 43 : badge3Svga.hashCode());
            String levelIcon = getLevelIcon();
            int iHashCode24 = (iHashCode23 * 59) + (levelIcon == null ? 43 : levelIcon.hashCode());
            String anchorLevelIcon = getAnchorLevelIcon();
            int iHashCode25 = (iHashCode24 * 59) + (anchorLevelIcon == null ? 43 : anchorLevelIcon.hashCode());
            String colorId = getColorId();
            int iHashCode26 = (iHashCode25 * 59) + (colorId == null ? 43 : colorId.hashCode());
            String colorIdIcon = getColorIdIcon();
            int iHashCode27 = (iHashCode26 * 59) + (colorIdIcon == null ? 43 : colorIdIcon.hashCode());
            String goodnum = getGoodnum();
            int iHashCode28 = (iHashCode27 * 59) + (goodnum == null ? 43 : goodnum.hashCode());
            String location = getLocation();
            int iHashCode29 = (iHashCode28 * 59) + (location == null ? 43 : location.hashCode());
            List<String> badgeList = getBadgeList();
            int iHashCode30 = (iHashCode29 * 59) + (badgeList == null ? 43 : badgeList.hashCode());
            List<UserHomeBean.GiftsDTO> gifts = getGifts();
            int iHashCode31 = (iHashCode30 * 59) + (gifts == null ? 43 : gifts.hashCode());
            String countryIso = getCountryIso();
            return (iHashCode31 * 59) + (countryIso != null ? countryIso.hashCode() : 43);
        }

        public void setAnchorLevel(Integer num) {
            this.anchorLevel = num;
        }

        public void setAnchorLevelIcon(String str) {
            this.anchorLevelIcon = str;
        }

        public void setAuthType(Integer num) {
            this.authType = num;
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

        public void setBadgeList(List<String> list) {
            this.badgeList = list;
        }

        public void setColorId(String str) {
            this.colorId = str;
        }

        public void setColorIdIcon(String str) {
            this.colorIdIcon = str;
        }

        public void setCountryIso(String str) {
            this.countryIso = str;
        }

        public void setGifts(List<UserHomeBean.GiftsDTO> list) {
            this.gifts = list;
        }

        public void setGoodnum(String str) {
            this.goodnum = str;
        }

        public void setIsChat(Integer num) {
            this.isChat = num;
        }

        public void setIsFans(Integer num) {
            this.isFans = num;
        }

        public void setIsFollow(Integer num) {
            this.isFollow = num;
        }

        public void setIsManger(Boolean bool) {
            this.isManger = bool;
        }

        public void setIsNoMic(Integer num) {
            this.isNoMic = num;
        }

        public void setIsNoSay(Integer num) {
            this.isNoSay = num;
        }

        public void setLevel(Integer num) {
            this.level = num;
        }

        public void setLevelIcon(String str) {
            this.levelIcon = str;
        }

        public void setLikesTotal(Integer num) {
            this.likesTotal = num;
        }

        public void setLocation(String str) {
            this.location = str;
        }

        public void setMicNum(Integer num) {
            this.micNum = num;
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

        public void setVCard(String str) {
            this.vCard = str;
        }

        public void setVipLevel(Integer num) {
            this.vipLevel = num;
        }

        public void setWealthLevel(Integer num) {
            this.wealthLevel = num;
        }

        public String toString() {
            return "NewRoomUserCardBean.DataDTO(userId=" + getUserId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", avatarFrame=" + getAvatarFrame() + ", vCard=" + getVCard() + ", badge1Svga=" + getBadge1Svga() + ", badge2Svga=" + getBadge2Svga() + ", badge3Svga=" + getBadge3Svga() + ", role=" + getRole() + ", vipLevel=" + getVipLevel() + ", level=" + getLevel() + ", levelIcon=" + getLevelIcon() + ", anchorLevelIcon=" + getAnchorLevelIcon() + ", anchorLevel=" + getAnchorLevel() + ", sex=" + getSex() + ", micNum=" + getMicNum() + ", isFollow=" + getIsFollow() + ", isNoSay=" + getIsNoSay() + ", isNoMic=" + getIsNoMic() + ", likesTotal=" + getLikesTotal() + ", isManger=" + getIsManger() + ", colorId=" + getColorId() + ", colorIdIcon=" + getColorIdIcon() + ", goodnum=" + getGoodnum() + ", location=" + getLocation() + ", badgeList=" + getBadgeList() + ", gifts=" + getGifts() + ", countryIso=" + getCountryIso() + ", authType=" + getAuthType() + ", wealthLevel=" + getWealthLevel() + ", isChat=" + getIsChat() + ", isFans=" + getIsFans() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof NewRoomUserCardBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewRoomUserCardBean)) {
            return false;
        }
        NewRoomUserCardBean newRoomUserCardBean = (NewRoomUserCardBean) obj;
        if (!newRoomUserCardBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = newRoomUserCardBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = newRoomUserCardBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = newRoomUserCardBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = newRoomUserCardBean.getData();
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
        return "NewRoomUserCardBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
