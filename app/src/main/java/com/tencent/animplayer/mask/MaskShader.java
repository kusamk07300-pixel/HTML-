package com.tencent.qgame.animplayer.mask;

import android.opengl.GLES20;
import com.tencent.qgame.animplayer.util.ShaderUtil;
import kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes2.dex */
public final class MaskShader {
    private static final String A_POSITION = "vPosition";
    private static final String A_TEXTURE_MASK_COORDINATES = "vTexCoordinateAlphaMask";
    public static final Companion Companion = new Companion(null);
    private static final String FRAGMENT_BLUR_EDGE = "precision mediump float;\nuniform sampler2D uTextureAlphaMask;\nvarying vec2 v_TexCoordinateAlphaMask;\nmat3 weight = mat3(0.0625,0.125,0.0625,0.125,0.25,0.125,0.0625,0.125,0.0625);\n int coreSize=3;\nfloat texelOffset = .01;\n\nvoid main() {\n   float alphaResult = 0.;\n   for(int y = 0; y < coreSize; y++) {\n       for(int x = 0;x < coreSize; x++) {\n           alphaResult += texture2D(uTextureAlphaMask, vec2(v_TexCoordinateAlphaMask.x + (-1.0 + float(x)) * texelOffset,v_TexCoordinateAlphaMask.y + (-1.0 + float(y)) * texelOffset)).a * weight[x][y];\n       }\n    }\n    gl_FragColor = vec4(0, 0, 0, alphaResult);\n}";
    private static final String FRAGMENT_NO_BLUR_EDGE = "precision mediump float;\nuniform sampler2D uTextureAlphaMask;\nvarying vec2 v_TexCoordinateAlphaMask;\n\nvoid main () {\n    vec4 alphaMaskColor = texture2D(uTextureAlphaMask, v_TexCoordinateAlphaMask);\n    gl_FragColor = vec4(0, 0, 0, alphaMaskColor.a);\n}";
    private static final String FRAGMENT_ROW = "precision mediump float;\nuniform sampler2D uTextureAlphaMask;\nvarying vec2 v_TexCoordinateAlphaMask;\nvec3 weight = vec3(0.4026,0.2442,0.0545);\n \nvoid main() {\n   float texelOffset = .01;\n   vec2 uv[5];\n   uv[0]= v_TexCoordinateAlphaMask;\n   uv[1]=vec2(uv[0].x+texelOffset*1.0,  uv[0].y);\n   uv[2]=vec2(uv[0].x-texelOffset*1.0,  uv[0].y);\n   uv[3]=vec2(uv[0].x+texelOffset*2.0,  uv[0].y);\n   uv[4]=vec2(uv[0].x-texelOffset*2.0,  uv[0].y);\n   float alphaResult = texture2D(uTextureAlphaMask, uv[0]).a * weight[0];\n   for(int i = 1; i < 3; ++i) {\n       alphaResult += texture2D(uTextureAlphaMask, uv[2*i-1]).a * weight[i];\n       alphaResult += texture2D(uTextureAlphaMask, uv[2*i]).a * weight[i];\n    }\n    gl_FragColor = vec4(0, 0, 0, alphaResult);\n}";
    private static final String U_TEXTURE_ALPHA_MASK_UNIT = "uTextureAlphaMask";
    private static final String VERTEX = "attribute vec4 vPosition;\nattribute vec4 vTexCoordinateAlphaMask;\nvarying vec2 v_TexCoordinateAlphaMask;\n\nvoid main() {\n    v_TexCoordinateAlphaMask = vec2(vTexCoordinateAlphaMask.x, vTexCoordinateAlphaMask.y);\n    gl_Position = vPosition;\n}";
    private final int aPositionLocation;
    private final int aTextureMaskCoordinatesLocation;
    private final int program;
    private final int uTextureMaskUnitLocation;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(v vVar) {
            this();
        }
    }

    public MaskShader(boolean z10) {
        ShaderUtil shaderUtil;
        String str;
        if (z10) {
            shaderUtil = ShaderUtil.INSTANCE;
            str = FRAGMENT_BLUR_EDGE;
        } else {
            shaderUtil = ShaderUtil.INSTANCE;
            str = FRAGMENT_NO_BLUR_EDGE;
        }
        int iCreateProgram = shaderUtil.createProgram(VERTEX, str);
        this.program = iCreateProgram;
        this.uTextureMaskUnitLocation = GLES20.glGetUniformLocation(iCreateProgram, U_TEXTURE_ALPHA_MASK_UNIT);
        this.aPositionLocation = GLES20.glGetAttribLocation(iCreateProgram, A_POSITION);
        this.aTextureMaskCoordinatesLocation = GLES20.glGetAttribLocation(iCreateProgram, A_TEXTURE_MASK_COORDINATES);
    }

    public final int getAPositionLocation() {
        return this.aPositionLocation;
    }

    public final int getATextureMaskCoordinatesLocation() {
        return this.aTextureMaskCoordinatesLocation;
    }

    public final int getUTextureMaskUnitLocation() {
        return this.uTextureMaskUnitLocation;
    }

    public final void useProgram() {
        GLES20.glUseProgram(this.program);
    }
}
