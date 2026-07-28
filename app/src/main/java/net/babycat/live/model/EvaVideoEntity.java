package net.babycat.live.model;

import java.io.File;
import kotlin.jvm.internal.g0;
import to.k;

/* JADX INFO: loaded from: classes4.dex */
public final class EvaVideoEntity {

    @k
    private File mCacheDir;
    private int mFrameHeight;
    private int mFrameWidth;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EvaVideoEntity(@k File cacheDir) {
        this(cacheDir, 0, 0);
        g0.p(cacheDir, "cacheDir");
    }

    @k
    public final File getMCacheDir() {
        return this.mCacheDir;
    }

    public final int getMFrameHeight() {
        return this.mFrameHeight;
    }

    public final int getMFrameWidth() {
        return this.mFrameWidth;
    }

    public final void setMCacheDir(@k File file) {
        g0.p(file, "<set-?>");
        this.mCacheDir = file;
    }

    public final void setMFrameHeight(int i10) {
        this.mFrameHeight = i10;
    }

    public final void setMFrameWidth(int i10) {
        this.mFrameWidth = i10;
    }

    public EvaVideoEntity(@k File cacheDir, int i10, int i11) {
        g0.p(cacheDir, "cacheDir");
        this.mFrameWidth = i10;
        this.mFrameHeight = i11;
        this.mCacheDir = cacheDir;
    }
}
