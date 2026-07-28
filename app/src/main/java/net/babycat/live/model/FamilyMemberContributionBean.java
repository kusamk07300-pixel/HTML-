package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class FamilyMemberContributionBean {

    @SerializedName("profit")
    private String profit;

    @SerializedName("uid")
    private Integer uid;

    @SerializedName("user")
    private UserDTO user;

    public static class UserDTO {

        @SerializedName("age")
        private Integer age;

        @SerializedName("avatar")
        private String avatar;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34827id;

        @SerializedName("nickname")
        private String nickname;

        @SerializedName("sex")
        private Integer sex;

        @SerializedName("vip_level")
        private Integer vip;

        public boolean canEqual(Object obj) {
            return obj instanceof UserDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserDTO)) {
                return false;
            }
            UserDTO userDTO = (UserDTO) obj;
            if (!userDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = userDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            Integer sex = getSex();
            Integer sex2 = userDTO.getSex();
            if (sex != null ? !sex.equals(sex2) : sex2 != null) {
                return false;
            }
            Integer age = getAge();
            Integer age2 = userDTO.getAge();
            if (age != null ? !age.equals(age2) : age2 != null) {
                return false;
            }
            Integer vip = getVip();
            Integer vip2 = userDTO.getVip();
            if (vip != null ? !vip.equals(vip2) : vip2 != null) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = userDTO.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = userDTO.getAvatar();
            return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
        }

        public Integer getAge() {
            return this.age;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public Integer getId() {
            return this.f34827id;
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
            Integer sex = getSex();
            int iHashCode2 = ((iHashCode + 59) * 59) + (sex == null ? 43 : sex.hashCode());
            Integer age = getAge();
            int iHashCode3 = (iHashCode2 * 59) + (age == null ? 43 : age.hashCode());
            Integer vip = getVip();
            int iHashCode4 = (iHashCode3 * 59) + (vip == null ? 43 : vip.hashCode());
            String nickname = getNickname();
            int iHashCode5 = (iHashCode4 * 59) + (nickname == null ? 43 : nickname.hashCode());
            String avatar = getAvatar();
            return (iHashCode5 * 59) + (avatar != null ? avatar.hashCode() : 43);
        }

        public void setAge(Integer num) {
            this.age = num;
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setId(Integer num) {
            this.f34827id = num;
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
            return "FamilyMemberContributionBean.UserDTO(id=" + getId() + ", nickname=" + getNickname() + ", sex=" + getSex() + ", avatar=" + getAvatar() + ", age=" + getAge() + ", vip=" + getVip() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof FamilyMemberContributionBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FamilyMemberContributionBean)) {
            return false;
        }
        FamilyMemberContributionBean familyMemberContributionBean = (FamilyMemberContributionBean) obj;
        if (!familyMemberContributionBean.canEqual(this)) {
            return false;
        }
        Integer uid = getUid();
        Integer uid2 = familyMemberContributionBean.getUid();
        if (uid != null ? !uid.equals(uid2) : uid2 != null) {
            return false;
        }
        String profit = getProfit();
        String profit2 = familyMemberContributionBean.getProfit();
        if (profit != null ? !profit.equals(profit2) : profit2 != null) {
            return false;
        }
        UserDTO user = getUser();
        UserDTO user2 = familyMemberContributionBean.getUser();
        return user != null ? user.equals(user2) : user2 == null;
    }

    public String getProfit() {
        return this.profit;
    }

    public Integer getUid() {
        return this.uid;
    }

    public UserDTO getUser() {
        return this.user;
    }

    public int hashCode() {
        Integer uid = getUid();
        int iHashCode = uid == null ? 43 : uid.hashCode();
        String profit = getProfit();
        int iHashCode2 = ((iHashCode + 59) * 59) + (profit == null ? 43 : profit.hashCode());
        UserDTO user = getUser();
        return (iHashCode2 * 59) + (user != null ? user.hashCode() : 43);
    }

    public void setProfit(String str) {
        this.profit = str;
    }

    public void setUid(Integer num) {
        this.uid = num;
    }

    public void setUser(UserDTO userDTO) {
        this.user = userDTO;
    }

    public String toString() {
        return "FamilyMemberContributionBean(uid=" + getUid() + ", profit=" + getProfit() + ", user=" + getUser() + ")";
    }
}
