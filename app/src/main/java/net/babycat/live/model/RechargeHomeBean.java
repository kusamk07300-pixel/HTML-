package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RechargeHomeBean {

    @SerializedName("agent")
    private List<AgentDTO> agent;

    @SerializedName("agent_discount")
    private String agentDiscount;

    @SerializedName("recharge_banner")
    private String rechargeBanner;

    public static class AgentDTO implements Serializable {

        @SerializedName("country_iso")
        private String countryIso;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34878id;

        @SerializedName("nickname")
        private String nickname;

        @SerializedName("online")
        private Integer online;

        @SerializedName("portrait")
        private String portrait;

        @SerializedName("type")
        private Integer type;

        @SerializedName("user_id")
        private Integer userId;

        @SerializedName("username")
        private String username;

        public boolean canEqual(Object obj) {
            return obj instanceof AgentDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AgentDTO)) {
                return false;
            }
            AgentDTO agentDTO = (AgentDTO) obj;
            if (!agentDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = agentDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            Integer userId = getUserId();
            Integer userId2 = agentDTO.getUserId();
            if (userId != null ? !userId.equals(userId2) : userId2 != null) {
                return false;
            }
            Integer online = getOnline();
            Integer online2 = agentDTO.getOnline();
            if (online != null ? !online.equals(online2) : online2 != null) {
                return false;
            }
            Integer type = getType();
            Integer type2 = agentDTO.getType();
            if (type != null ? !type.equals(type2) : type2 != null) {
                return false;
            }
            String nickname = getNickname();
            String nickname2 = agentDTO.getNickname();
            if (nickname != null ? !nickname.equals(nickname2) : nickname2 != null) {
                return false;
            }
            String username = getUsername();
            String username2 = agentDTO.getUsername();
            if (username != null ? !username.equals(username2) : username2 != null) {
                return false;
            }
            String portrait = getPortrait();
            String portrait2 = agentDTO.getPortrait();
            if (portrait != null ? !portrait.equals(portrait2) : portrait2 != null) {
                return false;
            }
            String countryIso = getCountryIso();
            String countryIso2 = agentDTO.getCountryIso();
            return countryIso != null ? countryIso.equals(countryIso2) : countryIso2 == null;
        }

        public String getCountryIso() {
            return this.countryIso;
        }

        public Integer getId() {
            return this.f34878id;
        }

        public String getNickname() {
            return this.nickname;
        }

        public Integer getOnline() {
            return this.online;
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
            Integer online = getOnline();
            int iHashCode3 = (iHashCode2 * 59) + (online == null ? 43 : online.hashCode());
            Integer type = getType();
            int iHashCode4 = (iHashCode3 * 59) + (type == null ? 43 : type.hashCode());
            String nickname = getNickname();
            int iHashCode5 = (iHashCode4 * 59) + (nickname == null ? 43 : nickname.hashCode());
            String username = getUsername();
            int iHashCode6 = (iHashCode5 * 59) + (username == null ? 43 : username.hashCode());
            String portrait = getPortrait();
            int iHashCode7 = (iHashCode6 * 59) + (portrait == null ? 43 : portrait.hashCode());
            String countryIso = getCountryIso();
            return (iHashCode7 * 59) + (countryIso != null ? countryIso.hashCode() : 43);
        }

        public void setCountryIso(String str) {
            this.countryIso = str;
        }

        public void setId(Integer num) {
            this.f34878id = num;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public void setOnline(Integer num) {
            this.online = num;
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
            return "RechargeHomeBean.AgentDTO(id=" + getId() + ", nickname=" + getNickname() + ", userId=" + getUserId() + ", online=" + getOnline() + ", username=" + getUsername() + ", type=" + getType() + ", portrait=" + getPortrait() + ", countryIso=" + getCountryIso() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof RechargeHomeBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RechargeHomeBean)) {
            return false;
        }
        RechargeHomeBean rechargeHomeBean = (RechargeHomeBean) obj;
        if (!rechargeHomeBean.canEqual(this)) {
            return false;
        }
        String rechargeBanner = getRechargeBanner();
        String rechargeBanner2 = rechargeHomeBean.getRechargeBanner();
        if (rechargeBanner != null ? !rechargeBanner.equals(rechargeBanner2) : rechargeBanner2 != null) {
            return false;
        }
        String agentDiscount = getAgentDiscount();
        String agentDiscount2 = rechargeHomeBean.getAgentDiscount();
        if (agentDiscount != null ? !agentDiscount.equals(agentDiscount2) : agentDiscount2 != null) {
            return false;
        }
        List<AgentDTO> agent = getAgent();
        List<AgentDTO> agent2 = rechargeHomeBean.getAgent();
        return agent != null ? agent.equals(agent2) : agent2 == null;
    }

    public List<AgentDTO> getAgent() {
        return this.agent;
    }

    public String getAgentDiscount() {
        return this.agentDiscount;
    }

    public String getRechargeBanner() {
        return this.rechargeBanner;
    }

    public int hashCode() {
        String rechargeBanner = getRechargeBanner();
        int iHashCode = rechargeBanner == null ? 43 : rechargeBanner.hashCode();
        String agentDiscount = getAgentDiscount();
        int iHashCode2 = ((iHashCode + 59) * 59) + (agentDiscount == null ? 43 : agentDiscount.hashCode());
        List<AgentDTO> agent = getAgent();
        return (iHashCode2 * 59) + (agent != null ? agent.hashCode() : 43);
    }

    public void setAgent(List<AgentDTO> list) {
        this.agent = list;
    }

    public void setAgentDiscount(String str) {
        this.agentDiscount = str;
    }

    public void setRechargeBanner(String str) {
        this.rechargeBanner = str;
    }

    public String toString() {
        return "RechargeHomeBean(rechargeBanner=" + getRechargeBanner() + ", agentDiscount=" + getAgentDiscount() + ", agent=" + getAgent() + ")";
    }
}
