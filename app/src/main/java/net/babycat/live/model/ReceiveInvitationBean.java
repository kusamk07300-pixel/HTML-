package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ReceiveInvitationBean {

    @SerializedName("data")
    private String data;

    @SerializedName("groupID")
    private String groupID;

    @SerializedName("inviteID")
    private String inviteID;

    @SerializedName("inviteeList")
    private List<String> inviteeList;

    @SerializedName("inviter")
    private String inviter;

    public boolean canEqual(Object obj) {
        return obj instanceof ReceiveInvitationBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReceiveInvitationBean)) {
            return false;
        }
        ReceiveInvitationBean receiveInvitationBean = (ReceiveInvitationBean) obj;
        if (!receiveInvitationBean.canEqual(this)) {
            return false;
        }
        String inviteID = getInviteID();
        String inviteID2 = receiveInvitationBean.getInviteID();
        if (inviteID != null ? !inviteID.equals(inviteID2) : inviteID2 != null) {
            return false;
        }
        String inviter = getInviter();
        String inviter2 = receiveInvitationBean.getInviter();
        if (inviter != null ? !inviter.equals(inviter2) : inviter2 != null) {
            return false;
        }
        String groupID = getGroupID();
        String groupID2 = receiveInvitationBean.getGroupID();
        if (groupID != null ? !groupID.equals(groupID2) : groupID2 != null) {
            return false;
        }
        List<String> inviteeList = getInviteeList();
        List<String> inviteeList2 = receiveInvitationBean.getInviteeList();
        if (inviteeList != null ? !inviteeList.equals(inviteeList2) : inviteeList2 != null) {
            return false;
        }
        String data = getData();
        String data2 = receiveInvitationBean.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    public String getData() {
        return this.data;
    }

    public String getGroupID() {
        return this.groupID;
    }

    public String getInviteID() {
        return this.inviteID;
    }

    public List<String> getInviteeList() {
        return this.inviteeList;
    }

    public String getInviter() {
        return this.inviter;
    }

    public int hashCode() {
        String inviteID = getInviteID();
        int iHashCode = inviteID == null ? 43 : inviteID.hashCode();
        String inviter = getInviter();
        int iHashCode2 = ((iHashCode + 59) * 59) + (inviter == null ? 43 : inviter.hashCode());
        String groupID = getGroupID();
        int iHashCode3 = (iHashCode2 * 59) + (groupID == null ? 43 : groupID.hashCode());
        List<String> inviteeList = getInviteeList();
        int iHashCode4 = (iHashCode3 * 59) + (inviteeList == null ? 43 : inviteeList.hashCode());
        String data = getData();
        return (iHashCode4 * 59) + (data != null ? data.hashCode() : 43);
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setGroupID(String str) {
        this.groupID = str;
    }

    public void setInviteID(String str) {
        this.inviteID = str;
    }

    public void setInviteeList(List<String> list) {
        this.inviteeList = list;
    }

    public void setInviter(String str) {
        this.inviter = str;
    }

    public String toString() {
        return "ReceiveInvitationBean(inviteID=" + getInviteID() + ", inviter=" + getInviter() + ", groupID=" + getGroupID() + ", inviteeList=" + getInviteeList() + ", data=" + getData() + ")";
    }
}
