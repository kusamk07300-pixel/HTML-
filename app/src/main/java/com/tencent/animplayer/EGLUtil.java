package com.tencent.qgame.animplayer;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.tencent.qgame.animplayer.util.ALog;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import kotlin.TypeCastException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import to.k;

/* JADX INFO: loaded from: classes2.dex */
public final class EGLUtil {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AnimPlayer.EGLUtil";
    private EGL10 egl;
    private EGLConfig eglConfig;
    private Surface surface;
    private EGLDisplay eglDisplay = EGL10.EGL_NO_DISPLAY;
    private EGLSurface eglSurface = EGL10.EGL_NO_SURFACE;
    private EGLContext eglContext = EGL10.EGL_NO_CONTEXT;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(v vVar) {
            this();
        }
    }

    private final EGLConfig chooseConfig() {
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] attributes = getAttributes();
        EGL10 egl10 = this.egl;
        if (egl10 == null || !egl10.eglChooseConfig(this.eglDisplay, attributes, eGLConfigArr, 1, iArr)) {
            return null;
        }
        return eGLConfigArr[0];
    }

    private final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        int[] iArr = {12440, 2, 12344};
        if (egl10 != null) {
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, iArr);
        }
        return null;
    }

    private final int[] getAttributes() {
        return new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    }

    public final void release() {
        EGL10 egl10 = this.egl;
        if (egl10 != null) {
            EGLDisplay eGLDisplay = this.eglDisplay;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            egl10.eglDestroySurface(this.eglDisplay, this.eglSurface);
            egl10.eglDestroyContext(this.eglDisplay, this.eglContext);
            egl10.eglTerminate(this.eglDisplay);
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
            }
            this.surface = null;
        }
    }

    public final void start(@k SurfaceTexture surfaceTexture) {
        g0.q(surfaceTexture, "surfaceTexture");
        try {
            EGL egl = EGLContext.getEGL();
            if (egl == null) {
                throw new TypeCastException("null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
            }
            EGL10 egl10 = (EGL10) egl;
            this.egl = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.eglDisplay = eGLDisplayEglGetDisplay;
            int[] iArr = new int[2];
            EGL10 egl102 = this.egl;
            if (egl102 != null) {
                egl102.eglInitialize(eGLDisplayEglGetDisplay, iArr);
            }
            this.eglConfig = chooseConfig();
            Surface surface = new Surface(surfaceTexture);
            this.surface = surface;
            EGL10 egl103 = this.egl;
            this.eglSurface = egl103 != null ? egl103.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, surface, null) : null;
            this.eglContext = createContext(this.egl, this.eglDisplay, this.eglConfig);
            EGLSurface eGLSurface = this.eglSurface;
            if (eGLSurface != null && !g0.g(eGLSurface, EGL10.EGL_NO_SURFACE)) {
                EGL10 egl104 = this.egl;
                if (egl104 != null) {
                    EGLDisplay eGLDisplay = this.eglDisplay;
                    EGLSurface eGLSurface2 = this.eglSurface;
                    if (egl104.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, this.eglContext)) {
                        return;
                    }
                    ALog aLog = ALog.INSTANCE;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("make current error:");
                    EGL10 egl105 = this.egl;
                    sb2.append(Integer.toHexString(egl105 != null ? egl105.eglGetError() : 0));
                    aLog.e(TAG, sb2.toString());
                    return;
                }
                return;
            }
            ALog aLog2 = ALog.INSTANCE;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("error:");
            EGL10 egl106 = this.egl;
            sb3.append(Integer.toHexString(egl106 != null ? egl106.eglGetError() : 0));
            aLog2.e(TAG, sb3.toString());
        } catch (Throwable th2) {
            ALog.INSTANCE.e(TAG, "error:" + th2, th2);
        }
    }

    public final void swapBuffers() {
        EGLSurface eGLSurface;
        EGL10 egl10;
        EGLDisplay eGLDisplay = this.eglDisplay;
        if (eGLDisplay == null || (eGLSurface = this.eglSurface) == null || (egl10 = this.egl) == null) {
            return;
        }
        egl10.eglSwapBuffers(eGLDisplay, eGLSurface);
    }
}
