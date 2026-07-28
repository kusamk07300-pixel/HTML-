package net.babycat.live.platform.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.util.Log;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import com.yariksoffice.lingver.Lingver;
import java.util.Locale;
import net.babycat.live.modules.profile.ui.MySetActivity;
import net.babycat.live.shell.MainActivity;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes3.dex */
public class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f36967a = "LocalManageUtil";

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f36968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f36969b;

        public a(Activity activity, Context context) {
            this.f36968a = activity;
            this.f36969b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.a(new b0(ok.e.EVENT_SUSPENDED_ROOM_CLOSE, ""));
            Intent intent = this.f36968a.getClass() == MySetActivity.class ? new Intent(this.f36969b, (Class<?>) MainActivity.class) : new Intent(this.f36969b, this.f36968a.getClass());
            intent.setFlags(268468224);
            this.f36969b.startActivity(intent);
            this.f36968a.overridePendingTransition(R.anim.animo_alph_open, R.anim.animo_alph_close);
        }
    }

    public static String a(Context context) {
        switch (w1.a(context).b()) {
            case 0:
                return context.getString(R.string.language_en);
            case 1:
                return context.getString(R.string.language_ar);
            case 2:
                return context.getString(R.string.language_es);
            case 3:
                return context.getString(R.string.language_bn);
            case 4:
                return context.getString(R.string.language_fr);
            case 5:
                return context.getString(R.string.language_tr);
            case 6:
                return context.getString(R.string.language_hi);
            default:
                return context.getString(R.string.language_en);
        }
    }

    public static Locale b(Context context) {
        switch (w1.a(context).b()) {
            case 0:
                return Locale.ENGLISH;
            case 1:
                return new Locale(TUIThemeManager.LANGUAGE_AR, "AE");
            case 2:
                return new Locale("es", "ES");
            case 3:
                return new Locale("bn", "BD");
            case 4:
                return new Locale("fr", "FR");
            case 5:
                return new Locale("tr", "TR");
            case 6:
                return new Locale("hi", "IN");
            default:
                return Locale.ENGLISH;
        }
    }

    public static Locale c(Context context) {
        return w1.a(context).c();
    }

    public static void d(Context context) {
        f(context);
        h(context);
        g(context, null);
    }

    public static void e(Context context, int i10, Activity activity) {
        w1.a(context).d(i10);
        g(context, activity);
    }

    public static void f(Context context) {
        Locale locale = Build.VERSION.SDK_INT >= 24 ? LocaleList.getDefault().get(0) : Locale.getDefault();
        Log.d(f36967a, locale.getLanguage());
        w1.a(context).e(locale);
    }

    public static void g(Context context, Activity activity) {
        Lingver.g().w(context, b(context));
        int iB = w1.a(context).b();
        if (iB == 0 || iB != 1) {
            TUIThemeManager.getInstance().changeLanguage(context, TUIThemeManager.LANGUAGE_EN);
        } else {
            TUIThemeManager.getInstance().changeLanguage(context, TUIThemeManager.LANGUAGE_AR);
        }
        if (activity != null) {
            new Handler().postDelayed(new a(activity, context), 500L);
        }
    }

    public static Context h(Context context) {
        return i(context, b(context));
    }

    public static Context i(Context context, Locale locale) {
        if (context == null || locale == null) {
            return context;
        }
        Locale.setDefault(locale);
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration);
    }
}
