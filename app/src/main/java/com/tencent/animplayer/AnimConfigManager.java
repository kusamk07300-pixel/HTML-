package com.tencent.qgame.animplayer;

import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import com.tencent.qgame.animplayer.file.IFileContainer;
import com.tencent.qgame.animplayer.util.ALog;
import java.nio.charset.Charset;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import org.json.JSONObject;
import to.k;
import to.l;

/* JADX INFO: loaded from: classes2.dex */
public final class AnimConfigManager {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AnimPlayer.AnimConfigManager";

    @l
    private AnimConfig config;
    private boolean isParsingConfig;

    @k
    private final AnimPlayer player;

    public static final class BoxHead {
        private int length;
        private long startIndex;

        @l
        private String type;

        public final int getLength() {
            return this.length;
        }

        public final long getStartIndex() {
            return this.startIndex;
        }

        @l
        public final String getType() {
            return this.type;
        }

        public final void setLength(int i10) {
            this.length = i10;
        }

        public final void setStartIndex(long j10) {
            this.startIndex = j10;
        }

        public final void setType(@l String str) {
            this.type = str;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(v vVar) {
            this();
        }
    }

    public AnimConfigManager(@k AnimPlayer player) {
        g0.q(player, "player");
        this.player = player;
    }

    private final boolean parse(IFileContainer iFileContainer, int i10, int i11) {
        BoxHead boxHead;
        AnimConfig animConfig = new AnimConfig();
        this.config = animConfig;
        iFileContainer.startRandomRead();
        byte[] bArr = new byte[8];
        long length = 0;
        while (iFileContainer.read(bArr, 0, 8) == 8 && (boxHead = parseBoxHead(bArr)) != null) {
            if (g0.g("vapc", boxHead.getType())) {
                boxHead.setStartIndex(length);
                break;
            }
            length += (long) boxHead.getLength();
            iFileContainer.skip(((long) boxHead.getLength()) - 8);
        }
        boxHead = null;
        if (boxHead == null) {
            ALog.INSTANCE.e(TAG, "vapc box head not found");
            animConfig.setDefaultConfig(true);
            animConfig.setDefaultVideoMode(i10);
            animConfig.setFps(i11);
            this.player.setFps(animConfig.getFps());
            return true;
        }
        int length2 = boxHead.getLength() - 8;
        byte[] bArr2 = new byte[length2];
        iFileContainer.read(bArr2, 0, length2);
        iFileContainer.closeRandomRead();
        Charset charsetForName = Charset.forName("UTF-8");
        g0.h(charsetForName, "Charset.forName(\"UTF-8\")");
        JSONObject jSONObject = new JSONObject(new String(bArr2, 0, length2, charsetForName));
        animConfig.setJsonConfig(jSONObject);
        boolean z10 = animConfig.parse(jSONObject);
        if (i11 > 0) {
            animConfig.setFps(i11);
        }
        this.player.setFps(animConfig.getFps());
        return z10;
    }

    private final BoxHead parseBoxHead(byte[] bArr) {
        if (bArr.length != 8) {
            return null;
        }
        BoxHead boxHead = new BoxHead();
        boxHead.setLength(((bArr[2] & 255) << 8) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | (bArr[3] & 255));
        Charset charsetForName = Charset.forName(C.ASCII_NAME);
        g0.h(charsetForName, "Charset.forName(\"US-ASCII\")");
        boxHead.setType(new String(bArr, 4, 4, charsetForName));
        return boxHead;
    }

    public final void defaultConfig(int i10, int i11) {
        AnimConfig animConfig;
        AnimConfig animConfig2 = this.config;
        if ((animConfig2 == null || animConfig2.isDefaultConfig()) && (animConfig = this.config) != null) {
            animConfig.setVideoWidth(i10);
            animConfig.setVideoHeight(i11);
            int defaultVideoMode = animConfig.getDefaultVideoMode();
            if (defaultVideoMode == 1) {
                animConfig.setWidth(i10 / 2);
                animConfig.setHeight(i11);
                animConfig.setAlphaPointRect(new PointRect(0, 0, animConfig.getWidth(), animConfig.getHeight()));
                animConfig.setRgbPointRect(new PointRect(animConfig.getWidth(), 0, animConfig.getWidth(), animConfig.getHeight()));
                return;
            }
            if (defaultVideoMode == 2) {
                animConfig.setWidth(i10);
                animConfig.setHeight(i11 / 2);
                animConfig.setAlphaPointRect(new PointRect(0, 0, animConfig.getWidth(), animConfig.getHeight()));
                animConfig.setRgbPointRect(new PointRect(0, animConfig.getHeight(), animConfig.getWidth(), animConfig.getHeight()));
                return;
            }
            if (defaultVideoMode == 3) {
                animConfig.setWidth(i10 / 2);
                animConfig.setHeight(i11);
                animConfig.setRgbPointRect(new PointRect(0, 0, animConfig.getWidth(), animConfig.getHeight()));
                animConfig.setAlphaPointRect(new PointRect(animConfig.getWidth(), 0, animConfig.getWidth(), animConfig.getHeight()));
                return;
            }
            if (defaultVideoMode != 4) {
                animConfig.setWidth(i10 / 2);
                animConfig.setHeight(i11);
                animConfig.setAlphaPointRect(new PointRect(0, 0, animConfig.getWidth(), animConfig.getHeight()));
                animConfig.setRgbPointRect(new PointRect(animConfig.getWidth(), 0, animConfig.getWidth(), animConfig.getHeight()));
                return;
            }
            animConfig.setWidth(i10);
            animConfig.setHeight(i11 / 2);
            animConfig.setRgbPointRect(new PointRect(0, 0, animConfig.getWidth(), animConfig.getHeight()));
            animConfig.setAlphaPointRect(new PointRect(0, animConfig.getHeight(), animConfig.getWidth(), animConfig.getHeight()));
        }
    }

    @l
    public final AnimConfig getConfig() {
        return this.config;
    }

    @k
    public final AnimPlayer getPlayer() {
        return this.player;
    }

    public final boolean isParsingConfig() {
        return this.isParsingConfig;
    }

    public final int parseConfig(@k IFileContainer fileContainer, boolean z10, int i10, int i11) {
        g0.q(fileContainer, "fileContainer");
        try {
            this.isParsingConfig = true;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z11 = parse(fileContainer, i10, i11);
            ALog.INSTANCE.i(TAG, "parseConfig cost=" + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms enableVersion1=" + z10 + " result=" + z11);
            if (!z11) {
                this.isParsingConfig = false;
                return 10005;
            }
            AnimConfig animConfig = this.config;
            if (animConfig != null && animConfig.isDefaultConfig() && !z10) {
                this.isParsingConfig = false;
                return 10005;
            }
            AnimConfig animConfig2 = this.config;
            int iOnConfigCreate = animConfig2 != null ? this.player.getPluginManager().onConfigCreate(animConfig2) : 0;
            this.isParsingConfig = false;
            return iOnConfigCreate;
        } catch (Throwable th2) {
            ALog.INSTANCE.e(TAG, "parseConfig error " + th2, th2);
            this.isParsingConfig = false;
            return 10005;
        }
    }

    public final void setConfig(@l AnimConfig animConfig) {
        this.config = animConfig;
    }

    public final void setParsingConfig(boolean z10) {
        this.isParsingConfig = z10;
    }
}
