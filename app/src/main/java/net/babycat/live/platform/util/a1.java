package net.babycat.live.platform.util;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f36626a = 1000.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f36627b = 1000000.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f36628c = 1.0E9d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final double f36629d = 1.0E12d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Locale f36630e = Locale.US;

    public static String a(double d10) {
        long j10 = (long) d10;
        if (d10 == j10) {
            return String.format(f36630e, "%d", Long.valueOf(j10));
        }
        double d11 = 10.0d * d10;
        return d11 == ((double) ((long) d11)) ? String.format(f36630e, "%.1f", Double.valueOf(d10)) : String.format(f36630e, "%.2f", Double.valueOf(d10));
    }

    public static String b(double d10) {
        if (d10 < 0.0d) {
            return "-" + b(-d10);
        }
        if (d10 < 10000.0d) {
            return String.format(f36630e, "%d", Long.valueOf((long) d10));
        }
        if (d10 >= 1.0E12d) {
            return a(d10 / 1.0E12d) + w1.a.GPS_DIRECTION_TRUE;
        }
        if (d10 >= 1.0E9d) {
            return a(d10 / 1.0E9d) + b1.f36642f;
        }
        if (d10 >= 1000000.0d) {
            return a(d10 / 1000000.0d) + "M";
        }
        return a(d10 / 1000.0d) + "K";
    }
}
