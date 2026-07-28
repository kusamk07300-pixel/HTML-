package net.babycat.live.modules.discover.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import f.n0;
import java.util.ArrayList;
import java.util.List;
import jg.f;
import jl.k;
import kl.d;
import mg.g;
import net.babycat.live.model.ShopAddressListBean;
import net.babycat.live.platform.util.a0;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import ol.e;
import qmyy.babycat.live.R;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class MyShopAddressActivity extends in.b<e> implements d.b {
    public k mAdapter;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35225n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f35226o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35227p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Topbar f35228q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f35229r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SmartRefreshLayout f35230s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RelativeLayout f35231t;

    public class a implements g {
        public a() {
        }

        @Override // mg.g
        public void onRefresh(f fVar) {
            MyShopAddressActivity.this.f35225n = 1;
            MyShopAddressActivity.this.D5();
        }
    }

    public class b implements mg.e {
        public b() {
        }

        @Override // mg.e
        public void onLoadMore(f fVar) {
            if (MyShopAddressActivity.this.f35226o) {
                MyShopAddressActivity.this.f35225n++;
                MyShopAddressActivity.this.D5();
            } else {
                MyShopAddressActivity.this.v5("no data");
                MyShopAddressActivity.this.f35230s.s();
                MyShopAddressActivity.this.f35230s.S();
            }
        }
    }

    public class c implements q7.g {
        public c() {
        }

        @Override // q7.g
        public void a(@n0 BaseQuickAdapter<?, ?> baseQuickAdapter, @n0 View view, int i10) {
            if (MyShopAddressActivity.this.f35227p == 1) {
                a0.a(new b0(ok.e.EVENT_INVITE_CHOOSE_AN_ADDRESS, (ShopAddressListBean) baseQuickAdapter.getData().get(i10)));
                MyShopAddressActivity.this.finish();
            }
        }
    }

    public class d implements q7.e {

        public class a implements cf.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f35236a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopAddressListBean f35237b;

            public a(int i10, ShopAddressListBean shopAddressListBean) {
                this.f35236a = i10;
                this.f35237b = shopAddressListBean;
            }

            @Override // cf.c
            public void onConfirm() {
                ((e) MyShopAddressActivity.this.f27702e).P3(this.f35236a, this.f35237b.getId().intValue());
            }
        }

        public d() {
        }

        @Override // q7.e
        public void a(@n0 BaseQuickAdapter baseQuickAdapter, @n0 View view, int i10) {
            if (t.t0()) {
                ShopAddressListBean shopAddressListBean = (ShopAddressListBean) baseQuickAdapter.getData().get(i10);
                int id2 = view.getId();
                if (id2 == R.id.lin_address) {
                    ((e) MyShopAddressActivity.this.f27702e).f4(i10, shopAddressListBean.getId().intValue());
                    return;
                }
                if (id2 == R.id.lin_delete) {
                    new b.C0752b(MyShopAddressActivity.this).Y(true).N(Boolean.FALSE).r(MyShopAddressActivity.this.getString(R.string.point_out), MyShopAddressActivity.this.getString(R.string.confirm_deletion), MyShopAddressActivity.this.getString(R.string.cancel), MyShopAddressActivity.this.getString(R.string.define), new a(i10, shopAddressListBean), null, false).N();
                } else {
                    if (id2 != R.id.lin_edit) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("type", 1);
                    bundle.putSerializable("data", shopAddressListBean);
                    MyShopAddressActivity.this.p5(ShopAddNewAddressActivity.class, bundle);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D5() {
        ((e) this.f27702e).S1(this.f35225n);
    }

    @Override // kl.d.b
    public void G2(List<ShopAddressListBean> list, Boolean bool) {
        if (this.f35225n == 1) {
            this.mAdapter.v1(list);
        } else {
            this.mAdapter.w(list);
        }
        this.f35226o = bool.booleanValue();
        this.f35230s.s();
        this.f35230s.S();
    }

    @Override // kl.d.b
    public void Z4(int i10) {
        for (int i11 = 0; i11 < this.mAdapter.getData().size(); i11++) {
            if (i10 == i11) {
                this.mAdapter.getData().get(i11).setIsDefault(1);
            } else {
                this.mAdapter.getData().get(i11).setIsDefault(2);
            }
        }
        this.mAdapter.notifyDataSetChanged();
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_my_shop_address;
    }

    @Override // in.a
    public void g5() {
        this.f35228q = (Topbar) findViewById(R.id.common_topbar);
        this.f35229r = (RecyclerView) findViewById(R.id.recycler);
        this.f35230s = (SmartRefreshLayout) findViewById(R.id.normal_view);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.re_add);
        this.f35231t = relativeLayout;
        relativeLayout.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        g5();
        t.S0(this.f27688a, this.f35228q, getString(R.string.my_address));
        this.f35227p = getIntent().getIntExtra("type", 0);
        this.mAdapter = new k(new ArrayList());
        this.f35229r.setLayoutManager(new LinearLayoutManager(this));
        this.f35229r.setAdapter(this.mAdapter);
        this.mAdapter.c1(R.layout.view_state_empty_anchor_apply);
        this.f35230s.d0(new a());
        this.f35230s.O(new b());
        D5();
        this.mAdapter.c(new c());
        this.mAdapter.r(R.id.lin_address, R.id.lin_delete, R.id.lin_edit);
        this.mAdapter.e(new d());
    }

    @Override // kl.d.b
    public void k1(int i10) {
        this.mAdapter.getData().remove(i10);
        this.mAdapter.notifyDataSetChanged();
    }

    @Override // in.b, ln.a
    public void k4() {
        super.k4();
        int i10 = this.f35225n;
        if (i10 != 1) {
            this.f35225n = i10 - 1;
        }
        this.f35230s.s();
        this.f35230s.S();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.re_add) {
            o5(ShopAddNewAddressActivity.class);
        }
    }

    @Override // in.b
    public void onReceiveEvent(b0 b0Var) {
        super.onReceiveEvent(b0Var);
        if (b0Var.a() != 1127) {
            return;
        }
        this.f35225n = 1;
        D5();
    }
}
