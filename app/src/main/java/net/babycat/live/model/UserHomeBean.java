package net.babycat.live.model;

import com.amazonaws.mobileconnectors.s3.transferutility.j;
import com.google.gson.annotations.SerializedName;
import com.tencent.qcloud.tuicore.TUIConstants;
import ea.d;
import g0.o0;
import java.io.Serializable;
import java.util.List;
import xo.f;

/* JADX INFO: loaded from: classes4.dex */
public class UserHomeBean implements Serializable {

    @SerializedName("age")
    private Integer age;

    @SerializedName("anchor_level")
    private Integer anchorLevel;

    @SerializedName("anchor_level_icon")
    private String anchorLevelIcon;

    @SerializedName("auth_type")
    private Integer authType;

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("avatar_frame")
    private String avatarFrame;

    @SerializedName("badge")
    private List<BadgeDTO> badge;

    @SerializedName("badge1")
    private String badge1;

    @SerializedName("badge1_svga")
    private String badge1Svga;

    @SerializedName("badge2")
    private String badge2;

    @SerializedName("badge2_svga")
    private String badge2Svga;

    @SerializedName("badge3")
    private String badge3;

    @SerializedName("badge3_svga")
    private String badge3Svga;

    @SerializedName("badge_list")
    private List<String> badgeList;

    @SerializedName("birthday")
    private String birthday;

    @SerializedName("brand")
    private String brand;

    @SerializedName("cars")
    private List<CarsDTO> cars;

    @SerializedName("cash_rate")
    private Integer cashRate;

    @SerializedName("chat_bubble")
    private String chatBubble;

    @SerializedName("city")
    private String city;

    @SerializedName("collect_total")
    private Integer collectTotal;

    @SerializedName("color_id")
    private String colorId;

    @SerializedName("color_id_icon")
    private String colorIdIcon;

    @SerializedName("consumption")
    private long consumption;

    @SerializedName("country_code")
    private Integer countryCode;

    @SerializedName("country_en")
    private String countryEn;

    @SerializedName("country_iso")
    private String countryIso;

    @SerializedName("cp")
    private CpDTO cp;

    @SerializedName("cp_doc")
    private String cpDoc;

    @SerializedName("create_time")
    private String createTime;

    @SerializedName("dynamic_total")
    private Integer dynamicTotal;

    @SerializedName("email")
    private String email;

    @SerializedName("end_bantime")
    private Integer endBantime;

    @SerializedName("family_info")
    private FamilyInfoDTO familyInfo;

    @SerializedName("family_status")
    private Integer familyStatus;

    @SerializedName("fans_total")
    private Integer fansTotal;

    @SerializedName("follow_total")
    private Integer followTotal;

    @SerializedName("friends_total")
    private Integer friendsTotal;

    @SerializedName("gifts")
    private List<GiftsDTO> gifts;

    @SerializedName("goodnum")
    private String goodnum;

    @SerializedName("guest_total")
    private Integer guestTotal;

    @SerializedName("home_dress")
    private HomeDressDTO homeDress;

    @SerializedName("hx_password")
    private Object hxPassword;

    @SerializedName("hx_uuid")
    private Object hxUuid;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34909id;

    @SerializedName("invite_code")
    private String inviteCode;

    @SerializedName("is_attention")
    private Integer isAttention;

    @SerializedName("is_friends")
    private Integer isFriends;

    @SerializedName("is_liked")
    private Integer isLiked;

    @SerializedName("ishot")
    private Integer ishot;

    @SerializedName("isrecommend")
    private Integer isrecommend;

    @SerializedName("isrecord")
    private Integer isrecord;

    @SerializedName("issuper")
    private Integer issuper;

    @SerializedName("jctx")
    private String jctx;

    @SerializedName("last_login_ip")
    private String lastLoginIp;

    @SerializedName("last_login_time")
    private Integer lastLoginTime;

    @SerializedName("level")
    private Integer level;

    @SerializedName("level_icon")
    private String levelIcon;

    @SerializedName("likes_count")
    private Integer likesCount;

    @SerializedName("likes_total")
    private Integer likesTotal;

    @SerializedName("location")
    private String location;

    @SerializedName("login_count")
    private Integer loginCount;

    @SerializedName("mobile")
    private String mobile;

    @SerializedName(d.f24956u)
    private String model;

    @SerializedName("more")
    private Object more;

    @SerializedName("nickname")
    private String nickname;

    @SerializedName("online_chat_roomid")
    private String onlineChatRoomid;

    @SerializedName("online_isauthor")
    private Integer onlineIsauthor;

    @SerializedName("online_room_livetype")
    private Integer onlineRoomLivetype;

    @SerializedName("online_roomid")
    private Integer onlineRoomid;

    @SerializedName("os")
    private String os;

    /* JADX INFO: renamed from: pk, reason: collision with root package name */
    @SerializedName("pk")
    private PkDTO f34910pk;

    @SerializedName("province")
    private String province;

    @SerializedName("recommend_time")
    private Integer recommendTime;

    @SerializedName("reg_type")
    private String regType;

    @SerializedName("sex")
    private Integer sex;

    @SerializedName(TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE)
    private String signature;

    @SerializedName(f.f44680p)
    private String source;

    @SerializedName(o0.CATEGORY_STATUS)
    private Integer status;

    @SerializedName("tags")
    private List<TagsDTO> tags;

    @SerializedName("tickettotal")
    private long tickettotal;

    @SerializedName("update_time")
    private String updateTime;

    @SerializedName("user_cp")
    private List<UserCpDTO> userCp;

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("user_shouhu")
    private UserShouhuDTO userShouhu;

    @SerializedName("user_tags")
    private List<String> userTags;

    @SerializedName("username")
    private String username;

    @SerializedName("vip_level")
    private Integer vipLevel;

    @SerializedName("wealth_level")
    private Integer wealthLevel;

    public static class BadgeDTO implements Serializable {

        @SerializedName("category")
        private Integer category;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34911id;

        @SerializedName("medal")
        private MedalDTO medal;

        @SerializedName("medal_id")
        private Integer medalId;

        @SerializedName("rec_status")
        private Integer recStatus;

        @SerializedName("rec_time")
        private String recTime;

        @SerializedName("schedule")
        private Integer schedule;

        @SerializedName(o0.CATEGORY_STATUS)
        private Integer status;

        @SerializedName("target")
        private Integer target;

        @SerializedName("uid")
        private Integer uid;

        public static class MedalDTO implements Serializable {

            @SerializedName("action_icon")
            private Object actionIcon;

            @SerializedName("category")
            private Integer category;

            @SerializedName("create_time")
            private String createTime;

            @SerializedName(j.COLUMN_FILE)
            private String file;

            @SerializedName("icon")
            private String icon;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @SerializedName("id")
            private Integer f34912id;

            @SerializedName("name")
            private String name;

            @SerializedName("target")
            private Integer target;

            @SerializedName("type")
            private Integer type;

            @SerializedName("update_time")
            private String updateTime;

            public boolean canEqual(Object obj) {
                return obj instanceof MedalDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof MedalDTO)) {
                    return false;
                }
                MedalDTO medalDTO = (MedalDTO) obj;
                if (!medalDTO.canEqual(this)) {
                    return false;
                }
                Integer id2 = getId();
                Integer id3 = medalDTO.getId();
                if (id2 != null ? !id2.equals(id3) : id3 != null) {
                    return false;
                }
                Integer type = getType();
                Integer type2 = medalDTO.getType();
                if (type != null ? !type.equals(type2) : type2 != null) {
                    return false;
                }
                Integer category = getCategory();
                Integer category2 = medalDTO.getCategory();
                if (category != null ? !category.equals(category2) : category2 != null) {
                    return false;
                }
                Integer target = getTarget();
                Integer target2 = medalDTO.getTarget();
                if (target != null ? !target.equals(target2) : target2 != null) {
                    return false;
                }
                String name = getName();
                String name2 = medalDTO.getName();
                if (name != null ? !name.equals(name2) : name2 != null) {
                    return false;
                }
                String icon = getIcon();
                String icon2 = medalDTO.getIcon();
                if (icon != null ? !icon.equals(icon2) : icon2 != null) {
                    return false;
                }
                Object actionIcon = getActionIcon();
                Object actionIcon2 = medalDTO.getActionIcon();
                if (actionIcon != null ? !actionIcon.equals(actionIcon2) : actionIcon2 != null) {
                    return false;
                }
                String file = getFile();
                String file2 = medalDTO.getFile();
                if (file != null ? !file.equals(file2) : file2 != null) {
                    return false;
                }
                String createTime = getCreateTime();
                String createTime2 = medalDTO.getCreateTime();
                if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
                    return false;
                }
                String updateTime = getUpdateTime();
                String updateTime2 = medalDTO.getUpdateTime();
                return updateTime != null ? updateTime.equals(updateTime2) : updateTime2 == null;
            }

            public Object getActionIcon() {
                return this.actionIcon;
            }

            public Integer getCategory() {
                return this.category;
            }

            public String getCreateTime() {
                return this.createTime;
            }

            public String getFile() {
                return this.file;
            }

            public String getIcon() {
                return this.icon;
            }

            public Integer getId() {
                return this.f34912id;
            }

            public String getName() {
                return this.name;
            }

            public Integer getTarget() {
                return this.target;
            }

            public Integer getType() {
                return this.type;
            }

            public String getUpdateTime() {
                return this.updateTime;
            }

            public int hashCode() {
                Integer id2 = getId();
                int iHashCode = id2 == null ? 43 : id2.hashCode();
                Integer type = getType();
                int iHashCode2 = ((iHashCode + 59) * 59) + (type == null ? 43 : type.hashCode());
                Integer category = getCategory();
                int iHashCode3 = (iHashCode2 * 59) + (category == null ? 43 : category.hashCode());
                Integer target = getTarget();
                int iHashCode4 = (iHashCode3 * 59) + (target == null ? 43 : target.hashCode());
                String name = getName();
                int iHashCode5 = (iHashCode4 * 59) + (name == null ? 43 : name.hashCode());
                String icon = getIcon();
                int iHashCode6 = (iHashCode5 * 59) + (icon == null ? 43 : icon.hashCode());
                Object actionIcon = getActionIcon();
                int iHashCode7 = (iHashCode6 * 59) + (actionIcon == null ? 43 : actionIcon.hashCode());
                String file = getFile();
                int iHashCode8 = (iHashCode7 * 59) + (file == null ? 43 : file.hashCode());
                String createTime = getCreateTime();
                int iHashCode9 = (iHashCode8 * 59) + (createTime == null ? 43 : createTime.hashCode());
                String updateTime = getUpdateTime();
                return (iHashCode9 * 59) + (updateTime != null ? updateTime.hashCode() : 43);
            }

            public void setActionIcon(Object obj) {
                this.actionIcon = obj;
            }

            public void setCategory(Integer num) {
                this.category = num;
            }

            public void setCreateTime(String str) {
                this.createTime = str;
            }

            public void setFile(String str) {
                this.file = str;
            }

            public void setIcon(String str) {
                this.icon = str;
            }

            public void setId(Integer num) {
                this.f34912id = num;
            }

            public void setName(String str) {
                this.name = str;
            }

            public void setTarget(Integer num) {
                this.target = num;
            }

            public void setType(Integer num) {
                this.type = num;
            }

            public void setUpdateTime(String str) {
                this.updateTime = str;
            }

            public String toString() {
                return "UserHomeBean.BadgeDTO.MedalDTO(id=" + getId() + ", name=" + getName() + ", type=" + getType() + ", icon=" + getIcon() + ", actionIcon=" + getActionIcon() + ", file=" + getFile() + ", category=" + getCategory() + ", target=" + getTarget() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ")";
            }
        }

        public boolean canEqual(Object obj) {
            return obj instanceof BadgeDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BadgeDTO)) {
                return false;
            }
            BadgeDTO badgeDTO = (BadgeDTO) obj;
            if (!badgeDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = badgeDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            Integer uid = getUid();
            Integer uid2 = badgeDTO.getUid();
            if (uid != null ? !uid.equals(uid2) : uid2 != null) {
                return false;
            }
            Integer medalId = getMedalId();
            Integer medalId2 = badgeDTO.getMedalId();
            if (medalId != null ? !medalId.equals(medalId2) : medalId2 != null) {
                return false;
            }
            Integer status = getStatus();
            Integer status2 = badgeDTO.getStatus();
            if (status != null ? !status.equals(status2) : status2 != null) {
                return false;
            }
            Integer category = getCategory();
            Integer category2 = badgeDTO.getCategory();
            if (category != null ? !category.equals(category2) : category2 != null) {
                return false;
            }
            Integer schedule = getSchedule();
            Integer schedule2 = badgeDTO.getSchedule();
            if (schedule != null ? !schedule.equals(schedule2) : schedule2 != null) {
                return false;
            }
            Integer target = getTarget();
            Integer target2 = badgeDTO.getTarget();
            if (target != null ? !target.equals(target2) : target2 != null) {
                return false;
            }
            Integer recStatus = getRecStatus();
            Integer recStatus2 = badgeDTO.getRecStatus();
            if (recStatus != null ? !recStatus.equals(recStatus2) : recStatus2 != null) {
                return false;
            }
            String recTime = getRecTime();
            String recTime2 = badgeDTO.getRecTime();
            if (recTime != null ? !recTime.equals(recTime2) : recTime2 != null) {
                return false;
            }
            MedalDTO medal = getMedal();
            MedalDTO medal2 = badgeDTO.getMedal();
            return medal != null ? medal.equals(medal2) : medal2 == null;
        }

        public Integer getCategory() {
            return this.category;
        }

        public Integer getId() {
            return this.f34911id;
        }

        public MedalDTO getMedal() {
            return this.medal;
        }

        public Integer getMedalId() {
            return this.medalId;
        }

        public Integer getRecStatus() {
            return this.recStatus;
        }

        public String getRecTime() {
            return this.recTime;
        }

        public Integer getSchedule() {
            return this.schedule;
        }

        public Integer getStatus() {
            return this.status;
        }

        public Integer getTarget() {
            return this.target;
        }

        public Integer getUid() {
            return this.uid;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer uid = getUid();
            int iHashCode2 = ((iHashCode + 59) * 59) + (uid == null ? 43 : uid.hashCode());
            Integer medalId = getMedalId();
            int iHashCode3 = (iHashCode2 * 59) + (medalId == null ? 43 : medalId.hashCode());
            Integer status = getStatus();
            int iHashCode4 = (iHashCode3 * 59) + (status == null ? 43 : status.hashCode());
            Integer category = getCategory();
            int iHashCode5 = (iHashCode4 * 59) + (category == null ? 43 : category.hashCode());
            Integer schedule = getSchedule();
            int iHashCode6 = (iHashCode5 * 59) + (schedule == null ? 43 : schedule.hashCode());
            Integer target = getTarget();
            int iHashCode7 = (iHashCode6 * 59) + (target == null ? 43 : target.hashCode());
            Integer recStatus = getRecStatus();
            int iHashCode8 = (iHashCode7 * 59) + (recStatus == null ? 43 : recStatus.hashCode());
            String recTime = getRecTime();
            int iHashCode9 = (iHashCode8 * 59) + (recTime == null ? 43 : recTime.hashCode());
            MedalDTO medal = getMedal();
            return (iHashCode9 * 59) + (medal != null ? medal.hashCode() : 43);
        }

        public void setCategory(Integer num) {
            this.category = num;
        }

        public void setId(Integer num) {
            this.f34911id = num;
        }

        public void setMedal(MedalDTO medalDTO) {
            this.medal = medalDTO;
        }

        public void setMedalId(Integer num) {
            this.medalId = num;
        }

        public void setRecStatus(Integer num) {
            this.recStatus = num;
        }

        public void setRecTime(String str) {
            this.recTime = str;
        }

        public void setSchedule(Integer num) {
            this.schedule = num;
        }

        public void setStatus(Integer num) {
            this.status = num;
        }

        public void setTarget(Integer num) {
            this.target = num;
        }

        public void setUid(Integer num) {
            this.uid = num;
        }

        public String toString() {
            return "UserHomeBean.BadgeDTO(id=" + getId() + ", uid=" + getUid() + ", medalId=" + getMedalId() + ", status=" + getStatus() + ", category=" + getCategory() + ", schedule=" + getSchedule() + ", target=" + getTarget() + ", recTime=" + getRecTime() + ", recStatus=" + getRecStatus() + ", medal=" + getMedal() + ")";
        }
    }

    public static class CarsDTO implements Serializable {

        @SerializedName("cate_type")
        private Integer cateType;

        @SerializedName("create_time")
        private String createTime;

        @SerializedName("expire")
        private Integer expire;

        @SerializedName("file_type")
        private String fileType;

        @SerializedName("icon")
        private String icon;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34913id;

        @SerializedName("name")
        private String name;

        @SerializedName("pay_type")
        private Integer payType;

        @SerializedName("price")
        private Integer price;

        @SerializedName("prop_id")
        private Integer propId;

        @SerializedName(o0.CATEGORY_STATUS)
        private Integer status;

        @SerializedName("term")
        private Integer term;

        @SerializedName("title")
        private String title;

        @SerializedName("uid")
        private Integer uid;

        @SerializedName("update_time")
        private String updateTime;

        @SerializedName("url")
        private String url;

        public boolean canEqual(Object obj) {
            return obj instanceof CarsDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CarsDTO)) {
                return false;
            }
            CarsDTO carsDTO = (CarsDTO) obj;
            if (!carsDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = carsDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            Integer uid = getUid();
            Integer uid2 = carsDTO.getUid();
            if (uid != null ? !uid.equals(uid2) : uid2 != null) {
                return false;
            }
            Integer propId = getPropId();
            Integer propId2 = carsDTO.getPropId();
            if (propId != null ? !propId.equals(propId2) : propId2 != null) {
                return false;
            }
            Integer status = getStatus();
            Integer status2 = carsDTO.getStatus();
            if (status != null ? !status.equals(status2) : status2 != null) {
                return false;
            }
            Integer cateType = getCateType();
            Integer cateType2 = carsDTO.getCateType();
            if (cateType != null ? !cateType.equals(cateType2) : cateType2 != null) {
                return false;
            }
            Integer payType = getPayType();
            Integer payType2 = carsDTO.getPayType();
            if (payType != null ? !payType.equals(payType2) : payType2 != null) {
                return false;
            }
            Integer term = getTerm();
            Integer term2 = carsDTO.getTerm();
            if (term != null ? !term.equals(term2) : term2 != null) {
                return false;
            }
            Integer price = getPrice();
            Integer price2 = carsDTO.getPrice();
            if (price != null ? !price.equals(price2) : price2 != null) {
                return false;
            }
            Integer expire = getExpire();
            Integer expire2 = carsDTO.getExpire();
            if (expire != null ? !expire.equals(expire2) : expire2 != null) {
                return false;
            }
            String createTime = getCreateTime();
            String createTime2 = carsDTO.getCreateTime();
            if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
                return false;
            }
            String updateTime = getUpdateTime();
            String updateTime2 = carsDTO.getUpdateTime();
            if (updateTime != null ? !updateTime.equals(updateTime2) : updateTime2 != null) {
                return false;
            }
            String name = getName();
            String name2 = carsDTO.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String title = getTitle();
            String title2 = carsDTO.getTitle();
            if (title != null ? !title.equals(title2) : title2 != null) {
                return false;
            }
            String icon = getIcon();
            String icon2 = carsDTO.getIcon();
            if (icon != null ? !icon.equals(icon2) : icon2 != null) {
                return false;
            }
            String url = getUrl();
            String url2 = carsDTO.getUrl();
            if (url != null ? !url.equals(url2) : url2 != null) {
                return false;
            }
            String fileType = getFileType();
            String fileType2 = carsDTO.getFileType();
            return fileType != null ? fileType.equals(fileType2) : fileType2 == null;
        }

        public Integer getCateType() {
            return this.cateType;
        }

        public String getCreateTime() {
            return this.createTime;
        }

        public Integer getExpire() {
            return this.expire;
        }

        public String getFileType() {
            return this.fileType;
        }

        public String getIcon() {
            return this.icon;
        }

        public Integer getId() {
            return this.f34913id;
        }

        public String getName() {
            return this.name;
        }

        public Integer getPayType() {
            return this.payType;
        }

        public Integer getPrice() {
            return this.price;
        }

        public Integer getPropId() {
            return this.propId;
        }

        public Integer getStatus() {
            return this.status;
        }

        public Integer getTerm() {
            return this.term;
        }

        public String getTitle() {
            return this.title;
        }

        public Integer getUid() {
            return this.uid;
        }

        public String getUpdateTime() {
            return this.updateTime;
        }

        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer uid = getUid();
            int iHashCode2 = ((iHashCode + 59) * 59) + (uid == null ? 43 : uid.hashCode());
            Integer propId = getPropId();
            int iHashCode3 = (iHashCode2 * 59) + (propId == null ? 43 : propId.hashCode());
            Integer status = getStatus();
            int iHashCode4 = (iHashCode3 * 59) + (status == null ? 43 : status.hashCode());
            Integer cateType = getCateType();
            int iHashCode5 = (iHashCode4 * 59) + (cateType == null ? 43 : cateType.hashCode());
            Integer payType = getPayType();
            int iHashCode6 = (iHashCode5 * 59) + (payType == null ? 43 : payType.hashCode());
            Integer term = getTerm();
            int iHashCode7 = (iHashCode6 * 59) + (term == null ? 43 : term.hashCode());
            Integer price = getPrice();
            int iHashCode8 = (iHashCode7 * 59) + (price == null ? 43 : price.hashCode());
            Integer expire = getExpire();
            int iHashCode9 = (iHashCode8 * 59) + (expire == null ? 43 : expire.hashCode());
            String createTime = getCreateTime();
            int iHashCode10 = (iHashCode9 * 59) + (createTime == null ? 43 : createTime.hashCode());
            String updateTime = getUpdateTime();
            int iHashCode11 = (iHashCode10 * 59) + (updateTime == null ? 43 : updateTime.hashCode());
            String name = getName();
            int iHashCode12 = (iHashCode11 * 59) + (name == null ? 43 : name.hashCode());
            String title = getTitle();
            int iHashCode13 = (iHashCode12 * 59) + (title == null ? 43 : title.hashCode());
            String icon = getIcon();
            int iHashCode14 = (iHashCode13 * 59) + (icon == null ? 43 : icon.hashCode());
            String url = getUrl();
            int iHashCode15 = (iHashCode14 * 59) + (url == null ? 43 : url.hashCode());
            String fileType = getFileType();
            return (iHashCode15 * 59) + (fileType != null ? fileType.hashCode() : 43);
        }

        public void setCateType(Integer num) {
            this.cateType = num;
        }

        public void setCreateTime(String str) {
            this.createTime = str;
        }

        public void setExpire(Integer num) {
            this.expire = num;
        }

        public void setFileType(String str) {
            this.fileType = str;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setId(Integer num) {
            this.f34913id = num;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPayType(Integer num) {
            this.payType = num;
        }

        public void setPrice(Integer num) {
            this.price = num;
        }

        public void setPropId(Integer num) {
            this.propId = num;
        }

        public void setStatus(Integer num) {
            this.status = num;
        }

        public void setTerm(Integer num) {
            this.term = num;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setUid(Integer num) {
            this.uid = num;
        }

        public void setUpdateTime(String str) {
            this.updateTime = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public String toString() {
            return "UserHomeBean.CarsDTO(id=" + getId() + ", uid=" + getUid() + ", propId=" + getPropId() + ", status=" + getStatus() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ", cateType=" + getCateType() + ", name=" + getName() + ", title=" + getTitle() + ", payType=" + getPayType() + ", icon=" + getIcon() + ", url=" + getUrl() + ", fileType=" + getFileType() + ", term=" + getTerm() + ", price=" + getPrice() + ", expire=" + getExpire() + ")";
        }
    }

    public static class CpDTO implements Serializable {

        @SerializedName("cp")
        private List<CpTowDTO> cp;

        @SerializedName("fp")
        private List<CpTowDTO> fp;

        public boolean canEqual(Object obj) {
            return obj instanceof CpDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CpDTO)) {
                return false;
            }
            CpDTO cpDTO = (CpDTO) obj;
            if (!cpDTO.canEqual(this)) {
                return false;
            }
            List<CpTowDTO> cp = getCp();
            List<CpTowDTO> cp2 = cpDTO.getCp();
            if (cp != null ? !cp.equals(cp2) : cp2 != null) {
                return false;
            }
            List<CpTowDTO> fp = getFp();
            List<CpTowDTO> fp2 = cpDTO.getFp();
            return fp != null ? fp.equals(fp2) : fp2 == null;
        }

        public List<CpTowDTO> getCp() {
            return this.cp;
        }

        public List<CpTowDTO> getFp() {
            return this.fp;
        }

        public int hashCode() {
            List<CpTowDTO> cp = getCp();
            int iHashCode = cp == null ? 43 : cp.hashCode();
            List<CpTowDTO> fp = getFp();
            return ((iHashCode + 59) * 59) + (fp != null ? fp.hashCode() : 43);
        }

        public void setCp(List<CpTowDTO> list) {
            this.cp = list;
        }

        public void setFp(List<CpTowDTO> list) {
            this.fp = list;
        }

        public String toString() {
            return "UserHomeBean.CpDTO(cp=" + getCp() + ", fp=" + getFp() + ")";
        }
    }

    public static class CpTowDTO implements Serializable {

        @SerializedName("cp_file")
        private String cpFile;

        @SerializedName("fp_file")
        private String fpFile;

        @SerializedName("level")
        private LevelCpDTO level;

        @SerializedName("type")
        private Integer type;

        @SerializedName("to_user_info")
        private UserCpDTO userInfo;

        public boolean canEqual(Object obj) {
            return obj instanceof CpTowDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CpTowDTO)) {
                return false;
            }
            CpTowDTO cpTowDTO = (CpTowDTO) obj;
            if (!cpTowDTO.canEqual(this)) {
                return false;
            }
            Integer type = getType();
            Integer type2 = cpTowDTO.getType();
            if (type != null ? !type.equals(type2) : type2 != null) {
                return false;
            }
            UserCpDTO userInfo = getUserInfo();
            UserCpDTO userInfo2 = cpTowDTO.getUserInfo();
            if (userInfo != null ? !userInfo.equals(userInfo2) : userInfo2 != null) {
                return false;
            }
            LevelCpDTO level = getLevel();
            LevelCpDTO level2 = cpTowDTO.getLevel();
            if (level != null ? !level.equals(level2) : level2 != null) {
                return false;
            }
            String cpFile = getCpFile();
            String cpFile2 = cpTowDTO.getCpFile();
            if (cpFile != null ? !cpFile.equals(cpFile2) : cpFile2 != null) {
                return false;
            }
            String fpFile = getFpFile();
            String fpFile2 = cpTowDTO.getFpFile();
            return fpFile != null ? fpFile.equals(fpFile2) : fpFile2 == null;
        }

        public String getCpFile() {
            return this.cpFile;
        }

        public String getFpFile() {
            return this.fpFile;
        }

        public LevelCpDTO getLevel() {
            return this.level;
        }

        public Integer getType() {
            return this.type;
        }

        public UserCpDTO getUserInfo() {
            return this.userInfo;
        }

        public int hashCode() {
            Integer type = getType();
            int iHashCode = type == null ? 43 : type.hashCode();
            UserCpDTO userInfo = getUserInfo();
            int iHashCode2 = ((iHashCode + 59) * 59) + (userInfo == null ? 43 : userInfo.hashCode());
            LevelCpDTO level = getLevel();
            int iHashCode3 = (iHashCode2 * 59) + (level == null ? 43 : level.hashCode());
            String cpFile = getCpFile();
            int iHashCode4 = (iHashCode3 * 59) + (cpFile == null ? 43 : cpFile.hashCode());
            String fpFile = getFpFile();
            return (iHashCode4 * 59) + (fpFile != null ? fpFile.hashCode() : 43);
        }

        public void setCpFile(String str) {
            this.cpFile = str;
        }

        public void setFpFile(String str) {
            this.fpFile = str;
        }

        public void setLevel(LevelCpDTO levelCpDTO) {
            this.level = levelCpDTO;
        }

        public void setType(Integer num) {
            this.type = num;
        }

        public void setUserInfo(UserCpDTO userCpDTO) {
            this.userInfo = userCpDTO;
        }

        public String toString() {
            return "UserHomeBean.CpTowDTO(type=" + getType() + ", userInfo=" + getUserInfo() + ", level=" + getLevel() + ", cpFile=" + getCpFile() + ", fpFile=" + getFpFile() + ")";
        }
    }

    public static class FamilyInfoDTO implements Serializable {

        @SerializedName("family_avatar")
        private String familyAvatar;

        @SerializedName("family_badge")
        private String familyBadge;

        @SerializedName("family_briefing")
        private String familyBriefing;

        @SerializedName("family_id")
        private Integer familyId;

        @SerializedName("family_member_cnt")
        private Integer familyMemberCnt;

        @SerializedName("family_member_join_cnt")
        private Integer familyMemberJoinCnt;

        @SerializedName("family_name")
        private String familyName;

        @SerializedName("is_family")
        private Integer isFamily;

        @SerializedName("is_family_admin")
        private Integer isFamilyAdmin;

        @SerializedName("join_level")
        private Integer joinLevel;

        public boolean canEqual(Object obj) {
            return obj instanceof FamilyInfoDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FamilyInfoDTO)) {
                return false;
            }
            FamilyInfoDTO familyInfoDTO = (FamilyInfoDTO) obj;
            if (!familyInfoDTO.canEqual(this)) {
                return false;
            }
            Integer isFamily = getIsFamily();
            Integer isFamily2 = familyInfoDTO.getIsFamily();
            if (isFamily != null ? !isFamily.equals(isFamily2) : isFamily2 != null) {
                return false;
            }
            Integer familyId = getFamilyId();
            Integer familyId2 = familyInfoDTO.getFamilyId();
            if (familyId != null ? !familyId.equals(familyId2) : familyId2 != null) {
                return false;
            }
            Integer isFamilyAdmin = getIsFamilyAdmin();
            Integer isFamilyAdmin2 = familyInfoDTO.getIsFamilyAdmin();
            if (isFamilyAdmin != null ? !isFamilyAdmin.equals(isFamilyAdmin2) : isFamilyAdmin2 != null) {
                return false;
            }
            Integer familyMemberCnt = getFamilyMemberCnt();
            Integer familyMemberCnt2 = familyInfoDTO.getFamilyMemberCnt();
            if (familyMemberCnt != null ? !familyMemberCnt.equals(familyMemberCnt2) : familyMemberCnt2 != null) {
                return false;
            }
            Integer joinLevel = getJoinLevel();
            Integer joinLevel2 = familyInfoDTO.getJoinLevel();
            if (joinLevel != null ? !joinLevel.equals(joinLevel2) : joinLevel2 != null) {
                return false;
            }
            Integer familyMemberJoinCnt = getFamilyMemberJoinCnt();
            Integer familyMemberJoinCnt2 = familyInfoDTO.getFamilyMemberJoinCnt();
            if (familyMemberJoinCnt != null ? !familyMemberJoinCnt.equals(familyMemberJoinCnt2) : familyMemberJoinCnt2 != null) {
                return false;
            }
            String familyName = getFamilyName();
            String familyName2 = familyInfoDTO.getFamilyName();
            if (familyName != null ? !familyName.equals(familyName2) : familyName2 != null) {
                return false;
            }
            String familyAvatar = getFamilyAvatar();
            String familyAvatar2 = familyInfoDTO.getFamilyAvatar();
            if (familyAvatar != null ? !familyAvatar.equals(familyAvatar2) : familyAvatar2 != null) {
                return false;
            }
            String familyBadge = getFamilyBadge();
            String familyBadge2 = familyInfoDTO.getFamilyBadge();
            if (familyBadge != null ? !familyBadge.equals(familyBadge2) : familyBadge2 != null) {
                return false;
            }
            String familyBriefing = getFamilyBriefing();
            String familyBriefing2 = familyInfoDTO.getFamilyBriefing();
            return familyBriefing != null ? familyBriefing.equals(familyBriefing2) : familyBriefing2 == null;
        }

        public String getFamilyAvatar() {
            return this.familyAvatar;
        }

        public String getFamilyBadge() {
            return this.familyBadge;
        }

        public String getFamilyBriefing() {
            return this.familyBriefing;
        }

        public Integer getFamilyId() {
            return this.familyId;
        }

        public Integer getFamilyMemberCnt() {
            return this.familyMemberCnt;
        }

        public Integer getFamilyMemberJoinCnt() {
            return this.familyMemberJoinCnt;
        }

        public String getFamilyName() {
            return this.familyName;
        }

        public Integer getIsFamily() {
            return this.isFamily;
        }

        public Integer getIsFamilyAdmin() {
            return this.isFamilyAdmin;
        }

        public Integer getJoinLevel() {
            return this.joinLevel;
        }

        public int hashCode() {
            Integer isFamily = getIsFamily();
            int iHashCode = isFamily == null ? 43 : isFamily.hashCode();
            Integer familyId = getFamilyId();
            int iHashCode2 = ((iHashCode + 59) * 59) + (familyId == null ? 43 : familyId.hashCode());
            Integer isFamilyAdmin = getIsFamilyAdmin();
            int iHashCode3 = (iHashCode2 * 59) + (isFamilyAdmin == null ? 43 : isFamilyAdmin.hashCode());
            Integer familyMemberCnt = getFamilyMemberCnt();
            int iHashCode4 = (iHashCode3 * 59) + (familyMemberCnt == null ? 43 : familyMemberCnt.hashCode());
            Integer joinLevel = getJoinLevel();
            int iHashCode5 = (iHashCode4 * 59) + (joinLevel == null ? 43 : joinLevel.hashCode());
            Integer familyMemberJoinCnt = getFamilyMemberJoinCnt();
            int iHashCode6 = (iHashCode5 * 59) + (familyMemberJoinCnt == null ? 43 : familyMemberJoinCnt.hashCode());
            String familyName = getFamilyName();
            int iHashCode7 = (iHashCode6 * 59) + (familyName == null ? 43 : familyName.hashCode());
            String familyAvatar = getFamilyAvatar();
            int iHashCode8 = (iHashCode7 * 59) + (familyAvatar == null ? 43 : familyAvatar.hashCode());
            String familyBadge = getFamilyBadge();
            int iHashCode9 = (iHashCode8 * 59) + (familyBadge == null ? 43 : familyBadge.hashCode());
            String familyBriefing = getFamilyBriefing();
            return (iHashCode9 * 59) + (familyBriefing != null ? familyBriefing.hashCode() : 43);
        }

        public void setFamilyAvatar(String str) {
            this.familyAvatar = str;
        }

        public void setFamilyBadge(String str) {
            this.familyBadge = str;
        }

        public void setFamilyBriefing(String str) {
            this.familyBriefing = str;
        }

        public void setFamilyId(Integer num) {
            this.familyId = num;
        }

        public void setFamilyMemberCnt(Integer num) {
            this.familyMemberCnt = num;
        }

        public void setFamilyMemberJoinCnt(Integer num) {
            this.familyMemberJoinCnt = num;
        }

        public void setFamilyName(String str) {
            this.familyName = str;
        }

        public void setIsFamily(Integer num) {
            this.isFamily = num;
        }

        public void setIsFamilyAdmin(Integer num) {
            this.isFamilyAdmin = num;
        }

        public void setJoinLevel(Integer num) {
            this.joinLevel = num;
        }

        public String toString() {
            return "UserHomeBean.FamilyInfoDTO(isFamily=" + getIsFamily() + ", familyId=" + getFamilyId() + ", familyName=" + getFamilyName() + ", familyAvatar=" + getFamilyAvatar() + ", familyBadge=" + getFamilyBadge() + ", familyBriefing=" + getFamilyBriefing() + ", isFamilyAdmin=" + getIsFamilyAdmin() + ", familyMemberCnt=" + getFamilyMemberCnt() + ", joinLevel=" + getJoinLevel() + ", familyMemberJoinCnt=" + getFamilyMemberJoinCnt() + ")";
        }
    }

    public static class GiftsDTO implements Serializable {

        @SerializedName("gift_id")
        private Integer giftId;

        @SerializedName("gifticon")
        private String gifticon;

        @SerializedName("giftname")
        private String giftname;

        @SerializedName("total")
        private String total;

        @SerializedName("total_num")
        private String totalNum;

        public boolean canEqual(Object obj) {
            return obj instanceof GiftsDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GiftsDTO)) {
                return false;
            }
            GiftsDTO giftsDTO = (GiftsDTO) obj;
            if (!giftsDTO.canEqual(this)) {
                return false;
            }
            Integer giftId = getGiftId();
            Integer giftId2 = giftsDTO.getGiftId();
            if (giftId != null ? !giftId.equals(giftId2) : giftId2 != null) {
                return false;
            }
            String totalNum = getTotalNum();
            String totalNum2 = giftsDTO.getTotalNum();
            if (totalNum != null ? !totalNum.equals(totalNum2) : totalNum2 != null) {
                return false;
            }
            String total = getTotal();
            String total2 = giftsDTO.getTotal();
            if (total != null ? !total.equals(total2) : total2 != null) {
                return false;
            }
            String gifticon = getGifticon();
            String gifticon2 = giftsDTO.getGifticon();
            if (gifticon != null ? !gifticon.equals(gifticon2) : gifticon2 != null) {
                return false;
            }
            String giftname = getGiftname();
            String giftname2 = giftsDTO.getGiftname();
            return giftname != null ? giftname.equals(giftname2) : giftname2 == null;
        }

        public Integer getGiftId() {
            return this.giftId;
        }

        public String getGifticon() {
            return this.gifticon;
        }

        public String getGiftname() {
            return this.giftname;
        }

        public String getTotal() {
            return this.total;
        }

        public String getTotalNum() {
            return this.totalNum;
        }

        public int hashCode() {
            Integer giftId = getGiftId();
            int iHashCode = giftId == null ? 43 : giftId.hashCode();
            String totalNum = getTotalNum();
            int iHashCode2 = ((iHashCode + 59) * 59) + (totalNum == null ? 43 : totalNum.hashCode());
            String total = getTotal();
            int iHashCode3 = (iHashCode2 * 59) + (total == null ? 43 : total.hashCode());
            String gifticon = getGifticon();
            int iHashCode4 = (iHashCode3 * 59) + (gifticon == null ? 43 : gifticon.hashCode());
            String giftname = getGiftname();
            return (iHashCode4 * 59) + (giftname != null ? giftname.hashCode() : 43);
        }

        public void setGiftId(Integer num) {
            this.giftId = num;
        }

        public void setGifticon(String str) {
            this.gifticon = str;
        }

        public void setGiftname(String str) {
            this.giftname = str;
        }

        public void setTotal(String str) {
            this.total = str;
        }

        public void setTotalNum(String str) {
            this.totalNum = str;
        }

        public String toString() {
            return "UserHomeBean.GiftsDTO(giftId=" + getGiftId() + ", totalNum=" + getTotalNum() + ", total=" + getTotal() + ", gifticon=" + getGifticon() + ", giftname=" + getGiftname() + ")";
        }
    }

    public static class HomeDressDTO implements Serializable {

        @SerializedName("file_type")
        private String fileType;

        @SerializedName("icon")
        private String icon;

        @SerializedName("url")
        private String url;

        public boolean canEqual(Object obj) {
            return obj instanceof HomeDressDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeDressDTO)) {
                return false;
            }
            HomeDressDTO homeDressDTO = (HomeDressDTO) obj;
            if (!homeDressDTO.canEqual(this)) {
                return false;
            }
            String icon = getIcon();
            String icon2 = homeDressDTO.getIcon();
            if (icon != null ? !icon.equals(icon2) : icon2 != null) {
                return false;
            }
            String url = getUrl();
            String url2 = homeDressDTO.getUrl();
            if (url != null ? !url.equals(url2) : url2 != null) {
                return false;
            }
            String fileType = getFileType();
            String fileType2 = homeDressDTO.getFileType();
            return fileType != null ? fileType.equals(fileType2) : fileType2 == null;
        }

        public String getFileType() {
            return this.fileType;
        }

        public String getIcon() {
            return this.icon;
        }

        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String icon = getIcon();
            int iHashCode = icon == null ? 43 : icon.hashCode();
            String url = getUrl();
            int iHashCode2 = ((iHashCode + 59) * 59) + (url == null ? 43 : url.hashCode());
            String fileType = getFileType();
            return (iHashCode2 * 59) + (fileType != null ? fileType.hashCode() : 43);
        }

        public void setFileType(String str) {
            this.fileType = str;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public String toString() {
            return "UserHomeBean.HomeDressDTO(icon=" + getIcon() + ", url=" + getUrl() + ", fileType=" + getFileType() + ")";
        }
    }

    public static class LevelCpDTO implements Serializable {

        @SerializedName("exp")
        private Long exp;

        @SerializedName("level")
        private Integer level;

        @SerializedName("next_exp")
        private Long nextExp;

        @SerializedName("next_level")
        private Integer nextLevel;

        @SerializedName("progress")
        private Integer progress;

        public boolean canEqual(Object obj) {
            return obj instanceof LevelCpDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LevelCpDTO)) {
                return false;
            }
            LevelCpDTO levelCpDTO = (LevelCpDTO) obj;
            if (!levelCpDTO.canEqual(this)) {
                return false;
            }
            Integer level = getLevel();
            Integer level2 = levelCpDTO.getLevel();
            if (level != null ? !level.equals(level2) : level2 != null) {
                return false;
            }
            Integer nextLevel = getNextLevel();
            Integer nextLevel2 = levelCpDTO.getNextLevel();
            if (nextLevel != null ? !nextLevel.equals(nextLevel2) : nextLevel2 != null) {
                return false;
            }
            Long exp = getExp();
            Long exp2 = levelCpDTO.getExp();
            if (exp != null ? !exp.equals(exp2) : exp2 != null) {
                return false;
            }
            Long nextExp = getNextExp();
            Long nextExp2 = levelCpDTO.getNextExp();
            if (nextExp != null ? !nextExp.equals(nextExp2) : nextExp2 != null) {
                return false;
            }
            Integer progress = getProgress();
            Integer progress2 = levelCpDTO.getProgress();
            return progress != null ? progress.equals(progress2) : progress2 == null;
        }

        public Long getExp() {
            return this.exp;
        }

        public Integer getLevel() {
            return this.level;
        }

        public Long getNextExp() {
            return this.nextExp;
        }

        public Integer getNextLevel() {
            return this.nextLevel;
        }

        public Integer getProgress() {
            return this.progress;
        }

        public int hashCode() {
            Integer level = getLevel();
            int iHashCode = level == null ? 43 : level.hashCode();
            Integer nextLevel = getNextLevel();
            int iHashCode2 = ((iHashCode + 59) * 59) + (nextLevel == null ? 43 : nextLevel.hashCode());
            Long exp = getExp();
            int iHashCode3 = (iHashCode2 * 59) + (exp == null ? 43 : exp.hashCode());
            Long nextExp = getNextExp();
            int iHashCode4 = (iHashCode3 * 59) + (nextExp == null ? 43 : nextExp.hashCode());
            Integer progress = getProgress();
            return (iHashCode4 * 59) + (progress != null ? progress.hashCode() : 43);
        }

        public void setExp(Long l10) {
            this.exp = l10;
        }

        public void setLevel(Integer num) {
            this.level = num;
        }

        public void setNextExp(Long l10) {
            this.nextExp = l10;
        }

        public void setNextLevel(Integer num) {
            this.nextLevel = num;
        }

        public void setProgress(Integer num) {
            this.progress = num;
        }

        public String toString() {
            return "UserHomeBean.LevelCpDTO(level=" + getLevel() + ", nextLevel=" + getNextLevel() + ", exp=" + getExp() + ", nextExp=" + getNextExp() + ", progress=" + getProgress() + ")";
        }
    }

    public static class PkDTO implements Serializable {

        @SerializedName("pk_level")
        private Integer pkLevel;

        @SerializedName("pk_rank")
        private String pkRank;

        @SerializedName("score")
        private Integer score;

        public boolean canEqual(Object obj) {
            return obj instanceof PkDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PkDTO)) {
                return false;
            }
            PkDTO pkDTO = (PkDTO) obj;
            if (!pkDTO.canEqual(this)) {
                return false;
            }
            Integer pkLevel = getPkLevel();
            Integer pkLevel2 = pkDTO.getPkLevel();
            if (pkLevel != null ? !pkLevel.equals(pkLevel2) : pkLevel2 != null) {
                return false;
            }
            Integer score = getScore();
            Integer score2 = pkDTO.getScore();
            if (score != null ? !score.equals(score2) : score2 != null) {
                return false;
            }
            String pkRank = getPkRank();
            String pkRank2 = pkDTO.getPkRank();
            return pkRank != null ? pkRank.equals(pkRank2) : pkRank2 == null;
        }

        public Integer getPkLevel() {
            return this.pkLevel;
        }

        public String getPkRank() {
            return this.pkRank;
        }

        public Integer getScore() {
            return this.score;
        }

        public int hashCode() {
            Integer pkLevel = getPkLevel();
            int iHashCode = pkLevel == null ? 43 : pkLevel.hashCode();
            Integer score = getScore();
            int iHashCode2 = ((iHashCode + 59) * 59) + (score == null ? 43 : score.hashCode());
            String pkRank = getPkRank();
            return (iHashCode2 * 59) + (pkRank != null ? pkRank.hashCode() : 43);
        }

        public void setPkLevel(Integer num) {
            this.pkLevel = num;
        }

        public void setPkRank(String str) {
            this.pkRank = str;
        }

        public void setScore(Integer num) {
            this.score = num;
        }

        public String toString() {
            return "UserHomeBean.PkDTO(pkLevel=" + getPkLevel() + ", pkRank=" + getPkRank() + ", score=" + getScore() + ")";
        }
    }

    public static class TagsDTO implements Serializable {

        @SerializedName("tag")
        private String tag;

        public boolean canEqual(Object obj) {
            return obj instanceof TagsDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TagsDTO)) {
                return false;
            }
            TagsDTO tagsDTO = (TagsDTO) obj;
            if (!tagsDTO.canEqual(this)) {
                return false;
            }
            String tag = getTag();
            String tag2 = tagsDTO.getTag();
            return tag != null ? tag.equals(tag2) : tag2 == null;
        }

        public String getTag() {
            return this.tag;
        }

        public int hashCode() {
            String tag = getTag();
            return 59 + (tag == null ? 43 : tag.hashCode());
        }

        public void setTag(String str) {
            this.tag = str;
        }

        public String toString() {
            return "UserHomeBean.TagsDTO(tag=" + getTag() + ")";
        }
    }

    public static class UserCpDTO implements Serializable {

        @SerializedName("age")
        private Integer age;

        @SerializedName("anchor_level")
        private Integer anchorLevel;

        @SerializedName("avatar")
        private String avatar;

        @SerializedName("avatar_frame")
        private String avatarFrame;

        @SerializedName("cp_total")
        private String cpTotal;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34914id;

        @SerializedName("level")
        private Integer level;

        @SerializedName("nickname")
        private String nickname;

        @SerializedName("online_roomid")
        private Integer onlineRoomid;

        @SerializedName("sex")
        private Integer sex;

        @SerializedName("vip_level")
        private Integer vipLevel;

        public boolean canEqual(Object obj) {
            return obj instanceof UserCpDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserCpDTO)) {
                return false;
            }
            UserCpDTO userCpDTO = (UserCpDTO) obj;
            if (!userCpDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = userCpDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            Integer sex = getSex();
            Integer sex2 = userCpDTO.getSex();
            if (sex != null ? !sex.equals(sex2) : sex2 != null) {
                return false;
            }
            Integer age = getAge();
            Integer age2 = userCpDTO.getAge();
            if (age != null ? !age.equals(age2) : age2 != null) {
                return false;
            }
            Integer level = getLevel();
            Integer level2 = userCpDTO.getLevel();
            if (level != null ? !level.equals(level2) : level2 != null) {
                return false;
            }
            Integer anchorLevel = getAnchorLevel();
            Integer anchorLevel2 = userCpDTO.getAnchorLevel();
            if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
                return false;
            }
            Integer onlineRoomid = getOnlineRoomid();
            Integer onlineRoomid2 = userCpDTO.getOnlineRoomid();
            if (onlineRoomid != null ? !onlineRoomid.equals(onlineRoomid2) : onlineRoomid2 != null) {
                return false;
            }
            Integer vipLevel = getVipLevel();
            Integer vipLevel2 = userCpDTO.getVipLevel();
            if (vipLevel != null ? !vipLevel.equals(vipLevel2) : vipLevel2 != null) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = userCpDTO.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = userCpDTO.getAvatar();
            if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
                return false;
            }
            String avatarFrame = getAvatarFrame();
            String avatarFrame2 = userCpDTO.getAvatarFrame();
            if (avatarFrame != null ? !avatarFrame.equals(avatarFrame2) : avatarFrame2 != null) {
                return false;
            }
            String cpTotal = getCpTotal();
            String cpTotal2 = userCpDTO.getCpTotal();
            return cpTotal != null ? cpTotal.equals(cpTotal2) : cpTotal2 == null;
        }

        public Integer getAge() {
            return this.age;
        }

        public Integer getAnchorLevel() {
            return this.anchorLevel;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public String getAvatarFrame() {
            return this.avatarFrame;
        }

        public String getCpTotal() {
            return this.cpTotal;
        }

        public Integer getId() {
            return this.f34914id;
        }

        public Integer getLevel() {
            return this.level;
        }

        public String getNickname() {
            return this.nickname;
        }

        public Integer getOnlineRoomid() {
            return this.onlineRoomid;
        }

        public Integer getSex() {
            return this.sex;
        }

        public Integer getVipLevel() {
            return this.vipLevel;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer sex = getSex();
            int iHashCode2 = ((iHashCode + 59) * 59) + (sex == null ? 43 : sex.hashCode());
            Integer age = getAge();
            int iHashCode3 = (iHashCode2 * 59) + (age == null ? 43 : age.hashCode());
            Integer level = getLevel();
            int iHashCode4 = (iHashCode3 * 59) + (level == null ? 43 : level.hashCode());
            Integer anchorLevel = getAnchorLevel();
            int iHashCode5 = (iHashCode4 * 59) + (anchorLevel == null ? 43 : anchorLevel.hashCode());
            Integer onlineRoomid = getOnlineRoomid();
            int iHashCode6 = (iHashCode5 * 59) + (onlineRoomid == null ? 43 : onlineRoomid.hashCode());
            Integer vipLevel = getVipLevel();
            int iHashCode7 = (iHashCode6 * 59) + (vipLevel == null ? 43 : vipLevel.hashCode());
            String nickname = getNickname();
            int iHashCode8 = (iHashCode7 * 59) + (nickname == null ? 43 : nickname.hashCode());
            String avatar = getAvatar();
            int iHashCode9 = (iHashCode8 * 59) + (avatar == null ? 43 : avatar.hashCode());
            String avatarFrame = getAvatarFrame();
            int iHashCode10 = (iHashCode9 * 59) + (avatarFrame == null ? 43 : avatarFrame.hashCode());
            String cpTotal = getCpTotal();
            return (iHashCode10 * 59) + (cpTotal != null ? cpTotal.hashCode() : 43);
        }

        public void setAge(Integer num) {
            this.age = num;
        }

        public void setAnchorLevel(Integer num) {
            this.anchorLevel = num;
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setAvatarFrame(String str) {
            this.avatarFrame = str;
        }

        public void setCpTotal(String str) {
            this.cpTotal = str;
        }

        public void setId(Integer num) {
            this.f34914id = num;
        }

        public void setLevel(Integer num) {
            this.level = num;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public void setOnlineRoomid(Integer num) {
            this.onlineRoomid = num;
        }

        public void setSex(Integer num) {
            this.sex = num;
        }

        public void setVipLevel(Integer num) {
            this.vipLevel = num;
        }

        public String toString() {
            return "UserHomeBean.UserCpDTO(id=" + getId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", sex=" + getSex() + ", age=" + getAge() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ", onlineRoomid=" + getOnlineRoomid() + ", vipLevel=" + getVipLevel() + ", avatarFrame=" + getAvatarFrame() + ", cpTotal=" + getCpTotal() + ")";
        }
    }

    public static class UserShouhuDTO implements Serializable {

        @SerializedName("age")
        private Integer age;

        @SerializedName("anchor_level")
        private Integer anchorLevel;

        @SerializedName("avatar")
        private String avatar;

        @SerializedName("avatar_frame")
        private String avatarFrame;

        @SerializedName("cp_total")
        private String cpTotal;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34915id;

        @SerializedName("level")
        private Integer level;

        @SerializedName("nickname")
        private String nickname;

        @SerializedName("online_roomid")
        private Integer onlineRoomid;

        @SerializedName("sex")
        private Integer sex;

        @SerializedName("vip_level")
        private Integer vipLevel;

        public boolean canEqual(Object obj) {
            return obj instanceof UserShouhuDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserShouhuDTO)) {
                return false;
            }
            UserShouhuDTO userShouhuDTO = (UserShouhuDTO) obj;
            if (!userShouhuDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = userShouhuDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            Integer sex = getSex();
            Integer sex2 = userShouhuDTO.getSex();
            if (sex != null ? !sex.equals(sex2) : sex2 != null) {
                return false;
            }
            Integer age = getAge();
            Integer age2 = userShouhuDTO.getAge();
            if (age != null ? !age.equals(age2) : age2 != null) {
                return false;
            }
            Integer level = getLevel();
            Integer level2 = userShouhuDTO.getLevel();
            if (level != null ? !level.equals(level2) : level2 != null) {
                return false;
            }
            Integer anchorLevel = getAnchorLevel();
            Integer anchorLevel2 = userShouhuDTO.getAnchorLevel();
            if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
                return false;
            }
            Integer onlineRoomid = getOnlineRoomid();
            Integer onlineRoomid2 = userShouhuDTO.getOnlineRoomid();
            if (onlineRoomid != null ? !onlineRoomid.equals(onlineRoomid2) : onlineRoomid2 != null) {
                return false;
            }
            Integer vipLevel = getVipLevel();
            Integer vipLevel2 = userShouhuDTO.getVipLevel();
            if (vipLevel != null ? !vipLevel.equals(vipLevel2) : vipLevel2 != null) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = userShouhuDTO.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = userShouhuDTO.getAvatar();
            if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
                return false;
            }
            String avatarFrame = getAvatarFrame();
            String avatarFrame2 = userShouhuDTO.getAvatarFrame();
            if (avatarFrame != null ? !avatarFrame.equals(avatarFrame2) : avatarFrame2 != null) {
                return false;
            }
            String cpTotal = getCpTotal();
            String cpTotal2 = userShouhuDTO.getCpTotal();
            return cpTotal != null ? cpTotal.equals(cpTotal2) : cpTotal2 == null;
        }

        public Integer getAge() {
            return this.age;
        }

        public Integer getAnchorLevel() {
            return this.anchorLevel;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public String getAvatarFrame() {
            return this.avatarFrame;
        }

        public String getCpTotal() {
            return this.cpTotal;
        }

        public Integer getId() {
            return this.f34915id;
        }

        public Integer getLevel() {
            return this.level;
        }

        public String getNickname() {
            return this.nickname;
        }

        public Integer getOnlineRoomid() {
            return this.onlineRoomid;
        }

        public Integer getSex() {
            return this.sex;
        }

        public Integer getVipLevel() {
            return this.vipLevel;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer sex = getSex();
            int iHashCode2 = ((iHashCode + 59) * 59) + (sex == null ? 43 : sex.hashCode());
            Integer age = getAge();
            int iHashCode3 = (iHashCode2 * 59) + (age == null ? 43 : age.hashCode());
            Integer level = getLevel();
            int iHashCode4 = (iHashCode3 * 59) + (level == null ? 43 : level.hashCode());
            Integer anchorLevel = getAnchorLevel();
            int iHashCode5 = (iHashCode4 * 59) + (anchorLevel == null ? 43 : anchorLevel.hashCode());
            Integer onlineRoomid = getOnlineRoomid();
            int iHashCode6 = (iHashCode5 * 59) + (onlineRoomid == null ? 43 : onlineRoomid.hashCode());
            Integer vipLevel = getVipLevel();
            int iHashCode7 = (iHashCode6 * 59) + (vipLevel == null ? 43 : vipLevel.hashCode());
            String nickname = getNickname();
            int iHashCode8 = (iHashCode7 * 59) + (nickname == null ? 43 : nickname.hashCode());
            String avatar = getAvatar();
            int iHashCode9 = (iHashCode8 * 59) + (avatar == null ? 43 : avatar.hashCode());
            String avatarFrame = getAvatarFrame();
            int iHashCode10 = (iHashCode9 * 59) + (avatarFrame == null ? 43 : avatarFrame.hashCode());
            String cpTotal = getCpTotal();
            return (iHashCode10 * 59) + (cpTotal != null ? cpTotal.hashCode() : 43);
        }

        public void setAge(Integer num) {
            this.age = num;
        }

        public void setAnchorLevel(Integer num) {
            this.anchorLevel = num;
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setAvatarFrame(String str) {
            this.avatarFrame = str;
        }

        public void setCpTotal(String str) {
            this.cpTotal = str;
        }

        public void setId(Integer num) {
            this.f34915id = num;
        }

        public void setLevel(Integer num) {
            this.level = num;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public void setOnlineRoomid(Integer num) {
            this.onlineRoomid = num;
        }

        public void setSex(Integer num) {
            this.sex = num;
        }

        public void setVipLevel(Integer num) {
            this.vipLevel = num;
        }

        public String toString() {
            return "UserHomeBean.UserShouhuDTO(id=" + getId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", sex=" + getSex() + ", age=" + getAge() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ", onlineRoomid=" + getOnlineRoomid() + ", vipLevel=" + getVipLevel() + ", avatarFrame=" + getAvatarFrame() + ", cpTotal=" + getCpTotal() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof UserHomeBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserHomeBean)) {
            return false;
        }
        UserHomeBean userHomeBean = (UserHomeBean) obj;
        if (!userHomeBean.canEqual(this) || getTickettotal() != userHomeBean.getTickettotal() || getConsumption() != userHomeBean.getConsumption()) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = userHomeBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer sex = getSex();
        Integer sex2 = userHomeBean.getSex();
        if (sex != null ? !sex.equals(sex2) : sex2 != null) {
            return false;
        }
        Integer lastLoginTime = getLastLoginTime();
        Integer lastLoginTime2 = userHomeBean.getLastLoginTime();
        if (lastLoginTime != null ? !lastLoginTime.equals(lastLoginTime2) : lastLoginTime2 != null) {
            return false;
        }
        Integer status = getStatus();
        Integer status2 = userHomeBean.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        Integer countryCode = getCountryCode();
        Integer countryCode2 = userHomeBean.getCountryCode();
        if (countryCode != null ? !countryCode.equals(countryCode2) : countryCode2 != null) {
            return false;
        }
        Integer isrecommend = getIsrecommend();
        Integer isrecommend2 = userHomeBean.getIsrecommend();
        if (isrecommend != null ? !isrecommend.equals(isrecommend2) : isrecommend2 != null) {
            return false;
        }
        Integer recommendTime = getRecommendTime();
        Integer recommendTime2 = userHomeBean.getRecommendTime();
        if (recommendTime != null ? !recommendTime.equals(recommendTime2) : recommendTime2 != null) {
            return false;
        }
        Integer isrecord = getIsrecord();
        Integer isrecord2 = userHomeBean.getIsrecord();
        if (isrecord != null ? !isrecord.equals(isrecord2) : isrecord2 != null) {
            return false;
        }
        Integer issuper = getIssuper();
        Integer issuper2 = userHomeBean.getIssuper();
        if (issuper != null ? !issuper.equals(issuper2) : issuper2 != null) {
            return false;
        }
        Integer ishot = getIshot();
        Integer ishot2 = userHomeBean.getIshot();
        if (ishot != null ? !ishot.equals(ishot2) : ishot2 != null) {
            return false;
        }
        Integer endBantime = getEndBantime();
        Integer endBantime2 = userHomeBean.getEndBantime();
        if (endBantime != null ? !endBantime.equals(endBantime2) : endBantime2 != null) {
            return false;
        }
        Integer cashRate = getCashRate();
        Integer cashRate2 = userHomeBean.getCashRate();
        if (cashRate != null ? !cashRate.equals(cashRate2) : cashRate2 != null) {
            return false;
        }
        Integer loginCount = getLoginCount();
        Integer loginCount2 = userHomeBean.getLoginCount();
        if (loginCount != null ? !loginCount.equals(loginCount2) : loginCount2 != null) {
            return false;
        }
        Integer dynamicTotal = getDynamicTotal();
        Integer dynamicTotal2 = userHomeBean.getDynamicTotal();
        if (dynamicTotal != null ? !dynamicTotal.equals(dynamicTotal2) : dynamicTotal2 != null) {
            return false;
        }
        Integer followTotal = getFollowTotal();
        Integer followTotal2 = userHomeBean.getFollowTotal();
        if (followTotal != null ? !followTotal.equals(followTotal2) : followTotal2 != null) {
            return false;
        }
        Integer fansTotal = getFansTotal();
        Integer fansTotal2 = userHomeBean.getFansTotal();
        if (fansTotal != null ? !fansTotal.equals(fansTotal2) : fansTotal2 != null) {
            return false;
        }
        Integer friendsTotal = getFriendsTotal();
        Integer friendsTotal2 = userHomeBean.getFriendsTotal();
        if (friendsTotal != null ? !friendsTotal.equals(friendsTotal2) : friendsTotal2 != null) {
            return false;
        }
        Integer guestTotal = getGuestTotal();
        Integer guestTotal2 = userHomeBean.getGuestTotal();
        if (guestTotal != null ? !guestTotal.equals(guestTotal2) : guestTotal2 != null) {
            return false;
        }
        Integer collectTotal = getCollectTotal();
        Integer collectTotal2 = userHomeBean.getCollectTotal();
        if (collectTotal != null ? !collectTotal.equals(collectTotal2) : collectTotal2 != null) {
            return false;
        }
        Integer level = getLevel();
        Integer level2 = userHomeBean.getLevel();
        if (level != null ? !level.equals(level2) : level2 != null) {
            return false;
        }
        Integer anchorLevel = getAnchorLevel();
        Integer anchorLevel2 = userHomeBean.getAnchorLevel();
        if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
            return false;
        }
        Integer onlineIsauthor = getOnlineIsauthor();
        Integer onlineIsauthor2 = userHomeBean.getOnlineIsauthor();
        if (onlineIsauthor != null ? !onlineIsauthor.equals(onlineIsauthor2) : onlineIsauthor2 != null) {
            return false;
        }
        Integer onlineRoomid = getOnlineRoomid();
        Integer onlineRoomid2 = userHomeBean.getOnlineRoomid();
        if (onlineRoomid != null ? !onlineRoomid.equals(onlineRoomid2) : onlineRoomid2 != null) {
            return false;
        }
        Integer onlineRoomLivetype = getOnlineRoomLivetype();
        Integer onlineRoomLivetype2 = userHomeBean.getOnlineRoomLivetype();
        if (onlineRoomLivetype != null ? !onlineRoomLivetype.equals(onlineRoomLivetype2) : onlineRoomLivetype2 != null) {
            return false;
        }
        Integer vipLevel = getVipLevel();
        Integer vipLevel2 = userHomeBean.getVipLevel();
        if (vipLevel != null ? !vipLevel.equals(vipLevel2) : vipLevel2 != null) {
            return false;
        }
        Integer userId = getUserId();
        Integer userId2 = userHomeBean.getUserId();
        if (userId != null ? !userId.equals(userId2) : userId2 != null) {
            return false;
        }
        Integer age = getAge();
        Integer age2 = userHomeBean.getAge();
        if (age != null ? !age.equals(age2) : age2 != null) {
            return false;
        }
        Integer likesTotal = getLikesTotal();
        Integer likesTotal2 = userHomeBean.getLikesTotal();
        if (likesTotal != null ? !likesTotal.equals(likesTotal2) : likesTotal2 != null) {
            return false;
        }
        Integer isAttention = getIsAttention();
        Integer isAttention2 = userHomeBean.getIsAttention();
        if (isAttention != null ? !isAttention.equals(isAttention2) : isAttention2 != null) {
            return false;
        }
        Integer isFriends = getIsFriends();
        Integer isFriends2 = userHomeBean.getIsFriends();
        if (isFriends != null ? !isFriends.equals(isFriends2) : isFriends2 != null) {
            return false;
        }
        Integer likesCount = getLikesCount();
        Integer likesCount2 = userHomeBean.getLikesCount();
        if (likesCount != null ? !likesCount.equals(likesCount2) : likesCount2 != null) {
            return false;
        }
        Integer isLiked = getIsLiked();
        Integer isLiked2 = userHomeBean.getIsLiked();
        if (isLiked != null ? !isLiked.equals(isLiked2) : isLiked2 != null) {
            return false;
        }
        Integer familyStatus = getFamilyStatus();
        Integer familyStatus2 = userHomeBean.getFamilyStatus();
        if (familyStatus != null ? !familyStatus.equals(familyStatus2) : familyStatus2 != null) {
            return false;
        }
        Integer authType = getAuthType();
        Integer authType2 = userHomeBean.getAuthType();
        if (authType != null ? !authType.equals(authType2) : authType2 != null) {
            return false;
        }
        Integer wealthLevel = getWealthLevel();
        Integer wealthLevel2 = userHomeBean.getWealthLevel();
        if (wealthLevel != null ? !wealthLevel.equals(wealthLevel2) : wealthLevel2 != null) {
            return false;
        }
        String username = getUsername();
        String username2 = userHomeBean.getUsername();
        if (username != null ? !username.equals(username2) : username2 != null) {
            return false;
        }
        String nickname = getNickname();
        String nickname2 = userHomeBean.getNickname();
        if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
            return false;
        }
        String birthday = getBirthday();
        String birthday2 = userHomeBean.getBirthday();
        if (birthday != null ? !birthday.equals(birthday2) : birthday2 != null) {
            return false;
        }
        String lastLoginIp = getLastLoginIp();
        String lastLoginIp2 = userHomeBean.getLastLoginIp();
        if (lastLoginIp != null ? !lastLoginIp.equals(lastLoginIp2) : lastLoginIp2 != null) {
            return false;
        }
        String email = getEmail();
        String email2 = userHomeBean.getEmail();
        if (email != null ? !email.equals(email2) : email2 != null) {
            return false;
        }
        String avatar = getAvatar();
        String avatar2 = userHomeBean.getAvatar();
        if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
            return false;
        }
        String signature = getSignature();
        String signature2 = userHomeBean.getSignature();
        if (signature != null ? !signature.equals(signature2) : signature2 != null) {
            return false;
        }
        String countryIso = getCountryIso();
        String countryIso2 = userHomeBean.getCountryIso();
        if (countryIso != null ? !countryIso.equals(countryIso2) : countryIso2 != null) {
            return false;
        }
        String mobile = getMobile();
        String mobile2 = userHomeBean.getMobile();
        if (mobile != null ? !mobile.equals(mobile2) : mobile2 != null) {
            return false;
        }
        String province = getProvince();
        String province2 = userHomeBean.getProvince();
        if (province != null ? !province.equals(province2) : province2 != null) {
            return false;
        }
        String city = getCity();
        String city2 = userHomeBean.getCity();
        if (city != null ? !city.equals(city2) : city2 != null) {
            return false;
        }
        String location = getLocation();
        String location2 = userHomeBean.getLocation();
        if (location != null ? !location.equals(location2) : location2 != null) {
            return false;
        }
        String regType = getRegType();
        String regType2 = userHomeBean.getRegType();
        if (regType != null ? !regType.equals(regType2) : regType2 != null) {
            return false;
        }
        String onlineChatRoomid = getOnlineChatRoomid();
        String onlineChatRoomid2 = userHomeBean.getOnlineChatRoomid();
        if (onlineChatRoomid != null ? !onlineChatRoomid.equals(onlineChatRoomid2) : onlineChatRoomid2 != null) {
            return false;
        }
        String source = getSource();
        String source2 = userHomeBean.getSource();
        if (source != null ? !source.equals(source2) : source2 != null) {
            return false;
        }
        String goodnum = getGoodnum();
        String goodnum2 = userHomeBean.getGoodnum();
        if (goodnum != null ? !goodnum.equals(goodnum2) : goodnum2 != null) {
            return false;
        }
        Object more = getMore();
        Object more2 = userHomeBean.getMore();
        if (more != null ? !more.equals(more2) : more2 != null) {
            return false;
        }
        String createTime = getCreateTime();
        String createTime2 = userHomeBean.getCreateTime();
        if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
            return false;
        }
        String updateTime = getUpdateTime();
        String updateTime2 = userHomeBean.getUpdateTime();
        if (updateTime != null ? !updateTime.equals(updateTime2) : updateTime2 != null) {
            return false;
        }
        Object hxUuid = getHxUuid();
        Object hxUuid2 = userHomeBean.getHxUuid();
        if (hxUuid != null ? !hxUuid.equals(hxUuid2) : hxUuid2 != null) {
            return false;
        }
        Object hxPassword = getHxPassword();
        Object hxPassword2 = userHomeBean.getHxPassword();
        if (hxPassword != null ? !hxPassword.equals(hxPassword2) : hxPassword2 != null) {
            return false;
        }
        String os = getOs();
        String os2 = userHomeBean.getOs();
        if (os != null ? !os.equals(os2) : os2 != null) {
            return false;
        }
        String brand = getBrand();
        String brand2 = userHomeBean.getBrand();
        if (brand != null ? !brand.equals(brand2) : brand2 != null) {
            return false;
        }
        String model = getModel();
        String model2 = userHomeBean.getModel();
        if (model != null ? !model.equals(model2) : model2 != null) {
            return false;
        }
        String inviteCode = getInviteCode();
        String inviteCode2 = userHomeBean.getInviteCode();
        if (inviteCode != null ? !inviteCode.equals(inviteCode2) : inviteCode2 != null) {
            return false;
        }
        String levelIcon = getLevelIcon();
        String levelIcon2 = userHomeBean.getLevelIcon();
        if (levelIcon != null ? !levelIcon.equals(levelIcon2) : levelIcon2 != null) {
            return false;
        }
        String anchorLevelIcon = getAnchorLevelIcon();
        String anchorLevelIcon2 = userHomeBean.getAnchorLevelIcon();
        if (anchorLevelIcon != null ? !anchorLevelIcon.equals(anchorLevelIcon2) : anchorLevelIcon2 != null) {
            return false;
        }
        String countryEn = getCountryEn();
        String countryEn2 = userHomeBean.getCountryEn();
        if (countryEn != null ? !countryEn.equals(countryEn2) : countryEn2 != null) {
            return false;
        }
        String avatarFrame = getAvatarFrame();
        String avatarFrame2 = userHomeBean.getAvatarFrame();
        if (avatarFrame != null ? !avatarFrame.equals(avatarFrame2) : avatarFrame2 != null) {
            return false;
        }
        String jctx = getJctx();
        String jctx2 = userHomeBean.getJctx();
        if (jctx != null ? !jctx.equals(jctx2) : jctx2 != null) {
            return false;
        }
        String chatBubble = getChatBubble();
        String chatBubble2 = userHomeBean.getChatBubble();
        if (chatBubble != null ? !chatBubble.equals(chatBubble2) : chatBubble2 != null) {
            return false;
        }
        String badge1 = getBadge1();
        String badge12 = userHomeBean.getBadge1();
        if (badge1 != null ? !badge1.equals(badge12) : badge12 != null) {
            return false;
        }
        String badge1Svga = getBadge1Svga();
        String badge1Svga2 = userHomeBean.getBadge1Svga();
        if (badge1Svga != null ? !badge1Svga.equals(badge1Svga2) : badge1Svga2 != null) {
            return false;
        }
        String badge2 = getBadge2();
        String badge22 = userHomeBean.getBadge2();
        if (badge2 != null ? !badge2.equals(badge22) : badge22 != null) {
            return false;
        }
        String badge2Svga = getBadge2Svga();
        String badge2Svga2 = userHomeBean.getBadge2Svga();
        if (badge2Svga != null ? !badge2Svga.equals(badge2Svga2) : badge2Svga2 != null) {
            return false;
        }
        String badge3 = getBadge3();
        String badge32 = userHomeBean.getBadge3();
        if (badge3 != null ? !badge3.equals(badge32) : badge32 != null) {
            return false;
        }
        String badge3Svga = getBadge3Svga();
        String badge3Svga2 = userHomeBean.getBadge3Svga();
        if (badge3Svga != null ? !badge3Svga.equals(badge3Svga2) : badge3Svga2 != null) {
            return false;
        }
        List<UserCpDTO> userCp = getUserCp();
        List<UserCpDTO> userCp2 = userHomeBean.getUserCp();
        if (userCp != null ? !userCp.equals(userCp2) : userCp2 != null) {
            return false;
        }
        UserShouhuDTO userShouhu = getUserShouhu();
        UserShouhuDTO userShouhu2 = userHomeBean.getUserShouhu();
        if (userShouhu != null ? !userShouhu.equals(userShouhu2) : userShouhu2 != null) {
            return false;
        }
        String colorId = getColorId();
        String colorId2 = userHomeBean.getColorId();
        if (colorId != null ? !colorId.equals(colorId2) : colorId2 != null) {
            return false;
        }
        String colorIdIcon = getColorIdIcon();
        String colorIdIcon2 = userHomeBean.getColorIdIcon();
        if (colorIdIcon != null ? !colorIdIcon.equals(colorIdIcon2) : colorIdIcon2 != null) {
            return false;
        }
        FamilyInfoDTO familyInfo = getFamilyInfo();
        FamilyInfoDTO familyInfo2 = userHomeBean.getFamilyInfo();
        if (familyInfo != null ? !familyInfo.equals(familyInfo2) : familyInfo2 != null) {
            return false;
        }
        List<TagsDTO> tags = getTags();
        List<TagsDTO> tags2 = userHomeBean.getTags();
        if (tags != null ? !tags.equals(tags2) : tags2 != null) {
            return false;
        }
        List<String> userTags = getUserTags();
        List<String> userTags2 = userHomeBean.getUserTags();
        if (userTags != null ? !userTags.equals(userTags2) : userTags2 != null) {
            return false;
        }
        List<BadgeDTO> badge = getBadge();
        List<BadgeDTO> badge4 = userHomeBean.getBadge();
        if (badge != null ? !badge.equals(badge4) : badge4 != null) {
            return false;
        }
        PkDTO pk2 = getPk();
        PkDTO pk3 = userHomeBean.getPk();
        if (pk2 != null ? !pk2.equals(pk3) : pk3 != null) {
            return false;
        }
        List<CarsDTO> cars = getCars();
        List<CarsDTO> cars2 = userHomeBean.getCars();
        if (cars != null ? !cars.equals(cars2) : cars2 != null) {
            return false;
        }
        List<GiftsDTO> gifts = getGifts();
        List<GiftsDTO> gifts2 = userHomeBean.getGifts();
        if (gifts != null ? !gifts.equals(gifts2) : gifts2 != null) {
            return false;
        }
        List<String> badgeList = getBadgeList();
        List<String> badgeList2 = userHomeBean.getBadgeList();
        if (badgeList != null ? !badgeList.equals(badgeList2) : badgeList2 != null) {
            return false;
        }
        CpDTO cp = getCp();
        CpDTO cp2 = userHomeBean.getCp();
        if (cp != null ? !cp.equals(cp2) : cp2 != null) {
            return false;
        }
        String cpDoc = getCpDoc();
        String cpDoc2 = userHomeBean.getCpDoc();
        if (cpDoc != null ? !cpDoc.equals(cpDoc2) : cpDoc2 != null) {
            return false;
        }
        HomeDressDTO homeDress = getHomeDress();
        HomeDressDTO homeDress2 = userHomeBean.getHomeDress();
        return homeDress != null ? homeDress.equals(homeDress2) : homeDress2 == null;
    }

    public Integer getAge() {
        return this.age;
    }

    public Integer getAnchorLevel() {
        return this.anchorLevel;
    }

    public String getAnchorLevelIcon() {
        return this.anchorLevelIcon;
    }

    public Integer getAuthType() {
        return this.authType;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getAvatarFrame() {
        return this.avatarFrame;
    }

    public List<BadgeDTO> getBadge() {
        return this.badge;
    }

    public String getBadge1() {
        return this.badge1;
    }

    public String getBadge1Svga() {
        return this.badge1Svga;
    }

    public String getBadge2() {
        return this.badge2;
    }

    public String getBadge2Svga() {
        return this.badge2Svga;
    }

    public String getBadge3() {
        return this.badge3;
    }

    public String getBadge3Svga() {
        return this.badge3Svga;
    }

    public List<String> getBadgeList() {
        return this.badgeList;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public String getBrand() {
        return this.brand;
    }

    public List<CarsDTO> getCars() {
        return this.cars;
    }

    public Integer getCashRate() {
        return this.cashRate;
    }

    public String getChatBubble() {
        return this.chatBubble;
    }

    public String getCity() {
        return this.city;
    }

    public Integer getCollectTotal() {
        return this.collectTotal;
    }

    public String getColorId() {
        return this.colorId;
    }

    public String getColorIdIcon() {
        return this.colorIdIcon;
    }

    public long getConsumption() {
        return this.consumption;
    }

    public Integer getCountryCode() {
        return this.countryCode;
    }

    public String getCountryEn() {
        return this.countryEn;
    }

    public String getCountryIso() {
        return this.countryIso;
    }

    public CpDTO getCp() {
        return this.cp;
    }

    public String getCpDoc() {
        return this.cpDoc;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public Integer getDynamicTotal() {
        return this.dynamicTotal;
    }

    public String getEmail() {
        return this.email;
    }

    public Integer getEndBantime() {
        return this.endBantime;
    }

    public FamilyInfoDTO getFamilyInfo() {
        return this.familyInfo;
    }

    public Integer getFamilyStatus() {
        return this.familyStatus;
    }

    public Integer getFansTotal() {
        return this.fansTotal;
    }

    public Integer getFollowTotal() {
        return this.followTotal;
    }

    public Integer getFriendsTotal() {
        return this.friendsTotal;
    }

    public List<GiftsDTO> getGifts() {
        return this.gifts;
    }

    public String getGoodnum() {
        return this.goodnum;
    }

    public Integer getGuestTotal() {
        return this.guestTotal;
    }

    public HomeDressDTO getHomeDress() {
        return this.homeDress;
    }

    public Object getHxPassword() {
        return this.hxPassword;
    }

    public Object getHxUuid() {
        return this.hxUuid;
    }

    public Integer getId() {
        return this.f34909id;
    }

    public String getInviteCode() {
        return this.inviteCode;
    }

    public Integer getIsAttention() {
        return this.isAttention;
    }

    public Integer getIsFriends() {
        return this.isFriends;
    }

    public Integer getIsLiked() {
        return this.isLiked;
    }

    public Integer getIshot() {
        return this.ishot;
    }

    public Integer getIsrecommend() {
        return this.isrecommend;
    }

    public Integer getIsrecord() {
        return this.isrecord;
    }

    public Integer getIssuper() {
        return this.issuper;
    }

    public String getJctx() {
        return this.jctx;
    }

    public String getLastLoginIp() {
        return this.lastLoginIp;
    }

    public Integer getLastLoginTime() {
        return this.lastLoginTime;
    }

    public Integer getLevel() {
        return this.level;
    }

    public String getLevelIcon() {
        return this.levelIcon;
    }

    public Integer getLikesCount() {
        return this.likesCount;
    }

    public Integer getLikesTotal() {
        return this.likesTotal;
    }

    public String getLocation() {
        return this.location;
    }

    public Integer getLoginCount() {
        return this.loginCount;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getModel() {
        return this.model;
    }

    public Object getMore() {
        return this.more;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getOnlineChatRoomid() {
        return this.onlineChatRoomid;
    }

    public Integer getOnlineIsauthor() {
        return this.onlineIsauthor;
    }

    public Integer getOnlineRoomLivetype() {
        return this.onlineRoomLivetype;
    }

    public Integer getOnlineRoomid() {
        return this.onlineRoomid;
    }

    public String getOs() {
        return this.os;
    }

    public PkDTO getPk() {
        return this.f34910pk;
    }

    public String getProvince() {
        return this.province;
    }

    public Integer getRecommendTime() {
        return this.recommendTime;
    }

    public String getRegType() {
        return this.regType;
    }

    public Integer getSex() {
        return this.sex;
    }

    public String getSignature() {
        return this.signature;
    }

    public String getSource() {
        return this.source;
    }

    public Integer getStatus() {
        return this.status;
    }

    public List<TagsDTO> getTags() {
        return this.tags;
    }

    public long getTickettotal() {
        return this.tickettotal;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public List<UserCpDTO> getUserCp() {
        return this.userCp;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public UserShouhuDTO getUserShouhu() {
        return this.userShouhu;
    }

    public List<String> getUserTags() {
        return this.userTags;
    }

    public String getUsername() {
        return this.username;
    }

    public Integer getVipLevel() {
        return this.vipLevel;
    }

    public Integer getWealthLevel() {
        return this.wealthLevel;
    }

    public int hashCode() {
        long tickettotal = getTickettotal();
        long consumption = getConsumption();
        Integer id2 = getId();
        int iHashCode = ((((((int) (tickettotal ^ (tickettotal >>> 32))) + 59) * 59) + ((int) (consumption ^ (consumption >>> 32)))) * 59) + (id2 == null ? 43 : id2.hashCode());
        Integer sex = getSex();
        int iHashCode2 = (iHashCode * 59) + (sex == null ? 43 : sex.hashCode());
        Integer lastLoginTime = getLastLoginTime();
        int iHashCode3 = (iHashCode2 * 59) + (lastLoginTime == null ? 43 : lastLoginTime.hashCode());
        Integer status = getStatus();
        int iHashCode4 = (iHashCode3 * 59) + (status == null ? 43 : status.hashCode());
        Integer countryCode = getCountryCode();
        int iHashCode5 = (iHashCode4 * 59) + (countryCode == null ? 43 : countryCode.hashCode());
        Integer isrecommend = getIsrecommend();
        int iHashCode6 = (iHashCode5 * 59) + (isrecommend == null ? 43 : isrecommend.hashCode());
        Integer recommendTime = getRecommendTime();
        int iHashCode7 = (iHashCode6 * 59) + (recommendTime == null ? 43 : recommendTime.hashCode());
        Integer isrecord = getIsrecord();
        int iHashCode8 = (iHashCode7 * 59) + (isrecord == null ? 43 : isrecord.hashCode());
        Integer issuper = getIssuper();
        int iHashCode9 = (iHashCode8 * 59) + (issuper == null ? 43 : issuper.hashCode());
        Integer ishot = getIshot();
        int iHashCode10 = (iHashCode9 * 59) + (ishot == null ? 43 : ishot.hashCode());
        Integer endBantime = getEndBantime();
        int iHashCode11 = (iHashCode10 * 59) + (endBantime == null ? 43 : endBantime.hashCode());
        Integer cashRate = getCashRate();
        int iHashCode12 = (iHashCode11 * 59) + (cashRate == null ? 43 : cashRate.hashCode());
        Integer loginCount = getLoginCount();
        int iHashCode13 = (iHashCode12 * 59) + (loginCount == null ? 43 : loginCount.hashCode());
        Integer dynamicTotal = getDynamicTotal();
        int iHashCode14 = (iHashCode13 * 59) + (dynamicTotal == null ? 43 : dynamicTotal.hashCode());
        Integer followTotal = getFollowTotal();
        int iHashCode15 = (iHashCode14 * 59) + (followTotal == null ? 43 : followTotal.hashCode());
        Integer fansTotal = getFansTotal();
        int iHashCode16 = (iHashCode15 * 59) + (fansTotal == null ? 43 : fansTotal.hashCode());
        Integer friendsTotal = getFriendsTotal();
        int iHashCode17 = (iHashCode16 * 59) + (friendsTotal == null ? 43 : friendsTotal.hashCode());
        Integer guestTotal = getGuestTotal();
        int iHashCode18 = (iHashCode17 * 59) + (guestTotal == null ? 43 : guestTotal.hashCode());
        Integer collectTotal = getCollectTotal();
        int iHashCode19 = (iHashCode18 * 59) + (collectTotal == null ? 43 : collectTotal.hashCode());
        Integer level = getLevel();
        int iHashCode20 = (iHashCode19 * 59) + (level == null ? 43 : level.hashCode());
        Integer anchorLevel = getAnchorLevel();
        int iHashCode21 = (iHashCode20 * 59) + (anchorLevel == null ? 43 : anchorLevel.hashCode());
        Integer onlineIsauthor = getOnlineIsauthor();
        int iHashCode22 = (iHashCode21 * 59) + (onlineIsauthor == null ? 43 : onlineIsauthor.hashCode());
        Integer onlineRoomid = getOnlineRoomid();
        int iHashCode23 = (iHashCode22 * 59) + (onlineRoomid == null ? 43 : onlineRoomid.hashCode());
        Integer onlineRoomLivetype = getOnlineRoomLivetype();
        int iHashCode24 = (iHashCode23 * 59) + (onlineRoomLivetype == null ? 43 : onlineRoomLivetype.hashCode());
        Integer vipLevel = getVipLevel();
        int iHashCode25 = (iHashCode24 * 59) + (vipLevel == null ? 43 : vipLevel.hashCode());
        Integer userId = getUserId();
        int iHashCode26 = (iHashCode25 * 59) + (userId == null ? 43 : userId.hashCode());
        Integer age = getAge();
        int iHashCode27 = (iHashCode26 * 59) + (age == null ? 43 : age.hashCode());
        Integer likesTotal = getLikesTotal();
        int iHashCode28 = (iHashCode27 * 59) + (likesTotal == null ? 43 : likesTotal.hashCode());
        Integer isAttention = getIsAttention();
        int iHashCode29 = (iHashCode28 * 59) + (isAttention == null ? 43 : isAttention.hashCode());
        Integer isFriends = getIsFriends();
        int iHashCode30 = (iHashCode29 * 59) + (isFriends == null ? 43 : isFriends.hashCode());
        Integer likesCount = getLikesCount();
        int iHashCode31 = (iHashCode30 * 59) + (likesCount == null ? 43 : likesCount.hashCode());
        Integer isLiked = getIsLiked();
        int iHashCode32 = (iHashCode31 * 59) + (isLiked == null ? 43 : isLiked.hashCode());
        Integer familyStatus = getFamilyStatus();
        int iHashCode33 = (iHashCode32 * 59) + (familyStatus == null ? 43 : familyStatus.hashCode());
        Integer authType = getAuthType();
        int iHashCode34 = (iHashCode33 * 59) + (authType == null ? 43 : authType.hashCode());
        Integer wealthLevel = getWealthLevel();
        int iHashCode35 = (iHashCode34 * 59) + (wealthLevel == null ? 43 : wealthLevel.hashCode());
        String username = getUsername();
        int iHashCode36 = (iHashCode35 * 59) + (username == null ? 43 : username.hashCode());
        String nickname = getNickname();
        int iHashCode37 = (iHashCode36 * 59) + (nickname == null ? 43 : nickname.hashCode());
        String birthday = getBirthday();
        int iHashCode38 = (iHashCode37 * 59) + (birthday == null ? 43 : birthday.hashCode());
        String lastLoginIp = getLastLoginIp();
        int iHashCode39 = (iHashCode38 * 59) + (lastLoginIp == null ? 43 : lastLoginIp.hashCode());
        String email = getEmail();
        int iHashCode40 = (iHashCode39 * 59) + (email == null ? 43 : email.hashCode());
        String avatar = getAvatar();
        int iHashCode41 = (iHashCode40 * 59) + (avatar == null ? 43 : avatar.hashCode());
        String signature = getSignature();
        int iHashCode42 = (iHashCode41 * 59) + (signature == null ? 43 : signature.hashCode());
        String countryIso = getCountryIso();
        int iHashCode43 = (iHashCode42 * 59) + (countryIso == null ? 43 : countryIso.hashCode());
        String mobile = getMobile();
        int iHashCode44 = (iHashCode43 * 59) + (mobile == null ? 43 : mobile.hashCode());
        String province = getProvince();
        int iHashCode45 = (iHashCode44 * 59) + (province == null ? 43 : province.hashCode());
        String city = getCity();
        int iHashCode46 = (iHashCode45 * 59) + (city == null ? 43 : city.hashCode());
        String location = getLocation();
        int iHashCode47 = (iHashCode46 * 59) + (location == null ? 43 : location.hashCode());
        String regType = getRegType();
        int iHashCode48 = (iHashCode47 * 59) + (regType == null ? 43 : regType.hashCode());
        String onlineChatRoomid = getOnlineChatRoomid();
        int iHashCode49 = (iHashCode48 * 59) + (onlineChatRoomid == null ? 43 : onlineChatRoomid.hashCode());
        String source = getSource();
        int iHashCode50 = (iHashCode49 * 59) + (source == null ? 43 : source.hashCode());
        String goodnum = getGoodnum();
        int iHashCode51 = (iHashCode50 * 59) + (goodnum == null ? 43 : goodnum.hashCode());
        Object more = getMore();
        int iHashCode52 = (iHashCode51 * 59) + (more == null ? 43 : more.hashCode());
        String createTime = getCreateTime();
        int iHashCode53 = (iHashCode52 * 59) + (createTime == null ? 43 : createTime.hashCode());
        String updateTime = getUpdateTime();
        int iHashCode54 = (iHashCode53 * 59) + (updateTime == null ? 43 : updateTime.hashCode());
        Object hxUuid = getHxUuid();
        int iHashCode55 = (iHashCode54 * 59) + (hxUuid == null ? 43 : hxUuid.hashCode());
        Object hxPassword = getHxPassword();
        int iHashCode56 = (iHashCode55 * 59) + (hxPassword == null ? 43 : hxPassword.hashCode());
        String os = getOs();
        int iHashCode57 = (iHashCode56 * 59) + (os == null ? 43 : os.hashCode());
        String brand = getBrand();
        int iHashCode58 = (iHashCode57 * 59) + (brand == null ? 43 : brand.hashCode());
        String model = getModel();
        int iHashCode59 = (iHashCode58 * 59) + (model == null ? 43 : model.hashCode());
        String inviteCode = getInviteCode();
        int iHashCode60 = (iHashCode59 * 59) + (inviteCode == null ? 43 : inviteCode.hashCode());
        String levelIcon = getLevelIcon();
        int iHashCode61 = (iHashCode60 * 59) + (levelIcon == null ? 43 : levelIcon.hashCode());
        String anchorLevelIcon = getAnchorLevelIcon();
        int iHashCode62 = (iHashCode61 * 59) + (anchorLevelIcon == null ? 43 : anchorLevelIcon.hashCode());
        String countryEn = getCountryEn();
        int iHashCode63 = (iHashCode62 * 59) + (countryEn == null ? 43 : countryEn.hashCode());
        String avatarFrame = getAvatarFrame();
        int iHashCode64 = (iHashCode63 * 59) + (avatarFrame == null ? 43 : avatarFrame.hashCode());
        String jctx = getJctx();
        int iHashCode65 = (iHashCode64 * 59) + (jctx == null ? 43 : jctx.hashCode());
        String chatBubble = getChatBubble();
        int iHashCode66 = (iHashCode65 * 59) + (chatBubble == null ? 43 : chatBubble.hashCode());
        String badge1 = getBadge1();
        int iHashCode67 = (iHashCode66 * 59) + (badge1 == null ? 43 : badge1.hashCode());
        String badge1Svga = getBadge1Svga();
        int iHashCode68 = (iHashCode67 * 59) + (badge1Svga == null ? 43 : badge1Svga.hashCode());
        String badge2 = getBadge2();
        int iHashCode69 = (iHashCode68 * 59) + (badge2 == null ? 43 : badge2.hashCode());
        String badge2Svga = getBadge2Svga();
        int iHashCode70 = (iHashCode69 * 59) + (badge2Svga == null ? 43 : badge2Svga.hashCode());
        String badge3 = getBadge3();
        int iHashCode71 = (iHashCode70 * 59) + (badge3 == null ? 43 : badge3.hashCode());
        String badge3Svga = getBadge3Svga();
        int iHashCode72 = (iHashCode71 * 59) + (badge3Svga == null ? 43 : badge3Svga.hashCode());
        List<UserCpDTO> userCp = getUserCp();
        int iHashCode73 = (iHashCode72 * 59) + (userCp == null ? 43 : userCp.hashCode());
        UserShouhuDTO userShouhu = getUserShouhu();
        int iHashCode74 = (iHashCode73 * 59) + (userShouhu == null ? 43 : userShouhu.hashCode());
        String colorId = getColorId();
        int iHashCode75 = (iHashCode74 * 59) + (colorId == null ? 43 : colorId.hashCode());
        String colorIdIcon = getColorIdIcon();
        int iHashCode76 = (iHashCode75 * 59) + (colorIdIcon == null ? 43 : colorIdIcon.hashCode());
        FamilyInfoDTO familyInfo = getFamilyInfo();
        int iHashCode77 = (iHashCode76 * 59) + (familyInfo == null ? 43 : familyInfo.hashCode());
        List<TagsDTO> tags = getTags();
        int iHashCode78 = (iHashCode77 * 59) + (tags == null ? 43 : tags.hashCode());
        List<String> userTags = getUserTags();
        int iHashCode79 = (iHashCode78 * 59) + (userTags == null ? 43 : userTags.hashCode());
        List<BadgeDTO> badge = getBadge();
        int iHashCode80 = (iHashCode79 * 59) + (badge == null ? 43 : badge.hashCode());
        PkDTO pk2 = getPk();
        int iHashCode81 = (iHashCode80 * 59) + (pk2 == null ? 43 : pk2.hashCode());
        List<CarsDTO> cars = getCars();
        int iHashCode82 = (iHashCode81 * 59) + (cars == null ? 43 : cars.hashCode());
        List<GiftsDTO> gifts = getGifts();
        int iHashCode83 = (iHashCode82 * 59) + (gifts == null ? 43 : gifts.hashCode());
        List<String> badgeList = getBadgeList();
        int iHashCode84 = (iHashCode83 * 59) + (badgeList == null ? 43 : badgeList.hashCode());
        CpDTO cp = getCp();
        int iHashCode85 = (iHashCode84 * 59) + (cp == null ? 43 : cp.hashCode());
        String cpDoc = getCpDoc();
        int iHashCode86 = (iHashCode85 * 59) + (cpDoc == null ? 43 : cpDoc.hashCode());
        HomeDressDTO homeDress = getHomeDress();
        return (iHashCode86 * 59) + (homeDress != null ? homeDress.hashCode() : 43);
    }

    public void setAge(Integer num) {
        this.age = num;
    }

    public void setAnchorLevel(Integer num) {
        this.anchorLevel = num;
    }

    public void setAnchorLevelIcon(String str) {
        this.anchorLevelIcon = str;
    }

    public void setAuthType(Integer num) {
        this.authType = num;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setAvatarFrame(String str) {
        this.avatarFrame = str;
    }

    public void setBadge(List<BadgeDTO> list) {
        this.badge = list;
    }

    public void setBadge1(String str) {
        this.badge1 = str;
    }

    public void setBadge1Svga(String str) {
        this.badge1Svga = str;
    }

    public void setBadge2(String str) {
        this.badge2 = str;
    }

    public void setBadge2Svga(String str) {
        this.badge2Svga = str;
    }

    public void setBadge3(String str) {
        this.badge3 = str;
    }

    public void setBadge3Svga(String str) {
        this.badge3Svga = str;
    }

    public void setBadgeList(List<String> list) {
        this.badgeList = list;
    }

    public void setBirthday(String str) {
        this.birthday = str;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public void setCars(List<CarsDTO> list) {
        this.cars = list;
    }

    public void setCashRate(Integer num) {
        this.cashRate = num;
    }

    public void setChatBubble(String str) {
        this.chatBubble = str;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCollectTotal(Integer num) {
        this.collectTotal = num;
    }

    public void setColorId(String str) {
        this.colorId = str;
    }

    public void setColorIdIcon(String str) {
        this.colorIdIcon = str;
    }

    public void setConsumption(long j10) {
        this.consumption = j10;
    }

    public void setCountryCode(Integer num) {
        this.countryCode = num;
    }

    public void setCountryEn(String str) {
        this.countryEn = str;
    }

    public void setCountryIso(String str) {
        this.countryIso = str;
    }

    public void setCp(CpDTO cpDTO) {
        this.cp = cpDTO;
    }

    public void setCpDoc(String str) {
        this.cpDoc = str;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setDynamicTotal(Integer num) {
        this.dynamicTotal = num;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setEndBantime(Integer num) {
        this.endBantime = num;
    }

    public void setFamilyInfo(FamilyInfoDTO familyInfoDTO) {
        this.familyInfo = familyInfoDTO;
    }

    public void setFamilyStatus(Integer num) {
        this.familyStatus = num;
    }

    public void setFansTotal(Integer num) {
        this.fansTotal = num;
    }

    public void setFollowTotal(Integer num) {
        this.followTotal = num;
    }

    public void setFriendsTotal(Integer num) {
        this.friendsTotal = num;
    }

    public void setGifts(List<GiftsDTO> list) {
        this.gifts = list;
    }

    public void setGoodnum(String str) {
        this.goodnum = str;
    }

    public void setGuestTotal(Integer num) {
        this.guestTotal = num;
    }

    public void setHomeDress(HomeDressDTO homeDressDTO) {
        this.homeDress = homeDressDTO;
    }

    public void setHxPassword(Object obj) {
        this.hxPassword = obj;
    }

    public void setHxUuid(Object obj) {
        this.hxUuid = obj;
    }

    public void setId(Integer num) {
        this.f34909id = num;
    }

    public void setInviteCode(String str) {
        this.inviteCode = str;
    }

    public void setIsAttention(Integer num) {
        this.isAttention = num;
    }

    public void setIsFriends(Integer num) {
        this.isFriends = num;
    }

    public void setIsLiked(Integer num) {
        this.isLiked = num;
    }

    public void setIshot(Integer num) {
        this.ishot = num;
    }

    public void setIsrecommend(Integer num) {
        this.isrecommend = num;
    }

    public void setIsrecord(Integer num) {
        this.isrecord = num;
    }

    public void setIssuper(Integer num) {
        this.issuper = num;
    }

    public void setJctx(String str) {
        this.jctx = str;
    }

    public void setLastLoginIp(String str) {
        this.lastLoginIp = str;
    }

    public void setLastLoginTime(Integer num) {
        this.lastLoginTime = num;
    }

    public void setLevel(Integer num) {
        this.level = num;
    }

    public void setLevelIcon(String str) {
        this.levelIcon = str;
    }

    public void setLikesCount(Integer num) {
        this.likesCount = num;
    }

    public void setLikesTotal(Integer num) {
        this.likesTotal = num;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setLoginCount(Integer num) {
        this.loginCount = num;
    }

    public void setMobile(String str) {
        this.mobile = str;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setMore(Object obj) {
        this.more = obj;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setOnlineChatRoomid(String str) {
        this.onlineChatRoomid = str;
    }

    public void setOnlineIsauthor(Integer num) {
        this.onlineIsauthor = num;
    }

    public void setOnlineRoomLivetype(Integer num) {
        this.onlineRoomLivetype = num;
    }

    public void setOnlineRoomid(Integer num) {
        this.onlineRoomid = num;
    }

    public void setOs(String str) {
        this.os = str;
    }

    public void setPk(PkDTO pkDTO) {
        this.f34910pk = pkDTO;
    }

    public void setProvince(String str) {
        this.province = str;
    }

    public void setRecommendTime(Integer num) {
        this.recommendTime = num;
    }

    public void setRegType(String str) {
        this.regType = str;
    }

    public void setSex(Integer num) {
        this.sex = num;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setStatus(Integer num) {
        this.status = num;
    }

    public void setTags(List<TagsDTO> list) {
        this.tags = list;
    }

    public void setTickettotal(long j10) {
        this.tickettotal = j10;
    }

    public void setUpdateTime(String str) {
        this.updateTime = str;
    }

    public void setUserCp(List<UserCpDTO> list) {
        this.userCp = list;
    }

    public void setUserId(Integer num) {
        this.userId = num;
    }

    public void setUserShouhu(UserShouhuDTO userShouhuDTO) {
        this.userShouhu = userShouhuDTO;
    }

    public void setUserTags(List<String> list) {
        this.userTags = list;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public void setVipLevel(Integer num) {
        this.vipLevel = num;
    }

    public void setWealthLevel(Integer num) {
        this.wealthLevel = num;
    }

    public String toString() {
        return "UserHomeBean(id=" + getId() + ", username=" + getUsername() + ", nickname=" + getNickname() + ", sex=" + getSex() + ", birthday=" + getBirthday() + ", lastLoginTime=" + getLastLoginTime() + ", lastLoginIp=" + getLastLoginIp() + ", status=" + getStatus() + ", email=" + getEmail() + ", avatar=" + getAvatar() + ", signature=" + getSignature() + ", countryCode=" + getCountryCode() + ", countryIso=" + getCountryIso() + ", mobile=" + getMobile() + ", province=" + getProvince() + ", city=" + getCity() + ", location=" + getLocation() + ", isrecommend=" + getIsrecommend() + ", recommendTime=" + getRecommendTime() + ", regType=" + getRegType() + ", onlineChatRoomid=" + getOnlineChatRoomid() + ", source=" + getSource() + ", isrecord=" + getIsrecord() + ", issuper=" + getIssuper() + ", ishot=" + getIshot() + ", goodnum=" + getGoodnum() + ", endBantime=" + getEndBantime() + ", cashRate=" + getCashRate() + ", more=" + getMore() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ", loginCount=" + getLoginCount() + ", hxUuid=" + getHxUuid() + ", hxPassword=" + getHxPassword() + ", os=" + getOs() + ", brand=" + getBrand() + ", model=" + getModel() + ", inviteCode=" + getInviteCode() + ", dynamicTotal=" + getDynamicTotal() + ", followTotal=" + getFollowTotal() + ", fansTotal=" + getFansTotal() + ", tickettotal=" + getTickettotal() + ", consumption=" + getConsumption() + ", friendsTotal=" + getFriendsTotal() + ", guestTotal=" + getGuestTotal() + ", collectTotal=" + getCollectTotal() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ", onlineIsauthor=" + getOnlineIsauthor() + ", onlineRoomid=" + getOnlineRoomid() + ", onlineRoomLivetype=" + getOnlineRoomLivetype() + ", vipLevel=" + getVipLevel() + ", userId=" + getUserId() + ", age=" + getAge() + ", levelIcon=" + getLevelIcon() + ", anchorLevelIcon=" + getAnchorLevelIcon() + ", countryEn=" + getCountryEn() + ", likesTotal=" + getLikesTotal() + ", avatarFrame=" + getAvatarFrame() + ", jctx=" + getJctx() + ", chatBubble=" + getChatBubble() + ", badge1=" + getBadge1() + ", badge1Svga=" + getBadge1Svga() + ", badge2=" + getBadge2() + ", badge2Svga=" + getBadge2Svga() + ", badge3=" + getBadge3() + ", badge3Svga=" + getBadge3Svga() + ", userCp=" + getUserCp() + ", userShouhu=" + getUserShouhu() + ", isAttention=" + getIsAttention() + ", isFriends=" + getIsFriends() + ", likesCount=" + getLikesCount() + ", isLiked=" + getIsLiked() + ", colorId=" + getColorId() + ", colorIdIcon=" + getColorIdIcon() + ", familyInfo=" + getFamilyInfo() + ", familyStatus=" + getFamilyStatus() + ", tags=" + getTags() + ", userTags=" + getUserTags() + ", badge=" + getBadge() + ", pk=" + getPk() + ", cars=" + getCars() + ", gifts=" + getGifts() + ", badgeList=" + getBadgeList() + ", authType=" + getAuthType() + ", wealthLevel=" + getWealthLevel() + ", cp=" + getCp() + ", cpDoc=" + getCpDoc() + ", homeDress=" + getHomeDress() + ")";
    }
}
