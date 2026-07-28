package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class MusicListBean {

    @SerializedName("code")
    private Integer code;

    @SerializedName("data")
    private DataDTO data;

    @SerializedName("hasmore")
    private Boolean hasmore;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private Integer time;

    @SerializedName("total")
    private Integer total;

    public static class DataDTO {

        @SerializedName("list")
        private List<ListDTO> list;

        public static class ListDTO {

            @SerializedName("albumn_name")
            private String albumnName;

            @SerializedName(o0.q.f25894i)
            private String author;

            @SerializedName("cover_url")
            private String coverUrl;

            @SerializedName("create_time")
            private String createTime;

            @SerializedName("filesize")
            private String filesize;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @SerializedName("id")
            private Integer f34864id;

            @SerializedName("lrc_link")
            private String lrcLink;

            @SerializedName("music_link")
            private String musicLink;

            @SerializedName("sort")
            private Integer sort;

            @SerializedName(o0.CATEGORY_STATUS)
            private Integer status;

            @SerializedName("title")
            private String title;

            public boolean canEqual(Object obj) {
                return obj instanceof ListDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ListDTO)) {
                    return false;
                }
                ListDTO listDTO = (ListDTO) obj;
                if (!listDTO.canEqual(this)) {
                    return false;
                }
                Integer id2 = getId();
                Integer id3 = listDTO.getId();
                if (id2 != null ? !id2.equals(id3) : id3 != null) {
                    return false;
                }
                Integer sort = getSort();
                Integer sort2 = listDTO.getSort();
                if (sort != null ? !sort.equals(sort2) : sort2 != null) {
                    return false;
                }
                Integer status = getStatus();
                Integer status2 = listDTO.getStatus();
                if (status != null ? !status.equals(status2) : status2 != null) {
                    return false;
                }
                String musicLink = getMusicLink();
                String musicLink2 = listDTO.getMusicLink();
                if (musicLink != null ? !musicLink.equals(musicLink2) : musicLink2 != null) {
                    return false;
                }
                String title = getTitle();
                String title2 = listDTO.getTitle();
                if (title != null ? !title.equals(title2) : title2 != null) {
                    return false;
                }
                String createTime = getCreateTime();
                String createTime2 = listDTO.getCreateTime();
                if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
                    return false;
                }
                String lrcLink = getLrcLink();
                String lrcLink2 = listDTO.getLrcLink();
                if (lrcLink != null ? !lrcLink.equals(lrcLink2) : lrcLink2 != null) {
                    return false;
                }
                String author = getAuthor();
                String author2 = listDTO.getAuthor();
                if (author != null ? !author.equals(author2) : author2 != null) {
                    return false;
                }
                String coverUrl = getCoverUrl();
                String coverUrl2 = listDTO.getCoverUrl();
                if (coverUrl != null ? !coverUrl.equals(coverUrl2) : coverUrl2 != null) {
                    return false;
                }
                String albumnName = getAlbumnName();
                String albumnName2 = listDTO.getAlbumnName();
                if (albumnName != null ? !albumnName.equals(albumnName2) : albumnName2 != null) {
                    return false;
                }
                String filesize = getFilesize();
                String filesize2 = listDTO.getFilesize();
                return filesize != null ? filesize.equals(filesize2) : filesize2 == null;
            }

            public String getAlbumnName() {
                return this.albumnName;
            }

            public String getAuthor() {
                return this.author;
            }

            public String getCoverUrl() {
                return this.coverUrl;
            }

            public String getCreateTime() {
                return this.createTime;
            }

            public String getFilesize() {
                return this.filesize;
            }

            public Integer getId() {
                return this.f34864id;
            }

            public String getLrcLink() {
                return this.lrcLink;
            }

            public String getMusicLink() {
                return this.musicLink;
            }

            public Integer getSort() {
                return this.sort;
            }

            public Integer getStatus() {
                return this.status;
            }

            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                Integer id2 = getId();
                int iHashCode = id2 == null ? 43 : id2.hashCode();
                Integer sort = getSort();
                int iHashCode2 = ((iHashCode + 59) * 59) + (sort == null ? 43 : sort.hashCode());
                Integer status = getStatus();
                int iHashCode3 = (iHashCode2 * 59) + (status == null ? 43 : status.hashCode());
                String musicLink = getMusicLink();
                int iHashCode4 = (iHashCode3 * 59) + (musicLink == null ? 43 : musicLink.hashCode());
                String title = getTitle();
                int iHashCode5 = (iHashCode4 * 59) + (title == null ? 43 : title.hashCode());
                String createTime = getCreateTime();
                int iHashCode6 = (iHashCode5 * 59) + (createTime == null ? 43 : createTime.hashCode());
                String lrcLink = getLrcLink();
                int iHashCode7 = (iHashCode6 * 59) + (lrcLink == null ? 43 : lrcLink.hashCode());
                String author = getAuthor();
                int iHashCode8 = (iHashCode7 * 59) + (author == null ? 43 : author.hashCode());
                String coverUrl = getCoverUrl();
                int iHashCode9 = (iHashCode8 * 59) + (coverUrl == null ? 43 : coverUrl.hashCode());
                String albumnName = getAlbumnName();
                int iHashCode10 = (iHashCode9 * 59) + (albumnName == null ? 43 : albumnName.hashCode());
                String filesize = getFilesize();
                return (iHashCode10 * 59) + (filesize != null ? filesize.hashCode() : 43);
            }

            public void setAlbumnName(String str) {
                this.albumnName = str;
            }

            public void setAuthor(String str) {
                this.author = str;
            }

            public void setCoverUrl(String str) {
                this.coverUrl = str;
            }

            public void setCreateTime(String str) {
                this.createTime = str;
            }

            public void setFilesize(String str) {
                this.filesize = str;
            }

            public void setId(Integer num) {
                this.f34864id = num;
            }

            public void setLrcLink(String str) {
                this.lrcLink = str;
            }

            public void setMusicLink(String str) {
                this.musicLink = str;
            }

            public void setSort(Integer num) {
                this.sort = num;
            }

            public void setStatus(Integer num) {
                this.status = num;
            }

            public void setTitle(String str) {
                this.title = str;
            }

            public String toString() {
                return "MusicListBean.DataDTO.ListDTO(id=" + getId() + ", musicLink=" + getMusicLink() + ", title=" + getTitle() + ", sort=" + getSort() + ", createTime=" + getCreateTime() + ", lrcLink=" + getLrcLink() + ", author=" + getAuthor() + ", status=" + getStatus() + ", coverUrl=" + getCoverUrl() + ", albumnName=" + getAlbumnName() + ", filesize=" + getFilesize() + ")";
            }
        }

        public boolean canEqual(Object obj) {
            return obj instanceof DataDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DataDTO)) {
                return false;
            }
            DataDTO dataDTO = (DataDTO) obj;
            if (!dataDTO.canEqual(this)) {
                return false;
            }
            List<ListDTO> list = getList();
            List<ListDTO> list2 = dataDTO.getList();
            return list != null ? list.equals(list2) : list2 == null;
        }

        public List<ListDTO> getList() {
            return this.list;
        }

        public int hashCode() {
            List<ListDTO> list = getList();
            return 59 + (list == null ? 43 : list.hashCode());
        }

        public void setList(List<ListDTO> list) {
            this.list = list;
        }

        public String toString() {
            return "MusicListBean.DataDTO(list=" + getList() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof MusicListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MusicListBean)) {
            return false;
        }
        MusicListBean musicListBean = (MusicListBean) obj;
        if (!musicListBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = musicListBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = musicListBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        Integer total = getTotal();
        Integer total2 = musicListBean.getTotal();
        if (total != null ? !total.equals(total2) : total2 != null) {
            return false;
        }
        Boolean hasmore = getHasmore();
        Boolean hasmore2 = musicListBean.getHasmore();
        if (hasmore != null ? !hasmore.equals(hasmore2) : hasmore2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = musicListBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = musicListBean.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    public Integer getCode() {
        return this.code;
    }

    public DataDTO getData() {
        return this.data;
    }

    public Boolean getHasmore() {
        return this.hasmore;
    }

    public String getMsg() {
        return this.msg;
    }

    public Integer getTime() {
        return this.time;
    }

    public Integer getTotal() {
        return this.total;
    }

    public int hashCode() {
        Integer code = getCode();
        int iHashCode = code == null ? 43 : code.hashCode();
        Integer time = getTime();
        int iHashCode2 = ((iHashCode + 59) * 59) + (time == null ? 43 : time.hashCode());
        Integer total = getTotal();
        int iHashCode3 = (iHashCode2 * 59) + (total == null ? 43 : total.hashCode());
        Boolean hasmore = getHasmore();
        int iHashCode4 = (iHashCode3 * 59) + (hasmore == null ? 43 : hasmore.hashCode());
        String msg = getMsg();
        int iHashCode5 = (iHashCode4 * 59) + (msg == null ? 43 : msg.hashCode());
        DataDTO data = getData();
        return (iHashCode5 * 59) + (data != null ? data.hashCode() : 43);
    }

    public void setCode(Integer num) {
        this.code = num;
    }

    public void setData(DataDTO dataDTO) {
        this.data = dataDTO;
    }

    public void setHasmore(Boolean bool) {
        this.hasmore = bool;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setTime(Integer num) {
        this.time = num;
    }

    public void setTotal(Integer num) {
        this.total = num;
    }

    public String toString() {
        return "MusicListBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ", total=" + getTotal() + ", hasmore=" + getHasmore() + ")";
    }
}
