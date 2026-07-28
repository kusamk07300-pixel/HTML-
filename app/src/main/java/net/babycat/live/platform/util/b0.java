package net.babycat.live.platform.util;

/* JADX INFO: loaded from: classes3.dex */
public class b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f36636b;

    public b0(int i10) {
        this.f36635a = i10;
    }

    public int a() {
        return this.f36635a;
    }

    public T b() {
        return this.f36636b;
    }

    public void c(int i10) {
        this.f36635a = i10;
    }

    public void d(T t10) {
        this.f36636b = t10;
    }

    public String toString() {
        return "EventMessage{code=" + this.f36635a + ", data=" + this.f36636b + '}';
    }

    public b0(int i10, T t10) {
        this.f36635a = i10;
        this.f36636b = t10;
    }
}
