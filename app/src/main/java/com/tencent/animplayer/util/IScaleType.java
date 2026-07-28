package com.tencent.qgame.animplayer.util;

import android.widget.FrameLayout;
import kotlin.Pair;
import to.k;

/* JADX INFO: loaded from: classes2.dex */
public interface IScaleType {
    @k
    FrameLayout.LayoutParams getLayoutParam(int i10, int i11, int i12, int i13, @k FrameLayout.LayoutParams layoutParams);

    @k
    Pair<Integer, Integer> getRealSize();
}
