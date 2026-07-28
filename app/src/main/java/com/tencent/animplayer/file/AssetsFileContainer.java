package com.tencent.qgame.animplayer.file;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaExtractor;
import com.tencent.qgame.animplayer.util.ALog;
import java.io.IOException;
import java.io.InputStream;
import kotlin.TypeCastException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import to.k;

/* JADX INFO: loaded from: classes2.dex */
public final class AssetsFileContainer implements IFileContainer {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AnimPlayer.FileContainer";
    private final AssetFileDescriptor assetFd;
    private final AssetManager.AssetInputStream assetsInputStream;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(v vVar) {
            this();
        }
    }

    public AssetsFileContainer(@k AssetManager assetManager, @k String assetsPath) throws IOException {
        g0.q(assetManager, "assetManager");
        g0.q(assetsPath, "assetsPath");
        AssetFileDescriptor assetFileDescriptorOpenFd = assetManager.openFd(assetsPath);
        g0.h(assetFileDescriptorOpenFd, "assetManager.openFd(assetsPath)");
        this.assetFd = assetFileDescriptorOpenFd;
        InputStream inputStreamOpen = assetManager.open(assetsPath, 2);
        if (inputStreamOpen == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.content.res.AssetManager.AssetInputStream");
        }
        this.assetsInputStream = (AssetManager.AssetInputStream) inputStreamOpen;
        ALog.INSTANCE.i(TAG, "AssetsFileContainer init");
    }

    @Override // com.tencent.qgame.animplayer.file.IFileContainer
    public void close() throws IOException {
        this.assetFd.close();
        this.assetsInputStream.close();
    }

    @Override // com.tencent.qgame.animplayer.file.IFileContainer
    public void closeRandomRead() throws IOException {
        this.assetsInputStream.close();
    }

    @Override // com.tencent.qgame.animplayer.file.IFileContainer
    public int read(@k byte[] b10, int i10, int i11) {
        g0.q(b10, "b");
        return this.assetsInputStream.read(b10, i10, i11);
    }

    @Override // com.tencent.qgame.animplayer.file.IFileContainer
    public void setDataSource(@k MediaExtractor extractor) throws IOException {
        g0.q(extractor, "extractor");
        if (this.assetFd.getDeclaredLength() < 0) {
            extractor.setDataSource(this.assetFd.getFileDescriptor());
        } else {
            extractor.setDataSource(this.assetFd.getFileDescriptor(), this.assetFd.getStartOffset(), this.assetFd.getDeclaredLength());
        }
    }

    @Override // com.tencent.qgame.animplayer.file.IFileContainer
    public void skip(long j10) throws IOException {
        this.assetsInputStream.skip(j10);
    }

    @Override // com.tencent.qgame.animplayer.file.IFileContainer
    public void startRandomRead() {
    }
}
