package net.babycat.live.platform.widget.view.like;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TCAbstractPathAnimator {
    private static final String DEFAULT_ROTATION = "right";
    protected final Config mConfig;
    private final Random mRandom = new Random();

    public static class Config {
        public int animDuration;
        public int animLength;
        public int animLengthRand;
        public int bezierFactor;
        public int heartHeight;
        public int heartWidth;
        public int initX;
        public int initY;
        public String rotation;
        public int xPointFactor;
        public int xRand;

        public static Config fromTypeArray(TypedArray typedArray, float f10, float f11, int i10, int i11, int i12) {
            Config config = new Config();
            Resources resources = typedArray.getResources();
            config.initX = (int) typedArray.getDimension(6, f10);
            config.initY = (int) typedArray.getDimension(7, f11);
            config.xRand = (int) typedArray.getDimension(10, resources.getDimensionPixelOffset(R.dimen.heart_anim_bezier_x_rand));
            config.animLength = (int) typedArray.getDimension(0, resources.getDimensionPixelOffset(R.dimen.heart_anim_length));
            config.animLengthRand = (int) typedArray.getDimension(1, resources.getDimensionPixelOffset(R.dimen.heart_anim_length_rand));
            config.bezierFactor = typedArray.getInteger(3, resources.getInteger(R.integer.heart_anim_bezier_factor));
            config.xPointFactor = i10;
            String string = typedArray.getString(8);
            if (TextUtils.isEmpty(string)) {
                string = "right";
            }
            config.rotation = string;
            config.heartWidth = i11;
            config.heartHeight = i12;
            config.animDuration = typedArray.getInteger(2, resources.getInteger(R.integer.anim_duration));
            return config;
        }
    }

    public TCAbstractPathAnimator(Config config) {
        this.mConfig = config;
    }

    public Path createPath(AtomicInteger atomicInteger, View view, int i10) {
        Random random = this.mRandom;
        int iNextInt = "right".endsWith(this.mConfig.rotation) ? random.nextInt(this.mConfig.xRand) : -random.nextInt(this.mConfig.xRand);
        int iNextInt2 = "right".endsWith(this.mConfig.rotation) ? random.nextInt(this.mConfig.xRand) : -random.nextInt(this.mConfig.xRand);
        int height = view.getHeight() - this.mConfig.initY;
        int iIntValue = atomicInteger.intValue() * 15;
        Config config = this.mConfig;
        int iNextInt3 = iIntValue + (config.animLength * i10) + random.nextInt(config.animLengthRand);
        Config config2 = this.mConfig;
        int i11 = iNextInt3 / config2.bezierFactor;
        int i12 = config2.xPointFactor;
        int i13 = iNextInt + i12;
        int i14 = i12 + iNextInt2;
        int i15 = height - iNextInt3;
        Path path = new Path();
        path.moveTo(this.mConfig.initX, height);
        float f10 = i13;
        float f11 = height - (iNextInt3 / 2);
        path.cubicTo(this.mConfig.initX, height - i11, f10, r11 + i11, f10, f11);
        path.moveTo(f10, f11);
        float f12 = i14;
        path.cubicTo(f10, r11 - i11, f12, i11 + i15, f12, i15);
        return path;
    }

    public float randomRotation() {
        return (this.mRandom.nextFloat() * 28.6f) - 14.3f;
    }

    public abstract void start(View view, ViewGroup viewGroup);
}
