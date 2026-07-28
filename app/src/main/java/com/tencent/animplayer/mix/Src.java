package com.tencent.qgame.animplayer.mix;

import a5.e;
import android.graphics.Bitmap;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import mb.p;
import to.k;
import to.l;

/* JADX INFO: loaded from: classes2.dex */
public final class Src {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AnimPlayer.Src";

    @l
    private Bitmap bitmap;
    private int color;
    private int drawHeight;
    private int drawWidth;

    @k
    private FitType fitType;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23754h;

    @k
    private LoadType loadType;

    @k
    private String srcId;

    @k
    private String srcTag;
    private int srcTextureId;

    @k
    private SrcType srcType;

    @k
    private Style style;

    @k
    private String txt;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f23755w;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(v vVar) {
            this();
        }
    }

    public enum FitType {
        FIT_XY("fitXY"),
        CENTER_FULL("centerFull");


        @k
        private final String type;

        FitType(String str) {
            this.type = str;
        }

        @k
        public final String getType() {
            return this.type;
        }
    }

    public enum LoadType {
        UNKNOWN("unknown"),
        NET("net"),
        LOCAL(p.LOCAL);


        @k
        private final String type;

        LoadType(String str) {
            this.type = str;
        }

        @k
        public final String getType() {
            return this.type;
        }
    }

    public enum SrcType {
        UNKNOWN("unknown"),
        IMG("img"),
        TXT("txt");


        @k
        private final String type;

        SrcType(String str) {
            this.type = str;
        }

        @k
        public final String getType() {
            return this.type;
        }
    }

    public enum Style {
        DEFAULT("default"),
        BOLD(e.f456q);


        @k
        private final String style;

        Style(String str) {
            this.style = str;
        }

        @k
        public final String getStyle() {
            return this.style;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009c A[PHI: r5
      0x009c: PHI (r5v17 com.tencent.qgame.animplayer.mix.Src$LoadType) = (r5v14 com.tencent.qgame.animplayer.mix.Src$LoadType), (r5v15 com.tencent.qgame.animplayer.mix.Src$LoadType) binds: [B:13:0x009a, B:16:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0079 A[PHI: r7
      0x0079: PHI (r7v8 com.tencent.qgame.animplayer.mix.Src$SrcType) = (r7v3 com.tencent.qgame.animplayer.mix.Src$SrcType), (r7v4 com.tencent.qgame.animplayer.mix.Src$SrcType) binds: [B:7:0x0077, B:10:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Src(@to.k org.json.JSONObject r10) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qgame.animplayer.mix.Src.<init>(org.json.JSONObject):void");
    }

    private final void genDrawSize(Bitmap bitmap) {
        int i10;
        int i11;
        int width = bitmap != null ? bitmap.getWidth() : this.f23755w;
        int height = bitmap != null ? bitmap.getHeight() : this.f23754h;
        this.drawWidth = width;
        this.drawHeight = height;
        if (this.fitType != FitType.CENTER_FULL || (i10 = this.f23755w) == 0 || (i11 = this.f23754h) == 0) {
            return;
        }
        float f10 = width / height;
        if (f10 >= i10 / i11) {
            this.drawHeight = i11;
            this.drawWidth = (int) (i11 * f10);
        } else {
            this.drawWidth = i10;
            this.drawHeight = (int) (i10 / f10);
        }
    }

    @l
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getDrawHeight() {
        return this.drawHeight;
    }

    public final int getDrawWidth() {
        return this.drawWidth;
    }

    @k
    public final FitType getFitType() {
        return this.fitType;
    }

    public final int getH() {
        return this.f23754h;
    }

    @k
    public final LoadType getLoadType() {
        return this.loadType;
    }

    @k
    public final String getSrcId() {
        return this.srcId;
    }

    @k
    public final String getSrcTag() {
        return this.srcTag;
    }

    public final int getSrcTextureId() {
        return this.srcTextureId;
    }

    @k
    public final SrcType getSrcType() {
        return this.srcType;
    }

    @k
    public final Style getStyle() {
        return this.style;
    }

    @k
    public final String getTxt() {
        return this.txt;
    }

    public final int getW() {
        return this.f23755w;
    }

    public final void setBitmap(@l Bitmap bitmap) {
        this.bitmap = bitmap;
        genDrawSize(bitmap);
    }

    public final void setColor(int i10) {
        this.color = i10;
    }

    public final void setDrawHeight(int i10) {
        this.drawHeight = i10;
    }

    public final void setDrawWidth(int i10) {
        this.drawWidth = i10;
    }

    public final void setFitType(@k FitType fitType) {
        g0.q(fitType, "<set-?>");
        this.fitType = fitType;
    }

    public final void setH(int i10) {
        this.f23754h = i10;
    }

    public final void setLoadType(@k LoadType loadType) {
        g0.q(loadType, "<set-?>");
        this.loadType = loadType;
    }

    public final void setSrcId(@k String str) {
        g0.q(str, "<set-?>");
        this.srcId = str;
    }

    public final void setSrcTag(@k String str) {
        g0.q(str, "<set-?>");
        this.srcTag = str;
    }

    public final void setSrcTextureId(int i10) {
        this.srcTextureId = i10;
    }

    public final void setSrcType(@k SrcType srcType) {
        g0.q(srcType, "<set-?>");
        this.srcType = srcType;
    }

    public final void setStyle(@k Style style) {
        g0.q(style, "<set-?>");
        this.style = style;
    }

    public final void setTxt(@k String str) {
        g0.q(str, "<set-?>");
        this.txt = str;
    }

    public final void setW(int i10) {
        this.f23755w = i10;
    }

    @k
    public String toString() {
        return "Src(srcId='" + this.srcId + "', srcType=" + this.srcType + ", loadType=" + this.loadType + ", srcTag='" + this.srcTag + "', bitmap=" + this.bitmap + ", txt='" + this.txt + "')";
    }
}
