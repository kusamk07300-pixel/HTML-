package net.babycat.live.platform.util;

import android.content.SharedPreferences;
import android.text.TextUtils;
import cn.rongcloud.corekit.utils.GsonUtil;
import cn.rongcloud.corekit.utils.ListUtil;
import cn.rongcloud.musiccontrolkit.bean.Music;
import cn.rongcloud.musiccontrolkit.bean.MusicControl;
import java.util.ArrayList;
import java.util.List;
import net.babycat.live.app.MyApplication;

/* JADX INFO: loaded from: classes3.dex */
public class w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f37059d = "rckit_music_list";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f37060e = "key_music_list";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f37061f = "key_music_volume";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f37062g = "key_music_enable";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static w0 f37063h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Music> f37064a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences.Editor f37065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SharedPreferences f37066c;

    public w0() {
        SharedPreferences sharedPreferences = MyApplication.j().getSharedPreferences(f37059d, 4);
        this.f37066c = sharedPreferences;
        this.f37065b = sharedPreferences.edit();
    }

    public static w0 b() {
        if (f37063h == null) {
            f37063h = new w0();
        }
        return f37063h;
    }

    public boolean a() {
        return this.f37066c.getBoolean("KEY_ENABLE", false);
    }

    public MusicControl c() {
        String string = this.f37066c.getString(f37061f, "");
        return !TextUtils.isEmpty(string) ? (MusicControl) GsonUtil.json2Obj(string, MusicControl.class) : new MusicControl();
    }

    public List<Music> d() {
        this.f37064a.clear();
        List<Music> listE = e();
        if (ListUtil.isNotEmpty(listE)) {
            this.f37064a.addAll(listE);
        }
        return this.f37064a;
    }

    public final List<Music> e() {
        String string = this.f37066c.getString(f37060e, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return GsonUtil.json2List(string, Music.class);
    }

    public void f(boolean z10) {
        this.f37065b.putBoolean(f37062g, z10);
        this.f37065b.commit();
    }

    public void g(MusicControl musicControl) {
        this.f37065b.putString(f37061f, GsonUtil.obj2Json(musicControl));
        this.f37065b.commit();
    }

    public void h(List<Music> list) {
        this.f37065b.putString(f37060e, GsonUtil.obj2Json(list));
        this.f37065b.commit();
    }
}
