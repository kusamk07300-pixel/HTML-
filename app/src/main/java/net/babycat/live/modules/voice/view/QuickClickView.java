package net.babycat.live.modules.voice.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import f.p0;
import net.babycat.live.modules.voice.view.a;

/* JADX INFO: loaded from: classes4.dex */
public class QuickClickView extends View implements net.babycat.live.modules.voice.view.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f36541n = 15;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f36542o = 3000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f36543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f36546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f36547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f36548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RectF f36549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f36550h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ValueAnimator f36551i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ValueAnimator f36552j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f36553k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f36554l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a.InterfaceC0447a f36555m;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = Integer.valueOf(String.valueOf(valueAnimator.getAnimatedValue())).intValue();
            QuickClickView.this.setRingDegree(360.0f - ((iIntValue / 100.0f) * 360.0f));
            if (iIntValue != 100 || QuickClickView.this.f36555m == null) {
                return;
            }
            QuickClickView.this.f36555m.a(true);
        }
    }

    public QuickClickView(Context context) {
        this(context, null);
    }

    @Override // net.babycat.live.modules.voice.view.a
    public void a(Canvas canvas) {
        this.f36543a.setStyle(Paint.Style.STROKE);
        this.f36543a.setStrokeWidth(15.0f);
        this.f36543a.setColor(Color.parseColor("#FFFFB3E5"));
        this.f36543a.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawArc(this.f36549g, -90.0f, this.f36550h, false, this.f36543a);
    }

    @Override // net.babycat.live.modules.voice.view.a
    public void b() {
        if (this.f36551i.isRunning()) {
            this.f36544b++;
            this.f36551i.cancel();
        } else {
            this.f36544b = 1;
            setVisibility(0);
        }
        a.InterfaceC0447a interfaceC0447a = this.f36555m;
        if (interfaceC0447a != null) {
            interfaceC0447a.a(false);
        }
        this.f36551i.start();
    }

    @Override // net.babycat.live.modules.voice.view.a
    public void c(Canvas canvas) {
        this.f36543a.setStyle(Paint.Style.FILL);
        this.f36543a.setColor(Color.parseColor("#00000000"));
        float f10 = this.f36553k;
        canvas.drawCircle(f10, this.f36554l, f10, this.f36543a);
    }

    @Override // net.babycat.live.modules.voice.view.a
    public void d(Canvas canvas) {
    }

    public final void f(Context context, @p0 AttributeSet attributeSet) {
        Paint paint = new Paint();
        this.f36543a = paint;
        paint.setAntiAlias(true);
        this.f36543a.setTypeface(Typeface.create("", 3));
        this.f36543a.setTextAlign(Paint.Align.CENTER);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 100);
        this.f36551i = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(3000L);
        this.f36551i.addUpdateListener(new a());
    }

    @Override // net.babycat.live.modules.voice.view.a
    public ValueAnimator getAnimator() {
        return this.f36551i;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f36549g == null) {
            this.f36553k = getMeasuredWidth() / 2;
            this.f36554l = getMeasuredHeight() / 2;
            RectF rectF = new RectF();
            this.f36549g = rectF;
            rectF.left = 7.0f;
            rectF.top = 7.0f;
            float measuredWidth = getMeasuredWidth();
            RectF rectF2 = this.f36549g;
            rectF.right = measuredWidth - rectF2.left;
            rectF2.bottom = getMeasuredHeight() - this.f36549g.top;
        }
        c(canvas);
        d(canvas);
        a(canvas);
    }

    @Override // net.babycat.live.modules.voice.view.a
    public void setOnAnimationListener(a.InterfaceC0447a interfaceC0447a) {
        this.f36555m = interfaceC0447a;
    }

    @Override // net.babycat.live.modules.voice.view.a
    public void setRingDegree(float f10) {
        this.f36550h = f10;
        invalidate();
    }

    public QuickClickView(Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f(context, attributeSet);
    }

    public QuickClickView(Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f36544b = 1;
        this.f36545c = "#00000000";
        this.f36546d = "#FFFFB3E5";
        this.f36548f = 70.0f;
        this.f36550h = 360.0f;
        f(context, attributeSet);
    }
}
