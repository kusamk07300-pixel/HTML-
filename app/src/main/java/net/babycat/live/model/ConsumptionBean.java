package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ConsumptionBean {

    @SerializedName("consumption")
    Long consumption;

    @SerializedName("level")
    Integer level;

    @SerializedName("list")
    List<LevelInfoList> list;

    @SerializedName("next_level")
    NextLevel next_level;

    @SerializedName("rank")
    Integer rank;

    public class LevelInfoList {

        @SerializedName("level_up")
        Long level_up;

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
            Long level_up = getLevel_up();
            Long level_up2 = levelInfoList.getLevel_up();
            return level_up != null ? level_up.equals(level_up2) : level_up2 == null;
        }

        public Long getLevel_up() {
            return this.level_up;
        }

        public Integer getLevelid() {
            return this.levelid;
        }

        public int hashCode() {
            Integer levelid = getLevelid();
            int iHashCode = levelid == null ? 43 : levelid.hashCode();
            Long level_up = getLevel_up();
            return ((iHashCode + 59) * 59) + (level_up != null ? level_up.hashCode() : 43);
        }

        public void setLevel_up(Long l10) {
            this.level_up = l10;
        }

        public void setLevelid(Integer num) {
            this.levelid = num;
        }

        public String toString() {
            return "ConsumptionBean.LevelInfoList(levelid=" + getLevelid() + ", level_up=" + getLevel_up() + ")";
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
            return "ConsumptionBean.NextLevel(need_sorce=" + getNeed_sorce() + ", percent=" + getPercent() + ", level=" + getLevel() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof ConsumptionBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConsumptionBean)) {
            return false;
        }
        ConsumptionBean consumptionBean = (ConsumptionBean) obj;
        if (!consumptionBean.canEqual(this)) {
            return false;
        }
        Integer level = getLevel();
        Integer level2 = consumptionBean.getLevel();
        if (level != null ? !level.equals(level2) : level2 != null) {
            return false;
        }
        Integer rank = getRank();
        Integer rank2 = consumptionBean.getRank();
        if (rank != null ? !rank.equals(rank2) : rank2 != null) {
            return false;
        }
        Long consumption = getConsumption();
        Long consumption2 = consumptionBean.getConsumption();
        if (consumption != null ? !consumption.equals(consumption2) : consumption2 != null) {
            return false;
        }
        NextLevel next_level = getNext_level();
        NextLevel next_level2 = consumptionBean.getNext_level();
        if (next_level != null ? !next_level.equals(next_level2) : next_level2 != null) {
            return false;
        }
        List<LevelInfoList> list = getList();
        List<LevelInfoList> list2 = consumptionBean.getList();
        return list != null ? list.equals(list2) : list2 == null;
    }

    public Long getConsumption() {
        return this.consumption;
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

    public int hashCode() {
        Integer level = getLevel();
        int iHashCode = level == null ? 43 : level.hashCode();
        Integer rank = getRank();
        int iHashCode2 = ((iHashCode + 59) * 59) + (rank == null ? 43 : rank.hashCode());
        Long consumption = getConsumption();
        int iHashCode3 = (iHashCode2 * 59) + (consumption == null ? 43 : consumption.hashCode());
        NextLevel next_level = getNext_level();
        int iHashCode4 = (iHashCode3 * 59) + (next_level == null ? 43 : next_level.hashCode());
        List<LevelInfoList> list = getList();
        return (iHashCode4 * 59) + (list != null ? list.hashCode() : 43);
    }

    public void setConsumption(Long l10) {
        this.consumption = l10;
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

    public String toString() {
        return "ConsumptionBean(level=" + getLevel() + ", rank=" + getRank() + ", consumption=" + getConsumption() + ", next_level=" + getNext_level() + ", list=" + getList() + ")";
    }
}
