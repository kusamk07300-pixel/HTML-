package net.babycat.live.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.net.http.HttpResponseCache;
import android.os.Bundle;
import android.os.Environment;
import android.widget.TextView;
import androidx.appcompat.app.g;
import androidx.media3.datasource.cache.a;
import androidx.media3.datasource.d;
import cn.rongcloud.corekit.api.RCSceneKitEngine;
import com.bumptech.glide.Glide;
import com.luck.picture.lib.basic.PictureSelectorSupporterActivity;
import com.luck.picture.lib.basic.PictureSelectorTransparentActivity;
import com.opensource.svgaplayer.SVGAParser;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.yariksoffice.lingver.Lingver;
import dagger.android.DispatchingAndroidInjector;
import h6.k;
import ii.t;
import io.reactivex.functions.Consumer;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.File;
import java.io.IOException;
import jg.d;
import jg.f;
import me.jessyan.autosize.AutoSizeConfig;
import me.jessyan.autosize.onAdaptListener;
import me.jessyan.autosize.unit.Subunits;
import net.babycat.live.app.MyApplication;
import net.babycat.live.platform.util.h0;
import net.babycat.live.platform.util.n0;
import net.babycat.live.platform.util.s0;
import net.babycat.live.platform.util.w1;
import net.babycat.live.platform.util.x1;
import net.babycat.live.platform.util.y0;
import nn.r4;
import nn.w4;
import org.litepal.LitePal;
import org.litepal.tablemanager.Connector;
import qmyy.babycat.live.R;
import v2.g1;
import w2.e;
import y2.o;

/* JADX INFO: loaded from: classes4.dex */
public class MyApplication extends Application implements t {

    @g1
    public static a.d cacheDataSourceFactory = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static MyApplication f34782h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile mn.a f34783i = null;
    public static boolean isFirstRun = true;

    @g1
    public static androidx.media3.datasource.cache.c simpleCache;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @qi.a
    public DispatchingAndroidInjector<Activity> f34784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Typeface f34785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f34786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34787d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34788e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f34789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x1 f34790g;

    public class a implements Consumer<Throwable> {
        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            th2.printStackTrace();
        }
    }

    public class b implements onAdaptListener {
        public b() {
        }

        @Override // me.jessyan.autosize.onAdaptListener
        public void onAdaptAfter(Object obj, Activity activity) {
        }

        @Override // me.jessyan.autosize.onAdaptListener
        public void onAdaptBefore(Object obj, Activity activity) {
            if (activity == null) {
                return;
            }
            int[] iArr = {activity.getResources().getDisplayMetrics().widthPixels, activity.getResources().getDisplayMetrics().heightPixels};
            AutoSizeConfig.getInstance().setCustomFragment(true).setUseDeviceSize(true).getUnitsManager().setSupportSP(false).setSupportDP(false).setSupportSubunits(Subunits.MM);
            if (!h0.a(activity)) {
                wo.b.b("autoSize----С��" + net.babycat.live.platform.util.t.M(activity), new Object[0]);
                AutoSizeConfig.getInstance().getUnitsManager().setDesignWidth((float) iArr[0]).setDesignHeight((float) iArr[1]).setDesignSize(750.0f, 1624.0f);
                return;
            }
            wo.b.b("autoSize----����" + net.babycat.live.platform.util.t.M(activity), new Object[0]);
            if (h0.b(activity)) {
                wo.b.b("autoSize--����--�\uf4c3f�", new Object[0]);
                if (activity.getResources().getConfiguration().orientation == 2) {
                    AutoSizeConfig.getInstance().getUnitsManager().setDesignWidth(iArr[0]).setDesignHeight(iArr[1]).setDesignSize(1624.0f, 1395.0f);
                    return;
                } else {
                    AutoSizeConfig.getInstance().getUnitsManager().setDesignWidth(iArr[0]).setDesignHeight(iArr[1]).setDesignSize(1395.0f, 1624.0f);
                    return;
                }
            }
            wo.b.b("autoSize--����--С����", new Object[0]);
            if (activity.getResources().getConfiguration().orientation == 2) {
                AutoSizeConfig.getInstance().getUnitsManager().setDesignWidth(iArr[0]).setDesignHeight(iArr[1]).setDesignSize(1624.0f, 750.0f);
            } else {
                AutoSizeConfig.getInstance().getUnitsManager().setDesignWidth(iArr[0]).setDesignHeight(iArr[1]).setDesignSize(750.0f, 1624.0f);
            }
        }
    }

    public class c implements Application.ActivityLifecycleCallbacks {
        public c() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            MyApplication.this.f34788e++;
            if ((activity instanceof PictureSelectorSupporterActivity) || (activity instanceof PictureSelectorTransparentActivity)) {
                y0.b(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        g.N(1);
        SmartRefreshLayout.setDefaultRefreshHeaderCreator(new mg.c() { // from class: ok.f
            @Override // mg.c
            public final jg.d createRefreshHeader(Context context, jg.f fVar) {
                return MyApplication.b(context, fVar);
            }
        });
        SmartRefreshLayout.setDefaultRefreshFooterCreator(new mg.b() { // from class: ok.g
            @Override // mg.b
            public final jg.c createRefreshFooter(Context context, jg.f fVar) {
                return MyApplication.a(context, fVar);
            }
        });
        RxJavaPlugins.setErrorHandler(new a());
    }

    public static /* synthetic */ jg.c a(Context context, f fVar) {
        return new fg.a(context);
    }

    public static /* synthetic */ d b(Context context, f fVar) {
        return new hg.a(context);
    }

    public static synchronized mn.a h() {
        try {
            if (f34783i == null) {
                f34783i = mn.d.W().c(new r4(f34782h)).e(new w4()).d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f34783i;
    }

    public static synchronized MyApplication j() {
        return f34782h;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        s0.f(context);
        super.attachBaseContext(s0.h(context));
        androidx.multidex.b.k(this);
    }

    @Override // ii.t
    public dagger.android.b<Activity> c() {
        return this.f34784a;
    }

    public void f() {
        AutoSizeConfig.getInstance().setOnAdaptListener(new b());
    }

    public final void g() {
        LitePal.initialize(this);
        Connector.getDatabase();
    }

    @g1
    public a.d i() {
        return cacheDataSourceFactory;
    }

    public final void k() {
    }

    public final void l() {
        registerActivityLifecycleCallbacks(new c());
    }

    public void m(TextView textView) {
        textView.setTypeface(this.f34785b);
    }

    public final void n() {
        Lingver.k(this);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        s0.d(getApplicationContext());
    }

    @Override // android.app.Application
    @g1
    public void onCreate() {
        File externalFilesDir;
        super.onCreate();
        f();
        n();
        f34782h = this;
        this.f34786c = this;
        f34783i = mn.d.W().c(new r4(f34782h)).e(new w4()).d();
        f34783i.a(this);
        ye.b.l(getResources().getColor(R.color.base_color));
        s0.g(this, null);
        x1 x1Var = new x1(this);
        this.f34790g = x1Var;
        x1Var.s("language_select_sys", net.babycat.live.platform.util.t.s(w1.a(this).b()));
        this.f34790g.s("room_id", "");
        this.f34790g.q("voice_taskId", 0);
        this.f34790g.q("main_taskId", 0);
        this.f34790g.q("isMic", 0);
        this.f34790g.r("full_venue_gift_close_time", 0L);
        g();
        k();
        n0.n().p(this);
        SVGAParser.Companion.d().E(this);
        try {
            String absolutePath = (!"mounted".equals(Environment.getExternalStorageState()) || (externalFilesDir = getExternalFilesDir(null)) == null) ? getFilesDir().getAbsolutePath() : externalFilesDir.getAbsolutePath();
            HttpResponseCache.install(new File(absolutePath, "http"), 134217728L);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        try {
            RCSceneKitEngine.getInstance().initWithAppKey(this, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        l();
        File file = new File(getCacheDir(), "babycatcache");
        if (!file.exists()) {
            file.mkdirs();
        }
        simpleCache = new androidx.media3.datasource.cache.c(file, new o(k.f26922h), new e(this.f34786c));
        cacheDataSourceFactory = new a.d().i(simpleCache).o(new d.a(this)).n(2);
        j9.d.H().z(getApplicationContext());
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        Glide.get(this).clearMemory();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        if (i10 == 20) {
            Glide.get(this).clearMemory();
        }
        Glide.get(this).trimMemory(i10);
        wo.b.b("ǿɱ---------------", new Object[0]);
    }
}
