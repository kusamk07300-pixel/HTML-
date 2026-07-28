package net.babycat.live.platform.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.material.timepicker.TimeModel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.tencent.qcloud.tuicore.TUIConfig;
import com.tencent.qcloud.tuicore.TUIThemeManager;
import com.yy.yyeva.view.EvaAnimViewV3;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import net.babycat.live.app.MyApplication;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;
import ye.b;

/* JADX INFO: loaded from: classes3.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static af.b f36970a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f36971b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f36972c = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static DecimalFormat f36973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f36974e = Pattern.compile(".*?(gif|jpeg|png|jpg|bmp|webp|0)");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ boolean f36975f = false;

    public class a implements Topbar.TopbarLeftClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f36976a;

        public a(Activity activity) {
            this.f36976a = activity;
        }

        @Override // net.babycat.live.platform.widget.view.Topbar.TopbarLeftClickListener
        public void leftClick() {
            new x1(this.f36976a).q("main_taskId", 0);
            if (zn.a.l().e().getClass().getName().equals(this.f36976a.getClass().getName())) {
                zn.a.l().g(this.f36976a);
            } else {
                this.f36976a.finish();
            }
            this.f36976a.overridePendingTransition(0, R.anim.slide_right_out);
        }
    }

    public class b extends TypeToken<Map<String, String>> {
    }

    public class c implements cf.g {
        @Override // cf.g
        public void a(int i10, String str) {
        }
    }

    public class d implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class e implements Consumer<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f36977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ EvaAnimViewV3 f36978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f36979c;

        public e(Context context, EvaAnimViewV3 evaAnimViewV3, String str) {
            this.f36977a = context;
            this.f36978b = evaAnimViewV3;
            this.f36979c = str;
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Long l10) throws Exception {
            e2.p(this.f36977a, this.f36978b, this.f36979c);
        }
    }

    public static String A(String str) {
        int iLastIndexOf = str.lastIndexOf("/");
        int iLastIndexOf2 = str.lastIndexOf(InstructionFileId.DOT);
        if (iLastIndexOf == -1 || iLastIndexOf2 == -1) {
            return null;
        }
        return str.substring(iLastIndexOf + 1, iLastIndexOf2);
    }

    public static boolean A0(String str) {
        return w0(str) || r0(str);
    }

    public static String B(File file) throws IOException {
        byte[] bArr = new byte[8];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            if (fileInputStream.read(bArr) < 8) {
                throw new IOException("File too small to determine type");
            }
            fileInputStream.close();
            return E0(bArr, new byte[]{71, 73, 70, 56}) ? "image/gif" : E0(bArr, new byte[]{-1, w1.a.f43008r1}) ? "image/jpeg" : E0(bArr, new byte[]{82, 73, 70, 70}) ? s2.w0.IMAGE_WEBP : "unknown";
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static boolean B0(String str) {
        return str.matches("\\d+");
    }

    public static String C(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return "火星";
        }
        return str + "-" + str2 + "-" + str3;
    }

    public static boolean C0(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Settings.canDrawOverlays(context);
        }
        try {
            return ((Boolean) Settings.class.getDeclaredMethod("canDrawOverlays", Context.class).invoke(null, context)).booleanValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static String D(Context context, String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(str), "utf-8"));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line.trim());
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        return sb2.toString();
    }

    public static <T> List<T> D0(String str, Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        Iterator<JsonElement> it = new JsonParser().parse(str).getAsJsonArray().iterator();
        while (it.hasNext()) {
            arrayList.add(new Gson().fromJson(it.next(), (Class) cls));
        }
        return arrayList;
    }

    public static final String E() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月", Locale.US);
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(2, -1);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static boolean E0(byte[] bArr, byte[] bArr2) {
        if (bArr.length < bArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static final String F() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM", Locale.US);
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(2, -1);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static int[] F0(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i10 = layoutParams.height;
        view.measure(childMeasureSpec, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
        return new int[]{view.getMeasuredWidth(), view.getMeasuredHeight()};
    }

    public static String G() {
        return Locale.getDefault().getCountry();
    }

    public static String G0(double d10) {
        if (f36973d == null) {
            f36973d = new DecimalFormat("0.##");
        }
        return f36973d.format(d10);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String H(String str) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case 645384:
                if (str.equals("一月")) {
                    b10 = 0;
                }
                break;
            case 645477:
                if (str.equals("七月")) {
                    b10 = 1;
                }
                break;
            case 645663:
                if (str.equals("三月")) {
                    b10 = 2;
                }
                break;
            case 648267:
                if (str.equals("九月")) {
                    b10 = 3;
                }
                break;
            case 649724:
                if (str.equals("二月")) {
                    b10 = 4;
                }
                break;
            case 649972:
                if (str.equals("五月")) {
                    b10 = 5;
                }
                break;
            case 672509:
                if (str.equals("八月")) {
                    b10 = 6;
                }
                break;
            case 672571:
                if (str.equals("六月")) {
                    b10 = 7;
                }
                break;
            case 687079:
                if (str.equals("十月")) {
                    b10 = 8;
                }
                break;
            case 715661:
                if (str.equals("四月")) {
                    b10 = 9;
                }
                break;
            case 21127177:
                if (str.equals("十一月")) {
                    b10 = 10;
                }
                break;
            case 21131517:
                if (str.equals("十二月")) {
                    b10 = com.google.common.base.a.VT;
                }
                break;
        }
        switch (b10) {
            case 0:
                return "01月";
            case 1:
                return "07月";
            case 2:
                return "03月";
            case 3:
                return "09月";
            case 4:
                return "02月";
            case 5:
                return "05月";
            case 6:
                return "08月";
            case 7:
                return "06月";
            case 8:
                return "10月";
            case 9:
                return "04月";
            case 10:
                return "11月";
            case 11:
                return "12月";
            default:
                return "";
        }
    }

    public static boolean H0(String str, List<String> list) {
        if (list != null && list.size() != 0 && !TextUtils.isEmpty(str)) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (str.toLowerCase().contains(it.next().toLowerCase())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String I(int i10) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + i10 + "/cmdline"));
            try {
                String line = bufferedReader.readLine();
                if (!TextUtils.isEmpty(line)) {
                    line = line.trim();
                }
                try {
                    bufferedReader.close();
                    return line;
                } catch (IOException e10) {
                    e10.printStackTrace();
                    return line;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    th.printStackTrace();
                    return null;
                } finally {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }

    public static void I0(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        } else {
            X0(MyApplication.j(), "Can't find applications that can handle this link");
        }
    }

    public static String J(Context context, int i10) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == i10) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    public static Map<String, String> J0(String str) {
        return TextUtils.isEmpty(str) ? new HashMap() : (Map) new GsonBuilder().create().fromJson(str, new b().getType());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String K(android.content.Context r8, android.net.Uri r9) {
        /*
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r9.getScheme()
            if (r1 != 0) goto L10
            java.lang.String r0 = r9.getPath()
        Le:
            r3 = r9
            goto L4d
        L10:
            java.lang.String r2 = "file"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L1d
            java.lang.String r0 = r9.getPath()
            goto Le
        L1d:
            java.lang.String r2 = "content"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Le
            android.content.ContentResolver r2 = r8.getContentResolver()
            java.lang.String r1 = "_data"
            java.lang.String[] r4 = new java.lang.String[]{r1}
            r6 = 0
            r7 = 0
            r5 = 0
            r3 = r9
            android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)
            if (r9 == 0) goto L4d
            boolean r2 = r9.moveToFirst()
            if (r2 == 0) goto L4a
            int r1 = r9.getColumnIndex(r1)
            r2 = -1
            if (r1 <= r2) goto L4a
            java.lang.String r0 = r9.getString(r1)
        L4a:
            r9.close()
        L4d:
            boolean r9 = android.text.TextUtils.isEmpty(r0)
            if (r9 == 0) goto L84
            java.lang.String r9 = r3.toString()
            java.lang.String r1 = "/"
            int r1 = r9.lastIndexOf(r1)
            java.lang.String r9 = r9.substring(r1)
            java.lang.String r1 = android.os.Environment.DIRECTORY_PICTURES
            java.io.File r1 = r8.getExternalFilesDir(r1)
            if (r1 != 0) goto L74
            java.io.File r1 = new java.io.File
            java.io.File r8 = r8.getFilesDir()
            java.lang.String r2 = android.os.Environment.DIRECTORY_PICTURES
            r1.<init>(r8, r2)
        L74:
            java.io.File r8 = new java.io.File
            r8.<init>(r1, r9)
            boolean r9 = r8.exists()
            if (r9 == 0) goto L84
            java.lang.String r8 = r8.getAbsolutePath()
            return r8
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.babycat.live.platform.util.t.K(android.content.Context, android.net.Uri):java.lang.String");
    }

    public static int K0(float f10) {
        return (int) ((f10 / MyApplication.j().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int L(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static void L0(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof FrameLayout) {
            ((FrameLayout) parent).removeView(view);
        }
    }

    public static int M(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static String M0(String str) {
        return (str == null || str.isEmpty()) ? "" : str.replaceAll("\\s+", "");
    }

    public static int N(Date date) {
        if (date == null) {
            return 0;
        }
        return Integer.valueOf(String.valueOf(date.getTime() / 1000)).intValue();
    }

    public static String N0(String str) {
        return str != null ? Pattern.compile("\t|\r|\n|\\s*").matcher(str).replaceAll("") : "";
    }

    public static long O(long j10) {
        return (System.currentTimeMillis() - j10) / 1000;
    }

    public static void O0(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            context.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent();
        intent2.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent2.putExtra("app_package", context.getPackageName());
        intent2.putExtra("app_uid", context.getApplicationInfo().uid);
        context.startActivity(intent2);
    }

    public static String P(Date date) {
        return new SimpleDateFormat("yyyy/MM", Locale.US).format(date);
    }

    public static void P0(androidx.fragment.app.d dVar, Runnable runnable) {
        net.babycat.live.platform.util.c.i(dVar, runnable);
    }

    public static String Q(String str) {
        return !TextUtils.isEmpty(str) ? str.split(r9.b.COMMA)[0] : "";
    }

    public static String Q0(Context context, Bitmap bitmap) {
        String str = "JPEG_down" + new Random().nextInt(10) + ".jpg";
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (externalFilesDir == null) {
            externalFilesDir = new File(context.getFilesDir(), Environment.DIRECTORY_PICTURES);
        }
        File file = new File(externalFilesDir, "test");
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return null;
        }
        File file2 = new File(file, str);
        String absolutePath = file2.getAbsolutePath();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        q(context, absolutePath);
        return absolutePath;
    }

    public static double R(Context context) {
        return context.getResources().getIdentifier("status_bar_height", "dimen", "android") > 0 ? context.getResources().getDimensionPixelSize(r0) : 0;
    }

    public static boolean R0(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        boolean z10 = false;
        if (layoutParams == null) {
            return false;
        }
        if (layoutParams.width != i10) {
            layoutParams.width = i10;
            z10 = true;
        }
        if (layoutParams.height != i11) {
            layoutParams.height = i11;
            z10 = true;
        }
        if (z10) {
            view.setLayoutParams(layoutParams);
        }
        return true;
    }

    public static String S() {
        return Locale.getDefault().getLanguage();
    }

    public static Topbar S0(Activity activity, View view, String str) {
        Topbar topbar = (Topbar) view;
        if (str != null) {
            topbar.setTitleText(str);
        }
        topbar.setOnTopbarLeftClickListener(new a(activity));
        return topbar;
    }

    public static Locale[] T() {
        return Locale.getAvailableLocales();
    }

    public static void T0(View view, boolean z10) {
        view.setClickable(z10);
        view.setFocusable(z10);
        view.setEnabled(z10);
    }

    public static String U() {
        return Build.MODEL;
    }

    public static ViewGroup.LayoutParams U0(View view, int i10, int i11, int i12, int i13) {
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.setMargins(i10, i12, i11, i13);
        view.setLayoutParams(marginLayoutParams);
        return marginLayoutParams;
    }

    public static String V() {
        return Build.VERSION.RELEASE;
    }

    public static void V0(Context context, String str, ImageView imageView, EvaAnimViewV3 evaAnimViewV3) {
        if (str.substring(str.length() - 3).equals("mp4")) {
            evaAnimViewV3.setVisibility(0);
            imageView.setVisibility(8);
            if (evaAnimViewV3.isRunning()) {
                evaAnimViewV3.d(null);
            }
            Observable.timer(200L, TimeUnit.MILLISECONDS).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new e(context, evaAnimViewV3, str));
            return;
        }
        if (evaAnimViewV3.isRunning()) {
            evaAnimViewV3.d(null);
        }
        imageView.setVisibility(0);
        evaAnimViewV3.setVisibility(8);
        wn.d.c(context, str, imageView);
    }

    public static String W() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iRandom = (int) ((Math.random() * 90.0d) + 10.0d);
        return String.valueOf(jCurrentTimeMillis) + String.valueOf(iRandom);
    }

    public static void W0(Activity activity, String str) {
        t0.c("showMessage ：" + str);
        Toast toastMakeText = Toast.makeText(activity, str, 1);
        toastMakeText.setGravity(17, 0, 0);
        toastMakeText.show();
    }

    public static String X(Date date) {
        if (date == null) {
            return "";
        }
        Context appContext = TUIConfig.getAppContext();
        Locale locale = appContext == null ? Locale.getDefault() : TUIThemeManager.getInstance().getLocale(appContext);
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(7, 1);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(6, 1);
        calendar3.set(11, 0);
        calendar3.set(12, 0);
        calendar3.set(13, 0);
        calendar3.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        long timeInMillis2 = calendar2.getTimeInMillis();
        long timeInMillis3 = calendar3.getTimeInMillis();
        long time = date.getTime();
        return time < timeInMillis3 ? String.format(Locale.US, "%tD", date) : time < timeInMillis2 ? String.format(Locale.US, "%1$tm/%1$td", date) : time < timeInMillis ? String.format(locale, "%tA", date) : String.format(Locale.US, "%tR", date);
    }

    public static void X0(Application application, String str) {
        t0.c("showMessage ：" + str);
        Toast toastMakeText = Toast.makeText(application, str, 1);
        toastMakeText.setGravity(17, 0, 0);
        toastMakeText.show();
    }

    public static String Y() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static void Y0(Activity activity, String str) {
    }

    public static String Z(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.get(11);
        int i10 = calendar.get(11);
        return i10 < 5 ? "深夜" : i10 < 12 ? "上午" : i10 < 13 ? "中午" : i10 < 18 ? "下午" : i10 < 24 ? "晚上" : "";
    }

    public static void Z0(Context context, int i10, int i11) {
        new b.C0752b(context).Y(false).f("请选择警告类型", new String[]{"禁止抽烟喝酒", "禁止恶意言论", "禁止驾驶中直播", "禁止衣着不整", "直播内容违规", "禁止色情内容", "请纠正当前直播状态"}, new c()).N();
    }

    public static void a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(PhoneNumberUtil.f27779x + str));
        if (i0.e.a(context, "android.permission.CALL_PHONE") != 0) {
            return;
        }
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static String a0() {
        String str = "35" + (Build.BOARD.length() % 10) + (Build.BRAND.length() % 10) + (Build.CPU_ABI.length() % 10) + (Build.DEVICE.length() % 10) + (Build.DISPLAY.length() % 10) + (Build.HOST.length() % 10) + (Build.ID.length() % 10) + (Build.MANUFACTURER.length() % 10) + (Build.MODEL.length() % 10) + (Build.PRODUCT.length() % 10) + (Build.TAGS.length() % 10) + (Build.TYPE.length() % 10) + (Build.USER.length() % 10);
        try {
            return new UUID(str.hashCode(), (Build.VERSION.SDK_INT >= 26 ? Build.getSerial() : Build.SERIAL).hashCode()).toString();
        } catch (Exception unused) {
            return new UUID(str.hashCode(), -905839116).toString();
        }
    }

    public static void a1(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            audioManager.setRingerMode(2);
            audioManager.getStreamVolume(2);
            Log.d("SilentListenerService", "RINGING 取消静音");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T b(Object obj) {
        return obj;
    }

    public static String b0(Context context) {
        String strA0;
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (TextUtils.isEmpty(string) || "9774d56d682e549c".equals(string)) {
            strA0 = null;
        } else {
            try {
                strA0 = UUID.nameUUIDFromBytes(string.getBytes("utf8")).toString();
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
                strA0 = null;
            }
        }
        if (TextUtils.isEmpty(strA0)) {
            strA0 = a0();
        }
        return TextUtils.isEmpty(strA0) ? UUID.randomUUID().toString() : strA0;
    }

    public static void b1(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            audioManager.setRingerMode(0);
            audioManager.getStreamVolume(2);
            Log.d("Silent:", "RINGING 已被静音");
        }
    }

    public static void c(ViewPager2 viewPager2) {
        try {
            Field declaredField = ViewPager2.class.getDeclaredField("mRecyclerView");
            declaredField.setAccessible(true);
            RecyclerView recyclerView = (RecyclerView) declaredField.get(viewPager2);
            Field declaredField2 = RecyclerView.class.getDeclaredField("mTouchSlop");
            declaredField2.setAccessible(true);
            int iIntValue = ((Integer) declaredField2.get(recyclerView)).intValue();
            wo.b.b("滑动系数：" + iIntValue, new Object[0]);
            declaredField2.set(recyclerView, Integer.valueOf(iIntValue * 3));
            wo.b.b("滑动系数：" + declaredField2.get(recyclerView), new Object[0]);
        } catch (Exception unused) {
        }
    }

    public static String c0(String str) {
        try {
            String path = new URL(str).getPath();
            String strSubstring = path.substring(path.lastIndexOf(47) + 1);
            wo.b.b("文件名: " + strSubstring, new Object[0]);
            return strSubstring;
        } catch (MalformedURLException e10) {
            System.err.println("无效的 URL: " + e10.getMessage());
            return null;
        }
    }

    public static String c1(long j10) {
        return new SimpleDateFormat(r5.b.f39544k, Locale.US).format(new Date(j10));
    }

    public static String d(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("URL cannot be null or empty");
        }
        return str.contains("?") ? com.amazonaws.mobileconnectors.s3.transferutility.n.f11618h : "?";
    }

    @Deprecated
    public static boolean d0(androidx.fragment.app.d dVar) {
        return o0(dVar);
    }

    public static String d1(long j10, String str) {
        if (str == null || str.isEmpty()) {
            str = "yyyy-MM-dd HH:mm:ss";
        }
        return new SimpleDateFormat(str, Locale.US).format(new Date(j10));
    }

    public static void e(Animation animation, View view) {
        animation.setAnimationListener(new d());
    }

    public static int e0() {
        try {
            return MyApplication.j().getPackageManager().getPackageInfo(MyApplication.j().getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static void f(Context context, String str, String str2, String str3) throws IOException {
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str2 + str3);
        if (file2.exists()) {
            file2.delete();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(str2 + str3);
        InputStream inputStreamOpen = context.getAssets().open(str);
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStreamOpen.read(bArr);
            if (i10 <= 0) {
                fileOutputStream.flush();
                inputStreamOpen.close();
                fileOutputStream.close();
                return;
            }
            fileOutputStream.write(bArr, 0, i10);
        }
    }

    public static String f0() {
        try {
            return MyApplication.j().getPackageManager().getPackageInfo(MyApplication.j().getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String g(String str) throws ParseException {
        return String.valueOf(new SimpleDateFormat(r5.b.f39544k, Locale.US).parse(str).getTime());
    }

    public static String g0(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 5 ? i10 != 6 ? "你直播内容涉及严重违规，请及时纠正，否则将会被限制直播权限，特此警告！" : "为了您和家人的健康，请调整直播状态" : "你的行为举止涉及涉黄、色情嫌疑，请及时纠正不轨行为，避免处罚升级，特此警告" : "你的服饰过于暴露，请及时调整衣着。特此警告！" : "为了您和他人的人身安全，禁止在驾驶过程中直播，请及时纠正，否则将会被升级处罚" : "提倡文明绿色直播，严禁直播间辱骂，诋毁，诽谤等不轨言论。特此警告，避免被升级处罚！" : "共同维护文明绿色直播环境，禁止直播间抽烟喝酒等不文明行为，特此警告";
    }

    public static String h(String str, String str2) throws ParseException {
        if (str2 == null || str2.isEmpty()) {
            str2 = r5.b.f39544k;
        }
        return String.valueOf(new SimpleDateFormat(str2, Locale.US).parse(str).getTime());
    }

    public static WindowManager h0(Context context) {
        return (WindowManager) context.getSystemService("window");
    }

    public static int i(float f10) {
        return (int) ((f10 * MyApplication.j().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static String i0(Date date) {
        return new SimpleDateFormat("yyyy年MM月dd日", Locale.US).format(date);
    }

    public static Bitmap j(Context context, Bitmap bitmap, String str, Paint paint, Rect rect, int i10, int i11) {
        Bitmap.Config config = bitmap.getConfig();
        paint.setDither(true);
        paint.setFilterBitmap(true);
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCopy = bitmap.copy(config, true);
        new Canvas(bitmapCopy).drawText(str, i10, i11, paint);
        return bitmapCopy;
    }

    public static String j0(Date date) {
        return new SimpleDateFormat("yyyy年MM月", Locale.US).format(date);
    }

    public static Bitmap k(Context context, int i10, String str) {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), i10);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setTextSize(30.0f);
        paint.setFakeBoldText(true);
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return j(context, bitmapDecodeResource, str, paint, rect, (bitmapDecodeResource.getWidth() - rect.width()) / 2, (bitmapDecodeResource.getHeight() + rect.height()) / 2);
    }

    public static String k0(Date date) {
        return new SimpleDateFormat(r5.b.f39544k, Locale.US).format(date);
    }

    public static boolean l(String str) {
        try {
            if (new File(str).exists()) {
                Log.i("测试", "有这个文件");
                return true;
            }
            Log.i("测试", "没有这个文件");
            return false;
        } catch (Exception unused) {
            Log.i("测试", "崩溃");
            return false;
        }
    }

    public static String l0(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(date);
    }

    public static String m(String str, List<String> list) {
        if (list != null && list.size() != 0 && !TextUtils.isEmpty(str)) {
            for (String str2 : list) {
                if (str2.contains(he.h.f27168r)) {
                    break;
                }
                if (str.toLowerCase().contains(str2.toLowerCase())) {
                    String str3 = "";
                    for (int i10 = 0; i10 < str2.length(); i10++) {
                        str3 = str3 + he.h.f27168r;
                    }
                    str = str.replaceAll(str2, str3);
                }
            }
        }
        return str;
    }

    public static String m0(Date date) {
        return new SimpleDateFormat("yyyy-MM", Locale.US).format(date);
    }

    public static double n(double d10) {
        return new BigDecimal(d10).setScale(2, 4).doubleValue();
    }

    public static String n0(Date date) {
        return new SimpleDateFormat("yyyy", Locale.US).format(date);
    }

    public static String o(int i10) {
        return String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i10));
    }

    public static boolean o0(androidx.fragment.app.d dVar) {
        return dVar != null && i0.e.a(dVar, "android.permission.RECORD_AUDIO") == 0 && i0.e.a(dVar, "android.permission.CAMERA") == 0;
    }

    public static String p(long j10) {
        int i10;
        int i11 = 0;
        if (j10 >= f2.f36747b) {
            i10 = (int) (j10 / f2.f36747b);
            j10 -= (long) (i7.e.HOUR * i10);
        } else {
            i10 = 0;
        }
        if (j10 >= 60000) {
            i11 = (int) (j10 / 60000);
            j10 -= (long) (60000 * i11);
        }
        return o(i10) + ":" + o(i11) + ":" + o((int) (j10 / 1000));
    }

    public static void p0(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager == null || activity.getCurrentFocus() == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
    }

    public static void q(Context context, String str) {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(new File(str)));
        context.sendBroadcast(intent);
    }

    public static boolean q0(Context context, String str) {
        return context.getPackageManager().getPackageInfo(str, 0) != null;
    }

    public static String r(List<String> list) {
        return list.get(new Random(SystemClock.elapsedRealtime()).nextInt(list.size()));
    }

    public static boolean r0(String str) {
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException unused) {
        }
        return str.contains(InstructionFileId.DOT);
    }

    public static String s(int i10) {
        return i10 != 0 ? i10 != 1 ? "en-es" : "en-xa" : "en-us";
    }

    public static boolean s0(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static String t(Context context) {
        try {
            return context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static boolean t0() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z10 = jCurrentTimeMillis - f36971b >= 1000;
        f36971b = jCurrentTimeMillis;
        return z10;
    }

    public static List<String> u(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(r9.b.COMMA)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static boolean u0(String str) {
        if (str != null) {
            return str.matches("(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x|Y|y)$)");
        }
        return false;
    }

    public static bg.b v(Context context, String str) {
        for (bg.b bVar : com.rilixtech.widget.countrycodepicker.c.a(context)) {
            if (bVar.a().equalsIgnoreCase(str)) {
                return bVar;
            }
        }
        return new bg.b("", "", "");
    }

    public static boolean v0(String str) {
        if (str == null || str.trim().length() == 0) {
            return false;
        }
        return f36974e.matcher(str).matches();
    }

    public static String w() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) MyApplication.j().getSystemService("phone");
            if (telephonyManager == null) {
                return null;
            }
            return telephonyManager.getNetworkCountryIso();
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean w0(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static Date x(String str) throws ParseException {
        return new SimpleDateFormat("yyyy", Locale.US).parse(str);
    }

    public static boolean x0() {
        return ((ConnectivityManager) MyApplication.j().getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo() != null;
    }

    public static Date y(String str) throws ParseException {
        return new SimpleDateFormat("yyyy-MM", Locale.US).parse(str);
    }

    public static boolean y0(String... strArr) {
        for (String str : strArr) {
            if (z0(str)) {
                return false;
            }
        }
        return true;
    }

    public static String z() {
        return Build.BRAND;
    }

    public static boolean z0(String str) {
        return str == null || "".equals(str);
    }
}
