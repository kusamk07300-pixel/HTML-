package net.babycat.live.platform.util;

import android.content.Context;
import android.widget.TextView;
import com.google.android.material.timepicker.ChipTextInputComboView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes3.dex */
public class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f36746a = 60000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f36747b = 3600000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f36748c = 86400000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f36749d = 2678400000L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f36750e = 32140800000L;

    public static String a(Integer num) {
        Object[] objArr;
        String str;
        if (num == null) {
            return "0秒";
        }
        int iIntValue = num.intValue() / 3600;
        int iIntValue2 = (num.intValue() / 60) - (iIntValue * 60);
        int iIntValue3 = (num.intValue() - (iIntValue2 * 60)) - (iIntValue * 3600);
        if (iIntValue > 0) {
            objArr = new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)};
            str = "%1$,d时%2$,d分";
        } else if (iIntValue2 > 0) {
            objArr = new Object[]{Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)};
            str = "%1$,d分";
        } else {
            objArr = new Object[]{Integer.valueOf(iIntValue3)};
            str = "%1$,d秒";
        }
        return String.format(str, objArr);
    }

    public static String b(Integer num) {
        Object[] objArr;
        String str;
        if (num == null) {
            return "0秒";
        }
        int iIntValue = num.intValue() / 3600;
        int iIntValue2 = (num.intValue() / 60) - (iIntValue * 60);
        int iIntValue3 = (num.intValue() - (iIntValue2 * 60)) - (iIntValue * 3600);
        if (iIntValue > 0) {
            objArr = new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)};
            str = "%1$,d小时%2$,d分钟";
        } else if (iIntValue2 > 0) {
            objArr = new Object[]{Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)};
            str = "%1$,d分钟";
        } else {
            objArr = new Object[]{Integer.valueOf(iIntValue3)};
            str = "%1$,d";
        }
        return String.format(str, objArr);
    }

    public static String c(Integer num) {
        Object[] objArr;
        String str;
        if (num == null) {
            return x0.IMAGE_1;
        }
        int iIntValue = num.intValue() / 3600;
        int iIntValue2 = (num.intValue() / 60) - (iIntValue * 60);
        int iIntValue3 = (num.intValue() - (iIntValue2 * 60)) - (iIntValue * 3600);
        if (iIntValue > 0) {
            objArr = new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)};
            str = "%1$,d:%2$,d:%3$,d";
        } else if (iIntValue2 > 0) {
            objArr = new Object[]{Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)};
            str = "00:%1$,d:%2$,d";
        } else {
            objArr = new Object[]{Integer.valueOf(iIntValue3)};
            str = "00:00:%1$,d";
        }
        return String.format(str, objArr);
    }

    public static String d(Integer num) {
        Object[] objArr;
        String str;
        if (num == null) {
            return "0秒";
        }
        int iIntValue = num.intValue() / 3600;
        int iIntValue2 = (num.intValue() / 60) - (iIntValue * 60);
        int iIntValue3 = (num.intValue() - (iIntValue2 * 60)) - (iIntValue * 3600);
        if (iIntValue > 0) {
            objArr = new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)};
            str = "%1$,d<<myfont color='#666666' size='36px'>时</<myfont>%2$,d<myfont color='#666666' size='36px'>分</<myfont>";
        } else if (iIntValue2 > 0) {
            objArr = new Object[]{Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)};
            str = "%1$,d<<myfont color='#666666' size='36px'>分</<myfont>";
        } else {
            objArr = new Object[]{Integer.valueOf(iIntValue3)};
            str = "%1$,d<<myfont color='#666666' size='36px'>秒</<myfont>";
        }
        return String.format(str, objArr);
    }

    public static String e(Integer num) {
        Object[] objArr;
        String str;
        if (num == null) {
            return "0秒";
        }
        int iIntValue = num.intValue() / 3600;
        int iIntValue2 = (num.intValue() / 60) - (iIntValue * 60);
        int iIntValue3 = (num.intValue() - (iIntValue2 * 60)) - (iIntValue * 3600);
        if (iIntValue > 0) {
            objArr = new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)};
            str = "%1$,d时%2$,d分%3$,d秒";
        } else if (iIntValue2 > 0) {
            objArr = new Object[]{Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)};
            str = "%1$,d分%2$,d秒";
        } else {
            objArr = new Object[]{Integer.valueOf(iIntValue3)};
            str = "%1$,d秒";
        }
        return String.format(str, objArr);
    }

    public static String f() {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static Date g(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String h(Context context, Date date) {
        if (date == null) {
            return null;
        }
        long time = new Date().getTime() - date.getTime();
        if (time > f36750e) {
            return (time / f36750e) + context.getResources().getString(R.string.last_year);
        }
        if (time > f36749d) {
            return (time / f36749d) + context.getResources().getString(R.string.month_ago);
        }
        if (time > 86400000) {
            return (time / 86400000) + context.getResources().getString(R.string.days_ago);
        }
        if (time > f36747b) {
            return (time / f36747b) + context.getResources().getString(R.string.hours_ago);
        }
        if (time <= 60000) {
            return context.getResources().getString(R.string.just);
        }
        return (time / 60000) + context.getResources().getString(R.string.minutes_ago);
    }

    public static boolean i(Date date, Date date2, Date date3) {
        if (date.getTime() == date2.getTime() || date.getTime() == date3.getTime()) {
            return true;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTime(date3);
        return calendar.after(calendar2) && calendar.before(calendar3);
    }

    public static void j(long j10, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        TextView textView5;
        String str;
        TextView textView6;
        String str2;
        String str3;
        String str4;
        long j11 = j10 / 1000;
        long j12 = j11 % 60;
        long j13 = j11 / 60;
        long j14 = j13 % 60;
        long j15 = j13 / 60;
        long j16 = j15 % 24;
        long j17 = j15 / 24;
        if (j17 > 0) {
            if (j17 > 9) {
                str = "" + j17 + "";
            } else if (j17 > 0) {
                str = "" + x0.IMAGE_1 + j17 + "";
            } else {
                str = "" + ChipTextInputComboView.b.f18759b;
            }
            textView5 = textView;
        } else {
            textView5 = textView;
            str = ChipTextInputComboView.b.f18759b;
        }
        textView5.setText(str);
        if (j16 > 0) {
            if (j16 > 9) {
                str2 = "" + j16 + "";
            } else if (j16 > 0) {
                str2 = "" + x0.IMAGE_1 + j16 + "";
            } else {
                str2 = "" + ChipTextInputComboView.b.f18759b;
            }
            textView6 = textView2;
        } else {
            textView6 = textView2;
            str2 = ChipTextInputComboView.b.f18759b;
        }
        textView6.setText(str2);
        if (j14 > 9) {
            str3 = "" + j14 + "";
        } else if (j14 > 0) {
            str3 = "" + x0.IMAGE_1 + j14 + "";
        } else {
            str3 = "" + ChipTextInputComboView.b.f18759b;
        }
        textView3.setText(str3);
        if (j12 > 9) {
            str4 = "" + j12;
        } else if (j12 > 0) {
            str4 = "" + x0.IMAGE_1 + j12;
        } else {
            str4 = "" + ChipTextInputComboView.b.f18759b;
        }
        textView4.setText(str4);
    }
}
