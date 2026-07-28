package net.babycat.live.modules.creator.ui;

import android.view.View;
import android.widget.TextView;
import cf.c;
import cl.m;
import com.gyf.immersionbar.ImmersionBar;
import gl.y;
import in.b;
import net.babycat.live.model.AgencyInfoBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class MyGuildActivity extends b<y> implements m.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35178n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f35179o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f35180p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f35181q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f35182r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f35183s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f35184t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f35185u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f35186v = 0;

    public class a implements c {
        public a() {
        }

        @Override // cf.c
        public void onConfirm() {
            MyGuildActivity myGuildActivity = MyGuildActivity.this;
            myGuildActivity.l2(myGuildActivity.getString(R.string.loading));
            ((y) MyGuildActivity.this.f27702e).u0();
        }
    }

    @Override // cl.m.b
    public void e3(AgencyInfoBean agencyInfoBean) {
        this.f35179o.setText(String.valueOf(agencyInfoBean.getAgencyId()));
        this.f35180p.setText(agencyInfoBean.getName());
        this.f35181q.setText(agencyInfoBean.getLevel());
        this.f35183s.setText(agencyInfoBean.getNickname());
        this.f35182r.setText(String.valueOf(agencyInfoBean.getOwnUid()));
        this.f35184t.setText(t.d1(Long.parseLong(agencyInfoBean.getJoinTime() + "000"), ""));
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_my_guild;
    }

    @Override // in.a
    public void g5() {
        this.f35178n = (Topbar) findViewById(R.id.common_topbar);
        this.f35179o = (TextView) findViewById(R.id.tv_guild);
        this.f35180p = (TextView) findViewById(R.id.tv_guild_name);
        this.f35181q = (TextView) findViewById(R.id.tv_guild_level);
        this.f35182r = (TextView) findViewById(R.id.tv_president_id);
        this.f35183s = (TextView) findViewById(R.id.tv_president_name);
        this.f35184t = (TextView) findViewById(R.id.tv_joining_time);
        TextView textView = (TextView) findViewById(R.id.tv_quit);
        this.f35185u = textView;
        textView.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        ImmersionBar.with(this).fitsSystemWindows(false).transparentStatusBar().statusBarDarkFont(true).init();
        t.S0(this, this.f35178n, getString(R.string.my_agency));
        this.f35178n.setTabBoldGone();
        this.f35178n.setTransparent();
        int intExtra = getIntent().getIntExtra("show_quit", 0);
        this.f35186v = intExtra;
        this.f35185u.setVisibility(intExtra != 1 ? 8 : 0);
        ((y) this.f27702e).t0();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.tv_quit) {
            return;
        }
        new b.C0752b(this).p(getString(R.string.point_out), getString(R.string.quit_agency) + " ?", new a()).N();
    }

    @Override // cl.m.b
    public void z1() {
        k3();
        l2(getString(R.string.success));
        finish();
    }
}
