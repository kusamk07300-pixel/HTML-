package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class RoomUserCardBean {

    @SerializedName("anchor_level")
    Integer anchor_level;

    @SerializedName("avatar")
    String avatar;

    @SerializedName("avatar_frame")
    String avatar_frame;

    @SerializedName("is_chat")
    Integer isChat;

    @SerializedName("is_follow")
    Integer is_follow;

    @SerializedName("is_no_mic")
    Integer is_no_mic;

    @SerializedName("is_no_say")
    Integer is_no_say;

    @SerializedName("level")
    Integer level;

    @SerializedName("mic_num")
    Integer mic_num;

    @SerializedName("nickname")
    String nickname;

    @SerializedName("role")
    Integer role;

    @SerializedName("user_id")
    Integer user_id;

    public boolean canEqual(Object obj) {
        return obj instanceof RoomUserCardBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoomUserCardBean)) {
            return false;
        }
        RoomUserCardBean roomUserCardBean = (RoomUserCardBean) obj;
        if (!roomUserCardBean.canEqual(this)) {
            return false;
        }
        Integer user_id = getUser_id();
        Integer user_id2 = roomUserCardBean.getUser_id();
        if (user_id != null ? !user_id.equals(user_id2) : user_id2 != null) {
            return false;
        }
        Integer role = getRole();
        Integer role2 = roomUserCardBean.getRole();
        if (role != null ? !role.equals(role2) : role2 != null) {
            return false;
        }
        Integer level = getLevel();
        Integer level2 = roomUserCardBean.getLevel();
        if (level != null ? !level.equals(level2) : level2 != null) {
            return false;
        }
        Integer anchor_level = getAnchor_level();
        Integer anchor_level2 = roomUserCardBean.getAnchor_level();
        if (anchor_level != null ? !anchor_level.equals(anchor_level2) : anchor_level2 != null) {
            return false;
        }
        Integer mic_num = getMic_num();
        Integer mic_num2 = roomUserCardBean.getMic_num();
        if (mic_num != null ? !mic_num.equals(mic_num2) : mic_num2 != null) {
            return false;
        }
        Integer is_follow = getIs_follow();
        Integer is_follow2 = roomUserCardBean.getIs_follow();
        if (is_follow != null ? !is_follow.equals(is_follow2) : is_follow2 != null) {
            return false;
        }
        Integer is_no_say = getIs_no_say();
        Integer is_no_say2 = roomUserCardBean.getIs_no_say();
        if (is_no_say != null ? !is_no_say.equals(is_no_say2) : is_no_say2 != null) {
            return false;
        }
        Integer is_no_mic = getIs_no_mic();
        Integer is_no_mic2 = roomUserCardBean.getIs_no_mic();
        if (is_no_mic != null ? !is_no_mic.equals(is_no_mic2) : is_no_mic2 != null) {
            return false;
        }
        Integer isChat = getIsChat();
        Integer isChat2 = roomUserCardBean.getIsChat();
        if (isChat != null ? !isChat.equals(isChat2) : isChat2 != null) {
            return false;
        }
        String nickname = getNickname();
        String nickname2 = roomUserCardBean.getNickname();
        if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
            return false;
        }
        String avatar = getAvatar();
        String avatar2 = roomUserCardBean.getAvatar();
        if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
            return false;
        }
        String avatar_frame = getAvatar_frame();
        String avatar_frame2 = roomUserCardBean.getAvatar_frame();
        return avatar_frame != null ? avatar_frame.equals(avatar_frame2) : avatar_frame2 == null;
    }

    public Integer getAnchor_level() {
        return this.anchor_level;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getAvatar_frame() {
        return this.avatar_frame;
    }

    public Integer getIsChat() {
        return this.isChat;
    }

    public Integer getIs_follow() {
        return this.is_follow;
    }

    public Integer getIs_no_mic() {
        return this.is_no_mic;
    }

    public Integer getIs_no_say() {
        return this.is_no_say;
    }

    public Integer getLevel() {
        return this.level;
    }

    public Integer getMic_num() {
        return this.mic_num;
    }

    public String getNickname() {
        return this.nickname;
    }

    public Integer getRole() {
        return this.role;
    }

    public Integer getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        Integer user_id = getUser_id();
        int iHashCode = user_id == null ? 43 : user_id.hashCode();
        Integer role = getRole();
        int iHashCode2 = ((iHashCode + 59) * 59) + (role == null ? 43 : role.hashCode());
        Integer level = getLevel();
        int iHashCode3 = (iHashCode2 * 59) + (level == null ? 43 : level.hashCode());
        Integer anchor_level = getAnchor_level();
        int iHashCode4 = (iHashCode3 * 59) + (anchor_level == null ? 43 : anchor_level.hashCode());
        Integer mic_num = getMic_num();
        int iHashCode5 = (iHashCode4 * 59) + (mic_num == null ? 43 : mic_num.hashCode());
        Integer is_follow = getIs_follow();
        int iHashCode6 = (iHashCode5 * 59) + (is_follow == null ? 43 : is_follow.hashCode());
        Integer is_no_say = getIs_no_say();
        int iHashCode7 = (iHashCode6 * 59) + (is_no_say == null ? 43 : is_no_say.hashCode());
        Integer is_no_mic = getIs_no_mic();
        int iHashCode8 = (iHashCode7 * 59) + (is_no_mic == null ? 43 : is_no_mic.hashCode());
        Integer isChat = getIsChat();
        int iHashCode9 = (iHashCode8 * 59) + (isChat == null ? 43 : isChat.hashCode());
        String nickname = getNickname();
        int iHashCode10 = (iHashCode9 * 59) + (nickname == null ? 43 : nickname.hashCode());
        String avatar = getAvatar();
        int iHashCode11 = (iHashCode10 * 59) + (avatar == null ? 43 : avatar.hashCode());
        String avatar_frame = getAvatar_frame();
        return (iHashCode11 * 59) + (avatar_frame != null ? avatar_frame.hashCode() : 43);
    }

    public void setAnchor_level(Integer num) {
        this.anchor_level = num;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setAvatar_frame(String str) {
        this.avatar_frame = str;
    }

    public void setIsChat(Integer num) {
        this.isChat = num;
    }

    public void setIs_follow(Integer num) {
        this.is_follow = num;
    }

    public void setIs_no_mic(Integer num) {
        this.is_no_mic = num;
    }

    public void setIs_no_say(Integer num) {
        this.is_no_say = num;
    }

    public void setLevel(Integer num) {
        this.level = num;
    }

    public void setMic_num(Integer num) {
        this.mic_num = num;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setRole(Integer num) {
        this.role = num;
    }

    public void setUser_id(Integer num) {
        this.user_id = num;
    }

    public String toString() {
        return "RoomUserCardBean(user_id=" + getUser_id() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", avatar_frame=" + getAvatar_frame() + ", role=" + getRole() + ", level=" + getLevel() + ", anchor_level=" + getAnchor_level() + ", mic_num=" + getMic_num() + ", is_follow=" + getIs_follow() + ", is_no_say=" + getIs_no_say() + ", is_no_mic=" + getIs_no_mic() + ", isChat=" + getIsChat() + ")";
    }
}
