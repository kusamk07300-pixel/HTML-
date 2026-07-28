package net.babycat.live.modules.auth.ui;

import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.luck.picture.lib.basic.PictureSelector;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.interfaces.OnResultCallbackListener;
import com.lxj.xpopupext.popup.TimePickerPopup;
import hf.e;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import net.babycat.live.model.AvatarBean;
import net.babycat.live.model.LoginDataBean;
import net.babycat.live.model.StsBean;
import net.babycat.live.platform.util.h2;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.t0;
import net.babycat.live.platform.widget.view.GlideEngine;
import net.babycat.live.shell.MainActivity;
import pk.f;
import qk.k;
import qmyy.babycat.live.R;
import wn.d;
import wn.i;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class LoginUserInfoActivity extends in.b<k> implements f.b {
    public FrameLayout A;
    public ImageView B;
    public ImageView C;
    public TextView D;
    public LoginDataBean E;
    public List<LocalMedia> G;
    public TimePickerPopup L;
    public View O;
    public EditText mEdPass;
    public LinearLayout mLinCountry;
    public RelativeLayout mReBirthday;
    public TextView mTvBirthday;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RelativeLayout f34987n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public EditText f34988o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f34989p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f34990q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinearLayout f34991r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ImageView f34992s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f34993t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public LinearLayout f34994u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public EditText f34995v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinearLayout f34996w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f34997x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f34998y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ImageView f34999z;
    public int F = 1;
    public String H = "";
    public String I = "";
    public String J = "";
    public String K = "";
    public String M = "";
    public boolean N = true;

    public class a implements OnResultCallbackListener<LocalMedia> {
        public a() {
        }

        @Override // com.luck.picture.lib.interfaces.OnResultCallbackListener
        public void onCancel() {
        }

        @Override // com.luck.picture.lib.interfaces.OnResultCallbackListener
        public void onResult(ArrayList<LocalMedia> arrayList) {
            LoginUserInfoActivity.this.G = arrayList;
            wo.b.b("选择照片地址--" + arrayList.get(0).getPath(), new Object[0]);
            LoginUserInfoActivity loginUserInfoActivity = LoginUserInfoActivity.this;
            loginUserInfoActivity.l2(loginUserInfoActivity.getString(R.string.uploading));
            if (arrayList.get(0).isCut()) {
                ((k) LoginUserInfoActivity.this.f27702e).d(arrayList.get(0).getCutPath());
                LoginUserInfoActivity loginUserInfoActivity2 = LoginUserInfoActivity.this;
                d.f(loginUserInfoActivity2, loginUserInfoActivity2.f34999z, arrayList.get(0).getCutPath());
            } else if (!arrayList.get(0).getPath().contains("content://")) {
                ((k) LoginUserInfoActivity.this.f27702e).d(arrayList.get(0).getPath());
                LoginUserInfoActivity loginUserInfoActivity3 = LoginUserInfoActivity.this;
                d.f(loginUserInfoActivity3, loginUserInfoActivity3.f34999z, arrayList.get(0).getPath());
            } else {
                String strK = t.K(LoginUserInfoActivity.this.getApplicationContext(), Uri.parse(arrayList.get(0).getPath()));
                ((k) LoginUserInfoActivity.this.f27702e).d(strK);
                LoginUserInfoActivity loginUserInfoActivity4 = LoginUserInfoActivity.this;
                d.f(loginUserInfoActivity4, loginUserInfoActivity4.f34999z, strK);
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
            wo.b.b("Upload image failed: " + str, new Object[0]);
            LoginUserInfoActivity.this.k3();
        }

        @Override // net.babycat.live.platform.util.h2.b
        public void c(String str, int i10) {
            wo.b.b("Upload image: " + str, new Object[0]);
            ((k) LoginUserInfoActivity.this.f27702e).c(str);
        }
    }

    public class c implements e {
        public c() {
        }

        @Override // hf.e
        public void a(Date date, View view) {
            LoginUserInfoActivity.this.J = (date.getTime() / 1000) + "";
            LoginUserInfoActivity.this.mTvBirthday.setText(t.d1(Long.parseLong(LoginUserInfoActivity.this.J + "000"), "yyyy-MM-dd"));
        }

        @Override // hf.e
        public void b(Date date) {
        }

        @Override // hf.e
        public void onCancel() {
        }
    }

    private void H5(boolean z10) {
        int selectionStart = this.mEdPass.getSelectionStart();
        if (z10) {
            this.mEdPass.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this.mEdPass.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        this.mEdPass.setSelection(selectionStart);
    }

    public void A5() {
        PictureSelector.create((androidx.appcompat.app.e) this).openGallery(SelectMimeType.ofImage()).setImageEngine(GlideEngine.createGlideEngine()).setCropEngine(new i()).setMaxSelectNum(1).setMinSelectNum(1).isGif(false).isWebp(false).isPreviewImage(true).forResult(new a());
    }

    @Override // pk.f.b
    public void C4() {
        o5(MainActivity.class);
    }

    public final void F5() {
        String country = getResources().getConfiguration().locale.getCountry();
        this.M = country;
        if (TextUtils.isEmpty(country)) {
            this.M = getResources().getConfiguration().locale.getCountry();
        }
        if (TextUtils.isEmpty(this.M)) {
            this.M = "US";
        }
    }

    public final void G5() {
        this.L = new TimePickerPopup(this).a0(Calendar.getInstance()).i0(new c());
        new b.C0752b(this).t(this.L).N();
    }

    @Override // pk.f.b
    public void b() {
        k3();
    }

    @Override // pk.f.b
    public void c(String str) {
        this.H = str;
        k3();
    }

    @Override // pk.f.b
    public void d(StsBean stsBean, String str) {
        h2.a().c(this, this.E.getUserId().intValue(), stsBean, str, 0, new b());
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_login_user_info;
    }

    @Override // in.a
    public void g5() {
        this.C = (ImageView) findViewById(R.id.image_gj);
        this.D = (TextView) findViewById(R.id.tv_country_name);
        this.mReBirthday = (RelativeLayout) findViewById(R.id.re_birthday);
        this.mEdPass = (EditText) findViewById(R.id.ed_pass);
        this.mLinCountry = (LinearLayout) findViewById(R.id.lin_country);
        this.f34987n = (RelativeLayout) findViewById(R.id.rel_top);
        this.f34988o = (EditText) findViewById(R.id.ed_name);
        this.f34989p = (ImageView) findViewById(R.id.imgs_male);
        this.f34990q = (TextView) findViewById(R.id.tv_male);
        this.f34991r = (LinearLayout) findViewById(R.id.lin_male);
        this.f34992s = (ImageView) findViewById(R.id.imgs_emale);
        this.f34993t = (TextView) findViewById(R.id.tv_female);
        this.f34994u = (LinearLayout) findViewById(R.id.lin_female);
        this.f34995v = (EditText) findViewById(R.id.ed_code);
        this.f34996w = (LinearLayout) findViewById(R.id.ll_card);
        this.f34997x = (TextView) findViewById(R.id.next_step);
        this.f34998y = (TextView) findViewById(R.id.skip_btn);
        this.f34999z = (ImageView) findViewById(R.id.imgs_avatar);
        this.A = (FrameLayout) findViewById(R.id.frame_avatar);
        this.B = (ImageView) findViewById(R.id.imgs_pass);
        this.O = findViewById(R.id.real_pass);
        this.mReBirthday.setOnClickListener(this);
        this.f34991r.setOnClickListener(this);
        this.f34994u.setOnClickListener(this);
        this.f34997x.setOnClickListener(this);
        this.f34998y.setOnClickListener(this);
        this.A.setOnClickListener(this);
        this.O.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        m5(true);
        LoginDataBean loginDataBean = (LoginDataBean) getIntent().getSerializableExtra("data");
        this.E = loginDataBean;
        if (loginDataBean != null) {
            this.f34988o.setText(loginDataBean.getNickname());
            d.f(this, this.f34999z, this.E.getAvatarUrl());
            this.H = this.E.getAvatarUrl();
            this.I = this.E.getNickname();
        }
        if (TextUtils.isEmpty(this.E.getCountryIso())) {
            F5();
        } else {
            this.M = this.E.getCountryIso();
        }
        bg.b bVarV = t.v(this, this.M);
        this.C.setImageResource(com.rilixtech.widget.countrycodepicker.c.h(bVarV));
        this.D.setText(bVarV.b());
    }

    @Override // pk.f.b
    public void i(AvatarBean avatarBean) {
        t0.a("头像地址" + avatarBean.getSrc());
        this.H = avatarBean.getSrc();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.frame_avatar /* 2131362523 */:
                A5();
                break;
            case R.id.lin_female /* 2131363150 */:
                this.f34991r.setBackgroundResource(R.drawable.bg_toleft_grey_r44);
                this.f34989p.setImageResource(R.mipmap.nan_grey);
                this.f34990q.setTextColor(Color.parseColor("#999999"));
                this.f34994u.setBackgroundResource(R.drawable.bg_toright_white_r44);
                this.f34993t.setTextColor(Color.parseColor("#FF5A8C"));
                this.f34992s.setImageResource(R.mipmap.nv_white);
                this.F = 2;
                break;
            case R.id.lin_male /* 2131363172 */:
                this.f34991r.setBackgroundResource(R.drawable.bg_toleft_basecolor_r44);
                this.f34989p.setImageResource(R.mipmap.nan_white);
                this.f34990q.setTextColor(Color.parseColor("#536BFF"));
                this.f34994u.setBackgroundResource(R.drawable.bg_toright_grey_r44);
                this.f34993t.setTextColor(Color.parseColor("#999999"));
                this.f34992s.setImageResource(R.mipmap.nv_grey);
                this.F = 1;
                break;
            case R.id.next_step /* 2131363524 */:
            case R.id.skip_btn /* 2131363987 */:
                if (!TextUtils.isEmpty(this.f34988o.getText().toString())) {
                    this.I = this.f34988o.getText().toString();
                }
                if (!TextUtils.isEmpty(this.f34995v.getText().toString())) {
                    this.K = this.f34995v.getText().toString();
                }
                if (TextUtils.isEmpty(this.H)) {
                    v5(getString(R.string.please_upload_avatar));
                } else if (TextUtils.isEmpty(this.J)) {
                    v5(getString(R.string.select_birthday));
                } else if (!TextUtils.isEmpty(this.M)) {
                    ((k) this.f27702e).g0(this.I, this.F, this.J, this.K, this.H, this.mEdPass.getText().toString(), this.M);
                } else {
                    v5(getString(R.string.select_country));
                }
                break;
            case R.id.re_birthday /* 2131363682 */:
                G5();
                break;
            case R.id.real_pass /* 2131363750 */:
                if (!this.N) {
                    this.B.setImageResource(R.mipmap.icon_bxs);
                    H5(this.N);
                    this.N = true;
                } else {
                    this.B.setImageResource(R.mipmap.icon_xs);
                    H5(this.N);
                    this.N = false;
                }
                break;
        }
    }
}
