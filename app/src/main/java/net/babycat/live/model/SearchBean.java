package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SearchBean {

    @SerializedName("familyinfo")
    private FamilyinfoDTO familyinfo;

    @SerializedName("roominfo")
    private RoominfoDTO roominfo;

    @SerializedName("type")
    private Integer type;

    @SerializedName("userinfo")
    private UserInfoDataBean userinfo;

    public static class FamilyinfoDTO {

        @SerializedName("avatar_frame")
        private String avatarFrame;

        @SerializedName("family_avatar")
        private String familyAvatar;

        @SerializedName("family_badge")
        private String familyBadge;

        @SerializedName("family_briefing")
        private String familyBriefing;

        @SerializedName("family_id")
        private Integer familyId;

        @SerializedName("family_member_cnt")
        private Integer familyMemberCnt;

        @SerializedName("family_member_join_cnt")
        private Integer familyMemberJoinCnt;

        @SerializedName("family_name")
        private String familyName;

        @SerializedName("is_family")
        private Integer isFamily;

        @SerializedName("is_family_admin")
        private Integer isFamilyAdmin;

        @SerializedName("join_level")
        private Integer joinLevel;

        public boolean canEqual(Object obj) {
            return obj instanceof FamilyinfoDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FamilyinfoDTO)) {
                return false;
            }
            FamilyinfoDTO familyinfoDTO = (FamilyinfoDTO) obj;
            if (!familyinfoDTO.canEqual(this)) {
                return false;
            }
            Integer isFamily = getIsFamily();
            Integer isFamily2 = familyinfoDTO.getIsFamily();
            if (isFamily != null ? !isFamily.equals(isFamily2) : isFamily2 != null) {
                return false;
            }
            Integer familyId = getFamilyId();
            Integer familyId2 = familyinfoDTO.getFamilyId();
            if (familyId != null ? !familyId.equals(familyId2) : familyId2 != null) {
                return false;
            }
            Integer isFamilyAdmin = getIsFamilyAdmin();
            Integer isFamilyAdmin2 = familyinfoDTO.getIsFamilyAdmin();
            if (isFamilyAdmin != null ? !isFamilyAdmin.equals(isFamilyAdmin2) : isFamilyAdmin2 != null) {
                return false;
            }
            Integer familyMemberCnt = getFamilyMemberCnt();
            Integer familyMemberCnt2 = familyinfoDTO.getFamilyMemberCnt();
            if (familyMemberCnt != null ? !familyMemberCnt.equals(familyMemberCnt2) : familyMemberCnt2 != null) {
                return false;
            }
            Integer joinLevel = getJoinLevel();
            Integer joinLevel2 = familyinfoDTO.getJoinLevel();
            if (joinLevel != null ? !joinLevel.equals(joinLevel2) : joinLevel2 != null) {
                return false;
            }
            Integer familyMemberJoinCnt = getFamilyMemberJoinCnt();
            Integer familyMemberJoinCnt2 = familyinfoDTO.getFamilyMemberJoinCnt();
            if (familyMemberJoinCnt != null ? !familyMemberJoinCnt.equals(familyMemberJoinCnt2) : familyMemberJoinCnt2 != null) {
                return false;
            }
            String familyName = getFamilyName();
            String familyName2 = familyinfoDTO.getFamilyName();
            if (familyName != null ? !familyName.equals(familyName2) : familyName2 != null) {
                return false;
            }
            String familyAvatar = getFamilyAvatar();
            String familyAvatar2 = familyinfoDTO.getFamilyAvatar();
            if (familyAvatar != null ? !familyAvatar.equals(familyAvatar2) : familyAvatar2 != null) {
                return false;
            }
            String familyBadge = getFamilyBadge();
            String familyBadge2 = familyinfoDTO.getFamilyBadge();
            if (familyBadge != null ? !familyBadge.equals(familyBadge2) : familyBadge2 != null) {
                return false;
            }
            String avatarFrame = getAvatarFrame();
            String avatarFrame2 = familyinfoDTO.getAvatarFrame();
            if (avatarFrame != null ? !avatarFrame.equals(avatarFrame2) : avatarFrame2 != null) {
                return false;
            }
            String familyBriefing = getFamilyBriefing();
            String familyBriefing2 = familyinfoDTO.getFamilyBriefing();
            return familyBriefing != null ? familyBriefing.equals(familyBriefing2) : familyBriefing2 == null;
        }

        public String getAvatarFrame() {
            return this.avatarFrame;
        }

        public String getFamilyAvatar() {
            return this.familyAvatar;
        }

        public String getFamilyBadge() {
            return this.familyBadge;
        }

        public String getFamilyBriefing() {
            return this.familyBriefing;
        }

        public Integer getFamilyId() {
            return this.familyId;
        }

        public Integer getFamilyMemberCnt() {
            return this.familyMemberCnt;
        }

        public Integer getFamilyMemberJoinCnt() {
            return this.familyMemberJoinCnt;
        }

        public String getFamilyName() {
            return this.familyName;
        }

        public Integer getIsFamily() {
            return this.isFamily;
        }

        public Integer getIsFamilyAdmin() {
            return this.isFamilyAdmin;
        }

        public Integer getJoinLevel() {
            return this.joinLevel;
        }

        public int hashCode() {
            Integer isFamily = getIsFamily();
            int iHashCode = isFamily == null ? 43 : isFamily.hashCode();
            Integer familyId = getFamilyId();
            int iHashCode2 = ((iHashCode + 59) * 59) + (familyId == null ? 43 : familyId.hashCode());
            Integer isFamilyAdmin = getIsFamilyAdmin();
            int iHashCode3 = (iHashCode2 * 59) + (isFamilyAdmin == null ? 43 : isFamilyAdmin.hashCode());
            Integer familyMemberCnt = getFamilyMemberCnt();
            int iHashCode4 = (iHashCode3 * 59) + (familyMemberCnt == null ? 43 : familyMemberCnt.hashCode());
            Integer joinLevel = getJoinLevel();
            int iHashCode5 = (iHashCode4 * 59) + (joinLevel == null ? 43 : joinLevel.hashCode());
            Integer familyMemberJoinCnt = getFamilyMemberJoinCnt();
            int iHashCode6 = (iHashCode5 * 59) + (familyMemberJoinCnt == null ? 43 : familyMemberJoinCnt.hashCode());
            String familyName = getFamilyName();
            int iHashCode7 = (iHashCode6 * 59) + (familyName == null ? 43 : familyName.hashCode());
            String familyAvatar = getFamilyAvatar();
            int iHashCode8 = (iHashCode7 * 59) + (familyAvatar == null ? 43 : familyAvatar.hashCode());
            String familyBadge = getFamilyBadge();
            int iHashCode9 = (iHashCode8 * 59) + (familyBadge == null ? 43 : familyBadge.hashCode());
            String avatarFrame = getAvatarFrame();
            int iHashCode10 = (iHashCode9 * 59) + (avatarFrame == null ? 43 : avatarFrame.hashCode());
            String familyBriefing = getFamilyBriefing();
            return (iHashCode10 * 59) + (familyBriefing != null ? familyBriefing.hashCode() : 43);
        }

        public void setAvatarFrame(String str) {
            this.avatarFrame = str;
        }

        public void setFamilyAvatar(String str) {
            this.familyAvatar = str;
        }

        public void setFamilyBadge(String str) {
            this.familyBadge = str;
        }

        public void setFamilyBriefing(String str) {
            this.familyBriefing = str;
        }

        public void setFamilyId(Integer num) {
            this.familyId = num;
        }

        public void setFamilyMemberCnt(Integer num) {
            this.familyMemberCnt = num;
        }

        public void setFamilyMemberJoinCnt(Integer num) {
            this.familyMemberJoinCnt = num;
        }

        public void setFamilyName(String str) {
            this.familyName = str;
        }

        public void setIsFamily(Integer num) {
            this.isFamily = num;
        }

        public void setIsFamilyAdmin(Integer num) {
            this.isFamilyAdmin = num;
        }

        public void setJoinLevel(Integer num) {
            this.joinLevel = num;
        }

        public String toString() {
            return "SearchBean.FamilyinfoDTO(isFamily=" + getIsFamily() + ", familyId=" + getFamilyId() + ", familyName=" + getFamilyName() + ", familyAvatar=" + getFamilyAvatar() + ", familyBadge=" + getFamilyBadge() + ", avatarFrame=" + getAvatarFrame() + ", familyBriefing=" + getFamilyBriefing() + ", isFamilyAdmin=" + getIsFamilyAdmin() + ", familyMemberCnt=" + getFamilyMemberCnt() + ", joinLevel=" + getJoinLevel() + ", familyMemberJoinCnt=" + getFamilyMemberJoinCnt() + ")";
        }
    }

    public static class RoominfoDTO {

        @SerializedName("chatroom_id")
        private String chatroomId;

        @SerializedName("corner_icon")
        private String cornerIcon;

        @SerializedName("country_code")
        private Integer countryCode;

        @SerializedName("cover")
        private String cover;

        @SerializedName("custom_id")
        private Integer customId;

        @SerializedName("group_id")
        private Integer groupId;

        @SerializedName("is_lock")
        private String isLock;

        @SerializedName("is_pk")
        private Integer isPk;

        @SerializedName("language_tag")
        private String languageTag;

        @SerializedName("live_type")
        private Integer liveType;

        @SerializedName("master_uid")
        private Integer masterUid;

        @SerializedName("mic_pics")
        private List<?> micPics;

        @SerializedName("room_id")
        private Integer roomId;

        @SerializedName("room_name")
        private String roomName;

        @SerializedName("total_gift")
        private Integer totalGift;

        @SerializedName("user_count")
        private Integer userCount;

        public boolean canEqual(Object obj) {
            return obj instanceof RoominfoDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RoominfoDTO)) {
                return false;
            }
            RoominfoDTO roominfoDTO = (RoominfoDTO) obj;
            if (!roominfoDTO.canEqual(this)) {
                return false;
            }
            Integer roomId = getRoomId();
            Integer roomId2 = roominfoDTO.getRoomId();
            if (roomId != null ? !roomId.equals(roomId2) : roomId2 != null) {
                return false;
            }
            Integer customId = getCustomId();
            Integer customId2 = roominfoDTO.getCustomId();
            if (customId != null ? !customId.equals(customId2) : customId2 != null) {
                return false;
            }
            Integer userCount = getUserCount();
            Integer userCount2 = roominfoDTO.getUserCount();
            if (userCount != null ? !userCount.equals(userCount2) : userCount2 != null) {
                return false;
            }
            Integer masterUid = getMasterUid();
            Integer masterUid2 = roominfoDTO.getMasterUid();
            if (masterUid != null ? !masterUid.equals(masterUid2) : masterUid2 != null) {
                return false;
            }
            Integer countryCode = getCountryCode();
            Integer countryCode2 = roominfoDTO.getCountryCode();
            if (countryCode != null ? !countryCode.equals(countryCode2) : countryCode2 != null) {
                return false;
            }
            Integer groupId = getGroupId();
            Integer groupId2 = roominfoDTO.getGroupId();
            if (groupId != null ? !groupId.equals(groupId2) : groupId2 != null) {
                return false;
            }
            Integer isPk = getIsPk();
            Integer isPk2 = roominfoDTO.getIsPk();
            if (isPk != null ? !isPk.equals(isPk2) : isPk2 != null) {
                return false;
            }
            Integer totalGift = getTotalGift();
            Integer totalGift2 = roominfoDTO.getTotalGift();
            if (totalGift != null ? !totalGift.equals(totalGift2) : totalGift2 != null) {
                return false;
            }
            Integer liveType = getLiveType();
            Integer liveType2 = roominfoDTO.getLiveType();
            if (liveType != null ? !liveType.equals(liveType2) : liveType2 != null) {
                return false;
            }
            String languageTag = getLanguageTag();
            String languageTag2 = roominfoDTO.getLanguageTag();
            if (languageTag != null ? !languageTag.equals(languageTag2) : languageTag2 != null) {
                return false;
            }
            String chatroomId = getChatroomId();
            String chatroomId2 = roominfoDTO.getChatroomId();
            if (chatroomId != null ? !chatroomId.equals(chatroomId2) : chatroomId2 != null) {
                return false;
            }
            String cover = getCover();
            String cover2 = roominfoDTO.getCover();
            if (cover != null ? !cover.equals(cover2) : cover2 != null) {
                return false;
            }
            String roomName = getRoomName();
            String roomName2 = roominfoDTO.getRoomName();
            if (roomName != null ? !roomName.equals(roomName2) : roomName2 != null) {
                return false;
            }
            String isLock = getIsLock();
            String isLock2 = roominfoDTO.getIsLock();
            if (isLock != null ? !isLock.equals(isLock2) : isLock2 != null) {
                return false;
            }
            String cornerIcon = getCornerIcon();
            String cornerIcon2 = roominfoDTO.getCornerIcon();
            if (cornerIcon != null ? !cornerIcon.equals(cornerIcon2) : cornerIcon2 != null) {
                return false;
            }
            List<?> micPics = getMicPics();
            List<?> micPics2 = roominfoDTO.getMicPics();
            return micPics != null ? micPics.equals(micPics2) : micPics2 == null;
        }

        public String getChatroomId() {
            return this.chatroomId;
        }

        public String getCornerIcon() {
            return this.cornerIcon;
        }

        public Integer getCountryCode() {
            return this.countryCode;
        }

        public String getCover() {
            return this.cover;
        }

        public Integer getCustomId() {
            return this.customId;
        }

        public Integer getGroupId() {
            return this.groupId;
        }

        public String getIsLock() {
            return this.isLock;
        }

        public Integer getIsPk() {
            return this.isPk;
        }

        public String getLanguageTag() {
            return this.languageTag;
        }

        public Integer getLiveType() {
            return this.liveType;
        }

        public Integer getMasterUid() {
            return this.masterUid;
        }

        public List<?> getMicPics() {
            return this.micPics;
        }

        public Integer getRoomId() {
            return this.roomId;
        }

        public String getRoomName() {
            return this.roomName;
        }

        public Integer getTotalGift() {
            return this.totalGift;
        }

        public Integer getUserCount() {
            return this.userCount;
        }

        public int hashCode() {
            Integer roomId = getRoomId();
            int iHashCode = roomId == null ? 43 : roomId.hashCode();
            Integer customId = getCustomId();
            int iHashCode2 = ((iHashCode + 59) * 59) + (customId == null ? 43 : customId.hashCode());
            Integer userCount = getUserCount();
            int iHashCode3 = (iHashCode2 * 59) + (userCount == null ? 43 : userCount.hashCode());
            Integer masterUid = getMasterUid();
            int iHashCode4 = (iHashCode3 * 59) + (masterUid == null ? 43 : masterUid.hashCode());
            Integer countryCode = getCountryCode();
            int iHashCode5 = (iHashCode4 * 59) + (countryCode == null ? 43 : countryCode.hashCode());
            Integer groupId = getGroupId();
            int iHashCode6 = (iHashCode5 * 59) + (groupId == null ? 43 : groupId.hashCode());
            Integer isPk = getIsPk();
            int iHashCode7 = (iHashCode6 * 59) + (isPk == null ? 43 : isPk.hashCode());
            Integer totalGift = getTotalGift();
            int iHashCode8 = (iHashCode7 * 59) + (totalGift == null ? 43 : totalGift.hashCode());
            Integer liveType = getLiveType();
            int iHashCode9 = (iHashCode8 * 59) + (liveType == null ? 43 : liveType.hashCode());
            String languageTag = getLanguageTag();
            int iHashCode10 = (iHashCode9 * 59) + (languageTag == null ? 43 : languageTag.hashCode());
            String chatroomId = getChatroomId();
            int iHashCode11 = (iHashCode10 * 59) + (chatroomId == null ? 43 : chatroomId.hashCode());
            String cover = getCover();
            int iHashCode12 = (iHashCode11 * 59) + (cover == null ? 43 : cover.hashCode());
            String roomName = getRoomName();
            int iHashCode13 = (iHashCode12 * 59) + (roomName == null ? 43 : roomName.hashCode());
            String isLock = getIsLock();
            int iHashCode14 = (iHashCode13 * 59) + (isLock == null ? 43 : isLock.hashCode());
            String cornerIcon = getCornerIcon();
            int iHashCode15 = (iHashCode14 * 59) + (cornerIcon == null ? 43 : cornerIcon.hashCode());
            List<?> micPics = getMicPics();
            return (iHashCode15 * 59) + (micPics != null ? micPics.hashCode() : 43);
        }

        public void setChatroomId(String str) {
            this.chatroomId = str;
        }

        public void setCornerIcon(String str) {
            this.cornerIcon = str;
        }

        public void setCountryCode(Integer num) {
            this.countryCode = num;
        }

        public void setCover(String str) {
            this.cover = str;
        }

        public void setCustomId(Integer num) {
            this.customId = num;
        }

        public void setGroupId(Integer num) {
            this.groupId = num;
        }

        public void setIsLock(String str) {
            this.isLock = str;
        }

        public void setIsPk(Integer num) {
            this.isPk = num;
        }

        public void setLanguageTag(String str) {
            this.languageTag = str;
        }

        public void setLiveType(Integer num) {
            this.liveType = num;
        }

        public void setMasterUid(Integer num) {
            this.masterUid = num;
        }

        public void setMicPics(List<?> list) {
            this.micPics = list;
        }

        public void setRoomId(Integer num) {
            this.roomId = num;
        }

        public void setRoomName(String str) {
            this.roomName = str;
        }

        public void setTotalGift(Integer num) {
            this.totalGift = num;
        }

        public void setUserCount(Integer num) {
            this.userCount = num;
        }

        public String toString() {
            return "SearchBean.RoominfoDTO(roomId=" + getRoomId() + ", customId=" + getCustomId() + ", languageTag=" + getLanguageTag() + ", userCount=" + getUserCount() + ", chatroomId=" + getChatroomId() + ", cover=" + getCover() + ", roomName=" + getRoomName() + ", masterUid=" + getMasterUid() + ", countryCode=" + getCountryCode() + ", groupId=" + getGroupId() + ", isLock=" + getIsLock() + ", isPk=" + getIsPk() + ", cornerIcon=" + getCornerIcon() + ", micPics=" + getMicPics() + ", totalGift=" + getTotalGift() + ", liveType=" + getLiveType() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof SearchBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchBean)) {
            return false;
        }
        SearchBean searchBean = (SearchBean) obj;
        if (!searchBean.canEqual(this)) {
            return false;
        }
        Integer type = getType();
        Integer type2 = searchBean.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        UserInfoDataBean userinfo = getUserinfo();
        UserInfoDataBean userinfo2 = searchBean.getUserinfo();
        if (userinfo != null ? !userinfo.equals(userinfo2) : userinfo2 != null) {
            return false;
        }
        FamilyinfoDTO familyinfo = getFamilyinfo();
        FamilyinfoDTO familyinfo2 = searchBean.getFamilyinfo();
        if (familyinfo != null ? !familyinfo.equals(familyinfo2) : familyinfo2 != null) {
            return false;
        }
        RoominfoDTO roominfo = getRoominfo();
        RoominfoDTO roominfo2 = searchBean.getRoominfo();
        return roominfo != null ? roominfo.equals(roominfo2) : roominfo2 == null;
    }

    public FamilyinfoDTO getFamilyinfo() {
        return this.familyinfo;
    }

    public RoominfoDTO getRoominfo() {
        return this.roominfo;
    }

    public Integer getType() {
        return this.type;
    }

    public UserInfoDataBean getUserinfo() {
        return this.userinfo;
    }

    public int hashCode() {
        Integer type = getType();
        int iHashCode = type == null ? 43 : type.hashCode();
        UserInfoDataBean userinfo = getUserinfo();
        int iHashCode2 = ((iHashCode + 59) * 59) + (userinfo == null ? 43 : userinfo.hashCode());
        FamilyinfoDTO familyinfo = getFamilyinfo();
        int iHashCode3 = (iHashCode2 * 59) + (familyinfo == null ? 43 : familyinfo.hashCode());
        RoominfoDTO roominfo = getRoominfo();
        return (iHashCode3 * 59) + (roominfo != null ? roominfo.hashCode() : 43);
    }

    public void setFamilyinfo(FamilyinfoDTO familyinfoDTO) {
        this.familyinfo = familyinfoDTO;
    }

    public void setRoominfo(RoominfoDTO roominfoDTO) {
        this.roominfo = roominfoDTO;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public void setUserinfo(UserInfoDataBean userInfoDataBean) {
        this.userinfo = userInfoDataBean;
    }

    public String toString() {
        return "SearchBean(type=" + getType() + ", userinfo=" + getUserinfo() + ", familyinfo=" + getFamilyinfo() + ", roominfo=" + getRoominfo() + ")";
    }
}
