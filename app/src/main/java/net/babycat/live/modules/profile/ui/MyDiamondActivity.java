package net.babycat.live.modules.profile.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import em.t;
import in.b;
import jm.s0;
import net.babycat.live.model.AnchorVerifyBean;
import net.babycat.live.model.MyIncomeHomBean;
import net.babycat.live.model.UserInfoDataBean;
import net.babycat.live.modules.creator.ui.LiveRecordsActivity;
import net.babycat.live.platform.widget.view.Topbar;
import org.litepal.LitePal;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class MyDiamondActivity extends b<s0> implements t.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35609n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f35610o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f35611p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f35612q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f35613r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public UserInfoDataBean f35614s;

    public class a implements Topbar.TopbarRightClickListener {
        public a() {
        }

        @Override // net.babycat.live.platform.widget.view.Topbar.TopbarRightClickListener
        public void rightClick() {
            MyDiamondActivity.this.o5(LiveRecordsActivity.class);
        }
    }

    @Override // em.t.b
    public void B1(MyIncomeHomBean myIncomeHomBean) {
        this.f35611p.setText(String.valueOf(myIncomeHomBean.getDiamonds()));
        if (myIncomeHomBean.getExchangeSwitch().intValue() == 1) {
            this.f35610o.setVisibility(0);
        }
        if (myIncomeHomBean.getTransferSwitch().intValue() == 1) {
            this.f35613r.setVisibility(0);
        }
        if (myIncomeHomBean.getWithdrawSwitch().intValue() == 1) {
            this.f35612q.setVisibility(0);
        }
    }

    @Override // in.a
    public int e5() {
        return R.layout.fragment_my_diamond;
    }

    @Override // in.a
    public void g5() {
        this.f35609n = (Topbar) findViewById(R.id.common_topbar);
        this.f35610o = (TextView) findViewById(R.id.tv_exchange);
        this.f35611p = (TextView) findViewById(R.id.tv_account);
        this.f35612q = (TextView) findViewById(R.id.tv_withdrawal);
        this.f35613r = (TextView) findViewById(R.id.tv_transfer);
        this.f35610o.setOnClickListener(this);
        this.f35612q.setOnClickListener(this);
        this.f35613r.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        m5(true);
        net.babycat.live.platform.util.t.S0(this, this.f35609n, getString(R.string.income));
        this.f35614s = (UserInfoDataBean) LitePal.findFirst(UserInfoDataBean.class);
        this.f35609n.setTransparent();
        this.f35609n.setRightTxtVisible();
        this.f35609n.setRightText(getString(R.string.anchor_records));
        this.f35609n.setOnTopbarRightClickListener(new a());
    }

    @Override // em.t.b
    public void i0(AnchorVerifyBean anchorVerifyBean) {
        if (Integer.parseInt(anchorVerifyBean.getIsAuth()) == 2) {
            this.f35614s.setIs_auth(Integer.valueOf(Integer.parseInt(anchorVerifyBean.getIsAuth())));
            this.f35614s.save();
            o5(MyWithdrawActivity.class);
        } else {
            Bundle bundle = new Bundle();
            bundle.putSerializable("data", anchorVerifyBean);
            v5("Need certification!");
            p5(LiveUserCenterAuthentActivity.class, bundle);
        }
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.tv_exchange) {
            if (net.babycat.live.platform.util.t.t0()) {
                o5(MyGoldExchangeActivity.class);
            }
        } else if (id2 == R.id.tv_transfer) {
            if (net.babycat.live.platform.util.t.t0()) {
                o5(MyTransferActivity.class);
            }
        } else if (id2 == R.id.tv_withdrawal && net.babycat.live.platform.util.t.t0()) {
            ((s0) this.f27702e).y();
        }
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        ((s0) this.f27702e).L4();
    }
}
