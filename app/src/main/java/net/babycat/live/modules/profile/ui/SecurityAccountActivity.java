package net.babycat.live.modules.profile.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.gyf.immersionbar.ImmersionBar;
import em.m0;
import in.b;
import jm.m2;
import net.babycat.live.model.InitBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import net.babycat.live.shell.WebViewActivity;
import org.litepal.LitePal;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class SecurityAccountActivity extends b<m2> implements m0.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35915n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f35916o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f35917p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LinearLayout f35918q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InitBean f35919r;

    @Override // in.a
    public int e5() {
        return R.layout.act_security_account;
    }

    @Override // in.a
    public void g5() {
        this.f35919r = (InitBean) LitePal.findFirst(InitBean.class, true);
        this.f35915n = (Topbar) findViewById(R.id.common_topbar);
        this.f35916o = (LinearLayout) findViewById(R.id.rl_pass);
        this.f35917p = (LinearLayout) findViewById(R.id.rl_delete_account);
        this.f35918q = (LinearLayout) findViewById(R.id.rl_delete_policy);
        this.f35916o.setOnClickListener(this);
        this.f35917p.setOnClickListener(this);
        this.f35918q.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        ImmersionBar.with(this).fitsSystemWindows(false).transparentStatusBar().statusBarDarkFont(true).init();
        t.S0(this.f27688a, this.f35915n, getString(R.string.security_title));
        this.f35915n.setTextTextColor(getResources().getColor(R.color.black));
        this.f35915n.setTabBoldGone();
        this.f35915n.setTransparent();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        InitBean initBean;
        switch (view.getId()) {
            case R.id.rl_delete_account /* 2131363814 */:
                if (t.t0()) {
                    o5(DeleteUserAccountActivity.class);
                }
                break;
            case R.id.rl_delete_policy /* 2131363815 */:
                if (t.t0() && (initBean = this.f35919r) != null && !TextUtils.isEmpty(initBean.getSetting().getUser_delete_agreement())) {
                    Bundle bundle = new Bundle();
                    bundle.putString("title", getString(R.string.delete_account_policy_title));
                    bundle.putString("url", this.f35919r.getSetting().getUser_delete_agreement());
                    p5(WebViewActivity.class, bundle);
                    break;
                }
                break;
            case R.id.rl_pass /* 2131363835 */:
                if (t.t0()) {
                    o5(ChangePasswordActivity.class);
                }
                break;
        }
    }
}
