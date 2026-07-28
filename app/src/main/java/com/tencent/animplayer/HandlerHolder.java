package com.tencent.qgame.animplayer;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.jvm.internal.g0;
import to.k;
import to.l;

/* JADX INFO: loaded from: classes2.dex */
public final class HandlerHolder {

    @l
    private Handler handler;

    @l
    private HandlerThread thread;

    public HandlerHolder(@l HandlerThread handlerThread, @l Handler handler) {
        this.thread = handlerThread;
        this.handler = handler;
    }

    public static /* synthetic */ HandlerHolder copy$default(HandlerHolder handlerHolder, HandlerThread handlerThread, Handler handler, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            handlerThread = handlerHolder.thread;
        }
        if ((i10 & 2) != 0) {
            handler = handlerHolder.handler;
        }
        return handlerHolder.copy(handlerThread, handler);
    }

    @l
    public final HandlerThread component1() {
        return this.thread;
    }

    @l
    public final Handler component2() {
        return this.handler;
    }

    @k
    public final HandlerHolder copy(@l HandlerThread handlerThread, @l Handler handler) {
        return new HandlerHolder(handlerThread, handler);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HandlerHolder)) {
            return false;
        }
        HandlerHolder handlerHolder = (HandlerHolder) obj;
        return g0.g(this.thread, handlerHolder.thread) && g0.g(this.handler, handlerHolder.handler);
    }

    @l
    public final Handler getHandler() {
        return this.handler;
    }

    @l
    public final HandlerThread getThread() {
        return this.thread;
    }

    public int hashCode() {
        HandlerThread handlerThread = this.thread;
        int iHashCode = (handlerThread != null ? handlerThread.hashCode() : 0) * 31;
        Handler handler = this.handler;
        return iHashCode + (handler != null ? handler.hashCode() : 0);
    }

    public final void setHandler(@l Handler handler) {
        this.handler = handler;
    }

    public final void setThread(@l HandlerThread handlerThread) {
        this.thread = handlerThread;
    }

    @k
    public String toString() {
        return "HandlerHolder(thread=" + this.thread + ", handler=" + this.handler + ")";
    }
}
