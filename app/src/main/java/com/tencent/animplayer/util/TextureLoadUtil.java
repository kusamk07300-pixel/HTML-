package com.tencent.qgame.animplayer.util;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import s2.m;
import to.l;

/* JADX INFO: loaded from: classes2.dex */
public final class TextureLoadUtil {
    public static final TextureLoadUtil INSTANCE = new TextureLoadUtil();
    private static final String TAG = "TextureUtil";

    private TextureLoadUtil() {
    }

    public final int loadTexture(@l Bitmap bitmap) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        if (iArr[0] == 0) {
            return 0;
        }
        if (bitmap == null) {
            GLES20.glDeleteTextures(1, iArr, 0);
            return 0;
        }
        if (bitmap.isRecycled()) {
            ALog.INSTANCE.e(TAG, "bitmap isRecycled");
            return 0;
        }
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, m.TEXTURE_MIN_FILTER_LINEAR_MIPMAP_LINEAR);
        GLES20.glTexParameteri(3553, 10240, m.TEXTURE_MIN_FILTER_LINEAR);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        GLES20.glGenerateMipmap(3553);
        GLES20.glBindTexture(3553, 0);
        return iArr[0];
    }

    public final void releaseTexure(int i10) {
        if (i10 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        }
    }
}
