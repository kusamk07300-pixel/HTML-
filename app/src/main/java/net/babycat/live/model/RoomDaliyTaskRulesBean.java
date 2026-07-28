package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RoomDaliyTaskRulesBean {

    @SerializedName("code")
    private Integer code;

    @SerializedName("data")
    private DataDTO data;

    @SerializedName(o0.CATEGORY_MESSAGE)
    private String msg;

    @SerializedName("time")
    private Integer time;

    public static class DataDTO {

        @SerializedName("desc")
        private String desc;

        @SerializedName("min_limit")
        private String minLimit;

        @SerializedName("rule_link")
        private String ruleLink;

        @SerializedName("rule_list")
        private List<RuleListDTO> ruleList;

        public static class RuleListDTO {

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            @SerializedName("id")
            private String f34887id;

            @SerializedName("owner_rewards")
            private String ownerRewards;

            @SerializedName("target_coins")
            private String targetCoins;

            @SerializedName("top10")
            private String top10;

            @SerializedName("top_rewards1")
            private String topRewards1;

            @SerializedName("top_rewards2")
            private String topRewards2;

            @SerializedName("top_rewards3")
            private String topRewards3;

            @SerializedName("top_rewards4")
            private String topRewards4;

            public boolean canEqual(Object obj) {
                return obj instanceof RuleListDTO;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof RuleListDTO)) {
                    return false;
                }
                RuleListDTO ruleListDTO = (RuleListDTO) obj;
                if (!ruleListDTO.canEqual(this)) {
                    return false;
                }
                String id2 = getId();
                String id3 = ruleListDTO.getId();
                if (id2 != null ? !id2.equals(id3) : id3 != null) {
                    return false;
                }
                String targetCoins = getTargetCoins();
                String targetCoins2 = ruleListDTO.getTargetCoins();
                if (targetCoins != null ? !targetCoins.equals(targetCoins2) : targetCoins2 != null) {
                    return false;
                }
                String ownerRewards = getOwnerRewards();
                String ownerRewards2 = ruleListDTO.getOwnerRewards();
                if (ownerRewards != null ? !ownerRewards.equals(ownerRewards2) : ownerRewards2 != null) {
                    return false;
                }
                String top10 = getTop10();
                String top102 = ruleListDTO.getTop10();
                if (top10 != null ? !top10.equals(top102) : top102 != null) {
                    return false;
                }
                String topRewards1 = getTopRewards1();
                String topRewards12 = ruleListDTO.getTopRewards1();
                if (topRewards1 != null ? !topRewards1.equals(topRewards12) : topRewards12 != null) {
                    return false;
                }
                String topRewards2 = getTopRewards2();
                String topRewards22 = ruleListDTO.getTopRewards2();
                if (topRewards2 != null ? !topRewards2.equals(topRewards22) : topRewards22 != null) {
                    return false;
                }
                String topRewards3 = getTopRewards3();
                String topRewards32 = ruleListDTO.getTopRewards3();
                if (topRewards3 != null ? !topRewards3.equals(topRewards32) : topRewards32 != null) {
                    return false;
                }
                String topRewards4 = getTopRewards4();
                String topRewards42 = ruleListDTO.getTopRewards4();
                return topRewards4 != null ? topRewards4.equals(topRewards42) : topRewards42 == null;
            }

            public String getId() {
                return this.f34887id;
            }

            public String getOwnerRewards() {
                return this.ownerRewards;
            }

            public String getTargetCoins() {
                return this.targetCoins;
            }

            public String getTop10() {
                return this.top10;
            }

            public String getTopRewards1() {
                return this.topRewards1;
            }

            public String getTopRewards2() {
                return this.topRewards2;
            }

            public String getTopRewards3() {
                return this.topRewards3;
            }

            public String getTopRewards4() {
                return this.topRewards4;
            }

            public int hashCode() {
                String id2 = getId();
                int iHashCode = id2 == null ? 43 : id2.hashCode();
                String targetCoins = getTargetCoins();
                int iHashCode2 = ((iHashCode + 59) * 59) + (targetCoins == null ? 43 : targetCoins.hashCode());
                String ownerRewards = getOwnerRewards();
                int iHashCode3 = (iHashCode2 * 59) + (ownerRewards == null ? 43 : ownerRewards.hashCode());
                String top10 = getTop10();
                int iHashCode4 = (iHashCode3 * 59) + (top10 == null ? 43 : top10.hashCode());
                String topRewards1 = getTopRewards1();
                int iHashCode5 = (iHashCode4 * 59) + (topRewards1 == null ? 43 : topRewards1.hashCode());
                String topRewards2 = getTopRewards2();
                int iHashCode6 = (iHashCode5 * 59) + (topRewards2 == null ? 43 : topRewards2.hashCode());
                String topRewards3 = getTopRewards3();
                int iHashCode7 = (iHashCode6 * 59) + (topRewards3 == null ? 43 : topRewards3.hashCode());
                String topRewards4 = getTopRewards4();
                return (iHashCode7 * 59) + (topRewards4 != null ? topRewards4.hashCode() : 43);
            }

            public void setId(String str) {
                this.f34887id = str;
            }

            public void setOwnerRewards(String str) {
                this.ownerRewards = str;
            }

            public void setTargetCoins(String str) {
                this.targetCoins = str;
            }

            public void setTop10(String str) {
                this.top10 = str;
            }

            public void setTopRewards1(String str) {
                this.topRewards1 = str;
            }

            public void setTopRewards2(String str) {
                this.topRewards2 = str;
            }

            public void setTopRewards3(String str) {
                this.topRewards3 = str;
            }

            public void setTopRewards4(String str) {
                this.topRewards4 = str;
            }

            public String toString() {
                return "RoomDaliyTaskRulesBean.DataDTO.RuleListDTO(id=" + getId() + ", targetCoins=" + getTargetCoins() + ", ownerRewards=" + getOwnerRewards() + ", top10=" + getTop10() + ", topRewards1=" + getTopRewards1() + ", topRewards2=" + getTopRewards2() + ", topRewards3=" + getTopRewards3() + ", topRewards4=" + getTopRewards4() + ")";
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
            String desc = getDesc();
            String desc2 = dataDTO.getDesc();
            if (desc != null ? !desc.equals(desc2) : desc2 != null) {
                return false;
            }
            String minLimit = getMinLimit();
            String minLimit2 = dataDTO.getMinLimit();
            if (minLimit != null ? !minLimit.equals(minLimit2) : minLimit2 != null) {
                return false;
            }
            List<RuleListDTO> ruleList = getRuleList();
            List<RuleListDTO> ruleList2 = dataDTO.getRuleList();
            if (ruleList != null ? !ruleList.equals(ruleList2) : ruleList2 != null) {
                return false;
            }
            String ruleLink = getRuleLink();
            String ruleLink2 = dataDTO.getRuleLink();
            return ruleLink != null ? ruleLink.equals(ruleLink2) : ruleLink2 == null;
        }

        public String getDesc() {
            return this.desc;
        }

        public String getMinLimit() {
            return this.minLimit;
        }

        public String getRuleLink() {
            return this.ruleLink;
        }

        public List<RuleListDTO> getRuleList() {
            return this.ruleList;
        }

        public int hashCode() {
            String desc = getDesc();
            int iHashCode = desc == null ? 43 : desc.hashCode();
            String minLimit = getMinLimit();
            int iHashCode2 = ((iHashCode + 59) * 59) + (minLimit == null ? 43 : minLimit.hashCode());
            List<RuleListDTO> ruleList = getRuleList();
            int iHashCode3 = (iHashCode2 * 59) + (ruleList == null ? 43 : ruleList.hashCode());
            String ruleLink = getRuleLink();
            return (iHashCode3 * 59) + (ruleLink != null ? ruleLink.hashCode() : 43);
        }

        public void setDesc(String str) {
            this.desc = str;
        }

        public void setMinLimit(String str) {
            this.minLimit = str;
        }

        public void setRuleLink(String str) {
            this.ruleLink = str;
        }

        public void setRuleList(List<RuleListDTO> list) {
            this.ruleList = list;
        }

        public String toString() {
            return "RoomDaliyTaskRulesBean.DataDTO(desc=" + getDesc() + ", minLimit=" + getMinLimit() + ", ruleList=" + getRuleList() + ", ruleLink=" + getRuleLink() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof RoomDaliyTaskRulesBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoomDaliyTaskRulesBean)) {
            return false;
        }
        RoomDaliyTaskRulesBean roomDaliyTaskRulesBean = (RoomDaliyTaskRulesBean) obj;
        if (!roomDaliyTaskRulesBean.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = roomDaliyTaskRulesBean.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer time = getTime();
        Integer time2 = roomDaliyTaskRulesBean.getTime();
        if (time != null ? !time.equals(time2) : time2 != null) {
            return false;
        }
        String msg = getMsg();
        String msg2 = roomDaliyTaskRulesBean.getMsg();
        if (msg != null ? !msg.equals(msg2) : msg2 != null) {
            return false;
        }
        DataDTO data = getData();
        DataDTO data2 = roomDaliyTaskRulesBean.getData();
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
        return "RoomDaliyTaskRulesBean(msg=" + getMsg() + ", code=" + getCode() + ", time=" + getTime() + ", data=" + getData() + ")";
    }
}
