package net.babycat.live.platform.util;

import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.view.View;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class c2 {
    public static String a(String str) {
        if (q(str)) {
            return "";
        }
        try {
            return new String(Base64.decode(str.getBytes("UTF8"), 0));
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static byte[] b(String str) {
        if (q(str)) {
            return null;
        }
        try {
            return Base64.decode(str.getBytes("UTF8"), 0);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String c(String str) {
        if (q(str)) {
            return "";
        }
        try {
            return new String(Base64.encodeToString(str.getBytes("UTF8"), 0));
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String d(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        try {
            return new String(Base64.encodeToString(bArr, 0));
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static void e(String str) {
        File file = new File(str);
        if (file.exists() || file.isDirectory()) {
            return;
        }
        file.mkdirs();
    }

    public static Date f(Date date, Integer num) {
        if (date == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(2, num.intValue());
        return calendar.getTime();
    }

    public static String g(Object obj) {
        return obj == null ? "" : h(obj.toString());
    }

    public static String h(String str) {
        return str == null ? "" : str.trim();
    }

    public static String i() {
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + UUID.randomUUID().toString().replace("-", "");
    }

    public static String j(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if (date == null) {
            date = new Date();
        }
        return simpleDateFormat.format(date);
    }

    public static String k(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(r5.b.f39544k);
        if (date == null) {
            date = new Date();
        }
        return simpleDateFormat.format(date);
    }

    public static String l(String str) {
        return (q(str) || str.lastIndexOf(46) == -1 || str.endsWith(InstructionFileId.DOT)) ? "" : str.substring(str.lastIndexOf(46) + 1).replace("'", "");
    }

    public static String m() {
        String strSubstring;
        String strN = n();
        String strSubstring2 = "";
        if (!strN.startsWith("Windows")) {
            if (strN.startsWith("Linux")) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("/bin/sh -c ifconfig -a").getInputStream()));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (line.indexOf("HWaddr") > 0) {
                        strSubstring2 = line.substring(line.indexOf("HWaddr") + 6);
                        break;
                    }
                }
                bufferedReader.close();
            }
            return strSubstring2.trim();
        }
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("cmd.exe /c ipconfig /all").getInputStream(), "gbk"));
        while (true) {
            String line2 = bufferedReader2.readLine();
            if (line2 == null) {
                break;
            }
            if (line2.indexOf("Physical Address") > 0) {
                strSubstring = line2.substring(line2.indexOf(":") + 2);
                break;
            }
            if (line2.indexOf("物理地址") > 0) {
                strSubstring = line2.substring(line2.indexOf(":") + 2);
                break;
            }
            if (line2.indexOf("ether ") > 0) {
                String strTrim = line2.substring(line2.indexOf(" ")).trim();
                strSubstring2 = strTrim.substring(0, strTrim.indexOf(" "));
            }
        }
        strSubstring2 = strSubstring;
        bufferedReader2.close();
        return strSubstring2.trim();
    }

    public static String n() {
        return System.getProperty("os.name");
    }

    public static String o(int i10) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < i10; i11++) {
            stringBuffer.append("0123456789".charAt(random.nextInt(9)) + "");
        }
        return stringBuffer.toString();
    }

    public static String p() {
        return new SimpleDateFormat(r5.b.f39544k).format(new Date()) + "_" + UUID.randomUUID().toString().replace("-", "");
    }

    public static boolean q(Object obj) {
        return obj == null || obj.toString().trim().isEmpty();
    }

    public static boolean r(String str) {
        if (q(str) || str.compareToIgnoreCase("x") == 0) {
            return false;
        }
        int length = str.length();
        while (true) {
            length--;
            if (length < 0) {
                return true;
            }
            if (!Character.isDigit(str.charAt(length)) && !str.endsWith("X") && !str.endsWith("x")) {
                return false;
            }
        }
    }

    public static boolean s(String str) throws Exception {
        return (!u(str, "^([1-9]?\\d|1\\d\\d|2[0-4]\\d|25[0-5]).([1-9]?\\d|1\\d\\d|2[0-4]\\d|25[0-5]).([1-9]?\\d|1\\d\\d|2[0-4]\\d|25[0-5]).([1-9]?\\d|1\\d\\d|2[0-4]\\d|25[0-5])$") || "0.0.0.0".equals(str) || "255.255.255.255".equals(str)) ? false : true;
    }

    public static boolean t() {
        return System.getProperty("os.name").toLowerCase().startsWith("win");
    }

    public static boolean u(String str, String str2) throws Exception {
        if (str == null || "".equals(str) || str2 == null || "".equals(str2)) {
            throw new Exception("参数不能为空!");
        }
        return Pattern.compile(str2).matcher(str).matches();
    }

    public static void v(View view, Drawable drawable) {
        if (view != null) {
            int paddingLeft = view.getPaddingLeft();
            int paddingTop = view.getPaddingTop();
            int paddingRight = view.getPaddingRight();
            int paddingBottom = view.getPaddingBottom();
            view.setBackgroundDrawable(drawable);
            view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
    }
}
