package com.tencent.qgame.animplayer.mix;

import android.util.SparseArray;
import kotlin.jvm.internal.g0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import to.k;
import x.w;

/* JADX INFO: loaded from: classes2.dex */
public final class FrameAll {

    @k
    private final SparseArray<FrameSet> map;

    public FrameAll(@k JSONObject json) throws JSONException {
        JSONObject jSONObject;
        g0.q(json, "json");
        this.map = new SparseArray<>();
        JSONArray jSONArray = json.getJSONArray(w.a.S_FRAME);
        int length = jSONArray != null ? jSONArray.length() : 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (jSONArray != null && (jSONObject = jSONArray.getJSONObject(i10)) != null) {
                FrameSet frameSet = new FrameSet(jSONObject);
                this.map.put(frameSet.getIndex(), frameSet);
            }
        }
    }

    @k
    public final SparseArray<FrameSet> getMap() {
        return this.map;
    }
}
