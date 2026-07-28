package net.babycat.live.platform.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class g2 {
    public static final String KEY_BASE = "key_basis";
    public static final String KEY_BASE1 = "key_basis1";
    public static final String KEY_OBJ = "key_obj";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Application f36789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Handler f36790b = new Handler(Looper.getMainLooper());

    @Deprecated
    public static <T extends View> T a(ViewGroup viewGroup, Class cls, int i10, int i11) {
        T t10;
        if (i10 < 1) {
            i10 = 1;
        }
        if (i11 > 0 && i10 > i11) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ViewGroup viewGroup2 = (T) viewGroup.getChildAt(i12);
            if (cls.isInstance(viewGroup2)) {
                return viewGroup2;
            }
            if ((viewGroup2 instanceof ViewGroup) && (t10 = (T) a(viewGroup2, cls, i10 + 1, i11)) != null) {
                return t10;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends View> void b(List<T> list, ViewGroup viewGroup, Class cls) {
        if (list == 0) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (cls.isInstance(childAt)) {
                list.add(childAt);
            } else if (childAt instanceof ViewGroup) {
                b(list, (ViewGroup) childAt, cls);
            }
        }
    }

    public static AssetManager c() {
        return d().getAssets();
    }

    public static Context d() {
        if (f36789a == null) {
            f36789a = f();
        }
        return f36789a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends View> T e(View view, Class cls, int i10) {
        if (cls.isInstance(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            return (T) a((ViewGroup) view, cls, 1, i10);
        }
        return null;
    }

    public static Application f() {
        Application application;
        try {
            application = (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", new Class[0]).invoke(null, new Object[0]);
            if (application != null) {
                return application;
            }
            try {
                throw new IllegalStateException("Static initialization of Applications must be on main thread.");
            } catch (Exception e10) {
                e = e10;
                try {
                    return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
                } catch (Exception unused) {
                    e.printStackTrace();
                    return application;
                }
            }
        } catch (Exception e11) {
            e = e11;
            application = null;
        }
    }

    public static Resources g() {
        return d().getResources();
    }

    public static <T extends View> T h(Activity activity, int i10) {
        return (T) activity.findViewById(i10);
    }

    public static <T extends View> T i(View view, int i10) {
        return (T) view.findViewById(i10);
    }

    public static View j(int i10) {
        return View.inflate(d(), i10, null);
    }

    public static void k(Runnable runnable, long j10) {
        f36790b.postDelayed(runnable, j10);
    }

    public static void l(Runnable runnable) {
        if (runnable != null) {
            f36790b.removeCallbacks(runnable);
        }
    }

    public static void m(Runnable runnable) {
        if (runnable != null) {
            f36790b.post(runnable);
        }
    }

    public static <T extends View> void n(T t10, boolean z10) {
        if (t10 == null) {
            return;
        }
        t10.setVisibility(z10 ? 0 : 8);
    }

    public static <T extends Activity> void o(Activity activity, Class<T> cls) {
        activity.startActivity(new Intent((Context) activity, (Class<?>) cls));
    }

    public static <T extends Activity> void p(Activity activity, Class<T> cls, Serializable serializable) {
        activity.startActivity(new Intent((Context) activity, (Class<?>) cls).putExtra(KEY_BASE, serializable));
    }

    public static <T extends Activity> void q(Activity activity, Class<T> cls, Serializable serializable) {
        activity.startActivity(new Intent((Context) activity, (Class<?>) cls).putExtra(KEY_OBJ, serializable));
    }
}
