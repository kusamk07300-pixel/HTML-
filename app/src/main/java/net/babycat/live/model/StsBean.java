package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class StsBean {

    @SerializedName("AccessKeyId")
    private String accessKeyId;

    @SerializedName("bucket")
    private String bucket;

    @SerializedName("cdn")
    private String cdn;

    @SerializedName("endpoint")
    private String endpoint;

    @SerializedName("Expiration")
    private String expiration;

    @SerializedName("filepath")
    private String filepath;

    @SerializedName("SecretAccessKey")
    private String secretAccessKey;

    @SerializedName("SessionToken")
    private String sessionToken;

    public boolean canEqual(Object obj) {
        return obj instanceof StsBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StsBean)) {
            return false;
        }
        StsBean stsBean = (StsBean) obj;
        if (!stsBean.canEqual(this)) {
            return false;
        }
        String accessKeyId = getAccessKeyId();
        String accessKeyId2 = stsBean.getAccessKeyId();
        if (accessKeyId != null ? !accessKeyId.equals(accessKeyId2) : accessKeyId2 != null) {
            return false;
        }
        String secretAccessKey = getSecretAccessKey();
        String secretAccessKey2 = stsBean.getSecretAccessKey();
        if (secretAccessKey != null ? !secretAccessKey.equals(secretAccessKey2) : secretAccessKey2 != null) {
            return false;
        }
        String sessionToken = getSessionToken();
        String sessionToken2 = stsBean.getSessionToken();
        if (sessionToken != null ? !sessionToken.equals(sessionToken2) : sessionToken2 != null) {
            return false;
        }
        String expiration = getExpiration();
        String expiration2 = stsBean.getExpiration();
        if (expiration != null ? !expiration.equals(expiration2) : expiration2 != null) {
            return false;
        }
        String endpoint = getEndpoint();
        String endpoint2 = stsBean.getEndpoint();
        if (endpoint != null ? !endpoint.equals(endpoint2) : endpoint2 != null) {
            return false;
        }
        String bucket = getBucket();
        String bucket2 = stsBean.getBucket();
        if (bucket != null ? !bucket.equals(bucket2) : bucket2 != null) {
            return false;
        }
        String filepath = getFilepath();
        String filepath2 = stsBean.getFilepath();
        if (filepath != null ? !filepath.equals(filepath2) : filepath2 != null) {
            return false;
        }
        String cdn = getCdn();
        String cdn2 = stsBean.getCdn();
        return cdn != null ? cdn.equals(cdn2) : cdn2 == null;
    }

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public String getBucket() {
        return this.bucket;
    }

    public String getCdn() {
        return this.cdn;
    }

    public String getEndpoint() {
        return this.endpoint;
    }

    public String getExpiration() {
        return this.expiration;
    }

    public String getFilepath() {
        return this.filepath;
    }

    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    public String getSessionToken() {
        return this.sessionToken;
    }

    public int hashCode() {
        String accessKeyId = getAccessKeyId();
        int iHashCode = accessKeyId == null ? 43 : accessKeyId.hashCode();
        String secretAccessKey = getSecretAccessKey();
        int iHashCode2 = ((iHashCode + 59) * 59) + (secretAccessKey == null ? 43 : secretAccessKey.hashCode());
        String sessionToken = getSessionToken();
        int iHashCode3 = (iHashCode2 * 59) + (sessionToken == null ? 43 : sessionToken.hashCode());
        String expiration = getExpiration();
        int iHashCode4 = (iHashCode3 * 59) + (expiration == null ? 43 : expiration.hashCode());
        String endpoint = getEndpoint();
        int iHashCode5 = (iHashCode4 * 59) + (endpoint == null ? 43 : endpoint.hashCode());
        String bucket = getBucket();
        int iHashCode6 = (iHashCode5 * 59) + (bucket == null ? 43 : bucket.hashCode());
        String filepath = getFilepath();
        int iHashCode7 = (iHashCode6 * 59) + (filepath == null ? 43 : filepath.hashCode());
        String cdn = getCdn();
        return (iHashCode7 * 59) + (cdn != null ? cdn.hashCode() : 43);
    }

    public void setAccessKeyId(String str) {
        this.accessKeyId = str;
    }

    public void setBucket(String str) {
        this.bucket = str;
    }

    public void setCdn(String str) {
        this.cdn = str;
    }

    public void setEndpoint(String str) {
        this.endpoint = str;
    }

    public void setExpiration(String str) {
        this.expiration = str;
    }

    public void setFilepath(String str) {
        this.filepath = str;
    }

    public void setSecretAccessKey(String str) {
        this.secretAccessKey = str;
    }

    public void setSessionToken(String str) {
        this.sessionToken = str;
    }

    public String toString() {
        return "StsBean(accessKeyId=" + getAccessKeyId() + ", secretAccessKey=" + getSecretAccessKey() + ", sessionToken=" + getSessionToken() + ", expiration=" + getExpiration() + ", endpoint=" + getEndpoint() + ", bucket=" + getBucket() + ", filepath=" + getFilepath() + ", cdn=" + getCdn() + ")";
    }
}
