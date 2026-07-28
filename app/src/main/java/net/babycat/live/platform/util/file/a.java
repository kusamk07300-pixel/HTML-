package net.babycat.live.platform.util.file;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Handler;
import android.os.Looper;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.Inflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.a1;
import kotlin.j2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.o;
import kotlin.text.l0;
import net.babycat.live.model.EvaVideoEntity;
import net.babycat.live.platform.util.file.EvaCache;
import net.babycat.live.platform.util.file.a;
import sn.n;
import to.k;
import to.l;

/* JADX INFO: loaded from: classes3.dex */
@u0({"SMAP\nEvaDownloader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EvaDownloader.kt\nnet/babycat/live/platform/util/file/EvaDownloader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,551:1\n1#2:552\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @k
    public static final String f36756e = "EvaDownloader";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public Context f36760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile int f36761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f36762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @k
    public b f36763d;

    @k
    public static final C0449a Companion = new C0449a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @k
    public static final AtomicInteger f36757f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @k
    public static a f36758g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static ExecutorService f36759h = Executors.newCachedThreadPool(new ThreadFactory() { // from class: sn.f
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return net.babycat.live.platform.util.file.a.U(runnable);
        }
    });

    /* JADX INFO: renamed from: net.babycat.live.platform.util.file.a$a, reason: collision with other inner class name */
    public static final class C0449a {
        public /* synthetic */ C0449a(v vVar) {
            this();
        }

        public final ExecutorService a() {
            return a.f36759h;
        }

        public final void b(@k ThreadPoolExecutor executor) {
            g0.p(executor, "executor");
            c(executor);
        }

        public final void c(ExecutorService executorService) {
            a.f36759h = executorService;
        }

        @k
        public final a d() {
            return a.f36758g;
        }

        public C0449a() {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f36764a;

        public static final j2 e(Ref.BooleanRef booleanRef) {
            booleanRef.element = true;
            return j2.INSTANCE;
        }

        public static final void f(URL url, nj.l lVar, Ref.BooleanRef booleanRef, nj.l lVar2) {
            try {
                com.yy.yyeva.util.a.INSTANCE.e(a.f36756e, "================ eva file download start ================");
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                HttpURLConnection httpURLConnection = uRLConnectionOpenConnection instanceof HttpURLConnection ? (HttpURLConnection) uRLConnectionOpenConnection : null;
                if (httpURLConnection == null) {
                    return;
                }
                httpURLConnection.setConnectTimeout(20000);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setRequestProperty("Connection", "close");
                httpURLConnection.connect();
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            if (booleanRef.element) {
                                com.yy.yyeva.util.a.INSTANCE.e(a.f36756e, "================ eva file download canceled ================");
                                break;
                            }
                            int i10 = inputStream.read(bArr, 0, 4096);
                            if (i10 == -1) {
                                break;
                            } else {
                                byteArrayOutputStream.write(bArr, 0, i10);
                            }
                        }
                        if (booleanRef.element) {
                            com.yy.yyeva.util.a.INSTANCE.e(a.f36756e, "================ eva file download canceled ================");
                            kotlin.io.b.a(byteArrayOutputStream, null);
                            kotlin.io.b.a(inputStream, null);
                            return;
                        }
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                        try {
                            com.yy.yyeva.util.a.INSTANCE.e(a.f36756e, "================ eva file download complete ================");
                            lVar2.invoke(byteArrayInputStream);
                            j2 j2Var = j2.INSTANCE;
                            kotlin.io.b.a(byteArrayInputStream, null);
                            kotlin.io.b.a(byteArrayOutputStream, null);
                            kotlin.io.b.a(inputStream, null);
                            return;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (Exception e10) {
                com.yy.yyeva.util.a aVar = com.yy.yyeva.util.a.INSTANCE;
                aVar.b(a.f36756e, "================ eva file download fail ================");
                aVar.b(a.f36756e, "error: " + e10.getMessage());
                e10.printStackTrace();
                lVar.invoke(e10);
            }
        }

        public final boolean c() {
            return this.f36764a;
        }

        @k
        public nj.a<j2> d(@k final URL url, @k final nj.l<? super InputStream, j2> complete, @k final nj.l<? super Exception, j2> failure) {
            g0.p(url, "url");
            g0.p(complete, "complete");
            g0.p(failure, "failure");
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            nj.a<j2> aVar = new nj.a() { // from class: sn.l
                @Override // nj.a
                public final Object invoke() {
                    return a.b.e(booleanRef);
                }
            };
            a.Companion.a().execute(new Runnable() { // from class: sn.m
                @Override // java.lang.Runnable
                public final void run() {
                    a.b.f(url, failure, booleanRef, complete);
                }
            });
            return aVar;
        }

        public final void g(boolean z10) {
            this.f36764a = z10;
        }
    }

    public interface c {
        void a();

        void b(@k EvaVideoEntity evaVideoEntity);
    }

    public interface d {
        void a(@k List<? extends File> list);
    }

    public a(@l Context context) {
        this.f36760a = context != null ? context.getApplicationContext() : null;
        EvaCache.INSTANCE.o(context, EvaCache.Type.FILE);
        this.f36763d = new b();
    }

    public static final void A(a aVar, String str, c cVar, String str2, d dVar) {
        if (EvaCache.INSTANCE.l()) {
            aVar.q(str, cVar, str2);
        } else {
            aVar.r(str, cVar, dVar, str2);
        }
    }

    public static final j2 B(a aVar, String str, c cVar, d dVar, String str2, InputStream it) {
        g0.p(it, "it");
        aVar.u(it, str, cVar, false, dVar, str2);
        return j2.INSTANCE;
    }

    public static final j2 C(URL url, a aVar, c cVar, String str, Exception it) {
        g0.p(it, "it");
        com.yy.yyeva.util.a.INSTANCE.b(f36756e, "================ EVA file: " + url + " download fail ================");
        aVar.J(it, cVar, str);
        return j2.INSTANCE;
    }

    public static final void I(String str, c cVar, EvaVideoEntity evaVideoEntity) {
        com.yy.yyeva.util.a.INSTANCE.e(f36756e, "================ " + str + " parser complete ================");
        if (cVar != null) {
            cVar.b(evaVideoEntity);
        }
    }

    public static final void K(c cVar) {
        if (cVar != null) {
            cVar.a();
        }
    }

    public static /* synthetic */ void P(a aVar, InputStream inputStream, String str, c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        aVar.M(inputStream, str, cVar, z10);
    }

    public static final Thread U(Runnable runnable) {
        return new Thread(runnable, "EvaDownloader-Thread-" + f36757f.getAndIncrement());
    }

    public static /* synthetic */ void o(a aVar, String str, c cVar, d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            dVar = null;
        }
        aVar.n(str, cVar, dVar);
    }

    public static final void p(a aVar, String str, c cVar, d dVar) {
        a aVar2;
        String str2;
        c cVar2;
        AssetManager assets;
        InputStream inputStreamOpen;
        try {
            Context context = aVar.f36760a;
            if (context == null || (assets = context.getAssets()) == null || (inputStreamOpen = assets.open(str)) == null) {
                return;
            }
            aVar2 = aVar;
            str2 = str;
            cVar2 = cVar;
            try {
                aVar2.u(inputStreamOpen, EvaCache.INSTANCE.d("file:///assets/" + str), cVar2, true, dVar, str2);
                return;
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            aVar2 = aVar;
            str2 = str;
            cVar2 = cVar;
        }
        aVar2.J(e, cVar2, str2);
    }

    public static /* synthetic */ void s(a aVar, String str, c cVar, d dVar, String str2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        aVar.r(str, cVar, dVar, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c A[Catch: all -> 0x003d, TryCatch #2 {all -> 0x003d, blocks: (B:4:0x002a, B:6:0x0031, B:8:0x0037, B:17:0x0066, B:11:0x003f, B:13:0x0053, B:16:0x005c), top: B:37:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void t(java.lang.String r9, java.lang.String r10, net.babycat.live.platform.util.file.a r11, net.babycat.live.platform.util.file.a.c r12) {
        /*
            java.lang.String r0 = " from eva cachel file to entity end ================"
            java.lang.String r1 = "================ decode "
            java.lang.String r2 = "EvaDownloader"
            com.yy.yyeva.util.a r3 = com.yy.yyeva.util.a.INSTANCE     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r4.<init>()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r4.append(r1)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r4.append(r9)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            java.lang.String r5 = " from eva cachel file to entity ================"
            r4.append(r5)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r3.e(r2, r4)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            net.babycat.live.platform.util.file.EvaCache r5 = net.babycat.live.platform.util.file.EvaCache.INSTANCE     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            java.io.File r6 = r5.f(r10)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            byte[] r6 = r11.Q(r4)     // Catch: java.lang.Throwable -> L3d
            r7 = 0
            if (r6 == 0) goto L5c
            boolean r6 = r11.L(r6)     // Catch: java.lang.Throwable -> L3d
            if (r6 == 0) goto L3f
            r11.q(r10, r12, r9)     // Catch: java.lang.Throwable -> L3d
            kotlin.j2 r10 = kotlin.j2.INSTANCE     // Catch: java.lang.Throwable -> L3d
            goto L5a
        L3d:
            r10 = move-exception
            goto L85
        L3f:
            java.lang.String r6 = "file start"
            r3.e(r2, r6)     // Catch: java.lang.Throwable -> L3d
            net.babycat.live.model.EvaVideoEntity r6 = new net.babycat.live.model.EvaVideoEntity     // Catch: java.lang.Throwable -> L3d
            java.io.File r10 = r5.f(r10)     // Catch: java.lang.Throwable -> L3d
            int r5 = r11.f36761b     // Catch: java.lang.Throwable -> L3d
            int r8 = r11.f36762c     // Catch: java.lang.Throwable -> L3d
            r6.<init>(r10, r5, r8)     // Catch: java.lang.Throwable -> L3d
            if (r12 == 0) goto L59
            r12.b(r6)     // Catch: java.lang.Throwable -> L3d
            kotlin.j2 r10 = kotlin.j2.INSTANCE     // Catch: java.lang.Throwable -> L3d
            goto L5a
        L59:
            r10 = r7
        L5a:
            if (r10 != 0) goto L66
        L5c:
            java.lang.Exception r10 = new java.lang.Exception     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = "readAsBytes(inputStream) cause exception"
            r10.<init>(r5)     // Catch: java.lang.Throwable -> L3d
            r11.J(r10, r12, r9)     // Catch: java.lang.Throwable -> L3d
        L66:
            kotlin.j2 r10 = kotlin.j2.INSTANCE     // Catch: java.lang.Throwable -> L3d
            kotlin.io.b.a(r4, r7)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            r10.append(r9)
            r10.append(r0)
            java.lang.String r9 = r10.toString()
            r3.e(r2, r9)
            return
        L81:
            r10 = move-exception
            goto La6
        L83:
            r10 = move-exception
            goto L8b
        L85:
            throw r10     // Catch: java.lang.Throwable -> L86
        L86:
            r3 = move-exception
            kotlin.io.b.a(r4, r10)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
            throw r3     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
        L8b:
            r11.J(r10, r12, r9)     // Catch: java.lang.Throwable -> L81
            com.yy.yyeva.util.a r10 = com.yy.yyeva.util.a.INSTANCE
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r11.append(r9)
            r11.append(r0)
            java.lang.String r9 = r11.toString()
            r10.e(r2, r9)
            return
        La6:
            com.yy.yyeva.util.a r11 = com.yy.yyeva.util.a.INSTANCE
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r1)
            r12.append(r9)
            r12.append(r0)
            java.lang.String r9 = r12.toString()
            r11.e(r2, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: net.babycat.live.platform.util.file.a.t(java.lang.String, java.lang.String, net.babycat.live.platform.util.file.a, net.babycat.live.platform.util.file.a$c):void");
    }

    public static /* synthetic */ void v(a aVar, InputStream inputStream, String str, c cVar, boolean z10, d dVar, String str2, int i10, Object obj) {
        aVar.u(inputStream, str, cVar, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : dVar, (i10 & 32) != 0 ? null : str2);
    }

    public static final void w(final a aVar, InputStream inputStream, final c cVar, String str, boolean z10, final String str2) throws IOException {
        try {
            try {
                final byte[] bArrQ = aVar.Q(inputStream);
                if (bArrQ == null) {
                    aVar.J(new Exception("readAsBytes(inputStream) cause exception"), cVar, str);
                } else if (aVar.L(bArrQ)) {
                    com.yy.yyeva.util.a aVar2 = com.yy.yyeva.util.a.INSTANCE;
                    aVar2.e(f36756e, "decode from zip file");
                    EvaCache evaCache = EvaCache.INSTANCE;
                    if (!evaCache.c(str2).exists() || n.f41088b) {
                        synchronized (n.f41087a) {
                            if (!evaCache.c(str2).exists()) {
                                n.f41088b = true;
                                aVar2.e(f36756e, "no cached, prepare to unzip");
                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrQ);
                                try {
                                    aVar.V(byteArrayInputStream, str2);
                                    n.f41088b = false;
                                    aVar2.e(f36756e, "unzip success");
                                    j2 j2Var = j2.INSTANCE;
                                    kotlin.io.b.a(byteArrayInputStream, null);
                                } finally {
                                }
                            }
                            j2 j2Var2 = j2.INSTANCE;
                        }
                    }
                    aVar.q(str2, cVar, str);
                } else if (!EvaCache.INSTANCE.l()) {
                    f36759h.execute(new Runnable() { // from class: sn.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            net.babycat.live.platform.util.file.a.x(str2, bArrQ, aVar, cVar);
                        }
                    });
                }
                if (z10) {
                    inputStream.close();
                }
                com.yy.yyeva.util.a.INSTANCE.e(f36756e, "================ decode " + str + " from input stream end ================");
            } catch (Exception e10) {
                aVar.J(e10, cVar, str);
                if (z10) {
                    inputStream.close();
                }
                com.yy.yyeva.util.a.INSTANCE.e(f36756e, "================ decode " + str + " from input stream end ================");
            }
        } catch (Throwable th2) {
            if (z10) {
                inputStream.close();
            }
            com.yy.yyeva.util.a.INSTANCE.e(f36756e, "================ decode " + str + " from input stream end ================");
            throw th2;
        }
    }

    public static final void x(String str, byte[] bArr, a aVar, c cVar) {
        EvaCache evaCache = EvaCache.INSTANCE;
        File fileF = evaCache.f(str);
        try {
            File file = !fileF.exists() ? fileF : null;
            if (file != null) {
                file.createNewFile();
            }
            new FileOutputStream(fileF).write(bArr);
            EvaVideoEntity evaVideoEntity = new EvaVideoEntity(evaCache.f(str), aVar.f36761b, aVar.f36762c);
            if (cVar != null) {
                cVar.b(evaVideoEntity);
            }
        } catch (Exception e10) {
            com.yy.yyeva.util.a.INSTANCE.c(f36756e, "create cache file fail.", e10);
            fileF.delete();
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    public static /* synthetic */ nj.a z(a aVar, URL url, c cVar, d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            dVar = null;
        }
        return aVar.y(url, cVar, dVar);
    }

    public final void D(File file, String str) throws IOException {
        String canonicalPath = new File(str).getCanonicalPath();
        String canonicalPath2 = file.getCanonicalPath();
        g0.m(canonicalPath2);
        g0.m(canonicalPath);
        if (kotlin.text.g0.J2(canonicalPath2, canonicalPath, false, 2, null)) {
            return;
        }
        throw new IOException("Found Zip Path Traversal Vulnerability with " + canonicalPath);
    }

    @k
    public final b E() {
        return this.f36763d;
    }

    public final byte[] F(byte[] bArr) {
        Inflater inflater = new Inflater();
        inflater.setInput(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[2048];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int iInflate = inflater.inflate(bArr2, 0, 2048);
                if (iInflate <= 0) {
                    inflater.end();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    kotlin.io.b.a(byteArrayOutputStream, null);
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr2, 0, iInflate);
            } finally {
            }
        }
    }

    public final void G(@k Context context) {
        g0.p(context, "context");
        Context applicationContext = context.getApplicationContext();
        this.f36760a = applicationContext;
        EvaCache.INSTANCE.n(applicationContext);
    }

    public final void H(final EvaVideoEntity evaVideoEntity, final c cVar, final String str) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: sn.c
            @Override // java.lang.Runnable
            public final void run() {
                net.babycat.live.platform.util.file.a.I(str, cVar, evaVideoEntity);
            }
        });
    }

    public final void J(Exception exc, final c cVar, String str) {
        exc.printStackTrace();
        com.yy.yyeva.util.a aVar = com.yy.yyeva.util.a.INSTANCE;
        aVar.b(f36756e, "================ " + str + " parser error ================");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" parse error");
        aVar.c(f36756e, sb2.toString(), exc);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: sn.d
            @Override // java.lang.Runnable
            public final void run() {
                net.babycat.live.platform.util.file.a.K(cVar);
            }
        });
    }

    public final boolean L(byte[] bArr) {
        return bArr.length > 4 && bArr[0] == 80 && bArr[1] == 75 && bArr[2] == 3 && bArr[3] == 4;
    }

    @o(message = "This method has been deprecated from 2.4.0.", replaceWith = @a1(expression = "this.decodeFromInputStream(inputStream, cacheKey, callback, closeInputStream)", imports = {}))
    public final void M(@k InputStream inputStream, @k String cacheKey, @l c cVar, boolean z10) {
        g0.p(inputStream, "inputStream");
        g0.p(cacheKey, "cacheKey");
        v(this, inputStream, cacheKey, cVar, z10, null, null, 32, null);
    }

    @o(message = "This method has been deprecated from 2.4.0.", replaceWith = @a1(expression = "this.decodeFromAssets(assetsName, callback)", imports = {}))
    public final void N(@k String assetsName, @l c cVar) {
        g0.p(assetsName, "assetsName");
        n(assetsName, cVar, null);
    }

    @o(message = "This method has been deprecated from 2.4.0.", replaceWith = @a1(expression = "this.decodeFromURL(url, callback)", imports = {}))
    public final void O(@k URL url, @l c cVar) {
        g0.p(url, "url");
        y(url, cVar, null);
    }

    public final byte[] Q(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int i10 = inputStream.read(bArr, 0, 2048);
                if (i10 <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    kotlin.io.b.a(byteArrayOutputStream, null);
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } finally {
        }
    }

    public final void R(@k b bVar) {
        g0.p(bVar, "<set-?>");
        this.f36763d = bVar;
    }

    public final void S(int i10, int i11) {
        this.f36761b = i10;
        this.f36762c = i11;
    }

    public final void T() {
    }

    public final void V(InputStream inputStream, String str) throws Exception {
        ZipInputStream zipInputStream;
        com.yy.yyeva.util.a.INSTANCE.e(f36756e, "================ unzip prepare ================");
        File fileC = EvaCache.INSTANCE.c(str);
        fileC.mkdirs();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                zipInputStream = new ZipInputStream(bufferedInputStream);
            } finally {
            }
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        j2 j2Var = j2.INSTANCE;
                        kotlin.io.b.a(zipInputStream, null);
                        kotlin.io.b.a(bufferedInputStream, null);
                        return;
                    }
                    String name = nextEntry.getName();
                    g0.o(name, "getName(...)");
                    if (!l0.n3(name, "../", false, 2, null)) {
                        String name2 = nextEntry.getName();
                        g0.o(name2, "getName(...)");
                        if (!l0.n3(name2, "/", false, 2, null)) {
                            File file = new File(fileC, nextEntry.getName());
                            String absolutePath = fileC.getAbsolutePath();
                            g0.o(absolutePath, "getAbsolutePath(...)");
                            D(file, absolutePath);
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[2048];
                                while (true) {
                                    int i10 = zipInputStream.read(bArr);
                                    if (i10 <= 0) {
                                        break;
                                    } else {
                                        fileOutputStream.write(bArr, 0, i10);
                                    }
                                }
                                j2 j2Var2 = j2.INSTANCE;
                                kotlin.io.b.a(fileOutputStream, null);
                                com.yy.yyeva.util.a.INSTANCE.b(f36756e, "================ unzip complete ================");
                                zipInputStream.closeEntry();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        } catch (Exception e10) {
            com.yy.yyeva.util.a aVar = com.yy.yyeva.util.a.INSTANCE;
            aVar.b(f36756e, "================ unzip error ================");
            aVar.c(f36756e, "error", e10);
            EvaCache evaCache = EvaCache.INSTANCE;
            String absolutePath2 = fileC.getAbsolutePath();
            g0.o(absolutePath2, "getAbsolutePath(...)");
            evaCache.i(absolutePath2);
            fileC.delete();
            throw e10;
        }
    }

    public final void n(@k final String name, @l final c cVar, @l final d dVar) {
        g0.p(name, "name");
        if (this.f36760a == null) {
            com.yy.yyeva.util.a.INSTANCE.b(f36756e, "在配置 EvaDownloader context 前, 无法解析 EVA 文件。");
            return;
        }
        com.yy.yyeva.util.a.INSTANCE.e(f36756e, "================ decode " + name + " from assets ================");
        f36759h.execute(new Runnable() { // from class: sn.g
            @Override // java.lang.Runnable
            public final void run() {
                net.babycat.live.platform.util.file.a.p(this.f41060a, name, cVar, dVar);
            }
        });
    }

    public final void q(String str, c cVar, String str2) {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        com.yy.yyeva.util.a aVar = com.yy.yyeva.util.a.INSTANCE;
        aVar.e(f36756e, "================ decode " + str2 + " from cache ================");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("decodeFromCacheKey called with cacheKey : ");
        sb2.append(str);
        aVar.a(f36756e, sb2.toString());
        if (this.f36760a == null) {
            aVar.b(f36756e, "在配置 EvaDownloader context 前, 无法解析 EVA 文件。");
            return;
        }
        try {
            File fileC = EvaCache.INSTANCE.c(str);
            File file = new File(fileC, "movie.binary");
            if (!file.isFile()) {
                file = null;
            }
            if (file != null) {
                try {
                    aVar.e(f36756e, "binary change to entity");
                    fileInputStream = new FileInputStream(file);
                    try {
                        aVar.e(f36756e, "binary change to entity success");
                        H(new EvaVideoEntity(fileC, this.f36761b, this.f36762c), cVar, str2);
                        j2 j2Var = j2.INSTANCE;
                        kotlin.io.b.a(fileInputStream, null);
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (Exception e10) {
                    com.yy.yyeva.util.a.INSTANCE.c(f36756e, "binary change to entity fail", e10);
                    fileC.delete();
                    file.delete();
                    throw e10;
                }
            }
            File file2 = new File(fileC, "movie.spec");
            if (!file2.isFile()) {
                file2 = null;
            }
            if (file2 == null) {
                return;
            }
            try {
                aVar.e(f36756e, "spec change to entity");
                fileInputStream = new FileInputStream(file2);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } finally {
                }
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int i10 = fileInputStream.read(bArr, 0, 2048);
                        if (i10 == -1) {
                            com.yy.yyeva.util.a.INSTANCE.e(f36756e, "spec change to entity success");
                            H(new EvaVideoEntity(fileC, this.f36761b, this.f36762c), cVar, str2);
                            j2 j2Var2 = j2.INSTANCE;
                            kotlin.io.b.a(byteArrayOutputStream, null);
                            kotlin.io.b.a(fileInputStream, null);
                            return;
                        }
                        byteArrayOutputStream.write(bArr, 0, i10);
                    }
                } finally {
                }
            } catch (Exception e11) {
                com.yy.yyeva.util.a.INSTANCE.c(f36756e, str2 + " movie.spec change to entity fail", e11);
                fileC.delete();
                file2.delete();
                throw e11;
            }
        } catch (Exception e12) {
            J(e12, cVar, str2);
        }
    }

    public final void r(@k final String cacheKey, @l final c cVar, @l d dVar, @l final String str) {
        g0.p(cacheKey, "cacheKey");
        f36759h.execute(new Runnable() { // from class: sn.k
            @Override // java.lang.Runnable
            public final void run() {
                net.babycat.live.platform.util.file.a.t(str, cacheKey, this, cVar);
            }
        });
    }

    public final void u(@k final InputStream inputStream, @k final String cacheKey, @l final c cVar, final boolean z10, @l d dVar, @l final String str) {
        g0.p(inputStream, "inputStream");
        g0.p(cacheKey, "cacheKey");
        if (this.f36760a == null) {
            com.yy.yyeva.util.a.INSTANCE.b(f36756e, "在配置 EvaDownloader context 前, 无法解析 EVA 文件。");
            return;
        }
        com.yy.yyeva.util.a.INSTANCE.e(f36756e, "================ decode " + str + " from input stream ================");
        f36759h.execute(new Runnable() { // from class: sn.b
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                net.babycat.live.platform.util.file.a.w(this.f41046a, inputStream, cVar, str, z10, cacheKey);
            }
        });
    }

    @l
    public final nj.a<j2> y(@k final URL url, @l final c cVar, @l final d dVar) {
        g0.p(url, "url");
        if (this.f36760a == null) {
            com.yy.yyeva.util.a.INSTANCE.b(f36756e, "在配置 EvaDownloader context 前, 无法解析 EVA 文件。");
            return null;
        }
        final String string = url.toString();
        g0.o(string, "toString(...)");
        com.yy.yyeva.util.a aVar = com.yy.yyeva.util.a.INSTANCE;
        aVar.e(f36756e, "================ decode from url: " + string + " ================");
        EvaCache evaCache = EvaCache.INSTANCE;
        final String strE = evaCache.e(url);
        if (!evaCache.k(strE)) {
            aVar.e(f36756e, "no cached, prepare to download");
            return this.f36763d.d(url, new nj.l() { // from class: sn.i
                @Override // nj.l
                public final Object invoke(Object obj) {
                    return net.babycat.live.platform.util.file.a.B(this.f41069a, strE, cVar, dVar, string, (InputStream) obj);
                }
            }, new nj.l() { // from class: sn.j
                @Override // nj.l
                public final Object invoke(Object obj) {
                    return net.babycat.live.platform.util.file.a.C(url, this, cVar, string, (Exception) obj);
                }
            });
        }
        aVar.e(f36756e, "this url cached");
        f36759h.execute(new Runnable() { // from class: sn.h
            @Override // java.lang.Runnable
            public final void run() {
                net.babycat.live.platform.util.file.a.A(this.f41064a, strE, cVar, string, dVar);
            }
        });
        return null;
    }
}
