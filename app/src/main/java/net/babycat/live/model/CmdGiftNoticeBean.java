package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import net.babycat.live.model.LiveRoomInfoBean;
import net.babycat.live.model.NewJoinRoomBean;
import net.babycat.live.model.StartPkBean;

/* JADX INFO: loaded from: classes4.dex */
public class CmdGiftNoticeBean {

    @SerializedName("anchor_level_icon")
    private String anchorLevelIcon;

    @SerializedName("anchors_list")
    private List<NewJoinRoomBean.AnchorsDTO> anchorsList;

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("from_avatar")
    private String fromAvatar;

    @SerializedName("from_user_id")
    private Integer fromUserId;

    @SerializedName("from_user_name")
    private String fromUserName;

    @SerializedName("gf_sign")
    private String gfSign;

    @SerializedName("gift_model")
    private GiftListBean giftModel;

    @SerializedName("gift_num")
    private Integer giftNum;

    @SerializedName("levelIconUrl")
    private String levelIconUrl;

    @SerializedName("mic_amount_list")
    private List<StartPkBean.MicAmountList> micAmountList;

    @SerializedName("to_user_name")
    private String toUserName;

    @SerializedName("top3_list")
    private List<LiveRoomInfoBean.Top3List> top3List;

    @SerializedName("total_incomes")
    private Integer totalIncomes;

    @SerializedName("user_info")
    private UserInfoDataBean userInfo;

    @SerializedName("vip_level")
    private Integer vipLevel;

    public boolean canEqual(Object obj) {
        return obj instanceof CmdGiftNoticeBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CmdGiftNoticeBean)) {
            return false;
        }
        CmdGiftNoticeBean cmdGiftNoticeBean = (CmdGiftNoticeBean) obj;
        if (!cmdGiftNoticeBean.canEqual(this)) {
            return false;
        }
        Integer giftNum = getGiftNum();
        Integer giftNum2 = cmdGiftNoticeBean.getGiftNum();
        if (giftNum != null ? !giftNum.equals(giftNum2) : giftNum2 != null) {
            return false;
        }
        Integer fromUserId = getFromUserId();
        Integer fromUserId2 = cmdGiftNoticeBean.getFromUserId();
        if (fromUserId != null ? !fromUserId.equals(fromUserId2) : fromUserId2 != null) {
            return false;
        }
        Integer totalIncomes = getTotalIncomes();
        Integer totalIncomes2 = cmdGiftNoticeBean.getTotalIncomes();
        if (totalIncomes != null ? !totalIncomes.equals(totalIncomes2) : totalIncomes2 != null) {
            return false;
        }
        Integer vipLevel = getVipLevel();
        Integer vipLevel2 = cmdGiftNoticeBean.getVipLevel();
        if (vipLevel != null ? !vipLevel.equals(vipLevel2) : vipLevel2 != null) {
            return false;
        }
        GiftListBean giftModel = getGiftModel();
        GiftListBean giftModel2 = cmdGiftNoticeBean.getGiftModel();
        if (giftModel != null ? !giftModel.equals(giftModel2) : giftModel2 != null) {
            return false;
        }
        String fromUserName = getFromUserName();
        String fromUserName2 = cmdGiftNoticeBean.getFromUserName();
        if (fromUserName != null ? !fromUserName.equals(fromUserName2) : fromUserName2 != null) {
            return false;
        }
        String anchorLevelIcon = getAnchorLevelIcon();
        String anchorLevelIcon2 = cmdGiftNoticeBean.getAnchorLevelIcon();
        if (anchorLevelIcon != null ? !anchorLevelIcon.equals(anchorLevelIcon2) : anchorLevelIcon2 != null) {
            return false;
        }
        String levelIconUrl = getLevelIconUrl();
        String levelIconUrl2 = cmdGiftNoticeBean.getLevelIconUrl();
        if (levelIconUrl != null ? !levelIconUrl.equals(levelIconUrl2) : levelIconUrl2 != null) {
            return false;
        }
        String avatar = getAvatar();
        String avatar2 = cmdGiftNoticeBean.getAvatar();
        if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
            return false;
        }
        String gfSign = getGfSign();
        String gfSign2 = cmdGiftNoticeBean.getGfSign();
        if (gfSign != null ? !gfSign.equals(gfSign2) : gfSign2 != null) {
            return false;
        }
        String fromAvatar = getFromAvatar();
        String fromAvatar2 = cmdGiftNoticeBean.getFromAvatar();
        if (fromAvatar != null ? !fromAvatar.equals(fromAvatar2) : fromAvatar2 != null) {
            return false;
        }
        String toUserName = getToUserName();
        String toUserName2 = cmdGiftNoticeBean.getToUserName();
        if (toUserName != null ? !toUserName.equals(toUserName2) : toUserName2 != null) {
            return false;
        }
        List<NewJoinRoomBean.AnchorsDTO> anchorsList = getAnchorsList();
        List<NewJoinRoomBean.AnchorsDTO> anchorsList2 = cmdGiftNoticeBean.getAnchorsList();
        if (anchorsList != null ? !anchorsList.equals(anchorsList2) : anchorsList2 != null) {
            return false;
        }
        UserInfoDataBean userInfo = getUserInfo();
        UserInfoDataBean userInfo2 = cmdGiftNoticeBean.getUserInfo();
        if (userInfo != null ? !userInfo.equals(userInfo2) : userInfo2 != null) {
            return false;
        }
        List<StartPkBean.MicAmountList> micAmountList = getMicAmountList();
        List<StartPkBean.MicAmountList> micAmountList2 = cmdGiftNoticeBean.getMicAmountList();
        if (micAmountList != null ? !micAmountList.equals(micAmountList2) : micAmountList2 != null) {
            return false;
        }
        List<LiveRoomInfoBean.Top3List> top3List = getTop3List();
        List<LiveRoomInfoBean.Top3List> top3List2 = cmdGiftNoticeBean.getTop3List();
        return top3List != null ? top3List.equals(top3List2) : top3List2 == null;
    }

    public String getAnchorLevelIcon() {
        return this.anchorLevelIcon;
    }

    public List<NewJoinRoomBean.AnchorsDTO> getAnchorsList() {
        return this.anchorsList;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getFromAvatar() {
        return this.fromAvatar;
    }

    public Integer getFromUserId() {
        return this.fromUserId;
    }

    public String getFromUserName() {
        return this.fromUserName;
    }

    public String getGfSign() {
        return this.gfSign;
    }

    public GiftListBean getGiftModel() {
        return this.giftModel;
    }

    public Integer getGiftNum() {
        return this.giftNum;
    }

    public String getLevelIconUrl() {
        return this.levelIconUrl;
    }

    public List<StartPkBean.MicAmountList> getMicAmountList() {
        return this.micAmountList;
    }

    public String getToUserName() {
        return this.toUserName;
    }

    public List<LiveRoomInfoBean.Top3List> getTop3List() {
        return this.top3List;
    }

    public Integer getTotalIncomes() {
        return this.totalIncomes;
    }

    public UserInfoDataBean getUserInfo() {
        return this.userInfo;
    }

    public Integer getVipLevel() {
        return this.vipLevel;
    }

    public int hashCode() {
        Integer giftNum = getGiftNum();
        int iHashCode = giftNum == null ? 43 : giftNum.hashCode();
        Integer fromUserId = getFromUserId();
        int iHashCode2 = ((iHashCode + 59) * 59) + (fromUserId == null ? 43 : fromUserId.hashCode());
        Integer totalIncomes = getTotalIncomes();
        int iHashCode3 = (iHashCode2 * 59) + (totalIncomes == null ? 43 : totalIncomes.hashCode());
        Integer vipLevel = getVipLevel();
        int iHashCode4 = (iHashCode3 * 59) + (vipLevel == null ? 43 : vipLevel.hashCode());
        GiftListBean giftModel = getGiftModel();
        int iHashCode5 = (iHashCode4 * 59) + (giftModel == null ? 43 : giftModel.hashCode());
        String fromUserName = getFromUserName();
        int iHashCode6 = (iHashCode5 * 59) + (fromUserName == null ? 43 : fromUserName.hashCode());
        String anchorLevelIcon = getAnchorLevelIcon();
        int iHashCode7 = (iHashCode6 * 59) + (anchorLevelIcon == null ? 43 : anchorLevelIcon.hashCode());
        String levelIconUrl = getLevelIconUrl();
        int iHashCode8 = (iHashCode7 * 59) + (levelIconUrl == null ? 43 : levelIconUrl.hashCode());
        String avatar = getAvatar();
        int iHashCode9 = (iHashCode8 * 59) + (avatar == null ? 43 : avatar.hashCode());
        String gfSign = getGfSign();
        int iHashCode10 = (iHashCode9 * 59) + (gfSign == null ? 43 : gfSign.hashCode());
        String fromAvatar = getFromAvatar();
        int iHashCode11 = (iHashCode10 * 59) + (fromAvatar == null ? 43 : fromAvatar.hashCode());
        String toUserName = getToUserName();
        int iHashCode12 = (iHashCode11 * 59) + (toUserName == null ? 43 : toUserName.hashCode());
        List<NewJoinRoomBean.AnchorsDTO> anchorsList = getAnchorsList();
        int iHashCode13 = (iHashCode12 * 59) + (anchorsList == null ? 43 : anchorsList.hashCode());
        UserInfoDataBean userInfo = getUserInfo();
        int iHashCode14 = (iHashCode13 * 59) + (userInfo == null ? 43 : userInfo.hashCode());
        List<StartPkBean.MicAmountList> micAmountList = getMicAmountList();
        int iHashCode15 = (iHashCode14 * 59) + (micAmountList == null ? 43 : micAmountList.hashCode());
        List<LiveRoomInfoBean.Top3List> top3List = getTop3List();
        return (iHashCode15 * 59) + (top3List != null ? top3List.hashCode() : 43);
    }

    public void setAnchorLevelIcon(String str) {
        this.anchorLevelIcon = str;
    }

    public void setAnchorsList(List<NewJoinRoomBean.AnchorsDTO> list) {
        this.anchorsList = list;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setFromAvatar(String str) {
        this.fromAvatar = str;
    }

    public void setFromUserId(Integer num) {
        this.fromUserId = num;
    }

    public void setFromUserName(String str) {
        this.fromUserName = str;
    }

    public void setGfSign(String str) {
        this.gfSign = str;
    }

    public void setGiftModel(GiftListBean giftListBean) {
        this.giftModel = giftListBean;
    }

    public void setGiftNum(Integer num) {
        this.giftNum = num;
    }

    public void setLevelIconUrl(String str) {
        this.levelIconUrl = str;
    }

    public void setMicAmountList(List<StartPkBean.MicAmountList> list) {
        this.micAmountList = list;
    }

    public void setToUserName(String str) {
        this.toUserName = str;
    }

    public void setTop3List(List<LiveRoomInfoBean.Top3List> list) {
        this.top3List = list;
    }

    public void setTotalIncomes(Integer num) {
        this.totalIncomes = num;
    }

    public void setUserInfo(UserInfoDataBean userInfoDataBean) {
        this.userInfo = userInfoDataBean;
    }

    public void setVipLevel(Integer num) {
        this.vipLevel = num;
    }

    public String toString() {
        return "CmdGiftNoticeBean(giftModel=" + getGiftModel() + ", giftNum=" + getGiftNum() + ", fromUserId=" + getFromUserId() + ", fromUserName=" + getFromUserName() + ", anchorLevelIcon=" + getAnchorLevelIcon() + ", levelIconUrl=" + getLevelIconUrl() + ", avatar=" + getAvatar() + ", gfSign=" + getGfSign() + ", fromAvatar=" + getFromAvatar() + ", toUserName=" + getToUserName() + ", anchorsList=" + getAnchorsList() + ", totalIncomes=" + getTotalIncomes() + ", vipLevel=" + getVipLevel() + ", userInfo=" + getUserInfo() + ", micAmountList=" + getMicAmountList() + ", top3List=" + getTop3List() + ")";
    }
}
