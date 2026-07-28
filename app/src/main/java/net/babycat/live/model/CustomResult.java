package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class CustomResult {

    @SerializedName("ApkMd5")
    private String apkMd5;

    @SerializedName("ApkSize")
    private Integer apkSize;

    @SerializedName("Code")
    private Integer code;

    @SerializedName("DownloadUrl")
    private String downloadUrl;

    @SerializedName("ModifyContent")
    private String modifyContent;

    @SerializedName("Msg")
    private String msg;

    @SerializedName("UpdateStatus")
    private Integer updateStatus;

    @SerializedName("VersionCode")
    private Integer versionCode;

    @SerializedName("VersionName")
    private String versionName;

    public boolean canEqual(Object obj) {
        return obj instanceof CustomResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomResult)) {
            return false;
        }
        CustomResult customResult = (CustomResult) obj;
        if (!customResult.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = customResult.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer updateStatus = getUpdateStatus();
        Integer updateStatus2 = customResult.getUpdateStatus();
        if (updateStatus != null ? !updateStatus.equals(updateStatus2) : updateStatus2 != null) {
            return false;
        }
        Integer versionCode = getVersionCode();
        Integer versionCode2 = customResult.getVersionCode();
        if (versionCode != null ? !versionCode.equals(versionCode2) : versionCode2 != null) {
            return false;
        }
        Integer apkSize = getApkSize();
        Integer apkSize2 = customResult.getApkSize();
        if (apkSize != null ? !apkSize.equals(apkSize2) : apkSize2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = customResult.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        String versionName = getVersionName();
        String versionName2 = customResult.getVersionName();
        if (versionName != null ? !versionName.equals(versionName2) : versionName2 != null) {
            return false;
        }
        String modifyContent = getModifyContent();
        String modifyContent2 = customResult.getModifyContent();
        if (modifyContent != null ? !modifyContent.equals(modifyContent2) : modifyContent2 != null) {
            return false;
        }
        String downloadUrl = getDownloadUrl();
        String downloadUrl2 = customResult.getDownloadUrl();
        if (downloadUrl != null ? !downloadUrl.equals(downloadUrl2) : downloadUrl2 != null) {
            return false;
        }
        String apkMd5 = getApkMd5();
        String apkMd52 = customResult.getApkMd5();
        return apkMd5 != null ? apkMd5.equals(apkMd52) : apkMd52 == null;
    }

    public String getApkMd5() {
        return this.apkMd5;
    }

    public Integer getApkSize() {
        return this.apkSize;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public String getModifyContent() {
        return this.modifyContent;
    }

    public String getMsg() {
        return this.msg;
    }

    public Integer getUpdateStatus() {
        return this.updateStatus;
    }

    public Integer getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        Integer code = getCode();
        int iHashCode = code == null ? 43 : code.hashCode();
        Integer updateStatus = getUpdateStatus();
        int iHashCode2 = ((iHashCode + 59) * 59) + (updateStatus == null ? 43 : updateStatus.hashCode());
        Integer versionCode = getVersionCode();
        int iHashCode3 = (iHashCode2 * 59) + (versionCode == null ? 43 : versionCode.hashCode());
        Integer apkSize = getApkSize();
        int iHashCode4 = (iHashCode3 * 59) + (apkSize == null ? 43 : apkSize.hashCode());
        String msg = getMsg();
        int iHashCode5 = (iHashCode4 * 59) + (msg == null ? 43 : msg.hashCode());
        String versionName = getVersionName();
        int iHashCode6 = (iHashCode5 * 59) + (versionName == null ? 43 : versionName.hashCode());
        String modifyContent = getModifyContent();
        int iHashCode7 = (iHashCode6 * 59) + (modifyContent == null ? 43 : modifyContent.hashCode());
        String downloadUrl = getDownloadUrl();
        int iHashCode8 = (iHashCode7 * 59) + (downloadUrl == null ? 43 : downloadUrl.hashCode());
        String apkMd5 = getApkMd5();
        return (iHashCode8 * 59) + (apkMd5 != null ? apkMd5.hashCode() : 43);
    }

    public void setApkMd5(String str) {
        this.apkMd5 = str;
    }

    public void setApkSize(Integer num) {
        this.apkSize = num;
    }

    public void setCode(Integer num) {
        this.code = num;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setModifyContent(String str) {
        this.modifyContent = str;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setUpdateStatus(Integer num) {
        this.updateStatus = num;
    }

    public void setVersionCode(Integer num) {
        this.versionCode = num;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }

    public String toString() {
        return "CustomResult(code=" + getCode() + ", msg=" + getMsg() + ", updateStatus=" + getUpdateStatus() + ", versionCode=" + getVersionCode() + ", versionName=" + getVersionName() + ", modifyContent=" + getModifyContent() + ", downloadUrl=" + getDownloadUrl() + ", apkSize=" + getApkSize() + ", apkMd5=" + getApkMd5() + ")";
    }
}
