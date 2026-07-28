package net.babycat.live.platform.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Locale;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes3.dex */
public class NetworkMonitor {
    public static final long A = 2500;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f36582a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HandlerThread f36584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f36585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference<f> f36586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f36587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ConnectivityManager.NetworkCallback f36588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public BroadcastReceiver f36589h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f36583b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f36590i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f36591j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f36592k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f36593l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile boolean f36594m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f36595n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f36596o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f36597p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Deque<Integer> f36598q = new ArrayDeque();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f36599r = 6;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile int f36600s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile int f36601t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile long f36602u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile long f36603v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile boolean f36604w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile long f36605x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile int f36606y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f36607z = false;

    public enum Quality {
        GOOD,
        SLOW,
        BAD
    }

    public class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@f.n0 Network network) {
            NetworkMonitor.this.R(network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@f.n0 Network network, @f.n0 NetworkCapabilities networkCapabilities) {
            NetworkMonitor.this.f36591j = networkCapabilities.hasCapability(16);
            NetworkMonitor.this.f36592k = true;
            NetworkMonitor.this.G(true);
            NetworkMonitor networkMonitor = NetworkMonitor.this;
            networkMonitor.y(0L, 0L, networkMonitor.D(), NetworkMonitor.this.w());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@f.n0 Network network) {
            NetworkMonitor.this.f36590i = false;
            NetworkMonitor.this.f36591j = false;
            NetworkMonitor.this.f36592k = false;
            NetworkMonitor.this.J();
            NetworkMonitor.this.f36606y = 0;
            NetworkMonitor networkMonitor = NetworkMonitor.this;
            networkMonitor.y(0L, 0L, -1, networkMonitor.w());
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (NetworkMonitor.this.f36607z) {
                NetworkMonitor.this.G(true);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NetworkMonitor.this.f36607z) {
                NetworkMonitor.this.G(true);
                NetworkMonitor.this.K();
                NetworkMonitor.this.M();
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NetworkMonitor.this.f36607z) {
                if (NetworkMonitor.this.f36590i && NetworkMonitor.this.f36591j) {
                    int iE = NetworkMonitor.E("8.8.8.8", 53, 800);
                    if (iE >= 0) {
                        NetworkMonitor.this.F(iE);
                        NetworkMonitor.this.f36600s = iE;
                        NetworkMonitor.this.f36606y = 0;
                        int iW = NetworkMonitor.this.w();
                        if (iW >= 0) {
                            NetworkMonitor.this.f36601t = iW;
                        }
                    } else {
                        NetworkMonitor.this.f36606y++;
                    }
                    NetworkMonitor networkMonitor = NetworkMonitor.this;
                    networkMonitor.y(0L, 0L, networkMonitor.D(), NetworkMonitor.this.w());
                }
                NetworkMonitor.this.L();
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f36613a;

        public e(g gVar) {
            this.f36613a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = (f) NetworkMonitor.this.f36586e.get();
            if (fVar != null) {
                fVar.a(this.f36613a);
            }
        }
    }

    public interface f {
        void a(@f.n0 g gVar);
    }

    public static class g {
        public final boolean connected;
        public final long downBytesPerSec;
        public final String ipAddress;
        public final int jitterMs;
        public final Quality quality;

        @f.l
        public final int qualityColor;
        public final String qualityText;
        public final int rttMs;
        public final long upBytesPerSec;
        public final boolean validated;

        public g(boolean z10, boolean z11, @f.n0 String str, long j10, long j11, int i10, int i11, @f.n0 Quality quality, @f.n0 String str2, @f.l int i12) {
            this.connected = z10;
            this.validated = z11;
            this.ipAddress = str;
            this.upBytesPerSec = j10;
            this.downBytesPerSec = j11;
            this.rttMs = i10;
            this.jitterMs = i11;
            this.quality = quality;
            this.qualityText = str2;
            this.qualityColor = i12;
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Quality f36615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @f.d1
        public final int f36616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36617c;

        public h(Quality quality, @f.d1 int i10, int i11) {
            this.f36615a = quality;
            this.f36616b = i10;
            this.f36617c = i11;
        }
    }

    public NetworkMonitor(@f.n0 Context context, @f.n0 f fVar) {
        Context applicationContext = context.getApplicationContext();
        this.f36582a = applicationContext;
        this.f36586e = new WeakReference<>(fVar);
        this.f36587f = (ConnectivityManager) applicationContext.getSystemService("connectivity");
    }

    public static String B(long j10) {
        if (j10 <= 0) {
            return "0 B/s";
        }
        double d10 = j10;
        if (d10 < 1024.0d) {
            return String.format(Locale.US, "%d B/s", Long.valueOf((long) d10));
        }
        double d11 = d10 / 1024.0d;
        if (d11 < 1024.0d) {
            return String.format(Locale.US, "%.0f KB/s", Double.valueOf(d11));
        }
        double d12 = d11 / 1024.0d;
        return d12 < 1024.0d ? String.format(Locale.US, "%.1f MB/s", Double.valueOf(d12)) : String.format(Locale.US, "%.2f GB/s", Double.valueOf(d12 / 1024.0d));
    }

    public static int E(@f.n0 String str, int i10, int i11) {
        long jElapsedRealtime;
        Socket socket;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        Socket socket2 = null;
        try {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            socket = new Socket();
        } catch (IOException unused) {
        } catch (Throwable unused2) {
        }
        try {
            socket.connect(new InetSocketAddress(str, i10), i11);
            int iMin = (int) Math.min(2147483647L, Math.max(0L, SystemClock.elapsedRealtime() - jElapsedRealtime));
            try {
                socket.close();
            } catch (Throwable unused3) {
            }
            return iMin;
        } catch (IOException unused4) {
            socket2 = socket;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused5) {
                }
            }
            return -1;
        } catch (Throwable unused6) {
            socket2 = socket;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused7) {
                }
            }
            return -1;
        }
    }

    public static h x(boolean z10, boolean z11, boolean z12) {
        if (!z10) {
            return new h(Quality.BAD, R.string.net_status_no_connection, -50384);
        }
        if (z11) {
            return new h(Quality.GOOD, z12 ? R.string.net_status_normal_idle : R.string.net_status_normal, -16725933);
        }
        return new h(Quality.SLOW, R.string.net_status_limited, -16121);
    }

    public void A() {
        if (this.f36607z) {
            G(true);
            K();
        }
    }

    @f.n0
    public final String C() {
        LinkProperties linkProperties;
        ConnectivityManager connectivityManager = this.f36587f;
        if (connectivityManager != null && Build.VERSION.SDK_INT >= 23) {
            try {
                Network activeNetwork = connectivityManager.getActiveNetwork();
                if (activeNetwork == null || (linkProperties = this.f36587f.getLinkProperties(activeNetwork)) == null) {
                    return "";
                }
                Iterator<LinkAddress> it = linkProperties.getLinkAddresses().iterator();
                String hostAddress = "";
                while (it.hasNext()) {
                    InetAddress address = it.next().getAddress();
                    if (address != null && !address.isLoopbackAddress()) {
                        if (address instanceof Inet4Address) {
                            return address.getHostAddress();
                        }
                        if (TextUtils.isEmpty(hostAddress)) {
                            hostAddress = address.getHostAddress();
                        }
                    }
                }
                return hostAddress;
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    public final int D() {
        Integer numPeekLast = this.f36598q.peekLast();
        int iIntValue = numPeekLast == null ? -1 : numPeekLast.intValue();
        return iIntValue >= 0 ? iIntValue : this.f36600s;
    }

    public final void F(int i10) {
        while (this.f36598q.size() >= 6) {
            this.f36598q.removeFirst();
        }
        this.f36598q.addLast(Integer.valueOf(i10));
    }

    public final void G(boolean z10) {
        if (this.f36587f == null) {
            return;
        }
        try {
            boolean z11 = this.f36590i;
            boolean z12 = this.f36591j;
            boolean z13 = this.f36592k;
            NetworkInfo activeNetworkInfo = this.f36587f.getActiveNetworkInfo();
            boolean z14 = true;
            boolean z15 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            if (!z15) {
                try {
                    this.f36590i = false;
                    this.f36591j = false;
                    this.f36592k = false;
                    if (z10) {
                        if (z11 == this.f36590i && z12 == this.f36591j && z13 == this.f36592k) {
                            return;
                        }
                        J();
                        this.f36606y = 0;
                        try {
                            y(0L, 0L, -1, w());
                            return;
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                } catch (Throwable unused2) {
                }
                return;
            }
            Network activeNetwork = Build.VERSION.SDK_INT >= 23 ? this.f36587f.getActiveNetwork() : null;
            try {
                if (activeNetwork == null) {
                    this.f36590i = false;
                    this.f36591j = false;
                    this.f36592k = false;
                    if (z10) {
                        if (z11 || z12 || z13) {
                            J();
                            this.f36606y = 0;
                            y(0L, 0L, -1, w());
                            return;
                        }
                        return;
                    }
                    return;
                }
                NetworkCapabilities networkCapabilities = this.f36587f.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    this.f36590i = z15;
                    this.f36591j = false;
                    if (activeNetworkInfo == null) {
                        z14 = false;
                    }
                    this.f36592k = z14;
                    if (z10) {
                        if (z11 == this.f36590i && z12 == this.f36591j && z13 == this.f36592k) {
                            return;
                        }
                        J();
                        this.f36606y = 0;
                        y(0L, 0L, -1, w());
                        return;
                    }
                    return;
                }
                this.f36590i = z15 && networkCapabilities.hasCapability(12);
                this.f36591j = networkCapabilities.hasCapability(16);
                if (activeNetworkInfo == null) {
                    z14 = false;
                }
                this.f36592k = z14;
                if (!this.f36590i) {
                    this.f36591j = false;
                }
                if (z10) {
                    if (z11 == this.f36590i && z12 == this.f36591j && z13 == this.f36592k) {
                        return;
                    }
                    if (!this.f36590i || !this.f36591j) {
                        J();
                        this.f36606y = 0;
                    }
                    y(0L, 0L, D(), w());
                }
            } catch (Throwable unused3) {
            }
        } catch (Throwable unused4) {
        }
    }

    public final void H() {
        if (this.f36589h != null) {
            return;
        }
        this.f36589h = new b();
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            this.f36582a.registerReceiver(this.f36589h, intentFilter);
        } catch (Throwable unused) {
        }
    }

    public final void I() {
        if (this.f36587f == null || this.f36588g != null) {
            return;
        }
        a aVar = new a();
        this.f36588g = aVar;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                this.f36587f.registerDefaultNetworkCallback(aVar);
            } else {
                this.f36587f.registerNetworkCallback(new NetworkRequest.Builder().build(), this.f36588g);
            }
            G(true);
        } catch (Throwable unused) {
        }
    }

    public final void J() {
        this.f36597p = -1L;
        this.f36595n = -1L;
        this.f36596o = -1L;
        this.f36604w = false;
        this.f36602u = 0L;
        this.f36603v = 0L;
        this.f36605x = -1L;
    }

    public final void K() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!this.f36590i) {
            J();
            y(0L, 0L, D(), w());
            return;
        }
        long totalRxBytes = TrafficStats.getTotalRxBytes();
        long totalTxBytes = TrafficStats.getTotalTxBytes();
        if (totalRxBytes < 0 || totalTxBytes < 0) {
            y(0L, 0L, D(), w());
            return;
        }
        long j10 = this.f36597p;
        if (j10 <= 0) {
            this.f36597p = jElapsedRealtime;
            this.f36595n = totalRxBytes;
            this.f36596o = totalTxBytes;
            this.f36604w = false;
            this.f36605x = jElapsedRealtime;
            y(0L, 0L, D(), w());
            return;
        }
        long jMax = Math.max(1L, jElapsedRealtime - j10);
        long jMax2 = Math.max(0L, totalRxBytes - this.f36595n);
        long jMax3 = Math.max(0L, totalTxBytes - this.f36596o);
        long j11 = (jMax2 * 1000) / jMax;
        long j12 = (1000 * jMax3) / jMax;
        this.f36597p = jElapsedRealtime;
        this.f36595n = totalRxBytes;
        this.f36596o = totalTxBytes;
        this.f36604w = true;
        this.f36602u = j12;
        this.f36603v = j11;
        if (jMax2 > 0 || jMax3 > 0) {
            this.f36605x = jElapsedRealtime;
        }
        y(j12, j11, D(), w());
    }

    public final void L() {
        Handler handler = this.f36585d;
        if (handler == null) {
            return;
        }
        handler.postDelayed(new d(), 1500L);
    }

    public final void M() {
        this.f36583b.postDelayed(new c(), 1000L);
    }

    public void N() {
        if (this.f36607z) {
            return;
        }
        this.f36607z = true;
        z();
        I();
        H();
        G(true);
        K();
        M();
        L();
    }

    public void O() {
        this.f36607z = false;
        this.f36583b.removeCallbacksAndMessages(null);
        Handler handler = this.f36585d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        HandlerThread handlerThread = this.f36584c;
        if (handlerThread != null) {
            try {
                handlerThread.quitSafely();
            } catch (Throwable unused) {
            }
            this.f36584c = null;
            this.f36585d = null;
        }
        P();
        Q();
    }

    public final void P() {
        BroadcastReceiver broadcastReceiver = this.f36589h;
        if (broadcastReceiver == null) {
            return;
        }
        try {
            this.f36582a.unregisterReceiver(broadcastReceiver);
            this.f36589h = null;
        } catch (Throwable unused) {
            this.f36589h = null;
        }
    }

    public final void Q() {
        ConnectivityManager.NetworkCallback networkCallback;
        ConnectivityManager connectivityManager = this.f36587f;
        if (connectivityManager == null || (networkCallback = this.f36588g) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(networkCallback);
            this.f36588g = null;
        } catch (Throwable unused) {
            this.f36588g = null;
        }
    }

    public final void R(@f.n0 Network network) {
        ConnectivityManager connectivityManager = this.f36587f;
        if (connectivityManager == null) {
            return;
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities == null) {
                return;
            }
            this.f36590i = networkCapabilities.hasCapability(12);
            this.f36591j = networkCapabilities.hasCapability(16);
            y(0L, 0L, D(), w());
        } catch (Throwable unused) {
        }
    }

    public final int w() {
        if (this.f36598q.size() < 2) {
            return this.f36601t;
        }
        Iterator<Integer> it = this.f36598q.iterator();
        double d10 = 0.0d;
        double dIntValue = 0.0d;
        while (it.hasNext()) {
            dIntValue += (double) it.next().intValue();
        }
        double size = dIntValue / ((double) this.f36598q.size());
        Iterator<Integer> it2 = this.f36598q.iterator();
        while (it2.hasNext()) {
            double dIntValue2 = ((double) it2.next().intValue()) - size;
            d10 += dIntValue2 * dIntValue2;
        }
        int iRound = (int) Math.round(Math.sqrt(d10 / ((double) Math.max(1, this.f36598q.size() - 1))));
        if (iRound >= 0) {
            this.f36601t = iRound;
        }
        return iRound;
    }

    public final void y(long j10, long j11, int i10, int i11) {
        long j12;
        long j13;
        long j14;
        long j15;
        f fVar = this.f36586e.get();
        if (fVar == null) {
            O();
            return;
        }
        if (j10 == 0 && j11 == 0 && this.f36604w) {
            j12 = this.f36602u;
            j13 = this.f36603v;
        } else {
            j12 = j10;
            j13 = j11;
        }
        if (this.f36604w) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j16 = this.f36605x;
            if (j16 > 0 && jElapsedRealtime - j16 >= 2500) {
                j12 = 0;
                j13 = 0;
            }
        }
        if (this.f36590i) {
            j14 = j12;
            j15 = j13;
        } else {
            j14 = 0;
            j15 = 0;
        }
        int i12 = i10 >= 0 ? i10 : this.f36600s;
        int i13 = i11 >= 0 ? i11 : this.f36601t;
        h hVarX = x(this.f36590i, this.f36591j, this.f36604w && j14 == 0 && j15 == 0);
        g gVar = new g(this.f36590i, this.f36591j, C(), j14, j15, i12, i13, hVarX.f36615a, this.f36582a.getString(hVarX.f36616b), hVarX.f36617c);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            fVar.a(gVar);
        } else {
            this.f36583b.post(new e(gVar));
        }
    }

    public final void z() {
        if (this.f36584c == null || this.f36585d == null) {
            HandlerThread handlerThread = new HandlerThread("NetworkMonitor");
            this.f36584c = handlerThread;
            handlerThread.start();
            this.f36585d = new Handler(this.f36584c.getLooper());
        }
    }
}
