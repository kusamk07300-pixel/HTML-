package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import net.babycat.live.model.HotListBean;

/* JADX INFO: loaded from: classes4.dex */
public class PartyListBean {

    @SerializedName("countrycodelist")
    private List<HotListBean.CountrycodelistDTO> countrycodelist;

    @SerializedName("list")
    private List<RoomListBean> list;

    @SerializedName("rank")
    private List<HotListBean.RankDTO.InDTO> rank;

    @SerializedName("rank2")
    private HotListBean.RankDTO rank2;

    @SerializedName("rank_cp")
    private List<HotListBean.RankDTO.InDTO> rankCp;

    @SerializedName("recommend")
    private List<RoomListBean> recommend;

    @SerializedName("slide")
    private List<BannerDataBean> slide;

    public static class InDTO {

        @SerializedName("rank")
        private Integer rank;

        @SerializedName("total")
        private Integer total;

        @SerializedName("uid")
        private Integer uid;

        @SerializedName("user")
        private HotListBean.RankDTO.InDTO.UserDTO user;

        public static class UserDTO {

            @SerializedName("anchor_level")
            private Integer anchorLevel;

            @SerializedName("avatar")
            private String avatar;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @SerializedName("id")
            private Integer f34875id;

            @SerializedName("level")
            private Integer level;

            @SerializedName("nickname")
            private String nickname;

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
                Integer level = getLevel();
                Integer level2 = userDTO.getLevel();
                if (level != null ? !level.equals(level2) : level2 != null) {
                    return false;
                }
                Integer anchorLevel = getAnchorLevel();
                Integer anchorLevel2 = userDTO.getAnchorLevel();
                if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
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

            public Integer getAnchorLevel() {
                return this.anchorLevel;
            }

            public String getAvatar() {
                return this.avatar;
            }

            public Integer getId() {
                return this.f34875id;
            }

            public Integer getLevel() {
                return this.level;
            }

            public String getNickname() {
                return this.nickname;
            }

            public int hashCode() {
                Integer id2 = getId();
                int iHashCode = id2 == null ? 43 : id2.hashCode();
                Integer level = getLevel();
                int iHashCode2 = ((iHashCode + 59) * 59) + (level == null ? 43 : level.hashCode());
                Integer anchorLevel = getAnchorLevel();
                int iHashCode3 = (iHashCode2 * 59) + (anchorLevel == null ? 43 : anchorLevel.hashCode());
                String nickname = getNickname();
                int iHashCode4 = (iHashCode3 * 59) + (nickname == null ? 43 : nickname.hashCode());
                String avatar = getAvatar();
                return (iHashCode4 * 59) + (avatar != null ? avatar.hashCode() : 43);
            }

            public void setAnchorLevel(Integer num) {
                this.anchorLevel = num;
            }

            public void setAvatar(String str) {
                this.avatar = str;
            }

            public void setId(Integer num) {
                this.f34875id = num;
            }

            public void setLevel(Integer num) {
                this.level = num;
            }

            public void setNickname(String str) {
                this.nickname = str;
            }

            public String toString() {
                return "PartyListBean.InDTO.UserDTO(id=" + getId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ")";
            }
        }

        public boolean canEqual(Object obj) {
            return obj instanceof InDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InDTO)) {
                return false;
            }
            InDTO inDTO = (InDTO) obj;
            if (!inDTO.canEqual(this)) {
                return false;
            }
            Integer uid = getUid();
            Integer uid2 = inDTO.getUid();
            if (uid != null ? !uid.equals(uid2) : uid2 != null) {
                return false;
            }
            Integer total = getTotal();
            Integer total2 = inDTO.getTotal();
            if (total != null ? !total.equals(total2) : total2 != null) {
                return false;
            }
            Integer rank = getRank();
            Integer rank2 = inDTO.getRank();
            if (rank != null ? !rank.equals(rank2) : rank2 != null) {
                return false;
            }
            HotListBean.RankDTO.InDTO.UserDTO user = getUser();
            HotListBean.RankDTO.InDTO.UserDTO user2 = inDTO.getUser();
            return user != null ? user.equals(user2) : user2 == null;
        }

        public Integer getRank() {
            return this.rank;
        }

        public Integer getTotal() {
            return this.total;
        }

        public Integer getUid() {
            return this.uid;
        }

        public HotListBean.RankDTO.InDTO.UserDTO getUser() {
            return this.user;
        }

        public int hashCode() {
            Integer uid = getUid();
            int iHashCode = uid == null ? 43 : uid.hashCode();
            Integer total = getTotal();
            int iHashCode2 = ((iHashCode + 59) * 59) + (total == null ? 43 : total.hashCode());
            Integer rank = getRank();
            int iHashCode3 = (iHashCode2 * 59) + (rank == null ? 43 : rank.hashCode());
            HotListBean.RankDTO.InDTO.UserDTO user = getUser();
            return (iHashCode3 * 59) + (user != null ? user.hashCode() : 43);
        }

        public void setRank(Integer num) {
            this.rank = num;
        }

        public void setTotal(Integer num) {
            this.total = num;
        }

        public void setUid(Integer num) {
            this.uid = num;
        }

        public void setUser(HotListBean.RankDTO.InDTO.UserDTO userDTO) {
            this.user = userDTO;
        }

        public String toString() {
            return "PartyListBean.InDTO(uid=" + getUid() + ", total=" + getTotal() + ", rank=" + getRank() + ", user=" + getUser() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PartyListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PartyListBean)) {
            return false;
        }
        PartyListBean partyListBean = (PartyListBean) obj;
        if (!partyListBean.canEqual(this)) {
            return false;
        }
        List<BannerDataBean> slide = getSlide();
        List<BannerDataBean> slide2 = partyListBean.getSlide();
        if (slide != null ? !slide.equals(slide2) : slide2 != null) {
            return false;
        }
        List<RoomListBean> recommend = getRecommend();
        List<RoomListBean> recommend2 = partyListBean.getRecommend();
        if (recommend != null ? !recommend.equals(recommend2) : recommend2 != null) {
            return false;
        }
        List<HotListBean.RankDTO.InDTO> rank = getRank();
        List<HotListBean.RankDTO.InDTO> rank2 = partyListBean.getRank();
        if (rank != null ? !rank.equals(rank2) : rank2 != null) {
            return false;
        }
        List<HotListBean.RankDTO.InDTO> rankCp = getRankCp();
        List<HotListBean.RankDTO.InDTO> rankCp2 = partyListBean.getRankCp();
        if (rankCp != null ? !rankCp.equals(rankCp2) : rankCp2 != null) {
            return false;
        }
        HotListBean.RankDTO rank22 = getRank2();
        HotListBean.RankDTO rank23 = partyListBean.getRank2();
        if (rank22 != null ? !rank22.equals(rank23) : rank23 != null) {
            return false;
        }
        List<HotListBean.CountrycodelistDTO> countrycodelist = getCountrycodelist();
        List<HotListBean.CountrycodelistDTO> countrycodelist2 = partyListBean.getCountrycodelist();
        if (countrycodelist != null ? !countrycodelist.equals(countrycodelist2) : countrycodelist2 != null) {
            return false;
        }
        List<RoomListBean> list = getList();
        List<RoomListBean> list2 = partyListBean.getList();
        return list != null ? list.equals(list2) : list2 == null;
    }

    public List<HotListBean.CountrycodelistDTO> getCountrycodelist() {
        return this.countrycodelist;
    }

    public List<RoomListBean> getList() {
        return this.list;
    }

    public List<HotListBean.RankDTO.InDTO> getRank() {
        return this.rank;
    }

    public HotListBean.RankDTO getRank2() {
        return this.rank2;
    }

    public List<HotListBean.RankDTO.InDTO> getRankCp() {
        return this.rankCp;
    }

    public List<RoomListBean> getRecommend() {
        return this.recommend;
    }

    public List<BannerDataBean> getSlide() {
        return this.slide;
    }

    public int hashCode() {
        List<BannerDataBean> slide = getSlide();
        int iHashCode = slide == null ? 43 : slide.hashCode();
        List<RoomListBean> recommend = getRecommend();
        int iHashCode2 = ((iHashCode + 59) * 59) + (recommend == null ? 43 : recommend.hashCode());
        List<HotListBean.RankDTO.InDTO> rank = getRank();
        int iHashCode3 = (iHashCode2 * 59) + (rank == null ? 43 : rank.hashCode());
        List<HotListBean.RankDTO.InDTO> rankCp = getRankCp();
        int iHashCode4 = (iHashCode3 * 59) + (rankCp == null ? 43 : rankCp.hashCode());
        HotListBean.RankDTO rank2 = getRank2();
        int iHashCode5 = (iHashCode4 * 59) + (rank2 == null ? 43 : rank2.hashCode());
        List<HotListBean.CountrycodelistDTO> countrycodelist = getCountrycodelist();
        int iHashCode6 = (iHashCode5 * 59) + (countrycodelist == null ? 43 : countrycodelist.hashCode());
        List<RoomListBean> list = getList();
        return (iHashCode6 * 59) + (list != null ? list.hashCode() : 43);
    }

    public void setCountrycodelist(List<HotListBean.CountrycodelistDTO> list) {
        this.countrycodelist = list;
    }

    public void setList(List<RoomListBean> list) {
        this.list = list;
    }

    public void setRank(List<HotListBean.RankDTO.InDTO> list) {
        this.rank = list;
    }

    public void setRank2(HotListBean.RankDTO rankDTO) {
        this.rank2 = rankDTO;
    }

    public void setRankCp(List<HotListBean.RankDTO.InDTO> list) {
        this.rankCp = list;
    }

    public void setRecommend(List<RoomListBean> list) {
        this.recommend = list;
    }

    public void setSlide(List<BannerDataBean> list) {
        this.slide = list;
    }

    public String toString() {
        return "PartyListBean(slide=" + getSlide() + ", recommend=" + getRecommend() + ", rank=" + getRank() + ", rankCp=" + getRankCp() + ", rank2=" + getRank2() + ", countrycodelist=" + getCountrycodelist() + ", list=" + getList() + ")";
    }
}
