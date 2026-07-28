package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RoomListBean implements Serializable {

    @SerializedName("anchor_level")
    private Integer anchorLevel;

    @SerializedName("chatroom_id")
    private String chatroomId;

    @SerializedName("corner_icon")
    private String cornerIcon;

    @SerializedName("country_code")
    private String countryCode;

    @SerializedName("country_iso")
    private String countryIso;

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

    @SerializedName("level")
    private Integer level;

    @SerializedName("live_type")
    private Integer liveType;

    @SerializedName("master_uid")
    private Integer masterUid;

    @SerializedName("mic_pics")
    private List<String> micPics;

    @SerializedName("nickname")
    private String nickname;

    @SerializedName(TUIConstants.TUIChat.NOTICE)
    private String notice;

    @SerializedName("password")
    private String password;

    @SerializedName("room_id")
    private Integer roomId;

    @SerializedName("room_level")
    private Integer roomLevel;

    @SerializedName("room_name")
    private String roomName;

    @SerializedName("tag")
    private String tag;

    @SerializedName("total_gift")
    private Integer totalGift;

    @SerializedName("user_count")
    private Integer userCount;

    public boolean canEqual(Object obj) {
        return obj instanceof RoomListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoomListBean)) {
            return false;
        }
        RoomListBean roomListBean = (RoomListBean) obj;
        if (!roomListBean.canEqual(this)) {
            return false;
        }
        Integer roomId = getRoomId();
        Integer roomId2 = roomListBean.getRoomId();
        if (roomId != null ? !roomId.equals(roomId2) : roomId2 != null) {
            return false;
        }
        Integer customId = getCustomId();
        Integer customId2 = roomListBean.getCustomId();
        if (customId != null ? !customId.equals(customId2) : customId2 != null) {
            return false;
        }
        Integer userCount = getUserCount();
        Integer userCount2 = roomListBean.getUserCount();
        if (userCount != null ? !userCount.equals(userCount2) : userCount2 != null) {
            return false;
        }
        Integer masterUid = getMasterUid();
        Integer masterUid2 = roomListBean.getMasterUid();
        if (masterUid != null ? !masterUid.equals(masterUid2) : masterUid2 != null) {
            return false;
        }
        Integer groupId = getGroupId();
        Integer groupId2 = roomListBean.getGroupId();
        if (groupId != null ? !groupId.equals(groupId2) : groupId2 != null) {
            return false;
        }
        Integer isPk = getIsPk();
        Integer isPk2 = roomListBean.getIsPk();
        if (isPk != null ? !isPk.equals(isPk2) : isPk2 != null) {
            return false;
        }
        Integer totalGift = getTotalGift();
        Integer totalGift2 = roomListBean.getTotalGift();
        if (totalGift != null ? !totalGift.equals(totalGift2) : totalGift2 != null) {
            return false;
        }
        Integer level = getLevel();
        Integer level2 = roomListBean.getLevel();
        if (level != null ? !level.equals(level2) : level2 != null) {
            return false;
        }
        Integer anchorLevel = getAnchorLevel();
        Integer anchorLevel2 = roomListBean.getAnchorLevel();
        if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
            return false;
        }
        Integer roomLevel = getRoomLevel();
        Integer roomLevel2 = roomListBean.getRoomLevel();
        if (roomLevel != null ? !roomLevel.equals(roomLevel2) : roomLevel2 != null) {
            return false;
        }
        Integer liveType = getLiveType();
        Integer liveType2 = roomListBean.getLiveType();
        if (liveType != null ? !liveType.equals(liveType2) : liveType2 != null) {
            return false;
        }
        String chatroomId = getChatroomId();
        String chatroomId2 = roomListBean.getChatroomId();
        if (chatroomId != null ? !chatroomId.equals(chatroomId2) : chatroomId2 != null) {
            return false;
        }
        String password = getPassword();
        String password2 = roomListBean.getPassword();
        if (password != null ? !password.equals(password2) : password2 != null) {
            return false;
        }
        String cover = getCover();
        String cover2 = roomListBean.getCover();
        if (cover != null ? !cover.equals(cover2) : cover2 != null) {
            return false;
        }
        String roomName = getRoomName();
        String roomName2 = roomListBean.getRoomName();
        if (roomName != null ? !roomName.equals(roomName2) : roomName2 != null) {
            return false;
        }
        String tag = getTag();
        String tag2 = roomListBean.getTag();
        if (tag != null ? !tag.equals(tag2) : tag2 != null) {
            return false;
        }
        String notice = getNotice();
        String notice2 = roomListBean.getNotice();
        if (notice != null ? !notice.equals(notice2) : notice2 != null) {
            return false;
        }
        String nickname = getNickname();
        String nickname2 = roomListBean.getNickname();
        if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
            return false;
        }
        String countryCode = getCountryCode();
        String countryCode2 = roomListBean.getCountryCode();
        if (countryCode != null ? !countryCode.equals(countryCode2) : countryCode2 != null) {
            return false;
        }
        String countryIso = getCountryIso();
        String countryIso2 = roomListBean.getCountryIso();
        if (countryIso != null ? !countryIso.equals(countryIso2) : countryIso2 != null) {
            return false;
        }
        String cornerIcon = getCornerIcon();
        String cornerIcon2 = roomListBean.getCornerIcon();
        if (cornerIcon != null ? !cornerIcon.equals(cornerIcon2) : cornerIcon2 != null) {
            return false;
        }
        List<String> micPics = getMicPics();
        List<String> micPics2 = roomListBean.getMicPics();
        if (micPics != null ? !micPics.equals(micPics2) : micPics2 != null) {
            return false;
        }
        String isLock = getIsLock();
        String isLock2 = roomListBean.getIsLock();
        if (isLock != null ? !isLock.equals(isLock2) : isLock2 != null) {
            return false;
        }
        String languageTag = getLanguageTag();
        String languageTag2 = roomListBean.getLanguageTag();
        return languageTag != null ? languageTag.equals(languageTag2) : languageTag2 == null;
    }

    public Integer getAnchorLevel() {
        return this.anchorLevel;
    }

    public String getChatroomId() {
        return this.chatroomId;
    }

    public String getCornerIcon() {
        return this.cornerIcon;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getCountryIso() {
        return this.countryIso;
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

    public Integer getLevel() {
        return this.level;
    }

    public Integer getLiveType() {
        return this.liveType;
    }

    public Integer getMasterUid() {
        return this.masterUid;
    }

    public List<String> getMicPics() {
        return this.micPics;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getNotice() {
        return this.notice;
    }

    public String getPassword() {
        return this.password;
    }

    public Integer getRoomId() {
        return this.roomId;
    }

    public Integer getRoomLevel() {
        return this.roomLevel;
    }

    public String getRoomName() {
        return this.roomName;
    }

    public String getTag() {
        return this.tag;
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
        Integer groupId = getGroupId();
        int iHashCode5 = (iHashCode4 * 59) + (groupId == null ? 43 : groupId.hashCode());
        Integer isPk = getIsPk();
        int iHashCode6 = (iHashCode5 * 59) + (isPk == null ? 43 : isPk.hashCode());
        Integer totalGift = getTotalGift();
        int iHashCode7 = (iHashCode6 * 59) + (totalGift == null ? 43 : totalGift.hashCode());
        Integer level = getLevel();
        int iHashCode8 = (iHashCode7 * 59) + (level == null ? 43 : level.hashCode());
        Integer anchorLevel = getAnchorLevel();
        int iHashCode9 = (iHashCode8 * 59) + (anchorLevel == null ? 43 : anchorLevel.hashCode());
        Integer roomLevel = getRoomLevel();
        int iHashCode10 = (iHashCode9 * 59) + (roomLevel == null ? 43 : roomLevel.hashCode());
        Integer liveType = getLiveType();
        int iHashCode11 = (iHashCode10 * 59) + (liveType == null ? 43 : liveType.hashCode());
        String chatroomId = getChatroomId();
        int iHashCode12 = (iHashCode11 * 59) + (chatroomId == null ? 43 : chatroomId.hashCode());
        String password = getPassword();
        int iHashCode13 = (iHashCode12 * 59) + (password == null ? 43 : password.hashCode());
        String cover = getCover();
        int iHashCode14 = (iHashCode13 * 59) + (cover == null ? 43 : cover.hashCode());
        String roomName = getRoomName();
        int iHashCode15 = (iHashCode14 * 59) + (roomName == null ? 43 : roomName.hashCode());
        String tag = getTag();
        int iHashCode16 = (iHashCode15 * 59) + (tag == null ? 43 : tag.hashCode());
        String notice = getNotice();
        int iHashCode17 = (iHashCode16 * 59) + (notice == null ? 43 : notice.hashCode());
        String nickname = getNickname();
        int iHashCode18 = (iHashCode17 * 59) + (nickname == null ? 43 : nickname.hashCode());
        String countryCode = getCountryCode();
        int iHashCode19 = (iHashCode18 * 59) + (countryCode == null ? 43 : countryCode.hashCode());
        String countryIso = getCountryIso();
        int iHashCode20 = (iHashCode19 * 59) + (countryIso == null ? 43 : countryIso.hashCode());
        String cornerIcon = getCornerIcon();
        int iHashCode21 = (iHashCode20 * 59) + (cornerIcon == null ? 43 : cornerIcon.hashCode());
        List<String> micPics = getMicPics();
        int iHashCode22 = (iHashCode21 * 59) + (micPics == null ? 43 : micPics.hashCode());
        String isLock = getIsLock();
        int iHashCode23 = (iHashCode22 * 59) + (isLock == null ? 43 : isLock.hashCode());
        String languageTag = getLanguageTag();
        return (iHashCode23 * 59) + (languageTag != null ? languageTag.hashCode() : 43);
    }

    public void setAnchorLevel(Integer num) {
        this.anchorLevel = num;
    }

    public void setChatroomId(String str) {
        this.chatroomId = str;
    }

    public void setCornerIcon(String str) {
        this.cornerIcon = str;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setCountryIso(String str) {
        this.countryIso = str;
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

    public void setLevel(Integer num) {
        this.level = num;
    }

    public void setLiveType(Integer num) {
        this.liveType = num;
    }

    public void setMasterUid(Integer num) {
        this.masterUid = num;
    }

    public void setMicPics(List<String> list) {
        this.micPics = list;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setNotice(String str) {
        this.notice = str;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setRoomId(Integer num) {
        this.roomId = num;
    }

    public void setRoomLevel(Integer num) {
        this.roomLevel = num;
    }

    public void setRoomName(String str) {
        this.roomName = str;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setTotalGift(Integer num) {
        this.totalGift = num;
    }

    public void setUserCount(Integer num) {
        this.userCount = num;
    }

    public String toString() {
        return "RoomListBean(roomId=" + getRoomId() + ", customId=" + getCustomId() + ", userCount=" + getUserCount() + ", chatroomId=" + getChatroomId() + ", password=" + getPassword() + ", cover=" + getCover() + ", roomName=" + getRoomName() + ", tag=" + getTag() + ", notice=" + getNotice() + ", nickname=" + getNickname() + ", masterUid=" + getMasterUid() + ", countryCode=" + getCountryCode() + ", countryIso=" + getCountryIso() + ", groupId=" + getGroupId() + ", isPk=" + getIsPk() + ", cornerIcon=" + getCornerIcon() + ", micPics=" + getMicPics() + ", totalGift=" + getTotalGift() + ", isLock=" + getIsLock() + ", languageTag=" + getLanguageTag() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ", roomLevel=" + getRoomLevel() + ", liveType=" + getLiveType() + ")";
    }
}
