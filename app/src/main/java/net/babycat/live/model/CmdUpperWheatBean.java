package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CmdUpperWheatBean {

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("avatar_frame")
    private List<AvatarFrameBean> avatarFrame;

    @SerializedName("mic_num")
    private Integer micNum;

    @SerializedName("nickname")
    private String nickname;

    @SerializedName("sex")
    private Integer sex;

    @SerializedName("user_id")
    private Integer userId;

    public boolean canEqual(Object obj) {
        return obj instanceof CmdUpperWheatBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CmdUpperWheatBean)) {
            return false;
        }
        CmdUpperWheatBean cmdUpperWheatBean = (CmdUpperWheatBean) obj;
        if (!cmdUpperWheatBean.canEqual(this)) {
            return false;
        }
        Integer micNum = getMicNum();
        Integer micNum2 = cmdUpperWheatBean.getMicNum();
        if (micNum != null ? !micNum.equals(micNum2) : micNum2 != null) {
            return false;
        }
        Integer userId = getUserId();
        Integer userId2 = cmdUpperWheatBean.getUserId();
        if (userId != null ? !userId.equals(userId2) : userId2 != null) {
            return false;
        }
        Integer sex = getSex();
        Integer sex2 = cmdUpperWheatBean.getSex();
        if (sex != null ? !sex.equals(sex2) : sex2 != null) {
            return false;
        }
        String nickname = getNickname();
        String nickname2 = cmdUpperWheatBean.getNickname();
        if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
            return false;
        }
        String avatar = getAvatar();
        String avatar2 = cmdUpperWheatBean.getAvatar();
        if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
            return false;
        }
        List<AvatarFrameBean> avatarFrame = getAvatarFrame();
        List<AvatarFrameBean> avatarFrame2 = cmdUpperWheatBean.getAvatarFrame();
        return avatarFrame != null ? avatarFrame.equals(avatarFrame2) : avatarFrame2 == null;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public List<AvatarFrameBean> getAvatarFrame() {
        return this.avatarFrame;
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
        Integer micNum = getMicNum();
        int iHashCode = micNum == null ? 43 : micNum.hashCode();
        Integer userId = getUserId();
        int iHashCode2 = ((iHashCode + 59) * 59) + (userId == null ? 43 : userId.hashCode());
        Integer sex = getSex();
        int iHashCode3 = (iHashCode2 * 59) + (sex == null ? 43 : sex.hashCode());
        String nickname = getNickname();
        int iHashCode4 = (iHashCode3 * 59) + (nickname == null ? 43 : nickname.hashCode());
        String avatar = getAvatar();
        int iHashCode5 = (iHashCode4 * 59) + (avatar == null ? 43 : avatar.hashCode());
        List<AvatarFrameBean> avatarFrame = getAvatarFrame();
        return (iHashCode5 * 59) + (avatarFrame != null ? avatarFrame.hashCode() : 43);
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setAvatarFrame(List<AvatarFrameBean> list) {
        this.avatarFrame = list;
    }

    public void setMicNum(Integer num) {
        this.micNum = num;
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

    public String toString() {
        return "CmdUpperWheatBean(micNum=" + getMicNum() + ", userId=" + getUserId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", avatarFrame=" + getAvatarFrame() + ", sex=" + getSex() + ")";
    }
}
