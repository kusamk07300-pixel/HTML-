package net.babycat.live.platform.widget.view.like;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import i0.e;
import java.util.Random;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes3.dex */
public class Love extends RelativeLayout {
    private static final int ANIMATION_DURATION = 2000;
    private static final int ICON_COUNT = 4;
    private static final int INTERPOLATOR_COUNT = 4;
    private static final int LOVE_VIEW_SIZE = 200;
    private Context context;
    private Drawable[] icons;
    private Interpolator[] interpolators;
    private int mHeight;
    private int mWidth;
    private RelativeLayout.LayoutParams params;

    public static class BasEvaluator implements TypeEvaluator<PointF> {
        private PointF mControlPoint1;
        private PointF mControlPoint2;

        public BasEvaluator(PointF pointF, PointF pointF2) {
            this.mControlPoint1 = pointF;
            this.mControlPoint2 = pointF2;
        }

        @Override // android.animation.TypeEvaluator
        public PointF evaluate(float f10, PointF pointF, PointF pointF2) {
            PointF pointF3 = new PointF();
            float f11 = 1.0f - f10;
            float f12 = pointF.x * f11 * f11 * f11;
            PointF pointF4 = this.mControlPoint1;
            float f13 = f12 + (pointF4.x * 3.0f * f10 * f11 * f11);
            PointF pointF5 = this.mControlPoint2;
            pointF3.x = f13 + (pointF5.x * 3.0f * f10 * f10 * f11) + (pointF2.x * f10 * f10 * f10);
            pointF3.y = (pointF.y * f11 * f11 * f11) + (pointF4.y * 3.0f * f10 * f11 * f11) + (pointF5.y * 3.0f * f10 * f10 * f11) + (pointF2.y * f10 * f10 * f10);
            return pointF3;
        }
    }

    public Love(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.context = context;
        initView();
    }

    private AnimatorSet getAnimatorSet(ImageView imageView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "alpha", 0.3f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, "scaleX", 0.2f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView, "scaleY", 0.2f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet.setDuration(2000L);
        ValueAnimator bzierAnimator = getBzierAnimator(imageView);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(animatorSet, bzierAnimator);
        animatorSet2.setTarget(imageView);
        return animatorSet2;
    }

    private ValueAnimator getBzierAnimator(final ImageView imageView) {
        PointF[] pointFs = getPointFs(imageView);
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new BasEvaluator(pointFs[1], pointFs[2]), pointFs[0], pointFs[3]);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: net.babycat.live.platform.widget.view.like.Love.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PointF pointF = (PointF) valueAnimator.getAnimatedValue();
                imageView.setX(pointF.x);
                imageView.setY(pointF.y);
                imageView.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
            }
        });
        valueAnimatorOfObject.setTarget(imageView);
        valueAnimatorOfObject.setDuration(2000L);
        valueAnimatorOfObject.setInterpolator(this.interpolators[new Random().nextInt(4)]);
        return valueAnimatorOfObject;
    }

    private PointF[] getPointFs(ImageView imageView) {
        PointF pointF = new PointF();
        pointF.x = this.mWidth;
        pointF.y = this.mHeight;
        int iMax = Math.max(1, this.mHeight / 2);
        PointF[] pointFArr = {pointF, new PointF(), new PointF(), pointF};
        pointFArr[1].x = new Random().nextInt(Math.max(1, this.mWidth));
        pointFArr[1].y = new Random().nextInt(iMax) + (this.mHeight / 2) + this.params.height;
        int iMax2 = Math.max(1, this.mHeight / 2);
        pointFArr[2].x = new Random().nextInt(Math.max(1, this.mWidth));
        pointFArr[2].y = new Random().nextInt(iMax2);
        PointF pointF2 = new PointF();
        pointF2.x = new Random().nextInt(Math.max(1, this.mWidth));
        pointFArr[3].y = 0.0f;
        return pointFArr;
    }

    private void initView() {
        Drawable[] drawableArr = new Drawable[4];
        this.icons = drawableArr;
        this.interpolators = new Interpolator[4];
        drawableArr[0] = e.l(this.context, R.drawable.heart_red);
        this.icons[1] = e.l(this.context, R.drawable.ic_heart);
        this.icons[2] = e.l(this.context, R.drawable.heart_red);
        this.icons[3] = e.l(this.context, R.drawable.ic_heart);
        this.interpolators[0] = new AccelerateDecelerateInterpolator();
        this.interpolators[1] = new AccelerateInterpolator();
        this.interpolators[2] = new DecelerateInterpolator();
        this.interpolators[3] = new LinearInterpolator();
    }

    public void addLoveView(float f10, float f11) {
        if (f10 < 100.0f) {
            f10 = 101.0f;
        }
        if (f11 < 100.0f) {
            f11 = 101.0f;
        }
        this.mWidth = (int) (f10 - 100.0f);
        this.mHeight = (int) (f11 - 100.0f);
        final ImageView imageView = new ImageView(this.context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(200, 200);
        this.params = layoutParams;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageDrawable(this.icons[new Random().nextInt(4)]);
        addView(imageView);
        AnimatorSet animatorSet = getAnimatorSet(imageView);
        animatorSet.start();
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: net.babycat.live.platform.widget.view.like.Love.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                Love.this.removeView(imageView);
            }
        });
    }

    public void removeAllLoveViews() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt instanceof ImageView) {
                removeView(childAt);
            }
        }
    }
}
