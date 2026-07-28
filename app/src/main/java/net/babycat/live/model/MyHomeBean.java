package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import com.tencent.qcloud.tuicore.TUIConstants;
import ea.d;
import g0.o0;
import java.util.List;
import xo.f;

/* JADX INFO: loaded from: classes4.dex */
public class MyHomeBean {

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

    @SerializedName("banner")
    private List<BannerDTO> banner;

    @SerializedName("birthday")
    private String birthday;

    @SerializedName("brand")
    private String brand;

    @SerializedName("cash_rate")
    private Integer cashRate;

    @SerializedName("chat_bubble")
    private String chatBubble;

    @SerializedName("city")
    private String city;

    @SerializedName("coin")
    private Integer coin;

    @SerializedName("collect_total")
    private Integer collectTotal;

    @SerializedName("color_id")
    private String colorId;

    @SerializedName("color_id_icon")
    private String colorIdIcon;

    @SerializedName("consumption")
    private Integer consumption;

    @SerializedName("country_code")
    private Integer countryCode;

    @SerializedName("country_iso")
    private String countryIso;

    @SerializedName("create_time")
    private String createTime;

    @SerializedName("dynamic_total")
    private Integer dynamicTotal;

    @SerializedName("email")
    private String email;

    @SerializedName("end_bantime")
    private Integer endBantime;

    @SerializedName("family_id")
    private Integer familyId;

    @SerializedName("fans_total")
    private Integer fansTotal;

    @SerializedName("follow_total")
    private Integer followTotal;

    @SerializedName("friends_total")
    private Integer friendsTotal;

    @SerializedName("goodnum")
    private String goodnum;

    @SerializedName("guest_total")
    private Integer guestTotal;

    @SerializedName("hx_password")
    private Object hxPassword;

    @SerializedName("hx_uuid")
    private Object hxUuid;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34865id;

    @SerializedName("invite_code")
    private String inviteCode;

    @SerializedName("is_agency")
    private Integer isAgency;

    @SerializedName("is_agency_admin")
    private Integer isAgencyAdmin = 0;

    @SerializedName("is_agent")
    private Integer isAgent;

    @SerializedName("is_anchor")
    private Integer isAnchor;

    @SerializedName("is_attention")
    private Integer isAttention;

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

    @SerializedName("online_isauthor")
    private Integer onlineIsauthor;

    @SerializedName("online_roomid")
    private Integer onlineRoomid;

    @SerializedName("os")
    private String os;

    @SerializedName("province")
    private String province;

    @SerializedName("recommend_time")
    private Integer recommendTime;

    @SerializedName("reg_type")
    private String regType;

    @SerializedName("score")
    private Integer score;

    @SerializedName("sex")
    private Integer sex;

    @SerializedName(TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE)
    private String signature;

    @SerializedName(f.f44680p)
    private String source;

    @SerializedName(o0.CATEGORY_STATUS)
    private Integer status;

    @SerializedName("ticket")
    private Integer ticket;

    @SerializedName("tickettotal")
    private Integer tickettotal;

    @SerializedName("update_time")
    private String updateTime;

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("username")
    private String username;

    @SerializedName("vip_level")
    private Integer vipLevel;

    @SerializedName("wealth_level")
    private Integer wealthLevel;

    public static class BannerDTO {

        @SerializedName("content")
        private Object content;

        @SerializedName("create_time")
        private String createTime;

        @SerializedName(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION)
        private String description;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34866id;

        @SerializedName("image")
        private String image;

        @SerializedName("link_type")
        private Integer linkType;

        @SerializedName("list_order")
        private Integer listOrder;

        @SerializedName("path")
        private String path;

        @SerializedName(o0.CATEGORY_STATUS)
        private Integer status;

        @SerializedName("title")
        private String title;

        @SerializedName("type")
        private Integer type;

        @SerializedName("uid")
        private Integer uid;

        public boolean canEqual(Object obj) {
            return obj instanceof BannerDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BannerDTO)) {
                return false;
            }
            BannerDTO bannerDTO = (BannerDTO) obj;
            if (!bannerDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = bannerDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            Integer status = getStatus();
            Integer status2 = bannerDTO.getStatus();
            if (status != null ? !status.equals(status2) : status2 != null) {
                return false;
            }
            Integer listOrder = getListOrder();
            Integer listOrder2 = bannerDTO.getListOrder();
            if (listOrder != null ? !listOrder.equals(listOrder2) : listOrder2 != null) {
                return false;
            }
            Integer type = getType();
            Integer type2 = bannerDTO.getType();
            if (type != null ? !type.equals(type2) : type2 != null) {
                return false;
            }
            Integer uid = getUid();
            Integer uid2 = bannerDTO.getUid();
            if (uid != null ? !uid.equals(uid2) : uid2 != null) {
                return false;
            }
            Integer linkType = getLinkType();
            Integer linkType2 = bannerDTO.getLinkType();
            if (linkType != null ? !linkType.equals(linkType2) : linkType2 != null) {
                return false;
            }
            String title = getTitle();
            String title2 = bannerDTO.getTitle();
            if (title != null ? !title.equals(title2) : title2 != null) {
                return false;
            }
            String image = getImage();
            String image2 = bannerDTO.getImage();
            if (image != null ? !image.equals(image2) : image2 != null) {
                return false;
            }
            String path = getPath();
            String path2 = bannerDTO.getPath();
            if (path != null ? !path.equals(path2) : path2 != null) {
                return false;
            }
            String description = getDescription();
            String description2 = bannerDTO.getDescription();
            if (description != null ? !description.equals(description2) : description2 != null) {
                return false;
            }
            Object content = getContent();
            Object content2 = bannerDTO.getContent();
            if (content != null ? !content.equals(content2) : content2 != null) {
                return false;
            }
            String createTime = getCreateTime();
            String createTime2 = bannerDTO.getCreateTime();
            return createTime != null ? createTime.equals(createTime2) : createTime2 == null;
        }

        public Object getContent() {
            return this.content;
        }

        public String getCreateTime() {
            return this.createTime;
        }

        public String getDescription() {
            return this.description;
        }

        public Integer getId() {
            return this.f34866id;
        }

        public String getImage() {
            return this.image;
        }

        public Integer getLinkType() {
            return this.linkType;
        }

        public Integer getListOrder() {
            return this.listOrder;
        }

        public String getPath() {
            return this.path;
        }

        public Integer getStatus() {
            return this.status;
        }

        public String getTitle() {
            return this.title;
        }

        public Integer getType() {
            return this.type;
        }

        public Integer getUid() {
            return this.uid;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer status = getStatus();
            int iHashCode2 = ((iHashCode + 59) * 59) + (status == null ? 43 : status.hashCode());
            Integer listOrder = getListOrder();
            int iHashCode3 = (iHashCode2 * 59) + (listOrder == null ? 43 : listOrder.hashCode());
            Integer type = getType();
            int iHashCode4 = (iHashCode3 * 59) + (type == null ? 43 : type.hashCode());
            Integer uid = getUid();
            int iHashCode5 = (iHashCode4 * 59) + (uid == null ? 43 : uid.hashCode());
            Integer linkType = getLinkType();
            int iHashCode6 = (iHashCode5 * 59) + (linkType == null ? 43 : linkType.hashCode());
            String title = getTitle();
            int iHashCode7 = (iHashCode6 * 59) + (title == null ? 43 : title.hashCode());
            String image = getImage();
            int iHashCode8 = (iHashCode7 * 59) + (image == null ? 43 : image.hashCode());
            String path = getPath();
            int iHashCode9 = (iHashCode8 * 59) + (path == null ? 43 : path.hashCode());
            String description = getDescription();
            int iHashCode10 = (iHashCode9 * 59) + (description == null ? 43 : description.hashCode());
            Object content = getContent();
            int iHashCode11 = (iHashCode10 * 59) + (content == null ? 43 : content.hashCode());
            String createTime = getCreateTime();
            return (iHashCode11 * 59) + (createTime != null ? createTime.hashCode() : 43);
        }

        public void setContent(Object obj) {
            this.content = obj;
        }

        public void setCreateTime(String str) {
            this.createTime = str;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setId(Integer num) {
            this.f34866id = num;
        }

        public void setImage(String str) {
            this.image = str;
        }

        public void setLinkType(Integer num) {
            this.linkType = num;
        }

        public void setListOrder(Integer num) {
            this.listOrder = num;
        }

        public void setPath(String str) {
            this.path = str;
        }

        public void setStatus(Integer num) {
            this.status = num;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setType(Integer num) {
            this.type = num;
        }

        public void setUid(Integer num) {
            this.uid = num;
        }

        public String toString() {
            return "MyHomeBean.BannerDTO(id=" + getId() + ", status=" + getStatus() + ", listOrder=" + getListOrder() + ", title=" + getTitle() + ", image=" + getImage() + ", path=" + getPath() + ", description=" + getDescription() + ", content=" + getContent() + ", type=" + getType() + ", uid=" + getUid() + ", createTime=" + getCreateTime() + ", linkType=" + getLinkType() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof MyHomeBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyHomeBean)) {
            return false;
        }
        MyHomeBean myHomeBean = (MyHomeBean) obj;
        if (!myHomeBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = myHomeBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer sex = getSex();
        Integer sex2 = myHomeBean.getSex();
        if (sex != null ? !sex.equals(sex2) : sex2 != null) {
            return false;
        }
        Integer lastLoginTime = getLastLoginTime();
        Integer lastLoginTime2 = myHomeBean.getLastLoginTime();
        if (lastLoginTime != null ? !lastLoginTime.equals(lastLoginTime2) : lastLoginTime2 != null) {
            return false;
        }
        Integer status = getStatus();
        Integer status2 = myHomeBean.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        Integer countryCode = getCountryCode();
        Integer countryCode2 = myHomeBean.getCountryCode();
        if (countryCode != null ? !countryCode.equals(countryCode2) : countryCode2 != null) {
            return false;
        }
        Integer score = getScore();
        Integer score2 = myHomeBean.getScore();
        if (score != null ? !score.equals(score2) : score2 != null) {
            return false;
        }
        Integer coin = getCoin();
        Integer coin2 = myHomeBean.getCoin();
        if (coin != null ? !coin.equals(coin2) : coin2 != null) {
            return false;
        }
        Integer consumption = getConsumption();
        Integer consumption2 = myHomeBean.getConsumption();
        if (consumption != null ? !consumption.equals(consumption2) : consumption2 != null) {
            return false;
        }
        Integer ticket = getTicket();
        Integer ticket2 = myHomeBean.getTicket();
        if (ticket != null ? !ticket.equals(ticket2) : ticket2 != null) {
            return false;
        }
        Integer tickettotal = getTickettotal();
        Integer tickettotal2 = myHomeBean.getTickettotal();
        if (tickettotal != null ? !tickettotal.equals(tickettotal2) : tickettotal2 != null) {
            return false;
        }
        Integer isrecommend = getIsrecommend();
        Integer isrecommend2 = myHomeBean.getIsrecommend();
        if (isrecommend != null ? !isrecommend.equals(isrecommend2) : isrecommend2 != null) {
            return false;
        }
        Integer recommendTime = getRecommendTime();
        Integer recommendTime2 = myHomeBean.getRecommendTime();
        if (recommendTime != null ? !recommendTime.equals(recommendTime2) : recommendTime2 != null) {
            return false;
        }
        Integer isrecord = getIsrecord();
        Integer isrecord2 = myHomeBean.getIsrecord();
        if (isrecord != null ? !isrecord.equals(isrecord2) : isrecord2 != null) {
            return false;
        }
        Integer issuper = getIssuper();
        Integer issuper2 = myHomeBean.getIssuper();
        if (issuper != null ? !issuper.equals(issuper2) : issuper2 != null) {
            return false;
        }
        Integer ishot = getIshot();
        Integer ishot2 = myHomeBean.getIshot();
        if (ishot != null ? !ishot.equals(ishot2) : ishot2 != null) {
            return false;
        }
        Integer endBantime = getEndBantime();
        Integer endBantime2 = myHomeBean.getEndBantime();
        if (endBantime != null ? !endBantime.equals(endBantime2) : endBantime2 != null) {
            return false;
        }
        Integer cashRate = getCashRate();
        Integer cashRate2 = myHomeBean.getCashRate();
        if (cashRate != null ? !cashRate.equals(cashRate2) : cashRate2 != null) {
            return false;
        }
        Integer loginCount = getLoginCount();
        Integer loginCount2 = myHomeBean.getLoginCount();
        if (loginCount != null ? !loginCount.equals(loginCount2) : loginCount2 != null) {
            return false;
        }
        Integer isAgencyAdmin = getIsAgencyAdmin();
        Integer isAgencyAdmin2 = myHomeBean.getIsAgencyAdmin();
        if (isAgencyAdmin != null ? !isAgencyAdmin.equals(isAgencyAdmin2) : isAgencyAdmin2 != null) {
            return false;
        }
        Integer dynamicTotal = getDynamicTotal();
        Integer dynamicTotal2 = myHomeBean.getDynamicTotal();
        if (dynamicTotal != null ? !dynamicTotal.equals(dynamicTotal2) : dynamicTotal2 != null) {
            return false;
        }
        Integer followTotal = getFollowTotal();
        Integer followTotal2 = myHomeBean.getFollowTotal();
        if (followTotal != null ? !followTotal.equals(followTotal2) : followTotal2 != null) {
            return false;
        }
        Integer fansTotal = getFansTotal();
        Integer fansTotal2 = myHomeBean.getFansTotal();
        if (fansTotal != null ? !fansTotal.equals(fansTotal2) : fansTotal2 != null) {
            return false;
        }
        Integer friendsTotal = getFriendsTotal();
        Integer friendsTotal2 = myHomeBean.getFriendsTotal();
        if (friendsTotal != null ? !friendsTotal.equals(friendsTotal2) : friendsTotal2 != null) {
            return false;
        }
        Integer guestTotal = getGuestTotal();
        Integer guestTotal2 = myHomeBean.getGuestTotal();
        if (guestTotal != null ? !guestTotal.equals(guestTotal2) : guestTotal2 != null) {
            return false;
        }
        Integer collectTotal = getCollectTotal();
        Integer collectTotal2 = myHomeBean.getCollectTotal();
        if (collectTotal != null ? !collectTotal.equals(collectTotal2) : collectTotal2 != null) {
            return false;
        }
        Integer level = getLevel();
        Integer level2 = myHomeBean.getLevel();
        if (level != null ? !level.equals(level2) : level2 != null) {
            return false;
        }
        Integer anchorLevel = getAnchorLevel();
        Integer anchorLevel2 = myHomeBean.getAnchorLevel();
        if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
            return false;
        }
        Integer onlineIsauthor = getOnlineIsauthor();
        Integer onlineIsauthor2 = myHomeBean.getOnlineIsauthor();
        if (onlineIsauthor != null ? !onlineIsauthor.equals(onlineIsauthor2) : onlineIsauthor2 != null) {
            return false;
        }
        Integer onlineRoomid = getOnlineRoomid();
        Integer onlineRoomid2 = myHomeBean.getOnlineRoomid();
        if (onlineRoomid != null ? !onlineRoomid.equals(onlineRoomid2) : onlineRoomid2 != null) {
            return false;
        }
        Integer vipLevel = getVipLevel();
        Integer vipLevel2 = myHomeBean.getVipLevel();
        if (vipLevel != null ? !vipLevel.equals(vipLevel2) : vipLevel2 != null) {
            return false;
        }
        Integer userId = getUserId();
        Integer userId2 = myHomeBean.getUserId();
        if (userId != null ? !userId.equals(userId2) : userId2 != null) {
            return false;
        }
        Integer age = getAge();
        Integer age2 = myHomeBean.getAge();
        if (age != null ? !age.equals(age2) : age2 != null) {
            return false;
        }
        Integer isAttention = getIsAttention();
        Integer isAttention2 = myHomeBean.getIsAttention();
        if (isAttention != null ? !isAttention.equals(isAttention2) : isAttention2 != null) {
            return false;
        }
        Integer likesTotal = getLikesTotal();
        Integer likesTotal2 = myHomeBean.getLikesTotal();
        if (likesTotal != null ? !likesTotal.equals(likesTotal2) : likesTotal2 != null) {
            return false;
        }
        Integer familyId = getFamilyId();
        Integer familyId2 = myHomeBean.getFamilyId();
        if (familyId != null ? !familyId.equals(familyId2) : familyId2 != null) {
            return false;
        }
        Integer isAgency = getIsAgency();
        Integer isAgency2 = myHomeBean.getIsAgency();
        if (isAgency != null ? !isAgency.equals(isAgency2) : isAgency2 != null) {
            return false;
        }
        Integer isAnchor = getIsAnchor();
        Integer isAnchor2 = myHomeBean.getIsAnchor();
        if (isAnchor != null ? !isAnchor.equals(isAnchor2) : isAnchor2 != null) {
            return false;
        }
        Integer wealthLevel = getWealthLevel();
        Integer wealthLevel2 = myHomeBean.getWealthLevel();
        if (wealthLevel != null ? !wealthLevel.equals(wealthLevel2) : wealthLevel2 != null) {
            return false;
        }
        Integer authType = getAuthType();
        Integer authType2 = myHomeBean.getAuthType();
        if (authType != null ? !authType.equals(authType2) : authType2 != null) {
            return false;
        }
        Integer isAgent = getIsAgent();
        Integer isAgent2 = myHomeBean.getIsAgent();
        if (isAgent != null ? !isAgent.equals(isAgent2) : isAgent2 != null) {
            return false;
        }
        String username = getUsername();
        String username2 = myHomeBean.getUsername();
        if (username != null ? !username.equals(username2) : username2 != null) {
            return false;
        }
        String nickname = getNickname();
        String nickname2 = myHomeBean.getNickname();
        if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
            return false;
        }
        String birthday = getBirthday();
        String birthday2 = myHomeBean.getBirthday();
        if (birthday != null ? !birthday.equals(birthday2) : birthday2 != null) {
            return false;
        }
        String lastLoginIp = getLastLoginIp();
        String lastLoginIp2 = myHomeBean.getLastLoginIp();
        if (lastLoginIp != null ? !lastLoginIp.equals(lastLoginIp2) : lastLoginIp2 != null) {
            return false;
        }
        String email = getEmail();
        String email2 = myHomeBean.getEmail();
        if (email != null ? !email.equals(email2) : email2 != null) {
            return false;
        }
        String avatar = getAvatar();
        String avatar2 = myHomeBean.getAvatar();
        if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
            return false;
        }
        String signature = getSignature();
        String signature2 = myHomeBean.getSignature();
        if (signature != null ? !signature.equals(signature2) : signature2 != null) {
            return false;
        }
        String countryIso = getCountryIso();
        String countryIso2 = myHomeBean.getCountryIso();
        if (countryIso != null ? !countryIso.equals(countryIso2) : countryIso2 != null) {
            return false;
        }
        String mobile = getMobile();
        String mobile2 = myHomeBean.getMobile();
        if (mobile != null ? !mobile.equals(mobile2) : mobile2 != null) {
            return false;
        }
        String province = getProvince();
        String province2 = myHomeBean.getProvince();
        if (province != null ? !province.equals(province2) : province2 != null) {
            return false;
        }
        String city = getCity();
        String city2 = myHomeBean.getCity();
        if (city != null ? !city.equals(city2) : city2 != null) {
            return false;
        }
        String location = getLocation();
        String location2 = myHomeBean.getLocation();
        if (location != null ? !location.equals(location2) : location2 != null) {
            return false;
        }
        String regType = getRegType();
        String regType2 = myHomeBean.getRegType();
        if (regType != null ? !regType.equals(regType2) : regType2 != null) {
            return false;
        }
        String source = getSource();
        String source2 = myHomeBean.getSource();
        if (source != null ? !source.equals(source2) : source2 != null) {
            return false;
        }
        String goodnum = getGoodnum();
        String goodnum2 = myHomeBean.getGoodnum();
        if (goodnum != null ? !goodnum.equals(goodnum2) : goodnum2 != null) {
            return false;
        }
        Object more = getMore();
        Object more2 = myHomeBean.getMore();
        if (more != null ? !more.equals(more2) : more2 != null) {
            return false;
        }
        String createTime = getCreateTime();
        String createTime2 = myHomeBean.getCreateTime();
        if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
            return false;
        }
        String updateTime = getUpdateTime();
        String updateTime2 = myHomeBean.getUpdateTime();
        if (updateTime != null ? !updateTime.equals(updateTime2) : updateTime2 != null) {
            return false;
        }
        Object hxUuid = getHxUuid();
        Object hxUuid2 = myHomeBean.getHxUuid();
        if (hxUuid != null ? !hxUuid.equals(hxUuid2) : hxUuid2 != null) {
            return false;
        }
        Object hxPassword = getHxPassword();
        Object hxPassword2 = myHomeBean.getHxPassword();
        if (hxPassword != null ? !hxPassword.equals(hxPassword2) : hxPassword2 != null) {
            return false;
        }
        String os = getOs();
        String os2 = myHomeBean.getOs();
        if (os != null ? !os.equals(os2) : os2 != null) {
            return false;
        }
        String brand = getBrand();
        String brand2 = myHomeBean.getBrand();
        if (brand != null ? !brand.equals(brand2) : brand2 != null) {
            return false;
        }
        String model = getModel();
        String model2 = myHomeBean.getModel();
        if (model != null ? !model.equals(model2) : model2 != null) {
            return false;
        }
        String inviteCode = getInviteCode();
        String inviteCode2 = myHomeBean.getInviteCode();
        if (inviteCode != null ? !inviteCode.equals(inviteCode2) : inviteCode2 != null) {
            return false;
        }
        String levelIcon = getLevelIcon();
        String levelIcon2 = myHomeBean.getLevelIcon();
        if (levelIcon != null ? !levelIcon.equals(levelIcon2) : levelIcon2 != null) {
            return false;
        }
        String anchorLevelIcon = getAnchorLevelIcon();
        String anchorLevelIcon2 = myHomeBean.getAnchorLevelIcon();
        if (anchorLevelIcon != null ? !anchorLevelIcon.equals(anchorLevelIcon2) : anchorLevelIcon2 != null) {
            return false;
        }
        String avatarFrame = getAvatarFrame();
        String avatarFrame2 = myHomeBean.getAvatarFrame();
        if (avatarFrame != null ? !avatarFrame.equals(avatarFrame2) : avatarFrame2 != null) {
            return false;
        }
        String jctx = getJctx();
        String jctx2 = myHomeBean.getJctx();
        if (jctx != null ? !jctx.equals(jctx2) : jctx2 != null) {
            return false;
        }
        String chatBubble = getChatBubble();
        String chatBubble2 = myHomeBean.getChatBubble();
        if (chatBubble != null ? !chatBubble.equals(chatBubble2) : chatBubble2 != null) {
            return false;
        }
        String badge1 = getBadge1();
        String badge12 = myHomeBean.getBadge1();
        if (badge1 != null ? !badge1.equals(badge12) : badge12 != null) {
            return false;
        }
        String badge1Svga = getBadge1Svga();
        String badge1Svga2 = myHomeBean.getBadge1Svga();
        if (badge1Svga != null ? !badge1Svga.equals(badge1Svga2) : badge1Svga2 != null) {
            return false;
        }
        String badge2 = getBadge2();
        String badge22 = myHomeBean.getBadge2();
        if (badge2 != null ? !badge2.equals(badge22) : badge22 != null) {
            return false;
        }
        String badge2Svga = getBadge2Svga();
        String badge2Svga2 = myHomeBean.getBadge2Svga();
        if (badge2Svga != null ? !badge2Svga.equals(badge2Svga2) : badge2Svga2 != null) {
            return false;
        }
        String badge3 = getBadge3();
        String badge32 = myHomeBean.getBadge3();
        if (badge3 != null ? !badge3.equals(badge32) : badge32 != null) {
            return false;
        }
        String badge3Svga = getBadge3Svga();
        String badge3Svga2 = myHomeBean.getBadge3Svga();
        if (badge3Svga != null ? !badge3Svga.equals(badge3Svga2) : badge3Svga2 != null) {
            return false;
        }
        List<BannerDTO> banner = getBanner();
        List<BannerDTO> banner2 = myHomeBean.getBanner();
        if (banner != null ? !banner.equals(banner2) : banner2 != null) {
            return false;
        }
        List<String> badgeList = getBadgeList();
        List<String> badgeList2 = myHomeBean.getBadgeList();
        if (badgeList != null ? !badgeList.equals(badgeList2) : badgeList2 != null) {
            return false;
        }
        String colorId = getColorId();
        String colorId2 = myHomeBean.getColorId();
        if (colorId != null ? !colorId.equals(colorId2) : colorId2 != null) {
            return false;
        }
        String colorIdIcon = getColorIdIcon();
        String colorIdIcon2 = myHomeBean.getColorIdIcon();
        return colorIdIcon != null ? colorIdIcon.equals(colorIdIcon2) : colorIdIcon2 == null;
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

    public List<BannerDTO> getBanner() {
        return this.banner;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public String getBrand() {
        return this.brand;
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

    public Integer getCoin() {
        return this.coin;
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

    public Integer getConsumption() {
        return this.consumption;
    }

    public Integer getCountryCode() {
        return this.countryCode;
    }

    public String getCountryIso() {
        return this.countryIso;
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

    public Integer getFamilyId() {
        return this.familyId;
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

    public String getGoodnum() {
        return this.goodnum;
    }

    public Integer getGuestTotal() {
        return this.guestTotal;
    }

    public Object getHxPassword() {
        return this.hxPassword;
    }

    public Object getHxUuid() {
        return this.hxUuid;
    }

    public Integer getId() {
        return this.f34865id;
    }

    public String getInviteCode() {
        return this.inviteCode;
    }

    public Integer getIsAgency() {
        return this.isAgency;
    }

    public Integer getIsAgencyAdmin() {
        return this.isAgencyAdmin;
    }

    public Integer getIsAgent() {
        return this.isAgent;
    }

    public Integer getIsAnchor() {
        return this.isAnchor;
    }

    public Integer getIsAttention() {
        return this.isAttention;
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

    public Integer getOnlineIsauthor() {
        return this.onlineIsauthor;
    }

    public Integer getOnlineRoomid() {
        return this.onlineRoomid;
    }

    public String getOs() {
        return this.os;
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

    public Integer getScore() {
        return this.score;
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

    public Integer getTicket() {
        return this.ticket;
    }

    public Integer getTickettotal() {
        return this.tickettotal;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public Integer getUserId() {
        return this.userId;
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
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        Integer sex = getSex();
        int iHashCode2 = ((iHashCode + 59) * 59) + (sex == null ? 43 : sex.hashCode());
        Integer lastLoginTime = getLastLoginTime();
        int iHashCode3 = (iHashCode2 * 59) + (lastLoginTime == null ? 43 : lastLoginTime.hashCode());
        Integer status = getStatus();
        int iHashCode4 = (iHashCode3 * 59) + (status == null ? 43 : status.hashCode());
        Integer countryCode = getCountryCode();
        int iHashCode5 = (iHashCode4 * 59) + (countryCode == null ? 43 : countryCode.hashCode());
        Integer score = getScore();
        int iHashCode6 = (iHashCode5 * 59) + (score == null ? 43 : score.hashCode());
        Integer coin = getCoin();
        int iHashCode7 = (iHashCode6 * 59) + (coin == null ? 43 : coin.hashCode());
        Integer consumption = getConsumption();
        int iHashCode8 = (iHashCode7 * 59) + (consumption == null ? 43 : consumption.hashCode());
        Integer ticket = getTicket();
        int iHashCode9 = (iHashCode8 * 59) + (ticket == null ? 43 : ticket.hashCode());
        Integer tickettotal = getTickettotal();
        int iHashCode10 = (iHashCode9 * 59) + (tickettotal == null ? 43 : tickettotal.hashCode());
        Integer isrecommend = getIsrecommend();
        int iHashCode11 = (iHashCode10 * 59) + (isrecommend == null ? 43 : isrecommend.hashCode());
        Integer recommendTime = getRecommendTime();
        int iHashCode12 = (iHashCode11 * 59) + (recommendTime == null ? 43 : recommendTime.hashCode());
        Integer isrecord = getIsrecord();
        int iHashCode13 = (iHashCode12 * 59) + (isrecord == null ? 43 : isrecord.hashCode());
        Integer issuper = getIssuper();
        int iHashCode14 = (iHashCode13 * 59) + (issuper == null ? 43 : issuper.hashCode());
        Integer ishot = getIshot();
        int iHashCode15 = (iHashCode14 * 59) + (ishot == null ? 43 : ishot.hashCode());
        Integer endBantime = getEndBantime();
        int iHashCode16 = (iHashCode15 * 59) + (endBantime == null ? 43 : endBantime.hashCode());
        Integer cashRate = getCashRate();
        int iHashCode17 = (iHashCode16 * 59) + (cashRate == null ? 43 : cashRate.hashCode());
        Integer loginCount = getLoginCount();
        int iHashCode18 = (iHashCode17 * 59) + (loginCount == null ? 43 : loginCount.hashCode());
        Integer isAgencyAdmin = getIsAgencyAdmin();
        int iHashCode19 = (iHashCode18 * 59) + (isAgencyAdmin == null ? 43 : isAgencyAdmin.hashCode());
        Integer dynamicTotal = getDynamicTotal();
        int iHashCode20 = (iHashCode19 * 59) + (dynamicTotal == null ? 43 : dynamicTotal.hashCode());
        Integer followTotal = getFollowTotal();
        int iHashCode21 = (iHashCode20 * 59) + (followTotal == null ? 43 : followTotal.hashCode());
        Integer fansTotal = getFansTotal();
        int iHashCode22 = (iHashCode21 * 59) + (fansTotal == null ? 43 : fansTotal.hashCode());
        Integer friendsTotal = getFriendsTotal();
        int iHashCode23 = (iHashCode22 * 59) + (friendsTotal == null ? 43 : friendsTotal.hashCode());
        Integer guestTotal = getGuestTotal();
        int iHashCode24 = (iHashCode23 * 59) + (guestTotal == null ? 43 : guestTotal.hashCode());
        Integer collectTotal = getCollectTotal();
        int iHashCode25 = (iHashCode24 * 59) + (collectTotal == null ? 43 : collectTotal.hashCode());
        Integer level = getLevel();
        int iHashCode26 = (iHashCode25 * 59) + (level == null ? 43 : level.hashCode());
        Integer anchorLevel = getAnchorLevel();
        int iHashCode27 = (iHashCode26 * 59) + (anchorLevel == null ? 43 : anchorLevel.hashCode());
        Integer onlineIsauthor = getOnlineIsauthor();
        int iHashCode28 = (iHashCode27 * 59) + (onlineIsauthor == null ? 43 : onlineIsauthor.hashCode());
        Integer onlineRoomid = getOnlineRoomid();
        int iHashCode29 = (iHashCode28 * 59) + (onlineRoomid == null ? 43 : onlineRoomid.hashCode());
        Integer vipLevel = getVipLevel();
        int iHashCode30 = (iHashCode29 * 59) + (vipLevel == null ? 43 : vipLevel.hashCode());
        Integer userId = getUserId();
        int iHashCode31 = (iHashCode30 * 59) + (userId == null ? 43 : userId.hashCode());
        Integer age = getAge();
        int iHashCode32 = (iHashCode31 * 59) + (age == null ? 43 : age.hashCode());
        Integer isAttention = getIsAttention();
        int iHashCode33 = (iHashCode32 * 59) + (isAttention == null ? 43 : isAttention.hashCode());
        Integer likesTotal = getLikesTotal();
        int iHashCode34 = (iHashCode33 * 59) + (likesTotal == null ? 43 : likesTotal.hashCode());
        Integer familyId = getFamilyId();
        int iHashCode35 = (iHashCode34 * 59) + (familyId == null ? 43 : familyId.hashCode());
        Integer isAgency = getIsAgency();
        int iHashCode36 = (iHashCode35 * 59) + (isAgency == null ? 43 : isAgency.hashCode());
        Integer isAnchor = getIsAnchor();
        int iHashCode37 = (iHashCode36 * 59) + (isAnchor == null ? 43 : isAnchor.hashCode());
        Integer wealthLevel = getWealthLevel();
        int iHashCode38 = (iHashCode37 * 59) + (wealthLevel == null ? 43 : wealthLevel.hashCode());
        Integer authType = getAuthType();
        int iHashCode39 = (iHashCode38 * 59) + (authType == null ? 43 : authType.hashCode());
        Integer isAgent = getIsAgent();
        int iHashCode40 = (iHashCode39 * 59) + (isAgent == null ? 43 : isAgent.hashCode());
        String username = getUsername();
        int iHashCode41 = (iHashCode40 * 59) + (username == null ? 43 : username.hashCode());
        String nickname = getNickname();
        int iHashCode42 = (iHashCode41 * 59) + (nickname == null ? 43 : nickname.hashCode());
        String birthday = getBirthday();
        int iHashCode43 = (iHashCode42 * 59) + (birthday == null ? 43 : birthday.hashCode());
        String lastLoginIp = getLastLoginIp();
        int iHashCode44 = (iHashCode43 * 59) + (lastLoginIp == null ? 43 : lastLoginIp.hashCode());
        String email = getEmail();
        int iHashCode45 = (iHashCode44 * 59) + (email == null ? 43 : email.hashCode());
        String avatar = getAvatar();
        int iHashCode46 = (iHashCode45 * 59) + (avatar == null ? 43 : avatar.hashCode());
        String signature = getSignature();
        int iHashCode47 = (iHashCode46 * 59) + (signature == null ? 43 : signature.hashCode());
        String countryIso = getCountryIso();
        int iHashCode48 = (iHashCode47 * 59) + (countryIso == null ? 43 : countryIso.hashCode());
        String mobile = getMobile();
        int iHashCode49 = (iHashCode48 * 59) + (mobile == null ? 43 : mobile.hashCode());
        String province = getProvince();
        int iHashCode50 = (iHashCode49 * 59) + (province == null ? 43 : province.hashCode());
        String city = getCity();
        int iHashCode51 = (iHashCode50 * 59) + (city == null ? 43 : city.hashCode());
        String location = getLocation();
        int iHashCode52 = (iHashCode51 * 59) + (location == null ? 43 : location.hashCode());
        String regType = getRegType();
        int iHashCode53 = (iHashCode52 * 59) + (regType == null ? 43 : regType.hashCode());
        String source = getSource();
        int iHashCode54 = (iHashCode53 * 59) + (source == null ? 43 : source.hashCode());
        String goodnum = getGoodnum();
        int iHashCode55 = (iHashCode54 * 59) + (goodnum == null ? 43 : goodnum.hashCode());
        Object more = getMore();
        int iHashCode56 = (iHashCode55 * 59) + (more == null ? 43 : more.hashCode());
        String createTime = getCreateTime();
        int iHashCode57 = (iHashCode56 * 59) + (createTime == null ? 43 : createTime.hashCode());
        String updateTime = getUpdateTime();
        int iHashCode58 = (iHashCode57 * 59) + (updateTime == null ? 43 : updateTime.hashCode());
        Object hxUuid = getHxUuid();
        int iHashCode59 = (iHashCode58 * 59) + (hxUuid == null ? 43 : hxUuid.hashCode());
        Object hxPassword = getHxPassword();
        int iHashCode60 = (iHashCode59 * 59) + (hxPassword == null ? 43 : hxPassword.hashCode());
        String os = getOs();
        int iHashCode61 = (iHashCode60 * 59) + (os == null ? 43 : os.hashCode());
        String brand = getBrand();
        int iHashCode62 = (iHashCode61 * 59) + (brand == null ? 43 : brand.hashCode());
        String model = getModel();
        int iHashCode63 = (iHashCode62 * 59) + (model == null ? 43 : model.hashCode());
        String inviteCode = getInviteCode();
        int iHashCode64 = (iHashCode63 * 59) + (inviteCode == null ? 43 : inviteCode.hashCode());
        String levelIcon = getLevelIcon();
        int iHashCode65 = (iHashCode64 * 59) + (levelIcon == null ? 43 : levelIcon.hashCode());
        String anchorLevelIcon = getAnchorLevelIcon();
        int iHashCode66 = (iHashCode65 * 59) + (anchorLevelIcon == null ? 43 : anchorLevelIcon.hashCode());
        String avatarFrame = getAvatarFrame();
        int iHashCode67 = (iHashCode66 * 59) + (avatarFrame == null ? 43 : avatarFrame.hashCode());
        String jctx = getJctx();
        int iHashCode68 = (iHashCode67 * 59) + (jctx == null ? 43 : jctx.hashCode());
        String chatBubble = getChatBubble();
        int iHashCode69 = (iHashCode68 * 59) + (chatBubble == null ? 43 : chatBubble.hashCode());
        String badge1 = getBadge1();
        int iHashCode70 = (iHashCode69 * 59) + (badge1 == null ? 43 : badge1.hashCode());
        String badge1Svga = getBadge1Svga();
        int iHashCode71 = (iHashCode70 * 59) + (badge1Svga == null ? 43 : badge1Svga.hashCode());
        String badge2 = getBadge2();
        int iHashCode72 = (iHashCode71 * 59) + (badge2 == null ? 43 : badge2.hashCode());
        String badge2Svga = getBadge2Svga();
        int iHashCode73 = (iHashCode72 * 59) + (badge2Svga == null ? 43 : badge2Svga.hashCode());
        String badge3 = getBadge3();
        int iHashCode74 = (iHashCode73 * 59) + (badge3 == null ? 43 : badge3.hashCode());
        String badge3Svga = getBadge3Svga();
        int iHashCode75 = (iHashCode74 * 59) + (badge3Svga == null ? 43 : badge3Svga.hashCode());
        List<BannerDTO> banner = getBanner();
        int iHashCode76 = (iHashCode75 * 59) + (banner == null ? 43 : banner.hashCode());
        List<String> badgeList = getBadgeList();
        int iHashCode77 = (iHashCode76 * 59) + (badgeList == null ? 43 : badgeList.hashCode());
        String colorId = getColorId();
        int iHashCode78 = (iHashCode77 * 59) + (colorId == null ? 43 : colorId.hashCode());
        String colorIdIcon = getColorIdIcon();
        return (iHashCode78 * 59) + (colorIdIcon != null ? colorIdIcon.hashCode() : 43);
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

    public void setBanner(List<BannerDTO> list) {
        this.banner = list;
    }

    public void setBirthday(String str) {
        this.birthday = str;
    }

    public void setBrand(String str) {
        this.brand = str;
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

    public void setCoin(Integer num) {
        this.coin = num;
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

    public void setConsumption(Integer num) {
        this.consumption = num;
    }

    public void setCountryCode(Integer num) {
        this.countryCode = num;
    }

    public void setCountryIso(String str) {
        this.countryIso = str;
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

    public void setFamilyId(Integer num) {
        this.familyId = num;
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

    public void setGoodnum(String str) {
        this.goodnum = str;
    }

    public void setGuestTotal(Integer num) {
        this.guestTotal = num;
    }

    public void setHxPassword(Object obj) {
        this.hxPassword = obj;
    }

    public void setHxUuid(Object obj) {
        this.hxUuid = obj;
    }

    public void setId(Integer num) {
        this.f34865id = num;
    }

    public void setInviteCode(String str) {
        this.inviteCode = str;
    }

    public void setIsAgency(Integer num) {
        this.isAgency = num;
    }

    public void setIsAgencyAdmin(Integer num) {
        this.isAgencyAdmin = num;
    }

    public void setIsAgent(Integer num) {
        this.isAgent = num;
    }

    public void setIsAnchor(Integer num) {
        this.isAnchor = num;
    }

    public void setIsAttention(Integer num) {
        this.isAttention = num;
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

    public void setOnlineIsauthor(Integer num) {
        this.onlineIsauthor = num;
    }

    public void setOnlineRoomid(Integer num) {
        this.onlineRoomid = num;
    }

    public void setOs(String str) {
        this.os = str;
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

    public void setScore(Integer num) {
        this.score = num;
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

    public void setTicket(Integer num) {
        this.ticket = num;
    }

    public void setTickettotal(Integer num) {
        this.tickettotal = num;
    }

    public void setUpdateTime(String str) {
        this.updateTime = str;
    }

    public void setUserId(Integer num) {
        this.userId = num;
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
        return "MyHomeBean(id=" + getId() + ", username=" + getUsername() + ", nickname=" + getNickname() + ", sex=" + getSex() + ", birthday=" + getBirthday() + ", lastLoginTime=" + getLastLoginTime() + ", lastLoginIp=" + getLastLoginIp() + ", status=" + getStatus() + ", email=" + getEmail() + ", avatar=" + getAvatar() + ", signature=" + getSignature() + ", countryCode=" + getCountryCode() + ", countryIso=" + getCountryIso() + ", mobile=" + getMobile() + ", score=" + getScore() + ", coin=" + getCoin() + ", consumption=" + getConsumption() + ", ticket=" + getTicket() + ", tickettotal=" + getTickettotal() + ", province=" + getProvince() + ", city=" + getCity() + ", location=" + getLocation() + ", isrecommend=" + getIsrecommend() + ", recommendTime=" + getRecommendTime() + ", regType=" + getRegType() + ", source=" + getSource() + ", isrecord=" + getIsrecord() + ", issuper=" + getIssuper() + ", ishot=" + getIshot() + ", goodnum=" + getGoodnum() + ", endBantime=" + getEndBantime() + ", cashRate=" + getCashRate() + ", more=" + getMore() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ", loginCount=" + getLoginCount() + ", hxUuid=" + getHxUuid() + ", hxPassword=" + getHxPassword() + ", os=" + getOs() + ", brand=" + getBrand() + ", isAgencyAdmin=" + getIsAgencyAdmin() + ", model=" + getModel() + ", inviteCode=" + getInviteCode() + ", dynamicTotal=" + getDynamicTotal() + ", followTotal=" + getFollowTotal() + ", fansTotal=" + getFansTotal() + ", friendsTotal=" + getFriendsTotal() + ", guestTotal=" + getGuestTotal() + ", collectTotal=" + getCollectTotal() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ", onlineIsauthor=" + getOnlineIsauthor() + ", onlineRoomid=" + getOnlineRoomid() + ", vipLevel=" + getVipLevel() + ", userId=" + getUserId() + ", age=" + getAge() + ", levelIcon=" + getLevelIcon() + ", anchorLevelIcon=" + getAnchorLevelIcon() + ", avatarFrame=" + getAvatarFrame() + ", jctx=" + getJctx() + ", chatBubble=" + getChatBubble() + ", badge1=" + getBadge1() + ", badge1Svga=" + getBadge1Svga() + ", badge2=" + getBadge2() + ", badge2Svga=" + getBadge2Svga() + ", badge3=" + getBadge3() + ", badge3Svga=" + getBadge3Svga() + ", banner=" + getBanner() + ", badgeList=" + getBadgeList() + ", isAttention=" + getIsAttention() + ", likesTotal=" + getLikesTotal() + ", familyId=" + getFamilyId() + ", isAgency=" + getIsAgency() + ", isAnchor=" + getIsAnchor() + ", colorId=" + getColorId() + ", colorIdIcon=" + getColorIdIcon() + ", wealthLevel=" + getWealthLevel() + ", authType=" + getAuthType() + ", isAgent=" + getIsAgent() + ")";
    }
}
