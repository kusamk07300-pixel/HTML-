package net.babycat.live.platform.util;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class m1 {
    public static boolean a(String str) {
        return Pattern.compile("^(\\d{16}|\\d{19})$").matcher(str).matches();
    }

    public static boolean b(String str) {
        return Pattern.compile("/^([a-zA-Z0-9]+[_|\\-|\\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\\-|\\.]?)*[a-zA-Z0-9]+(\\.[a-zA-Z]{2,3})+$/").matcher(str).matches();
    }

    public static boolean c(String str) {
        return Pattern.compile("(\\d{14}[0-9a-zA-Z])|(\\d{17}[0-9a-zA-Z])").matcher(str).matches();
    }

    public static boolean d(String str) {
        return Pattern.compile("^[0-9_a-zA-Z]{6,20}$").matcher(str).matches();
    }

    public static boolean e(String str) {
        return Pattern.compile("^[1][0-9]{10}$").matcher(str).matches();
    }
}
