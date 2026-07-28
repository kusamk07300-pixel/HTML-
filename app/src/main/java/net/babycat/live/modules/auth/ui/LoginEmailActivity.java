package net.babycat.live.modules.auth.ui;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import in.b;
import net.babycat.live.model.InitBean;
import net.babycat.live.model.LoginDataBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.x1;
import net.babycat.live.shell.MainActivity;
import net.babycat.live.shell.WebViewActivity;
import org.litepal.LitePal;
import pk.c;
import q3.k;
import qk.c;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class LoginEmailActivity extends b<c> implements c.b {
    public x1 A;
    public CountDownTimer B;
    public Boolean C;
    public InitBean D;
    public String E;
    public View F;
    public View G;
    public View H;
    public View I;
    public View J;
    public View K;
    public View L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RelativeLayout f34938n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f34939o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public EditText f34940p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f34941q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f34942r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f34943s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public EditText f34944t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Boolean f34945u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f34946v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f34947w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f34948x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f34949y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f34950z;

    public class a extends CountDownTimer {
        public a(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            LoginEmailActivity.this.C = Boolean.FALSE;
            LoginEmailActivity loginEmailActivity = LoginEmailActivity.this;
            loginEmailActivity.f34943s.setText(loginEmailActivity.getString(R.string.obtain_code));
            LoginEmailActivity.this.B = null;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            LoginEmailActivity.this.f34943s.setText((j10 / 1000) + k.STREAMING_FORMAT_SS);
        }
    }

    public LoginEmailActivity() {
        Boolean bool = Boolean.FALSE;
        this.f34945u = bool;
        this.C = bool;
        this.E = "";
    }

    private void A5() {
        if (this.f34945u.booleanValue()) {
            this.f34945u = Boolean.FALSE;
            this.f34941q.setImageResource(R.mipmap.login_no_choose);
        } else {
            this.f34945u = Boolean.TRUE;
            this.f34941q.setImageResource(R.mipmap.login_choose);
        }
    }

    private void B5() {
        this.f34946v = this.f34940p.getText().toString();
        if (!this.f34945u.booleanValue()) {
            v5(getString(R.string.read_and_agree_agreement));
            return;
        }
        if (TextUtils.isEmpty(this.f34946v)) {
            v5(getString(R.string.input_email));
            return;
        }
        String strTrim = this.f34944t.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            v5(getString(R.string.input_email_code));
        } else {
            ((qk.c) this.f27702e).B3("email", t.M0(this.f34946v), strTrim, this.f34950z, this.f34949y, this.f34948x, this.f34947w);
        }
    }

    public final void C5() {
        String strTrim = this.f34940p.getText().toString().trim();
        this.f34946v = strTrim;
        if (TextUtils.isEmpty(strTrim)) {
            v5(getString(R.string.input_email));
        } else {
            ((qk.c) this.f27702e).F3(t.M0(this.f34946v));
        }
    }

    public final void D5() {
        this.C = Boolean.TRUE;
        if (this.B == null) {
            a aVar = new a(300000L, 1000L);
            this.B = aVar;
            aVar.start();
        }
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_login_email;
    }

    @Override // pk.c.b
    public void f(LoginDataBean loginDataBean) {
        loginDataBean.setCountryIso(this.E);
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
        this.f34938n = (RelativeLayout) findViewById(R.id.rel_top);
        this.f34939o = (TextView) findViewById(R.id.tv_account);
        this.f34940p = (EditText) findViewById(R.id.et_phone);
        this.f34941q = (ImageView) findViewById(R.id.iv_agree);
        this.f34942r = (TextView) findViewById(R.id.tv_protocol);
        this.f34943s = (TextView) findViewById(R.id.tv_code);
        this.f34944t = (EditText) findViewById(R.id.et_code);
        this.F = findViewById(R.id.tv_user);
        this.G = findViewById(R.id.tv_privacy);
        this.H = findViewById(R.id.iv_f);
        this.I = findViewById(R.id.tv_login);
        this.J = findViewById(R.id.go_login);
        this.K = findViewById(R.id.ll_agree);
        this.L = findViewById(R.id.iv_account);
        this.f34939o.setOnClickListener(this);
        this.f34943s.setOnClickListener(this);
        this.F.setOnClickListener(this);
        this.G.setOnClickListener(this);
        this.H.setOnClickListener(this);
        this.I.setOnClickListener(this);
        this.J.setOnClickListener(this);
        this.K.setOnClickListener(this);
        this.L.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        m5(false);
        this.f34939o.getPaint().setFlags(8);
        this.D = (InitBean) LitePal.findFirst(InitBean.class, true);
        this.f34947w = t.U();
        this.f34948x = t.z();
        this.f34949y = t.V();
        this.f34950z = t.b0(getApplicationContext());
        this.A = new x1(this);
        this.f34945u = Boolean.TRUE;
        this.f34941q.setImageResource(R.mipmap.login_choose);
    }

    @Override // in.a
    public View k5() {
        return null;
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
                z5();
                break;
            case R.id.ll_agree /* 2131363285 */:
                A5();
                break;
            case R.id.tv_code /* 2131364261 */:
                if (!this.C.booleanValue()) {
                    C5();
                }
                break;
            case R.id.tv_login /* 2131364409 */:
                if (t.t0()) {
                    B5();
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

    @Override // in.b, in.a, androidx.appcompat.app.e, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.B;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.B = null;
        }
    }

    @Override // pk.c.b
    public void z() {
        D5();
    }

    public final void z5() {
        o5(LoginAccountActivity.class);
        finish();
    }
}
