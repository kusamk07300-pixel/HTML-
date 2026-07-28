package net.babycat.live.modules.discover.ui;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import f.n0;
import in.b;
import java.util.ArrayList;
import java.util.List;
import kl.a;
import net.babycat.live.model.HotListBean;
import net.babycat.live.platform.util.a0;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.i1;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import ok.e;
import pl.i;
import q7.g;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class HomeCountryActivity extends b<i> implements a.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35210n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RecyclerView f35211o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35212p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public jl.b f35213q;

    public class a implements g {
        public a() {
        }

        @Override // q7.g
        public void a(@n0 BaseQuickAdapter<?, ?> baseQuickAdapter, @n0 View view, int i10) {
            a0.a(new b0(e.EVENT_COUNTRY_LIST, (HotListBean.CountrycodelistDTO) baseQuickAdapter.getData().get(i10)));
            HomeCountryActivity.this.finish();
        }
    }

    @Override // kl.a.b
    public void E(List<HotListBean.CountrycodelistDTO> list) {
        this.f35213q.v1(list);
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_home_country;
    }

    @Override // in.a
    public void g5() {
        this.f35210n = (Topbar) findViewById(R.id.common_topbar);
        this.f35211o = (RecyclerView) findViewById(R.id.rv_country);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.f35210n, getString(R.string.country_region));
        this.f35212p = getIntent().getIntExtra("type", 0);
        i1 i1VarA = new i1.a(this).d(20.0f).g(20.0f).b(0).f(false).a();
        this.f35213q = new jl.b(new ArrayList());
        this.f35211o.addItemDecoration(i1VarA);
        this.f35211o.setLayoutManager(new GridLayoutManager(this, 2));
        this.f35211o.setAdapter(this.f35213q);
        this.f35213q.c1(R.layout.view_state_empty_anchor_apply);
        this.f35213q.c(new a());
        if (this.f35212p == 0) {
            ((i) this.f27702e).w();
        } else {
            ((i) this.f27702e).A();
        }
    }

    @Override // in.a
    public View k5() {
        return null;
    }
}
