package net.babycat.live.modules.discover.ui;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import in.b;
import java.util.ArrayList;
import jl.m;
import kl.k;
import net.babycat.live.model.ShopOrderDetailBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import ol.s;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class ShopOrderDetailsActivity extends b<s> implements k.b {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public int f35293id = 0;
    public m mAdapter;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35294n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f35295o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f35296p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f35297q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RelativeLayout f35298r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RecyclerView f35299s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f35300t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f35301u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f35302v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RelativeLayout f35303w;

    @Override // in.a
    public int e5() {
        return R.layout.act_shop_order_details;
    }

    @Override // in.a
    public void g5() {
        this.f35294n = (Topbar) findViewById(R.id.common_topbar);
        this.f35295o = (TextView) findViewById(R.id.tv_user_name);
        this.f35296p = (TextView) findViewById(R.id.tv_phone);
        this.f35297q = (TextView) findViewById(R.id.tv_address);
        this.f35298r = (RelativeLayout) findViewById(R.id.re_have);
        this.f35299s = (RecyclerView) findViewById(R.id.order_list);
        this.f35300t = (TextView) findViewById(R.id.tv_order_price);
        this.f35301u = (TextView) findViewById(R.id.tv_id);
        this.f35302v = (TextView) findViewById(R.id.tv_buy_now);
        this.f35303w = (RelativeLayout) findViewById(R.id.re_add);
    }

    @Override // in.a
    public void h5() {
        t.S0(this.f27688a, this.f35294n, getString(R.string.order_details));
        int intExtra = getIntent().getIntExtra("id", 0);
        this.f35293id = intExtra;
        ((s) this.f27702e).e0(intExtra);
        this.mAdapter = new m(new ArrayList());
        this.f35299s.setLayoutManager(new LinearLayoutManager(this));
        this.f35299s.setAdapter(this.mAdapter);
    }

    @Override // kl.k.b
    public void i1(ShopOrderDetailBean shopOrderDetailBean) {
        this.mAdapter.v1(shopOrderDetailBean.getSub());
        this.f35295o.setText(shopOrderDetailBean.getAddress().getUserName());
        this.f35296p.setText(shopOrderDetailBean.getAddress().getPhone());
        this.f35297q.setText(shopOrderDetailBean.getAddress().getDetail());
        this.f35300t.setText("$" + shopOrderDetailBean.getOrderPrice());
        this.f35301u.setText(String.valueOf(shopOrderDetailBean.getOrderNo()));
    }

    @Override // in.a
    public View k5() {
        return null;
    }
}
