package net.babycat.live.platform.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.o;
import net.babycat.live.R;

/* JADX INFO: loaded from: classes3.dex */
public class RoundImageView extends o {
    private Path mPath;
    private RectF mRectF;
    private PaintFlagsDrawFilter paintFlagsDrawFilter;
    private float[] rids;

    public RoundImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        this.mPath.reset();
        this.mPath.addRoundRect(this.mRectF, this.rids, Path.Direction.CW);
        canvas.setDrawFilter(this.paintFlagsDrawFilter);
        canvas.save();
        canvas.clipPath(this.mPath);
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.mRectF = new RectF(0.0f, 0.0f, i10, i11);
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.rids = new float[8];
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RoundImageView);
        float dimension = typedArrayObtainStyledAttributes.getDimension(0, 20.0f);
        float[] fArr = this.rids;
        fArr[0] = dimension;
        fArr[1] = dimension;
        fArr[2] = dimension;
        fArr[3] = dimension;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        typedArrayObtainStyledAttributes.recycle();
        this.mPath = new Path();
        this.paintFlagsDrawFilter = new PaintFlagsDrawFilter(0, 3);
        setLayerType(2, null);
    }
}
