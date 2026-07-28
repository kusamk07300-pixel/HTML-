package com.tencent.qgame.animplayer;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.tencent.qgame.animplayer.IRenderListener;
import com.tencent.qgame.animplayer.util.GlFloatArray;
import com.tencent.qgame.animplayer.util.ShaderUtil;
import com.tencent.qgame.animplayer.util.TexCoordsUtil;
import com.tencent.qgame.animplayer.util.VertexUtil;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import s2.m;
import to.k;
import to.l;
import x.w;

/* JADX INFO: loaded from: classes2.dex */
public final class YUVRender implements IRenderListener {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AnimPlayer.YUVRender";
    private final float[] YUV_MATRIX;
    private final float[] YUV_OFFSET;
    private final GlFloatArray alphaArray;
    private int alphaPosition;
    private int avPosition;
    private int convertMatrixUniform;
    private int convertOffsetUniform;
    private final EGLUtil eglUtil;
    private int heightYUV;
    private final GlFloatArray rgbArray;
    private int rgbPosition;
    private int samplerU;
    private int samplerV;
    private int samplerY;
    private int shaderProgram;
    private int[] textureId;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ByteBuffer f23749u;
    private int unpackAlign;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ByteBuffer f23750v;
    private final GlFloatArray vertexArray;
    private int widthYUV;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ByteBuffer f23751y;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(v vVar) {
            this();
        }
    }

    public YUVRender(@k SurfaceTexture surfaceTexture) {
        g0.q(surfaceTexture, "surfaceTexture");
        this.vertexArray = new GlFloatArray();
        this.alphaArray = new GlFloatArray();
        this.rgbArray = new GlFloatArray();
        this.textureId = new int[3];
        EGLUtil eGLUtil = new EGLUtil();
        this.eglUtil = eGLUtil;
        this.unpackAlign = 4;
        this.YUV_OFFSET = new float[]{0.0f, -0.5019608f, -0.5019608f};
        this.YUV_MATRIX = new float[]{1.0f, 1.0f, 1.0f, 0.0f, -0.3441f, 1.772f, 1.402f, -0.7141f, 0.0f};
        eGLUtil.start(surfaceTexture);
        initRender();
    }

    private final void draw() {
        if (this.widthYUV <= 0 || this.heightYUV <= 0 || this.f23751y == null || this.f23749u == null || this.f23750v == null) {
            return;
        }
        GLES20.glUseProgram(this.shaderProgram);
        this.vertexArray.setVertexAttribPointer(this.avPosition);
        this.alphaArray.setVertexAttribPointer(this.alphaPosition);
        this.rgbArray.setVertexAttribPointer(this.rgbPosition);
        GLES20.glPixelStorei(3317, this.unpackAlign);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.textureId[0]);
        GLES20.glTexImage2D(3553, 0, 6409, this.widthYUV, this.heightYUV, 0, 6409, 5121, this.f23751y);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.textureId[1]);
        GLES20.glTexImage2D(3553, 0, 6409, this.widthYUV / 2, this.heightYUV / 2, 0, 6409, 5121, this.f23749u);
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, this.textureId[2]);
        GLES20.glTexImage2D(3553, 0, 6409, this.widthYUV / 2, this.heightYUV / 2, 0, 6409, 5121, this.f23750v);
        GLES20.glUniform1i(this.samplerY, 0);
        GLES20.glUniform1i(this.samplerU, 1);
        GLES20.glUniform1i(this.samplerV, 2);
        GLES20.glUniform3fv(this.convertOffsetUniform, 1, FloatBuffer.wrap(this.YUV_OFFSET));
        GLES20.glUniformMatrix3fv(this.convertMatrixUniform, 1, false, this.YUV_MATRIX, 0);
        GLES20.glDrawArrays(5, 0, 4);
        ByteBuffer byteBuffer = this.f23751y;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f23749u;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        ByteBuffer byteBuffer3 = this.f23750v;
        if (byteBuffer3 != null) {
            byteBuffer3.clear();
        }
        this.f23751y = null;
        this.f23749u = null;
        this.f23750v = null;
        GLES20.glDisableVertexAttribArray(this.avPosition);
        GLES20.glDisableVertexAttribArray(this.rgbPosition);
        GLES20.glDisableVertexAttribArray(this.alphaPosition);
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
        return this.textureId[0];
    }

    @Override // com.tencent.qgame.animplayer.IRenderListener
    public void initRender() {
        int iCreateProgram = ShaderUtil.INSTANCE.createProgram(YUVShader.VERTEX_SHADER, YUVShader.FRAGMENT_SHADER);
        this.shaderProgram = iCreateProgram;
        this.avPosition = GLES20.glGetAttribLocation(iCreateProgram, "v_Position");
        this.rgbPosition = GLES20.glGetAttribLocation(this.shaderProgram, "vTexCoordinateRgb");
        this.alphaPosition = GLES20.glGetAttribLocation(this.shaderProgram, "vTexCoordinateAlpha");
        this.samplerY = GLES20.glGetUniformLocation(this.shaderProgram, "sampler_y");
        this.samplerU = GLES20.glGetUniformLocation(this.shaderProgram, "sampler_u");
        this.samplerV = GLES20.glGetUniformLocation(this.shaderProgram, "sampler_v");
        this.convertMatrixUniform = GLES20.glGetUniformLocation(this.shaderProgram, "convertMatrix");
        this.convertOffsetUniform = GLES20.glGetUniformLocation(this.shaderProgram, w.c.S_WAVE_OFFSET);
        int[] iArr = this.textureId;
        GLES20.glGenTextures(iArr.length, iArr, 0);
        for (int i10 : this.textureId) {
            GLES20.glBindTexture(3553, i10);
            GLES20.glTexParameteri(3553, 10242, 10497);
            GLES20.glTexParameteri(3553, 10243, 10497);
            GLES20.glTexParameteri(3553, 10241, m.TEXTURE_MIN_FILTER_LINEAR);
            GLES20.glTexParameteri(3553, 10240, m.TEXTURE_MIN_FILTER_LINEAR);
        }
    }

    @Override // com.tencent.qgame.animplayer.IRenderListener
    public void releaseTexture() {
        int[] iArr = this.textureId;
        GLES20.glDeleteTextures(iArr.length, iArr, 0);
    }

    @Override // com.tencent.qgame.animplayer.IRenderListener
    public void renderFrame() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        draw();
    }

    @Override // com.tencent.qgame.animplayer.IRenderListener
    public void setAnimConfig(@k AnimConfig config) {
        g0.q(config, "config");
        this.vertexArray.setArray(VertexUtil.INSTANCE.create(config.getWidth(), config.getHeight(), new PointRect(0, 0, config.getWidth(), config.getHeight()), this.vertexArray.getArray()));
        TexCoordsUtil texCoordsUtil = TexCoordsUtil.INSTANCE;
        float[] fArrCreate = texCoordsUtil.create(config.getVideoWidth(), config.getVideoHeight(), config.getAlphaPointRect(), this.alphaArray.getArray());
        float[] fArrCreate2 = texCoordsUtil.create(config.getVideoWidth(), config.getVideoHeight(), config.getRgbPointRect(), this.rgbArray.getArray());
        this.alphaArray.setArray(fArrCreate);
        this.rgbArray.setArray(fArrCreate2);
    }

    @Override // com.tencent.qgame.animplayer.IRenderListener
    public void setYUVData(int i10, int i11, @l byte[] bArr, @l byte[] bArr2, @l byte[] bArr3) {
        this.widthYUV = i10;
        this.heightYUV = i11;
        this.f23751y = ByteBuffer.wrap(bArr);
        this.f23749u = ByteBuffer.wrap(bArr2);
        this.f23750v = ByteBuffer.wrap(bArr3);
        int i12 = this.widthYUV;
        if ((i12 / 2) % 4 != 0) {
            this.unpackAlign = (i12 / 2) % 2 != 0 ? 1 : 2;
        }
    }

    @Override // com.tencent.qgame.animplayer.IRenderListener
    public void swapBuffers() {
        this.eglUtil.swapBuffers();
    }

    @Override // com.tencent.qgame.animplayer.IRenderListener
    public void updateViewPort(int i10, int i11) {
        IRenderListener.DefaultImpls.updateViewPort(this, i10, i11);
    }
}
