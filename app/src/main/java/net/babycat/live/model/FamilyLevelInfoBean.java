package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class FamilyLevelInfoBean {

    @SerializedName("level_list")
    private List<FamilyLevelDTO> levelList;

    public static class FamilyLevelDTO implements Serializable {

        @SerializedName("avatar_frame")
        private String avatarFrame;

        @SerializedName("badge")
        private String badge;

        @SerializedName("manger_num")
        private int mangerNum;

        @SerializedName("member_num")
        private int memberNum;

        @SerializedName("name")
        private String name;

        @SerializedName("sub")
        private List<FamilySubDto> sub;

        public boolean canEqual(Object obj) {
            return obj instanceof FamilyLevelDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FamilyLevelDTO)) {
                return false;
            }
            FamilyLevelDTO familyLevelDTO = (FamilyLevelDTO) obj;
            if (!familyLevelDTO.canEqual(this) || getMemberNum() != familyLevelDTO.getMemberNum() || getMangerNum() != familyLevelDTO.getMangerNum()) {
                return false;
            }
            String name = getName();
            String name2 = familyLevelDTO.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String badge = getBadge();
            String badge2 = familyLevelDTO.getBadge();
            if (badge != null ? !badge.equals(badge2) : badge2 != null) {
                return false;
            }
            String avatarFrame = getAvatarFrame();
            String avatarFrame2 = familyLevelDTO.getAvatarFrame();
            if (avatarFrame != null ? !avatarFrame.equals(avatarFrame2) : avatarFrame2 != null) {
                return false;
            }
            List<FamilySubDto> sub = getSub();
            List<FamilySubDto> sub2 = familyLevelDTO.getSub();
            return sub != null ? sub.equals(sub2) : sub2 == null;
        }

        public String getAvatarFrame() {
            return this.avatarFrame;
        }

        public String getBadge() {
            return this.badge;
        }

        public int getMangerNum() {
            return this.mangerNum;
        }

        public int getMemberNum() {
            return this.memberNum;
        }

        public String getName() {
            return this.name;
        }

        public List<FamilySubDto> getSub() {
            return this.sub;
        }

        public int hashCode() {
            int memberNum = ((getMemberNum() + 59) * 59) + getMangerNum();
            String name = getName();
            int iHashCode = (memberNum * 59) + (name == null ? 43 : name.hashCode());
            String badge = getBadge();
            int iHashCode2 = (iHashCode * 59) + (badge == null ? 43 : badge.hashCode());
            String avatarFrame = getAvatarFrame();
            int iHashCode3 = (iHashCode2 * 59) + (avatarFrame == null ? 43 : avatarFrame.hashCode());
            List<FamilySubDto> sub = getSub();
            return (iHashCode3 * 59) + (sub != null ? sub.hashCode() : 43);
        }

        public void setAvatarFrame(String str) {
            this.avatarFrame = str;
        }

        public void setBadge(String str) {
            this.badge = str;
        }

        public void setMangerNum(int i10) {
            this.mangerNum = i10;
        }

        public void setMemberNum(int i10) {
            this.memberNum = i10;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setSub(List<FamilySubDto> list) {
            this.sub = list;
        }

        public String toString() {
            return "FamilyLevelInfoBean.FamilyLevelDTO(name=" + getName() + ", badge=" + getBadge() + ", avatarFrame=" + getAvatarFrame() + ", memberNum=" + getMemberNum() + ", mangerNum=" + getMangerNum() + ", sub=" + getSub() + ")";
        }
    }

    public static class FamilySubDto implements Serializable {

        @SerializedName("avatar_frame")
        private String avatarFrame;

        @SerializedName("badge")
        private String badge;

        @SerializedName("icon")
        private String icon;

        @SerializedName("is_current")
        private int isCurrent;

        @SerializedName("manger_num")
        private int mangerNum;

        @SerializedName("member_num")
        private int memberNum;

        @SerializedName("name")
        private String name;

        public boolean canEqual(Object obj) {
            return obj instanceof FamilySubDto;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FamilySubDto)) {
                return false;
            }
            FamilySubDto familySubDto = (FamilySubDto) obj;
            if (!familySubDto.canEqual(this) || getMemberNum() != familySubDto.getMemberNum() || getMangerNum() != familySubDto.getMangerNum() || getIsCurrent() != familySubDto.getIsCurrent()) {
                return false;
            }
            String name = getName();
            String name2 = familySubDto.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String badge = getBadge();
            String badge2 = familySubDto.getBadge();
            if (badge != null ? !badge.equals(badge2) : badge2 != null) {
                return false;
            }
            String icon = getIcon();
            String icon2 = familySubDto.getIcon();
            if (icon != null ? !icon.equals(icon2) : icon2 != null) {
                return false;
            }
            String avatarFrame = getAvatarFrame();
            String avatarFrame2 = familySubDto.getAvatarFrame();
            return avatarFrame != null ? avatarFrame.equals(avatarFrame2) : avatarFrame2 == null;
        }

        public String getAvatarFrame() {
            return this.avatarFrame;
        }

        public String getBadge() {
            return this.badge;
        }

        public String getIcon() {
            return this.icon;
        }

        public int getIsCurrent() {
            return this.isCurrent;
        }

        public int getMangerNum() {
            return this.mangerNum;
        }

        public int getMemberNum() {
            return this.memberNum;
        }

        public String getName() {
            return this.name;
        }

        public int hashCode() {
            int memberNum = ((((getMemberNum() + 59) * 59) + getMangerNum()) * 59) + getIsCurrent();
            String name = getName();
            int iHashCode = (memberNum * 59) + (name == null ? 43 : name.hashCode());
            String badge = getBadge();
            int iHashCode2 = (iHashCode * 59) + (badge == null ? 43 : badge.hashCode());
            String icon = getIcon();
            int iHashCode3 = (iHashCode2 * 59) + (icon == null ? 43 : icon.hashCode());
            String avatarFrame = getAvatarFrame();
            return (iHashCode3 * 59) + (avatarFrame != null ? avatarFrame.hashCode() : 43);
        }

        public void setAvatarFrame(String str) {
            this.avatarFrame = str;
        }

        public void setBadge(String str) {
            this.badge = str;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setIsCurrent(int i10) {
            this.isCurrent = i10;
        }

        public void setMangerNum(int i10) {
            this.mangerNum = i10;
        }

        public void setMemberNum(int i10) {
            this.memberNum = i10;
        }

        public void setName(String str) {
            this.name = str;
        }

        public String toString() {
            return "FamilyLevelInfoBean.FamilySubDto(name=" + getName() + ", badge=" + getBadge() + ", icon=" + getIcon() + ", avatarFrame=" + getAvatarFrame() + ", memberNum=" + getMemberNum() + ", mangerNum=" + getMangerNum() + ", isCurrent=" + getIsCurrent() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof FamilyLevelInfoBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FamilyLevelInfoBean)) {
            return false;
        }
        FamilyLevelInfoBean familyLevelInfoBean = (FamilyLevelInfoBean) obj;
        if (!familyLevelInfoBean.canEqual(this)) {
            return false;
        }
        List<FamilyLevelDTO> levelList = getLevelList();
        List<FamilyLevelDTO> levelList2 = familyLevelInfoBean.getLevelList();
        return levelList != null ? levelList.equals(levelList2) : levelList2 == null;
    }

    public List<FamilyLevelDTO> getLevelList() {
        return this.levelList;
    }

    public int hashCode() {
        List<FamilyLevelDTO> levelList = getLevelList();
        return 59 + (levelList == null ? 43 : levelList.hashCode());
    }

    public void setLevelList(List<FamilyLevelDTO> list) {
        this.levelList = list;
    }

    public String toString() {
        return "FamilyLevelInfoBean(levelList=" + getLevelList() + ")";
    }
}
