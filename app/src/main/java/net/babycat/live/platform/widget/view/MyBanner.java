package net.babycat.live.platform.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.youth.banner.Banner;

/* JADX INFO: loaded from: classes3.dex */
public class MyBanner extends Banner {
    public MyBanner(Context context) {
        super(context);
    }

    @Override // com.youth.banner.Banner, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    public MyBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyBanner(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
