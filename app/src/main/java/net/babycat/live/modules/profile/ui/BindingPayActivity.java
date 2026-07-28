package net.babycat.live.modules.profile.ui;

import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import em.e;
import java.util.HashMap;
import jm.i;
import net.babycat.live.model.AgadminBean;
import net.babycat.live.model.BalanceBean;
import net.babycat.live.model.WithdrawOrderBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;
import xn.n3;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class BindingPayActivity extends in.b<i> implements e.b {
    public String A;
    public String B = "";
    public double C = 0.0d;
    public Long D = 0L;
    public Handler E = new Handler();
    public Runnable F;
    public Topbar mCommonTopbar;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public EditText f35453n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f35454o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ConstraintLayout f35455p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f35456q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinearLayout f35457r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LinearLayout f35458s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f35459t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public EditText f35460u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ImageView f35461v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f35462w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f35463x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public LinearLayout f35464y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f35465z;

    public class a implements Topbar.TopbarRightClickListener {
        public a() {
        }

        @Override // net.babycat.live.platform.widget.view.Topbar.TopbarRightClickListener
        public void rightClick() {
            BindingPayActivity.this.o5(WithdrawalRecordsActivity.class);
        }
    }

    public class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            BindingPayActivity.this.F5(editable.toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string = editable.toString();
            if (TextUtils.isEmpty(string) || BindingPayActivity.this.C == 0.0d) {
                BindingPayActivity.this.D = 0L;
            } else {
                BindingPayActivity bindingPayActivity = BindingPayActivity.this;
                bindingPayActivity.D = bindingPayActivity.D5(Math.ceil(Double.valueOf(string).doubleValue() / BindingPayActivity.this.C));
            }
            BindingPayActivity bindingPayActivity2 = BindingPayActivity.this;
            bindingPayActivity2.f35456q.setText(String.valueOf(bindingPayActivity2.D));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            String string = charSequence.toString();
            if (TextUtils.isEmpty(string) || TextUtils.isDigitsOnly(string)) {
                return;
            }
            BindingPayActivity.this.f35460u.setText(String.valueOf(Integer.parseInt(string.replaceAll("[\\D]", ""))));
            EditText editText = BindingPayActivity.this.f35460u;
            editText.setSelection(editText.getText().length());
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35469a;

        public d(String str) {
            this.f35469a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((i) BindingPayActivity.this.f27702e).r2(this.f35469a);
            wo.b.b("提现ID： 输入结束", new Object[0]);
        }
    }

    public class e implements n3.a {
        public e() {
        }

        @Override // xn.n3.a
        public void a(String str, String str2, String str3, int i10) {
            BindingPayActivity bindingPayActivity = BindingPayActivity.this;
            bindingPayActivity.l2(bindingPayActivity.getString(R.string.loading));
            ((i) BindingPayActivity.this.f27702e).c3(str, str2, str3, i10);
        }
    }

    public final Long D5(double d10) {
        return Long.valueOf(d10 % 1.0d < 0.5d ? (long) d10 : ((long) d10) + 1);
    }

    public final boolean E5() {
        this.A = this.f35460u.getText().toString();
        if (TextUtils.isEmpty(this.B)) {
            v5(getString(R.string.user_does_not_exist));
            return false;
        }
        if (!TextUtils.isEmpty(this.A) && t.A0(this.A) && Double.valueOf(this.A).doubleValue() > 0.0d) {
            return true;
        }
        v5(getString(R.string.Please_fill_in_the_withdrawal_amount));
        return false;
    }

    public void F5(String str) {
        Runnable runnable = this.F;
        if (runnable != null) {
            this.E.removeCallbacks(runnable);
            wo.b.b("提现ID： handler删除监听倒计时", new Object[0]);
        }
        Handler handler = this.E;
        d dVar = new d(str);
        this.F = dVar;
        handler.postDelayed(dVar, 500L);
    }

    public final void G5() {
        if (E5()) {
            l2(getString(R.string.loading));
            HashMap map = new HashMap();
            map.put("agadmin_id", this.B);
            map.put("coin", this.A);
            map.put("diamond", String.valueOf(this.D));
            ((i) this.f27702e).L0(map);
        }
    }

    @Override // em.e.b
    public void J0() {
        wn.d.c(this, Integer.valueOf(R.mipmap.image_user), this.f35461v);
        this.B = "";
        this.f35462w.setText("");
        this.f35463x.setText("");
        this.f35464y.setVisibility(8);
        this.C = 0.0d;
        this.D = 0L;
        this.f35456q.setText(String.valueOf((Object) 0L));
    }

    @Override // em.e.b
    public void P3(BalanceBean balanceBean) {
        this.f35459t.setText(balanceBean.getBalance());
    }

    @Override // em.e.b
    public void X1() {
        k3();
        v5(getString(R.string.success));
        ((i) this.f27702e).r1();
    }

    @Override // em.e.b
    public void c2(AgadminBean agadminBean) {
        if (!TextUtils.isEmpty(agadminBean.getPortrait())) {
            wn.d.f(this, this.f35461v, agadminBean.getPortrait());
        }
        this.B = String.valueOf(agadminBean.getId());
        this.f35462w.setText(agadminBean.getNickname());
        this.f35463x.setText("ID: " + agadminBean.getId());
        this.f35464y.setVisibility(0);
        this.C = Double.valueOf(agadminBean.getRate()).doubleValue();
        String string = this.f35460u.getText().toString();
        if (TextUtils.isEmpty(string)) {
            this.D = 0L;
        } else {
            this.D = D5(Math.ceil(Double.valueOf(string).doubleValue() / this.C));
        }
        this.f35456q.setText(String.valueOf(this.D));
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_binding_pay;
    }

    @Override // in.a
    public void g5() {
        this.mCommonTopbar = (Topbar) findViewById(R.id.common_topbar);
        this.f35453n = (EditText) findViewById(R.id.realName);
        this.f35454o = (LinearLayout) findViewById(R.id.linearLayout2);
        this.f35455p = (ConstraintLayout) findViewById(R.id.constraintLayout4);
        this.f35456q = (TextView) findViewById(R.id.tv_expected);
        this.f35457r = (LinearLayout) findViewById(R.id.sure);
        this.f35458s = (LinearLayout) findViewById(R.id.paymentLayout);
        this.f35459t = (TextView) findViewById(R.id.tv_balance);
        this.f35460u = (EditText) findViewById(R.id.et_reward_num);
        this.f35461v = (ImageView) findViewById(R.id.iv_header);
        this.f35462w = (TextView) findViewById(R.id.tv_nickname);
        this.f35463x = (TextView) findViewById(R.id.tv_uid);
        this.f35464y = (LinearLayout) findViewById(R.id.lin_user);
        this.f35457r.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.mCommonTopbar, getString(R.string.withdrawal));
        this.mCommonTopbar.setRightTxtVisible();
        this.mCommonTopbar.setRightText(getString(R.string.withdrawal_records));
        this.mCommonTopbar.setOnTopbarRightClickListener(new a());
        ((i) this.f27702e).r1();
        this.f35453n.addTextChangedListener(new b());
        this.f35460u.addTextChangedListener(new c());
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // em.e.b
    public void m4(WithdrawOrderBean withdrawOrderBean) {
        k3();
        new b.C0752b(this).Y(true).t(new n3(this, withdrawOrderBean, new e())).N();
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.sure) {
            return;
        }
        G5();
    }
}
