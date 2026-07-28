package net.babycat.live.platform.util;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
public class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Double f36637a = Double.valueOf(1000.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Double f36638b = Double.valueOf(1000000.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Double f36639c = Double.valueOf(1.0E9d);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f36640d = "K";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f36641e = "M";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f36642f = "B";

    public static String a(double d10) {
        String.valueOf(d10);
        if (d10 < 1000.0d) {
            return String.valueOf((int) d10);
        }
        Double d11 = f36637a;
        if (d10 > d11.doubleValue() && d10 <= f36638b.doubleValue()) {
            double dDoubleValue = d10 / d11.doubleValue();
            double dDoubleValue2 = d10 % d11.doubleValue() < d11.doubleValue() / 2.0d ? c(dDoubleValue, 2, false).doubleValue() : c(dDoubleValue, 2, true).doubleValue();
            if (dDoubleValue2 == d11.doubleValue()) {
                return d(dDoubleValue2 / d11.doubleValue()) + "M";
            }
            return d(dDoubleValue2) + "K";
        }
        Double d12 = f36638b;
        if (d10 <= d12.doubleValue() || d10 > f36639c.doubleValue()) {
            Double d13 = f36639c;
            if (d10 <= d13.doubleValue()) {
                return d(d10);
            }
            double dDoubleValue3 = d10 / d13.doubleValue();
            return d(d10 % d13.doubleValue() < d13.doubleValue() / 2.0d ? c(dDoubleValue3, 2, false).doubleValue() : c(dDoubleValue3, 2, true).doubleValue()) + f36642f;
        }
        double dDoubleValue4 = d10 / d12.doubleValue();
        double dDoubleValue5 = d10 % d12.doubleValue() < d12.doubleValue() / 2.0d ? c(dDoubleValue4, 2, false).doubleValue() : c(dDoubleValue4, 2, true).doubleValue();
        if (dDoubleValue5 == d12.doubleValue()) {
            return d(dDoubleValue5 / d12.doubleValue()) + f36642f;
        }
        return d(dDoubleValue5) + "M";
    }

    public static String b(double d10) {
        String.valueOf(d10);
        if (d10 < 1000.0d) {
            return String.format("%.2f", Double.valueOf(d10));
        }
        Double d11 = f36637a;
        if (d10 > d11.doubleValue() && d10 <= f36638b.doubleValue()) {
            double dDoubleValue = d10 / d11.doubleValue();
            double dDoubleValue2 = d10 % d11.doubleValue() < d11.doubleValue() / 2.0d ? c(dDoubleValue, 2, false).doubleValue() : c(dDoubleValue, 2, true).doubleValue();
            if (dDoubleValue2 == d11.doubleValue()) {
                return d(dDoubleValue2 / d11.doubleValue()) + "M";
            }
            return d(dDoubleValue2) + "K";
        }
        Double d12 = f36638b;
        if (d10 <= d12.doubleValue() || d10 > f36639c.doubleValue()) {
            Double d13 = f36639c;
            if (d10 <= d13.doubleValue()) {
                return d(d10);
            }
            double dDoubleValue3 = d10 / d13.doubleValue();
            return d(d10 % d13.doubleValue() < d13.doubleValue() / 2.0d ? c(dDoubleValue3, 2, false).doubleValue() : c(dDoubleValue3, 2, true).doubleValue()) + f36642f;
        }
        double dDoubleValue4 = d10 / d12.doubleValue();
        double dDoubleValue5 = d10 % d12.doubleValue() < d12.doubleValue() / 2.0d ? c(dDoubleValue4, 2, false).doubleValue() : c(dDoubleValue4, 2, true).doubleValue();
        if (dDoubleValue5 == d12.doubleValue()) {
            return d(dDoubleValue5 / d12.doubleValue()) + f36642f;
        }
        return d(dDoubleValue5) + "M";
    }

    public static Double c(double d10, int i10, boolean z10) {
        BigDecimal bigDecimal = new BigDecimal(d10);
        return z10 ? Double.valueOf(bigDecimal.setScale(i10, RoundingMode.HALF_UP).doubleValue()) : Double.valueOf(bigDecimal.setScale(i10, RoundingMode.DOWN).doubleValue());
    }

    public static String d(double d10) {
        String strValueOf = String.valueOf(d10);
        if (strValueOf.indexOf(InstructionFileId.DOT) < 0) {
            return strValueOf + ".00";
        }
        if (strValueOf.substring(strValueOf.indexOf(InstructionFileId.DOT) + 1).length() >= 2) {
            return strValueOf;
        }
        return strValueOf + x0.IMAGE_1;
    }
}
