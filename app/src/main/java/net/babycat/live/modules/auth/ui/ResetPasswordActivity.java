package net.babycat.live.modules.auth.ui;

import android.os.CountDownTimer;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.gyf.immersionbar.ImmersionBar;
import in.b;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import pk.g;
import q3.k;
import qk.m;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class ResetPasswordActivity extends b<m> implements g.b {
    public Button mButBc;
    public Topbar mCommonTopbar;
    public EditText mEd2;
    public EditText mEd3;
    public EditText mEdID;
    public ImageView mImage2;
    public ImageView mImage3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f35003n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public EditText f35004o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CountDownTimer f35008s;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f35005p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f35006q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f35007r = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Boolean f35009t = Boolean.FALSE;

    public class a extends CountDownTimer {
        public a(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            ResetPasswordActivity.this.f35009t = Boolean.FALSE;
            ResetPasswordActivity resetPasswordActivity = ResetPasswordActivity.this;
            resetPasswordActivity.f35003n.setText(resetPasswordActivity.getString(R.string.obtain_code));
            ResetPasswordActivity.this.f35008s = null;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            ResetPasswordActivity.this.f35003n.setText((j10 / 1000) + k.STREAMING_FORMAT_SS);
        }
    }

    private void A5() {
        this.f35009t = Boolean.TRUE;
        if (this.f35008s == null) {
            a aVar = new a(300000L, 1000L);
            this.f35008s = aVar;
            aVar.start();
        }
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_reset_pass;
    }

    @Override // in.a
    public void g5() {
        this.mCommonTopbar = (Topbar) findViewById(R.id.common_topbar);
        this.mEd2 = (EditText) findViewById(R.id.ed_2);
        this.mImage2 = (ImageView) findViewById(R.id.image_2);
        this.mEd3 = (EditText) findViewById(R.id.ed_3);
        this.mImage3 = (ImageView) findViewById(R.id.image_3);
        this.mButBc = (Button) findViewById(R.id.but_bc);
        this.f35003n = (TextView) findViewById(R.id.tv_code);
        this.f35004o = (EditText) findViewById(R.id.et_code);
        this.mEdID = (EditText) findViewById(R.id.ed_id);
        this.mImage2.setOnClickListener(this);
        this.mImage3.setOnClickListener(this);
        this.mButBc.setOnClickListener(this);
        this.f35003n.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        ImmersionBar.with(this).fitsSystemWindows(false).transparentStatusBar().statusBarDarkFont(true).init();
        t.S0(this.f27688a, this.mCommonTopbar, getString(R.string.reset_password));
        this.mCommonTopbar.setTabBoldGone();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // pk.g.b
    public void m0() {
        v5(getString(R.string.success));
        finish();
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.but_bc /* 2131361999 */:
                if (TextUtils.isEmpty(this.mEdID.getText().toString())) {
                    v5(getString(R.string.give_id));
                } else if (TextUtils.isEmpty(this.mEd2.getText().toString())) {
                    v5(getString(R.string.enter_password));
                } else if (TextUtils.isEmpty(this.mEd3.getText().toString())) {
                    v5(getString(R.string.enter_password));
                } else if (!this.mEd2.getText().toString().equals(this.mEd3.getText().toString())) {
                    v5(getString(R.string.two_pass));
                } else if (TextUtils.isEmpty(this.f35004o.getText().toString().trim())) {
                    v5(getString(R.string.input_email_code));
                } else {
                    try {
                        ((m) this.f27702e).D0(Integer.parseInt(this.mEdID.getText().toString().trim()), this.f35004o.getText().toString().trim(), this.mEd2.getText().toString().trim());
                    } catch (NumberFormatException unused) {
                        wo.b.b("重置密码--用户id错误", new Object[0]);
                        return;
                    }
                }
                break;
            case R.id.image_2 /* 2131362680 */:
                if (this.f35006q) {
                    this.f35006q = false;
                    this.mEd2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    this.mImage2.setImageResource(R.mipmap.icon_bxs);
                } else {
                    this.f35006q = true;
                    this.mEd2.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    this.mImage2.setImageResource(R.mipmap.icon_xs);
                }
                EditText editText = this.mEd2;
                editText.setSelection(editText.getText().length());
                break;
            case R.id.image_3 /* 2131362681 */:
                if (this.f35007r) {
                    this.f35007r = false;
                    this.mEd3.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    this.mImage3.setImageResource(R.mipmap.icon_bxs);
                } else {
                    this.f35007r = true;
                    this.mEd3.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    this.mImage3.setImageResource(R.mipmap.icon_xs);
                }
                EditText editText2 = this.mEd3;
                editText2.setSelection(editText2.getText().length());
                break;
        }
    }

    @Override // in.b, in.a, androidx.appcompat.app.e, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.f35008s;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f35008s = null;
        }
    }

    @Override // pk.g.b
    public void z() {
        A5();
    }

    public void z5(View view) {
        if (view.getId() == R.id.tv_code && !this.f35009t.booleanValue()) {
            if (TextUtils.isEmpty(this.mEdID.getText().toString().trim())) {
                v5(getString(R.string.give_id));
                return;
            }
            try {
                ((m) this.f27702e).E(Integer.parseInt(this.mEdID.getText().toString().trim()));
            } catch (NumberFormatException unused) {
                wo.b.b("重置密码--用户id错误", new Object[0]);
            }
        }
    }
}
