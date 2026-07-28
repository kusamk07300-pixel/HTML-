package net.babycat.live.modules.profile.ui;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.x;
import com.gyf.immersionbar.ImmersionBar;
import em.y;
import in.b;
import jm.c1;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;
import zl.a;

/* JADX INFO: loaded from: classes4.dex */
public class MyFriendsActivity extends b<c1> implements y.b {
    public Topbar mCommonTopbar;
    public FrameLayout mFlFriends;
    public LinearLayout mLinFriends;
    public TextView mTvFriends;
    public TextView mTvPullBlack;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35671n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35672o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f35675r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a f35676s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f35677t = 0;

    @Override // in.a
    public int e5() {
        return R.layout.activity_my_friends;
    }

    @Override // in.a
    public void g5() {
        this.mCommonTopbar = (Topbar) findViewById(R.id.common_topbar);
        this.mTvFriends = (TextView) findViewById(R.id.tv_friends);
        this.mTvPullBlack = (TextView) findViewById(R.id.tv_pull_black);
        this.mLinFriends = (LinearLayout) findViewById(R.id.lin_friends);
        this.mFlFriends = (FrameLayout) findViewById(R.id.fl_friends);
        this.mTvFriends.setOnClickListener(this);
        this.mTvPullBlack.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        ImmersionBar.with(this).fitsSystemWindows(false).transparentStatusBar().statusBarDarkFont(true).init();
        String stringExtra = getIntent().getStringExtra("my_friends_title");
        this.f35675r = stringExtra;
        t.S0(this, this.mCommonTopbar, stringExtra);
        this.mCommonTopbar.setTabBoldGone();
        this.f35671n = getIntent().getIntExtra("my_vip_level_id", 0);
        this.f35672o = getIntent().getIntExtra("my_props_id", 0);
        this.f35673p = getIntent().getIntExtra("my_friends_tag", 0);
        this.f35674q = getIntent().getIntExtra("my_friends_type", 0);
        this.f35677t = getIntent().getIntExtra("entrance", 0);
        x xVarR = getSupportFragmentManager().r();
        a aVarK5 = a.K5(this.f35674q, this.f35673p, this.f35671n, this.f35672o, this.f35677t);
        this.f35676s = aVarK5;
        xVarR.g(R.id.fl_friends, aVarK5);
        xVarR.r();
        if (this.f35674q == 1) {
            this.mLinFriends.setVisibility(0);
        }
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.tv_friends) {
            this.mTvFriends.setBackgroundResource(R.drawable.bg_white_r40);
            this.mTvFriends.setTextColor(-13421773);
            this.mTvPullBlack.setBackgroundResource(0);
            this.mTvPullBlack.setTextColor(-1);
            this.f35676s.I5(1);
            return;
        }
        if (id2 != R.id.tv_pull_black) {
            return;
        }
        this.mTvFriends.setBackgroundResource(0);
        this.mTvFriends.setTextColor(-1);
        this.mTvPullBlack.setBackgroundResource(R.drawable.bg_white_r40);
        this.mTvPullBlack.setTextColor(-13421773);
        this.f35676s.I5(6);
    }
}
