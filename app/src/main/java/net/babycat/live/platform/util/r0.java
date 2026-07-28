package net.babycat.live.platform.util;

import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes3.dex */
public class r0 {
    public static int a(int i10) {
        try {
            return n1.b(String.valueOf("identity_" + i10));
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int b(int i10) {
        try {
            return n1.b(String.valueOf("level_author_" + i10));
        } catch (Exception unused) {
            return R.mipmap.level_author_0;
        }
    }

    public static int c(int i10) {
        try {
            return n1.b(String.valueOf("level_" + i10));
        } catch (Exception unused) {
            return R.mipmap.level_0;
        }
    }

    public static int d(int i10) {
        if (i10 >= 0 && i10 < 150) {
            return n1.b("like_1");
        }
        if (i10 >= 150 && i10 < 400) {
            return n1.b("like_2");
        }
        if (i10 >= 400 && i10 < 700) {
            return n1.b("like_3");
        }
        if (i10 >= 700 && i10 < 1000) {
            return n1.b("like_4");
        }
        if (i10 >= 1000) {
            return n1.b("like_5");
        }
        return 0;
    }

    public static int e(int i10) {
        try {
            return n1.b(String.valueOf("fans_" + i10));
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int f(int i10) {
        try {
            return n1.b(String.valueOf("room_level_" + i10));
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int g(String str) {
        str.getClass();
        switch (str) {
            case "交友":
                return n1.b("r_jy");
            case "娱乐":
                return n1.b("r_yl");
            case "扩列":
                return n1.b("r_kl");
            case "男神":
                return n1.b("r_ns");
            default:
                return n1.b("r_kl");
        }
    }

    public static int h(int i10) {
        try {
            return n1.b(String.valueOf("vip_" + i10));
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int i(int i10) {
        try {
            return n1.b(String.valueOf("v" + i10));
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int j(int i10) {
        try {
            return n1.b(String.valueOf("wea_" + i10));
        } catch (Exception unused) {
            return 0;
        }
    }
}
