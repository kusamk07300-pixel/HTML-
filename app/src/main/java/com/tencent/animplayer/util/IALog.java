package com.tencent.qgame.animplayer.util;

import kotlin.jvm.internal.g0;
import to.k;

/* JADX INFO: loaded from: classes2.dex */
public interface IALog {

    public static final class DefaultImpls {
        public static void d(IALog iALog, @k String tag, @k String msg) {
            g0.q(tag, "tag");
            g0.q(msg, "msg");
        }

        public static void e(IALog iALog, @k String tag, @k String msg) {
            g0.q(tag, "tag");
            g0.q(msg, "msg");
        }

        public static void i(IALog iALog, @k String tag, @k String msg) {
            g0.q(tag, "tag");
            g0.q(msg, "msg");
        }

        public static void e(IALog iALog, @k String tag, @k String msg, @k Throwable tr) {
            g0.q(tag, "tag");
            g0.q(msg, "msg");
            g0.q(tr, "tr");
        }
    }

    void d(@k String str, @k String str2);

    void e(@k String str, @k String str2);

    void e(@k String str, @k String str2, @k Throwable th2);

    void i(@k String str, @k String str2);
}
