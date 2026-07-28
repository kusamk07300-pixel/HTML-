package com.tencent.qgame.animplayer.util;

import com.tencent.qgame.animplayer.PointRect;
import kotlin.jvm.internal.g0;
import to.k;

/* JADX INFO: loaded from: classes2.dex */
public final class TexCoordsUtil {
    public static final TexCoordsUtil INSTANCE = new TexCoordsUtil();

    private TexCoordsUtil() {
    }

    @k
    public final float[] create(int i10, int i11, @k PointRect rect, @k float[] array) {
        g0.q(rect, "rect");
        g0.q(array, "array");
        float f10 = i10;
        array[0] = rect.getX() / f10;
        float f11 = i11;
        array[1] = rect.getY() / f11;
        array[2] = rect.getX() / f10;
        array[3] = (rect.getY() + rect.getH()) / f11;
        array[4] = (rect.getX() + rect.getW()) / f10;
        array[5] = rect.getY() / f11;
        array[6] = (rect.getX() + rect.getW()) / f10;
        array[7] = (rect.getY() + rect.getH()) / f11;
        return array;
    }

    @k
    public final float[] rotate90(@k float[] array) {
        g0.q(array, "array");
        float f10 = array[0];
        float f11 = array[1];
        array[0] = array[2];
        array[1] = array[3];
        array[2] = array[6];
        array[3] = array[7];
        array[6] = array[4];
        array[7] = array[5];
        array[4] = f10;
        array[5] = f11;
        return array;
    }
}
