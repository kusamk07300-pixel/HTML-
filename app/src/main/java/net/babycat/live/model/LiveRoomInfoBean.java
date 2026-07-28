package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import com.tencent.qcloud.tuicore.TUIConstants;
import g0.o0;
import java.util.List;
import net.babycat.live.model.NewJoinRoomBean;

/* JADX INFO: loaded from: classes4.dex */
public class LiveRoomInfoBean {

    @SerializedName("anchor_level")
    private Integer anchorLevel;

    @SerializedName("anchor_level_icon")
    private String anchorLevelIcon;

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("avatar_frame")
    private String avatarFrame;

    @SerializedName(o0.c0.f25806t)
    private String background;

    @SerializedName("background_ext")
    private String backgroundExt;

    @SerializedName("badge1_svga")
    private String badge1Svga;

    @SerializedName("badge2_svga")
    private String badge2Svga;

    @SerializedName("badge3_svga")
    private String badge3Svga;

    @SerializedName("chat_room_id")
    private Integer chatRoomId;

    @SerializedName("chat_status")
    private Integer chatStatus;

    @SerializedName("countdown")
    private String countdown;

    @SerializedName("country")
    private String country;

    @SerializedName("country_iso")
    private String countryIso;

    @SerializedName("country_name")
    private String countryName;

    @SerializedName("cover")
    private String cover;

    @SerializedName("create_time")
    private long createTime;

    @SerializedName("custom_id")
    private Integer customId;

    @SerializedName("full_popmessage_price")
    private String fullPopmessagePrice;

    @SerializedName("game_show_type")
    private Integer gameShowType;

    @SerializedName("gf_sign")
    private String gfSign;

    @SerializedName("gift_act_list")
    private List<GiftInteractBean> giftActList;

    @SerializedName("gift_num")
    private Integer giftNum;

    @SerializedName("group_id")
    private Integer groupId;

    @SerializedName("is_attention")
    private Integer isAttention;

    @SerializedName("is_no_say")
    private Integer isNoSay;

    @SerializedName("is_pk")
    private Integer isPk;

    @SerializedName("language_tag")
    private String languageTag;

    @SerializedName("level")
    private Integer level;

    @SerializedName("level_icon")
    private String levelIcon;

    @SerializedName("like_count")
    private Integer likeCount;

    @SerializedName("master_info")
    private MasterInfoDTO masterInfo;

    @SerializedName("master_uid")
    private Integer masterUid;

    @SerializedName("mic_list")
    private List<NewJoinRoomBean.AnchorsDTO> micList;

    @SerializedName("mic_num")
    private Integer micNum;

    @SerializedName("nickname")
    private String nickname;

    @SerializedName(TUIConstants.TUIChat.NOTICE)
    private String notice;

    @SerializedName("open_gift_act")
    private Integer openGiftAct;

    /* JADX INFO: renamed from: pk, reason: collision with root package name */
    @SerializedName("pk")
    private LiveRoomPkUiData f34860pk;

    @SerializedName("role")
    private Integer role;

    @SerializedName("room_id")
    private Integer roomId;

    @SerializedName("room_name")
    private String roomName;

    @SerializedName("room_popmessage_price")
    private String roomPopmessagePrice;

    @SerializedName("seat")
    private String seat;

    @SerializedName("seat_ext")
    private String seatExt;

    @SerializedName("sex")
    private Integer sex;

    @SerializedName("share_content")
    private String shareContent;

    @SerializedName("share_icon")
    private String shareIcon;

    @SerializedName("start_datetime")
    private String startDatetime;

    @SerializedName("tag")
    private String tag;

    @SerializedName("top3_list")
    private List<Top3List> top3List;

    @SerializedName("total_incomes")
    private Integer totalIncomes;

    @SerializedName("user_count")
    private Integer userCount;

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("v_card")
    private String vCard;

    @SerializedName("vip_level")
    private Integer vipLevel;

    @SerializedName("welcome_words")
    private String welcomeWords;

    public static class MasterInfoDTO {

        @SerializedName("age")
        private Integer age;

        @SerializedName("avatar")
        private String avatar;

        @SerializedName("birthday")
        private String birthday;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private String f34861id;

        @SerializedName("nickname")
        private String nickname;

        @SerializedName("sex")
        private String sex;

        @SerializedName("vip_level")
        private String vipLevel;

        public boolean canEqual(Object obj) {
            return obj instanceof MasterInfoDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MasterInfoDTO)) {
                return false;
            }
            MasterInfoDTO masterInfoDTO = (MasterInfoDTO) obj;
            if (!masterInfoDTO.canEqual(this)) {
                return false;
            }
            Integer age = getAge();
            Integer age2 = masterInfoDTO.getAge();
            if (age != null ? !age.equals(age2) : age2 != null) {
                return false;
            }
            String id2 = getId();
            String id3 = masterInfoDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = masterInfoDTO.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = masterInfoDTO.getAvatar();
            if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
                return false;
            }
            String sex = getSex();
            String sex2 = masterInfoDTO.getSex();
            if (sex != null ? !sex.equals(sex2) : sex2 != null) {
                return false;
            }
            String vipLevel = getVipLevel();
            String vipLevel2 = masterInfoDTO.getVipLevel();
            if (vipLevel != null ? !vipLevel.equals(vipLevel2) : vipLevel2 != null) {
                return false;
            }
            String birthday = getBirthday();
            String birthday2 = masterInfoDTO.getBirthday();
            return birthday != null ? birthday.equals(birthday2) : birthday2 == null;
        }

        public Integer getAge() {
            return this.age;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public String getBirthday() {
            return this.birthday;
        }

        public String getId() {
            return this.f34861id;
        }

        public String getNickname() {
            return this.nickname;
        }

        public String getSex() {
            return this.sex;
        }

        public String getVipLevel() {
            return this.vipLevel;
        }

        public int hashCode() {
            Integer age = getAge();
            int iHashCode = age == null ? 43 : age.hashCode();
            String id2 = getId();
            int iHashCode2 = ((iHashCode + 59) * 59) + (id2 == null ? 43 : id2.hashCode());
            String nickname = getNickname();
            int iHashCode3 = (iHashCode2 * 59) + (nickname == null ? 43 : nickname.hashCode());
            String avatar = getAvatar();
            int iHashCode4 = (iHashCode3 * 59) + (avatar == null ? 43 : avatar.hashCode());
            String sex = getSex();
            int iHashCode5 = (iHashCode4 * 59) + (sex == null ? 43 : sex.hashCode());
            String vipLevel = getVipLevel();
            int iHashCode6 = (iHashCode5 * 59) + (vipLevel == null ? 43 : vipLevel.hashCode());
            String birthday = getBirthday();
            return (iHashCode6 * 59) + (birthday != null ? birthday.hashCode() : 43);
        }

        public void setAge(Integer num) {
            this.age = num;
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setBirthday(String str) {
            this.birthday = str;
        }

        public void setId(String str) {
            this.f34861id = str;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public void setSex(String str) {
            this.sex = str;
        }

        public void setVipLevel(String str) {
            this.vipLevel = str;
        }

        public String toString() {
            return "LiveRoomInfoBean.MasterInfoDTO(id=" + getId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", sex=" + getSex() + ", vipLevel=" + getVipLevel() + ", birthday=" + getBirthday() + ", age=" + getAge() + ")";
        }
    }

    public static class Top3List {

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

        @SerializedName("sex")
        private Integer sex;

        @SerializedName("user_id")
        private Integer userId;

        @SerializedName("v_card")
        private String vCard;

        @SerializedName("vip_level")
        private Integer vipLevel;

        public boolean canEqual(Object obj) {
            return obj instanceof Top3List;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Top3List)) {
                return false;
            }
            Top3List top3List = (Top3List) obj;
            if (!top3List.canEqual(this)) {
                return false;
            }
            Integer userId = getUserId();
            Integer userId2 = top3List.getUserId();
            if (userId != null ? !userId.equals(userId2) : userId2 != null) {
                return false;
            }
            Integer level = getLevel();
            Integer level2 = top3List.getLevel();
            if (level != null ? !level.equals(level2) : level2 != null) {
                return false;
            }
            Integer anchorLevel = getAnchorLevel();
            Integer anchorLevel2 = top3List.getAnchorLevel();
            if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
                return false;
            }
            Integer sex = getSex();
            Integer sex2 = top3List.getSex();
            if (sex != null ? !sex.equals(sex2) : sex2 != null) {
                return false;
            }
            Integer vipLevel = getVipLevel();
            Integer vipLevel2 = top3List.getVipLevel();
            if (vipLevel != null ? !vipLevel.equals(vipLevel2) : vipLevel2 != null) {
                return false;
            }
            Integer giftNum = getGiftNum();
            Integer giftNum2 = top3List.getGiftNum();
            if (giftNum != null ? !giftNum.equals(giftNum2) : giftNum2 != null) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = top3List.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = top3List.getAvatar();
            if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
                return false;
            }
            String avatarFrame = getAvatarFrame();
            String avatarFrame2 = top3List.getAvatarFrame();
            if (avatarFrame != null ? !avatarFrame.equals(avatarFrame2) : avatarFrame2 != null) {
                return false;
            }
            String vCard = getVCard();
            String vCard2 = top3List.getVCard();
            if (vCard != null ? !vCard.equals(vCard2) : vCard2 != null) {
                return false;
            }
            String badge1Svga = getBadge1Svga();
            String badge1Svga2 = top3List.getBadge1Svga();
            if (badge1Svga != null ? !badge1Svga.equals(badge1Svga2) : badge1Svga2 != null) {
                return false;
            }
            String badge2Svga = getBadge2Svga();
            String badge2Svga2 = top3List.getBadge2Svga();
            if (badge2Svga != null ? !badge2Svga.equals(badge2Svga2) : badge2Svga2 != null) {
                return false;
            }
            String badge3Svga = getBadge3Svga();
            String badge3Svga2 = top3List.getBadge3Svga();
            if (badge3Svga != null ? !badge3Svga.equals(badge3Svga2) : badge3Svga2 != null) {
                return false;
            }
            String levelIcon = getLevelIcon();
            String levelIcon2 = top3List.getLevelIcon();
            if (levelIcon != null ? !levelIcon.equals(levelIcon2) : levelIcon2 != null) {
                return false;
            }
            String anchorLevelIcon = getAnchorLevelIcon();
            String anchorLevelIcon2 = top3List.getAnchorLevelIcon();
            return anchorLevelIcon != null ? anchorLevelIcon.equals(anchorLevelIcon2) : anchorLevelIcon2 == null;
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

        public int hashCode() {
            Integer userId = getUserId();
            int iHashCode = userId == null ? 43 : userId.hashCode();
            Integer level = getLevel();
            int iHashCode2 = ((iHashCode + 59) * 59) + (level == null ? 43 : level.hashCode());
            Integer anchorLevel = getAnchorLevel();
            int iHashCode3 = (iHashCode2 * 59) + (anchorLevel == null ? 43 : anchorLevel.hashCode());
            Integer sex = getSex();
            int iHashCode4 = (iHashCode3 * 59) + (sex == null ? 43 : sex.hashCode());
            Integer vipLevel = getVipLevel();
            int iHashCode5 = (iHashCode4 * 59) + (vipLevel == null ? 43 : vipLevel.hashCode());
            Integer giftNum = getGiftNum();
            int iHashCode6 = (iHashCode5 * 59) + (giftNum == null ? 43 : giftNum.hashCode());
            String nickname = getNickname();
            int iHashCode7 = (iHashCode6 * 59) + (nickname == null ? 43 : nickname.hashCode());
            String avatar = getAvatar();
            int iHashCode8 = (iHashCode7 * 59) + (avatar == null ? 43 : avatar.hashCode());
            String avatarFrame = getAvatarFrame();
            int iHashCode9 = (iHashCode8 * 59) + (avatarFrame == null ? 43 : avatarFrame.hashCode());
            String vCard = getVCard();
            int iHashCode10 = (iHashCode9 * 59) + (vCard == null ? 43 : vCard.hashCode());
            String badge1Svga = getBadge1Svga();
            int iHashCode11 = (iHashCode10 * 59) + (badge1Svga == null ? 43 : badge1Svga.hashCode());
            String badge2Svga = getBadge2Svga();
            int iHashCode12 = (iHashCode11 * 59) + (badge2Svga == null ? 43 : badge2Svga.hashCode());
            String badge3Svga = getBadge3Svga();
            int iHashCode13 = (iHashCode12 * 59) + (badge3Svga == null ? 43 : badge3Svga.hashCode());
            String levelIcon = getLevelIcon();
            int iHashCode14 = (iHashCode13 * 59) + (levelIcon == null ? 43 : levelIcon.hashCode());
            String anchorLevelIcon = getAnchorLevelIcon();
            return (iHashCode14 * 59) + (anchorLevelIcon != null ? anchorLevelIcon.hashCode() : 43);
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

        public String toString() {
            return "LiveRoomInfoBean.Top3List(userId=" + getUserId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", avatarFrame=" + getAvatarFrame() + ", vCard=" + getVCard() + ", badge1Svga=" + getBadge1Svga() + ", badge2Svga=" + getBadge2Svga() + ", badge3Svga=" + getBadge3Svga() + ", level=" + getLevel() + ", levelIcon=" + getLevelIcon() + ", anchorLevelIcon=" + getAnchorLevelIcon() + ", anchorLevel=" + getAnchorLevel() + ", sex=" + getSex() + ", vipLevel=" + getVipLevel() + ", giftNum=" + getGiftNum() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof LiveRoomInfoBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveRoomInfoBean)) {
            return false;
        }
        LiveRoomInfoBean liveRoomInfoBean = (LiveRoomInfoBean) obj;
        if (!liveRoomInfoBean.canEqual(this) || getCreateTime() != liveRoomInfoBean.getCreateTime()) {
            return false;
        }
        Integer roomId = getRoomId();
        Integer roomId2 = liveRoomInfoBean.getRoomId();
        if (roomId != null ? !roomId.equals(roomId2) : roomId2 != null) {
            return false;
        }
        Integer customId = getCustomId();
        Integer customId2 = liveRoomInfoBean.getCustomId();
        if (customId != null ? !customId.equals(customId2) : customId2 != null) {
            return false;
        }
        Integer chatRoomId = getChatRoomId();
        Integer chatRoomId2 = liveRoomInfoBean.getChatRoomId();
        if (chatRoomId != null ? !chatRoomId.equals(chatRoomId2) : chatRoomId2 != null) {
            return false;
        }
        Integer role = getRole();
        Integer role2 = liveRoomInfoBean.getRole();
        if (role != null ? !role.equals(role2) : role2 != null) {
            return false;
        }
        Integer masterUid = getMasterUid();
        Integer masterUid2 = liveRoomInfoBean.getMasterUid();
        if (masterUid != null ? !masterUid.equals(masterUid2) : masterUid2 != null) {
            return false;
        }
        Integer isNoSay = getIsNoSay();
        Integer isNoSay2 = liveRoomInfoBean.getIsNoSay();
        if (isNoSay != null ? !isNoSay.equals(isNoSay2) : isNoSay2 != null) {
            return false;
        }
        Integer groupId = getGroupId();
        Integer groupId2 = liveRoomInfoBean.getGroupId();
        if (groupId != null ? !groupId.equals(groupId2) : groupId2 != null) {
            return false;
        }
        Integer level = getLevel();
        Integer level2 = liveRoomInfoBean.getLevel();
        if (level != null ? !level.equals(level2) : level2 != null) {
            return false;
        }
        Integer isPk = getIsPk();
        Integer isPk2 = liveRoomInfoBean.getIsPk();
        if (isPk != null ? !isPk.equals(isPk2) : isPk2 != null) {
            return false;
        }
        Integer micNum = getMicNum();
        Integer micNum2 = liveRoomInfoBean.getMicNum();
        if (micNum != null ? !micNum.equals(micNum2) : micNum2 != null) {
            return false;
        }
        Integer chatStatus = getChatStatus();
        Integer chatStatus2 = liveRoomInfoBean.getChatStatus();
        if (chatStatus != null ? !chatStatus.equals(chatStatus2) : chatStatus2 != null) {
            return false;
        }
        Integer userCount = getUserCount();
        Integer userCount2 = liveRoomInfoBean.getUserCount();
        if (userCount != null ? !userCount.equals(userCount2) : userCount2 != null) {
            return false;
        }
        Integer likeCount = getLikeCount();
        Integer likeCount2 = liveRoomInfoBean.getLikeCount();
        if (likeCount != null ? !likeCount.equals(likeCount2) : likeCount2 != null) {
            return false;
        }
        Integer totalIncomes = getTotalIncomes();
        Integer totalIncomes2 = liveRoomInfoBean.getTotalIncomes();
        if (totalIncomes != null ? !totalIncomes.equals(totalIncomes2) : totalIncomes2 != null) {
            return false;
        }
        Integer isAttention = getIsAttention();
        Integer isAttention2 = liveRoomInfoBean.getIsAttention();
        if (isAttention != null ? !isAttention.equals(isAttention2) : isAttention2 != null) {
            return false;
        }
        Integer gameShowType = getGameShowType();
        Integer gameShowType2 = liveRoomInfoBean.getGameShowType();
        if (gameShowType != null ? !gameShowType.equals(gameShowType2) : gameShowType2 != null) {
            return false;
        }
        Integer userId = getUserId();
        Integer userId2 = liveRoomInfoBean.getUserId();
        if (userId != null ? !userId.equals(userId2) : userId2 != null) {
            return false;
        }
        Integer anchorLevel = getAnchorLevel();
        Integer anchorLevel2 = liveRoomInfoBean.getAnchorLevel();
        if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
            return false;
        }
        Integer sex = getSex();
        Integer sex2 = liveRoomInfoBean.getSex();
        if (sex != null ? !sex.equals(sex2) : sex2 != null) {
            return false;
        }
        Integer vipLevel = getVipLevel();
        Integer vipLevel2 = liveRoomInfoBean.getVipLevel();
        if (vipLevel != null ? !vipLevel.equals(vipLevel2) : vipLevel2 != null) {
            return false;
        }
        Integer giftNum = getGiftNum();
        Integer giftNum2 = liveRoomInfoBean.getGiftNum();
        if (giftNum != null ? !giftNum.equals(giftNum2) : giftNum2 != null) {
            return false;
        }
        Integer openGiftAct = getOpenGiftAct();
        Integer openGiftAct2 = liveRoomInfoBean.getOpenGiftAct();
        if (openGiftAct != null ? !openGiftAct.equals(openGiftAct2) : openGiftAct2 != null) {
            return false;
        }
        String roomName = getRoomName();
        String roomName2 = liveRoomInfoBean.getRoomName();
        if (roomName != null ? !roomName.equals(roomName2) : roomName2 != null) {
            return false;
        }
        String cover = getCover();
        String cover2 = liveRoomInfoBean.getCover();
        if (cover != null ? !cover.equals(cover2) : cover2 != null) {
            return false;
        }
        String gfSign = getGfSign();
        String gfSign2 = liveRoomInfoBean.getGfSign();
        if (gfSign != null ? !gfSign.equals(gfSign2) : gfSign2 != null) {
            return false;
        }
        String tag = getTag();
        String tag2 = liveRoomInfoBean.getTag();
        if (tag != null ? !tag.equals(tag2) : tag2 != null) {
            return false;
        }
        String startDatetime = getStartDatetime();
        String startDatetime2 = liveRoomInfoBean.getStartDatetime();
        if (startDatetime != null ? !startDatetime.equals(startDatetime2) : startDatetime2 != null) {
            return false;
        }
        String countdown = getCountdown();
        String countdown2 = liveRoomInfoBean.getCountdown();
        if (countdown != null ? !countdown.equals(countdown2) : countdown2 != null) {
            return false;
        }
        String countryIso = getCountryIso();
        String countryIso2 = liveRoomInfoBean.getCountryIso();
        if (countryIso != null ? !countryIso.equals(countryIso2) : countryIso2 != null) {
            return false;
        }
        String notice = getNotice();
        String notice2 = liveRoomInfoBean.getNotice();
        if (notice != null ? !notice.equals(notice2) : notice2 != null) {
            return false;
        }
        String welcomeWords = getWelcomeWords();
        String welcomeWords2 = liveRoomInfoBean.getWelcomeWords();
        if (welcomeWords != null ? !welcomeWords.equals(welcomeWords2) : welcomeWords2 != null) {
            return false;
        }
        String background = getBackground();
        String background2 = liveRoomInfoBean.getBackground();
        if (background != null ? !background.equals(background2) : background2 != null) {
            return false;
        }
        String backgroundExt = getBackgroundExt();
        String backgroundExt2 = liveRoomInfoBean.getBackgroundExt();
        if (backgroundExt != null ? !backgroundExt.equals(backgroundExt2) : backgroundExt2 != null) {
            return false;
        }
        String seat = getSeat();
        String seat2 = liveRoomInfoBean.getSeat();
        if (seat != null ? !seat.equals(seat2) : seat2 != null) {
            return false;
        }
        String seatExt = getSeatExt();
        String seatExt2 = liveRoomInfoBean.getSeatExt();
        if (seatExt != null ? !seatExt.equals(seatExt2) : seatExt2 != null) {
            return false;
        }
        String country = getCountry();
        String country2 = liveRoomInfoBean.getCountry();
        if (country != null ? !country.equals(country2) : country2 != null) {
            return false;
        }
        String languageTag = getLanguageTag();
        String languageTag2 = liveRoomInfoBean.getLanguageTag();
        if (languageTag != null ? !languageTag.equals(languageTag2) : languageTag2 != null) {
            return false;
        }
        MasterInfoDTO masterInfo = getMasterInfo();
        MasterInfoDTO masterInfo2 = liveRoomInfoBean.getMasterInfo();
        if (masterInfo != null ? !masterInfo.equals(masterInfo2) : masterInfo2 != null) {
            return false;
        }
        String countryName = getCountryName();
        String countryName2 = liveRoomInfoBean.getCountryName();
        if (countryName != null ? !countryName.equals(countryName2) : countryName2 != null) {
            return false;
        }
        List<NewJoinRoomBean.AnchorsDTO> micList = getMicList();
        List<NewJoinRoomBean.AnchorsDTO> micList2 = liveRoomInfoBean.getMicList();
        if (micList != null ? !micList.equals(micList2) : micList2 != null) {
            return false;
        }
        String nickname = getNickname();
        String nickname2 = liveRoomInfoBean.getNickname();
        if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
            return false;
        }
        String avatar = getAvatar();
        String avatar2 = liveRoomInfoBean.getAvatar();
        if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
            return false;
        }
        String avatarFrame = getAvatarFrame();
        String avatarFrame2 = liveRoomInfoBean.getAvatarFrame();
        if (avatarFrame != null ? !avatarFrame.equals(avatarFrame2) : avatarFrame2 != null) {
            return false;
        }
        String vCard = getVCard();
        String vCard2 = liveRoomInfoBean.getVCard();
        if (vCard != null ? !vCard.equals(vCard2) : vCard2 != null) {
            return false;
        }
        String badge1Svga = getBadge1Svga();
        String badge1Svga2 = liveRoomInfoBean.getBadge1Svga();
        if (badge1Svga != null ? !badge1Svga.equals(badge1Svga2) : badge1Svga2 != null) {
            return false;
        }
        String badge2Svga = getBadge2Svga();
        String badge2Svga2 = liveRoomInfoBean.getBadge2Svga();
        if (badge2Svga != null ? !badge2Svga.equals(badge2Svga2) : badge2Svga2 != null) {
            return false;
        }
        String badge3Svga = getBadge3Svga();
        String badge3Svga2 = liveRoomInfoBean.getBadge3Svga();
        if (badge3Svga != null ? !badge3Svga.equals(badge3Svga2) : badge3Svga2 != null) {
            return false;
        }
        String levelIcon = getLevelIcon();
        String levelIcon2 = liveRoomInfoBean.getLevelIcon();
        if (levelIcon != null ? !levelIcon.equals(levelIcon2) : levelIcon2 != null) {
            return false;
        }
        String anchorLevelIcon = getAnchorLevelIcon();
        String anchorLevelIcon2 = liveRoomInfoBean.getAnchorLevelIcon();
        if (anchorLevelIcon != null ? !anchorLevelIcon.equals(anchorLevelIcon2) : anchorLevelIcon2 != null) {
            return false;
        }
        List<Top3List> top3List = getTop3List();
        List<Top3List> top3List2 = liveRoomInfoBean.getTop3List();
        if (top3List != null ? !top3List.equals(top3List2) : top3List2 != null) {
            return false;
        }
        LiveRoomPkUiData pk2 = getPk();
        LiveRoomPkUiData pk3 = liveRoomInfoBean.getPk();
        if (pk2 != null ? !pk2.equals(pk3) : pk3 != null) {
            return false;
        }
        String shareIcon = getShareIcon();
        String shareIcon2 = liveRoomInfoBean.getShareIcon();
        if (shareIcon != null ? !shareIcon.equals(shareIcon2) : shareIcon2 != null) {
            return false;
        }
        String shareContent = getShareContent();
        String shareContent2 = liveRoomInfoBean.getShareContent();
        if (shareContent != null ? !shareContent.equals(shareContent2) : shareContent2 != null) {
            return false;
        }
        String roomPopmessagePrice = getRoomPopmessagePrice();
        String roomPopmessagePrice2 = liveRoomInfoBean.getRoomPopmessagePrice();
        if (roomPopmessagePrice != null ? !roomPopmessagePrice.equals(roomPopmessagePrice2) : roomPopmessagePrice2 != null) {
            return false;
        }
        String fullPopmessagePrice = getFullPopmessagePrice();
        String fullPopmessagePrice2 = liveRoomInfoBean.getFullPopmessagePrice();
        if (fullPopmessagePrice != null ? !fullPopmessagePrice.equals(fullPopmessagePrice2) : fullPopmessagePrice2 != null) {
            return false;
        }
        List<GiftInteractBean> giftActList = getGiftActList();
        List<GiftInteractBean> giftActList2 = liveRoomInfoBean.getGiftActList();
        return giftActList != null ? giftActList.equals(giftActList2) : giftActList2 == null;
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

    public String getBackground() {
        return this.background;
    }

    public String getBackgroundExt() {
        return this.backgroundExt;
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

    public Integer getChatRoomId() {
        return this.chatRoomId;
    }

    public Integer getChatStatus() {
        return this.chatStatus;
    }

    public String getCountdown() {
        return this.countdown;
    }

    public String getCountry() {
        return this.country;
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

    public long getCreateTime() {
        return this.createTime;
    }

    public Integer getCustomId() {
        return this.customId;
    }

    public String getFullPopmessagePrice() {
        return this.fullPopmessagePrice;
    }

    public Integer getGameShowType() {
        return this.gameShowType;
    }

    public String getGfSign() {
        return this.gfSign;
    }

    public List<GiftInteractBean> getGiftActList() {
        return this.giftActList;
    }

    public Integer getGiftNum() {
        return this.giftNum;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public Integer getIsAttention() {
        return this.isAttention;
    }

    public Integer getIsNoSay() {
        return this.isNoSay;
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

    public String getLevelIcon() {
        return this.levelIcon;
    }

    public Integer getLikeCount() {
        return this.likeCount;
    }

    public MasterInfoDTO getMasterInfo() {
        return this.masterInfo;
    }

    public Integer getMasterUid() {
        return this.masterUid;
    }

    public List<NewJoinRoomBean.AnchorsDTO> getMicList() {
        return this.micList;
    }

    public Integer getMicNum() {
        return this.micNum;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getNotice() {
        return this.notice;
    }

    public Integer getOpenGiftAct() {
        return this.openGiftAct;
    }

    public LiveRoomPkUiData getPk() {
        return this.f34860pk;
    }

    public Integer getRole() {
        return this.role;
    }

    public Integer getRoomId() {
        return this.roomId;
    }

    public String getRoomName() {
        return this.roomName;
    }

    public String getRoomPopmessagePrice() {
        return this.roomPopmessagePrice;
    }

    public String getSeat() {
        return this.seat;
    }

    public String getSeatExt() {
        return this.seatExt;
    }

    public Integer getSex() {
        return this.sex;
    }

    public String getShareContent() {
        return this.shareContent;
    }

    public String getShareIcon() {
        return this.shareIcon;
    }

    public String getStartDatetime() {
        return this.startDatetime;
    }

    public String getTag() {
        return this.tag;
    }

    public List<Top3List> getTop3List() {
        return this.top3List;
    }

    public Integer getTotalIncomes() {
        return this.totalIncomes;
    }

    public Integer getUserCount() {
        return this.userCount;
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

    public String getWelcomeWords() {
        return this.welcomeWords;
    }

    public int hashCode() {
        long createTime = getCreateTime();
        Integer roomId = getRoomId();
        int iHashCode = ((((int) (createTime ^ (createTime >>> 32))) + 59) * 59) + (roomId == null ? 43 : roomId.hashCode());
        Integer customId = getCustomId();
        int iHashCode2 = (iHashCode * 59) + (customId == null ? 43 : customId.hashCode());
        Integer chatRoomId = getChatRoomId();
        int iHashCode3 = (iHashCode2 * 59) + (chatRoomId == null ? 43 : chatRoomId.hashCode());
        Integer role = getRole();
        int iHashCode4 = (iHashCode3 * 59) + (role == null ? 43 : role.hashCode());
        Integer masterUid = getMasterUid();
        int iHashCode5 = (iHashCode4 * 59) + (masterUid == null ? 43 : masterUid.hashCode());
        Integer isNoSay = getIsNoSay();
        int iHashCode6 = (iHashCode5 * 59) + (isNoSay == null ? 43 : isNoSay.hashCode());
        Integer groupId = getGroupId();
        int iHashCode7 = (iHashCode6 * 59) + (groupId == null ? 43 : groupId.hashCode());
        Integer level = getLevel();
        int iHashCode8 = (iHashCode7 * 59) + (level == null ? 43 : level.hashCode());
        Integer isPk = getIsPk();
        int iHashCode9 = (iHashCode8 * 59) + (isPk == null ? 43 : isPk.hashCode());
        Integer micNum = getMicNum();
        int iHashCode10 = (iHashCode9 * 59) + (micNum == null ? 43 : micNum.hashCode());
        Integer chatStatus = getChatStatus();
        int iHashCode11 = (iHashCode10 * 59) + (chatStatus == null ? 43 : chatStatus.hashCode());
        Integer userCount = getUserCount();
        int iHashCode12 = (iHashCode11 * 59) + (userCount == null ? 43 : userCount.hashCode());
        Integer likeCount = getLikeCount();
        int iHashCode13 = (iHashCode12 * 59) + (likeCount == null ? 43 : likeCount.hashCode());
        Integer totalIncomes = getTotalIncomes();
        int iHashCode14 = (iHashCode13 * 59) + (totalIncomes == null ? 43 : totalIncomes.hashCode());
        Integer isAttention = getIsAttention();
        int iHashCode15 = (iHashCode14 * 59) + (isAttention == null ? 43 : isAttention.hashCode());
        Integer gameShowType = getGameShowType();
        int iHashCode16 = (iHashCode15 * 59) + (gameShowType == null ? 43 : gameShowType.hashCode());
        Integer userId = getUserId();
        int iHashCode17 = (iHashCode16 * 59) + (userId == null ? 43 : userId.hashCode());
        Integer anchorLevel = getAnchorLevel();
        int iHashCode18 = (iHashCode17 * 59) + (anchorLevel == null ? 43 : anchorLevel.hashCode());
        Integer sex = getSex();
        int iHashCode19 = (iHashCode18 * 59) + (sex == null ? 43 : sex.hashCode());
        Integer vipLevel = getVipLevel();
        int iHashCode20 = (iHashCode19 * 59) + (vipLevel == null ? 43 : vipLevel.hashCode());
        Integer giftNum = getGiftNum();
        int iHashCode21 = (iHashCode20 * 59) + (giftNum == null ? 43 : giftNum.hashCode());
        Integer openGiftAct = getOpenGiftAct();
        int iHashCode22 = (iHashCode21 * 59) + (openGiftAct == null ? 43 : openGiftAct.hashCode());
        String roomName = getRoomName();
        int iHashCode23 = (iHashCode22 * 59) + (roomName == null ? 43 : roomName.hashCode());
        String cover = getCover();
        int iHashCode24 = (iHashCode23 * 59) + (cover == null ? 43 : cover.hashCode());
        String gfSign = getGfSign();
        int iHashCode25 = (iHashCode24 * 59) + (gfSign == null ? 43 : gfSign.hashCode());
        String tag = getTag();
        int iHashCode26 = (iHashCode25 * 59) + (tag == null ? 43 : tag.hashCode());
        String startDatetime = getStartDatetime();
        int iHashCode27 = (iHashCode26 * 59) + (startDatetime == null ? 43 : startDatetime.hashCode());
        String countdown = getCountdown();
        int iHashCode28 = (iHashCode27 * 59) + (countdown == null ? 43 : countdown.hashCode());
        String countryIso = getCountryIso();
        int iHashCode29 = (iHashCode28 * 59) + (countryIso == null ? 43 : countryIso.hashCode());
        String notice = getNotice();
        int iHashCode30 = (iHashCode29 * 59) + (notice == null ? 43 : notice.hashCode());
        String welcomeWords = getWelcomeWords();
        int iHashCode31 = (iHashCode30 * 59) + (welcomeWords == null ? 43 : welcomeWords.hashCode());
        String background = getBackground();
        int iHashCode32 = (iHashCode31 * 59) + (background == null ? 43 : background.hashCode());
        String backgroundExt = getBackgroundExt();
        int iHashCode33 = (iHashCode32 * 59) + (backgroundExt == null ? 43 : backgroundExt.hashCode());
        String seat = getSeat();
        int iHashCode34 = (iHashCode33 * 59) + (seat == null ? 43 : seat.hashCode());
        String seatExt = getSeatExt();
        int iHashCode35 = (iHashCode34 * 59) + (seatExt == null ? 43 : seatExt.hashCode());
        String country = getCountry();
        int iHashCode36 = (iHashCode35 * 59) + (country == null ? 43 : country.hashCode());
        String languageTag = getLanguageTag();
        int iHashCode37 = (iHashCode36 * 59) + (languageTag == null ? 43 : languageTag.hashCode());
        MasterInfoDTO masterInfo = getMasterInfo();
        int iHashCode38 = (iHashCode37 * 59) + (masterInfo == null ? 43 : masterInfo.hashCode());
        String countryName = getCountryName();
        int iHashCode39 = (iHashCode38 * 59) + (countryName == null ? 43 : countryName.hashCode());
        List<NewJoinRoomBean.AnchorsDTO> micList = getMicList();
        int iHashCode40 = (iHashCode39 * 59) + (micList == null ? 43 : micList.hashCode());
        String nickname = getNickname();
        int iHashCode41 = (iHashCode40 * 59) + (nickname == null ? 43 : nickname.hashCode());
        String avatar = getAvatar();
        int iHashCode42 = (iHashCode41 * 59) + (avatar == null ? 43 : avatar.hashCode());
        String avatarFrame = getAvatarFrame();
        int iHashCode43 = (iHashCode42 * 59) + (avatarFrame == null ? 43 : avatarFrame.hashCode());
        String vCard = getVCard();
        int iHashCode44 = (iHashCode43 * 59) + (vCard == null ? 43 : vCard.hashCode());
        String badge1Svga = getBadge1Svga();
        int iHashCode45 = (iHashCode44 * 59) + (badge1Svga == null ? 43 : badge1Svga.hashCode());
        String badge2Svga = getBadge2Svga();
        int iHashCode46 = (iHashCode45 * 59) + (badge2Svga == null ? 43 : badge2Svga.hashCode());
        String badge3Svga = getBadge3Svga();
        int iHashCode47 = (iHashCode46 * 59) + (badge3Svga == null ? 43 : badge3Svga.hashCode());
        String levelIcon = getLevelIcon();
        int iHashCode48 = (iHashCode47 * 59) + (levelIcon == null ? 43 : levelIcon.hashCode());
        String anchorLevelIcon = getAnchorLevelIcon();
        int iHashCode49 = (iHashCode48 * 59) + (anchorLevelIcon == null ? 43 : anchorLevelIcon.hashCode());
        List<Top3List> top3List = getTop3List();
        int iHashCode50 = (iHashCode49 * 59) + (top3List == null ? 43 : top3List.hashCode());
        LiveRoomPkUiData pk2 = getPk();
        int iHashCode51 = (iHashCode50 * 59) + (pk2 == null ? 43 : pk2.hashCode());
        String shareIcon = getShareIcon();
        int iHashCode52 = (iHashCode51 * 59) + (shareIcon == null ? 43 : shareIcon.hashCode());
        String shareContent = getShareContent();
        int iHashCode53 = (iHashCode52 * 59) + (shareContent == null ? 43 : shareContent.hashCode());
        String roomPopmessagePrice = getRoomPopmessagePrice();
        int iHashCode54 = (iHashCode53 * 59) + (roomPopmessagePrice == null ? 43 : roomPopmessagePrice.hashCode());
        String fullPopmessagePrice = getFullPopmessagePrice();
        int iHashCode55 = (iHashCode54 * 59) + (fullPopmessagePrice == null ? 43 : fullPopmessagePrice.hashCode());
        List<GiftInteractBean> giftActList = getGiftActList();
        return (iHashCode55 * 59) + (giftActList != null ? giftActList.hashCode() : 43);
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

    public void setBackground(String str) {
        this.background = str;
    }

    public void setBackgroundExt(String str) {
        this.backgroundExt = str;
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

    public void setChatRoomId(Integer num) {
        this.chatRoomId = num;
    }

    public void setChatStatus(Integer num) {
        this.chatStatus = num;
    }

    public void setCountdown(String str) {
        this.countdown = str;
    }

    public void setCountry(String str) {
        this.country = str;
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

    public void setCreateTime(long j10) {
        this.createTime = j10;
    }

    public void setCustomId(Integer num) {
        this.customId = num;
    }

    public void setFullPopmessagePrice(String str) {
        this.fullPopmessagePrice = str;
    }

    public void setGameShowType(Integer num) {
        this.gameShowType = num;
    }

    public void setGfSign(String str) {
        this.gfSign = str;
    }

    public void setGiftActList(List<GiftInteractBean> list) {
        this.giftActList = list;
    }

    public void setGiftNum(Integer num) {
        this.giftNum = num;
    }

    public void setGroupId(Integer num) {
        this.groupId = num;
    }

    public void setIsAttention(Integer num) {
        this.isAttention = num;
    }

    public void setIsNoSay(Integer num) {
        this.isNoSay = num;
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

    public void setLevelIcon(String str) {
        this.levelIcon = str;
    }

    public void setLikeCount(Integer num) {
        this.likeCount = num;
    }

    public void setMasterInfo(MasterInfoDTO masterInfoDTO) {
        this.masterInfo = masterInfoDTO;
    }

    public void setMasterUid(Integer num) {
        this.masterUid = num;
    }

    public void setMicList(List<NewJoinRoomBean.AnchorsDTO> list) {
        this.micList = list;
    }

    public void setMicNum(Integer num) {
        this.micNum = num;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setNotice(String str) {
        this.notice = str;
    }

    public void setOpenGiftAct(Integer num) {
        this.openGiftAct = num;
    }

    public void setPk(LiveRoomPkUiData liveRoomPkUiData) {
        this.f34860pk = liveRoomPkUiData;
    }

    public void setRole(Integer num) {
        this.role = num;
    }

    public void setRoomId(Integer num) {
        this.roomId = num;
    }

    public void setRoomName(String str) {
        this.roomName = str;
    }

    public void setRoomPopmessagePrice(String str) {
        this.roomPopmessagePrice = str;
    }

    public void setSeat(String str) {
        this.seat = str;
    }

    public void setSeatExt(String str) {
        this.seatExt = str;
    }

    public void setSex(Integer num) {
        this.sex = num;
    }

    public void setShareContent(String str) {
        this.shareContent = str;
    }

    public void setShareIcon(String str) {
        this.shareIcon = str;
    }

    public void setStartDatetime(String str) {
        this.startDatetime = str;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setTop3List(List<Top3List> list) {
        this.top3List = list;
    }

    public void setTotalIncomes(Integer num) {
        this.totalIncomes = num;
    }

    public void setUserCount(Integer num) {
        this.userCount = num;
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

    public void setWelcomeWords(String str) {
        this.welcomeWords = str;
    }

    public String toString() {
        return "LiveRoomInfoBean(roomId=" + getRoomId() + ", customId=" + getCustomId() + ", chatRoomId=" + getChatRoomId() + ", role=" + getRole() + ", masterUid=" + getMasterUid() + ", isNoSay=" + getIsNoSay() + ", groupId=" + getGroupId() + ", roomName=" + getRoomName() + ", cover=" + getCover() + ", gfSign=" + getGfSign() + ", tag=" + getTag() + ", startDatetime=" + getStartDatetime() + ", countdown=" + getCountdown() + ", level=" + getLevel() + ", countryIso=" + getCountryIso() + ", notice=" + getNotice() + ", welcomeWords=" + getWelcomeWords() + ", background=" + getBackground() + ", backgroundExt=" + getBackgroundExt() + ", seat=" + getSeat() + ", seatExt=" + getSeatExt() + ", country=" + getCountry() + ", isPk=" + getIsPk() + ", micNum=" + getMicNum() + ", chatStatus=" + getChatStatus() + ", languageTag=" + getLanguageTag() + ", masterInfo=" + getMasterInfo() + ", countryName=" + getCountryName() + ", userCount=" + getUserCount() + ", likeCount=" + getLikeCount() + ", totalIncomes=" + getTotalIncomes() + ", createTime=" + getCreateTime() + ", isAttention=" + getIsAttention() + ", micList=" + getMicList() + ", gameShowType=" + getGameShowType() + ", userId=" + getUserId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", avatarFrame=" + getAvatarFrame() + ", vCard=" + getVCard() + ", badge1Svga=" + getBadge1Svga() + ", badge2Svga=" + getBadge2Svga() + ", badge3Svga=" + getBadge3Svga() + ", levelIcon=" + getLevelIcon() + ", anchorLevelIcon=" + getAnchorLevelIcon() + ", anchorLevel=" + getAnchorLevel() + ", sex=" + getSex() + ", vipLevel=" + getVipLevel() + ", giftNum=" + getGiftNum() + ", top3List=" + getTop3List() + ", pk=" + getPk() + ", shareIcon=" + getShareIcon() + ", shareContent=" + getShareContent() + ", roomPopmessagePrice=" + getRoomPopmessagePrice() + ", fullPopmessagePrice=" + getFullPopmessagePrice() + ", openGiftAct=" + getOpenGiftAct() + ", giftActList=" + getGiftActList() + ")";
    }
}
