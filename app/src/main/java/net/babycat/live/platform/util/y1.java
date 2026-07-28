package net.babycat.live.platform.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes3.dex */
public class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f37082a = "ScreenUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f37083b = 2.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Point f37084c;

    public static int a(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b() {
        return e().y;
    }

    public static int c() {
        return e().x;
    }

    @TargetApi(13)
    public static int d(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.y;
    }

    public static Point e() {
        if (f37084c == null) {
            f37084c = new Point(0, 0);
            ((WindowManager) g2.d().getSystemService("window")).getDefaultDisplay().getSize(f37084c);
        }
        return f37084c;
    }

    @TargetApi(13)
    public static int f(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.x;
    }

    public static boolean g() {
        if (f37084c == null) {
            f37084c = e();
        }
        Point point = f37084c;
        return ((double) point.y) / ((double) point.x) >= 2.0d;
    }

    public static int h(Context context, float f10) {
        return (int) ((f10 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void i(View view, Drawable drawable) {
        if (view != null) {
            int paddingLeft = view.getPaddingLeft();
            int paddingTop = view.getPaddingTop();
            int paddingRight = view.getPaddingRight();
            int paddingBottom = view.getPaddingBottom();
            view.setBackgroundDrawable(drawable);
            view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
    }

    public static void j(View view, int i10) {
        if (view != null) {
            int paddingLeft = view.getPaddingLeft();
            int paddingTop = view.getPaddingTop();
            int paddingRight = view.getPaddingRight();
            int paddingBottom = view.getPaddingBottom();
            view.setBackgroundResource(i10);
            view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
    }
}
