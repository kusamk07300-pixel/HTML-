package net.babycat.live.modules.profile.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import em.u0;
import in.b;
import jm.m3;
import net.babycat.live.model.WithdrawInfoBean;
import net.babycat.live.platform.util.a0;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import net.babycat.live.shell.WebViewActivity;
import ok.e;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class WithdrawInfoActivity extends b<m3> implements u0.b {
    public EditText A;
    public TextView B;
    public EditText C;
    public TextView D;
    public EditText E;
    public TextView F;
    public EditText G;
    public EditText H;
    public EditText I;
    public TextView J;
    public TextView K;
    public TextView L;
    public EditText M;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public WithdrawInfoBean f35920n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35921o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f35922p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Topbar f35923q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f35924r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f35925s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LinearLayout f35926t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public EditText f35927u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f35928v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public EditText f35929w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f35930x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public EditText f35931y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f35932z;

    public class a implements Topbar.TopbarRightClickListener {
        public a() {
        }

        @Override // net.babycat.live.platform.widget.view.Topbar.TopbarRightClickListener
        public void rightClick() {
            if (!t.t0() || TextUtils.isEmpty(WithdrawInfoActivity.this.f35920n.getHelpUrl())) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("title", WithdrawInfoActivity.this.getString(R.string.explain));
            bundle.putString("url", WithdrawInfoActivity.this.f35920n.getHelpUrl());
            WithdrawInfoActivity.this.p5(WebViewActivity.class, bundle);
        }
    }

    private void y5() {
        if (TextUtils.isEmpty(this.f35920n.getOfficialInfo().getName())) {
            this.f35927u.setText(this.f35920n.getOfficialInfo().getName());
        }
        this.f35929w.setText(this.f35920n.getOfficialInfo().getMobile());
        this.f35929w.setText(this.f35920n.getOfficialInfo().getAccount());
        this.A.setText(this.f35920n.getOfficialInfo().getAccountBank());
        this.C.setText(this.f35920n.getOfficialInfo().getBranchBank());
        this.H.setText(this.f35920n.getOfficialInfo().getWhatsapp());
        this.I.setText(this.f35920n.getOfficialInfo().getRemark());
        this.G.setText(this.f35920n.getOfficialInfo().getUpiId());
        this.E.setText(this.f35920n.getOfficialInfo().getUpiId());
        this.f35927u.setText(this.f35920n.getOfficialInfo().getName());
        this.M.setText(this.f35920n.getOfficialInfo().getUsdtCode());
    }

    @Override // em.u0.b
    public void X0() {
        this.f35920n.getOfficialInfo().setType(Integer.valueOf(this.f35921o));
        this.f35920n.getOfficialInfo().setWhatsapp(this.H.getText().toString());
        this.f35920n.getOfficialInfo().setRemark(this.I.getText().toString());
        int i10 = this.f35921o;
        if (i10 == 3) {
            this.f35920n.getOfficialInfo().setAccount(this.f35931y.getText().toString());
            this.f35920n.getOfficialInfo().setAccountBank(this.A.getText().toString());
            this.f35920n.getOfficialInfo().setBranchBank(this.C.getText().toString());
        } else if (i10 == 5) {
            this.f35920n.getOfficialInfo().setUsdtCode(this.M.getText().toString());
        } else {
            this.f35920n.getOfficialInfo().setMobile(this.f35929w.getText().toString());
            this.f35920n.getOfficialInfo().setUpiId(this.E.getText().toString());
        }
        a0.a(new b0(e.BIND_WITHDRAWAL_TYPE, this.f35920n.getOfficialInfo()));
        finish();
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_withdraw_info;
    }

    @Override // in.a
    public void g5() {
        this.f35923q = (Topbar) findViewById(R.id.common_topbar);
        this.f35924r = (TextView) findViewById(R.id.tv_bank);
        this.f35925s = (TextView) findViewById(R.id.tv_pull_mobile);
        this.f35926t = (LinearLayout) findViewById(R.id.lin_bank);
        this.f35927u = (EditText) findViewById(R.id.tv_holder_name);
        this.f35928v = (TextView) findViewById(R.id.tv_phone);
        this.f35929w = (EditText) findViewById(R.id.ed_phone);
        this.f35930x = (TextView) findViewById(R.id.tv_account_number);
        this.f35931y = (EditText) findViewById(R.id.ed_name);
        this.f35932z = (TextView) findViewById(R.id.tv_bank_names);
        this.A = (EditText) findViewById(R.id.ed_bank_name);
        this.B = (TextView) findViewById(R.id.tv_branch_names);
        this.C = (EditText) findViewById(R.id.ed_branch_names);
        this.D = (TextView) findViewById(R.id.tv_upi_id);
        this.E = (EditText) findViewById(R.id.ed_upi_id);
        this.F = (TextView) findViewById(R.id.tv_confirm_upi_id);
        this.G = (EditText) findViewById(R.id.ed_confirm_upi_id);
        this.H = (EditText) findViewById(R.id.ed_whats_app);
        this.I = (EditText) findViewById(R.id.ed_remarks);
        this.J = (TextView) findViewById(R.id.tv_submit);
        this.K = (TextView) findViewById(R.id.tv_usdt);
        this.L = (TextView) findViewById(R.id.tv_usdt_code);
        this.M = (EditText) findViewById(R.id.ed_usdt_code);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.f35923q, getString(R.string.fill_the_information));
        WithdrawInfoBean withdrawInfoBean = (WithdrawInfoBean) getIntent().getSerializableExtra("data");
        this.f35920n = withdrawInfoBean;
        if (!TextUtils.isEmpty(withdrawInfoBean.getHelpUrl())) {
            this.f35923q.setRightVisible();
            this.f35923q.setRigtImage(R.mipmap.what);
            this.f35923q.setOnTopbarRightClickListener(new a());
        }
        y5();
        this.f35924r.setOnClickListener(this);
        this.f35925s.setOnClickListener(this);
        this.J.setOnClickListener(this);
        this.K.setOnClickListener(this);
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_bank /* 2131364225 */:
                this.f35924r.setBackgroundResource(R.drawable.bg_bindspay_bj);
                this.f35925s.setBackgroundResource(0);
                this.K.setBackgroundResource(0);
                this.f35930x.setVisibility(0);
                this.f35932z.setVisibility(0);
                this.B.setVisibility(0);
                this.A.setVisibility(0);
                this.f35931y.setVisibility(0);
                this.C.setVisibility(0);
                this.f35928v.setVisibility(8);
                this.f35929w.setVisibility(8);
                this.F.setVisibility(8);
                this.G.setVisibility(8);
                this.D.setVisibility(8);
                this.E.setVisibility(8);
                this.L.setVisibility(8);
                this.M.setVisibility(8);
                this.f35921o = 3;
                break;
            case R.id.tv_pull_mobile /* 2131364526 */:
                this.f35925s.setBackgroundResource(R.drawable.bg_bindspay_bj);
                this.f35924r.setBackgroundResource(0);
                this.K.setBackgroundResource(0);
                this.f35928v.setVisibility(0);
                this.f35929w.setVisibility(0);
                this.f35930x.setVisibility(8);
                this.f35932z.setVisibility(8);
                this.B.setVisibility(8);
                this.f35931y.setVisibility(8);
                this.A.setVisibility(8);
                this.C.setVisibility(8);
                this.L.setVisibility(8);
                this.M.setVisibility(8);
                this.F.setVisibility(8);
                this.G.setVisibility(8);
                this.D.setVisibility(8);
                this.E.setVisibility(8);
                this.f35921o = 7;
                break;
            case R.id.tv_submit /* 2131364610 */:
                if (t.t0()) {
                    if (!TextUtils.isEmpty(this.f35927u.getText().toString())) {
                        int i10 = this.f35921o;
                        if (i10 != 3) {
                            if (i10 != 5) {
                                if (TextUtils.isEmpty(this.f35929w.getText().toString())) {
                                    v5("Enter the phone number associated with the wallet");
                                } else if (!TextUtils.isEmpty(this.H.getText().toString())) {
                                    if (!this.f35922p.equalsIgnoreCase("IN")) {
                                        if (this.f35922p.equalsIgnoreCase("PH") && TextUtils.isEmpty(this.E.getText().toString())) {
                                            v5("Enter Confirm Gcash Number");
                                        }
                                    } else if (TextUtils.isEmpty(this.E.getText().toString())) {
                                        v5("Enter Confirm UPI ID");
                                    }
                                    if (!this.E.getText().toString().equals(this.G.getText().toString())) {
                                        v5("Two inputs are inconsistent");
                                    }
                                } else {
                                    v5("Please enter WhatsApp");
                                }
                                break;
                            } else if (TextUtils.isEmpty(this.f35929w.getText().toString())) {
                                v5("Enter the phone number associated with the wallet");
                            } else if (TextUtils.isEmpty(this.M.getText().toString())) {
                                v5(getString(R.string.enter_usdt_address));
                            } else if (TextUtils.isEmpty(this.H.getText().toString())) {
                                v5("Please enter WhatsApp");
                            }
                        } else if (TextUtils.isEmpty(this.f35931y.getText().toString())) {
                            v5("Please enter your account number");
                        } else if (TextUtils.isEmpty(this.A.getText().toString())) {
                            v5("Please enter the bank name");
                        } else if (TextUtils.isEmpty(this.C.getText().toString())) {
                            v5("Please enter the Branch bank name");
                        }
                        ((m3) this.f27702e).k3(this.f35921o, this.f35927u.getText().toString(), this.f35921o == 3 ? this.f35931y.getText().toString() : "", this.f35921o == 3 ? this.A.getText().toString() : "", this.f35921o == 3 ? this.C.getText().toString() : "", this.H.getText().toString(), "", this.f35921o != 3 ? this.f35929w.getText().toString() : "", this.I.getText().toString(), this.M.getText().toString(), this.E.getText().toString());
                    } else {
                        v5("Enter full name");
                    }
                }
                break;
            case R.id.tv_usdt /* 2131364672 */:
                this.K.setBackgroundResource(R.drawable.bg_bindspay_bj);
                this.f35925s.setBackgroundResource(0);
                this.f35924r.setBackgroundResource(0);
                this.L.setVisibility(0);
                this.M.setVisibility(0);
                this.f35928v.setVisibility(0);
                this.f35929w.setVisibility(0);
                this.f35930x.setVisibility(8);
                this.f35932z.setVisibility(8);
                this.f35931y.setVisibility(8);
                this.A.setVisibility(8);
                this.B.setVisibility(8);
                this.C.setVisibility(8);
                this.f35921o = 5;
                break;
        }
    }
}
