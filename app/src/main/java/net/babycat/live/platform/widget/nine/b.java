package net.babycat.live.platform.widget.nine;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class b {
    public final Bitmap bitmap;
    public final NinePatchChunk chunk;

    public b(Bitmap bitmap, NinePatchChunk ninePatchChunk) {
        this.bitmap = bitmap;
        this.chunk = ninePatchChunk;
    }

    public NinePatchDrawable a(Resources resources, String str) {
        if (this.bitmap == null) {
            return null;
        }
        return this.chunk == null ? new NinePatchDrawable(resources, this.bitmap, null, new Rect(), str) : new NinePatchDrawable(resources, this.bitmap, this.chunk.C(), this.chunk.padding, str);
    }
}
