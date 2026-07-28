package com.tencent.qgame.animplayer.util;

import kotlin.jvm.internal.g0;
import to.k;
import to.l;

/* JADX INFO: loaded from: classes2.dex */
public final class ALog {
    public static final ALog INSTANCE = new ALog();
    private static boolean isDebug;

    @l
    private static IALog log;

    private ALog() {
    }

    public final void d(@k String tag, @k String msg) {
        IALog iALog;
        g0.q(tag, "tag");
        g0.q(msg, "msg");
        if (!isDebug || (iALog = log) == null) {
            return;
        }
        iALog.d(tag, msg);
    }

    public final void e(@k String tag, @k String msg) {
        g0.q(tag, "tag");
        g0.q(msg, "msg");
        IALog iALog = log;
        if (iALog != null) {
            iALog.e(tag, msg);
        }
    }

    @l
    public final IALog getLog() {
        return log;
    }

    public final void i(@k String tag, @k String msg) {
        g0.q(tag, "tag");
        g0.q(msg, "msg");
        IALog iALog = log;
        if (iALog != null) {
            iALog.i(tag, msg);
        }
    }

    public final boolean isDebug() {
        return isDebug;
    }

    public final void setDebug(boolean z10) {
        isDebug = z10;
    }

    public final void setLog(@l IALog iALog) {
        log = iALog;
    }

    public final void e(@k String tag, @k String msg, @k Throwable tr) {
        g0.q(tag, "tag");
        g0.q(msg, "msg");
        g0.q(tr, "tr");
        IALog iALog = log;
        if (iALog != null) {
            iALog.e(tag, msg, tr);
        }
    }
}
