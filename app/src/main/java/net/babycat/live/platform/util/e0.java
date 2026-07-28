package net.babycat.live.platform.util;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class e0 {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.split("\\.")[r1.length - 1];
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.split("\\.")[r1.length - 1].equals("mp4");
    }
}
