package net.babycat.live.platform.widget.view;

import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class SpaceItemDecoration extends RecyclerView.o {
    Paint mPaint;
    private int mSpace;

    public SpaceItemDecoration(int i10) {
        this.mSpace = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        super.getItemOffsets(rect, view, recyclerView, c0Var);
        int i10 = this.mSpace;
        rect.right = i10;
        rect.top = i10;
    }
}
