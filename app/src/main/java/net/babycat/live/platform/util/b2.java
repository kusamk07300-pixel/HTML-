package net.babycat.live.platform.util;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;

/* JADX INFO: loaded from: classes3.dex */
public class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f36643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SoundPool f36644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36645c;

    public class a implements SoundPool.OnLoadCompleteListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f36646a;

        public a(boolean z10) {
            this.f36646a = z10;
        }

        @Override // android.media.SoundPool.OnLoadCompleteListener
        public void onLoadComplete(SoundPool soundPool, int i10, int i11) {
            b2 b2Var = b2.this;
            b2Var.d(b2Var.f36645c, 0, this.f36646a);
        }
    }

    public b2(Context context) {
        this.f36643a = context;
        if (this.f36644b == null) {
            this.f36644b = new SoundPool.Builder().setMaxStreams(10).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).build();
        }
    }

    public int b(int i10) {
        return this.f36644b.load(this.f36643a, i10, 1);
    }

    public void c() {
        this.f36644b.pause(this.f36645c);
    }

    public void d(int i10, int i11, boolean z10) {
        this.f36644b.play(i10, 1.0f, 1.0f, i11, z10 ? -1 : 0, 1.0f);
    }

    public void e(int i10, boolean z10) {
        this.f36645c = b(i10);
        this.f36644b.setOnLoadCompleteListener(new a(z10));
    }

    public void f() {
        this.f36644b.resume(this.f36645c);
    }

    public void g() {
        h(this.f36645c);
    }

    public void h(int i10) {
        this.f36644b.stop(i10);
        this.f36644b.release();
    }
}
