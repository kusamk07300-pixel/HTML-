package net.babycat.live.modules.badge.ui;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import f.n0;
import java.util.ArrayList;
import java.util.List;
import jo.d;
import net.babycat.live.model.MedalBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.ShopSimplePagerTitleView;
import net.babycat.live.platform.widget.view.Topbar;
import net.babycat.live.platform.widget.view.ViewPager2Helper;
import net.lucode.hackware.magicindicator.MagicIndicator;
import qmyy.babycat.live.R;
import tk.a;
import to.k;
import wk.b;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class MyMedalActivity extends in.b<yk.a> implements a.b {
    public ViewPager2 mBlindVpContent;
    public RecyclerView mReMedal;
    public MagicIndicator mTitleIndicator;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RelativeLayout f35025n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Topbar f35026o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f35027p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f35028q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public sk.b f35029r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List<Fragment> f35030s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String[] f35031t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f35032u;

    public class a extends jo.a {

        /* JADX INFO: renamed from: net.babycat.live.modules.badge.ui.MyMedalActivity$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0420a implements View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f35034a;

            public ViewOnClickListenerC0420a(int i10) {
                this.f35034a = i10;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MyMedalActivity.this.mBlindVpContent.setCurrentItem(this.f35034a);
            }
        }

        public a() {
        }

        @Override // jo.a
        public int getCount() {
            if (MyMedalActivity.this.f35031t == null) {
                return 0;
            }
            return MyMedalActivity.this.f35031t.length;
        }

        @Override // jo.a
        public jo.c getIndicator(Context context) {
            ko.b bVar = new ko.b(context);
            bVar.setMode(2);
            bVar.setLineHeight(go.b.a(context, 3.0d));
            bVar.setLineWidth(go.b.a(context, 16.0d));
            bVar.setRoundRadius(go.b.a(context, 2.0d));
            bVar.setStartInterpolator(new AccelerateInterpolator());
            bVar.setEndInterpolator(new DecelerateInterpolator(2.0f));
            bVar.setYOffset(10.0f);
            bVar.setColors(Integer.valueOf(Color.parseColor("#A58CFF")));
            return bVar;
        }

        @Override // jo.a
        public d getTitleView(Context context, int i10) {
            ShopSimplePagerTitleView shopSimplePagerTitleView = new ShopSimplePagerTitleView(context);
            shopSimplePagerTitleView.setNormalColor(Color.parseColor("#999999"));
            shopSimplePagerTitleView.setSelectedColor(Color.parseColor("#333333"));
            shopSimplePagerTitleView.setText(MyMedalActivity.this.f35031t[i10]);
            shopSimplePagerTitleView.setTextSize(14.0f);
            shopSimplePagerTitleView.getPaint().setFakeBoldText(true);
            shopSimplePagerTitleView.setOnClickListener(new ViewOnClickListenerC0420a(i10));
            return shopSimplePagerTitleView;
        }
    }

    public class b implements b.d {
        public b() {
        }

        @Override // wk.b.d
        public void a(String str) {
            ((yk.a) MyMedalActivity.this.f27702e).j2(str);
        }
    }

    public class c extends FragmentStateAdapter {
        public c(@n0 @k androidx.fragment.app.d dVar) {
            super(dVar);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @n0
        @k
        public Fragment createFragment(int i10) {
            return (Fragment) MyMedalActivity.this.f35030s.get(i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return MyMedalActivity.this.f35030s.size();
        }
    }

    private void A5() {
        this.f35031t = new String[]{getString(R.string.achieve), getString(R.string.honor), getString(R.string.activity)};
        ArrayList arrayList = new ArrayList();
        this.f35030s = arrayList;
        arrayList.add(vk.c.w5(10));
        this.f35030s.add(vk.c.w5(20));
        this.f35030s.add(vk.c.w5(30));
        io.a aVar = new io.a(this);
        aVar.setAdjustMode(true);
        aVar.setAdapter(new a());
        this.mTitleIndicator.setNavigator(aVar);
        this.mBlindVpContent.setOffscreenPageLimit(1);
        this.mBlindVpContent.setAdapter(new c(this));
        ViewPager2Helper.bind(this.mTitleIndicator, this.mBlindVpContent);
    }

    @Override // tk.a.b
    public void H0() {
        ((yk.a) this.f27702e).C(10);
    }

    @Override // tk.a.b
    public void P(MedalBean medalBean) {
        ((yk.a) this.f27702e).a();
        MedalBean.MedalUserInfoDTO userInfo = medalBean.getUserInfo();
        wn.d.j(this, this.f35027p, userInfo.getAvatar(), 1, "#FFFFFF");
        this.f35028q.setText(userInfo.getNickname());
        this.f35029r.v1(medalBean.getUserMedal());
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_my_medal;
    }

    @Override // in.a
    public void g5() {
        this.mReMedal = (RecyclerView) findViewById(R.id.re_medal);
        this.f35025n = (RelativeLayout) findViewById(R.id.ll_top);
        this.f35026o = (Topbar) findViewById(R.id.common_topbar);
        this.mTitleIndicator = (MagicIndicator) findViewById(R.id.blind_title_indicator);
        this.mBlindVpContent = (ViewPager2) findViewById(R.id.blind_vp_content);
        this.f35027p = (ImageView) findViewById(R.id.iv_head);
        this.f35028q = (TextView) findViewById(R.id.tv_nickname);
        View viewFindViewById = findViewById(R.id.tv_weare_medal);
        this.f35032u = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        m5(true);
        t.S0(this, this.f35026o, getString(R.string.my_medal));
        this.f35026o.setTransparent();
        this.f35026o.setTabBoldGone();
        this.f35029r = new sk.b(new ArrayList());
        this.mReMedal.setLayoutManager(new LinearLayoutManager(this, 0, false));
        this.mReMedal.setAdapter(this.f35029r);
        ((yk.a) this.f27702e).C(10);
        A5();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.tv_weare_medal) {
            return;
        }
        l2(getString(R.string.loading));
        ((yk.a) this.f27702e).O0();
    }

    @Override // tk.a.b
    public void q2(List<MedalBean.MedalUserMedalDTO> list) {
        k3();
        new b.C0752b(this).Y(true).t(new wk.b(this, list, new b())).N();
    }
}
