package com.tencent.qgame.animplayer.plugin;

import android.view.MotionEvent;
import com.tencent.qgame.animplayer.AnimConfig;
import com.tencent.qgame.animplayer.AnimPlayer;
import com.tencent.qgame.animplayer.mask.MaskAnimPlugin;
import com.tencent.qgame.animplayer.mix.MixAnimPlugin;
import com.tencent.qgame.animplayer.util.ALog;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.h0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import to.k;
import to.l;

/* JADX INFO: loaded from: classes2.dex */
public final class AnimPluginManager {
    public static final Companion Companion = new Companion(null);
    private static final int DIFF_TIMES = 4;
    private static final String TAG = "AnimPlayer.AnimPluginManager";
    private int decodeIndex;
    private int frameDiffTimes;
    private int frameIndex;
    private final MaskAnimPlugin maskAnimPlugin;
    private final MixAnimPlugin mixAnimPlugin;

    @k
    private final AnimPlayer player;
    private final List<IAnimPlugin> plugins;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(v vVar) {
            this();
        }
    }

    public AnimPluginManager(@k AnimPlayer player) {
        g0.q(player, "player");
        this.player = player;
        MixAnimPlugin mixAnimPlugin = new MixAnimPlugin(player);
        this.mixAnimPlugin = mixAnimPlugin;
        MaskAnimPlugin maskAnimPlugin = new MaskAnimPlugin(player);
        this.maskAnimPlugin = maskAnimPlugin;
        this.plugins = h0.Q(mixAnimPlugin, maskAnimPlugin);
    }

    @l
    public final MaskAnimPlugin getMaskAnimPlugin() {
        return this.maskAnimPlugin;
    }

    @l
    public final MixAnimPlugin getMixAnimPlugin() {
        return this.mixAnimPlugin;
    }

    @k
    public final AnimPlayer getPlayer() {
        return this.player;
    }

    public final int onConfigCreate(@k AnimConfig config) {
        g0.q(config, "config");
        ALog.INSTANCE.i(TAG, "onConfigCreate");
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            int iOnConfigCreate = ((IAnimPlugin) it.next()).onConfigCreate(config);
            if (iOnConfigCreate != 0) {
                return iOnConfigCreate;
            }
        }
        return 0;
    }

    public final void onDecoding(int i10) {
        ALog.INSTANCE.d(TAG, "onDecoding decodeIndex=" + i10);
        this.decodeIndex = i10;
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            ((IAnimPlugin) it.next()).onDecoding(i10);
        }
    }

    public final void onDestroy() {
        ALog.INSTANCE.i(TAG, "onDestroy");
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            ((IAnimPlugin) it.next()).onDestroy();
        }
    }

    public final boolean onDispatchTouchEvent(@k MotionEvent ev) {
        g0.q(ev, "ev");
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            if (((IAnimPlugin) it.next()).onDispatchTouchEvent(ev)) {
                return true;
            }
        }
        return false;
    }

    public final void onLoopStart() {
        ALog.INSTANCE.i(TAG, "onLoopStart");
        this.frameIndex = 0;
        this.decodeIndex = 0;
    }

    public final void onRelease() {
        ALog.INSTANCE.i(TAG, "onRelease");
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            ((IAnimPlugin) it.next()).onRelease();
        }
    }

    public final void onRenderCreate() {
        ALog.INSTANCE.i(TAG, "onRenderCreate");
        this.frameIndex = 0;
        this.decodeIndex = 0;
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            ((IAnimPlugin) it.next()).onRenderCreate();
        }
    }

    public final void onRendering() {
        if (this.decodeIndex > this.frameIndex + 1 || this.frameDiffTimes >= 4) {
            ALog.INSTANCE.i(TAG, "jump frameIndex= " + this.frameIndex + ",decodeIndex=" + this.decodeIndex + ",frameDiffTimes=" + this.frameDiffTimes);
            this.frameIndex = this.decodeIndex;
        }
        if (this.decodeIndex != this.frameIndex) {
            this.frameDiffTimes++;
        } else {
            this.frameDiffTimes = 0;
        }
        ALog.INSTANCE.d(TAG, "onRendering frameIndex=" + this.frameIndex);
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            ((IAnimPlugin) it.next()).onRendering(this.frameIndex);
        }
        this.frameIndex++;
    }
}
