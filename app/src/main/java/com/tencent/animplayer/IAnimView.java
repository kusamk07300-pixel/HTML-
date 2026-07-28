package com.tencent.qgame.animplayer;

import android.content.res.AssetManager;
import android.graphics.SurfaceTexture;
import com.tencent.qgame.animplayer.file.IFileContainer;
import com.tencent.qgame.animplayer.inter.IAnimListener;
import com.tencent.qgame.animplayer.inter.IFetchResource;
import com.tencent.qgame.animplayer.inter.OnResourceClickListener;
import com.tencent.qgame.animplayer.mask.MaskConfig;
import com.tencent.qgame.animplayer.util.IScaleType;
import com.tencent.qgame.animplayer.util.ScaleType;
import java.io.File;
import kotlin.Pair;
import to.k;
import to.l;

/* JADX INFO: loaded from: classes2.dex */
public interface IAnimView {
    @k
    Pair<Integer, Integer> getRealSize();

    @l
    SurfaceTexture getSurfaceTexture();

    boolean isRunning();

    void prepareTextureView();

    void setAnimListener(@l IAnimListener iAnimListener);

    void setFetchResource(@l IFetchResource iFetchResource);

    void setFps(int i10);

    void setLoop(int i10);

    void setMute(boolean z10);

    void setOnResourceClickListener(@l OnResourceClickListener onResourceClickListener);

    void setScaleType(@k IScaleType iScaleType);

    void setScaleType(@k ScaleType scaleType);

    void startPlay(@k AssetManager assetManager, @k String str);

    void startPlay(@k IFileContainer iFileContainer);

    void startPlay(@k File file);

    void stopPlay();

    void supportMask(boolean z10, boolean z11);

    void updateMaskConfig(@l MaskConfig maskConfig);
}
