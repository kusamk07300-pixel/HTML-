package net.babycat.live.platform.util;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes3.dex */
public class j0 extends RecyclerView.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f36815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36819e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36820f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f36821g;

    public j0(Context context, int i10, int i11, int i12) {
        this.f36815a = context;
        this.f36816b = i10;
        this.f36817c = i11;
        this.f36818d = i12;
    }

    public final int a() {
        try {
            return ((c() - (this.f36816b * 2)) / this.f36819e) - 40;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public final int b(View view) {
        int i10 = view.getLayoutParams().width;
        int i11 = view.getLayoutParams().height;
        int iC = c();
        int i12 = this.f36819e;
        int i13 = iC - (i10 * i12);
        if (i11 >= 0 && i10 >= 0 && i13 > (i12 - 1) * this.f36816b) {
            return i13;
        }
        view.getLayoutParams().width = a();
        view.getLayoutParams().height = a();
        return iC - (view.getLayoutParams().width * this.f36819e);
    }

    public final int c() {
        int i10 = this.f36820f;
        if (i10 > 0) {
            return i10;
        }
        int i11 = this.f36815a.getResources().getDisplayMetrics().widthPixels > this.f36815a.getResources().getDisplayMetrics().heightPixels ? this.f36815a.getResources().getDisplayMetrics().heightPixels : this.f36815a.getResources().getDisplayMetrics().widthPixels;
        this.f36820f = i11;
        return i11;
    }

    public final int d(RecyclerView recyclerView) {
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).c0();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).O();
        }
        return -1;
    }

    public final boolean e(RecyclerView recyclerView, int i10, int i11) {
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        return layoutManager instanceof GridLayoutManager ? i10 % i11 == 0 : (layoutManager instanceof StaggeredGridLayoutManager) && ((StaggeredGridLayoutManager) layoutManager).getOrientation() == 1 && i10 % i11 == 0;
    }

    public final boolean f(RecyclerView recyclerView, int i10, int i11, int i12) {
        return (recyclerView.getLayoutManager() instanceof GridLayoutManager) && (i10 / i11) + 1 == 1;
    }

    public final boolean g(RecyclerView recyclerView, int i10, int i11) {
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        return layoutManager instanceof GridLayoutManager ? (i10 + 1) % i11 == 0 : (layoutManager instanceof StaggeredGridLayoutManager) && ((StaggeredGridLayoutManager) layoutManager).getOrientation() == 1 && (i10 + 1) % i11 == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        super.getItemOffsets(rect, view, recyclerView, c0Var);
        int iD = ((RecyclerView.q) view.getLayoutParams()).d();
        this.f36819e = d(recyclerView);
        int itemCount = recyclerView.getAdapter().getItemCount();
        int iB = b(view);
        int i10 = this.f36816b;
        int i11 = this.f36819e;
        int i12 = iB / i11;
        int i13 = (iB - (i10 * 2)) / (i11 - 1);
        int i14 = ((iD % i11) * (i13 - i12)) + i10;
        int i15 = i12 - i14;
        int i16 = i13 / 2;
        int i17 = (this.f36817c <= 0 || !f(recyclerView, iD, i11, itemCount)) ? 0 : this.f36817c;
        if (h(recyclerView, iD, this.f36819e, itemCount) && (i16 = this.f36818d) < 0) {
            i16 = 0;
        }
        rect.set(i14, i17, i15, i16);
    }

    public final boolean h(RecyclerView recyclerView, int i10, int i11, int i12) {
        if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
            int i13 = i12 % i11;
            int i14 = i12 / i11;
            if (i13 != 0) {
                i14++;
            }
            if (i14 == (i10 / i11) + 1) {
                return true;
            }
        }
        return false;
    }

    public void i(int i10) {
        this.f36817c = i10;
    }

    public void j(int i10) {
        this.f36821g = i10;
    }

    public void k(int i10) {
        this.f36818d = i10;
    }
}
