package net.babycat.live.platform.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import f.p0;
import net.babycat.live.R;

/* JADX INFO: loaded from: classes3.dex */
public class CirclePercentView extends View {
    public static final int MAX = 100;
    public static final int WIDTH_RADIUS_RATIO = 8;
    private int bgColor;
    private int endColor;
    private LinearGradient gradient;
    private boolean isGradient;
    private Paint mPaint;
    private int progressColor;
    private float progressPercent;
    private int radius;
    private RectF rectF;
    private int startColor;

    public CirclePercentView(Context context) {
        super(context);
        init();
    }

    private void init() {
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mPaint.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        int i10 = width / this.radius;
        this.mPaint.setShader(null);
        this.mPaint.setStrokeWidth(i10);
        this.mPaint.setColor(this.bgColor);
        float f10 = width;
        int i11 = i10 / 2;
        canvas.drawCircle(f10, f10, width - i11, this.mPaint);
        if (this.rectF == null) {
            float f11 = i11;
            float f12 = (width * 2) - i11;
            this.rectF = new RectF(f11, f11, f12, f12);
        }
        if (this.isGradient) {
            this.mPaint.setShader(this.gradient);
        } else {
            this.mPaint.setColor(this.progressColor);
        }
        canvas.drawArc(this.rectF, -90.0f, this.progressPercent * 3.6f, false, this.mPaint);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.gradient = new LinearGradient(getWidth(), 0.0f, getWidth(), getHeight(), this.startColor, this.endColor, Shader.TileMode.MIRROR);
    }

    public void setBgColor(int i10) {
        this.bgColor = i10;
    }

    public void setEndColor(int i10) {
        this.endColor = i10;
    }

    public void setGradient(boolean z10) {
        this.isGradient = z10;
    }

    @Keep
    public void setPercentage(float f10) {
        this.progressPercent = f10;
        invalidate();
    }

    public void setProgressColor(int i10) {
        this.progressColor = i10;
    }

    public void setRadius(int i10) {
        this.radius = i10;
    }

    public void setStartColor(int i10) {
        this.startColor = i10;
    }

    public CirclePercentView(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CirclePercentView);
        this.bgColor = typedArrayObtainStyledAttributes.getColor(0, getResources().getColor(qmyy.babycat.live.R.color.circle_bg_color));
        this.progressColor = typedArrayObtainStyledAttributes.getColor(3, getResources().getColor(qmyy.babycat.live.R.color.circle_progress_color));
        this.radius = typedArrayObtainStyledAttributes.getInt(4, 8);
        this.isGradient = typedArrayObtainStyledAttributes.getBoolean(2, false);
        this.startColor = typedArrayObtainStyledAttributes.getColor(5, getResources().getColor(qmyy.babycat.live.R.color.circle_start_color));
        this.endColor = typedArrayObtainStyledAttributes.getColor(1, getResources().getColor(qmyy.babycat.live.R.color.circle_end_color));
        typedArrayObtainStyledAttributes.recycle();
        init();
    }

    public CirclePercentView(Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        init();
    }
}
