package net.babycat.live.platform.util;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, Long> f36919a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f36920b = 1500;

    public static void a(int i10) {
        b(String.valueOf(i10));
    }

    public static void b(String str) {
        Map<String, Long> map = f36919a;
        synchronized (map) {
            map.remove(str);
        }
    }

    public static boolean c(int i10) {
        return d(i10, f36920b);
    }

    public static boolean d(int i10, int i11) {
        return e(String.valueOf(i10), i11);
    }

    public static boolean e(String str, int i10) {
        if (str == null || str.length() <= 0) {
            return true;
        }
        if (i10 < 100) {
            i10 = 100;
        }
        Map<String, Long> map = f36919a;
        synchronized (map) {
            try {
                Long l10 = map.get(str);
                if (l10 != null && System.currentTimeMillis() - l10.longValue() < i10) {
                    return true;
                }
                map.put(str, Long.valueOf(System.currentTimeMillis()));
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean f(int i10) {
        return g(String.valueOf(i10));
    }

    public static boolean g(String str) {
        boolean z10;
        Map<String, Long> map = f36919a;
        synchronized (map) {
            z10 = map.put(str, Long.valueOf(System.currentTimeMillis())) != null;
        }
        return z10;
    }
}
