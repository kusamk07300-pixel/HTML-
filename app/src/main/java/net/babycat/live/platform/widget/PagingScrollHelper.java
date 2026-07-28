package net.babycat.live.platform.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class PagingScrollHelper {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f37097k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f37098l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f37100n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f37087a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f37088b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f37089c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37090d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37091e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37092f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f37093g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ValueAnimator f37094h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f37095i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f37096j = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ORIENTATION f37099m = ORIENTATION.HORIZONTAL;

    public enum ORIENTATION {
        HORIZONTAL,
        VERTICAL,
        NULL
    }

    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (PagingScrollHelper.this.f37096j) {
                PagingScrollHelper.this.f37096j = false;
                PagingScrollHelper pagingScrollHelper = PagingScrollHelper.this;
                pagingScrollHelper.f37092f = pagingScrollHelper.f37090d;
                PagingScrollHelper pagingScrollHelper2 = PagingScrollHelper.this;
                pagingScrollHelper2.f37093g = pagingScrollHelper2.f37091e;
            }
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                PagingScrollHelper.this.f37096j = true;
            }
            return false;
        }
    }

    public class b extends RecyclerView.s {

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (PagingScrollHelper.this.f37099m == ORIENTATION.VERTICAL) {
                    PagingScrollHelper.this.f37087a.scrollBy(0, iIntValue - PagingScrollHelper.this.f37090d);
                } else {
                    PagingScrollHelper.this.f37087a.scrollBy(iIntValue - PagingScrollHelper.this.f37091e, 0);
                }
            }
        }

        /* JADX INFO: renamed from: net.babycat.live.platform.widget.PagingScrollHelper$b$b, reason: collision with other inner class name */
        public class C0453b extends AnimatorListenerAdapter {
            public C0453b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                int iP = PagingScrollHelper.this.p();
                if (PagingScrollHelper.this.f37098l != iP) {
                    if (PagingScrollHelper.this.f37097k != null) {
                        PagingScrollHelper.this.f37097k.a(iP);
                    }
                    PagingScrollHelper.this.f37098l = iP;
                }
                PagingScrollHelper.this.f37087a.stopScroll();
                PagingScrollHelper pagingScrollHelper = PagingScrollHelper.this;
                pagingScrollHelper.f37092f = pagingScrollHelper.f37090d;
                PagingScrollHelper pagingScrollHelper2 = PagingScrollHelper.this;
                pagingScrollHelper2.f37093g = pagingScrollHelper2.f37091e;
            }
        }

        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public boolean onFling(int i10, int i11) {
            int width;
            int i12;
            if (PagingScrollHelper.this.f37099m == ORIENTATION.NULL) {
                return false;
            }
            int iQ = PagingScrollHelper.this.q();
            if (PagingScrollHelper.this.f37099m == ORIENTATION.VERTICAL) {
                i12 = PagingScrollHelper.this.f37090d;
                if (i11 < 0) {
                    iQ--;
                } else if (i11 > 0) {
                    iQ++;
                }
                width = iQ * PagingScrollHelper.this.f37087a.getHeight();
            } else {
                int i13 = PagingScrollHelper.this.f37091e;
                if (i10 < 0) {
                    iQ--;
                } else if (i10 > 0) {
                    iQ++;
                }
                width = iQ * PagingScrollHelper.this.f37087a.getWidth();
                i12 = i13;
            }
            int i14 = width >= 0 ? width : 0;
            PagingScrollHelper pagingScrollHelper = PagingScrollHelper.this;
            ValueAnimator valueAnimator = pagingScrollHelper.f37094h;
            if (valueAnimator == null) {
                pagingScrollHelper.f37094h = ValueAnimator.ofInt(i12, i14);
                PagingScrollHelper.this.f37094h.setDuration(200L);
                PagingScrollHelper.this.f37094h.addUpdateListener(new a());
                PagingScrollHelper.this.f37094h.addListener(new C0453b());
            } else {
                valueAnimator.cancel();
                PagingScrollHelper.this.f37094h.setIntValues(i12, i14);
            }
            PagingScrollHelper.this.f37094h.start();
            return true;
        }
    }

    public class c extends RecyclerView.u {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            if (i10 != 0 || PagingScrollHelper.this.f37099m == ORIENTATION.NULL) {
                return;
            }
            int i11 = 0;
            if (PagingScrollHelper.this.f37099m == ORIENTATION.VERTICAL) {
                if (Math.abs(PagingScrollHelper.this.f37090d - PagingScrollHelper.this.f37092f) > recyclerView.getHeight() / 2) {
                    if (PagingScrollHelper.this.f37090d - PagingScrollHelper.this.f37092f < 0) {
                        i = -1000;
                    }
                }
                PagingScrollHelper.this.f37089c.onFling(i11, i);
            }
            if (Math.abs(PagingScrollHelper.this.f37091e - PagingScrollHelper.this.f37093g) > recyclerView.getWidth() / 2) {
                i11 = PagingScrollHelper.this.f37091e - PagingScrollHelper.this.f37093g < 0 ? -1000 : 1000;
            }
            i = 0;
            PagingScrollHelper.this.f37089c.onFling(i11, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            PagingScrollHelper.this.f37090d += i11;
            PagingScrollHelper.this.f37091e += i10;
        }
    }

    public interface d {
        void a(int i10);
    }

    public void n() {
        if (this.f37099m == ORIENTATION.VERTICAL) {
            RecyclerView recyclerView = this.f37087a;
            if (recyclerView == null || this.f37090d == recyclerView.getHeight() * this.f37100n) {
                return;
            }
            this.f37091e = this.f37087a.getHeight() * this.f37100n;
            this.f37087a.scrollTo(0, this.f37090d);
            return;
        }
        RecyclerView recyclerView2 = this.f37087a;
        if (recyclerView2 == null || this.f37091e == recyclerView2.getWidth() * this.f37100n) {
            return;
        }
        int width = this.f37087a.getWidth() * this.f37100n;
        this.f37091e = width;
        this.f37087a.scrollTo(width, 0);
    }

    public int o() {
        ORIENTATION orientation;
        RecyclerView recyclerView = this.f37087a;
        if (recyclerView == null || (orientation = this.f37099m) == ORIENTATION.NULL) {
            return 0;
        }
        if (orientation == ORIENTATION.VERTICAL && recyclerView.computeVerticalScrollExtent() != 0) {
            return this.f37087a.computeVerticalScrollRange() / this.f37087a.computeVerticalScrollExtent();
        }
        if (this.f37087a.computeHorizontalScrollExtent() != 0) {
            return this.f37087a.computeHorizontalScrollRange() / this.f37087a.computeHorizontalScrollExtent();
        }
        return 0;
    }

    public final int p() {
        if (this.f37087a.getHeight() == 0 || this.f37087a.getWidth() == 0) {
            return 0;
        }
        return this.f37099m == ORIENTATION.VERTICAL ? this.f37090d / this.f37087a.getHeight() : this.f37091e / this.f37087a.getWidth();
    }

    public final int q() {
        if (this.f37087a.getHeight() == 0 || this.f37087a.getWidth() == 0) {
            return 0;
        }
        return this.f37099m == ORIENTATION.VERTICAL ? this.f37092f / this.f37087a.getHeight() : this.f37093g / this.f37087a.getWidth();
    }

    public void r(int i10) {
        this.f37100n = i10;
        if (this.f37094h == null) {
            this.f37089c.onFling(0, 0);
        }
        if (this.f37094h != null) {
            ORIENTATION orientation = this.f37099m;
            ORIENTATION orientation2 = ORIENTATION.VERTICAL;
            int i11 = orientation == orientation2 ? this.f37090d : this.f37091e;
            int height = (orientation == orientation2 ? this.f37087a.getHeight() : this.f37087a.getWidth()) * i10;
            if (i11 != height) {
                this.f37094h.setIntValues(i11, height);
                this.f37094h.start();
            }
        }
    }

    public void s(d dVar) {
        this.f37097k = dVar;
    }

    public void t(RecyclerView recyclerView) {
        if (recyclerView == null) {
            throw new IllegalArgumentException("recycleView must be not null");
        }
        this.f37087a = recyclerView;
        recyclerView.setOnFlingListener(this.f37089c);
        recyclerView.addOnScrollListener(this.f37088b);
        recyclerView.setOnTouchListener(this.f37095i);
        u();
    }

    public void u() {
        RecyclerView.p layoutManager = this.f37087a.getLayoutManager();
        if (layoutManager != null) {
            if (layoutManager.canScrollVertically()) {
                this.f37099m = ORIENTATION.VERTICAL;
            } else if (layoutManager.canScrollHorizontally()) {
                this.f37099m = ORIENTATION.HORIZONTAL;
            } else {
                this.f37099m = ORIENTATION.NULL;
            }
            ValueAnimator valueAnimator = this.f37094h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f37093g = 0;
            this.f37092f = 0;
            this.f37091e = 0;
            this.f37090d = 0;
        }
    }
}
