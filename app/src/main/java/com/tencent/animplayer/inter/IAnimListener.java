package com.tencent.qgame.animplayer.inter;

import com.tencent.qgame.animplayer.AnimConfig;
import kotlin.jvm.internal.g0;
import to.k;
import to.l;

/* JADX INFO: loaded from: classes2.dex */
public interface IAnimListener {

    public static final class DefaultImpls {
        public static boolean onVideoConfigReady(IAnimListener iAnimListener, @k AnimConfig config) {
            g0.q(config, "config");
            return true;
        }
    }

    void onFailed(int i10, @l String str);

    void onVideoComplete();

    boolean onVideoConfigReady(@k AnimConfig animConfig);

    void onVideoDestroy();

    void onVideoRender(int i10, @l AnimConfig animConfig);

    void onVideoStart();
}
