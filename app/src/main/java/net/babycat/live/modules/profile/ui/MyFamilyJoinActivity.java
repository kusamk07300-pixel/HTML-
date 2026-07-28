package net.babycat.live.modules.profile.ui;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.c0;
import cf.i;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import em.w;
import f.n0;
import java.util.ArrayList;
import java.util.List;
import jg.f;
import jm.y0;
import mg.e;
import net.babycat.live.model.FamilyUserBean;
import net.babycat.live.platform.util.a0;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import q7.g;
import qmyy.babycat.live.R;
import to.k;
import xn.f0;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class MyFamilyJoinActivity extends in.b<y0> implements w.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35648n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RecyclerView f35649o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SmartRefreshLayout f35650p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public c0 f35651q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f35652r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f35653s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f35654t = false;

    public class a implements g {

        /* JADX INFO: renamed from: net.babycat.live.modules.profile.ui.MyFamilyJoinActivity$a$a, reason: collision with other inner class name */
        public class C0427a implements f0.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f35656a;

            public C0427a(int i10) {
                this.f35656a = i10;
            }

            @Override // xn.f0.c
            public void a(int i10, int i11) {
                ((y0) MyFamilyJoinActivity.this.f27702e).X4(i10, i11, 0, this.f35656a);
            }

            @Override // xn.f0.c
            public void b(int i10, int i11) {
                ((y0) MyFamilyJoinActivity.this.f27702e).X4(i10, i11, 1, this.f35656a);
            }
        }

        public class b extends i {
            public b() {
            }

            @Override // cf.i, cf.j
            public void onDismiss(af.b bVar) {
                super.onDismiss(bVar);
            }
        }

        public a() {
        }

        @Override // q7.g
        public void a(@n0 @k BaseQuickAdapter<?, ?> baseQuickAdapter, @n0 @k View view, int i10) {
            new b.C0752b(MyFamilyJoinActivity.this).Y(true).s0(new b()).t(new f0(MyFamilyJoinActivity.this, (FamilyUserBean) baseQuickAdapter.getData().get(i10), new C0427a(i10))).N();
        }
    }

    public class b implements mg.g {
        public b() {
        }

        @Override // mg.g
        public void onRefresh(f fVar) {
            MyFamilyJoinActivity.this.f35653s = 1;
            MyFamilyJoinActivity.this.A5();
        }
    }

    public class c implements e {
        public c() {
        }

        @Override // mg.e
        public void onLoadMore(f fVar) {
            if (MyFamilyJoinActivity.this.f35654t) {
                MyFamilyJoinActivity.this.A5();
            } else {
                MyFamilyJoinActivity.this.f35650p.s();
                MyFamilyJoinActivity.this.f35650p.S();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A5() {
        ((y0) this.f27702e).j5(this.f35653s, this.f35652r);
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_my_family_join;
    }

    @Override // em.w.b
    public void f3(List<FamilyUserBean> list, boolean z10) {
        if (this.f35653s == 1) {
            this.f35651q.v1(list);
        } else {
            this.f35651q.w(list);
        }
        this.f35653s++;
        this.f35654t = z10;
        this.f35650p.s();
        this.f35650p.S();
    }

    @Override // in.a
    public void g5() {
        this.f35648n = (Topbar) findViewById(R.id.common_topbar);
        this.f35649o = (RecyclerView) findViewById(R.id.rv_join_list);
        this.f35650p = (SmartRefreshLayout) findViewById(R.id.normal_view);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.f35648n, getString(R.string.application_information));
        this.f35652r = getIntent().getIntExtra("family_id", -1);
        this.f35651q = new c0(new ArrayList());
        this.f35649o.setLayoutManager(new LinearLayoutManager(this));
        this.f35649o.setAdapter(this.f35651q);
        this.f35651q.c1(R.layout.view_state_empty_anchor_apply);
        this.f35651q.c(new a());
        this.f35650p.d0(new b());
        this.f35650p.O(new c());
        A5();
    }

    @Override // em.w.b
    public void i2(int i10, int i11) {
        v5(getString(i10 == 1 ? R.string.agreed : R.string.refused));
        this.f35651q.N0(i11);
        if (i10 == 1) {
            a0.a(new b0(ok.e.EVENT_CHANGE_FAMILY));
        }
    }

    @Override // in.a
    public View k5() {
        return null;
    }
}
