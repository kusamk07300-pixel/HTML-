package net.babycat.live.modules.creator.ui;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl.e;
import cl.f;
import com.lxj.xpopupext.popup.TimePickerPopup;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import gl.k;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import mg.g;
import net.babycat.live.model.DiamondRewardsBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class DiamondRewardsActivity extends in.b<k> implements f.b {
    public RecyclerView mListView;
    public SmartRefreshLayout mNormalView;
    public TextView mTvDate;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35090n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e f35091o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35092p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f35093q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Date f35094r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f35095s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f35096t;

    public class a implements g {
        public a() {
        }

        @Override // mg.g
        public void onRefresh(jg.f fVar) {
            DiamondRewardsActivity.this.f35092p = 1;
            DiamondRewardsActivity.this.D5();
        }
    }

    public class b implements mg.e {
        public b() {
        }

        @Override // mg.e
        public void onLoadMore(jg.f fVar) {
            if (DiamondRewardsActivity.this.f35093q) {
                DiamondRewardsActivity.this.D5();
            } else {
                DiamondRewardsActivity.this.mNormalView.s();
                DiamondRewardsActivity.this.mNormalView.S();
            }
        }
    }

    public class c implements hf.e {
        public c() {
        }

        @Override // hf.e
        public void a(Date date, View view) {
            DiamondRewardsActivity.this.f35095s = t.m0(date);
            DiamondRewardsActivity diamondRewardsActivity = DiamondRewardsActivity.this;
            diamondRewardsActivity.mTvDate.setText(diamondRewardsActivity.f35095s);
            DiamondRewardsActivity.this.f35094r = date;
            DiamondRewardsActivity.this.f35092p = 1;
            DiamondRewardsActivity.this.D5();
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
        ((k) this.f27702e).B1(this.f35092p, this.f35095s);
    }

    public void E5() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.f35094r);
        new b.C0752b(this).t(new TimePickerPopup(this).f0(TimePickerPopup.Mode.YM).a0(calendar).i0(new c())).N();
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_diamond_rewards;
    }

    @Override // in.a
    public void g5() {
        this.f35090n = (Topbar) findViewById(R.id.common_topbar);
        this.mNormalView = (SmartRefreshLayout) findViewById(R.id.normal_view);
        this.mListView = (RecyclerView) findViewById(R.id.re_list);
        this.mTvDate = (TextView) findViewById(R.id.tv_date);
        View viewFindViewById = findViewById(R.id.re_date);
        this.f35096t = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.f35090n, getString(R.string.diamond_rewards));
        this.f35091o = new e(new ArrayList());
        this.mListView.setLayoutManager(new LinearLayoutManager(this));
        this.mListView.setAdapter(this.f35091o);
        this.f35091o.c1(R.layout.view_state_empty_anchor_apply);
        this.mNormalView.d0(new a());
        this.mNormalView.O(new b());
        this.f35094r = new Date();
        String strM0 = t.m0(new Date());
        this.f35095s = strM0;
        this.mTvDate.setText(strM0);
        D5();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // cl.f.b
    public void n4(List<DiamondRewardsBean> list, boolean z10) {
        if (this.f35092p == 1) {
            this.f35091o.v1(list);
        } else {
            this.f35091o.w(list);
        }
        this.f35092p++;
        this.f35093q = z10;
        this.mNormalView.s();
        this.mNormalView.S();
    }

    public void onBindClick(View view) {
        if (view.getId() != R.id.re_date) {
            return;
        }
        E5();
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.re_date) {
            return;
        }
        E5();
    }
}
