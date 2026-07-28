package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AuthorLevelBean {

    @SerializedName("level")
    Integer level;

    @SerializedName("list")
    List<LevelInfoList> list;

    @SerializedName("next_level")
    NextLevel next_level;

    @SerializedName("rank")
    Integer rank;

    @SerializedName("ticket")
    Long ticket;

    public class LevelInfoList {

        @SerializedName("level_up")
        Integer level_up;

        @SerializedName("levelid")
        Integer levelid;

        public LevelInfoList() {
        }

        public boolean canEqual(Object obj) {
            return obj instanceof LevelInfoList;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LevelInfoList)) {
                return false;
            }
            LevelInfoList levelInfoList = (LevelInfoList) obj;
            if (!levelInfoList.canEqual(this)) {
                return false;
            }
            Integer levelid = getLevelid();
            Integer levelid2 = levelInfoList.getLevelid();
            if (levelid != null ? !levelid.equals(levelid2) : levelid2 != null) {
                return false;
            }
            Integer level_up = getLevel_up();
            Integer level_up2 = levelInfoList.getLevel_up();
            return level_up != null ? level_up.equals(level_up2) : level_up2 == null;
        }

        public Integer getLevel_up() {
            return this.level_up;
        }

        public Integer getLevelid() {
            return this.levelid;
        }

        public int hashCode() {
            Integer levelid = getLevelid();
            int iHashCode = levelid == null ? 43 : levelid.hashCode();
            Integer level_up = getLevel_up();
            return ((iHashCode + 59) * 59) + (level_up != null ? level_up.hashCode() : 43);
        }

        public void setLevel_up(Integer num) {
            this.level_up = num;
        }

        public void setLevelid(Integer num) {
            this.levelid = num;
        }

        public String toString() {
            return "AuthorLevelBean.LevelInfoList(levelid=" + getLevelid() + ", level_up=" + getLevel_up() + ")";
        }
    }

    public class NextLevel {

        @SerializedName("level")
        Integer level;

        @SerializedName("need_sorce")
        Long need_sorce;

        @SerializedName("percent")
        Float percent;

        public NextLevel() {
        }

        public boolean canEqual(Object obj) {
            return obj instanceof NextLevel;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NextLevel)) {
                return false;
            }
            NextLevel nextLevel = (NextLevel) obj;
            if (!nextLevel.canEqual(this)) {
                return false;
            }
            Long need_sorce = getNeed_sorce();
            Long need_sorce2 = nextLevel.getNeed_sorce();
            if (need_sorce != null ? !need_sorce.equals(need_sorce2) : need_sorce2 != null) {
                return false;
            }
            Float percent = getPercent();
            Float percent2 = nextLevel.getPercent();
            if (percent != null ? !percent.equals(percent2) : percent2 != null) {
                return false;
            }
            Integer level = getLevel();
            Integer level2 = nextLevel.getLevel();
            return level != null ? level.equals(level2) : level2 == null;
        }

        public Integer getLevel() {
            return this.level;
        }

        public Long getNeed_sorce() {
            return this.need_sorce;
        }

        public Float getPercent() {
            return this.percent;
        }

        public int hashCode() {
            Long need_sorce = getNeed_sorce();
            int iHashCode = need_sorce == null ? 43 : need_sorce.hashCode();
            Float percent = getPercent();
            int iHashCode2 = ((iHashCode + 59) * 59) + (percent == null ? 43 : percent.hashCode());
            Integer level = getLevel();
            return (iHashCode2 * 59) + (level != null ? level.hashCode() : 43);
        }

        public void setLevel(Integer num) {
            this.level = num;
        }

        public void setNeed_sorce(Long l10) {
            this.need_sorce = l10;
        }

        public void setPercent(Float f10) {
            this.percent = f10;
        }

        public String toString() {
            return "AuthorLevelBean.NextLevel(need_sorce=" + getNeed_sorce() + ", percent=" + getPercent() + ", level=" + getLevel() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof AuthorLevelBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthorLevelBean)) {
            return false;
        }
        AuthorLevelBean authorLevelBean = (AuthorLevelBean) obj;
        if (!authorLevelBean.canEqual(this)) {
            return false;
        }
        Integer rank = getRank();
        Integer rank2 = authorLevelBean.getRank();
        if (rank != null ? !rank.equals(rank2) : rank2 != null) {
            return false;
        }
        Long ticket = getTicket();
        Long ticket2 = authorLevelBean.getTicket();
        if (ticket != null ? !ticket.equals(ticket2) : ticket2 != null) {
            return false;
        }
        Integer level = getLevel();
        Integer level2 = authorLevelBean.getLevel();
        if (level != null ? !level.equals(level2) : level2 != null) {
            return false;
        }
        NextLevel next_level = getNext_level();
        NextLevel next_level2 = authorLevelBean.getNext_level();
        if (next_level != null ? !next_level.equals(next_level2) : next_level2 != null) {
            return false;
        }
        List<LevelInfoList> list = getList();
        List<LevelInfoList> list2 = authorLevelBean.getList();
        return list != null ? list.equals(list2) : list2 == null;
    }

    public Integer getLevel() {
        return this.level;
    }

    public List<LevelInfoList> getList() {
        return this.list;
    }

    public NextLevel getNext_level() {
        return this.next_level;
    }

    public Integer getRank() {
        return this.rank;
    }

    public Long getTicket() {
        return this.ticket;
    }

    public int hashCode() {
        Integer rank = getRank();
        int iHashCode = rank == null ? 43 : rank.hashCode();
        Long ticket = getTicket();
        int iHashCode2 = ((iHashCode + 59) * 59) + (ticket == null ? 43 : ticket.hashCode());
        Integer level = getLevel();
        int iHashCode3 = (iHashCode2 * 59) + (level == null ? 43 : level.hashCode());
        NextLevel next_level = getNext_level();
        int iHashCode4 = (iHashCode3 * 59) + (next_level == null ? 43 : next_level.hashCode());
        List<LevelInfoList> list = getList();
        return (iHashCode4 * 59) + (list != null ? list.hashCode() : 43);
    }

    public void setLevel(Integer num) {
        this.level = num;
    }

    public void setList(List<LevelInfoList> list) {
        this.list = list;
    }

    public void setNext_level(NextLevel nextLevel) {
        this.next_level = nextLevel;
    }

    public void setRank(Integer num) {
        this.rank = num;
    }

    public void setTicket(Long l10) {
        this.ticket = l10;
    }

    public String toString() {
        return "AuthorLevelBean(rank=" + getRank() + ", ticket=" + getTicket() + ", level=" + getLevel() + ", next_level=" + getNext_level() + ", list=" + getList() + ")";
    }
}
