package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DynamicListBean implements Serializable {

    @SerializedName("comments")
    private Integer comments;

    @SerializedName("content")
    private String content;

    @SerializedName("create_time")
    private String createTime;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34823id;

    @SerializedName("images")
    private List<String> images;

    @SerializedName("is_like")
    private Integer isLike;

    @SerializedName("likes")
    private Integer likes;

    @SerializedName("user")
    private DynamicUserBean user;

    public static class DynamicUserBean implements Serializable {

        @SerializedName("avatar")
        private String avatar;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34824id;

        @SerializedName("nickname")
        private String nickName;

        @SerializedName("sex")
        private Integer sex;

        public boolean canEqual(Object obj) {
            return obj instanceof DynamicUserBean;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DynamicUserBean)) {
                return false;
            }
            DynamicUserBean dynamicUserBean = (DynamicUserBean) obj;
            if (!dynamicUserBean.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = dynamicUserBean.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            Integer sex = getSex();
            Integer sex2 = dynamicUserBean.getSex();
            if (sex != null ? !sex.equals(sex2) : sex2 != null) {
                return false;
            }
            String nickName = getNickName();
            String nickName2 = dynamicUserBean.getNickName();
            if (nickName != null ? !nickName.equals(nickName2) : nickName2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = dynamicUserBean.getAvatar();
            return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public Integer getId() {
            return this.f34824id;
        }

        public String getNickName() {
            return this.nickName;
        }

        public Integer getSex() {
            return this.sex;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer sex = getSex();
            int iHashCode2 = ((iHashCode + 59) * 59) + (sex == null ? 43 : sex.hashCode());
            String nickName = getNickName();
            int iHashCode3 = (iHashCode2 * 59) + (nickName == null ? 43 : nickName.hashCode());
            String avatar = getAvatar();
            return (iHashCode3 * 59) + (avatar != null ? avatar.hashCode() : 43);
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setId(Integer num) {
            this.f34824id = num;
        }

        public void setNickName(String str) {
            this.nickName = str;
        }

        public void setSex(Integer num) {
            this.sex = num;
        }

        public String toString() {
            return "DynamicListBean.DynamicUserBean(id=" + getId() + ", nickName=" + getNickName() + ", sex=" + getSex() + ", avatar=" + getAvatar() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof DynamicListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DynamicListBean)) {
            return false;
        }
        DynamicListBean dynamicListBean = (DynamicListBean) obj;
        if (!dynamicListBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = dynamicListBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer likes = getLikes();
        Integer likes2 = dynamicListBean.getLikes();
        if (likes != null ? !likes.equals(likes2) : likes2 != null) {
            return false;
        }
        Integer comments = getComments();
        Integer comments2 = dynamicListBean.getComments();
        if (comments != null ? !comments.equals(comments2) : comments2 != null) {
            return false;
        }
        Integer isLike = getIsLike();
        Integer isLike2 = dynamicListBean.getIsLike();
        if (isLike != null ? !isLike.equals(isLike2) : isLike2 != null) {
            return false;
        }
        DynamicUserBean user = getUser();
        DynamicUserBean user2 = dynamicListBean.getUser();
        if (user != null ? !user.equals(user2) : user2 != null) {
            return false;
        }
        String content = getContent();
        String content2 = dynamicListBean.getContent();
        if (content != null ? !content.equals(content2) : content2 != null) {
            return false;
        }
        List<String> images = getImages();
        List<String> images2 = dynamicListBean.getImages();
        if (images != null ? !images.equals(images2) : images2 != null) {
            return false;
        }
        String createTime = getCreateTime();
        String createTime2 = dynamicListBean.getCreateTime();
        return createTime != null ? createTime.equals(createTime2) : createTime2 == null;
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

    public Integer getId() {
        return this.f34823id;
    }

    public List<String> getImages() {
        return this.images;
    }

    public Integer getIsLike() {
        return this.isLike;
    }

    public Integer getLikes() {
        return this.likes;
    }

    public DynamicUserBean getUser() {
        return this.user;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        Integer likes = getLikes();
        int iHashCode2 = ((iHashCode + 59) * 59) + (likes == null ? 43 : likes.hashCode());
        Integer comments = getComments();
        int iHashCode3 = (iHashCode2 * 59) + (comments == null ? 43 : comments.hashCode());
        Integer isLike = getIsLike();
        int iHashCode4 = (iHashCode3 * 59) + (isLike == null ? 43 : isLike.hashCode());
        DynamicUserBean user = getUser();
        int iHashCode5 = (iHashCode4 * 59) + (user == null ? 43 : user.hashCode());
        String content = getContent();
        int iHashCode6 = (iHashCode5 * 59) + (content == null ? 43 : content.hashCode());
        List<String> images = getImages();
        int iHashCode7 = (iHashCode6 * 59) + (images == null ? 43 : images.hashCode());
        String createTime = getCreateTime();
        return (iHashCode7 * 59) + (createTime != null ? createTime.hashCode() : 43);
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

    public void setId(Integer num) {
        this.f34823id = num;
    }

    public void setImages(List<String> list) {
        this.images = list;
    }

    public void setIsLike(Integer num) {
        this.isLike = num;
    }

    public void setLikes(Integer num) {
        this.likes = num;
    }

    public void setUser(DynamicUserBean dynamicUserBean) {
        this.user = dynamicUserBean;
    }

    public String toString() {
        return "DynamicListBean(id=" + getId() + ", user=" + getUser() + ", content=" + getContent() + ", images=" + getImages() + ", likes=" + getLikes() + ", comments=" + getComments() + ", createTime=" + getCreateTime() + ", isLike=" + getIsLike() + ")";
    }
}
