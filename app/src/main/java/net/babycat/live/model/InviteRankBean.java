package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class InviteRankBean {

    @SerializedName("cnt")
    private Integer cnt;

    @SerializedName("dollar")
    private String dollar;

    @SerializedName("total_coin")
    private String totalCoin;

    @SerializedName("uid")
    private Integer uid;

    @SerializedName("user")
    private UserDTO user;

    public static class UserDTO {

        @SerializedName("avatar")
        private String avatar;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34855id;

        @SerializedName("nickname")
        private String nickname;

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
            String nickname = getNickname();
            String nickname2 = userDTO.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = userDTO.getAvatar();
            return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public Integer getId() {
            return this.f34855id;
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
            this.f34855id = num;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public String toString() {
            return "InviteRankBean.UserDTO(id=" + getId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof InviteRankBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InviteRankBean)) {
            return false;
        }
        InviteRankBean inviteRankBean = (InviteRankBean) obj;
        if (!inviteRankBean.canEqual(this)) {
            return false;
        }
        Integer cnt = getCnt();
        Integer cnt2 = inviteRankBean.getCnt();
        if (cnt != null ? !cnt.equals(cnt2) : cnt2 != null) {
            return false;
        }
        Integer uid = getUid();
        Integer uid2 = inviteRankBean.getUid();
        if (uid != null ? !uid.equals(uid2) : uid2 != null) {
            return false;
        }
        String dollar = getDollar();
        String dollar2 = inviteRankBean.getDollar();
        if (dollar != null ? !dollar.equals(dollar2) : dollar2 != null) {
            return false;
        }
        String totalCoin = getTotalCoin();
        String totalCoin2 = inviteRankBean.getTotalCoin();
        if (totalCoin != null ? !totalCoin.equals(totalCoin2) : totalCoin2 != null) {
            return false;
        }
        UserDTO user = getUser();
        UserDTO user2 = inviteRankBean.getUser();
        return user != null ? user.equals(user2) : user2 == null;
    }

    public Integer getCnt() {
        return this.cnt;
    }

    public String getDollar() {
        return this.dollar;
    }

    public String getTotalCoin() {
        return this.totalCoin;
    }

    public Integer getUid() {
        return this.uid;
    }

    public UserDTO getUser() {
        return this.user;
    }

    public int hashCode() {
        Integer cnt = getCnt();
        int iHashCode = cnt == null ? 43 : cnt.hashCode();
        Integer uid = getUid();
        int iHashCode2 = ((iHashCode + 59) * 59) + (uid == null ? 43 : uid.hashCode());
        String dollar = getDollar();
        int iHashCode3 = (iHashCode2 * 59) + (dollar == null ? 43 : dollar.hashCode());
        String totalCoin = getTotalCoin();
        int iHashCode4 = (iHashCode3 * 59) + (totalCoin == null ? 43 : totalCoin.hashCode());
        UserDTO user = getUser();
        return (iHashCode4 * 59) + (user != null ? user.hashCode() : 43);
    }

    public void setCnt(Integer num) {
        this.cnt = num;
    }

    public void setDollar(String str) {
        this.dollar = str;
    }

    public void setTotalCoin(String str) {
        this.totalCoin = str;
    }

    public void setUid(Integer num) {
        this.uid = num;
    }

    public void setUser(UserDTO userDTO) {
        this.user = userDTO;
    }

    public String toString() {
        return "InviteRankBean(cnt=" + getCnt() + ", uid=" + getUid() + ", dollar=" + getDollar() + ", totalCoin=" + getTotalCoin() + ", user=" + getUser() + ")";
    }
}
