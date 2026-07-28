package net.lucode.hackware.magicindicator.buildins.commonnavigator.titles;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class a extends View implements jo.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f37207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f37211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Paint f37212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Rect f37213g;

    public a(Context context) {
        super(context);
        this.f37213g = new Rect();
        a(context);
    }

    public final void a(Context context) {
        int iA = go.b.a(context, 16.0d);
        Paint paint = new Paint(1);
        this.f37212f = paint;
        paint.setTextSize(iA);
        int iA2 = go.b.a(context, 10.0d);
        setPadding(iA2, 0, iA2, 0);
    }

    public final int b(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        return mode != Integer.MIN_VALUE ? mode != 0 ? size : this.f37213g.height() + getPaddingTop() + getPaddingBottom() : Math.min(this.f37213g.height() + getPaddingTop() + getPaddingBottom(), size);
    }

    public final void c() {
        Paint paint = this.f37212f;
        String str = this.f37207a;
        paint.getTextBounds(str, 0, str == null ? 0 : str.length(), this.f37213g);
    }

    public final int d(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        return mode != Integer.MIN_VALUE ? mode != 0 ? size : this.f37213g.width() + getPaddingLeft() + getPaddingRight() : Math.min(this.f37213g.width() + getPaddingLeft() + getPaddingRight(), size);
    }

    public int getClipColor() {
        return this.f37209c;
    }

    @Override // jo.b
    public int getContentBottom() {
        Paint.FontMetrics fontMetrics = this.f37212f.getFontMetrics();
        return (int) ((getHeight() / 2) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f));
    }

    @Override // jo.b
    public int getContentLeft() {
        return (getLeft() + (getWidth() / 2)) - (this.f37213g.width() / 2);
    }

    @Override // jo.b
    public int getContentRight() {
        return getLeft() + (getWidth() / 2) + (this.f37213g.width() / 2);
    }

    @Override // jo.b
    public int getContentTop() {
        Paint.FontMetrics fontMetrics = this.f37212f.getFontMetrics();
        return (int) ((getHeight() / 2) - ((fontMetrics.bottom - fontMetrics.top) / 2.0f));
    }

    public String getText() {
        return this.f37207a;
    }

    public int getTextColor() {
        return this.f37208b;
    }

    public float getTextSize() {
        return this.f37212f.getTextSize();
    }

    @Override // jo.d
    public void onDeselected(int i10, int i11) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width = (getWidth() - this.f37213g.width()) / 2;
        Paint.FontMetrics fontMetrics = this.f37212f.getFontMetrics();
        int height = (int) (((getHeight() - fontMetrics.bottom) - fontMetrics.top) / 2.0f);
        this.f37212f.setColor(this.f37208b);
        float f10 = width;
        float f11 = height;
        canvas.drawText(this.f37207a, f10, f11, this.f37212f);
        canvas.save();
        if (this.f37210d) {
            canvas.clipRect(0.0f, 0.0f, getWidth() * this.f37211e, getHeight());
        } else {
            canvas.clipRect(getWidth() * (1.0f - this.f37211e), 0.0f, getWidth(), getHeight());
        }
        this.f37212f.setColor(this.f37209c);
        canvas.drawText(this.f37207a, f10, f11, this.f37212f);
        canvas.restore();
    }

    @Override // jo.d
    public void onEnter(int i10, int i11, float f10, boolean z10) {
        this.f37210d = z10;
        this.f37211e = f10;
        invalidate();
    }

    @Override // jo.d
    public void onLeave(int i10, int i11, float f10, boolean z10) {
        this.f37210d = !z10;
        this.f37211e = 1.0f - f10;
        invalidate();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        c();
        setMeasuredDimension(d(i10), b(i11));
    }

    @Override // jo.d
    public void onSelected(int i10, int i11) {
    }

    public void setClipColor(int i10) {
        this.f37209c = i10;
        invalidate();
    }

    public void setText(String str) {
        this.f37207a = str;
        requestLayout();
    }

    public void setTextColor(int i10) {
        this.f37208b = i10;
        invalidate();
    }

    public void setTextSize(float f10) {
        this.f37212f.setTextSize(f10);
        requestLayout();
    }
}
