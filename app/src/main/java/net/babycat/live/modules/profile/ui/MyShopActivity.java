package net.babycat.live.modules.profile.ui;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import ao.j;
import em.n0;
import gm.q;
import java.util.ArrayList;
import java.util.List;
import jm.q2;
import net.babycat.live.model.MyPropsTypeBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import net.babycat.live.platform.widget.view.ViewPager2Helper;
import net.lucode.hackware.magicindicator.MagicIndicator;
import qmyy.babycat.live.R;
import to.k;

/* JADX INFO: loaded from: classes4.dex */
public class MyShopActivity extends in.b<q2> implements n0.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35796n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MagicIndicator f35797o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewPager2 f35798p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<Fragment> f35799q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j f35800r;

    public class a implements Topbar.TopbarRightClickListener {
        public a() {
        }

        @Override // net.babycat.live.platform.widget.view.Topbar.TopbarRightClickListener
        public void rightClick() {
            if (t.t0()) {
                MyShopActivity.this.o5(MyPropsActivity.class);
            }
        }
    }

    public class b implements j.b {
        public b() {
        }

        @Override // ao.j.b
        public void onTabClick(int i10) {
            MyShopActivity.this.f35798p.setCurrentItem(i10);
        }
    }

    public class c extends FragmentStateAdapter {
        public c(@f.n0 @k d dVar) {
            super(dVar);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @f.n0
        @k
        public Fragment createFragment(int i10) {
            return (Fragment) MyShopActivity.this.f35799q.get(i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return MyShopActivity.this.f35799q.size();
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
    private void y5(List<MyPropsTypeBean> list) {
        this.f35799q = new ArrayList();
        String[] strArr = new String[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f35799q.add(q.D5(list.get(i10).getId().intValue()));
            strArr[i10] = list.get(i10).getName();
        }
        io.a aVar = new io.a(this);
        j jVar = new j(this, strArr);
        this.f35800r = jVar;
        aVar.setAdapter(jVar);
        this.f35797o.setNavigator(aVar);
        this.f35798p.setOffscreenPageLimit(4);
        this.f35798p.setAdapter(new c(this));
        ViewPager2Helper.bind(this.f35797o, this.f35798p);
        this.f35800r.b(new b());
    }

    @Override // em.n0.b
    public void S(List<MyPropsTypeBean> list) {
        y5(list);
        if (!getIntent().getBooleanExtra("select_last_tab", false) || list.size() <= 0) {
            return;
        }
        this.f35798p.setCurrentItem(list.size() - 1);
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_my_shop;
    }

    @Override // in.a
    public void g5() {
        this.f35796n = (Topbar) findViewById(R.id.common_topbar);
        this.f35797o = (MagicIndicator) findViewById(R.id.shop_magic_indicator);
        this.f35798p = (ViewPager2) findViewById(R.id.view_pager);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.f35796n, getString(R.string.my_shop));
        this.f35796n.setRightTxtVisible();
        this.f35796n.setRightText(getString(R.string.my_props));
        this.f35796n.setRightTextTextColor(getResources().getColor(R.color.base_text_color));
        this.f35796n.setOnTopbarRightClickListener(new a());
        ((q2) this.f27702e).N(1);
    }

    @Override // in.a
    public View k5() {
        return null;
    }
}
