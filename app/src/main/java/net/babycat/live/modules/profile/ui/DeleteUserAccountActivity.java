package net.babycat.live.modules.profile.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import em.l;
import in.b;
import jm.w;
import net.babycat.live.model.InitBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import net.babycat.live.shell.WebViewActivity;
import org.litepal.LitePal;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class DeleteUserAccountActivity extends b<w> implements l.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35533n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f35534o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public EditText f35535p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f35536q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RelativeLayout f35537r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ImageView f35538s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f35539t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f35540u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InitBean f35541v;

    @Override // em.l.b
    public void Q() {
        v5(getString(R.string.success));
        finish();
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_delete_user_account;
    }

    @Override // in.a
    public void g5() {
        this.f35541v = (InitBean) LitePal.findFirst(InitBean.class, true);
        this.f35533n = (Topbar) findViewById(R.id.common_topbar);
        this.f35534o = (TextView) findViewById(R.id.tv_addtime);
        this.f35535p = (EditText) findViewById(R.id.ed_cont);
        this.f35536q = (TextView) findViewById(R.id.but_tj);
        this.f35537r = (RelativeLayout) findViewById(R.id.re_but);
        this.f35536q.setOnClickListener(this);
        this.f35538s = (ImageView) findViewById(R.id.iv_chosen);
        this.f35539t = (TextView) findViewById(R.id.tv_policy);
        this.f35538s.setOnClickListener(this);
        this.f35539t.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        t.S0(this.f27688a, this.f35533n, getString(R.string.security_delete_account));
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        InitBean initBean;
        int id2 = view.getId();
        if (id2 == R.id.but_tj) {
            if (!this.f35540u) {
                v5(getString(R.string.delete_account_read_and_agree));
            } else {
                if (TextUtils.isEmpty(this.f35535p.getText().toString())) {
                    v5(getString(R.string.delete_account_reason_hint));
                    return;
                }
                ((w) this.f27702e).y0(this.f35535p.getText().toString(), 2);
            }
            finish();
            return;
        }
        if (id2 == R.id.iv_chosen) {
            boolean z10 = this.f35540u;
            this.f35540u = !z10;
            this.f35538s.setImageResource(!z10 ? R.mipmap.radio_check : R.mipmap.radio_nor);
        } else if (id2 == R.id.tv_policy && t.t0() && (initBean = this.f35541v) != null && !TextUtils.isEmpty(initBean.getSetting().getUser_delete_agreement())) {
            Bundle bundle = new Bundle();
            bundle.putString("title", getString(R.string.delete_account_policy_title));
            bundle.putString("url", this.f35541v.getSetting().getUser_delete_agreement());
            p5(WebViewActivity.class, bundle);
        }
    }
}
