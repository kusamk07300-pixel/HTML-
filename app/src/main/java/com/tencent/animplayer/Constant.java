package com.tencent.qgame.animplayer;

import kotlin.o;
import to.k;
import to.l;

/* JADX INFO: loaded from: classes2.dex */
public final class Constant {

    @k
    public static final String ERROR_MSG_CONFIG_PLUGIN_MIX = "0x6 vapx fail";

    @k
    public static final String ERROR_MSG_CREATE_RENDER = "0x4 render create fail";

    @k
    public static final String ERROR_MSG_CREATE_THREAD = "0x3 thread create fail";

    @k
    public static final String ERROR_MSG_DECODE_EXC = "0x2 MediaCodec exception";

    @k
    public static final String ERROR_MSG_EXTRACTOR_EXC = "0x1 MediaExtractor exception";

    @k
    public static final String ERROR_MSG_FILE_ERROR = "0x7 file can't read";

    @k
    public static final String ERROR_MSG_HEVC_NOT_SUPPORT = "0x8 hevc not support";

    @k
    public static final String ERROR_MSG_PARSE_CONFIG = "0x5 parse config fail";
    public static final Constant INSTANCE = new Constant();
    public static final int OK = 0;
    public static final int ORIEN_DEFAULT = 0;
    public static final int ORIEN_LANDSCAPE = 2;
    public static final int ORIEN_PORTRAIT = 1;
    public static final int REPORT_ERROR_TYPE_CONFIG_PLUGIN_MIX = 10006;
    public static final int REPORT_ERROR_TYPE_CREATE_RENDER = 10004;
    public static final int REPORT_ERROR_TYPE_CREATE_THREAD = 10003;
    public static final int REPORT_ERROR_TYPE_DECODE_EXC = 10002;
    public static final int REPORT_ERROR_TYPE_EXTRACTOR_EXC = 10001;
    public static final int REPORT_ERROR_TYPE_FILE_ERROR = 10007;
    public static final int REPORT_ERROR_TYPE_HEVC_NOT_SUPPORT = 10008;
    public static final int REPORT_ERROR_TYPE_PARSE_CONFIG = 10005;

    @k
    public static final String TAG = "AnimPlayer";
    public static final int VIDEO_MODE_SPLIT_HORIZONTAL = 1;
    public static final int VIDEO_MODE_SPLIT_HORIZONTAL_REVERSE = 3;
    public static final int VIDEO_MODE_SPLIT_VERTICAL = 2;
    public static final int VIDEO_MODE_SPLIT_VERTICAL_REVERSE = 4;

    private Constant() {
    }

    @o(message = "Compatible older version mp4")
    public static /* synthetic */ void VIDEO_MODE_SPLIT_HORIZONTAL$annotations() {
    }

    @o(message = "Compatible older version mp4")
    public static /* synthetic */ void VIDEO_MODE_SPLIT_HORIZONTAL_REVERSE$annotations() {
    }

    @o(message = "Compatible older version mp4")
    public static /* synthetic */ void VIDEO_MODE_SPLIT_VERTICAL$annotations() {
    }

    @o(message = "Compatible older version mp4")
    public static /* synthetic */ void VIDEO_MODE_SPLIT_VERTICAL_REVERSE$annotations() {
    }

    public static /* synthetic */ String getErrorMsg$default(Constant constant, int i10, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return constant.getErrorMsg(i10, str);
    }

    @k
    public final String getErrorMsg(int i10, @l String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        switch (i10) {
            case 10001:
                str2 = "0x1 MediaExtractor exception";
                break;
            case 10002:
                str2 = "0x2 MediaCodec exception";
                break;
            case 10003:
                str2 = "0x3 thread create fail";
                break;
            case 10004:
                str2 = "0x4 render create fail";
                break;
            case 10005:
                str2 = "0x5 parse config fail";
                break;
            case 10006:
                str2 = ERROR_MSG_CONFIG_PLUGIN_MIX;
                break;
            default:
                str2 = "unknown";
                break;
        }
        sb2.append(str2);
        sb2.append(' ');
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
