package com.tencent.qgame.animplayer.util;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.jvm.internal.g0;
import to.k;

/* JADX INFO: loaded from: classes2.dex */
public final class GlFloatArray {

    @k
    private final float[] array;
    private FloatBuffer floatBuffer;

    public GlFloatArray() {
        float[] fArr = new float[8];
        this.array = fArr;
        FloatBuffer floatBufferPut = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
        g0.h(floatBufferPut, "ByteBuffer\n            .…)\n            .put(array)");
        this.floatBuffer = floatBufferPut;
    }

    @k
    public final float[] getArray() {
        return this.array;
    }

    public final void setArray(@k float[] array) {
        g0.q(array, "array");
        this.floatBuffer.position(0);
        this.floatBuffer.put(array);
    }

    public final void setVertexAttribPointer(int i10) {
        this.floatBuffer.position(0);
        GLES20.glVertexAttribPointer(i10, 2, 5126, false, 0, (Buffer) this.floatBuffer);
        GLES20.glEnableVertexAttribArray(i10);
    }
}
