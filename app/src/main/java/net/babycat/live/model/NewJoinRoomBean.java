package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rtmp.ui.TXCloudVideoView;
import dh.c;
import g0.o0;
import java.util.List;
import net.babycat.live.model.StartPkBean;

/* JADX INFO: loaded from: classes4.dex */
public class NewJoinRoomBean {

    @SerializedName("anchors")
    private List<AnchorsDTO> anchors;

    @SerializedName("full_popmessage_price")
    private String fullPopmessagePrice;

    @SerializedName("game_baishun")
    private List<GameHallDTO> gameBaishun;

    @SerializedName("game_baishun_config")
    private GetConfigData gameBaishunConfig;

    @SerializedName("game_list")
    private List<gameListDTO> gameList;

    @SerializedName("game_show_type")
    private Integer gameShowType;

    @SerializedName("gf_sign")
    private String gfSign;

    @SerializedName("rocket_activity")
    private Integer rocketActivity;

    @SerializedName("room")
    private RoomDTO room;

    @SerializedName("room_popmessage_price")
    private String roomPopmessagePrice;

    @SerializedName("share_content")
    private String shareContent;

    @SerializedName("share_icon")
    private String shareIcon;

    @SerializedName("user_count")
    private String userCount;

    public static class AnchorsDTO {
        public static final transient int STATUS_UNUSED = 0;
        public static final transient int STATUS_USED = 1;

        @SerializedName("pk_background")
        private int PkBackground;

        @SerializedName("avatar")
        private String avatar;

        @SerializedName("avatar_frame")
        private String avatarFrame;

        @SerializedName("gif_id")
        private String gifId;

        @SerializedName("in_gift_count_on_mic")
        private Integer inGiftCountOnMic;

        @SerializedName("is_dice")
        private boolean isDice;

        @SerializedName("is_fans")
        private Integer isFans;

        @SerializedName("is_lock")
        private Integer isLock;

        @SerializedName("is_master")
        private Integer isMaster;

        @SerializedName("is_mute")
        private Integer isMute;

        @SerializedName("is_pk")
        private boolean isPk;

        @SerializedName("is_select")
        private boolean isSelect;

        @SerializedName("is_speak")
        private int isSpeak;

        @SerializedName("is_video")
        private Integer isVideo;

        @SerializedName("mic_num")
        private Integer micNum;

        @SerializedName("nickname")
        private String nickname;

        @SerializedName("nickname_color")
        private String nicknameColor;

        @SerializedName("pk_gift_count_on_mic")
        private Integer pkGiftCountOnMic;

        @SerializedName("price")
        private Integer price;

        @SerializedName("role")
        private Integer role;

        @SerializedName("sex")
        private Integer sex;

        @SerializedName(o0.CATEGORY_STATUS)
        public int status;

        @SerializedName("user_id")
        private Integer userId;

        @SerializedName("videoView")
        private transient TXCloudVideoView videoView;

        public boolean canEqual(Object obj) {
            return obj instanceof AnchorsDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AnchorsDTO)) {
                return false;
            }
            AnchorsDTO anchorsDTO = (AnchorsDTO) obj;
            if (!anchorsDTO.canEqual(this) || getStatus() != anchorsDTO.getStatus() || isSelect() != anchorsDTO.isSelect() || getIsSpeak() != anchorsDTO.getIsSpeak() || isPk() != anchorsDTO.isPk() || getPkBackground() != anchorsDTO.getPkBackground() || isDice() != anchorsDTO.isDice()) {
                return false;
            }
            Integer userId = getUserId();
            Integer userId2 = anchorsDTO.getUserId();
            if (userId != null ? !userId.equals(userId2) : userId2 != null) {
                return false;
            }
            Integer sex = getSex();
            Integer sex2 = anchorsDTO.getSex();
            if (sex != null ? !sex.equals(sex2) : sex2 != null) {
                return false;
            }
            Integer isMaster = getIsMaster();
            Integer isMaster2 = anchorsDTO.getIsMaster();
            if (isMaster != null ? !isMaster.equals(isMaster2) : isMaster2 != null) {
                return false;
            }
            Integer micNum = getMicNum();
            Integer micNum2 = anchorsDTO.getMicNum();
            if (micNum != null ? !micNum.equals(micNum2) : micNum2 != null) {
                return false;
            }
            Integer inGiftCountOnMic = getInGiftCountOnMic();
            Integer inGiftCountOnMic2 = anchorsDTO.getInGiftCountOnMic();
            if (inGiftCountOnMic != null ? !inGiftCountOnMic.equals(inGiftCountOnMic2) : inGiftCountOnMic2 != null) {
                return false;
            }
            Integer pkGiftCountOnMic = getPkGiftCountOnMic();
            Integer pkGiftCountOnMic2 = anchorsDTO.getPkGiftCountOnMic();
            if (pkGiftCountOnMic != null ? !pkGiftCountOnMic.equals(pkGiftCountOnMic2) : pkGiftCountOnMic2 != null) {
                return false;
            }
            Integer role = getRole();
            Integer role2 = anchorsDTO.getRole();
            if (role != null ? !role.equals(role2) : role2 != null) {
                return false;
            }
            Integer isFans = getIsFans();
            Integer isFans2 = anchorsDTO.getIsFans();
            if (isFans != null ? !isFans.equals(isFans2) : isFans2 != null) {
                return false;
            }
            Integer price = getPrice();
            Integer price2 = anchorsDTO.getPrice();
            if (price != null ? !price.equals(price2) : price2 != null) {
                return false;
            }
            Integer isLock = getIsLock();
            Integer isLock2 = anchorsDTO.getIsLock();
            if (isLock != null ? !isLock.equals(isLock2) : isLock2 != null) {
                return false;
            }
            Integer isMute = getIsMute();
            Integer isMute2 = anchorsDTO.getIsMute();
            if (isMute != null ? !isMute.equals(isMute2) : isMute2 != null) {
                return false;
            }
            Integer isVideo = getIsVideo();
            Integer isVideo2 = anchorsDTO.getIsVideo();
            if (isVideo != null ? !isVideo.equals(isVideo2) : isVideo2 != null) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = anchorsDTO.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String nicknameColor = getNicknameColor();
            String nicknameColor2 = anchorsDTO.getNicknameColor();
            if (nicknameColor != null ? !nicknameColor.equals(nicknameColor2) : nicknameColor2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = anchorsDTO.getAvatar();
            if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
                return false;
            }
            String avatarFrame = getAvatarFrame();
            String avatarFrame2 = anchorsDTO.getAvatarFrame();
            if (avatarFrame != null ? !avatarFrame.equals(avatarFrame2) : avatarFrame2 != null) {
                return false;
            }
            String gifId = getGifId();
            String gifId2 = anchorsDTO.getGifId();
            return gifId != null ? gifId.equals(gifId2) : gifId2 == null;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public String getAvatarFrame() {
            return this.avatarFrame;
        }

        public String getGifId() {
            return this.gifId;
        }

        public Integer getInGiftCountOnMic() {
            return this.inGiftCountOnMic;
        }

        public Integer getIsFans() {
            return this.isFans;
        }

        public Integer getIsLock() {
            return this.isLock;
        }

        public Integer getIsMaster() {
            return this.isMaster;
        }

        public Integer getIsMute() {
            return this.isMute;
        }

        public int getIsSpeak() {
            return this.isSpeak;
        }

        public Integer getIsVideo() {
            return this.isVideo;
        }

        public Integer getMicNum() {
            return this.micNum;
        }

        public String getNickname() {
            return this.nickname;
        }

        public String getNicknameColor() {
            return this.nicknameColor;
        }

        public int getPkBackground() {
            return this.PkBackground;
        }

        public Integer getPkGiftCountOnMic() {
            return this.pkGiftCountOnMic;
        }

        public Integer getPrice() {
            return this.price;
        }

        public Integer getRole() {
            return this.role;
        }

        public Integer getSex() {
            return this.sex;
        }

        public int getStatus() {
            return this.status;
        }

        public Integer getUserId() {
            return this.userId;
        }

        public TXCloudVideoView getVideoView() {
            return this.videoView;
        }

        public int hashCode() {
            int status = (((((((((getStatus() + 59) * 59) + (isSelect() ? 79 : 97)) * 59) + getIsSpeak()) * 59) + (isPk() ? 79 : 97)) * 59) + getPkBackground()) * 59;
            int i10 = isDice() ? 79 : 97;
            Integer userId = getUserId();
            int iHashCode = ((status + i10) * 59) + (userId == null ? 43 : userId.hashCode());
            Integer sex = getSex();
            int iHashCode2 = (iHashCode * 59) + (sex == null ? 43 : sex.hashCode());
            Integer isMaster = getIsMaster();
            int iHashCode3 = (iHashCode2 * 59) + (isMaster == null ? 43 : isMaster.hashCode());
            Integer micNum = getMicNum();
            int iHashCode4 = (iHashCode3 * 59) + (micNum == null ? 43 : micNum.hashCode());
            Integer inGiftCountOnMic = getInGiftCountOnMic();
            int iHashCode5 = (iHashCode4 * 59) + (inGiftCountOnMic == null ? 43 : inGiftCountOnMic.hashCode());
            Integer pkGiftCountOnMic = getPkGiftCountOnMic();
            int iHashCode6 = (iHashCode5 * 59) + (pkGiftCountOnMic == null ? 43 : pkGiftCountOnMic.hashCode());
            Integer role = getRole();
            int iHashCode7 = (iHashCode6 * 59) + (role == null ? 43 : role.hashCode());
            Integer isFans = getIsFans();
            int iHashCode8 = (iHashCode7 * 59) + (isFans == null ? 43 : isFans.hashCode());
            Integer price = getPrice();
            int iHashCode9 = (iHashCode8 * 59) + (price == null ? 43 : price.hashCode());
            Integer isLock = getIsLock();
            int iHashCode10 = (iHashCode9 * 59) + (isLock == null ? 43 : isLock.hashCode());
            Integer isMute = getIsMute();
            int iHashCode11 = (iHashCode10 * 59) + (isMute == null ? 43 : isMute.hashCode());
            Integer isVideo = getIsVideo();
            int iHashCode12 = (iHashCode11 * 59) + (isVideo == null ? 43 : isVideo.hashCode());
            String nickname = getNickname();
            int iHashCode13 = (iHashCode12 * 59) + (nickname == null ? 43 : nickname.hashCode());
            String nicknameColor = getNicknameColor();
            int iHashCode14 = (iHashCode13 * 59) + (nicknameColor == null ? 43 : nicknameColor.hashCode());
            String avatar = getAvatar();
            int iHashCode15 = (iHashCode14 * 59) + (avatar == null ? 43 : avatar.hashCode());
            String avatarFrame = getAvatarFrame();
            int iHashCode16 = (iHashCode15 * 59) + (avatarFrame == null ? 43 : avatarFrame.hashCode());
            String gifId = getGifId();
            return (iHashCode16 * 59) + (gifId != null ? gifId.hashCode() : 43);
        }

        public boolean isDice() {
            return this.isDice;
        }

        public boolean isPk() {
            return this.isPk;
        }

        public boolean isSelect() {
            return this.isSelect;
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setAvatarFrame(String str) {
            this.avatarFrame = str;
        }

        public void setDice(boolean z10) {
            this.isDice = z10;
        }

        public void setGifId(String str) {
            this.gifId = str;
        }

        public void setInGiftCountOnMic(Integer num) {
            this.inGiftCountOnMic = num;
        }

        public void setIsFans(Integer num) {
            this.isFans = num;
        }

        public void setIsLock(Integer num) {
            this.isLock = num;
        }

        public void setIsMaster(Integer num) {
            this.isMaster = num;
        }

        public void setIsMute(Integer num) {
            this.isMute = num;
        }

        public void setIsSpeak(int i10) {
            this.isSpeak = i10;
        }

        public void setIsVideo(Integer num) {
            this.isVideo = num;
        }

        public void setMicNum(Integer num) {
            this.micNum = num;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public void setNicknameColor(String str) {
            this.nicknameColor = str;
        }

        public void setPk(boolean z10) {
            this.isPk = z10;
        }

        public void setPkBackground(int i10) {
            this.PkBackground = i10;
        }

        public void setPkGiftCountOnMic(Integer num) {
            this.pkGiftCountOnMic = num;
        }

        public void setPrice(Integer num) {
            this.price = num;
        }

        public void setRole(Integer num) {
            this.role = num;
        }

        public void setSelect(boolean z10) {
            this.isSelect = z10;
        }

        public void setSex(Integer num) {
            this.sex = num;
        }

        public void setStatus(int i10) {
            this.status = i10;
        }

        public void setUserId(Integer num) {
            this.userId = num;
        }

        public void setVideoView(TXCloudVideoView tXCloudVideoView) {
            this.videoView = tXCloudVideoView;
        }

        public String toString() {
            return "NewJoinRoomBean.AnchorsDTO(status=" + getStatus() + ", userId=" + getUserId() + ", nickname=" + getNickname() + ", nicknameColor=" + getNicknameColor() + ", sex=" + getSex() + ", avatar=" + getAvatar() + ", avatarFrame=" + getAvatarFrame() + ", isMaster=" + getIsMaster() + ", micNum=" + getMicNum() + ", inGiftCountOnMic=" + getInGiftCountOnMic() + ", pkGiftCountOnMic=" + getPkGiftCountOnMic() + ", role=" + getRole() + ", isFans=" + getIsFans() + ", price=" + getPrice() + ", isLock=" + getIsLock() + ", isMute=" + getIsMute() + ", isSelect=" + isSelect() + ", isSpeak=" + getIsSpeak() + ", isPk=" + isPk() + ", PkBackground=" + getPkBackground() + ", gifId=" + getGifId() + ", isDice=" + isDice() + ", isVideo=" + getIsVideo() + ", videoView=" + getVideoView() + ")";
        }
    }

    public static class GameHallDTO {

        @SerializedName("icon")
        private String icon;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34871id;

        @SerializedName("name")
        private String name;

        @SerializedName("url")
        private String url;

        public boolean canEqual(Object obj) {
            return obj instanceof GameHallDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GameHallDTO)) {
                return false;
            }
            GameHallDTO gameHallDTO = (GameHallDTO) obj;
            if (!gameHallDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = gameHallDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            String name = getName();
            String name2 = gameHallDTO.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String url = getUrl();
            String url2 = gameHallDTO.getUrl();
            if (url != null ? !url.equals(url2) : url2 != null) {
                return false;
            }
            String icon = getIcon();
            String icon2 = gameHallDTO.getIcon();
            return icon != null ? icon.equals(icon2) : icon2 == null;
        }

        public String getIcon() {
            return this.icon;
        }

        public Integer getId() {
            return this.f34871id;
        }

        public String getName() {
            return this.name;
        }

        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            String name = getName();
            int iHashCode2 = ((iHashCode + 59) * 59) + (name == null ? 43 : name.hashCode());
            String url = getUrl();
            int iHashCode3 = (iHashCode2 * 59) + (url == null ? 43 : url.hashCode());
            String icon = getIcon();
            return (iHashCode3 * 59) + (icon != null ? icon.hashCode() : 43);
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setId(Integer num) {
            this.f34871id = num;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public String toString() {
            return "NewJoinRoomBean.GameHallDTO(id=" + getId() + ", name=" + getName() + ", url=" + getUrl() + ", icon=" + getIcon() + ")";
        }
    }

    public static class GetConfigData {

        @SerializedName("appChannel")
        private String appChannel;

        @SerializedName("appId")
        private String appId;

        @SerializedName("code")
        private String code;

        @SerializedName("gameConfig")
        private GameConfigDTO gameConfig;

        @SerializedName("gameMode")
        private Integer gameMode;

        @SerializedName("gsp")
        private Integer gsp;

        @SerializedName(c.f24533f)
        private Integer language;

        @SerializedName(TUIConstants.TUILive.ROOM_ID)
        private String roomId;

        @SerializedName(TUIConstants.TUILive.USER_ID)
        private String userId;

        public static class GameConfigDTO {

            @SerializedName("currencyIcon")
            private String currencyIcon;

            @SerializedName("sceneMode")
            private Integer sceneMode;

            public boolean canEqual(Object obj) {
                return obj instanceof GameConfigDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof GameConfigDTO)) {
                    return false;
                }
                GameConfigDTO gameConfigDTO = (GameConfigDTO) obj;
                if (!gameConfigDTO.canEqual(this)) {
                    return false;
                }
                Integer sceneMode = getSceneMode();
                Integer sceneMode2 = gameConfigDTO.getSceneMode();
                if (sceneMode != null ? !sceneMode.equals(sceneMode2) : sceneMode2 != null) {
                    return false;
                }
                String currencyIcon = getCurrencyIcon();
                String currencyIcon2 = gameConfigDTO.getCurrencyIcon();
                return currencyIcon != null ? currencyIcon.equals(currencyIcon2) : currencyIcon2 == null;
            }

            public String getCurrencyIcon() {
                return this.currencyIcon;
            }

            public Integer getSceneMode() {
                return this.sceneMode;
            }

            public int hashCode() {
                Integer sceneMode = getSceneMode();
                int iHashCode = sceneMode == null ? 43 : sceneMode.hashCode();
                String currencyIcon = getCurrencyIcon();
                return ((iHashCode + 59) * 59) + (currencyIcon != null ? currencyIcon.hashCode() : 43);
            }

            public void setCurrencyIcon(String str) {
                this.currencyIcon = str;
            }

            public void setSceneMode(Integer num) {
                this.sceneMode = num;
            }

            public String toString() {
                return "NewJoinRoomBean.GetConfigData.GameConfigDTO(sceneMode=" + getSceneMode() + ", currencyIcon=" + getCurrencyIcon() + ")";
            }
        }

        public boolean canEqual(Object obj) {
            return obj instanceof GetConfigData;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetConfigData)) {
                return false;
            }
            GetConfigData getConfigData = (GetConfigData) obj;
            if (!getConfigData.canEqual(this)) {
                return false;
            }
            Integer gameMode = getGameMode();
            Integer gameMode2 = getConfigData.getGameMode();
            if (gameMode != null ? !gameMode.equals(gameMode2) : gameMode2 != null) {
                return false;
            }
            Integer language = getLanguage();
            Integer language2 = getConfigData.getLanguage();
            if (language != null ? !language.equals(language2) : language2 != null) {
                return false;
            }
            Integer gsp = getGsp();
            Integer gsp2 = getConfigData.getGsp();
            if (gsp != null ? !gsp.equals(gsp2) : gsp2 != null) {
                return false;
            }
            String appChannel = getAppChannel();
            String appChannel2 = getConfigData.getAppChannel();
            if (appChannel != null ? !appChannel.equals(appChannel2) : appChannel2 != null) {
                return false;
            }
            String appId = getAppId();
            String appId2 = getConfigData.getAppId();
            if (appId != null ? !appId.equals(appId2) : appId2 != null) {
                return false;
            }
            String userId = getUserId();
            String userId2 = getConfigData.getUserId();
            if (userId != null ? !userId.equals(userId2) : userId2 != null) {
                return false;
            }
            String code = getCode();
            String code2 = getConfigData.getCode();
            if (code != null ? !code.equals(code2) : code2 != null) {
                return false;
            }
            String roomId = getRoomId();
            String roomId2 = getConfigData.getRoomId();
            if (roomId != null ? !roomId.equals(roomId2) : roomId2 != null) {
                return false;
            }
            GameConfigDTO gameConfig = getGameConfig();
            GameConfigDTO gameConfig2 = getConfigData.getGameConfig();
            return gameConfig != null ? gameConfig.equals(gameConfig2) : gameConfig2 == null;
        }

        public String getAppChannel() {
            return this.appChannel;
        }

        public String getAppId() {
            return this.appId;
        }

        public String getCode() {
            return this.code;
        }

        public GameConfigDTO getGameConfig() {
            return this.gameConfig;
        }

        public Integer getGameMode() {
            return this.gameMode;
        }

        public Integer getGsp() {
            return this.gsp;
        }

        public Integer getLanguage() {
            return this.language;
        }

        public String getRoomId() {
            return this.roomId;
        }

        public String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            Integer gameMode = getGameMode();
            int iHashCode = gameMode == null ? 43 : gameMode.hashCode();
            Integer language = getLanguage();
            int iHashCode2 = ((iHashCode + 59) * 59) + (language == null ? 43 : language.hashCode());
            Integer gsp = getGsp();
            int iHashCode3 = (iHashCode2 * 59) + (gsp == null ? 43 : gsp.hashCode());
            String appChannel = getAppChannel();
            int iHashCode4 = (iHashCode3 * 59) + (appChannel == null ? 43 : appChannel.hashCode());
            String appId = getAppId();
            int iHashCode5 = (iHashCode4 * 59) + (appId == null ? 43 : appId.hashCode());
            String userId = getUserId();
            int iHashCode6 = (iHashCode5 * 59) + (userId == null ? 43 : userId.hashCode());
            String code = getCode();
            int iHashCode7 = (iHashCode6 * 59) + (code == null ? 43 : code.hashCode());
            String roomId = getRoomId();
            int iHashCode8 = (iHashCode7 * 59) + (roomId == null ? 43 : roomId.hashCode());
            GameConfigDTO gameConfig = getGameConfig();
            return (iHashCode8 * 59) + (gameConfig != null ? gameConfig.hashCode() : 43);
        }

        public void setAppChannel(String str) {
            this.appChannel = str;
        }

        public void setAppId(String str) {
            this.appId = str;
        }

        public void setCode(String str) {
            this.code = str;
        }

        public void setGameConfig(GameConfigDTO gameConfigDTO) {
            this.gameConfig = gameConfigDTO;
        }

        public void setGameMode(Integer num) {
            this.gameMode = num;
        }

        public void setGsp(Integer num) {
            this.gsp = num;
        }

        public void setLanguage(Integer num) {
            this.language = num;
        }

        public void setRoomId(String str) {
            this.roomId = str;
        }

        public void setUserId(String str) {
            this.userId = str;
        }

        public String toString() {
            return "NewJoinRoomBean.GetConfigData(appChannel=" + getAppChannel() + ", appId=" + getAppId() + ", userId=" + getUserId() + ", code=" + getCode() + ", roomId=" + getRoomId() + ", gameMode=" + getGameMode() + ", language=" + getLanguage() + ", gameConfig=" + getGameConfig() + ", gsp=" + getGsp() + ")";
        }
    }

    public static class RoomDTO {

        @SerializedName(o0.c0.f25806t)
        private String background;

        @SerializedName("background_ext")
        private String backgroundExt;

        @SerializedName("chat_room_id")
        private String chatRoomId;

        @SerializedName("chat_status")
        private Integer chatStatus;

        @SerializedName("cover")
        private String cover;

        @SerializedName("custom_id")
        private Integer customId;

        @SerializedName("goodnum")
        private String goodnum;

        @SerializedName("group_id")
        private Integer groupId;

        @SerializedName("in_gift_count_on_mic")
        private Integer inGiftCountOnMic;

        @SerializedName("is_attention")
        private Integer isAttention;

        @SerializedName("is_collect")
        private Integer isCollect;

        @SerializedName("is_no_say")
        private Integer isNoSay;

        @SerializedName("is_pk")
        private Integer isPk;

        @SerializedName("is_video")
        private Integer isWatchMovie = 0;

        @SerializedName("jctx")
        private String jctx;

        @SerializedName("master_uid")
        private Integer masterUid;

        @SerializedName("mic_num")
        private Integer micNum;

        @SerializedName(TUIConstants.TUIChat.NOTICE)
        private String notice;

        @SerializedName("password")
        private String password;

        /* JADX INFO: renamed from: pk, reason: collision with root package name */
        @SerializedName("pk")
        private StartPkBean.PkDTO f34872pk;

        @SerializedName("role")
        private Integer role;

        @SerializedName("room_id")
        private Integer roomId;

        @SerializedName("room_name")
        private String roomName;

        @SerializedName("seat")
        private String seat;

        @SerializedName("tag")
        private String tag;

        /* JADX INFO: renamed from: top, reason: collision with root package name */
        @SerializedName("top")
        private TopDTO f34873top;

        @SerializedName("total_incomes")
        private Integer totalIncomes;

        @SerializedName("video_info")
        private VideoListBean videoInfo;

        @SerializedName("welcome_words")
        private String welcomeWords;

        public static class TopDTO {

            @SerializedName("anchor_level")
            private Integer anchorLevel;

            @SerializedName("anchor_level_icon")
            private String anchorLevelIcon;

            @SerializedName("avatar")
            private String avatar;

            @SerializedName("avatar_frame")
            private String avatarFrame;

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
            private String sex;

            @SerializedName("user_id")
            private Integer userId;

            public boolean canEqual(Object obj) {
                return obj instanceof TopDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof TopDTO)) {
                    return false;
                }
                TopDTO topDTO = (TopDTO) obj;
                if (!topDTO.canEqual(this)) {
                    return false;
                }
                Integer userId = getUserId();
                Integer userId2 = topDTO.getUserId();
                if (userId != null ? !userId.equals(userId2) : userId2 != null) {
                    return false;
                }
                Integer role = getRole();
                Integer role2 = topDTO.getRole();
                if (role != null ? !role.equals(role2) : role2 != null) {
                    return false;
                }
                Integer level = getLevel();
                Integer level2 = topDTO.getLevel();
                if (level != null ? !level.equals(level2) : level2 != null) {
                    return false;
                }
                Integer anchorLevel = getAnchorLevel();
                Integer anchorLevel2 = topDTO.getAnchorLevel();
                if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
                    return false;
                }
                Integer giftNum = getGiftNum();
                Integer giftNum2 = topDTO.getGiftNum();
                if (giftNum != null ? !giftNum.equals(giftNum2) : giftNum2 != null) {
                    return false;
                }
                String nickname = getNickname();
                String nickname2 = topDTO.getNickname();
                if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                    return false;
                }
                String avatar = getAvatar();
                String avatar2 = topDTO.getAvatar();
                if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
                    return false;
                }
                String avatarFrame = getAvatarFrame();
                String avatarFrame2 = topDTO.getAvatarFrame();
                if (avatarFrame != null ? !avatarFrame.equals(avatarFrame2) : avatarFrame2 != null) {
                    return false;
                }
                String levelIcon = getLevelIcon();
                String levelIcon2 = topDTO.getLevelIcon();
                if (levelIcon != null ? !levelIcon.equals(levelIcon2) : levelIcon2 != null) {
                    return false;
                }
                String anchorLevelIcon = getAnchorLevelIcon();
                String anchorLevelIcon2 = topDTO.getAnchorLevelIcon();
                if (anchorLevelIcon != null ? !anchorLevelIcon.equals(anchorLevelIcon2) : anchorLevelIcon2 != null) {
                    return false;
                }
                String sex = getSex();
                String sex2 = topDTO.getSex();
                return sex != null ? sex.equals(sex2) : sex2 == null;
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

            public String getSex() {
                return this.sex;
            }

            public Integer getUserId() {
                return this.userId;
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
                Integer giftNum = getGiftNum();
                int iHashCode5 = (iHashCode4 * 59) + (giftNum == null ? 43 : giftNum.hashCode());
                String nickname = getNickname();
                int iHashCode6 = (iHashCode5 * 59) + (nickname == null ? 43 : nickname.hashCode());
                String avatar = getAvatar();
                int iHashCode7 = (iHashCode6 * 59) + (avatar == null ? 43 : avatar.hashCode());
                String avatarFrame = getAvatarFrame();
                int iHashCode8 = (iHashCode7 * 59) + (avatarFrame == null ? 43 : avatarFrame.hashCode());
                String levelIcon = getLevelIcon();
                int iHashCode9 = (iHashCode8 * 59) + (levelIcon == null ? 43 : levelIcon.hashCode());
                String anchorLevelIcon = getAnchorLevelIcon();
                int iHashCode10 = (iHashCode9 * 59) + (anchorLevelIcon == null ? 43 : anchorLevelIcon.hashCode());
                String sex = getSex();
                return (iHashCode10 * 59) + (sex != null ? sex.hashCode() : 43);
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

            public void setSex(String str) {
                this.sex = str;
            }

            public void setUserId(Integer num) {
                this.userId = num;
            }

            public String toString() {
                return "NewJoinRoomBean.RoomDTO.TopDTO(userId=" + getUserId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", avatarFrame=" + getAvatarFrame() + ", role=" + getRole() + ", level=" + getLevel() + ", levelIcon=" + getLevelIcon() + ", anchorLevelIcon=" + getAnchorLevelIcon() + ", anchorLevel=" + getAnchorLevel() + ", sex=" + getSex() + ", giftNum=" + getGiftNum() + ")";
            }
        }

        public boolean canEqual(Object obj) {
            return obj instanceof RoomDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RoomDTO)) {
                return false;
            }
            RoomDTO roomDTO = (RoomDTO) obj;
            if (!roomDTO.canEqual(this)) {
                return false;
            }
            Integer roomId = getRoomId();
            Integer roomId2 = roomDTO.getRoomId();
            if (roomId != null ? !roomId.equals(roomId2) : roomId2 != null) {
                return false;
            }
            Integer customId = getCustomId();
            Integer customId2 = roomDTO.getCustomId();
            if (customId != null ? !customId.equals(customId2) : customId2 != null) {
                return false;
            }
            Integer masterUid = getMasterUid();
            Integer masterUid2 = roomDTO.getMasterUid();
            if (masterUid != null ? !masterUid.equals(masterUid2) : masterUid2 != null) {
                return false;
            }
            Integer groupId = getGroupId();
            Integer groupId2 = roomDTO.getGroupId();
            if (groupId != null ? !groupId.equals(groupId2) : groupId2 != null) {
                return false;
            }
            Integer isPk = getIsPk();
            Integer isPk2 = roomDTO.getIsPk();
            if (isPk != null ? !isPk.equals(isPk2) : isPk2 != null) {
                return false;
            }
            Integer isWatchMovie = getIsWatchMovie();
            Integer isWatchMovie2 = roomDTO.getIsWatchMovie();
            if (isWatchMovie != null ? !isWatchMovie.equals(isWatchMovie2) : isWatchMovie2 != null) {
                return false;
            }
            Integer micNum = getMicNum();
            Integer micNum2 = roomDTO.getMicNum();
            if (micNum != null ? !micNum.equals(micNum2) : micNum2 != null) {
                return false;
            }
            Integer role = getRole();
            Integer role2 = roomDTO.getRole();
            if (role != null ? !role.equals(role2) : role2 != null) {
                return false;
            }
            Integer isCollect = getIsCollect();
            Integer isCollect2 = roomDTO.getIsCollect();
            if (isCollect != null ? !isCollect.equals(isCollect2) : isCollect2 != null) {
                return false;
            }
            Integer inGiftCountOnMic = getInGiftCountOnMic();
            Integer inGiftCountOnMic2 = roomDTO.getInGiftCountOnMic();
            if (inGiftCountOnMic != null ? !inGiftCountOnMic.equals(inGiftCountOnMic2) : inGiftCountOnMic2 != null) {
                return false;
            }
            Integer isNoSay = getIsNoSay();
            Integer isNoSay2 = roomDTO.getIsNoSay();
            if (isNoSay != null ? !isNoSay.equals(isNoSay2) : isNoSay2 != null) {
                return false;
            }
            Integer isAttention = getIsAttention();
            Integer isAttention2 = roomDTO.getIsAttention();
            if (isAttention != null ? !isAttention.equals(isAttention2) : isAttention2 != null) {
                return false;
            }
            Integer chatStatus = getChatStatus();
            Integer chatStatus2 = roomDTO.getChatStatus();
            if (chatStatus != null ? !chatStatus.equals(chatStatus2) : chatStatus2 != null) {
                return false;
            }
            Integer totalIncomes = getTotalIncomes();
            Integer totalIncomes2 = roomDTO.getTotalIncomes();
            if (totalIncomes != null ? !totalIncomes.equals(totalIncomes2) : totalIncomes2 != null) {
                return false;
            }
            String chatRoomId = getChatRoomId();
            String chatRoomId2 = roomDTO.getChatRoomId();
            if (chatRoomId != null ? !chatRoomId.equals(chatRoomId2) : chatRoomId2 != null) {
                return false;
            }
            String roomName = getRoomName();
            String roomName2 = roomDTO.getRoomName();
            if (roomName != null ? !roomName.equals(roomName2) : roomName2 != null) {
                return false;
            }
            String cover = getCover();
            String cover2 = roomDTO.getCover();
            if (cover != null ? !cover.equals(cover2) : cover2 != null) {
                return false;
            }
            String tag = getTag();
            String tag2 = roomDTO.getTag();
            if (tag != null ? !tag.equals(tag2) : tag2 != null) {
                return false;
            }
            String notice = getNotice();
            String notice2 = roomDTO.getNotice();
            if (notice != null ? !notice.equals(notice2) : notice2 != null) {
                return false;
            }
            String welcomeWords = getWelcomeWords();
            String welcomeWords2 = roomDTO.getWelcomeWords();
            if (welcomeWords != null ? !welcomeWords.equals(welcomeWords2) : welcomeWords2 != null) {
                return false;
            }
            String background = getBackground();
            String background2 = roomDTO.getBackground();
            if (background != null ? !background.equals(background2) : background2 != null) {
                return false;
            }
            String seat = getSeat();
            String seat2 = roomDTO.getSeat();
            if (seat != null ? !seat.equals(seat2) : seat2 != null) {
                return false;
            }
            String backgroundExt = getBackgroundExt();
            String backgroundExt2 = roomDTO.getBackgroundExt();
            if (backgroundExt != null ? !backgroundExt.equals(backgroundExt2) : backgroundExt2 != null) {
                return false;
            }
            StartPkBean.PkDTO pk2 = getPk();
            StartPkBean.PkDTO pk3 = roomDTO.getPk();
            if (pk2 != null ? !pk2.equals(pk3) : pk3 != null) {
                return false;
            }
            VideoListBean videoInfo = getVideoInfo();
            VideoListBean videoInfo2 = roomDTO.getVideoInfo();
            if (videoInfo != null ? !videoInfo.equals(videoInfo2) : videoInfo2 != null) {
                return false;
            }
            String jctx = getJctx();
            String jctx2 = roomDTO.getJctx();
            if (jctx != null ? !jctx.equals(jctx2) : jctx2 != null) {
                return false;
            }
            TopDTO top2 = getTop();
            TopDTO top3 = roomDTO.getTop();
            if (top2 != null ? !top2.equals(top3) : top3 != null) {
                return false;
            }
            String password = getPassword();
            String password2 = roomDTO.getPassword();
            if (password != null ? !password.equals(password2) : password2 != null) {
                return false;
            }
            String goodnum = getGoodnum();
            String goodnum2 = roomDTO.getGoodnum();
            return goodnum != null ? goodnum.equals(goodnum2) : goodnum2 == null;
        }

        public String getBackground() {
            return this.background;
        }

        public String getBackgroundExt() {
            return this.backgroundExt;
        }

        public String getChatRoomId() {
            return this.chatRoomId;
        }

        public Integer getChatStatus() {
            return this.chatStatus;
        }

        public String getCover() {
            return this.cover;
        }

        public Integer getCustomId() {
            return this.customId;
        }

        public String getGoodnum() {
            return this.goodnum;
        }

        public Integer getGroupId() {
            return this.groupId;
        }

        public Integer getInGiftCountOnMic() {
            return this.inGiftCountOnMic;
        }

        public Integer getIsAttention() {
            return this.isAttention;
        }

        public Integer getIsCollect() {
            return this.isCollect;
        }

        public Integer getIsNoSay() {
            return this.isNoSay;
        }

        public Integer getIsPk() {
            return this.isPk;
        }

        public Integer getIsWatchMovie() {
            return this.isWatchMovie;
        }

        public String getJctx() {
            return this.jctx;
        }

        public Integer getMasterUid() {
            return this.masterUid;
        }

        public Integer getMicNum() {
            return this.micNum;
        }

        public String getNotice() {
            return this.notice;
        }

        public String getPassword() {
            return this.password;
        }

        public StartPkBean.PkDTO getPk() {
            return this.f34872pk;
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

        public String getSeat() {
            return this.seat;
        }

        public String getTag() {
            return this.tag;
        }

        public TopDTO getTop() {
            return this.f34873top;
        }

        public Integer getTotalIncomes() {
            return this.totalIncomes;
        }

        public VideoListBean getVideoInfo() {
            return this.videoInfo;
        }

        public String getWelcomeWords() {
            return this.welcomeWords;
        }

        public int hashCode() {
            Integer roomId = getRoomId();
            int iHashCode = roomId == null ? 43 : roomId.hashCode();
            Integer customId = getCustomId();
            int iHashCode2 = ((iHashCode + 59) * 59) + (customId == null ? 43 : customId.hashCode());
            Integer masterUid = getMasterUid();
            int iHashCode3 = (iHashCode2 * 59) + (masterUid == null ? 43 : masterUid.hashCode());
            Integer groupId = getGroupId();
            int iHashCode4 = (iHashCode3 * 59) + (groupId == null ? 43 : groupId.hashCode());
            Integer isPk = getIsPk();
            int iHashCode5 = (iHashCode4 * 59) + (isPk == null ? 43 : isPk.hashCode());
            Integer isWatchMovie = getIsWatchMovie();
            int iHashCode6 = (iHashCode5 * 59) + (isWatchMovie == null ? 43 : isWatchMovie.hashCode());
            Integer micNum = getMicNum();
            int iHashCode7 = (iHashCode6 * 59) + (micNum == null ? 43 : micNum.hashCode());
            Integer role = getRole();
            int iHashCode8 = (iHashCode7 * 59) + (role == null ? 43 : role.hashCode());
            Integer isCollect = getIsCollect();
            int iHashCode9 = (iHashCode8 * 59) + (isCollect == null ? 43 : isCollect.hashCode());
            Integer inGiftCountOnMic = getInGiftCountOnMic();
            int iHashCode10 = (iHashCode9 * 59) + (inGiftCountOnMic == null ? 43 : inGiftCountOnMic.hashCode());
            Integer isNoSay = getIsNoSay();
            int iHashCode11 = (iHashCode10 * 59) + (isNoSay == null ? 43 : isNoSay.hashCode());
            Integer isAttention = getIsAttention();
            int iHashCode12 = (iHashCode11 * 59) + (isAttention == null ? 43 : isAttention.hashCode());
            Integer chatStatus = getChatStatus();
            int iHashCode13 = (iHashCode12 * 59) + (chatStatus == null ? 43 : chatStatus.hashCode());
            Integer totalIncomes = getTotalIncomes();
            int iHashCode14 = (iHashCode13 * 59) + (totalIncomes == null ? 43 : totalIncomes.hashCode());
            String chatRoomId = getChatRoomId();
            int iHashCode15 = (iHashCode14 * 59) + (chatRoomId == null ? 43 : chatRoomId.hashCode());
            String roomName = getRoomName();
            int iHashCode16 = (iHashCode15 * 59) + (roomName == null ? 43 : roomName.hashCode());
            String cover = getCover();
            int iHashCode17 = (iHashCode16 * 59) + (cover == null ? 43 : cover.hashCode());
            String tag = getTag();
            int iHashCode18 = (iHashCode17 * 59) + (tag == null ? 43 : tag.hashCode());
            String notice = getNotice();
            int iHashCode19 = (iHashCode18 * 59) + (notice == null ? 43 : notice.hashCode());
            String welcomeWords = getWelcomeWords();
            int iHashCode20 = (iHashCode19 * 59) + (welcomeWords == null ? 43 : welcomeWords.hashCode());
            String background = getBackground();
            int iHashCode21 = (iHashCode20 * 59) + (background == null ? 43 : background.hashCode());
            String seat = getSeat();
            int iHashCode22 = (iHashCode21 * 59) + (seat == null ? 43 : seat.hashCode());
            String backgroundExt = getBackgroundExt();
            int iHashCode23 = (iHashCode22 * 59) + (backgroundExt == null ? 43 : backgroundExt.hashCode());
            StartPkBean.PkDTO pk2 = getPk();
            int iHashCode24 = (iHashCode23 * 59) + (pk2 == null ? 43 : pk2.hashCode());
            VideoListBean videoInfo = getVideoInfo();
            int iHashCode25 = (iHashCode24 * 59) + (videoInfo == null ? 43 : videoInfo.hashCode());
            String jctx = getJctx();
            int iHashCode26 = (iHashCode25 * 59) + (jctx == null ? 43 : jctx.hashCode());
            TopDTO top2 = getTop();
            int iHashCode27 = (iHashCode26 * 59) + (top2 == null ? 43 : top2.hashCode());
            String password = getPassword();
            int iHashCode28 = (iHashCode27 * 59) + (password == null ? 43 : password.hashCode());
            String goodnum = getGoodnum();
            return (iHashCode28 * 59) + (goodnum != null ? goodnum.hashCode() : 43);
        }

        public void setBackground(String str) {
            this.background = str;
        }

        public void setBackgroundExt(String str) {
            this.backgroundExt = str;
        }

        public void setChatRoomId(String str) {
            this.chatRoomId = str;
        }

        public void setChatStatus(Integer num) {
            this.chatStatus = num;
        }

        public void setCover(String str) {
            this.cover = str;
        }

        public void setCustomId(Integer num) {
            this.customId = num;
        }

        public void setGoodnum(String str) {
            this.goodnum = str;
        }

        public void setGroupId(Integer num) {
            this.groupId = num;
        }

        public void setInGiftCountOnMic(Integer num) {
            this.inGiftCountOnMic = num;
        }

        public void setIsAttention(Integer num) {
            this.isAttention = num;
        }

        public void setIsCollect(Integer num) {
            this.isCollect = num;
        }

        public void setIsNoSay(Integer num) {
            this.isNoSay = num;
        }

        public void setIsPk(Integer num) {
            this.isPk = num;
        }

        public void setIsWatchMovie(Integer num) {
            this.isWatchMovie = num;
        }

        public void setJctx(String str) {
            this.jctx = str;
        }

        public void setMasterUid(Integer num) {
            this.masterUid = num;
        }

        public void setMicNum(Integer num) {
            this.micNum = num;
        }

        public void setNotice(String str) {
            this.notice = str;
        }

        public void setPassword(String str) {
            this.password = str;
        }

        public void setPk(StartPkBean.PkDTO pkDTO) {
            this.f34872pk = pkDTO;
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

        public void setSeat(String str) {
            this.seat = str;
        }

        public void setTag(String str) {
            this.tag = str;
        }

        public void setTop(TopDTO topDTO) {
            this.f34873top = topDTO;
        }

        public void setTotalIncomes(Integer num) {
            this.totalIncomes = num;
        }

        public void setVideoInfo(VideoListBean videoListBean) {
            this.videoInfo = videoListBean;
        }

        public void setWelcomeWords(String str) {
            this.welcomeWords = str;
        }

        public String toString() {
            return "NewJoinRoomBean.RoomDTO(roomId=" + getRoomId() + ", customId=" + getCustomId() + ", chatRoomId=" + getChatRoomId() + ", masterUid=" + getMasterUid() + ", groupId=" + getGroupId() + ", roomName=" + getRoomName() + ", cover=" + getCover() + ", tag=" + getTag() + ", notice=" + getNotice() + ", welcomeWords=" + getWelcomeWords() + ", background=" + getBackground() + ", seat=" + getSeat() + ", backgroundExt=" + getBackgroundExt() + ", isPk=" + getIsPk() + ", pk=" + getPk() + ", isWatchMovie=" + getIsWatchMovie() + ", videoInfo=" + getVideoInfo() + ", micNum=" + getMicNum() + ", role=" + getRole() + ", isCollect=" + getIsCollect() + ", inGiftCountOnMic=" + getInGiftCountOnMic() + ", isNoSay=" + getIsNoSay() + ", isAttention=" + getIsAttention() + ", chatStatus=" + getChatStatus() + ", jctx=" + getJctx() + ", top=" + getTop() + ", password=" + getPassword() + ", goodnum=" + getGoodnum() + ", totalIncomes=" + getTotalIncomes() + ")";
        }
    }

    public static class gameListDTO {

        @SerializedName("icon")
        private String icon;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34874id;

        public boolean canEqual(Object obj) {
            return obj instanceof gameListDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof gameListDTO)) {
                return false;
            }
            gameListDTO gamelistdto = (gameListDTO) obj;
            if (!gamelistdto.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = gamelistdto.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            String icon = getIcon();
            String icon2 = gamelistdto.getIcon();
            return icon != null ? icon.equals(icon2) : icon2 == null;
        }

        public String getIcon() {
            return this.icon;
        }

        public Integer getId() {
            return this.f34874id;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            String icon = getIcon();
            return ((iHashCode + 59) * 59) + (icon != null ? icon.hashCode() : 43);
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setId(Integer num) {
            this.f34874id = num;
        }

        public String toString() {
            return "NewJoinRoomBean.gameListDTO(id=" + getId() + ", icon=" + getIcon() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof NewJoinRoomBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewJoinRoomBean)) {
            return false;
        }
        NewJoinRoomBean newJoinRoomBean = (NewJoinRoomBean) obj;
        if (!newJoinRoomBean.canEqual(this)) {
            return false;
        }
        Integer gameShowType = getGameShowType();
        Integer gameShowType2 = newJoinRoomBean.getGameShowType();
        if (gameShowType != null ? !gameShowType.equals(gameShowType2) : gameShowType2 != null) {
            return false;
        }
        Integer rocketActivity = getRocketActivity();
        Integer rocketActivity2 = newJoinRoomBean.getRocketActivity();
        if (rocketActivity != null ? !rocketActivity.equals(rocketActivity2) : rocketActivity2 != null) {
            return false;
        }
        String userCount = getUserCount();
        String userCount2 = newJoinRoomBean.getUserCount();
        if (userCount != null ? !userCount.equals(userCount2) : userCount2 != null) {
            return false;
        }
        String shareIcon = getShareIcon();
        String shareIcon2 = newJoinRoomBean.getShareIcon();
        if (shareIcon != null ? !shareIcon.equals(shareIcon2) : shareIcon2 != null) {
            return false;
        }
        String shareContent = getShareContent();
        String shareContent2 = newJoinRoomBean.getShareContent();
        if (shareContent != null ? !shareContent.equals(shareContent2) : shareContent2 != null) {
            return false;
        }
        RoomDTO room = getRoom();
        RoomDTO room2 = newJoinRoomBean.getRoom();
        if (room != null ? !room.equals(room2) : room2 != null) {
            return false;
        }
        List<AnchorsDTO> anchors = getAnchors();
        List<AnchorsDTO> anchors2 = newJoinRoomBean.getAnchors();
        if (anchors != null ? !anchors.equals(anchors2) : anchors2 != null) {
            return false;
        }
        List<gameListDTO> gameList = getGameList();
        List<gameListDTO> gameList2 = newJoinRoomBean.getGameList();
        if (gameList != null ? !gameList.equals(gameList2) : gameList2 != null) {
            return false;
        }
        List<GameHallDTO> gameBaishun = getGameBaishun();
        List<GameHallDTO> gameBaishun2 = newJoinRoomBean.getGameBaishun();
        if (gameBaishun != null ? !gameBaishun.equals(gameBaishun2) : gameBaishun2 != null) {
            return false;
        }
        GetConfigData gameBaishunConfig = getGameBaishunConfig();
        GetConfigData gameBaishunConfig2 = newJoinRoomBean.getGameBaishunConfig();
        if (gameBaishunConfig != null ? !gameBaishunConfig.equals(gameBaishunConfig2) : gameBaishunConfig2 != null) {
            return false;
        }
        String gfSign = getGfSign();
        String gfSign2 = newJoinRoomBean.getGfSign();
        if (gfSign != null ? !gfSign.equals(gfSign2) : gfSign2 != null) {
            return false;
        }
        String roomPopmessagePrice = getRoomPopmessagePrice();
        String roomPopmessagePrice2 = newJoinRoomBean.getRoomPopmessagePrice();
        if (roomPopmessagePrice != null ? !roomPopmessagePrice.equals(roomPopmessagePrice2) : roomPopmessagePrice2 != null) {
            return false;
        }
        String fullPopmessagePrice = getFullPopmessagePrice();
        String fullPopmessagePrice2 = newJoinRoomBean.getFullPopmessagePrice();
        return fullPopmessagePrice != null ? fullPopmessagePrice.equals(fullPopmessagePrice2) : fullPopmessagePrice2 == null;
    }

    public List<AnchorsDTO> getAnchors() {
        return this.anchors;
    }

    public String getFullPopmessagePrice() {
        return this.fullPopmessagePrice;
    }

    public List<GameHallDTO> getGameBaishun() {
        return this.gameBaishun;
    }

    public GetConfigData getGameBaishunConfig() {
        return this.gameBaishunConfig;
    }

    public List<gameListDTO> getGameList() {
        return this.gameList;
    }

    public Integer getGameShowType() {
        return this.gameShowType;
    }

    public String getGfSign() {
        return this.gfSign;
    }

    public Integer getRocketActivity() {
        return this.rocketActivity;
    }

    public RoomDTO getRoom() {
        return this.room;
    }

    public String getRoomPopmessagePrice() {
        return this.roomPopmessagePrice;
    }

    public String getShareContent() {
        return this.shareContent;
    }

    public String getShareIcon() {
        return this.shareIcon;
    }

    public String getUserCount() {
        return this.userCount;
    }

    public int hashCode() {
        Integer gameShowType = getGameShowType();
        int iHashCode = gameShowType == null ? 43 : gameShowType.hashCode();
        Integer rocketActivity = getRocketActivity();
        int iHashCode2 = ((iHashCode + 59) * 59) + (rocketActivity == null ? 43 : rocketActivity.hashCode());
        String userCount = getUserCount();
        int iHashCode3 = (iHashCode2 * 59) + (userCount == null ? 43 : userCount.hashCode());
        String shareIcon = getShareIcon();
        int iHashCode4 = (iHashCode3 * 59) + (shareIcon == null ? 43 : shareIcon.hashCode());
        String shareContent = getShareContent();
        int iHashCode5 = (iHashCode4 * 59) + (shareContent == null ? 43 : shareContent.hashCode());
        RoomDTO room = getRoom();
        int iHashCode6 = (iHashCode5 * 59) + (room == null ? 43 : room.hashCode());
        List<AnchorsDTO> anchors = getAnchors();
        int iHashCode7 = (iHashCode6 * 59) + (anchors == null ? 43 : anchors.hashCode());
        List<gameListDTO> gameList = getGameList();
        int iHashCode8 = (iHashCode7 * 59) + (gameList == null ? 43 : gameList.hashCode());
        List<GameHallDTO> gameBaishun = getGameBaishun();
        int iHashCode9 = (iHashCode8 * 59) + (gameBaishun == null ? 43 : gameBaishun.hashCode());
        GetConfigData gameBaishunConfig = getGameBaishunConfig();
        int iHashCode10 = (iHashCode9 * 59) + (gameBaishunConfig == null ? 43 : gameBaishunConfig.hashCode());
        String gfSign = getGfSign();
        int iHashCode11 = (iHashCode10 * 59) + (gfSign == null ? 43 : gfSign.hashCode());
        String roomPopmessagePrice = getRoomPopmessagePrice();
        int iHashCode12 = (iHashCode11 * 59) + (roomPopmessagePrice == null ? 43 : roomPopmessagePrice.hashCode());
        String fullPopmessagePrice = getFullPopmessagePrice();
        return (iHashCode12 * 59) + (fullPopmessagePrice != null ? fullPopmessagePrice.hashCode() : 43);
    }

    public void setAnchors(List<AnchorsDTO> list) {
        this.anchors = list;
    }

    public void setFullPopmessagePrice(String str) {
        this.fullPopmessagePrice = str;
    }

    public void setGameBaishun(List<GameHallDTO> list) {
        this.gameBaishun = list;
    }

    public void setGameBaishunConfig(GetConfigData getConfigData) {
        this.gameBaishunConfig = getConfigData;
    }

    public void setGameList(List<gameListDTO> list) {
        this.gameList = list;
    }

    public void setGameShowType(Integer num) {
        this.gameShowType = num;
    }

    public void setGfSign(String str) {
        this.gfSign = str;
    }

    public void setRocketActivity(Integer num) {
        this.rocketActivity = num;
    }

    public void setRoom(RoomDTO roomDTO) {
        this.room = roomDTO;
    }

    public void setRoomPopmessagePrice(String str) {
        this.roomPopmessagePrice = str;
    }

    public void setShareContent(String str) {
        this.shareContent = str;
    }

    public void setShareIcon(String str) {
        this.shareIcon = str;
    }

    public void setUserCount(String str) {
        this.userCount = str;
    }

    public String toString() {
        return "NewJoinRoomBean(userCount=" + getUserCount() + ", shareIcon=" + getShareIcon() + ", shareContent=" + getShareContent() + ", gameShowType=" + getGameShowType() + ", room=" + getRoom() + ", anchors=" + getAnchors() + ", gameList=" + getGameList() + ", gameBaishun=" + getGameBaishun() + ", gameBaishunConfig=" + getGameBaishunConfig() + ", rocketActivity=" + getRocketActivity() + ", gfSign=" + getGfSign() + ", roomPopmessagePrice=" + getRoomPopmessagePrice() + ", fullPopmessagePrice=" + getFullPopmessagePrice() + ")";
    }
}
