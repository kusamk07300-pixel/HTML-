package com.tencent.qgame.animplayer.plugin;

import android.view.MotionEvent;
import com.tencent.qgame.animplayer.AnimConfig;
import kotlin.jvm.internal.g0;
import to.k;

/* JADX INFO: loaded from: classes2.dex */
public interface IAnimPlugin {

    public static final class DefaultImpls {
        public static int onConfigCreate(IAnimPlugin iAnimPlugin, @k AnimConfig config) {
            g0.q(config, "config");
            return 0;
        }

        public static void onDecoding(IAnimPlugin iAnimPlugin, int i10) {
        }

        public static void onDestroy(IAnimPlugin iAnimPlugin) {
        }

        public static boolean onDispatchTouchEvent(IAnimPlugin iAnimPlugin, @k MotionEvent ev) {
            g0.q(ev, "ev");
            return false;
        }

        public static void onRelease(IAnimPlugin iAnimPlugin) {
        }

        public static void onRenderCreate(IAnimPlugin iAnimPlugin) {
        }

        public static void onRendering(IAnimPlugin iAnimPlugin, int i10) {
        }
    }

    int onConfigCreate(@k AnimConfig animConfig);

    void onDecoding(int i10);

    void onDestroy();

    boolean onDispatchTouchEvent(@k MotionEvent motionEvent);

    void onRelease();

    void onRenderCreate();

    void onRendering(int i10);
}
