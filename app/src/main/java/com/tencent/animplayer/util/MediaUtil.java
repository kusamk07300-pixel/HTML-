package com.tencent.qgame.animplayer.util;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.tencent.qgame.animplayer.file.IFileContainer;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.g0;
import kotlin.text.l0;
import o8.b;
import to.k;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaUtil {

    @k
    public static final String MIME_HEVC = "video/hevc";
    private static final String TAG = "AnimPlayer.MediaUtil";
    private static boolean isTypeMapInit;
    public static final MediaUtil INSTANCE = new MediaUtil();
    private static final HashMap<String, Boolean> supportTypeMap = new HashMap<>();

    private MediaUtil() {
    }

    private final void getSupportType() {
        try {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i10 = 0; i10 < codecCount; i10++) {
                MediaCodecInfo codecInfo = MediaCodecList.getCodecInfoAt(i10);
                g0.h(codecInfo, "codecInfo");
                if (!codecInfo.isEncoder()) {
                    String[] types = codecInfo.getSupportedTypes();
                    g0.h(types, "types");
                    for (String str : types) {
                        HashMap<String, Boolean> map = supportTypeMap;
                        g0.h(str, "types[j]");
                        if (str == null) {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                        String lowerCase = str.toLowerCase();
                        g0.h(lowerCase, "(this as java.lang.String).toLowerCase()");
                        map.put(lowerCase, Boolean.TRUE);
                    }
                }
            }
            ALog.INSTANCE.i(TAG, "supportType=" + supportTypeMap.keySet());
        } catch (Throwable th2) {
            ALog.INSTANCE.e(TAG, "getSupportType " + th2);
        }
    }

    public final boolean checkIsHevc(@k MediaFormat videoFormat) {
        g0.q(videoFormat, "videoFormat");
        String string = videoFormat.getString("mime");
        if (string == null) {
            string = "";
        }
        return l0.n3(string, "hevc", false, 2, null);
    }

    public final synchronized boolean checkSupportCodec(@k String mimeType) {
        HashMap<String, Boolean> map;
        String lowerCase;
        try {
            g0.q(mimeType, "mimeType");
            if (!isTypeMapInit) {
                isTypeMapInit = true;
                getSupportType();
            }
            map = supportTypeMap;
            lowerCase = mimeType.toLowerCase();
            g0.h(lowerCase, "(this as java.lang.String).toLowerCase()");
        } catch (Throwable th2) {
            throw th2;
        }
        return map.containsKey(lowerCase);
    }

    @k
    public final MediaExtractor getExtractor(@k IFileContainer file) {
        g0.q(file, "file");
        MediaExtractor mediaExtractor = new MediaExtractor();
        file.setDataSource(mediaExtractor);
        return mediaExtractor;
    }

    public final int selectAudioTrack(@k MediaExtractor extractor) {
        g0.q(extractor, "extractor");
        int trackCount = extractor.getTrackCount();
        for (int i10 = 0; i10 < trackCount; i10++) {
            MediaFormat trackFormat = extractor.getTrackFormat(i10);
            String string = trackFormat.getString("mime");
            if (string == null) {
                string = "";
            }
            if (kotlin.text.g0.J2(string, b.f37817w, false, 2, null)) {
                ALog.INSTANCE.i(TAG, "Extractor selected track " + i10 + " (" + string + "): " + trackFormat);
                return i10;
            }
        }
        return -1;
    }

    public final int selectVideoTrack(@k MediaExtractor extractor) {
        g0.q(extractor, "extractor");
        int trackCount = extractor.getTrackCount();
        for (int i10 = 0; i10 < trackCount; i10++) {
            MediaFormat trackFormat = extractor.getTrackFormat(i10);
            String string = trackFormat.getString("mime");
            if (string == null) {
                string = "";
            }
            if (kotlin.text.g0.J2(string, "video/", false, 2, null)) {
                ALog.INSTANCE.i(TAG, "Extractor selected track " + i10 + " (" + string + "): " + trackFormat);
                return i10;
            }
        }
        return -1;
    }
}
