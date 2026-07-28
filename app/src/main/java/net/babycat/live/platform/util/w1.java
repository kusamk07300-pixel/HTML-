package net.babycat.live.platform.util;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class w1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile w1 f37067f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SharedPreferences f37071d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37068a = "language_setting";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37069b = "language_select";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37070c = "system_language";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Locale f37072e = Locale.ENGLISH;

    public w1(Context context) {
        this.f37071d = context.getSharedPreferences("language_setting", 0);
    }

    public static w1 a(Context context) {
        if (f37067f == null) {
            synchronized (w1.class) {
                try {
                    if (f37067f == null) {
                        f37067f = new w1(context);
                    }
                } finally {
                }
            }
        }
        return f37067f;
    }

    public int b() {
        return this.f37071d.getInt("language_select", 0);
    }

    public Locale c() {
        return this.f37072e;
    }

    public void d(int i10) {
        SharedPreferences.Editor editorEdit = this.f37071d.edit();
        editorEdit.putInt("language_select", i10);
        editorEdit.commit();
    }

    public void e(Locale locale) {
        this.f37072e = locale;
    }
}
