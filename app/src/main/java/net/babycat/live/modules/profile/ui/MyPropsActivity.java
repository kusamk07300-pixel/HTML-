package net.babycat.live.modules.profile.ui;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import ao.j;
import em.l0;
import f.n0;
import gm.o;
import java.util.ArrayList;
import java.util.List;
import jm.k2;
import net.babycat.live.model.MyPropsTypeBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import net.babycat.live.platform.widget.view.ViewPager2Helper;
import net.lucode.hackware.magicindicator.MagicIndicator;
import qmyy.babycat.live.R;
import to.k;

/* JADX INFO: loaded from: classes4.dex */
public class MyPropsActivity extends in.b<k2> implements l0.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35781n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MagicIndicator f35782o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<Fragment> f35783p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ViewPager2 f35784q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j f35785r;

    public class a implements j.b {
        public a() {
        }

        @Override // ao.j.b
        public void onTabClick(int i10) {
            MyPropsActivity.this.f35784q.setCurrentItem(i10);
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
            return (Fragment) MyPropsActivity.this.f35783p.get(i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return MyPropsActivity.this.f35783p.size();
        }
    }

    @Override // em.l0.b
    public void S(List<MyPropsTypeBean> list) {
        y5(list);
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_my_props;
    }

    @Override // in.a
    public void g5() {
        this.f35781n = (Topbar) findViewById(R.id.common_topbar);
        this.f35782o = (MagicIndicator) findViewById(R.id.shop_magic_indicator);
        this.f35784q = (ViewPager2) findViewById(R.id.view_pager);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.f35781n, getString(R.string.my_props));
        ((k2) this.f27702e).N(2);
    }

    @Override // in.a
    public View k5() {
        return null;
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
    public final void y5(List<MyPropsTypeBean> list) {
        this.f35783p = new ArrayList();
        String[] strArr = new String[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f35783p.add(o.F5(list.get(i10).getId().intValue()));
            strArr[i10] = list.get(i10).getName();
        }
        io.a aVar = new io.a(this);
        j jVar = new j(this, strArr);
        this.f35785r = jVar;
        aVar.setAdapter(jVar);
        this.f35782o.setNavigator(aVar);
        this.f35784q.setOffscreenPageLimit(4);
        this.f35784q.setAdapter(new b(this));
        ViewPager2Helper.bind(this.f35782o, this.f35784q);
        this.f35785r.b(new a());
    }
}
