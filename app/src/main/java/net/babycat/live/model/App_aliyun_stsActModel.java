package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class App_aliyun_stsActModel {

    @SerializedName("AccessKeyId")
    private String accessKeyId;

    @SerializedName("AccessKeySecret")
    private String accessKeySecret;

    @SerializedName("bucket")
    private String bucket;

    @SerializedName("endpoint")
    private String endpoint;

    @SerializedName("Expiration")
    private String expiration;

    @SerializedName("filePath")
    private String filePath;

    @SerializedName("ossDomain")
    private String ossDomain;

    @SerializedName("SecurityToken")
    private String securityToken;

    public boolean canEqual(Object obj) {
        return obj instanceof App_aliyun_stsActModel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof App_aliyun_stsActModel)) {
            return false;
        }
        App_aliyun_stsActModel app_aliyun_stsActModel = (App_aliyun_stsActModel) obj;
        if (!app_aliyun_stsActModel.canEqual(this)) {
            return false;
        }
        String securityToken = getSecurityToken();
        String securityToken2 = app_aliyun_stsActModel.getSecurityToken();
        if (securityToken != null ? !securityToken.equals(securityToken2) : securityToken2 != null) {
            return false;
        }
        String expiration = getExpiration();
        String expiration2 = app_aliyun_stsActModel.getExpiration();
        if (expiration != null ? !expiration.equals(expiration2) : expiration2 != null) {
            return false;
        }
        String accessKeySecret = getAccessKeySecret();
        String accessKeySecret2 = app_aliyun_stsActModel.getAccessKeySecret();
        if (accessKeySecret != null ? !accessKeySecret.equals(accessKeySecret2) : accessKeySecret2 != null) {
            return false;
        }
        String accessKeyId = getAccessKeyId();
        String accessKeyId2 = app_aliyun_stsActModel.getAccessKeyId();
        if (accessKeyId != null ? !accessKeyId.equals(accessKeyId2) : accessKeyId2 != null) {
            return false;
        }
        String bucket = getBucket();
        String bucket2 = app_aliyun_stsActModel.getBucket();
        if (bucket != null ? !bucket.equals(bucket2) : bucket2 != null) {
            return false;
        }
        String endpoint = getEndpoint();
        String endpoint2 = app_aliyun_stsActModel.getEndpoint();
        if (endpoint != null ? !endpoint.equals(endpoint2) : endpoint2 != null) {
            return false;
        }
        String ossDomain = getOssDomain();
        String ossDomain2 = app_aliyun_stsActModel.getOssDomain();
        if (ossDomain != null ? !ossDomain.equals(ossDomain2) : ossDomain2 != null) {
            return false;
        }
        String filePath = getFilePath();
        String filePath2 = app_aliyun_stsActModel.getFilePath();
        return filePath != null ? filePath.equals(filePath2) : filePath2 == null;
    }

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    public String getBucket() {
        return this.bucket;
    }

    public String getEndpoint() {
        return this.endpoint;
    }

    public String getExpiration() {
        return this.expiration;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public String getOssDomain() {
        return this.ossDomain;
    }

    public String getSecurityToken() {
        return this.securityToken;
    }

    public int hashCode() {
        String securityToken = getSecurityToken();
        int iHashCode = securityToken == null ? 43 : securityToken.hashCode();
        String expiration = getExpiration();
        int iHashCode2 = ((iHashCode + 59) * 59) + (expiration == null ? 43 : expiration.hashCode());
        String accessKeySecret = getAccessKeySecret();
        int iHashCode3 = (iHashCode2 * 59) + (accessKeySecret == null ? 43 : accessKeySecret.hashCode());
        String accessKeyId = getAccessKeyId();
        int iHashCode4 = (iHashCode3 * 59) + (accessKeyId == null ? 43 : accessKeyId.hashCode());
        String bucket = getBucket();
        int iHashCode5 = (iHashCode4 * 59) + (bucket == null ? 43 : bucket.hashCode());
        String endpoint = getEndpoint();
        int iHashCode6 = (iHashCode5 * 59) + (endpoint == null ? 43 : endpoint.hashCode());
        String ossDomain = getOssDomain();
        int iHashCode7 = (iHashCode6 * 59) + (ossDomain == null ? 43 : ossDomain.hashCode());
        String filePath = getFilePath();
        return (iHashCode7 * 59) + (filePath != null ? filePath.hashCode() : 43);
    }

    public void setAccessKeyId(String str) {
        this.accessKeyId = str;
    }

    public void setAccessKeySecret(String str) {
        this.accessKeySecret = str;
    }

    public void setBucket(String str) {
        this.bucket = str;
    }

    public void setEndpoint(String str) {
        this.endpoint = str;
    }

    public void setExpiration(String str) {
        this.expiration = str;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    public void setOssDomain(String str) {
        this.ossDomain = str;
    }

    public void setSecurityToken(String str) {
        this.securityToken = str;
    }

    public String toString() {
        return "App_aliyun_stsActModel(securityToken=" + getSecurityToken() + ", expiration=" + getExpiration() + ", accessKeySecret=" + getAccessKeySecret() + ", accessKeyId=" + getAccessKeyId() + ", bucket=" + getBucket() + ", endpoint=" + getEndpoint() + ", ossDomain=" + getOssDomain() + ", filePath=" + getFilePath() + ")";
    }
}
