package net.babycat.live.platform.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import f.n0;
import f.p0;

/* JADX INFO: loaded from: classes3.dex */
public class CustomScrollRecyclerView extends RecyclerView {
    public CustomScrollRecyclerView(@n0 Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public CustomScrollRecyclerView(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomScrollRecyclerView(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
