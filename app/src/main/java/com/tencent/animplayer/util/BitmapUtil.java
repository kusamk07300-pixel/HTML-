package com.tencent.qgame.animplayer.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.tencent.qgame.animplayer.mix.Src;
import kotlin.jvm.internal.g0;
import to.k;

/* JADX INFO: loaded from: classes2.dex */
public final class BitmapUtil {
    public static final BitmapUtil INSTANCE = new BitmapUtil();

    private BitmapUtil() {
    }

    @k
    public final Bitmap createEmptyBitmap() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(16, 16, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        g0.h(bitmapCreateBitmap, "Bitmap.createBitmap(16, …or.TRANSPARENT)\n        }");
        return bitmapCreateBitmap;
    }

    @k
    public final Bitmap createTxtBitmap(@k Src src) {
        g0.q(src, "src");
        int w10 = src.getW();
        int h10 = src.getH();
        Bitmap bitmap = Bitmap.createBitmap(w10, h10, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        Rect rect = new Rect(0, 0, w10, h10);
        Rect rect2 = new Rect();
        TextPaint textPaint = new TextPaint();
        float f10 = h10;
        float f11 = 0.8f;
        textPaint.setTextSize(f10 * 0.8f);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setAntiAlias(true);
        if (src.getStyle() == Src.Style.BOLD) {
            textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        }
        textPaint.setColor(src.getColor());
        String txt = src.getTxt();
        while (f11 > 0.1f) {
            textPaint.getTextBounds(txt, 0, txt.length(), rect2);
            if (rect2.width() <= rect.width()) {
                break;
            }
            f11 -= 0.1f;
            textPaint.setTextSize(f10 * f11);
        }
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        canvas.drawText(txt, rect.centerX(), (rect.centerY() - (fontMetricsInt.top / 2)) - (fontMetricsInt.bottom / 2), textPaint);
        g0.h(bitmap, "bitmap");
        return bitmap;
    }
}
