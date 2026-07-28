package net.babycat.live.platform.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.o;
import net.babycat.live.R;

/* JADX INFO: loaded from: classes3.dex */
public class RatioImageView extends o {
    private float mRatio;

    public RatioImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mRatio = 0.0f;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        float f10 = this.mRatio;
        if (f10 != 0.0f) {
            i11 = View.MeasureSpec.makeMeasureSpec((int) (size / f10), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        int action = motionEvent.getAction();
        if (action == 0) {
            Drawable drawable2 = getDrawable();
            if (drawable2 != null) {
                drawable2.mutate().setColorFilter(-7829368, PorterDuff.Mode.MULTIPLY);
            }
        } else if ((action == 1 || action == 3) && (drawable = getDrawable()) != null) {
            drawable.mutate().clearColorFilter();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setRatio(float f10) {
        this.mRatio = f10;
    }

    public RatioImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRatio = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RatioImageView);
        this.mRatio = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public RatioImageView(Context context) {
        super(context);
        this.mRatio = 0.0f;
    }
}
