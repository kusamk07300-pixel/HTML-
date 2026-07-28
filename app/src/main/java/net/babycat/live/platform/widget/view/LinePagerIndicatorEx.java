package net.babycat.live.platform.widget.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import eo.b;
import java.util.Arrays;
import java.util.List;
import jo.c;
import net.babycat.live.platform.util.t;

/* JADX INFO: loaded from: classes3.dex */
public class LinePagerIndicatorEx extends View implements c {
    public static final int MODE_EXACTLY = 2;
    public static final int MODE_MATCH_EDGE = 0;
    public static final int MODE_WRAP_CONTENT = 1;
    private List<Integer> mColors;
    private Interpolator mEndInterpolator;
    private float mLineHeight;
    private RectF mLineRect;
    private float mLineWidth;
    private int mMode;
    private Paint mPaint;
    private List<lo.a> mPositionDataList;
    private float mRoundRadius;
    private Interpolator mStartInterpolator;
    private float mXOffset;
    private float mYOffset;

    public LinePagerIndicatorEx(Context context) {
        super(context);
        this.mStartInterpolator = new LinearInterpolator();
        this.mEndInterpolator = new LinearInterpolator();
        this.mLineRect = new RectF();
        init(context);
    }

    private void init(Context context) {
        Paint paint = new Paint(1);
        this.mPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mLineHeight = t.i(3.0f);
        this.mLineWidth = t.i(10.0f);
    }

    public List<Integer> getColors() {
        return this.mColors;
    }

    public Interpolator getEndInterpolator() {
        return this.mEndInterpolator;
    }

    public float getLineHeight() {
        return this.mLineHeight;
    }

    public RectF getLineRect() {
        return this.mLineRect;
    }

    public float getLineWidth() {
        return this.mLineWidth;
    }

    public int getMode() {
        return this.mMode;
    }

    public Paint getPaint() {
        return this.mPaint;
    }

    public float getRoundRadius() {
        return this.mRoundRadius;
    }

    public Interpolator getStartInterpolator() {
        return this.mStartInterpolator;
    }

    public float getXOffset() {
        return this.mXOffset;
    }

    public float getYOffset() {
        return this.mYOffset;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.mLineRect;
        float f10 = this.mRoundRadius;
        canvas.drawRoundRect(rectF, f10, f10, this.mPaint);
    }

    @Override // jo.c
    public void onPageScrollStateChanged(int i10) {
    }

    @Override // jo.c
    public void onPageScrolled(int i10, float f10, int i11) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i12;
        List<lo.a> list = this.mPositionDataList;
        if (list == null || list.isEmpty()) {
            return;
        }
        List<Integer> list2 = this.mColors;
        if (list2 != null && list2.size() > 0) {
            this.mPaint.setColor(go.a.a(f10, this.mColors.get(Math.abs(i10) % this.mColors.size()).intValue(), this.mColors.get(Math.abs(i10 + 1) % this.mColors.size()).intValue()));
        }
        lo.a aVarH = b.h(this.mPositionDataList, i10);
        lo.a aVarH2 = b.h(this.mPositionDataList, i10 + 1);
        int i13 = this.mMode;
        if (i13 == 0) {
            float f16 = aVarH.mLeft;
            f15 = this.mXOffset;
            f11 = f16 + f15;
            f14 = aVarH2.mLeft + f15;
            f12 = aVarH.mRight - f15;
            i12 = aVarH2.mRight;
        } else {
            if (i13 != 1) {
                f11 = aVarH.mLeft + ((aVarH.f() - this.mLineWidth) / 2.0f);
                float f17 = aVarH2.mLeft + ((aVarH2.f() - this.mLineWidth) / 2.0f);
                f12 = ((aVarH.f() + this.mLineWidth) / 2.0f) + aVarH.mLeft;
                f13 = ((aVarH2.f() + this.mLineWidth) / 2.0f) + aVarH2.mLeft;
                f14 = f17;
                this.mLineRect.left = f11 + ((f14 - f11) * this.mStartInterpolator.getInterpolation(f10));
                this.mLineRect.right = f12 + ((f13 - f12) * this.mEndInterpolator.getInterpolation(f10));
                this.mLineRect.top = (getHeight() - this.mLineHeight) - this.mYOffset;
                this.mLineRect.bottom = getHeight() - this.mYOffset;
                invalidate();
            }
            float f18 = aVarH.mContentLeft;
            f15 = this.mXOffset;
            f11 = f18 + f15;
            f14 = aVarH2.mContentLeft + f15;
            f12 = aVarH.mContentRight - f15;
            i12 = aVarH2.mContentRight;
        }
        f13 = i12 - f15;
        this.mLineRect.left = f11 + ((f14 - f11) * this.mStartInterpolator.getInterpolation(f10));
        this.mLineRect.right = f12 + ((f13 - f12) * this.mEndInterpolator.getInterpolation(f10));
        this.mLineRect.top = (getHeight() - this.mLineHeight) - this.mYOffset;
        this.mLineRect.bottom = getHeight() - this.mYOffset;
        invalidate();
    }

    @Override // jo.c
    public void onPageSelected(int i10) {
    }

    @Override // jo.c
    public void onPositionDataProvide(List<lo.a> list) {
        this.mPositionDataList = list;
    }

    public void setColors(Integer... numArr) {
        this.mColors = Arrays.asList(numArr);
    }

    public void setEndInterpolator(Interpolator interpolator) {
        this.mEndInterpolator = interpolator;
        if (interpolator == null) {
            this.mEndInterpolator = new LinearInterpolator();
        }
    }

    public void setLineHeight(float f10) {
        this.mLineHeight = f10;
    }

    public void setLineWidth(float f10) {
        this.mLineWidth = f10;
    }

    public void setMode(int i10) {
        if (i10 == 2 || i10 == 0 || i10 == 1) {
            this.mMode = i10;
            return;
        }
        throw new IllegalArgumentException("mode " + i10 + " not supported.");
    }

    public void setRoundRadius(float f10) {
        this.mRoundRadius = f10;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.mStartInterpolator = interpolator;
        if (interpolator == null) {
            this.mStartInterpolator = new LinearInterpolator();
        }
    }

    public void setXOffset(float f10) {
        this.mXOffset = f10;
    }

    public void setYOffset(float f10) {
        this.mYOffset = f10;
    }
}
