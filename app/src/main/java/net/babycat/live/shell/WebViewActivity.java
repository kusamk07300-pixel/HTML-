package net.babycat.live.shell;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import bo.c;
import cf.f;
import com.gyf.immersionbar.ImmersionBar;
import net.babycat.live.app.MyApplication;
import net.babycat.live.model.InRoombean;
import net.babycat.live.model.RoomListBean;
import net.babycat.live.modules.profile.ui.MySpaceActivity;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.x1;
import net.babycat.live.platform.widget.view.AutoWebView;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;
import ye.b;

/* JADX INFO: loaded from: classes3.dex */
public class WebViewActivity extends in.b<co.e> implements c.b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f37187x = 101;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f37188n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f37189o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AutoWebView f37190p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ValueCallback<Uri> f37193s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ValueCallback<Uri[]> f37194t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public x1 f37195u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RoomListBean f37196v;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f37191q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f37192r = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String[] f37197w = {"android.permission.RECORD_AUDIO"};

    public class a implements Topbar.TopbarLeftClickListener {
        public a() {
        }

        @Override // net.babycat.live.platform.widget.view.Topbar.TopbarLeftClickListener
        public void leftClick() {
            if (WebViewActivity.this.f37190p.canGoBack()) {
                WebViewActivity.this.f37190p.goBack();
            } else {
                WebViewActivity.this.f37195u.q("main_taskId", 0);
                WebViewActivity.this.finish();
            }
        }
    }

    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (TextUtils.isEmpty(WebViewActivity.this.f37191q)) {
                WebViewActivity.this.f37191q = webView.getTitle();
                in.a aVar = WebViewActivity.this.f27688a;
                WebViewActivity webViewActivity = WebViewActivity.this;
                t.S0(aVar, webViewActivity.f37188n, webViewActivity.f37191q);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }
    }

    public class c extends WebChromeClient {
        public c() {
        }

        public void a(ValueCallback<Uri> valueCallback, String str, String str2) {
            WebViewActivity.this.f37193s = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("image/*");
            WebViewActivity.this.startActivityForResult(Intent.createChooser(intent, "File Chooser"), 101);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            WebViewActivity.this.f37194t = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("image/*");
            WebViewActivity.this.startActivityForResult(Intent.createChooser(intent, "File Browser"), 101);
            return true;
        }
    }

    public class d implements f {
        public d() {
        }

        @Override // cf.f
        public void a(String str) {
            WebViewActivity.this.f37196v.setPassword(str);
            WebViewActivity webViewActivity = WebViewActivity.this;
            webViewActivity.q5(webViewActivity.f37196v);
        }
    }

    public class e {
        public Activity activity;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f37203a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f37204b;

            public a(String str, String str2) {
                this.f37203a = str;
                this.f37204b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                WebViewActivity.this.f37196v = new RoomListBean();
                WebViewActivity.this.f37196v.setRoomId(Integer.valueOf(this.f37203a));
                WebViewActivity.this.f37196v.setChatroomId(this.f37203a);
                WebViewActivity.this.f37196v.setCover(this.f37204b);
                ((co.e) WebViewActivity.this.f27702e).b(Integer.valueOf(this.f37203a).intValue());
            }
        }

        public e(Activity activity) {
            this.activity = activity;
        }

        @JavascriptInterface
        public void closeWebView(String str) {
            WebViewActivity.this.finish();
        }

        @JavascriptInterface
        public void toUserHome(String str) {
            if (TextUtils.isEmpty(str) || !t.t0()) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("my_space_uid", Integer.parseInt(str));
            WebViewActivity.this.p5(MySpaceActivity.class, bundle);
        }

        @JavascriptInterface
        public void toVoiceRoom(String str, String str2) {
            this.activity.runOnUiThread(new a(str, str2));
        }
    }

    private void H5() {
        WebSettings settings = this.f37190p.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setDefaultTextEncodingName("utf-8");
        settings.setMixedContentMode(1);
        this.f37190p.setWebViewClient(new b());
        String strL = new x1(MyApplication.j()).l("token");
        if (strL == null) {
            strL = "";
        }
        this.f37190p.loadUrl(this.f37192r + t.d(this.f37192r) + "token=" + strL.replace("Bearer ", ""));
        this.f37190p.addJavascriptInterface(new e(this), "android");
        this.f37190p.setWebChromeClient(new c());
    }

    public final void G5() {
        v5("Page unavailable");
        finish();
    }

    public final void I5(int i10, int i11, Intent intent) {
        Uri[] uriArr;
        if (i10 != 101 || this.f37194t == null) {
            return;
        }
        if (i11 != -1 || intent == null) {
            uriArr = null;
        } else {
            String dataString = intent.getDataString();
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                uriArr = new Uri[clipData.getItemCount()];
                for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                    uriArr[i12] = clipData.getItemAt(i12).getUri();
                }
            } else {
                uriArr = null;
            }
            if (dataString != null) {
                uriArr = new Uri[]{Uri.parse(dataString)};
            }
        }
        this.f37194t.onReceiveValue(uriArr);
        this.f37194t = null;
    }

    @Override // bo.c.b
    public void a(InRoombean inRoombean) {
        if (TextUtils.isEmpty(inRoombean.getIsLock())) {
            q5(this.f37196v);
        } else if (this.f37195u.l("myRoomId").equals(String.valueOf(this.f37196v.getRoomId()))) {
            q5(this.f37196v);
        } else {
            new b.C0752b(this).I(Boolean.TRUE).B(getString(R.string.new_room_password), "", "", getString(R.string.input_room_password), new d(), null, R.layout._xpopup_center_impl_confirm).N();
        }
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_webview;
    }

    @Override // in.a
    public void g5() {
        this.f37188n = (Topbar) findViewById(R.id.common_topbar);
        this.f37189o = (LinearLayout) findViewById(R.id.lin_web);
        this.f37190p = (AutoWebView) findViewById(R.id.webview);
    }

    @Override // in.a
    public void h5() {
        this.f37191q = getIntent().getStringExtra("title");
        this.f37192r = getIntent().getStringExtra("url");
        x1 x1Var = new x1(this);
        this.f37195u = x1Var;
        x1Var.q("main_taskId", getTaskId());
        ImmersionBar.with(this).fitsSystemWindows(false).transparentStatusBar().statusBarDarkFont(true).init();
        t.S0(this.f27688a, this.f37188n, this.f37191q);
        this.f37188n.setTextTextColor(getResources().getColor(R.color.black));
        this.f37188n.setTabBoldGone();
        this.f37188n.setTransparent();
        H5();
        this.f37188n.setOnTopbarLeftClickListener(new a());
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, androidx.fragment.app.d, androidx.activity.d, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 101) {
            if (this.f37193s == null && this.f37194t == null) {
                return;
            }
            Uri data = (intent == null || i11 != -1) ? null : intent.getData();
            if (this.f37194t != null) {
                I5(i10, i11, intent);
                return;
            }
            ValueCallback<Uri> valueCallback = this.f37193s;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(data);
                this.f37193s = null;
            }
        }
    }

    @Override // in.b, in.a, androidx.appcompat.app.e, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f37195u.q("main_taskId", 0);
    }

    @Override // androidx.appcompat.app.e, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!this.f37190p.canGoBack() || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        this.f37190p.goBack();
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || keyEvent.getAction() != 1) {
            return super.onKeyUp(i10, keyEvent);
        }
        this.f37195u.q("main_taskId", 0);
        finish();
        return true;
    }
}
