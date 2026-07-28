package net.babycat.live.modules.discover.ui;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import f.n0;
import java.util.ArrayList;
import java.util.List;
import jl.j;
import kl.b;
import ml.u;
import net.lucode.hackware.magicindicator.MagicIndicator;
import qmyy.babycat.live.R;
import to.k;

/* JADX INFO: loaded from: classes4.dex */
public class HomeRankingActivity extends in.b<ol.a> implements b.InterfaceC0372b {
    public ImageView image_bj_rank;
    public ImageView mImageBj;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MagicIndicator f35215n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ViewPager2 f35216o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RelativeLayout f35217p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<Fragment> f35218q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j f35219r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f35220s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f35221t;

    public class a extends ViewPager2.OnPageChangeCallback {
        public a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i10) {
            HomeRankingActivity.this.f35215n.a(i10);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i10, float f10, int i11) {
            HomeRankingActivity.this.f35215n.b(i10, f10, i11);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            HomeRankingActivity.this.f35215n.c(i10);
            if (i10 == 0) {
                HomeRankingActivity.this.mImageBj.setBackgroundResource(R.mipmap.image_ml);
                HomeRankingActivity.this.image_bj_rank.setImageResource(R.mipmap.image_ml_rank);
                HomeRankingActivity.this.f35217p.setBackgroundColor(Color.parseColor("#D0C5FF"));
                return;
            }
            if (i10 == 1) {
                HomeRankingActivity.this.mImageBj.setBackgroundResource(R.mipmap.image_wealth);
                HomeRankingActivity.this.image_bj_rank.setImageResource(R.mipmap.image_wealth_rank);
                HomeRankingActivity.this.f35217p.setBackgroundColor(Color.parseColor("#D88B0E"));
            } else if (i10 == 2) {
                HomeRankingActivity.this.mImageBj.setBackgroundResource(R.mipmap.image_room);
                HomeRankingActivity.this.image_bj_rank.setImageResource(R.mipmap.image_room_rank);
                HomeRankingActivity.this.f35217p.setBackgroundColor(Color.parseColor("#9AFAD0"));
            } else {
                if (i10 != 3) {
                    return;
                }
                HomeRankingActivity.this.mImageBj.setBackgroundResource(R.mipmap.ranking_bg);
                HomeRankingActivity.this.image_bj_rank.setImageResource(R.mipmap.ranking_bg_rank);
                HomeRankingActivity.this.f35217p.setBackgroundColor(Color.parseColor("#F9BFFE"));
            }
        }
    }

    public class b implements j.b {
        public b() {
        }

        @Override // jl.j.b
        public void onTabClick(int i10) {
            HomeRankingActivity.this.f35216o.setCurrentItem(i10);
        }
    }

    public class c extends FragmentStateAdapter {
        public c(@n0 @k d dVar) {
            super(dVar);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @n0
        @k
        public Fragment createFragment(int i10) {
            return (Fragment) HomeRankingActivity.this.f35218q.get(i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return HomeRankingActivity.this.f35218q.size();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void y5() {
        ArrayList arrayList = new ArrayList();
        this.f35218q = arrayList;
        arrayList.add(u.y5("in", 0));
        this.f35218q.add(u.y5("out", 1));
        this.f35218q.add(u.y5("room", 2));
        this.f35218q.add(ml.a.w5());
        io.a aVar = new io.a(this);
        j jVar = new j(this, new String[]{getString(R.string.charm), getString(R.string.wealth), getString(R.string.room), getString(R.string.cp)});
        this.f35219r = jVar;
        aVar.setAdapter(jVar);
        this.f35215n.setNavigator(aVar);
        this.f35216o.setOffscreenPageLimit(1);
        this.f35216o.setAdapter(new c(this));
        this.f35216o.registerOnPageChangeCallback(new a());
        this.f35219r.b(new b());
        this.f35216o.setCurrentItem(this.f35220s);
        this.f35215n.c(this.f35220s);
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_home_ranking;
    }

    @Override // in.a
    public void g5() {
        this.mImageBj = (ImageView) findViewById(R.id.image_bj);
        this.image_bj_rank = (ImageView) findViewById(R.id.image_bj_rank);
        this.f35215n = (MagicIndicator) findViewById(R.id.shop_magic_indicator);
        this.f35216o = (ViewPager2) findViewById(R.id.view_pager);
        this.f35217p = (RelativeLayout) findViewById(R.id.rl_main);
        View viewFindViewById = findViewById(R.id.ll_left);
        this.f35221t = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        m5(true);
        this.f35220s = getIntent().getIntExtra("pos", 0);
        y5();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.ll_left) {
            return;
        }
        finish();
    }
}
