package net.babycat.live.modules.profile.ui;

import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.x;
import em.d0;
import gm.m;
import in.b;
import jm.o1;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class MyLikeFriendsActivity extends b<o1> implements d0.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35710n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f35711o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35712p;

    @Override // in.a
    public int e5() {
        return R.layout.activity_my_like_frends;
    }

    @Override // in.a
    public void g5() {
        this.f35710n = (Topbar) findViewById(R.id.common_topbar);
        this.f35711o = (LinearLayout) findViewById(R.id.ll_top);
    }

    @Override // in.a
    public void h5() {
        this.f35712p = getIntent().getIntExtra("my_like_friends_num", 0);
        t.S0(this, this.f35710n, getString(R.string.friendly_value));
        this.f35710n.setTopBarWhite();
        x xVarR = getSupportFragmentManager().r();
        xVarR.g(R.id.frame_like, m.u5(this.f35712p));
        xVarR.r();
    }

    @Override // in.a
    public View k5() {
        return this.f35711o;
    }
}
