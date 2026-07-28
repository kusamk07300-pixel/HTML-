package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import com.tencent.qcloud.tuicore.TUIConstants;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class JoinRoomBean {

    @SerializedName("anchors")
    private List<AnchorsDTO> anchors;

    @SerializedName("locked_mics")
    private List<Integer> lockedMics;

    @SerializedName("room")
    private RoomDTO room;

    @SerializedName("user_count")
    private Integer userCount;

    public static class AnchorsDTO {

        @SerializedName("avatar")
        private String avatar;

        @SerializedName("avatar_frame")
        private List<AvatarFrameBean> avatarFrame;

        @SerializedName("in_gift_count_on_mic")
        private Integer inGiftCountOnMic;

        @SerializedName("is_master")
        private Integer isMaster;

        @SerializedName("is_select")
        private boolean isSelect;

        @SerializedName("jctx")
        private List<JctxDTOBean> jctx;

        @SerializedName("mic_num")
        private Integer micNum;

        @SerializedName("nickname")
        private String nickname;

        @SerializedName("sex")
        private Integer sex;

        @SerializedName("user_id")
        private Integer userId;

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
            if (!anchorsDTO.canEqual(this) || isSelect() != anchorsDTO.isSelect()) {
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
            String nickname = getNickname();
            String nickname2 = anchorsDTO.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = anchorsDTO.getAvatar();
            if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
                return false;
            }
            List<AvatarFrameBean> avatarFrame = getAvatarFrame();
            List<AvatarFrameBean> avatarFrame2 = anchorsDTO.getAvatarFrame();
            if (avatarFrame != null ? !avatarFrame.equals(avatarFrame2) : avatarFrame2 != null) {
                return false;
            }
            List<JctxDTOBean> jctx = getJctx();
            List<JctxDTOBean> jctx2 = anchorsDTO.getJctx();
            return jctx != null ? jctx.equals(jctx2) : jctx2 == null;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public List<AvatarFrameBean> getAvatarFrame() {
            return this.avatarFrame;
        }

        public Integer getInGiftCountOnMic() {
            return this.inGiftCountOnMic;
        }

        public Integer getIsMaster() {
            return this.isMaster;
        }

        public List<JctxDTOBean> getJctx() {
            return this.jctx;
        }

        public Integer getMicNum() {
            return this.micNum;
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

        public int hashCode() {
            int i10 = isSelect() ? 79 : 97;
            Integer userId = getUserId();
            int iHashCode = ((i10 + 59) * 59) + (userId == null ? 43 : userId.hashCode());
            Integer sex = getSex();
            int iHashCode2 = (iHashCode * 59) + (sex == null ? 43 : sex.hashCode());
            Integer isMaster = getIsMaster();
            int iHashCode3 = (iHashCode2 * 59) + (isMaster == null ? 43 : isMaster.hashCode());
            Integer micNum = getMicNum();
            int iHashCode4 = (iHashCode3 * 59) + (micNum == null ? 43 : micNum.hashCode());
            Integer inGiftCountOnMic = getInGiftCountOnMic();
            int iHashCode5 = (iHashCode4 * 59) + (inGiftCountOnMic == null ? 43 : inGiftCountOnMic.hashCode());
            String nickname = getNickname();
            int iHashCode6 = (iHashCode5 * 59) + (nickname == null ? 43 : nickname.hashCode());
            String avatar = getAvatar();
            int iHashCode7 = (iHashCode6 * 59) + (avatar == null ? 43 : avatar.hashCode());
            List<AvatarFrameBean> avatarFrame = getAvatarFrame();
            int iHashCode8 = (iHashCode7 * 59) + (avatarFrame == null ? 43 : avatarFrame.hashCode());
            List<JctxDTOBean> jctx = getJctx();
            return (iHashCode8 * 59) + (jctx != null ? jctx.hashCode() : 43);
        }

        public boolean isSelect() {
            return this.isSelect;
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setAvatarFrame(List<AvatarFrameBean> list) {
            this.avatarFrame = list;
        }

        public void setInGiftCountOnMic(Integer num) {
            this.inGiftCountOnMic = num;
        }

        public void setIsMaster(Integer num) {
            this.isMaster = num;
        }

        public void setJctx(List<JctxDTOBean> list) {
            this.jctx = list;
        }

        public void setMicNum(Integer num) {
            this.micNum = num;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public void setSelect(boolean z10) {
            this.isSelect = z10;
        }

        public void setSex(Integer num) {
            this.sex = num;
        }

        public void setUserId(Integer num) {
            this.userId = num;
        }

        public String toString() {
            return "JoinRoomBean.AnchorsDTO(userId=" + getUserId() + ", sex=" + getSex() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", avatarFrame=" + getAvatarFrame() + ", jctx=" + getJctx() + ", isMaster=" + getIsMaster() + ", micNum=" + getMicNum() + ", inGiftCountOnMic=" + getInGiftCountOnMic() + ", isSelect=" + isSelect() + ")";
        }
    }

    public static class RoomDTO {

        @SerializedName(o0.c0.f25806t)
        private String background;

        @SerializedName("chat_room_id")
        private String chatRoomId;

        @SerializedName("cover")
        private String cover;

        @SerializedName("group_id")
        private Integer groupId;

        @SerializedName("is_no_mic")
        private Integer is_no_mic;

        @SerializedName("is_no_say")
        private Integer is_no_say;

        @SerializedName("jctx")
        private List<JctxDTOBean> jctx;

        @SerializedName("master_uid")
        private Integer masterUid;

        @SerializedName(TUIConstants.TUIChat.NOTICE)
        private String notice;

        @SerializedName("role")
        private Integer role;

        @SerializedName("room_id")
        private Integer roomId;

        @SerializedName("room_name")
        private String roomName;

        @SerializedName("tag")
        private String tag;

        @SerializedName("welcome_words")
        private String welcomeWords;

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
            Integer role = getRole();
            Integer role2 = roomDTO.getRole();
            if (role != null ? !role.equals(role2) : role2 != null) {
                return false;
            }
            Integer is_no_say = getIs_no_say();
            Integer is_no_say2 = roomDTO.getIs_no_say();
            if (is_no_say != null ? !is_no_say.equals(is_no_say2) : is_no_say2 != null) {
                return false;
            }
            Integer is_no_mic = getIs_no_mic();
            Integer is_no_mic2 = roomDTO.getIs_no_mic();
            if (is_no_mic != null ? !is_no_mic.equals(is_no_mic2) : is_no_mic2 != null) {
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
            List<JctxDTOBean> jctx = getJctx();
            List<JctxDTOBean> jctx2 = roomDTO.getJctx();
            return jctx != null ? jctx.equals(jctx2) : jctx2 == null;
        }

        public String getBackground() {
            return this.background;
        }

        public String getChatRoomId() {
            return this.chatRoomId;
        }

        public String getCover() {
            return this.cover;
        }

        public Integer getGroupId() {
            return this.groupId;
        }

        public Integer getIs_no_mic() {
            return this.is_no_mic;
        }

        public Integer getIs_no_say() {
            return this.is_no_say;
        }

        public List<JctxDTOBean> getJctx() {
            return this.jctx;
        }

        public Integer getMasterUid() {
            return this.masterUid;
        }

        public String getNotice() {
            return this.notice;
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

        public String getTag() {
            return this.tag;
        }

        public String getWelcomeWords() {
            return this.welcomeWords;
        }

        public int hashCode() {
            Integer roomId = getRoomId();
            int iHashCode = roomId == null ? 43 : roomId.hashCode();
            Integer masterUid = getMasterUid();
            int iHashCode2 = ((iHashCode + 59) * 59) + (masterUid == null ? 43 : masterUid.hashCode());
            Integer groupId = getGroupId();
            int iHashCode3 = (iHashCode2 * 59) + (groupId == null ? 43 : groupId.hashCode());
            Integer role = getRole();
            int iHashCode4 = (iHashCode3 * 59) + (role == null ? 43 : role.hashCode());
            Integer is_no_say = getIs_no_say();
            int iHashCode5 = (iHashCode4 * 59) + (is_no_say == null ? 43 : is_no_say.hashCode());
            Integer is_no_mic = getIs_no_mic();
            int iHashCode6 = (iHashCode5 * 59) + (is_no_mic == null ? 43 : is_no_mic.hashCode());
            String chatRoomId = getChatRoomId();
            int iHashCode7 = (iHashCode6 * 59) + (chatRoomId == null ? 43 : chatRoomId.hashCode());
            String roomName = getRoomName();
            int iHashCode8 = (iHashCode7 * 59) + (roomName == null ? 43 : roomName.hashCode());
            String cover = getCover();
            int iHashCode9 = (iHashCode8 * 59) + (cover == null ? 43 : cover.hashCode());
            String tag = getTag();
            int iHashCode10 = (iHashCode9 * 59) + (tag == null ? 43 : tag.hashCode());
            String notice = getNotice();
            int iHashCode11 = (iHashCode10 * 59) + (notice == null ? 43 : notice.hashCode());
            String welcomeWords = getWelcomeWords();
            int iHashCode12 = (iHashCode11 * 59) + (welcomeWords == null ? 43 : welcomeWords.hashCode());
            String background = getBackground();
            int iHashCode13 = (iHashCode12 * 59) + (background == null ? 43 : background.hashCode());
            List<JctxDTOBean> jctx = getJctx();
            return (iHashCode13 * 59) + (jctx != null ? jctx.hashCode() : 43);
        }

        public void setBackground(String str) {
            this.background = str;
        }

        public void setChatRoomId(String str) {
            this.chatRoomId = str;
        }

        public void setCover(String str) {
            this.cover = str;
        }

        public void setGroupId(Integer num) {
            this.groupId = num;
        }

        public void setIs_no_mic(Integer num) {
            this.is_no_mic = num;
        }

        public void setIs_no_say(Integer num) {
            this.is_no_say = num;
        }

        public void setJctx(List<JctxDTOBean> list) {
            this.jctx = list;
        }

        public void setMasterUid(Integer num) {
            this.masterUid = num;
        }

        public void setNotice(String str) {
            this.notice = str;
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

        public void setTag(String str) {
            this.tag = str;
        }

        public void setWelcomeWords(String str) {
            this.welcomeWords = str;
        }

        public String toString() {
            return "JoinRoomBean.RoomDTO(roomId=" + getRoomId() + ", chatRoomId=" + getChatRoomId() + ", masterUid=" + getMasterUid() + ", groupId=" + getGroupId() + ", roomName=" + getRoomName() + ", cover=" + getCover() + ", tag=" + getTag() + ", notice=" + getNotice() + ", welcomeWords=" + getWelcomeWords() + ", background=" + getBackground() + ", role=" + getRole() + ", is_no_say=" + getIs_no_say() + ", is_no_mic=" + getIs_no_mic() + ", jctx=" + getJctx() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof JoinRoomBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JoinRoomBean)) {
            return false;
        }
        JoinRoomBean joinRoomBean = (JoinRoomBean) obj;
        if (!joinRoomBean.canEqual(this)) {
            return false;
        }
        Integer userCount = getUserCount();
        Integer userCount2 = joinRoomBean.getUserCount();
        if (userCount != null ? !userCount.equals(userCount2) : userCount2 != null) {
            return false;
        }
        RoomDTO room = getRoom();
        RoomDTO room2 = joinRoomBean.getRoom();
        if (room != null ? !room.equals(room2) : room2 != null) {
            return false;
        }
        List<AnchorsDTO> anchors = getAnchors();
        List<AnchorsDTO> anchors2 = joinRoomBean.getAnchors();
        if (anchors != null ? !anchors.equals(anchors2) : anchors2 != null) {
            return false;
        }
        List<Integer> lockedMics = getLockedMics();
        List<Integer> lockedMics2 = joinRoomBean.getLockedMics();
        return lockedMics != null ? lockedMics.equals(lockedMics2) : lockedMics2 == null;
    }

    public List<AnchorsDTO> getAnchors() {
        return this.anchors;
    }

    public List<Integer> getLockedMics() {
        return this.lockedMics;
    }

    public RoomDTO getRoom() {
        return this.room;
    }

    public Integer getUserCount() {
        return this.userCount;
    }

    public int hashCode() {
        Integer userCount = getUserCount();
        int iHashCode = userCount == null ? 43 : userCount.hashCode();
        RoomDTO room = getRoom();
        int iHashCode2 = ((iHashCode + 59) * 59) + (room == null ? 43 : room.hashCode());
        List<AnchorsDTO> anchors = getAnchors();
        int iHashCode3 = (iHashCode2 * 59) + (anchors == null ? 43 : anchors.hashCode());
        List<Integer> lockedMics = getLockedMics();
        return (iHashCode3 * 59) + (lockedMics != null ? lockedMics.hashCode() : 43);
    }

    public void setAnchors(List<AnchorsDTO> list) {
        this.anchors = list;
    }

    public void setLockedMics(List<Integer> list) {
        this.lockedMics = list;
    }

    public void setRoom(RoomDTO roomDTO) {
        this.room = roomDTO;
    }

    public void setUserCount(Integer num) {
        this.userCount = num;
    }

    public String toString() {
        return "JoinRoomBean(userCount=" + getUserCount() + ", room=" + getRoom() + ", anchors=" + getAnchors() + ", lockedMics=" + getLockedMics() + ")";
    }
}
