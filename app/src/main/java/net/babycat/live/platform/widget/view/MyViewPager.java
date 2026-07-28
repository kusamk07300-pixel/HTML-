package net.babycat.live.platform.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import net.babycat.live.R;

/* JADX INFO: loaded from: classes3.dex */
public class MyViewPager extends ViewPager {
    private boolean mCanScroll;

    public MyViewPager(Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.mCanScroll) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mCanScroll) {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void setCanScroll(boolean z10) {
        this.mCanScroll = z10;
    }

    public MyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MyViewPager);
        this.mCanScroll = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
