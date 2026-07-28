package net.babycat.live.modules.voice.view.leliao;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import f.p0;
import qmyy.babycat.live.R;
import wn.d;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGetIntoLayoutView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f36557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f36558b;

    public LiveGetIntoLayoutView(Context context) {
        super(context);
        b();
    }

    public void a(String str, String str2) {
        try {
            d.j(getContext(), this.f36558b, str2, 1, "#ffffff");
            this.f36557a.setText(str + "  " + getContext().getString(R.string.join_room));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void b() {
        this.f36557a = (TextView) findViewById(R.id.tv_name);
        this.f36558b = (ImageView) findViewById(R.id.image_avatar);
    }

    public LiveGetIntoLayoutView(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        LayoutInflater.from(context).inflate(R.layout.live_get_into_view, this);
        b();
    }
}
