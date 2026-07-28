package net.babycat.live.platform.widget.view.like;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.o;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes3.dex */
public class TCHeartView extends o {
    private static Bitmap sHeart;
    private static Bitmap sHeartBorder;
    private int mHeartBorderResId;
    private int mHeartResId;
    private static final Paint sPaint = new Paint(3);
    private static final Canvas sCanvas = new Canvas();

    public TCHeartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHeartResId = R.mipmap.livekit_gift_heart0;
        this.mHeartBorderResId = R.mipmap.livekit_gift_heart0;
    }

    private static Bitmap createBitmapSafely(int i10, int i11) {
        try {
            return Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public Bitmap createHeart(int i10) {
        if (sHeart == null) {
            sHeart = BitmapFactory.decodeResource(getResources(), this.mHeartResId);
        }
        if (sHeartBorder == null) {
            sHeartBorder = BitmapFactory.decodeResource(getResources(), this.mHeartBorderResId);
        }
        Bitmap bitmap = sHeart;
        Bitmap bitmap2 = sHeartBorder;
        Bitmap bitmapCreateBitmapSafely = createBitmapSafely(bitmap2.getWidth(), bitmap2.getHeight());
        if (bitmapCreateBitmapSafely == null) {
            return null;
        }
        Canvas canvas = sCanvas;
        canvas.setBitmap(bitmapCreateBitmapSafely);
        Paint paint = sPaint;
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
        paint.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, (bitmap2.getWidth() - bitmap.getWidth()) / 2.0f, (bitmap2.getHeight() - bitmap.getHeight()) / 2.0f, paint);
        paint.setColorFilter(null);
        canvas.setBitmap(null);
        return bitmapCreateBitmapSafely;
    }

    public void setColor(int i10) {
        setImageDrawable(new BitmapDrawable(getResources(), createHeart(i10)));
    }

    public void setColorAndDrawables(int i10, int i11, int i12) {
        if (i11 != this.mHeartResId) {
            sHeart = null;
        }
        if (i12 != this.mHeartBorderResId) {
            sHeartBorder = null;
        }
        this.mHeartResId = i11;
        this.mHeartBorderResId = i12;
        setColor(i10);
    }

    public void setDrawable(BitmapDrawable bitmapDrawable) {
        setImageDrawable(bitmapDrawable);
    }

    public TCHeartView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mHeartResId = R.mipmap.livekit_gift_heart0;
        this.mHeartBorderResId = R.mipmap.livekit_gift_heart0;
    }

    public TCHeartView(Context context) {
        super(context);
        this.mHeartResId = R.mipmap.livekit_gift_heart0;
        this.mHeartBorderResId = R.mipmap.livekit_gift_heart0;
    }
}
