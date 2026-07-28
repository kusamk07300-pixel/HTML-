package com.tencent.qgame.animplayer;

import to.k;
import to.l;

/* JADX INFO: loaded from: classes2.dex */
public final class RefVec2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f23747h;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f23748w;

    public RefVec2(int i10, int i11) {
        this.f23748w = i10;
        this.f23747h = i11;
    }

    public static /* synthetic */ RefVec2 copy$default(RefVec2 refVec2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = refVec2.f23748w;
        }
        if ((i12 & 2) != 0) {
            i11 = refVec2.f23747h;
        }
        return refVec2.copy(i10, i11);
    }

    public final int component1() {
        return this.f23748w;
    }

    public final int component2() {
        return this.f23747h;
    }

    @k
    public final RefVec2 copy(int i10, int i11) {
        return new RefVec2(i10, i11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefVec2)) {
            return false;
        }
        RefVec2 refVec2 = (RefVec2) obj;
        return this.f23748w == refVec2.f23748w && this.f23747h == refVec2.f23747h;
    }

    public final int getH() {
        return this.f23747h;
    }

    public final int getW() {
        return this.f23748w;
    }

    public int hashCode() {
        return (this.f23748w * 31) + this.f23747h;
    }

    @k
    public String toString() {
        return "RefVec2(w=" + this.f23748w + ", h=" + this.f23747h + ")";
    }
}
