package net.babycat.live.modules.message.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bm.g;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.zzhoujay.richtext.a;
import g0.o0;
import in.b;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;
import xl.d;

/* JADX INFO: loaded from: classes4.dex */
public class MessageDetailsActivity extends b<g> implements d.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35382n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f35383o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SubsamplingScaleImageView f35384p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f35385q;
    public String msg = "";
    public String img = "";

    @Override // in.a
    public int e5() {
        return R.layout.act_message_details;
    }

    @Override // in.a
    public void g5() {
        this.f35382n = (Topbar) findViewById(R.id.common_topbar);
        this.f35383o = (TextView) findViewById(R.id.tv_msg);
        this.f35384p = (SubsamplingScaleImageView) findViewById(R.id.iv_scaleimg);
        this.f35385q = (ImageView) findViewById(R.id.iv_img);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.f35382n, getString(R.string.message_details));
        this.msg = getIntent().getStringExtra(o0.CATEGORY_MESSAGE);
        this.img = getIntent().getStringExtra("img");
        if (!TextUtils.isEmpty(this.msg)) {
            a.i(this.msg).b(false).i(false).q(this.f35383o);
        }
        if (TextUtils.isEmpty(this.img)) {
            return;
        }
        wn.d.b(this, this.img, this.f35385q, this.f35384p);
    }

    @Override // in.a
    public View k5() {
        return null;
    }
}
