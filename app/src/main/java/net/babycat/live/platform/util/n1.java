package net.babycat.live.platform.util;

import net.babycat.live.app.MyApplication;

/* JADX INFO: loaded from: classes3.dex */
public class n1 {
    public static int a(String str, String str2, String str3) {
        try {
            return MyApplication.j().getResources().getIdentifier(str, str2, str3);
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static int b(String str) {
        return a(str, "mipmap", MyApplication.j().getPackageName());
    }

    public static int c(String str) {
        return a(str, "raw", MyApplication.j().getPackageName());
    }
}
