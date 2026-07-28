package com.tencent.qgame.animplayer.file;

import android.annotation.TargetApi;
import android.media.MediaDataSource;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import to.k;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(23)
public final class StreamMediaDataSource extends MediaDataSource {

    @k
    private final byte[] bytes;

    public StreamMediaDataSource(@k byte[] bytes) {
        g0.q(bytes, "bytes");
        this.bytes = bytes;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @k
    public final byte[] getBytes() {
        return this.bytes;
    }

    @Override // android.media.MediaDataSource
    public long getSize() {
        long length;
        synchronized (o0.d(StreamMediaDataSource.class)) {
            length = this.bytes.length;
        }
        return length;
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j10, @k byte[] buffer, int i10, int i11) {
        g0.q(buffer, "buffer");
        synchronized (o0.d(StreamMediaDataSource.class)) {
            byte[] bArr = this.bytes;
            int length = bArr.length;
            long j11 = length;
            if (j10 >= j11) {
                return -1;
            }
            long j12 = ((long) i11) + j10;
            if (j12 > j11) {
                i11 -= ((int) j12) - length;
            }
            System.arraycopy(bArr, (int) j10, buffer, i10, i11);
            return i11;
        }
    }
}
