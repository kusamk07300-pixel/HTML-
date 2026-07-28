package net.babycat.live.platform.widget.chat;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import f.n0;
import f.p0;
import to.k;

/* JADX INFO: loaded from: classes3.dex */
public class SmoothScrollRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f37121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f37122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public VelocityTracker f37125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f37127g;

    public class a extends RecyclerView.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f37128a;

        /* JADX INFO: renamed from: net.babycat.live.platform.widget.chat.SmoothScrollRecyclerView$a$a, reason: collision with other inner class name */
        public class C0454a extends EdgeEffect {
            public C0454a(Context context) {
                super(context);
            }

            @Override // android.widget.EdgeEffect
            public boolean draw(Canvas canvas) {
                return false;
            }
        }

        public a(Context context) {
            this.f37128a = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        @n0
        @k
        public EdgeEffect createEdgeEffect(@n0 @k RecyclerView recyclerView, int i10) {
            return new C0454a(this.f37128a);
        }
    }

    public SmoothScrollRecyclerView(@n0 @k Context context) {
        super(context);
        c(context);
    }

    private void c(Context context) {
        setEdgeEffectFactory(new a(context));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        if (viewConfiguration != null) {
            this.f37126f = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f37127g = viewConfiguration.getScaledTouchSlop();
        } else {
            this.f37126f = 200;
            this.f37127g = 8;
        }
    }

    public final void b() {
        VelocityTracker velocityTracker = this.f37125e;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000);
            float yVelocity = this.f37125e.getYVelocity();
            getParent().requestDisallowInterceptTouchEvent(false);
            if (Math.abs(yVelocity) > this.f37126f) {
                wo.b.b("Fast scroll end: allow parent intercept", new Object[0]);
            } else {
                wo.b.b("Scroll end: allow item click", new Object[0]);
            }
            this.f37124d = false;
            this.f37125e.recycle();
            this.f37125e = null;
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (this.f37125e == null) {
            this.f37125e = VelocityTracker.obtain();
        }
        this.f37125e.addMovement(motionEvent);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return 0.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VelocityTracker velocityTracker = this.f37125e;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f37125e = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r6.d(r7)
            int r0 = r7.getAction()
            r1 = 0
            if (r0 == 0) goto L83
            r2 = 1
            if (r0 == r2) goto L7f
            r3 = 2
            if (r0 == r3) goto L15
            r1 = 3
            if (r0 == r1) goto L7f
            goto L9a
        L15:
            boolean r0 = r6.f37124d
            if (r0 != 0) goto L4d
            float r0 = r7.getX()
            float r3 = r6.f37121a
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            float r3 = r7.getY()
            float r4 = r6.f37122b
            float r3 = r3 - r4
            float r3 = java.lang.Math.abs(r3)
            int r4 = r6.f37127g
            float r5 = (float) r4
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L3d
            float r4 = (float) r4
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L3c
            goto L3d
        L3c:
            return r1
        L3d:
            r6.f37124d = r2
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L4b
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            return r1
        L4b:
            r6.f37123c = r2
        L4d:
            boolean r0 = r6.f37123c
            if (r0 == 0) goto L9a
            r0 = -1
            boolean r0 = r6.canScrollVertically(r0)
            boolean r3 = r6.canScrollVertically(r2)
            float r4 = r7.getY()
            float r5 = r6.f37122b
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L66
            r4 = 1
            goto L67
        L66:
            r4 = 0
        L67:
            if (r4 == 0) goto L6b
            if (r0 == 0) goto L6f
        L6b:
            if (r4 != 0) goto L77
            if (r3 != 0) goto L77
        L6f:
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L9a
        L77:
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            goto L9a
        L7f:
            r6.b()
            goto L9a
        L83:
            float r0 = r7.getX()
            r6.f37121a = r0
            float r0 = r7.getY()
            r6.f37122b = r0
            r6.f37123c = r1
            r6.f37124d = r1
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
        L9a:
            boolean r7 = super.onInterceptTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: net.babycat.live.platform.widget.chat.SmoothScrollRecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            b();
        }
        return super.onTouchEvent(motionEvent);
    }

    public SmoothScrollRecyclerView(@n0 @k Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
    }

    public SmoothScrollRecyclerView(@n0 @k Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c(context);
    }
}
