package net.babycat.live.platform.widget.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes3.dex */
public class HXLinePagerIndicator extends LinePagerIndicatorEx {
    private int[] colors;

    public HXLinePagerIndicator(Context context, int[] iArr) {
        super(context);
        this.colors = iArr;
    }

    @Override // net.babycat.live.platform.widget.view.LinePagerIndicatorEx, android.view.View
    public void onDraw(Canvas canvas) {
        getPaint().setShader(new LinearGradient(getLineRect().left, getLineRect().top, getLineRect().right, getLineRect().bottom, this.colors, (float[]) null, Shader.TileMode.MIRROR));
        canvas.drawRoundRect(getLineRect(), getRoundRadius(), getRoundRadius(), getPaint());
    }
}
