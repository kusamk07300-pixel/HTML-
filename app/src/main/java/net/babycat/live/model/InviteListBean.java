package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;

/* JADX INFO: loaded from: classes4.dex */
public class InviteListBean {

    @SerializedName("create_time")
    private String createTime;

    @SerializedName("device_id")
    private String deviceId;

    @SerializedName("dollar")
    private String dollar;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34853id;

    @SerializedName("ip")
    private String ip;

    @SerializedName("mark")
    private String mark;

    @SerializedName("reward_coins")
    private String rewardCoins;

    @SerializedName("reward_tickets")
    private Integer rewardTickets;

    @SerializedName(o0.CATEGORY_STATUS)
    private Integer status;

    @SerializedName("to_device_id")
    private String toDeviceId;

    @SerializedName("to_user_ip")
    private String toUserIp;

    @SerializedName("touid")
    private Integer touid;

    @SerializedName("touser")
    private TouserDTO touser;

    @SerializedName("uid")
    private Integer uid;

    public static class TouserDTO {

        @SerializedName("avatar")
        private String avatar;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34854id;

        @SerializedName("nickname")
        private String nickname;

        public boolean canEqual(Object obj) {
            return obj instanceof TouserDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TouserDTO)) {
                return false;
            }
            TouserDTO touserDTO = (TouserDTO) obj;
            if (!touserDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = touserDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = touserDTO.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = touserDTO.getAvatar();
            return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public Integer getId() {
            return this.f34854id;
        }

        public String getNickname() {
            return this.nickname;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            String nickname = getNickname();
            int iHashCode2 = ((iHashCode + 59) * 59) + (nickname == null ? 43 : nickname.hashCode());
            String avatar = getAvatar();
            return (iHashCode2 * 59) + (avatar != null ? avatar.hashCode() : 43);
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setId(Integer num) {
            this.f34854id = num;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public String toString() {
            return "InviteListBean.TouserDTO(nickname=" + getNickname() + ", avatar=" + getAvatar() + ", id=" + getId() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof InviteListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InviteListBean)) {
            return false;
        }
        InviteListBean inviteListBean = (InviteListBean) obj;
        if (!inviteListBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = inviteListBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer uid = getUid();
        Integer uid2 = inviteListBean.getUid();
        if (uid != null ? !uid.equals(uid2) : uid2 != null) {
            return false;
        }
        Integer touid = getTouid();
        Integer touid2 = inviteListBean.getTouid();
        if (touid != null ? !touid.equals(touid2) : touid2 != null) {
            return false;
        }
        Integer status = getStatus();
        Integer status2 = inviteListBean.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        Integer rewardTickets = getRewardTickets();
        Integer rewardTickets2 = inviteListBean.getRewardTickets();
        if (rewardTickets != null ? !rewardTickets.equals(rewardTickets2) : rewardTickets2 != null) {
            return false;
        }
        String deviceId = getDeviceId();
        String deviceId2 = inviteListBean.getDeviceId();
        if (deviceId != null ? !deviceId.equals(deviceId2) : deviceId2 != null) {
            return false;
        }
        String ip = getIp();
        String ip2 = inviteListBean.getIp();
        if (ip != null ? !ip.equals(ip2) : ip2 != null) {
            return false;
        }
        String createTime = getCreateTime();
        String createTime2 = inviteListBean.getCreateTime();
        if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
            return false;
        }
        String toDeviceId = getToDeviceId();
        String toDeviceId2 = inviteListBean.getToDeviceId();
        if (toDeviceId != null ? !toDeviceId.equals(toDeviceId2) : toDeviceId2 != null) {
            return false;
        }
        String toUserIp = getToUserIp();
        String toUserIp2 = inviteListBean.getToUserIp();
        if (toUserIp != null ? !toUserIp.equals(toUserIp2) : toUserIp2 != null) {
            return false;
        }
        String rewardCoins = getRewardCoins();
        String rewardCoins2 = inviteListBean.getRewardCoins();
        if (rewardCoins != null ? !rewardCoins.equals(rewardCoins2) : rewardCoins2 != null) {
            return false;
        }
        String mark = getMark();
        String mark2 = inviteListBean.getMark();
        if (mark != null ? !mark.equals(mark2) : mark2 != null) {
            return false;
        }
        String dollar = getDollar();
        String dollar2 = inviteListBean.getDollar();
        if (dollar != null ? !dollar.equals(dollar2) : dollar2 != null) {
            return false;
        }
        TouserDTO touser = getTouser();
        TouserDTO touser2 = inviteListBean.getTouser();
        return touser != null ? touser.equals(touser2) : touser2 == null;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getDollar() {
        return this.dollar;
    }

    public Integer getId() {
        return this.f34853id;
    }

    public String getIp() {
        return this.ip;
    }

    public String getMark() {
        return this.mark;
    }

    public String getRewardCoins() {
        return this.rewardCoins;
    }

    public Integer getRewardTickets() {
        return this.rewardTickets;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getToDeviceId() {
        return this.toDeviceId;
    }

    public String getToUserIp() {
        return this.toUserIp;
    }

    public Integer getTouid() {
        return this.touid;
    }

    public TouserDTO getTouser() {
        return this.touser;
    }

    public Integer getUid() {
        return this.uid;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        Integer uid = getUid();
        int iHashCode2 = ((iHashCode + 59) * 59) + (uid == null ? 43 : uid.hashCode());
        Integer touid = getTouid();
        int iHashCode3 = (iHashCode2 * 59) + (touid == null ? 43 : touid.hashCode());
        Integer status = getStatus();
        int iHashCode4 = (iHashCode3 * 59) + (status == null ? 43 : status.hashCode());
        Integer rewardTickets = getRewardTickets();
        int iHashCode5 = (iHashCode4 * 59) + (rewardTickets == null ? 43 : rewardTickets.hashCode());
        String deviceId = getDeviceId();
        int iHashCode6 = (iHashCode5 * 59) + (deviceId == null ? 43 : deviceId.hashCode());
        String ip = getIp();
        int iHashCode7 = (iHashCode6 * 59) + (ip == null ? 43 : ip.hashCode());
        String createTime = getCreateTime();
        int iHashCode8 = (iHashCode7 * 59) + (createTime == null ? 43 : createTime.hashCode());
        String toDeviceId = getToDeviceId();
        int iHashCode9 = (iHashCode8 * 59) + (toDeviceId == null ? 43 : toDeviceId.hashCode());
        String toUserIp = getToUserIp();
        int iHashCode10 = (iHashCode9 * 59) + (toUserIp == null ? 43 : toUserIp.hashCode());
        String rewardCoins = getRewardCoins();
        int iHashCode11 = (iHashCode10 * 59) + (rewardCoins == null ? 43 : rewardCoins.hashCode());
        String mark = getMark();
        int iHashCode12 = (iHashCode11 * 59) + (mark == null ? 43 : mark.hashCode());
        String dollar = getDollar();
        int iHashCode13 = (iHashCode12 * 59) + (dollar == null ? 43 : dollar.hashCode());
        TouserDTO touser = getTouser();
        return (iHashCode13 * 59) + (touser != null ? touser.hashCode() : 43);
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDollar(String str) {
        this.dollar = str;
    }

    public void setId(Integer num) {
        this.f34853id = num;
    }

    public void setIp(String str) {
        this.ip = str;
    }

    public void setMark(String str) {
        this.mark = str;
    }

    public void setRewardCoins(String str) {
        this.rewardCoins = str;
    }

    public void setRewardTickets(Integer num) {
        this.rewardTickets = num;
    }

    public void setStatus(Integer num) {
        this.status = num;
    }

    public void setToDeviceId(String str) {
        this.toDeviceId = str;
    }

    public void setToUserIp(String str) {
        this.toUserIp = str;
    }

    public void setTouid(Integer num) {
        this.touid = num;
    }

    public void setTouser(TouserDTO touserDTO) {
        this.touser = touserDTO;
    }

    public void setUid(Integer num) {
        this.uid = num;
    }

    public String toString() {
        return "InviteListBean(id=" + getId() + ", uid=" + getUid() + ", deviceId=" + getDeviceId() + ", ip=" + getIp() + ", createTime=" + getCreateTime() + ", touid=" + getTouid() + ", toDeviceId=" + getToDeviceId() + ", toUserIp=" + getToUserIp() + ", status=" + getStatus() + ", rewardCoins=" + getRewardCoins() + ", rewardTickets=" + getRewardTickets() + ", mark=" + getMark() + ", dollar=" + getDollar() + ", touser=" + getTouser() + ")";
    }
}
