package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class LoginDataBean implements Serializable {

    @SerializedName("avatar_url")
    private String avatarUrl;

    @SerializedName("country_code")
    private Integer countryCode;

    @SerializedName("country_iso")
    private String countryIso;

    @SerializedName("hx_password")
    private String hxPassword;

    @SerializedName("last_login_ip")
    private String lastLoginIp;

    @SerializedName("login_count")
    private Integer loginCount;

    @SerializedName("nickname")
    private String nickname;

    @SerializedName("token")
    private String token;

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("user_sig_im")
    private String userSigIm;

    @SerializedName("user_sig")
    private String user_sig;

    public boolean canEqual(Object obj) {
        return obj instanceof LoginDataBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoginDataBean)) {
            return false;
        }
        LoginDataBean loginDataBean = (LoginDataBean) obj;
        if (!loginDataBean.canEqual(this)) {
            return false;
        }
        Integer userId = getUserId();
        Integer userId2 = loginDataBean.getUserId();
        if (userId != null ? !userId.equals(userId2) : userId2 != null) {
            return false;
        }
        Integer loginCount = getLoginCount();
        Integer loginCount2 = loginDataBean.getLoginCount();
        if (loginCount != null ? !loginCount.equals(loginCount2) : loginCount2 != null) {
            return false;
        }
        Integer countryCode = getCountryCode();
        Integer countryCode2 = loginDataBean.getCountryCode();
        if (countryCode != null ? !countryCode.equals(countryCode2) : countryCode2 != null) {
            return false;
        }
        String nickname = getNickname();
        String nickname2 = loginDataBean.getNickname();
        if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
            return false;
        }
        String user_sig = getUser_sig();
        String user_sig2 = loginDataBean.getUser_sig();
        if (user_sig != null ? !user_sig.equals(user_sig2) : user_sig2 != null) {
            return false;
        }
        String avatarUrl = getAvatarUrl();
        String avatarUrl2 = loginDataBean.getAvatarUrl();
        if (avatarUrl != null ? !avatarUrl.equals(avatarUrl2) : avatarUrl2 != null) {
            return false;
        }
        String hxPassword = getHxPassword();
        String hxPassword2 = loginDataBean.getHxPassword();
        if (hxPassword != null ? !hxPassword.equals(hxPassword2) : hxPassword2 != null) {
            return false;
        }
        String countryIso = getCountryIso();
        String countryIso2 = loginDataBean.getCountryIso();
        if (countryIso != null ? !countryIso.equals(countryIso2) : countryIso2 != null) {
            return false;
        }
        String token = getToken();
        String token2 = loginDataBean.getToken();
        if (token != null ? !token.equals(token2) : token2 != null) {
            return false;
        }
        String lastLoginIp = getLastLoginIp();
        String lastLoginIp2 = loginDataBean.getLastLoginIp();
        if (lastLoginIp != null ? !lastLoginIp.equals(lastLoginIp2) : lastLoginIp2 != null) {
            return false;
        }
        String userSigIm = getUserSigIm();
        String userSigIm2 = loginDataBean.getUserSigIm();
        return userSigIm != null ? userSigIm.equals(userSigIm2) : userSigIm2 == null;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public Integer getCountryCode() {
        return this.countryCode;
    }

    public String getCountryIso() {
        return this.countryIso;
    }

    public String getHxPassword() {
        return this.hxPassword;
    }

    public String getLastLoginIp() {
        return this.lastLoginIp;
    }

    public Integer getLoginCount() {
        return this.loginCount;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getToken() {
        return this.token;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public String getUserSigIm() {
        return this.userSigIm;
    }

    public String getUser_sig() {
        return this.user_sig;
    }

    public int hashCode() {
        Integer userId = getUserId();
        int iHashCode = userId == null ? 43 : userId.hashCode();
        Integer loginCount = getLoginCount();
        int iHashCode2 = ((iHashCode + 59) * 59) + (loginCount == null ? 43 : loginCount.hashCode());
        Integer countryCode = getCountryCode();
        int iHashCode3 = (iHashCode2 * 59) + (countryCode == null ? 43 : countryCode.hashCode());
        String nickname = getNickname();
        int iHashCode4 = (iHashCode3 * 59) + (nickname == null ? 43 : nickname.hashCode());
        String user_sig = getUser_sig();
        int iHashCode5 = (iHashCode4 * 59) + (user_sig == null ? 43 : user_sig.hashCode());
        String avatarUrl = getAvatarUrl();
        int iHashCode6 = (iHashCode5 * 59) + (avatarUrl == null ? 43 : avatarUrl.hashCode());
        String hxPassword = getHxPassword();
        int iHashCode7 = (iHashCode6 * 59) + (hxPassword == null ? 43 : hxPassword.hashCode());
        String countryIso = getCountryIso();
        int iHashCode8 = (iHashCode7 * 59) + (countryIso == null ? 43 : countryIso.hashCode());
        String token = getToken();
        int iHashCode9 = (iHashCode8 * 59) + (token == null ? 43 : token.hashCode());
        String lastLoginIp = getLastLoginIp();
        int iHashCode10 = (iHashCode9 * 59) + (lastLoginIp == null ? 43 : lastLoginIp.hashCode());
        String userSigIm = getUserSigIm();
        return (iHashCode10 * 59) + (userSigIm != null ? userSigIm.hashCode() : 43);
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void setCountryCode(Integer num) {
        this.countryCode = num;
    }

    public void setCountryIso(String str) {
        this.countryIso = str;
    }

    public void setHxPassword(String str) {
        this.hxPassword = str;
    }

    public void setLastLoginIp(String str) {
        this.lastLoginIp = str;
    }

    public void setLoginCount(Integer num) {
        this.loginCount = num;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUserId(Integer num) {
        this.userId = num;
    }

    public void setUserSigIm(String str) {
        this.userSigIm = str;
    }

    public void setUser_sig(String str) {
        this.user_sig = str;
    }

    public String toString() {
        return "LoginDataBean(userId=" + getUserId() + ", nickname=" + getNickname() + ", user_sig=" + getUser_sig() + ", avatarUrl=" + getAvatarUrl() + ", loginCount=" + getLoginCount() + ", countryCode=" + getCountryCode() + ", hxPassword=" + getHxPassword() + ", countryIso=" + getCountryIso() + ", token=" + getToken() + ", lastLoginIp=" + getLastLoginIp() + ", userSigIm=" + getUserSigIm() + ")";
    }
}
