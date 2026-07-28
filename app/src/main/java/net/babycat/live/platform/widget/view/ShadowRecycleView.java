package net.babycat.live.platform.widget.view;

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
import to.l;
import wo.b;

/* JADX INFO: loaded from: classes3.dex */
public class ShadowRecycleView extends RecyclerView {
    private float initialX;
    private float initialY;
    private boolean isScrollingVertically;
    private int minFlingVelocity;
    private VelocityTracker velocityTracker;

    public ShadowRecycleView(@n0 @k Context context) {
        super(context);
        this.isScrollingVertically = false;
        ini();
    }

    private void ini() {
        setEdgeEffectFactory(new RecyclerView.l() { // from class: net.babycat.live.platform.widget.view.ShadowRecycleView.1
            @Override // androidx.recyclerview.widget.RecyclerView.l
            @n0
            @k
            public EdgeEffect createEdgeEffect(@n0 @k RecyclerView recyclerView, int i10) {
                return new EdgeEffect(ShadowRecycleView.this.getContext()) { // from class: net.babycat.live.platform.widget.view.ShadowRecycleView.1.1
                    @Override // android.widget.EdgeEffect
                    public boolean draw(Canvas canvas) {
                        return false;
                    }
                };
            }
        });
        this.minFlingVelocity = ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.babycat.live.platform.widget.view.ShadowRecycleView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            this.velocityTracker.computeCurrentVelocity(1000);
            if (Math.abs(this.velocityTracker.getYVelocity()) > this.minFlingVelocity) {
                getParent().requestDisallowInterceptTouchEvent(false);
                b.b("CustomRecyclerView:Fast scroll detected, allowing parent to intercept", new Object[0]);
            } else {
                getParent().requestDisallowInterceptTouchEvent(true);
                b.b("CustomRecyclerView:Slow scroll detected, keeping current RecyclerView handling", new Object[0]);
            }
            VelocityTracker velocityTracker = this.velocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.velocityTracker = null;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public ShadowRecycleView(@n0 @k Context context, @l @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isScrollingVertically = false;
        ini();
    }
}
