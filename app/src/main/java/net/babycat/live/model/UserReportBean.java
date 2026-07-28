package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class UserReportBean implements Serializable {

    @SerializedName("addtime")
    private Integer addtime;

    @SerializedName("content")
    private String content;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34917id;

    @SerializedName("img")
    private String img;

    @SerializedName("re_content")
    private String reContent;

    @SerializedName(o0.CATEGORY_STATUS)
    private Integer status;

    @SerializedName("touid")
    private Integer touid;

    @SerializedName("uid")
    private Integer uid;

    @SerializedName("uptime")
    private Integer uptime;

    public boolean canEqual(Object obj) {
        return obj instanceof UserReportBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserReportBean)) {
            return false;
        }
        UserReportBean userReportBean = (UserReportBean) obj;
        if (!userReportBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = userReportBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer uid = getUid();
        Integer uid2 = userReportBean.getUid();
        if (uid != null ? !uid.equals(uid2) : uid2 != null) {
            return false;
        }
        Integer touid = getTouid();
        Integer touid2 = userReportBean.getTouid();
        if (touid != null ? !touid.equals(touid2) : touid2 != null) {
            return false;
        }
        Integer status = getStatus();
        Integer status2 = userReportBean.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        Integer addtime = getAddtime();
        Integer addtime2 = userReportBean.getAddtime();
        if (addtime != null ? !addtime.equals(addtime2) : addtime2 != null) {
            return false;
        }
        Integer uptime = getUptime();
        Integer uptime2 = userReportBean.getUptime();
        if (uptime != null ? !uptime.equals(uptime2) : uptime2 != null) {
            return false;
        }
        String content = getContent();
        String content2 = userReportBean.getContent();
        if (content != null ? !content.equals(content2) : content2 != null) {
            return false;
        }
        String img = getImg();
        String img2 = userReportBean.getImg();
        if (img != null ? !img.equals(img2) : img2 != null) {
            return false;
        }
        String reContent = getReContent();
        String reContent2 = userReportBean.getReContent();
        return reContent != null ? reContent.equals(reContent2) : reContent2 == null;
    }

    public Integer getAddtime() {
        return this.addtime;
    }

    public String getContent() {
        return this.content;
    }

    public Integer getId() {
        return this.f34917id;
    }

    public String getImg() {
        return this.img;
    }

    public String getReContent() {
        return this.reContent;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getTouid() {
        return this.touid;
    }

    public Integer getUid() {
        return this.uid;
    }

    public Integer getUptime() {
        return this.uptime;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        Integer uid = getUid();
        int iHashCode2 = ((iHashCode + 59) * 59) + (uid == null ? 43 : uid.hashCode());
        Integer touid = getTouid();
        int iHashCode3 = (iHashCode2 * 59) + (touid == null ? 43 : touid.hashCode());
        Integer status = getStatus();
        int iHashCode4 = (iHashCode3 * 59) + (status == null ? 43 : status.hashCode());
        Integer addtime = getAddtime();
        int iHashCode5 = (iHashCode4 * 59) + (addtime == null ? 43 : addtime.hashCode());
        Integer uptime = getUptime();
        int iHashCode6 = (iHashCode5 * 59) + (uptime == null ? 43 : uptime.hashCode());
        String content = getContent();
        int iHashCode7 = (iHashCode6 * 59) + (content == null ? 43 : content.hashCode());
        String img = getImg();
        int iHashCode8 = (iHashCode7 * 59) + (img == null ? 43 : img.hashCode());
        String reContent = getReContent();
        return (iHashCode8 * 59) + (reContent != null ? reContent.hashCode() : 43);
    }

    public void setAddtime(Integer num) {
        this.addtime = num;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setId(Integer num) {
        this.f34917id = num;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setReContent(String str) {
        this.reContent = str;
    }

    public void setStatus(Integer num) {
        this.status = num;
    }

    public void setTouid(Integer num) {
        this.touid = num;
    }

    public void setUid(Integer num) {
        this.uid = num;
    }

    public void setUptime(Integer num) {
        this.uptime = num;
    }

    public String toString() {
        return "UserReportBean(id=" + getId() + ", uid=" + getUid() + ", touid=" + getTouid() + ", content=" + getContent() + ", status=" + getStatus() + ", addtime=" + getAddtime() + ", uptime=" + getUptime() + ", img=" + getImg() + ", reContent=" + getReContent() + ")";
    }
}
