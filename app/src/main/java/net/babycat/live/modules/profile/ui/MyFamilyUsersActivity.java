package net.babycat.live.modules.profile.ui;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import em.x;
import f.n0;
import gm.c;
import gm.g;
import java.util.ArrayList;
import java.util.List;
import jm.a1;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.SimpleNavigatorAdapter;
import net.babycat.live.platform.widget.view.Topbar;
import net.babycat.live.platform.widget.view.ViewPager2Helper;
import net.lucode.hackware.magicindicator.MagicIndicator;
import qmyy.babycat.live.R;
import to.k;

/* JADX INFO: loaded from: classes4.dex */
public class MyFamilyUsersActivity extends in.b<a1> implements x.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35661n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MagicIndicator f35662o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewPager2 f35663p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35664q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f35665r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f35666s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String[] f35667t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List<Fragment> f35668u = new ArrayList();

    public class a implements SimpleNavigatorAdapter.OnIndicatorTabClickListener {
        public a() {
        }

        @Override // net.babycat.live.platform.widget.view.SimpleNavigatorAdapter.OnIndicatorTabClickListener
        public void onTabClick(int i10) {
            MyFamilyUsersActivity.this.f35663p.setCurrentItem(i10);
        }
    }

    public class b extends FragmentStateAdapter {
        public b(@n0 @k d dVar) {
            super(dVar);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @n0
        @k
        public Fragment createFragment(int i10) {
            return (Fragment) MyFamilyUsersActivity.this.f35668u.get(i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return MyFamilyUsersActivity.this.f35668u.size();
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
        io.a aVar = new io.a(this);
        int i10 = this.f35665r;
        if (i10 == 2 || i10 == 1) {
            this.f35667t = new String[]{getString(R.string.new_join_user), getString(R.string.monthly_exp), getString(R.string.family_identity)};
            this.f35668u.add(g.A5(this.f35664q));
            aVar.setAdjustMode(false);
        } else {
            this.f35667t = new String[]{getString(R.string.monthly_exp), getString(R.string.family_identity)};
            aVar.setAdjustMode(true);
        }
        this.f35668u.add(gm.a.x5(this.f35664q));
        this.f35668u.add(c.E5(this.f35664q, this.f35665r, this.f35666s));
        SimpleNavigatorAdapter simpleNavigatorAdapter = new SimpleNavigatorAdapter(this.f35667t, 18, "#999999", "#333333", new int[]{-16336641, -12162305});
        aVar.setAdapter(simpleNavigatorAdapter);
        simpleNavigatorAdapter.setIndicatorTabClickListener(new a());
        this.f35662o.setNavigator(aVar);
        this.f35663p.setOffscreenPageLimit(1);
        this.f35663p.setAdapter(new b(this));
        ViewPager2Helper.bind(this.f35662o, this.f35663p);
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_my_family_users;
    }

    @Override // in.a
    public void g5() {
        this.f35661n = (Topbar) findViewById(R.id.common_topbar);
        this.f35662o = (MagicIndicator) findViewById(R.id.magical_family);
        this.f35663p = (ViewPager2) findViewById(R.id.view_pager);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.f35661n, getString(R.string.family_users));
        this.f35664q = getIntent().getIntExtra("family_id", -1);
        this.f35665r = getIntent().getIntExtra("family_manager", 0);
        this.f35666s = getIntent().getIntExtra("family_join", 0);
        y5();
    }

    @Override // in.a
    public View k5() {
        return null;
    }
}
