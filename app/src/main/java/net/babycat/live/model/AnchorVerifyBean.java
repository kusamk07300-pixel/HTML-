package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class AnchorVerifyBean implements Serializable {

    @SerializedName("agency_id")
    private Integer agencyId;

    @SerializedName("auth_idcard")
    private String authIdcard;

    @SerializedName("auth_img")
    private String authImg;

    @SerializedName("auth_type")
    private String authType;

    @SerializedName("country_iso")
    private String countryIso;

    @SerializedName("email")
    private String email;

    @SerializedName("is_auth")
    private String isAuth;

    @SerializedName("is_save")
    private Integer isSave;

    @SerializedName("mobile")
    private String mobile;

    @SerializedName("sex")
    private String sex;

    @SerializedName("uid")
    private String uid;

    @SerializedName("username")
    private String username;

    public boolean canEqual(Object obj) {
        return obj instanceof AnchorVerifyBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnchorVerifyBean)) {
            return false;
        }
        AnchorVerifyBean anchorVerifyBean = (AnchorVerifyBean) obj;
        if (!anchorVerifyBean.canEqual(this)) {
            return false;
        }
        Integer isSave = getIsSave();
        Integer isSave2 = anchorVerifyBean.getIsSave();
        if (isSave != null ? !isSave.equals(isSave2) : isSave2 != null) {
            return false;
        }
        Integer agencyId = getAgencyId();
        Integer agencyId2 = anchorVerifyBean.getAgencyId();
        if (agencyId != null ? !agencyId.equals(agencyId2) : agencyId2 != null) {
            return false;
        }
        String email = getEmail();
        String email2 = anchorVerifyBean.getEmail();
        if (email != null ? !email.equals(email2) : email2 != null) {
            return false;
        }
        String sex = getSex();
        String sex2 = anchorVerifyBean.getSex();
        if (sex != null ? !sex.equals(sex2) : sex2 != null) {
            return false;
        }
        String mobile = getMobile();
        String mobile2 = anchorVerifyBean.getMobile();
        if (mobile != null ? !mobile.equals(mobile2) : mobile2 != null) {
            return false;
        }
        String countryIso = getCountryIso();
        String countryIso2 = anchorVerifyBean.getCountryIso();
        if (countryIso != null ? !countryIso.equals(countryIso2) : countryIso2 != null) {
            return false;
        }
        String isAuth = getIsAuth();
        String isAuth2 = anchorVerifyBean.getIsAuth();
        if (isAuth != null ? !isAuth.equals(isAuth2) : isAuth2 != null) {
            return false;
        }
        String authType = getAuthType();
        String authType2 = anchorVerifyBean.getAuthType();
        if (authType != null ? !authType.equals(authType2) : authType2 != null) {
            return false;
        }
        String authImg = getAuthImg();
        String authImg2 = anchorVerifyBean.getAuthImg();
        if (authImg != null ? !authImg.equals(authImg2) : authImg2 != null) {
            return false;
        }
        String authIdcard = getAuthIdcard();
        String authIdcard2 = anchorVerifyBean.getAuthIdcard();
        if (authIdcard != null ? !authIdcard.equals(authIdcard2) : authIdcard2 != null) {
            return false;
        }
        String username = getUsername();
        String username2 = anchorVerifyBean.getUsername();
        if (username != null ? !username.equals(username2) : username2 != null) {
            return false;
        }
        String uid = getUid();
        String uid2 = anchorVerifyBean.getUid();
        return uid != null ? uid.equals(uid2) : uid2 == null;
    }

    public Integer getAgencyId() {
        return this.agencyId;
    }

    public String getAuthIdcard() {
        return this.authIdcard;
    }

    public String getAuthImg() {
        return this.authImg;
    }

    public String getAuthType() {
        return this.authType;
    }

    public String getCountryIso() {
        return this.countryIso;
    }

    public String getEmail() {
        return this.email;
    }

    public String getIsAuth() {
        return this.isAuth;
    }

    public Integer getIsSave() {
        return this.isSave;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getSex() {
        return this.sex;
    }

    public String getUid() {
        return this.uid;
    }

    public String getUsername() {
        return this.username;
    }

    public int hashCode() {
        Integer isSave = getIsSave();
        int iHashCode = isSave == null ? 43 : isSave.hashCode();
        Integer agencyId = getAgencyId();
        int iHashCode2 = ((iHashCode + 59) * 59) + (agencyId == null ? 43 : agencyId.hashCode());
        String email = getEmail();
        int iHashCode3 = (iHashCode2 * 59) + (email == null ? 43 : email.hashCode());
        String sex = getSex();
        int iHashCode4 = (iHashCode3 * 59) + (sex == null ? 43 : sex.hashCode());
        String mobile = getMobile();
        int iHashCode5 = (iHashCode4 * 59) + (mobile == null ? 43 : mobile.hashCode());
        String countryIso = getCountryIso();
        int iHashCode6 = (iHashCode5 * 59) + (countryIso == null ? 43 : countryIso.hashCode());
        String isAuth = getIsAuth();
        int iHashCode7 = (iHashCode6 * 59) + (isAuth == null ? 43 : isAuth.hashCode());
        String authType = getAuthType();
        int iHashCode8 = (iHashCode7 * 59) + (authType == null ? 43 : authType.hashCode());
        String authImg = getAuthImg();
        int iHashCode9 = (iHashCode8 * 59) + (authImg == null ? 43 : authImg.hashCode());
        String authIdcard = getAuthIdcard();
        int iHashCode10 = (iHashCode9 * 59) + (authIdcard == null ? 43 : authIdcard.hashCode());
        String username = getUsername();
        int iHashCode11 = (iHashCode10 * 59) + (username == null ? 43 : username.hashCode());
        String uid = getUid();
        return (iHashCode11 * 59) + (uid != null ? uid.hashCode() : 43);
    }

    public void setAgencyId(Integer num) {
        this.agencyId = num;
    }

    public void setAuthIdcard(String str) {
        this.authIdcard = str;
    }

    public void setAuthImg(String str) {
        this.authImg = str;
    }

    public void setAuthType(String str) {
        this.authType = str;
    }

    public void setCountryIso(String str) {
        this.countryIso = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setIsAuth(String str) {
        this.isAuth = str;
    }

    public void setIsSave(Integer num) {
        this.isSave = num;
    }

    public void setMobile(String str) {
        this.mobile = str;
    }

    public void setSex(String str) {
        this.sex = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public String toString() {
        return "AnchorVerifyBean(isSave=" + getIsSave() + ", email=" + getEmail() + ", sex=" + getSex() + ", mobile=" + getMobile() + ", countryIso=" + getCountryIso() + ", isAuth=" + getIsAuth() + ", authType=" + getAuthType() + ", authImg=" + getAuthImg() + ", authIdcard=" + getAuthIdcard() + ", username=" + getUsername() + ", uid=" + getUid() + ", agencyId=" + getAgencyId() + ")";
    }
}
