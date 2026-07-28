package net.babycat.live.platform.util;

/* JADX INFO: loaded from: classes3.dex */
public class z0 {
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:5:0x0009, B:8:0x0015, B:11:0x0038, B:36:0x0099, B:38:0x009f, B:40:0x00a7, B:41:0x00ae, B:43:0x00bd, B:44:0x00c8, B:45:0x00d2, B:48:0x00d9, B:14:0x0043, B:16:0x0049, B:18:0x0050, B:21:0x0057, B:23:0x005d, B:27:0x0069, B:25:0x0063, B:28:0x0074, B:30:0x007a, B:34:0x0084, B:35:0x008f), top: B:52:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9 A[Catch: Exception -> 0x0040, TRY_LEAVE, TryCatch #0 {Exception -> 0x0040, blocks: (B:5:0x0009, B:8:0x0015, B:11:0x0038, B:36:0x0099, B:38:0x009f, B:40:0x00a7, B:41:0x00ae, B:43:0x00bd, B:44:0x00c8, B:45:0x00d2, B:48:0x00d9, B:14:0x0043, B:16:0x0049, B:18:0x0050, B:21:0x0057, B:23:0x005d, B:27:0x0069, B:25:0x0063, B:28:0x0074, B:30:0x007a, B:34:0x0084, B:35:0x008f), top: B:52:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.babycat.live.platform.util.z0.a(java.lang.String):java.lang.String");
    }

    public static boolean b(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isDigit(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }
}
