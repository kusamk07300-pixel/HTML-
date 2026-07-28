package net.babycat.live.platform.widget.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import f.p0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import wo.b;

/* JADX INFO: loaded from: classes3.dex */
public class CanvasGiftAnimView extends View {
    private static final long ANIMATION_DURATION_MS = 600;
    private static final long EMIT_INTERVAL_MS = 8;
    private static final double ENLARGE_END_PROGRESS = 0.2d;
    private static final int FRAME_WINDOW_SIZE = 5;
    private static final int MAX_BURST_STARTS_PER_FRAME = 30;
    private static int MAX_CONCURRENT_ANIMATIONS = 60;
    private static final int MAX_STARTS_PER_FRAME = 1;
    private static final double NARROW_START_PROGRESS = 0.8d;
    private final AccelerateInterpolator accelerateInterpolator;
    private final ArrayList<GiftDrawable> activeGifts;
    private int burstStartBudget;
    private double emitAccumulatorMs;
    private boolean engineRunning;
    private final Choreographer.FrameCallback frameCallback;
    private int frameIndex;
    private int giftIdCounter;
    private final ConcurrentHashMap<Integer, GiftDrawable> giftMap;
    private final long[] lastFrameDurations;
    private long lastFrameMs;
    private final LinearInterpolator linearInterpolator;
    private final Paint paint;
    private final Deque<GiftDrawable> pendingGifts;

    public static class GiftDrawable {
        Bitmap bitmap;
        float endX;
        float endY;
        int giftId;
        int height;
        public OnAnimationEndListener onAnimationEndListener;
        public long startDelayMs;
        long startUptimeMs;
        float startX;
        float startY;
        int width;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        float f37140x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        float f37141y;
        float scale = 1.0f;
        float alpha = 1.0f;

        public GiftDrawable(Bitmap bitmap, float f10, float f11, float f12, float f13) {
            reset(bitmap, f10, f11, f12, f13);
        }

        public boolean isBitmapRecycled() {
            Bitmap bitmap = this.bitmap;
            return bitmap == null || bitmap.isRecycled();
        }

        public void reset(Bitmap bitmap, float f10, float f11, float f12, float f13) {
            this.bitmap = bitmap;
            this.startX = f10;
            this.startY = f11;
            this.endX = f12;
            this.endY = f13;
            this.f37140x = f10;
            this.f37141y = f11;
            this.scale = 0.0f;
            this.alpha = 1.0f;
            this.startUptimeMs = 0L;
            if (bitmap == null || bitmap.isRecycled()) {
                this.width = 0;
                this.height = 0;
            } else {
                this.width = bitmap.getWidth();
                this.height = bitmap.getHeight();
            }
        }
    }

    public interface OnAnimationEndListener {
        void onAnimationEnd();
    }

    static {
        try {
            long jMaxMemory = Runtime.getRuntime().maxMemory() / 1048576;
            if (jMaxMemory < 1024) {
                MAX_CONCURRENT_ANIMATIONS = 60;
                return;
            }
            if (jMaxMemory < PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                MAX_CONCURRENT_ANIMATIONS = 90;
            } else if (jMaxMemory < PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
                MAX_CONCURRENT_ANIMATIONS = 120;
            } else {
                MAX_CONCURRENT_ANIMATIONS = 180;
            }
        } catch (Exception unused) {
            MAX_CONCURRENT_ANIMATIONS = 90;
        }
    }

    public CanvasGiftAnimView(Context context) {
        super(context);
        this.activeGifts = new ArrayList<>();
        this.pendingGifts = new ArrayDeque();
        this.paint = new Paint(1);
        this.giftMap = new ConcurrentHashMap<>();
        this.giftIdCounter = 0;
        this.burstStartBudget = 0;
        this.engineRunning = false;
        this.lastFrameMs = 0L;
        this.emitAccumulatorMs = 0.0d;
        this.linearInterpolator = new LinearInterpolator();
        this.accelerateInterpolator = new AccelerateInterpolator();
        this.lastFrameDurations = new long[5];
        this.frameIndex = 0;
        this.frameCallback = new Choreographer.FrameCallback() { // from class: net.babycat.live.platform.widget.view.CanvasGiftAnimView.1
            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j10) {
                double d10;
                Bitmap bitmap;
                GiftDrawable giftDrawablePollNextValidPending;
                CanvasGiftAnimView.this.engineRunning = false;
                if (CanvasGiftAnimView.this.isAttachedToWindow()) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    if (CanvasGiftAnimView.this.lastFrameMs == 0) {
                        CanvasGiftAnimView.this.lastFrameMs = jUptimeMillis;
                    }
                    long jMin = Math.min(50L, Math.max(0L, jUptimeMillis - CanvasGiftAnimView.this.lastFrameMs));
                    CanvasGiftAnimView.this.lastFrameMs = jUptimeMillis;
                    double d11 = jMin;
                    CanvasGiftAnimView.this.emitAccumulatorMs += d11;
                    CanvasGiftAnimView.this.lastFrameDurations[CanvasGiftAnimView.this.frameIndex % 5] = jMin;
                    CanvasGiftAnimView.this.frameIndex++;
                    long j11 = 0;
                    int i10 = 0;
                    for (long j12 : CanvasGiftAnimView.this.lastFrameDurations) {
                        if (j12 > 0) {
                            j11 += j12;
                            i10++;
                        }
                    }
                    double d12 = 1.0d;
                    if (i10 > 0) {
                        d11 = (j11 * 1.0d) / ((double) i10);
                    }
                    boolean z10 = d11 > 33.0d;
                    CanvasGiftAnimView canvasGiftAnimView = CanvasGiftAnimView.this;
                    double d13 = 8L;
                    canvasGiftAnimView.emitAccumulatorMs = Math.min(canvasGiftAnimView.emitAccumulatorMs, d13);
                    int iMax = z10 ? Math.max(1, 15) : 30;
                    for (int i11 = 0; i11 < iMax && CanvasGiftAnimView.this.burstStartBudget > 0 && CanvasGiftAnimView.this.activeGifts.size() < CanvasGiftAnimView.MAX_CONCURRENT_ANIMATIONS && !CanvasGiftAnimView.this.pendingGifts.isEmpty(); i11++) {
                        GiftDrawable giftDrawablePollNextValidPending2 = CanvasGiftAnimView.this.pollNextValidPending();
                        if (giftDrawablePollNextValidPending2 == null) {
                            break;
                        }
                        giftDrawablePollNextValidPending2.startUptimeMs = jUptimeMillis;
                        CanvasGiftAnimView.this.activeGifts.add(giftDrawablePollNextValidPending2);
                        CanvasGiftAnimView.this.burstStartBudget--;
                    }
                    if (CanvasGiftAnimView.this.emitAccumulatorMs >= d13 && CanvasGiftAnimView.this.activeGifts.size() < CanvasGiftAnimView.MAX_CONCURRENT_ANIMATIONS && !CanvasGiftAnimView.this.pendingGifts.isEmpty() && (giftDrawablePollNextValidPending = CanvasGiftAnimView.this.pollNextValidPending()) != null) {
                        giftDrawablePollNextValidPending.startUptimeMs = jUptimeMillis;
                        CanvasGiftAnimView.this.activeGifts.add(giftDrawablePollNextValidPending);
                        CanvasGiftAnimView.this.emitAccumulatorMs -= d13;
                    }
                    if (!CanvasGiftAnimView.this.activeGifts.isEmpty()) {
                        int size = CanvasGiftAnimView.this.activeGifts.size() - 1;
                        while (size >= 0) {
                            GiftDrawable giftDrawable = (GiftDrawable) CanvasGiftAnimView.this.activeGifts.get(size);
                            if (giftDrawable == null || (bitmap = giftDrawable.bitmap) == null || bitmap.isRecycled()) {
                                d10 = d12;
                                CanvasGiftAnimView.this.activeGifts.remove(size);
                            } else {
                                long j13 = jUptimeMillis - giftDrawable.startUptimeMs;
                                if (j13 < 0) {
                                    j13 = 0;
                                }
                                double dMin = Math.min(d12, Math.max(0.0d, j13 / 600.0d));
                                float f10 = (float) dMin;
                                float interpolation = CanvasGiftAnimView.this.linearInterpolator.getInterpolation(f10);
                                float interpolation2 = CanvasGiftAnimView.this.accelerateInterpolator.getInterpolation(f10);
                                float f11 = giftDrawable.startX;
                                giftDrawable.f37140x = f11 + ((giftDrawable.endX - f11) * interpolation);
                                float f12 = giftDrawable.startY;
                                giftDrawable.f37141y = f12 + ((giftDrawable.endY - f12) * interpolation2);
                                d10 = d12;
                                if (dMin < CanvasGiftAnimView.ENLARGE_END_PROGRESS) {
                                    giftDrawable.scale = (float) (dMin / CanvasGiftAnimView.ENLARGE_END_PROGRESS);
                                } else if (dMin < CanvasGiftAnimView.NARROW_START_PROGRESS) {
                                    giftDrawable.scale = 1.0f;
                                } else {
                                    giftDrawable.scale = (float) (d10 - ((dMin - CanvasGiftAnimView.NARROW_START_PROGRESS) / 0.19999999999999996d));
                                }
                                if (dMin < CanvasGiftAnimView.NARROW_START_PROGRESS) {
                                    giftDrawable.alpha = 1.0f;
                                } else {
                                    giftDrawable.alpha = (float) Math.max(0.0d, d10 - ((dMin - CanvasGiftAnimView.NARROW_START_PROGRESS) / 0.19999999999999996d));
                                }
                                if (Float.isNaN(giftDrawable.f37140x) || Float.isInfinite(giftDrawable.f37140x)) {
                                    giftDrawable.f37140x = giftDrawable.startX;
                                }
                                if (Float.isNaN(giftDrawable.f37141y) || Float.isInfinite(giftDrawable.f37141y)) {
                                    giftDrawable.f37141y = giftDrawable.startY;
                                }
                                if (Float.isNaN(giftDrawable.scale) || Float.isInfinite(giftDrawable.scale) || giftDrawable.scale < 0.0f) {
                                    giftDrawable.scale = 1.0f;
                                }
                                if (Float.isNaN(giftDrawable.alpha) || Float.isInfinite(giftDrawable.alpha)) {
                                    giftDrawable.alpha = 1.0f;
                                } else {
                                    float f13 = giftDrawable.alpha;
                                    if (f13 < 0.0f) {
                                        giftDrawable.alpha = 0.0f;
                                    } else if (f13 > 1.0f) {
                                        giftDrawable.alpha = 1.0f;
                                    }
                                }
                                if (dMin >= d10) {
                                    CanvasGiftAnimView.this.activeGifts.remove(size);
                                    OnAnimationEndListener onAnimationEndListener = giftDrawable.onAnimationEndListener;
                                    if (onAnimationEndListener != null) {
                                        onAnimationEndListener.onAnimationEnd();
                                    }
                                }
                            }
                            size--;
                            d12 = d10;
                        }
                    }
                    if (CanvasGiftAnimView.this.pendingGifts.isEmpty() && CanvasGiftAnimView.this.activeGifts.isEmpty()) {
                        return;
                    }
                    CanvasGiftAnimView.this.ensureEngine();
                    CanvasGiftAnimView.this.postInvalidateOnAnimation();
                }
            }
        };
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ensureEngine() {
        if (this.engineRunning) {
            return;
        }
        this.engineRunning = true;
        Choreographer.getInstance().postFrameCallback(this.frameCallback);
    }

    private void init() {
        try {
            if (Runtime.getRuntime().maxMemory() / 1048576 >= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                setLayerType(2, null);
            } else {
                setLayerType(1, null);
            }
        } catch (Exception unused) {
            setLayerType(2, null);
        }
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public GiftDrawable pollNextValidPending() {
        while (true) {
            GiftDrawable giftDrawablePollFirst = this.pendingGifts.pollFirst();
            if (giftDrawablePollFirst == null) {
                return null;
            }
            Bitmap bitmap = giftDrawablePollFirst.bitmap;
            if (bitmap != null && !bitmap.isRecycled()) {
                return giftDrawablePollFirst;
            }
        }
    }

    private void scheduleInvalidate() {
        postInvalidateOnAnimation();
    }

    public int addGift(GiftDrawable giftDrawable) {
        Bitmap bitmap;
        if (giftDrawable == null || (bitmap = giftDrawable.bitmap) == null || bitmap.isRecycled()) {
            b.x("CanvasGiftAnimView: 添加礼物失败，bitmap 无效", new Object[0]);
            return -1;
        }
        int i10 = this.giftIdCounter;
        this.giftIdCounter = i10 + 1;
        giftDrawable.giftId = i10;
        this.giftMap.put(Integer.valueOf(i10), giftDrawable);
        if (this.activeGifts.size() >= MAX_CONCURRENT_ANIMATIONS) {
            this.pendingGifts.offerLast(giftDrawable);
            ensureEngine();
            scheduleInvalidate();
            return i10;
        }
        this.pendingGifts.offerLast(giftDrawable);
        ensureEngine();
        scheduleInvalidate();
        return i10;
    }

    public void addGiftsBurst(@p0 List<GiftDrawable> list, int i10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i11 = 0;
        for (GiftDrawable giftDrawable : list) {
            if (giftDrawable != null && giftDrawable.bitmap != null && !giftDrawable.isBitmapRecycled()) {
                int i12 = this.giftIdCounter;
                this.giftIdCounter = i12 + 1;
                giftDrawable.giftId = i12;
                this.giftMap.put(Integer.valueOf(i12), giftDrawable);
                this.pendingGifts.offerLast(giftDrawable);
                i11++;
            }
        }
        if (i11 <= 0) {
            return;
        }
        this.burstStartBudget += Math.max(0, Math.min(i10, i11));
        ensureEngine();
        scheduleInvalidate();
    }

    public void clearAll() {
        this.activeGifts.clear();
        this.pendingGifts.clear();
        this.giftMap.clear();
        Choreographer.getInstance().removeFrameCallback(this.frameCallback);
        this.engineRunning = false;
        this.lastFrameMs = 0L;
        this.emitAccumulatorMs = 0.0d;
        this.burstStartBudget = 0;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmap;
        super.onDraw(canvas);
        for (int i10 = 0; i10 < this.activeGifts.size(); i10++) {
            GiftDrawable giftDrawable = this.activeGifts.get(i10);
            if (giftDrawable != null && (bitmap = giftDrawable.bitmap) != null && !bitmap.isRecycled() && giftDrawable.alpha > 0.0f) {
                try {
                    canvas.save();
                    this.paint.setAlpha((int) (giftDrawable.alpha * 255.0f));
                    float f10 = giftDrawable.width / 2.0f;
                    float f11 = giftDrawable.height / 2.0f;
                    canvas.translate(giftDrawable.f37140x - f10, giftDrawable.f37141y - f11);
                    float f12 = giftDrawable.scale;
                    canvas.scale(f12, f12, f10, f11);
                    canvas.drawBitmap(giftDrawable.bitmap, 0.0f, 0.0f, this.paint);
                    canvas.restore();
                } catch (Exception e10) {
                    b.e("CanvasGiftAnimView: 绘制异常: %s", e10.getMessage());
                }
            }
        }
        if (this.activeGifts.isEmpty()) {
            return;
        }
        postInvalidateOnAnimation();
    }

    public void removeGift(int i10) {
        GiftDrawable giftDrawableRemove = this.giftMap.remove(Integer.valueOf(i10));
        if (giftDrawableRemove != null) {
            this.activeGifts.remove(giftDrawableRemove);
            this.pendingGifts.remove(giftDrawableRemove);
            ensureEngine();
            scheduleInvalidate();
        }
    }

    public CanvasGiftAnimView(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.activeGifts = new ArrayList<>();
        this.pendingGifts = new ArrayDeque();
        this.paint = new Paint(1);
        this.giftMap = new ConcurrentHashMap<>();
        this.giftIdCounter = 0;
        this.burstStartBudget = 0;
        this.engineRunning = false;
        this.lastFrameMs = 0L;
        this.emitAccumulatorMs = 0.0d;
        this.linearInterpolator = new LinearInterpolator();
        this.accelerateInterpolator = new AccelerateInterpolator();
        this.lastFrameDurations = new long[5];
        this.frameIndex = 0;
        this.frameCallback = new Choreographer.FrameCallback() { // from class: net.babycat.live.platform.widget.view.CanvasGiftAnimView.1
            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j10) {
                double d10;
                Bitmap bitmap;
                GiftDrawable giftDrawablePollNextValidPending;
                CanvasGiftAnimView.this.engineRunning = false;
                if (CanvasGiftAnimView.this.isAttachedToWindow()) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    if (CanvasGiftAnimView.this.lastFrameMs == 0) {
                        CanvasGiftAnimView.this.lastFrameMs = jUptimeMillis;
                    }
                    long jMin = Math.min(50L, Math.max(0L, jUptimeMillis - CanvasGiftAnimView.this.lastFrameMs));
                    CanvasGiftAnimView.this.lastFrameMs = jUptimeMillis;
                    double d11 = jMin;
                    CanvasGiftAnimView.this.emitAccumulatorMs += d11;
                    CanvasGiftAnimView.this.lastFrameDurations[CanvasGiftAnimView.this.frameIndex % 5] = jMin;
                    CanvasGiftAnimView.this.frameIndex++;
                    long j11 = 0;
                    int i10 = 0;
                    for (long j12 : CanvasGiftAnimView.this.lastFrameDurations) {
                        if (j12 > 0) {
                            j11 += j12;
                            i10++;
                        }
                    }
                    double d12 = 1.0d;
                    if (i10 > 0) {
                        d11 = (j11 * 1.0d) / ((double) i10);
                    }
                    boolean z10 = d11 > 33.0d;
                    CanvasGiftAnimView canvasGiftAnimView = CanvasGiftAnimView.this;
                    double d13 = 8L;
                    canvasGiftAnimView.emitAccumulatorMs = Math.min(canvasGiftAnimView.emitAccumulatorMs, d13);
                    int iMax = z10 ? Math.max(1, 15) : 30;
                    for (int i11 = 0; i11 < iMax && CanvasGiftAnimView.this.burstStartBudget > 0 && CanvasGiftAnimView.this.activeGifts.size() < CanvasGiftAnimView.MAX_CONCURRENT_ANIMATIONS && !CanvasGiftAnimView.this.pendingGifts.isEmpty(); i11++) {
                        GiftDrawable giftDrawablePollNextValidPending2 = CanvasGiftAnimView.this.pollNextValidPending();
                        if (giftDrawablePollNextValidPending2 == null) {
                            break;
                        }
                        giftDrawablePollNextValidPending2.startUptimeMs = jUptimeMillis;
                        CanvasGiftAnimView.this.activeGifts.add(giftDrawablePollNextValidPending2);
                        CanvasGiftAnimView.this.burstStartBudget--;
                    }
                    if (CanvasGiftAnimView.this.emitAccumulatorMs >= d13 && CanvasGiftAnimView.this.activeGifts.size() < CanvasGiftAnimView.MAX_CONCURRENT_ANIMATIONS && !CanvasGiftAnimView.this.pendingGifts.isEmpty() && (giftDrawablePollNextValidPending = CanvasGiftAnimView.this.pollNextValidPending()) != null) {
                        giftDrawablePollNextValidPending.startUptimeMs = jUptimeMillis;
                        CanvasGiftAnimView.this.activeGifts.add(giftDrawablePollNextValidPending);
                        CanvasGiftAnimView.this.emitAccumulatorMs -= d13;
                    }
                    if (!CanvasGiftAnimView.this.activeGifts.isEmpty()) {
                        int size = CanvasGiftAnimView.this.activeGifts.size() - 1;
                        while (size >= 0) {
                            GiftDrawable giftDrawable = (GiftDrawable) CanvasGiftAnimView.this.activeGifts.get(size);
                            if (giftDrawable == null || (bitmap = giftDrawable.bitmap) == null || bitmap.isRecycled()) {
                                d10 = d12;
                                CanvasGiftAnimView.this.activeGifts.remove(size);
                            } else {
                                long j13 = jUptimeMillis - giftDrawable.startUptimeMs;
                                if (j13 < 0) {
                                    j13 = 0;
                                }
                                double dMin = Math.min(d12, Math.max(0.0d, j13 / 600.0d));
                                float f10 = (float) dMin;
                                float interpolation = CanvasGiftAnimView.this.linearInterpolator.getInterpolation(f10);
                                float interpolation2 = CanvasGiftAnimView.this.accelerateInterpolator.getInterpolation(f10);
                                float f11 = giftDrawable.startX;
                                giftDrawable.f37140x = f11 + ((giftDrawable.endX - f11) * interpolation);
                                float f12 = giftDrawable.startY;
                                giftDrawable.f37141y = f12 + ((giftDrawable.endY - f12) * interpolation2);
                                d10 = d12;
                                if (dMin < CanvasGiftAnimView.ENLARGE_END_PROGRESS) {
                                    giftDrawable.scale = (float) (dMin / CanvasGiftAnimView.ENLARGE_END_PROGRESS);
                                } else if (dMin < CanvasGiftAnimView.NARROW_START_PROGRESS) {
                                    giftDrawable.scale = 1.0f;
                                } else {
                                    giftDrawable.scale = (float) (d10 - ((dMin - CanvasGiftAnimView.NARROW_START_PROGRESS) / 0.19999999999999996d));
                                }
                                if (dMin < CanvasGiftAnimView.NARROW_START_PROGRESS) {
                                    giftDrawable.alpha = 1.0f;
                                } else {
                                    giftDrawable.alpha = (float) Math.max(0.0d, d10 - ((dMin - CanvasGiftAnimView.NARROW_START_PROGRESS) / 0.19999999999999996d));
                                }
                                if (Float.isNaN(giftDrawable.f37140x) || Float.isInfinite(giftDrawable.f37140x)) {
                                    giftDrawable.f37140x = giftDrawable.startX;
                                }
                                if (Float.isNaN(giftDrawable.f37141y) || Float.isInfinite(giftDrawable.f37141y)) {
                                    giftDrawable.f37141y = giftDrawable.startY;
                                }
                                if (Float.isNaN(giftDrawable.scale) || Float.isInfinite(giftDrawable.scale) || giftDrawable.scale < 0.0f) {
                                    giftDrawable.scale = 1.0f;
                                }
                                if (Float.isNaN(giftDrawable.alpha) || Float.isInfinite(giftDrawable.alpha)) {
                                    giftDrawable.alpha = 1.0f;
                                } else {
                                    float f13 = giftDrawable.alpha;
                                    if (f13 < 0.0f) {
                                        giftDrawable.alpha = 0.0f;
                                    } else if (f13 > 1.0f) {
                                        giftDrawable.alpha = 1.0f;
                                    }
                                }
                                if (dMin >= d10) {
                                    CanvasGiftAnimView.this.activeGifts.remove(size);
                                    OnAnimationEndListener onAnimationEndListener = giftDrawable.onAnimationEndListener;
                                    if (onAnimationEndListener != null) {
                                        onAnimationEndListener.onAnimationEnd();
                                    }
                                }
                            }
                            size--;
                            d12 = d10;
                        }
                    }
                    if (CanvasGiftAnimView.this.pendingGifts.isEmpty() && CanvasGiftAnimView.this.activeGifts.isEmpty()) {
                        return;
                    }
                    CanvasGiftAnimView.this.ensureEngine();
                    CanvasGiftAnimView.this.postInvalidateOnAnimation();
                }
            }
        };
        init();
    }

    public CanvasGiftAnimView(Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.activeGifts = new ArrayList<>();
        this.pendingGifts = new ArrayDeque();
        this.paint = new Paint(1);
        this.giftMap = new ConcurrentHashMap<>();
        this.giftIdCounter = 0;
        this.burstStartBudget = 0;
        this.engineRunning = false;
        this.lastFrameMs = 0L;
        this.emitAccumulatorMs = 0.0d;
        this.linearInterpolator = new LinearInterpolator();
        this.accelerateInterpolator = new AccelerateInterpolator();
        this.lastFrameDurations = new long[5];
        this.frameIndex = 0;
        this.frameCallback = new Choreographer.FrameCallback() { // from class: net.babycat.live.platform.widget.view.CanvasGiftAnimView.1
            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j10) {
                double d10;
                Bitmap bitmap;
                GiftDrawable giftDrawablePollNextValidPending;
                CanvasGiftAnimView.this.engineRunning = false;
                if (CanvasGiftAnimView.this.isAttachedToWindow()) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    if (CanvasGiftAnimView.this.lastFrameMs == 0) {
                        CanvasGiftAnimView.this.lastFrameMs = jUptimeMillis;
                    }
                    long jMin = Math.min(50L, Math.max(0L, jUptimeMillis - CanvasGiftAnimView.this.lastFrameMs));
                    CanvasGiftAnimView.this.lastFrameMs = jUptimeMillis;
                    double d11 = jMin;
                    CanvasGiftAnimView.this.emitAccumulatorMs += d11;
                    CanvasGiftAnimView.this.lastFrameDurations[CanvasGiftAnimView.this.frameIndex % 5] = jMin;
                    CanvasGiftAnimView.this.frameIndex++;
                    long j11 = 0;
                    int i102 = 0;
                    for (long j12 : CanvasGiftAnimView.this.lastFrameDurations) {
                        if (j12 > 0) {
                            j11 += j12;
                            i102++;
                        }
                    }
                    double d12 = 1.0d;
                    if (i102 > 0) {
                        d11 = (j11 * 1.0d) / ((double) i102);
                    }
                    boolean z10 = d11 > 33.0d;
                    CanvasGiftAnimView canvasGiftAnimView = CanvasGiftAnimView.this;
                    double d13 = 8L;
                    canvasGiftAnimView.emitAccumulatorMs = Math.min(canvasGiftAnimView.emitAccumulatorMs, d13);
                    int iMax = z10 ? Math.max(1, 15) : 30;
                    for (int i11 = 0; i11 < iMax && CanvasGiftAnimView.this.burstStartBudget > 0 && CanvasGiftAnimView.this.activeGifts.size() < CanvasGiftAnimView.MAX_CONCURRENT_ANIMATIONS && !CanvasGiftAnimView.this.pendingGifts.isEmpty(); i11++) {
                        GiftDrawable giftDrawablePollNextValidPending2 = CanvasGiftAnimView.this.pollNextValidPending();
                        if (giftDrawablePollNextValidPending2 == null) {
                            break;
                        }
                        giftDrawablePollNextValidPending2.startUptimeMs = jUptimeMillis;
                        CanvasGiftAnimView.this.activeGifts.add(giftDrawablePollNextValidPending2);
                        CanvasGiftAnimView.this.burstStartBudget--;
                    }
                    if (CanvasGiftAnimView.this.emitAccumulatorMs >= d13 && CanvasGiftAnimView.this.activeGifts.size() < CanvasGiftAnimView.MAX_CONCURRENT_ANIMATIONS && !CanvasGiftAnimView.this.pendingGifts.isEmpty() && (giftDrawablePollNextValidPending = CanvasGiftAnimView.this.pollNextValidPending()) != null) {
                        giftDrawablePollNextValidPending.startUptimeMs = jUptimeMillis;
                        CanvasGiftAnimView.this.activeGifts.add(giftDrawablePollNextValidPending);
                        CanvasGiftAnimView.this.emitAccumulatorMs -= d13;
                    }
                    if (!CanvasGiftAnimView.this.activeGifts.isEmpty()) {
                        int size = CanvasGiftAnimView.this.activeGifts.size() - 1;
                        while (size >= 0) {
                            GiftDrawable giftDrawable = (GiftDrawable) CanvasGiftAnimView.this.activeGifts.get(size);
                            if (giftDrawable == null || (bitmap = giftDrawable.bitmap) == null || bitmap.isRecycled()) {
                                d10 = d12;
                                CanvasGiftAnimView.this.activeGifts.remove(size);
                            } else {
                                long j13 = jUptimeMillis - giftDrawable.startUptimeMs;
                                if (j13 < 0) {
                                    j13 = 0;
                                }
                                double dMin = Math.min(d12, Math.max(0.0d, j13 / 600.0d));
                                float f10 = (float) dMin;
                                float interpolation = CanvasGiftAnimView.this.linearInterpolator.getInterpolation(f10);
                                float interpolation2 = CanvasGiftAnimView.this.accelerateInterpolator.getInterpolation(f10);
                                float f11 = giftDrawable.startX;
                                giftDrawable.f37140x = f11 + ((giftDrawable.endX - f11) * interpolation);
                                float f12 = giftDrawable.startY;
                                giftDrawable.f37141y = f12 + ((giftDrawable.endY - f12) * interpolation2);
                                d10 = d12;
                                if (dMin < CanvasGiftAnimView.ENLARGE_END_PROGRESS) {
                                    giftDrawable.scale = (float) (dMin / CanvasGiftAnimView.ENLARGE_END_PROGRESS);
                                } else if (dMin < CanvasGiftAnimView.NARROW_START_PROGRESS) {
                                    giftDrawable.scale = 1.0f;
                                } else {
                                    giftDrawable.scale = (float) (d10 - ((dMin - CanvasGiftAnimView.NARROW_START_PROGRESS) / 0.19999999999999996d));
                                }
                                if (dMin < CanvasGiftAnimView.NARROW_START_PROGRESS) {
                                    giftDrawable.alpha = 1.0f;
                                } else {
                                    giftDrawable.alpha = (float) Math.max(0.0d, d10 - ((dMin - CanvasGiftAnimView.NARROW_START_PROGRESS) / 0.19999999999999996d));
                                }
                                if (Float.isNaN(giftDrawable.f37140x) || Float.isInfinite(giftDrawable.f37140x)) {
                                    giftDrawable.f37140x = giftDrawable.startX;
                                }
                                if (Float.isNaN(giftDrawable.f37141y) || Float.isInfinite(giftDrawable.f37141y)) {
                                    giftDrawable.f37141y = giftDrawable.startY;
                                }
                                if (Float.isNaN(giftDrawable.scale) || Float.isInfinite(giftDrawable.scale) || giftDrawable.scale < 0.0f) {
                                    giftDrawable.scale = 1.0f;
                                }
                                if (Float.isNaN(giftDrawable.alpha) || Float.isInfinite(giftDrawable.alpha)) {
                                    giftDrawable.alpha = 1.0f;
                                } else {
                                    float f13 = giftDrawable.alpha;
                                    if (f13 < 0.0f) {
                                        giftDrawable.alpha = 0.0f;
                                    } else if (f13 > 1.0f) {
                                        giftDrawable.alpha = 1.0f;
                                    }
                                }
                                if (dMin >= d10) {
                                    CanvasGiftAnimView.this.activeGifts.remove(size);
                                    OnAnimationEndListener onAnimationEndListener = giftDrawable.onAnimationEndListener;
                                    if (onAnimationEndListener != null) {
                                        onAnimationEndListener.onAnimationEnd();
                                    }
                                }
                            }
                            size--;
                            d12 = d10;
                        }
                    }
                    if (CanvasGiftAnimView.this.pendingGifts.isEmpty() && CanvasGiftAnimView.this.activeGifts.isEmpty()) {
                        return;
                    }
                    CanvasGiftAnimView.this.ensureEngine();
                    CanvasGiftAnimView.this.postInvalidateOnAnimation();
                }
            }
        };
        init();
    }
}
