package com.tencent.qgame.animplayer.util;

import com.tencent.qgame.animplayer.PointRect;
import kotlin.jvm.internal.g0;
import to.k;

/* JADX INFO: loaded from: classes2.dex */
public final class VertexUtil {
    public static final VertexUtil INSTANCE = new VertexUtil();

    private VertexUtil() {
    }

    private final float switchX(float f10) {
        return (f10 * 2.0f) - 1.0f;
    }

    private final float switchY(float f10) {
        return (((f10 * 2.0f) - 2.0f) * (-1.0f)) - 1.0f;
    }

    @k
    public final float[] create(int i10, int i11, @k PointRect rect, @k float[] array) {
        g0.q(rect, "rect");
        g0.q(array, "array");
        float f10 = i10;
        array[0] = switchX(rect.getX() / f10);
        float f11 = i11;
        array[1] = switchY(rect.getY() / f11);
        array[2] = switchX(rect.getX() / f10);
        array[3] = switchY((rect.getY() + rect.getH()) / f11);
        array[4] = switchX((rect.getX() + rect.getW()) / f10);
        array[5] = switchY(rect.getY() / f11);
        array[6] = switchX((rect.getX() + rect.getW()) / f10);
        array[7] = switchY((rect.getY() + rect.getH()) / f11);
        return array;
    }
}
