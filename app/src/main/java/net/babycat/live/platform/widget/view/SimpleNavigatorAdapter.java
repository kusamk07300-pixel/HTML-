package net.babycat.live.platform.widget.view;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import go.b;
import jo.c;
import jo.d;
import net.babycat.live.platform.util.t;

/* JADX INFO: loaded from: classes3.dex */
public class SimpleNavigatorAdapter extends jo.a {
    private int[] colors;
    private int font;
    private OnIndicatorTabClickListener mIndicatorTabClickListener;
    private String[] mTitle;
    private String normalColor;
    private String selectedColor;

    public interface OnIndicatorTabClickListener {
        void onTabClick(int i10);
    }

    public SimpleNavigatorAdapter(String[] strArr, int i10, String str, String str2, int[] iArr) {
        this.mTitle = strArr;
        this.normalColor = str;
        this.selectedColor = str2;
        this.colors = iArr;
        this.font = i10;
    }

    @Override // jo.a
    public int getCount() {
        String[] strArr = this.mTitle;
        if (strArr == null) {
            return 0;
        }
        return strArr.length;
    }

    @Override // jo.a
    public c getIndicator(Context context) {
        HXLinePagerIndicator hXLinePagerIndicator = new HXLinePagerIndicator(context, this.colors);
        hXLinePagerIndicator.setMode(2);
        hXLinePagerIndicator.setLineHeight(b.a(context, 3.0d));
        hXLinePagerIndicator.setLineWidth(b.a(context, 16.0d));
        hXLinePagerIndicator.setRoundRadius(b.a(context, 2.0d));
        hXLinePagerIndicator.setStartInterpolator(new AccelerateInterpolator());
        hXLinePagerIndicator.setEndInterpolator(new DecelerateInterpolator(2.0f));
        hXLinePagerIndicator.setYOffset(10.0f);
        return hXLinePagerIndicator;
    }

    @Override // jo.a
    public d getTitleView(Context context, final int i10) {
        ShopSimplePagerTitleView shopSimplePagerTitleView = new ShopSimplePagerTitleView(context);
        shopSimplePagerTitleView.setNormalColor(Color.parseColor(this.normalColor));
        shopSimplePagerTitleView.setSelectedColor(Color.parseColor(this.selectedColor));
        shopSimplePagerTitleView.setText(this.mTitle[i10]);
        shopSimplePagerTitleView.setTextSize(this.font);
        shopSimplePagerTitleView.getPaint().setFakeBoldText(true);
        shopSimplePagerTitleView.setPadding(t.i(10.0f), 0, t.i(10.0f), 0);
        shopSimplePagerTitleView.setOnClickListener(new View.OnClickListener() { // from class: net.babycat.live.platform.widget.view.SimpleNavigatorAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SimpleNavigatorAdapter.this.mIndicatorTabClickListener.onTabClick(i10);
            }
        });
        return shopSimplePagerTitleView;
    }

    public void setIndicatorTabClickListener(OnIndicatorTabClickListener onIndicatorTabClickListener) {
        this.mIndicatorTabClickListener = onIndicatorTabClickListener;
    }
}
