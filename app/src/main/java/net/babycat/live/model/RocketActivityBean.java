package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RocketActivityBean {

    @SerializedName("code")
    private Integer code;

    @SerializedName("data")
    private DataDTO data;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private Integer time;

    public static class DataDTO {

        @SerializedName("coin_img")
        private String coinImg;

        @SerializedName("doc_explain")
        private String docExplain;

        @SerializedName("is_open")
        private Integer isOpen;

        @SerializedName("process")
        private ProcessDTO process;

        @SerializedName("rocketlist")
        private List<RocketlistDTO> rocketlist;

        @SerializedName("shutdown")
        private Long shutdown;

        @SerializedName("top3")
        private List<Top3DTO> top3;

        public static class ProcessDTO {

            @SerializedName("level")
            private Integer level;

            @SerializedName("rate")
            private Integer rate;

            @SerializedName("target")
            private Integer target;

            public boolean canEqual(Object obj) {
                return obj instanceof ProcessDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ProcessDTO)) {
                    return false;
                }
                ProcessDTO processDTO = (ProcessDTO) obj;
                if (!processDTO.canEqual(this)) {
                    return false;
                }
                Integer level = getLevel();
                Integer level2 = processDTO.getLevel();
                if (level != null ? !level.equals(level2) : level2 != null) {
                    return false;
                }
                Integer rate = getRate();
                Integer rate2 = processDTO.getRate();
                if (rate != null ? !rate.equals(rate2) : rate2 != null) {
                    return false;
                }
                Integer target = getTarget();
                Integer target2 = processDTO.getTarget();
                return target != null ? target.equals(target2) : target2 == null;
            }

            public Integer getLevel() {
                return this.level;
            }

            public Integer getRate() {
                return this.rate;
            }

            public Integer getTarget() {
                return this.target;
            }

            public int hashCode() {
                Integer level = getLevel();
                int iHashCode = level == null ? 43 : level.hashCode();
                Integer rate = getRate();
                int iHashCode2 = ((iHashCode + 59) * 59) + (rate == null ? 43 : rate.hashCode());
                Integer target = getTarget();
                return (iHashCode2 * 59) + (target != null ? target.hashCode() : 43);
            }

            public void setLevel(Integer num) {
                this.level = num;
            }

            public void setRate(Integer num) {
                this.rate = num;
            }

            public void setTarget(Integer num) {
                this.target = num;
            }

            public String toString() {
                return "RocketActivityBean.DataDTO.ProcessDTO(level=" + getLevel() + ", rate=" + getRate() + ", target=" + getTarget() + ")";
            }
        }

        public static class RocketlistDTO {

            @SerializedName("act_id")
            private Integer actId;

            @SerializedName("current")
            private Integer current;

            @SerializedName("icon")
            private String icon;

            @SerializedName("level")
            private Integer level;

            @SerializedName("rewards")
            private RewardsDTO rewards;

            @SerializedName("swflink")
            private String swflink;

            @SerializedName("swftype")
            private Integer swftype;

            public static class RewardsDTO {

                @SerializedName("level1")
                private List<LevelDTO> level1;

                @SerializedName("level2")
                private List<LevelDTO> level2;

                @SerializedName("level3")
                private List<LevelDTO> level3;

                public static class LevelDTO {

                    @SerializedName("fid")
                    private String fid;

                    @SerializedName("icon")
                    private String icon;

                    /* JADX INFO: renamed from: id, reason: collision with root package name */
                    @SerializedName("id")
                    private String f34882id;

                    @SerializedName("text")
                    private String text;

                    @SerializedName("type")
                    private String type;

                    @SerializedName("vip_icon")
                    private Integer vipIcon;

                    public boolean canEqual(Object obj) {
                        return obj instanceof LevelDTO;
                    }

                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof LevelDTO)) {
                            return false;
                        }
                        LevelDTO levelDTO = (LevelDTO) obj;
                        if (!levelDTO.canEqual(this)) {
                            return false;
                        }
                        Integer vipIcon = getVipIcon();
                        Integer vipIcon2 = levelDTO.getVipIcon();
                        if (vipIcon != null ? !vipIcon.equals(vipIcon2) : vipIcon2 != null) {
                            return false;
                        }
                        String id2 = getId();
                        String id3 = levelDTO.getId();
                        if (id2 != null ? !id2.equals(id3) : id3 != null) {
                            return false;
                        }
                        String fid = getFid();
                        String fid2 = levelDTO.getFid();
                        if (fid != null ? !fid.equals(fid2) : fid2 != null) {
                            return false;
                        }
                        String type = getType();
                        String type2 = levelDTO.getType();
                        if (type != null ? !type.equals(type2) : type2 != null) {
                            return false;
                        }
                        String icon = getIcon();
                        String icon2 = levelDTO.getIcon();
                        if (icon != null ? !icon.equals(icon2) : icon2 != null) {
                            return false;
                        }
                        String text = getText();
                        String text2 = levelDTO.getText();
                        return text != null ? text.equals(text2) : text2 == null;
                    }

                    public String getFid() {
                        return this.fid;
                    }

                    public String getIcon() {
                        return this.icon;
                    }

                    public String getId() {
                        return this.f34882id;
                    }

                    public String getText() {
                        return this.text;
                    }

                    public String getType() {
                        return this.type;
                    }

                    public Integer getVipIcon() {
                        return this.vipIcon;
                    }

                    public int hashCode() {
                        Integer vipIcon = getVipIcon();
                        int iHashCode = vipIcon == null ? 43 : vipIcon.hashCode();
                        String id2 = getId();
                        int iHashCode2 = ((iHashCode + 59) * 59) + (id2 == null ? 43 : id2.hashCode());
                        String fid = getFid();
                        int iHashCode3 = (iHashCode2 * 59) + (fid == null ? 43 : fid.hashCode());
                        String type = getType();
                        int iHashCode4 = (iHashCode3 * 59) + (type == null ? 43 : type.hashCode());
                        String icon = getIcon();
                        int iHashCode5 = (iHashCode4 * 59) + (icon == null ? 43 : icon.hashCode());
                        String text = getText();
                        return (iHashCode5 * 59) + (text != null ? text.hashCode() : 43);
                    }

                    public void setFid(String str) {
                        this.fid = str;
                    }

                    public void setIcon(String str) {
                        this.icon = str;
                    }

                    public void setId(String str) {
                        this.f34882id = str;
                    }

                    public void setText(String str) {
                        this.text = str;
                    }

                    public void setType(String str) {
                        this.type = str;
                    }

                    public void setVipIcon(Integer num) {
                        this.vipIcon = num;
                    }

                    public String toString() {
                        return "RocketActivityBean.DataDTO.RocketlistDTO.RewardsDTO.LevelDTO(id=" + getId() + ", fid=" + getFid() + ", type=" + getType() + ", vipIcon=" + getVipIcon() + ", icon=" + getIcon() + ", text=" + getText() + ")";
                    }
                }

                public boolean canEqual(Object obj) {
                    return obj instanceof RewardsDTO;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof RewardsDTO)) {
                        return false;
                    }
                    RewardsDTO rewardsDTO = (RewardsDTO) obj;
                    if (!rewardsDTO.canEqual(this)) {
                        return false;
                    }
                    List<LevelDTO> level1 = getLevel1();
                    List<LevelDTO> level12 = rewardsDTO.getLevel1();
                    if (level1 != null ? !level1.equals(level12) : level12 != null) {
                        return false;
                    }
                    List<LevelDTO> level2 = getLevel2();
                    List<LevelDTO> level22 = rewardsDTO.getLevel2();
                    if (level2 != null ? !level2.equals(level22) : level22 != null) {
                        return false;
                    }
                    List<LevelDTO> level3 = getLevel3();
                    List<LevelDTO> level32 = rewardsDTO.getLevel3();
                    return level3 != null ? level3.equals(level32) : level32 == null;
                }

                public List<LevelDTO> getLevel1() {
                    return this.level1;
                }

                public List<LevelDTO> getLevel2() {
                    return this.level2;
                }

                public List<LevelDTO> getLevel3() {
                    return this.level3;
                }

                public int hashCode() {
                    List<LevelDTO> level1 = getLevel1();
                    int iHashCode = level1 == null ? 43 : level1.hashCode();
                    List<LevelDTO> level2 = getLevel2();
                    int iHashCode2 = ((iHashCode + 59) * 59) + (level2 == null ? 43 : level2.hashCode());
                    List<LevelDTO> level3 = getLevel3();
                    return (iHashCode2 * 59) + (level3 != null ? level3.hashCode() : 43);
                }

                public void setLevel1(List<LevelDTO> list) {
                    this.level1 = list;
                }

                public void setLevel2(List<LevelDTO> list) {
                    this.level2 = list;
                }

                public void setLevel3(List<LevelDTO> list) {
                    this.level3 = list;
                }

                public String toString() {
                    return "RocketActivityBean.DataDTO.RocketlistDTO.RewardsDTO(level1=" + getLevel1() + ", level2=" + getLevel2() + ", level3=" + getLevel3() + ")";
                }
            }

            public boolean canEqual(Object obj) {
                return obj instanceof RocketlistDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof RocketlistDTO)) {
                    return false;
                }
                RocketlistDTO rocketlistDTO = (RocketlistDTO) obj;
                if (!rocketlistDTO.canEqual(this)) {
                    return false;
                }
                Integer actId = getActId();
                Integer actId2 = rocketlistDTO.getActId();
                if (actId != null ? !actId.equals(actId2) : actId2 != null) {
                    return false;
                }
                Integer level = getLevel();
                Integer level2 = rocketlistDTO.getLevel();
                if (level != null ? !level.equals(level2) : level2 != null) {
                    return false;
                }
                Integer current = getCurrent();
                Integer current2 = rocketlistDTO.getCurrent();
                if (current != null ? !current.equals(current2) : current2 != null) {
                    return false;
                }
                Integer swftype = getSwftype();
                Integer swftype2 = rocketlistDTO.getSwftype();
                if (swftype != null ? !swftype.equals(swftype2) : swftype2 != null) {
                    return false;
                }
                String icon = getIcon();
                String icon2 = rocketlistDTO.getIcon();
                if (icon != null ? !icon.equals(icon2) : icon2 != null) {
                    return false;
                }
                String swflink = getSwflink();
                String swflink2 = rocketlistDTO.getSwflink();
                if (swflink != null ? !swflink.equals(swflink2) : swflink2 != null) {
                    return false;
                }
                RewardsDTO rewards = getRewards();
                RewardsDTO rewards2 = rocketlistDTO.getRewards();
                return rewards != null ? rewards.equals(rewards2) : rewards2 == null;
            }

            public Integer getActId() {
                return this.actId;
            }

            public Integer getCurrent() {
                return this.current;
            }

            public String getIcon() {
                return this.icon;
            }

            public Integer getLevel() {
                return this.level;
            }

            public RewardsDTO getRewards() {
                return this.rewards;
            }

            public String getSwflink() {
                return this.swflink;
            }

            public Integer getSwftype() {
                return this.swftype;
            }

            public int hashCode() {
                Integer actId = getActId();
                int iHashCode = actId == null ? 43 : actId.hashCode();
                Integer level = getLevel();
                int iHashCode2 = ((iHashCode + 59) * 59) + (level == null ? 43 : level.hashCode());
                Integer current = getCurrent();
                int iHashCode3 = (iHashCode2 * 59) + (current == null ? 43 : current.hashCode());
                Integer swftype = getSwftype();
                int iHashCode4 = (iHashCode3 * 59) + (swftype == null ? 43 : swftype.hashCode());
                String icon = getIcon();
                int iHashCode5 = (iHashCode4 * 59) + (icon == null ? 43 : icon.hashCode());
                String swflink = getSwflink();
                int iHashCode6 = (iHashCode5 * 59) + (swflink == null ? 43 : swflink.hashCode());
                RewardsDTO rewards = getRewards();
                return (iHashCode6 * 59) + (rewards != null ? rewards.hashCode() : 43);
            }

            public void setActId(Integer num) {
                this.actId = num;
            }

            public void setCurrent(Integer num) {
                this.current = num;
            }

            public void setIcon(String str) {
                this.icon = str;
            }

            public void setLevel(Integer num) {
                this.level = num;
            }

            public void setRewards(RewardsDTO rewardsDTO) {
                this.rewards = rewardsDTO;
            }

            public void setSwflink(String str) {
                this.swflink = str;
            }

            public void setSwftype(Integer num) {
                this.swftype = num;
            }

            public String toString() {
                return "RocketActivityBean.DataDTO.RocketlistDTO(actId=" + getActId() + ", level=" + getLevel() + ", icon=" + getIcon() + ", current=" + getCurrent() + ", swftype=" + getSwftype() + ", swflink=" + getSwflink() + ", rewards=" + getRewards() + ")";
            }
        }

        public static class Top3DTO {

            @SerializedName("from_user_id")
            private Integer fromUserId;

            @SerializedName("rank")
            private Integer rank;

            @SerializedName("total")
            private String total;

            @SerializedName("user")
            private UserDTO user;

            public static class UserDTO {

                @SerializedName("anchor_level")
                private String anchorLevel;

                @SerializedName("avatar")
                private String avatar;

                /* JADX INFO: renamed from: id, reason: collision with root package name */
                @SerializedName("id")
                private String f34883id;

                @SerializedName("level")
                private String level;

                @SerializedName("nickname")
                private String nickname;

                @SerializedName("sex")
                private String sex;

                @SerializedName("vip_level")
                private String vipLevel;

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
                    String id2 = getId();
                    String id3 = userDTO.getId();
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
                    if (avatar != null ? !avatar.equals(avatar2) : avatar2 != null) {
                        return false;
                    }
                    String sex = getSex();
                    String sex2 = userDTO.getSex();
                    if (sex != null ? !sex.equals(sex2) : sex2 != null) {
                        return false;
                    }
                    String level = getLevel();
                    String level2 = userDTO.getLevel();
                    if (level != null ? !level.equals(level2) : level2 != null) {
                        return false;
                    }
                    String anchorLevel = getAnchorLevel();
                    String anchorLevel2 = userDTO.getAnchorLevel();
                    if (anchorLevel != null ? !anchorLevel.equals(anchorLevel2) : anchorLevel2 != null) {
                        return false;
                    }
                    String vipLevel = getVipLevel();
                    String vipLevel2 = userDTO.getVipLevel();
                    return vipLevel != null ? vipLevel.equals(vipLevel2) : vipLevel2 == null;
                }

                public String getAnchorLevel() {
                    return this.anchorLevel;
                }

                public String getAvatar() {
                    return this.avatar;
                }

                public String getId() {
                    return this.f34883id;
                }

                public String getLevel() {
                    return this.level;
                }

                public String getNickname() {
                    return this.nickname;
                }

                public String getSex() {
                    return this.sex;
                }

                public String getVipLevel() {
                    return this.vipLevel;
                }

                public int hashCode() {
                    String id2 = getId();
                    int iHashCode = id2 == null ? 43 : id2.hashCode();
                    String nickname = getNickname();
                    int iHashCode2 = ((iHashCode + 59) * 59) + (nickname == null ? 43 : nickname.hashCode());
                    String avatar = getAvatar();
                    int iHashCode3 = (iHashCode2 * 59) + (avatar == null ? 43 : avatar.hashCode());
                    String sex = getSex();
                    int iHashCode4 = (iHashCode3 * 59) + (sex == null ? 43 : sex.hashCode());
                    String level = getLevel();
                    int iHashCode5 = (iHashCode4 * 59) + (level == null ? 43 : level.hashCode());
                    String anchorLevel = getAnchorLevel();
                    int iHashCode6 = (iHashCode5 * 59) + (anchorLevel == null ? 43 : anchorLevel.hashCode());
                    String vipLevel = getVipLevel();
                    return (iHashCode6 * 59) + (vipLevel != null ? vipLevel.hashCode() : 43);
                }

                public void setAnchorLevel(String str) {
                    this.anchorLevel = str;
                }

                public void setAvatar(String str) {
                    this.avatar = str;
                }

                public void setId(String str) {
                    this.f34883id = str;
                }

                public void setLevel(String str) {
                    this.level = str;
                }

                public void setNickname(String str) {
                    this.nickname = str;
                }

                public void setSex(String str) {
                    this.sex = str;
                }

                public void setVipLevel(String str) {
                    this.vipLevel = str;
                }

                public String toString() {
                    return "RocketActivityBean.DataDTO.Top3DTO.UserDTO(id=" + getId() + ", nickname=" + getNickname() + ", avatar=" + getAvatar() + ", sex=" + getSex() + ", level=" + getLevel() + ", anchorLevel=" + getAnchorLevel() + ", vipLevel=" + getVipLevel() + ")";
                }
            }

            public boolean canEqual(Object obj) {
                return obj instanceof Top3DTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Top3DTO)) {
                    return false;
                }
                Top3DTO top3DTO = (Top3DTO) obj;
                if (!top3DTO.canEqual(this)) {
                    return false;
                }
                Integer fromUserId = getFromUserId();
                Integer fromUserId2 = top3DTO.getFromUserId();
                if (fromUserId != null ? !fromUserId.equals(fromUserId2) : fromUserId2 != null) {
                    return false;
                }
                Integer rank = getRank();
                Integer rank2 = top3DTO.getRank();
                if (rank != null ? !rank.equals(rank2) : rank2 != null) {
                    return false;
                }
                String total = getTotal();
                String total2 = top3DTO.getTotal();
                if (total != null ? !total.equals(total2) : total2 != null) {
                    return false;
                }
                UserDTO user = getUser();
                UserDTO user2 = top3DTO.getUser();
                return user != null ? user.equals(user2) : user2 == null;
            }

            public Integer getFromUserId() {
                return this.fromUserId;
            }

            public Integer getRank() {
                return this.rank;
            }

            public String getTotal() {
                return this.total;
            }

            public UserDTO getUser() {
                return this.user;
            }

            public int hashCode() {
                Integer fromUserId = getFromUserId();
                int iHashCode = fromUserId == null ? 43 : fromUserId.hashCode();
                Integer rank = getRank();
                int iHashCode2 = ((iHashCode + 59) * 59) + (rank == null ? 43 : rank.hashCode());
                String total = getTotal();
                int iHashCode3 = (iHashCode2 * 59) + (total == null ? 43 : total.hashCode());
                UserDTO user = getUser();
                return (iHashCode3 * 59) + (user != null ? user.hashCode() : 43);
            }

            public void setFromUserId(Integer num) {
                this.fromUserId = num;
            }

            public void setRank(Integer num) {
                this.rank = num;
            }

            public void setTotal(String str) {
                this.total = str;
            }

            public void setUser(UserDTO userDTO) {
                this.user = userDTO;
            }

            public String toString() {
                return "RocketActivityBean.DataDTO.Top3DTO(total=" + getTotal() + ", fromUserId=" + getFromUserId() + ", rank=" + getRank() + ", user=" + getUser() + ")";
            }
        }

        public boolean canEqual(Object obj) {
            return obj instanceof DataDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DataDTO)) {
                return false;
            }
            DataDTO dataDTO = (DataDTO) obj;
            if (!dataDTO.canEqual(this)) {
                return false;
            }
            Integer isOpen = getIsOpen();
            Integer isOpen2 = dataDTO.getIsOpen();
            if (isOpen != null ? !isOpen.equals(isOpen2) : isOpen2 != null) {
                return false;
            }
            Long shutdown = getShutdown();
            Long shutdown2 = dataDTO.getShutdown();
            if (shutdown != null ? !shutdown.equals(shutdown2) : shutdown2 != null) {
                return false;
            }
            String docExplain = getDocExplain();
            String docExplain2 = dataDTO.getDocExplain();
            if (docExplain != null ? !docExplain.equals(docExplain2) : docExplain2 != null) {
                return false;
            }
            String coinImg = getCoinImg();
            String coinImg2 = dataDTO.getCoinImg();
            if (coinImg != null ? !coinImg.equals(coinImg2) : coinImg2 != null) {
                return false;
            }
            List<RocketlistDTO> rocketlist = getRocketlist();
            List<RocketlistDTO> rocketlist2 = dataDTO.getRocketlist();
            if (rocketlist != null ? !rocketlist.equals(rocketlist2) : rocketlist2 != null) {
                return false;
            }
            ProcessDTO process = getProcess();
            ProcessDTO process2 = dataDTO.getProcess();
            if (process != null ? !process.equals(process2) : process2 != null) {
                return false;
            }
            List<Top3DTO> top3 = getTop3();
            List<Top3DTO> top32 = dataDTO.getTop3();
            return top3 != null ? top3.equals(top32) : top32 == null;
        }

        public String getCoinImg() {
            return this.coinImg;
        }

        public String getDocExplain() {
            return this.docExplain;
        }

        public Integer getIsOpen() {
            return this.isOpen;
        }

        public ProcessDTO getProcess() {
            return this.process;
        }

        public List<RocketlistDTO> getRocketlist() {
            return this.rocketlist;
        }

        public Long getShutdown() {
            return this.shutdown;
        }

        public List<Top3DTO> getTop3() {
            return this.top3;
        }

        public int hashCode() {
            Integer isOpen = getIsOpen();
            int iHashCode = isOpen == null ? 43 : isOpen.hashCode();
            Long shutdown = getShutdown();
            int iHashCode2 = ((iHashCode + 59) * 59) + (shutdown == null ? 43 : shutdown.hashCode());
            String docExplain = getDocExplain();
            int iHashCode3 = (iHashCode2 * 59) + (docExplain == null ? 43 : docExplain.hashCode());
            String coinImg = getCoinImg();
            int iHashCode4 = (iHashCode3 * 59) + (coinImg == null ? 43 : coinImg.hashCode());
            List<RocketlistDTO> rocketlist = getRocketlist();
            int iHashCode5 = (iHashCode4 * 59) + (rocketlist == null ? 43 : rocketlist.hashCode());
            ProcessDTO process = getProcess();
            int iHashCode6 = (iHashCode5 * 59) + (process == null ? 43 : process.hashCode());
            List<Top3DTO> top3 = getTop3();
            return (iHashCode6 * 59) + (top3 != null ? top3.hashCode() : 43);
        }

        public void setCoinImg(String str) {
            this.coinImg = str;
        }

        public void setDocExplain(String str) {
            this.docExplain = str;
        }

        public void setIsOpen(Integer num) {
            this.isOpen = num;
        }

        public void setProcess(ProcessDTO processDTO) {
            this.process = processDTO;
        }

        public void setRocketlist(List<RocketlistDTO> list) {
            this.rocketlist = list;
        }

        public void setShutdown(Long l10) {
            this.shutdown = l10;
        }

        public void setTop3(List<Top3DTO> list) {
            this.top3 = list;
        }

        public String toString() {
            return "RocketActivityBean.DataDTO(isOpen=" + getIsOpen() + ", docExplain=" + getDocExplain() + ", coinImg=" + getCoinImg() + ", shutdown=" + getShutdown() + ", rocketlist=" + getRocketlist() + ", process=" + getProcess() + ", top3=" + getTop3() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof RocketActivityBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RocketActivityBean)) {
            return false;
        }
        RocketActivityBean rocketActivityBean = (RocketActivityBean) obj;
        if (!rocketActivityBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = rocketActivityBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = rocketActivityBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = rocketActivityBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = rocketActivityBean.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    public Integer getCode() {
        return this.code;
    }

    public DataDTO getData() {
        return this.data;
    }

    public String getMsg() {
        return this.msg;
    }

    public Integer getTime() {
        return this.time;
    }

    public int hashCode() {
        Integer code = getCode();
        int iHashCode = code == null ? 43 : code.hashCode();
        Integer time = getTime();
        int iHashCode2 = ((iHashCode + 59) * 59) + (time == null ? 43 : time.hashCode());
        String msg = getMsg();
        int iHashCode3 = (iHashCode2 * 59) + (msg == null ? 43 : msg.hashCode());
        DataDTO data = getData();
        return (iHashCode3 * 59) + (data != null ? data.hashCode() : 43);
    }

    public void setCode(Integer num) {
        this.code = num;
    }

    public void setData(DataDTO dataDTO) {
        this.data = dataDTO;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setTime(Integer num) {
        this.time = num;
    }

    public String toString() {
        return "RocketActivityBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
