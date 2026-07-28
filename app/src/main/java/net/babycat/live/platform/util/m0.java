package net.babycat.live.platform.util;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class m0 extends RecyclerView.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36847a;

    public m0(int i10, Context context) {
        this.f36847a = a(i10, context);
    }

    public int a(float f10, Context context) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(@f.n0 Rect rect, @f.n0 View view, @f.n0 RecyclerView recyclerView, @f.n0 RecyclerView.c0 c0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int itemCount = recyclerView.getAdapter().getItemCount();
        if (childAdapterPosition == 0) {
            rect.left = 0;
            rect.right = this.f36847a / 2;
        } else if (childAdapterPosition == itemCount - 1) {
            rect.left = this.f36847a / 2;
            rect.right = 0;
        } else {
            int i10 = this.f36847a;
            rect.left = i10 / 2;
            rect.right = i10 / 2;
        }
    }
}
