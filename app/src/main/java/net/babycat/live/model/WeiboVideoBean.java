package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class WeiboVideoBean implements Serializable {

    @SerializedName("address")
    private String address;

    @SerializedName("city")
    private String city;

    @SerializedName("comments")
    private Integer comments;

    @SerializedName("content")
    private String content;

    @SerializedName("create_time")
    private String createTime;

    @SerializedName("fail_reason")
    private String failReason;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34920id;

    @SerializedName("images")
    private List<String> images;

    @SerializedName("is_like")
    private Integer isLike;

    @SerializedName("isdel")
    private Integer isdel;

    @SerializedName("labelid")
    private Integer labelid;

    @SerializedName("lat")
    private String lat;

    @SerializedName("likes")
    private Integer likes;

    @SerializedName("lng")
    private String lng;

    @SerializedName(o0.CATEGORY_STATUS)
    private Integer status;

    @SerializedName("type")
    private Integer type;

    @SerializedName("uid")
    private Integer uid;

    @SerializedName("update_time")
    private String updateTime;

    @SerializedName("uptime")
    private Integer uptime;

    @SerializedName("user")
    private UserDTO user;

    @SerializedName("video_thumb")
    private String videoThumb;

    @SerializedName("video_url")
    private String videoUrl;

    @SerializedName("voice_length")
    private Integer voiceLength;

    @SerializedName("voice_url")
    private String voiceUrl;

    @SerializedName("xiajia_reason")
    private String xiajiaReason;

    public static class UserDTO {

        @SerializedName("avatar")
        private String avatar;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34921id;

        @SerializedName("nickname")
        private String nickname;

        @SerializedName("sex")
        private Integer sex;

        public boolean canEqual(Object obj) {
            return obj instanceof UserDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserDTO)) {
                return false;
            }
            UserDTO userDTO = (UserDTO) obj;
            if (!userDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = userDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            Integer sex = getSex();
            Integer sex2 = userDTO.getSex();
            if (sex != null ? !sex.equals(sex2) : sex2 != null) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = userDTO.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = userDTO.getAvatar();
            return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public Integer getId() {
            return this.f34921id;
        }

        public String getNickname() {
            return this.nickname;
        }

        public Integer getSex() {
            return this.sex;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer sex = getSex();
            int iHashCode2 = ((iHashCode + 59) * 59) + (sex == null ? 43 : sex.hashCode());
            String nickname = getNickname();
            int iHashCode3 = (iHashCode2 * 59) + (nickname == null ? 43 : nickname.hashCode());
            String avatar = getAvatar();
            return (iHashCode3 * 59) + (avatar != null ? avatar.hashCode() : 43);
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setId(Integer num) {
            this.f34921id = num;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public void setSex(Integer num) {
            this.sex = num;
        }

        public String toString() {
            return "WeiboVideoBean.UserDTO(id=" + getId() + ", nickname=" + getNickname() + ", sex=" + getSex() + ", avatar=" + getAvatar() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof WeiboVideoBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WeiboVideoBean)) {
            return false;
        }
        WeiboVideoBean weiboVideoBean = (WeiboVideoBean) obj;
        if (!weiboVideoBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = weiboVideoBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer uid = getUid();
        Integer uid2 = weiboVideoBean.getUid();
        if (uid != null ? !uid.equals(uid2) : uid2 != null) {
            return false;
        }
        Integer voiceLength = getVoiceLength();
        Integer voiceLength2 = weiboVideoBean.getVoiceLength();
        if (voiceLength != null ? !voiceLength.equals(voiceLength2) : voiceLength2 != null) {
            return false;
        }
        Integer likes = getLikes();
        Integer likes2 = weiboVideoBean.getLikes();
        if (likes != null ? !likes.equals(likes2) : likes2 != null) {
            return false;
        }
        Integer comments = getComments();
        Integer comments2 = weiboVideoBean.getComments();
        if (comments != null ? !comments.equals(comments2) : comments2 != null) {
            return false;
        }
        Integer type = getType();
        Integer type2 = weiboVideoBean.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        Integer isdel = getIsdel();
        Integer isdel2 = weiboVideoBean.getIsdel();
        if (isdel != null ? !isdel.equals(isdel2) : isdel2 != null) {
            return false;
        }
        Integer status = getStatus();
        Integer status2 = weiboVideoBean.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        Integer uptime = getUptime();
        Integer uptime2 = weiboVideoBean.getUptime();
        if (uptime != null ? !uptime.equals(uptime2) : uptime2 != null) {
            return false;
        }
        Integer labelid = getLabelid();
        Integer labelid2 = weiboVideoBean.getLabelid();
        if (labelid != null ? !labelid.equals(labelid2) : labelid2 != null) {
            return false;
        }
        Integer isLike = getIsLike();
        Integer isLike2 = weiboVideoBean.getIsLike();
        if (isLike != null ? !isLike.equals(isLike2) : isLike2 != null) {
            return false;
        }
        String content = getContent();
        String content2 = weiboVideoBean.getContent();
        if (content != null ? !content.equals(content2) : content2 != null) {
            return false;
        }
        List<String> images = getImages();
        List<String> images2 = weiboVideoBean.getImages();
        if (images != null ? !images.equals(images2) : images2 != null) {
            return false;
        }
        String videoThumb = getVideoThumb();
        String videoThumb2 = weiboVideoBean.getVideoThumb();
        if (videoThumb != null ? !videoThumb.equals(videoThumb2) : videoThumb2 != null) {
            return false;
        }
        String videoUrl = getVideoUrl();
        String videoUrl2 = weiboVideoBean.getVideoUrl();
        if (videoUrl != null ? !videoUrl.equals(videoUrl2) : videoUrl2 != null) {
            return false;
        }
        String voiceUrl = getVoiceUrl();
        String voiceUrl2 = weiboVideoBean.getVoiceUrl();
        if (voiceUrl != null ? !voiceUrl.equals(voiceUrl2) : voiceUrl2 != null) {
            return false;
        }
        String xiajiaReason = getXiajiaReason();
        String xiajiaReason2 = weiboVideoBean.getXiajiaReason();
        if (xiajiaReason != null ? !xiajiaReason.equals(xiajiaReason2) : xiajiaReason2 != null) {
            return false;
        }
        String lat = getLat();
        String lat2 = weiboVideoBean.getLat();
        if (lat != null ? !lat.equals(lat2) : lat2 != null) {
            return false;
        }
        String lng = getLng();
        String lng2 = weiboVideoBean.getLng();
        if (lng != null ? !lng.equals(lng2) : lng2 != null) {
            return false;
        }
        String city = getCity();
        String city2 = weiboVideoBean.getCity();
        if (city != null ? !city.equals(city2) : city2 != null) {
            return false;
        }
        String address = getAddress();
        String address2 = weiboVideoBean.getAddress();
        if (address != null ? !address.equals(address2) : address2 != null) {
            return false;
        }
        String failReason = getFailReason();
        String failReason2 = weiboVideoBean.getFailReason();
        if (failReason != null ? !failReason.equals(failReason2) : failReason2 != null) {
            return false;
        }
        String createTime = getCreateTime();
        String createTime2 = weiboVideoBean.getCreateTime();
        if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
            return false;
        }
        String updateTime = getUpdateTime();
        String updateTime2 = weiboVideoBean.getUpdateTime();
        if (updateTime != null ? !updateTime.equals(updateTime2) : updateTime2 != null) {
            return false;
        }
        UserDTO user = getUser();
        UserDTO user2 = weiboVideoBean.getUser();
        return user != null ? user.equals(user2) : user2 == null;
    }

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public Integer getComments() {
        return this.comments;
    }

    public String getContent() {
        return this.content;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getFailReason() {
        return this.failReason;
    }

    public Integer getId() {
        return this.f34920id;
    }

    public List<String> getImages() {
        return this.images;
    }

    public Integer getIsLike() {
        return this.isLike;
    }

    public Integer getIsdel() {
        return this.isdel;
    }

    public Integer getLabelid() {
        return this.labelid;
    }

    public String getLat() {
        return this.lat;
    }

    public Integer getLikes() {
        return this.likes;
    }

    public String getLng() {
        return this.lng;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getUid() {
        return this.uid;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public Integer getUptime() {
        return this.uptime;
    }

    public UserDTO getUser() {
        return this.user;
    }

    public String getVideoThumb() {
        return this.videoThumb;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }

    public Integer getVoiceLength() {
        return this.voiceLength;
    }

    public String getVoiceUrl() {
        return this.voiceUrl;
    }

    public String getXiajiaReason() {
        return this.xiajiaReason;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        Integer uid = getUid();
        int iHashCode2 = ((iHashCode + 59) * 59) + (uid == null ? 43 : uid.hashCode());
        Integer voiceLength = getVoiceLength();
        int iHashCode3 = (iHashCode2 * 59) + (voiceLength == null ? 43 : voiceLength.hashCode());
        Integer likes = getLikes();
        int iHashCode4 = (iHashCode3 * 59) + (likes == null ? 43 : likes.hashCode());
        Integer comments = getComments();
        int iHashCode5 = (iHashCode4 * 59) + (comments == null ? 43 : comments.hashCode());
        Integer type = getType();
        int iHashCode6 = (iHashCode5 * 59) + (type == null ? 43 : type.hashCode());
        Integer isdel = getIsdel();
        int iHashCode7 = (iHashCode6 * 59) + (isdel == null ? 43 : isdel.hashCode());
        Integer status = getStatus();
        int iHashCode8 = (iHashCode7 * 59) + (status == null ? 43 : status.hashCode());
        Integer uptime = getUptime();
        int iHashCode9 = (iHashCode8 * 59) + (uptime == null ? 43 : uptime.hashCode());
        Integer labelid = getLabelid();
        int iHashCode10 = (iHashCode9 * 59) + (labelid == null ? 43 : labelid.hashCode());
        Integer isLike = getIsLike();
        int iHashCode11 = (iHashCode10 * 59) + (isLike == null ? 43 : isLike.hashCode());
        String content = getContent();
        int iHashCode12 = (iHashCode11 * 59) + (content == null ? 43 : content.hashCode());
        List<String> images = getImages();
        int iHashCode13 = (iHashCode12 * 59) + (images == null ? 43 : images.hashCode());
        String videoThumb = getVideoThumb();
        int iHashCode14 = (iHashCode13 * 59) + (videoThumb == null ? 43 : videoThumb.hashCode());
        String videoUrl = getVideoUrl();
        int iHashCode15 = (iHashCode14 * 59) + (videoUrl == null ? 43 : videoUrl.hashCode());
        String voiceUrl = getVoiceUrl();
        int iHashCode16 = (iHashCode15 * 59) + (voiceUrl == null ? 43 : voiceUrl.hashCode());
        String xiajiaReason = getXiajiaReason();
        int iHashCode17 = (iHashCode16 * 59) + (xiajiaReason == null ? 43 : xiajiaReason.hashCode());
        String lat = getLat();
        int iHashCode18 = (iHashCode17 * 59) + (lat == null ? 43 : lat.hashCode());
        String lng = getLng();
        int iHashCode19 = (iHashCode18 * 59) + (lng == null ? 43 : lng.hashCode());
        String city = getCity();
        int iHashCode20 = (iHashCode19 * 59) + (city == null ? 43 : city.hashCode());
        String address = getAddress();
        int iHashCode21 = (iHashCode20 * 59) + (address == null ? 43 : address.hashCode());
        String failReason = getFailReason();
        int iHashCode22 = (iHashCode21 * 59) + (failReason == null ? 43 : failReason.hashCode());
        String createTime = getCreateTime();
        int iHashCode23 = (iHashCode22 * 59) + (createTime == null ? 43 : createTime.hashCode());
        String updateTime = getUpdateTime();
        int iHashCode24 = (iHashCode23 * 59) + (updateTime == null ? 43 : updateTime.hashCode());
        UserDTO user = getUser();
        return (iHashCode24 * 59) + (user != null ? user.hashCode() : 43);
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setComments(Integer num) {
        this.comments = num;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setFailReason(String str) {
        this.failReason = str;
    }

    public void setId(Integer num) {
        this.f34920id = num;
    }

    public void setImages(List<String> list) {
        this.images = list;
    }

    public void setIsLike(Integer num) {
        this.isLike = num;
    }

    public void setIsdel(Integer num) {
        this.isdel = num;
    }

    public void setLabelid(Integer num) {
        this.labelid = num;
    }

    public void setLat(String str) {
        this.lat = str;
    }

    public void setLikes(Integer num) {
        this.likes = num;
    }

    public void setLng(String str) {
        this.lng = str;
    }

    public void setStatus(Integer num) {
        this.status = num;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public void setUid(Integer num) {
        this.uid = num;
    }

    public void setUpdateTime(String str) {
        this.updateTime = str;
    }

    public void setUptime(Integer num) {
        this.uptime = num;
    }

    public void setUser(UserDTO userDTO) {
        this.user = userDTO;
    }

    public void setVideoThumb(String str) {
        this.videoThumb = str;
    }

    public void setVideoUrl(String str) {
        this.videoUrl = str;
    }

    public void setVoiceLength(Integer num) {
        this.voiceLength = num;
    }

    public void setVoiceUrl(String str) {
        this.voiceUrl = str;
    }

    public void setXiajiaReason(String str) {
        this.xiajiaReason = str;
    }

    public String toString() {
        return "WeiboVideoBean(id=" + getId() + ", uid=" + getUid() + ", content=" + getContent() + ", images=" + getImages() + ", videoThumb=" + getVideoThumb() + ", videoUrl=" + getVideoUrl() + ", voiceUrl=" + getVoiceUrl() + ", voiceLength=" + getVoiceLength() + ", likes=" + getLikes() + ", comments=" + getComments() + ", type=" + getType() + ", isdel=" + getIsdel() + ", status=" + getStatus() + ", uptime=" + getUptime() + ", xiajiaReason=" + getXiajiaReason() + ", lat=" + getLat() + ", lng=" + getLng() + ", city=" + getCity() + ", address=" + getAddress() + ", failReason=" + getFailReason() + ", labelid=" + getLabelid() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ", isLike=" + getIsLike() + ", user=" + getUser() + ")";
    }
}
