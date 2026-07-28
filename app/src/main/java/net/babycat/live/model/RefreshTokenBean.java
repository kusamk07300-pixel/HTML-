package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class RefreshTokenBean {

    @SerializedName("token")
    private String token;

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("user_sig")
    private String userSig;

    public boolean canEqual(Object obj) {
        return obj instanceof RefreshTokenBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RefreshTokenBean)) {
            return false;
        }
        RefreshTokenBean refreshTokenBean = (RefreshTokenBean) obj;
        if (!refreshTokenBean.canEqual(this)) {
            return false;
        }
        Integer userId = getUserId();
        Integer userId2 = refreshTokenBean.getUserId();
        if (userId != null ? !userId.equals(userId2) : userId2 != null) {
            return false;
        }
        String userSig = getUserSig();
        String userSig2 = refreshTokenBean.getUserSig();
        if (userSig != null ? !userSig.equals(userSig2) : userSig2 != null) {
            return false;
        }
        String token = getToken();
        String token2 = refreshTokenBean.getToken();
        return token != null ? token.equals(token2) : token2 == null;
    }

    public String getToken() {
        return this.token;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public String getUserSig() {
        return this.userSig;
    }

    public int hashCode() {
        Integer userId = getUserId();
        int iHashCode = userId == null ? 43 : userId.hashCode();
        String userSig = getUserSig();
        int iHashCode2 = ((iHashCode + 59) * 59) + (userSig == null ? 43 : userSig.hashCode());
        String token = getToken();
        return (iHashCode2 * 59) + (token != null ? token.hashCode() : 43);
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setUserId(Integer num) {
        this.userId = num;
    }

    public void setUserSig(String str) {
        this.userSig = str;
    }

    public String toString() {
        return "RefreshTokenBean(userId=" + getUserId() + ", userSig=" + getUserSig() + ", token=" + getToken() + ")";
    }
}
