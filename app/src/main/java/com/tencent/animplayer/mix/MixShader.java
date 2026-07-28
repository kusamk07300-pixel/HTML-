package com.tencent.qgame.animplayer.mix;

import android.opengl.GLES20;
import com.tencent.qgame.animplayer.util.ShaderUtil;
import kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes2.dex */
public final class MixShader {
    private static final String A_POSITION = "a_Position";
    private static final String A_TEXTURE_MASK_COORDINATES = "a_TextureMaskCoordinates";
    private static final String A_TEXTURE_SRC_COORDINATES = "a_TextureSrcCoordinates";
    public static final Companion Companion = new Companion(null);
    private static final String FRAGMENT = "#extension GL_OES_EGL_image_external : require\nprecision mediump float; \nuniform sampler2D u_TextureSrcUnit;\nuniform samplerExternalOES u_TextureMaskUnit;\nuniform int u_isFill;\nuniform vec4 u_Color;\nvarying vec2 v_TextureSrcCoordinates;\nvarying vec2 v_TextureMaskCoordinates;\nvoid main()\n{\n    vec4 srcRgba = texture2D(u_TextureSrcUnit, v_TextureSrcCoordinates);\n    vec4 maskRgba = texture2D(u_TextureMaskUnit, v_TextureMaskCoordinates);\n    float isFill = step(0.5, float(u_isFill));\n    vec4 srcRgbaCal = isFill * vec4(u_Color.r, u_Color.g, u_Color.b, srcRgba.a) + (1.0 - isFill) * srcRgba;\n    gl_FragColor = vec4(srcRgbaCal.r, srcRgbaCal.g, srcRgbaCal.b, srcRgba.a * maskRgba.r);\n}";
    private static final String U_COLOR = "u_Color";
    private static final String U_IS_FILL = "u_isFill";
    private static final String U_TEXTURE_MASK_UNIT = "u_TextureMaskUnit";
    private static final String U_TEXTURE_SRC_UNIT = "u_TextureSrcUnit";
    private static final String VERTEX = "attribute vec4 a_Position;  \nattribute vec2 a_TextureSrcCoordinates;\nattribute vec2 a_TextureMaskCoordinates;\nvarying vec2 v_TextureSrcCoordinates;\nvarying vec2 v_TextureMaskCoordinates;\nvoid main()\n{\n    v_TextureSrcCoordinates = a_TextureSrcCoordinates;\n    v_TextureMaskCoordinates = a_TextureMaskCoordinates;\n    gl_Position = a_Position;\n}";
    private final int aPositionLocation;
    private final int aTextureMaskCoordinatesLocation;
    private final int aTextureSrcCoordinatesLocation;
    private final int program;
    private final int uColorLocation;
    private final int uIsFillLocation;
    private final int uTextureMaskUnitLocation;
    private final int uTextureSrcUnitLocation;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(v vVar) {
            this();
        }
    }

    public MixShader() {
        int iCreateProgram = ShaderUtil.INSTANCE.createProgram(VERTEX, FRAGMENT);
        this.program = iCreateProgram;
        this.uTextureSrcUnitLocation = GLES20.glGetUniformLocation(iCreateProgram, U_TEXTURE_SRC_UNIT);
        this.uTextureMaskUnitLocation = GLES20.glGetUniformLocation(iCreateProgram, U_TEXTURE_MASK_UNIT);
        this.uIsFillLocation = GLES20.glGetUniformLocation(iCreateProgram, U_IS_FILL);
        this.uColorLocation = GLES20.glGetUniformLocation(iCreateProgram, U_COLOR);
        this.aPositionLocation = GLES20.glGetAttribLocation(iCreateProgram, A_POSITION);
        this.aTextureSrcCoordinatesLocation = GLES20.glGetAttribLocation(iCreateProgram, A_TEXTURE_SRC_COORDINATES);
        this.aTextureMaskCoordinatesLocation = GLES20.glGetAttribLocation(iCreateProgram, A_TEXTURE_MASK_COORDINATES);
    }

    public final int getAPositionLocation() {
        return this.aPositionLocation;
    }

    public final int getATextureMaskCoordinatesLocation() {
        return this.aTextureMaskCoordinatesLocation;
    }

    public final int getATextureSrcCoordinatesLocation() {
        return this.aTextureSrcCoordinatesLocation;
    }

    public final int getProgram() {
        return this.program;
    }

    public final int getUColorLocation() {
        return this.uColorLocation;
    }

    public final int getUIsFillLocation() {
        return this.uIsFillLocation;
    }

    public final int getUTextureMaskUnitLocation() {
        return this.uTextureMaskUnitLocation;
    }

    public final int getUTextureSrcUnitLocation() {
        return this.uTextureSrcUnitLocation;
    }

    public final void useProgram() {
        GLES20.glUseProgram(this.program);
    }
}
