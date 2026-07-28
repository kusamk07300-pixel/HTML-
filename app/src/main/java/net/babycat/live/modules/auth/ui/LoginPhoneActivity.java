package net.babycat.live.modules.auth.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.rilixtech.widget.countrycodepicker.CountryCodePicker;
import f.n0;
import f.p0;
import net.babycat.live.model.InitBean;
import net.babycat.live.model.LoginDataBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.x1;
import net.babycat.live.shell.MainActivity;
import net.babycat.live.shell.WebViewActivity;
import org.litepal.LitePal;
import pk.d;
import q3.k;
import qk.e;
import qmyy.babycat.live.R;
import xn.n1;

/* JADX INFO: loaded from: classes4.dex */
public class LoginPhoneActivity extends in.b<e> implements d.b {
    public static final int O = 9001;
    public static final String P = "448251169787-prp46a1rc45u84mu0fu807bgu9egm7b7.apps.googleusercontent.com";
    public x1 A;
    public CountDownTimer B;
    public Boolean C;
    public eb.b D;
    public InitBean E;
    public String F;
    public String G;
    public View H;
    public View I;
    public View J;
    public View K;
    public View L;
    public View M;
    public View N;
    public CountryCodePicker mCcp;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RelativeLayout f34952n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f34953o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public EditText f34954p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f34955q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f34956r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f34957s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public EditText f34958t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Boolean f34959u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f34960v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f34961w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f34962x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f34963y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f34964z;

    public class a implements n1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n1 f34965a;

        public a(n1 n1Var) {
            this.f34965a = n1Var;
        }

        @Override // xn.n1.e
        public void onClick(int i10) {
            if (i10 == 2) {
                zn.a.l().a(LoginPhoneActivity.this);
                return;
            }
            if (i10 != 3) {
                return;
            }
            LoginPhoneActivity.this.A.o("isPopup", true);
            LoginPhoneActivity loginPhoneActivity = LoginPhoneActivity.this;
            loginPhoneActivity.f34959u = Boolean.valueOf(loginPhoneActivity.A.d("isPopup"));
            LoginPhoneActivity.this.f34955q.setImageResource(R.mipmap.login_choose);
            this.f34965a.s();
        }
    }

    public class b extends CountDownTimer {
        public b(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            LoginPhoneActivity.this.C = Boolean.FALSE;
            LoginPhoneActivity loginPhoneActivity = LoginPhoneActivity.this;
            loginPhoneActivity.f34957s.setText(loginPhoneActivity.getString(R.string.obtain_code));
            LoginPhoneActivity.this.B = null;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            LoginPhoneActivity.this.f34957s.setText((j10 / 1000) + k.STREAMING_FORMAT_SS);
        }
    }

    public class c implements uc.e<Void> {
        public c() {
        }

        @Override // uc.e
        public void a(@n0 uc.k<Void> kVar) {
            LoginPhoneActivity.this.v5("登出");
        }
    }

    public class d implements CountryCodePicker.b {
        public d() {
        }

        @Override // com.rilixtech.widget.countrycodepicker.CountryCodePicker.b
        public void a(bg.b bVar) {
            LoginPhoneActivity.this.F = bVar.c();
            LoginPhoneActivity.this.G = bVar.a();
        }
    }

    public LoginPhoneActivity() {
        Boolean bool = Boolean.FALSE;
        this.f34959u = bool;
        this.C = bool;
        this.F = "";
        this.G = "";
    }

    private void D5() {
        o5(LoginAccountActivity.class);
        finish();
    }

    private void E5() {
        if (this.f34959u.booleanValue()) {
            this.f34959u = Boolean.FALSE;
            this.f34955q.setImageResource(R.mipmap.login_no_choose);
        } else {
            this.f34959u = Boolean.TRUE;
            this.f34955q.setImageResource(R.mipmap.login_choose);
        }
    }

    private void F5() {
        this.f34960v = this.f34954p.getText().toString();
        if (!this.f34959u.booleanValue()) {
            v5(getString(R.string.read_and_agree_agreement));
            return;
        }
        if (TextUtils.isEmpty(this.f34960v)) {
            v5(getString(R.string.enter_phone));
            return;
        }
        String strTrim = this.f34958t.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            v5("请输入验证码");
        } else {
            ((e) this.f27702e).k2("mobile", t.M0(this.f34960v), strTrim, this.f34964z, this.f34963y, this.f34962x, this.f34961w, this.F);
        }
    }

    private void G5() {
        String strTrim = this.f34954p.getText().toString().trim();
        this.f34960v = strTrim;
        if (TextUtils.isEmpty(strTrim)) {
            v5(getString(R.string.enter_phone));
        } else {
            ((e) this.f27702e).M0(t.M0(this.f34960v), this.F);
        }
    }

    private void K5() {
        this.C = Boolean.TRUE;
        if (this.B == null) {
            b bVar = new b(60000L, 1000L);
            this.B = bVar;
            bVar.start();
        }
    }

    @Override // pk.d.b
    public void B0() {
        K5();
    }

    public final void H5() {
        this.F = this.mCcp.getSelectedCountryCode();
        this.G = this.mCcp.getSelectedCountryNameCode();
        this.mCcp.y(this.f34954p);
        this.mCcp.setOnCountryChangeListener(new d());
        this.mCcp.setDefaultCountryUsingNameCode(getResources().getConfiguration().locale.getCountry());
    }

    public final void I5() {
        startActivityForResult(this.D.e0(), 9001);
    }

    public final void J5() {
        this.D.C().d(this, new c());
    }

    public final void L5() {
        Bundle bundle = new Bundle();
        bundle.putString("mobile_login", this.f34960v);
        p5(VerificationCodeActivity.class, bundle);
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_login_phone;
    }

    @Override // pk.d.b
    public void f(LoginDataBean loginDataBean) {
        loginDataBean.setCountryIso(this.G);
        if (loginDataBean.getLoginCount().intValue() != -1) {
            this.A.q("user_id", loginDataBean.getUserId().intValue());
            this.A.s("token", "Bearer " + loginDataBean.getToken());
            this.A.s("hx_password", loginDataBean.getHxPassword());
            this.A.s("user_sig", loginDataBean.getUser_sig());
            this.A.s("user_sig_im", loginDataBean.getUserSigIm());
            this.A.o("isLogin", true);
            o5(MainActivity.class);
            finish();
            return;
        }
        this.A.q("user_id", loginDataBean.getUserId().intValue());
        this.A.s("token", "Bearer " + loginDataBean.getToken());
        this.A.s("hx_password", loginDataBean.getHxPassword());
        this.A.s("user_sig", loginDataBean.getUser_sig());
        this.A.s("user_sig_im", loginDataBean.getUserSigIm());
        this.A.o("isLogin", true);
        Bundle bundle = new Bundle();
        bundle.putSerializable("data", loginDataBean);
        p5(LoginUserInfoActivity.class, bundle);
        finish();
    }

    @Override // in.a
    public void g5() {
        this.mCcp = (CountryCodePicker) findViewById(R.id.ccp);
        this.f34952n = (RelativeLayout) findViewById(R.id.rel_top);
        this.f34953o = (TextView) findViewById(R.id.tv_account);
        this.f34954p = (EditText) findViewById(R.id.et_phone);
        this.f34955q = (ImageView) findViewById(R.id.iv_agree);
        this.f34956r = (TextView) findViewById(R.id.tv_protocol);
        this.f34957s = (TextView) findViewById(R.id.tv_code);
        this.f34958t = (EditText) findViewById(R.id.et_code);
        this.H = findViewById(R.id.tv_user);
        this.I = findViewById(R.id.tv_privacy);
        this.J = findViewById(R.id.iv_f);
        this.K = findViewById(R.id.tv_login);
        this.L = findViewById(R.id.go_login);
        this.M = findViewById(R.id.ll_agree);
        this.N = findViewById(R.id.iv_account);
        this.f34953o.setOnClickListener(this);
        this.f34957s.setOnClickListener(this);
        this.H.setOnClickListener(this);
        this.I.setOnClickListener(this);
        this.J.setOnClickListener(this);
        this.K.setOnClickListener(this);
        this.L.setOnClickListener(this);
        this.M.setOnClickListener(this);
        this.N.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        m5(false);
        this.f34953o.getPaint().setFlags(8);
        this.E = (InitBean) LitePal.findFirst(InitBean.class, true);
        this.f34961w = t.U();
        this.f34962x = t.z();
        this.f34963y = t.V();
        this.f34964z = t.b0(getApplicationContext());
        this.A = new x1(this);
        H5();
        this.D = com.google.android.gms.auth.api.signin.a.c(this, new GoogleSignInOptions.a(GoogleSignInOptions.DEFAULT_SIGN_IN).d().c().e(P).b());
        if (this.A.d("isPopup")) {
            this.f34959u = Boolean.valueOf(this.A.d("isPopup"));
            this.f34955q.setImageResource(R.mipmap.login_choose);
        } else {
            n1 n1Var = new n1(this);
            n1Var.setOnClickPopListener(new a(n1Var));
        }
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, androidx.fragment.app.d, androidx.activity.d, android.app.Activity
    public void onActivityResult(int i10, int i11, @p0 Intent intent) throws Throwable {
        super.onActivityResult(i10, i11, intent);
        if (i10 != 9001 || i11 == 0) {
            return;
        }
        try {
            GoogleSignInAccount googleSignInAccountS = com.google.android.gms.auth.api.signin.a.f(intent).s(ApiException.class);
            v5("id = " + googleSignInAccountS.H() + "\ntoken = " + googleSignInAccountS.I());
        } catch (ApiException e10) {
            v5("signInResult:failed code=" + e10.b());
        }
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.go_login /* 2131362567 */:
            case R.id.iv_f /* 2131362944 */:
                o5(LoginThirdPartyActivity.class);
                finish();
                break;
            case R.id.iv_account /* 2131362888 */:
            case R.id.tv_account /* 2131364193 */:
                D5();
                break;
            case R.id.ll_agree /* 2131363285 */:
                E5();
                break;
            case R.id.tv_code /* 2131364261 */:
                if (!this.C.booleanValue()) {
                    G5();
                }
                break;
            case R.id.tv_login /* 2131364409 */:
                if (t.t0()) {
                    F5();
                }
                break;
            case R.id.tv_privacy /* 2131364519 */:
                Bundle bundle = new Bundle();
                bundle.putString("title", getString(R.string.user_xys));
                bundle.putString("url", this.E.getSetting().getPrivacy_agreement());
                p5(WebViewActivity.class, bundle);
                break;
            case R.id.tv_user /* 2131364674 */:
                Bundle bundle2 = new Bundle();
                bundle2.putString("title", getString(R.string.user_xy));
                bundle2.putString("url", this.E.getSetting().getUser_agreement());
                p5(WebViewActivity.class, bundle2);
                break;
        }
    }

    @Override // in.b, in.a, androidx.appcompat.app.e, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.B;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.B = null;
        }
    }
}
