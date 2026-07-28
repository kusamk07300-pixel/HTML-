package net.babycat.live.modules.auth.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cf.g;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import f.n0;
import f.p0;
import java.util.Objects;
import net.babycat.live.model.InitBean;
import net.babycat.live.model.LoginDataBean;
import net.babycat.live.platform.util.s0;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.u0;
import net.babycat.live.platform.util.x0;
import net.babycat.live.platform.util.x1;
import net.babycat.live.shell.MainActivity;
import net.babycat.live.shell.WebViewActivity;
import org.litepal.LitePal;
import pk.e;
import qk.i;
import qmyy.babycat.live.R;
import uc.k;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class LoginThirdPartyActivity extends in.b<i> implements e.b {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f34970y = 9001;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f34971z = "1016299553466-kf1th18uatvje2b4n6smbq8j0njgg72f.apps.googleusercontent.com";
    public ImageView mIvAgree;
    public ImageView mIvEmail;
    public ImageView mIvId;
    public ImageView mIvPhone;
    public LinearLayout mLlAgree;
    public LinearLayout mLlOtherLogin;
    public LinearLayout mLlUserAgree;
    public RelativeLayout mReFacebook;
    public RelativeLayout mReGoogle;
    public RelativeLayout mRelTop;
    public TextView mTvLanguage;
    public TextView mTvProtocol;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public eb.b f34973o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f34974p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f34975q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f34976r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f34977s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public x1 f34978t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InitBean f34979u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f34980v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f34981w;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f34972n = Boolean.FALSE;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f34982x = x0.IMAGE_1;

    public class a implements e7.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e7.a f34983a;

        public a(e7.a aVar) {
            this.f34983a = aVar;
        }

        @Override // e7.c
        public void a(int i10) {
            if (i10 != 0) {
                if (i10 == 1) {
                    wo.b.b("邀请id:Connection couldn't be established.", new Object[0]);
                    return;
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    wo.b.b("邀请id:API not available on the current Play Store app", new Object[0]);
                    return;
                }
            }
            try {
                String strD = this.f34983a.b().d();
                if (t.B0(strD)) {
                    LoginThirdPartyActivity.this.f34982x = strD;
                    wo.b.b("邀请id:" + LoginThirdPartyActivity.this.f34982x, new Object[0]);
                    LoginThirdPartyActivity.this.f34978t.s("pid", strD);
                }
            } catch (Exception e10) {
                wo.b.b("邀请id:" + e10.getMessage(), new Object[0]);
                e10.printStackTrace();
            }
        }

        @Override // e7.c
        public void b() {
            wo.b.b("邀请id:Google Play by calling the startConnection() method", new Object[0]);
        }
    }

    public class b implements g {
        public b() {
        }

        @Override // cf.g
        public void a(int i10, String str) {
            LoginThirdPartyActivity loginThirdPartyActivity = LoginThirdPartyActivity.this;
            s0.e(loginThirdPartyActivity, i10, loginThirdPartyActivity);
            new x1(LoginThirdPartyActivity.this).s("language_select_sys", t.s(i10));
        }
    }

    private void A5() {
        if (this.f34972n.booleanValue()) {
            this.f34972n = Boolean.FALSE;
            this.mIvAgree.setImageResource(R.mipmap.login_no_choose);
        } else {
            this.f34972n = Boolean.TRUE;
            this.mIvAgree.setImageResource(R.mipmap.login_choose);
        }
    }

    private void C5() {
        startActivityForResult(this.f34973o.e0(), 9001);
    }

    private void D5() {
        this.f34973o.C().d(this, new c());
    }

    public final void B5() {
        new b.C0752b(this).X(true).f(getString(R.string.my_select_language), new String[]{getString(R.string.language_en), getString(R.string.language_ar), getString(R.string.language_es), getString(R.string.language_bn), getString(R.string.language_fr), getString(R.string.language_tr), getString(R.string.language_hi)}, new b()).N();
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_login_third_party;
    }

    @Override // pk.e.b
    public void f(LoginDataBean loginDataBean) {
        if (loginDataBean.getLoginCount().intValue() == -1) {
            this.f34978t.q("user_id", loginDataBean.getUserId().intValue());
            this.f34978t.s("token", "Bearer " + loginDataBean.getToken());
            this.f34978t.s("hx_password", loginDataBean.getHxPassword());
            this.f34978t.s("user_sig", loginDataBean.getUser_sig());
            // STUB: Skip Tencent IM user_sig_im for local testing
            // this.f34978t.s("user_sig_im", loginDataBean.getUserSigIm());
            this.f34978t.o("isLogin", true);
            Bundle bundle = new Bundle();
            bundle.putSerializable("data", loginDataBean);
            p5(LoginUserInfoActivity.class, bundle);
        } else {
            this.f34978t.q("user_id", loginDataBean.getUserId().intValue());
            this.f34978t.s("token", "Bearer " + loginDataBean.getToken());
            this.f34978t.s("hx_password", loginDataBean.getHxPassword());
            this.f34978t.s("user_sig", loginDataBean.getUser_sig());
            this.f34978t.o("isLogin", true);
            // STUB: Skip Tencent IM user_sig_im for local testing
            // this.f34978t.s("user_sig_im", loginDataBean.getUserSigIm());
            o5(MainActivity.class);
            finish();
        }
        D5();
    }

    @Override // in.a
    public void g5() {
        this.mReGoogle = (RelativeLayout) findViewById(R.id.re_google);
        this.mReFacebook = (RelativeLayout) findViewById(R.id.re_facebook);
        this.mIvPhone = (ImageView) findViewById(R.id.iv_phone);
        this.mIvId = (ImageView) findViewById(R.id.iv_id);
        this.mLlOtherLogin = (LinearLayout) findViewById(R.id.ll_other_login);
        this.mIvAgree = (ImageView) findViewById(R.id.iv_agree);
        this.mLlAgree = (LinearLayout) findViewById(R.id.ll_agree);
        this.mTvProtocol = (TextView) findViewById(R.id.tv_protocol);
        this.mLlUserAgree = (LinearLayout) findViewById(R.id.ll_user_agree);
        this.mRelTop = (RelativeLayout) findViewById(R.id.rel_top);
        this.mTvLanguage = (TextView) findViewById(R.id.tv_language);
        this.mIvEmail = (ImageView) findViewById(R.id.iv_email);
        this.f34980v = findViewById(R.id.tv_user);
        this.f34981w = findViewById(R.id.tv_privacy);
        this.mReGoogle.setOnClickListener(this);
        this.mReFacebook.setOnClickListener(this);
        this.mIvPhone.setOnClickListener(this);
        this.mIvId.setOnClickListener(this);
        this.mLlAgree.setOnClickListener(this);
        this.mTvLanguage.setOnClickListener(this);
        this.mIvEmail.setOnClickListener(this);
        this.f34980v.setOnClickListener(this);
        this.f34981w.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        m5(true);
        x1 x1Var = new x1(this);
        this.f34978t = x1Var;
        x1Var.s("pid", this.f34982x);
        this.f34979u = (InitBean) LitePal.findFirst(InitBean.class, true);
        this.f34972n = Boolean.TRUE;
        this.mIvAgree.setImageResource(R.mipmap.login_choose);
        this.f34974p = t.U();
        this.f34975q = t.z();
        this.f34976r = t.V();
        this.f34977s = t.b0(getApplicationContext());
        this.f34973o = com.google.android.gms.auth.api.signin.a.c(this, new GoogleSignInOptions.a(GoogleSignInOptions.DEFAULT_SIGN_IN).d().c().e(f34971z).b());
        e7.a aVarA = e7.a.d(this).a();
        aVarA.e(new a(aVarA));
        this.mTvLanguage.setText(s0.a(this));
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, androidx.fragment.app.d, androidx.activity.d, android.app.Activity
    public void onActivityResult(int i10, int i11, @p0 Intent intent) throws Throwable {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 9001) {
            try {
                GoogleSignInAccount googleSignInAccountS = com.google.android.gms.auth.api.signin.a.f(intent).s(ApiException.class);
                googleSignInAccountS.H();
                googleSignInAccountS.I();
                googleSignInAccountS.A();
                googleSignInAccountS.B();
                Objects.toString(googleSignInAccountS.d());
                googleSignInAccountS.C();
                googleSignInAccountS.D();
                googleSignInAccountS.O();
                Objects.toString(googleSignInAccountS.G());
                Objects.toString(googleSignInAccountS.M());
                Objects.toString(googleSignInAccountS.J());
                i iVar = (i) this.f27702e;
                String strH = googleSignInAccountS.H();
                String strA = googleSignInAccountS.A();
                String string = googleSignInAccountS.J() == null ? "" : googleSignInAccountS.J().toString();
                iVar.o0("google", strH, strA, string, googleSignInAccountS.B(), this.f34977s, this.f34976r, this.f34975q, this.f34974p, this.f34982x, u0.a(this.f34982x + this.f34977s + ok.b.TOKEN));
            } catch (ApiException e10) {
                v5("signInResult:failed code=" + e10.b());
            }
        }
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
            case R.id.iv_id /* 2131362968 */:
                o5(LoginAccountActivity.class);
                finish();
                break;
            case R.id.iv_phone /* 2131363017 */:
                o5(LoginPhoneActivity.class);
                finish();
                break;
            case R.id.ll_agree /* 2131363285 */:
                A5();
                break;
            case R.id.re_google /* 2131363701 */:
                if (t.t0()) {
                    GoogleSignInAccount googleSignInAccountE = com.google.android.gms.auth.api.signin.a.e(this);
                    if (googleSignInAccountE != null) {
                        i iVar = (i) this.f27702e;
                        String strH = googleSignInAccountE.H();
                        String strA = googleSignInAccountE.A();
                        String string = googleSignInAccountE.J() == null ? "" : googleSignInAccountE.J().toString();
                        iVar.o0("google", strH, strA, string, googleSignInAccountE.B(), this.f34977s, this.f34976r, this.f34975q, this.f34974p, this.f34982x, u0.a(this.f34982x + this.f34977s + ok.b.TOKEN));
                    } else {
                        C5();
                    }
                }
                break;
            case R.id.tv_language /* 2131364392 */:
                B5();
                break;
            case R.id.tv_privacy /* 2131364519 */:
                Bundle bundle = new Bundle();
                bundle.putString("title", getString(R.string.user_xys));
                bundle.putString("url", this.f34979u.getSetting().getPrivacy_agreement());
                p5(WebViewActivity.class, bundle);
                break;
            case R.id.tv_user /* 2131364674 */:
                Bundle bundle2 = new Bundle();
                bundle2.putString("title", getString(R.string.user_xy));
                bundle2.putString("url", this.f34979u.getSetting().getUser_agreement());
                p5(WebViewActivity.class, bundle2);
                break;
        }
    }

    public class c implements uc.e<Void> {
        public c() {
        }

        @Override // uc.e
        public void a(@n0 k<Void> kVar) {
        }
    }
}
