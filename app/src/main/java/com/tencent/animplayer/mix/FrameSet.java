package com.tencent.qgame.animplayer.mix;

import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.collections.l0;
import kotlin.jvm.internal.g0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import to.k;
import xi.g;

/* JADX INFO: loaded from: classes2.dex */
public final class FrameSet {
    private int index;

    @k
    private final ArrayList<Frame> list;

    public FrameSet(@k JSONObject json) throws JSONException {
        JSONObject jSONObject;
        g0.q(json, "json");
        this.list = new ArrayList<>();
        this.index = json.getInt("i");
        JSONArray jSONArray = json.getJSONArray(IconCompat.f3748l);
        int length = jSONArray != null ? jSONArray.length() : 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (jSONArray != null && (jSONObject = jSONArray.getJSONObject(i10)) != null) {
                this.list.add(new Frame(this.index, jSONObject));
            }
        }
        ArrayList<Frame> arrayList = this.list;
        if (arrayList.size() > 1) {
            l0.r0(arrayList, new Comparator<T>() { // from class: com.tencent.qgame.animplayer.mix.FrameSet$$special$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return g.l(Integer.valueOf(((Frame) t10).getZ()), Integer.valueOf(((Frame) t11).getZ()));
                }
            });
        }
    }

    public final int getIndex() {
        return this.index;
    }

    @k
    public final ArrayList<Frame> getList() {
        return this.list;
    }

    public final void setIndex(int i10) {
        this.index = i10;
    }
}
