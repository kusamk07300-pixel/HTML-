package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class RechargeInfoBean implements Serializable {

    @SerializedName("award")
    private AwardDTO award;

    @SerializedName("name")
    private String name;

    @SerializedName("rechargeUserInfo")
    private RechargeUserInfo rechargeUserInfo;

    public class AwardDTO implements Serializable {

        @SerializedName("avatar_frame")
        private GiftDTO avatarFrame;

        @SerializedName("badge")
        private GiftDTO badge;

        @SerializedName("blind_box")
        private GiftDTO blindBox;

        @SerializedName("card_frame")
        private GiftDTO cardFrame;

        @SerializedName("mount")
        private GiftDTO mount;

        @SerializedName("vip")
        private GiftDTO vip;

        public AwardDTO() {
        }

        public boolean canEqual(Object obj) {
            return obj instanceof AwardDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AwardDTO)) {
                return false;
            }
            AwardDTO awardDTO = (AwardDTO) obj;
            if (!awardDTO.canEqual(this)) {
                return false;
            }
            GiftDTO mount = getMount();
            GiftDTO mount2 = awardDTO.getMount();
            if (mount != null ? !mount.equals(mount2) : mount2 != null) {
                return false;
            }
            GiftDTO avatarFrame = getAvatarFrame();
            GiftDTO avatarFrame2 = awardDTO.getAvatarFrame();
            if (avatarFrame != null ? !avatarFrame.equals(avatarFrame2) : avatarFrame2 != null) {
                return false;
            }
            GiftDTO badge = getBadge();
            GiftDTO badge2 = awardDTO.getBadge();
            if (badge != null ? !badge.equals(badge2) : badge2 != null) {
                return false;
            }
            GiftDTO cardFrame = getCardFrame();
            GiftDTO cardFrame2 = awardDTO.getCardFrame();
            if (cardFrame != null ? !cardFrame.equals(cardFrame2) : cardFrame2 != null) {
                return false;
            }
            GiftDTO vip = getVip();
            GiftDTO vip2 = awardDTO.getVip();
            if (vip != null ? !vip.equals(vip2) : vip2 != null) {
                return false;
            }
            GiftDTO blindBox = getBlindBox();
            GiftDTO blindBox2 = awardDTO.getBlindBox();
            return blindBox != null ? blindBox.equals(blindBox2) : blindBox2 == null;
        }

        public GiftDTO getAvatarFrame() {
            return this.avatarFrame;
        }

        public GiftDTO getBadge() {
            return this.badge;
        }

        public GiftDTO getBlindBox() {
            return this.blindBox;
        }

        public GiftDTO getCardFrame() {
            return this.cardFrame;
        }

        public GiftDTO getMount() {
            return this.mount;
        }

        public GiftDTO getVip() {
            return this.vip;
        }

        public int hashCode() {
            GiftDTO mount = getMount();
            int iHashCode = mount == null ? 43 : mount.hashCode();
            GiftDTO avatarFrame = getAvatarFrame();
            int iHashCode2 = ((iHashCode + 59) * 59) + (avatarFrame == null ? 43 : avatarFrame.hashCode());
            GiftDTO badge = getBadge();
            int iHashCode3 = (iHashCode2 * 59) + (badge == null ? 43 : badge.hashCode());
            GiftDTO cardFrame = getCardFrame();
            int iHashCode4 = (iHashCode3 * 59) + (cardFrame == null ? 43 : cardFrame.hashCode());
            GiftDTO vip = getVip();
            int iHashCode5 = (iHashCode4 * 59) + (vip == null ? 43 : vip.hashCode());
            GiftDTO blindBox = getBlindBox();
            return (iHashCode5 * 59) + (blindBox != null ? blindBox.hashCode() : 43);
        }

        public void setAvatarFrame(GiftDTO giftDTO) {
            this.avatarFrame = giftDTO;
        }

        public void setBadge(GiftDTO giftDTO) {
            this.badge = giftDTO;
        }

        public void setBlindBox(GiftDTO giftDTO) {
            this.blindBox = giftDTO;
        }

        public void setCardFrame(GiftDTO giftDTO) {
            this.cardFrame = giftDTO;
        }

        public void setMount(GiftDTO giftDTO) {
            this.mount = giftDTO;
        }

        public void setVip(GiftDTO giftDTO) {
            this.vip = giftDTO;
        }

        public String toString() {
            return "RechargeInfoBean.AwardDTO(mount=" + getMount() + ", avatarFrame=" + getAvatarFrame() + ", badge=" + getBadge() + ", cardFrame=" + getCardFrame() + ", vip=" + getVip() + ", blindBox=" + getBlindBox() + ")";
        }
    }

    public class GiftDTO implements Serializable {

        @SerializedName("cartoon")
        private String cartoon;

        @SerializedName("coin")
        private Integer coin;

        @SerializedName("day")
        private Integer day;

        @SerializedName("icon")
        private String icon;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34879id;

        @SerializedName("level")
        private Integer level;

        @SerializedName("name")
        private String name;

        public GiftDTO() {
        }

        public boolean canEqual(Object obj) {
            return obj instanceof GiftDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GiftDTO)) {
                return false;
            }
            GiftDTO giftDTO = (GiftDTO) obj;
            if (!giftDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = giftDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            Integer day = getDay();
            Integer day2 = giftDTO.getDay();
            if (day != null ? !day.equals(day2) : day2 != null) {
                return false;
            }
            Integer level = getLevel();
            Integer level2 = giftDTO.getLevel();
            if (level != null ? !level.equals(level2) : level2 != null) {
                return false;
            }
            Integer coin = getCoin();
            Integer coin2 = giftDTO.getCoin();
            if (coin != null ? !coin.equals(coin2) : coin2 != null) {
                return false;
            }
            String name = getName();
            String name2 = giftDTO.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String icon = getIcon();
            String icon2 = giftDTO.getIcon();
            if (icon != null ? !icon.equals(icon2) : icon2 != null) {
                return false;
            }
            String cartoon = getCartoon();
            String cartoon2 = giftDTO.getCartoon();
            return cartoon != null ? cartoon.equals(cartoon2) : cartoon2 == null;
        }

        public String getCartoon() {
            return this.cartoon;
        }

        public Integer getCoin() {
            return this.coin;
        }

        public Integer getDay() {
            return this.day;
        }

        public String getIcon() {
            return this.icon;
        }

        public Integer getId() {
            return this.f34879id;
        }

        public Integer getLevel() {
            return this.level;
        }

        public String getName() {
            return this.name;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer day = getDay();
            int iHashCode2 = ((iHashCode + 59) * 59) + (day == null ? 43 : day.hashCode());
            Integer level = getLevel();
            int iHashCode3 = (iHashCode2 * 59) + (level == null ? 43 : level.hashCode());
            Integer coin = getCoin();
            int iHashCode4 = (iHashCode3 * 59) + (coin == null ? 43 : coin.hashCode());
            String name = getName();
            int iHashCode5 = (iHashCode4 * 59) + (name == null ? 43 : name.hashCode());
            String icon = getIcon();
            int iHashCode6 = (iHashCode5 * 59) + (icon == null ? 43 : icon.hashCode());
            String cartoon = getCartoon();
            return (iHashCode6 * 59) + (cartoon != null ? cartoon.hashCode() : 43);
        }

        public void setCartoon(String str) {
            this.cartoon = str;
        }

        public void setCoin(Integer num) {
            this.coin = num;
        }

        public void setDay(Integer num) {
            this.day = num;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setId(Integer num) {
            this.f34879id = num;
        }

        public void setLevel(Integer num) {
            this.level = num;
        }

        public void setName(String str) {
            this.name = str;
        }

        public String toString() {
            return "RechargeInfoBean.GiftDTO(id=" + getId() + ", name=" + getName() + ", icon=" + getIcon() + ", cartoon=" + getCartoon() + ", day=" + getDay() + ", level=" + getLevel() + ", coin=" + getCoin() + ")";
        }
    }

    public class RechargeUserInfo implements Serializable {

        @SerializedName("top1")
        private TOPDTO top1;

        @SerializedName("top2")
        private TOPDTO top2;

        @SerializedName("top3")
        private TOPDTO top3;

        public RechargeUserInfo() {
        }

        public boolean canEqual(Object obj) {
            return obj instanceof RechargeUserInfo;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RechargeUserInfo)) {
                return false;
            }
            RechargeUserInfo rechargeUserInfo = (RechargeUserInfo) obj;
            if (!rechargeUserInfo.canEqual(this)) {
                return false;
            }
            TOPDTO top1 = getTop1();
            TOPDTO top12 = rechargeUserInfo.getTop1();
            if (top1 != null ? !top1.equals(top12) : top12 != null) {
                return false;
            }
            TOPDTO top2 = getTop2();
            TOPDTO top22 = rechargeUserInfo.getTop2();
            if (top2 != null ? !top2.equals(top22) : top22 != null) {
                return false;
            }
            TOPDTO top3 = getTop3();
            TOPDTO top32 = rechargeUserInfo.getTop3();
            return top3 != null ? top3.equals(top32) : top32 == null;
        }

        public TOPDTO getTop1() {
            return this.top1;
        }

        public TOPDTO getTop2() {
            return this.top2;
        }

        public TOPDTO getTop3() {
            return this.top3;
        }

        public int hashCode() {
            TOPDTO top1 = getTop1();
            int iHashCode = top1 == null ? 43 : top1.hashCode();
            TOPDTO top2 = getTop2();
            int iHashCode2 = ((iHashCode + 59) * 59) + (top2 == null ? 43 : top2.hashCode());
            TOPDTO top3 = getTop3();
            return (iHashCode2 * 59) + (top3 != null ? top3.hashCode() : 43);
        }

        public void setTop1(TOPDTO topdto) {
            this.top1 = topdto;
        }

        public void setTop2(TOPDTO topdto) {
            this.top2 = topdto;
        }

        public void setTop3(TOPDTO topdto) {
            this.top3 = topdto;
        }

        public String toString() {
            return "RechargeInfoBean.RechargeUserInfo(top1=" + getTop1() + ", top2=" + getTop2() + ", top3=" + getTop3() + ")";
        }
    }

    public class TOPDTO implements Serializable {

        @SerializedName("avatar")
        private String avatar;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34880id;

        public TOPDTO() {
        }

        public boolean canEqual(Object obj) {
            return obj instanceof TOPDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TOPDTO)) {
                return false;
            }
            TOPDTO topdto = (TOPDTO) obj;
            if (!topdto.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = topdto.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = topdto.getAvatar();
            return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public Integer getId() {
            return this.f34880id;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            String avatar = getAvatar();
            return ((iHashCode + 59) * 59) + (avatar != null ? avatar.hashCode() : 43);
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setId(Integer num) {
            this.f34880id = num;
        }

        public String toString() {
            return "RechargeInfoBean.TOPDTO(id=" + getId() + ", avatar=" + getAvatar() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof RechargeInfoBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RechargeInfoBean)) {
            return false;
        }
        RechargeInfoBean rechargeInfoBean = (RechargeInfoBean) obj;
        if (!rechargeInfoBean.canEqual(this)) {
            return false;
        }
        String name = getName();
        String name2 = rechargeInfoBean.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        AwardDTO award = getAward();
        AwardDTO award2 = rechargeInfoBean.getAward();
        if (award != null ? !award.equals(award2) : award2 != null) {
            return false;
        }
        RechargeUserInfo rechargeUserInfo = getRechargeUserInfo();
        RechargeUserInfo rechargeUserInfo2 = rechargeInfoBean.getRechargeUserInfo();
        return rechargeUserInfo != null ? rechargeUserInfo.equals(rechargeUserInfo2) : rechargeUserInfo2 == null;
    }

    public AwardDTO getAward() {
        return this.award;
    }

    public String getName() {
        return this.name;
    }

    public RechargeUserInfo getRechargeUserInfo() {
        return this.rechargeUserInfo;
    }

    public int hashCode() {
        String name = getName();
        int iHashCode = name == null ? 43 : name.hashCode();
        AwardDTO award = getAward();
        int iHashCode2 = ((iHashCode + 59) * 59) + (award == null ? 43 : award.hashCode());
        RechargeUserInfo rechargeUserInfo = getRechargeUserInfo();
        return (iHashCode2 * 59) + (rechargeUserInfo != null ? rechargeUserInfo.hashCode() : 43);
    }

    public void setAward(AwardDTO awardDTO) {
        this.award = awardDTO;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRechargeUserInfo(RechargeUserInfo rechargeUserInfo) {
        this.rechargeUserInfo = rechargeUserInfo;
    }

    public String toString() {
        return "RechargeInfoBean(name=" + getName() + ", award=" + getAward() + ", rechargeUserInfo=" + getRechargeUserInfo() + ")";
    }
}
