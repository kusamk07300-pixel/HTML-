package net.babycat.live.modules.profile.ui;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.m;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import em.p;
import f.n0;
import g0.o0;
import java.util.ArrayList;
import java.util.List;
import jg.f;
import jm.i0;
import mg.e;
import mg.g;
import net.babycat.live.model.UserReportBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class FeedbackListActivity extends in.b<i0> implements p.b {
    public Topbar mCommonTopbar;
    public SmartRefreshLayout mNormalView;
    public RecyclerView mRecycler;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35566n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Boolean f35567o = Boolean.FALSE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m f35568p;

    public class a implements g {
        public a() {
        }

        @Override // mg.g
        public void onRefresh(f fVar) {
            FeedbackListActivity.this.f35566n = 1;
            FeedbackListActivity.this.A5();
        }
    }

    public class b implements e {
        public b() {
        }

        @Override // mg.e
        public void onLoadMore(f fVar) {
            FeedbackListActivity.this.B5();
        }
    }

    public class c implements q7.g {
        public c() {
        }

        @Override // q7.g
        public void a(@n0 BaseQuickAdapter<?, ?> baseQuickAdapter, @n0 View view, int i10) {
            UserReportBean userReportBean = (UserReportBean) baseQuickAdapter.getData().get(i10);
            if (userReportBean.getStatus().intValue() == 1) {
                Bundle bundle = new Bundle();
                bundle.putInt(o0.CATEGORY_STATUS, 1);
                bundle.putSerializable("data", userReportBean);
                FeedbackListActivity.this.p5(FeedbackActivity.class, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A5() {
        ((i0) this.f27702e).M1(this.f35566n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B5() {
        if (this.f35567o.booleanValue()) {
            this.f35566n++;
            A5();
        } else {
            this.mNormalView.s();
            this.mNormalView.S();
        }
    }

    @Override // em.p.b
    public void R1(List<UserReportBean> list, Boolean bool) {
        if (this.f35566n == 1) {
            this.f35568p.v1(list);
        } else {
            this.f35568p.w(list);
        }
        this.f35567o = bool;
        this.mNormalView.s();
        this.mNormalView.S();
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_revenue_details;
    }

    @Override // in.a
    public void g5() {
        this.mCommonTopbar = (Topbar) findViewById(R.id.common_topbar);
        this.mRecycler = (RecyclerView) findViewById(R.id.recycler);
        this.mNormalView = (SmartRefreshLayout) findViewById(R.id.normal_view);
    }

    @Override // in.a
    public void h5() {
        t.S0(this.f27688a, this.mCommonTopbar, getString(R.string.feedback_list));
        m mVar = new m(new ArrayList());
        this.f35568p = mVar;
        mVar.T0(true);
        this.f35568p.U0(false);
        this.f35568p.V0(BaseQuickAdapter.AnimationType.ScaleIn);
        this.mRecycler.setLayoutManager(new LinearLayoutManager(this));
        this.mRecycler.setAdapter(this.f35568p);
        this.f35568p.c1(R.layout.view_state_empty_anchor_apply);
        this.mNormalView.d0(new a());
        this.mNormalView.O(new b());
        A5();
        this.f35568p.c(new c());
    }

    @Override // in.b, ln.a
    public void k4() {
        super.k4();
        int i10 = this.f35566n;
        if (i10 != 1) {
            this.f35566n = i10 - 1;
        }
        this.mNormalView.s();
        this.mNormalView.S();
    }

    @Override // in.a
    public View k5() {
        return null;
    }
}
