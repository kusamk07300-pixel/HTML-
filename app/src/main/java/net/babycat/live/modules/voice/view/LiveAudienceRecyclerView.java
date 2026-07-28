package net.babycat.live.modules.voice.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import f.n0;
import f.p0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveAudienceRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f36386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f36387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36391f;

    public LiveAudienceRecyclerView(@n0 Context context) {
        this(context, null);
    }

    public final int b(int i10) {
        return (int) ((this.f36387b * i10) + 0.5f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f36386a) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (rawX < this.f36388c || rawX > this.f36390e || rawY < this.f36389d || rawY > this.f36391f) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f36386a) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setScrollEnabled(boolean z10) {
        this.f36386a = z10;
    }

    public LiveAudienceRecyclerView(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveAudienceRecyclerView(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f36386a = false;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f36387b = displayMetrics.density;
        int i11 = displayMetrics.widthPixels;
        int i12 = displayMetrics.heightPixels;
        this.f36388c = b(10);
        this.f36391f = i12 - b(50);
        this.f36390e = i11 - b(100);
        this.f36389d = this.f36391f - b(200);
    }
}
