package net.babycat.live.platform.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.o;
import f.p0;

/* JADX INFO: loaded from: classes3.dex */
public class DragImageView extends o {
    private static final String TAG = "DragImageView";
    private long downTime;
    private boolean isDrag;
    private int lastX;
    private int lastY;
    private View.OnClickListener listener;
    private int parentHeight;
    private int parentWidth;
    private int startB;
    private int startL;
    private int startR;
    private int startT;
    private int startX;
    private int startY;
    private int stopX;
    private int stopY;

    public DragImageView(Context context) {
        super(context);
        this.downTime = 0L;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.downTime = System.currentTimeMillis();
            this.isDrag = false;
            getParent().requestDisallowInterceptTouchEvent(true);
            this.lastX = rawX;
            this.lastY = rawY;
            if (getParent() != null) {
                ViewGroup viewGroup = (ViewGroup) getParent();
                this.parentHeight = viewGroup.getHeight();
                this.parentWidth = viewGroup.getWidth();
            }
        } else if (action != 1) {
            if (action == 2) {
                boolean z10 = this.parentHeight > 0 && this.parentWidth > 0;
                this.isDrag = z10;
                if (z10) {
                    int i10 = rawX - this.lastX;
                    int i11 = rawY - this.lastY;
                    boolean z11 = ((int) Math.sqrt((double) ((i10 * i10) + (i11 * i11)))) > 0;
                    this.isDrag = z11;
                    if (z11) {
                        float x10 = getX() + i10;
                        float y10 = getY() + i11;
                        if (x10 < 0.0f) {
                            x10 = 0.0f;
                        } else if (x10 > this.parentWidth - getWidth()) {
                            x10 = this.parentWidth - getWidth();
                        }
                        if (y10 < 0.0f) {
                            y10 = 0.0f;
                        } else if (y10 > this.parentHeight - getHeight()) {
                            y10 = this.parentHeight - getHeight();
                        }
                        setX(x10);
                        setY(y10);
                        this.lastX = rawX;
                        this.lastY = rawY;
                    }
                }
            }
        } else if (!this.isDrag && (onClickListener = this.listener) != null) {
            onClickListener.onClick(this);
        }
        return true;
    }

    @Override // android.view.View
    public void setOnClickListener(@p0 View.OnClickListener onClickListener) {
        this.listener = onClickListener;
    }

    public DragImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.downTime = 0L;
    }

    public DragImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.downTime = 0L;
    }
}
