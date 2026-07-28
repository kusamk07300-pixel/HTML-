package com.tencent.qgame.animplayer.file;

import android.media.MediaExtractor;
import com.tencent.qgame.animplayer.util.ALog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import to.k;

/* JADX INFO: loaded from: classes2.dex */
public final class FileContainer implements IFileContainer {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AnimPlayer.FileContainer";
    private final File file;
    private RandomAccessFile randomAccessFile;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(v vVar) {
            this();
        }
    }

    public FileContainer(@k File file) throws FileNotFoundException {
        g0.q(file, "file");
        this.file = file;
        ALog.INSTANCE.i(TAG, "FileContainer init");
        if (file.exists() && file.isFile() && file.canRead()) {
            return;
        }
        throw new FileNotFoundException("Unable to read " + file);
    }

    @Override // com.tencent.qgame.animplayer.file.IFileContainer
    public void close() {
    }

    @Override // com.tencent.qgame.animplayer.file.IFileContainer
    public void closeRandomRead() throws IOException {
        RandomAccessFile randomAccessFile = this.randomAccessFile;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
    }

    @Override // com.tencent.qgame.animplayer.file.IFileContainer
    public int read(@k byte[] b10, int i10, int i11) {
        g0.q(b10, "b");
        RandomAccessFile randomAccessFile = this.randomAccessFile;
        if (randomAccessFile != null) {
            return randomAccessFile.read(b10, i10, i11);
        }
        return -1;
    }

    @Override // com.tencent.qgame.animplayer.file.IFileContainer
    public void setDataSource(@k MediaExtractor extractor) throws IOException {
        g0.q(extractor, "extractor");
        extractor.setDataSource(this.file.toString());
    }

    @Override // com.tencent.qgame.animplayer.file.IFileContainer
    public void skip(long j10) throws IOException {
        RandomAccessFile randomAccessFile = this.randomAccessFile;
        if (randomAccessFile != null) {
            randomAccessFile.skipBytes((int) j10);
        }
    }

    @Override // com.tencent.qgame.animplayer.file.IFileContainer
    public void startRandomRead() {
        this.randomAccessFile = new RandomAccessFile(this.file, "r");
    }
}
