package net.babycat.live.platform.widget.view;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public class CountTimerUtil {
    private static final int DEFAULT_REPEAT_COUNT = 4;
    private static final String LAST_SECOND_TEXT = "Go";
    private static int sCurCount = 4;

    public static <T extends TextView> void start(T t10) {
        start(t10, 4);
    }

    public static <T extends TextView> void start(final T t10, int i10) {
        int i11 = i10 - 1;
        sCurCount = i11;
        t10.setText(String.valueOf(i11));
        t10.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.1f, 1.3f, 0.1f, 1.3f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setRepeatCount(sCurCount);
        alphaAnimation.setRepeatCount(sCurCount);
        alphaAnimation.setDuration(1000L);
        scaleAnimation.setDuration(1000L);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: net.babycat.live.platform.widget.view.CountTimerUtil.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                t10.setVisibility(8);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                CountTimerUtil.sCurCount--;
                if (CountTimerUtil.sCurCount == 0) {
                    t10.setText(CountTimerUtil.LAST_SECOND_TEXT);
                } else {
                    t10.setText(String.valueOf(CountTimerUtil.sCurCount));
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scaleAnimation);
        t10.startAnimation(animationSet);
    }
}
