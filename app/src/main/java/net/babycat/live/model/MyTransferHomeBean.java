package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class MyTransferHomeBean {

    @SerializedName("agent_list")
    private List<AgentListDTO> agentList;

    @SerializedName("diamonds")
    private String diamonds;

    @SerializedName("dollar")
    private String dollar;

    @SerializedName("rule_list")
    private List<RuleListDTO> ruleList;

    @SerializedName("transfer_desc")
    private String transferDesc;

    @SerializedName("transfer_switch")
    private Integer transferSwitch;

    public static class AgentListDTO {

        @SerializedName("country_iso")
        private String countryIso;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34869id;

        @SerializedName("nickname")
        private String nickname;

        @SerializedName("portrait")
        private String portrait;

        @SerializedName("type")
        private Integer type;

        @SerializedName("user_id")
        private Integer userId;

        @SerializedName("username")
        private String username;

        public boolean canEqual(Object obj) {
            return obj instanceof AgentListDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AgentListDTO)) {
                return false;
            }
            AgentListDTO agentListDTO = (AgentListDTO) obj;
            if (!agentListDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = agentListDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            Integer userId = getUserId();
            Integer userId2 = agentListDTO.getUserId();
            if (userId != null ? !userId.equals(userId2) : userId2 != null) {
                return false;
            }
            Integer type = getType();
            Integer type2 = agentListDTO.getType();
            if (type != null ? !type.equals(type2) : type2 != null) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = agentListDTO.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String username = getUsername();
            String username2 = agentListDTO.getUsername();
            if (username != null ? !username.equals(username2) : username2 != null) {
                return false;
            }
            String portrait = getPortrait();
            String portrait2 = agentListDTO.getPortrait();
            if (portrait != null ? !portrait.equals(portrait2) : portrait2 != null) {
                return false;
            }
            String countryIso = getCountryIso();
            String countryIso2 = agentListDTO.getCountryIso();
            return countryIso != null ? countryIso.equals(countryIso2) : countryIso2 == null;
        }

        public String getCountryIso() {
            return this.countryIso;
        }

        public Integer getId() {
            return this.f34869id;
        }

        public String getNickname() {
            return this.nickname;
        }

        public String getPortrait() {
            return this.portrait;
        }

        public Integer getType() {
            return this.type;
        }

        public Integer getUserId() {
            return this.userId;
        }

        public String getUsername() {
            return this.username;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer userId = getUserId();
            int iHashCode2 = ((iHashCode + 59) * 59) + (userId == null ? 43 : userId.hashCode());
            Integer type = getType();
            int iHashCode3 = (iHashCode2 * 59) + (type == null ? 43 : type.hashCode());
            String nickname = getNickname();
            int iHashCode4 = (iHashCode3 * 59) + (nickname == null ? 43 : nickname.hashCode());
            String username = getUsername();
            int iHashCode5 = (iHashCode4 * 59) + (username == null ? 43 : username.hashCode());
            String portrait = getPortrait();
            int iHashCode6 = (iHashCode5 * 59) + (portrait == null ? 43 : portrait.hashCode());
            String countryIso = getCountryIso();
            return (iHashCode6 * 59) + (countryIso != null ? countryIso.hashCode() : 43);
        }

        public void setCountryIso(String str) {
            this.countryIso = str;
        }

        public void setId(Integer num) {
            this.f34869id = num;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public void setPortrait(String str) {
            this.portrait = str;
        }

        public void setType(Integer num) {
            this.type = num;
        }

        public void setUserId(Integer num) {
            this.userId = num;
        }

        public void setUsername(String str) {
            this.username = str;
        }

        public String toString() {
            return "MyTransferHomeBean.AgentListDTO(id=" + getId() + ", nickname=" + getNickname() + ", userId=" + getUserId() + ", username=" + getUsername() + ", type=" + getType() + ", portrait=" + getPortrait() + ", countryIso=" + getCountryIso() + ")";
        }
    }

    public static class RuleListDTO {

        @SerializedName("dollar")
        private Integer dollar;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34870id;
        private Boolean isSelect = Boolean.FALSE;

        @SerializedName("ticket")
        private Integer ticket;

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
            Integer id2 = getId();
            Integer id3 = ruleListDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            Integer dollar = getDollar();
            Integer dollar2 = ruleListDTO.getDollar();
            if (dollar != null ? !dollar.equals(dollar2) : dollar2 != null) {
                return false;
            }
            Integer ticket = getTicket();
            Integer ticket2 = ruleListDTO.getTicket();
            if (ticket != null ? !ticket.equals(ticket2) : ticket2 != null) {
                return false;
            }
            Boolean isSelect = getIsSelect();
            Boolean isSelect2 = ruleListDTO.getIsSelect();
            return isSelect != null ? isSelect.equals(isSelect2) : isSelect2 == null;
        }

        public Integer getDollar() {
            return this.dollar;
        }

        public Integer getId() {
            return this.f34870id;
        }

        public Boolean getIsSelect() {
            return this.isSelect;
        }

        public Integer getTicket() {
            return this.ticket;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer dollar = getDollar();
            int iHashCode2 = ((iHashCode + 59) * 59) + (dollar == null ? 43 : dollar.hashCode());
            Integer ticket = getTicket();
            int iHashCode3 = (iHashCode2 * 59) + (ticket == null ? 43 : ticket.hashCode());
            Boolean isSelect = getIsSelect();
            return (iHashCode3 * 59) + (isSelect != null ? isSelect.hashCode() : 43);
        }

        public void setDollar(Integer num) {
            this.dollar = num;
        }

        public void setId(Integer num) {
            this.f34870id = num;
        }

        public void setIsSelect(Boolean bool) {
            this.isSelect = bool;
        }

        public void setTicket(Integer num) {
            this.ticket = num;
        }

        public String toString() {
            return "MyTransferHomeBean.RuleListDTO(id=" + getId() + ", dollar=" + getDollar() + ", ticket=" + getTicket() + ", isSelect=" + getIsSelect() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof MyTransferHomeBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MyTransferHomeBean)) {
            return false;
        }
        MyTransferHomeBean myTransferHomeBean = (MyTransferHomeBean) obj;
        if (!myTransferHomeBean.canEqual(this)) {
            return false;
        }
        Integer transferSwitch = getTransferSwitch();
        Integer transferSwitch2 = myTransferHomeBean.getTransferSwitch();
        if (transferSwitch != null ? !transferSwitch.equals(transferSwitch2) : transferSwitch2 != null) {
            return false;
        }
        String diamonds = getDiamonds();
        String diamonds2 = myTransferHomeBean.getDiamonds();
        if (diamonds != null ? !diamonds.equals(diamonds2) : diamonds2 != null) {
            return false;
        }
        String dollar = getDollar();
        String dollar2 = myTransferHomeBean.getDollar();
        if (dollar != null ? !dollar.equals(dollar2) : dollar2 != null) {
            return false;
        }
        List<AgentListDTO> agentList = getAgentList();
        List<AgentListDTO> agentList2 = myTransferHomeBean.getAgentList();
        if (agentList != null ? !agentList.equals(agentList2) : agentList2 != null) {
            return false;
        }
        String transferDesc = getTransferDesc();
        String transferDesc2 = myTransferHomeBean.getTransferDesc();
        if (transferDesc != null ? !transferDesc.equals(transferDesc2) : transferDesc2 != null) {
            return false;
        }
        List<RuleListDTO> ruleList = getRuleList();
        List<RuleListDTO> ruleList2 = myTransferHomeBean.getRuleList();
        return ruleList != null ? ruleList.equals(ruleList2) : ruleList2 == null;
    }

    public List<AgentListDTO> getAgentList() {
        return this.agentList;
    }

    public String getDiamonds() {
        return this.diamonds;
    }

    public String getDollar() {
        return this.dollar;
    }

    public List<RuleListDTO> getRuleList() {
        return this.ruleList;
    }

    public String getTransferDesc() {
        return this.transferDesc;
    }

    public Integer getTransferSwitch() {
        return this.transferSwitch;
    }

    public int hashCode() {
        Integer transferSwitch = getTransferSwitch();
        int iHashCode = transferSwitch == null ? 43 : transferSwitch.hashCode();
        String diamonds = getDiamonds();
        int iHashCode2 = ((iHashCode + 59) * 59) + (diamonds == null ? 43 : diamonds.hashCode());
        String dollar = getDollar();
        int iHashCode3 = (iHashCode2 * 59) + (dollar == null ? 43 : dollar.hashCode());
        List<AgentListDTO> agentList = getAgentList();
        int iHashCode4 = (iHashCode3 * 59) + (agentList == null ? 43 : agentList.hashCode());
        String transferDesc = getTransferDesc();
        int iHashCode5 = (iHashCode4 * 59) + (transferDesc == null ? 43 : transferDesc.hashCode());
        List<RuleListDTO> ruleList = getRuleList();
        return (iHashCode5 * 59) + (ruleList != null ? ruleList.hashCode() : 43);
    }

    public void setAgentList(List<AgentListDTO> list) {
        this.agentList = list;
    }

    public void setDiamonds(String str) {
        this.diamonds = str;
    }

    public void setDollar(String str) {
        this.dollar = str;
    }

    public void setRuleList(List<RuleListDTO> list) {
        this.ruleList = list;
    }

    public void setTransferDesc(String str) {
        this.transferDesc = str;
    }

    public void setTransferSwitch(Integer num) {
        this.transferSwitch = num;
    }

    public String toString() {
        return "MyTransferHomeBean(diamonds=" + getDiamonds() + ", dollar=" + getDollar() + ", agentList=" + getAgentList() + ", transferSwitch=" + getTransferSwitch() + ", transferDesc=" + getTransferDesc() + ", ruleList=" + getRuleList() + ")";
    }
}
