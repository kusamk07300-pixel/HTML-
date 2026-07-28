package net.babycat.live.platform.widget.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import f.n0;
import f.p0;
import java.util.List;
import jo.c;

/* JADX INFO: loaded from: classes3.dex */
public class WheelMagicIndicator extends View implements c {
    private ValueAnimator animator;
    private float arcRatio;
    private float centerX;
    private float centerY;
    private int currentIndex;
    private float currentPositionOffset;
    private List<lo.a> mPositionDataList;
    private int normalTextColor;
    private int normalTextSize;
    private float scrollOffset;
    private int selectedTextColor;
    private int selectedTextSize;
    private float targetScrollOffset;
    private Paint textPaint;
    private float textSpacing;
    private List<String> titles;
    private int totalItems;
    private float verticalOffset;

    public WheelMagicIndicator(@n0 Context context) {
        super(context);
        this.currentIndex = 0;
        this.currentPositionOffset = 0.0f;
        this.normalTextColor = Color.parseColor("#FFFFFF");
        this.selectedTextColor = Color.parseColor("#FFD313");
        this.normalTextSize = 36;
        this.selectedTextSize = 48;
        this.textSpacing = 80.0f;
        this.verticalOffset = 30.0f;
        this.arcRatio = 1.5f;
        this.scrollOffset = 0.0f;
        this.targetScrollOffset = 0.0f;
        this.totalItems = 0;
        init(context);
    }

    private void drawTitles(Canvas canvas) {
        float f10 = this.centerX;
        float f11 = this.centerY;
        float f12 = this.textSpacing * this.arcRatio;
        int i10 = -1;
        while (i10 <= 1) {
            String str = this.titles.get(getCurrentVisiblePosition(i10));
            double d10 = ((i10 * this.textSpacing) - this.scrollOffset) / f12;
            float fSin = (((float) Math.sin(d10)) * f12) + f10;
            float fCos = ((((float) Math.cos(d10)) - 1.0f) * f12) + f11;
            float f13 = i10 != 0 ? 0.5f : 1.0f;
            float f14 = i10 == 0 ? this.selectedTextSize : this.normalTextSize;
            int i11 = i10 == 0 ? this.selectedTextColor : this.normalTextColor;
            this.textPaint.setTextSize(f14);
            this.textPaint.setColor(i11);
            this.textPaint.setAlpha((int) (f13 * 255.0f));
            canvas.drawText(str, fSin, fCos, this.textPaint);
            i10++;
        }
    }

    private int getCurrentVisiblePosition(int i10) {
        int i11 = this.currentIndex + i10;
        int i12 = this.totalItems;
        if (i12 <= 0) {
            return 0;
        }
        return ((i11 % i12) + i12) % i12;
    }

    private void init(Context context) {
        Paint paint = new Paint(1);
        this.textPaint = paint;
        paint.setTextAlign(Paint.Align.CENTER);
        initAnimator();
    }

    private void initAnimator() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.animator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: net.babycat.live.platform.widget.view.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f37143a.lambda$initAnimator$0(valueAnimator);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initAnimator$0(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f10 = this.scrollOffset;
        this.scrollOffset = f10 + ((this.targetScrollOffset - f10) * fFloatValue);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        List<String> list = this.titles;
        if (list == null || list.isEmpty()) {
            return;
        }
        drawTitles(canvas);
    }

    @Override // jo.c
    public void onPageScrollStateChanged(int i10) {
    }

    @Override // jo.c
    public void onPageScrolled(int i10, float f10, int i11) {
        this.currentIndex = i10;
        this.currentPositionOffset = f10;
        float f11 = f10 * this.textSpacing;
        this.targetScrollOffset = f11;
        this.scrollOffset = f11;
        invalidate();
    }

    @Override // jo.c
    public void onPageSelected(int i10) {
        this.currentIndex = i10;
        this.scrollOffset = 0.0f;
        this.targetScrollOffset = 0.0f;
        invalidate();
    }

    @Override // jo.c
    public void onPositionDataProvide(List<lo.a> list) {
        this.mPositionDataList = list;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.centerX = i10 / 2.0f;
        this.centerY = i11 / 2.0f;
    }

    public void setArcRatio(float f10) {
        this.arcRatio = f10;
        invalidate();
    }

    public void setNormalTextColor(int i10) {
        this.normalTextColor = i10;
        invalidate();
    }

    public void setNormalTextSize(int i10) {
        this.normalTextSize = i10;
        invalidate();
    }

    public void setSelectedTextColor(int i10) {
        this.selectedTextColor = i10;
        invalidate();
    }

    public void setSelectedTextSize(int i10) {
        this.selectedTextSize = i10;
        invalidate();
    }

    public void setTextSpacing(float f10) {
        this.textSpacing = f10;
        invalidate();
    }

    public void setTitles(List<String> list) {
        this.titles = list;
        this.totalItems = list != null ? list.size() : 0;
        invalidate();
    }

    public void setVerticalOffset(float f10) {
        this.verticalOffset = f10;
        invalidate();
    }

    public WheelMagicIndicator(@n0 Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.currentIndex = 0;
        this.currentPositionOffset = 0.0f;
        this.normalTextColor = Color.parseColor("#FFFFFF");
        this.selectedTextColor = Color.parseColor("#FFD313");
        this.normalTextSize = 36;
        this.selectedTextSize = 48;
        this.textSpacing = 80.0f;
        this.verticalOffset = 30.0f;
        this.arcRatio = 1.5f;
        this.scrollOffset = 0.0f;
        this.targetScrollOffset = 0.0f;
        this.totalItems = 0;
        init(context);
    }

    public WheelMagicIndicator(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.currentIndex = 0;
        this.currentPositionOffset = 0.0f;
        this.normalTextColor = Color.parseColor("#FFFFFF");
        this.selectedTextColor = Color.parseColor("#FFD313");
        this.normalTextSize = 36;
        this.selectedTextSize = 48;
        this.textSpacing = 80.0f;
        this.verticalOffset = 30.0f;
        this.arcRatio = 1.5f;
        this.scrollOffset = 0.0f;
        this.targetScrollOffset = 0.0f;
        this.totalItems = 0;
        init(context);
    }
}
