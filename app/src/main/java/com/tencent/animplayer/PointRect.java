package com.tencent.qgame.animplayer;

import to.k;
import to.l;

/* JADX INFO: loaded from: classes2.dex */
public final class PointRect {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f23743h;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f23744w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f23745x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f23746y;

    public PointRect(int i10, int i11, int i12, int i13) {
        this.f23745x = i10;
        this.f23746y = i11;
        this.f23744w = i12;
        this.f23743h = i13;
    }

    public static /* synthetic */ PointRect copy$default(PointRect pointRect, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = pointRect.f23745x;
        }
        if ((i14 & 2) != 0) {
            i11 = pointRect.f23746y;
        }
        if ((i14 & 4) != 0) {
            i12 = pointRect.f23744w;
        }
        if ((i14 & 8) != 0) {
            i13 = pointRect.f23743h;
        }
        return pointRect.copy(i10, i11, i12, i13);
    }

    public final int component1() {
        return this.f23745x;
    }

    public final int component2() {
        return this.f23746y;
    }

    public final int component3() {
        return this.f23744w;
    }

    public final int component4() {
        return this.f23743h;
    }

    @k
    public final PointRect copy(int i10, int i11, int i12, int i13) {
        return new PointRect(i10, i11, i12, i13);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointRect)) {
            return false;
        }
        PointRect pointRect = (PointRect) obj;
        return this.f23745x == pointRect.f23745x && this.f23746y == pointRect.f23746y && this.f23744w == pointRect.f23744w && this.f23743h == pointRect.f23743h;
    }

    public final int getH() {
        return this.f23743h;
    }

    public final int getW() {
        return this.f23744w;
    }

    public final int getX() {
        return this.f23745x;
    }

    public final int getY() {
        return this.f23746y;
    }

    public int hashCode() {
        return (((((this.f23745x * 31) + this.f23746y) * 31) + this.f23744w) * 31) + this.f23743h;
    }

    @k
    public String toString() {
        return "PointRect(x=" + this.f23745x + ", y=" + this.f23746y + ", w=" + this.f23744w + ", h=" + this.f23743h + ")";
    }
}
