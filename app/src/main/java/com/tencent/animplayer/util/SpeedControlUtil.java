package com.tencent.qgame.animplayer.util;

import androidx.media3.exoplayer.i;
import kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes2.dex */
public final class SpeedControlUtil {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AnimPlayer.SpeedControlUtil";
    private long fixedFrameDurationUsec;
    private long prevMonoUsec;
    private long prevPresentUsec;
    private final long ONE_MILLION = 1000000;
    private boolean loopReset = true;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(v vVar) {
            this();
        }
    }

    public final void preRender(long j10) {
        long j11 = this.prevMonoUsec;
        long j12 = 0;
        if (j11 == 0) {
            this.prevMonoUsec = System.nanoTime() / ((long) 1000);
            this.prevPresentUsec = j10;
            return;
        }
        if (this.loopReset) {
            this.prevPresentUsec = j10 - (this.ONE_MILLION / ((long) 30));
            this.loopReset = false;
        }
        long j13 = this.fixedFrameDurationUsec;
        if (j13 == 0) {
            j13 = j10 - this.prevPresentUsec;
        }
        if (j13 >= 0) {
            long j14 = this.ONE_MILLION;
            j12 = j13 > ((long) 10) * j14 ? j14 * ((long) 5) : j13;
        }
        long j15 = j11 + j12;
        long jNanoTime = System.nanoTime();
        long j16 = 1000;
        while (true) {
            long j17 = jNanoTime / j16;
            if (j17 >= j15 - ((long) 100)) {
                this.prevMonoUsec += j12;
                this.prevPresentUsec += j12;
                return;
            }
            long j18 = j15 - j17;
            if (j18 > 500000) {
                j18 = i.Y0;
            }
            try {
                Thread.sleep(j18 / j16, ((int) (j18 % j16)) * 1000);
            } catch (InterruptedException e10) {
                ALog.INSTANCE.e(TAG, "e=" + e10, e10);
            }
            jNanoTime = System.nanoTime();
        }
    }

    public final void reset() {
        this.prevPresentUsec = 0L;
        this.prevMonoUsec = 0L;
    }

    public final void setFixedPlaybackRate(int i10) {
        if (i10 <= 0) {
            return;
        }
        this.fixedFrameDurationUsec = this.ONE_MILLION / ((long) i10);
    }
}
