package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DayTaskListbean {

    @SerializedName("display")
    private DisplayDTO display;

    @SerializedName("list")
    private List<ListDTO> list;

    public static class DisplayDTO {

        @SerializedName("receive")
        private ReceiveDTO receive;

        @SerializedName("watch")
        private WatchDTO watch;

        public static class ReceiveDTO {

            @SerializedName("list")
            private List<ListDTO> list;

            public static class ListDTO {

                @SerializedName("reward")
                private String reward;

                @SerializedName("show_target")
                private String showTarget;

                @SerializedName("target")
                private int target;

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
                    if (!listDTO.canEqual(this) || getTarget() != listDTO.getTarget()) {
                        return false;
                    }
                    String reward = getReward();
                    String reward2 = listDTO.getReward();
                    if (reward != null ? !reward.equals(reward2) : reward2 != null) {
                        return false;
                    }
                    String showTarget = getShowTarget();
                    String showTarget2 = listDTO.getShowTarget();
                    return showTarget != null ? showTarget.equals(showTarget2) : showTarget2 == null;
                }

                public String getReward() {
                    return this.reward;
                }

                public String getShowTarget() {
                    return this.showTarget;
                }

                public int getTarget() {
                    return this.target;
                }

                public int hashCode() {
                    int target = getTarget() + 59;
                    String reward = getReward();
                    int iHashCode = (target * 59) + (reward == null ? 43 : reward.hashCode());
                    String showTarget = getShowTarget();
                    return (iHashCode * 59) + (showTarget != null ? showTarget.hashCode() : 43);
                }

                public void setReward(String str) {
                    this.reward = str;
                }

                public void setShowTarget(String str) {
                    this.showTarget = str;
                }

                public void setTarget(int i10) {
                    this.target = i10;
                }

                public String toString() {
                    return "DayTaskListbean.DisplayDTO.ReceiveDTO.ListDTO(target=" + getTarget() + ", reward=" + getReward() + ", showTarget=" + getShowTarget() + ")";
                }
            }

            public boolean canEqual(Object obj) {
                return obj instanceof ReceiveDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ReceiveDTO)) {
                    return false;
                }
                ReceiveDTO receiveDTO = (ReceiveDTO) obj;
                if (!receiveDTO.canEqual(this)) {
                    return false;
                }
                List<ListDTO> list = getList();
                List<ListDTO> list2 = receiveDTO.getList();
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
                return "DayTaskListbean.DisplayDTO.ReceiveDTO(list=" + getList() + ")";
            }
        }

        public static class WatchDTO {

            @SerializedName("list")
            private List<ListDTO> list;

            public static class ListDTO {

                @SerializedName("reward")
                private String reward;

                @SerializedName("target")
                private String target;

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
                    String target = getTarget();
                    String target2 = listDTO.getTarget();
                    if (target != null ? !target.equals(target2) : target2 != null) {
                        return false;
                    }
                    String reward = getReward();
                    String reward2 = listDTO.getReward();
                    return reward != null ? reward.equals(reward2) : reward2 == null;
                }

                public String getReward() {
                    return this.reward;
                }

                public String getTarget() {
                    return this.target;
                }

                public int hashCode() {
                    String target = getTarget();
                    int iHashCode = target == null ? 43 : target.hashCode();
                    String reward = getReward();
                    return ((iHashCode + 59) * 59) + (reward != null ? reward.hashCode() : 43);
                }

                public void setReward(String str) {
                    this.reward = str;
                }

                public void setTarget(String str) {
                    this.target = str;
                }

                public String toString() {
                    return "DayTaskListbean.DisplayDTO.WatchDTO.ListDTO(target=" + getTarget() + ", reward=" + getReward() + ")";
                }
            }

            public boolean canEqual(Object obj) {
                return obj instanceof WatchDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof WatchDTO)) {
                    return false;
                }
                WatchDTO watchDTO = (WatchDTO) obj;
                if (!watchDTO.canEqual(this)) {
                    return false;
                }
                List<ListDTO> list = getList();
                List<ListDTO> list2 = watchDTO.getList();
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
                return "DayTaskListbean.DisplayDTO.WatchDTO(list=" + getList() + ")";
            }
        }

        public boolean canEqual(Object obj) {
            return obj instanceof DisplayDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DisplayDTO)) {
                return false;
            }
            DisplayDTO displayDTO = (DisplayDTO) obj;
            if (!displayDTO.canEqual(this)) {
                return false;
            }
            ReceiveDTO receive = getReceive();
            ReceiveDTO receive2 = displayDTO.getReceive();
            if (receive != null ? !receive.equals(receive2) : receive2 != null) {
                return false;
            }
            WatchDTO watch = getWatch();
            WatchDTO watch2 = displayDTO.getWatch();
            return watch != null ? watch.equals(watch2) : watch2 == null;
        }

        public ReceiveDTO getReceive() {
            return this.receive;
        }

        public WatchDTO getWatch() {
            return this.watch;
        }

        public int hashCode() {
            ReceiveDTO receive = getReceive();
            int iHashCode = receive == null ? 43 : receive.hashCode();
            WatchDTO watch = getWatch();
            return ((iHashCode + 59) * 59) + (watch != null ? watch.hashCode() : 43);
        }

        public void setReceive(ReceiveDTO receiveDTO) {
            this.receive = receiveDTO;
        }

        public void setWatch(WatchDTO watchDTO) {
            this.watch = watchDTO;
        }

        public String toString() {
            return "DayTaskListbean.DisplayDTO(receive=" + getReceive() + ", watch=" + getWatch() + ")";
        }
    }

    public static class ListDTO {

        @SerializedName("create_time")
        private String createTime;

        @SerializedName("dailyTask")
        private DailyTaskDTO dailyTask;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34819id;

        @SerializedName("receive")
        private DisplayDTO.ReceiveDTO receive;

        @SerializedName("reward")
        private Integer reward;

        @SerializedName("schedule")
        private Integer schedule;

        @SerializedName("state")
        private Integer state;

        @SerializedName("target")
        private Integer target;

        @SerializedName("task_id")
        private Integer taskId;

        @SerializedName("task_type")
        private Integer taskType;

        @SerializedName("type")
        private Integer type;

        @SerializedName("uid")
        private Integer uid;

        @SerializedName("update_time")
        private String updateTime;

        public static class DailyTaskDTO {

            @SerializedName("icon")
            private String icon;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @SerializedName("id")
            private Integer f34820id;

            @SerializedName("name")
            private String name;

            @SerializedName("reward")
            private Integer reward;

            @SerializedName("target")
            private Integer target;

            public boolean canEqual(Object obj) {
                return obj instanceof DailyTaskDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DailyTaskDTO)) {
                    return false;
                }
                DailyTaskDTO dailyTaskDTO = (DailyTaskDTO) obj;
                if (!dailyTaskDTO.canEqual(this)) {
                    return false;
                }
                Integer id2 = getId();
                Integer id3 = dailyTaskDTO.getId();
                if (id2 != null ? !id2.equals(id3) : id3 != null) {
                    return false;
                }
                Integer target = getTarget();
                Integer target2 = dailyTaskDTO.getTarget();
                if (target != null ? !target.equals(target2) : target2 != null) {
                    return false;
                }
                Integer reward = getReward();
                Integer reward2 = dailyTaskDTO.getReward();
                if (reward != null ? !reward.equals(reward2) : reward2 != null) {
                    return false;
                }
                String name = getName();
                String name2 = dailyTaskDTO.getName();
                if (name != null ? !name.equals(name2) : name2 != null) {
                    return false;
                }
                String icon = getIcon();
                String icon2 = dailyTaskDTO.getIcon();
                return icon != null ? icon.equals(icon2) : icon2 == null;
            }

            public String getIcon() {
                return this.icon;
            }

            public Integer getId() {
                return this.f34820id;
            }

            public String getName() {
                return this.name;
            }

            public Integer getReward() {
                return this.reward;
            }

            public Integer getTarget() {
                return this.target;
            }

            public int hashCode() {
                Integer id2 = getId();
                int iHashCode = id2 == null ? 43 : id2.hashCode();
                Integer target = getTarget();
                int iHashCode2 = ((iHashCode + 59) * 59) + (target == null ? 43 : target.hashCode());
                Integer reward = getReward();
                int iHashCode3 = (iHashCode2 * 59) + (reward == null ? 43 : reward.hashCode());
                String name = getName();
                int iHashCode4 = (iHashCode3 * 59) + (name == null ? 43 : name.hashCode());
                String icon = getIcon();
                return (iHashCode4 * 59) + (icon != null ? icon.hashCode() : 43);
            }

            public void setIcon(String str) {
                this.icon = str;
            }

            public void setId(Integer num) {
                this.f34820id = num;
            }

            public void setName(String str) {
                this.name = str;
            }

            public void setReward(Integer num) {
                this.reward = num;
            }

            public void setTarget(Integer num) {
                this.target = num;
            }

            public String toString() {
                return "DayTaskListbean.ListDTO.DailyTaskDTO(id=" + getId() + ", name=" + getName() + ", icon=" + getIcon() + ", target=" + getTarget() + ", reward=" + getReward() + ")";
            }
        }

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
            Integer uid = getUid();
            Integer uid2 = listDTO.getUid();
            if (uid != null ? !uid.equals(uid2) : uid2 != null) {
                return false;
            }
            Integer taskType = getTaskType();
            Integer taskType2 = listDTO.getTaskType();
            if (taskType != null ? !taskType.equals(taskType2) : taskType2 != null) {
                return false;
            }
            Integer taskId = getTaskId();
            Integer taskId2 = listDTO.getTaskId();
            if (taskId != null ? !taskId.equals(taskId2) : taskId2 != null) {
                return false;
            }
            Integer type = getType();
            Integer type2 = listDTO.getType();
            if (type != null ? !type.equals(type2) : type2 != null) {
                return false;
            }
            Integer target = getTarget();
            Integer target2 = listDTO.getTarget();
            if (target != null ? !target.equals(target2) : target2 != null) {
                return false;
            }
            Integer schedule = getSchedule();
            Integer schedule2 = listDTO.getSchedule();
            if (schedule != null ? !schedule.equals(schedule2) : schedule2 != null) {
                return false;
            }
            Integer reward = getReward();
            Integer reward2 = listDTO.getReward();
            if (reward != null ? !reward.equals(reward2) : reward2 != null) {
                return false;
            }
            Integer state = getState();
            Integer state2 = listDTO.getState();
            if (state != null ? !state.equals(state2) : state2 != null) {
                return false;
            }
            String createTime = getCreateTime();
            String createTime2 = listDTO.getCreateTime();
            if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
                return false;
            }
            String updateTime = getUpdateTime();
            String updateTime2 = listDTO.getUpdateTime();
            if (updateTime != null ? !updateTime.equals(updateTime2) : updateTime2 != null) {
                return false;
            }
            DailyTaskDTO dailyTask = getDailyTask();
            DailyTaskDTO dailyTask2 = listDTO.getDailyTask();
            if (dailyTask != null ? !dailyTask.equals(dailyTask2) : dailyTask2 != null) {
                return false;
            }
            DisplayDTO.ReceiveDTO receive = getReceive();
            DisplayDTO.ReceiveDTO receive2 = listDTO.getReceive();
            return receive != null ? receive.equals(receive2) : receive2 == null;
        }

        public String getCreateTime() {
            return this.createTime;
        }

        public DailyTaskDTO getDailyTask() {
            return this.dailyTask;
        }

        public Integer getId() {
            return this.f34819id;
        }

        public DisplayDTO.ReceiveDTO getReceive() {
            return this.receive;
        }

        public Integer getReward() {
            return this.reward;
        }

        public Integer getSchedule() {
            return this.schedule;
        }

        public Integer getState() {
            return this.state;
        }

        public Integer getTarget() {
            return this.target;
        }

        public Integer getTaskId() {
            return this.taskId;
        }

        public Integer getTaskType() {
            return this.taskType;
        }

        public Integer getType() {
            return this.type;
        }

        public Integer getUid() {
            return this.uid;
        }

        public String getUpdateTime() {
            return this.updateTime;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer uid = getUid();
            int iHashCode2 = ((iHashCode + 59) * 59) + (uid == null ? 43 : uid.hashCode());
            Integer taskType = getTaskType();
            int iHashCode3 = (iHashCode2 * 59) + (taskType == null ? 43 : taskType.hashCode());
            Integer taskId = getTaskId();
            int iHashCode4 = (iHashCode3 * 59) + (taskId == null ? 43 : taskId.hashCode());
            Integer type = getType();
            int iHashCode5 = (iHashCode4 * 59) + (type == null ? 43 : type.hashCode());
            Integer target = getTarget();
            int iHashCode6 = (iHashCode5 * 59) + (target == null ? 43 : target.hashCode());
            Integer schedule = getSchedule();
            int iHashCode7 = (iHashCode6 * 59) + (schedule == null ? 43 : schedule.hashCode());
            Integer reward = getReward();
            int iHashCode8 = (iHashCode7 * 59) + (reward == null ? 43 : reward.hashCode());
            Integer state = getState();
            int iHashCode9 = (iHashCode8 * 59) + (state == null ? 43 : state.hashCode());
            String createTime = getCreateTime();
            int iHashCode10 = (iHashCode9 * 59) + (createTime == null ? 43 : createTime.hashCode());
            String updateTime = getUpdateTime();
            int iHashCode11 = (iHashCode10 * 59) + (updateTime == null ? 43 : updateTime.hashCode());
            DailyTaskDTO dailyTask = getDailyTask();
            int iHashCode12 = (iHashCode11 * 59) + (dailyTask == null ? 43 : dailyTask.hashCode());
            DisplayDTO.ReceiveDTO receive = getReceive();
            return (iHashCode12 * 59) + (receive != null ? receive.hashCode() : 43);
        }

        public void setCreateTime(String str) {
            this.createTime = str;
        }

        public void setDailyTask(DailyTaskDTO dailyTaskDTO) {
            this.dailyTask = dailyTaskDTO;
        }

        public void setId(Integer num) {
            this.f34819id = num;
        }

        public void setReceive(DisplayDTO.ReceiveDTO receiveDTO) {
            this.receive = receiveDTO;
        }

        public void setReward(Integer num) {
            this.reward = num;
        }

        public void setSchedule(Integer num) {
            this.schedule = num;
        }

        public void setState(Integer num) {
            this.state = num;
        }

        public void setTarget(Integer num) {
            this.target = num;
        }

        public void setTaskId(Integer num) {
            this.taskId = num;
        }

        public void setTaskType(Integer num) {
            this.taskType = num;
        }

        public void setType(Integer num) {
            this.type = num;
        }

        public void setUid(Integer num) {
            this.uid = num;
        }

        public void setUpdateTime(String str) {
            this.updateTime = str;
        }

        public String toString() {
            return "DayTaskListbean.ListDTO(id=" + getId() + ", uid=" + getUid() + ", taskType=" + getTaskType() + ", taskId=" + getTaskId() + ", type=" + getType() + ", target=" + getTarget() + ", schedule=" + getSchedule() + ", reward=" + getReward() + ", state=" + getState() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ", dailyTask=" + getDailyTask() + ", receive=" + getReceive() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof DayTaskListbean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DayTaskListbean)) {
            return false;
        }
        DayTaskListbean dayTaskListbean = (DayTaskListbean) obj;
        if (!dayTaskListbean.canEqual(this)) {
            return false;
        }
        List<ListDTO> list = getList();
        List<ListDTO> list2 = dayTaskListbean.getList();
        if (list != null ? !list.equals(list2) : list2 != null) {
            return false;
        }
        DisplayDTO display = getDisplay();
        DisplayDTO display2 = dayTaskListbean.getDisplay();
        return display != null ? display.equals(display2) : display2 == null;
    }

    public DisplayDTO getDisplay() {
        return this.display;
    }

    public List<ListDTO> getList() {
        return this.list;
    }

    public int hashCode() {
        List<ListDTO> list = getList();
        int iHashCode = list == null ? 43 : list.hashCode();
        DisplayDTO display = getDisplay();
        return ((iHashCode + 59) * 59) + (display != null ? display.hashCode() : 43);
    }

    public void setDisplay(DisplayDTO displayDTO) {
        this.display = displayDTO;
    }

    public void setList(List<ListDTO> list) {
        this.list = list;
    }

    public String toString() {
        return "DayTaskListbean(list=" + getList() + ", display=" + getDisplay() + ")";
    }
}
