package net.babycat.live.modules.message.ui;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import ao.p;
import com.gyf.immersionbar.ImmersionBar;
import f.n0;
import java.util.ArrayList;
import java.util.List;
import jo.d;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.ImagePagerIndicator;
import net.babycat.live.platform.widget.view.ShopSimplePagerTitleView;
import net.babycat.live.platform.widget.view.Topbar;
import net.lucode.hackware.magicindicator.MagicIndicator;
import qmyy.babycat.live.R;
import to.k;
import xl.b;

/* JADX INFO: loaded from: classes4.dex */
public class ChatFriendsActivity extends in.b<bm.c> implements b.InterfaceC0735b {
    public ViewPager2 mBlindVpContent;
    public Topbar mCommonTopbar;
    public MagicIndicator mDyTitleIndicator;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<Fragment> f35364n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p f35365o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String[] f35366p = null;

    public class a extends jo.a {

        /* JADX INFO: renamed from: net.babycat.live.modules.message.ui.ChatFriendsActivity$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0423a implements View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f35368a;

            public ViewOnClickListenerC0423a(int i10) {
                this.f35368a = i10;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ChatFriendsActivity.this.mBlindVpContent.setCurrentItem(this.f35368a);
            }
        }

        public a() {
        }

        @Override // jo.a
        public int getCount() {
            if (ChatFriendsActivity.this.f35366p == null) {
                return 0;
            }
            return ChatFriendsActivity.this.f35366p.length;
        }

        @Override // jo.a
        public jo.c getIndicator(Context context) {
            ImagePagerIndicator imagePagerIndicator = new ImagePagerIndicator(context);
            imagePagerIndicator.setMode(2);
            imagePagerIndicator.setLineHeight(go.b.a(context, 7.0d));
            imagePagerIndicator.setLineWidth(go.b.a(context, 37.0d));
            imagePagerIndicator.setStartInterpolator(new AccelerateInterpolator());
            imagePagerIndicator.setEndInterpolator(new DecelerateInterpolator(2.0f));
            imagePagerIndicator.setYOffset(0.0f);
            imagePagerIndicator.setXOffset(1.0f);
            imagePagerIndicator.setImageRes(R.mipmap.host_management_tab);
            return imagePagerIndicator;
        }

        @Override // jo.a
        public d getTitleView(Context context, int i10) {
            ShopSimplePagerTitleView shopSimplePagerTitleView = new ShopSimplePagerTitleView(context);
            shopSimplePagerTitleView.setNormalColor(Color.parseColor("#FFFFFF"));
            shopSimplePagerTitleView.setSelectedColor(Color.parseColor("#FFFFFF"));
            shopSimplePagerTitleView.setText(ChatFriendsActivity.this.f35366p[i10]);
            shopSimplePagerTitleView.setTextSize(18.0f);
            shopSimplePagerTitleView.getPaint().setFakeBoldText(true);
            shopSimplePagerTitleView.setPadding(t.i(10.0f), 0, t.i(10.0f), 0);
            shopSimplePagerTitleView.setOnClickListener(new ViewOnClickListenerC0423a(i10));
            return shopSimplePagerTitleView;
        }
    }

    public class b extends ViewPager2.OnPageChangeCallback {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i10) {
            ChatFriendsActivity.this.mDyTitleIndicator.a(i10);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i10, float f10, int i11) {
            ChatFriendsActivity.this.mDyTitleIndicator.b(i10, f10, i11);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            ChatFriendsActivity.this.mDyTitleIndicator.c(i10);
            ChatFriendsActivity chatFriendsActivity = ChatFriendsActivity.this;
            t.S0(chatFriendsActivity, chatFriendsActivity.mCommonTopbar, chatFriendsActivity.f35366p[i10]);
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
            return (Fragment) ChatFriendsActivity.this.f35364n.get(i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return ChatFriendsActivity.this.f35364n.size();
        }
    }

    private void z5() {
        ArrayList arrayList = new ArrayList();
        this.f35364n = arrayList;
        arrayList.add(zl.a.K5(1, 2, 0, 0, 0));
        this.f35364n.add(zl.a.K5(2, 2, 0, 0, 0));
        this.f35364n.add(zl.a.K5(3, 2, 0, 0, 0));
        io.a aVar = new io.a(this);
        aVar.setAdjustMode(false);
        aVar.setAdapter(new a());
        this.mDyTitleIndicator.setNavigator(aVar);
        this.mBlindVpContent.setOffscreenPageLimit(1);
        this.mBlindVpContent.setAdapter(new c(this));
        this.mBlindVpContent.registerOnPageChangeCallback(new b());
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_chat_friends;
    }

    @Override // in.a
    public void g5() {
        this.mCommonTopbar = (Topbar) findViewById(R.id.common_topbar);
        this.mDyTitleIndicator = (MagicIndicator) findViewById(R.id.dy_title_indicator);
        this.mBlindVpContent = (ViewPager2) findViewById(R.id.blind_vp_content);
    }

    @Override // in.a
    public void h5() {
        ImmersionBar.with(this).fitsSystemWindows(false).transparentStatusBar().statusBarDarkFont(false).init();
        String[] strArr = {getString(R.string.friends), getString(R.string.followed), getString(R.string.fans)};
        this.f35366p = strArr;
        t.S0(this, this.mCommonTopbar, strArr[0]);
        this.mCommonTopbar.setTextTextColor(getResources().getColor(R.color.black));
        this.mCommonTopbar.setTabBoldGone();
        this.mCommonTopbar.setTransparent();
        this.mCommonTopbar.setTopBarWhite();
        z5();
    }

    @Override // in.a
    public View k5() {
        return null;
    }
}
