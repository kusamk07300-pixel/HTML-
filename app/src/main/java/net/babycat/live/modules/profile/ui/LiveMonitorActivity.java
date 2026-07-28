package net.babycat.live.modules.profile.ui;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.u;
import cf.i;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import em.r;
import f.n0;
import java.util.ArrayList;
import jg.f;
import jm.o0;
import mg.e;
import mg.g;
import net.babycat.live.model.HotListBean;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.i1;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;
import ye.b;
import zm.z;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMonitorActivity extends in.b<o0> implements r.b {
    public Topbar mCommonTopbar;
    public SmartRefreshLayout mNormalView;
    public RecyclerView mRecycler;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u f35595n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35596o = 1;

    public class a implements g {
        public a() {
        }

        @Override // mg.g
        public void onRefresh(f fVar) {
            LiveMonitorActivity.this.f35596o = 1;
            LiveMonitorActivity.this.A5();
        }
    }

    public class b implements e {
        public b() {
        }

        @Override // mg.e
        public void onLoadMore(f fVar) {
            LiveMonitorActivity.this.f35596o++;
            LiveMonitorActivity.this.A5();
        }
    }

    public class c implements q7.g {
        public c() {
        }

        @Override // q7.g
        public void a(@n0 BaseQuickAdapter<?, ?> baseQuickAdapter, @n0 View view, int i10) {
            new b.C0752b(LiveMonitorActivity.this).Y(true).s0(new i()).t(new z(LiveMonitorActivity.this, baseQuickAdapter.getData(), i10)).N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A5() {
        ((o0) this.f27702e).Y4(this.f35596o);
    }

    @Override // em.r.b
    public void O(HotListBean hotListBean) {
        if (this.f35596o == 1) {
            this.f35595n.v1(hotListBean.getList());
        } else {
            this.f35595n.w(hotListBean.getList());
        }
        this.mNormalView.s();
        this.mNormalView.S();
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_live_monitor;
    }

    @Override // in.a
    public void g5() {
        this.mCommonTopbar = (Topbar) findViewById(R.id.common_topbar);
        this.mRecycler = (RecyclerView) findViewById(R.id.recycler);
        this.mNormalView = (SmartRefreshLayout) findViewById(R.id.normal_view);
    }

    @Override // in.a
    public void h5() {
        t.S0(this.f27688a, this.mCommonTopbar, getString(R.string.live_monitor));
        this.mRecycler.addItemDecoration(new i1.a(this).d(10.0f).g(10.0f).c(R.color.baseBg).f(false).a());
        this.f35595n = new u(new ArrayList());
        this.mRecycler.setLayoutManager(new GridLayoutManager(this, 3));
        this.mRecycler.setAdapter(this.f35595n);
        this.f35595n.c1(R.layout.view_state_empty_anchor_apply);
        this.mNormalView.d0(new a());
        this.mNormalView.O(new b());
        A5();
        this.f35595n.c(new c());
    }

    @Override // in.b, ln.a
    public void k4() {
        super.k4();
        int i10 = this.f35596o;
        if (i10 != 1) {
            this.f35596o = i10 - 1;
        }
        this.mNormalView.s();
        this.mNormalView.S();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b
    public void onReceiveEvent(b0 b0Var) {
        super.onReceiveEvent(b0Var);
        if (b0Var.a() != 1098) {
            return;
        }
        this.f35595n.getData().remove(b0Var.b());
        this.f35595n.notifyDataSetChanged();
    }
}
