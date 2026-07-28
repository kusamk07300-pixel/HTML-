package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class ChatRoomTopBean {

    @SerializedName("coin")
    Integer coin;

    public boolean canEqual(Object obj) {
        return obj instanceof ChatRoomTopBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatRoomTopBean)) {
            return false;
        }
        ChatRoomTopBean chatRoomTopBean = (ChatRoomTopBean) obj;
        if (!chatRoomTopBean.canEqual(this)) {
            return false;
        }
        Integer coin = getCoin();
        Integer coin2 = chatRoomTopBean.getCoin();
        return coin != null ? coin.equals(coin2) : coin2 == null;
    }

    public Integer getCoin() {
        return this.coin;
    }

    public int hashCode() {
        Integer coin = getCoin();
        return 59 + (coin == null ? 43 : coin.hashCode());
    }

    public void setCoin(Integer num) {
        this.coin = num;
    }

    public String toString() {
        return "ChatRoomTopBean(coin=" + getCoin() + ")";
    }
}
