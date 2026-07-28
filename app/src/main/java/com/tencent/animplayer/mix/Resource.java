package com.tencent.qgame.animplayer.mix;

import android.graphics.Bitmap;
import com.tencent.qgame.animplayer.PointRect;
import com.tencent.qgame.animplayer.mix.Src;
import kotlin.jvm.internal.g0;
import to.k;
import to.l;

/* JADX INFO: loaded from: classes2.dex */
public final class Resource {

    @l
    private Bitmap bitmap;

    @l
    private PointRect curPoint;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @k
    private String f23753id;

    @k
    private Src.LoadType loadType;

    @k
    private String tag;

    @k
    private Src.SrcType type;

    public Resource(@k Src src) {
        g0.q(src, "src");
        this.f23753id = "";
        this.type = Src.SrcType.UNKNOWN;
        this.loadType = Src.LoadType.UNKNOWN;
        this.tag = "";
        this.f23753id = src.getSrcId();
        this.type = src.getSrcType();
        this.loadType = src.getLoadType();
        this.tag = src.getSrcTag();
        this.bitmap = src.getBitmap();
    }

    @l
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @l
    public final PointRect getCurPoint() {
        return this.curPoint;
    }

    @k
    public final String getId() {
        return this.f23753id;
    }

    @k
    public final Src.LoadType getLoadType() {
        return this.loadType;
    }

    @k
    public final String getTag() {
        return this.tag;
    }

    @k
    public final Src.SrcType getType() {
        return this.type;
    }

    public final void setBitmap(@l Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public final void setCurPoint(@l PointRect pointRect) {
        this.curPoint = pointRect;
    }

    public final void setId(@k String str) {
        g0.q(str, "<set-?>");
        this.f23753id = str;
    }

    public final void setLoadType(@k Src.LoadType loadType) {
        g0.q(loadType, "<set-?>");
        this.loadType = loadType;
    }

    public final void setTag(@k String str) {
        g0.q(str, "<set-?>");
        this.tag = str;
    }

    public final void setType(@k Src.SrcType srcType) {
        g0.q(srcType, "<set-?>");
        this.type = srcType;
    }
}
