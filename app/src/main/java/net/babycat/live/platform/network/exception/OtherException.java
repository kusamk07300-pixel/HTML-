package net.babycat.live.platform.network.exception;

/* JADX INFO: loaded from: classes3.dex */
public class OtherException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36574c;

    public OtherException(String str, int i10, int i11) {
        this.f36572a = str;
        this.f36573b = i10;
        this.f36574c = i11;
    }

    public String a() {
        return this.f36572a;
    }

    public int b() {
        return this.f36574c;
    }

    public int c() {
        return this.f36573b;
    }

    public void d(String str) {
        this.f36572a = str;
    }

    public void e(int i10) {
        this.f36574c = i10;
    }

    public void f(int i10) {
        this.f36573b = i10;
    }
}
