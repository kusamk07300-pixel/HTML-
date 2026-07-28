package net.babycat.live.modules.profile.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import em.k;
import in.b;
import jm.u;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.x1;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class CreatingFamilyActivity extends b<u> implements k.b {
    public Button mButCre;
    public Topbar mCommonTopbar;
    public TextView mTvInfo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x1 f35532n = null;

    @Override // in.a
    public int e5() {
        return R.layout.act_creating_family;
    }

    @Override // in.a
    public void g5() {
        this.mCommonTopbar = (Topbar) findViewById(R.id.common_topbar);
        this.mButCre = (Button) findViewById(R.id.but_cre);
        this.mTvInfo = (TextView) findViewById(R.id.tv_info);
        this.mButCre.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.mCommonTopbar, getString(R.string.my_family));
        m5(true);
        this.mCommonTopbar.setTransparent();
        this.mCommonTopbar.setTabBoldGone();
        x1 x1Var = new x1(this);
        this.f35532n = x1Var;
        if (TextUtils.isEmpty(x1Var.l("min_wealth"))) {
            return;
        }
        this.mTvInfo.setText(this.f35532n.l("min_wealth"));
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.but_cre) {
            return;
        }
        o5(CreateNewsFamilyActivity.class);
        finish();
    }
}
