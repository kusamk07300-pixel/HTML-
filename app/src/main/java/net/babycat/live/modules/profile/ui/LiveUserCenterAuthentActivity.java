package net.babycat.live.modules.profile.ui;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.e;
import com.luck.picture.lib.basic.PictureSelector;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.interfaces.OnResultCallbackListener;
import com.rilixtech.widget.countrycodepicker.CountryCodePicker;
import em.s;
import java.util.ArrayList;
import jm.q0;
import net.babycat.live.model.AnchorVerifyBean;
import net.babycat.live.model.InitBean;
import net.babycat.live.model.StsBean;
import net.babycat.live.model.UserInfoDataBean;
import net.babycat.live.platform.util.h2;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.GlideEngine;
import net.babycat.live.platform.widget.view.Topbar;
import net.babycat.live.platform.widget.view.TypeRadioGroup;
import org.litepal.LitePal;
import qmyy.babycat.live.R;
import wn.h;

/* JADX INFO: loaded from: classes4.dex */
public class LiveUserCenterAuthentActivity extends in.b<q0> implements s.b {
    public CountryCodePicker mCcp;
    public Topbar mCommonTopbar;
    public EditText mEdAgcency;
    public TextView mEdBreenId;
    public EditText mEdDocuments;
    public EditText mEdEmail;
    public TextView mEdGender;
    public EditText mEdPhone;
    public EditText mEdRalName;
    public ImageView mIvAdd;
    public TextView mTvAgcency;
    public TextView mTvSubmit;
    public TypeRadioGroup mTypeRadioGroup;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public UserInfoDataBean f35600n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f35601o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f35602p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InitBean f35603q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AnchorVerifyBean f35604r;

    public class a implements TypeRadioGroup.OnclickListener {
        public a() {
        }

        @Override // net.babycat.live.platform.widget.view.TypeRadioGroup.OnclickListener
        public void OnText(String str) {
            LiveUserCenterAuthentActivity.this.f35602p = str;
        }
    }

    public class b implements OnResultCallbackListener<LocalMedia> {
        public b() {
        }

        @Override // com.luck.picture.lib.interfaces.OnResultCallbackListener
        public void onCancel() {
        }

        @Override // com.luck.picture.lib.interfaces.OnResultCallbackListener
        public void onResult(ArrayList<LocalMedia> arrayList) {
            wo.b.b("选择照片地址--" + arrayList.get(0).getPath(), new Object[0]);
            if (arrayList.size() != 0) {
                LiveUserCenterAuthentActivity liveUserCenterAuthentActivity = LiveUserCenterAuthentActivity.this;
                liveUserCenterAuthentActivity.l2(liveUserCenterAuthentActivity.getString(R.string.uploading));
                if (arrayList.get(0).isCompressed()) {
                    ((q0) LiveUserCenterAuthentActivity.this.f27702e).d(arrayList.get(0).getCompressPath());
                } else {
                    if (!arrayList.get(0).getPath().contains("content://")) {
                        ((q0) LiveUserCenterAuthentActivity.this.f27702e).d(arrayList.get(0).getPath());
                        return;
                    }
                    ((q0) LiveUserCenterAuthentActivity.this.f27702e).d(t.K(LiveUserCenterAuthentActivity.this.getApplicationContext(), Uri.parse(arrayList.get(0).getPath())));
                }
            }
        }
    }

    public class c implements h2.b {
        public c() {
        }

        @Override // net.babycat.live.platform.util.h2.b
        public void a(int i10) {
            wo.b.b("上传图片中：" + i10, new Object[0]);
        }

        @Override // net.babycat.live.platform.util.h2.b
        public void b(String str) {
            wo.b.b("上传图片失败：" + str, new Object[0]);
            LiveUserCenterAuthentActivity.this.k3();
        }

        @Override // net.babycat.live.platform.util.h2.b
        public void c(String str, int i10) {
            wo.b.b("上传图片：" + str, new Object[0]);
            ((q0) LiveUserCenterAuthentActivity.this.f27702e).c(str);
        }
    }

    private void D5() {
        this.mCcp.y(this.mEdPhone);
        this.mCcp.setOnCountryChangeListener(new d());
        this.mCcp.setDefaultCountryUsingNameCode(getResources().getConfiguration().locale.getCountry());
    }

    private void initData() {
        this.mTypeRadioGroup.setListener(new a());
        this.mTvAgcency.setVisibility(8);
        this.mEdAgcency.setVisibility(8);
    }

    public final void E5(boolean z10) {
        this.mEdDocuments.setClickable(z10);
        this.mEdAgcency.setClickable(z10);
        this.mEdPhone.setClickable(z10);
        this.mEdDocuments.setFocusable(z10);
        this.mEdDocuments.setEnabled(z10);
        this.mEdAgcency.setFocusable(z10);
        this.mEdAgcency.setEnabled(z10);
        this.mEdPhone.setFocusable(z10);
        this.mEdPhone.setEnabled(z10);
        this.mEdRalName.setFocusable(z10);
        this.mEdRalName.setEnabled(z10);
    }

    @Override // em.s.b
    public void b() {
        k3();
    }

    @Override // em.s.b
    public void c(String str) {
        this.f35601o = str;
        wn.d.c(getApplicationContext(), this.f35601o, this.mIvAdd);
        k3();
    }

    @Override // em.s.b
    public void d(StsBean stsBean, String str) {
        h2.a().c(this, this.f35600n.getUserId().intValue(), stsBean, str, 0, new c());
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_center_authent;
    }

    @Override // in.a
    public void g5() {
        this.mCommonTopbar = (Topbar) findViewById(R.id.common_topbar);
        this.mEdBreenId = (TextView) findViewById(R.id.ed_breen_id);
        this.mEdRalName = (EditText) findViewById(R.id.ed_ral_name);
        this.mEdGender = (TextView) findViewById(R.id.ed_gender);
        this.mTypeRadioGroup = (TypeRadioGroup) findViewById(R.id.type_radio_group);
        this.mEdDocuments = (EditText) findViewById(R.id.ed_documents);
        this.mIvAdd = (ImageView) findViewById(R.id.iv_add);
        this.mEdAgcency = (EditText) findViewById(R.id.ed_agcency);
        this.mEdEmail = (EditText) findViewById(R.id.ed_email);
        this.mCcp = (CountryCodePicker) findViewById(R.id.ccp);
        this.mEdPhone = (EditText) findViewById(R.id.ed_phone);
        this.mTvSubmit = (TextView) findViewById(R.id.tv_submit);
        this.mTvAgcency = (TextView) findViewById(R.id.tv_agcency);
        this.mIvAdd.setOnClickListener(this);
        this.mTvSubmit.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        t.S0(this.f27688a, this.mCommonTopbar, getString(R.string.certified));
        this.f35600n = (UserInfoDataBean) LitePal.findFirst(UserInfoDataBean.class);
        this.f35603q = (InitBean) LitePal.findFirst(InitBean.class, true);
        initData();
        D5();
        ((q0) this.f27702e).y();
    }

    @Override // em.s.b
    public void i0(AnchorVerifyBean anchorVerifyBean) {
        this.f35604r = anchorVerifyBean;
        int i10 = Integer.parseInt(anchorVerifyBean.getIsAuth());
        if (i10 == 0) {
            E5(true);
        } else if (i10 == 1 || i10 == 2) {
            E5(false);
        } else if (i10 == 3) {
            E5(true);
        }
        if (!TextUtils.isEmpty(anchorVerifyBean.getAuthImg())) {
            wn.d.c(this, anchorVerifyBean.getAuthImg(), this.mIvAdd);
        }
        this.f35601o = anchorVerifyBean.getAuthImg();
        this.mEdRalName.setText(anchorVerifyBean.getUsername());
        this.mEdBreenId.setText(anchorVerifyBean.getUid());
        int i11 = Integer.parseInt(anchorVerifyBean.getSex());
        if (i11 == 1) {
            this.mEdGender.setText(getString(R.string.male));
        } else if (i11 == 2) {
            this.mEdGender.setText(getString(R.string.female));
        } else {
            this.mEdGender.setText(getString(R.string.unknown));
        }
        this.mEdDocuments.setText(anchorVerifyBean.getAuthIdcard());
        this.mEdEmail.setText(anchorVerifyBean.getEmail());
        if (!TextUtils.isEmpty(anchorVerifyBean.getEmail())) {
            this.mEdEmail.setClickable(false);
            this.mEdEmail.setFocusable(false);
            this.mEdEmail.setEnabled(false);
        }
        this.mEdPhone.setText(anchorVerifyBean.getMobile());
        if (!TextUtils.isEmpty(anchorVerifyBean.getCountryIso())) {
            this.mCcp.setCountryForNameCode(anchorVerifyBean.getCountryIso());
        }
        if (anchorVerifyBean.getIsSave().intValue() == 0) {
            this.mTvSubmit.setVisibility(8);
        }
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.iv_add) {
            AnchorVerifyBean anchorVerifyBean = this.f35604r;
            if (anchorVerifyBean == null || TextUtils.isEmpty(anchorVerifyBean.getAuthImg()) || this.f35604r.getIsSave().intValue() != 0) {
                y5();
                return;
            }
            return;
        }
        if (id2 != R.id.tv_submit) {
            return;
        }
        if (TextUtils.isEmpty(this.mEdRalName.getText().toString())) {
            v5(getString(R.string.please_enter_your_real_name));
            return;
        }
        if (TextUtils.isEmpty(this.mEdDocuments.getText().toString())) {
            v5(getString(R.string.please_enter_your_ID_number));
            return;
        }
        if (TextUtils.isEmpty(this.f35601o)) {
            v5(getString(R.string.Please_upload_your_ID));
            return;
        }
        if (TextUtils.isEmpty(this.mEdEmail.getText().toString())) {
            v5(getString(R.string.Please_upload_your_Email));
        } else if (TextUtils.isEmpty(this.mEdPhone.getText().toString())) {
            v5(getString(R.string.Please_select_the_authentication_type));
        } else {
            ((q0) this.f27702e).o2(this.f35601o, this.mEdRalName.getText().toString(), this.mEdPhone.getText().toString(), this.mEdDocuments.getText().toString(), this.mEdEmail.getText().toString(), this.f35604r.getSex(), this.mCcp.getSelectedCountryNameCode(), this.mEdAgcency.getText().toString());
        }
    }

    @Override // em.s.b
    public void x1() {
        finish();
    }

    public void y5() {
        PictureSelector.create((e) this).openGallery(SelectMimeType.ofImage()).setImageEngine(GlideEngine.createGlideEngine()).setCompressEngine(new h()).setMaxSelectNum(1).setMinSelectNum(1).isPreviewImage(true).forResult(new b());
    }

    public class d implements CountryCodePicker.b {
        public d() {
        }

        @Override // com.rilixtech.widget.countrycodepicker.CountryCodePicker.b
        public void a(bg.b bVar) {
        }
    }
}
