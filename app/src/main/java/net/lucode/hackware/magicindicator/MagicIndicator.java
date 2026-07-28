package net.lucode.hackware.magicindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import fo.a;

/* JADX INFO: loaded from: classes3.dex */
public class MagicIndicator extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f37206a;

    public MagicIndicator(Context context) {
        super(context);
    }

    public void a(int i10) {
        a aVar = this.f37206a;
        if (aVar != null) {
            aVar.onPageScrollStateChanged(i10);
        }
    }

    public void b(int i10, float f10, int i11) {
        a aVar = this.f37206a;
        if (aVar != null) {
            aVar.onPageScrolled(i10, f10, i11);
        }
    }

    public void c(int i10) {
        a aVar = this.f37206a;
        if (aVar != null) {
            aVar.onPageSelected(i10);
        }
    }

    public a getNavigator() {
        return this.f37206a;
    }

    public void setNavigator(a aVar) {
        a aVar2 = this.f37206a;
        if (aVar2 == aVar) {
            return;
        }
        if (aVar2 != null) {
            aVar2.c();
        }
        this.f37206a = aVar;
        removeAllViews();
        if (this.f37206a instanceof View) {
            addView((View) this.f37206a, new FrameLayout.LayoutParams(-1, -1));
            this.f37206a.b();
        }
    }

    public MagicIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
