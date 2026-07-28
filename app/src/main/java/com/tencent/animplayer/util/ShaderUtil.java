package com.tencent.qgame.animplayer.util;

import android.opengl.GLES20;
import kotlin.jvm.internal.g0;
import to.k;

/* JADX INFO: loaded from: classes2.dex */
public final class ShaderUtil {
    public static final ShaderUtil INSTANCE = new ShaderUtil();
    private static final String TAG = "AnimPlayer.ShaderUtil";

    private ShaderUtil() {
    }

    private final int compileShader(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                ALog.INSTANCE.e(TAG, "Error compiling shader: " + GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                iGlCreateShader = 0;
            }
        }
        if (iGlCreateShader != 0) {
            return iGlCreateShader;
        }
        throw new RuntimeException("Error creating shader.");
    }

    private final int createAndLinkProgram(int i10, int i11) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, i10);
            GLES20.glAttachShader(iGlCreateProgram, i11);
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
            if (iArr[0] == 0) {
                ALog.INSTANCE.e(TAG, "Error compiling program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                GLES20.glDeleteProgram(iGlCreateProgram);
                iGlCreateProgram = 0;
            }
        }
        if (iGlCreateProgram != 0) {
            return iGlCreateProgram;
        }
        throw new RuntimeException("Error creating program.");
    }

    public final int createProgram(@k String vertexSource, @k String fragmentSource) {
        g0.q(vertexSource, "vertexSource");
        g0.q(fragmentSource, "fragmentSource");
        return createAndLinkProgram(compileShader(35633, vertexSource), compileShader(35632, fragmentSource));
    }
}
