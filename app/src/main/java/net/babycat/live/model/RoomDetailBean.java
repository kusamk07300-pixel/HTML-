package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RoomDetailBean {

    @SerializedName("cover")
    String cover;

    @SerializedName("gift_wall")
    List<GiftWallBean> gift_wall;

    @SerializedName("manger_list")
    List<RoomMasterInfoBean> manger_list;

    @SerializedName("master_info")
    RoomMasterInfoBean master_info;

    @SerializedName("room_id")
    Integer room_id;

    @SerializedName("room_name")
    String room_name;

    @SerializedName("tag")
    String tag;

    public class RoomMasterInfoBean {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        Integer f34888id;

        @SerializedName("nickname")
        String nickname;

        public RoomMasterInfoBean() {
        }

        public boolean canEqual(Object obj) {
            return obj instanceof RoomMasterInfoBean;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RoomMasterInfoBean)) {
                return false;
            }
            RoomMasterInfoBean roomMasterInfoBean = (RoomMasterInfoBean) obj;
            if (!roomMasterInfoBean.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = roomMasterInfoBean.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = roomMasterInfoBean.getNickname();
            return nickname != null ? nickname.equals(nickname2) : nickname2 == null;
        }

        public Integer getId() {
            return this.f34888id;
        }

        public String getNickname() {
            return this.nickname;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            String nickname = getNickname();
            return ((iHashCode + 59) * 59) + (nickname != null ? nickname.hashCode() : 43);
        }

        public void setId(Integer num) {
            this.f34888id = num;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public String toString() {
            return "RoomDetailBean.RoomMasterInfoBean(id=" + getId() + ", nickname=" + getNickname() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof RoomDetailBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoomDetailBean)) {
            return false;
        }
        RoomDetailBean roomDetailBean = (RoomDetailBean) obj;
        if (!roomDetailBean.canEqual(this)) {
            return false;
        }
        Integer room_id = getRoom_id();
        Integer room_id2 = roomDetailBean.getRoom_id();
        if (room_id != null ? !room_id.equals(room_id2) : room_id2 != null) {
            return false;
        }
        String cover = getCover();
        String cover2 = roomDetailBean.getCover();
        if (cover != null ? !cover.equals(cover2) : cover2 != null) {
            return false;
        }
        String room_name = getRoom_name();
        String room_name2 = roomDetailBean.getRoom_name();
        if (room_name != null ? !room_name.equals(room_name2) : room_name2 != null) {
            return false;
        }
        String tag = getTag();
        String tag2 = roomDetailBean.getTag();
        if (tag != null ? !tag.equals(tag2) : tag2 != null) {
            return false;
        }
        RoomMasterInfoBean master_info = getMaster_info();
        RoomMasterInfoBean master_info2 = roomDetailBean.getMaster_info();
        if (master_info != null ? !master_info.equals(master_info2) : master_info2 != null) {
            return false;
        }
        List<RoomMasterInfoBean> manger_list = getManger_list();
        List<RoomMasterInfoBean> manger_list2 = roomDetailBean.getManger_list();
        if (manger_list != null ? !manger_list.equals(manger_list2) : manger_list2 != null) {
            return false;
        }
        List<GiftWallBean> gift_wall = getGift_wall();
        List<GiftWallBean> gift_wall2 = roomDetailBean.getGift_wall();
        return gift_wall != null ? gift_wall.equals(gift_wall2) : gift_wall2 == null;
    }

    public String getCover() {
        return this.cover;
    }

    public List<GiftWallBean> getGift_wall() {
        return this.gift_wall;
    }

    public List<RoomMasterInfoBean> getManger_list() {
        return this.manger_list;
    }

    public RoomMasterInfoBean getMaster_info() {
        return this.master_info;
    }

    public Integer getRoom_id() {
        return this.room_id;
    }

    public String getRoom_name() {
        return this.room_name;
    }

    public String getTag() {
        return this.tag;
    }

    public int hashCode() {
        Integer room_id = getRoom_id();
        int iHashCode = room_id == null ? 43 : room_id.hashCode();
        String cover = getCover();
        int iHashCode2 = ((iHashCode + 59) * 59) + (cover == null ? 43 : cover.hashCode());
        String room_name = getRoom_name();
        int iHashCode3 = (iHashCode2 * 59) + (room_name == null ? 43 : room_name.hashCode());
        String tag = getTag();
        int iHashCode4 = (iHashCode3 * 59) + (tag == null ? 43 : tag.hashCode());
        RoomMasterInfoBean master_info = getMaster_info();
        int iHashCode5 = (iHashCode4 * 59) + (master_info == null ? 43 : master_info.hashCode());
        List<RoomMasterInfoBean> manger_list = getManger_list();
        int iHashCode6 = (iHashCode5 * 59) + (manger_list == null ? 43 : manger_list.hashCode());
        List<GiftWallBean> gift_wall = getGift_wall();
        return (iHashCode6 * 59) + (gift_wall != null ? gift_wall.hashCode() : 43);
    }

    public void setCover(String str) {
        this.cover = str;
    }

    public void setGift_wall(List<GiftWallBean> list) {
        this.gift_wall = list;
    }

    public void setManger_list(List<RoomMasterInfoBean> list) {
        this.manger_list = list;
    }

    public void setMaster_info(RoomMasterInfoBean roomMasterInfoBean) {
        this.master_info = roomMasterInfoBean;
    }

    public void setRoom_id(Integer num) {
        this.room_id = num;
    }

    public void setRoom_name(String str) {
        this.room_name = str;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public String toString() {
        return "RoomDetailBean(room_id=" + getRoom_id() + ", cover=" + getCover() + ", room_name=" + getRoom_name() + ", tag=" + getTag() + ", master_info=" + getMaster_info() + ", manger_list=" + getManger_list() + ", gift_wall=" + getGift_wall() + ")";
    }
}
