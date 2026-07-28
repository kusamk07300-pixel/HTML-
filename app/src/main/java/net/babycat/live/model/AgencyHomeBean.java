package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class AgencyHomeBean {

    @SerializedName("activeRate")
    Integer activeRate;

    @SerializedName("agencyInfo")
    AgencyInfoDTO agencyInfo;

    @SerializedName("newAnchor")
    Integer newAnchor;

    @SerializedName("ownSchedule")
    OwnScheduleDTO ownSchedule;

    @SerializedName("salaryDocUrl")
    private String salaryDocUrl;

    @SerializedName("totalAnchor")
    Integer totalAnchor;

    public class AgencyInfoDTO {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        Integer f34796id;

        @SerializedName("level")
        String level;

        @SerializedName("name")
        String name;

        public AgencyInfoDTO() {
        }

        public boolean canEqual(Object obj) {
            return obj instanceof AgencyInfoDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AgencyInfoDTO)) {
                return false;
            }
            AgencyInfoDTO agencyInfoDTO = (AgencyInfoDTO) obj;
            if (!agencyInfoDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = agencyInfoDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            String name = getName();
            String name2 = agencyInfoDTO.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String level = getLevel();
            String level2 = agencyInfoDTO.getLevel();
            return level != null ? level.equals(level2) : level2 == null;
        }

        public Integer getId() {
            return this.f34796id;
        }

        public String getLevel() {
            return this.level;
        }

        public String getName() {
            return this.name;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            String name = getName();
            int iHashCode2 = ((iHashCode + 59) * 59) + (name == null ? 43 : name.hashCode());
            String level = getLevel();
            return (iHashCode2 * 59) + (level != null ? level.hashCode() : 43);
        }

        public void setId(Integer num) {
            this.f34796id = num;
        }

        public void setLevel(String str) {
            this.level = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public String toString() {
            return "AgencyHomeBean.AgencyInfoDTO(id=" + getId() + ", name=" + getName() + ", level=" + getLevel() + ")";
        }
    }

    public class OwnScheduleDTO {

        @SerializedName("current_diamond")
        Integer currentDiamond;

        @SerializedName("current_level")
        Integer currentLevel;

        @SerializedName("next_level")
        Integer nextLevel;

        @SerializedName("rate")
        Integer rate;

        @SerializedName("target_diamond")
        Integer targetDiamond;

        @SerializedName("total_diamond")
        Integer totalDiamond;

        public OwnScheduleDTO() {
        }

        public boolean canEqual(Object obj) {
            return obj instanceof OwnScheduleDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OwnScheduleDTO)) {
                return false;
            }
            OwnScheduleDTO ownScheduleDTO = (OwnScheduleDTO) obj;
            if (!ownScheduleDTO.canEqual(this)) {
                return false;
            }
            Integer currentLevel = getCurrentLevel();
            Integer currentLevel2 = ownScheduleDTO.getCurrentLevel();
            if (currentLevel != null ? !currentLevel.equals(currentLevel2) : currentLevel2 != null) {
                return false;
            }
            Integer nextLevel = getNextLevel();
            Integer nextLevel2 = ownScheduleDTO.getNextLevel();
            if (nextLevel != null ? !nextLevel.equals(nextLevel2) : nextLevel2 != null) {
                return false;
            }
            Integer targetDiamond = getTargetDiamond();
            Integer targetDiamond2 = ownScheduleDTO.getTargetDiamond();
            if (targetDiamond != null ? !targetDiamond.equals(targetDiamond2) : targetDiamond2 != null) {
                return false;
            }
            Integer totalDiamond = getTotalDiamond();
            Integer totalDiamond2 = ownScheduleDTO.getTotalDiamond();
            if (totalDiamond != null ? !totalDiamond.equals(totalDiamond2) : totalDiamond2 != null) {
                return false;
            }
            Integer currentDiamond = getCurrentDiamond();
            Integer currentDiamond2 = ownScheduleDTO.getCurrentDiamond();
            if (currentDiamond != null ? !currentDiamond.equals(currentDiamond2) : currentDiamond2 != null) {
                return false;
            }
            Integer rate = getRate();
            Integer rate2 = ownScheduleDTO.getRate();
            return rate != null ? rate.equals(rate2) : rate2 == null;
        }

        public Integer getCurrentDiamond() {
            return this.currentDiamond;
        }

        public Integer getCurrentLevel() {
            return this.currentLevel;
        }

        public Integer getNextLevel() {
            return this.nextLevel;
        }

        public Integer getRate() {
            return this.rate;
        }

        public Integer getTargetDiamond() {
            return this.targetDiamond;
        }

        public Integer getTotalDiamond() {
            return this.totalDiamond;
        }

        public int hashCode() {
            Integer currentLevel = getCurrentLevel();
            int iHashCode = currentLevel == null ? 43 : currentLevel.hashCode();
            Integer nextLevel = getNextLevel();
            int iHashCode2 = ((iHashCode + 59) * 59) + (nextLevel == null ? 43 : nextLevel.hashCode());
            Integer targetDiamond = getTargetDiamond();
            int iHashCode3 = (iHashCode2 * 59) + (targetDiamond == null ? 43 : targetDiamond.hashCode());
            Integer totalDiamond = getTotalDiamond();
            int iHashCode4 = (iHashCode3 * 59) + (totalDiamond == null ? 43 : totalDiamond.hashCode());
            Integer currentDiamond = getCurrentDiamond();
            int iHashCode5 = (iHashCode4 * 59) + (currentDiamond == null ? 43 : currentDiamond.hashCode());
            Integer rate = getRate();
            return (iHashCode5 * 59) + (rate != null ? rate.hashCode() : 43);
        }

        public void setCurrentDiamond(Integer num) {
            this.currentDiamond = num;
        }

        public void setCurrentLevel(Integer num) {
            this.currentLevel = num;
        }

        public void setNextLevel(Integer num) {
            this.nextLevel = num;
        }

        public void setRate(Integer num) {
            this.rate = num;
        }

        public void setTargetDiamond(Integer num) {
            this.targetDiamond = num;
        }

        public void setTotalDiamond(Integer num) {
            this.totalDiamond = num;
        }

        public String toString() {
            return "AgencyHomeBean.OwnScheduleDTO(currentLevel=" + getCurrentLevel() + ", nextLevel=" + getNextLevel() + ", targetDiamond=" + getTargetDiamond() + ", totalDiamond=" + getTotalDiamond() + ", currentDiamond=" + getCurrentDiamond() + ", rate=" + getRate() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof AgencyHomeBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AgencyHomeBean)) {
            return false;
        }
        AgencyHomeBean agencyHomeBean = (AgencyHomeBean) obj;
        if (!agencyHomeBean.canEqual(this)) {
            return false;
        }
        Integer totalAnchor = getTotalAnchor();
        Integer totalAnchor2 = agencyHomeBean.getTotalAnchor();
        if (totalAnchor != null ? !totalAnchor.equals(totalAnchor2) : totalAnchor2 != null) {
            return false;
        }
        Integer newAnchor = getNewAnchor();
        Integer newAnchor2 = agencyHomeBean.getNewAnchor();
        if (newAnchor != null ? !newAnchor.equals(newAnchor2) : newAnchor2 != null) {
            return false;
        }
        Integer activeRate = getActiveRate();
        Integer activeRate2 = agencyHomeBean.getActiveRate();
        if (activeRate != null ? !activeRate.equals(activeRate2) : activeRate2 != null) {
            return false;
        }
        AgencyInfoDTO agencyInfo = getAgencyInfo();
        AgencyInfoDTO agencyInfo2 = agencyHomeBean.getAgencyInfo();
        if (agencyInfo != null ? !agencyInfo.equals(agencyInfo2) : agencyInfo2 != null) {
            return false;
        }
        OwnScheduleDTO ownSchedule = getOwnSchedule();
        OwnScheduleDTO ownSchedule2 = agencyHomeBean.getOwnSchedule();
        if (ownSchedule != null ? !ownSchedule.equals(ownSchedule2) : ownSchedule2 != null) {
            return false;
        }
        String salaryDocUrl = getSalaryDocUrl();
        String salaryDocUrl2 = agencyHomeBean.getSalaryDocUrl();
        return salaryDocUrl != null ? salaryDocUrl.equals(salaryDocUrl2) : salaryDocUrl2 == null;
    }

    public Integer getActiveRate() {
        return this.activeRate;
    }

    public AgencyInfoDTO getAgencyInfo() {
        return this.agencyInfo;
    }

    public Integer getNewAnchor() {
        return this.newAnchor;
    }

    public OwnScheduleDTO getOwnSchedule() {
        return this.ownSchedule;
    }

    public String getSalaryDocUrl() {
        return this.salaryDocUrl;
    }

    public Integer getTotalAnchor() {
        return this.totalAnchor;
    }

    public int hashCode() {
        Integer totalAnchor = getTotalAnchor();
        int iHashCode = totalAnchor == null ? 43 : totalAnchor.hashCode();
        Integer newAnchor = getNewAnchor();
        int iHashCode2 = ((iHashCode + 59) * 59) + (newAnchor == null ? 43 : newAnchor.hashCode());
        Integer activeRate = getActiveRate();
        int iHashCode3 = (iHashCode2 * 59) + (activeRate == null ? 43 : activeRate.hashCode());
        AgencyInfoDTO agencyInfo = getAgencyInfo();
        int iHashCode4 = (iHashCode3 * 59) + (agencyInfo == null ? 43 : agencyInfo.hashCode());
        OwnScheduleDTO ownSchedule = getOwnSchedule();
        int iHashCode5 = (iHashCode4 * 59) + (ownSchedule == null ? 43 : ownSchedule.hashCode());
        String salaryDocUrl = getSalaryDocUrl();
        return (iHashCode5 * 59) + (salaryDocUrl != null ? salaryDocUrl.hashCode() : 43);
    }

    public void setActiveRate(Integer num) {
        this.activeRate = num;
    }

    public void setAgencyInfo(AgencyInfoDTO agencyInfoDTO) {
        this.agencyInfo = agencyInfoDTO;
    }

    public void setNewAnchor(Integer num) {
        this.newAnchor = num;
    }

    public void setOwnSchedule(OwnScheduleDTO ownScheduleDTO) {
        this.ownSchedule = ownScheduleDTO;
    }

    public void setSalaryDocUrl(String str) {
        this.salaryDocUrl = str;
    }

    public void setTotalAnchor(Integer num) {
        this.totalAnchor = num;
    }

    public String toString() {
        return "AgencyHomeBean(agencyInfo=" + getAgencyInfo() + ", totalAnchor=" + getTotalAnchor() + ", newAnchor=" + getNewAnchor() + ", activeRate=" + getActiveRate() + ", ownSchedule=" + getOwnSchedule() + ", salaryDocUrl=" + getSalaryDocUrl() + ")";
    }
}
