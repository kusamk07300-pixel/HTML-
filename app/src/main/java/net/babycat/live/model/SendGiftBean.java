package net.babycat.live.model;

import java.util.List;
import net.babycat.live.model.NewJoinRoomBean;

/* JADX INFO: loaded from: classes4.dex */
public class SendGiftBean extends BaseGiftBean {
    private List<NewJoinRoomBean.AnchorsDTO> anchorsList;
    private String avatar;
    private int giftId;
    private String giftImg;
    private String giftName;
    private int giftSendSize = 1;
    private long giftStayTime;
    private int is_vip;
    private int userId;
    private List<OnlineUserListBean> userList;
    private String userName;

    public SendGiftBean() {
    }

    public List<NewJoinRoomBean.AnchorsDTO> getAnchorsList() {
        return this.anchorsList;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getGiftImg() {
        return this.giftImg;
    }

    public String getGiftName() {
        return this.giftName;
    }

    public int getIs_vip() {
        return this.is_vip;
    }

    @Override // kh.a
    public int getTheGiftId() {
        return this.giftId;
    }

    @Override // kh.a
    public long getTheGiftStay() {
        return this.giftStayTime;
    }

    @Override // kh.a
    public int getTheSendGiftSize() {
        return this.giftSendSize;
    }

    @Override // kh.a
    public int getTheUserId() {
        return this.userId;
    }

    public List<OnlineUserListBean> getUserList() {
        return this.userList;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setAnchorsList(List<NewJoinRoomBean.AnchorsDTO> list) {
        this.anchorsList = list;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setGiftImg(String str) {
        this.giftImg = str;
    }

    public void setGiftName(String str) {
        this.giftName = str;
    }

    public void setIs_vip(int i10) {
        this.is_vip = i10;
    }

    @Override // kh.a
    public void setTheGiftId(int i10) {
        this.giftId = i10;
    }

    @Override // kh.a
    public void setTheGiftStay(long j10) {
        this.giftStayTime = j10;
    }

    @Override // kh.a
    public void setTheSendGiftSize(int i10) {
        this.giftSendSize = i10;
    }

    @Override // kh.a
    public void setTheUserId(int i10) {
        this.userId = i10;
    }

    public void setUserList(List<OnlineUserListBean> list) {
        this.userList = list;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public SendGiftBean(int i10, int i11, String str, String str2, String str3, long j10) {
        this.userId = i10;
        this.giftId = i11;
        this.userName = str;
        this.giftName = str2;
        this.giftImg = str3;
        this.giftStayTime = j10;
    }
}
