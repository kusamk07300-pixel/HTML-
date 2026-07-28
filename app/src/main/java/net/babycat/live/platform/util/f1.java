package net.babycat.live.platform.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import com.tbruyelle.rxpermissions2.Permission;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes3.dex */
public class f1 {
    public static boolean a() {
        return Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId();
    }

    public static Permission[] b(List<Permission> list) {
        return (Permission[]) list.toArray(new Permission[0]);
    }

    public static void c(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            k(context);
            packageInfo = null;
        }
        if (packageInfo == null) {
            k(context);
            return;
        }
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(packageInfo.packageName);
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        Log.e("PermissionPageManager", "resolveinfoList" + listQueryIntentActivities.size());
        for (int i10 = 0; i10 < listQueryIntentActivities.size(); i10++) {
            Log.e("PermissionPageManager", listQueryIntentActivities.get(i10).activityInfo.packageName + listQueryIntentActivities.get(i10).activityInfo.name);
        }
        if (!listQueryIntentActivities.iterator().hasNext()) {
            k(context);
            return;
        }
        ResolveInfo next = listQueryIntentActivities.iterator().next();
        if (next != null) {
            ActivityInfo activityInfo = next.activityInfo;
            String str2 = activityInfo.packageName;
            String str3 = activityInfo.name;
            Intent intent2 = new Intent("android.intent.action.MAIN");
            intent2.addCategory("android.intent.category.LAUNCHER");
            intent2.setComponent(new ComponentName(str2, str3));
            try {
                context.startActivity(intent2);
            } catch (Exception unused2) {
                k(context);
            }
        }
    }

    public static String d() throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.miui.ui.version.name").getInputStream()), 1024);
            try {
                try {
                    String line = bufferedReader.readLine();
                    bufferedReader.close();
                    try {
                        bufferedReader.close();
                        return line;
                    } catch (IOException e10) {
                        e10.printStackTrace();
                        return line;
                    }
                } catch (IOException e11) {
                    e = e11;
                    e.printStackTrace();
                    try {
                        bufferedReader.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                try {
                    bufferedReader2.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
                throw th;
            }
        } catch (IOException e14) {
            e = e14;
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader2.close();
            throw th;
        }
    }

    public static void e(Context context) {
        c(context, "com.yulong.android.security:remote");
    }

    public static void f(Context context) {
        Intent intent = new Intent("android.settings.SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        try {
            context.startActivity(intent);
        } catch (Exception e10) {
            Toast.makeText(context, context.getString(R.string.permission_jump_failed), 0).show();
            e10.printStackTrace();
        }
    }

    public static void g(Context context) {
        try {
            Intent intent = new Intent(context.getPackageName());
            intent.setFlags(268435456);
            intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
            context.startActivity(intent);
        } catch (Exception unused) {
            k(context);
        }
    }

    public static void h(Context context) {
        try {
            Intent intent = new Intent(context.getPackageName());
            intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$AccessLockSummaryActivity"));
            context.startActivity(intent);
        } catch (Exception unused) {
            k(context);
        }
    }

    public static void i(Context context) {
        try {
            Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.putExtra("packageName", context.getPackageName());
            context.startActivity(intent);
        } catch (Exception unused) {
            k(context);
        }
    }

    public static void j(Context context) {
        c(context, "com.coloros.safecenter");
    }

    public static void k(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
            f(context);
        }
    }

    public static void l(Context context) {
        k(context);
    }

    public static void m(Context context) {
        try {
            Intent intent = new Intent(context.getPackageName());
            intent.setComponent(new ComponentName("com.sonymobile.cta", "com.sonymobile.cta.SomcCTAMainActivity"));
            context.startActivity(intent);
        } catch (Exception unused) {
            k(context);
        }
    }

    public static void n(Context context) {
        c(context, "com.bairenkeji.icaller");
    }

    public static void o(Context context) throws Throwable {
        try {
            String strD = d();
            Intent intent = new Intent();
            if ("V6".equals(strD) || "V7".equals(strD)) {
                intent.setAction("miui.intent.action.APP_PERM_EDITOR");
                intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
                intent.putExtra("extra_pkgname", context.getPackageName());
            } else if ("V8".equals(strD) || "V9".equals(strD)) {
                intent.setAction("miui.intent.action.APP_PERM_EDITOR");
                intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
                intent.putExtra("extra_pkgname", context.getPackageName());
            } else {
                k(context);
            }
            context.startActivity(intent);
        } catch (Exception unused) {
            k(context);
        }
    }

    public static boolean p(Context context) {
        return Build.VERSION.SDK_INT < 23 || context.getApplicationInfo().targetSdkVersion < 23;
    }

    public static void q(Context context) throws Throwable {
        String str = Build.MANUFACTURER;
        str.getClass();
        switch (str) {
            case "Coolpad":
                e(context);
                break;
            case "Xiaomi":
                o(context);
                break;
            case "LG":
                h(context);
                break;
            case "OPPO":
                j(context);
                break;
            case "Sony":
                m(context);
                break;
            case "vivo":
                n(context);
                break;
            case "Meizu":
                i(context);
                break;
            case "samsung":
                l(context);
                break;
            case "HUAWEI":
                g(context);
                break;
            default:
                k(context);
                break;
        }
    }

    public static void r(Context context, String str) {
        if (context == null) {
            return;
        }
        Toast.makeText(context, str, 0).show();
    }
}
