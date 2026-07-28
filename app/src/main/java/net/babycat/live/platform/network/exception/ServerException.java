package net.babycat.live.platform.network.exception;

/* JADX INFO: loaded from: classes3.dex */
public class ServerException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36575a;

    public ServerException(String str) {
        super(str);
    }

    public void a(int i10) {
        this.f36575a = i10;
    }

    public int getCode() {
        return this.f36575a;
    }

    public ServerException(String str, int i10) {
        super(str);
        this.f36575a = i10;
    }
}
