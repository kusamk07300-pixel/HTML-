package com.tencent.qgame.animplayer.util;

import android.widget.FrameLayout;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import to.k;

/* JADX INFO: loaded from: classes2.dex */
public final class ScaleTypeFitCenter implements IScaleType {
    private int realHeight;
    private int realWidth;

    private final Pair<Integer, Integer> getFitCenterSize(int i10, int i11, int i12, int i13) {
        float f10 = i10;
        float f11 = i11;
        float f12 = i12 / i13;
        if (f10 / f11 > f12) {
            i10 = (int) (f12 * f11);
        } else {
            i11 = (int) (f10 / f12);
        }
        return new Pair<>(Integer.valueOf(i10), Integer.valueOf(i11));
    }

    @Override // com.tencent.qgame.animplayer.util.IScaleType
    @k
    public FrameLayout.LayoutParams getLayoutParam(int i10, int i11, int i12, int i13, @k FrameLayout.LayoutParams layoutParams) {
        g0.q(layoutParams, "layoutParams");
        Pair<Integer, Integer> fitCenterSize = getFitCenterSize(i10, i11, i12, i13);
        int iIntValue = fitCenterSize.a().intValue();
        int iIntValue2 = fitCenterSize.b().intValue();
        if (iIntValue <= 0 && iIntValue2 <= 0) {
            return layoutParams;
        }
        this.realWidth = iIntValue;
        this.realHeight = iIntValue2;
        layoutParams.width = iIntValue;
        layoutParams.height = iIntValue2;
        layoutParams.gravity = 17;
        return layoutParams;
    }

    @Override // com.tencent.qgame.animplayer.util.IScaleType
    @k
    public Pair<Integer, Integer> getRealSize() {
        return new Pair<>(Integer.valueOf(this.realWidth), Integer.valueOf(this.realHeight));
    }
}
