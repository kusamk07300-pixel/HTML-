package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class OnlineAndGiftBean {

    @SerializedName("gift_top")
    private List<GiftTopDTO> giftTop;

    @SerializedName("user_count")
    private Integer userCount;

    public static class GiftTopDTO {

        @SerializedName("avatar")
        private String avatar;

        @SerializedName("total_coin")
        private Integer totalCoin;

        @SerializedName("user_id")
        private Integer userId;

        public boolean canEqual(Object obj) {
            return obj instanceof GiftTopDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GiftTopDTO)) {
                return false;
            }
            GiftTopDTO giftTopDTO = (GiftTopDTO) obj;
            if (!giftTopDTO.canEqual(this)) {
                return false;
            }
            Integer userId = getUserId();
            Integer userId2 = giftTopDTO.getUserId();
            if (userId != null ? !userId.equals(userId2) : userId2 != null) {
                return false;
            }
            Integer totalCoin = getTotalCoin();
            Integer totalCoin2 = giftTopDTO.getTotalCoin();
            if (totalCoin != null ? !totalCoin.equals(totalCoin2) : totalCoin2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = giftTopDTO.getAvatar();
            return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public Integer getTotalCoin() {
            return this.totalCoin;
        }

        public Integer getUserId() {
            return this.userId;
        }

        public int hashCode() {
            Integer userId = getUserId();
            int iHashCode = userId == null ? 43 : userId.hashCode();
            Integer totalCoin = getTotalCoin();
            int iHashCode2 = ((iHashCode + 59) * 59) + (totalCoin == null ? 43 : totalCoin.hashCode());
            String avatar = getAvatar();
            return (iHashCode2 * 59) + (avatar != null ? avatar.hashCode() : 43);
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setTotalCoin(Integer num) {
            this.totalCoin = num;
        }

        public void setUserId(Integer num) {
            this.userId = num;
        }

        public String toString() {
            return "OnlineAndGiftBean.GiftTopDTO(userId=" + getUserId() + ", avatar=" + getAvatar() + ", totalCoin=" + getTotalCoin() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof OnlineAndGiftBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OnlineAndGiftBean)) {
            return false;
        }
        OnlineAndGiftBean onlineAndGiftBean = (OnlineAndGiftBean) obj;
        if (!onlineAndGiftBean.canEqual(this)) {
            return false;
        }
        Integer userCount = getUserCount();
        Integer userCount2 = onlineAndGiftBean.getUserCount();
        if (userCount != null ? !userCount.equals(userCount2) : userCount2 != null) {
            return false;
        }
        List<GiftTopDTO> giftTop = getGiftTop();
        List<GiftTopDTO> giftTop2 = onlineAndGiftBean.getGiftTop();
        return giftTop != null ? giftTop.equals(giftTop2) : giftTop2 == null;
    }

    public List<GiftTopDTO> getGiftTop() {
        return this.giftTop;
    }

    public Integer getUserCount() {
        return this.userCount;
    }

    public int hashCode() {
        Integer userCount = getUserCount();
        int iHashCode = userCount == null ? 43 : userCount.hashCode();
        List<GiftTopDTO> giftTop = getGiftTop();
        return ((iHashCode + 59) * 59) + (giftTop != null ? giftTop.hashCode() : 43);
    }

    public void setGiftTop(List<GiftTopDTO> list) {
        this.giftTop = list;
    }

    public void setUserCount(Integer num) {
        this.userCount = num;
    }

    public String toString() {
        return "OnlineAndGiftBean(giftTop=" + getGiftTop() + ", userCount=" + getUserCount() + ")";
    }
}
