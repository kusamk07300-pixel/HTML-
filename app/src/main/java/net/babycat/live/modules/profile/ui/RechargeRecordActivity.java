package net.babycat.live.modules.profile.ui;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.u0;
import com.gyf.immersionbar.ImmersionBar;
import com.lxj.xpopupext.popup.TimePickerPopup;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import em.t0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import jg.f;
import jm.k3;
import mg.e;
import mg.g;
import net.babycat.live.model.PayLogBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class RechargeRecordActivity extends in.b<k3> implements t0.b {
    public Topbar mCommonTopbar;
    public SmartRefreshLayout mNormalView;
    public RecyclerView mRecycler;
    public TextView mTvAdmin;
    public TextView mTvAgent;
    public TextView mTvCountCoin;
    public TextView mTvDate;
    public TextView mTvOnLine;
    public TextView mTvPayment;
    public TextView mTvRecharge;
    public TextView mTvUser;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35907n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35908o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f35909p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f35910q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u0 f35911r;

    public class a implements g {
        public a() {
        }

        @Override // mg.g
        public void onRefresh(f fVar) {
            RechargeRecordActivity.this.f35907n = 1;
            RechargeRecordActivity.this.D5();
        }
    }

    public class b implements e {
        public b() {
        }

        @Override // mg.e
        public void onLoadMore(f fVar) {
            if (RechargeRecordActivity.this.f35910q) {
                RechargeRecordActivity.this.f35907n++;
                RechargeRecordActivity.this.D5();
            } else {
                RechargeRecordActivity.this.v5("no data");
                RechargeRecordActivity.this.mNormalView.s();
                RechargeRecordActivity.this.mNormalView.S();
            }
        }
    }

    public class c implements hf.e {
        public c() {
        }

        @Override // hf.e
        public void a(Date date, View view) {
            RechargeRecordActivity.this.f35909p = t.l0(date);
            RechargeRecordActivity rechargeRecordActivity = RechargeRecordActivity.this;
            rechargeRecordActivity.mTvDate.setText(rechargeRecordActivity.f35909p);
            RechargeRecordActivity.this.D5();
        }

        @Override // hf.e
        public void b(Date date) {
        }

        @Override // hf.e
        public void onCancel() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D5() {
        ((k3) this.f27702e).V0(this.f35907n, this.f35908o, this.f35909p);
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_recharge_record;
    }

    @Override // in.a
    public void g5() {
        this.mCommonTopbar = (Topbar) findViewById(R.id.common_topbar);
        this.mTvDate = (TextView) findViewById(R.id.tv_date);
        this.mTvCountCoin = (TextView) findViewById(R.id.tv_count_coin);
        this.mTvOnLine = (TextView) findViewById(R.id.tv_on_line);
        this.mTvAgent = (TextView) findViewById(R.id.tv_agent);
        this.mRecycler = (RecyclerView) findViewById(R.id.recycler);
        this.mNormalView = (SmartRefreshLayout) findViewById(R.id.normal_view);
        this.mTvAdmin = (TextView) findViewById(R.id.tv_admin);
        this.mTvUser = (TextView) findViewById(R.id.tv_user);
        this.mTvPayment = (TextView) findViewById(R.id.tv_payment);
        this.mTvRecharge = (TextView) findViewById(R.id.tv_recharge);
        this.mTvDate.setOnClickListener(this);
        this.mTvOnLine.setOnClickListener(this);
        this.mTvAgent.setOnClickListener(this);
        this.mTvAdmin.setOnClickListener(this);
        this.mTvUser.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        ImmersionBar.with(this).fitsSystemWindows(false).transparentStatusBar().statusBarDarkFont(true).init();
        t.S0(this, this.mCommonTopbar, getString(R.string.detailed));
        this.mCommonTopbar.setTabBoldGone();
        String strL0 = t.l0(new Date());
        this.f35909p = strL0;
        this.mTvDate.setText(strL0);
        this.f35911r = new u0(new ArrayList());
        this.mRecycler.setLayoutManager(new LinearLayoutManager(this));
        this.mRecycler.setAdapter(this.f35911r);
        this.f35911r.c1(R.layout.view_state_empty_anchor_apply);
        this.mNormalView.d0(new a());
        this.mNormalView.O(new b());
        D5();
    }

    @Override // em.t0.b
    public void j2(List<PayLogBean> list, boolean z10, int i10) {
        this.mTvCountCoin.setText("" + i10);
        Iterator<PayLogBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().setType(Integer.valueOf(this.f35908o));
        }
        if (this.f35907n == 1) {
            this.f35911r.v1(list);
        } else {
            this.f35911r.w(list);
        }
        this.f35910q = z10;
        this.mNormalView.s();
        this.mNormalView.S();
    }

    @Override // in.b, ln.a
    public void k4() {
        super.k4();
        int i10 = this.f35907n;
        if (i10 != 1) {
            this.f35907n = i10 - 1;
        }
        this.mNormalView.s();
        this.mNormalView.S();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_admin /* 2131364201 */:
                this.f35908o = 3;
                this.f35907n = 1;
                this.mTvOnLine.setBackgroundResource(R.drawable.bg_record_2);
                this.mTvAgent.setBackgroundResource(R.drawable.bg_record_2);
                this.mTvUser.setBackgroundResource(R.drawable.bg_record_2);
                this.mTvAdmin.setBackgroundResource(R.drawable.bg_record_1);
                this.mTvAdmin.setTextColor(-1);
                this.mTvAgent.setTextColor(-6710887);
                this.mTvUser.setTextColor(-6710887);
                this.mTvOnLine.setTextColor(-6710887);
                this.mTvPayment.setVisibility(0);
                this.mTvRecharge.setVisibility(8);
                D5();
                break;
            case R.id.tv_agent /* 2131364207 */:
                this.f35908o = 2;
                this.f35907n = 1;
                this.mTvOnLine.setBackgroundResource(R.drawable.bg_record_2);
                this.mTvAdmin.setBackgroundResource(R.drawable.bg_record_2);
                this.mTvAgent.setBackgroundResource(R.drawable.bg_record_1);
                this.mTvUser.setBackgroundResource(R.drawable.bg_record_2);
                this.mTvAgent.setTextColor(-1);
                this.mTvOnLine.setTextColor(-6710887);
                this.mTvUser.setTextColor(-6710887);
                this.mTvAdmin.setTextColor(-6710887);
                this.mTvPayment.setVisibility(0);
                this.mTvRecharge.setVisibility(8);
                D5();
                break;
            case R.id.tv_date /* 2131364291 */:
                new b.C0752b(this).t(new TimePickerPopup(this).a0(Calendar.getInstance()).i0(new c())).N();
                break;
            case R.id.tv_on_line /* 2131364491 */:
                this.f35908o = 1;
                this.f35907n = 1;
                this.mTvOnLine.setBackgroundResource(R.drawable.bg_record_1);
                this.mTvOnLine.setTextColor(-1);
                this.mTvAgent.setTextColor(-6710887);
                this.mTvUser.setTextColor(-6710887);
                this.mTvAdmin.setTextColor(-6710887);
                this.mTvAgent.setBackgroundResource(R.drawable.bg_record_2);
                this.mTvAdmin.setBackgroundResource(R.drawable.bg_record_2);
                this.mTvUser.setBackgroundResource(R.drawable.bg_record_2);
                this.mTvPayment.setVisibility(0);
                this.mTvRecharge.setVisibility(8);
                D5();
                break;
            case R.id.tv_user /* 2131364674 */:
                this.f35908o = 4;
                this.f35907n = 1;
                this.mTvOnLine.setBackgroundResource(R.drawable.bg_record_2);
                this.mTvAgent.setBackgroundResource(R.drawable.bg_record_2);
                this.mTvAdmin.setBackgroundResource(R.drawable.bg_record_2);
                this.mTvUser.setBackgroundResource(R.drawable.bg_record_1);
                this.mTvUser.setTextColor(-1);
                this.mTvAdmin.setTextColor(-6710887);
                this.mTvAgent.setTextColor(-6710887);
                this.mTvOnLine.setTextColor(-6710887);
                this.mTvPayment.setVisibility(8);
                this.mTvRecharge.setVisibility(0);
                D5();
                break;
        }
    }
}
