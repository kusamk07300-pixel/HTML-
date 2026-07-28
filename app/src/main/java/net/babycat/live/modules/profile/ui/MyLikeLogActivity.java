package net.babycat.live.modules.profile.ui;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.h0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import em.e0;
import f.n0;
import java.util.ArrayList;
import java.util.List;
import jg.f;
import jm.q1;
import mg.e;
import mg.g;
import net.babycat.live.model.LikesFromBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class MyLikeLogActivity extends in.b<q1> implements e0.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35713n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RecyclerView f35714o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SmartRefreshLayout f35715p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h0 f35716q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f35717r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f35718s = false;

    public class a implements g {
        public a() {
        }

        @Override // mg.g
        public void onRefresh(f fVar) {
            MyLikeLogActivity.this.f35717r = 1;
            MyLikeLogActivity.this.A5();
        }
    }

    public class b implements e {
        public b() {
        }

        @Override // mg.e
        public void onLoadMore(f fVar) {
            if (MyLikeLogActivity.this.f35718s) {
                MyLikeLogActivity.this.A5();
            } else {
                MyLikeLogActivity.this.f35715p.s();
                MyLikeLogActivity.this.f35715p.S();
            }
        }
    }

    public class c implements q7.g {
        public c() {
        }

        @Override // q7.g
        public void a(@n0 BaseQuickAdapter<?, ?> baseQuickAdapter, @n0 View view, int i10) {
            LikesFromBean likesFromBean = (LikesFromBean) baseQuickAdapter.getData().get(i10);
            Bundle bundle = new Bundle();
            bundle.putInt("my_space_uid", likesFromBean.getFromUid().intValue());
            MyLikeLogActivity.this.p5(MySpaceActivity.class, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A5() {
        ((q1) this.f27702e).l2(this.f35717r);
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_my_like_log;
    }

    @Override // em.e0.b
    public void f0(List<LikesFromBean> list, boolean z10) {
        if (this.f35717r == 1) {
            this.f35716q.v1(list);
        } else {
            this.f35716q.w(list);
        }
        this.f35717r++;
        this.f35718s = z10;
        this.f35715p.s();
        this.f35715p.S();
    }

    @Override // in.a
    public void g5() {
        this.f35713n = (Topbar) findViewById(R.id.common_topbar);
        this.f35714o = (RecyclerView) findViewById(R.id.rv_list);
        this.f35715p = (SmartRefreshLayout) findViewById(R.id.normal_view);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.f35713n, getString(R.string.like_records));
        this.f35716q = new h0(new ArrayList());
        this.f35714o.setLayoutManager(new LinearLayoutManager(this));
        this.f35714o.setAdapter(this.f35716q);
        this.f35716q.c1(R.layout.view_state_empty_anchor_apply);
        this.f35715p.d0(new a());
        this.f35715p.O(new b());
        A5();
        this.f35716q.c(new c());
    }

    @Override // in.b, ln.a
    public void k4() {
        super.k4();
        this.f35715p.s();
        this.f35715p.S();
    }

    @Override // in.a
    public View k5() {
        return null;
    }
}
