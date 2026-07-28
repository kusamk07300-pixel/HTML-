package com.tencent.qgame.animplayer.mask;

import android.view.MotionEvent;
import androidx.constraintlayout.core.state.f;
import com.tencent.qgame.animplayer.AnimConfig;
import com.tencent.qgame.animplayer.AnimPlayer;
import com.tencent.qgame.animplayer.plugin.IAnimPlugin;
import com.tencent.qgame.animplayer.util.ALog;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import to.k;

/* JADX INFO: loaded from: classes2.dex */
public final class MaskAnimPlugin implements IAnimPlugin {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AnimPlayer.MaskAnimPlugin";
    private AnimConfig animConfig;
    private MaskRender maskRender;

    @k
    private final AnimPlayer player;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(v vVar) {
            this();
        }
    }

    public MaskAnimPlugin(@k AnimPlayer player) {
        g0.q(player, "player");
        this.player = player;
    }

    private final void destroy() {
        MaskConfig maskConfig;
        AnimConfig animConfig = this.animConfig;
        if (animConfig == null || (maskConfig = animConfig.getMaskConfig()) == null) {
            return;
        }
        maskConfig.release();
    }

    @k
    public final AnimPlayer getPlayer() {
        return this.player;
    }

    @Override // com.tencent.qgame.animplayer.plugin.IAnimPlugin
    public int onConfigCreate(@k AnimConfig config) {
        g0.q(config, "config");
        return 0;
    }

    @Override // com.tencent.qgame.animplayer.plugin.IAnimPlugin
    public void onDecoding(int i10) {
        IAnimPlugin.DefaultImpls.onDecoding(this, i10);
    }

    @Override // com.tencent.qgame.animplayer.plugin.IAnimPlugin
    public void onDestroy() {
        destroy();
    }

    @Override // com.tencent.qgame.animplayer.plugin.IAnimPlugin
    public boolean onDispatchTouchEvent(@k MotionEvent ev) {
        g0.q(ev, "ev");
        return IAnimPlugin.DefaultImpls.onDispatchTouchEvent(this, ev);
    }

    @Override // com.tencent.qgame.animplayer.plugin.IAnimPlugin
    public void onRelease() {
        destroy();
    }

    @Override // com.tencent.qgame.animplayer.plugin.IAnimPlugin
    public void onRenderCreate() {
        ALog.INSTANCE.i(TAG, "mask render init");
        if (this.player.getSupportMaskBoolean()) {
            MaskRender maskRender = new MaskRender(this);
            this.maskRender = maskRender;
            maskRender.initMaskShader(this.player.getMaskEdgeBlurBoolean());
        }
    }

    @Override // com.tencent.qgame.animplayer.plugin.IAnimPlugin
    public void onRendering(int i10) {
        MaskRender maskRender;
        if (this.player.getSupportMaskBoolean() && f.a(this.player.getConfigManager().getConfig())) {
            AnimConfig config = this.player.getConfigManager().getConfig();
            this.animConfig = config;
            if (config == null || (maskRender = this.maskRender) == null) {
                return;
            }
            maskRender.renderFrame(config);
        }
    }
}
