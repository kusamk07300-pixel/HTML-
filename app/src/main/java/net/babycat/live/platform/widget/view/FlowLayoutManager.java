package net.babycat.live.platform.widget.view;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FlowLayoutManager extends RecyclerView.p {
    private static final String TAG = "FlowLayoutManager";
    protected int height;
    private int left;
    private int right;

    /* JADX INFO: renamed from: top, reason: collision with root package name */
    private int f37142top;
    private int usedMaxWidth;
    protected int width;
    final FlowLayoutManager self = this;
    private int verticalScrollOffset = 0;
    protected int totalHeight = 0;
    private Row row = new Row();
    private List<Row> lineRows = new ArrayList();
    private SparseArray<Rect> allItemFrames = new SparseArray<>();

    public class Item {
        Rect rect;
        int useHeight;
        View view;

        public Item(int i10, View view, Rect rect) {
            this.useHeight = i10;
            this.view = view;
            this.rect = rect;
        }

        public void setRect(Rect rect) {
            this.rect = rect;
        }
    }

    public class Row {
        float cuTop;
        float maxHeight;
        List<Item> views = new ArrayList();

        public Row() {
        }

        public void addViews(Item item) {
            this.views.add(item);
        }

        public void setCuTop(float f10) {
            this.cuTop = f10;
        }

        public void setMaxHeight(float f10) {
            this.maxHeight = f10;
        }
    }

    public FlowLayoutManager() {
        setAutoMeasureEnabled(true);
    }

    private void fillLayout(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (c0Var.j() || getItemCount() == 0) {
            return;
        }
        new Rect(getPaddingLeft(), getPaddingTop() + this.verticalScrollOffset, getWidth() - getPaddingRight(), this.verticalScrollOffset + (getHeight() - getPaddingBottom()));
        for (int i10 = 0; i10 < this.lineRows.size(); i10++) {
            Row row = this.lineRows.get(i10);
            float f10 = row.cuTop;
            List<Item> list = row.views;
            for (int i11 = 0; i11 < list.size(); i11++) {
                View view = list.get(i11).view;
                measureChildWithMargins(view, 0, 0);
                addView(view);
                Rect rect = list.get(i11).rect;
                if (rect == null) {
                    rect = new Rect();
                }
                int decoratedMeasuredWidth = getDecoratedMeasuredWidth(view);
                int decoratedMeasuredHeight = getDecoratedMeasuredHeight(view);
                rect.right = rect.left + decoratedMeasuredWidth;
                rect.bottom = rect.top + decoratedMeasuredHeight;
                list.get(i11).setRect(rect);
                int i12 = rect.left;
                int i13 = rect.top;
                int i14 = this.verticalScrollOffset;
                layoutDecoratedWithMargins(view, i12, i13 - i14, rect.right, rect.bottom - i14);
            }
        }
    }

    private void formatAboveRow() {
        List<Item> list = this.row.views;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Item item = list.get(i10);
            int position = getPosition(item.view);
            float f10 = this.allItemFrames.get(position).top;
            Row row = this.row;
            if (f10 < row.cuTop + ((row.maxHeight - list.get(i10).useHeight) / 2.0f)) {
                Rect rect = this.allItemFrames.get(position);
                if (rect == null) {
                    rect = new Rect();
                }
                int i11 = this.allItemFrames.get(position).left;
                Row row2 = this.row;
                int i12 = (int) (row2.cuTop + ((row2.maxHeight - list.get(i10).useHeight) / 2.0f));
                int i13 = this.allItemFrames.get(position).right;
                Row row3 = this.row;
                rect.set(i11, i12, i13, (int) (row3.cuTop + ((row3.maxHeight - list.get(i10).useHeight) / 2.0f) + getDecoratedMeasuredHeight(r3)));
                this.allItemFrames.put(position, rect);
                item.setRect(rect);
                list.set(i10, item);
            }
        }
        Row row4 = this.row;
        row4.views = list;
        this.lineRows.add(row4);
        this.row = new Row();
    }

    private int getVerticalSpace() {
        return (this.self.getHeight() - this.self.getPaddingBottom()) - this.self.getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollVertically() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateDefaultLayoutParams() {
        return new RecyclerView.q(-2, -2);
    }

    public int getHorizontalSpace() {
        return (this.self.getWidth() - this.self.getPaddingLeft()) - this.self.getPaddingRight();
    }

    public int getTotalHeight() {
        return this.totalHeight;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutChildren(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        Log.d(TAG, "onLayoutChildren");
        this.totalHeight = 0;
        int i10 = this.f37142top;
        this.row = new Row();
        this.lineRows.clear();
        this.allItemFrames.clear();
        removeAllViews();
        if (getItemCount() == 0) {
            detachAndScrapAttachedViews(xVar);
            this.verticalScrollOffset = 0;
            return;
        }
        if (getChildCount() == 0 && c0Var.j()) {
            return;
        }
        detachAndScrapAttachedViews(xVar);
        if (getChildCount() == 0) {
            this.width = getWidth();
            this.height = getHeight();
            this.left = getPaddingLeft();
            this.right = getPaddingRight();
            this.f37142top = getPaddingTop();
            this.usedMaxWidth = (this.width - this.left) - this.right;
        }
        int i11 = 0;
        int iMax = 0;
        for (int i12 = 0; i12 < getItemCount(); i12++) {
            Log.d(TAG, "index:" + i12);
            View viewP = xVar.p(i12);
            if (8 != viewP.getVisibility()) {
                measureChildWithMargins(viewP, 0, 0);
                int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewP);
                int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewP);
                int i13 = i11 + decoratedMeasuredWidth;
                if (i13 <= this.usedMaxWidth) {
                    int i14 = this.left + i11;
                    Rect rect = this.allItemFrames.get(i12);
                    if (rect == null) {
                        rect = new Rect();
                    }
                    rect.set(i14, i10, decoratedMeasuredWidth + i14, i10 + decoratedMeasuredHeight);
                    this.allItemFrames.put(i12, rect);
                    iMax = Math.max(iMax, decoratedMeasuredHeight);
                    this.row.addViews(new Item(decoratedMeasuredHeight, viewP, rect));
                    this.row.setCuTop(i10);
                    this.row.setMaxHeight(iMax);
                    i11 = i13;
                } else {
                    formatAboveRow();
                    i10 += iMax;
                    this.totalHeight += iMax;
                    int i15 = this.left;
                    Rect rect2 = this.allItemFrames.get(i12);
                    if (rect2 == null) {
                        rect2 = new Rect();
                    }
                    rect2.set(i15, i10, i15 + decoratedMeasuredWidth, i10 + decoratedMeasuredHeight);
                    this.allItemFrames.put(i12, rect2);
                    this.row.addViews(new Item(decoratedMeasuredHeight, viewP, rect2));
                    this.row.setCuTop(i10);
                    this.row.setMaxHeight(decoratedMeasuredHeight);
                    i11 = decoratedMeasuredWidth;
                    iMax = decoratedMeasuredHeight;
                }
                if (i12 == getItemCount() - 1) {
                    formatAboveRow();
                    this.totalHeight += iMax;
                }
            }
        }
        this.totalHeight = Math.max(this.totalHeight, getVerticalSpace());
        Log.d(TAG, "onLayoutChildren totalHeight:" + this.totalHeight);
        fillLayout(xVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollVerticallyBy(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        Log.d("TAG", "totalHeight:" + this.totalHeight);
        int i11 = this.verticalScrollOffset;
        if (i11 + i10 < 0) {
            i10 = -i11;
        } else if (i11 + i10 > this.totalHeight - getVerticalSpace()) {
            i10 = (this.totalHeight - getVerticalSpace()) - this.verticalScrollOffset;
        }
        this.verticalScrollOffset += i10;
        offsetChildrenVertical(-i10);
        fillLayout(xVar, c0Var);
        return i10;
    }
}
