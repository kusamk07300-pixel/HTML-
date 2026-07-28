package net.babycat.live.modules.profile.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import em.s0;
import in.b;
import jm.g3;
import net.babycat.live.model.WithdrawInfoBean;
import net.babycat.live.platform.util.a0;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import net.babycat.live.shell.WebViewActivity;
import ok.e;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class MyWithdrawActivity extends b<g3> implements s0.b {
    public TextView A;
    public TextView B;
    public TextView C;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public WithdrawInfoBean f35893n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public WithdrawInfoBean.BankInfoDTO f35894o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Topbar f35895p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f35896q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f35897r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f35898s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public EditText f35899t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f35900u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f35901v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinearLayout f35902w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f35903x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f35904y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f35905z;

    public class a implements Topbar.TopbarRightClickListener {
        public a() {
        }

        @Override // net.babycat.live.platform.widget.view.Topbar.TopbarRightClickListener
        public void rightClick() {
            if (t.t0()) {
                MyWithdrawActivity.this.o5(WithdrawalRecordsActivity.class);
            }
        }
    }

    @Override // em.s0.b
    public void S0(int i10) {
        a0.a(new b0(e.WITHDRAWAL_COMPLETED, Integer.valueOf(i10)));
        finish();
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_my_withdraw;
    }

    @Override // in.a
    public void g5() {
        this.f35895p = (Topbar) findViewById(R.id.common_topbar);
        this.f35896q = (ImageView) findViewById(R.id.iv_what);
        this.f35897r = (TextView) findViewById(R.id.tv_virtually);
        this.f35898s = (TextView) findViewById(R.id.tv_current);
        this.f35899t = (EditText) findViewById(R.id.ed_gold);
        this.f35900u = (TextView) findViewById(R.id.tv_all);
        this.f35901v = (TextView) findViewById(R.id.tv_binding_name);
        this.f35902w = (LinearLayout) findViewById(R.id.lin_method);
        this.f35903x = (TextView) findViewById(R.id.tv_one);
        this.f35904y = (TextView) findViewById(R.id.tv_two);
        this.f35905z = (TextView) findViewById(R.id.tv_three);
        this.A = (TextView) findViewById(R.id.tv_four);
        this.B = (TextView) findViewById(R.id.tv_five);
        this.C = (TextView) findViewById(R.id.tv_confirm);
        this.f35900u.setOnClickListener(this);
        this.f35902w.setOnClickListener(this);
        this.C.setOnClickListener(this);
        this.f35896q.setOnClickListener(this);
    }

    @Override // em.s0.b
    public void h2(WithdrawInfoBean withdrawInfoBean) {
        this.f35893n = withdrawInfoBean;
        this.f35897r.setText(String.valueOf(withdrawInfoBean.getTicket()));
        this.f35898s.setText("$" + withdrawInfoBean.getMoney());
        this.f35903x.setText("1.Withdrawal ratio:" + withdrawInfoBean.getWithdrawRate());
        this.f35904y.setText("2.Withdrawal interval duration:" + withdrawInfoBean.getWithdrawDays() + getString(R.string.days));
        this.f35905z.setText("3.Minimum withdrawal of diamonds:" + withdrawInfoBean.getWithdrawMinDiamonds());
        this.A.setText("4.Withdraw Day Max Diamonds:" + withdrawInfoBean.getWithdrawDayMaxDiamonds());
        this.B.setText("5.Withdrawal handling fee:" + withdrawInfoBean.getWithdrawFeeRateOffical() + "%");
        if (!TextUtils.isEmpty(withdrawInfoBean.getHelpUrl())) {
            this.f35896q.setVisibility(0);
        }
        if (withdrawInfoBean.getAuthWithdraw().getProcess().intValue() == 1) {
            this.C.setText("Withdrawal in progress");
            return;
        }
        if (withdrawInfoBean.getAuthWithdraw().getProcess().intValue() == 0 && withdrawInfoBean.getAuthWithdraw().getHadLimit().intValue() == 1) {
            this.C.setText("Withdrawal interval duration:" + withdrawInfoBean.getWithdrawDays() + getString(R.string.days));
        }
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.f35895p, getString(R.string.withdrawal));
        this.f35895p.setRightTxtVisible();
        this.f35895p.setRightText(getString(R.string.withdrawal_records));
        this.f35895p.setOnTopbarRightClickListener(new a());
        ((g3) this.f27702e).h1();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        WithdrawInfoBean withdrawInfoBean;
        WithdrawInfoBean withdrawInfoBean2;
        switch (view.getId()) {
            case R.id.iv_what /* 2131363078 */:
                if (t.t0() && !TextUtils.isEmpty(this.f35893n.getHelpUrl())) {
                    Bundle bundle = new Bundle();
                    bundle.putString("title", getString(R.string.explain));
                    bundle.putString("url", this.f35893n.getHelpUrl());
                    p5(WebViewActivity.class, bundle);
                    break;
                }
                break;
            case R.id.lin_method /* 2131363176 */:
                if (t.t0() && (withdrawInfoBean = this.f35893n) != null) {
                    if (withdrawInfoBean.getAuthWithdraw().getProcess().intValue() == 1) {
                        v5("Withdrawal in progress");
                    } else if (this.f35893n.getAuthWithdraw().getProcess().intValue() == 0 && this.f35893n.getAuthWithdraw().getHadLimit().intValue() == 1) {
                        v5("Withdrawal interval duration:" + this.f35893n.getWithdrawDays() + getString(R.string.days));
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putSerializable("data", this.f35893n);
                        p5(WithdrawInfoActivity.class, bundle2);
                    }
                    break;
                }
                break;
            case R.id.tv_all /* 2131364210 */:
                WithdrawInfoBean withdrawInfoBean3 = this.f35893n;
                if (withdrawInfoBean3 != null && withdrawInfoBean3.getTicket().intValue() > 0) {
                    this.f35899t.setText(String.valueOf(this.f35893n.getTicket()));
                    EditText editText = this.f35899t;
                    editText.setSelection(editText.getText().length());
                }
                break;
            case R.id.tv_confirm /* 2131364269 */:
                if (t.t0() && (withdrawInfoBean2 = this.f35893n) != null) {
                    if (withdrawInfoBean2.getAuthWithdraw().getProcess().intValue() == 1) {
                        v5("Withdrawal in progress");
                    } else if (this.f35893n.getAuthWithdraw().getProcess().intValue() == 0 && this.f35893n.getAuthWithdraw().getHadLimit().intValue() == 1) {
                        v5("Withdrawal interval duration:" + this.f35893n.getWithdrawDays() + getString(R.string.days));
                    } else if (TextUtils.isEmpty(this.f35899t.getText().toString())) {
                        v5(getString(R.string.input_prompt));
                    } else if (this.f35894o == null) {
                        v5("Please select a withdrawal channel");
                    } else if (Long.parseLong(this.f35899t.getText().toString()) < this.f35893n.getWithdrawMinDiamonds().doubleValue()) {
                        v5("Withdrawing diamonds below the minimum withdrawal quantity");
                    } else if (Long.parseLong(this.f35899t.getText().toString()) <= this.f35893n.getWithdrawDayMaxDiamonds().doubleValue()) {
                        ((g3) this.f27702e).C1(0, this.f35894o.getType().intValue(), this.f35899t.getText().toString());
                    } else {
                        v5("Withdrawing diamonds exceeds the maximum daily quantity");
                    }
                    break;
                }
                break;
        }
    }

    @Override // in.b
    public void onReceiveEvent(b0 b0Var) {
        super.onReceiveEvent(b0Var);
        if (b0Var.a() != 1085) {
            return;
        }
        WithdrawInfoBean.BankInfoDTO bankInfoDTO = (WithdrawInfoBean.BankInfoDTO) b0Var.b();
        this.f35894o = bankInfoDTO;
        this.f35893n.setOfficialInfo(bankInfoDTO);
        if (this.f35894o.getType().intValue() == 3) {
            this.f35901v.setText("Bank Transfer");
        } else if (this.f35894o.getType().intValue() == 5) {
            this.f35901v.setText("USDT");
        } else {
            this.f35901v.setText("Mobile Wallet");
        }
    }
}
