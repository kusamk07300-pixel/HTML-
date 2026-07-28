package com.tencent.qgame.animplayer;

import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.os.Handler;
import com.tencent.qgame.animplayer.file.IFileContainer;
import com.tencent.qgame.animplayer.util.ALog;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import to.k;
import to.l;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioPlayer {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AnimPlayer.AudioPlayer";

    @l
    private AudioTrack audioTrack;

    @k
    private final HandlerHolder decodeThread;

    @l
    private MediaCodec decoder;

    @l
    private MediaExtractor extractor;
    private boolean isRunning;
    private boolean isStopReq;
    private boolean needDestroy;
    private int playLoop;

    @k
    private final AnimPlayer player;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(v vVar) {
            this();
        }
    }

    public AudioPlayer(@k AnimPlayer player) {
        g0.q(player, "player");
        this.player = player;
        this.decodeThread = new HandlerHolder(null, null);
    }

    private final void destroyInner() {
        if (this.player.isDetachedFromWindow()) {
            ALog.INSTANCE.i(TAG, "destroyThread");
            Handler handler = this.decodeThread.getHandler();
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            HandlerHolder handlerHolder = this.decodeThread;
            handlerHolder.setThread(Decoder.Companion.quitSafely(handlerHolder.getThread()));
        }
    }

    private final int getChannelConfig(int i10) {
        switch (i10) {
            case 1:
                return 2;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            default:
                throw new RuntimeException("Unsupported channel count: " + i10);
        }
    }

    private final boolean prepareThread() {
        return Decoder.Companion.createThread(this.decodeThread, "anim_audio_thread");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void release() {
        try {
            MediaCodec mediaCodec = this.decoder;
            if (mediaCodec != null) {
                mediaCodec.stop();
                mediaCodec.release();
            }
            this.decoder = null;
            MediaExtractor mediaExtractor = this.extractor;
            if (mediaExtractor != null) {
                mediaExtractor.release();
            }
            this.extractor = null;
            AudioTrack audioTrack = this.audioTrack;
            if (audioTrack != null) {
                audioTrack.pause();
                audioTrack.flush();
                audioTrack.stop();
                audioTrack.release();
            }
            this.audioTrack = null;
        } catch (Throwable th2) {
            ALog.INSTANCE.e(TAG, "release exception=" + th2, th2);
        }
        this.isRunning = false;
        if (this.needDestroy) {
            destroyInner();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void startPlay(com.tencent.qgame.animplayer.file.IFileContainer r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qgame.animplayer.AudioPlayer.startPlay(com.tencent.qgame.animplayer.file.IFileContainer):void");
    }

    public final void destroy() {
        if (!this.isRunning) {
            destroyInner();
        } else {
            this.needDestroy = true;
            stop();
        }
    }

    @l
    public final AudioTrack getAudioTrack() {
        return this.audioTrack;
    }

    @k
    public final HandlerHolder getDecodeThread() {
        return this.decodeThread;
    }

    @l
    public final MediaCodec getDecoder() {
        return this.decoder;
    }

    @l
    public final MediaExtractor getExtractor() {
        return this.extractor;
    }

    public final boolean getNeedDestroy() {
        return this.needDestroy;
    }

    public final int getPlayLoop() {
        return this.playLoop;
    }

    @k
    public final AnimPlayer getPlayer() {
        return this.player;
    }

    public final boolean isRunning() {
        return this.isRunning;
    }

    public final boolean isStopReq() {
        return this.isStopReq;
    }

    public final void setAudioTrack(@l AudioTrack audioTrack) {
        this.audioTrack = audioTrack;
    }

    public final void setDecoder(@l MediaCodec mediaCodec) {
        this.decoder = mediaCodec;
    }

    public final void setExtractor(@l MediaExtractor mediaExtractor) {
        this.extractor = mediaExtractor;
    }

    public final void setNeedDestroy(boolean z10) {
        this.needDestroy = z10;
    }

    public final void setPlayLoop(int i10) {
        this.playLoop = i10;
    }

    public final void setRunning(boolean z10) {
        this.isRunning = z10;
    }

    public final void setStopReq(boolean z10) {
        this.isStopReq = z10;
    }

    public final void start(@k final IFileContainer fileContainer) {
        g0.q(fileContainer, "fileContainer");
        this.isStopReq = false;
        this.needDestroy = false;
        if (prepareThread()) {
            if (this.isRunning) {
                stop();
            }
            this.isRunning = true;
            Handler handler = this.decodeThread.getHandler();
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.tencent.qgame.animplayer.AudioPlayer.start.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            AudioPlayer.this.startPlay(fileContainer);
                        } catch (Throwable th2) {
                            ALog.INSTANCE.e(AudioPlayer.TAG, "Audio exception=" + th2, th2);
                            AudioPlayer.this.release();
                        }
                    }
                });
            }
        }
    }

    public final void stop() {
        this.isStopReq = true;
    }
}
