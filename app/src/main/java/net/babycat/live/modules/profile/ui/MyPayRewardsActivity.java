package net.babycat.live.modules.profile.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.r0;
import ao.t0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.gyf.immersionbar.ImmersionBar;
import em.h0;
import f.n0;
import in.b;
import java.util.ArrayList;
import java.util.List;
import jm.y1;
import net.babycat.live.model.ChargeWeekRankBean;
import net.babycat.live.model.PayRewardsBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.SnapUpCountDownTimerView;
import net.babycat.live.platform.widget.view.Topbar;
import q7.g;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class MyPayRewardsActivity extends b<y1> implements h0.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35734n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SnapUpCountDownTimerView f35735o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f35736p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public RecyclerView f35737q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f35738r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f35739s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f35740t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List<ChargeWeekRankBean> f35741u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r0 f35742v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f35743w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f35744x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public t0 f35745y;

    public class a implements g {
        public a() {
        }

        @Override // q7.g
        public void a(@n0 BaseQuickAdapter<?, ?> baseQuickAdapter, @n0 View view, int i10) {
            if (t.t0()) {
                ChargeWeekRankBean chargeWeekRankBean = (ChargeWeekRankBean) baseQuickAdapter.getData().get(i10);
                Bundle bundle = new Bundle();
                bundle.putInt("my_space_uid", chargeWeekRankBean.getUid().intValue());
                MyPayRewardsActivity.this.p5(MySpaceActivity.class, bundle);
            }
        }
    }

    @Override // em.h0.b
    public void O4(PayRewardsBean payRewardsBean) {
        if (payRewardsBean.getRemainingTime().longValue() > 0) {
            this.f35735o.setTime(Long.valueOf(payRewardsBean.getRemainingTime().longValue() * 1000));
            this.f35735o.start();
        }
        this.f35736p.setText(String.valueOf(payRewardsBean.getWeekCharge()));
        this.f35742v = new r0(payRewardsBean.getRewardInfo(), payRewardsBean.getWeekCharge());
        this.f35737q.setLayoutManager(new LinearLayoutManager(this));
        this.f35737q.setAdapter(this.f35742v);
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_pay_rewards;
    }

    @Override // in.a
    public void g5() {
        this.f35734n = (Topbar) findViewById(R.id.common_topbar);
        this.f35735o = (SnapUpCountDownTimerView) findViewById(R.id.timer_down);
        this.f35736p = (TextView) findViewById(R.id.tv_amount);
        this.f35737q = (RecyclerView) findViewById(R.id.rv_list);
        this.f35743w = findViewById(R.id.tv_now);
        this.f35744x = findViewById(R.id.tv_weekly);
        this.f35743w.setOnClickListener(this);
        this.f35744x.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        ImmersionBar.with(this).fitsSystemWindows(false).transparentStatusBar().statusBarDarkFont(false).init();
        t.S0(this, this.f35734n, getString(R.string.recharge_rewards));
        this.f35734n.setTabBoldGone();
        this.f35734n.setTopBarWhite();
        t0 t0Var = new t0(new ArrayList());
        this.f35745y = t0Var;
        t0Var.c1(R.layout.view_state_empty_anchor_apply);
        ((y1) this.f27702e).u1();
        ((y1) this.f27702e).R();
        this.f35745y.c(new a());
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        if (t.t0()) {
            int id2 = view.getId();
            if (id2 != R.id.tv_now) {
                if (id2 != R.id.tv_weekly) {
                    return;
                }
                o5(MyPayRechWeeklyActivity.class);
            } else if (zn.a.l().j(MyPayActivity.class)) {
                finish();
            } else {
                o5(MyPayActivity.class);
            }
        }
    }

    @Override // in.b, in.a, androidx.appcompat.app.e, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        SnapUpCountDownTimerView snapUpCountDownTimerView = this.f35735o;
        if (snapUpCountDownTimerView != null) {
            snapUpCountDownTimerView.stop();
        }
        super.onDestroy();
    }

    @Override // em.h0.b
    public void p0(List<ChargeWeekRankBean> list) {
        k3();
        this.f35741u.clear();
        this.f35745y.v1(new ArrayList());
    }
}
