package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class AgentMyLogBean {

    @SerializedName("addtime")
    private String addtime;

    @SerializedName("admin")
    private String admin;

    @SerializedName("coin")
    private Integer coin;

    @SerializedName("type")
    private Integer type;

    public boolean canEqual(Object obj) {
        return obj instanceof AgentMyLogBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AgentMyLogBean)) {
            return false;
        }
        AgentMyLogBean agentMyLogBean = (AgentMyLogBean) obj;
        if (!agentMyLogBean.canEqual(this)) {
            return false;
        }
        Integer type = getType();
        Integer type2 = agentMyLogBean.getType();
        if (type != null ? !type.equals(type2) : type2 != null) {
            return false;
        }
        Integer coin = getCoin();
        Integer coin2 = agentMyLogBean.getCoin();
        if (coin != null ? !coin.equals(coin2) : coin2 != null) {
            return false;
        }
        String admin = getAdmin();
        String admin2 = agentMyLogBean.getAdmin();
        if (admin != null ? !admin.equals(admin2) : admin2 != null) {
            return false;
        }
        String addtime = getAddtime();
        String addtime2 = agentMyLogBean.getAddtime();
        return addtime != null ? addtime.equals(addtime2) : addtime2 == null;
    }

    public String getAddtime() {
        return this.addtime;
    }

    public String getAdmin() {
        return this.admin;
    }

    public Integer getCoin() {
        return this.coin;
    }

    public Integer getType() {
        return this.type;
    }

    public int hashCode() {
        Integer type = getType();
        int iHashCode = type == null ? 43 : type.hashCode();
        Integer coin = getCoin();
        int iHashCode2 = ((iHashCode + 59) * 59) + (coin == null ? 43 : coin.hashCode());
        String admin = getAdmin();
        int iHashCode3 = (iHashCode2 * 59) + (admin == null ? 43 : admin.hashCode());
        String addtime = getAddtime();
        return (iHashCode3 * 59) + (addtime != null ? addtime.hashCode() : 43);
    }

    public void setAddtime(String str) {
        this.addtime = str;
    }

    public void setAdmin(String str) {
        this.admin = str;
    }

    public void setCoin(Integer num) {
        this.coin = num;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public String toString() {
        return "AgentMyLogBean(type=" + getType() + ", admin=" + getAdmin() + ", addtime=" + getAddtime() + ", coin=" + getCoin() + ")";
    }
}
