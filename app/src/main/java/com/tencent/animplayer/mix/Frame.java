package com.tencent.qgame.animplayer.mix;

import com.tencent.qgame.animplayer.PointRect;
import kotlin.jvm.internal.g0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import to.k;
import x.w;

/* JADX INFO: loaded from: classes2.dex */
public final class Frame {

    @k
    private PointRect frame;
    private final int index;

    @k
    private PointRect mFrame;
    private int mt;

    @k
    private String srcId;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f23752z;

    public Frame(int i10, @k JSONObject json) throws JSONException {
        g0.q(json, "json");
        this.index = i10;
        this.srcId = "";
        String string = json.getString("srcId");
        g0.h(string, "json.getString(\"srcId\")");
        this.srcId = string;
        this.f23752z = json.getInt("z");
        JSONArray jSONArray = json.getJSONArray(w.a.S_FRAME);
        this.frame = new PointRect(jSONArray.getInt(0), jSONArray.getInt(1), jSONArray.getInt(2), jSONArray.getInt(3));
        JSONArray jSONArray2 = json.getJSONArray("mFrame");
        this.mFrame = new PointRect(jSONArray2.getInt(0), jSONArray2.getInt(1), jSONArray2.getInt(2), jSONArray2.getInt(3));
        this.mt = json.getInt("mt");
    }

    @k
    public final PointRect getFrame() {
        return this.frame;
    }

    public final int getIndex() {
        return this.index;
    }

    @k
    public final PointRect getMFrame() {
        return this.mFrame;
    }

    public final int getMt() {
        return this.mt;
    }

    @k
    public final String getSrcId() {
        return this.srcId;
    }

    public final int getZ() {
        return this.f23752z;
    }

    public final void setFrame(@k PointRect pointRect) {
        g0.q(pointRect, "<set-?>");
        this.frame = pointRect;
    }

    public final void setMFrame(@k PointRect pointRect) {
        g0.q(pointRect, "<set-?>");
        this.mFrame = pointRect;
    }

    public final void setMt(int i10) {
        this.mt = i10;
    }

    public final void setSrcId(@k String str) {
        g0.q(str, "<set-?>");
        this.srcId = str;
    }

    public final void setZ(int i10) {
        this.f23752z = i10;
    }
}
