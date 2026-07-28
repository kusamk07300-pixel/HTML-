package net.lucode.hackware.magicindicator.buildins.commonnavigator.titles;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public class c extends FrameLayout implements jo.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f37215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f37216b;

    public interface a {
        int getContentBottom();

        int getContentLeft();

        int getContentRight();

        int getContentTop();
    }

    public interface b {
        void onDeselected(int i10, int i11);

        void onEnter(int i10, int i11, float f10, boolean z10);

        void onLeave(int i10, int i11, float f10, boolean z10);

        void onSelected(int i10, int i11);
    }

    public c(Context context) {
        super(context);
    }

    public void a(View view, FrameLayout.LayoutParams layoutParams) {
        removeAllViews();
        if (view != null) {
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            addView(view, layoutParams);
        }
    }

    @Override // jo.b
    public int getContentBottom() {
        a aVar = this.f37216b;
        return aVar != null ? aVar.getContentBottom() : getBottom();
    }

    @Override // jo.b
    public int getContentLeft() {
        a aVar = this.f37216b;
        return aVar != null ? aVar.getContentLeft() : getLeft();
    }

    public a getContentPositionDataProvider() {
        return this.f37216b;
    }

    @Override // jo.b
    public int getContentRight() {
        a aVar = this.f37216b;
        return aVar != null ? aVar.getContentRight() : getRight();
    }

    @Override // jo.b
    public int getContentTop() {
        a aVar = this.f37216b;
        return aVar != null ? aVar.getContentTop() : getTop();
    }

    public b getOnPagerTitleChangeListener() {
        return this.f37215a;
    }

    @Override // jo.d
    public void onDeselected(int i10, int i11) {
        b bVar = this.f37215a;
        if (bVar != null) {
            bVar.onDeselected(i10, i11);
        }
    }

    @Override // jo.d
    public void onEnter(int i10, int i11, float f10, boolean z10) {
        b bVar = this.f37215a;
        if (bVar != null) {
            bVar.onEnter(i10, i11, f10, z10);
        }
    }

    @Override // jo.d
    public void onLeave(int i10, int i11, float f10, boolean z10) {
        b bVar = this.f37215a;
        if (bVar != null) {
            bVar.onLeave(i10, i11, f10, z10);
        }
    }

    @Override // jo.d
    public void onSelected(int i10, int i11) {
        b bVar = this.f37215a;
        if (bVar != null) {
            bVar.onSelected(i10, i11);
        }
    }

    public void setContentPositionDataProvider(a aVar) {
        this.f37216b = aVar;
    }

    public void setContentView(View view) {
        a(view, null);
    }

    public void setOnPagerTitleChangeListener(b bVar) {
        this.f37215a = bVar;
    }

    public void setContentView(int i10) {
        a(LayoutInflater.from(getContext()).inflate(i10, (ViewGroup) null), null);
    }
}
