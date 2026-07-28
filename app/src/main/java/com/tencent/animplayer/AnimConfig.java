package com.tencent.qgame.animplayer;

import com.tencent.qgame.animplayer.mask.MaskConfig;
import com.tencent.qgame.animplayer.util.ALog;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import to.k;
import to.l;

/* JADX INFO: loaded from: classes2.dex */
public final class AnimConfig {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AnimPlayer.AnimConfig";
    private int fps;
    private int height;
    private boolean isDefaultConfig;
    private boolean isMix;

    @l
    private JSONObject jsonConfig;

    @l
    private MaskConfig maskConfig;
    private int orien;
    private int totalFrames;
    private int videoHeight;
    private int videoWidth;
    private int width;
    private final int version = 2;

    @k
    private PointRect alphaPointRect = new PointRect(0, 0, 0, 0);

    @k
    private PointRect rgbPointRect = new PointRect(0, 0, 0, 0);
    private int defaultVideoMode = 1;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(v vVar) {
            this();
        }
    }

    @k
    public final PointRect getAlphaPointRect() {
        return this.alphaPointRect;
    }

    public final int getDefaultVideoMode() {
        return this.defaultVideoMode;
    }

    public final int getFps() {
        return this.fps;
    }

    public final int getHeight() {
        return this.height;
    }

    @l
    public final JSONObject getJsonConfig() {
        return this.jsonConfig;
    }

    @l
    public final MaskConfig getMaskConfig() {
        return this.maskConfig;
    }

    public final int getOrien() {
        return this.orien;
    }

    @k
    public final PointRect getRgbPointRect() {
        return this.rgbPointRect;
    }

    public final int getTotalFrames() {
        return this.totalFrames;
    }

    public final int getVersion() {
        return this.version;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isDefaultConfig() {
        return this.isDefaultConfig;
    }

    public final boolean isMix() {
        return this.isMix;
    }

    public final boolean parse(@k JSONObject json) {
        g0.q(json, "json");
        try {
            JSONObject jSONObject = json.getJSONObject("info");
            int i10 = jSONObject.getInt("v");
            if (this.version != i10) {
                ALog.INSTANCE.e(TAG, "current version=" + this.version + " target=" + i10);
                return false;
            }
            this.totalFrames = jSONObject.getInt("f");
            this.width = jSONObject.getInt("w");
            this.height = jSONObject.getInt(q3.k.STREAMING_FORMAT_HLS);
            this.videoWidth = jSONObject.getInt("videoW");
            this.videoHeight = jSONObject.getInt("videoH");
            this.orien = jSONObject.getInt("orien");
            this.fps = jSONObject.getInt("fps");
            this.isMix = jSONObject.getInt("isVapx") == 1;
            JSONArray jSONArray = jSONObject.getJSONArray("aFrame");
            if (jSONArray != null) {
                this.alphaPointRect = new PointRect(jSONArray.getInt(0), jSONArray.getInt(1), jSONArray.getInt(2), jSONArray.getInt(3));
                JSONArray jSONArray2 = jSONObject.getJSONArray("rgbFrame");
                if (jSONArray2 != null) {
                    this.rgbPointRect = new PointRect(jSONArray2.getInt(0), jSONArray2.getInt(1), jSONArray2.getInt(2), jSONArray2.getInt(3));
                    return true;
                }
            }
            return false;
        } catch (JSONException e10) {
            ALog.INSTANCE.e(TAG, "json parse fail " + e10, e10);
            return false;
        }
    }

    public final void setAlphaPointRect(@k PointRect pointRect) {
        g0.q(pointRect, "<set-?>");
        this.alphaPointRect = pointRect;
    }

    public final void setDefaultConfig(boolean z10) {
        this.isDefaultConfig = z10;
    }

    public final void setDefaultVideoMode(int i10) {
        this.defaultVideoMode = i10;
    }

    public final void setFps(int i10) {
        this.fps = i10;
    }

    public final void setHeight(int i10) {
        this.height = i10;
    }

    public final void setJsonConfig(@l JSONObject jSONObject) {
        this.jsonConfig = jSONObject;
    }

    public final void setMaskConfig(@l MaskConfig maskConfig) {
        this.maskConfig = maskConfig;
    }

    public final void setMix(boolean z10) {
        this.isMix = z10;
    }

    public final void setOrien(int i10) {
        this.orien = i10;
    }

    public final void setRgbPointRect(@k PointRect pointRect) {
        g0.q(pointRect, "<set-?>");
        this.rgbPointRect = pointRect;
    }

    public final void setTotalFrames(int i10) {
        this.totalFrames = i10;
    }

    public final void setVideoHeight(int i10) {
        this.videoHeight = i10;
    }

    public final void setVideoWidth(int i10) {
        this.videoWidth = i10;
    }

    public final void setWidth(int i10) {
        this.width = i10;
    }

    @k
    public String toString() {
        return "AnimConfig(version=" + this.version + ", totalFrames=" + this.totalFrames + ", width=" + this.width + ", height=" + this.height + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", orien=" + this.orien + ", fps=" + this.fps + ", isMix=" + this.isMix + ", alphaPointRect=" + this.alphaPointRect + ", rgbPointRect=" + this.rgbPointRect + ", isDefaultConfig=" + this.isDefaultConfig + ')';
    }
}
