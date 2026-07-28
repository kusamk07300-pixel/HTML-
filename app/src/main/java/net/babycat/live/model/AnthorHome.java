package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AnthorHome {

    @SerializedName("activity")
    private ActivityDTO activity;

    @SerializedName("agencyInfo")
    private AgencyInfoDTO agencyInfo;

    @SerializedName("salary")
    private SalaryDTO salary;

    @SerializedName("salaryDocUrl")
    private String salaryDocUrl;

    @SerializedName("salarySetting")
    private List<SalarySettingDTO> salarySetting;

    @SerializedName("self_salary_level")
    private SelfSalaryLevelDTO selfSalaryLevel;

    @SerializedName("totalDiary")
    private TotalDiaryDTO totalDiary;

    public static class ActivityDTO implements Serializable {

        @SerializedName("is_open")
        private Integer isOpen;

        @SerializedName("live")
        private List<LiveDTO> live;

        @SerializedName("live_act_id")
        private String liveActId;

        @SerializedName("live_desc")
        private String liveDesc;

        @SerializedName("live_got_reward")
        private Integer liveGotReward;

        @SerializedName("live_title")
        private String liveTitle;

        /* JADX INFO: renamed from: pk, reason: collision with root package name */
        @SerializedName("pk")
        private List<LiveDTO> f34799pk;

        @SerializedName("pk_act_id")
        private String pkActId;

        @SerializedName("pk_desc")
        private String pkDesc;

        @SerializedName("pk_title")
        private String pkTitle;

        @SerializedName("voice")
        private List<LiveDTO> voice;

        @SerializedName("voice_act_id")
        private String voiceActId;

        @SerializedName("voice_got_reward")
        private Integer voiceGotReward;

        @SerializedName("voice_title")
        private String voiceTitle;

        public static class LiveDTO implements Serializable {

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @SerializedName("id")
            private String f34800id;

            @SerializedName("reward_coins")
            private String rewardCoins;

            @SerializedName(o0.CATEGORY_STATUS)
            private Integer status;

            @SerializedName("target_coins")
            private String targetCoins;

            @SerializedName("target_time")
            private String targetTime;

            @SerializedName("title")
            private String title;

            public boolean canEqual(Object obj) {
                return obj instanceof LiveDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof LiveDTO)) {
                    return false;
                }
                LiveDTO liveDTO = (LiveDTO) obj;
                if (!liveDTO.canEqual(this)) {
                    return false;
                }
                Integer status = getStatus();
                Integer status2 = liveDTO.getStatus();
                if (status != null ? !status.equals(status2) : status2 != null) {
                    return false;
                }
                String id2 = getId();
                String id3 = liveDTO.getId();
                if (id2 != null ? !id2.equals(id3) : id3 != null) {
                    return false;
                }
                String targetCoins = getTargetCoins();
                String targetCoins2 = liveDTO.getTargetCoins();
                if (targetCoins != null ? !targetCoins.equals(targetCoins2) : targetCoins2 != null) {
                    return false;
                }
                String targetTime = getTargetTime();
                String targetTime2 = liveDTO.getTargetTime();
                if (targetTime != null ? !targetTime.equals(targetTime2) : targetTime2 != null) {
                    return false;
                }
                String rewardCoins = getRewardCoins();
                String rewardCoins2 = liveDTO.getRewardCoins();
                if (rewardCoins != null ? !rewardCoins.equals(rewardCoins2) : rewardCoins2 != null) {
                    return false;
                }
                String title = getTitle();
                String title2 = liveDTO.getTitle();
                return title != null ? title.equals(title2) : title2 == null;
            }

            public String getId() {
                return this.f34800id;
            }

            public String getRewardCoins() {
                return this.rewardCoins;
            }

            public Integer getStatus() {
                return this.status;
            }

            public String getTargetCoins() {
                return this.targetCoins;
            }

            public String getTargetTime() {
                return this.targetTime;
            }

            public String getTitle() {
                return this.title;
            }

            public int hashCode() {
                Integer status = getStatus();
                int iHashCode = status == null ? 43 : status.hashCode();
                String id2 = getId();
                int iHashCode2 = ((iHashCode + 59) * 59) + (id2 == null ? 43 : id2.hashCode());
                String targetCoins = getTargetCoins();
                int iHashCode3 = (iHashCode2 * 59) + (targetCoins == null ? 43 : targetCoins.hashCode());
                String targetTime = getTargetTime();
                int iHashCode4 = (iHashCode3 * 59) + (targetTime == null ? 43 : targetTime.hashCode());
                String rewardCoins = getRewardCoins();
                int iHashCode5 = (iHashCode4 * 59) + (rewardCoins == null ? 43 : rewardCoins.hashCode());
                String title = getTitle();
                return (iHashCode5 * 59) + (title != null ? title.hashCode() : 43);
            }

            public void setId(String str) {
                this.f34800id = str;
            }

            public void setRewardCoins(String str) {
                this.rewardCoins = str;
            }

            public void setStatus(Integer num) {
                this.status = num;
            }

            public void setTargetCoins(String str) {
                this.targetCoins = str;
            }

            public void setTargetTime(String str) {
                this.targetTime = str;
            }

            public void setTitle(String str) {
                this.title = str;
            }

            public String toString() {
                return "AnthorHome.ActivityDTO.LiveDTO(id=" + getId() + ", targetCoins=" + getTargetCoins() + ", targetTime=" + getTargetTime() + ", rewardCoins=" + getRewardCoins() + ", status=" + getStatus() + ", title=" + getTitle() + ")";
            }
        }

        public boolean canEqual(Object obj) {
            return obj instanceof ActivityDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActivityDTO)) {
                return false;
            }
            ActivityDTO activityDTO = (ActivityDTO) obj;
            if (!activityDTO.canEqual(this)) {
                return false;
            }
            Integer isOpen = getIsOpen();
            Integer isOpen2 = activityDTO.getIsOpen();
            if (isOpen != null ? !isOpen.equals(isOpen2) : isOpen2 != null) {
                return false;
            }
            Integer liveGotReward = getLiveGotReward();
            Integer liveGotReward2 = activityDTO.getLiveGotReward();
            if (liveGotReward != null ? !liveGotReward.equals(liveGotReward2) : liveGotReward2 != null) {
                return false;
            }
            Integer voiceGotReward = getVoiceGotReward();
            Integer voiceGotReward2 = activityDTO.getVoiceGotReward();
            if (voiceGotReward != null ? !voiceGotReward.equals(voiceGotReward2) : voiceGotReward2 != null) {
                return false;
            }
            String pkTitle = getPkTitle();
            String pkTitle2 = activityDTO.getPkTitle();
            if (pkTitle != null ? !pkTitle.equals(pkTitle2) : pkTitle2 != null) {
                return false;
            }
            String pkDesc = getPkDesc();
            String pkDesc2 = activityDTO.getPkDesc();
            if (pkDesc != null ? !pkDesc.equals(pkDesc2) : pkDesc2 != null) {
                return false;
            }
            String liveDesc = getLiveDesc();
            String liveDesc2 = activityDTO.getLiveDesc();
            if (liveDesc != null ? !liveDesc.equals(liveDesc2) : liveDesc2 != null) {
                return false;
            }
            String liveTitle = getLiveTitle();
            String liveTitle2 = activityDTO.getLiveTitle();
            if (liveTitle != null ? !liveTitle.equals(liveTitle2) : liveTitle2 != null) {
                return false;
            }
            String voiceTitle = getVoiceTitle();
            String voiceTitle2 = activityDTO.getVoiceTitle();
            if (voiceTitle != null ? !voiceTitle.equals(voiceTitle2) : voiceTitle2 != null) {
                return false;
            }
            String pkActId = getPkActId();
            String pkActId2 = activityDTO.getPkActId();
            if (pkActId != null ? !pkActId.equals(pkActId2) : pkActId2 != null) {
                return false;
            }
            String liveActId = getLiveActId();
            String liveActId2 = activityDTO.getLiveActId();
            if (liveActId != null ? !liveActId.equals(liveActId2) : liveActId2 != null) {
                return false;
            }
            String voiceActId = getVoiceActId();
            String voiceActId2 = activityDTO.getVoiceActId();
            if (voiceActId != null ? !voiceActId.equals(voiceActId2) : voiceActId2 != null) {
                return false;
            }
            List<LiveDTO> pk2 = getPk();
            List<LiveDTO> pk3 = activityDTO.getPk();
            if (pk2 != null ? !pk2.equals(pk3) : pk3 != null) {
                return false;
            }
            List<LiveDTO> live = getLive();
            List<LiveDTO> live2 = activityDTO.getLive();
            if (live != null ? !live.equals(live2) : live2 != null) {
                return false;
            }
            List<LiveDTO> voice = getVoice();
            List<LiveDTO> voice2 = activityDTO.getVoice();
            return voice != null ? voice.equals(voice2) : voice2 == null;
        }

        public Integer getIsOpen() {
            return this.isOpen;
        }

        public List<LiveDTO> getLive() {
            return this.live;
        }

        public String getLiveActId() {
            return this.liveActId;
        }

        public String getLiveDesc() {
            return this.liveDesc;
        }

        public Integer getLiveGotReward() {
            return this.liveGotReward;
        }

        public String getLiveTitle() {
            return this.liveTitle;
        }

        public List<LiveDTO> getPk() {
            return this.f34799pk;
        }

        public String getPkActId() {
            return this.pkActId;
        }

        public String getPkDesc() {
            return this.pkDesc;
        }

        public String getPkTitle() {
            return this.pkTitle;
        }

        public List<LiveDTO> getVoice() {
            return this.voice;
        }

        public String getVoiceActId() {
            return this.voiceActId;
        }

        public Integer getVoiceGotReward() {
            return this.voiceGotReward;
        }

        public String getVoiceTitle() {
            return this.voiceTitle;
        }

        public int hashCode() {
            Integer isOpen = getIsOpen();
            int iHashCode = isOpen == null ? 43 : isOpen.hashCode();
            Integer liveGotReward = getLiveGotReward();
            int iHashCode2 = ((iHashCode + 59) * 59) + (liveGotReward == null ? 43 : liveGotReward.hashCode());
            Integer voiceGotReward = getVoiceGotReward();
            int iHashCode3 = (iHashCode2 * 59) + (voiceGotReward == null ? 43 : voiceGotReward.hashCode());
            String pkTitle = getPkTitle();
            int iHashCode4 = (iHashCode3 * 59) + (pkTitle == null ? 43 : pkTitle.hashCode());
            String pkDesc = getPkDesc();
            int iHashCode5 = (iHashCode4 * 59) + (pkDesc == null ? 43 : pkDesc.hashCode());
            String liveDesc = getLiveDesc();
            int iHashCode6 = (iHashCode5 * 59) + (liveDesc == null ? 43 : liveDesc.hashCode());
            String liveTitle = getLiveTitle();
            int iHashCode7 = (iHashCode6 * 59) + (liveTitle == null ? 43 : liveTitle.hashCode());
            String voiceTitle = getVoiceTitle();
            int iHashCode8 = (iHashCode7 * 59) + (voiceTitle == null ? 43 : voiceTitle.hashCode());
            String pkActId = getPkActId();
            int iHashCode9 = (iHashCode8 * 59) + (pkActId == null ? 43 : pkActId.hashCode());
            String liveActId = getLiveActId();
            int iHashCode10 = (iHashCode9 * 59) + (liveActId == null ? 43 : liveActId.hashCode());
            String voiceActId = getVoiceActId();
            int iHashCode11 = (iHashCode10 * 59) + (voiceActId == null ? 43 : voiceActId.hashCode());
            List<LiveDTO> pk2 = getPk();
            int iHashCode12 = (iHashCode11 * 59) + (pk2 == null ? 43 : pk2.hashCode());
            List<LiveDTO> live = getLive();
            int iHashCode13 = (iHashCode12 * 59) + (live == null ? 43 : live.hashCode());
            List<LiveDTO> voice = getVoice();
            return (iHashCode13 * 59) + (voice != null ? voice.hashCode() : 43);
        }

        public void setIsOpen(Integer num) {
            this.isOpen = num;
        }

        public void setLive(List<LiveDTO> list) {
            this.live = list;
        }

        public void setLiveActId(String str) {
            this.liveActId = str;
        }

        public void setLiveDesc(String str) {
            this.liveDesc = str;
        }

        public void setLiveGotReward(Integer num) {
            this.liveGotReward = num;
        }

        public void setLiveTitle(String str) {
            this.liveTitle = str;
        }

        public void setPk(List<LiveDTO> list) {
            this.f34799pk = list;
        }

        public void setPkActId(String str) {
            this.pkActId = str;
        }

        public void setPkDesc(String str) {
            this.pkDesc = str;
        }

        public void setPkTitle(String str) {
            this.pkTitle = str;
        }

        public void setVoice(List<LiveDTO> list) {
            this.voice = list;
        }

        public void setVoiceActId(String str) {
            this.voiceActId = str;
        }

        public void setVoiceGotReward(Integer num) {
            this.voiceGotReward = num;
        }

        public void setVoiceTitle(String str) {
            this.voiceTitle = str;
        }

        public String toString() {
            return "AnthorHome.ActivityDTO(isOpen=" + getIsOpen() + ", liveGotReward=" + getLiveGotReward() + ", voiceGotReward=" + getVoiceGotReward() + ", pkTitle=" + getPkTitle() + ", pkDesc=" + getPkDesc() + ", liveDesc=" + getLiveDesc() + ", liveTitle=" + getLiveTitle() + ", voiceTitle=" + getVoiceTitle() + ", pkActId=" + getPkActId() + ", liveActId=" + getLiveActId() + ", voiceActId=" + getVoiceActId() + ", pk=" + getPk() + ", live=" + getLive() + ", voice=" + getVoice() + ")";
        }
    }

    public static class AgencyInfoDTO {

        @SerializedName("agency_id")
        private Integer agencyId;

        @SerializedName("anchor_limit")
        private Integer anchorLimit;

        @SerializedName("anchor_num")
        private Integer anchorNum;

        @SerializedName("broker_limit")
        private Integer brokerLimit;

        @SerializedName("broker_num")
        private Integer brokerNum;

        @SerializedName("create_time")
        private String createTime;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34801id;

        @SerializedName("invite_type")
        private Integer inviteType;

        @SerializedName("invite_uid")
        private Integer inviteUid;

        @SerializedName("join_time")
        private Integer joinTime;

        @SerializedName("level")
        private String level;

        @SerializedName("name")
        private String name;

        @SerializedName("nickname")
        private String nickname;

        @SerializedName("own_uid")
        private Integer ownUid;

        @SerializedName(o0.CATEGORY_STATUS)
        private Integer status;

        @SerializedName("type")
        private Integer type;

        @SerializedName("uid")
        private Integer uid;

        @SerializedName("update_time")
        private String updateTime;

        public boolean canEqual(Object obj) {
            return obj instanceof AgencyInfoDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AgencyInfoDTO)) {
                return false;
            }
            AgencyInfoDTO agencyInfoDTO = (AgencyInfoDTO) obj;
            if (!agencyInfoDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = agencyInfoDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            Integer agencyId = getAgencyId();
            Integer agencyId2 = agencyInfoDTO.getAgencyId();
            if (agencyId != null ? !agencyId.equals(agencyId2) : agencyId2 != null) {
                return false;
            }
            Integer uid = getUid();
            Integer uid2 = agencyInfoDTO.getUid();
            if (uid != null ? !uid.equals(uid2) : uid2 != null) {
                return false;
            }
            Integer type = getType();
            Integer type2 = agencyInfoDTO.getType();
            if (type != null ? !type.equals(type2) : type2 != null) {
                return false;
            }
            Integer inviteUid = getInviteUid();
            Integer inviteUid2 = agencyInfoDTO.getInviteUid();
            if (inviteUid != null ? !inviteUid.equals(inviteUid2) : inviteUid2 != null) {
                return false;
            }
            Integer inviteType = getInviteType();
            Integer inviteType2 = agencyInfoDTO.getInviteType();
            if (inviteType != null ? !inviteType.equals(inviteType2) : inviteType2 != null) {
                return false;
            }
            Integer status = getStatus();
            Integer status2 = agencyInfoDTO.getStatus();
            if (status != null ? !status.equals(status2) : status2 != null) {
                return false;
            }
            Integer joinTime = getJoinTime();
            Integer joinTime2 = agencyInfoDTO.getJoinTime();
            if (joinTime != null ? !joinTime.equals(joinTime2) : joinTime2 != null) {
                return false;
            }
            Integer ownUid = getOwnUid();
            Integer ownUid2 = agencyInfoDTO.getOwnUid();
            if (ownUid != null ? !ownUid.equals(ownUid2) : ownUid2 != null) {
                return false;
            }
            Integer anchorNum = getAnchorNum();
            Integer anchorNum2 = agencyInfoDTO.getAnchorNum();
            if (anchorNum != null ? !anchorNum.equals(anchorNum2) : anchorNum2 != null) {
                return false;
            }
            Integer anchorLimit = getAnchorLimit();
            Integer anchorLimit2 = agencyInfoDTO.getAnchorLimit();
            if (anchorLimit != null ? !anchorLimit.equals(anchorLimit2) : anchorLimit2 != null) {
                return false;
            }
            Integer brokerNum = getBrokerNum();
            Integer brokerNum2 = agencyInfoDTO.getBrokerNum();
            if (brokerNum != null ? !brokerNum.equals(brokerNum2) : brokerNum2 != null) {
                return false;
            }
            Integer brokerLimit = getBrokerLimit();
            Integer brokerLimit2 = agencyInfoDTO.getBrokerLimit();
            if (brokerLimit != null ? !brokerLimit.equals(brokerLimit2) : brokerLimit2 != null) {
                return false;
            }
            String createTime = getCreateTime();
            String createTime2 = agencyInfoDTO.getCreateTime();
            if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
                return false;
            }
            String updateTime = getUpdateTime();
            String updateTime2 = agencyInfoDTO.getUpdateTime();
            if (updateTime != null ? !updateTime.equals(updateTime2) : updateTime2 != null) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = agencyInfoDTO.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String name = getName();
            String name2 = agencyInfoDTO.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String level = getLevel();
            String level2 = agencyInfoDTO.getLevel();
            return level != null ? level.equals(level2) : level2 == null;
        }

        public Integer getAgencyId() {
            return this.agencyId;
        }

        public Integer getAnchorLimit() {
            return this.anchorLimit;
        }

        public Integer getAnchorNum() {
            return this.anchorNum;
        }

        public Integer getBrokerLimit() {
            return this.brokerLimit;
        }

        public Integer getBrokerNum() {
            return this.brokerNum;
        }

        public String getCreateTime() {
            return this.createTime;
        }

        public Integer getId() {
            return this.f34801id;
        }

        public Integer getInviteType() {
            return this.inviteType;
        }

        public Integer getInviteUid() {
            return this.inviteUid;
        }

        public Integer getJoinTime() {
            return this.joinTime;
        }

        public String getLevel() {
            return this.level;
        }

        public String getName() {
            return this.name;
        }

        public String getNickname() {
            return this.nickname;
        }

        public Integer getOwnUid() {
            return this.ownUid;
        }

        public Integer getStatus() {
            return this.status;
        }

        public Integer getType() {
            return this.type;
        }

        public Integer getUid() {
            return this.uid;
        }

        public String getUpdateTime() {
            return this.updateTime;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer agencyId = getAgencyId();
            int iHashCode2 = ((iHashCode + 59) * 59) + (agencyId == null ? 43 : agencyId.hashCode());
            Integer uid = getUid();
            int iHashCode3 = (iHashCode2 * 59) + (uid == null ? 43 : uid.hashCode());
            Integer type = getType();
            int iHashCode4 = (iHashCode3 * 59) + (type == null ? 43 : type.hashCode());
            Integer inviteUid = getInviteUid();
            int iHashCode5 = (iHashCode4 * 59) + (inviteUid == null ? 43 : inviteUid.hashCode());
            Integer inviteType = getInviteType();
            int iHashCode6 = (iHashCode5 * 59) + (inviteType == null ? 43 : inviteType.hashCode());
            Integer status = getStatus();
            int iHashCode7 = (iHashCode6 * 59) + (status == null ? 43 : status.hashCode());
            Integer joinTime = getJoinTime();
            int iHashCode8 = (iHashCode7 * 59) + (joinTime == null ? 43 : joinTime.hashCode());
            Integer ownUid = getOwnUid();
            int iHashCode9 = (iHashCode8 * 59) + (ownUid == null ? 43 : ownUid.hashCode());
            Integer anchorNum = getAnchorNum();
            int iHashCode10 = (iHashCode9 * 59) + (anchorNum == null ? 43 : anchorNum.hashCode());
            Integer anchorLimit = getAnchorLimit();
            int iHashCode11 = (iHashCode10 * 59) + (anchorLimit == null ? 43 : anchorLimit.hashCode());
            Integer brokerNum = getBrokerNum();
            int iHashCode12 = (iHashCode11 * 59) + (brokerNum == null ? 43 : brokerNum.hashCode());
            Integer brokerLimit = getBrokerLimit();
            int iHashCode13 = (iHashCode12 * 59) + (brokerLimit == null ? 43 : brokerLimit.hashCode());
            String createTime = getCreateTime();
            int iHashCode14 = (iHashCode13 * 59) + (createTime == null ? 43 : createTime.hashCode());
            String updateTime = getUpdateTime();
            int iHashCode15 = (iHashCode14 * 59) + (updateTime == null ? 43 : updateTime.hashCode());
            String nickname = getNickname();
            int iHashCode16 = (iHashCode15 * 59) + (nickname == null ? 43 : nickname.hashCode());
            String name = getName();
            int iHashCode17 = (iHashCode16 * 59) + (name == null ? 43 : name.hashCode());
            String level = getLevel();
            return (iHashCode17 * 59) + (level != null ? level.hashCode() : 43);
        }

        public void setAgencyId(Integer num) {
            this.agencyId = num;
        }

        public void setAnchorLimit(Integer num) {
            this.anchorLimit = num;
        }

        public void setAnchorNum(Integer num) {
            this.anchorNum = num;
        }

        public void setBrokerLimit(Integer num) {
            this.brokerLimit = num;
        }

        public void setBrokerNum(Integer num) {
            this.brokerNum = num;
        }

        public void setCreateTime(String str) {
            this.createTime = str;
        }

        public void setId(Integer num) {
            this.f34801id = num;
        }

        public void setInviteType(Integer num) {
            this.inviteType = num;
        }

        public void setInviteUid(Integer num) {
            this.inviteUid = num;
        }

        public void setJoinTime(Integer num) {
            this.joinTime = num;
        }

        public void setLevel(String str) {
            this.level = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public void setOwnUid(Integer num) {
            this.ownUid = num;
        }

        public void setStatus(Integer num) {
            this.status = num;
        }

        public void setType(Integer num) {
            this.type = num;
        }

        public void setUid(Integer num) {
            this.uid = num;
        }

        public void setUpdateTime(String str) {
            this.updateTime = str;
        }

        public String toString() {
            return "AnthorHome.AgencyInfoDTO(id=" + getId() + ", agencyId=" + getAgencyId() + ", uid=" + getUid() + ", type=" + getType() + ", inviteUid=" + getInviteUid() + ", inviteType=" + getInviteType() + ", status=" + getStatus() + ", joinTime=" + getJoinTime() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ", nickname=" + getNickname() + ", ownUid=" + getOwnUid() + ", name=" + getName() + ", level=" + getLevel() + ", anchorNum=" + getAnchorNum() + ", anchorLimit=" + getAnchorLimit() + ", brokerNum=" + getBrokerNum() + ", brokerLimit=" + getBrokerLimit() + ")";
        }
    }

    public static class SalaryDTO {

        @SerializedName("days")
        private String days;

        @SerializedName("diamond")
        private Integer diamond;

        @SerializedName("level")
        private Integer level;

        public boolean canEqual(Object obj) {
            return obj instanceof SalaryDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SalaryDTO)) {
                return false;
            }
            SalaryDTO salaryDTO = (SalaryDTO) obj;
            if (!salaryDTO.canEqual(this)) {
                return false;
            }
            Integer diamond = getDiamond();
            Integer diamond2 = salaryDTO.getDiamond();
            if (diamond != null ? !diamond.equals(diamond2) : diamond2 != null) {
                return false;
            }
            Integer level = getLevel();
            Integer level2 = salaryDTO.getLevel();
            if (level != null ? !level.equals(level2) : level2 != null) {
                return false;
            }
            String days = getDays();
            String days2 = salaryDTO.getDays();
            return days != null ? days.equals(days2) : days2 == null;
        }

        public String getDays() {
            return this.days;
        }

        public Integer getDiamond() {
            return this.diamond;
        }

        public Integer getLevel() {
            return this.level;
        }

        public int hashCode() {
            Integer diamond = getDiamond();
            int iHashCode = diamond == null ? 43 : diamond.hashCode();
            Integer level = getLevel();
            int iHashCode2 = ((iHashCode + 59) * 59) + (level == null ? 43 : level.hashCode());
            String days = getDays();
            return (iHashCode2 * 59) + (days != null ? days.hashCode() : 43);
        }

        public void setDays(String str) {
            this.days = str;
        }

        public void setDiamond(Integer num) {
            this.diamond = num;
        }

        public void setLevel(Integer num) {
            this.level = num;
        }

        public String toString() {
            return "AnthorHome.SalaryDTO(days=" + getDays() + ", diamond=" + getDiamond() + ", level=" + getLevel() + ")";
        }
    }

    public static class SalarySettingDTO {

        @SerializedName("agency_salary")
        private Integer agencySalary;

        @SerializedName("create_time")
        private String createTime;

        @SerializedName("days")
        private Integer days;

        @SerializedName("diamonds")
        private Integer diamonds;

        @SerializedName("diamonds_rate")
        private String diamondsRate;

        @SerializedName("diamonds_salary")
        private Integer diamondsSalary;

        @SerializedName("gold_coins")
        private Integer goldCoins;

        @SerializedName("gold_salary")
        private Integer goldSalary;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34802id;

        @SerializedName("level")
        private Integer level;

        @SerializedName("total_salary")
        private Integer totalSalary;

        @SerializedName("update_time")
        private String updateTime;

        public boolean canEqual(Object obj) {
            return obj instanceof SalarySettingDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SalarySettingDTO)) {
                return false;
            }
            SalarySettingDTO salarySettingDTO = (SalarySettingDTO) obj;
            if (!salarySettingDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = salarySettingDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            Integer level = getLevel();
            Integer level2 = salarySettingDTO.getLevel();
            if (level != null ? !level.equals(level2) : level2 != null) {
                return false;
            }
            Integer goldCoins = getGoldCoins();
            Integer goldCoins2 = salarySettingDTO.getGoldCoins();
            if (goldCoins != null ? !goldCoins.equals(goldCoins2) : goldCoins2 != null) {
                return false;
            }
            Integer goldSalary = getGoldSalary();
            Integer goldSalary2 = salarySettingDTO.getGoldSalary();
            if (goldSalary != null ? !goldSalary.equals(goldSalary2) : goldSalary2 != null) {
                return false;
            }
            Integer diamonds = getDiamonds();
            Integer diamonds2 = salarySettingDTO.getDiamonds();
            if (diamonds != null ? !diamonds.equals(diamonds2) : diamonds2 != null) {
                return false;
            }
            Integer diamondsSalary = getDiamondsSalary();
            Integer diamondsSalary2 = salarySettingDTO.getDiamondsSalary();
            if (diamondsSalary != null ? !diamondsSalary.equals(diamondsSalary2) : diamondsSalary2 != null) {
                return false;
            }
            Integer totalSalary = getTotalSalary();
            Integer totalSalary2 = salarySettingDTO.getTotalSalary();
            if (totalSalary != null ? !totalSalary.equals(totalSalary2) : totalSalary2 != null) {
                return false;
            }
            Integer agencySalary = getAgencySalary();
            Integer agencySalary2 = salarySettingDTO.getAgencySalary();
            if (agencySalary != null ? !agencySalary.equals(agencySalary2) : agencySalary2 != null) {
                return false;
            }
            Integer days = getDays();
            Integer days2 = salarySettingDTO.getDays();
            if (days != null ? !days.equals(days2) : days2 != null) {
                return false;
            }
            String diamondsRate = getDiamondsRate();
            String diamondsRate2 = salarySettingDTO.getDiamondsRate();
            if (diamondsRate != null ? !diamondsRate.equals(diamondsRate2) : diamondsRate2 != null) {
                return false;
            }
            String createTime = getCreateTime();
            String createTime2 = salarySettingDTO.getCreateTime();
            if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
                return false;
            }
            String updateTime = getUpdateTime();
            String updateTime2 = salarySettingDTO.getUpdateTime();
            return updateTime != null ? updateTime.equals(updateTime2) : updateTime2 == null;
        }

        public Integer getAgencySalary() {
            return this.agencySalary;
        }

        public String getCreateTime() {
            return this.createTime;
        }

        public Integer getDays() {
            return this.days;
        }

        public Integer getDiamonds() {
            return this.diamonds;
        }

        public String getDiamondsRate() {
            return this.diamondsRate;
        }

        public Integer getDiamondsSalary() {
            return this.diamondsSalary;
        }

        public Integer getGoldCoins() {
            return this.goldCoins;
        }

        public Integer getGoldSalary() {
            return this.goldSalary;
        }

        public Integer getId() {
            return this.f34802id;
        }

        public Integer getLevel() {
            return this.level;
        }

        public Integer getTotalSalary() {
            return this.totalSalary;
        }

        public String getUpdateTime() {
            return this.updateTime;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer level = getLevel();
            int iHashCode2 = ((iHashCode + 59) * 59) + (level == null ? 43 : level.hashCode());
            Integer goldCoins = getGoldCoins();
            int iHashCode3 = (iHashCode2 * 59) + (goldCoins == null ? 43 : goldCoins.hashCode());
            Integer goldSalary = getGoldSalary();
            int iHashCode4 = (iHashCode3 * 59) + (goldSalary == null ? 43 : goldSalary.hashCode());
            Integer diamonds = getDiamonds();
            int iHashCode5 = (iHashCode4 * 59) + (diamonds == null ? 43 : diamonds.hashCode());
            Integer diamondsSalary = getDiamondsSalary();
            int iHashCode6 = (iHashCode5 * 59) + (diamondsSalary == null ? 43 : diamondsSalary.hashCode());
            Integer totalSalary = getTotalSalary();
            int iHashCode7 = (iHashCode6 * 59) + (totalSalary == null ? 43 : totalSalary.hashCode());
            Integer agencySalary = getAgencySalary();
            int iHashCode8 = (iHashCode7 * 59) + (agencySalary == null ? 43 : agencySalary.hashCode());
            Integer days = getDays();
            int iHashCode9 = (iHashCode8 * 59) + (days == null ? 43 : days.hashCode());
            String diamondsRate = getDiamondsRate();
            int iHashCode10 = (iHashCode9 * 59) + (diamondsRate == null ? 43 : diamondsRate.hashCode());
            String createTime = getCreateTime();
            int iHashCode11 = (iHashCode10 * 59) + (createTime == null ? 43 : createTime.hashCode());
            String updateTime = getUpdateTime();
            return (iHashCode11 * 59) + (updateTime != null ? updateTime.hashCode() : 43);
        }

        public void setAgencySalary(Integer num) {
            this.agencySalary = num;
        }

        public void setCreateTime(String str) {
            this.createTime = str;
        }

        public void setDays(Integer num) {
            this.days = num;
        }

        public void setDiamonds(Integer num) {
            this.diamonds = num;
        }

        public void setDiamondsRate(String str) {
            this.diamondsRate = str;
        }

        public void setDiamondsSalary(Integer num) {
            this.diamondsSalary = num;
        }

        public void setGoldCoins(Integer num) {
            this.goldCoins = num;
        }

        public void setGoldSalary(Integer num) {
            this.goldSalary = num;
        }

        public void setId(Integer num) {
            this.f34802id = num;
        }

        public void setLevel(Integer num) {
            this.level = num;
        }

        public void setTotalSalary(Integer num) {
            this.totalSalary = num;
        }

        public void setUpdateTime(String str) {
            this.updateTime = str;
        }

        public String toString() {
            return "AnthorHome.SalarySettingDTO(id=" + getId() + ", level=" + getLevel() + ", goldCoins=" + getGoldCoins() + ", goldSalary=" + getGoldSalary() + ", diamonds=" + getDiamonds() + ", diamondsSalary=" + getDiamondsSalary() + ", diamondsRate=" + getDiamondsRate() + ", totalSalary=" + getTotalSalary() + ", agencySalary=" + getAgencySalary() + ", days=" + getDays() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ")";
        }
    }

    public static class SelfSalaryLevelDTO {

        @SerializedName("diamond_now")
        private String diamondNow;

        @SerializedName("level_days")
        private Integer levelDays;

        @SerializedName("level_diamond")
        private Integer levelDiamond;

        @SerializedName("level_next")
        private Integer levelNext;

        @SerializedName("level_next_diamond")
        private Integer levelNextDiamond;

        @SerializedName("level_now")
        private Integer levelNow;

        @SerializedName("level_rate")
        private Integer levelRate;

        @SerializedName("salary_now")
        private Integer salaryNow;

        public boolean canEqual(Object obj) {
            return obj instanceof SelfSalaryLevelDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SelfSalaryLevelDTO)) {
                return false;
            }
            SelfSalaryLevelDTO selfSalaryLevelDTO = (SelfSalaryLevelDTO) obj;
            if (!selfSalaryLevelDTO.canEqual(this)) {
                return false;
            }
            Integer salaryNow = getSalaryNow();
            Integer salaryNow2 = selfSalaryLevelDTO.getSalaryNow();
            if (salaryNow != null ? !salaryNow.equals(salaryNow2) : salaryNow2 != null) {
                return false;
            }
            Integer levelRate = getLevelRate();
            Integer levelRate2 = selfSalaryLevelDTO.getLevelRate();
            if (levelRate != null ? !levelRate.equals(levelRate2) : levelRate2 != null) {
                return false;
            }
            Integer levelNow = getLevelNow();
            Integer levelNow2 = selfSalaryLevelDTO.getLevelNow();
            if (levelNow != null ? !levelNow.equals(levelNow2) : levelNow2 != null) {
                return false;
            }
            Integer levelDiamond = getLevelDiamond();
            Integer levelDiamond2 = selfSalaryLevelDTO.getLevelDiamond();
            if (levelDiamond != null ? !levelDiamond.equals(levelDiamond2) : levelDiamond2 != null) {
                return false;
            }
            Integer levelNext = getLevelNext();
            Integer levelNext2 = selfSalaryLevelDTO.getLevelNext();
            if (levelNext != null ? !levelNext.equals(levelNext2) : levelNext2 != null) {
                return false;
            }
            Integer levelDays = getLevelDays();
            Integer levelDays2 = selfSalaryLevelDTO.getLevelDays();
            if (levelDays != null ? !levelDays.equals(levelDays2) : levelDays2 != null) {
                return false;
            }
            Integer levelNextDiamond = getLevelNextDiamond();
            Integer levelNextDiamond2 = selfSalaryLevelDTO.getLevelNextDiamond();
            if (levelNextDiamond != null ? !levelNextDiamond.equals(levelNextDiamond2) : levelNextDiamond2 != null) {
                return false;
            }
            String diamondNow = getDiamondNow();
            String diamondNow2 = selfSalaryLevelDTO.getDiamondNow();
            return diamondNow != null ? diamondNow.equals(diamondNow2) : diamondNow2 == null;
        }

        public String getDiamondNow() {
            return this.diamondNow;
        }

        public Integer getLevelDays() {
            return this.levelDays;
        }

        public Integer getLevelDiamond() {
            return this.levelDiamond;
        }

        public Integer getLevelNext() {
            return this.levelNext;
        }

        public Integer getLevelNextDiamond() {
            return this.levelNextDiamond;
        }

        public Integer getLevelNow() {
            return this.levelNow;
        }

        public Integer getLevelRate() {
            return this.levelRate;
        }

        public Integer getSalaryNow() {
            return this.salaryNow;
        }

        public int hashCode() {
            Integer salaryNow = getSalaryNow();
            int iHashCode = salaryNow == null ? 43 : salaryNow.hashCode();
            Integer levelRate = getLevelRate();
            int iHashCode2 = ((iHashCode + 59) * 59) + (levelRate == null ? 43 : levelRate.hashCode());
            Integer levelNow = getLevelNow();
            int iHashCode3 = (iHashCode2 * 59) + (levelNow == null ? 43 : levelNow.hashCode());
            Integer levelDiamond = getLevelDiamond();
            int iHashCode4 = (iHashCode3 * 59) + (levelDiamond == null ? 43 : levelDiamond.hashCode());
            Integer levelNext = getLevelNext();
            int iHashCode5 = (iHashCode4 * 59) + (levelNext == null ? 43 : levelNext.hashCode());
            Integer levelDays = getLevelDays();
            int iHashCode6 = (iHashCode5 * 59) + (levelDays == null ? 43 : levelDays.hashCode());
            Integer levelNextDiamond = getLevelNextDiamond();
            int iHashCode7 = (iHashCode6 * 59) + (levelNextDiamond == null ? 43 : levelNextDiamond.hashCode());
            String diamondNow = getDiamondNow();
            return (iHashCode7 * 59) + (diamondNow != null ? diamondNow.hashCode() : 43);
        }

        public void setDiamondNow(String str) {
            this.diamondNow = str;
        }

        public void setLevelDays(Integer num) {
            this.levelDays = num;
        }

        public void setLevelDiamond(Integer num) {
            this.levelDiamond = num;
        }

        public void setLevelNext(Integer num) {
            this.levelNext = num;
        }

        public void setLevelNextDiamond(Integer num) {
            this.levelNextDiamond = num;
        }

        public void setLevelNow(Integer num) {
            this.levelNow = num;
        }

        public void setLevelRate(Integer num) {
            this.levelRate = num;
        }

        public void setSalaryNow(Integer num) {
            this.salaryNow = num;
        }

        public String toString() {
            return "AnthorHome.SelfSalaryLevelDTO(salaryNow=" + getSalaryNow() + ", diamondNow=" + getDiamondNow() + ", levelRate=" + getLevelRate() + ", levelNow=" + getLevelNow() + ", levelDiamond=" + getLevelDiamond() + ", levelNext=" + getLevelNext() + ", levelDays=" + getLevelDays() + ", levelNextDiamond=" + getLevelNextDiamond() + ")";
        }
    }

    public static class TotalDiaryDTO {

        @SerializedName("days")
        private String days;

        @SerializedName("total_diamond")
        private String totalDiamond;

        @SerializedName("totalduration")
        private String totalduration;

        public boolean canEqual(Object obj) {
            return obj instanceof TotalDiaryDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TotalDiaryDTO)) {
                return false;
            }
            TotalDiaryDTO totalDiaryDTO = (TotalDiaryDTO) obj;
            if (!totalDiaryDTO.canEqual(this)) {
                return false;
            }
            String days = getDays();
            String days2 = totalDiaryDTO.getDays();
            if (days != null ? !days.equals(days2) : days2 != null) {
                return false;
            }
            String totalduration = getTotalduration();
            String totalduration2 = totalDiaryDTO.getTotalduration();
            if (totalduration != null ? !totalduration.equals(totalduration2) : totalduration2 != null) {
                return false;
            }
            String totalDiamond = getTotalDiamond();
            String totalDiamond2 = totalDiaryDTO.getTotalDiamond();
            return totalDiamond != null ? totalDiamond.equals(totalDiamond2) : totalDiamond2 == null;
        }

        public String getDays() {
            return this.days;
        }

        public String getTotalDiamond() {
            return this.totalDiamond;
        }

        public String getTotalduration() {
            return this.totalduration;
        }

        public int hashCode() {
            String days = getDays();
            int iHashCode = days == null ? 43 : days.hashCode();
            String totalduration = getTotalduration();
            int iHashCode2 = ((iHashCode + 59) * 59) + (totalduration == null ? 43 : totalduration.hashCode());
            String totalDiamond = getTotalDiamond();
            return (iHashCode2 * 59) + (totalDiamond != null ? totalDiamond.hashCode() : 43);
        }

        public void setDays(String str) {
            this.days = str;
        }

        public void setTotalDiamond(String str) {
            this.totalDiamond = str;
        }

        public void setTotalduration(String str) {
            this.totalduration = str;
        }

        public String toString() {
            return "AnthorHome.TotalDiaryDTO(days=" + getDays() + ", totalduration=" + getTotalduration() + ", totalDiamond=" + getTotalDiamond() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof AnthorHome;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnthorHome)) {
            return false;
        }
        AnthorHome anthorHome = (AnthorHome) obj;
        if (!anthorHome.canEqual(this)) {
            return false;
        }
        AgencyInfoDTO agencyInfo = getAgencyInfo();
        AgencyInfoDTO agencyInfo2 = anthorHome.getAgencyInfo();
        if (agencyInfo != null ? !agencyInfo.equals(agencyInfo2) : agencyInfo2 != null) {
            return false;
        }
        TotalDiaryDTO totalDiary = getTotalDiary();
        TotalDiaryDTO totalDiary2 = anthorHome.getTotalDiary();
        if (totalDiary != null ? !totalDiary.equals(totalDiary2) : totalDiary2 != null) {
            return false;
        }
        SalaryDTO salary = getSalary();
        SalaryDTO salary2 = anthorHome.getSalary();
        if (salary != null ? !salary.equals(salary2) : salary2 != null) {
            return false;
        }
        List<SalarySettingDTO> salarySetting = getSalarySetting();
        List<SalarySettingDTO> salarySetting2 = anthorHome.getSalarySetting();
        if (salarySetting != null ? !salarySetting.equals(salarySetting2) : salarySetting2 != null) {
            return false;
        }
        SelfSalaryLevelDTO selfSalaryLevel = getSelfSalaryLevel();
        SelfSalaryLevelDTO selfSalaryLevel2 = anthorHome.getSelfSalaryLevel();
        if (selfSalaryLevel != null ? !selfSalaryLevel.equals(selfSalaryLevel2) : selfSalaryLevel2 != null) {
            return false;
        }
        String salaryDocUrl = getSalaryDocUrl();
        String salaryDocUrl2 = anthorHome.getSalaryDocUrl();
        if (salaryDocUrl != null ? !salaryDocUrl.equals(salaryDocUrl2) : salaryDocUrl2 != null) {
            return false;
        }
        ActivityDTO activity = getActivity();
        ActivityDTO activity2 = anthorHome.getActivity();
        return activity != null ? activity.equals(activity2) : activity2 == null;
    }

    public ActivityDTO getActivity() {
        return this.activity;
    }

    public AgencyInfoDTO getAgencyInfo() {
        return this.agencyInfo;
    }

    public SalaryDTO getSalary() {
        return this.salary;
    }

    public String getSalaryDocUrl() {
        return this.salaryDocUrl;
    }

    public List<SalarySettingDTO> getSalarySetting() {
        return this.salarySetting;
    }

    public SelfSalaryLevelDTO getSelfSalaryLevel() {
        return this.selfSalaryLevel;
    }

    public TotalDiaryDTO getTotalDiary() {
        return this.totalDiary;
    }

    public int hashCode() {
        AgencyInfoDTO agencyInfo = getAgencyInfo();
        int iHashCode = agencyInfo == null ? 43 : agencyInfo.hashCode();
        TotalDiaryDTO totalDiary = getTotalDiary();
        int iHashCode2 = ((iHashCode + 59) * 59) + (totalDiary == null ? 43 : totalDiary.hashCode());
        SalaryDTO salary = getSalary();
        int iHashCode3 = (iHashCode2 * 59) + (salary == null ? 43 : salary.hashCode());
        List<SalarySettingDTO> salarySetting = getSalarySetting();
        int iHashCode4 = (iHashCode3 * 59) + (salarySetting == null ? 43 : salarySetting.hashCode());
        SelfSalaryLevelDTO selfSalaryLevel = getSelfSalaryLevel();
        int iHashCode5 = (iHashCode4 * 59) + (selfSalaryLevel == null ? 43 : selfSalaryLevel.hashCode());
        String salaryDocUrl = getSalaryDocUrl();
        int iHashCode6 = (iHashCode5 * 59) + (salaryDocUrl == null ? 43 : salaryDocUrl.hashCode());
        ActivityDTO activity = getActivity();
        return (iHashCode6 * 59) + (activity != null ? activity.hashCode() : 43);
    }

    public void setActivity(ActivityDTO activityDTO) {
        this.activity = activityDTO;
    }

    public void setAgencyInfo(AgencyInfoDTO agencyInfoDTO) {
        this.agencyInfo = agencyInfoDTO;
    }

    public void setSalary(SalaryDTO salaryDTO) {
        this.salary = salaryDTO;
    }

    public void setSalaryDocUrl(String str) {
        this.salaryDocUrl = str;
    }

    public void setSalarySetting(List<SalarySettingDTO> list) {
        this.salarySetting = list;
    }

    public void setSelfSalaryLevel(SelfSalaryLevelDTO selfSalaryLevelDTO) {
        this.selfSalaryLevel = selfSalaryLevelDTO;
    }

    public void setTotalDiary(TotalDiaryDTO totalDiaryDTO) {
        this.totalDiary = totalDiaryDTO;
    }

    public String toString() {
        return "AnthorHome(agencyInfo=" + getAgencyInfo() + ", totalDiary=" + getTotalDiary() + ", salary=" + getSalary() + ", salarySetting=" + getSalarySetting() + ", selfSalaryLevel=" + getSelfSalaryLevel() + ", salaryDocUrl=" + getSalaryDocUrl() + ", activity=" + getActivity() + ")";
    }
}
