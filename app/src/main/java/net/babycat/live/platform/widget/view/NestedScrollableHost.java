package net.babycat.live.platform.widget.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import f.n0;
import f.p0;

/* JADX INFO: loaded from: classes3.dex */
public class NestedScrollableHost extends FrameLayout {
    private float initialX;
    private float initialY;
    private boolean isChildHasSameDirection;
    private int touchSlop;

    public NestedScrollableHost(@n0 Context context) {
        super(context, null);
        this.isChildHasSameDirection = true;
        this.touchSlop = 0;
        this.initialX = 0.0f;
        this.initialY = 0.0f;
    }

    @SuppressLint({"NewApi"})
    private boolean canChildScroll(int i10, Float f10) {
        View childView = getChildView();
        if (childView == null) {
            return false;
        }
        int i11 = -((int) Math.signum(f10.floatValue()));
        if (i10 == 0) {
            return childView.canScrollHorizontally(i11);
        }
        if (i10 != 1) {
            return false;
        }
        return childView.canScrollVertically(i11);
    }

    private void handleInterceptTouchEvent(MotionEvent motionEvent) {
        ViewPager2 parentViewPager = getParentViewPager();
        if (parentViewPager != null) {
            int orientation = parentViewPager.getOrientation();
            int i10 = this.isChildHasSameDirection ? orientation : orientation == 0 ? 1 : 0;
            if (canChildScroll(i10, Float.valueOf(-1.0f)) || canChildScroll(i10, Float.valueOf(1.0f))) {
                if (motionEvent.getAction() == 0) {
                    this.initialX = motionEvent.getX();
                    this.initialY = motionEvent.getY();
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return;
                }
                if (motionEvent.getAction() == 2) {
                    float x10 = motionEvent.getX() - this.initialX;
                    float y10 = motionEvent.getY() - this.initialY;
                    boolean z10 = orientation == 0;
                    float fAbs = Math.abs(x10) * (z10 ? 0.5f : 1.0f);
                    float fAbs2 = Math.abs(y10) * (z10 ? 1.0f : 0.5f);
                    int i11 = this.touchSlop;
                    if (fAbs > i11 || fAbs2 > i11) {
                        if (z10 == (fAbs2 > fAbs)) {
                            getParent().requestDisallowInterceptTouchEvent(false);
                            return;
                        }
                        if (!z10) {
                            x10 = y10;
                        }
                        if (canChildScroll(orientation, Float.valueOf(x10))) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        } else {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        }
                    }
                }
            }
        }
    }

    public View getChildView() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    public final ViewPager2 getParentViewPager() {
        View view;
        Object parent = getParent();
        if (!(parent instanceof View)) {
            parent = null;
        }
        while (true) {
            view = (View) parent;
            if (view == null || (view instanceof ViewPager2)) {
                break;
            }
            parent = view.getParent();
            if (!(parent instanceof View)) {
                parent = null;
            }
        }
        return (ViewPager2) (view instanceof ViewPager2 ? view : null);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        handleInterceptTouchEvent(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public NestedScrollableHost(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"NewApi"})
    public NestedScrollableHost(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.isChildHasSameDirection = true;
        this.touchSlop = 0;
        this.initialX = 0.0f;
        this.initialY = 0.0f;
        this.touchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}
