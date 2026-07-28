package net.babycat.live.platform.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.o;
import f.l;
import f.n;
import f.v;
import net.babycat.live.R;

/* JADX INFO: loaded from: classes3.dex */
public class CircleImageView extends o {
    private static final int COLORDRAWABLE_DIMENSION = 2;
    private static final int DEFAULT_BORDER_COLOR = -16777216;
    private static final boolean DEFAULT_BORDER_OVERLAY = false;
    private static final int DEFAULT_BORDER_WIDTH = 0;
    private static final int DEFAULT_FILL_COLOR = 0;
    private Bitmap mBitmap;
    private int mBitmapHeight;
    private final Paint mBitmapPaint;
    private BitmapShader mBitmapShader;
    private int mBitmapWidth;
    private int mBorderColor;
    private boolean mBorderOverlay;
    private final Paint mBorderPaint;
    private float mBorderRadius;
    private final RectF mBorderRect;
    private int mBorderWidth;
    private ColorFilter mColorFilter;
    private boolean mDisableCircularTransformation;
    private float mDrawableRadius;
    private final RectF mDrawableRect;
    private int mFillColor;
    private final Paint mFillPaint;
    private boolean mReady;
    private boolean mSetupPending;
    private final Matrix mShaderMatrix;
    private static final ImageView.ScaleType SCALE_TYPE = ImageView.ScaleType.CENTER_CROP;
    private static final Bitmap.Config BITMAP_CONFIG = Bitmap.Config.ARGB_8888;

    public CircleImageView(Context context) {
        super(context);
        this.mDrawableRect = new RectF();
        this.mBorderRect = new RectF();
        this.mShaderMatrix = new Matrix();
        this.mBitmapPaint = new Paint();
        this.mBorderPaint = new Paint();
        this.mFillPaint = new Paint();
        this.mBorderColor = -16777216;
        this.mBorderWidth = 0;
        this.mFillColor = 0;
        init();
    }

    private void applyColorFilter() {
        Paint paint = this.mBitmapPaint;
        if (paint != null) {
            paint.setColorFilter(this.mColorFilter);
        }
    }

    private RectF calculateBounds() {
        int iMin = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float paddingLeft = getPaddingLeft() + ((r0 - iMin) / 2.0f);
        float paddingTop = getPaddingTop() + ((r1 - iMin) / 2.0f);
        float f10 = iMin;
        return new RectF(paddingLeft, paddingTop, paddingLeft + f10, f10 + paddingTop);
    }

    private Bitmap getBitmapFromDrawable(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, BITMAP_CONFIG) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), BITMAP_CONFIG);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private void init() {
        super.setScaleType(SCALE_TYPE);
        this.mReady = true;
        if (this.mSetupPending) {
            setup();
            this.mSetupPending = false;
        }
    }

    private void initializeBitmap() {
        if (this.mDisableCircularTransformation) {
            this.mBitmap = null;
        } else {
            this.mBitmap = getBitmapFromDrawable(getDrawable());
        }
        setup();
    }

    private void setup() {
        int i10;
        if (!this.mReady) {
            this.mSetupPending = true;
            return;
        }
        if (getWidth() == 0 && getHeight() == 0) {
            return;
        }
        if (this.mBitmap == null) {
            invalidate();
            return;
        }
        Bitmap bitmap = this.mBitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.mBitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.mBitmapPaint.setAntiAlias(true);
        this.mBitmapPaint.setShader(this.mBitmapShader);
        this.mBorderPaint.setStyle(Paint.Style.STROKE);
        this.mBorderPaint.setAntiAlias(true);
        this.mBorderPaint.setColor(this.mBorderColor);
        this.mBorderPaint.setStrokeWidth(this.mBorderWidth);
        this.mFillPaint.setStyle(Paint.Style.FILL);
        this.mFillPaint.setAntiAlias(true);
        this.mFillPaint.setColor(this.mFillColor);
        this.mBitmapHeight = this.mBitmap.getHeight();
        this.mBitmapWidth = this.mBitmap.getWidth();
        this.mBorderRect.set(calculateBounds());
        this.mBorderRadius = Math.min((this.mBorderRect.height() - this.mBorderWidth) / 2.0f, (this.mBorderRect.width() - this.mBorderWidth) / 2.0f);
        this.mDrawableRect.set(this.mBorderRect);
        if (!this.mBorderOverlay && (i10 = this.mBorderWidth) > 0) {
            this.mDrawableRect.inset(i10 - 1.0f, i10 - 1.0f);
        }
        this.mDrawableRadius = Math.min(this.mDrawableRect.height() / 2.0f, this.mDrawableRect.width() / 2.0f);
        applyColorFilter();
        updateShaderMatrix();
        invalidate();
    }

    private void updateShaderMatrix() {
        float fWidth;
        float fHeight;
        this.mShaderMatrix.set(null);
        float fWidth2 = 0.0f;
        if (this.mBitmapWidth * this.mDrawableRect.height() > this.mDrawableRect.width() * this.mBitmapHeight) {
            fWidth = this.mDrawableRect.height() / this.mBitmapHeight;
            fWidth2 = (this.mDrawableRect.width() - (this.mBitmapWidth * fWidth)) * 0.5f;
            fHeight = 0.0f;
        } else {
            fWidth = this.mDrawableRect.width() / this.mBitmapWidth;
            fHeight = (this.mDrawableRect.height() - (this.mBitmapHeight * fWidth)) * 0.5f;
        }
        this.mShaderMatrix.setScale(fWidth, fWidth);
        Matrix matrix = this.mShaderMatrix;
        RectF rectF = this.mDrawableRect;
        matrix.postTranslate(((int) (fWidth2 + 0.5f)) + rectF.left, ((int) (fHeight + 0.5f)) + rectF.top);
        this.mBitmapShader.setLocalMatrix(this.mShaderMatrix);
    }

    public int getBorderColor() {
        return this.mBorderColor;
    }

    public int getBorderWidth() {
        return this.mBorderWidth;
    }

    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return this.mColorFilter;
    }

    @Deprecated
    public int getFillColor() {
        return this.mFillColor;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return SCALE_TYPE;
    }

    public boolean isBorderOverlay() {
        return this.mBorderOverlay;
    }

    public boolean isDisableCircularTransformation() {
        return this.mDisableCircularTransformation;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mDisableCircularTransformation) {
            super.onDraw(canvas);
            return;
        }
        if (this.mBitmap != null) {
            if (this.mFillColor != 0) {
                canvas.drawCircle(this.mDrawableRect.centerX(), this.mDrawableRect.centerY(), this.mDrawableRadius, this.mFillPaint);
            }
            canvas.drawCircle(this.mDrawableRect.centerX(), this.mDrawableRect.centerY(), this.mDrawableRadius, this.mBitmapPaint);
            if (this.mBorderWidth > 0) {
                canvas.drawCircle(this.mBorderRect.centerX(), this.mBorderRect.centerY(), this.mBorderRadius, this.mBorderPaint);
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        setup();
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z10) {
        if (z10) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(@l int i10) {
        if (i10 != this.mBorderColor) {
            this.mBorderColor = i10;
            this.mBorderPaint.setColor(i10);
            invalidate();
        }
    }

    @Deprecated
    public void setBorderColorResource(@n int i10) {
        setBorderColor(getContext().getResources().getColor(i10));
    }

    public void setBorderOverlay(boolean z10) {
        if (z10 != this.mBorderOverlay) {
            this.mBorderOverlay = z10;
            setup();
        }
    }

    public void setBorderWidth(int i10) {
        if (i10 != this.mBorderWidth) {
            this.mBorderWidth = i10;
            setup();
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter != this.mColorFilter) {
            this.mColorFilter = colorFilter;
            applyColorFilter();
            invalidate();
        }
    }

    public void setDisableCircularTransformation(boolean z10) {
        if (this.mDisableCircularTransformation != z10) {
            this.mDisableCircularTransformation = z10;
            initializeBitmap();
        }
    }

    @Deprecated
    public void setFillColor(@l int i10) {
        if (i10 != this.mFillColor) {
            this.mFillColor = i10;
            this.mFillPaint.setColor(i10);
            invalidate();
        }
    }

    @Deprecated
    public void setFillColorResource(@n int i10) {
        setFillColor(getContext().getResources().getColor(i10));
    }

    @Override // androidx.appcompat.widget.o, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        initializeBitmap();
    }

    @Override // androidx.appcompat.widget.o, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        initializeBitmap();
    }

    @Override // androidx.appcompat.widget.o, android.widget.ImageView
    public void setImageResource(@v int i10) {
        super.setImageResource(i10);
        initializeBitmap();
    }

    @Override // androidx.appcompat.widget.o, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        initializeBitmap();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != SCALE_TYPE) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mDrawableRect = new RectF();
        this.mBorderRect = new RectF();
        this.mShaderMatrix = new Matrix();
        this.mBitmapPaint = new Paint();
        this.mBorderPaint = new Paint();
        this.mFillPaint = new Paint();
        this.mBorderColor = -16777216;
        this.mBorderWidth = 0;
        this.mFillColor = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CircleImageView, i10, 0);
        this.mBorderWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.mBorderColor = typedArrayObtainStyledAttributes.getColor(0, -16777216);
        this.mBorderOverlay = typedArrayObtainStyledAttributes.getBoolean(1, false);
        this.mFillColor = typedArrayObtainStyledAttributes.getColor(4, 0);
        typedArrayObtainStyledAttributes.recycle();
        init();
    }
}
