package com.tencent.qgame.animplayer.textureview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import com.tencent.qgame.animplayer.AnimPlayer;
import com.tencent.qgame.animplayer.plugin.AnimPluginManager;
import java.util.HashMap;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import mj.k;
import to.l;

/* JADX INFO: loaded from: classes2.dex */
public final class InnerTextureView extends TextureView {
    private HashMap _$_findViewCache;

    @l
    private AnimPlayer player;

    @k
    public InnerTextureView(@to.k Context context) {
        this(context, null, 0, 6, null);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this._$_findViewCache;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i10) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        this._$_findViewCache.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(@l MotionEvent motionEvent) {
        AnimPlayer animPlayer;
        AnimPluginManager pluginManager;
        AnimPlayer animPlayer2 = this.player;
        if (animPlayer2 == null || !animPlayer2.isRunning() || motionEvent == null || (animPlayer = this.player) == null || (pluginManager = animPlayer.getPluginManager()) == null || !pluginManager.onDispatchTouchEvent(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @l
    public final AnimPlayer getPlayer() {
        return this.player;
    }

    public final void setPlayer(@l AnimPlayer animPlayer) {
        this.player = animPlayer;
    }

    @k
    public InnerTextureView(@to.k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ InnerTextureView(Context context, AttributeSet attributeSet, int i10, int i11, v vVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @k
    public InnerTextureView(@to.k Context context, @l AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g0.q(context, "context");
    }
}
