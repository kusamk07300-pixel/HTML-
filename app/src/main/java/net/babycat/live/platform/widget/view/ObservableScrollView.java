package net.babycat.live.platform.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes3.dex */
public class ObservableScrollView extends NestedScrollView {
    private ScrollViewListener scrollViewListener;

    public interface ScrollViewListener {
        void onScrollChanged(ObservableScrollView observableScrollView, int i10, int i11, int i12, int i13);
    }

    public ObservableScrollView(Context context) {
        super(context);
        this.scrollViewListener = null;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        ScrollViewListener scrollViewListener = this.scrollViewListener;
        if (scrollViewListener != null) {
            scrollViewListener.onScrollChanged(this, i10, i11, i12, i13);
        }
    }

    public void setScrollViewListener(ScrollViewListener scrollViewListener) {
        this.scrollViewListener = scrollViewListener;
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.scrollViewListener = null;
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.scrollViewListener = null;
    }
}
