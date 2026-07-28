package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class HostListBean {

    @SerializedName("type")
    Integer type;

    @SerializedName("type_text")
    String typeText;

    @SerializedName("user")
    UserDTO user;

    public class UserDTO {

        @SerializedName("avatar")
        String avatar;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        Integer f34843id;

        @SerializedName("nickname")
        String nickname;

        public UserDTO() {
        }

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
            String avatar = getAvatar();
            String avatar2 = userDTO.getAvatar();
            if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = userDTO.getNickname();
            return nickname != null ? nickname.equals(nickname2) : nickname2 == null;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public Integer getId() {
            return this.f34843id;
        }

        public String getNickname() {
            return this.nickname;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            String avatar = getAvatar();
            int iHashCode2 = ((iHashCode + 59) * 59) + (avatar == null ? 43 : avatar.hashCode());
            String nickname = getNickname();
            return (iHashCode2 * 59) + (nickname != null ? nickname.hashCode() : 43);
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setId(Integer num) {
            this.f34843id = num;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public String toString() {
            return "HostListBean.UserDTO(id=" + getId() + ", avatar=" + getAvatar() + ", nickname=" + getNickname() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof HostListBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HostListBean)) {
            return false;
        }
        HostListBean hostListBean = (HostListBean) obj;
        if (!hostListBean.canEqual(this)) {
            return false;
        }
        Integer type = getType();
        Integer type2 = hostListBean.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        UserDTO user = getUser();
        UserDTO user2 = hostListBean.getUser();
        if (user != null ? !user.equals(user2) : user2 != null) {
            return false;
        }
        String typeText = getTypeText();
        String typeText2 = hostListBean.getTypeText();
        return typeText != null ? typeText.equals(typeText2) : typeText2 == null;
    }

    public Integer getType() {
        return this.type;
    }

    public String getTypeText() {
        return this.typeText;
    }

    public UserDTO getUser() {
        return this.user;
    }

    public int hashCode() {
        Integer type = getType();
        int iHashCode = type == null ? 43 : type.hashCode();
        UserDTO user = getUser();
        int iHashCode2 = ((iHashCode + 59) * 59) + (user == null ? 43 : user.hashCode());
        String typeText = getTypeText();
        return (iHashCode2 * 59) + (typeText != null ? typeText.hashCode() : 43);
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public void setTypeText(String str) {
        this.typeText = str;
    }

    public void setUser(UserDTO userDTO) {
        this.user = userDTO;
    }

    public String toString() {
        return "HostListBean(user=" + getUser() + ", type=" + getType() + ", typeText=" + getTypeText() + ")";
    }
}
