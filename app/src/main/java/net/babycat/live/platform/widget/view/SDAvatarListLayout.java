package net.babycat.live.platform.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.babycat.live.R;
import net.babycat.live.platform.util.t;
import wn.d;

/* JADX INFO: loaded from: classes3.dex */
public class SDAvatarListLayout extends HorizontalScrollView {
    private Context context;
    private int imageMaxCount;
    private float imageOffset;
    private int imageSize;
    private List<CircleImageView> imageViewList;
    private ShowAvatarListener listener;

    public interface ShowAvatarListener {
        void showImageView(List<CircleImageView> list);
    }

    public SDAvatarListLayout(Context context) {
        this(context, null);
        isInEditMode();
    }

    private void hideAllImageView() {
        Iterator<CircleImageView> it = this.imageViewList.iterator();
        while (it.hasNext()) {
            it.next().setVisibility(8);
        }
    }

    private void init() {
        setHorizontalScrollBarEnabled(false);
        RelativeLayout relativeLayout = new RelativeLayout(this.context);
        int i10 = this.imageSize;
        int i11 = i10 - ((int) (i10 * this.imageOffset));
        this.imageViewList = new ArrayList(this.imageMaxCount);
        for (int i12 = 0; i12 < this.imageMaxCount; i12++) {
            CircleImageView circleImageView = new CircleImageView(this.context);
            circleImageView.setId(circleImageView.hashCode() + i12);
            circleImageView.setBorderColor(-1);
            circleImageView.setBorderWidth(Math.round(t.i(1.0f)));
            int i13 = this.imageSize;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i13, i13);
            layoutParams.addRule(9);
            layoutParams.setMargins(((this.imageMaxCount - i12) - 1) * i11, 0, 0, 0);
            relativeLayout.addView(circleImageView, layoutParams);
            this.imageViewList.add(circleImageView);
        }
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        addView(relativeLayout);
    }

    public void setAvatarListListener(ShowAvatarListener showAvatarListener) {
        this.listener = showAvatarListener;
        hideAllImageView();
        showAvatarListener.showImageView(this.imageViewList);
    }

    public void setAvatarListListenesr(List<Integer> list) {
        if (list == null) {
            return;
        }
        hideAllImageView();
        int i10 = this.imageMaxCount - 1;
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            this.imageViewList.get(i10).setImageResource(it.next().intValue());
            this.imageViewList.get(i10).setBorderColor(Color.parseColor("#ffffff"));
            this.imageViewList.get(i10).setBorderWidth(2);
            this.imageViewList.get(i10).setVisibility(0);
            if (i10 == 0) {
                return;
            } else {
                i10--;
            }
        }
    }

    public SDAvatarListLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        isInEditMode();
    }

    public void setAvatarListListener(List<String> list) {
        if (list == null) {
            return;
        }
        hideAllImageView();
        int i10 = this.imageMaxCount - 1;
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            d.f(zn.a.l().e(), this.imageViewList.get(i10), it.next());
            this.imageViewList.get(i10).setBorderColor(Color.parseColor("#ffffff"));
            this.imageViewList.get(i10).setBorderWidth(2);
            this.imageViewList.get(i10).setVisibility(0);
            if (i10 == 0) {
                return;
            } else {
                i10--;
            }
        }
    }

    public SDAvatarListLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.imageSize = Math.round(t.i(50.0f));
        this.imageMaxCount = 7;
        this.imageOffset = 0.3f;
        if (isInEditMode()) {
            return;
        }
        this.context = context;
        TypedArray typedArrayObtainAttributes = getResources().obtainAttributes(attributeSet, R.styleable.SDAvatarListLayout);
        this.imageMaxCount = typedArrayObtainAttributes.getInt(0, this.imageMaxCount);
        this.imageSize = (int) typedArrayObtainAttributes.getDimension(2, this.imageSize);
        float f10 = typedArrayObtainAttributes.getFloat(1, this.imageOffset);
        this.imageOffset = f10;
        this.imageOffset = f10 > 1.0f ? 1.0f : f10;
        init();
        typedArrayObtainAttributes.recycle();
    }
}
