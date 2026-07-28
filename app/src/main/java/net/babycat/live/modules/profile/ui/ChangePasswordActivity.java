package net.babycat.live.modules.profile.ui;

import android.os.CountDownTimer;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import em.h;
import in.b;
import jm.o;
import net.babycat.live.model.UserInfoDataBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import org.litepal.LitePal;
import q3.k;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class ChangePasswordActivity extends b<o> implements h.b {
    public Button mButBc;
    public Topbar mCommonTopbar;
    public EditText mEd1;
    public EditText mEd2;
    public EditText mEd3;
    public ImageView mImage1;
    public ImageView mImage2;
    public ImageView mImage3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f35490n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public EditText f35491o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CountDownTimer f35495s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public UserInfoDataBean f35497u;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f35492p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f35493q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f35494r = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Boolean f35496t = Boolean.FALSE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f35498v = 0;

    public class a extends CountDownTimer {
        public a(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            ChangePasswordActivity.this.f35496t = Boolean.FALSE;
            ChangePasswordActivity changePasswordActivity = ChangePasswordActivity.this;
            changePasswordActivity.f35490n.setText(changePasswordActivity.getString(R.string.obtain_code));
            ChangePasswordActivity.this.f35495s = null;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            ChangePasswordActivity.this.f35490n.setText((j10 / 1000) + k.STREAMING_FORMAT_SS);
        }
    }

    private void z5() {
        this.f35496t = Boolean.TRUE;
        if (this.f35495s == null) {
            a aVar = new a(300000L, 1000L);
            this.f35495s = aVar;
            aVar.start();
        }
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_change_pass;
    }

    @Override // in.a
    public void g5() {
        this.mCommonTopbar = (Topbar) findViewById(R.id.common_topbar);
        this.mEd1 = (EditText) findViewById(R.id.ed_1);
        this.mImage1 = (ImageView) findViewById(R.id.image_1);
        this.mEd2 = (EditText) findViewById(R.id.ed_2);
        this.mImage2 = (ImageView) findViewById(R.id.image_2);
        this.mEd3 = (EditText) findViewById(R.id.ed_3);
        this.mImage3 = (ImageView) findViewById(R.id.image_3);
        this.mButBc = (Button) findViewById(R.id.but_bc);
        this.f35490n = (TextView) findViewById(R.id.tv_code);
        this.f35491o = (EditText) findViewById(R.id.et_code);
        this.mImage1.setOnClickListener(this);
        this.mImage2.setOnClickListener(this);
        this.mImage3.setOnClickListener(this);
        this.mButBc.setOnClickListener(this);
        this.f35490n.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        this.f35497u = (UserInfoDataBean) LitePal.findFirst(UserInfoDataBean.class, true);
        int intExtra = getIntent().getIntExtra("type", 0);
        this.f35498v = intExtra;
        t.S0(this.f27688a, this.mCommonTopbar, getString(intExtra == 0 ? R.string.change_password : R.string.change_security_password));
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // em.h.b
    public void m0() {
        finish();
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.but_bc) {
            if (TextUtils.isEmpty(this.mEd2.getText().toString())) {
                v5(getString(R.string.enter_password));
                return;
            }
            if (TextUtils.isEmpty(this.mEd3.getText().toString())) {
                v5(getString(R.string.enter_password));
                return;
            }
            if (!this.mEd2.getText().toString().equals(this.mEd3.getText().toString())) {
                v5(getString(R.string.two_pass));
                return;
            }
            if (TextUtils.isEmpty(this.f35491o.getText().toString().trim())) {
                v5(getString(R.string.input_email_code));
                return;
            } else if (this.f35498v == 0) {
                ((o) this.f27702e).E1(this.f35491o.getText().toString().trim(), this.mEd2.getText().toString().trim());
                return;
            } else {
                ((o) this.f27702e).Q2(this.mEd2.getText().toString().trim(), this.f35491o.getText().toString().trim());
                return;
            }
        }
        if (id2 == R.id.tv_code) {
            if (this.f35496t.booleanValue()) {
                return;
            }
            ((o) this.f27702e).E(this.f35497u.getUserId().intValue());
            return;
        }
        switch (id2) {
            case R.id.image_1 /* 2131362679 */:
                if (this.f35492p) {
                    this.f35492p = false;
                    this.mEd1.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    this.mImage1.setImageResource(R.mipmap.image_invisible);
                } else {
                    this.f35492p = true;
                    this.mEd1.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    this.mImage1.setImageResource(R.mipmap.image_see);
                }
                EditText editText = this.mEd1;
                editText.setSelection(editText.getText().length());
                break;
            case R.id.image_2 /* 2131362680 */:
                if (this.f35493q) {
                    this.f35493q = false;
                    this.mEd2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    this.mImage2.setImageResource(R.mipmap.image_invisible);
                } else {
                    this.f35493q = true;
                    this.mEd2.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    this.mImage2.setImageResource(R.mipmap.image_see);
                }
                EditText editText2 = this.mEd2;
                editText2.setSelection(editText2.getText().length());
                break;
            case R.id.image_3 /* 2131362681 */:
                if (this.f35494r) {
                    this.f35494r = false;
                    this.mEd3.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    this.mImage3.setImageResource(R.mipmap.image_invisible);
                } else {
                    this.f35494r = true;
                    this.mEd3.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    this.mImage3.setImageResource(R.mipmap.image_see);
                }
                EditText editText3 = this.mEd3;
                editText3.setSelection(editText3.getText().length());
                break;
        }
    }

    @Override // in.b, in.a, androidx.appcompat.app.e, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.f35495s;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f35495s = null;
        }
    }

    @Override // em.h.b
    public void z() {
        z5();
    }
}
