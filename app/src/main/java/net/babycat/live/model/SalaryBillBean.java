package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.io.Serializable;
import java.util.List;
import net.babycat.live.platform.util.x0;

/* JADX INFO: loaded from: classes4.dex */
public class SalaryBillBean implements Serializable {

    @SerializedName("anchor_salary_deduct_list")
    List<deductListDTO> deductList;

    @SerializedName("salary_base_income")
    String salaryBaseIncome;

    @SerializedName("salary_base_income_level")
    String salaryBaseIncomeLevel;

    @SerializedName("salary_base_income_level_next")
    String salaryBaseIncomeLevelNext;

    @SerializedName("salary_base_income_next")
    String salaryBaseIncomeNext;

    @SerializedName("salary_balance_income")
    String salary_balance_income;

    @SerializedName("salary_balance_income_level")
    String salary_balance_income_level;

    @SerializedName("salary_balance_income_level_next")
    String salary_balance_income_level_next;

    @SerializedName("salary_balance_income_next")
    String salary_balance_income_next;

    @SerializedName("special_salary_desc")
    String specialSalaryDesc;

    @SerializedName("total_salary")
    String totalSalary = x0.IMAGE_1;

    @SerializedName("base_salary")
    String baseSalary = x0.IMAGE_1;

    @SerializedName("deduct_salary")
    String deductSalary = x0.IMAGE_1;

    @SerializedName("special_salary")
    String specialSalary = x0.IMAGE_1;

    @SerializedName("live_days")
    String liveDays = x0.IMAGE_1;

    @SerializedName("anchor_monthtask_days")
    String anchorMonthtaskDays = x0.IMAGE_1;

    @SerializedName("live_minutes")
    String liveMinutes = x0.IMAGE_1;

    @SerializedName("anchor_monthtask_mins")
    String anchorMmonthtaskMins = x0.IMAGE_1;

    @SerializedName("live_game_minutes")
    String liveGameMinutes = x0.IMAGE_1;

    @SerializedName("game_monthtask_mins")
    String gameMonthtaskMins = x0.IMAGE_1;

    @SerializedName("anchor_monthtask_days_target")
    Integer anchorDaysTarget = 0;

    @SerializedName("anchor_monthtask_mins_target")
    Integer anchorMinsTarget = 0;

    @SerializedName("game_monthtask_mins_target")
    Integer gameMinsTarget = 0;

    @SerializedName("income_diamonds")
    String income_diamonds = x0.IMAGE_1;

    @SerializedName("balance_diamonds")
    String balance_diamonds = x0.IMAGE_1;

    public static class deductListDTO implements Serializable {

        @SerializedName("days")
        Integer days;

        @SerializedName("deduct_var")
        String deductVar;

        @SerializedName("game_time_mins")
        Integer gameTimeMins;

        @SerializedName(o0.CATEGORY_STATUS)
        Integer status;

        @SerializedName("time_mins")
        Integer timeMins;

        public boolean canEqual(Object obj) {
            return obj instanceof deductListDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof deductListDTO)) {
                return false;
            }
            deductListDTO deductlistdto = (deductListDTO) obj;
            if (!deductlistdto.canEqual(this)) {
                return false;
            }
            Integer days = getDays();
            Integer days2 = deductlistdto.getDays();
            if (days != null ? !days.equals(days2) : days2 != null) {
                return false;
            }
            Integer timeMins = getTimeMins();
            Integer timeMins2 = deductlistdto.getTimeMins();
            if (timeMins != null ? !timeMins.equals(timeMins2) : timeMins2 != null) {
                return false;
            }
            Integer gameTimeMins = getGameTimeMins();
            Integer gameTimeMins2 = deductlistdto.getGameTimeMins();
            if (gameTimeMins != null ? !gameTimeMins.equals(gameTimeMins2) : gameTimeMins2 != null) {
                return false;
            }
            Integer status = getStatus();
            Integer status2 = deductlistdto.getStatus();
            if (status != null ? !status.equals(status2) : status2 != null) {
                return false;
            }
            String deductVar = getDeductVar();
            String deductVar2 = deductlistdto.getDeductVar();
            return deductVar != null ? deductVar.equals(deductVar2) : deductVar2 == null;
        }

        public Integer getDays() {
            return this.days;
        }

        public String getDeductVar() {
            return this.deductVar;
        }

        public Integer getGameTimeMins() {
            return this.gameTimeMins;
        }

        public Integer getStatus() {
            return this.status;
        }

        public Integer getTimeMins() {
            return this.timeMins;
        }

        public int hashCode() {
            Integer days = getDays();
            int iHashCode = days == null ? 43 : days.hashCode();
            Integer timeMins = getTimeMins();
            int iHashCode2 = ((iHashCode + 59) * 59) + (timeMins == null ? 43 : timeMins.hashCode());
            Integer gameTimeMins = getGameTimeMins();
            int iHashCode3 = (iHashCode2 * 59) + (gameTimeMins == null ? 43 : gameTimeMins.hashCode());
            Integer status = getStatus();
            int iHashCode4 = (iHashCode3 * 59) + (status == null ? 43 : status.hashCode());
            String deductVar = getDeductVar();
            return (iHashCode4 * 59) + (deductVar != null ? deductVar.hashCode() : 43);
        }

        public void setDays(Integer num) {
            this.days = num;
        }

        public void setDeductVar(String str) {
            this.deductVar = str;
        }

        public void setGameTimeMins(Integer num) {
            this.gameTimeMins = num;
        }

        public void setStatus(Integer num) {
            this.status = num;
        }

        public void setTimeMins(Integer num) {
            this.timeMins = num;
        }

        public String toString() {
            return "SalaryBillBean.deductListDTO(days=" + getDays() + ", timeMins=" + getTimeMins() + ", gameTimeMins=" + getGameTimeMins() + ", status=" + getStatus() + ", deductVar=" + getDeductVar() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof SalaryBillBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SalaryBillBean)) {
            return false;
        }
        SalaryBillBean salaryBillBean = (SalaryBillBean) obj;
        if (!salaryBillBean.canEqual(this)) {
            return false;
        }
        Integer anchorDaysTarget = getAnchorDaysTarget();
        Integer anchorDaysTarget2 = salaryBillBean.getAnchorDaysTarget();
        if (anchorDaysTarget != null ? !anchorDaysTarget.equals(anchorDaysTarget2) : anchorDaysTarget2 != null) {
            return false;
        }
        Integer anchorMinsTarget = getAnchorMinsTarget();
        Integer anchorMinsTarget2 = salaryBillBean.getAnchorMinsTarget();
        if (anchorMinsTarget != null ? !anchorMinsTarget.equals(anchorMinsTarget2) : anchorMinsTarget2 != null) {
            return false;
        }
        Integer gameMinsTarget = getGameMinsTarget();
        Integer gameMinsTarget2 = salaryBillBean.getGameMinsTarget();
        if (gameMinsTarget != null ? !gameMinsTarget.equals(gameMinsTarget2) : gameMinsTarget2 != null) {
            return false;
        }
        String totalSalary = getTotalSalary();
        String totalSalary2 = salaryBillBean.getTotalSalary();
        if (totalSalary != null ? !totalSalary.equals(totalSalary2) : totalSalary2 != null) {
            return false;
        }
        String baseSalary = getBaseSalary();
        String baseSalary2 = salaryBillBean.getBaseSalary();
        if (baseSalary != null ? !baseSalary.equals(baseSalary2) : baseSalary2 != null) {
            return false;
        }
        String deductSalary = getDeductSalary();
        String deductSalary2 = salaryBillBean.getDeductSalary();
        if (deductSalary != null ? !deductSalary.equals(deductSalary2) : deductSalary2 != null) {
            return false;
        }
        String specialSalary = getSpecialSalary();
        String specialSalary2 = salaryBillBean.getSpecialSalary();
        if (specialSalary != null ? !specialSalary.equals(specialSalary2) : specialSalary2 != null) {
            return false;
        }
        String liveDays = getLiveDays();
        String liveDays2 = salaryBillBean.getLiveDays();
        if (liveDays != null ? !liveDays.equals(liveDays2) : liveDays2 != null) {
            return false;
        }
        String anchorMonthtaskDays = getAnchorMonthtaskDays();
        String anchorMonthtaskDays2 = salaryBillBean.getAnchorMonthtaskDays();
        if (anchorMonthtaskDays != null ? !anchorMonthtaskDays.equals(anchorMonthtaskDays2) : anchorMonthtaskDays2 != null) {
            return false;
        }
        String liveMinutes = getLiveMinutes();
        String liveMinutes2 = salaryBillBean.getLiveMinutes();
        if (liveMinutes != null ? !liveMinutes.equals(liveMinutes2) : liveMinutes2 != null) {
            return false;
        }
        String anchorMmonthtaskMins = getAnchorMmonthtaskMins();
        String anchorMmonthtaskMins2 = salaryBillBean.getAnchorMmonthtaskMins();
        if (anchorMmonthtaskMins != null ? !anchorMmonthtaskMins.equals(anchorMmonthtaskMins2) : anchorMmonthtaskMins2 != null) {
            return false;
        }
        String liveGameMinutes = getLiveGameMinutes();
        String liveGameMinutes2 = salaryBillBean.getLiveGameMinutes();
        if (liveGameMinutes != null ? !liveGameMinutes.equals(liveGameMinutes2) : liveGameMinutes2 != null) {
            return false;
        }
        String gameMonthtaskMins = getGameMonthtaskMins();
        String gameMonthtaskMins2 = salaryBillBean.getGameMonthtaskMins();
        if (gameMonthtaskMins != null ? !gameMonthtaskMins.equals(gameMonthtaskMins2) : gameMonthtaskMins2 != null) {
            return false;
        }
        String income_diamonds = getIncome_diamonds();
        String income_diamonds2 = salaryBillBean.getIncome_diamonds();
        if (income_diamonds != null ? !income_diamonds.equals(income_diamonds2) : income_diamonds2 != null) {
            return false;
        }
        String salaryBaseIncome = getSalaryBaseIncome();
        String salaryBaseIncome2 = salaryBillBean.getSalaryBaseIncome();
        if (salaryBaseIncome != null ? !salaryBaseIncome.equals(salaryBaseIncome2) : salaryBaseIncome2 != null) {
            return false;
        }
        String salaryBaseIncomeLevel = getSalaryBaseIncomeLevel();
        String salaryBaseIncomeLevel2 = salaryBillBean.getSalaryBaseIncomeLevel();
        if (salaryBaseIncomeLevel != null ? !salaryBaseIncomeLevel.equals(salaryBaseIncomeLevel2) : salaryBaseIncomeLevel2 != null) {
            return false;
        }
        String salaryBaseIncomeNext = getSalaryBaseIncomeNext();
        String salaryBaseIncomeNext2 = salaryBillBean.getSalaryBaseIncomeNext();
        if (salaryBaseIncomeNext != null ? !salaryBaseIncomeNext.equals(salaryBaseIncomeNext2) : salaryBaseIncomeNext2 != null) {
            return false;
        }
        String salaryBaseIncomeLevelNext = getSalaryBaseIncomeLevelNext();
        String salaryBaseIncomeLevelNext2 = salaryBillBean.getSalaryBaseIncomeLevelNext();
        if (salaryBaseIncomeLevelNext != null ? !salaryBaseIncomeLevelNext.equals(salaryBaseIncomeLevelNext2) : salaryBaseIncomeLevelNext2 != null) {
            return false;
        }
        String salary_balance_income = getSalary_balance_income();
        String salary_balance_income2 = salaryBillBean.getSalary_balance_income();
        if (salary_balance_income != null ? !salary_balance_income.equals(salary_balance_income2) : salary_balance_income2 != null) {
            return false;
        }
        String salary_balance_income_level = getSalary_balance_income_level();
        String salary_balance_income_level2 = salaryBillBean.getSalary_balance_income_level();
        if (salary_balance_income_level != null ? !salary_balance_income_level.equals(salary_balance_income_level2) : salary_balance_income_level2 != null) {
            return false;
        }
        String salary_balance_income_next = getSalary_balance_income_next();
        String salary_balance_income_next2 = salaryBillBean.getSalary_balance_income_next();
        if (salary_balance_income_next != null ? !salary_balance_income_next.equals(salary_balance_income_next2) : salary_balance_income_next2 != null) {
            return false;
        }
        String salary_balance_income_level_next = getSalary_balance_income_level_next();
        String salary_balance_income_level_next2 = salaryBillBean.getSalary_balance_income_level_next();
        if (salary_balance_income_level_next != null ? !salary_balance_income_level_next.equals(salary_balance_income_level_next2) : salary_balance_income_level_next2 != null) {
            return false;
        }
        String balance_diamonds = getBalance_diamonds();
        String balance_diamonds2 = salaryBillBean.getBalance_diamonds();
        if (balance_diamonds != null ? !balance_diamonds.equals(balance_diamonds2) : balance_diamonds2 != null) {
            return false;
        }
        List<deductListDTO> deductList = getDeductList();
        List<deductListDTO> deductList2 = salaryBillBean.getDeductList();
        if (deductList != null ? !deductList.equals(deductList2) : deductList2 != null) {
            return false;
        }
        String specialSalaryDesc = getSpecialSalaryDesc();
        String specialSalaryDesc2 = salaryBillBean.getSpecialSalaryDesc();
        return specialSalaryDesc != null ? specialSalaryDesc.equals(specialSalaryDesc2) : specialSalaryDesc2 == null;
    }

    public Integer getAnchorDaysTarget() {
        return this.anchorDaysTarget;
    }

    public Integer getAnchorMinsTarget() {
        return this.anchorMinsTarget;
    }

    public String getAnchorMmonthtaskMins() {
        return this.anchorMmonthtaskMins;
    }

    public String getAnchorMonthtaskDays() {
        return this.anchorMonthtaskDays;
    }

    public String getBalance_diamonds() {
        return this.balance_diamonds;
    }

    public String getBaseSalary() {
        return this.baseSalary;
    }

    public List<deductListDTO> getDeductList() {
        return this.deductList;
    }

    public String getDeductSalary() {
        return this.deductSalary;
    }

    public Integer getGameMinsTarget() {
        return this.gameMinsTarget;
    }

    public String getGameMonthtaskMins() {
        return this.gameMonthtaskMins;
    }

    public String getIncome_diamonds() {
        return this.income_diamonds;
    }

    public String getLiveDays() {
        return this.liveDays;
    }

    public String getLiveGameMinutes() {
        return this.liveGameMinutes;
    }

    public String getLiveMinutes() {
        return this.liveMinutes;
    }

    public String getSalaryBaseIncome() {
        return this.salaryBaseIncome;
    }

    public String getSalaryBaseIncomeLevel() {
        return this.salaryBaseIncomeLevel;
    }

    public String getSalaryBaseIncomeLevelNext() {
        return this.salaryBaseIncomeLevelNext;
    }

    public String getSalaryBaseIncomeNext() {
        return this.salaryBaseIncomeNext;
    }

    public String getSalary_balance_income() {
        return this.salary_balance_income;
    }

    public String getSalary_balance_income_level() {
        return this.salary_balance_income_level;
    }

    public String getSalary_balance_income_level_next() {
        return this.salary_balance_income_level_next;
    }

    public String getSalary_balance_income_next() {
        return this.salary_balance_income_next;
    }

    public String getSpecialSalary() {
        return this.specialSalary;
    }

    public String getSpecialSalaryDesc() {
        return this.specialSalaryDesc;
    }

    public String getTotalSalary() {
        return this.totalSalary;
    }

    public int hashCode() {
        Integer anchorDaysTarget = getAnchorDaysTarget();
        int iHashCode = anchorDaysTarget == null ? 43 : anchorDaysTarget.hashCode();
        Integer anchorMinsTarget = getAnchorMinsTarget();
        int iHashCode2 = ((iHashCode + 59) * 59) + (anchorMinsTarget == null ? 43 : anchorMinsTarget.hashCode());
        Integer gameMinsTarget = getGameMinsTarget();
        int iHashCode3 = (iHashCode2 * 59) + (gameMinsTarget == null ? 43 : gameMinsTarget.hashCode());
        String totalSalary = getTotalSalary();
        int iHashCode4 = (iHashCode3 * 59) + (totalSalary == null ? 43 : totalSalary.hashCode());
        String baseSalary = getBaseSalary();
        int iHashCode5 = (iHashCode4 * 59) + (baseSalary == null ? 43 : baseSalary.hashCode());
        String deductSalary = getDeductSalary();
        int iHashCode6 = (iHashCode5 * 59) + (deductSalary == null ? 43 : deductSalary.hashCode());
        String specialSalary = getSpecialSalary();
        int iHashCode7 = (iHashCode6 * 59) + (specialSalary == null ? 43 : specialSalary.hashCode());
        String liveDays = getLiveDays();
        int iHashCode8 = (iHashCode7 * 59) + (liveDays == null ? 43 : liveDays.hashCode());
        String anchorMonthtaskDays = getAnchorMonthtaskDays();
        int iHashCode9 = (iHashCode8 * 59) + (anchorMonthtaskDays == null ? 43 : anchorMonthtaskDays.hashCode());
        String liveMinutes = getLiveMinutes();
        int iHashCode10 = (iHashCode9 * 59) + (liveMinutes == null ? 43 : liveMinutes.hashCode());
        String anchorMmonthtaskMins = getAnchorMmonthtaskMins();
        int iHashCode11 = (iHashCode10 * 59) + (anchorMmonthtaskMins == null ? 43 : anchorMmonthtaskMins.hashCode());
        String liveGameMinutes = getLiveGameMinutes();
        int iHashCode12 = (iHashCode11 * 59) + (liveGameMinutes == null ? 43 : liveGameMinutes.hashCode());
        String gameMonthtaskMins = getGameMonthtaskMins();
        int iHashCode13 = (iHashCode12 * 59) + (gameMonthtaskMins == null ? 43 : gameMonthtaskMins.hashCode());
        String income_diamonds = getIncome_diamonds();
        int iHashCode14 = (iHashCode13 * 59) + (income_diamonds == null ? 43 : income_diamonds.hashCode());
        String salaryBaseIncome = getSalaryBaseIncome();
        int iHashCode15 = (iHashCode14 * 59) + (salaryBaseIncome == null ? 43 : salaryBaseIncome.hashCode());
        String salaryBaseIncomeLevel = getSalaryBaseIncomeLevel();
        int iHashCode16 = (iHashCode15 * 59) + (salaryBaseIncomeLevel == null ? 43 : salaryBaseIncomeLevel.hashCode());
        String salaryBaseIncomeNext = getSalaryBaseIncomeNext();
        int iHashCode17 = (iHashCode16 * 59) + (salaryBaseIncomeNext == null ? 43 : salaryBaseIncomeNext.hashCode());
        String salaryBaseIncomeLevelNext = getSalaryBaseIncomeLevelNext();
        int iHashCode18 = (iHashCode17 * 59) + (salaryBaseIncomeLevelNext == null ? 43 : salaryBaseIncomeLevelNext.hashCode());
        String salary_balance_income = getSalary_balance_income();
        int iHashCode19 = (iHashCode18 * 59) + (salary_balance_income == null ? 43 : salary_balance_income.hashCode());
        String salary_balance_income_level = getSalary_balance_income_level();
        int iHashCode20 = (iHashCode19 * 59) + (salary_balance_income_level == null ? 43 : salary_balance_income_level.hashCode());
        String salary_balance_income_next = getSalary_balance_income_next();
        int iHashCode21 = (iHashCode20 * 59) + (salary_balance_income_next == null ? 43 : salary_balance_income_next.hashCode());
        String salary_balance_income_level_next = getSalary_balance_income_level_next();
        int iHashCode22 = (iHashCode21 * 59) + (salary_balance_income_level_next == null ? 43 : salary_balance_income_level_next.hashCode());
        String balance_diamonds = getBalance_diamonds();
        int iHashCode23 = (iHashCode22 * 59) + (balance_diamonds == null ? 43 : balance_diamonds.hashCode());
        List<deductListDTO> deductList = getDeductList();
        int iHashCode24 = (iHashCode23 * 59) + (deductList == null ? 43 : deductList.hashCode());
        String specialSalaryDesc = getSpecialSalaryDesc();
        return (iHashCode24 * 59) + (specialSalaryDesc != null ? specialSalaryDesc.hashCode() : 43);
    }

    public void setAnchorDaysTarget(Integer num) {
        this.anchorDaysTarget = num;
    }

    public void setAnchorMinsTarget(Integer num) {
        this.anchorMinsTarget = num;
    }

    public void setAnchorMmonthtaskMins(String str) {
        this.anchorMmonthtaskMins = str;
    }

    public void setAnchorMonthtaskDays(String str) {
        this.anchorMonthtaskDays = str;
    }

    public void setBalance_diamonds(String str) {
        this.balance_diamonds = str;
    }

    public void setBaseSalary(String str) {
        this.baseSalary = str;
    }

    public void setDeductList(List<deductListDTO> list) {
        this.deductList = list;
    }

    public void setDeductSalary(String str) {
        this.deductSalary = str;
    }

    public void setGameMinsTarget(Integer num) {
        this.gameMinsTarget = num;
    }

    public void setGameMonthtaskMins(String str) {
        this.gameMonthtaskMins = str;
    }

    public void setIncome_diamonds(String str) {
        this.income_diamonds = str;
    }

    public void setLiveDays(String str) {
        this.liveDays = str;
    }

    public void setLiveGameMinutes(String str) {
        this.liveGameMinutes = str;
    }

    public void setLiveMinutes(String str) {
        this.liveMinutes = str;
    }

    public void setSalaryBaseIncome(String str) {
        this.salaryBaseIncome = str;
    }

    public void setSalaryBaseIncomeLevel(String str) {
        this.salaryBaseIncomeLevel = str;
    }

    public void setSalaryBaseIncomeLevelNext(String str) {
        this.salaryBaseIncomeLevelNext = str;
    }

    public void setSalaryBaseIncomeNext(String str) {
        this.salaryBaseIncomeNext = str;
    }

    public void setSalary_balance_income(String str) {
        this.salary_balance_income = str;
    }

    public void setSalary_balance_income_level(String str) {
        this.salary_balance_income_level = str;
    }

    public void setSalary_balance_income_level_next(String str) {
        this.salary_balance_income_level_next = str;
    }

    public void setSalary_balance_income_next(String str) {
        this.salary_balance_income_next = str;
    }

    public void setSpecialSalary(String str) {
        this.specialSalary = str;
    }

    public void setSpecialSalaryDesc(String str) {
        this.specialSalaryDesc = str;
    }

    public void setTotalSalary(String str) {
        this.totalSalary = str;
    }

    public String toString() {
        return "SalaryBillBean(totalSalary=" + getTotalSalary() + ", baseSalary=" + getBaseSalary() + ", deductSalary=" + getDeductSalary() + ", specialSalary=" + getSpecialSalary() + ", liveDays=" + getLiveDays() + ", anchorMonthtaskDays=" + getAnchorMonthtaskDays() + ", liveMinutes=" + getLiveMinutes() + ", anchorMmonthtaskMins=" + getAnchorMmonthtaskMins() + ", liveGameMinutes=" + getLiveGameMinutes() + ", gameMonthtaskMins=" + getGameMonthtaskMins() + ", anchorDaysTarget=" + getAnchorDaysTarget() + ", anchorMinsTarget=" + getAnchorMinsTarget() + ", gameMinsTarget=" + getGameMinsTarget() + ", income_diamonds=" + getIncome_diamonds() + ", salaryBaseIncome=" + getSalaryBaseIncome() + ", salaryBaseIncomeLevel=" + getSalaryBaseIncomeLevel() + ", salaryBaseIncomeNext=" + getSalaryBaseIncomeNext() + ", salaryBaseIncomeLevelNext=" + getSalaryBaseIncomeLevelNext() + ", salary_balance_income=" + getSalary_balance_income() + ", salary_balance_income_level=" + getSalary_balance_income_level() + ", salary_balance_income_next=" + getSalary_balance_income_next() + ", salary_balance_income_level_next=" + getSalary_balance_income_level_next() + ", balance_diamonds=" + getBalance_diamonds() + ", deductList=" + getDeductList() + ", specialSalaryDesc=" + getSpecialSalaryDesc() + ")";
    }
}
