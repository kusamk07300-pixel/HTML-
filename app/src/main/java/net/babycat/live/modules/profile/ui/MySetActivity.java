package net.babycat.live.modules.profile.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import cf.g;
import com.gyf.immersionbar.ImmersionBar;
import com.tencent.trtc.TRTCCloud;
import em.m0;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import jm.m2;
import net.babycat.live.model.InitBean;
import net.babycat.live.model.NoticeChatBean;
import net.babycat.live.model.NoticeListBean;
import net.babycat.live.model.UserInfoDataBean;
import net.babycat.live.platform.util.a0;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.n0;
import net.babycat.live.platform.util.s0;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.x1;
import net.babycat.live.platform.widget.view.Topbar;
import net.babycat.live.shell.SplashActivity;
import net.babycat.live.shell.WebViewActivity;
import ok.e;
import org.litepal.LitePal;
import qmyy.babycat.live.R;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class MySetActivity extends in.b<m2> implements m0.b {
    public RelativeLayout mRlContact;
    public RelativeLayout mRlFeedback;
    public RelativeLayout mRlLanguage;
    public RelativeLayout mRlPass;
    public RelativeLayout mRlPrivacy;
    public RelativeLayout mRlRefund;
    public RelativeLayout mRlRoomHick;
    public RelativeLayout mRlUser;
    public RelativeLayout mRlVersion;
    public TextView mTvVersion;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35788n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f35789o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Switch f35790p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InitBean f35791q;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (compoundButton.isChecked()) {
                new x1(MySetActivity.this).q("hide_flyers", 1);
            } else {
                new x1(MySetActivity.this).q("hide_flyers", 0);
            }
        }
    }

    public class b implements g {
        public b() {
        }

        @Override // cf.g
        public void a(int i10, String str) {
            MySetActivity mySetActivity = MySetActivity.this;
            s0.e(mySetActivity, i10, mySetActivity);
            new x1(MySetActivity.this).s("language_select_sys", t.s(i10));
        }
    }

    public class c implements cf.c {

        public class a implements Consumer<Long> {
            public a() {
            }

            @Override // io.reactivex.functions.Consumer
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void accept(Long l10) throws Exception {
                MySetActivity.this.k3();
                new x1(MySetActivity.this).a();
                LitePal.deleteAll((Class<?>) InitBean.class, new String[0]);
                LitePal.deleteAll((Class<?>) UserInfoDataBean.class, new String[0]);
                LitePal.deleteAll((Class<?>) NoticeListBean.class, new String[0]);
                LitePal.deleteAll((Class<?>) NoticeChatBean.class, new String[0]);
                n0.n().t(null);
                zn.a.l().i();
                try {
                    TRTCCloud.destroySharedInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                MySetActivity.this.o5(SplashActivity.class);
                MySetActivity.this.finish();
            }
        }

        public c() {
        }

        @Override // cf.c
        public void onConfirm() {
            MySetActivity.this.l2("Log out");
            a0.a(new b0(e.EVENT_SUSPENDED_WINDOW_CLOSE_ROOM, ""));
            Observable.timer(2L, TimeUnit.SECONDS).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
        }
    }

    private void x5() {
        new b.C0752b(this).X(false).f(getString(R.string.my_select_language), new String[]{getString(R.string.language_en), getString(R.string.language_ar), getString(R.string.language_es), getString(R.string.language_bn), getString(R.string.language_fr), getString(R.string.language_tr), getString(R.string.language_hi)}, new b()).N();
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_my_set;
    }

    @Override // in.a
    public void g5() {
        this.mRlPass = (RelativeLayout) findViewById(R.id.rl_pass);
        this.mRlFeedback = (RelativeLayout) findViewById(R.id.rl_feedback);
        this.mRlPrivacy = (RelativeLayout) findViewById(R.id.rl_privacy);
        this.mRlUser = (RelativeLayout) findViewById(R.id.rl_user);
        this.mRlRefund = (RelativeLayout) findViewById(R.id.rl_refund);
        this.mRlLanguage = (RelativeLayout) findViewById(R.id.rl_language);
        this.mRlRoomHick = (RelativeLayout) findViewById(R.id.rl_room_hick);
        this.mTvVersion = (TextView) findViewById(R.id.tv_version);
        this.mRlVersion = (RelativeLayout) findViewById(R.id.rl_version);
        this.mRlContact = (RelativeLayout) findViewById(R.id.rl_contact);
        this.f35788n = (Topbar) findViewById(R.id.common_topbar);
        this.f35789o = (LinearLayout) findViewById(R.id.tv_quit);
        this.f35790p = (Switch) findViewById(R.id.swh_status);
        this.mRlPass.setOnClickListener(this);
        this.mRlFeedback.setOnClickListener(this);
        this.mRlPrivacy.setOnClickListener(this);
        this.mRlUser.setOnClickListener(this);
        this.mRlRefund.setOnClickListener(this);
        this.mRlLanguage.setOnClickListener(this);
        this.mRlRoomHick.setOnClickListener(this);
        this.mTvVersion.setOnClickListener(this);
        this.mRlVersion.setOnClickListener(this);
        this.mRlContact.setOnClickListener(this);
        this.f35789o.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        ImmersionBar.with(this).fitsSystemWindows(false).transparentStatusBar().statusBarDarkFont(true).init();
        t.S0(this.f27688a, this.f35788n, getString(R.string.my_set));
        this.f35788n.setTextTextColor(getResources().getColor(R.color.black));
        this.f35788n.setTabBoldGone();
        this.f35788n.setTransparent();
        this.f35791q = (InitBean) LitePal.findFirst(InitBean.class, true);
        this.mTvVersion.setText("v" + t.f0());
        this.f35790p.setChecked(new x1(this).i("hide_flyers", 1) == 1);
        this.f35790p.setOnCheckedChangeListener(new a());
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rl_contact /* 2131363812 */:
                InitBean initBean = this.f35791q;
                if (initBean != null && !TextUtils.isEmpty(initBean.getSetting().getContact_us())) {
                    Bundle bundle = new Bundle();
                    bundle.putString("title", getString(R.string.contact_us));
                    bundle.putString("url", this.f35791q.getSetting().getContact_us());
                    p5(WebViewActivity.class, bundle);
                }
                break;
            case R.id.rl_feedback /* 2131363819 */:
                if (t.t0()) {
                    o5(FeedbackActivity.class);
                }
                break;
            case R.id.rl_language /* 2131363830 */:
                x5();
                break;
            case R.id.rl_pass /* 2131363835 */:
                if (t.t0()) {
                    o5(SecurityAccountActivity.class);
                }
                break;
            case R.id.rl_privacy /* 2131363837 */:
                InitBean initBean2 = this.f35791q;
                if (initBean2 != null && !TextUtils.isEmpty(initBean2.getSetting().getPrivacy_agreement())) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("title", getString(R.string.privacy_agreement));
                    bundle2.putString("url", this.f35791q.getSetting().getPrivacy_agreement());
                    p5(WebViewActivity.class, bundle2);
                }
                break;
            case R.id.rl_refund /* 2131363844 */:
                InitBean initBean3 = this.f35791q;
                if (initBean3 != null && !TextUtils.isEmpty(initBean3.getSetting().getRefund_policy())) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("title", getString(R.string.payment_agreement));
                    bundle3.putString("url", this.f35791q.getSetting().getRefund_policy());
                    p5(WebViewActivity.class, bundle3);
                }
                break;
            case R.id.rl_room_hick /* 2131363845 */:
                if (t.t0()) {
                    o5(BlackUserActivity.class);
                }
                break;
            case R.id.rl_user /* 2131363857 */:
                InitBean initBean4 = this.f35791q;
                if (initBean4 != null && !TextUtils.isEmpty(initBean4.getSetting().getUser_agreement())) {
                    Bundle bundle4 = new Bundle();
                    bundle4.putString("title", getString(R.string.user_agreement));
                    bundle4.putString("url", this.f35791q.getSetting().getUser_agreement());
                    p5(WebViewActivity.class, bundle4);
                }
                break;
            case R.id.tv_quit /* 2131364528 */:
                new b.C0752b(this).Y(true).N(Boolean.FALSE).r(getString(R.string.point_out), getString(R.string.close_login), getString(R.string.cancel), getString(R.string.define), new c(), null, false).N();
                break;
        }
    }
}
