package net.babycat.live.platform.util;

import android.annotation.SuppressLint;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ boolean f36980a = false;

    public static synchronized void a(String str) {
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[1];
        wo.b.i("%s - PEGASILOG", "[" + stackTraceElement.getFileName() + " | " + stackTraceElement.getLineNumber() + " | " + stackTraceElement.getMethodName() + "] " + str);
    }

    public static synchronized void b(String... strArr) {
        try {
            StackTraceElement stackTraceElement = new Exception().getStackTrace()[1];
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(stackTraceElement.getFileName());
            sb2.append(" | ");
            sb2.append(stackTraceElement.getLineNumber());
            sb2.append(" | ");
            sb2.append(stackTraceElement.getMethodName());
            sb2.append("] ");
            if (strArr != null) {
                sb2.append("Log.d");
            }
            for (String str : strArr) {
                sb2.append(String.format("===%s", str));
            }
            wo.b.i("%s - PEGASILOG", sb2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void c(String str) {
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[1];
        wo.b.i("%s - PEGASILOG", "[" + stackTraceElement.getFileName() + " | " + stackTraceElement.getLineNumber() + " | " + stackTraceElement.getMethodName() + "] " + str);
    }

    public static synchronized void d(String... strArr) {
        try {
            StackTraceElement stackTraceElement = new Exception().getStackTrace()[1];
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(stackTraceElement.getFileName());
            sb2.append(" | ");
            sb2.append(stackTraceElement.getLineNumber());
            sb2.append(" | ");
            sb2.append(stackTraceElement.getMethodName());
            sb2.append("] ");
            if (strArr != null) {
                sb2.append("Log.e");
            }
            for (String str : strArr) {
                sb2.append(String.format("===%s", str));
            }
            wo.b.i("%s - PEGASILOG", sb2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static String e() {
        return new Exception().getStackTrace()[1].getFileName();
    }

    public static String f() {
        return new Exception().getStackTrace()[1].getMethodName();
    }

    public static synchronized void g(String str) {
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[1];
        wo.b.i("%s - PEGASILOG", "[" + stackTraceElement.getFileName() + " | " + stackTraceElement.getLineNumber() + " | " + stackTraceElement.getMethodName() + "] " + str);
    }

    public static synchronized void h(String... strArr) {
        try {
            StackTraceElement stackTraceElement = new Exception().getStackTrace()[1];
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(stackTraceElement.getFileName());
            sb2.append(" | ");
            sb2.append(stackTraceElement.getLineNumber());
            sb2.append(" | ");
            sb2.append(stackTraceElement.getMethodName());
            sb2.append("] ");
            if (strArr != null) {
                sb2.append("Log.i");
            }
            for (String str : strArr) {
                sb2.append(String.format("===%s", str));
            }
            wo.b.i("%s - PEGASILOG", sb2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static int i() {
        return new Exception().getStackTrace()[1].getLineNumber();
    }

    @SuppressLint({"SimpleDateFormat"})
    public static String j() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
    }

    public static synchronized void k(String str) {
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[1];
        wo.b.i("%s - PEGASILOG", "[" + stackTraceElement.getFileName() + " | " + stackTraceElement.getLineNumber() + " | " + stackTraceElement.getMethodName() + "]" + str);
    }

    public static synchronized void l(String... strArr) {
        try {
            StackTraceElement stackTraceElement = new Exception().getStackTrace()[1];
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(stackTraceElement.getFileName());
            sb2.append(" | ");
            sb2.append(stackTraceElement.getLineNumber());
            sb2.append(" | ");
            sb2.append(stackTraceElement.getMethodName());
            sb2.append("] ");
            if (strArr != null) {
                sb2.append("Log.v");
            }
            for (String str : strArr) {
                sb2.append(String.format("===%s", str));
            }
            wo.b.i("%s - PEGASILOG", sb2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void m(String str) {
        StackTraceElement stackTraceElement = new Exception().getStackTrace()[1];
        wo.b.i("%s - PEGASILOG", "[" + stackTraceElement.getFileName() + " | " + stackTraceElement.getLineNumber() + " | " + stackTraceElement.getMethodName() + "] " + str);
    }

    public static synchronized void n(String... strArr) {
        try {
            StackTraceElement stackTraceElement = new Exception().getStackTrace()[1];
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(stackTraceElement.getFileName());
            sb2.append(" | ");
            sb2.append(stackTraceElement.getLineNumber());
            sb2.append(" | ");
            sb2.append(stackTraceElement.getMethodName());
            sb2.append("] ");
            if (strArr != null) {
                sb2.append("Log.w");
            }
            for (String str : strArr) {
                sb2.append(String.format("===%s", str));
            }
            wo.b.i("%s - PEGASILOG", sb2);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
