package net.babycat.live.platform.widget.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.p0;

/* JADX INFO: loaded from: classes3.dex */
public class MarqueeTextview extends p0 {
    public MarqueeTextview(Context context) {
        super(context);
        initView(context);
    }

    private void initView(Context context) {
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
        setSingleLine(true);
        setMarqueeRepeatLimit(-1);
    }

    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }

    public MarqueeTextview(Context context, @f.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public MarqueeTextview(Context context, @f.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        initView(context);
    }
}
