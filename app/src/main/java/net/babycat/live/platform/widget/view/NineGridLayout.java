package net.babycat.live.platform.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import net.babycat.live.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NineGridLayout extends ViewGroup {
    private static final float DEFUALT_SPACING = 15.0f;
    private float image_ratio;
    private int mColumns;
    protected Context mContext;
    private boolean mIsFirst;
    private List<String> mOriginalImg;
    private int mRows;
    private int mSingleWidth;
    private float mSpacing;
    private int mTotalWidth;
    private List<String> mUrlList;
    private int oneImageHeight;
    private int oneImageWidth;

    public NineGridLayout(Context context) {
        this(context, null);
    }

    private RatioImageView createImageView(final int i10, final String str) {
        final RatioImageView ratioImageView = new RatioImageView(this.mContext);
        ratioImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ratioImageView.setOnClickListener(new View.OnClickListener() { // from class: net.babycat.live.platform.widget.view.NineGridLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NineGridLayout nineGridLayout = NineGridLayout.this;
                nineGridLayout.onClickImage(i10, str, nineGridLayout.mOriginalImg, ratioImageView);
            }
        });
        ratioImageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: net.babycat.live.platform.widget.view.NineGridLayout.3
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                return true;
            }
        });
        return ratioImageView;
    }

    private int[] findPosition(int i10) {
        int[] iArr = new int[2];
        for (int i11 = 0; i11 < this.mRows; i11++) {
            int i12 = 0;
            while (true) {
                int i13 = this.mColumns;
                if (i12 >= i13) {
                    break;
                }
                if ((i13 * i11) + i12 == i10) {
                    iArr[0] = i11;
                    iArr[1] = i12;
                    break;
                }
                i12++;
            }
        }
        return iArr;
    }

    private void generateChildrenLayout(int i10) {
        if (i10 <= 3) {
            this.mRows = 1;
            this.mColumns = i10;
        } else {
            if (i10 > 6) {
                this.mColumns = 3;
                this.mRows = 3;
                return;
            }
            this.mRows = 2;
            this.mColumns = 3;
            if (i10 == 4) {
                this.mColumns = 2;
            }
        }
    }

    private int getListSize(List<String> list) {
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    private void getRealOneImageSize() {
        if (this.oneImageWidth == 0) {
            this.oneImageWidth = this.mSingleWidth;
        }
        if (this.oneImageHeight == 0) {
            this.oneImageHeight = (int) (this.oneImageWidth * this.image_ratio);
        }
    }

    private void init(Context context) {
        this.mContext = context;
        if (getListSize(this.mUrlList) == 0) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
    }

    private void layoutImageView(RatioImageView ratioImageView, int i10, String str) {
        int i11 = (int) ((this.mTotalWidth - (this.mSpacing * 2.0f)) / 3.0f);
        int[] iArrFindPosition = findPosition(i10);
        float f10 = i11;
        float f11 = this.mSpacing;
        int i12 = (int) ((f10 + f11) * iArrFindPosition[1]);
        int i13 = (int) ((f10 + f11) * iArrFindPosition[0]);
        ratioImageView.layout(i12, i13, i12 + i11, i11 + i13);
        addView(ratioImageView);
        displayImage(i10, ratioImageView, str);
    }

    private void layoutParams() {
        int i10 = this.mSingleWidth;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i11 = this.mRows;
        layoutParams.height = (int) ((i10 * i11) + (this.mSpacing * (i11 - 1)));
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refresh() {
        removeAllViews();
        int listSize = getListSize(this.mUrlList);
        if (listSize <= 0) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        if (listSize != 1) {
            generateChildrenLayout(listSize);
            layoutParams();
            for (int i10 = 0; i10 < listSize; i10++) {
                String str = this.mUrlList.get(i10);
                layoutImageView(createImageView(i10, str), i10, str);
            }
            return;
        }
        String str2 = this.mUrlList.get(0);
        RatioImageView ratioImageViewCreateImageView = createImageView(0, str2);
        getRealOneImageSize();
        ratioImageViewCreateImageView.layout(0, 0, this.oneImageWidth, this.oneImageHeight);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = this.oneImageHeight;
        setLayoutParams(layoutParams);
        addView(ratioImageViewCreateImageView);
        displayImage(0, ratioImageViewCreateImageView, str2);
    }

    public abstract void displayImage(int i10, RatioImageView ratioImageView, String str);

    public void notifyDataSetChanged() {
        post(new TimerTask() { // from class: net.babycat.live.platform.widget.view.NineGridLayout.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                NineGridLayout.this.refresh();
            }
        });
    }

    public abstract void onClickImage(int i10, String str, List<String> list, ImageView imageView);

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        this.mTotalWidth = i14;
        this.mSingleWidth = (int) ((i14 - (this.mSpacing * 2.0f)) / 3.0f);
        if (this.mIsFirst) {
            notifyDataSetChanged();
            this.mIsFirst = false;
        }
    }

    public void setSpacing(float f10) {
        this.mSpacing = f10;
    }

    public void setUrlList(List<String> list, List<String> list2) {
        this.mOriginalImg = list2;
        if (getListSize(list) == 0) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.mUrlList.clear();
        this.mUrlList.addAll(list);
        if (this.mIsFirst) {
            return;
        }
        notifyDataSetChanged();
    }

    public NineGridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.image_ratio = 1.7f;
        this.mSpacing = DEFUALT_SPACING;
        this.mIsFirst = true;
        this.mUrlList = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.NineGridLayout);
        this.mSpacing = typedArrayObtainStyledAttributes.getDimension(3, DEFUALT_SPACING);
        this.oneImageWidth = (int) typedArrayObtainStyledAttributes.getDimension(2, 0.0f);
        this.oneImageHeight = (int) typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
        this.image_ratio = typedArrayObtainStyledAttributes.getFloat(0, this.image_ratio);
        typedArrayObtainStyledAttributes.recycle();
        init(context);
    }
}
