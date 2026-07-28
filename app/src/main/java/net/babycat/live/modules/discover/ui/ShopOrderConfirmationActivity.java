package net.babycat.live.modules.discover.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import in.b;
import java.util.ArrayList;
import kl.j;
import net.babycat.live.model.ShopAddressListBean;
import net.babycat.live.model.ShopCartConfirmBean;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import ol.q;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class ShopOrderConfirmationActivity extends b<q> implements j.b {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public int f35283id = 0;
    public ShopAddressListBean mShopAddressListBean;
    public ShopCartConfirmBean mShopCartConfirmBean;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public jl.q f35284n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Topbar f35285o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f35286p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f35287q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f35288r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RelativeLayout f35289s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RecyclerView f35290t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f35291u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RelativeLayout f35292v;

    @Override // kl.j.b
    public void M0(ShopAddressListBean shopAddressListBean) {
        this.mShopAddressListBean = shopAddressListBean;
        this.f35286p.setText(shopAddressListBean.getRealName());
        this.f35287q.setText(shopAddressListBean.getPhone());
        this.f35288r.setText(shopAddressListBean.getDetail());
    }

    @Override // kl.j.b
    public void R0(ShopCartConfirmBean shopCartConfirmBean) {
        this.mShopCartConfirmBean = shopCartConfirmBean;
        this.f35284n.v1(shopCartConfirmBean.getSub());
        this.f35291u.setText(getString(R.string.buy_now) + "$" + shopCartConfirmBean.getOrderPrice());
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_shop_order_confirmatio;
    }

    @Override // in.a
    public void g5() {
        this.f35285o = (Topbar) findViewById(R.id.common_topbar);
        this.f35286p = (TextView) findViewById(R.id.tv_address_name);
        this.f35287q = (TextView) findViewById(R.id.tv_phone);
        this.f35288r = (TextView) findViewById(R.id.tv_address);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.re_have);
        this.f35289s = relativeLayout;
        relativeLayout.setOnClickListener(this);
        this.f35290t = (RecyclerView) findViewById(R.id.order_list);
        this.f35291u = (TextView) findViewById(R.id.tv_buy_now);
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(R.id.re_add);
        this.f35292v = relativeLayout2;
        relativeLayout2.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        t.S0(this.f27688a, this.f35285o, getString(R.string.order_confirmation));
        this.f35283id = getIntent().getIntExtra("id", 0);
        this.f35284n = new jl.q(new ArrayList(), 1);
        this.f35290t.setLayoutManager(new LinearLayoutManager(this));
        this.f35290t.setAdapter(this.f35284n);
        this.f35284n.c1(R.layout.view_state_empty_anchor_apply);
        ((q) this.f27702e).x2(this.f35283id);
        ((q) this.f27702e).s1();
        this.f35289s.setOnClickListener(this);
        this.f35292v.setOnClickListener(this);
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        ShopCartConfirmBean shopCartConfirmBean;
        int id2 = view.getId();
        if (id2 == R.id.re_add) {
            if (!t.t0() || (shopCartConfirmBean = this.mShopCartConfirmBean) == null || this.mShopAddressListBean == null) {
                return;
            }
            ((q) this.f27702e).b1(shopCartConfirmBean.getId().intValue(), this.mShopAddressListBean.getId().intValue());
            return;
        }
        if (id2 == R.id.re_have && t.t0()) {
            Bundle bundle = new Bundle();
            bundle.putInt("type", 1);
            p5(MyShopAddressActivity.class, bundle);
        }
    }

    @Override // in.b
    public void onReceiveEvent(b0 b0Var) {
        super.onReceiveEvent(b0Var);
        if (b0Var.a() != 1126) {
            return;
        }
        ShopAddressListBean shopAddressListBean = (ShopAddressListBean) b0Var.b();
        this.mShopAddressListBean = shopAddressListBean;
        this.f35286p.setText(shopAddressListBean.getRealName());
        this.f35287q.setText(this.mShopAddressListBean.getPhone());
        this.f35288r.setText(this.mShopAddressListBean.getDetail());
    }

    @Override // kl.j.b
    public void t4() {
        o5(MyShopOrdersActivity.class);
        finish();
    }
}
