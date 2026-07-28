package com.tencent.qgame.animplayer;

import to.k;
import to.l;

/* JADX INFO: loaded from: classes2.dex */
public interface IRenderListener {

    public static final class DefaultImpls {
        public static void setYUVData(IRenderListener iRenderListener, int i10, int i11, @l byte[] bArr, @l byte[] bArr2, @l byte[] bArr3) {
        }

        public static void updateViewPort(IRenderListener iRenderListener, int i10, int i11) {
        }
    }

    void clearFrame();

    void destroyRender();

    int getExternalTexture();

    void initRender();

    void releaseTexture();

    void renderFrame();

    void setAnimConfig(@k AnimConfig animConfig);

    void setYUVData(int i10, int i11, @l byte[] bArr, @l byte[] bArr2, @l byte[] bArr3);

    void swapBuffers();

    void updateViewPort(int i10, int i11);
}
