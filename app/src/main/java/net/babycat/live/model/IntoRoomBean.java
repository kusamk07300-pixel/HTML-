package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class IntoRoomBean {

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("entrance_svga")
    private String entranceSvga;

    @SerializedName("gf_sign")
    private String gfSign;

    @SerializedName("jctx")
    private String jctx;

    @SerializedName("jctx_type")
    private String jctxType;

    @SerializedName("level")
    private Integer level;

    @SerializedName("level_icon_url")
    private String levelIconUrl;

    @SerializedName("role")
    private Integer role;

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("user_name")
    private String userName;

    public boolean canEqual(Object obj) {
        return obj instanceof IntoRoomBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntoRoomBean)) {
            return false;
        }
        IntoRoomBean intoRoomBean = (IntoRoomBean) obj;
        if (!intoRoomBean.canEqual(this)) {
            return false;
        }
        Integer level = getLevel();
        Integer level2 = intoRoomBean.getLevel();
        if (level != null ? !level.equals(level2) : level2 != null) {
            return false;
        }
        Integer role = getRole();
        Integer role2 = intoRoomBean.getRole();
        if (role != null ? !role.equals(role2) : role2 != null) {
            return false;
        }
        Integer userId = getUserId();
        Integer userId2 = intoRoomBean.getUserId();
        if (userId != null ? !userId.equals(userId2) : userId2 != null) {
            return false;
        }
        String jctx = getJctx();
        String jctx2 = intoRoomBean.getJctx();
        if (jctx != null ? !jctx.equals(jctx2) : jctx2 != null) {
            return false;
        }
        String jctxType = getJctxType();
        String jctxType2 = intoRoomBean.getJctxType();
        if (jctxType != null ? !jctxType.equals(jctxType2) : jctxType2 != null) {
            return false;
        }
        String levelIconUrl = getLevelIconUrl();
        String levelIconUrl2 = intoRoomBean.getLevelIconUrl();
        if (levelIconUrl != null ? !levelIconUrl.equals(levelIconUrl2) : levelIconUrl2 != null) {
            return false;
        }
        String userName = getUserName();
        String userName2 = intoRoomBean.getUserName();
        if (userName != null ? !userName.equals(userName2) : userName2 != null) {
            return false;
        }
        String avatar = getAvatar();
        String avatar2 = intoRoomBean.getAvatar();
        if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
            return false;
        }
        String entranceSvga = getEntranceSvga();
        String entranceSvga2 = intoRoomBean.getEntranceSvga();
        if (entranceSvga != null ? !entranceSvga.equals(entranceSvga2) : entranceSvga2 != null) {
            return false;
        }
        String gfSign = getGfSign();
        String gfSign2 = intoRoomBean.getGfSign();
        return gfSign != null ? gfSign.equals(gfSign2) : gfSign2 == null;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getEntranceSvga() {
        return this.entranceSvga;
    }

    public String getGfSign() {
        return this.gfSign;
    }

    public String getJctx() {
        return this.jctx;
    }

    public String getJctxType() {
        return this.jctxType;
    }

    public Integer getLevel() {
        return this.level;
    }

    public String getLevelIconUrl() {
        return this.levelIconUrl;
    }

    public Integer getRole() {
        return this.role;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        Integer level = getLevel();
        int iHashCode = level == null ? 43 : level.hashCode();
        Integer role = getRole();
        int iHashCode2 = ((iHashCode + 59) * 59) + (role == null ? 43 : role.hashCode());
        Integer userId = getUserId();
        int iHashCode3 = (iHashCode2 * 59) + (userId == null ? 43 : userId.hashCode());
        String jctx = getJctx();
        int iHashCode4 = (iHashCode3 * 59) + (jctx == null ? 43 : jctx.hashCode());
        String jctxType = getJctxType();
        int iHashCode5 = (iHashCode4 * 59) + (jctxType == null ? 43 : jctxType.hashCode());
        String levelIconUrl = getLevelIconUrl();
        int iHashCode6 = (iHashCode5 * 59) + (levelIconUrl == null ? 43 : levelIconUrl.hashCode());
        String userName = getUserName();
        int iHashCode7 = (iHashCode6 * 59) + (userName == null ? 43 : userName.hashCode());
        String avatar = getAvatar();
        int iHashCode8 = (iHashCode7 * 59) + (avatar == null ? 43 : avatar.hashCode());
        String entranceSvga = getEntranceSvga();
        int iHashCode9 = (iHashCode8 * 59) + (entranceSvga == null ? 43 : entranceSvga.hashCode());
        String gfSign = getGfSign();
        return (iHashCode9 * 59) + (gfSign != null ? gfSign.hashCode() : 43);
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setEntranceSvga(String str) {
        this.entranceSvga = str;
    }

    public void setGfSign(String str) {
        this.gfSign = str;
    }

    public void setJctx(String str) {
        this.jctx = str;
    }

    public void setJctxType(String str) {
        this.jctxType = str;
    }

    public void setLevel(Integer num) {
        this.level = num;
    }

    public void setLevelIconUrl(String str) {
        this.levelIconUrl = str;
    }

    public void setRole(Integer num) {
        this.role = num;
    }

    public void setUserId(Integer num) {
        this.userId = num;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public String toString() {
        return "IntoRoomBean(jctx=" + getJctx() + ", jctxType=" + getJctxType() + ", level=" + getLevel() + ", levelIconUrl=" + getLevelIconUrl() + ", role=" + getRole() + ", userId=" + getUserId() + ", userName=" + getUserName() + ", avatar=" + getAvatar() + ", entranceSvga=" + getEntranceSvga() + ", gfSign=" + getGfSign() + ")";
    }
}
