package net.babycat.live.platform.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes3.dex */
public class v1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f37045e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Timer f37046a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37047b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37048c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f37049d = new a(Looper.getMainLooper());

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (v1.this.f37048c) {
                return;
            }
            ((f) message.obj).b();
        }
    }

    public class b extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f37051a;

        public b(f fVar) {
            this.f37051a = fVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            f fVar = this.f37051a;
            if (fVar != null) {
                fVar.a();
                v1.this.e(this.f37051a);
            }
        }
    }

    public class c extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f37053a;

        public c(f fVar) {
            this.f37053a = fVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            f fVar = this.f37053a;
            if (fVar != null) {
                fVar.a();
                v1.this.e(this.f37053a);
            }
        }
    }

    public class d extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f37055a;

        public d(f fVar) {
            this.f37055a = fVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            f fVar = this.f37055a;
            if (fVar != null) {
                fVar.a();
                v1.this.e(this.f37055a);
            }
        }
    }

    public class e extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f37057a;

        public e(f fVar) {
            this.f37057a = fVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            f fVar = this.f37057a;
            if (fVar != null) {
                fVar.a();
                v1.this.e(this.f37057a);
            }
        }
    }

    public interface f {
        void a();

        void b();
    }

    public boolean c() {
        return this.f37047b;
    }

    public final Timer d() {
        j();
        Timer timer = new Timer();
        this.f37046a = timer;
        this.f37047b = true;
        this.f37048c = false;
        return timer;
    }

    public final void e(f fVar) {
        Message messageObtainMessage = this.f37049d.obtainMessage();
        messageObtainMessage.obj = fVar;
        messageObtainMessage.what = 0;
        this.f37049d.sendMessage(messageObtainMessage);
    }

    public void f(long j10, long j11, f fVar) {
        d().schedule(new e(fVar), j10, j11);
    }

    public void g(long j10, f fVar) {
        d().schedule(new b(fVar), j10);
    }

    public void h(Date date, long j10, f fVar) {
        d().schedule(new d(fVar), date, j10);
    }

    public void i(Date date, f fVar) {
        d().schedule(new c(fVar), date);
    }

    public void j() {
        this.f37048c = true;
        Timer timer = this.f37046a;
        if (timer != null) {
            timer.cancel();
        }
        Handler handler = this.f37049d;
        if (handler != null) {
            handler.removeMessages(0);
        }
        this.f37047b = false;
    }
}
