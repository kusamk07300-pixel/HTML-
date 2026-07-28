package net.babycat.live.platform.widget.view.like;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import net.babycat.live.platform.widget.view.like.TCAbstractPathAnimator;

/* JADX INFO: loaded from: classes3.dex */
public class TCPathAnimator extends TCAbstractPathAnimator {
    private static final int MAX_PATH_COUNTS = 10;
    private final AtomicInteger mCounter;
    private int mCurrentPathCounts;
    private Handler mHandler;
    private HashMap<Integer, Path> mPathVec;
    private final Random mRandom;

    public static class FloatAnimation extends Animation {
        private float mDistance;
        private PathMeasure mPm;
        private float mRotation;
        private View mView;

        public FloatAnimation(Path path, float f10, View view, View view2) {
            PathMeasure pathMeasure = new PathMeasure(path, false);
            this.mPm = pathMeasure;
            this.mDistance = pathMeasure.getLength();
            this.mView = view2;
            this.mRotation = f10;
            view.setLayerType(2, null);
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            this.mPm.getMatrix(this.mDistance * f10, transformation.getMatrix(), 1);
            this.mView.setRotation(this.mRotation * f10);
            float f11 = 3000.0f * f10;
            float fScale = f11 < 200.0f ? TCPathAnimator.scale(f10, 0.0d, 0.06666667014360428d, 0.20000000298023224d, 1.100000023841858d) : f11 < 300.0f ? TCPathAnimator.scale(f10, 0.06666667014360428d, 0.10000000149011612d, 1.100000023841858d, 1.0d) : 1.0f;
            this.mView.setScaleX(fScale);
            this.mView.setScaleY(fScale);
            transformation.setAlpha(1.0f - f10);
        }
    }

    public TCPathAnimator(TCAbstractPathAnimator.Config config) {
        super(config);
        this.mCounter = new AtomicInteger(0);
        this.mCurrentPathCounts = 0;
        this.mPathVec = null;
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mPathVec = new HashMap<>();
        this.mRandom = new Random();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float scale(double d10, double d11, double d12, double d13, double d14) {
        return (float) ((((d10 - d11) / (d12 - d11)) * (d14 - d13)) + d13);
    }

    @Override // net.babycat.live.platform.widget.view.like.TCAbstractPathAnimator
    public void start(final View view, final ViewGroup viewGroup) {
        Path pathCreatePath;
        TCAbstractPathAnimator.Config config = this.mConfig;
        viewGroup.addView(view, new ViewGroup.LayoutParams(config.heartWidth, config.heartHeight));
        int i10 = this.mCurrentPathCounts + 1;
        this.mCurrentPathCounts = i10;
        if (i10 > 10) {
            pathCreatePath = this.mPathVec.get(Integer.valueOf(Math.abs(this.mRandom.nextInt() % 10) + 1));
        } else {
            pathCreatePath = createPath(this.mCounter, viewGroup, 2);
            this.mPathVec.put(Integer.valueOf(this.mCurrentPathCounts), pathCreatePath);
        }
        FloatAnimation floatAnimation = new FloatAnimation(pathCreatePath, randomRotation(), viewGroup, view);
        floatAnimation.setDuration(this.mConfig.animDuration);
        floatAnimation.setInterpolator(new LinearInterpolator());
        floatAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: net.babycat.live.platform.widget.view.like.TCPathAnimator.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                TCPathAnimator.this.mHandler.post(new Runnable() { // from class: net.babycat.live.platform.widget.view.like.TCPathAnimator.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        viewGroup.removeView(view);
                    }
                });
                TCPathAnimator.this.mCounter.decrementAndGet();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                TCPathAnimator.this.mCounter.incrementAndGet();
            }
        });
        view.startAnimation(floatAnimation);
    }
}
