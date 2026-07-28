package net.babycat.live.modules.creator.ui;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import cl.h;
import f.n0;
import gl.o;
import java.util.ArrayList;
import java.util.List;
import jo.c;
import jo.d;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.HXLinePagerIndicator;
import net.babycat.live.platform.widget.view.ScaleTransitionPagerTitleView;
import net.babycat.live.platform.widget.view.Topbar;
import net.babycat.live.platform.widget.view.ViewPager2Helper;
import net.lucode.hackware.magicindicator.MagicIndicator;
import qmyy.babycat.live.R;
import to.k;

/* JADX INFO: loaded from: classes4.dex */
public class HostManagerActivity extends in.b<o> implements h.b {
    public Topbar mCommonTopbar;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MagicIndicator f35105n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ViewPager2 f35106o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<Fragment> f35108q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f35111t;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35107p = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String[] f35109r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f35110s = 0;

    public class a extends jo.a {

        /* JADX INFO: renamed from: net.babycat.live.modules.creator.ui.HostManagerActivity$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0421a implements View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f35113a;

            public ViewOnClickListenerC0421a(int i10) {
                this.f35113a = i10;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HostManagerActivity.this.f35106o.setCurrentItem(this.f35113a);
            }
        }

        public a() {
        }

        @Override // jo.a
        public int getCount() {
            if (HostManagerActivity.this.f35109r == null) {
                return 0;
            }
            return HostManagerActivity.this.f35109r.length;
        }

        @Override // jo.a
        public c getIndicator(Context context) {
            HXLinePagerIndicator hXLinePagerIndicator = new HXLinePagerIndicator(context, new int[]{-4579848, -4579848});
            hXLinePagerIndicator.setMode(2);
            hXLinePagerIndicator.setLineHeight(go.b.a(context, 3.0d));
            hXLinePagerIndicator.setLineWidth(go.b.a(context, 16.0d));
            hXLinePagerIndicator.setRoundRadius(go.b.a(context, 2.0d));
            hXLinePagerIndicator.setStartInterpolator(new AccelerateInterpolator());
            hXLinePagerIndicator.setEndInterpolator(new DecelerateInterpolator(2.0f));
            hXLinePagerIndicator.setYOffset(10.0f);
            return hXLinePagerIndicator;
        }

        @Override // jo.a
        public d getTitleView(Context context, int i10) {
            ScaleTransitionPagerTitleView scaleTransitionPagerTitleView = new ScaleTransitionPagerTitleView(context, Float.valueOf(1.0f));
            scaleTransitionPagerTitleView.setNormalColor(Color.parseColor("#999999"));
            scaleTransitionPagerTitleView.setSelectedColor(Color.parseColor("#BA1DF8"));
            scaleTransitionPagerTitleView.setText(HostManagerActivity.this.f35109r[i10]);
            scaleTransitionPagerTitleView.setTextSize(16.0f);
            scaleTransitionPagerTitleView.getPaint().setFakeBoldText(true);
            scaleTransitionPagerTitleView.setPadding(t.i(14.0f), 0, t.i(14.0f), 6);
            scaleTransitionPagerTitleView.setOnClickListener(new ViewOnClickListenerC0421a(i10));
            return scaleTransitionPagerTitleView;
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
            return (Fragment) HostManagerActivity.this.f35108q.get(i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return HostManagerActivity.this.f35108q.size();
        }
    }

    private void z5() {
        this.f35109r = new String[]{getString(R.string.total_all), getString(R.string.new_host), getString(R.string.quit_application), getString(R.string.active_yesterday)};
        ArrayList arrayList = new ArrayList();
        this.f35108q = arrayList;
        arrayList.add(el.a.H5(1, this.f35107p, this.f35110s));
        this.f35108q.add(el.a.H5(2, this.f35107p, this.f35110s));
        this.f35108q.add(el.a.H5(4, this.f35107p, this.f35110s));
        this.f35108q.add(el.a.H5(3, this.f35107p, this.f35110s));
        io.a aVar = new io.a(this);
        aVar.setAdapter(new a());
        this.f35105n.setNavigator(aVar);
        this.f35106o.setOffscreenPageLimit(1);
        this.f35106o.setAdapter(new b(this));
        ViewPager2Helper.bind(this.f35105n, this.f35106o);
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_host_manger;
    }

    @Override // in.a
    public void g5() {
        this.mCommonTopbar = (Topbar) findViewById(R.id.common_topbar);
        this.f35105n = (MagicIndicator) findViewById(R.id.host_indicator);
        this.f35106o = (ViewPager2) findViewById(R.id.host_pager);
        View viewFindViewById = findViewById(R.id.add_host);
        this.f35111t = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.mCommonTopbar, getString(R.string.host_management));
        this.f35107p = getIntent().getIntExtra("type", 0);
        this.f35110s = getIntent().getIntExtra("agencyId", 0);
        z5();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.add_host && t.t0()) {
            o5(AddHostActivity.class);
        }
    }
}
