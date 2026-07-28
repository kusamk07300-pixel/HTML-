package net.babycat.live.platform.widget.nine;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import java.util.ArrayList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public class BitmapType {
    public static final BitmapType NULL;
    public static final BitmapType NinePatch;
    public static final BitmapType PlainImage;
    public static final BitmapType RawNinePatch;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ BitmapType[] f37139a = d();

    /* JADX INFO: renamed from: net.babycat.live.platform.widget.nine.BitmapType$1, reason: invalid class name */
    public enum AnonymousClass1 extends BitmapType {
        @Override // net.babycat.live.platform.widget.nine.BitmapType
        public NinePatchChunk e(Bitmap bitmap) {
            return NinePatchChunk.w(bitmap.getNinePatchChunk());
        }

        public AnonymousClass1(String str, int i10) {
            super(str, i10);
        }
    }

    /* JADX INFO: renamed from: net.babycat.live.platform.widget.nine.BitmapType$2, reason: invalid class name */
    public enum AnonymousClass2 extends BitmapType {
        @Override // net.babycat.live.platform.widget.nine.BitmapType
        public NinePatchChunk e(Bitmap bitmap) {
            try {
                return NinePatchChunk.i(bitmap, false);
            } catch (DivLengthException unused) {
                return NinePatchChunk.l();
            } catch (WrongPaddingException unused2) {
                return NinePatchChunk.l();
            }
        }

        @Override // net.babycat.live.platform.widget.nine.BitmapType
        public Bitmap j(Resources resources, Bitmap bitmap, NinePatchChunk ninePatchChunk) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 1, 1, bitmap.getWidth() - 2, bitmap.getHeight() - 2);
            int i10 = resources.getDisplayMetrics().densityDpi;
            float density = i10 / bitmap.getDensity();
            if (density == 1.0f) {
                return bitmapCreateBitmap;
            }
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, Math.round(bitmapCreateBitmap.getWidth() * density), Math.round(bitmapCreateBitmap.getHeight() * density), true);
            bitmapCreateScaledBitmap.setDensity(i10);
            ninePatchChunk.padding = new Rect(Math.round(ninePatchChunk.padding.left * density), Math.round(ninePatchChunk.padding.top * density), Math.round(ninePatchChunk.padding.right * density), Math.round(ninePatchChunk.padding.bottom * density));
            m(density, ninePatchChunk.xDivs);
            m(density, ninePatchChunk.yDivs);
            return bitmapCreateScaledBitmap;
        }

        public final void m(float f10, ArrayList<Div> arrayList) {
            for (Div div : arrayList) {
                div.start = Math.round(div.start * f10);
                div.stop = Math.round(div.stop * f10);
            }
        }

        public AnonymousClass2(String str, int i10) {
            super(str, i10);
        }
    }

    /* JADX INFO: renamed from: net.babycat.live.platform.widget.nine.BitmapType$3, reason: invalid class name */
    public enum AnonymousClass3 extends BitmapType {
        @Override // net.babycat.live.platform.widget.nine.BitmapType
        public NinePatchChunk e(Bitmap bitmap) {
            return NinePatchChunk.l();
        }

        public AnonymousClass3(String str, int i10) {
            super(str, i10);
        }
    }

    /* JADX INFO: renamed from: net.babycat.live.platform.widget.nine.BitmapType$4, reason: invalid class name */
    public enum AnonymousClass4 extends BitmapType {
        @Override // net.babycat.live.platform.widget.nine.BitmapType
        public NinePatchDrawable g(Resources resources, Bitmap bitmap, String str) {
            return null;
        }

        public AnonymousClass4(String str, int i10) {
            super(str, i10);
        }
    }

    static {
        NinePatch = new AnonymousClass1("NinePatch", 0);
        RawNinePatch = new AnonymousClass2("RawNinePatch", 1);
        PlainImage = new AnonymousClass3("PlainImage", 2);
        NULL = new AnonymousClass4("NULL", 3);
    }

    public static /* synthetic */ BitmapType[] d() {
        return new BitmapType[]{NinePatch, RawNinePatch, PlainImage, NULL};
    }

    public static BitmapType h(Bitmap bitmap) {
        if (bitmap == null) {
            return NULL;
        }
        byte[] ninePatchChunk = bitmap.getNinePatchChunk();
        return (ninePatchChunk == null || !NinePatch.isNinePatchChunk(ninePatchChunk)) ? NinePatchChunk.u(bitmap) ? RawNinePatch : PlainImage : NinePatch;
    }

    public static NinePatchDrawable i(Resources resources, Bitmap bitmap, String str) {
        return h(bitmap).g(resources, bitmap, str);
    }

    public static BitmapType valueOf(String str) {
        return (BitmapType) Enum.valueOf(BitmapType.class, str);
    }

    public static BitmapType[] values() {
        return (BitmapType[]) f37139a.clone();
    }

    public NinePatchChunk e(Bitmap bitmap) {
        return NinePatchChunk.l();
    }

    public NinePatchDrawable g(Resources resources, Bitmap bitmap, String str) {
        NinePatchChunk ninePatchChunkE = e(bitmap);
        return new NinePatchDrawable(resources, j(resources, bitmap, ninePatchChunkE), ninePatchChunkE.C(), ninePatchChunkE.padding, str);
    }

    public Bitmap j(Resources resources, Bitmap bitmap, NinePatchChunk ninePatchChunk) {
        return bitmap;
    }

    public BitmapType(String str, int i10) {
    }
}
