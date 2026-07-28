package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;

/* JADX INFO: loaded from: classes4.dex */
public class WithdrawCashRecordBean {

    @SerializedName("addtime")
    private String addtime;

    @SerializedName("agent_id")
    private Integer agentId;

    @SerializedName("bind_type")
    private Integer bindType;

    @SerializedName("diamond")
    private Integer diamond;

    @SerializedName("money")
    private String money;

    @SerializedName("orderno")
    private String orderno;

    @SerializedName(o0.CATEGORY_STATUS)
    private Integer status;

    @SerializedName("uid")
    private Integer uid;

    public boolean canEqual(Object obj) {
        return obj instanceof WithdrawCashRecordBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WithdrawCashRecordBean)) {
            return false;
        }
        WithdrawCashRecordBean withdrawCashRecordBean = (WithdrawCashRecordBean) obj;
        if (!withdrawCashRecordBean.canEqual(this)) {
            return false;
        }
        Integer uid = getUid();
        Integer uid2 = withdrawCashRecordBean.getUid();
        if (uid != null ? !uid.equals(uid2) : uid2 != null) {
            return false;
        }
        Integer status = getStatus();
        Integer status2 = withdrawCashRecordBean.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        Integer diamond = getDiamond();
        Integer diamond2 = withdrawCashRecordBean.getDiamond();
        if (diamond != null ? !diamond.equals(diamond2) : diamond2 != null) {
            return false;
        }
        Integer bindType = getBindType();
        Integer bindType2 = withdrawCashRecordBean.getBindType();
        if (bindType != null ? !bindType.equals(bindType2) : bindType2 != null) {
            return false;
        }
        Integer agentId = getAgentId();
        Integer agentId2 = withdrawCashRecordBean.getAgentId();
        if (agentId != null ? !agentId.equals(agentId2) : agentId2 != null) {
            return false;
        }
        String money = getMoney();
        String money2 = withdrawCashRecordBean.getMoney();
        if (money != null ? !money.equals(money2) : money2 != null) {
            return false;
        }
        String orderno = getOrderno();
        String orderno2 = withdrawCashRecordBean.getOrderno();
        if (orderno != null ? !orderno.equals(orderno2) : orderno2 != null) {
            return false;
        }
        String addtime = getAddtime();
        String addtime2 = withdrawCashRecordBean.getAddtime();
        return addtime != null ? addtime.equals(addtime2) : addtime2 == null;
    }

    public String getAddtime() {
        return this.addtime;
    }

    public Integer getAgentId() {
        return this.agentId;
    }

    public Integer getBindType() {
        return this.bindType;
    }

    public Integer getDiamond() {
        return this.diamond;
    }

    public String getMoney() {
        return this.money;
    }

    public String getOrderno() {
        return this.orderno;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getUid() {
        return this.uid;
    }

    public int hashCode() {
        Integer uid = getUid();
        int iHashCode = uid == null ? 43 : uid.hashCode();
        Integer status = getStatus();
        int iHashCode2 = ((iHashCode + 59) * 59) + (status == null ? 43 : status.hashCode());
        Integer diamond = getDiamond();
        int iHashCode3 = (iHashCode2 * 59) + (diamond == null ? 43 : diamond.hashCode());
        Integer bindType = getBindType();
        int iHashCode4 = (iHashCode3 * 59) + (bindType == null ? 43 : bindType.hashCode());
        Integer agentId = getAgentId();
        int iHashCode5 = (iHashCode4 * 59) + (agentId == null ? 43 : agentId.hashCode());
        String money = getMoney();
        int iHashCode6 = (iHashCode5 * 59) + (money == null ? 43 : money.hashCode());
        String orderno = getOrderno();
        int iHashCode7 = (iHashCode6 * 59) + (orderno == null ? 43 : orderno.hashCode());
        String addtime = getAddtime();
        return (iHashCode7 * 59) + (addtime != null ? addtime.hashCode() : 43);
    }

    public void setAddtime(String str) {
        this.addtime = str;
    }

    public void setAgentId(Integer num) {
        this.agentId = num;
    }

    public void setBindType(Integer num) {
        this.bindType = num;
    }

    public void setDiamond(Integer num) {
        this.diamond = num;
    }

    public void setMoney(String str) {
        this.money = str;
    }

    public void setOrderno(String str) {
        this.orderno = str;
    }

    public void setStatus(Integer num) {
        this.status = num;
    }

    public void setUid(Integer num) {
        this.uid = num;
    }

    public String toString() {
        return "WithdrawCashRecordBean(uid=" + getUid() + ", status=" + getStatus() + ", money=" + getMoney() + ", diamond=" + getDiamond() + ", bindType=" + getBindType() + ", agentId=" + getAgentId() + ", orderno=" + getOrderno() + ", addtime=" + getAddtime() + ")";
    }
}
