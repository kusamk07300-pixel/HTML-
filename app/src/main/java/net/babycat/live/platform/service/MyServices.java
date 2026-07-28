package net.babycat.live.platform.service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import f.p0;
import net.babycat.live.platform.util.s0;

/* JADX INFO: loaded from: classes3.dex */
public class MyServices extends IntentService {
    public MyServices() {
        super("MyServices");
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(s0.h(context));
    }

    @Override // android.app.IntentService, android.app.Service
    @p0
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.IntentService
    public void onHandleIntent(@p0 Intent intent) {
    }
}
