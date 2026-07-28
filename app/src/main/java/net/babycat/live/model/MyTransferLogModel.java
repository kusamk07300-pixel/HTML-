package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class MyTransferLogModel {

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("coin")
    private Integer coin;

    @SerializedName("create_time")
    private String createTime;

    @SerializedName("diamond")
    private Integer diamond;

    @SerializedName("dollar")
    private String dollar;

    @SerializedName("nickname")
    private String nickname;

    @SerializedName("touid")
    private Integer touid;

    public boolean canEqual(Object obj) {
        return obj instanceof MyTransferLogModel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyTransferLogModel)) {
            return false;
        }
        MyTransferLogModel myTransferLogModel = (MyTransferLogModel) obj;
        if (!myTransferLogModel.canEqual(this)) {
            return false;
        }
        Integer touid = getTouid();
        Integer touid2 = myTransferLogModel.getTouid();
        if (touid != null ? !touid.equals(touid2) : touid2 != null) {
            return false;
        }
        Integer coin = getCoin();
        Integer coin2 = myTransferLogModel.getCoin();
        if (coin != null ? !coin.equals(coin2) : coin2 != null) {
            return false;
        }
        Integer diamond = getDiamond();
        Integer diamond2 = myTransferLogModel.getDiamond();
        if (diamond != null ? !diamond.equals(diamond2) : diamond2 != null) {
            return false;
        }
        String dollar = getDollar();
        String dollar2 = myTransferLogModel.getDollar();
        if (dollar != null ? !dollar.equals(dollar2) : dollar2 != null) {
            return false;
        }
        String createTime = getCreateTime();
        String createTime2 = myTransferLogModel.getCreateTime();
        if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
            return false;
        }
        String nickname = getNickname();
        String nickname2 = myTransferLogModel.getNickname();
        if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
            return false;
        }
        String avatar = getAvatar();
        String avatar2 = myTransferLogModel.getAvatar();
        return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public Integer getCoin() {
        return this.coin;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public Integer getDiamond() {
        return this.diamond;
    }

    public String getDollar() {
        return this.dollar;
    }

    public String getNickname() {
        return this.nickname;
    }

    public Integer getTouid() {
        return this.touid;
    }

    public int hashCode() {
        Integer touid = getTouid();
        int iHashCode = touid == null ? 43 : touid.hashCode();
        Integer coin = getCoin();
        int iHashCode2 = ((iHashCode + 59) * 59) + (coin == null ? 43 : coin.hashCode());
        Integer diamond = getDiamond();
        int iHashCode3 = (iHashCode2 * 59) + (diamond == null ? 43 : diamond.hashCode());
        String dollar = getDollar();
        int iHashCode4 = (iHashCode3 * 59) + (dollar == null ? 43 : dollar.hashCode());
        String createTime = getCreateTime();
        int iHashCode5 = (iHashCode4 * 59) + (createTime == null ? 43 : createTime.hashCode());
        String nickname = getNickname();
        int iHashCode6 = (iHashCode5 * 59) + (nickname == null ? 43 : nickname.hashCode());
        String avatar = getAvatar();
        return (iHashCode6 * 59) + (avatar != null ? avatar.hashCode() : 43);
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setCoin(Integer num) {
        this.coin = num;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setDiamond(Integer num) {
        this.diamond = num;
    }

    public void setDollar(String str) {
        this.dollar = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setTouid(Integer num) {
        this.touid = num;
    }

    public String toString() {
        return "MyTransferLogModel(touid=" + getTouid() + ", coin=" + getCoin() + ", diamond=" + getDiamond() + ", dollar=" + getDollar() + ", createTime=" + getCreateTime() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ")";
    }
}
