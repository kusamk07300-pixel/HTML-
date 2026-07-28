package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class FamilyTaskBean {

    @SerializedName("familyTask")
    private FamilyTaskDTO familyTask;

    @SerializedName("reward")
    private Integer reward;

    @SerializedName("schedule")
    private Integer schedule;

    @SerializedName("target")
    private Integer target;

    @SerializedName("task_type")
    private Integer taskType;

    @SerializedName("type")
    private Integer type;

    public static class FamilyTaskDTO {

        @SerializedName("content")
        private String content;

        @SerializedName("icon")
        private String icon;

        @SerializedName("name")
        private String name;

        public boolean canEqual(Object obj) {
            return obj instanceof FamilyTaskDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FamilyTaskDTO)) {
                return false;
            }
            FamilyTaskDTO familyTaskDTO = (FamilyTaskDTO) obj;
            if (!familyTaskDTO.canEqual(this)) {
                return false;
            }
            String name = getName();
            String name2 = familyTaskDTO.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String content = getContent();
            String content2 = familyTaskDTO.getContent();
            if (content != null ? !content.equals(content2) : content2 != null) {
                return false;
            }
            String icon = getIcon();
            String icon2 = familyTaskDTO.getIcon();
            return icon != null ? icon.equals(icon2) : icon2 == null;
        }

        public String getContent() {
            return this.content;
        }

        public String getIcon() {
            return this.icon;
        }

        public String getName() {
            return this.name;
        }

        public int hashCode() {
            String name = getName();
            int iHashCode = name == null ? 43 : name.hashCode();
            String content = getContent();
            int iHashCode2 = ((iHashCode + 59) * 59) + (content == null ? 43 : content.hashCode());
            String icon = getIcon();
            return (iHashCode2 * 59) + (icon != null ? icon.hashCode() : 43);
        }

        public void setContent(String str) {
            this.content = str;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public String toString() {
            return "FamilyTaskBean.FamilyTaskDTO(name=" + getName() + ", content=" + getContent() + ", icon=" + getIcon() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof FamilyTaskBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FamilyTaskBean)) {
            return false;
        }
        FamilyTaskBean familyTaskBean = (FamilyTaskBean) obj;
        if (!familyTaskBean.canEqual(this)) {
            return false;
        }
        Integer schedule = getSchedule();
        Integer schedule2 = familyTaskBean.getSchedule();
        if (schedule != null ? !schedule.equals(schedule2) : schedule2 != null) {
            return false;
        }
        Integer target = getTarget();
        Integer target2 = familyTaskBean.getTarget();
        if (target != null ? !target.equals(target2) : target2 != null) {
            return false;
        }
        Integer taskType = getTaskType();
        Integer taskType2 = familyTaskBean.getTaskType();
        if (taskType != null ? !taskType.equals(taskType2) : taskType2 != null) {
            return false;
        }
        Integer reward = getReward();
        Integer reward2 = familyTaskBean.getReward();
        if (reward != null ? !reward.equals(reward2) : reward2 != null) {
            return false;
        }
        Integer type = getType();
        Integer type2 = familyTaskBean.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        FamilyTaskDTO familyTask = getFamilyTask();
        FamilyTaskDTO familyTask2 = familyTaskBean.getFamilyTask();
        return familyTask != null ? familyTask.equals(familyTask2) : familyTask2 == null;
    }

    public FamilyTaskDTO getFamilyTask() {
        return this.familyTask;
    }

    public Integer getReward() {
        return this.reward;
    }

    public Integer getSchedule() {
        return this.schedule;
    }

    public Integer getTarget() {
        return this.target;
    }

    public Integer getTaskType() {
        return this.taskType;
    }

    public Integer getType() {
        return this.type;
    }

    public int hashCode() {
        Integer schedule = getSchedule();
        int iHashCode = schedule == null ? 43 : schedule.hashCode();
        Integer target = getTarget();
        int iHashCode2 = ((iHashCode + 59) * 59) + (target == null ? 43 : target.hashCode());
        Integer taskType = getTaskType();
        int iHashCode3 = (iHashCode2 * 59) + (taskType == null ? 43 : taskType.hashCode());
        Integer reward = getReward();
        int iHashCode4 = (iHashCode3 * 59) + (reward == null ? 43 : reward.hashCode());
        Integer type = getType();
        int iHashCode5 = (iHashCode4 * 59) + (type == null ? 43 : type.hashCode());
        FamilyTaskDTO familyTask = getFamilyTask();
        return (iHashCode5 * 59) + (familyTask != null ? familyTask.hashCode() : 43);
    }

    public void setFamilyTask(FamilyTaskDTO familyTaskDTO) {
        this.familyTask = familyTaskDTO;
    }

    public void setReward(Integer num) {
        this.reward = num;
    }

    public void setSchedule(Integer num) {
        this.schedule = num;
    }

    public void setTarget(Integer num) {
        this.target = num;
    }

    public void setTaskType(Integer num) {
        this.taskType = num;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public String toString() {
        return "FamilyTaskBean(familyTask=" + getFamilyTask() + ", schedule=" + getSchedule() + ", target=" + getTarget() + ", taskType=" + getTaskType() + ", reward=" + getReward() + ", type=" + getType() + ")";
    }
}
