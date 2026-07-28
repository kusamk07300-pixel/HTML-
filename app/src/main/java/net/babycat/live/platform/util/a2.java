package net.babycat.live.platform.util;

import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes3.dex */
public class a2 {
    public static int a(Context context, WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i10 = displayMetrics.heightPixels;
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        int i11 = displayMetrics.heightPixels;
        if (i11 > i10) {
            return i11 - i10;
        }
        return 0;
    }

    public static void b(Context context, IBinder iBinder) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        }
    }

    public static void c(Context context, Window window) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager == null || !d(context, window)) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 0);
    }

    public static boolean d(Context context, Window window) {
        View decorView = window.getDecorView();
        int height = decorView.getHeight();
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        return (height - rect.bottom) - a(context, window.getWindowManager()) >= 0;
    }

    public static void e(Context context, Window window) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager == null || d(context, window)) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 0);
    }
}
