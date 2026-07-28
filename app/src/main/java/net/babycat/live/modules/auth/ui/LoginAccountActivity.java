package net.babycat.live.modules.auth.ui;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import in.b;
import net.babycat.live.model.InitBean;
import net.babycat.live.model.LoginDataBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.u0;
import net.babycat.live.platform.util.x0;
import net.babycat.live.platform.util.x1;
import net.babycat.live.shell.MainActivity;
import net.babycat.live.shell.WebViewActivity;
import org.litepal.LitePal;
import pk.a;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class LoginAccountActivity extends b<qk.a> implements a.b {
    public String A;
    public x1 B;
    public InitBean D;
    public View F;
    public View G;
    public View H;
    public View I;
    public View J;
    public View K;
    public View L;
    public ImageView mIvEmail;
    public ImageView mIvPhone;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f34924n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f34925o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public EditText f34926p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public EditText f34927q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f34928r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ImageView f34929s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f34930t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ImageView f34931u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f34932v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f34933w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f34934x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f34935y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f34936z;
    public Boolean C = Boolean.FALSE;
    public boolean E = true;
    public String M = x0.IMAGE_1;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (LoginAccountActivity.this.f34932v != null) {
                LoginAccountActivity.this.f34932v.setVisibility(charSequence.length() > 0 ? 0 : 8);
            }
        }
    }

    public final void A5(boolean z10) {
        int selectionStart = this.f34927q.getSelectionStart();
        if (z10) {
            this.f34927q.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this.f34927q.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        this.f34927q.setSelection(selectionStart);
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_login_account;
    }

    @Override // pk.a.b
    public void f(LoginDataBean loginDataBean) {
        if (loginDataBean.getLoginCount().intValue() != -1) {
            this.B.q("user_id", loginDataBean.getUserId().intValue());
            this.B.s("token", "Bearer " + loginDataBean.getToken());
            this.B.s("hx_password", loginDataBean.getHxPassword());
            this.B.s("user_sig", loginDataBean.getUser_sig());
            this.B.s("user_sig_im", loginDataBean.getUserSigIm());
            this.B.o("isLogin", true);
            o5(MainActivity.class);
            finish();
            return;
        }
        this.B.q("user_id", loginDataBean.getUserId().intValue());
        this.B.s("token", "Bearer " + loginDataBean.getToken());
        this.B.s("hx_password", loginDataBean.getHxPassword());
        this.B.s("user_sig", loginDataBean.getUser_sig());
        this.B.s("user_sig_im", loginDataBean.getUserSigIm());
        this.B.o("isLogin", true);
        Bundle bundle = new Bundle();
        bundle.putSerializable("data", loginDataBean);
        p5(LoginUserInfoActivity.class, bundle);
    }

    @Override // in.a
    public void g5() {
        this.f34924n = (TextView) findViewById(R.id.tv_account);
        this.f34925o = (ImageView) findViewById(R.id.splash_logo);
        this.f34926p = (EditText) findViewById(R.id.ed_id);
        this.f34927q = (EditText) findViewById(R.id.ed_pass);
        this.f34928r = (TextView) findViewById(R.id.tv_login);
        this.f34929s = (ImageView) findViewById(R.id.iv_agree);
        this.f34930t = (TextView) findViewById(R.id.tv_protocol);
        this.f34931u = (ImageView) findViewById(R.id.imgs_pass);
        this.mIvPhone = (ImageView) findViewById(R.id.iv_phone);
        this.mIvEmail = (ImageView) findViewById(R.id.iv_email);
        this.F = findViewById(R.id.real_pass);
        this.G = findViewById(R.id.tv_user);
        this.H = findViewById(R.id.tv_privacy);
        this.I = findViewById(R.id.login_g);
        this.J = findViewById(R.id.ll_agree);
        this.K = findViewById(R.id.iv_f);
        this.L = findViewById(R.id.tv_forget_password);
        this.f34924n.setOnClickListener(this);
        this.f34928r.setOnClickListener(this);
        this.mIvPhone.setOnClickListener(this);
        this.mIvEmail.setOnClickListener(this);
        this.F.setOnClickListener(this);
        this.G.setOnClickListener(this);
        this.H.setOnClickListener(this);
        this.I.setOnClickListener(this);
        this.J.setOnClickListener(this);
        this.K.setOnClickListener(this);
        this.L.setOnClickListener(this);
        View view = this.f34932v;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Override // in.a
    public void h5() {
        m5(true);
        this.f34924n.getPaint().setFlags(8);
        this.D = (InitBean) LitePal.findFirst(InitBean.class, true);
        this.f34934x = t.U();
        this.f34935y = t.z();
        this.f34936z = t.V();
        this.A = t.b0(getApplicationContext());
        x1 x1Var = new x1(this);
        this.B = x1Var;
        this.M = x1Var.l("pid");
        this.C = Boolean.TRUE;
        this.f34929s.setImageResource(R.mipmap.login_choose);
        this.mIvPhone.setVisibility(8);
        this.mIvEmail.setVisibility(8);
        View view = this.f34932v;
        if (view != null) {
            view.setVisibility(8);
        }
        this.f34926p.addTextChangedListener(new a());
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_email /* 2131362940 */:
                if (t.t0()) {
                    o5(LoginEmailActivity.class);
                    finish();
                }
                break;
            case R.id.iv_f /* 2131362944 */:
            case R.id.login_g /* 2131363363 */:
                if (t.t0()) {
                    o5(LoginThirdPartyActivity.class);
                    finish();
                }
                break;
            case R.id.iv_phone /* 2131363017 */:
            case R.id.tv_account /* 2131364193 */:
                z5();
                break;
            case R.id.ll_agree /* 2131363285 */:
                y5();
                break;
            case R.id.real_pass /* 2131363750 */:
                if (!this.E) {
                    this.f34931u.setImageResource(R.mipmap.icon_bxs);
                    A5(this.E);
                    this.E = true;
                } else {
                    this.f34931u.setImageResource(R.mipmap.icon_xs);
                    A5(this.E);
                    this.E = false;
                }
                break;
            case R.id.tv_forget_password /* 2131364335 */:
                if (t.t0()) {
                    o5(ResetPasswordActivity.class);
                }
                break;
            case R.id.tv_login /* 2131364409 */:
                if (TextUtils.isEmpty(this.f34926p.getText().toString())) {
                    v5(getString(R.string.enter_account));
                } else if (TextUtils.isEmpty(this.f34927q.getText().toString())) {
                    v5(getString(R.string.enter_password));
                } else if (this.f34927q.getText().toString().length() < 8) {
                    v5(getString(R.string.Please_enter_the_correct_password));
                } else if (!this.C.booleanValue()) {
                    v5(getString(R.string.read_and_agree_agreement));
                } else {
                    ((qk.a) this.f27702e).K0("account", this.f34926p.getText().toString(), this.f34927q.getText().toString(), this.A, this.f34936z, this.f34935y, this.f34934x, this.M, u0.a(this.M + this.A + ok.b.TOKEN));
                }
                break;
            case R.id.tv_privacy /* 2131364519 */:
                Bundle bundle = new Bundle();
                bundle.putString("title", getString(R.string.user_xys));
                bundle.putString("url", this.D.getSetting().getPrivacy_agreement());
                p5(WebViewActivity.class, bundle);
                break;
            case R.id.tv_user /* 2131364674 */:
                Bundle bundle2 = new Bundle();
                bundle2.putString("title", getString(R.string.user_xy));
                bundle2.putString("url", this.D.getSetting().getUser_agreement());
                p5(WebViewActivity.class, bundle2);
                break;
        }
    }

    public final void y5() {
        if (this.C.booleanValue()) {
            this.C = Boolean.FALSE;
            this.f34929s.setImageResource(R.mipmap.login_no_choose);
        } else {
            this.C = Boolean.TRUE;
            this.f34929s.setImageResource(R.mipmap.login_choose);
        }
    }

    public final void z5() {
        o5(LoginPhoneActivity.class);
        finish();
    }
}
