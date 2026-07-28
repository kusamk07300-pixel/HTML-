package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class MyGuardBean {

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("avatar_frame")
    private String avatar_frame;

    @SerializedName("sex")
    private Integer sex;

    @SerializedName("special_relation")
    private String special_relation;

    @SerializedName("ticket")
    private String ticket;

    @SerializedName("user_name")
    private String user_name;

    public boolean canEqual(Object obj) {
        return obj instanceof MyGuardBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyGuardBean)) {
            return false;
        }
        MyGuardBean myGuardBean = (MyGuardBean) obj;
        if (!myGuardBean.canEqual(this)) {
            return false;
        }
        Integer sex = getSex();
        Integer sex2 = myGuardBean.getSex();
        if (sex != null ? !sex.equals(sex2) : sex2 != null) {
            return false;
        }
        String user_name = getUser_name();
        String user_name2 = myGuardBean.getUser_name();
        if (user_name != null ? !user_name.equals(user_name2) : user_name2 != null) {
            return false;
        }
        String avatar = getAvatar();
        String avatar2 = myGuardBean.getAvatar();
        if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
            return false;
        }
        String special_relation = getSpecial_relation();
        String special_relation2 = myGuardBean.getSpecial_relation();
        if (special_relation != null ? !special_relation.equals(special_relation2) : special_relation2 != null) {
            return false;
        }
        String ticket = getTicket();
        String ticket2 = myGuardBean.getTicket();
        if (ticket != null ? !ticket.equals(ticket2) : ticket2 != null) {
            return false;
        }
        String avatar_frame = getAvatar_frame();
        String avatar_frame2 = myGuardBean.getAvatar_frame();
        return avatar_frame != null ? avatar_frame.equals(avatar_frame2) : avatar_frame2 == null;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getAvatar_frame() {
        return this.avatar_frame;
    }

    public Integer getSex() {
        return this.sex;
    }

    public String getSpecial_relation() {
        return this.special_relation;
    }

    public String getTicket() {
        return this.ticket;
    }

    public String getUser_name() {
        return this.user_name;
    }

    public int hashCode() {
        Integer sex = getSex();
        int iHashCode = sex == null ? 43 : sex.hashCode();
        String user_name = getUser_name();
        int iHashCode2 = ((iHashCode + 59) * 59) + (user_name == null ? 43 : user_name.hashCode());
        String avatar = getAvatar();
        int iHashCode3 = (iHashCode2 * 59) + (avatar == null ? 43 : avatar.hashCode());
        String special_relation = getSpecial_relation();
        int iHashCode4 = (iHashCode3 * 59) + (special_relation == null ? 43 : special_relation.hashCode());
        String ticket = getTicket();
        int iHashCode5 = (iHashCode4 * 59) + (ticket == null ? 43 : ticket.hashCode());
        String avatar_frame = getAvatar_frame();
        return (iHashCode5 * 59) + (avatar_frame != null ? avatar_frame.hashCode() : 43);
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setAvatar_frame(String str) {
        this.avatar_frame = str;
    }

    public void setSex(Integer num) {
        this.sex = num;
    }

    public void setSpecial_relation(String str) {
        this.special_relation = str;
    }

    public void setTicket(String str) {
        this.ticket = str;
    }

    public void setUser_name(String str) {
        this.user_name = str;
    }

    public String toString() {
        return "MyGuardBean(user_name=" + getUser_name() + ", avatar=" + getAvatar() + ", sex=" + getSex() + ", special_relation=" + getSpecial_relation() + ", ticket=" + getTicket() + ", avatar_frame=" + getAvatar_frame() + ")";
    }
}
