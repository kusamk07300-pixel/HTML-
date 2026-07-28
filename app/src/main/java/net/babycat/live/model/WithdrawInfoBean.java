package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class WithdrawInfoBean implements Serializable {

    @SerializedName("agent_list")
    private List<AgentListDTO> agentList;

    @SerializedName("auth_info")
    private AuthInfoDTO authInfo;

    @SerializedName("auth_withdraw")
    private AuthWithdrawDTO authWithdraw;

    @SerializedName("bank_info")
    private BankInfoDTO bankInfo;

    @SerializedName("help_url")
    private String helpUrl;

    @SerializedName("is_band")
    private Integer isBand;

    @SerializedName("money")
    private String money;

    @SerializedName("official_info")
    private BankInfoDTO officialInfo;

    @SerializedName("ticket")
    private Integer ticket;

    @SerializedName("withdraw_day_max_diamonds")
    private Double withdrawDayMaxDiamonds;

    @SerializedName("withdraw_days")
    private Integer withdrawDays;

    @SerializedName("withdraw_fee_rate_agent")
    private Double withdrawFeeRateAgent;

    @SerializedName("withdraw_fee_rate_offical")
    private String withdrawFeeRateOffical;

    @SerializedName("withdraw_min_diamonds")
    private Double withdrawMinDiamonds;

    @SerializedName("withdraw_rate")
    private String withdrawRate;

    public static class AgentListDTO implements Serializable {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34922id;

        @SerializedName("nickname")
        private String nickname;

        @SerializedName("user_id")
        private Integer userId;

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
            String nickname = getNickname();
            String nickname2 = agentListDTO.getNickname();
            return nickname != null ? nickname.equals(nickname2) : nickname2 == null;
        }

        public Integer getId() {
            return this.f34922id;
        }

        public String getNickname() {
            return this.nickname;
        }

        public Integer getUserId() {
            return this.userId;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer userId = getUserId();
            int iHashCode2 = ((iHashCode + 59) * 59) + (userId == null ? 43 : userId.hashCode());
            String nickname = getNickname();
            return (iHashCode2 * 59) + (nickname != null ? nickname.hashCode() : 43);
        }

        public void setId(Integer num) {
            this.f34922id = num;
        }

        public void setNickname(String str) {
            this.nickname = str;
        }

        public void setUserId(Integer num) {
            this.userId = num;
        }

        public String toString() {
            return "WithdrawInfoBean.AgentListDTO(id=" + getId() + ", nickname=" + getNickname() + ", userId=" + getUserId() + ")";
        }
    }

    public static class AuthInfoDTO implements Serializable {

        @SerializedName("country_iso")
        private String countryIso;

        @SerializedName("email")
        private String email;

        @SerializedName("is_auth")
        private Integer isAuth;

        @SerializedName("mobile")
        private String mobile;

        @SerializedName("username")
        private String username;

        public boolean canEqual(Object obj) {
            return obj instanceof AuthInfoDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AuthInfoDTO)) {
                return false;
            }
            AuthInfoDTO authInfoDTO = (AuthInfoDTO) obj;
            if (!authInfoDTO.canEqual(this)) {
                return false;
            }
            Integer isAuth = getIsAuth();
            Integer isAuth2 = authInfoDTO.getIsAuth();
            if (isAuth != null ? !isAuth.equals(isAuth2) : isAuth2 != null) {
                return false;
            }
            String countryIso = getCountryIso();
            String countryIso2 = authInfoDTO.getCountryIso();
            if (countryIso != null ? !countryIso.equals(countryIso2) : countryIso2 != null) {
                return false;
            }
            String mobile = getMobile();
            String mobile2 = authInfoDTO.getMobile();
            if (mobile != null ? !mobile.equals(mobile2) : mobile2 != null) {
                return false;
            }
            String username = getUsername();
            String username2 = authInfoDTO.getUsername();
            if (username != null ? !username.equals(username2) : username2 != null) {
                return false;
            }
            String email = getEmail();
            String email2 = authInfoDTO.getEmail();
            return email != null ? email.equals(email2) : email2 == null;
        }

        public String getCountryIso() {
            return this.countryIso;
        }

        public String getEmail() {
            return this.email;
        }

        public Integer getIsAuth() {
            return this.isAuth;
        }

        public String getMobile() {
            return this.mobile;
        }

        public String getUsername() {
            return this.username;
        }

        public int hashCode() {
            Integer isAuth = getIsAuth();
            int iHashCode = isAuth == null ? 43 : isAuth.hashCode();
            String countryIso = getCountryIso();
            int iHashCode2 = ((iHashCode + 59) * 59) + (countryIso == null ? 43 : countryIso.hashCode());
            String mobile = getMobile();
            int iHashCode3 = (iHashCode2 * 59) + (mobile == null ? 43 : mobile.hashCode());
            String username = getUsername();
            int iHashCode4 = (iHashCode3 * 59) + (username == null ? 43 : username.hashCode());
            String email = getEmail();
            return (iHashCode4 * 59) + (email != null ? email.hashCode() : 43);
        }

        public void setCountryIso(String str) {
            this.countryIso = str;
        }

        public void setEmail(String str) {
            this.email = str;
        }

        public void setIsAuth(Integer num) {
            this.isAuth = num;
        }

        public void setMobile(String str) {
            this.mobile = str;
        }

        public void setUsername(String str) {
            this.username = str;
        }

        public String toString() {
            return "WithdrawInfoBean.AuthInfoDTO(countryIso=" + getCountryIso() + ", mobile=" + getMobile() + ", username=" + getUsername() + ", isAuth=" + getIsAuth() + ", email=" + getEmail() + ")";
        }
    }

    public static class AuthWithdrawDTO implements Serializable {

        @SerializedName("had_limit")
        private Integer hadLimit;

        @SerializedName("process")
        private Integer process;

        public boolean canEqual(Object obj) {
            return obj instanceof AuthWithdrawDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AuthWithdrawDTO)) {
                return false;
            }
            AuthWithdrawDTO authWithdrawDTO = (AuthWithdrawDTO) obj;
            if (!authWithdrawDTO.canEqual(this)) {
                return false;
            }
            Integer process = getProcess();
            Integer process2 = authWithdrawDTO.getProcess();
            if (process != null ? !process.equals(process2) : process2 != null) {
                return false;
            }
            Integer hadLimit = getHadLimit();
            Integer hadLimit2 = authWithdrawDTO.getHadLimit();
            return hadLimit != null ? hadLimit.equals(hadLimit2) : hadLimit2 == null;
        }

        public Integer getHadLimit() {
            return this.hadLimit;
        }

        public Integer getProcess() {
            return this.process;
        }

        public int hashCode() {
            Integer process = getProcess();
            int iHashCode = process == null ? 43 : process.hashCode();
            Integer hadLimit = getHadLimit();
            return ((iHashCode + 59) * 59) + (hadLimit != null ? hadLimit.hashCode() : 43);
        }

        public void setHadLimit(Integer num) {
            this.hadLimit = num;
        }

        public void setProcess(Integer num) {
            this.process = num;
        }

        public String toString() {
            return "WithdrawInfoBean.AuthWithdrawDTO(process=" + getProcess() + ", hadLimit=" + getHadLimit() + ")";
        }
    }

    public static class BankInfoDTO implements Serializable {

        @SerializedName("account")
        private String account;

        @SerializedName("account_bank")
        private String accountBank;

        @SerializedName("addtime")
        private Integer addtime;

        @SerializedName("agent_id")
        private Integer agentId;

        @SerializedName("bind_type")
        private Integer bindType;

        @SerializedName("branch_bank")
        private String branchBank;

        @SerializedName("country_iso")
        private String countryIso;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34923id;

        @SerializedName("mobile")
        private String mobile;

        @SerializedName("name")
        private String name;

        @SerializedName("remark")
        private String remark;

        @SerializedName(o0.CATEGORY_STATUS)
        private Integer status;

        @SerializedName("type")
        private Integer type;

        @SerializedName("uid")
        private Integer uid;

        @SerializedName("upi_id")
        private String upiId;

        @SerializedName("usdt_code")
        private String usdtCode;

        @SerializedName("whatsapp")
        private String whatsapp;

        public boolean canEqual(Object obj) {
            return obj instanceof BankInfoDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BankInfoDTO)) {
                return false;
            }
            BankInfoDTO bankInfoDTO = (BankInfoDTO) obj;
            if (!bankInfoDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = bankInfoDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            Integer uid = getUid();
            Integer uid2 = bankInfoDTO.getUid();
            if (uid != null ? !uid.equals(uid2) : uid2 != null) {
                return false;
            }
            Integer type = getType();
            Integer type2 = bankInfoDTO.getType();
            if (type != null ? !type.equals(type2) : type2 != null) {
                return false;
            }
            Integer bindType = getBindType();
            Integer bindType2 = bankInfoDTO.getBindType();
            if (bindType != null ? !bindType.equals(bindType2) : bindType2 != null) {
                return false;
            }
            Integer addtime = getAddtime();
            Integer addtime2 = bankInfoDTO.getAddtime();
            if (addtime != null ? !addtime.equals(addtime2) : addtime2 != null) {
                return false;
            }
            Integer agentId = getAgentId();
            Integer agentId2 = bankInfoDTO.getAgentId();
            if (agentId != null ? !agentId.equals(agentId2) : agentId2 != null) {
                return false;
            }
            Integer status = getStatus();
            Integer status2 = bankInfoDTO.getStatus();
            if (status != null ? !status.equals(status2) : status2 != null) {
                return false;
            }
            String accountBank = getAccountBank();
            String accountBank2 = bankInfoDTO.getAccountBank();
            if (accountBank != null ? !accountBank.equals(accountBank2) : accountBank2 != null) {
                return false;
            }
            String branchBank = getBranchBank();
            String branchBank2 = bankInfoDTO.getBranchBank();
            if (branchBank != null ? !branchBank.equals(branchBank2) : branchBank2 != null) {
                return false;
            }
            String name = getName();
            String name2 = bankInfoDTO.getName();
            if (name != null ? !name.equals(name2) : name2 != null) {
                return false;
            }
            String account = getAccount();
            String account2 = bankInfoDTO.getAccount();
            if (account != null ? !account.equals(account2) : account2 != null) {
                return false;
            }
            String whatsapp = getWhatsapp();
            String whatsapp2 = bankInfoDTO.getWhatsapp();
            if (whatsapp != null ? !whatsapp.equals(whatsapp2) : whatsapp2 != null) {
                return false;
            }
            String usdtCode = getUsdtCode();
            String usdtCode2 = bankInfoDTO.getUsdtCode();
            if (usdtCode != null ? !usdtCode.equals(usdtCode2) : usdtCode2 != null) {
                return false;
            }
            String countryIso = getCountryIso();
            String countryIso2 = bankInfoDTO.getCountryIso();
            if (countryIso != null ? !countryIso.equals(countryIso2) : countryIso2 != null) {
                return false;
            }
            String mobile = getMobile();
            String mobile2 = bankInfoDTO.getMobile();
            if (mobile != null ? !mobile.equals(mobile2) : mobile2 != null) {
                return false;
            }
            String remark = getRemark();
            String remark2 = bankInfoDTO.getRemark();
            if (remark != null ? !remark.equals(remark2) : remark2 != null) {
                return false;
            }
            String upiId = getUpiId();
            String upiId2 = bankInfoDTO.getUpiId();
            return upiId != null ? upiId.equals(upiId2) : upiId2 == null;
        }

        public String getAccount() {
            return this.account;
        }

        public String getAccountBank() {
            return this.accountBank;
        }

        public Integer getAddtime() {
            return this.addtime;
        }

        public Integer getAgentId() {
            return this.agentId;
        }

        public Integer getBindType() {
            return this.bindType;
        }

        public String getBranchBank() {
            return this.branchBank;
        }

        public String getCountryIso() {
            return this.countryIso;
        }

        public Integer getId() {
            return this.f34923id;
        }

        public String getMobile() {
            return this.mobile;
        }

        public String getName() {
            return this.name;
        }

        public String getRemark() {
            return this.remark;
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

        public String getUpiId() {
            return this.upiId;
        }

        public String getUsdtCode() {
            return this.usdtCode;
        }

        public String getWhatsapp() {
            return this.whatsapp;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            Integer uid = getUid();
            int iHashCode2 = ((iHashCode + 59) * 59) + (uid == null ? 43 : uid.hashCode());
            Integer type = getType();
            int iHashCode3 = (iHashCode2 * 59) + (type == null ? 43 : type.hashCode());
            Integer bindType = getBindType();
            int iHashCode4 = (iHashCode3 * 59) + (bindType == null ? 43 : bindType.hashCode());
            Integer addtime = getAddtime();
            int iHashCode5 = (iHashCode4 * 59) + (addtime == null ? 43 : addtime.hashCode());
            Integer agentId = getAgentId();
            int iHashCode6 = (iHashCode5 * 59) + (agentId == null ? 43 : agentId.hashCode());
            Integer status = getStatus();
            int iHashCode7 = (iHashCode6 * 59) + (status == null ? 43 : status.hashCode());
            String accountBank = getAccountBank();
            int iHashCode8 = (iHashCode7 * 59) + (accountBank == null ? 43 : accountBank.hashCode());
            String branchBank = getBranchBank();
            int iHashCode9 = (iHashCode8 * 59) + (branchBank == null ? 43 : branchBank.hashCode());
            String name = getName();
            int iHashCode10 = (iHashCode9 * 59) + (name == null ? 43 : name.hashCode());
            String account = getAccount();
            int iHashCode11 = (iHashCode10 * 59) + (account == null ? 43 : account.hashCode());
            String whatsapp = getWhatsapp();
            int iHashCode12 = (iHashCode11 * 59) + (whatsapp == null ? 43 : whatsapp.hashCode());
            String usdtCode = getUsdtCode();
            int iHashCode13 = (iHashCode12 * 59) + (usdtCode == null ? 43 : usdtCode.hashCode());
            String countryIso = getCountryIso();
            int iHashCode14 = (iHashCode13 * 59) + (countryIso == null ? 43 : countryIso.hashCode());
            String mobile = getMobile();
            int iHashCode15 = (iHashCode14 * 59) + (mobile == null ? 43 : mobile.hashCode());
            String remark = getRemark();
            int iHashCode16 = (iHashCode15 * 59) + (remark == null ? 43 : remark.hashCode());
            String upiId = getUpiId();
            return (iHashCode16 * 59) + (upiId != null ? upiId.hashCode() : 43);
        }

        public void setAccount(String str) {
            this.account = str;
        }

        public void setAccountBank(String str) {
            this.accountBank = str;
        }

        public void setAddtime(Integer num) {
            this.addtime = num;
        }

        public void setAgentId(Integer num) {
            this.agentId = num;
        }

        public void setBindType(Integer num) {
            this.bindType = num;
        }

        public void setBranchBank(String str) {
            this.branchBank = str;
        }

        public void setCountryIso(String str) {
            this.countryIso = str;
        }

        public void setId(Integer num) {
            this.f34923id = num;
        }

        public void setMobile(String str) {
            this.mobile = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setRemark(String str) {
            this.remark = str;
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

        public void setUpiId(String str) {
            this.upiId = str;
        }

        public void setUsdtCode(String str) {
            this.usdtCode = str;
        }

        public void setWhatsapp(String str) {
            this.whatsapp = str;
        }

        public String toString() {
            return "WithdrawInfoBean.BankInfoDTO(id=" + getId() + ", uid=" + getUid() + ", type=" + getType() + ", bindType=" + getBindType() + ", accountBank=" + getAccountBank() + ", branchBank=" + getBranchBank() + ", name=" + getName() + ", account=" + getAccount() + ", addtime=" + getAddtime() + ", agentId=" + getAgentId() + ", whatsapp=" + getWhatsapp() + ", usdtCode=" + getUsdtCode() + ", countryIso=" + getCountryIso() + ", mobile=" + getMobile() + ", remark=" + getRemark() + ", upiId=" + getUpiId() + ", status=" + getStatus() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof WithdrawInfoBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WithdrawInfoBean)) {
            return false;
        }
        WithdrawInfoBean withdrawInfoBean = (WithdrawInfoBean) obj;
        if (!withdrawInfoBean.canEqual(this)) {
            return false;
        }
        Integer ticket = getTicket();
        Integer ticket2 = withdrawInfoBean.getTicket();
        if (ticket != null ? !ticket.equals(ticket2) : ticket2 != null) {
            return false;
        }
        Double withdrawMinDiamonds = getWithdrawMinDiamonds();
        Double withdrawMinDiamonds2 = withdrawInfoBean.getWithdrawMinDiamonds();
        if (withdrawMinDiamonds != null ? !withdrawMinDiamonds.equals(withdrawMinDiamonds2) : withdrawMinDiamonds2 != null) {
            return false;
        }
        Double withdrawDayMaxDiamonds = getWithdrawDayMaxDiamonds();
        Double withdrawDayMaxDiamonds2 = withdrawInfoBean.getWithdrawDayMaxDiamonds();
        if (withdrawDayMaxDiamonds != null ? !withdrawDayMaxDiamonds.equals(withdrawDayMaxDiamonds2) : withdrawDayMaxDiamonds2 != null) {
            return false;
        }
        Double withdrawFeeRateAgent = getWithdrawFeeRateAgent();
        Double withdrawFeeRateAgent2 = withdrawInfoBean.getWithdrawFeeRateAgent();
        if (withdrawFeeRateAgent != null ? !withdrawFeeRateAgent.equals(withdrawFeeRateAgent2) : withdrawFeeRateAgent2 != null) {
            return false;
        }
        Integer isBand = getIsBand();
        Integer isBand2 = withdrawInfoBean.getIsBand();
        if (isBand != null ? !isBand.equals(isBand2) : isBand2 != null) {
            return false;
        }
        Integer withdrawDays = getWithdrawDays();
        Integer withdrawDays2 = withdrawInfoBean.getWithdrawDays();
        if (withdrawDays != null ? !withdrawDays.equals(withdrawDays2) : withdrawDays2 != null) {
            return false;
        }
        String withdrawRate = getWithdrawRate();
        String withdrawRate2 = withdrawInfoBean.getWithdrawRate();
        if (withdrawRate != null ? !withdrawRate.equals(withdrawRate2) : withdrawRate2 != null) {
            return false;
        }
        String money = getMoney();
        String money2 = withdrawInfoBean.getMoney();
        if (money != null ? !money.equals(money2) : money2 != null) {
            return false;
        }
        String helpUrl = getHelpUrl();
        String helpUrl2 = withdrawInfoBean.getHelpUrl();
        if (helpUrl != null ? !helpUrl.equals(helpUrl2) : helpUrl2 != null) {
            return false;
        }
        String withdrawFeeRateOffical = getWithdrawFeeRateOffical();
        String withdrawFeeRateOffical2 = withdrawInfoBean.getWithdrawFeeRateOffical();
        if (withdrawFeeRateOffical != null ? !withdrawFeeRateOffical.equals(withdrawFeeRateOffical2) : withdrawFeeRateOffical2 != null) {
            return false;
        }
        List<AgentListDTO> agentList = getAgentList();
        List<AgentListDTO> agentList2 = withdrawInfoBean.getAgentList();
        if (agentList != null ? !agentList.equals(agentList2) : agentList2 != null) {
            return false;
        }
        BankInfoDTO bankInfo = getBankInfo();
        BankInfoDTO bankInfo2 = withdrawInfoBean.getBankInfo();
        if (bankInfo != null ? !bankInfo.equals(bankInfo2) : bankInfo2 != null) {
            return false;
        }
        BankInfoDTO officialInfo = getOfficialInfo();
        BankInfoDTO officialInfo2 = withdrawInfoBean.getOfficialInfo();
        if (officialInfo != null ? !officialInfo.equals(officialInfo2) : officialInfo2 != null) {
            return false;
        }
        AuthInfoDTO authInfo = getAuthInfo();
        AuthInfoDTO authInfo2 = withdrawInfoBean.getAuthInfo();
        if (authInfo != null ? !authInfo.equals(authInfo2) : authInfo2 != null) {
            return false;
        }
        AuthWithdrawDTO authWithdraw = getAuthWithdraw();
        AuthWithdrawDTO authWithdraw2 = withdrawInfoBean.getAuthWithdraw();
        return authWithdraw != null ? authWithdraw.equals(authWithdraw2) : authWithdraw2 == null;
    }

    public List<AgentListDTO> getAgentList() {
        return this.agentList;
    }

    public AuthInfoDTO getAuthInfo() {
        return this.authInfo;
    }

    public AuthWithdrawDTO getAuthWithdraw() {
        return this.authWithdraw;
    }

    public BankInfoDTO getBankInfo() {
        return this.bankInfo;
    }

    public String getHelpUrl() {
        return this.helpUrl;
    }

    public Integer getIsBand() {
        return this.isBand;
    }

    public String getMoney() {
        return this.money;
    }

    public BankInfoDTO getOfficialInfo() {
        return this.officialInfo;
    }

    public Integer getTicket() {
        return this.ticket;
    }

    public Double getWithdrawDayMaxDiamonds() {
        return this.withdrawDayMaxDiamonds;
    }

    public Integer getWithdrawDays() {
        return this.withdrawDays;
    }

    public Double getWithdrawFeeRateAgent() {
        return this.withdrawFeeRateAgent;
    }

    public String getWithdrawFeeRateOffical() {
        return this.withdrawFeeRateOffical;
    }

    public Double getWithdrawMinDiamonds() {
        return this.withdrawMinDiamonds;
    }

    public String getWithdrawRate() {
        return this.withdrawRate;
    }

    public int hashCode() {
        Integer ticket = getTicket();
        int iHashCode = ticket == null ? 43 : ticket.hashCode();
        Double withdrawMinDiamonds = getWithdrawMinDiamonds();
        int iHashCode2 = ((iHashCode + 59) * 59) + (withdrawMinDiamonds == null ? 43 : withdrawMinDiamonds.hashCode());
        Double withdrawDayMaxDiamonds = getWithdrawDayMaxDiamonds();
        int iHashCode3 = (iHashCode2 * 59) + (withdrawDayMaxDiamonds == null ? 43 : withdrawDayMaxDiamonds.hashCode());
        Double withdrawFeeRateAgent = getWithdrawFeeRateAgent();
        int iHashCode4 = (iHashCode3 * 59) + (withdrawFeeRateAgent == null ? 43 : withdrawFeeRateAgent.hashCode());
        Integer isBand = getIsBand();
        int iHashCode5 = (iHashCode4 * 59) + (isBand == null ? 43 : isBand.hashCode());
        Integer withdrawDays = getWithdrawDays();
        int iHashCode6 = (iHashCode5 * 59) + (withdrawDays == null ? 43 : withdrawDays.hashCode());
        String withdrawRate = getWithdrawRate();
        int iHashCode7 = (iHashCode6 * 59) + (withdrawRate == null ? 43 : withdrawRate.hashCode());
        String money = getMoney();
        int iHashCode8 = (iHashCode7 * 59) + (money == null ? 43 : money.hashCode());
        String helpUrl = getHelpUrl();
        int iHashCode9 = (iHashCode8 * 59) + (helpUrl == null ? 43 : helpUrl.hashCode());
        String withdrawFeeRateOffical = getWithdrawFeeRateOffical();
        int iHashCode10 = (iHashCode9 * 59) + (withdrawFeeRateOffical == null ? 43 : withdrawFeeRateOffical.hashCode());
        List<AgentListDTO> agentList = getAgentList();
        int iHashCode11 = (iHashCode10 * 59) + (agentList == null ? 43 : agentList.hashCode());
        BankInfoDTO bankInfo = getBankInfo();
        int iHashCode12 = (iHashCode11 * 59) + (bankInfo == null ? 43 : bankInfo.hashCode());
        BankInfoDTO officialInfo = getOfficialInfo();
        int iHashCode13 = (iHashCode12 * 59) + (officialInfo == null ? 43 : officialInfo.hashCode());
        AuthInfoDTO authInfo = getAuthInfo();
        int iHashCode14 = (iHashCode13 * 59) + (authInfo == null ? 43 : authInfo.hashCode());
        AuthWithdrawDTO authWithdraw = getAuthWithdraw();
        return (iHashCode14 * 59) + (authWithdraw != null ? authWithdraw.hashCode() : 43);
    }

    public void setAgentList(List<AgentListDTO> list) {
        this.agentList = list;
    }

    public void setAuthInfo(AuthInfoDTO authInfoDTO) {
        this.authInfo = authInfoDTO;
    }

    public void setAuthWithdraw(AuthWithdrawDTO authWithdrawDTO) {
        this.authWithdraw = authWithdrawDTO;
    }

    public void setBankInfo(BankInfoDTO bankInfoDTO) {
        this.bankInfo = bankInfoDTO;
    }

    public void setHelpUrl(String str) {
        this.helpUrl = str;
    }

    public void setIsBand(Integer num) {
        this.isBand = num;
    }

    public void setMoney(String str) {
        this.money = str;
    }

    public void setOfficialInfo(BankInfoDTO bankInfoDTO) {
        this.officialInfo = bankInfoDTO;
    }

    public void setTicket(Integer num) {
        this.ticket = num;
    }

    public void setWithdrawDayMaxDiamonds(Double d10) {
        this.withdrawDayMaxDiamonds = d10;
    }

    public void setWithdrawDays(Integer num) {
        this.withdrawDays = num;
    }

    public void setWithdrawFeeRateAgent(Double d10) {
        this.withdrawFeeRateAgent = d10;
    }

    public void setWithdrawFeeRateOffical(String str) {
        this.withdrawFeeRateOffical = str;
    }

    public void setWithdrawMinDiamonds(Double d10) {
        this.withdrawMinDiamonds = d10;
    }

    public void setWithdrawRate(String str) {
        this.withdrawRate = str;
    }

    public String toString() {
        return "WithdrawInfoBean(ticket=" + getTicket() + ", withdrawRate=" + getWithdrawRate() + ", money=" + getMoney() + ", helpUrl=" + getHelpUrl() + ", withdrawMinDiamonds=" + getWithdrawMinDiamonds() + ", withdrawDayMaxDiamonds=" + getWithdrawDayMaxDiamonds() + ", withdrawFeeRateOffical=" + getWithdrawFeeRateOffical() + ", withdrawFeeRateAgent=" + getWithdrawFeeRateAgent() + ", agentList=" + getAgentList() + ", isBand=" + getIsBand() + ", withdrawDays=" + getWithdrawDays() + ", bankInfo=" + getBankInfo() + ", officialInfo=" + getOfficialInfo() + ", authInfo=" + getAuthInfo() + ", authWithdraw=" + getAuthWithdraw() + ")";
    }
}
