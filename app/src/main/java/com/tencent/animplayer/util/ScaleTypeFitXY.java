package com.tencent.qgame.animplayer.util;

import android.widget.FrameLayout;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import to.k;

/* JADX INFO: loaded from: classes2.dex */
public final class ScaleTypeFitXY implements IScaleType {
    private int realHeight;
    private int realWidth;

    @Override // com.tencent.qgame.animplayer.util.IScaleType
    @k
    public FrameLayout.LayoutParams getLayoutParam(int i10, int i11, int i12, int i13, @k FrameLayout.LayoutParams layoutParams) {
        g0.q(layoutParams, "layoutParams");
        layoutParams.width = -1;
        layoutParams.height = -1;
        this.realWidth = i10;
        this.realHeight = i11;
        return layoutParams;
    }

    @Override // com.tencent.qgame.animplayer.util.IScaleType
    @k
    public Pair<Integer, Integer> getRealSize() {
        return new Pair<>(Integer.valueOf(this.realWidth), Integer.valueOf(this.realHeight));
    }
}
