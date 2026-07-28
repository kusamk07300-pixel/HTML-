package net.babycat.live.platform.util;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.FileUtils;
import android.provider.MediaStore;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import net.babycat.live.app.MyApplication;
import net.babycat.live.model.SettingBean;

/* JADX INFO: loaded from: classes3.dex */
public class d0 {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SettingBean f36665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f36666b;

        public a(SettingBean settingBean, String str) {
            this.f36665a = settingBean;
            this.f36666b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.b(this.f36665a.getLogin_ad(), this.f36666b);
        }
    }

    public static void b(String str, String str2) {
        try {
            InputStream inputStream = new URL(str).openConnection().getInputStream();
            byte[] bArr = new byte[1024];
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    fileOutputStream.close();
                    inputStream.close();
                    wo.b.b("广告下载成功" + str2, new Object[0]);
                    new x1(MyApplication.j()).s("start_pic", str2);
                    return;
                }
                fileOutputStream.write(bArr, 0, i10);
            }
        } catch (Exception e10) {
            wo.b.b("广告下载失败", new Object[0]);
            e10.printStackTrace();
        }
    }

    public static File c(Context context, boolean z10) {
        File fileD = (z10 && "mounted".equals(Environment.getExternalStorageState())) ? d(context) : null;
        if (fileD == null) {
            fileD = context.getCacheDir();
        }
        if (fileD != null) {
            return fileD;
        }
        String str = "/data/data/" + context.getPackageName() + "/cache/";
        Log.d(d0.class.getName(), "Can't define system cache directory! use " + str);
        return new File(str);
    }

    public static File d(Context context) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null || externalCacheDir.exists() || externalCacheDir.mkdirs()) {
            return externalCacheDir;
        }
        Log.d(d0.class.getName(), "无法创建SDCard cache");
        return null;
    }

    public static File e(Uri uri, Context context) {
        if (com.amazonaws.mobileconnectors.s3.transferutility.j.COLUMN_FILE.equals(uri.getScheme())) {
            String encodedPath = uri.getEncodedPath();
            if (encodedPath != null) {
                encodedPath = Uri.decode(encodedPath);
                ContentResolver contentResolver = context.getContentResolver();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("(");
                stringBuffer.append("_data");
                stringBuffer.append(com.amazonaws.mobileconnectors.s3.transferutility.n.f11619i);
                stringBuffer.append("'" + encodedPath + "'");
                stringBuffer.append(")");
                Cursor cursorQuery = contentResolver.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{com.amazonaws.mobileconnectors.s3.transferutility.j.COLUMN_ID, "_data"}, stringBuffer.toString(), null, null);
                cursorQuery.moveToFirst();
                int i10 = 0;
                while (!cursorQuery.isAfterLast()) {
                    i10 = cursorQuery.getInt(cursorQuery.getColumnIndex(com.amazonaws.mobileconnectors.s3.transferutility.j.COLUMN_ID));
                    encodedPath = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
                    cursorQuery.moveToNext();
                }
                cursorQuery.close();
                if (i10 != 0) {
                    wo.b.b("temp uri is :" + Uri.parse("content://media/external/images/media/" + i10), new Object[0]);
                }
            }
            if (encodedPath != null) {
                return new File(encodedPath);
            }
        } else if ("content".equals(uri.getScheme())) {
            Cursor cursorQuery2 = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            String string = cursorQuery2.moveToFirst() ? cursorQuery2.getString(cursorQuery2.getColumnIndexOrThrow("_data")) : null;
            cursorQuery2.close();
            return new File(string);
        }
        return null;
    }

    public static boolean f(String str) {
        String str2 = ok.b.IMAGEURL;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdir();
        }
        int iLastIndexOf = str.lastIndexOf("/");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str.substring(iLastIndexOf, str.length()));
        return new File(sb2.toString()).exists();
    }

    public static void g(SettingBean settingBean) {
        String str = ok.b.IMAGEURL + settingBean.getLogin_ad().substring(settingBean.getLogin_ad().lastIndexOf("/"), settingBean.getLogin_ad().length());
        if (!f(settingBean.getLogin_ad())) {
            new Thread(new a(settingBean, str)).start();
            return;
        }
        new x1(MyApplication.j()).s("start_pic", str);
        wo.b.b("广告已存在" + str, new Object[0]);
    }

    public static File h(Uri uri, Context context) {
        InputStream inputStreamOpenInputStream;
        File file;
        FileOutputStream fileOutputStream;
        File file2 = null;
        if (uri != null) {
            if (uri.getScheme().equals(com.amazonaws.mobileconnectors.s3.transferutility.j.COLUMN_FILE)) {
                return new File(uri.getPath());
            }
            if (uri.getScheme().equals("content")) {
                ContentResolver contentResolver = context.getContentResolver();
                String str = (System.currentTimeMillis() + Math.round((Math.random() + 1.0d) * 1000.0d)) + InstructionFileId.DOT + MimeTypeMap.getSingleton().getExtensionFromMimeType(contentResolver.getType(uri));
                try {
                    inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    file = new File(context.getCacheDir().getAbsolutePath(), str);
                    fileOutputStream = new FileOutputStream(file);
                    if (Build.VERSION.SDK_INT >= 29) {
                        FileUtils.copy(inputStreamOpenInputStream, fileOutputStream);
                    }
                } catch (IOException e10) {
                    e = e10;
                }
                try {
                    fileOutputStream.close();
                    inputStreamOpenInputStream.close();
                    return file;
                } catch (IOException e11) {
                    e = e11;
                    file2 = file;
                    e.printStackTrace();
                    return file2;
                }
            }
        }
        return file2;
    }
}
