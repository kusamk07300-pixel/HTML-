package net.babycat.live.platform.util.file;

import android.content.Context;
import java.io.File;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.enums.c;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.w0;
import net.babycat.live.platform.util.file.EvaCache;
import to.k;
import to.l;

/* JADX INFO: loaded from: classes3.dex */
@u0({"SMAP\nEvaCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EvaCache.kt\nnet/babycat/live/platform/util/file/EvaCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,123:1\n1#2:124\n13472#3,2:125\n*S KotlinDebug\n*F\n+ 1 EvaCache.kt\nnet/babycat/live/platform/util/file/EvaCache\n*L\n66#1:125,2\n*E\n"})
public final class EvaCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @k
    public static final String f36751a = "EvaCache";

    @k
    public static final EvaCache INSTANCE = new EvaCache();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @k
    public static Type f36752b = Type.DEFAULT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @k
    public static String f36753c = "/";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final Type DEFAULT = new Type("DEFAULT", 0);
        public static final Type FILE = new Type("FILE", 1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Type[] f36754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f36755b;

        static {
            Type[] typeArrD = d();
            f36754a = typeArrD;
            f36755b = c.c(typeArrD);
        }

        public Type(String str, int i10) {
        }

        public static final /* synthetic */ Type[] d() {
            return new Type[]{DEFAULT, FILE};
        }

        @k
        public static kotlin.enums.a<Type> e() {
            return f36755b;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f36754a.clone();
        }
    }

    public static final void h() {
        EvaCache evaCache = INSTANCE;
        evaCache.i(evaCache.j());
        com.yy.yyeva.util.a.INSTANCE.e(f36751a, "Clear eva cache done!");
    }

    @k
    public final File b(@k String audio) {
        g0.p(audio, "audio");
        return new File(j() + audio + ".mp3");
    }

    @k
    public final File c(@k String cacheKey) {
        g0.p(cacheKey, "cacheKey");
        return new File(j() + cacheKey + "/");
    }

    @k
    public final String d(@k String str) throws NoSuchAlgorithmException {
        g0.p(str, "str");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        Charset charsetForName = Charset.forName("UTF-8");
        g0.o(charsetForName, "forName(...)");
        byte[] bytes = str.getBytes(charsetForName);
        g0.o(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        String str2 = "";
        for (byte b10 : messageDigest.digest()) {
            w0 w0Var = w0.INSTANCE;
            String str3 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            g0.o(str3, "format(...)");
            str2 = str2 + str3;
        }
        return str2;
    }

    @k
    public final String e(@k URL url) {
        g0.p(url, "url");
        String string = url.toString();
        g0.o(string, "toString(...)");
        return d(string);
    }

    @k
    public final File f(@k String cacheKey) {
        g0.p(cacheKey, "cacheKey");
        return new File(j() + cacheKey + ".mp4");
    }

    public final void g() {
        if (m()) {
            a.Companion.a().execute(new Runnable() { // from class: sn.a
                @Override // java.lang.Runnable
                public final void run() {
                    EvaCache.h();
                }
            });
        } else {
            com.yy.yyeva.util.a.INSTANCE.b(f36751a, "EVACache is not init!");
        }
    }

    public final void i(@k String path) {
        File[] fileArrListFiles;
        g0.p(path, "path");
        try {
            File file = new File(path);
            if (!file.exists()) {
                file = null;
            }
            if (file == null || (fileArrListFiles = file.listFiles()) == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                if (file2.exists()) {
                    if (file2.isDirectory()) {
                        EvaCache evaCache = INSTANCE;
                        String absolutePath = file2.getAbsolutePath();
                        g0.o(absolutePath, "getAbsolutePath(...)");
                        evaCache.i(absolutePath);
                    }
                    file2.delete();
                }
            }
        } catch (Exception e10) {
            com.yy.yyeva.util.a.INSTANCE.c(f36751a, "Clear eva cache path: " + path + " fail", e10);
        }
    }

    public final String j() {
        if (!g0.g(f36753c, "/")) {
            File file = new File(f36753c);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return f36753c;
    }

    public final boolean k(@k String cacheKey) {
        g0.p(cacheKey, "cacheKey");
        return (l() ? c(cacheKey) : f(cacheKey)).exists();
    }

    public final boolean l() {
        return f36752b == Type.DEFAULT;
    }

    public final boolean m() {
        return !g0.g("/", j()) && new File(j()).exists();
    }

    public final void n(@l Context context) {
        o(context, Type.DEFAULT);
    }

    public final void o(@l Context context, @k Type type) {
        String absolutePath;
        g0.p(type, "type");
        if (m() || context == null) {
            return;
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null || (absolutePath = externalFilesDir.getAbsolutePath()) == null) {
            absolutePath = context.getFilesDir().getAbsolutePath();
            g0.o(absolutePath, "getAbsolutePath(...)");
        }
        f36753c = absolutePath;
        f36753c = j() + "/";
        File file = new File(j());
        File file2 = file.exists() ? null : file;
        if (file2 != null) {
            file2.mkdirs();
        }
        f36752b = type;
    }
}
