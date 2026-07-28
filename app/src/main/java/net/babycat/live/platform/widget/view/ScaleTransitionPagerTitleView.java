package net.babycat.live.platform.widget.view;

import android.content.Context;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.b;

/* JADX INFO: loaded from: classes3.dex */
public class ScaleTransitionPagerTitleView extends b {
    private float mMinScale;

    public ScaleTransitionPagerTitleView(Context context, Float f10) {
        super(context);
        this.mMinScale = f10.floatValue();
    }

    public float getMinScale() {
        return this.mMinScale;
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.b, net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.e, jo.d
    public void onEnter(int i10, int i11, float f10, boolean z10) {
        super.onEnter(i10, i11, f10, z10);
        float f11 = this.mMinScale;
        setScaleX(f11 + ((1.0f - f11) * f10));
        float f12 = this.mMinScale;
        setScaleY(f12 + ((1.0f - f12) * f10));
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.b, net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.e, jo.d
    public void onLeave(int i10, int i11, float f10, boolean z10) {
        super.onLeave(i10, i11, f10, z10);
        setScaleX(((this.mMinScale - 1.0f) * f10) + 1.0f);
        setScaleY(((this.mMinScale - 1.0f) * f10) + 1.0f);
    }

    public void setMinScale(float f10) {
        this.mMinScale = f10;
    }
}
