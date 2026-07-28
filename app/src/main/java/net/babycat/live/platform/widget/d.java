package net.babycat.live.platform.widget;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class d {
    public static int a(Context context, int i10) {
        return (int) ((i10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
