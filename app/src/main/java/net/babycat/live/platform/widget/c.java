package net.babycat.live.platform.widget;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes3.dex */
public class c implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AtomicReference<String> f37110a = new AtomicReference<>();

    public static String a() {
        return f37110a.get();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        f37110a.set(request.url().toString());
        return chain.proceed(request);
    }
}
