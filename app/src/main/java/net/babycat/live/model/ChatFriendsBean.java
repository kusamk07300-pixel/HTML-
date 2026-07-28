package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class ChatFriendsBean {

    @SerializedName("guest")
    private ChatUserDTO guest;

    @SerializedName("is_select")
    private boolean isSelect;

    @SerializedName("update_time")
    private String updateTime;

    @SerializedName("user")
    private ChatUserDTO user;

    public static class ChatUserDTO {

        @SerializedName("anchor_level")
        private Integer anchorLevel;

        @SerializedName("avatar")
        private String avatar;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34811id;

        @SerializedName("level")
        private Integer level;

        @SerializedName("nickname")
        private String nickname;

        @SerializedName("sex")
        private Integer sex = 0;

        @SerializedName("age")
        private Integer age = 0;

        @SerializedName("vip")
        private Integer vip = 0;

        public boolean canEqual(Object obj) {
            return obj instanceof ChatUserDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChatUserDTO)) {
                return false;
            }
            ChatUserDTO chatUserDTO = (ChatUserDTO) obj;
            if (!chatUserDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = chatUserDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            Integer level = getLevel();
            Integer level2 = chatUserDTO.getLevel();
            if (level != null ? !level.equals(level2) : level2 != null) {
                return false;
            }
            Integer anchorLevel = getAnchorLevel();
            Integer anchorLevel2 = chatUserDTO.getAnchorLevel();
            if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
                return false;
            }
            Integer sex = getSex();
            Integer sex2 = chatUserDTO.getSex();
            if (sex != null ? !sex.equals(sex2) : sex2 != null) {
                return false;
            }
            Integer age = getAge();
            Integer age2 = chatUserDTO.getAge();
            if (age != null ? !age.equals(age2) : age2 != null) {
                return false;
            }
            Integer vip = getVip();
            Integer vip2 = chatUserDTO.getVip();
            if (vip != null ? !vip.equals(vip2) : vip2 != null) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = chatUserDTO.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = chatUserDTO.getAvatar();
            return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
        }

        public Integer getAge() {
            return this.age;
        }

        public Integer getAnchorLevel() {
            return this.anchorLevel;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public Integer getId() {
            return this.f34811id;
        }

        public Integer getLevel() {
            return this.level;
        }

        public String getNickname() {
            return this.nickname;
        }

        public Integer getSex() {
            return this.sex;
        }

        public Integer getVip() {
            return this.vip;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer level = getLevel();
            int iHashCode2 = ((iHashCode + 59) * 59) + (level == null ? 43 : level.hashCode());
            Integer anchorLevel = getAnchorLevel();
            int iHashCode3 = (iHashCode2 * 59) + (anchorLevel == null ? 43 : anchorLevel.hashCode());
            Integer sex = getSex();
            int iHashCode4 = (iHashCode3 * 59) + (sex == null ? 43 : sex.hashCode());
            Integer age = getAge();
            int iHashCode5 = (iHashCode4 * 59) + (age == null ? 43 : age.hashCode());
            Integer vip = getVip();
            int iHashCode6 = (iHashCode5 * 59) + (vip == null ? 43 : vip.hashCode());
            String nickname = getNickname();
            int iHashCode7 = (iHashCode6 * 59) + (nickname == null ? 43 : nickname.hashCode());
            String avatar = getAvatar();
            return (iHashCode7 * 59) + (avatar != null ? avatar.hashCode() : 43);
        }

        public void setAge(Integer num) {
            this.age = num;
        }

        public void setAnchorLevel(Integer num) {
            this.anchorLevel = num;
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setId(Integer num) {
            this.f34811id = num;
        }

        public void setLevel(Integer num) {
            this.level = num;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public void setSex(Integer num) {
            this.sex = num;
        }

        public void setVip(Integer num) {
            this.vip = num;
        }

        public String toString() {
            return "ChatFriendsBean.ChatUserDTO(nickname=" + getNickname() + ", id=" + getId() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ", avatar=" + getAvatar() + ", sex=" + getSex() + ", age=" + getAge() + ", vip=" + getVip() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof ChatFriendsBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatFriendsBean)) {
            return false;
        }
        ChatFriendsBean chatFriendsBean = (ChatFriendsBean) obj;
        if (!chatFriendsBean.canEqual(this) || isSelect() != chatFriendsBean.isSelect()) {
            return false;
        }
        ChatUserDTO user = getUser();
        ChatUserDTO user2 = chatFriendsBean.getUser();
        if (user != null ? !user.equals(user2) : user2 != null) {
            return false;
        }
        ChatUserDTO guest = getGuest();
        ChatUserDTO guest2 = chatFriendsBean.getGuest();
        if (guest != null ? !guest.equals(guest2) : guest2 != null) {
            return false;
        }
        String updateTime = getUpdateTime();
        String updateTime2 = chatFriendsBean.getUpdateTime();
        return updateTime != null ? updateTime.equals(updateTime2) : updateTime2 == null;
    }

    public ChatUserDTO getGuest() {
        return this.guest;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public ChatUserDTO getUser() {
        return this.user;
    }

    public int hashCode() {
        int i10 = isSelect() ? 79 : 97;
        ChatUserDTO user = getUser();
        int iHashCode = ((i10 + 59) * 59) + (user == null ? 43 : user.hashCode());
        ChatUserDTO guest = getGuest();
        int iHashCode2 = (iHashCode * 59) + (guest == null ? 43 : guest.hashCode());
        String updateTime = getUpdateTime();
        return (iHashCode2 * 59) + (updateTime != null ? updateTime.hashCode() : 43);
    }

    public boolean isSelect() {
        return this.isSelect;
    }

    public void setGuest(ChatUserDTO chatUserDTO) {
        this.guest = chatUserDTO;
    }

    public void setSelect(boolean z10) {
        this.isSelect = z10;
    }

    public void setUpdateTime(String str) {
        this.updateTime = str;
    }

    public void setUser(ChatUserDTO chatUserDTO) {
        this.user = chatUserDTO;
    }

    public String toString() {
        return "ChatFriendsBean(user=" + getUser() + ", guest=" + getGuest() + ", updateTime=" + getUpdateTime() + ", isSelect=" + isSelect() + ")";
    }
}
