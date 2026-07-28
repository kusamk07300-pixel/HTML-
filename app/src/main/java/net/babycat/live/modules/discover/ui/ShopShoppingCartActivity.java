package net.babycat.live.modules.discover.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import f.n0;
import java.util.ArrayList;
import java.util.List;
import jg.f;
import jl.q;
import kl.l;
import mg.e;
import mg.g;
import net.babycat.live.model.ShopCartListBean;
import net.babycat.live.model.ShopCartSettleBean;
import net.babycat.live.platform.util.b1;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import ol.u;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class ShopShoppingCartActivity extends in.b<u> implements l.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q f35304n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35305o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f35306p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f35307q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Topbar f35308r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RecyclerView f35309s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SmartRefreshLayout f35310t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ImageView f35311u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinearLayout f35312v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f35313w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LinearLayout f35314x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f35315y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public RelativeLayout f35316z;

    public class a implements g {
        public a() {
        }

        @Override // mg.g
        public void onRefresh(f fVar) {
            ShopShoppingCartActivity.this.f35305o = 1;
            ShopShoppingCartActivity.this.D5();
        }
    }

    public class b implements e {
        public b() {
        }

        @Override // mg.e
        public void onLoadMore(f fVar) {
            if (ShopShoppingCartActivity.this.f35306p) {
                ShopShoppingCartActivity.this.f35305o++;
                ShopShoppingCartActivity.this.D5();
            } else {
                ShopShoppingCartActivity.this.v5("no data");
                ShopShoppingCartActivity.this.f35310t.s();
                ShopShoppingCartActivity.this.f35310t.S();
            }
        }
    }

    public class c implements q7.g {
        public c() {
        }

        @Override // q7.g
        public void a(@n0 BaseQuickAdapter<?, ?> baseQuickAdapter, @n0 View view, int i10) {
            ShopCartListBean shopCartListBean = (ShopCartListBean) baseQuickAdapter.getData().get(i10);
            if (shopCartListBean.isSelect()) {
                shopCartListBean.setSelect(false);
            } else {
                shopCartListBean.setSelect(true);
            }
            baseQuickAdapter.notifyItemChanged(i10);
            ShopShoppingCartActivity.this.E5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D5() {
        ((u) this.f27702e).Y0(this.f35305o);
    }

    @Override // kl.l.b
    public void D1(List<ShopCartListBean> list, Boolean bool) {
        if (this.f35305o == 1) {
            this.f35304n.v1(list);
        } else {
            this.f35304n.w(list);
        }
        this.f35306p = bool.booleanValue();
        this.f35310t.s();
        this.f35310t.S();
    }

    public final void E5() {
        double d10 = 0.0d;
        for (int i10 = 0; i10 < this.f35304n.getData().size(); i10++) {
            if (this.f35304n.getData().get(i10).isSelect()) {
                d10 += Double.parseDouble(this.f35304n.getData().get(i10).getPrice());
            }
        }
        this.f35313w.setText("¥" + b1.b(d10));
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_shop_shopping_cart;
    }

    @Override // in.a
    public void g5() {
        this.f35308r = (Topbar) findViewById(R.id.common_topbar);
        this.f35309s = (RecyclerView) findViewById(R.id.recycler);
        this.f35310t = (SmartRefreshLayout) findViewById(R.id.normal_view);
        this.f35311u = (ImageView) findViewById(R.id.iv_select);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.lin_select);
        this.f35312v = linearLayout;
        linearLayout.setOnClickListener(this);
        this.f35313w = (TextView) findViewById(R.id.tv_total_money);
        this.f35314x = (LinearLayout) findViewById(R.id.lin_money);
        TextView textView = (TextView) findViewById(R.id.tv_checkout);
        this.f35315y = textView;
        textView.setOnClickListener(this);
        this.f35316z = (RelativeLayout) findViewById(R.id.re_add);
    }

    @Override // in.a
    public void h5() {
        t.S0(this.f27688a, this.f35308r, getString(R.string.shopping_cart));
        this.f35304n = new q(new ArrayList(), 0);
        this.f35309s.setLayoutManager(new LinearLayoutManager(this));
        this.f35309s.setAdapter(this.f35304n);
        this.f35304n.c1(R.layout.view_state_empty_anchor_apply);
        this.f35310t.d0(new a());
        this.f35310t.O(new b());
        D5();
        this.f35304n.c(new c());
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.lin_select);
        TextView textView = (TextView) findViewById(R.id.tv_checkout);
        linearLayout.setOnClickListener(this);
        textView.setOnClickListener(this);
    }

    @Override // kl.l.b
    public void k2(ShopCartSettleBean shopCartSettleBean) {
        Bundle bundle = new Bundle();
        bundle.putInt("id", shopCartSettleBean.getOrderId().intValue());
        p5(ShopOrderConfirmationActivity.class, bundle);
        finish();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.lin_select) {
            if (this.f35307q) {
                for (int i10 = 0; i10 < this.f35304n.getData().size(); i10++) {
                    this.f35304n.getData().get(i10).setSelect(false);
                }
                this.f35307q = false;
            } else {
                for (int i11 = 0; i11 < this.f35304n.getData().size(); i11++) {
                    this.f35304n.getData().get(i11).setSelect(true);
                }
                this.f35307q = true;
            }
            this.f35304n.notifyDataSetChanged();
            this.f35311u.setImageResource(this.f35307q ? R.mipmap.shop_address_1 : R.mipmap.shop_address_2);
            E5();
            return;
        }
        if (id2 == R.id.tv_checkout && t.t0()) {
            StringBuffer stringBuffer = new StringBuffer();
            String string = "";
            for (ShopCartListBean shopCartListBean : this.f35304n.getData()) {
                if (shopCartListBean.isSelect()) {
                    stringBuffer.append(String.valueOf(shopCartListBean.getId()));
                    stringBuffer.append(r9.b.COMMA);
                }
                string = stringBuffer.toString();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            ((u) this.f27702e).m2(string);
        }
    }
}
