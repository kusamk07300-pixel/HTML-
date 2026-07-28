package net.babycat.live.platform.widget.view;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import f.p0;

/* JADX INFO: loaded from: classes3.dex */
public class CustomScrollLayoutManager extends LinearLayoutManager {
    public CustomScrollLayoutManager(Context context) {
        super(context, 0, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i10) {
        r rVar = new r(recyclerView.getContext()) { // from class: net.babycat.live.platform.widget.view.CustomScrollLayoutManager.1
            @Override // androidx.recyclerview.widget.r
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 50.0f / displayMetrics.density;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.b0
            @p0
            public PointF computeScrollVectorForPosition(int i11) {
                return CustomScrollLayoutManager.this.computeScrollVectorForPosition(i11);
            }
        };
        rVar.setTargetPosition(i10);
        startSmoothScroll(rVar);
    }
}
