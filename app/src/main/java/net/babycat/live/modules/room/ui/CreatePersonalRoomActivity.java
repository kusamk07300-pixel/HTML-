package net.babycat.live.modules.room.ui;

import android.graphics.Color;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import f.n0;
import java.util.ArrayList;
import java.util.List;
import mm.b;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.widget.view.ViewPager2Helper;
import net.lucode.hackware.magicindicator.MagicIndicator;
import nm.a;
import pm.c;
import pm.e;
import qmyy.babycat.live.R;
import to.k;

/* JADX INFO: loaded from: classes4.dex */
public class CreatePersonalRoomActivity extends in.b<sm.a> implements a.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MagicIndicator f35941n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ViewPager2 f35942o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<Fragment> f35943p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public mm.b f35944q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f35945r;

    public class a implements b.InterfaceC0415b {
        public a() {
        }

        @Override // mm.b.InterfaceC0415b
        public void onTabClick(int i10) {
            CreatePersonalRoomActivity.this.f35942o.setCurrentItem(i10);
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
            return (Fragment) CreatePersonalRoomActivity.this.f35943p.get(i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return CreatePersonalRoomActivity.this.f35943p.size();
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
        this.f35943p = arrayList;
        arrayList.add(e.B5());
        this.f35943p.add(c.E5());
        this.f35941n.setBackgroundColor(Color.parseColor("#00000000"));
        io.a aVar = new io.a(this);
        mm.b bVar = new mm.b(this, new String[]{getString(R.string.voice_room), getString(R.string.live_room)});
        this.f35944q = bVar;
        aVar.setAdapter(bVar);
        this.f35941n.setNavigator(aVar);
        this.f35942o.setAdapter(new b(this));
        ViewPager2Helper.bind(this.f35941n, this.f35942o);
        this.f35944q.b(new a());
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_create_personal_room;
    }

    @Override // in.a
    public void g5() {
        this.f35941n = (MagicIndicator) findViewById(R.id.cpr_title_indicator);
        this.f35942o = (ViewPager2) findViewById(R.id.blind_vp_content);
        View viewFindViewById = findViewById(R.id.iv_close);
        this.f35945r = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        y5();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.iv_close) {
            return;
        }
        finish();
    }

    @Override // in.b
    public void onReceiveEvent(b0 b0Var) {
        super.onReceiveEvent(b0Var);
        if (b0Var.a() != 1107) {
            return;
        }
        finish();
    }
}
