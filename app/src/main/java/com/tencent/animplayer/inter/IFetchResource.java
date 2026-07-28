package com.tencent.qgame.animplayer.inter;

import android.graphics.Bitmap;
import com.tencent.qgame.animplayer.mix.Resource;
import java.util.List;
import kotlin.j2;
import nj.l;
import to.k;

/* JADX INFO: loaded from: classes2.dex */
public interface IFetchResource {
    void fetchImage(@k Resource resource, @k l<? super Bitmap, j2> lVar);

    void fetchText(@k Resource resource, @k l<? super String, j2> lVar);

    void releaseResource(@k List<Resource> list);
}
