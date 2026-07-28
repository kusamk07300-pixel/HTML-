package net.babycat.live.modules.profile.ui;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import ao.k;
import em.f0;
import f.n0;
import gm.w;
import java.util.ArrayList;
import java.util.List;
import jm.u1;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.ViewPager2Helper;
import net.lucode.hackware.magicindicator.MagicIndicator;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class MyPayActivity extends in.b<u1> implements f0.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MagicIndicator f35722n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ViewPager2 f35723o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<Fragment> f35724p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public k f35725q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f35726r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f35727s;

    public class a implements k.b {
        public a() {
        }

        @Override // ao.k.b
        public void onTabClick(int i10) {
            MyPayActivity.this.f35723o.setCurrentItem(i10);
        }
    }

    public class b extends FragmentStateAdapter {
        public b(@n0 @to.k d dVar) {
            super(dVar);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @n0
        @to.k
        public Fragment createFragment(int i10) {
            return (Fragment) MyPayActivity.this.f35724p.get(i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return MyPayActivity.this.f35724p.size();
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
        this.f35724p = arrayList;
        arrayList.add(w.C5());
        io.a aVar = new io.a(this);
        k kVar = new k(this, new String[]{getString(R.string.diamond)});
        this.f35725q = kVar;
        aVar.setAdapter(kVar);
        this.f35722n.setNavigator(aVar);
        this.f35723o.setOffscreenPageLimit(1);
        this.f35723o.setAdapter(new b(this));
        ViewPager2Helper.bind(this.f35722n, this.f35723o);
        this.f35725q.b(new a());
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_my_pay;
    }

    @Override // in.a
    public void g5() {
        this.f35722n = (MagicIndicator) findViewById(R.id.wallet_indicator);
        this.f35723o = (ViewPager2) findViewById(R.id.view_pager);
        this.f35726r = findViewById(R.id.tv_bc);
        this.f35727s = findViewById(R.id.left_layout);
        this.f35726r.setOnClickListener(this);
        this.f35727s.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        m5(true);
        y5();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.left_layout) {
            finish();
        } else if (id2 == R.id.tv_bc && t.t0()) {
            o5(RechargeRecordActivity.class);
        }
    }
}
