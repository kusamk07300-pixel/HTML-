package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class FamilyHomeBean {

    @SerializedName("badge")
    private String badge;

    @SerializedName("briefing")
    private String briefing;

    @SerializedName("contribution")
    private List<ContributionDTO> contribution;

    @SerializedName("family_room")
    private List<RoomListBean> familyRoom;

    @SerializedName("member_list")
    private List<memberDoTo> familyUserBean;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34825id;

    @SerializedName("is_admin")
    private Integer isAdmin;

    @SerializedName("is_family_member")
    private Integer isFamilyMember;

    @SerializedName("level_info")
    private LevelInfo levelInfo;

    @SerializedName("member_cnt")
    private MemberCnt memberCnt;

    @SerializedName("name")
    private String name;

    @SerializedName(TUIConstants.TUIChat.OWNER)
    private OwnerDTO owner;

    @SerializedName("policy_url")
    private String policyUrl;

    @SerializedName("rank")
    private String rank;

    @SerializedName("show_join_family")
    private Integer showJoinFamily;

    public static class ContributionDTO {

        @SerializedName("user")
        private UserDTO user;

        public boolean canEqual(Object obj) {
            return obj instanceof ContributionDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ContributionDTO)) {
                return false;
            }
            ContributionDTO contributionDTO = (ContributionDTO) obj;
            if (!contributionDTO.canEqual(this)) {
                return false;
            }
            UserDTO user = getUser();
            UserDTO user2 = contributionDTO.getUser();
            return user != null ? user.equals(user2) : user2 == null;
        }

        public UserDTO getUser() {
            return this.user;
        }

        public int hashCode() {
            UserDTO user = getUser();
            return 59 + (user == null ? 43 : user.hashCode());
        }

        public void setUser(UserDTO userDTO) {
            this.user = userDTO;
        }

        public String toString() {
            return "FamilyHomeBean.ContributionDTO(user=" + getUser() + ")";
        }
    }

    public static class LevelInfo {

        @SerializedName("avatar_frame")
        private String avatarFrame;

        @SerializedName("badge")
        private String badge;

        @SerializedName("current_level")
        private Integer currentLevel;

        @SerializedName("firepower")
        private Integer firepower;

        @SerializedName("firepower_rate")
        private Float firepowerRate;

        @SerializedName("name")
        private String name;

        @SerializedName("need_firepower")
        private Integer need_firepower;

        @SerializedName("next_level")
        private Integer nextLevel;

        @SerializedName("next_level_name")
        private String nextLevelName;

        @SerializedName("next_firepower")
        private Integer next_firepower;

        public boolean canEqual(Object obj) {
            return obj instanceof LevelInfo;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LevelInfo)) {
                return false;
            }
            LevelInfo levelInfo = (LevelInfo) obj;
            if (!levelInfo.canEqual(this)) {
                return false;
            }
            Integer need_firepower = getNeed_firepower();
            Integer need_firepower2 = levelInfo.getNeed_firepower();
            if (need_firepower != null ? !need_firepower.equals(need_firepower2) : need_firepower2 != null) {
                return false;
            }
            Integer firepower = getFirepower();
            Integer firepower2 = levelInfo.getFirepower();
            if (firepower != null ? !firepower.equals(firepower2) : firepower2 != null) {
                return false;
            }
            Integer next_firepower = getNext_firepower();
            Integer next_firepower2 = levelInfo.getNext_firepower();
            if (next_firepower != null ? !next_firepower.equals(next_firepower2) : next_firepower2 != null) {
                return false;
            }
            Float firepowerRate = getFirepowerRate();
            Float firepowerRate2 = levelInfo.getFirepowerRate();
            if (firepowerRate != null ? !firepowerRate.equals(firepowerRate2) : firepowerRate2 != null) {
                return false;
            }
            Integer currentLevel = getCurrentLevel();
            Integer currentLevel2 = levelInfo.getCurrentLevel();
            if (currentLevel != null ? !currentLevel.equals(currentLevel2) : currentLevel2 != null) {
                return false;
            }
            Integer nextLevel = getNextLevel();
            Integer nextLevel2 = levelInfo.getNextLevel();
            if (nextLevel != null ? !nextLevel.equals(nextLevel2) : nextLevel2 != null) {
                return false;
            }
            String badge = getBadge();
            String badge2 = levelInfo.getBadge();
            if (badge != null ? !badge.equals(badge2) : badge2 != null) {
                return false;
            }
            String name = getName();
            String name2 = levelInfo.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String avatarFrame = getAvatarFrame();
            String avatarFrame2 = levelInfo.getAvatarFrame();
            if (avatarFrame != null ? !avatarFrame.equals(avatarFrame2) : avatarFrame2 != null) {
                return false;
            }
            String nextLevelName = getNextLevelName();
            String nextLevelName2 = levelInfo.getNextLevelName();
            return nextLevelName != null ? nextLevelName.equals(nextLevelName2) : nextLevelName2 == null;
        }

        public String getAvatarFrame() {
            return this.avatarFrame;
        }

        public String getBadge() {
            return this.badge;
        }

        public Integer getCurrentLevel() {
            return this.currentLevel;
        }

        public Integer getFirepower() {
            return this.firepower;
        }

        public Float getFirepowerRate() {
            return this.firepowerRate;
        }

        public String getName() {
            return this.name;
        }

        public Integer getNeed_firepower() {
            return this.need_firepower;
        }

        public Integer getNextLevel() {
            return this.nextLevel;
        }

        public String getNextLevelName() {
            return this.nextLevelName;
        }

        public Integer getNext_firepower() {
            return this.next_firepower;
        }

        public int hashCode() {
            Integer need_firepower = getNeed_firepower();
            int iHashCode = need_firepower == null ? 43 : need_firepower.hashCode();
            Integer firepower = getFirepower();
            int iHashCode2 = ((iHashCode + 59) * 59) + (firepower == null ? 43 : firepower.hashCode());
            Integer next_firepower = getNext_firepower();
            int iHashCode3 = (iHashCode2 * 59) + (next_firepower == null ? 43 : next_firepower.hashCode());
            Float firepowerRate = getFirepowerRate();
            int iHashCode4 = (iHashCode3 * 59) + (firepowerRate == null ? 43 : firepowerRate.hashCode());
            Integer currentLevel = getCurrentLevel();
            int iHashCode5 = (iHashCode4 * 59) + (currentLevel == null ? 43 : currentLevel.hashCode());
            Integer nextLevel = getNextLevel();
            int iHashCode6 = (iHashCode5 * 59) + (nextLevel == null ? 43 : nextLevel.hashCode());
            String badge = getBadge();
            int iHashCode7 = (iHashCode6 * 59) + (badge == null ? 43 : badge.hashCode());
            String name = getName();
            int iHashCode8 = (iHashCode7 * 59) + (name == null ? 43 : name.hashCode());
            String avatarFrame = getAvatarFrame();
            int iHashCode9 = (iHashCode8 * 59) + (avatarFrame == null ? 43 : avatarFrame.hashCode());
            String nextLevelName = getNextLevelName();
            return (iHashCode9 * 59) + (nextLevelName != null ? nextLevelName.hashCode() : 43);
        }

        public void setAvatarFrame(String str) {
            this.avatarFrame = str;
        }

        public void setBadge(String str) {
            this.badge = str;
        }

        public void setCurrentLevel(Integer num) {
            this.currentLevel = num;
        }

        public void setFirepower(Integer num) {
            this.firepower = num;
        }

        public void setFirepowerRate(Float f10) {
            this.firepowerRate = f10;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setNeed_firepower(Integer num) {
            this.need_firepower = num;
        }

        public void setNextLevel(Integer num) {
            this.nextLevel = num;
        }

        public void setNextLevelName(String str) {
            this.nextLevelName = str;
        }

        public void setNext_firepower(Integer num) {
            this.next_firepower = num;
        }

        public String toString() {
            return "FamilyHomeBean.LevelInfo(badge=" + getBadge() + ", name=" + getName() + ", avatarFrame=" + getAvatarFrame() + ", need_firepower=" + getNeed_firepower() + ", firepower=" + getFirepower() + ", next_firepower=" + getNext_firepower() + ", firepowerRate=" + getFirepowerRate() + ", currentLevel=" + getCurrentLevel() + ", nextLevel=" + getNextLevel() + ", nextLevelName=" + getNextLevelName() + ")";
        }
    }

    public static class MemberCnt {

        @SerializedName("count")
        private Integer count;

        @SerializedName("limit_cnt")
        private Integer limit_cnt;

        public boolean canEqual(Object obj) {
            return obj instanceof MemberCnt;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MemberCnt)) {
                return false;
            }
            MemberCnt memberCnt = (MemberCnt) obj;
            if (!memberCnt.canEqual(this)) {
                return false;
            }
            Integer count = getCount();
            Integer count2 = memberCnt.getCount();
            if (count != null ? !count.equals(count2) : count2 != null) {
                return false;
            }
            Integer limit_cnt = getLimit_cnt();
            Integer limit_cnt2 = memberCnt.getLimit_cnt();
            return limit_cnt != null ? limit_cnt.equals(limit_cnt2) : limit_cnt2 == null;
        }

        public Integer getCount() {
            return this.count;
        }

        public Integer getLimit_cnt() {
            return this.limit_cnt;
        }

        public int hashCode() {
            Integer count = getCount();
            int iHashCode = count == null ? 43 : count.hashCode();
            Integer limit_cnt = getLimit_cnt();
            return ((iHashCode + 59) * 59) + (limit_cnt != null ? limit_cnt.hashCode() : 43);
        }

        public void setCount(Integer num) {
            this.count = num;
        }

        public void setLimit_cnt(Integer num) {
            this.limit_cnt = num;
        }

        public String toString() {
            return "FamilyHomeBean.MemberCnt(count=" + getCount() + ", limit_cnt=" + getLimit_cnt() + ")";
        }
    }

    public static class OwnerDTO {

        @SerializedName("avatar")
        private String avatar;

        @SerializedName("medal_list")
        private List<String> medalList;

        @SerializedName("nickname")
        private String nickname;

        @SerializedName("uid")
        private Integer uid;

        public boolean canEqual(Object obj) {
            return obj instanceof OwnerDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OwnerDTO)) {
                return false;
            }
            OwnerDTO ownerDTO = (OwnerDTO) obj;
            if (!ownerDTO.canEqual(this)) {
                return false;
            }
            Integer uid = getUid();
            Integer uid2 = ownerDTO.getUid();
            if (uid != null ? !uid.equals(uid2) : uid2 != null) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = ownerDTO.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = ownerDTO.getAvatar();
            if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
                return false;
            }
            List<String> medalList = getMedalList();
            List<String> medalList2 = ownerDTO.getMedalList();
            return medalList != null ? medalList.equals(medalList2) : medalList2 == null;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public List<String> getMedalList() {
            return this.medalList;
        }

        public String getNickname() {
            return this.nickname;
        }

        public Integer getUid() {
            return this.uid;
        }

        public int hashCode() {
            Integer uid = getUid();
            int iHashCode = uid == null ? 43 : uid.hashCode();
            String nickname = getNickname();
            int iHashCode2 = ((iHashCode + 59) * 59) + (nickname == null ? 43 : nickname.hashCode());
            String avatar = getAvatar();
            int iHashCode3 = (iHashCode2 * 59) + (avatar == null ? 43 : avatar.hashCode());
            List<String> medalList = getMedalList();
            return (iHashCode3 * 59) + (medalList != null ? medalList.hashCode() : 43);
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setMedalList(List<String> list) {
            this.medalList = list;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public void setUid(Integer num) {
            this.uid = num;
        }

        public String toString() {
            return "FamilyHomeBean.OwnerDTO(uid=" + getUid() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", medalList=" + getMedalList() + ")";
        }
    }

    public static class UserDTO {

        @SerializedName("avatar")
        private String avatar;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34826id;

        @SerializedName("nickname")
        private String nickname;

        public boolean canEqual(Object obj) {
            return obj instanceof UserDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserDTO)) {
                return false;
            }
            UserDTO userDTO = (UserDTO) obj;
            if (!userDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = userDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = userDTO.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = userDTO.getAvatar();
            return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public Integer getId() {
            return this.f34826id;
        }

        public String getNickname() {
            return this.nickname;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            String nickname = getNickname();
            int iHashCode2 = ((iHashCode + 59) * 59) + (nickname == null ? 43 : nickname.hashCode());
            String avatar = getAvatar();
            return (iHashCode2 * 59) + (avatar != null ? avatar.hashCode() : 43);
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setId(Integer num) {
            this.f34826id = num;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public String toString() {
            return "FamilyHomeBean.UserDTO(id=" + getId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ")";
        }
    }

    public static class memberDoTo {

        @SerializedName("avatar")
        private String avatar;

        @SerializedName("is_admin")
        private Integer isAdmin;

        @SerializedName("uid")
        private Integer uid;

        public boolean canEqual(Object obj) {
            return obj instanceof memberDoTo;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof memberDoTo)) {
                return false;
            }
            memberDoTo memberdoto = (memberDoTo) obj;
            if (!memberdoto.canEqual(this)) {
                return false;
            }
            Integer uid = getUid();
            Integer uid2 = memberdoto.getUid();
            if (uid != null ? !uid.equals(uid2) : uid2 != null) {
                return false;
            }
            Integer isAdmin = getIsAdmin();
            Integer isAdmin2 = memberdoto.getIsAdmin();
            if (isAdmin != null ? !isAdmin.equals(isAdmin2) : isAdmin2 != null) {
                return false;
            }
            String avatar = getAvatar();
            String avatar2 = memberdoto.getAvatar();
            return avatar != null ? avatar.equals(avatar2) : avatar2 == null;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public Integer getIsAdmin() {
            return this.isAdmin;
        }

        public Integer getUid() {
            return this.uid;
        }

        public int hashCode() {
            Integer uid = getUid();
            int iHashCode = uid == null ? 43 : uid.hashCode();
            Integer isAdmin = getIsAdmin();
            int iHashCode2 = ((iHashCode + 59) * 59) + (isAdmin == null ? 43 : isAdmin.hashCode());
            String avatar = getAvatar();
            return (iHashCode2 * 59) + (avatar != null ? avatar.hashCode() : 43);
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setIsAdmin(Integer num) {
            this.isAdmin = num;
        }

        public void setUid(Integer num) {
            this.uid = num;
        }

        public String toString() {
            return "FamilyHomeBean.memberDoTo(uid=" + getUid() + ", avatar=" + getAvatar() + ", isAdmin=" + getIsAdmin() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof FamilyHomeBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FamilyHomeBean)) {
            return false;
        }
        FamilyHomeBean familyHomeBean = (FamilyHomeBean) obj;
        if (!familyHomeBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = familyHomeBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer isFamilyMember = getIsFamilyMember();
        Integer isFamilyMember2 = familyHomeBean.getIsFamilyMember();
        if (isFamilyMember != null ? !isFamilyMember.equals(isFamilyMember2) : isFamilyMember2 != null) {
            return false;
        }
        Integer showJoinFamily = getShowJoinFamily();
        Integer showJoinFamily2 = familyHomeBean.getShowJoinFamily();
        if (showJoinFamily != null ? !showJoinFamily.equals(showJoinFamily2) : showJoinFamily2 != null) {
            return false;
        }
        Integer isAdmin = getIsAdmin();
        Integer isAdmin2 = familyHomeBean.getIsAdmin();
        if (isAdmin != null ? !isAdmin.equals(isAdmin2) : isAdmin2 != null) {
            return false;
        }
        String name = getName();
        String name2 = familyHomeBean.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String badge = getBadge();
        String badge2 = familyHomeBean.getBadge();
        if (badge != null ? !badge.equals(badge2) : badge2 != null) {
            return false;
        }
        String briefing = getBriefing();
        String briefing2 = familyHomeBean.getBriefing();
        if (briefing != null ? !briefing.equals(briefing2) : briefing2 != null) {
            return false;
        }
        LevelInfo levelInfo = getLevelInfo();
        LevelInfo levelInfo2 = familyHomeBean.getLevelInfo();
        if (levelInfo != null ? !levelInfo.equals(levelInfo2) : levelInfo2 != null) {
            return false;
        }
        List<memberDoTo> familyUserBean = getFamilyUserBean();
        List<memberDoTo> familyUserBean2 = familyHomeBean.getFamilyUserBean();
        if (familyUserBean != null ? !familyUserBean.equals(familyUserBean2) : familyUserBean2 != null) {
            return false;
        }
        MemberCnt memberCnt = getMemberCnt();
        MemberCnt memberCnt2 = familyHomeBean.getMemberCnt();
        if (memberCnt != null ? !memberCnt.equals(memberCnt2) : memberCnt2 != null) {
            return false;
        }
        OwnerDTO owner = getOwner();
        OwnerDTO owner2 = familyHomeBean.getOwner();
        if (owner != null ? !owner.equals(owner2) : owner2 != null) {
            return false;
        }
        String rank = getRank();
        String rank2 = familyHomeBean.getRank();
        if (rank != null ? !rank.equals(rank2) : rank2 != null) {
            return false;
        }
        String policyUrl = getPolicyUrl();
        String policyUrl2 = familyHomeBean.getPolicyUrl();
        if (policyUrl != null ? !policyUrl.equals(policyUrl2) : policyUrl2 != null) {
            return false;
        }
        List<RoomListBean> familyRoom = getFamilyRoom();
        List<RoomListBean> familyRoom2 = familyHomeBean.getFamilyRoom();
        if (familyRoom != null ? !familyRoom.equals(familyRoom2) : familyRoom2 != null) {
            return false;
        }
        List<ContributionDTO> contribution = getContribution();
        List<ContributionDTO> contribution2 = familyHomeBean.getContribution();
        return contribution != null ? contribution.equals(contribution2) : contribution2 == null;
    }

    public String getBadge() {
        return this.badge;
    }

    public String getBriefing() {
        return this.briefing;
    }

    public List<ContributionDTO> getContribution() {
        return this.contribution;
    }

    public List<RoomListBean> getFamilyRoom() {
        return this.familyRoom;
    }

    public List<memberDoTo> getFamilyUserBean() {
        return this.familyUserBean;
    }

    public Integer getId() {
        return this.f34825id;
    }

    public Integer getIsAdmin() {
        return this.isAdmin;
    }

    public Integer getIsFamilyMember() {
        return this.isFamilyMember;
    }

    public LevelInfo getLevelInfo() {
        return this.levelInfo;
    }

    public MemberCnt getMemberCnt() {
        return this.memberCnt;
    }

    public String getName() {
        return this.name;
    }

    public OwnerDTO getOwner() {
        return this.owner;
    }

    public String getPolicyUrl() {
        return this.policyUrl;
    }

    public String getRank() {
        return this.rank;
    }

    public Integer getShowJoinFamily() {
        return this.showJoinFamily;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        Integer isFamilyMember = getIsFamilyMember();
        int iHashCode2 = ((iHashCode + 59) * 59) + (isFamilyMember == null ? 43 : isFamilyMember.hashCode());
        Integer showJoinFamily = getShowJoinFamily();
        int iHashCode3 = (iHashCode2 * 59) + (showJoinFamily == null ? 43 : showJoinFamily.hashCode());
        Integer isAdmin = getIsAdmin();
        int iHashCode4 = (iHashCode3 * 59) + (isAdmin == null ? 43 : isAdmin.hashCode());
        String name = getName();
        int iHashCode5 = (iHashCode4 * 59) + (name == null ? 43 : name.hashCode());
        String badge = getBadge();
        int iHashCode6 = (iHashCode5 * 59) + (badge == null ? 43 : badge.hashCode());
        String briefing = getBriefing();
        int iHashCode7 = (iHashCode6 * 59) + (briefing == null ? 43 : briefing.hashCode());
        LevelInfo levelInfo = getLevelInfo();
        int iHashCode8 = (iHashCode7 * 59) + (levelInfo == null ? 43 : levelInfo.hashCode());
        List<memberDoTo> familyUserBean = getFamilyUserBean();
        int iHashCode9 = (iHashCode8 * 59) + (familyUserBean == null ? 43 : familyUserBean.hashCode());
        MemberCnt memberCnt = getMemberCnt();
        int iHashCode10 = (iHashCode9 * 59) + (memberCnt == null ? 43 : memberCnt.hashCode());
        OwnerDTO owner = getOwner();
        int iHashCode11 = (iHashCode10 * 59) + (owner == null ? 43 : owner.hashCode());
        String rank = getRank();
        int iHashCode12 = (iHashCode11 * 59) + (rank == null ? 43 : rank.hashCode());
        String policyUrl = getPolicyUrl();
        int iHashCode13 = (iHashCode12 * 59) + (policyUrl == null ? 43 : policyUrl.hashCode());
        List<RoomListBean> familyRoom = getFamilyRoom();
        int iHashCode14 = (iHashCode13 * 59) + (familyRoom == null ? 43 : familyRoom.hashCode());
        List<ContributionDTO> contribution = getContribution();
        return (iHashCode14 * 59) + (contribution != null ? contribution.hashCode() : 43);
    }

    public void setBadge(String str) {
        this.badge = str;
    }

    public void setBriefing(String str) {
        this.briefing = str;
    }

    public void setContribution(List<ContributionDTO> list) {
        this.contribution = list;
    }

    public void setFamilyRoom(List<RoomListBean> list) {
        this.familyRoom = list;
    }

    public void setFamilyUserBean(List<memberDoTo> list) {
        this.familyUserBean = list;
    }

    public void setId(Integer num) {
        this.f34825id = num;
    }

    public void setIsAdmin(Integer num) {
        this.isAdmin = num;
    }

    public void setIsFamilyMember(Integer num) {
        this.isFamilyMember = num;
    }

    public void setLevelInfo(LevelInfo levelInfo) {
        this.levelInfo = levelInfo;
    }

    public void setMemberCnt(MemberCnt memberCnt) {
        this.memberCnt = memberCnt;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOwner(OwnerDTO ownerDTO) {
        this.owner = ownerDTO;
    }

    public void setPolicyUrl(String str) {
        this.policyUrl = str;
    }

    public void setRank(String str) {
        this.rank = str;
    }

    public void setShowJoinFamily(Integer num) {
        this.showJoinFamily = num;
    }

    public String toString() {
        return "FamilyHomeBean(id=" + getId() + ", name=" + getName() + ", badge=" + getBadge() + ", briefing=" + getBriefing() + ", isFamilyMember=" + getIsFamilyMember() + ", showJoinFamily=" + getShowJoinFamily() + ", isAdmin=" + getIsAdmin() + ", levelInfo=" + getLevelInfo() + ", familyUserBean=" + getFamilyUserBean() + ", memberCnt=" + getMemberCnt() + ", owner=" + getOwner() + ", rank=" + getRank() + ", policyUrl=" + getPolicyUrl() + ", familyRoom=" + getFamilyRoom() + ", contribution=" + getContribution() + ")";
    }
}
