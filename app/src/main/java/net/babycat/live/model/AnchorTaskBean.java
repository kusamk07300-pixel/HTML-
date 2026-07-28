package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AnchorTaskBean {

    @SerializedName("list")
    List<TaskItemDTO> list;

    @SerializedName("self")
    TaskItemDTO self;

    public static class AnchorTagDTO {

        @SerializedName("days")
        String days;

        @SerializedName("icon")
        String icon;

        @SerializedName("name")
        String name;

        @SerializedName("pm_id")
        String pmId;

        public boolean canEqual(Object obj) {
            return obj instanceof AnchorTagDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AnchorTagDTO)) {
                return false;
            }
            AnchorTagDTO anchorTagDTO = (AnchorTagDTO) obj;
            if (!anchorTagDTO.canEqual(this)) {
                return false;
            }
            String icon = getIcon();
            String icon2 = anchorTagDTO.getIcon();
            if (icon != null ? !icon.equals(icon2) : icon2 != null) {
                return false;
            }
            String name = getName();
            String name2 = anchorTagDTO.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String days = getDays();
            String days2 = anchorTagDTO.getDays();
            if (days != null ? !days.equals(days2) : days2 != null) {
                return false;
            }
            String pmId = getPmId();
            String pmId2 = anchorTagDTO.getPmId();
            return pmId != null ? pmId.equals(pmId2) : pmId2 == null;
        }

        public String getDays() {
            return this.days;
        }

        public String getIcon() {
            return this.icon;
        }

        public String getName() {
            return this.name;
        }

        public String getPmId() {
            return this.pmId;
        }

        public int hashCode() {
            String icon = getIcon();
            int iHashCode = icon == null ? 43 : icon.hashCode();
            String name = getName();
            int iHashCode2 = ((iHashCode + 59) * 59) + (name == null ? 43 : name.hashCode());
            String days = getDays();
            int iHashCode3 = (iHashCode2 * 59) + (days == null ? 43 : days.hashCode());
            String pmId = getPmId();
            return (iHashCode3 * 59) + (pmId != null ? pmId.hashCode() : 43);
        }

        public void setDays(String str) {
            this.days = str;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPmId(String str) {
            this.pmId = str;
        }

        public String toString() {
            return "AnchorTaskBean.AnchorTagDTO(icon=" + getIcon() + ", name=" + getName() + ", days=" + getDays() + ", pmId=" + getPmId() + ")";
        }
    }

    public static class BadgeDTO {

        @SerializedName("days")
        String days;

        @SerializedName("icon")
        String icon;

        @SerializedName("name")
        String name;

        @SerializedName("pm_id")
        String pmId;

        public boolean canEqual(Object obj) {
            return obj instanceof BadgeDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BadgeDTO)) {
                return false;
            }
            BadgeDTO badgeDTO = (BadgeDTO) obj;
            if (!badgeDTO.canEqual(this)) {
                return false;
            }
            String icon = getIcon();
            String icon2 = badgeDTO.getIcon();
            if (icon != null ? !icon.equals(icon2) : icon2 != null) {
                return false;
            }
            String name = getName();
            String name2 = badgeDTO.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String days = getDays();
            String days2 = badgeDTO.getDays();
            if (days != null ? !days.equals(days2) : days2 != null) {
                return false;
            }
            String pmId = getPmId();
            String pmId2 = badgeDTO.getPmId();
            return pmId != null ? pmId.equals(pmId2) : pmId2 == null;
        }

        public String getDays() {
            return this.days;
        }

        public String getIcon() {
            return this.icon;
        }

        public String getName() {
            return this.name;
        }

        public String getPmId() {
            return this.pmId;
        }

        public int hashCode() {
            String icon = getIcon();
            int iHashCode = icon == null ? 43 : icon.hashCode();
            String name = getName();
            int iHashCode2 = ((iHashCode + 59) * 59) + (name == null ? 43 : name.hashCode());
            String days = getDays();
            int iHashCode3 = (iHashCode2 * 59) + (days == null ? 43 : days.hashCode());
            String pmId = getPmId();
            return (iHashCode3 * 59) + (pmId != null ? pmId.hashCode() : 43);
        }

        public void setDays(String str) {
            this.days = str;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPmId(String str) {
            this.pmId = str;
        }

        public String toString() {
            return "AnchorTaskBean.BadgeDTO(icon=" + getIcon() + ", name=" + getName() + ", days=" + getDays() + ", pmId=" + getPmId() + ")";
        }
    }

    public static class CarDTO {

        @SerializedName("days")
        String days;

        @SerializedName("icon")
        String icon;

        @SerializedName("name")
        String name;

        @SerializedName("pm_id")
        String pmId;

        public boolean canEqual(Object obj) {
            return obj instanceof CarDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CarDTO)) {
                return false;
            }
            CarDTO carDTO = (CarDTO) obj;
            if (!carDTO.canEqual(this)) {
                return false;
            }
            String icon = getIcon();
            String icon2 = carDTO.getIcon();
            if (icon != null ? !icon.equals(icon2) : icon2 != null) {
                return false;
            }
            String name = getName();
            String name2 = carDTO.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String days = getDays();
            String days2 = carDTO.getDays();
            if (days != null ? !days.equals(days2) : days2 != null) {
                return false;
            }
            String pmId = getPmId();
            String pmId2 = carDTO.getPmId();
            return pmId != null ? pmId.equals(pmId2) : pmId2 == null;
        }

        public String getDays() {
            return this.days;
        }

        public String getIcon() {
            return this.icon;
        }

        public String getName() {
            return this.name;
        }

        public String getPmId() {
            return this.pmId;
        }

        public int hashCode() {
            String icon = getIcon();
            int iHashCode = icon == null ? 43 : icon.hashCode();
            String name = getName();
            int iHashCode2 = ((iHashCode + 59) * 59) + (name == null ? 43 : name.hashCode());
            String days = getDays();
            int iHashCode3 = (iHashCode2 * 59) + (days == null ? 43 : days.hashCode());
            String pmId = getPmId();
            return (iHashCode3 * 59) + (pmId != null ? pmId.hashCode() : 43);
        }

        public void setDays(String str) {
            this.days = str;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPmId(String str) {
            this.pmId = str;
        }

        public String toString() {
            return "AnchorTaskBean.CarDTO(icon=" + getIcon() + ", name=" + getName() + ", days=" + getDays() + ", pmId=" + getPmId() + ")";
        }
    }

    public static class EnterBarDTO {

        @SerializedName("days")
        String days;

        @SerializedName("icon")
        String icon;

        @SerializedName("name")
        String name;

        @SerializedName("pm_id")
        String pmId;

        public boolean canEqual(Object obj) {
            return obj instanceof EnterBarDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnterBarDTO)) {
                return false;
            }
            EnterBarDTO enterBarDTO = (EnterBarDTO) obj;
            if (!enterBarDTO.canEqual(this)) {
                return false;
            }
            String icon = getIcon();
            String icon2 = enterBarDTO.getIcon();
            if (icon != null ? !icon.equals(icon2) : icon2 != null) {
                return false;
            }
            String name = getName();
            String name2 = enterBarDTO.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String days = getDays();
            String days2 = enterBarDTO.getDays();
            if (days != null ? !days.equals(days2) : days2 != null) {
                return false;
            }
            String pmId = getPmId();
            String pmId2 = enterBarDTO.getPmId();
            return pmId != null ? pmId.equals(pmId2) : pmId2 == null;
        }

        public String getDays() {
            return this.days;
        }

        public String getIcon() {
            return this.icon;
        }

        public String getName() {
            return this.name;
        }

        public String getPmId() {
            return this.pmId;
        }

        public int hashCode() {
            String icon = getIcon();
            int iHashCode = icon == null ? 43 : icon.hashCode();
            String name = getName();
            int iHashCode2 = ((iHashCode + 59) * 59) + (name == null ? 43 : name.hashCode());
            String days = getDays();
            int iHashCode3 = (iHashCode2 * 59) + (days == null ? 43 : days.hashCode());
            String pmId = getPmId();
            return (iHashCode3 * 59) + (pmId != null ? pmId.hashCode() : 43);
        }

        public void setDays(String str) {
            this.days = str;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPmId(String str) {
            this.pmId = str;
        }

        public String toString() {
            return "AnchorTaskBean.EnterBarDTO(icon=" + getIcon() + ", name=" + getName() + ", days=" + getDays() + ", pmId=" + getPmId() + ")";
        }
    }

    public static class TaskItemDTO {

        @SerializedName("rank")
        String rank;

        @SerializedName("reward")
        TaskRewardDTO reward;

        @SerializedName("total_up")
        String totalUp;

        @SerializedName("user")
        UserProfile user;

        public boolean canEqual(Object obj) {
            return obj instanceof TaskItemDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TaskItemDTO)) {
                return false;
            }
            TaskItemDTO taskItemDTO = (TaskItemDTO) obj;
            if (!taskItemDTO.canEqual(this)) {
                return false;
            }
            String rank = getRank();
            String rank2 = taskItemDTO.getRank();
            if (rank != null ? !rank.equals(rank2) : rank2 != null) {
                return false;
            }
            String totalUp = getTotalUp();
            String totalUp2 = taskItemDTO.getTotalUp();
            if (totalUp != null ? !totalUp.equals(totalUp2) : totalUp2 != null) {
                return false;
            }
            TaskRewardDTO reward = getReward();
            TaskRewardDTO reward2 = taskItemDTO.getReward();
            if (reward != null ? !reward.equals(reward2) : reward2 != null) {
                return false;
            }
            UserProfile user = getUser();
            UserProfile user2 = taskItemDTO.getUser();
            return user != null ? user.equals(user2) : user2 == null;
        }

        public String getRank() {
            return this.rank;
        }

        public TaskRewardDTO getReward() {
            return this.reward;
        }

        public String getTotalUp() {
            return this.totalUp;
        }

        public UserProfile getUser() {
            return this.user;
        }

        public int hashCode() {
            String rank = getRank();
            int iHashCode = rank == null ? 43 : rank.hashCode();
            String totalUp = getTotalUp();
            int iHashCode2 = ((iHashCode + 59) * 59) + (totalUp == null ? 43 : totalUp.hashCode());
            TaskRewardDTO reward = getReward();
            int iHashCode3 = (iHashCode2 * 59) + (reward == null ? 43 : reward.hashCode());
            UserProfile user = getUser();
            return (iHashCode3 * 59) + (user != null ? user.hashCode() : 43);
        }

        public void setRank(String str) {
            this.rank = str;
        }

        public void setReward(TaskRewardDTO taskRewardDTO) {
            this.reward = taskRewardDTO;
        }

        public void setTotalUp(String str) {
            this.totalUp = str;
        }

        public void setUser(UserProfile userProfile) {
            this.user = userProfile;
        }

        public String toString() {
            return "AnchorTaskBean.TaskItemDTO(rank=" + getRank() + ", totalUp=" + getTotalUp() + ", reward=" + getReward() + ", user=" + getUser() + ")";
        }
    }

    public static class TaskRewardDTO {

        @SerializedName("anchor_tag")
        AnchorTagDTO anchorTag;

        @SerializedName("badge")
        BadgeDTO badge;

        @SerializedName("car")
        CarDTO car;

        @SerializedName("enter_bar")
        EnterBarDTO enterBar;

        public boolean canEqual(Object obj) {
            return obj instanceof TaskRewardDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TaskRewardDTO)) {
                return false;
            }
            TaskRewardDTO taskRewardDTO = (TaskRewardDTO) obj;
            if (!taskRewardDTO.canEqual(this)) {
                return false;
            }
            CarDTO car = getCar();
            CarDTO car2 = taskRewardDTO.getCar();
            if (car != null ? !car.equals(car2) : car2 != null) {
                return false;
            }
            BadgeDTO badge = getBadge();
            BadgeDTO badge2 = taskRewardDTO.getBadge();
            if (badge != null ? !badge.equals(badge2) : badge2 != null) {
                return false;
            }
            EnterBarDTO enterBar = getEnterBar();
            EnterBarDTO enterBar2 = taskRewardDTO.getEnterBar();
            if (enterBar != null ? !enterBar.equals(enterBar2) : enterBar2 != null) {
                return false;
            }
            AnchorTagDTO anchorTag = getAnchorTag();
            AnchorTagDTO anchorTag2 = taskRewardDTO.getAnchorTag();
            return anchorTag != null ? anchorTag.equals(anchorTag2) : anchorTag2 == null;
        }

        public AnchorTagDTO getAnchorTag() {
            return this.anchorTag;
        }

        public BadgeDTO getBadge() {
            return this.badge;
        }

        public CarDTO getCar() {
            return this.car;
        }

        public EnterBarDTO getEnterBar() {
            return this.enterBar;
        }

        public int hashCode() {
            CarDTO car = getCar();
            int iHashCode = car == null ? 43 : car.hashCode();
            BadgeDTO badge = getBadge();
            int iHashCode2 = ((iHashCode + 59) * 59) + (badge == null ? 43 : badge.hashCode());
            EnterBarDTO enterBar = getEnterBar();
            int iHashCode3 = (iHashCode2 * 59) + (enterBar == null ? 43 : enterBar.hashCode());
            AnchorTagDTO anchorTag = getAnchorTag();
            return (iHashCode3 * 59) + (anchorTag != null ? anchorTag.hashCode() : 43);
        }

        public void setAnchorTag(AnchorTagDTO anchorTagDTO) {
            this.anchorTag = anchorTagDTO;
        }

        public void setBadge(BadgeDTO badgeDTO) {
            this.badge = badgeDTO;
        }

        public void setCar(CarDTO carDTO) {
            this.car = carDTO;
        }

        public void setEnterBar(EnterBarDTO enterBarDTO) {
            this.enterBar = enterBarDTO;
        }

        public String toString() {
            return "AnchorTaskBean.TaskRewardDTO(car=" + getCar() + ", badge=" + getBadge() + ", enterBar=" + getEnterBar() + ", anchorTag=" + getAnchorTag() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof AnchorTaskBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnchorTaskBean)) {
            return false;
        }
        AnchorTaskBean anchorTaskBean = (AnchorTaskBean) obj;
        if (!anchorTaskBean.canEqual(this)) {
            return false;
        }
        List<TaskItemDTO> list = getList();
        List<TaskItemDTO> list2 = anchorTaskBean.getList();
        if (list != null ? !list.equals(list2) : list2 != null) {
            return false;
        }
        TaskItemDTO self = getSelf();
        TaskItemDTO self2 = anchorTaskBean.getSelf();
        return self != null ? self.equals(self2) : self2 == null;
    }

    public List<TaskItemDTO> getList() {
        return this.list;
    }

    public TaskItemDTO getSelf() {
        return this.self;
    }

    public int hashCode() {
        List<TaskItemDTO> list = getList();
        int iHashCode = list == null ? 43 : list.hashCode();
        TaskItemDTO self = getSelf();
        return ((iHashCode + 59) * 59) + (self != null ? self.hashCode() : 43);
    }

    public void setList(List<TaskItemDTO> list) {
        this.list = list;
    }

    public void setSelf(TaskItemDTO taskItemDTO) {
        this.self = taskItemDTO;
    }

    public String toString() {
        return "AnchorTaskBean(list=" + getList() + ", self=" + getSelf() + ")";
    }
}
