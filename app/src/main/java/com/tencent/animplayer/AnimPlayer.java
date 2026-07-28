package com.tencent.qgame.animplayer;

import android.os.Handler;
import com.tencent.qgame.animplayer.file.IFileContainer;
import com.tencent.qgame.animplayer.inter.IAnimListener;
import com.tencent.qgame.animplayer.mask.MaskConfig;
import com.tencent.qgame.animplayer.plugin.AnimPluginManager;
import com.tencent.qgame.animplayer.util.ALog;
import kotlin.j2;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import to.k;
import to.l;

/* JADX INFO: loaded from: classes2.dex */
public final class AnimPlayer {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AnimPlayer.AnimPlayer";

    @l
    private IAnimListener animListener;

    @k
    private final IAnimView animView;

    @l
    private AudioPlayer audioPlayer;

    @k
    private final AnimConfigManager configManager;

    @l
    private Decoder decoder;
    private int defaultFps;
    private boolean enableVersion1;
    private int fps;
    private boolean isDetachedFromWindow;
    private boolean isMute;
    private boolean isStartRunning;
    private boolean isSurfaceAvailable;
    private boolean maskEdgeBlurBoolean;
    private int playLoop;

    @k
    private final AnimPluginManager pluginManager;

    @l
    private Runnable startRunnable;
    private boolean supportMaskBoolean;
    private int videoMode;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(v vVar) {
            this();
        }
    }

    public AnimPlayer(@k IAnimView animView) {
        g0.q(animView, "animView");
        this.animView = animView;
        this.videoMode = 1;
        this.configManager = new AnimConfigManager(this);
        this.pluginManager = new AnimPluginManager(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void innerStartPlay(final IFileContainer iFileContainer) {
        AudioPlayer audioPlayer;
        synchronized (AnimPlayer.class) {
            try {
                if (this.isSurfaceAvailable) {
                    this.isStartRunning = false;
                    Decoder decoder = this.decoder;
                    if (decoder != null) {
                        decoder.start(iFileContainer);
                    }
                    if (!this.isMute && (audioPlayer = this.audioPlayer) != null) {
                        audioPlayer.start(iFileContainer);
                    }
                } else {
                    this.startRunnable = new Runnable() { // from class: com.tencent.qgame.animplayer.AnimPlayer$innerStartPlay$$inlined$synchronized$lambda$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.this$0.innerStartPlay(iFileContainer);
                        }
                    };
                    this.animView.prepareTextureView();
                }
                j2 j2Var = j2.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void prepareDecoder() {
        if (this.decoder == null) {
            HardDecoder hardDecoder = new HardDecoder(this);
            hardDecoder.setPlayLoop(this.playLoop);
            hardDecoder.setFps(this.fps);
            this.decoder = hardDecoder;
        }
        if (this.audioPlayer == null) {
            AudioPlayer audioPlayer = new AudioPlayer(this);
            audioPlayer.setPlayLoop(this.playLoop);
            this.audioPlayer = audioPlayer;
        }
    }

    @l
    public final IAnimListener getAnimListener() {
        return this.animListener;
    }

    @k
    public final IAnimView getAnimView() {
        return this.animView;
    }

    @l
    public final AudioPlayer getAudioPlayer() {
        return this.audioPlayer;
    }

    @k
    public final AnimConfigManager getConfigManager() {
        return this.configManager;
    }

    @l
    public final Decoder getDecoder() {
        return this.decoder;
    }

    public final int getDefaultFps() {
        return this.defaultFps;
    }

    public final boolean getEnableVersion1() {
        return this.enableVersion1;
    }

    public final int getFps() {
        return this.fps;
    }

    public final boolean getMaskEdgeBlurBoolean() {
        return this.maskEdgeBlurBoolean;
    }

    public final int getPlayLoop() {
        return this.playLoop;
    }

    @k
    public final AnimPluginManager getPluginManager() {
        return this.pluginManager;
    }

    @l
    public final Runnable getStartRunnable() {
        return this.startRunnable;
    }

    public final boolean getSupportMaskBoolean() {
        return this.supportMaskBoolean;
    }

    public final int getVideoMode() {
        return this.videoMode;
    }

    public final boolean isDetachedFromWindow() {
        return this.isDetachedFromWindow;
    }

    public final boolean isMute() {
        return this.isMute;
    }

    public final boolean isRunning() {
        if (this.isStartRunning) {
            return true;
        }
        Decoder decoder = this.decoder;
        return decoder != null ? decoder.isRunning() : false;
    }

    public final boolean isStartRunning() {
        return this.isStartRunning;
    }

    public final boolean isSurfaceAvailable() {
        return this.isSurfaceAvailable;
    }

    public final void onSurfaceTextureAvailable(int i10, int i11) {
        this.isSurfaceAvailable = true;
        Runnable runnable = this.startRunnable;
        if (runnable != null) {
            runnable.run();
        }
        this.startRunnable = null;
    }

    public final void onSurfaceTextureDestroyed() {
        this.isSurfaceAvailable = false;
        this.isStartRunning = false;
        Decoder decoder = this.decoder;
        if (decoder != null) {
            decoder.destroy();
        }
        AudioPlayer audioPlayer = this.audioPlayer;
        if (audioPlayer != null) {
            audioPlayer.destroy();
        }
    }

    public final void onSurfaceTextureSizeChanged(int i10, int i11) {
        Decoder decoder = this.decoder;
        if (decoder != null) {
            decoder.onSurfaceSizeChanged(i10, i11);
        }
    }

    public final void setAnimListener(@l IAnimListener iAnimListener) {
        this.animListener = iAnimListener;
    }

    public final void setAudioPlayer(@l AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public final void setDecoder(@l Decoder decoder) {
        this.decoder = decoder;
    }

    public final void setDefaultFps(int i10) {
        this.defaultFps = i10;
    }

    public final void setDetachedFromWindow(boolean z10) {
        this.isDetachedFromWindow = z10;
    }

    public final void setEnableVersion1(boolean z10) {
        this.enableVersion1 = z10;
    }

    public final void setFps(int i10) {
        Decoder decoder = this.decoder;
        if (decoder != null) {
            decoder.setFps(i10);
        }
        this.fps = i10;
    }

    public final void setMaskEdgeBlurBoolean(boolean z10) {
        this.maskEdgeBlurBoolean = z10;
    }

    public final void setMute(boolean z10) {
        this.isMute = z10;
    }

    public final void setPlayLoop(int i10) {
        Decoder decoder = this.decoder;
        if (decoder != null) {
            decoder.setPlayLoop(i10);
        }
        AudioPlayer audioPlayer = this.audioPlayer;
        if (audioPlayer != null) {
            audioPlayer.setPlayLoop(i10);
        }
        this.playLoop = i10;
    }

    public final void setStartRunnable(@l Runnable runnable) {
        this.startRunnable = runnable;
    }

    public final void setStartRunning(boolean z10) {
        this.isStartRunning = z10;
    }

    public final void setSupportMaskBoolean(boolean z10) {
        this.supportMaskBoolean = z10;
    }

    public final void setSurfaceAvailable(boolean z10) {
        this.isSurfaceAvailable = z10;
    }

    public final void setVideoMode(int i10) {
        this.videoMode = i10;
    }

    public final void startPlay(@k final IFileContainer fileContainer) {
        HandlerHolder renderThread;
        Handler handler;
        g0.q(fileContainer, "fileContainer");
        this.isStartRunning = true;
        prepareDecoder();
        Decoder decoder = this.decoder;
        if (decoder == null || decoder.prepareThread()) {
            Decoder decoder2 = this.decoder;
            if (decoder2 == null || (renderThread = decoder2.getRenderThread()) == null || (handler = renderThread.getHandler()) == null) {
                return;
            }
            handler.post(new Runnable() { // from class: com.tencent.qgame.animplayer.AnimPlayer.startPlay.1
                @Override // java.lang.Runnable
                public final void run() {
                    IAnimListener animListener;
                    int config = AnimPlayer.this.getConfigManager().parseConfig(fileContainer, AnimPlayer.this.getEnableVersion1(), AnimPlayer.this.getVideoMode(), AnimPlayer.this.getDefaultFps());
                    if (config != 0) {
                        AnimPlayer.this.setStartRunning(false);
                        Decoder decoder3 = AnimPlayer.this.getDecoder();
                        if (decoder3 != null) {
                            decoder3.onFailed(config, Constant.getErrorMsg$default(Constant.INSTANCE, config, null, 2, null));
                        }
                        Decoder decoder4 = AnimPlayer.this.getDecoder();
                        if (decoder4 != null) {
                            decoder4.onVideoComplete();
                            return;
                        }
                        return;
                    }
                    ALog aLog = ALog.INSTANCE;
                    aLog.i(AnimPlayer.TAG, "parse " + AnimPlayer.this.getConfigManager().getConfig());
                    AnimConfig config2 = AnimPlayer.this.getConfigManager().getConfig();
                    if (config2 == null || (!config2.isDefaultConfig() && ((animListener = AnimPlayer.this.getAnimListener()) == null || !animListener.onVideoConfigReady(config2)))) {
                        aLog.i(AnimPlayer.TAG, "onVideoConfigReady return false");
                    } else {
                        AnimPlayer.this.innerStartPlay(fileContainer);
                    }
                }
            });
            return;
        }
        this.isStartRunning = false;
        Decoder decoder3 = this.decoder;
        if (decoder3 != null) {
            decoder3.onFailed(10003, "0x3 thread create fail");
        }
        Decoder decoder4 = this.decoder;
        if (decoder4 != null) {
            decoder4.onVideoComplete();
        }
    }

    public final void stopPlay() {
        Decoder decoder = this.decoder;
        if (decoder != null) {
            decoder.stop();
        }
        AudioPlayer audioPlayer = this.audioPlayer;
        if (audioPlayer != null) {
            audioPlayer.stop();
        }
    }

    public final void updateMaskConfig(@l MaskConfig maskConfig) {
        MaskConfig maskConfig2;
        MaskConfig maskConfig3;
        MaskConfig maskConfig4;
        MaskConfig maskConfig5;
        AnimConfig config = this.configManager.getConfig();
        if (config != null) {
            AnimConfig config2 = this.configManager.getConfig();
            if (config2 == null || (maskConfig5 = config2.getMaskConfig()) == null) {
                maskConfig5 = new MaskConfig();
            }
            config.setMaskConfig(maskConfig5);
        }
        AnimConfig config3 = this.configManager.getConfig();
        if (config3 != null && (maskConfig4 = config3.getMaskConfig()) != null) {
            maskConfig4.safeSetMaskBitmapAndReleasePre(maskConfig != null ? maskConfig.getAlphaMaskBitmap() : null);
        }
        AnimConfig config4 = this.configManager.getConfig();
        if (config4 != null && (maskConfig3 = config4.getMaskConfig()) != null) {
            maskConfig3.setMaskPositionPair(maskConfig != null ? maskConfig.getMaskPositionPair() : null);
        }
        AnimConfig config5 = this.configManager.getConfig();
        if (config5 == null || (maskConfig2 = config5.getMaskConfig()) == null) {
            return;
        }
        maskConfig2.setMaskTexPair(maskConfig != null ? maskConfig.getMaskTexPair() : null);
    }
}
