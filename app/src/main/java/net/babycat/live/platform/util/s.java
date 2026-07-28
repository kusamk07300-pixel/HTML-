package net.babycat.live.platform.util;

/* JADX INFO: loaded from: classes3.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f36964a = 500;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36965b = 3000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f36966c;

    public static boolean a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z10 = jCurrentTimeMillis - f36966c >= 500;
        f36966c = jCurrentTimeMillis;
        return z10;
    }

    public static boolean b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z10 = jCurrentTimeMillis - f36966c >= 3000;
        f36966c = jCurrentTimeMillis;
        return z10;
    }
}
