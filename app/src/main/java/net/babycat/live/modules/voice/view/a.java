package net.babycat.live.modules.voice.view;

import android.animation.ValueAnimator;
import android.graphics.Canvas;

/* JADX INFO: loaded from: classes4.dex */
public interface a {

    /* JADX INFO: renamed from: net.babycat.live.modules.voice.view.a$a, reason: collision with other inner class name */
    public interface InterfaceC0447a {
        void a(boolean z10);
    }

    void a(Canvas canvas);

    void b();

    void c(Canvas canvas);

    void d(Canvas canvas);

    ValueAnimator getAnimator();

    void setOnAnimationListener(InterfaceC0447a interfaceC0447a);

    void setRingDegree(float f10);
}
