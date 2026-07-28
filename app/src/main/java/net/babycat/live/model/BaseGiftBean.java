package net.babycat.live.model;

import f.n0;
import kh.a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseGiftBean implements a, Cloneable {
    private int currentIndex;
    private int giftCount;
    private long latestRefreshTime;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // kh.a
    public int getTheCurrentIndex() {
        return this.currentIndex;
    }

    @Override // kh.a
    public int getTheGiftCount() {
        return this.giftCount;
    }

    @Override // kh.a
    public long getTheLatestRefreshTime() {
        return this.latestRefreshTime;
    }

    @Override // kh.a
    public void setTheCurrentIndex(int i10) {
        this.currentIndex = i10;
    }

    @Override // kh.a
    public void setTheGiftCount(int i10) {
        this.giftCount = i10;
    }

    @Override // kh.a
    public void setTheLatestRefreshTime(long j10) {
        this.latestRefreshTime = j10;
    }

    @Override // java.lang.Comparable
    public int compareTo(@n0 a aVar) {
        return (int) (getTheLatestRefreshTime() - aVar.getTheLatestRefreshTime());
    }
}
