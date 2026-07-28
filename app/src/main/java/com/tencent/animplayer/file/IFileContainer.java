package com.tencent.qgame.animplayer.file;

import android.media.MediaExtractor;
import to.k;

/* JADX INFO: loaded from: classes2.dex */
public interface IFileContainer {
    void close();

    void closeRandomRead();

    int read(@k byte[] bArr, int i10, int i11);

    void setDataSource(@k MediaExtractor mediaExtractor);

    void skip(long j10);

    void startRandomRead();
}
