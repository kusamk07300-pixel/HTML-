package net.babycat.live.model;

import android.text.TextUtils;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.litepal.crud.LitePalSupport;

/* JADX INFO: loaded from: classes4.dex */
public class UserInfoDataBean extends LitePalSupport implements Serializable {
    private Integer age;
    private Integer anchor_level;
    private String anchor_level_icon;
    private Integer auth_type;
    private String avatar;
    private String avatar_frame;
    private String badge1;
    private String badge1_svga;
    private String badge2;
    private String badge2_svga;
    private String badge3;
    private String badge3_svga;
    private String badgeList;
    private List<String> badge_list;
    private String birthday;
    private String chat_bubble;
    private Integer coin;
    private Integer collect_total;
    private String country_code;
    private String country_iso;
    private Integer dynamic_total;
    private String entrance_svga;
    private Integer fans_total;
    private Integer follow_total;
    private Integer is_agency_host;
    private Integer is_attention;
    private Integer is_auth;
    private Integer is_superadmin;
    private Integer isrecord;
    private String jctx;
    private String jctx_type;
    private Integer level;
    private String level_icon;
    private String location;
    private String mobile;
    private Integer next_score_rate;
    private String nickname;
    private Integer online_isauthor;
    private Integer online_roomid;
    private int sex;
    private String signature;
    private Integer silver;
    private String tc_rtc_sig;
    private String tc_rtc_token;
    private String up_score;
    private Integer user_id;
    private String v_card;
    private Integer vip_level;
    private Integer wealth_level;

    public Integer getAge() {
        return this.age;
    }

    public Integer getAnchor_level() {
        return this.anchor_level;
    }

    public String getAnchor_level_icon() {
        return this.anchor_level_icon;
    }

    public Integer getAuth_type() {
        return this.auth_type;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getAvatar_frame() {
        return this.avatar_frame;
    }

    public List<String> getBadge() {
        if (TextUtils.isEmpty(getBadgeList())) {
            return new ArrayList();
        }
        return (List) new Gson().fromJson(getBadgeList(), new TypeToken<List<String>>() { // from class: net.babycat.live.model.UserInfoDataBean.1
        }.getType());
    }

    public String getBadge1() {
        return this.badge1;
    }

    public String getBadge1_svga() {
        return this.badge1_svga;
    }

    public String getBadge2() {
        return this.badge2;
    }

    public String getBadge2_svga() {
        return this.badge2_svga;
    }

    public String getBadge3() {
        return this.badge3;
    }

    public String getBadge3_svga() {
        return this.badge3_svga;
    }

    public String getBadgeList() {
        return this.badgeList;
    }

    public List<String> getBadge_list() {
        return this.badge_list;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public String getChat_bubble() {
        return this.chat_bubble;
    }

    public Integer getCoin() {
        return this.coin;
    }

    public Integer getCollect_total() {
        return this.collect_total;
    }

    public String getCountry_code() {
        return this.country_code;
    }

    public String getCountry_iso() {
        return this.country_iso;
    }

    public Integer getDynamic_total() {
        return this.dynamic_total;
    }

    public String getEntrance_svga() {
        return this.entrance_svga;
    }

    public Integer getFans_total() {
        return this.fans_total;
    }

    public Integer getFollow_total() {
        return this.follow_total;
    }

    public Integer getIs_agency_host() {
        return this.is_agency_host;
    }

    public Integer getIs_attention() {
        return this.is_attention;
    }

    public Integer getIs_auth() {
        return this.is_auth;
    }

    public Integer getIs_superadmin() {
        return this.is_superadmin;
    }

    public Integer getIsrecord() {
        return this.isrecord;
    }

    public String getJctx() {
        return this.jctx;
    }

    public String getJctx_type() {
        return this.jctx_type;
    }

    public Integer getLevel() {
        return this.level;
    }

    public String getLevel_icon() {
        return this.level_icon;
    }

    public String getLocation() {
        return this.location;
    }

    public String getMobile() {
        return this.mobile;
    }

    public Integer getNext_score_rate() {
        return this.next_score_rate;
    }

    public String getNickname() {
        return this.nickname;
    }

    public Integer getOnline_isauthor() {
        return this.online_isauthor;
    }

    public Integer getOnline_roomid() {
        return this.online_roomid;
    }

    public int getSex() {
        return this.sex;
    }

    public String getSignature() {
        return this.signature;
    }

    public Integer getSilver() {
        return this.silver;
    }

    public String getTc_rtc_sig() {
        return this.tc_rtc_sig;
    }

    public String getTc_rtc_token() {
        return this.tc_rtc_token;
    }

    public String getUp_score() {
        return this.up_score;
    }

    public Integer getUserId() {
        return this.user_id;
    }

    public String getV_card() {
        return this.v_card;
    }

    public Integer getVip_level() {
        return this.vip_level;
    }

    public Integer getWealth_level() {
        return this.wealth_level;
    }

    public void setAge(Integer num) {
        this.age = num;
    }

    public void setAnchor_level(Integer num) {
        this.anchor_level = num;
    }

    public void setAnchor_level_icon(String str) {
        this.anchor_level_icon = str;
    }

    public void setAuth_type(Integer num) {
        this.auth_type = num;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setAvatar_frame(String str) {
        this.avatar_frame = str;
    }

    public void setBadge1(String str) {
        this.badge1 = str;
    }

    public void setBadge1_svga(String str) {
        this.badge1_svga = str;
    }

    public void setBadge2(String str) {
        this.badge2 = str;
    }

    public void setBadge2_svga(String str) {
        this.badge2_svga = str;
    }

    public void setBadge3(String str) {
        this.badge3 = str;
    }

    public void setBadge3_svga(String str) {
        this.badge3_svga = str;
    }

    public void setBadgeList(String str) {
        this.badgeList = str;
    }

    public void setBadge_list(List<String> list) {
        this.badge_list = list;
    }

    public void setBirthday(String str) {
        this.birthday = str;
    }

    public void setChat_bubble(String str) {
        this.chat_bubble = str;
    }

    public void setCoin(Integer num) {
        this.coin = num;
    }

    public void setCollect_total(Integer num) {
        this.collect_total = num;
    }

    public void setCountry_code(String str) {
        this.country_code = str;
    }

    public void setCountry_iso(String str) {
        this.country_iso = str;
    }

    public void setDynamic_total(Integer num) {
        this.dynamic_total = num;
    }

    public void setEntrance_svga(String str) {
        this.entrance_svga = str;
    }

    public void setFans_total(Integer num) {
        this.fans_total = num;
    }

    public void setFollow_total(Integer num) {
        this.follow_total = num;
    }

    public void setIs_agency_host(Integer num) {
        this.is_agency_host = num;
    }

    public void setIs_attention(Integer num) {
        this.is_attention = num;
    }

    public void setIs_auth(Integer num) {
        this.is_auth = num;
    }

    public void setIs_superadmin(Integer num) {
        this.is_superadmin = num;
    }

    public void setIsrecord(Integer num) {
        this.isrecord = num;
    }

    public void setJctx(String str) {
        this.jctx = str;
    }

    public void setJctx_type(String str) {
        this.jctx_type = str;
    }

    public void setLevel(Integer num) {
        this.level = num;
    }

    public void setLevel_icon(String str) {
        this.level_icon = str;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setMobile(String str) {
        this.mobile = str;
    }

    public void setNext_score_rate(Integer num) {
        this.next_score_rate = num;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setOnline_isauthor(Integer num) {
        this.online_isauthor = num;
    }

    public void setOnline_roomid(Integer num) {
        this.online_roomid = num;
    }

    public void setSex(int i10) {
        this.sex = i10;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setSilver(Integer num) {
        this.silver = num;
    }

    public void setTc_rtc_sig(String str) {
        this.tc_rtc_sig = str;
    }

    public void setTc_rtc_token(String str) {
        this.tc_rtc_token = str;
    }

    public void setUp_score(String str) {
        this.up_score = str;
    }

    public void setUser_id(Integer num) {
        this.user_id = num;
    }

    public void setV_card(String str) {
        this.v_card = str;
    }

    public void setVip_level(Integer num) {
        this.vip_level = num;
    }

    public void setWealth_level(Integer num) {
        this.wealth_level = num;
    }
}
