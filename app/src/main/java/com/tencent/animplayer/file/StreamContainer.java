package com.tencent.qgame.animplayer.file;

import android.annotation.TargetApi;
import android.media.MediaExtractor;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import kotlin.jvm.internal.g0;
import to.k;
import wg.a;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(23)
public final class StreamContainer implements IFileContainer {
    private final byte[] bytes;
    private ByteArrayInputStream stream;

    public StreamContainer(@k byte[] bytes) {
        g0.q(bytes, "bytes");
        this.bytes = bytes;
        this.stream = new ByteArrayInputStream(bytes);
    }

    @Override // com.tencent.qgame.animplayer.file.IFileContainer
    public void close() throws IOException {
        this.stream.close();
    }

    @Override // com.tencent.qgame.animplayer.file.IFileContainer
    public void closeRandomRead() {
    }

    @Override // com.tencent.qgame.animplayer.file.IFileContainer
    public int read(@k byte[] b10, int i10, int i11) {
        g0.q(b10, "b");
        return this.stream.read(b10, i10, i11);
    }

    @Override // com.tencent.qgame.animplayer.file.IFileContainer
    public void setDataSource(@k MediaExtractor extractor) throws IOException {
        g0.q(extractor, "extractor");
        extractor.setDataSource(a.a(new StreamMediaDataSource(this.bytes)));
    }

    @Override // com.tencent.qgame.animplayer.file.IFileContainer
    public void skip(long j10) {
        this.stream.skip(j10);
    }

    @Override // com.tencent.qgame.animplayer.file.IFileContainer
    public void startRandomRead() {
    }
}
