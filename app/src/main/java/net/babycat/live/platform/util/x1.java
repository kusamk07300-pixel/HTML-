package net.babycat.live.platform.util;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class x1 {
    public static final String FILE_NAME = "qmyytest_data";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f37074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedPreferences.Editor f37075b;

    public x1(Context context) {
        n(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences(FILE_NAME, 0);
        this.f37074a = sharedPreferences;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        this.f37075b = editorEdit;
        editorEdit.apply();
    }

    public void a() {
        this.f37075b.clear().apply();
    }

    public boolean b(String str) {
        return this.f37074a.contains(str);
    }

    public Map<String, ?> c() {
        return this.f37074a.getAll();
    }

    public boolean d(String str) {
        return e(str, false);
    }

    public boolean e(String str, boolean z10) {
        return this.f37074a.getBoolean(str, z10);
    }

    public float f(String str) {
        return g(str, -1.0f);
    }

    public float g(String str, float f10) {
        return this.f37074a.getFloat(str, f10);
    }

    public int h(String str) {
        return i(str, 0);
    }

    public int i(String str, int i10) {
        return this.f37074a.getInt(str, i10);
    }

    public long j(String str) {
        return k(str, -1L);
    }

    public long k(String str, long j10) {
        return this.f37074a.getLong(str, j10);
    }

    public String l(String str) {
        return m(str, null);
    }

    public String m(String str, String str2) {
        return this.f37074a.getString(str, str2);
    }

    public final void n(Context context) {
        Map<String, ?> all = context.getSharedPreferences(FILE_NAME, 0).getAll();
        if (all.isEmpty()) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(FILE_NAME, 0);
        if (sharedPreferences.getAll().isEmpty()) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    editorEdit.putString(key, (String) value);
                } else if (value instanceof Integer) {
                    editorEdit.putInt(key, ((Integer) value).intValue());
                } else if (value instanceof Boolean) {
                    editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Float) {
                    editorEdit.putFloat(key, ((Float) value).floatValue());
                } else if (value instanceof Long) {
                    editorEdit.putLong(key, ((Long) value).longValue());
                } else if (value instanceof Set) {
                    editorEdit.putStringSet(key, (Set) value);
                }
            }
            editorEdit.apply();
        }
    }

    public void o(String str, boolean z10) {
        this.f37075b.putBoolean(str, z10).apply();
    }

    public void p(String str, float f10) {
        this.f37075b.putFloat(str, f10).apply();
    }

    public void q(String str, int i10) {
        this.f37075b.putInt(str, i10).apply();
    }

    public void r(String str, long j10) {
        this.f37075b.putLong(str, j10).apply();
    }

    public void s(String str, String str2) {
        this.f37075b.putString(str, str2).apply();
    }

    public void t(String str) {
        this.f37075b.remove(str).apply();
    }
}
