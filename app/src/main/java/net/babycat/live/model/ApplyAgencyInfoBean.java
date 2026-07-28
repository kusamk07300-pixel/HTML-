package net.babycat.live.model;

import com.google.gson.annotations.SerializedName;
import g0.o0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ApplyAgencyInfoBean {

    @SerializedName("auth_idcard")
    private String authIdcard;

    @SerializedName("auth_img")
    private String authImg;

    @SerializedName("auth_img2")
    private String authImg2;

    @SerializedName("auth_img3")
    private String authImg3;

    @SerializedName("auth_name")
    private String authName;

    @SerializedName("bm_list")
    private List<BmListDTO> bmList;

    @SerializedName("country_iso")
    private String countryIso;

    @SerializedName("create_time")
    private String createTime;

    @SerializedName("email")
    private String email;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Integer f34803id;

    @SerializedName("mobile")
    private String mobile;

    @SerializedName("name")
    private String name;

    @SerializedName("own_adminid")
    private Integer ownAdminid;

    @SerializedName("own_uid")
    private Integer ownUid;

    @SerializedName("remark")
    private String remark;

    @SerializedName(o0.CATEGORY_STATUS)
    private Integer status;

    @SerializedName("update_time")
    private String updateTime;

    @SerializedName("whatsapp_link")
    private String whatsappLink;

    public static class BmListDTO {

        @SerializedName("nickname")
        private String hadLimit;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        @SerializedName("id")
        private Integer f34804id;

        public boolean canEqual(Object obj) {
            return obj instanceof BmListDTO;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BmListDTO)) {
                return false;
            }
            BmListDTO bmListDTO = (BmListDTO) obj;
            if (!bmListDTO.canEqual(this)) {
                return false;
            }
            Integer id2 = getId();
            Integer id3 = bmListDTO.getId();
            if (id2 != null ? !id2.equals(id3) : id3 != null) {
                return false;
            }
            String hadLimit = getHadLimit();
            String hadLimit2 = bmListDTO.getHadLimit();
            return hadLimit != null ? hadLimit.equals(hadLimit2) : hadLimit2 == null;
        }

        public String getHadLimit() {
            return this.hadLimit;
        }

        public Integer getId() {
            return this.f34804id;
        }

        public int hashCode() {
            Integer id2 = getId();
            int iHashCode = id2 == null ? 43 : id2.hashCode();
            String hadLimit = getHadLimit();
            return ((iHashCode + 59) * 59) + (hadLimit != null ? hadLimit.hashCode() : 43);
        }

        public void setHadLimit(String str) {
            this.hadLimit = str;
        }

        public void setId(Integer num) {
            this.f34804id = num;
        }

        public String toString() {
            return "ApplyAgencyInfoBean.BmListDTO(id=" + getId() + ", hadLimit=" + getHadLimit() + ")";
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof ApplyAgencyInfoBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApplyAgencyInfoBean)) {
            return false;
        }
        ApplyAgencyInfoBean applyAgencyInfoBean = (ApplyAgencyInfoBean) obj;
        if (!applyAgencyInfoBean.canEqual(this)) {
            return false;
        }
        Integer id2 = getId();
        Integer id3 = applyAgencyInfoBean.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        Integer ownUid = getOwnUid();
        Integer ownUid2 = applyAgencyInfoBean.getOwnUid();
        if (ownUid != null ? !ownUid.equals(ownUid2) : ownUid2 != null) {
            return false;
        }
        Integer ownAdminid = getOwnAdminid();
        Integer ownAdminid2 = applyAgencyInfoBean.getOwnAdminid();
        if (ownAdminid != null ? !ownAdminid.equals(ownAdminid2) : ownAdminid2 != null) {
            return false;
        }
        Integer status = getStatus();
        Integer status2 = applyAgencyInfoBean.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        String name = getName();
        String name2 = applyAgencyInfoBean.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String createTime = getCreateTime();
        String createTime2 = applyAgencyInfoBean.getCreateTime();
        if (createTime != null ? !createTime.equals(createTime2) : createTime2 != null) {
            return false;
        }
        String updateTime = getUpdateTime();
        String updateTime2 = applyAgencyInfoBean.getUpdateTime();
        if (updateTime != null ? !updateTime.equals(updateTime2) : updateTime2 != null) {
            return false;
        }
        String authIdcard = getAuthIdcard();
        String authIdcard2 = applyAgencyInfoBean.getAuthIdcard();
        if (authIdcard != null ? !authIdcard.equals(authIdcard2) : authIdcard2 != null) {
            return false;
        }
        String authName = getAuthName();
        String authName2 = applyAgencyInfoBean.getAuthName();
        if (authName != null ? !authName.equals(authName2) : authName2 != null) {
            return false;
        }
        String authImg = getAuthImg();
        String authImg2 = applyAgencyInfoBean.getAuthImg();
        if (authImg != null ? !authImg.equals(authImg2) : authImg2 != null) {
            return false;
        }
        String authImg22 = getAuthImg2();
        String authImg23 = applyAgencyInfoBean.getAuthImg2();
        if (authImg22 != null ? !authImg22.equals(authImg23) : authImg23 != null) {
            return false;
        }
        String authImg3 = getAuthImg3();
        String authImg32 = applyAgencyInfoBean.getAuthImg3();
        if (authImg3 != null ? !authImg3.equals(authImg32) : authImg32 != null) {
            return false;
        }
        String countryIso = getCountryIso();
        String countryIso2 = applyAgencyInfoBean.getCountryIso();
        if (countryIso != null ? !countryIso.equals(countryIso2) : countryIso2 != null) {
            return false;
        }
        String mobile = getMobile();
        String mobile2 = applyAgencyInfoBean.getMobile();
        if (mobile != null ? !mobile.equals(mobile2) : mobile2 != null) {
            return false;
        }
        String email = getEmail();
        String email2 = applyAgencyInfoBean.getEmail();
        if (email != null ? !email.equals(email2) : email2 != null) {
            return false;
        }
        String whatsappLink = getWhatsappLink();
        String whatsappLink2 = applyAgencyInfoBean.getWhatsappLink();
        if (whatsappLink != null ? !whatsappLink.equals(whatsappLink2) : whatsappLink2 != null) {
            return false;
        }
        String remark = getRemark();
        String remark2 = applyAgencyInfoBean.getRemark();
        if (remark != null ? !remark.equals(remark2) : remark2 != null) {
            return false;
        }
        List<BmListDTO> bmList = getBmList();
        List<BmListDTO> bmList2 = applyAgencyInfoBean.getBmList();
        return bmList != null ? bmList.equals(bmList2) : bmList2 == null;
    }

    public String getAuthIdcard() {
        return this.authIdcard;
    }

    public String getAuthImg() {
        return this.authImg;
    }

    public String getAuthImg2() {
        return this.authImg2;
    }

    public String getAuthImg3() {
        return this.authImg3;
    }

    public String getAuthName() {
        return this.authName;
    }

    public List<BmListDTO> getBmList() {
        return this.bmList;
    }

    public String getCountryIso() {
        return this.countryIso;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getEmail() {
        return this.email;
    }

    public Integer getId() {
        return this.f34803id;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getName() {
        return this.name;
    }

    public Integer getOwnAdminid() {
        return this.ownAdminid;
    }

    public Integer getOwnUid() {
        return this.ownUid;
    }

    public String getRemark() {
        return this.remark;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public String getWhatsappLink() {
        return this.whatsappLink;
    }

    public int hashCode() {
        Integer id2 = getId();
        int iHashCode = id2 == null ? 43 : id2.hashCode();
        Integer ownUid = getOwnUid();
        int iHashCode2 = ((iHashCode + 59) * 59) + (ownUid == null ? 43 : ownUid.hashCode());
        Integer ownAdminid = getOwnAdminid();
        int iHashCode3 = (iHashCode2 * 59) + (ownAdminid == null ? 43 : ownAdminid.hashCode());
        Integer status = getStatus();
        int iHashCode4 = (iHashCode3 * 59) + (status == null ? 43 : status.hashCode());
        String name = getName();
        int iHashCode5 = (iHashCode4 * 59) + (name == null ? 43 : name.hashCode());
        String createTime = getCreateTime();
        int iHashCode6 = (iHashCode5 * 59) + (createTime == null ? 43 : createTime.hashCode());
        String updateTime = getUpdateTime();
        int iHashCode7 = (iHashCode6 * 59) + (updateTime == null ? 43 : updateTime.hashCode());
        String authIdcard = getAuthIdcard();
        int iHashCode8 = (iHashCode7 * 59) + (authIdcard == null ? 43 : authIdcard.hashCode());
        String authName = getAuthName();
        int iHashCode9 = (iHashCode8 * 59) + (authName == null ? 43 : authName.hashCode());
        String authImg = getAuthImg();
        int iHashCode10 = (iHashCode9 * 59) + (authImg == null ? 43 : authImg.hashCode());
        String authImg2 = getAuthImg2();
        int iHashCode11 = (iHashCode10 * 59) + (authImg2 == null ? 43 : authImg2.hashCode());
        String authImg3 = getAuthImg3();
        int iHashCode12 = (iHashCode11 * 59) + (authImg3 == null ? 43 : authImg3.hashCode());
        String countryIso = getCountryIso();
        int iHashCode13 = (iHashCode12 * 59) + (countryIso == null ? 43 : countryIso.hashCode());
        String mobile = getMobile();
        int iHashCode14 = (iHashCode13 * 59) + (mobile == null ? 43 : mobile.hashCode());
        String email = getEmail();
        int iHashCode15 = (iHashCode14 * 59) + (email == null ? 43 : email.hashCode());
        String whatsappLink = getWhatsappLink();
        int iHashCode16 = (iHashCode15 * 59) + (whatsappLink == null ? 43 : whatsappLink.hashCode());
        String remark = getRemark();
        int iHashCode17 = (iHashCode16 * 59) + (remark == null ? 43 : remark.hashCode());
        List<BmListDTO> bmList = getBmList();
        return (iHashCode17 * 59) + (bmList != null ? bmList.hashCode() : 43);
    }

    public void setAuthIdcard(String str) {
        this.authIdcard = str;
    }

    public void setAuthImg(String str) {
        this.authImg = str;
    }

    public void setAuthImg2(String str) {
        this.authImg2 = str;
    }

    public void setAuthImg3(String str) {
        this.authImg3 = str;
    }

    public void setAuthName(String str) {
        this.authName = str;
    }

    public void setBmList(List<BmListDTO> list) {
        this.bmList = list;
    }

    public void setCountryIso(String str) {
        this.countryIso = str;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setId(Integer num) {
        this.f34803id = num;
    }

    public void setMobile(String str) {
        this.mobile = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOwnAdminid(Integer num) {
        this.ownAdminid = num;
    }

    public void setOwnUid(Integer num) {
        this.ownUid = num;
    }

    public void setRemark(String str) {
        this.remark = str;
    }

    public void setStatus(Integer num) {
        this.status = num;
    }

    public void setUpdateTime(String str) {
        this.updateTime = str;
    }

    public void setWhatsappLink(String str) {
        this.whatsappLink = str;
    }

    public String toString() {
        return "ApplyAgencyInfoBean(id=" + getId() + ", ownUid=" + getOwnUid() + ", name=" + getName() + ", createTime=" + getCreateTime() + ", updateTime=" + getUpdateTime() + ", authIdcard=" + getAuthIdcard() + ", authName=" + getAuthName() + ", authImg=" + getAuthImg() + ", authImg2=" + getAuthImg2() + ", authImg3=" + getAuthImg3() + ", ownAdminid=" + getOwnAdminid() + ", countryIso=" + getCountryIso() + ", mobile=" + getMobile() + ", email=" + getEmail() + ", whatsappLink=" + getWhatsappLink() + ", status=" + getStatus() + ", remark=" + getRemark() + ", bmList=" + getBmList() + ")";
    }
}
