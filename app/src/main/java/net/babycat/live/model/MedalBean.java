package net.babycat.live.model;

import com.amazonaws.mobileconnectors.s3.transferutility.j;
import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class MedalBean implements Serializable {

    @SerializedName("medal_list")
    private List<MedalInfoDTO> medalList;

    @SerializedName("user_info")
    private MedalUserInfoDTO userInfo;

    @SerializedName("user_medal")
    private List<MedalUserMedalDTO> userMedal;

    public static class MedalInfoDTO implements Serializable {

        @SerializedName("create_time")
        private String createTime;

        @SerializedName(j.COLUMN_FILE)
        private String file;

        @SerializedName("icon")
        private String icon;

        @SerializedName("name")
        private String name;

        @SerializedName(o0.CATEGORY_STATUS)
        private Integer status;

        public boolean canEqual(Object obj) {
            return obj instanceof MedalInfoDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MedalInfoDTO)) {
                return false;
            }
            MedalInfoDTO medalInfoDTO = (MedalInfoDTO) obj;
            if (!medalInfoDTO.canEqual(this)) {
                return false;
            }
            Integer status = getStatus();
            Integer status2 = medalInfoDTO.getStatus();
            if (status != null ? !status.equals(status2) : status2 != null) {
                return false;
            }
            String icon = getIcon();
            String icon2 = medalInfoDTO.getIcon();
            if (icon != null ? !icon.equals(icon2) : icon2 != null) {
                return false;
            }
            String file = getFile();
            String file2 = medalInfoDTO.getFile();
            if (file != null ? !file.equals(file2) : file2 != null) {
                return false;
            }
            String name = getName();
            String name2 = medalInfoDTO.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String createTime = getCreateTime();
            String createTime2 = medalInfoDTO.getCreateTime();
            return createTime != null ? createTime.equals(createTime2) : createTime2 == null;
        }

        public String getCreateTime() {
            return this.createTime;
        }

        public String getFile() {
            return this.file;
        }

        public String getIcon() {
            return this.icon;
        }

        public String getName() {
            return this.name;
        }

        public Integer getStatus() {
            return this.status;
        }

        public int hashCode() {
            Integer status = getStatus();
            int iHashCode = status == null ? 43 : status.hashCode();
            String icon = getIcon();
            int iHashCode2 = ((iHashCode + 59) * 59) + (icon == null ? 43 : icon.hashCode());
            String file = getFile();
            int iHashCode3 = (iHashCode2 * 59) + (file == null ? 43 : file.hashCode());
            String name = getName();
            int iHashCode4 = (iHashCode3 * 59) + (name == null ? 43 : name.hashCode());
            String createTime = getCreateTime();
            return (iHashCode4 * 59) + (createTime != null ? createTime.hashCode() : 43);
        }

        public void setCreateTime(String str) {
            this.createTime = str;
        }

        public void setFile(String str) {
            this.file = str;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setStatus(Integer num) {
            this.status = num;
        }

        public String toString() {
            return "MedalBean.MedalInfoDTO(icon=" + getIcon() + ", file=" + getFile() + ", name=" + getName() + ", status=" + getStatus() + ", createTime=" + getCreateTime() + ")";
        }
    }

    public static class MedalUserInfoDTO {

        @SerializedName("avatar")
        private String avatar;

        @SerializedName("nickname")
        private String nickname;

        public boolean canEqual(Object obj) {
            return obj instanceof MedalUserInfoDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MedalUserInfoDTO)) {
                return false;
            }
            MedalUserInfoDTO medalUserInfoDTO = (MedalUserInfoDTO) obj;
            if (!medalUserInfoDTO.canEqual(this)) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = medalUserInfoDTO.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = medalUserInfoDTO.getAvatar();
            return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public String getNickname() {
            return this.nickname;
        }

        public int hashCode() {
            String nickname = getNickname();
            int iHashCode = nickname == null ? 43 : nickname.hashCode();
            String avatar = getAvatar();
            return ((iHashCode + 59) * 59) + (avatar != null ? avatar.hashCode() : 43);
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public String toString() {
            return "MedalBean.MedalUserInfoDTO(nickname=" + getNickname() + ", avatar=" + getAvatar() + ")";
        }
    }

    public static class MedalUserMedalDTO {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34862id;

        @SerializedName("medal")
        private MedalInfoDTO medal;

        @SerializedName("rec_status")
        private Integer recStatus;

        @SerializedName("rec_time")
        private String recTime;

        @SerializedName(o0.CATEGORY_STATUS)
        private Integer status;

        public boolean canEqual(Object obj) {
            return obj instanceof MedalUserMedalDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MedalUserMedalDTO)) {
                return false;
            }
            MedalUserMedalDTO medalUserMedalDTO = (MedalUserMedalDTO) obj;
            if (!medalUserMedalDTO.canEqual(this)) {
                return false;
            }
            Integer status = getStatus();
            Integer status2 = medalUserMedalDTO.getStatus();
            if (status != null ? !status.equals(status2) : status2 != null) {
                return false;
            }
            Integer recStatus = getRecStatus();
            Integer recStatus2 = medalUserMedalDTO.getRecStatus();
            if (recStatus != null ? !recStatus.equals(recStatus2) : recStatus2 != null) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = medalUserMedalDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            MedalInfoDTO medal = getMedal();
            MedalInfoDTO medal2 = medalUserMedalDTO.getMedal();
            if (medal != null ? !medal.equals(medal2) : medal2 != null) {
                return false;
            }
            String recTime = getRecTime();
            String recTime2 = medalUserMedalDTO.getRecTime();
            return recTime != null ? recTime.equals(recTime2) : recTime2 == null;
        }

        public Integer getId() {
            return this.f34862id;
        }

        public MedalInfoDTO getMedal() {
            return this.medal;
        }

        public Integer getRecStatus() {
            return this.recStatus;
        }

        public String getRecTime() {
            return this.recTime;
        }

        public Integer getStatus() {
            return this.status;
        }

        public int hashCode() {
            Integer status = getStatus();
            int iHashCode = status == null ? 43 : status.hashCode();
            Integer recStatus = getRecStatus();
            int iHashCode2 = ((iHashCode + 59) * 59) + (recStatus == null ? 43 : recStatus.hashCode());
            Integer id2 = getId();
            int iHashCode3 = (iHashCode2 * 59) + (id2 == null ? 43 : id2.hashCode());
            MedalInfoDTO medal = getMedal();
            int iHashCode4 = (iHashCode3 * 59) + (medal == null ? 43 : medal.hashCode());
            String recTime = getRecTime();
            return (iHashCode4 * 59) + (recTime != null ? recTime.hashCode() : 43);
        }

        public void setId(Integer num) {
            this.f34862id = num;
        }

        public void setMedal(MedalInfoDTO medalInfoDTO) {
            this.medal = medalInfoDTO;
        }

        public void setRecStatus(Integer num) {
            this.recStatus = num;
        }

        public void setRecTime(String str) {
            this.recTime = str;
        }

        public void setStatus(Integer num) {
            this.status = num;
        }

        public String toString() {
            return "MedalBean.MedalUserMedalDTO(medal=" + getMedal() + ", status=" + getStatus() + ", recTime=" + getRecTime() + ", recStatus=" + getRecStatus() + ", id=" + getId() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof MedalBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MedalBean)) {
            return false;
        }
        MedalBean medalBean = (MedalBean) obj;
        if (!medalBean.canEqual(this)) {
            return false;
        }
        MedalUserInfoDTO userInfo = getUserInfo();
        MedalUserInfoDTO userInfo2 = medalBean.getUserInfo();
        if (userInfo != null ? !userInfo.equals(userInfo2) : userInfo2 != null) {
            return false;
        }
        List<MedalUserMedalDTO> userMedal = getUserMedal();
        List<MedalUserMedalDTO> userMedal2 = medalBean.getUserMedal();
        if (userMedal != null ? !userMedal.equals(userMedal2) : userMedal2 != null) {
            return false;
        }
        List<MedalInfoDTO> medalList = getMedalList();
        List<MedalInfoDTO> medalList2 = medalBean.getMedalList();
        return medalList != null ? medalList.equals(medalList2) : medalList2 == null;
    }

    public List<MedalInfoDTO> getMedalList() {
        return this.medalList;
    }

    public MedalUserInfoDTO getUserInfo() {
        return this.userInfo;
    }

    public List<MedalUserMedalDTO> getUserMedal() {
        return this.userMedal;
    }

    public int hashCode() {
        MedalUserInfoDTO userInfo = getUserInfo();
        int iHashCode = userInfo == null ? 43 : userInfo.hashCode();
        List<MedalUserMedalDTO> userMedal = getUserMedal();
        int iHashCode2 = ((iHashCode + 59) * 59) + (userMedal == null ? 43 : userMedal.hashCode());
        List<MedalInfoDTO> medalList = getMedalList();
        return (iHashCode2 * 59) + (medalList != null ? medalList.hashCode() : 43);
    }

    public void setMedalList(List<MedalInfoDTO> list) {
        this.medalList = list;
    }

    public void setUserInfo(MedalUserInfoDTO medalUserInfoDTO) {
        this.userInfo = medalUserInfoDTO;
    }

    public void setUserMedal(List<MedalUserMedalDTO> list) {
        this.userMedal = list;
    }

    public String toString() {
        return "MedalBean(userInfo=" + getUserInfo() + ", userMedal=" + getUserMedal() + ", medalList=" + getMedalList() + ")";
    }
}
