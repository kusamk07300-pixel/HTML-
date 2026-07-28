package net.babycat.live.platform.widget.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import f.p0;
import net.babycat.live.R;

/* JADX INFO: loaded from: classes3.dex */
public class VerticalProgress extends View {
    private int mBorderColorResId;
    private boolean mBorderEnable;
    private int mBorderWidth;
    private int mEndResId;
    private boolean mGradientEnable;
    private int mHeight;
    private Paint mPaint;
    private int mProgress;
    private int mProgressBgColorId;
    private int mRadius;
    private RectF mRectF;
    private int mStartResId;
    private int mWidth;
    private int max;

    public VerticalProgress(Context context) {
        super(context);
        this.mProgress = 0;
        this.max = 100;
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes;
        if (attributeSet != null) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.verticalProgress);
            this.mRadius = typedArrayObtainStyledAttributes.getInt(5, 8);
            this.mBorderEnable = typedArrayObtainStyledAttributes.getBoolean(1, false);
            this.mGradientEnable = typedArrayObtainStyledAttributes.getBoolean(4, true);
            this.mStartResId = typedArrayObtainStyledAttributes.getResourceId(7, qmyy.babycat.live.R.color.progress_start);
            this.mProgressBgColorId = typedArrayObtainStyledAttributes.getResourceId(6, qmyy.babycat.live.R.color.progress_solid_color);
            this.mEndResId = typedArrayObtainStyledAttributes.getResourceId(3, qmyy.babycat.live.R.color.progress_end);
            this.mBorderColorResId = typedArrayObtainStyledAttributes.getResourceId(0, qmyy.babycat.live.R.color.progress_frame_color);
            this.mBorderWidth = typedArrayObtainStyledAttributes.getResourceId(2, 4);
        } else {
            typedArrayObtainStyledAttributes = null;
        }
        if (typedArrayObtainStyledAttributes != null) {
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mRectF = new RectF();
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mRadius == 0) {
            this.mRadius = this.mWidth / 2;
        }
        if (this.mBorderEnable) {
            this.mRectF.set(0.0f, 0.0f, this.mWidth, this.mHeight);
            this.mPaint.setColor(getResources().getColor(this.mBorderColorResId));
            RectF rectF = this.mRectF;
            int i10 = this.mRadius;
            canvas.drawRoundRect(rectF, i10, i10, this.mPaint);
            this.mPaint.setColor(getResources().getColor(this.mProgressBgColorId));
            RectF rectF2 = this.mRectF;
            int i11 = this.mBorderWidth;
            rectF2.set(i11, i11, this.mWidth - i11, this.mHeight - i11);
            RectF rectF3 = this.mRectF;
            int i12 = this.mRadius;
            canvas.drawRoundRect(rectF3, i12, i12, this.mPaint);
        }
        int i13 = this.mProgress;
        if (i13 == 0) {
            return;
        }
        float f10 = i13 / this.max;
        RectF rectF4 = this.mRectF;
        int i14 = this.mHeight;
        rectF4.set(8.0f, (i14 - ((i13 / 100.0f) * i14)) + 10.0f, this.mWidth - 8, i14 - 8);
        if (this.mGradientEnable) {
            this.mPaint.setShader(new LinearGradient(0.0f, 0.0f, this.mWidth * f10, this.mHeight, getResources().getColor(this.mStartResId), getResources().getColor(this.mEndResId), Shader.TileMode.CLAMP));
        }
        RectF rectF5 = this.mRectF;
        int i15 = this.mRadius;
        canvas.drawRoundRect(rectF5, i15, i15, this.mPaint);
        this.mPaint.setShader(null);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.mWidth = getMeasuredWidth() - 1;
        this.mHeight = getMeasuredHeight() - 1;
    }

    public void setProgress(int i10) {
        int i11 = this.max;
        if (i10 > i11) {
            i10 = i11;
        }
        this.mProgress = i10;
        postInvalidate();
    }

    public VerticalProgress(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mProgress = 0;
        this.max = 100;
        init(context, attributeSet);
    }
}
