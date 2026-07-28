package net.babycat.live.platform.widget.view;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import f.w0;
import he.h;
import i0.e;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class CodeInputView extends EditText {
    private int mBorderHeight;
    private Drawable mBorderImage;
    private int mBorderSpacing;
    private int mBorderWidth;
    private int mMaxLength;
    private final Rect mRect;
    private int mTextColor;
    private int type;

    public CodeInputView(Context context) {
        super(context);
        this.mMaxLength = 4;
        this.mBorderWidth = 100;
        this.mBorderHeight = 100;
        this.mBorderSpacing = 24;
        this.mRect = new Rect();
        this.type = 0;
        init(context, null);
    }

    private void drawBorderBackground(Canvas canvas) {
        Rect rect = this.mRect;
        rect.left = 0;
        rect.top = 0;
        rect.right = this.mBorderWidth;
        rect.bottom = this.mBorderHeight;
        int saveCount = canvas.getSaveCount();
        canvas.save();
        int length = getEditableText().length();
        for (int i10 = 0; i10 < this.mMaxLength; i10++) {
            this.mBorderImage.setBounds(this.mRect);
            if (i10 == length) {
                this.mBorderImage.setState(new int[]{16842908});
            } else {
                this.mBorderImage.setState(new int[]{R.attr.state_enabled});
            }
            this.mBorderImage.draw(canvas);
            float f10 = this.mRect.right + this.mBorderSpacing;
            canvas.save();
            canvas.translate(f10, 0.0f);
        }
        canvas.restoreToCount(saveCount);
        canvas.translate(0.0f, 0.0f);
    }

    private void drawText(Canvas canvas) {
        int saveCount = canvas.getSaveCount();
        canvas.translate(0.0f, 0.0f);
        int length = getEditableText().length();
        for (int i10 = 0; i10 < length; i10++) {
            String strValueOf = this.type == 0 ? String.valueOf(getEditableText().charAt(i10)) : h.f27168r;
            TextPaint paint = getPaint();
            paint.setColor(this.mTextColor);
            paint.getTextBounds(strValueOf, 0, 1, this.mRect);
            int i11 = this.mBorderWidth;
            canvas.drawText(strValueOf, ((i11 / 2) + ((i11 + this.mBorderSpacing) * i10)) - this.mRect.centerX(), (canvas.getHeight() / 2) + (this.mRect.height() / 2), paint);
        }
        canvas.restoreToCount(saveCount);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (this.mBorderImage == null) {
            this.mBorderImage = e.l(context, qmyy.babycat.live.R.drawable.code_input_view_border_bg);
        }
        initAttrs(context, attributeSet);
        setMaxLength(this.mMaxLength);
        setLongClickable(false);
        setBackgroundColor(0);
        setCursorVisible(false);
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, net.babycat.live.R.styleable.CodeInputView);
            this.mMaxLength = typedArrayObtainStyledAttributes.getInteger(0, 4);
            this.type = typedArrayObtainStyledAttributes.getInteger(5, 0);
            this.mBorderWidth = (int) typedArrayObtainStyledAttributes.getDimension(4, 100.0f);
            this.mBorderHeight = (int) typedArrayObtainStyledAttributes.getDimension(1, 100.0f);
            this.mBorderSpacing = (int) typedArrayObtainStyledAttributes.getDimension(3, 24.0f);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
            if (drawable != null) {
                this.mBorderImage = drawable;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void setMaxLength(int i10) {
        if (i10 >= 0) {
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i10)});
        } else {
            setFilters(new InputFilter[0]);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        this.mTextColor = getCurrentTextColor();
        setTextColor(0);
        super.onDraw(canvas);
        setTextColor(this.mTextColor);
        drawBorderBackground(canvas);
        drawText(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i12 = this.mBorderHeight;
        if (measuredHeight < i12) {
            measuredHeight = i12;
        }
        int i13 = this.mBorderWidth;
        int i14 = this.mMaxLength;
        int i15 = (i13 * i14) + (this.mBorderSpacing * (i14 + (-1) > 0 ? i14 - 1 : 0));
        if (measuredWidth < i15) {
            measuredWidth = i15;
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth, mode), View.MeasureSpec.makeMeasureSpec(measuredHeight, mode2));
    }

    public CodeInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMaxLength = 4;
        this.mBorderWidth = 100;
        this.mBorderHeight = 100;
        this.mBorderSpacing = 24;
        this.mRect = new Rect();
        this.type = 0;
        init(context, attributeSet);
    }

    public CodeInputView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mMaxLength = 4;
        this.mBorderWidth = 100;
        this.mBorderHeight = 100;
        this.mBorderSpacing = 24;
        this.mRect = new Rect();
        this.type = 0;
        init(context, attributeSet);
    }

    @w0(api = 21)
    public CodeInputView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.mMaxLength = 4;
        this.mBorderWidth = 100;
        this.mBorderHeight = 100;
        this.mBorderSpacing = 24;
        this.mRect = new Rect();
        this.type = 0;
        init(context, attributeSet);
    }
}
