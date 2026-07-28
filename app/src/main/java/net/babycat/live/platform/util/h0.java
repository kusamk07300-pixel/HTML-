package net.babycat.live.platform.util;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public class h0 {
    public static boolean a(Activity activity) {
        return (activity.getResources().getConfiguration().screenLayout & 15) == 3;
    }

    public static boolean b(Activity activity) {
        float fMin;
        float fMax;
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
            fMax = Math.max(bounds.width(), bounds.height());
            fMin = Math.min(bounds.width(), bounds.height());
        } else {
            int i10 = activity.getResources().getDisplayMetrics().widthPixels;
            int i11 = activity.getResources().getDisplayMetrics().heightPixels;
            float fMax2 = Math.max(i10, i11);
            fMin = Math.min(i10, i11);
            fMax = fMax2;
        }
        boolean z10 = fMax / fMin < 2.2f;
        wo.b.b("autoSize------longSide" + fMax + "shortSide" + fMin, new Object[0]);
        return z10;
    }
}
