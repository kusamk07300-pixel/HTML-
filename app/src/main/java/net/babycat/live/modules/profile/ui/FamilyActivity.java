package net.babycat.live.modules.profile.ui;

import android.content.Context;
import android.graphics.Color;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import ao.p;
import com.gyf.immersionbar.ImmersionBar;
import em.n;
import f.n0;
import gm.e;
import gm.y;
import java.util.ArrayList;
import java.util.List;
import jm.g0;
import jo.c;
import jo.d;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.x1;
import net.babycat.live.platform.widget.view.ShopSimplePagerTitleView;
import net.babycat.live.platform.widget.view.Topbar;
import net.babycat.live.platform.widget.view.ViewPager2Helper;
import net.lucode.hackware.magicindicator.MagicIndicator;
import qmyy.babycat.live.R;
import to.k;

/* JADX INFO: loaded from: classes4.dex */
public class FamilyActivity extends in.b<g0> implements n.b {
    public ViewPager2 mBlindVpContent;
    public Topbar mCommonTopbar;
    public MagicIndicator mDyTitleIndicator;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<Fragment> f35550n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p f35551o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String[] f35552p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35553q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public x1 f35554r;

    public class a extends jo.a {

        /* JADX INFO: renamed from: net.babycat.live.modules.profile.ui.FamilyActivity$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0426a implements View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f35556a;

            public ViewOnClickListenerC0426a(int i10) {
                this.f35556a = i10;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FamilyActivity.this.mBlindVpContent.setCurrentItem(this.f35556a);
            }
        }

        public a() {
        }

        @Override // jo.a
        public int getCount() {
            if (FamilyActivity.this.f35552p == null) {
                return 0;
            }
            return FamilyActivity.this.f35552p.length;
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
            bVar.setColors(Integer.valueOf(Color.parseColor("#333333")));
            return bVar;
        }

        @Override // jo.a
        public d getTitleView(Context context, int i10) {
            ShopSimplePagerTitleView shopSimplePagerTitleView = new ShopSimplePagerTitleView(context);
            shopSimplePagerTitleView.setNormalColor(Color.parseColor("#333333"));
            shopSimplePagerTitleView.setSelectedColor(Color.parseColor("#333333"));
            shopSimplePagerTitleView.setText(FamilyActivity.this.f35552p[i10]);
            shopSimplePagerTitleView.setTextSize(18.0f);
            shopSimplePagerTitleView.getPaint().setFakeBoldText(true);
            shopSimplePagerTitleView.setPadding(t.i(20.0f), 0, t.i(20.0f), 0);
            shopSimplePagerTitleView.setOnClickListener(new ViewOnClickListenerC0426a(i10));
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
            return (Fragment) FamilyActivity.this.f35550n.get(i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return FamilyActivity.this.f35550n.size();
        }
    }

    private void z5() {
        this.f35550n = new ArrayList();
        this.f35552p = new String[]{getString(R.string.new_family), getString(R.string.this_week), getString(R.string.this_month)};
        this.f35550n.add(y.w5(this.f35553q));
        this.f35550n.add(e.w5(2));
        this.f35550n.add(e.w5(1));
        io.a aVar = new io.a(this);
        aVar.setAdapter(new a());
        this.mDyTitleIndicator.setNavigator(aVar);
        this.mBlindVpContent.setOffscreenPageLimit(1);
        this.mBlindVpContent.setAdapter(new b(this));
        ViewPager2Helper.bind(this.mDyTitleIndicator, this.mBlindVpContent);
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_family;
    }

    @Override // in.a
    public void g5() {
        this.mCommonTopbar = (Topbar) findViewById(R.id.common_topbar);
        this.mDyTitleIndicator = (MagicIndicator) findViewById(R.id.dy_title_indicator);
        this.mBlindVpContent = (ViewPager2) findViewById(R.id.blind_vp_content);
    }

    @Override // in.a
    public void h5() {
        ImmersionBar.with(this).fitsSystemWindows(false).transparentStatusBar().statusBarDarkFont(true).init();
        t.S0(this, this.mCommonTopbar, getString(R.string.my_family));
        this.mCommonTopbar.setTabBoldGone();
        this.mCommonTopbar.setTransparent();
        this.f35553q = getIntent().getIntExtra("family_status", -1);
        z5();
        x1 x1Var = new x1(this);
        this.f35554r = x1Var;
        x1Var.q("main_taskId", getTaskId());
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, in.a, androidx.appcompat.app.e, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f35554r.q("main_taskId", 0);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || keyEvent.getAction() != 1) {
            return super.onKeyUp(i10, keyEvent);
        }
        this.f35554r.q("main_taskId", 0);
        finish();
        return true;
    }
}
