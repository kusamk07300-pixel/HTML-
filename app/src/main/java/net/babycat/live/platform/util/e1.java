package net.babycat.live.platform.util;

import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;
import net.lucode.hackware.magicindicator.MagicIndicator;

/* JADX INFO: loaded from: classes3.dex */
public class e1 {

    public class a extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MagicIndicator f36690a;

        public a(MagicIndicator magicIndicator) {
            this.f36690a = magicIndicator;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i10) {
            super.onPageScrollStateChanged(i10);
            this.f36690a.a(i10);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i10, float f10, int i11) {
            super.onPageScrolled(i10, f10, i11);
            this.f36690a.b(i10, f10, i11);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            super.onPageSelected(i10);
            this.f36690a.c(i10);
        }
    }

    public static class b extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<MagicIndicator> f36691a;

        public b(MagicIndicator magicIndicator, ViewPager2 viewPager2) {
            this.f36691a = new WeakReference<>(magicIndicator);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i10) {
            super.onPageScrollStateChanged(i10);
            MagicIndicator magicIndicator = this.f36691a.get();
            if (magicIndicator != null) {
                magicIndicator.a(i10);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i10, float f10, int i11) {
            super.onPageScrolled(i10, f10, i11);
            MagicIndicator magicIndicator = this.f36691a.get();
            if (magicIndicator != null) {
                magicIndicator.b(i10, f10, i11);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            super.onPageSelected(i10);
            MagicIndicator magicIndicator = this.f36691a.get();
            if (magicIndicator != null) {
                magicIndicator.c(i10);
            }
        }
    }

    public e1() {
        throw new AssertionError("工具类不允许实例化");
    }

    public static void a(@f.n0 MagicIndicator magicIndicator, @f.n0 ViewPager2 viewPager2) {
        if (magicIndicator == null) {
            throw new IllegalArgumentException("MagicIndicator 不可为 null");
        }
        if (viewPager2 == null) {
            throw new IllegalArgumentException("ViewPager2 不可为 null");
        }
        viewPager2.registerOnPageChangeCallback(new a(magicIndicator));
    }

    public static void b(@f.n0 ViewPager2 viewPager2, int i10, boolean z10) {
        if (viewPager2 == null) {
            throw new IllegalArgumentException("ViewPager2 不可为 null");
        }
        int itemCount = viewPager2.getAdapter() != null ? viewPager2.getAdapter().getItemCount() : 0;
        if (i10 < 0 || i10 >= itemCount || viewPager2.getCurrentItem() == i10) {
            return;
        }
        viewPager2.setCurrentItem(i10, z10);
    }
}
