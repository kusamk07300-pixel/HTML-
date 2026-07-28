package com.tencent.qgame.animplayer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.qgame.animplayer.file.IFileContainer;
import com.tencent.qgame.animplayer.inter.IAnimListener;
import com.tencent.qgame.animplayer.util.ALog;
import com.tencent.qgame.animplayer.util.SpeedControlUtil;
import kotlin.f0;
import kotlin.h0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.v;
import kotlin.reflect.n;
import nj.a;
import to.k;
import to.l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Decoder implements IAnimListener {
    static final /* synthetic */ n[] $$delegatedProperties = {o0.u(new PropertyReference1Impl(o0.d(Decoder.class), "speedControlUtil", "getSpeedControlUtil()Lcom/tencent/qgame/animplayer/util/SpeedControlUtil;"))};
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AnimPlayer.Decoder";

    @k
    private final HandlerHolder decodeThread;
    private int fps;
    private boolean isRunning;
    private boolean isStopReq;
    private int playLoop;

    @k
    private final AnimPlayer player;

    @l
    private IRenderListener render;

    @k
    private final HandlerHolder renderThread;

    @k
    private final f0 speedControlUtil$delegate;
    private int surfaceHeight;
    private int surfaceWidth;

    public static final class Companion {
        private Companion() {
        }

        public final boolean createThread(@k HandlerHolder handlerHolder, @k String name) {
            HandlerThread thread;
            g0.q(handlerHolder, "handlerHolder");
            g0.q(name, "name");
            try {
                if (handlerHolder.getThread() != null && ((thread = handlerHolder.getThread()) == null || thread.isAlive())) {
                    return true;
                }
                HandlerThread handlerThread = new HandlerThread(name);
                handlerThread.start();
                handlerHolder.setHandler(new Handler(handlerThread.getLooper()));
                handlerHolder.setThread(handlerThread);
                return true;
            } catch (OutOfMemoryError e10) {
                ALog.INSTANCE.e(Decoder.TAG, "createThread OOM", e10);
                return false;
            }
        }

        @l
        public final HandlerThread quitSafely(@l HandlerThread handlerThread) {
            if (handlerThread == null) {
                return null;
            }
            handlerThread.quitSafely();
            return null;
        }

        public /* synthetic */ Companion(v vVar) {
            this();
        }
    }

    public Decoder(@k AnimPlayer player) {
        g0.q(player, "player");
        this.player = player;
        this.renderThread = new HandlerHolder(null, null);
        this.decodeThread = new HandlerHolder(null, null);
        this.speedControlUtil$delegate = h0.c(new a<SpeedControlUtil>() { // from class: com.tencent.qgame.animplayer.Decoder$speedControlUtil$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // nj.a
            @k
            public final SpeedControlUtil invoke() {
                return new SpeedControlUtil();
            }
        });
    }

    public abstract void destroy();

    public final void destroyThread() {
        if (this.player.isDetachedFromWindow()) {
            ALog.INSTANCE.i(TAG, "destroyThread");
            Handler handler = this.renderThread.getHandler();
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Handler handler2 = this.decodeThread.getHandler();
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            HandlerHolder handlerHolder = this.renderThread;
            Companion companion = Companion;
            handlerHolder.setThread(companion.quitSafely(handlerHolder.getThread()));
            HandlerHolder handlerHolder2 = this.decodeThread;
            handlerHolder2.setThread(companion.quitSafely(handlerHolder2.getThread()));
            this.renderThread.setHandler(null);
            this.decodeThread.setHandler(null);
        }
    }

    @k
    public final HandlerHolder getDecodeThread() {
        return this.decodeThread;
    }

    public final int getFps() {
        return this.fps;
    }

    public final int getPlayLoop() {
        return this.playLoop;
    }

    @k
    public final AnimPlayer getPlayer() {
        return this.player;
    }

    @l
    public final IRenderListener getRender() {
        return this.render;
    }

    @k
    public final HandlerHolder getRenderThread() {
        return this.renderThread;
    }

    @k
    public final SpeedControlUtil getSpeedControlUtil() {
        f0 f0Var = this.speedControlUtil$delegate;
        n nVar = $$delegatedProperties[0];
        return (SpeedControlUtil) f0Var.getValue();
    }

    public final boolean isRunning() {
        return this.isRunning;
    }

    public final boolean isStopReq() {
        return this.isStopReq;
    }

    @Override // com.tencent.qgame.animplayer.inter.IAnimListener
    public void onFailed(int i10, @l String str) {
        ALog.INSTANCE.e(TAG, "onFailed errorType=" + i10 + ", errorMsg=" + str);
        IAnimListener animListener = this.player.getAnimListener();
        if (animListener != null) {
            animListener.onFailed(i10, str);
        }
    }

    public final void onSurfaceSizeChanged(int i10, int i11) {
        this.surfaceWidth = i10;
        this.surfaceHeight = i11;
        IRenderListener iRenderListener = this.render;
        if (iRenderListener != null) {
            iRenderListener.updateViewPort(i10, i11);
        }
    }

    @Override // com.tencent.qgame.animplayer.inter.IAnimListener
    public void onVideoComplete() {
        ALog.INSTANCE.i(TAG, "onVideoComplete");
        IAnimListener animListener = this.player.getAnimListener();
        if (animListener != null) {
            animListener.onVideoComplete();
        }
    }

    @Override // com.tencent.qgame.animplayer.inter.IAnimListener
    public boolean onVideoConfigReady(@k AnimConfig config) {
        g0.q(config, "config");
        return IAnimListener.DefaultImpls.onVideoConfigReady(this, config);
    }

    @Override // com.tencent.qgame.animplayer.inter.IAnimListener
    public void onVideoDestroy() {
        ALog.INSTANCE.i(TAG, "onVideoDestroy");
        IAnimListener animListener = this.player.getAnimListener();
        if (animListener != null) {
            animListener.onVideoDestroy();
        }
    }

    @Override // com.tencent.qgame.animplayer.inter.IAnimListener
    public void onVideoRender(int i10, @l AnimConfig animConfig) {
        ALog.INSTANCE.d(TAG, "onVideoRender");
        IAnimListener animListener = this.player.getAnimListener();
        if (animListener != null) {
            animListener.onVideoRender(i10, animConfig);
        }
    }

    @Override // com.tencent.qgame.animplayer.inter.IAnimListener
    public void onVideoStart() {
        ALog.INSTANCE.i(TAG, "onVideoStart");
        IAnimListener animListener = this.player.getAnimListener();
        if (animListener != null) {
            animListener.onVideoStart();
        }
    }

    public final void preparePlay(int i10, int i11) {
        IRenderListener iRenderListener;
        this.player.getConfigManager().defaultConfig(i10, i11);
        AnimConfig config = this.player.getConfigManager().getConfig();
        if (config != null && (iRenderListener = this.render) != null) {
            iRenderListener.setAnimConfig(config);
        }
        this.player.getPluginManager().onRenderCreate();
    }

    public final boolean prepareRender(boolean z10) {
        if (this.render == null) {
            ALog aLog = ALog.INSTANCE;
            aLog.i(TAG, "prepareRender");
            SurfaceTexture surfaceTexture = this.player.getAnimView().getSurfaceTexture();
            if (surfaceTexture != null) {
                if (z10) {
                    aLog.i(TAG, "use yuv render");
                    this.render = new YUVRender(surfaceTexture);
                } else {
                    Render render = new Render(surfaceTexture);
                    render.updateViewPort(this.surfaceWidth, this.surfaceHeight);
                    this.render = render;
                }
            }
        }
        return this.render != null;
    }

    public final boolean prepareThread() {
        Companion companion = Companion;
        return companion.createThread(this.renderThread, "anim_render_thread") && companion.createThread(this.decodeThread, "anim_decode_thread");
    }

    public final void setFps(int i10) {
        getSpeedControlUtil().setFixedPlaybackRate(i10);
        this.fps = i10;
    }

    public final void setPlayLoop(int i10) {
        this.playLoop = i10;
    }

    public final void setRender(@l IRenderListener iRenderListener) {
        this.render = iRenderListener;
    }

    public final void setRunning(boolean z10) {
        this.isRunning = z10;
    }

    public final void setStopReq(boolean z10) {
        this.isStopReq = z10;
    }

    public abstract void start(@k IFileContainer iFileContainer);

    public final void stop() {
        this.isStopReq = true;
    }

    public final void videoSizeChange(int i10, int i11) {
        AnimConfig config;
        if (i10 <= 0 || i11 <= 0 || (config = this.player.getConfigManager().getConfig()) == null) {
            return;
        }
        if (config.getVideoWidth() == i10 && config.getVideoHeight() == i11) {
            return;
        }
        ALog.INSTANCE.i(TAG, "videoSizeChange old=(" + config.getVideoWidth() + ',' + config.getVideoHeight() + "), new=(" + i10 + ',' + i11 + ')');
        config.setVideoWidth(i10);
        config.setVideoHeight(i11);
        IRenderListener iRenderListener = this.render;
        if (iRenderListener != null) {
            iRenderListener.setAnimConfig(config);
        }
    }
}
