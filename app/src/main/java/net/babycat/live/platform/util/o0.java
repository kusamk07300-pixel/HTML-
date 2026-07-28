package net.babycat.live.platform.util;

import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface o0 {

    public interface a {
        void a(String str);

        void onError(Throwable th2);
    }

    public interface b {
        void a(File file);

        void onError(Throwable th2);

        void onProgress(float f10, long j10);

        void onStart();
    }

    void a(@f.n0 String str, @f.n0 Map<String, Object> map, @f.n0 a aVar);

    void b(@f.n0 String str, @f.n0 String str2, @f.n0 String str3, @f.n0 b bVar);

    void c(@f.n0 String str, @f.n0 Map<String, Object> map, @f.n0 a aVar);

    void d(@f.n0 String str);
}
