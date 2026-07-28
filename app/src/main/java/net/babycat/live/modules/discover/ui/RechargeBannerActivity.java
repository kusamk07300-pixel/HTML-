package net.babycat.live.modules.discover.ui;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.gyf.immersionbar.ImmersionBar;
import f.n0;
import in.b;
import java.util.ArrayList;
import java.util.List;
import kl.g;
import ml.i0;
import net.babycat.live.model.RechargeInfoBean;
import ol.k;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class RechargeBannerActivity extends b<k> implements g.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ViewPager2 f35248n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<Fragment> f35249o;

    public class a extends FragmentStateAdapter {
        public a(@n0 @to.k d dVar) {
            super(dVar);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @n0
        @to.k
        public Fragment createFragment(int i10) {
            return (Fragment) RechargeBannerActivity.this.f35249o.get(i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return RechargeBannerActivity.this.f35249o.size();
        }
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_recharge_banner;
    }

    @Override // kl.g.b
    public void f1(List<RechargeInfoBean> list) {
        this.f35249o = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f35249o.add(i0.v5(list.get(i10)));
        }
        this.f35248n.setOffscreenPageLimit(this.f35249o.size());
        this.f35248n.setAdapter(new a(this));
    }

    @Override // in.a
    public void g5() {
        this.f35248n = (ViewPager2) findViewById(R.id.recharge_view_pager);
    }

    @Override // in.a
    public void h5() {
        ImmersionBar.with(this).fitsSystemWindows(false).transparentStatusBar().statusBarDarkFont(false).init();
        ((k) this.f27702e).N2();
    }

    @Override // in.a
    public View k5() {
        return null;
    }
}
