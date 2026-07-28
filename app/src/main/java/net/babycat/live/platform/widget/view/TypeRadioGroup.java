package net.babycat.live.platform.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class TypeRadioGroup extends RadioGroup {
    private int horizontalSpacing;
    private OnclickListener listener;
    private Context mContext;
    private List<RowView> rowViews;
    private int verticalSpacing;

    public interface OnclickListener {
        void OnText(String str);
    }

    public class RowView {
        private List<View> lineViews = new ArrayList();
        private int rowHeight;
        private int rowWidth;

        public RowView() {
        }

        public void addChidView(View view) {
            if (this.lineViews.contains(view)) {
                return;
            }
            ((RadioButton) view).setOnClickListener(new View.OnClickListener() { // from class: net.babycat.live.platform.widget.view.TypeRadioGroup.RowView.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TypeRadioGroup.this.listener != null) {
                        TypeRadioGroup.this.listener.OnText(((RadioButton) view2).getText().toString().trim());
                    }
                }
            });
            if (this.lineViews.size() == 0) {
                this.rowWidth = view.getMeasuredWidth();
            } else {
                this.rowWidth += view.getMeasuredWidth() + TypeRadioGroup.this.horizontalSpacing;
            }
            this.rowHeight = Math.max(view.getMeasuredHeight(), this.rowHeight);
            this.lineViews.add(view);
        }

        public int getRowHeight() {
            return this.rowHeight;
        }

        public List<View> getRowViews() {
            return this.lineViews;
        }

        public int getRowWidth() {
            return this.rowWidth;
        }
    }

    public TypeRadioGroup(Context context) {
        this(context, null);
    }

    public int dip2px(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < this.rowViews.size(); i14++) {
            RowView rowView = this.rowViews.get(i14);
            if (i14 > 0) {
                paddingTop += 70;
            }
            List<View> rowViews = rowView.getRowViews();
            for (int i15 = 0; i15 < rowViews.size(); i15++) {
                View view = rowViews.get(i15);
                if (i15 == 0) {
                    view.layout(paddingLeft, paddingTop, view.getMeasuredWidth() + paddingLeft, view.getMeasuredHeight() + paddingTop);
                } else {
                    View view2 = rowViews.get(i15 - 1);
                    int right = view2.getRight() + this.horizontalSpacing;
                    view.layout(right, view2.getTop(), view.getMeasuredWidth() + right, view2.getBottom());
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.rowViews.clear();
        int size = View.MeasureSpec.getSize(i10);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        RowView rowView = null;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            childAt.measure(0, 0);
            if (rowView == null) {
                rowView = new RowView();
            }
            if (rowView.getRowViews().size() != 0 && rowView.getRowWidth() + this.horizontalSpacing + childAt.getMeasuredWidth() > paddingLeft) {
                this.rowViews.add(rowView);
                rowView = new RowView();
                rowView.addChidView(childAt);
            } else {
                rowView.addChidView(childAt);
            }
            if (i12 == getChildCount() - 1) {
                this.rowViews.add(rowView);
            }
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        for (int i13 = 0; i13 < this.rowViews.size(); i13++) {
            paddingTop += this.rowViews.get(i13).getRowHeight();
        }
        setMeasuredDimension(size, (int) (((double) paddingTop) / 1.5d));
        if (getChildCount() == 0) {
            setMeasuredDimension(0, 0);
        }
    }

    public void setHorizontalSpacing(int i10) {
        this.horizontalSpacing = dip2px(this.mContext, i10);
    }

    public void setListener(OnclickListener onclickListener) {
        this.listener = onclickListener;
    }

    public void setVerticalSpacing(int i10) {
        this.verticalSpacing = dip2px(this.mContext, i10);
    }

    public TypeRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.horizontalSpacing = 20;
        this.verticalSpacing = 10;
        this.mContext = context;
        this.rowViews = new ArrayList();
    }
}
