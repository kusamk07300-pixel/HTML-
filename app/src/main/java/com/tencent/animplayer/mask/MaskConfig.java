package com.tencent.qgame.animplayer.mask;

import android.graphics.Bitmap;
import com.tencent.qgame.animplayer.PointRect;
import com.tencent.qgame.animplayer.RefVec2;
import com.tencent.qgame.animplayer.util.TextureLoadUtil;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import to.l;

/* JADX INFO: loaded from: classes2.dex */
public final class MaskConfig {

    @l
    private Bitmap alphaMaskBitmap;

    @l
    private Pair<PointRect, RefVec2> maskPositionPair;
    private int maskTexId;

    @l
    private Pair<PointRect, RefVec2> maskTexPair;

    public MaskConfig() {
    }

    private final void setAlphaMaskBitmap(Bitmap bitmap) {
        this.alphaMaskBitmap = bitmap;
    }

    public boolean equals(@l Object obj) {
        if (!(obj instanceof MaskConfig)) {
            return false;
        }
        MaskConfig maskConfig = (MaskConfig) obj;
        if (g0.g(this.alphaMaskBitmap, maskConfig.alphaMaskBitmap)) {
            return false;
        }
        Pair<PointRect, RefVec2> pair = this.maskTexPair;
        PointRect pointRectE = pair != null ? pair.e() : null;
        Pair<PointRect, RefVec2> pair2 = maskConfig.maskTexPair;
        if (g0.g(pointRectE, pair2 != null ? pair2.e() : null)) {
            return false;
        }
        Pair<PointRect, RefVec2> pair3 = this.maskTexPair;
        RefVec2 refVec2F = pair3 != null ? pair3.f() : null;
        Pair<PointRect, RefVec2> pair4 = maskConfig.maskTexPair;
        if (g0.g(refVec2F, pair4 != null ? pair4.f() : null)) {
            return false;
        }
        Pair<PointRect, RefVec2> pair5 = this.maskPositionPair;
        PointRect pointRectE2 = pair5 != null ? pair5.e() : null;
        Pair<PointRect, RefVec2> pair6 = maskConfig.maskPositionPair;
        if (g0.g(pointRectE2, pair6 != null ? pair6.e() : null)) {
            return false;
        }
        Pair<PointRect, RefVec2> pair7 = this.maskPositionPair;
        RefVec2 refVec2F2 = pair7 != null ? pair7.f() : null;
        Pair<PointRect, RefVec2> pair8 = maskConfig.maskPositionPair;
        return !g0.g(refVec2F2, pair8 != null ? pair8.f() : null);
    }

    @l
    public final Bitmap getAlphaMaskBitmap() {
        return this.alphaMaskBitmap;
    }

    @l
    public final Pair<PointRect, RefVec2> getMaskPositionPair() {
        return this.maskPositionPair;
    }

    public final int getMaskTexId() {
        return this.maskTexId;
    }

    @l
    public final Pair<PointRect, RefVec2> getMaskTexPair() {
        return this.maskTexPair;
    }

    public int hashCode() {
        Bitmap bitmap = this.alphaMaskBitmap;
        int iHashCode = (bitmap != null ? bitmap.hashCode() : 0) * 31;
        Pair<PointRect, RefVec2> pair = this.maskTexPair;
        int iHashCode2 = (iHashCode + (pair != null ? pair.hashCode() : 0)) * 31;
        Pair<PointRect, RefVec2> pair2 = this.maskPositionPair;
        return iHashCode2 + (pair2 != null ? pair2.hashCode() : 0);
    }

    public final void release() {
        setAlphaMaskBitmap(null);
        this.maskTexPair = null;
        this.maskPositionPair = null;
    }

    public final void safeSetMaskBitmapAndReleasePre(@l Bitmap bitmap) {
        int i10 = this.maskTexId;
        if (i10 > 0) {
            TextureLoadUtil.INSTANCE.releaseTexure(i10);
            this.maskTexId = 0;
        }
        setAlphaMaskBitmap(bitmap);
    }

    public final void setMaskPositionPair(@l Pair<PointRect, RefVec2> pair) {
        this.maskPositionPair = pair;
    }

    public final void setMaskTexPair(@l Pair<PointRect, RefVec2> pair) {
        this.maskTexPair = pair;
    }

    public final int updateMaskTex() {
        int iLoadTexture = TextureLoadUtil.INSTANCE.loadTexture(this.alphaMaskBitmap);
        this.maskTexId = iLoadTexture;
        return iLoadTexture;
    }

    public MaskConfig(@l Bitmap bitmap, @l Pair<PointRect, RefVec2> pair, @l Pair<PointRect, RefVec2> pair2) {
        this();
        this.maskPositionPair = pair;
        this.maskTexPair = pair2;
        setAlphaMaskBitmap(bitmap);
    }
}
