package net.babycat.live.shell;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import bo.b;
import com.gyf.immersionbar.ImmersionBar;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import net.babycat.live.model.InitBean;
import net.babycat.live.model.RefreshTokenBean;
import net.babycat.live.modules.auth.ui.LoginThirdPartyActivity;
import net.babycat.live.platform.util.NetworkMonitor;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.x1;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes3.dex */
public class SplashActivity extends in.b<co.c> implements b.InterfaceC0104b {
    public static final int J = 10;
    public static final int K = 2;
    public NetworkMonitor B;
    public NetworkMonitor.f C;
    public Disposable I;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RelativeLayout f37167n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PlayerView f37168o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ExoPlayer f37169p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f37170q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f37171r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f37172s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f37173t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public LinearLayout f37174u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f37175v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f37176w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f37177x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f37178y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public x1 f37179z;
    public boolean A = false;
    public int D = 0;
    public int E = 0;
    public boolean F = false;
    public boolean G = false;
    public boolean H = false;

    public class a implements Consumer<Long> {
        public a() {
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Long l10) throws Exception {
            SplashActivity.this.L5();
        }
    }

    public class b extends androidx.activity.f {
        public b(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.f
        public void handleOnBackPressed() {
            SplashActivity.this.finish();
        }
    }

    public class c implements NetworkMonitor.f {
        public c() {
        }

        @Override // net.babycat.live.platform.util.NetworkMonitor.f
        public void a(NetworkMonitor.g gVar) {
            SplashActivity.this.f37172s.setText(gVar.qualityText);
            SplashActivity.this.f37172s.setTextColor(gVar.qualityColor);
            SplashActivity.this.f37173t.setText(SplashActivity.this.getString(R.string.net_ip_format, TextUtils.isEmpty(gVar.ipAddress) ? SplashActivity.this.getString(R.string.net_value_unknown) : gVar.ipAddress));
            String strB = NetworkMonitor.B(gVar.upBytesPerSec);
            String strB2 = NetworkMonitor.B(gVar.downBytesPerSec);
            int i10 = gVar.jitterMs;
            String string = i10 < 0 ? SplashActivity.this.getString(R.string.net_value_unknown) : SplashActivity.this.getString(R.string.net_value_ms, Integer.valueOf(i10));
            TextView textView = SplashActivity.this.f37175v;
            SplashActivity splashActivity = SplashActivity.this;
            textView.setText(splashActivity.getString(R.string.net_realtime_format, strB, strB2, splashActivity.getString(R.string.net_jitter_label), string));
            if (SplashActivity.this.F || !SplashActivity.this.G || SplashActivity.this.H || gVar.quality != NetworkMonitor.Quality.GOOD) {
                return;
            }
            SplashActivity.this.H = true;
            SplashActivity.this.J5();
            SplashActivity.this.M5(true);
        }
    }

    public class d implements Consumer<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f37183a;

        public d(int i10) {
            this.f37183a = i10;
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Long l10) {
            long jLongValue = ((long) this.f37183a) - l10.longValue();
            if (jLongValue > 0) {
                SplashActivity.this.f37178y.setText(SplashActivity.this.getString(R.string.net_retry_countdown_format, Integer.valueOf((int) jLongValue)));
            } else {
                SplashActivity.this.f37178y.setText(SplashActivity.this.getString(R.string.net_retry_countdown_format, 0));
            }
        }
    }

    public class e implements Consumer<Throwable> {
        public e() {
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
        }
    }

    public class f implements Action {
        public f() {
        }

        @Override // io.reactivex.functions.Action
        public void run() {
            SplashActivity.this.f37178y.setVisibility(8);
            SplashActivity.this.L5();
        }
    }

    private void N5() {
        boolean zD = this.f37179z.d("isLogin");
        this.A = zD;
        if (zD) {
            o5(MainActivity.class);
        } else {
            o5(LoginThirdPartyActivity.class);
        }
        finish();
    }

    public final String I5() {
        return new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date());
    }

    public final void J5() {
        Disposable disposable = this.I;
        if (disposable != null && !disposable.isDisposed()) {
            this.I.dispose();
        }
        TextView textView = this.f37178y;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public final void K5() {
        x1 x1Var = this.f37179z;
        this.f37170q.setText(getString(R.string.net_user_id_format, Integer.valueOf(x1Var != null ? x1Var.i("user_id", 0) : 0)));
        this.f37171r.setText("v" + t.f0() + "(" + t.e0() + ")");
        c cVar = new c();
        this.C = cVar;
        NetworkMonitor networkMonitor = new NetworkMonitor(this, cVar);
        this.B = networkMonitor;
        networkMonitor.N();
    }

    public final void L5() {
        M5(false);
    }

    public final void M5(boolean z10) {
        if (this.F) {
            return;
        }
        if (z10 || !this.G) {
            ((co.c) this.f27702e).Z1();
        }
    }

    public final void O5(int i10) {
        J5();
        if (i10 <= 0) {
            L5();
            return;
        }
        this.f37178y.setVisibility(0);
        this.f37178y.setText(getString(R.string.net_retry_countdown_format, Integer.valueOf(i10)));
        this.I = Observable.intervalRange(0L, 1 + i10, 0L, 1L, TimeUnit.SECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new d(i10), new e(), new f());
    }

    @Override // bo.b.InterfaceC0104b
    public void U0(RefreshTokenBean refreshTokenBean) {
        this.f37179z.s("token", "Bearer " + refreshTokenBean.getToken());
        N5();
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_splash;
    }

    @Override // in.a
    public void g5() {
        this.f37167n = (RelativeLayout) findViewById(R.id.rel_top);
        this.f37168o = (PlayerView) findViewById(R.id.splash_mp4);
        this.f37170q = (TextView) findViewById(R.id.tv_user_id);
        this.f37171r = (TextView) findViewById(R.id.tv_version);
        this.f37172s = (TextView) findViewById(R.id.tv_net_quality);
        this.f37173t = (TextView) findViewById(R.id.tv_net_ip);
        this.f37175v = (TextView) findViewById(R.id.tv_net_realtime);
        this.f37176w = (TextView) findViewById(R.id.tv_net_fail_time);
        this.f37177x = (TextView) findViewById(R.id.tv_net_error_detail);
        this.f37178y = (TextView) findViewById(R.id.tv_retry_countdown);
        this.f37174u = (LinearLayout) findViewById(R.id.ll_net_panel);
        this.f37177x.setVisibility(8);
        this.f37178y.setVisibility(8);
    }

    @Override // in.a
    public void h5() {
        ImmersionBar.with(this).fitsSystemWindows(false).transparentStatusBar().statusBarDarkFont(false).init();
        this.f37179z = new x1(this);
        Observable.timer(100L, TimeUnit.MILLISECONDS).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
        getOnBackPressedDispatcher().b(this, new b(true));
        K5();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, ln.a
    public void m2(String str) {
        super.m2(str);
        this.f37174u.setVisibility(0);
        this.f37176w.setText(getString(R.string.net_fail_time_format, I5()));
        if (!this.F && !this.G) {
            int i10 = this.E + 1;
            this.E = i10;
            if (i10 >= 3) {
                this.G = true;
                J5();
            } else {
                int i11 = this.D;
                if (i11 < 2) {
                    this.D = i11 + 1;
                    O5(10);
                }
            }
        }
        NetworkMonitor networkMonitor = this.B;
        if (networkMonitor != null) {
            networkMonitor.A();
        }
    }

    @Override // in.b, in.a, androidx.appcompat.app.e, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        ExoPlayer exoPlayer = this.f37169p;
        if (exoPlayer != null) {
            exoPlayer.release();
            this.f37169p = null;
        }
        super.onDestroy();
        NetworkMonitor networkMonitor = this.B;
        if (networkMonitor != null) {
            networkMonitor.O();
            this.B = null;
        }
        this.C = null;
        Disposable disposable = this.I;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.I.dispose();
    }

    @Override // in.b
    public void onReceiveEvent(b0 b0Var) {
        super.onReceiveEvent(b0Var);
        if (b0Var.a() != 1022) {
            return;
        }
        LinearLayout linearLayout = this.f37174u;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        if (this.f37177x != null) {
            Object objB = b0Var.b();
            String strValueOf = objB == null ? "" : String.valueOf(objB);
            if (TextUtils.isEmpty(strValueOf)) {
                this.f37177x.setVisibility(8);
            } else {
                this.f37177x.setVisibility(0);
                this.f37177x.setText(strValueOf);
            }
        }
    }

    @Override // bo.b.InterfaceC0104b
    public void y4(InitBean initBean) {
        N5();
    }
}
