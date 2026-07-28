package net.babycat.live.platform.widget.view;

import androidx.viewpager2.widget.ViewPager2;
import jo.c;
import net.lucode.hackware.magicindicator.MagicIndicator;

/* JADX INFO: loaded from: classes3.dex */
public class ViewPager2Helper {
    public static void bind(final MagicIndicator magicIndicator, ViewPager2 viewPager2) {
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: net.babycat.live.platform.widget.view.ViewPager2Helper.1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int i10) {
                super.onPageScrollStateChanged(i10);
                magicIndicator.a(i10);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrolled(int i10, float f10, int i11) {
                super.onPageScrolled(i10, f10, i11);
                magicIndicator.b(i10, f10, i11);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i10) {
                super.onPageSelected(i10);
                magicIndicator.c(i10);
            }
        });
    }

    public static void bind(final c cVar, ViewPager2 viewPager2) {
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: net.babycat.live.platform.widget.view.ViewPager2Helper.2
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int i10) {
                super.onPageScrollStateChanged(i10);
                cVar.onPageScrollStateChanged(i10);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrolled(int i10, float f10, int i11) {
                super.onPageScrolled(i10, f10, i11);
                cVar.onPageScrolled(i10, f10, i11);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i10) {
                super.onPageSelected(i10);
                cVar.onPageSelected(i10);
            }
        });
    }
}
