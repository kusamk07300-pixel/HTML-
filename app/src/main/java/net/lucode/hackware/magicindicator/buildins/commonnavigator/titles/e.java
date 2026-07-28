package net.lucode.hackware.magicindicator.buildins.commonnavigator.titles;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public class e extends TextView implements jo.b {
    protected int mNormalColor;
    protected int mSelectedColor;

    public e(Context context) {
        super(context, null);
        a(context);
    }

    private void a(Context context) {
        setGravity(17);
        int iA = go.b.a(context, 10.0d);
        setPadding(iA, 0, iA, 0);
        setSingleLine();
        setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // jo.b
    public int getContentBottom() {
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        return (int) ((getHeight() / 2) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f));
    }

    @Override // jo.b
    public int getContentLeft() {
        String string;
        Rect rect = new Rect();
        if (getText().toString().contains("\n")) {
            string = "";
            for (String str : getText().toString().split("\\n")) {
                if (str.length() > string.length()) {
                    string = str;
                }
            }
        } else {
            string = getText().toString();
        }
        getPaint().getTextBounds(string, 0, string.length(), rect);
        return (getLeft() + (getWidth() / 2)) - (rect.width() / 2);
    }

    @Override // jo.b
    public int getContentRight() {
        String string;
        Rect rect = new Rect();
        if (getText().toString().contains("\n")) {
            string = "";
            for (String str : getText().toString().split("\\n")) {
                if (str.length() > string.length()) {
                    string = str;
                }
            }
        } else {
            string = getText().toString();
        }
        getPaint().getTextBounds(string, 0, string.length(), rect);
        return getLeft() + (getWidth() / 2) + (rect.width() / 2);
    }

    @Override // jo.b
    public int getContentTop() {
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        return (int) ((getHeight() / 2) - ((fontMetrics.bottom - fontMetrics.top) / 2.0f));
    }

    public int getNormalColor() {
        return this.mNormalColor;
    }

    public int getSelectedColor() {
        return this.mSelectedColor;
    }

    public void onDeselected(int i10, int i11) {
        setTextColor(this.mNormalColor);
    }

    public void onEnter(int i10, int i11, float f10, boolean z10) {
    }

    public void onLeave(int i10, int i11, float f10, boolean z10) {
    }

    public void onSelected(int i10, int i11) {
        setTextColor(this.mSelectedColor);
    }

    public void setNormalColor(int i10) {
        this.mNormalColor = i10;
    }

    public void setSelectedColor(int i10) {
        this.mSelectedColor = i10;
    }
}
