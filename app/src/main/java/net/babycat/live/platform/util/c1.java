package net.babycat.live.platform.util;

import com.google.gson.Gson;
import java.io.File;
import java.util.Map;
import java.util.TreeMap;
import net.babycat.live.app.MyApplication;
import net.babycat.live.platform.util.o0;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public class c1 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f36650a;

    public class a extends oh.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o0.a f36651a;

        public a(o0.a aVar) {
            this.f36651a = aVar;
        }

        @Override // oh.b
        public void d(Call call, Exception exc, int i10) {
            this.f36651a.onError(exc);
        }

        @Override // oh.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void e(String str, int i10) {
            this.f36651a.a(str);
        }
    }

    public class b extends oh.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o0.a f36653a;

        public b(o0.a aVar) {
            this.f36653a = aVar;
        }

        @Override // oh.b
        public void d(Call call, Exception exc, int i10) {
            this.f36653a.onError(exc);
        }

        @Override // oh.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void e(String str, int i10) {
            this.f36653a.a(str);
        }
    }

    public class c extends oh.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o0.a f36655a;

        public c(o0.a aVar) {
            this.f36655a = aVar;
        }

        @Override // oh.b
        public void d(Call call, Exception exc, int i10) {
            this.f36655a.onError(exc);
            wo.b.b("okhttp:" + exc.getMessage(), new Object[0]);
        }

        @Override // oh.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void e(String str, int i10) {
            wo.b.b("okhttp:" + str, new Object[0]);
            this.f36655a.a(str);
        }
    }

    public class d extends oh.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o0.b f36657c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, o0.b bVar) {
            super(str, str2);
            this.f36657c = bVar;
        }

        @Override // oh.b
        public void a(float f10, long j10, int i10) {
            this.f36657c.onProgress(f10, j10);
        }

        @Override // oh.b
        public void c(Request request, int i10) {
            super.c(request, i10);
            this.f36657c.onStart();
        }

        @Override // oh.b
        public void d(Call call, Exception exc, int i10) {
            this.f36657c.onError(exc);
        }

        @Override // oh.b
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(File file, int i10) {
            this.f36657c.a(file);
        }
    }

    public c1() {
        this(false);
    }

    @Override // net.babycat.live.platform.util.o0
    public void a(@f.n0 String str, @f.n0 Map<String, Object> map, @f.n0 o0.a aVar) {
        th.h hVarD;
        if (this.f36650a) {
            hVarD = mh.b.m().h(str).i(new Gson().toJson(map)).j(MediaType.parse("application/json; charset=utf-8")).d();
        } else {
            hVarD = mh.b.k().c("Client-Type", "android").c("versionCode", String.valueOf(t.e0())).c("think-lang", new x1(MyApplication.j()).l("language_select_sys") != null ? new x1(MyApplication.j()).l("language_select_sys") : "en-us").c("Authorization", new x1(MyApplication.j()).l("token") != null ? new x1(MyApplication.j()).l("token") : "").h(str).b(f(map)).d();
        }
        hVarD.e(new b(aVar));
    }

    @Override // net.babycat.live.platform.util.o0
    public void b(@f.n0 String str, @f.n0 String str2, @f.n0 String str3, @f.n0 o0.b bVar) {
        mh.b.d().h(str).d().e(new d(str2, str3, bVar));
    }

    @Override // net.babycat.live.platform.util.o0
    public void c(@f.n0 String str, @f.n0 Map<String, Object> map, @f.n0 o0.a aVar) {
        mh.b.d().h(str).b(f(map)).d().e(new a(aVar));
    }

    @Override // net.babycat.live.platform.util.o0
    public void d(@f.n0 String str) {
        mh.b.f().a(str);
    }

    public void e(@f.n0 String str, @f.n0 Map<String, Object> map, @f.n0 o0.a aVar) {
        th.h hVarD;
        if (this.f36650a) {
            hVarD = mh.b.m().h(str).i(new Gson().toJson(map)).j(MediaType.parse("application/json; charset=utf-8")).d();
        } else {
            hVarD = mh.b.k().c("Client-Type", "android").c("versionCode", String.valueOf(t.e0())).c("think-lang", new x1(MyApplication.j()).l("language_select_sys") != null ? new x1(MyApplication.j()).l("language_select_sys") : "en-us").c("Authorization", new x1(MyApplication.j()).l("token") != null ? new x1(MyApplication.j()).l("token") : "").h(str).b(f(map)).d();
        }
        hVarD.e(new c(aVar));
    }

    public final Map<String, String> f(Map<String, Object> map) {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            treeMap.put(entry.getKey(), entry.getValue().toString());
        }
        return treeMap;
    }

    public c1(boolean z10) {
        this.f36650a = z10;
        mh.b.i(new OkHttpClient.Builder().addInterceptor(new ok.d()).build());
    }
}
