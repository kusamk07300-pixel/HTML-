package com.tencent.qgame.animplayer;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.tencent.qgame.animplayer.IRenderListener;
import com.tencent.qgame.animplayer.util.GlFloatArray;
import com.tencent.qgame.animplayer.util.ShaderUtil;
import com.tencent.qgame.animplayer.util.TexCoordsUtil;
import com.tencent.qgame.animplayer.util.VertexUtil;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import s2.m;
import to.k;
import to.l;

/* JADX INFO: loaded from: classes2.dex */
public final class Render implements IRenderListener {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AnimPlayer.Render";
    private int aPositionLocation;
    private int aTextureAlphaLocation;
    private int aTextureRgbLocation;
    private final GlFloatArray alphaArray;
    private final EGLUtil eglUtil;
    private int[] genTexture;
    private final GlFloatArray rgbArray;
    private int shaderProgram;
    private int surfaceHeight;
    private boolean surfaceSizeChanged;
    private int surfaceWidth;
    private int uTextureLocation;
    private final GlFloatArray vertexArray;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(v vVar) {
            this();
        }
    }

    public Render(@k SurfaceTexture surfaceTexture) {
        g0.q(surfaceTexture, "surfaceTexture");
        this.vertexArray = new GlFloatArray();
        this.alphaArray = new GlFloatArray();
        this.rgbArray = new GlFloatArray();
        EGLUtil eGLUtil = new EGLUtil();
        this.eglUtil = eGLUtil;
        this.genTexture = new int[1];
        eGLUtil.start(surfaceTexture);
        initRender();
    }

    private final void draw() {
        GLES20.glUseProgram(this.shaderProgram);
        this.vertexArray.setVertexAttribPointer(this.aPositionLocation);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.genTexture[0]);
        GLES20.glUniform1i(this.uTextureLocation, 0);
        this.alphaArray.setVertexAttribPointer(this.aTextureAlphaLocation);
        this.rgbArray.setVertexAttribPointer(this.aTextureRgbLocation);
        GLES20.glDrawArrays(5, 0, 4);
    }

    private final void setTexCoords(AnimConfig animConfig) {
        TexCoordsUtil texCoordsUtil = TexCoordsUtil.INSTANCE;
        float[] fArrCreate = texCoordsUtil.create(animConfig.getVideoWidth(), animConfig.getVideoHeight(), animConfig.getAlphaPointRect(), this.alphaArray.getArray());
        float[] fArrCreate2 = texCoordsUtil.create(animConfig.getVideoWidth(), animConfig.getVideoHeight(), animConfig.getRgbPointRect(), this.rgbArray.getArray());
        this.alphaArray.setArray(fArrCreate);
        this.rgbArray.setArray(fArrCreate2);
    }

    private final void setVertexBuf(AnimConfig animConfig) {
        this.vertexArray.setArray(VertexUtil.INSTANCE.create(animConfig.getWidth(), animConfig.getHeight(), new PointRect(0, 0, animConfig.getWidth(), animConfig.getHeight()), this.vertexArray.getArray()));
    }

    @Override // com.tencent.qgame.animplayer.IRenderListener
    public void clearFrame() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        this.eglUtil.swapBuffers();
    }

    @Override // com.tencent.qgame.animplayer.IRenderListener
    public void destroyRender() {
        releaseTexture();
        this.eglUtil.release();
    }

    @Override // com.tencent.qgame.animplayer.IRenderListener
    public int getExternalTexture() {
        return this.genTexture[0];
    }

    @Override // com.tencent.qgame.animplayer.IRenderListener
    public void initRender() {
        int iCreateProgram = ShaderUtil.INSTANCE.createProgram(RenderConstant.VERTEX_SHADER, RenderConstant.FRAGMENT_SHADER);
        this.shaderProgram = iCreateProgram;
        this.uTextureLocation = GLES20.glGetUniformLocation(iCreateProgram, "texture");
        this.aPositionLocation = GLES20.glGetAttribLocation(this.shaderProgram, "vPosition");
        this.aTextureAlphaLocation = GLES20.glGetAttribLocation(this.shaderProgram, "vTexCoordinateAlpha");
        this.aTextureRgbLocation = GLES20.glGetAttribLocation(this.shaderProgram, "vTexCoordinateRgb");
        int[] iArr = this.genTexture;
        GLES20.glGenTextures(iArr.length, iArr, 0);
        GLES20.glBindTexture(36197, this.genTexture[0]);
        GLES20.glTexParameterf(36197, 10241, 9728);
        GLES20.glTexParameterf(36197, 10240, m.TEXTURE_MIN_FILTER_LINEAR);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
    }

    @Override // com.tencent.qgame.animplayer.IRenderListener
    public void releaseTexture() {
        int[] iArr = this.genTexture;
        GLES20.glDeleteTextures(iArr.length, iArr, 0);
    }

    @Override // com.tencent.qgame.animplayer.IRenderListener
    public void renderFrame() {
        int i10;
        int i11;
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        if (this.surfaceSizeChanged && (i10 = this.surfaceWidth) > 0 && (i11 = this.surfaceHeight) > 0) {
            this.surfaceSizeChanged = false;
            GLES20.glViewport(0, 0, i10, i11);
        }
        draw();
    }

    @Override // com.tencent.qgame.animplayer.IRenderListener
    public void setAnimConfig(@k AnimConfig config) {
        g0.q(config, "config");
        setVertexBuf(config);
        setTexCoords(config);
    }

    @Override // com.tencent.qgame.animplayer.IRenderListener
    public void setYUVData(int i10, int i11, @l byte[] bArr, @l byte[] bArr2, @l byte[] bArr3) {
        IRenderListener.DefaultImpls.setYUVData(this, i10, i11, bArr, bArr2, bArr3);
    }

    @Override // com.tencent.qgame.animplayer.IRenderListener
    public void swapBuffers() {
        this.eglUtil.swapBuffers();
    }

    @Override // com.tencent.qgame.animplayer.IRenderListener
    public void updateViewPort(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.surfaceSizeChanged = true;
        this.surfaceWidth = i10;
        this.surfaceHeight = i11;
    }
}
