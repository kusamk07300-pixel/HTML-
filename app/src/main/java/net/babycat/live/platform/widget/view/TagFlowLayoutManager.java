package net.babycat.live.platform.widget.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class TagFlowLayoutManager extends RecyclerView.p {
    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollVertically() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateDefaultLayoutParams() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutChildren(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        int i10;
        int i11;
        detachAndScrapAttachedViews(xVar);
        if (getItemCount() == 0 || c0Var.j()) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int i12 = paddingLeft;
        int iMax = 0;
        int i13 = 0;
        while (i13 < getItemCount()) {
            int i14 = paddingTop;
            View viewP = xVar.p(i13);
            addView(viewP);
            measureChildWithMargins(viewP, 0, 0);
            int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewP);
            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewP);
            if (i12 + decoratedMeasuredWidth <= width || i12 <= paddingLeft) {
                i10 = iMax;
                i11 = i14;
            } else {
                i11 = i14 + iMax;
                i12 = paddingLeft;
                i10 = 0;
            }
            int i15 = i12 + decoratedMeasuredWidth;
            layoutDecoratedWithMargins(viewP, i12, i11, i15, i11 + decoratedMeasuredHeight);
            i13++;
            paddingTop = i11;
            i12 = i15;
            iMax = Math.max(i10, decoratedMeasuredHeight);
        }
    }
}
