package net.babycat.live.modules.profile.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.n0;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import em.q0;
import java.util.ArrayList;
import java.util.List;
import jg.f;
import jm.y2;
import mg.e;
import mg.g;
import net.babycat.live.model.MyTransferLogModel;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class MyTransferRecordsActivity extends in.b<y2> implements q0.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f35873n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Topbar f35874o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f35875p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public RecyclerView f35876q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SmartRefreshLayout f35877r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RelativeLayout f35878s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f35879t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f35880u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n0 f35881v;

    public class a implements g {
        public a() {
        }

        @Override // mg.g
        public void onRefresh(f fVar) {
            MyTransferRecordsActivity.this.f35880u = 1;
            MyTransferRecordsActivity.this.C5();
        }
    }

    public class b implements e {
        public b() {
        }

        @Override // mg.e
        public void onLoadMore(f fVar) {
            if (MyTransferRecordsActivity.this.f35879t) {
                MyTransferRecordsActivity.this.f35880u++;
                MyTransferRecordsActivity.this.C5();
            } else {
                MyTransferRecordsActivity.this.v5("no data");
                MyTransferRecordsActivity.this.f35877r.s();
                MyTransferRecordsActivity.this.f35877r.S();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C5() {
        ((y2) this.f27702e).D3(this.f35880u);
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_my_transfer_records;
    }

    @Override // in.a
    public void g5() {
        this.f35873n = (ImageView) findViewById(R.id.iv_top);
        this.f35874o = (Topbar) findViewById(R.id.common_topbar);
        this.f35875p = (LinearLayout) findViewById(R.id.lin_title);
        this.f35876q = (RecyclerView) findViewById(R.id.recycler);
        this.f35877r = (SmartRefreshLayout) findViewById(R.id.normal_view);
        this.f35878s = (RelativeLayout) findViewById(R.id.re_top);
    }

    @Override // in.a
    public void h5() {
        m5(true);
        t.S0(this, this.f35874o, getString(R.string.transfer) + " " + getString(R.string.record));
        this.f35874o.setTabBoldGone();
        this.f35874o.setTransparent();
        this.f35881v = new n0(new ArrayList());
        this.f35876q.setLayoutManager(new LinearLayoutManager(this));
        this.f35876q.setAdapter(this.f35881v);
        this.f35881v.c1(R.layout.view_state_empty_anchor_apply);
        this.f35877r.d0(new a());
        this.f35877r.O(new b());
        C5();
    }

    @Override // in.b, ln.a
    public void k4() {
        super.k4();
        int i10 = this.f35880u;
        if (i10 != 1) {
            this.f35880u = i10 - 1;
        }
        this.f35877r.s();
        this.f35877r.S();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // em.q0.b
    public void w0(List<MyTransferLogModel> list, boolean z10) {
        if (this.f35880u == 1) {
            this.f35881v.v1(list);
        } else {
            this.f35881v.w(list);
        }
        this.f35879t = z10;
        this.f35877r.s();
        this.f35877r.S();
    }
}
