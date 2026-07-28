package net.babycat.live.platform.util;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f36659a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Integer, Integer> f36661c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SoundPool f36660b = new SoundPool.Builder().setMaxStreams(10).setAudioAttributes(new AudioAttributes.Builder().setUsage(5).setContentType(4).build()).build();

    public class a implements SoundPool.OnLoadCompleteListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f36662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f36663b;

        public a(int i10, boolean z10) {
            this.f36662a = i10;
            this.f36663b = z10;
        }

        @Override // android.media.SoundPool.OnLoadCompleteListener
        public void onLoadComplete(SoundPool soundPool, int i10, int i11) {
            int i12;
            if (i11 == 0 && i10 == (i12 = this.f36662a)) {
                d.this.b(i12, 0, this.f36663b);
            }
        }
    }

    public d(Context context) {
        this.f36659a = context.getApplicationContext();
    }

    public int a(@f.u0 int i10) {
        if (this.f36661c.containsKey(Integer.valueOf(i10))) {
            return this.f36661c.get(Integer.valueOf(i10)).intValue();
        }
        int iLoad = this.f36660b.load(this.f36659a, i10, 1);
        this.f36661c.put(Integer.valueOf(i10), Integer.valueOf(iLoad));
        return iLoad;
    }

    public void b(int i10, int i11, boolean z10) {
        if (i10 > 0) {
            this.f36660b.play(i10, 1.0f, 1.0f, i11, z10 ? -1 : 0, 1.0f);
        }
    }

    public void c(@f.u0 int i10, boolean z10) {
        this.f36660b.setOnLoadCompleteListener(new a(a(i10), z10));
    }

    public void d() {
        try {
            this.f36660b.release();
        } catch (Exception unused) {
        }
    }

    public void e(int i10) {
        if (i10 > 0) {
            this.f36660b.stop(i10);
        }
    }

    public void f() {
        this.f36660b.autoPause();
        this.f36660b.autoResume();
    }
}
