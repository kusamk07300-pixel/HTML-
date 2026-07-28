package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class VipTabBean {

    @SerializedName("amount")
    private String amount;

    @SerializedName("badge")
    private String badge;

    @SerializedName("day")
    private Integer day;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34919id;

    @SerializedName("name")
    private String name;

    @SerializedName("privilege")
    private List<PrivilegeVipDTO> privilege;

    @SerializedName("target_wealth")
    private String targetWealth;

    @SerializedName("user_vip")
    private Integer userVip;

    @SerializedName("user_wealth")
    private String userWealth;

    @SerializedName("vip_level")
    private Integer vipLevel;

    public static class PrivilegeVipDTO {

        @SerializedName("active_icon")
        private String activeIcon;

        @SerializedName("desc")
        private String desc;

        @SerializedName("icon")
        private String icon;

        @SerializedName("image")
        private String image;

        @SerializedName("name")
        private String name;

        @SerializedName(o0.CATEGORY_STATUS)
        private Integer status;

        @SerializedName("vip_icon")
        private Integer vipIcon;

        public boolean canEqual(Object obj) {
            return obj instanceof PrivilegeVipDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PrivilegeVipDTO)) {
                return false;
            }
            PrivilegeVipDTO privilegeVipDTO = (PrivilegeVipDTO) obj;
            if (!privilegeVipDTO.canEqual(this)) {
                return false;
            }
            Integer vipIcon = getVipIcon();
            Integer vipIcon2 = privilegeVipDTO.getVipIcon();
            if (vipIcon != null ? !vipIcon.equals(vipIcon2) : vipIcon2 != null) {
                return false;
            }
            Integer status = getStatus();
            Integer status2 = privilegeVipDTO.getStatus();
            if (status != null ? !status.equals(status2) : status2 != null) {
                return false;
            }
            String icon = getIcon();
            String icon2 = privilegeVipDTO.getIcon();
            if (icon != null ? !icon.equals(icon2) : icon2 != null) {
                return false;
            }
            String activeIcon = getActiveIcon();
            String activeIcon2 = privilegeVipDTO.getActiveIcon();
            if (activeIcon != null ? !activeIcon.equals(activeIcon2) : activeIcon2 != null) {
                return false;
            }
            String image = getImage();
            String image2 = privilegeVipDTO.getImage();
            if (image != null ? !image.equals(image2) : image2 != null) {
                return false;
            }
            String name = getName();
            String name2 = privilegeVipDTO.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String desc = getDesc();
            String desc2 = privilegeVipDTO.getDesc();
            return desc != null ? desc.equals(desc2) : desc2 == null;
        }

        public String getActiveIcon() {
            return this.activeIcon;
        }

        public String getDesc() {
            return this.desc;
        }

        public String getIcon() {
            return this.icon;
        }

        public String getImage() {
            return this.image;
        }

        public String getName() {
            return this.name;
        }

        public Integer getStatus() {
            return this.status;
        }

        public Integer getVipIcon() {
            return this.vipIcon;
        }

        public int hashCode() {
            Integer vipIcon = getVipIcon();
            int iHashCode = vipIcon == null ? 43 : vipIcon.hashCode();
            Integer status = getStatus();
            int iHashCode2 = ((iHashCode + 59) * 59) + (status == null ? 43 : status.hashCode());
            String icon = getIcon();
            int iHashCode3 = (iHashCode2 * 59) + (icon == null ? 43 : icon.hashCode());
            String activeIcon = getActiveIcon();
            int iHashCode4 = (iHashCode3 * 59) + (activeIcon == null ? 43 : activeIcon.hashCode());
            String image = getImage();
            int iHashCode5 = (iHashCode4 * 59) + (image == null ? 43 : image.hashCode());
            String name = getName();
            int iHashCode6 = (iHashCode5 * 59) + (name == null ? 43 : name.hashCode());
            String desc = getDesc();
            return (iHashCode6 * 59) + (desc != null ? desc.hashCode() : 43);
        }

        public void setActiveIcon(String str) {
            this.activeIcon = str;
        }

        public void setDesc(String str) {
            this.desc = str;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setImage(String str) {
            this.image = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setStatus(Integer num) {
            this.status = num;
        }

        public void setVipIcon(Integer num) {
            this.vipIcon = num;
        }

        public String toString() {
            return "VipTabBean.PrivilegeVipDTO(vipIcon=" + getVipIcon() + ", icon=" + getIcon() + ", activeIcon=" + getActiveIcon() + ", image=" + getImage() + ", name=" + getName() + ", desc=" + getDesc() + ", status=" + getStatus() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof VipTabBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VipTabBean)) {
            return false;
        }
        VipTabBean vipTabBean = (VipTabBean) obj;
        if (!vipTabBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = vipTabBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer vipLevel = getVipLevel();
        Integer vipLevel2 = vipTabBean.getVipLevel();
        if (vipLevel != null ? !vipLevel.equals(vipLevel2) : vipLevel2 != null) {
            return false;
        }
        Integer userVip = getUserVip();
        Integer userVip2 = vipTabBean.getUserVip();
        if (userVip != null ? !userVip.equals(userVip2) : userVip2 != null) {
            return false;
        }
        Integer day = getDay();
        Integer day2 = vipTabBean.getDay();
        if (day != null ? !day.equals(day2) : day2 != null) {
            return false;
        }
        String name = getName();
        String name2 = vipTabBean.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String badge = getBadge();
        String badge2 = vipTabBean.getBadge();
        if (badge != null ? !badge.equals(badge2) : badge2 != null) {
            return false;
        }
        String amount = getAmount();
        String amount2 = vipTabBean.getAmount();
        if (amount != null ? !amount.equals(amount2) : amount2 != null) {
            return false;
        }
        String userWealth = getUserWealth();
        String userWealth2 = vipTabBean.getUserWealth();
        if (userWealth != null ? !userWealth.equals(userWealth2) : userWealth2 != null) {
            return false;
        }
        String targetWealth = getTargetWealth();
        String targetWealth2 = vipTabBean.getTargetWealth();
        if (targetWealth != null ? !targetWealth.equals(targetWealth2) : targetWealth2 != null) {
            return false;
        }
        List<PrivilegeVipDTO> privilege = getPrivilege();
        List<PrivilegeVipDTO> privilege2 = vipTabBean.getPrivilege();
        return privilege != null ? privilege.equals(privilege2) : privilege2 == null;
    }

    public String getAmount() {
        return this.amount;
    }

    public String getBadge() {
        return this.badge;
    }

    public Integer getDay() {
        return this.day;
    }

    public Integer getId() {
        return this.f34919id;
    }

    public String getName() {
        return this.name;
    }

    public List<PrivilegeVipDTO> getPrivilege() {
        return this.privilege;
    }

    public String getTargetWealth() {
        return this.targetWealth;
    }

    public Integer getUserVip() {
        return this.userVip;
    }

    public String getUserWealth() {
        return this.userWealth;
    }

    public Integer getVipLevel() {
        return this.vipLevel;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        Integer vipLevel = getVipLevel();
        int iHashCode2 = ((iHashCode + 59) * 59) + (vipLevel == null ? 43 : vipLevel.hashCode());
        Integer userVip = getUserVip();
        int iHashCode3 = (iHashCode2 * 59) + (userVip == null ? 43 : userVip.hashCode());
        Integer day = getDay();
        int iHashCode4 = (iHashCode3 * 59) + (day == null ? 43 : day.hashCode());
        String name = getName();
        int iHashCode5 = (iHashCode4 * 59) + (name == null ? 43 : name.hashCode());
        String badge = getBadge();
        int iHashCode6 = (iHashCode5 * 59) + (badge == null ? 43 : badge.hashCode());
        String amount = getAmount();
        int iHashCode7 = (iHashCode6 * 59) + (amount == null ? 43 : amount.hashCode());
        String userWealth = getUserWealth();
        int iHashCode8 = (iHashCode7 * 59) + (userWealth == null ? 43 : userWealth.hashCode());
        String targetWealth = getTargetWealth();
        int iHashCode9 = (iHashCode8 * 59) + (targetWealth == null ? 43 : targetWealth.hashCode());
        List<PrivilegeVipDTO> privilege = getPrivilege();
        return (iHashCode9 * 59) + (privilege != null ? privilege.hashCode() : 43);
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setBadge(String str) {
        this.badge = str;
    }

    public void setDay(Integer num) {
        this.day = num;
    }

    public void setId(Integer num) {
        this.f34919id = num;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPrivilege(List<PrivilegeVipDTO> list) {
        this.privilege = list;
    }

    public void setTargetWealth(String str) {
        this.targetWealth = str;
    }

    public void setUserVip(Integer num) {
        this.userVip = num;
    }

    public void setUserWealth(String str) {
        this.userWealth = str;
    }

    public void setVipLevel(Integer num) {
        this.vipLevel = num;
    }

    public String toString() {
        return "VipTabBean(id=" + getId() + ", name=" + getName() + ", badge=" + getBadge() + ", vipLevel=" + getVipLevel() + ", userVip=" + getUserVip() + ", amount=" + getAmount() + ", userWealth=" + getUserWealth() + ", targetWealth=" + getTargetWealth() + ", day=" + getDay() + ", privilege=" + getPrivilege() + ")";
    }
}
