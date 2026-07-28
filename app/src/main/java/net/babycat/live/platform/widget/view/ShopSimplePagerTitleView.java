package net.babycat.live.platform.widget.view;

import android.content.Context;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.e;

/* JADX INFO: loaded from: classes3.dex */
public class ShopSimplePagerTitleView extends e {
    public ShopSimplePagerTitleView(Context context) {
        super(context);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.e, jo.d
    public void onDeselected(int i10, int i11) {
        setTextColor(this.mNormalColor);
        getPaint().setFakeBoldText(false);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.e, jo.d
    public void onEnter(int i10, int i11, float f10, boolean z10) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.e, jo.d
    public void onLeave(int i10, int i11, float f10, boolean z10) {
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.e, jo.d
    public void onSelected(int i10, int i11) {
        setTextColor(this.mSelectedColor);
        getPaint().setFakeBoldText(true);
    }
}
