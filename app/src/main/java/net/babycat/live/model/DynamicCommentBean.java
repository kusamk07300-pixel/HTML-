package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import net.babycat.live.model.DynamicListBean;

/* JADX INFO: loaded from: classes4.dex */
public class DynamicCommentBean {

    @SerializedName("content")
    private String content;

    @SerializedName("create_time")
    private String createTime;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34821id;

    @SerializedName("is_like")
    private Integer isLike;

    @SerializedName("likes")
    private Integer likes;

    @SerializedName("user")
    private DynamicListBean.DynamicUserBean user;

    public boolean canEqual(Object obj) {
        return obj instanceof DynamicCommentBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DynamicCommentBean)) {
            return false;
        }
        DynamicCommentBean dynamicCommentBean = (DynamicCommentBean) obj;
        if (!dynamicCommentBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = dynamicCommentBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer likes = getLikes();
        Integer likes2 = dynamicCommentBean.getLikes();
        if (likes != null ? !likes.equals(likes2) : likes2 != null) {
            return false;
        }
        Integer isLike = getIsLike();
        Integer isLike2 = dynamicCommentBean.getIsLike();
        if (isLike != null ? !isLike.equals(isLike2) : isLike2 != null) {
            return false;
        }
        DynamicListBean.DynamicUserBean user = getUser();
        DynamicListBean.DynamicUserBean user2 = dynamicCommentBean.getUser();
        if (user != null ? !user.equals(user2) : user2 != null) {
            return false;
        }
        String content = getContent();
        String content2 = dynamicCommentBean.getContent();
        if (content != null ? !content.equals(content2) : content2 != null) {
            return false;
        }
        String createTime = getCreateTime();
        String createTime2 = dynamicCommentBean.getCreateTime();
        return createTime != null ? createTime.equals(createTime2) : createTime2 == null;
    }

    public String getContent() {
        return this.content;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public Integer getId() {
        return this.f34821id;
    }

    public Integer getIsLike() {
        return this.isLike;
    }

    public Integer getLikes() {
        return this.likes;
    }

    public DynamicListBean.DynamicUserBean getUser() {
        return this.user;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        Integer likes = getLikes();
        int iHashCode2 = ((iHashCode + 59) * 59) + (likes == null ? 43 : likes.hashCode());
        Integer isLike = getIsLike();
        int iHashCode3 = (iHashCode2 * 59) + (isLike == null ? 43 : isLike.hashCode());
        DynamicListBean.DynamicUserBean user = getUser();
        int iHashCode4 = (iHashCode3 * 59) + (user == null ? 43 : user.hashCode());
        String content = getContent();
        int iHashCode5 = (iHashCode4 * 59) + (content == null ? 43 : content.hashCode());
        String createTime = getCreateTime();
        return (iHashCode5 * 59) + (createTime != null ? createTime.hashCode() : 43);
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setId(Integer num) {
        this.f34821id = num;
    }

    public void setIsLike(Integer num) {
        this.isLike = num;
    }

    public void setLikes(Integer num) {
        this.likes = num;
    }

    public void setUser(DynamicListBean.DynamicUserBean dynamicUserBean) {
        this.user = dynamicUserBean;
    }

    public String toString() {
        return "DynamicCommentBean(id=" + getId() + ", user=" + getUser() + ", content=" + getContent() + ", likes=" + getLikes() + ", createTime=" + getCreateTime() + ", isLike=" + getIsLike() + ")";
    }
}
