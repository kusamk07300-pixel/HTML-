package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class VideoListBean {

    @SerializedName("duration")
    private Long duration;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34918id;

    @SerializedName("start_time")
    private Long startTime;

    @SerializedName("thumbnail")
    private String thumbnail;

    @SerializedName("title")
    private String title;

    @SerializedName("video_id")
    private String videoId;

    public boolean canEqual(Object obj) {
        return obj instanceof VideoListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoListBean)) {
            return false;
        }
        VideoListBean videoListBean = (VideoListBean) obj;
        if (!videoListBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = videoListBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Long startTime = getStartTime();
        Long startTime2 = videoListBean.getStartTime();
        if (startTime != null ? !startTime.equals(startTime2) : startTime2 != null) {
            return false;
        }
        Long duration = getDuration();
        Long duration2 = videoListBean.getDuration();
        if (duration != null ? !duration.equals(duration2) : duration2 != null) {
            return false;
        }
        String title = getTitle();
        String title2 = videoListBean.getTitle();
        if (title != null ? !title.equals(title2) : title2 != null) {
            return false;
        }
        String thumbnail = getThumbnail();
        String thumbnail2 = videoListBean.getThumbnail();
        if (thumbnail != null ? !thumbnail.equals(thumbnail2) : thumbnail2 != null) {
            return false;
        }
        String videoId = getVideoId();
        String videoId2 = videoListBean.getVideoId();
        return videoId != null ? videoId.equals(videoId2) : videoId2 == null;
    }

    public Long getDuration() {
        return this.duration;
    }

    public Integer getId() {
        return this.f34918id;
    }

    public Long getStartTime() {
        return this.startTime;
    }

    public String getThumbnail() {
        return this.thumbnail;
    }

    public String getTitle() {
        return this.title;
    }

    public String getVideoId() {
        return this.videoId;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        Long startTime = getStartTime();
        int iHashCode2 = ((iHashCode + 59) * 59) + (startTime == null ? 43 : startTime.hashCode());
        Long duration = getDuration();
        int iHashCode3 = (iHashCode2 * 59) + (duration == null ? 43 : duration.hashCode());
        String title = getTitle();
        int iHashCode4 = (iHashCode3 * 59) + (title == null ? 43 : title.hashCode());
        String thumbnail = getThumbnail();
        int iHashCode5 = (iHashCode4 * 59) + (thumbnail == null ? 43 : thumbnail.hashCode());
        String videoId = getVideoId();
        return (iHashCode5 * 59) + (videoId != null ? videoId.hashCode() : 43);
    }

    public void setDuration(Long l10) {
        this.duration = l10;
    }

    public void setId(Integer num) {
        this.f34918id = num;
    }

    public void setStartTime(Long l10) {
        this.startTime = l10;
    }

    public void setThumbnail(String str) {
        this.thumbnail = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setVideoId(String str) {
        this.videoId = str;
    }

    public String toString() {
        return "VideoListBean(id=" + getId() + ", title=" + getTitle() + ", thumbnail=" + getThumbnail() + ", videoId=" + getVideoId() + ", startTime=" + getStartTime() + ", duration=" + getDuration() + ")";
    }
}
