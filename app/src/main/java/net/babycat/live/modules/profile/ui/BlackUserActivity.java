package net.babycat.live.modules.profile.ui;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import em.f;
import f.n0;
import java.util.ArrayList;
import java.util.List;
import jm.k;
import mg.e;
import mg.g;
import net.babycat.live.model.BlackUserBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class BlackUserActivity extends in.b<k> implements f.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35472n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f35473o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public lm.a f35474p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Topbar f35475q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f35476r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SmartRefreshLayout f35477s;

    public class a implements g {
        public a() {
        }

        @Override // mg.g
        public void onRefresh(jg.f fVar) {
            BlackUserActivity.this.f35472n = 1;
            BlackUserActivity.this.C5();
        }
    }

    public class b implements e {
        public b() {
        }

        @Override // mg.e
        public void onLoadMore(jg.f fVar) {
            BlackUserActivity.this.B5();
        }
    }

    public class c implements q7.e {

        public class a implements cf.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ BlackUserBean f35481a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f35482b;

            public a(BlackUserBean blackUserBean, int i10) {
                this.f35481a = blackUserBean;
                this.f35482b = i10;
            }

            @Override // cf.c
            public void onConfirm() {
                ((k) BlackUserActivity.this.f27702e).Z3(this.f35481a.getUser().getId().intValue(), this.f35482b);
            }
        }

        public c() {
        }

        @Override // q7.e
        public void a(@n0 BaseQuickAdapter baseQuickAdapter, @n0 View view, int i10) {
            BlackUserBean blackUserBean = (BlackUserBean) baseQuickAdapter.getData().get(i10);
            if (view.getId() == R.id.tv_remove) {
                new b.C0752b(BlackUserActivity.this).Y(true).p(BlackUserActivity.this.getString(R.string.system_prompt), BlackUserActivity.this.getString(R.string.remove_back, blackUserBean.getUser().getNickname()), new a(blackUserBean, i10)).N();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B5() {
        if (this.f35473o) {
            this.f35472n++;
            C5();
        } else {
            this.f35477s.s();
            this.f35477s.S();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C5() {
        ((k) this.f27702e).c2(this.f35472n);
    }

    @Override // em.f.b
    public void P4(int i10) {
        this.f35474p.getData().remove(i10);
        this.f35474p.notifyDataSetChanged();
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_black_user;
    }

    @Override // em.f.b
    public void f4(List<BlackUserBean> list, Boolean bool) {
        if (this.f35472n == 1) {
            this.f35474p.v1(list);
        } else {
            this.f35474p.w(list);
        }
        this.f35473o = bool.booleanValue();
        this.f35477s.s();
        this.f35477s.S();
    }

    @Override // in.a
    public void g5() {
        this.f35475q = (Topbar) findViewById(R.id.common_topbar);
        this.f35476r = (RecyclerView) findViewById(R.id.black_list);
        this.f35477s = (SmartRefreshLayout) findViewById(R.id.normal_view);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.f35475q, getString(R.string.room_hick));
        m5(true);
        this.f35475q.setTransparent();
        this.f35475q.setTabBoldGone();
        lm.a aVar = new lm.a(new ArrayList());
        this.f35474p = aVar;
        aVar.T0(true);
        this.f35474p.U0(false);
        this.f35474p.V0(BaseQuickAdapter.AnimationType.ScaleIn);
        this.f35474p.c1(R.layout.view_state_empty_anchor_apply);
        this.f35476r.setLayoutManager(new LinearLayoutManager(this));
        this.f35476r.setAdapter(this.f35474p);
        this.f35477s.d0(new a());
        this.f35477s.O(new b());
        this.f35474p.r(R.id.tv_remove);
        this.f35474p.e(new c());
        C5();
    }

    @Override // in.b, ln.a
    public void k4() {
        super.k4();
        int i10 = this.f35472n;
        if (i10 != 1) {
            this.f35472n = i10 - 1;
        }
        this.f35477s.s();
        this.f35477s.S();
    }

    @Override // in.a
    public View k5() {
        return null;
    }
}
