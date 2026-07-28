package net.babycat.live.platform.util;

/* JADX INFO: loaded from: classes3.dex */
public class p1 extends ze.c {
    @Override // ze.c
    public void a() {
        this.targetView.animate().rotation(720.0f).scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setInterpolator(new y1.b()).setDuration(c()).start();
    }

    @Override // ze.c
    public void b() {
        this.targetView.animate().rotation(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setInterpolator(new y1.b()).setDuration(c()).start();
    }

    @Override // ze.c
    public void d() {
        this.targetView.setScaleX(0.0f);
        this.targetView.setScaleY(0.0f);
        this.targetView.setAlpha(0.0f);
        this.targetView.setRotation(360.0f);
    }
}
