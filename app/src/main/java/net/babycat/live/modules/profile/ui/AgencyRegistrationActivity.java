package net.babycat.live.modules.profile.ui;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.e;
import cf.g;
import com.luck.picture.lib.basic.PictureSelector;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.interfaces.OnResultCallbackListener;
import com.rilixtech.widget.countrycodepicker.CountryCodePicker;
import em.a;
import java.util.ArrayList;
import net.babycat.live.model.ApplyAgencyInfoBean;
import net.babycat.live.model.StsBean;
import net.babycat.live.model.UserInfoDataBean;
import net.babycat.live.modules.creator.ui.MyAgencyActivity;
import net.babycat.live.platform.util.h2;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.GlideEngine;
import net.babycat.live.platform.widget.view.Topbar;
import org.litepal.LitePal;
import qmyy.babycat.live.R;
import wn.h;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class AgencyRegistrationActivity extends in.b<jm.a> implements a.b {
    public CountryCodePicker mCcp;
    public Topbar mCommonTopbar;
    public EditText mEdEmail;
    public EditText mEdGuild;
    public TextView mEdId;
    public EditText mEdIdCardNumber;
    public EditText mEdName;
    public EditText mEdTelegram;
    public ImageView mIvBack;
    public ImageView mIvFront;
    public ImageView mIvHand;
    public ImageView mIvRead;
    public LinearLayout mLinCheckbox;
    public RelativeLayout mReBmCode;
    public RelativeLayout mReCountry;
    public TextView mTvBmCode;
    public TextView mTvCountry;
    public TextView mTvRemark;
    public TextView mTvSubmit;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public UserInfoDataBean f35408o;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ApplyAgencyInfoBean f35415v;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f35407n = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f35409p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f35410q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f35411r = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f35412s = "";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f35413t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String[] f35414u = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f35416w = 1;

    public class a implements OnResultCallbackListener<LocalMedia> {
        public a() {
        }

        @Override // com.luck.picture.lib.interfaces.OnResultCallbackListener
        public void onCancel() {
        }

        @Override // com.luck.picture.lib.interfaces.OnResultCallbackListener
        public void onResult(ArrayList<LocalMedia> arrayList) {
            wo.b.b("选择照片地址--" + arrayList.get(0).getPath(), new Object[0]);
            if (arrayList.size() != 0) {
                AgencyRegistrationActivity agencyRegistrationActivity = AgencyRegistrationActivity.this;
                agencyRegistrationActivity.l2(agencyRegistrationActivity.getString(R.string.uploading));
                if (arrayList.get(0).isCompressed()) {
                    ((jm.a) AgencyRegistrationActivity.this.f27702e).d(arrayList.get(0).getCompressPath());
                } else {
                    if (!arrayList.get(0).getPath().contains("content://")) {
                        ((jm.a) AgencyRegistrationActivity.this.f27702e).d(arrayList.get(0).getPath());
                        return;
                    }
                    ((jm.a) AgencyRegistrationActivity.this.f27702e).d(t.K(AgencyRegistrationActivity.this.getApplicationContext(), Uri.parse(arrayList.get(0).getPath())));
                }
            }
        }
    }

    public class b implements h2.b {
        public b() {
        }

        @Override // net.babycat.live.platform.util.h2.b
        public void a(int i10) {
            wo.b.b("上传图片中：" + i10, new Object[0]);
        }

        @Override // net.babycat.live.platform.util.h2.b
        public void b(String str) {
            wo.b.b("上传图片失败：" + str, new Object[0]);
            AgencyRegistrationActivity.this.k3();
        }

        @Override // net.babycat.live.platform.util.h2.b
        public void c(String str, int i10) {
            wo.b.b("上传图片：" + str, new Object[0]);
            ((jm.a) AgencyRegistrationActivity.this.f27702e).c(str);
        }
    }

    public class c implements CountryCodePicker.b {
        public c() {
        }

        @Override // com.rilixtech.widget.countrycodepicker.CountryCodePicker.b
        public void a(bg.b bVar) {
            AgencyRegistrationActivity.this.f35409p = bVar.a();
            AgencyRegistrationActivity.this.mTvCountry.setText(bVar.b());
        }
    }

    public class d implements g {
        public d() {
        }

        @Override // cf.g
        public void a(int i10, String str) {
            AgencyRegistrationActivity.this.mTvBmCode.setText(str);
            AgencyRegistrationActivity agencyRegistrationActivity = AgencyRegistrationActivity.this;
            agencyRegistrationActivity.f35413t = agencyRegistrationActivity.f35415v.getBmList().get(i10).getId().intValue();
        }
    }

    private void F5() {
        if (!TextUtils.isEmpty(this.f35409p)) {
            this.mCcp.setCountryForNameCode(this.f35409p);
        }
        this.mCcp.setOnCountryChangeListener(new c());
        this.mCcp.setDefaultCountryUsingNameCode(getResources().getConfiguration().locale.getCountry());
    }

    public void A5() {
        PictureSelector.create((e) this).openGallery(SelectMimeType.ofImage()).setImageEngine(GlideEngine.createGlideEngine()).setCompressEngine(new h()).setMaxSelectNum(1).setMinSelectNum(1).isPreviewImage(true).forResult(new a());
    }

    @Override // em.a.b
    public void H1(ApplyAgencyInfoBean applyAgencyInfoBean) {
        this.f35415v = applyAgencyInfoBean;
        int iIntValue = applyAgencyInfoBean.getStatus().intValue();
        if (iIntValue == 0) {
            this.mTvSubmit.setText(getString(R.string.in_review));
            t.T0(this.mTvSubmit, false);
            t.T0(this.mEdName, false);
            t.T0(this.mEdGuild, false);
            t.T0(this.mCcp, false);
            t.T0(this.mEdEmail, false);
            t.T0(this.mEdTelegram, false);
            t.T0(this.mEdIdCardNumber, false);
            t.T0(this.mIvFront, false);
            t.T0(this.mIvBack, false);
            t.T0(this.mIvHand, false);
            t.T0(this.mReBmCode, false);
            this.f35407n = true;
            this.mIvRead.setImageResource(R.mipmap.iv_image_chosen);
        } else if (iIntValue == 1) {
            o5(MyAgencyActivity.class);
            finish();
        }
        this.f35414u = new String[applyAgencyInfoBean.getBmList().size()];
        for (int i10 = 0; i10 < applyAgencyInfoBean.getBmList().size(); i10++) {
            this.f35414u[i10] = applyAgencyInfoBean.getBmList().get(i10).getHadLimit();
            if (applyAgencyInfoBean.getBmList().get(i10).getId().equals(applyAgencyInfoBean.getOwnAdminid())) {
                this.mTvBmCode.setText(applyAgencyInfoBean.getBmList().get(i10).getHadLimit());
            }
        }
        this.mEdGuild.setText(applyAgencyInfoBean.getName());
        this.mEdName.setText(applyAgencyInfoBean.getAuthName());
        this.mEdEmail.setText(applyAgencyInfoBean.getEmail());
        this.mEdIdCardNumber.setText(applyAgencyInfoBean.getAuthIdcard());
        this.mEdTelegram.setText(applyAgencyInfoBean.getWhatsappLink());
        this.mTvRemark.setText(applyAgencyInfoBean.getRemark());
        this.f35413t = applyAgencyInfoBean.getOwnAdminid().intValue();
        if (!TextUtils.isEmpty(applyAgencyInfoBean.getAuthImg())) {
            wn.d.c(this, applyAgencyInfoBean.getAuthImg(), this.mIvFront);
            this.f35410q = applyAgencyInfoBean.getAuthImg();
        }
        if (!TextUtils.isEmpty(applyAgencyInfoBean.getAuthImg2())) {
            wn.d.c(this, applyAgencyInfoBean.getAuthImg2(), this.mIvBack);
            this.f35411r = applyAgencyInfoBean.getAuthImg2();
        }
        if (!TextUtils.isEmpty(applyAgencyInfoBean.getAuthImg3())) {
            wn.d.c(this, applyAgencyInfoBean.getAuthImg3(), this.mIvHand);
            this.f35412s = applyAgencyInfoBean.getAuthImg3();
        }
        String countryIso = !TextUtils.isEmpty(applyAgencyInfoBean.getCountryIso()) ? applyAgencyInfoBean.getCountryIso() : this.f35408o.getCountry_iso();
        this.f35409p = countryIso;
        if (!TextUtils.isEmpty(countryIso)) {
            this.mTvCountry.setText(t.v(this, this.f35409p).b());
        }
        F5();
        k3();
    }

    @Override // em.a.b
    public void H3() {
        k3();
        finish();
    }

    @Override // em.a.b
    public void a4() {
        k3();
        finish();
    }

    @Override // em.a.b
    public void b() {
        k3();
    }

    @Override // em.a.b
    public void c(String str) {
        int i10 = this.f35416w;
        if (i10 == 1) {
            this.f35410q = str;
            wn.d.c(getApplicationContext(), this.f35410q, this.mIvFront);
        } else if (i10 == 2) {
            this.f35411r = str;
            wn.d.c(getApplicationContext(), this.f35411r, this.mIvBack);
        } else if (i10 == 3) {
            this.f35412s = str;
            wn.d.c(getApplicationContext(), this.f35412s, this.mIvHand);
        }
        k3();
    }

    @Override // em.a.b
    public void d(StsBean stsBean, String str) {
        h2.a().c(this, this.f35408o.getUserId().intValue(), stsBean, str, 0, new b());
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_agency_registration;
    }

    @Override // in.a
    public void g5() {
        this.mCommonTopbar = (Topbar) findViewById(R.id.common_topbar);
        this.mEdId = (TextView) findViewById(R.id.ed_id);
        this.mEdName = (EditText) findViewById(R.id.ed_name);
        this.mEdTelegram = (EditText) findViewById(R.id.ed_telegram);
        this.mEdGuild = (EditText) findViewById(R.id.ed_guild);
        this.mTvCountry = (TextView) findViewById(R.id.tv_country);
        this.mReCountry = (RelativeLayout) findViewById(R.id.re_country);
        this.mEdEmail = (EditText) findViewById(R.id.ed_email);
        this.mEdIdCardNumber = (EditText) findViewById(R.id.ed_id_card_number);
        this.mIvFront = (ImageView) findViewById(R.id.iv_front);
        this.mIvBack = (ImageView) findViewById(R.id.iv_back);
        this.mIvHand = (ImageView) findViewById(R.id.iv_hand);
        this.mTvBmCode = (TextView) findViewById(R.id.tv_bm_code);
        this.mReBmCode = (RelativeLayout) findViewById(R.id.re_bm_code);
        this.mIvRead = (ImageView) findViewById(R.id.iv_read);
        this.mLinCheckbox = (LinearLayout) findViewById(R.id.lin_checkbox);
        this.mTvSubmit = (TextView) findViewById(R.id.tv_submit);
        this.mCcp = (CountryCodePicker) findViewById(R.id.ccp);
        this.mTvRemark = (TextView) findViewById(R.id.tv_remark);
        this.mReCountry.setOnClickListener(this);
        this.mIvFront.setOnClickListener(this);
        this.mIvBack.setOnClickListener(this);
        this.mIvHand.setOnClickListener(this);
        this.mReBmCode.setOnClickListener(this);
        this.mLinCheckbox.setOnClickListener(this);
        this.mTvSubmit.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.mCommonTopbar, getString(R.string.agency_registration_form));
        UserInfoDataBean userInfoDataBean = (UserInfoDataBean) LitePal.findFirst(UserInfoDataBean.class, true);
        this.f35408o = userInfoDataBean;
        this.mEdId.setText(String.valueOf(userInfoDataBean.getUserId()));
        if (!t.x0()) {
            u5();
        } else {
            l2("");
            ((jm.a) this.f27702e).A0();
        }
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back /* 2131362906 */:
                this.f35416w = 2;
                A5();
                break;
            case R.id.iv_front /* 2131362951 */:
                this.f35416w = 1;
                A5();
                break;
            case R.id.iv_hand /* 2131362958 */:
                this.f35416w = 3;
                A5();
                break;
            case R.id.lin_checkbox /* 2131363133 */:
                boolean z10 = this.f35407n;
                this.f35407n = !z10;
                this.mIvRead.setImageResource(!z10 ? R.mipmap.iv_image_chosen : R.mipmap.iv_not);
                break;
            case R.id.re_bm_code /* 2131363684 */:
                if (t.t0() && this.f35414u != null) {
                    new b.C0752b(this).f(getString(R.string.select), this.f35414u, new d()).N();
                    break;
                }
                break;
            case R.id.re_country /* 2131363688 */:
                t.t0();
                break;
            case R.id.tv_submit /* 2131364610 */:
                if (TextUtils.isEmpty(this.mEdGuild.getText().toString())) {
                    v5(getString(R.string.please_enter_the_agency_name));
                } else if (TextUtils.isEmpty(this.mEdName.getText().toString())) {
                    v5(getString(R.string.please_enter_your_real_name));
                } else if (TextUtils.isEmpty(this.mTvCountry.getText().toString())) {
                    v5(getString(R.string.please_complete_your_country));
                } else if (TextUtils.isEmpty(this.mEdEmail.getText().toString())) {
                    v5(getString(R.string.Please_upload_your_Email));
                } else if (TextUtils.isEmpty(this.mEdTelegram.getText().toString())) {
                    v5(getString(R.string.enter_your_telegram_link));
                } else if (TextUtils.isEmpty(this.mEdIdCardNumber.getText().toString())) {
                    v5(getString(R.string.enter_your_id_card_number));
                } else if (TextUtils.isEmpty(this.f35410q)) {
                    v5(getString(R.string.please_upload_the_front_of_your_id_card));
                } else if (TextUtils.isEmpty(this.f35411r)) {
                    v5(getString(R.string.please_upload_the_back_of_your_id_card));
                } else if (TextUtils.isEmpty(this.f35412s)) {
                    v5(getString(R.string.please_upload_a_selfie_with_your_id_card_in_hand));
                } else if (TextUtils.isEmpty(this.mTvBmCode.getText().toString())) {
                    v5(getString(R.string.please_select_your_bm_code));
                } else if (!this.f35407n) {
                    v5("Please agree to the policy");
                } else {
                    ((jm.a) this.f27702e).D5(this.mEdGuild.getText().toString(), this.mEdName.getText().toString(), this.mEdIdCardNumber.getText().toString(), this.mEdEmail.getText().toString(), this.f35409p, this.f35410q, this.f35411r, this.f35412s, this.f35413t, this.mEdTelegram.getText().toString());
                }
                break;
        }
    }
}
