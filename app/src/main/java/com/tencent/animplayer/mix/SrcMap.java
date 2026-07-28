package com.tencent.qgame.animplayer.mix;

import com.tencent.qgame.animplayer.mix.Src;
import java.util.HashMap;
import kotlin.jvm.internal.g0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import to.k;

/* JADX INFO: loaded from: classes2.dex */
public final class SrcMap {

    @k
    private final HashMap<String, Src> map;

    public SrcMap(@k JSONObject json) throws JSONException {
        JSONObject jSONObject;
        g0.q(json, "json");
        this.map = new HashMap<>();
        JSONArray jSONArray = json.getJSONArray("src");
        int length = jSONArray != null ? jSONArray.length() : 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (jSONArray != null && (jSONObject = jSONArray.getJSONObject(i10)) != null) {
                Src src = new Src(jSONObject);
                if (src.getSrcType() != Src.SrcType.UNKNOWN) {
                    this.map.put(src.getSrcId(), src);
                }
            }
        }
    }

    @k
    public final HashMap<String, Src> getMap() {
        return this.map;
    }
}
