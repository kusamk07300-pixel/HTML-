package net.babycat.live.platform.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import f.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.babycat.live.R;

/* JADX INFO: loaded from: classes3.dex */
public class WaveViews extends View {
    private static final String TAG = "WaveView";
    private final List<Circle> mCircleList;
    private final Runnable mCreateCircle;
    private long mDuration;
    private float mInitialRadius;
    private Interpolator mInterpolator;
    private boolean mIsRunning;
    private long mLastCreateTime;
    private float mMaxRadius;
    private float mMaxRadiusRate;
    private boolean mMaxRadiusSet;
    private Paint mPaint;
    private int mSpeed;

    public class Circle {
        private final long mCreateTime = System.currentTimeMillis();

        public Circle() {
        }

        public int getAlpha() {
            return (int) (255.0f - (WaveViews.this.mInterpolator.getInterpolation((getCurrentRadius() - WaveViews.this.mInitialRadius) / (WaveViews.this.mMaxRadius - WaveViews.this.mInitialRadius)) * 255.0f));
        }

        public float getCurrentRadius() {
            return WaveViews.this.mInitialRadius + (WaveViews.this.mInterpolator.getInterpolation(((System.currentTimeMillis() - this.mCreateTime) * 1.0f) / WaveViews.this.mDuration) * (WaveViews.this.mMaxRadius - WaveViews.this.mInitialRadius));
        }
    }

    public WaveViews(Context context) {
        this(context, null);
    }

    private void clear() {
        removeCallbacks(this.mCreateCircle);
        this.mCircleList.clear();
    }

    private void init(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.wave_view);
        this.mInitialRadius = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        if (dimensionPixelOffset != 0) {
            this.mMaxRadius = dimensionPixelOffset;
            this.mMaxRadiusSet = true;
        }
        this.mDuration = typedArrayObtainStyledAttributes.getInteger(3, 1500);
        this.mSpeed = typedArrayObtainStyledAttributes.getInteger(4, 600);
        Paint paint = new Paint(1);
        this.mPaint = paint;
        paint.setColor(typedArrayObtainStyledAttributes.getColor(2, getResources().getColor(qmyy.babycat.live.R.color.colorAccent)));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void newCircle() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.mLastCreateTime < this.mSpeed) {
            return;
        }
        this.mCircleList.add(new Circle());
        invalidate();
        this.mLastCreateTime = jCurrentTimeMillis;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clear();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Iterator<Circle> it = this.mCircleList.iterator();
        while (it.hasNext()) {
            Circle next = it.next();
            float currentRadius = next.getCurrentRadius();
            if (System.currentTimeMillis() - next.mCreateTime < this.mDuration) {
                this.mPaint.setAlpha(next.getAlpha());
                canvas.drawCircle(getWidth() >> 1, getHeight() >> 1, currentRadius, this.mPaint);
            } else {
                it.remove();
            }
        }
        if (this.mCircleList.size() > 0) {
            postInvalidateDelayed(10L);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (this.mMaxRadiusSet) {
            return;
        }
        this.mMaxRadius = (Math.min(i10, i11) * this.mMaxRadiusRate) / 2.0f;
    }

    public void setColor(@l int i10) {
        this.mPaint.setColor(i10);
    }

    public void setDuration(long j10) {
        this.mDuration = j10;
    }

    public void setInitialRadius(float f10) {
        this.mInitialRadius = f10;
    }

    public void setInterpolator(Interpolator interpolator) {
        this.mInterpolator = interpolator;
        if (interpolator == null) {
            this.mInterpolator = new LinearInterpolator();
        }
    }

    public void setMaxRadius(float f10) {
        this.mMaxRadius = f10;
        this.mMaxRadiusSet = true;
    }

    public void setMaxRadiusRate(float f10) {
        this.mMaxRadiusRate = f10;
    }

    public void setSpeed(int i10) {
        this.mSpeed = i10;
    }

    public void setStyle(Paint.Style style) {
        this.mPaint.setStyle(style);
    }

    public void start() {
        if (this.mIsRunning) {
            return;
        }
        this.mIsRunning = true;
        this.mCreateCircle.run();
    }

    public void stop() {
        this.mIsRunning = false;
    }

    public void stopImmediately() {
        this.mIsRunning = false;
        this.mCircleList.clear();
        invalidate();
    }

    public WaveViews(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public WaveViews(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mMaxRadius = 0.0f;
        this.mDuration = 3200L;
        this.mSpeed = 800;
        this.mMaxRadiusRate = 1.0f;
        this.mCircleList = new ArrayList((int) ((this.mDuration / ((long) this.mSpeed)) + 1));
        this.mCreateCircle = new Runnable() { // from class: net.babycat.live.platform.widget.view.WaveViews.1
            @Override // java.lang.Runnable
            public void run() {
                if (WaveViews.this.mIsRunning) {
                    WaveViews.this.newCircle();
                    WaveViews waveViews = WaveViews.this;
                    waveViews.postDelayed(waveViews.mCreateCircle, WaveViews.this.mSpeed);
                }
            }
        };
        this.mInterpolator = new LinearInterpolator();
        this.mPaint = new Paint(1);
        init(attributeSet);
    }
}
