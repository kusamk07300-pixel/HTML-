package net.babycat.live.modules.discover.ui;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import f.n0;
import java.util.ArrayList;
import java.util.List;
import jo.c;
import jo.d;
import kl.e;
import ml.c0;
import net.babycat.live.model.ShopOrderListBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.ShopSimplePagerTitleView;
import net.babycat.live.platform.widget.view.Topbar;
import net.babycat.live.platform.widget.view.ViewPager2Helper;
import net.lucode.hackware.magicindicator.MagicIndicator;
import ol.g;
import qmyy.babycat.live.R;
import to.k;

/* JADX INFO: loaded from: classes4.dex */
public class MyShopOrdersActivity extends in.b<g> implements e.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<Fragment> f35239n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String[] f35240o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Topbar f35241p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MagicIndicator f35242q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ViewPager2 f35243r;

    public class a extends jo.a {

        /* JADX INFO: renamed from: net.babycat.live.modules.discover.ui.MyShopOrdersActivity$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0422a implements View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f35245a;

            public ViewOnClickListenerC0422a(int i10) {
                this.f35245a = i10;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MyShopOrdersActivity.this.f35243r.setCurrentItem(this.f35245a);
            }
        }

        public a() {
        }

        @Override // jo.a
        public int getCount() {
            if (MyShopOrdersActivity.this.f35240o == null) {
                return 0;
            }
            return MyShopOrdersActivity.this.f35240o.length;
        }

        @Override // jo.a
        public c getIndicator(Context context) {
            ko.b bVar = new ko.b(context);
            bVar.setMode(2);
            bVar.setLineHeight(go.b.a(context, 2.0d));
            bVar.setLineWidth(go.b.a(context, 60.0d));
            bVar.setRoundRadius(go.b.a(context, 2.0d));
            bVar.setStartInterpolator(new AccelerateInterpolator());
            bVar.setEndInterpolator(new DecelerateInterpolator(2.0f));
            bVar.setYOffset(10.0f);
            bVar.setColors(Integer.valueOf(Color.parseColor("#F3A5FF")));
            return bVar;
        }

        @Override // jo.a
        public d getTitleView(Context context, int i10) {
            ShopSimplePagerTitleView shopSimplePagerTitleView = new ShopSimplePagerTitleView(context);
            shopSimplePagerTitleView.setNormalColor(Color.parseColor("#999999"));
            shopSimplePagerTitleView.setSelectedColor(Color.parseColor("#333333"));
            shopSimplePagerTitleView.setText(MyShopOrdersActivity.this.f35240o[i10]);
            shopSimplePagerTitleView.setTextSize(16.0f);
            shopSimplePagerTitleView.getPaint().setFakeBoldText(true);
            shopSimplePagerTitleView.setPadding(t.i(12.0f), 0, t.i(12.0f), 0);
            shopSimplePagerTitleView.setOnClickListener(new ViewOnClickListenerC0422a(i10));
            return shopSimplePagerTitleView;
        }
    }

    public class b extends FragmentStateAdapter {
        public b(@n0 @k androidx.fragment.app.d dVar) {
            super(dVar);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @n0
        @k
        public Fragment createFragment(int i10) {
            return (Fragment) MyShopOrdersActivity.this.f35239n.get(i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return MyShopOrdersActivity.this.f35239n.size();
        }
    }

    private void A5() {
        this.f35240o = new String[]{getString(R.string.all), getString(R.string.awaiting_payment), getString(R.string.awaiting_shipment), getString(R.string.awaiting_receipt), getString(R.string.completed)};
        ArrayList arrayList = new ArrayList();
        this.f35239n = arrayList;
        arrayList.add(c0.A5(0));
        this.f35239n.add(c0.A5(2));
        this.f35239n.add(c0.A5(3));
        this.f35239n.add(c0.A5(4));
        this.f35239n.add(c0.A5(6));
        this.f35242q.setBackgroundColor(Color.parseColor("#FFFFFF"));
        io.a aVar = new io.a(this);
        aVar.setAdjustMode(false);
        aVar.setAdapter(new a());
        this.f35242q.setNavigator(aVar);
        this.f35243r.setOffscreenPageLimit(this.f35239n.size());
        this.f35243r.setAdapter(new b(this));
        ViewPager2Helper.bind(this.f35242q, this.f35243r);
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_my_shop_orders;
    }

    @Override // in.a
    public void g5() {
        this.f35241p = (Topbar) findViewById(R.id.common_topbar);
        this.f35242q = (MagicIndicator) findViewById(R.id.home_magic_indicator);
        this.f35243r = (ViewPager2) findViewById(R.id.space_view_pager);
    }

    @Override // in.a
    public void h5() {
        t.S0(this.f27688a, this.f35241p, getString(R.string.my_orders));
        A5();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // kl.e.b
    public void w2(List<ShopOrderListBean> list, Boolean bool) {
    }
}
