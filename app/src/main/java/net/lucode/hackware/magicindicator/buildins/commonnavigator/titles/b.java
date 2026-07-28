package net.lucode.hackware.magicindicator.buildins.commonnavigator.titles;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class b extends e {
    public b(Context context) {
        super(context);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.e, jo.d
    public void onDeselected(int i10, int i11) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.e, jo.d
    public void onEnter(int i10, int i11, float f10, boolean z10) {
        setTextColor(go.a.a(f10, this.mNormalColor, this.mSelectedColor));
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.e, jo.d
    public void onLeave(int i10, int i11, float f10, boolean z10) {
        setTextColor(go.a.a(f10, this.mSelectedColor, this.mNormalColor));
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.e, jo.d
    public void onSelected(int i10, int i11) {
    }
}
