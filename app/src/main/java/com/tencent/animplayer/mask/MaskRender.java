package com.tencent.qgame.animplayer.mask;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.tencent.qgame.animplayer.AnimConfig;
import com.tencent.qgame.animplayer.Decoder;
import com.tencent.qgame.animplayer.IRenderListener;
import com.tencent.qgame.animplayer.PointRect;
import com.tencent.qgame.animplayer.RefVec2;
import com.tencent.qgame.animplayer.util.GlFloatArray;
import com.tencent.qgame.animplayer.util.TexCoordsUtil;
import com.tencent.qgame.animplayer.util.VertexUtil;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import s2.m;
import to.k;
import to.l;

/* JADX INFO: loaded from: classes2.dex */
public final class MaskRender {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AnimPlayer.MaskRender";
    private final MaskAnimPlugin maskAnimPlugin;
    private GlFloatArray maskArray;

    @l
    private MaskShader maskShader;

    @k
    private GlFloatArray vertexArray;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(v vVar) {
            this();
        }
    }

    public MaskRender(@k MaskAnimPlugin maskAnimPlugin) {
        g0.q(maskAnimPlugin, "maskAnimPlugin");
        this.maskAnimPlugin = maskAnimPlugin;
        this.vertexArray = new GlFloatArray();
        this.maskArray = new GlFloatArray();
    }

    @l
    public final MaskShader getMaskShader() {
        return this.maskShader;
    }

    @k
    public final GlFloatArray getVertexArray() {
        return this.vertexArray;
    }

    public final void initMaskShader(boolean z10) {
        this.maskShader = new MaskShader(z10);
        GLES20.glDisable(2929);
    }

    public final void renderFrame(@k AnimConfig config) {
        IRenderListener render;
        MaskShader maskShader;
        MaskConfig maskConfig;
        Bitmap alphaMaskBitmap;
        MaskConfig maskConfig2;
        Pair<PointRect, RefVec2> maskTexPair;
        PointRect pointRectE;
        MaskConfig maskConfig3;
        Pair<PointRect, RefVec2> maskTexPair2;
        RefVec2 refVec2F;
        PointRect pointRect;
        RefVec2 refVec2;
        Pair<PointRect, RefVec2> maskPositionPair;
        Pair<PointRect, RefVec2> maskPositionPair2;
        g0.q(config, "config");
        Decoder decoder = this.maskAnimPlugin.getPlayer().getDecoder();
        if (decoder == null || (render = decoder.getRender()) == null || render.getExternalTexture() <= 0 || (maskShader = this.maskShader) == null || (maskConfig = config.getMaskConfig()) == null) {
            return;
        }
        int maskTexId = maskConfig.getMaskTexId();
        MaskConfig maskConfig4 = config.getMaskConfig();
        if (maskConfig4 == null || (alphaMaskBitmap = maskConfig4.getAlphaMaskBitmap()) == null || (maskConfig2 = config.getMaskConfig()) == null || (maskTexPair = maskConfig2.getMaskTexPair()) == null || (pointRectE = maskTexPair.e()) == null || (maskConfig3 = config.getMaskConfig()) == null || (maskTexPair2 = maskConfig3.getMaskTexPair()) == null || (refVec2F = maskTexPair2.f()) == null) {
            return;
        }
        MaskConfig maskConfig5 = config.getMaskConfig();
        if (maskConfig5 == null || (maskPositionPair2 = maskConfig5.getMaskPositionPair()) == null || (pointRect = maskPositionPair2.e()) == null) {
            pointRect = new PointRect(0, 0, config.getWidth(), config.getHeight());
        }
        MaskConfig maskConfig6 = config.getMaskConfig();
        if (maskConfig6 == null || (maskPositionPair = maskConfig6.getMaskPositionPair()) == null || (refVec2 = maskPositionPair.f()) == null) {
            refVec2 = new RefVec2(config.getWidth(), config.getHeight());
        }
        maskShader.useProgram();
        this.vertexArray.setArray(VertexUtil.INSTANCE.create(refVec2.getW(), refVec2.getH(), pointRect, this.vertexArray.getArray()));
        this.vertexArray.setVertexAttribPointer(maskShader.getAPositionLocation());
        if (maskTexId <= 0 && !alphaMaskBitmap.isRecycled()) {
            MaskConfig maskConfig7 = config.getMaskConfig();
            maskTexId = maskConfig7 != null ? maskConfig7.updateMaskTex() : 0;
        }
        if (maskTexId > 0) {
            this.maskArray.setArray(TexCoordsUtil.INSTANCE.create(refVec2F.getW(), refVec2F.getH(), pointRectE, this.maskArray.getArray()));
            this.maskArray.setVertexAttribPointer(maskShader.getATextureMaskCoordinatesLocation());
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, maskTexId);
            GLES20.glTexParameterf(3553, 10241, 9728);
            GLES20.glTexParameterf(3553, 10240, m.TEXTURE_MIN_FILTER_LINEAR);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            GLES20.glUniform1i(maskShader.getUTextureMaskUnitLocation(), 0);
            GLES20.glEnable(3042);
            GLES20.glBlendFuncSeparate(1, 770, 0, 770);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisable(3042);
        }
    }

    public final void setMaskShader(@l MaskShader maskShader) {
        this.maskShader = maskShader;
    }

    public final void setVertexArray(@k GlFloatArray glFloatArray) {
        g0.q(glFloatArray, "<set-?>");
        this.vertexArray = glFloatArray;
    }
}
