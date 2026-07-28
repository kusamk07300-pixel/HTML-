package net.babycat.live.modules.profile.ui;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.gyf.immersionbar.ImmersionBar;
import em.r0;
import f.n0;
import gm.u;
import java.util.ArrayList;
import java.util.List;
import jm.c3;
import jo.c;
import jo.d;
import net.babycat.live.model.VipTabBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.ShopSimplePagerTitleView;
import net.babycat.live.platform.widget.view.Topbar;
import net.babycat.live.platform.widget.view.ViewPager2Helper;
import net.lucode.hackware.magicindicator.MagicIndicator;
import qmyy.babycat.live.R;
import to.k;

/* JADX INFO: loaded from: classes4.dex */
public class MyVipActivity extends in.b<c3> implements r0.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35884n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MagicIndicator f35885o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewPager2 f35886p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<Fragment> f35887q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List<VipTabBean> f35888r;

    public class a extends jo.a {

        /* JADX INFO: renamed from: net.babycat.live.modules.profile.ui.MyVipActivity$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0429a implements View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f35890a;

            public ViewOnClickListenerC0429a(int i10) {
                this.f35890a = i10;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MyVipActivity.this.f35886p.setCurrentItem(this.f35890a);
            }
        }

        public a() {
        }

        @Override // jo.a
        public int getCount() {
            if (MyVipActivity.this.f35888r == null) {
                return 0;
            }
            return MyVipActivity.this.f35888r.size();
        }

        @Override // jo.a
        public c getIndicator(Context context) {
            ko.b bVar = new ko.b(context);
            bVar.setMode(2);
            bVar.setLineHeight(go.b.a(context, 3.0d));
            bVar.setLineWidth(go.b.a(context, 16.0d));
            bVar.setRoundRadius(go.b.a(context, 2.0d));
            bVar.setStartInterpolator(new AccelerateInterpolator());
            bVar.setEndInterpolator(new DecelerateInterpolator(2.0f));
            bVar.setYOffset(10.0f);
            bVar.setColors(Integer.valueOf(Color.parseColor("#010000")));
            return bVar;
        }

        @Override // jo.a
        public d getTitleView(Context context, int i10) {
            ShopSimplePagerTitleView shopSimplePagerTitleView = new ShopSimplePagerTitleView(context);
            shopSimplePagerTitleView.setNormalColor(Color.parseColor("#585858"));
            shopSimplePagerTitleView.setSelectedColor(Color.parseColor("#010000"));
            shopSimplePagerTitleView.setText(((VipTabBean) MyVipActivity.this.f35888r.get(i10)).getName());
            shopSimplePagerTitleView.setTextSize(16.0f);
            shopSimplePagerTitleView.getPaint().setFakeBoldText(true);
            shopSimplePagerTitleView.setPadding(t.i(18.0f), 0, t.i(18.0f), 6);
            shopSimplePagerTitleView.setOnClickListener(new ViewOnClickListenerC0429a(i10));
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
            return (Fragment) MyVipActivity.this.f35887q.get(i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return MyVipActivity.this.f35887q.size();
        }
    }

    private void z5(List<VipTabBean> list) {
        this.f35888r = list;
        this.f35887q = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f35887q.add(u.x5(list.get(i10).getId().intValue()));
        }
        io.a aVar = new io.a(this);
        aVar.setAdjustMode(false);
        aVar.setAdapter(new a());
        this.f35885o.setNavigator(aVar);
        this.f35886p.setOffscreenPageLimit(1);
        this.f35886p.setAdapter(new b(this));
        ViewPager2Helper.bind(this.f35885o, this.f35886p);
    }

    @Override // em.r0.b
    public void b2(List<VipTabBean> list) {
        z5(list);
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_my_vip;
    }

    @Override // in.a
    public void g5() {
        this.f35884n = (Topbar) findViewById(R.id.common_topbar);
        this.f35885o = (MagicIndicator) findViewById(R.id.title_indicator);
        this.f35886p = (ViewPager2) findViewById(R.id.blind_vp_content);
    }

    @Override // in.a
    public void h5() {
        ImmersionBar.with(this).fitsSystemWindows(false).transparentStatusBar().statusBarDarkFont(true).init();
        t.S0(this, this.f35884n, getString(R.string.my_vip));
        this.f35884n.setTransparent();
        this.f35884n.setTabBoldGone();
        ((c3) this.f27702e).v0();
    }

    @Override // in.a
    public View k5() {
        return null;
    }
}
