package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class BeInviteUserTaskBean {

    @SerializedName("code")
    private Integer code;

    @SerializedName("data")
    private DataDTO data;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private Long time;

    public static class DataDTO {

        @SerializedName("avatar")
        private String avatar;

        @SerializedName("list")
        private List<TaskItemDTO> list;

        @SerializedName("nickname")
        private String nickname;

        @SerializedName("user_id")
        private Integer userId;

        public static class TaskItemDTO {

            @SerializedName("coin")
            private Integer coin;

            @SerializedName(o0.CATEGORY_STATUS)
            private Integer status;

            @SerializedName("title")
            private String title;

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
                Integer status = getStatus();
                Integer status2 = taskItemDTO.getStatus();
                if (status != null ? !status.equals(status2) : status2 != null) {
                    return false;
                }
                Integer coin = getCoin();
                Integer coin2 = taskItemDTO.getCoin();
                if (coin != null ? !coin.equals(coin2) : coin2 != null) {
                    return false;
                }
                String title = getTitle();
                String title2 = taskItemDTO.getTitle();
                return title != null ? title.equals(title2) : title2 == null;
            }

            public Integer getCoin() {
                return this.coin;
            }

            public Integer getStatus() {
                return this.status;
            }

            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                Integer status = getStatus();
                int iHashCode = status == null ? 43 : status.hashCode();
                Integer coin = getCoin();
                int iHashCode2 = ((iHashCode + 59) * 59) + (coin == null ? 43 : coin.hashCode());
                String title = getTitle();
                return (iHashCode2 * 59) + (title != null ? title.hashCode() : 43);
            }

            public void setCoin(Integer num) {
                this.coin = num;
            }

            public void setStatus(Integer num) {
                this.status = num;
            }

            public void setTitle(String str) {
                this.title = str;
            }

            public String toString() {
                return "BeInviteUserTaskBean.DataDTO.TaskItemDTO(title=" + getTitle() + ", status=" + getStatus() + ", coin=" + getCoin() + ")";
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
            Integer userId = getUserId();
            Integer userId2 = dataDTO.getUserId();
            if (userId != null ? !userId.equals(userId2) : userId2 != null) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = dataDTO.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = dataDTO.getAvatar();
            if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
                return false;
            }
            List<TaskItemDTO> list = getList();
            List<TaskItemDTO> list2 = dataDTO.getList();
            return list != null ? list.equals(list2) : list2 == null;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public List<TaskItemDTO> getList() {
            return this.list;
        }

        public String getNickname() {
            return this.nickname;
        }

        public Integer getUserId() {
            return this.userId;
        }

        public int hashCode() {
            Integer userId = getUserId();
            int iHashCode = userId == null ? 43 : userId.hashCode();
            String nickname = getNickname();
            int iHashCode2 = ((iHashCode + 59) * 59) + (nickname == null ? 43 : nickname.hashCode());
            String avatar = getAvatar();
            int iHashCode3 = (iHashCode2 * 59) + (avatar == null ? 43 : avatar.hashCode());
            List<TaskItemDTO> list = getList();
            return (iHashCode3 * 59) + (list != null ? list.hashCode() : 43);
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setList(List<TaskItemDTO> list) {
            this.list = list;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public void setUserId(Integer num) {
            this.userId = num;
        }

        public String toString() {
            return "BeInviteUserTaskBean.DataDTO(userId=" + getUserId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", list=" + getList() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof BeInviteUserTaskBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BeInviteUserTaskBean)) {
            return false;
        }
        BeInviteUserTaskBean beInviteUserTaskBean = (BeInviteUserTaskBean) obj;
        if (!beInviteUserTaskBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = beInviteUserTaskBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Long time = getTime();
        Long time2 = beInviteUserTaskBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = beInviteUserTaskBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = beInviteUserTaskBean.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    public Integer getCode() {
        return this.code;
    }

    public DataDTO getData() {
        return this.data;
    }

    public String getMsg() {
        return this.msg;
    }

    public Long getTime() {
        return this.time;
    }

    public int hashCode() {
        Integer code = getCode();
        int iHashCode = code == null ? 43 : code.hashCode();
        Long time = getTime();
        int iHashCode2 = ((iHashCode + 59) * 59) + (time == null ? 43 : time.hashCode());
        String msg = getMsg();
        int iHashCode3 = (iHashCode2 * 59) + (msg == null ? 43 : msg.hashCode());
        DataDTO data = getData();
        return (iHashCode3 * 59) + (data != null ? data.hashCode() : 43);
    }

    public void setCode(Integer num) {
        this.code = num;
    }

    public void setData(DataDTO dataDTO) {
        this.data = dataDTO;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setTime(Long l10) {
        this.time = l10;
    }

    public String toString() {
        return "BeInviteUserTaskBean(code=" + getCode() + ", msg=" + getMsg() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
