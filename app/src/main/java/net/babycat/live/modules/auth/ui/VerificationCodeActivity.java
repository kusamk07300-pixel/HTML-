package net.babycat.live.modules.auth.ui;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import net.babycat.live.model.LoginDataBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.x1;
import net.babycat.live.shell.MainActivity;
import pk.h;
import qk.o;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class VerificationCodeActivity extends in.b<o> implements h.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RelativeLayout f35011n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public EditText f35012o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView[] f35013p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public StringBuffer f35014q = new StringBuffer();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f35015r = 4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f35016s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f35017t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f35018u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f35019v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f35020w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f35021x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public x1 f35022y;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.toString().equals("")) {
                return;
            }
            if (VerificationCodeActivity.this.f35014q.length() > 3) {
                VerificationCodeActivity.this.f35012o.setText("");
                return;
            }
            VerificationCodeActivity.this.f35014q.append((CharSequence) editable);
            VerificationCodeActivity.this.f35012o.setText("");
            VerificationCodeActivity verificationCodeActivity = VerificationCodeActivity.this;
            verificationCodeActivity.f35015r = verificationCodeActivity.f35014q.length();
            VerificationCodeActivity verificationCodeActivity2 = VerificationCodeActivity.this;
            verificationCodeActivity2.f35016s = verificationCodeActivity2.f35014q.toString();
            if (VerificationCodeActivity.this.f35014q.length() == 4) {
                ((o) VerificationCodeActivity.this.f27702e).U3("mobile", VerificationCodeActivity.this.f35017t, VerificationCodeActivity.this.f35016s, VerificationCodeActivity.this.f35021x, VerificationCodeActivity.this.f35020w, VerificationCodeActivity.this.f35019v, VerificationCodeActivity.this.f35018u);
            }
            for (int i10 = 0; i10 < VerificationCodeActivity.this.f35014q.length(); i10++) {
                VerificationCodeActivity.this.f35013p[i10].setText(String.valueOf(VerificationCodeActivity.this.f35016s.charAt(i10)));
                VerificationCodeActivity.this.f35013p[i10].setBackgroundResource(R.drawable.bg_user_verify_code_active);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class b implements View.OnKeyListener {
        public b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (i10 != 67 || keyEvent.getAction() != 0) {
                return false;
            }
            VerificationCodeActivity.this.J5();
            return true;
        }
    }

    public void I5() {
        StringBuffer stringBuffer = this.f35014q;
        int i10 = 0;
        stringBuffer.delete(0, stringBuffer.length());
        this.f35016s = this.f35014q.toString();
        while (true) {
            TextView[] textViewArr = this.f35013p;
            if (i10 >= textViewArr.length) {
                return;
            }
            textViewArr[i10].setText("");
            this.f35013p[i10].setBackgroundResource(R.drawable.bg_f7f8fa_r12);
            i10++;
        }
    }

    public boolean J5() {
        if (this.f35015r == 0) {
            this.f35015r = 4;
            return true;
        }
        if (this.f35014q.length() <= 0) {
            return false;
        }
        StringBuffer stringBuffer = this.f35014q;
        int i10 = this.f35015r;
        stringBuffer.delete(i10 - 1, i10);
        this.f35015r--;
        this.f35016s = this.f35014q.toString();
        this.f35013p[this.f35014q.length()].setText("");
        this.f35013p[this.f35014q.length()].setBackgroundResource(R.drawable.bg_f7f8fa_r12);
        return false;
    }

    public final void K5() {
        this.f35012o.addTextChangedListener(new a());
        this.f35012o.setOnKeyListener(new b());
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_verification_code;
    }

    @Override // pk.h.b
    public void f(LoginDataBean loginDataBean) {
        if (loginDataBean.getLoginCount().intValue() != -1) {
            this.f35022y.q("user_id", loginDataBean.getUserId().intValue());
            this.f35022y.s("token", "Bearer " + loginDataBean.getToken());
            this.f35022y.s("hx_password", loginDataBean.getHxPassword());
            this.f35022y.s("user_sig", loginDataBean.getUser_sig());
            this.f35022y.s("user_sig_im", loginDataBean.getUserSigIm());
            this.f35022y.o("isLogin", true);
            o5(MainActivity.class);
            finish();
            return;
        }
        this.f35022y.q("user_id", loginDataBean.getUserId().intValue());
        this.f35022y.s("token", "Bearer " + loginDataBean.getToken());
        this.f35022y.s("hx_password", loginDataBean.getHxPassword());
        this.f35022y.s("user_sig", loginDataBean.getUser_sig());
        this.f35022y.o("isLogin", true);
        this.f35022y.s("user_sig_im", loginDataBean.getUserSigIm());
        Bundle bundle = new Bundle();
        bundle.putSerializable("data", loginDataBean);
        p5(LoginUserInfoActivity.class, bundle);
    }

    @Override // in.a
    public void g5() {
        this.f35011n = (RelativeLayout) findViewById(R.id.rel_top);
        this.f35012o = (EditText) findViewById(R.id.et);
    }

    @Override // in.a
    public void h5() {
        this.f35017t = getIntent().getStringExtra("mobile_login");
        this.f35018u = t.U();
        this.f35019v = t.z();
        this.f35020w = t.V();
        this.f35021x = t.b0(getApplicationContext());
        this.f35022y = new x1(this);
        TextView[] textViewArr = new TextView[4];
        this.f35013p = textViewArr;
        textViewArr[0] = (TextView) findViewById(R.id.item_code_iv1);
        this.f35013p[1] = (TextView) findViewById(R.id.item_code_iv2);
        this.f35013p[2] = (TextView) findViewById(R.id.item_code_iv3);
        this.f35013p[3] = (TextView) findViewById(R.id.item_code_iv4);
        this.f35012o.setCursorVisible(false);
        K5();
    }

    @Override // in.a
    public View k5() {
        return this.f35011n;
    }
}
