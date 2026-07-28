package net.babycat.live.platform.widget.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import kotlin.jvm.internal.g0;
import me.jessyan.autosize.AutoSize;
import to.k;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoWebView extends WebView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoWebView(@k Context context) {
        super(context);
        g0.p(context, "context");
    }

    @Override // android.webkit.WebView, android.view.View
    public void setOverScrollMode(int i10) {
        super.setOverScrollMode(i10);
        Context context = getContext();
        g0.n(context, "null cannot be cast to non-null type android.app.Activity");
        AutoSize.autoConvertDensityOfGlobal((Activity) context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoWebView(@k Context context, @k AttributeSet attrs) {
        super(context, attrs);
        g0.p(context, "context");
        g0.p(attrs, "attrs");
    }
}
