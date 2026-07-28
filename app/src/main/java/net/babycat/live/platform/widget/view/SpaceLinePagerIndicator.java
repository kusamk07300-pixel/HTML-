package net.babycat.live.platform.widget.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes3.dex */
public class SpaceLinePagerIndicator extends LinePagerIndicatorEx {
    public SpaceLinePagerIndicator(Context context) {
        super(context);
    }

    @Override // net.babycat.live.platform.widget.view.LinePagerIndicatorEx, android.view.View
    public void onDraw(Canvas canvas) {
        getPaint().setShader(new LinearGradient(getLineRect().left, getLineRect().top, getLineRect().right, getLineRect().bottom, new int[]{-4360193, -620808}, (float[]) null, Shader.TileMode.CLAMP));
        canvas.drawRoundRect(getLineRect(), getRoundRadius(), getRoundRadius(), getPaint());
    }
}
