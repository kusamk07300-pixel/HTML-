package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import com.tencent.qcloud.tuicore.TUIConstants;
import g0.o0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class BannerDataBean implements Serializable {

    @SerializedName("content")
    private String content;

    @SerializedName("create_time")
    private String createTime;

    @SerializedName(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION)
    private String description;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34806id;

    @SerializedName("image")
    private String image;

    @SerializedName("link_type")
    private Integer linkType;

    @SerializedName("list_order")
    private Integer listOrder;

    @SerializedName("path")
    private String path;

    @SerializedName("room_info")
    private RoomListBean roomInfo;

    @SerializedName(o0.CATEGORY_STATUS)
    private Integer status;

    @SerializedName("title")
    private String title;

    @SerializedName("type")
    private Integer type;

    @SerializedName("uid")
    private Integer uid;

    public boolean canEqual(Object obj) {
        return obj instanceof BannerDataBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BannerDataBean)) {
            return false;
        }
        BannerDataBean bannerDataBean = (BannerDataBean) obj;
        if (!bannerDataBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = bannerDataBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer status = getStatus();
        Integer status2 = bannerDataBean.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        Integer listOrder = getListOrder();
        Integer listOrder2 = bannerDataBean.getListOrder();
        if (listOrder != null ? !listOrder.equals(listOrder2) : listOrder2 != null) {
            return false;
        }
        Integer type = getType();
        Integer type2 = bannerDataBean.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        Integer uid = getUid();
        Integer uid2 = bannerDataBean.getUid();
        if (uid != null ? !uid.equals(uid2) : uid2 != null) {
            return false;
        }
        Integer linkType = getLinkType();
        Integer linkType2 = bannerDataBean.getLinkType();
        if (linkType != null ? !linkType.equals(linkType2) : linkType2 != null) {
            return false;
        }
        String title = getTitle();
        String title2 = bannerDataBean.getTitle();
        if (title != null ? !title.equals(title2) : title2 != null) {
            return false;
        }
        String image = getImage();
        String image2 = bannerDataBean.getImage();
        if (image != null ? !image.equals(image2) : image2 != null) {
            return false;
        }
        String path = getPath();
        String path2 = bannerDataBean.getPath();
        if (path != null ? !path.equals(path2) : path2 != null) {
            return false;
        }
        String description = getDescription();
        String description2 = bannerDataBean.getDescription();
        if (description != null ? !description.equals(description2) : description2 != null) {
            return false;
        }
        String content = getContent();
        String content2 = bannerDataBean.getContent();
        if (content != null ? !content.equals(content2) : content2 != null) {
            return false;
        }
        String createTime = getCreateTime();
        String createTime2 = bannerDataBean.getCreateTime();
        if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
            return false;
        }
        RoomListBean roomInfo = getRoomInfo();
        RoomListBean roomInfo2 = bannerDataBean.getRoomInfo();
        return roomInfo != null ? roomInfo.equals(roomInfo2) : roomInfo2 == null;
    }

    public String getContent() {
        return this.content;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getDescription() {
        return this.description;
    }

    public Integer getId() {
        return this.f34806id;
    }

    public String getImage() {
        return this.image;
    }

    public Integer getLinkType() {
        return this.linkType;
    }

    public Integer getListOrder() {
        return this.listOrder;
    }

    public String getPath() {
        return this.path;
    }

    public RoomListBean getRoomInfo() {
        return this.roomInfo;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getUid() {
        return this.uid;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        Integer status = getStatus();
        int iHashCode2 = ((iHashCode + 59) * 59) + (status == null ? 43 : status.hashCode());
        Integer listOrder = getListOrder();
        int iHashCode3 = (iHashCode2 * 59) + (listOrder == null ? 43 : listOrder.hashCode());
        Integer type = getType();
        int iHashCode4 = (iHashCode3 * 59) + (type == null ? 43 : type.hashCode());
        Integer uid = getUid();
        int iHashCode5 = (iHashCode4 * 59) + (uid == null ? 43 : uid.hashCode());
        Integer linkType = getLinkType();
        int iHashCode6 = (iHashCode5 * 59) + (linkType == null ? 43 : linkType.hashCode());
        String title = getTitle();
        int iHashCode7 = (iHashCode6 * 59) + (title == null ? 43 : title.hashCode());
        String image = getImage();
        int iHashCode8 = (iHashCode7 * 59) + (image == null ? 43 : image.hashCode());
        String path = getPath();
        int iHashCode9 = (iHashCode8 * 59) + (path == null ? 43 : path.hashCode());
        String description = getDescription();
        int iHashCode10 = (iHashCode9 * 59) + (description == null ? 43 : description.hashCode());
        String content = getContent();
        int iHashCode11 = (iHashCode10 * 59) + (content == null ? 43 : content.hashCode());
        String createTime = getCreateTime();
        int iHashCode12 = (iHashCode11 * 59) + (createTime == null ? 43 : createTime.hashCode());
        RoomListBean roomInfo = getRoomInfo();
        return (iHashCode12 * 59) + (roomInfo != null ? roomInfo.hashCode() : 43);
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setId(Integer num) {
        this.f34806id = num;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setLinkType(Integer num) {
        this.linkType = num;
    }

    public void setListOrder(Integer num) {
        this.listOrder = num;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setRoomInfo(RoomListBean roomListBean) {
        this.roomInfo = roomListBean;
    }

    public void setStatus(Integer num) {
        this.status = num;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public void setUid(Integer num) {
        this.uid = num;
    }

    public String toString() {
        return "BannerDataBean(id=" + getId() + ", status=" + getStatus() + ", listOrder=" + getListOrder() + ", title=" + getTitle() + ", image=" + getImage() + ", path=" + getPath() + ", description=" + getDescription() + ", content=" + getContent() + ", type=" + getType() + ", uid=" + getUid() + ", createTime=" + getCreateTime() + ", linkType=" + getLinkType() + ", roomInfo=" + getRoomInfo() + ")";
    }
}
