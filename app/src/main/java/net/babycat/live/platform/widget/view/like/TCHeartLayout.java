package net.babycat.live.platform.widget.view.like;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import java.util.Random;
import net.babycat.live.platform.widget.view.like.TCAbstractPathAnimator;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes3.dex */
public class TCHeartLayout extends RelativeLayout {
    private static int[] drawableIds = {R.mipmap.livekit_gift_heart0, R.mipmap.livekit_gift_heart1, R.mipmap.livekit_gift_heart2, R.mipmap.livekit_gift_heart3, R.mipmap.livekit_gift_heart4, R.mipmap.livekit_gift_heart5, R.mipmap.livekit_gift_heart6, R.mipmap.livekit_gift_heart7, R.mipmap.livekit_gift_heart8};
    private static Drawable[] sDrawables;
    private Context context;
    private int dHeight;
    private int dWidth;
    private int defStyleAttr;
    private int initX;
    private TCAbstractPathAnimator mAnimator;
    private Bitmap[] mHearts;
    private BitmapDrawable[] mHeartsDrawable;
    private Random mRandom;
    private int pointx;
    private int textHight;

    public TCHeartLayout(Context context) {
        super(context);
        this.defStyleAttr = 0;
        this.mRandom = new Random();
        this.context = context;
    }

    private void findViewById(Context context) {
        LayoutInflater.from(context).inflate(R.layout.layout_periscope, this);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.mipmap.livekit_gift_heart0);
        this.dHeight = bitmapDecodeResource.getWidth();
        this.dWidth = bitmapDecodeResource.getHeight();
        this.textHight = sp2px(getContext(), 20.0f) + (this.dHeight / 2);
        this.pointx = this.dWidth;
        bitmapDecodeResource.recycle();
    }

    private void init(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, net.babycat.live.R.styleable.HeartLayout, i10, 0);
        this.initX = 30;
        int i11 = this.pointx;
        if (i11 <= 30 && i11 >= 0) {
            this.pointx = i11 - 10;
        } else if (i11 < (-30) || i11 > 0) {
            this.pointx = 30;
        } else {
            this.pointx = i11 + 10;
        }
        this.mAnimator = new TCPathAnimator(TCAbstractPathAnimator.Config.fromTypeArray(typedArrayObtainStyledAttributes, 30, this.textHight, this.pointx, this.dWidth, this.dHeight));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void initHeartDrawable() {
        int length = drawableIds.length;
        sDrawables = new Drawable[length];
        for (int i10 = 0; i10 < length; i10++) {
            sDrawables[i10] = getResources().getDrawable(drawableIds[i10]);
        }
        resourceLoad();
    }

    private static int sp2px(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public void addFavor() {
        addFavor(0);
    }

    @Override // android.view.View
    public void clearAnimation() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            getChildAt(i10).clearAnimation();
        }
        removeAllViews();
    }

    public void resourceLoad() {
        int[] iArr = drawableIds;
        this.mHearts = new Bitmap[iArr.length];
        this.mHeartsDrawable = new BitmapDrawable[iArr.length];
        for (int i10 = 0; i10 < drawableIds.length; i10++) {
            this.mHearts[i10] = BitmapFactory.decodeResource(getResources(), drawableIds[i10]);
            this.mHeartsDrawable[i10] = new BitmapDrawable(getResources(), this.mHearts[i10]);
        }
    }

    public void addFavor(int i10) {
        TCHeartView tCHeartView = new TCHeartView(getContext());
        if (i10 != 0) {
            tCHeartView.setPadding(i10, i10, i10, i10);
        }
        tCHeartView.setDrawable(this.mHeartsDrawable[this.mRandom.nextInt(8)]);
        this.mAnimator.start(tCHeartView, this);
    }

    public TCHeartLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.defStyleAttr = 0;
        this.mRandom = new Random();
        this.context = context;
        findViewById(context);
        initHeartDrawable();
        init(attributeSet, this.defStyleAttr);
    }
}
