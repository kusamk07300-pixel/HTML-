package net.babycat.live.modules.profile.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cf.i;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.gyf.immersionbar.ImmersionBar;
import em.q;
import f.n0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import jm.m0;
import net.babycat.live.model.InviteLinkBean;
import net.babycat.live.model.InviteListBean;
import net.babycat.live.model.InviteRankBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.v;
import net.babycat.live.platform.widget.view.CircleImageView;
import net.babycat.live.platform.widget.view.ObservableScrollView;
import net.babycat.live.platform.widget.view.Topbar;
import net.babycat.live.shell.WebViewActivity;
import qmyy.babycat.live.R;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class InviteFriendsActivity extends in.b<m0> implements q.b, ObservableScrollView.ScrollViewListener {
    public CircleImageView A;
    public CircleImageView B;
    public CircleImageView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView G;
    public TextView H;
    public TextView I;
    public TextView J;
    public TextView K;
    public TextView L;
    public lm.b N;
    public lm.c O;
    public lm.d P;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ObservableScrollView f35572n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Topbar f35573o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RecyclerView f35574p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public RecyclerView f35575q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f35576r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LinearLayout f35577s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LinearLayout f35578t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public LinearLayout f35579u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f35580v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f35581w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f35582x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f35583y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ImageView f35584z;
    public int M = 0;
    public String Q = "";
    public String R = "";
    public String S = "";
    public int T = 1;
    public String U = "";

    public class a implements q7.e {
        public a() {
        }

        @Override // q7.e
        public void a(@n0 BaseQuickAdapter baseQuickAdapter, @n0 View view, int i10) {
            if (view.getId() == R.id.iv_butt && t.t0()) {
                InviteFriendsActivity.this.Q5();
            }
        }
    }

    public class b implements q7.g {
        public b() {
        }

        @Override // q7.g
        public void a(@n0 BaseQuickAdapter<?, ?> baseQuickAdapter, @n0 View view, int i10) {
            if (t.t0()) {
                InviteRankBean inviteRankBean = InviteFriendsActivity.this.O.getData().get(i10);
                Bundle bundle = new Bundle();
                Integer uid = inviteRankBean.getUid();
                uid.intValue();
                bundle.putInt("my_space_uid", uid.intValue());
                InviteFriendsActivity.this.p5(MySpaceActivity.class, bundle);
            }
        }
    }

    public class c implements cf.g {
        public c() {
        }

        @Override // cf.g
        public void a(int i10, String str) {
            InviteFriendsActivity.this.U = str;
            InviteFriendsActivity.this.f35582x.setText(str);
            if (i10 == 0) {
                InviteFriendsActivity.this.T = 1;
            } else if (i10 == 1) {
                InviteFriendsActivity.this.T = 2;
            } else {
                InviteFriendsActivity.this.T = 3;
            }
            InviteFriendsActivity.this.O5();
        }
    }

    public class d extends i {
        public d() {
        }

        @Override // cf.i, cf.j
        public void onDismiss(af.b bVar) {
            super.onDismiss(bVar);
            InviteFriendsActivity.this.f35584z.setImageResource(R.mipmap.iv_to_right);
        }
    }

    public class e implements cf.c {

        public class a implements v.l {
            public a() {
            }

            @Override // net.babycat.live.platform.util.v.l
            public void a(String str) {
                InviteFriendsActivity.this.k3();
                Uri uriForFile = FileProvider.getUriForFile(InviteFriendsActivity.this, InviteFriendsActivity.this.getPackageName() + ".fileprovider", new File(str));
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", InviteFriendsActivity.this.Q);
                intent.putExtra("android.intent.extra.STREAM", uriForFile);
                InviteFriendsActivity.this.startActivity(Intent.createChooser(intent, "Choose a sharing app"));
            }

            @Override // net.babycat.live.platform.util.v.l
            public void b(int i10) {
            }
        }

        public e() {
        }

        @Override // cf.c
        public void onConfirm() {
            if (TextUtils.isEmpty(InviteFriendsActivity.this.R)) {
                InviteFriendsActivity.this.K5();
                return;
            }
            InviteFriendsActivity.this.l2("");
            v vVarH = v.h();
            vVarH.l(new a());
            String strA = t.A(InviteFriendsActivity.this.R);
            vVarH.m(InviteFriendsActivity.this.R, ok.b.IMAGEURL, strA + ".png");
        }
    }

    public class f implements cf.a {
        public f() {
        }

        @Override // cf.a
        public void onCancel() {
            InviteFriendsActivity.this.K5();
        }
    }

    public class g implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f35592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f35593b;

        public g(List list, int i10) {
            this.f35592a = list;
            this.f35593b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (t.t0()) {
                InviteRankBean inviteRankBean = (InviteRankBean) this.f35592a.get(this.f35593b);
                Bundle bundle = new Bundle();
                Integer uid = inviteRankBean.getUid();
                uid.intValue();
                bundle.putInt("my_space_uid", uid.intValue());
                InviteFriendsActivity.this.p5(MySpaceActivity.class, bundle);
            }
        }
    }

    private void M5() {
        if (this.M <= t.i(40.0f)) {
            this.f35573o.setBg(Color.argb(0, 255, 255, 255));
            this.f35573o.setTabBoldGone();
            this.f35573o.setTextTextColor(-1);
            ImmersionBar.with(this).fitsSystemWindows(false).transparentStatusBar().statusBarDarkFont(false).init();
            this.f35573o.setLeftImage(R.mipmap.live_return);
            return;
        }
        ImmersionBar.with(this).fitsSystemWindows(false).statusBarDarkFont(true).statusBarColor(R.color.white).init();
        this.f35573o.setTextTextColor(Color.parseColor("#333333"));
        this.f35573o.setTabBoldVISIBLE();
        this.f35573o.setBg(Color.argb(255, 255, 255, 255));
        this.f35573o.setLeftImage(R.mipmap.icon_back);
    }

    public final void I5(CircleImageView circleImageView, TextView textView, TextView textView2, TextView textView3, List<InviteRankBean> list, int i10) {
        if (list.size() <= i10 || list.get(i10) == null || list.get(i10).getUser() == null) {
            return;
        }
        InviteRankBean inviteRankBean = list.get(i10);
        wn.d.f(this, circleImageView, inviteRankBean.getUser().getAvatar());
        textView.setText(inviteRankBean.getUser().getNickname());
        textView2.setText("ID:" + inviteRankBean.getUser().getId());
        textView3.setText("" + inviteRankBean.getTotalCoin());
        circleImageView.setOnClickListener(new g(list, i10));
    }

    public final void J5(CircleImageView circleImageView, TextView textView, TextView textView2, TextView textView3) {
        wn.d.c(this, Integer.valueOf(R.mipmap.circle_logo), circleImageView);
        textView.setText("");
        textView2.setText("");
        textView3.setText("");
    }

    public final void K5() {
        ClipboardManager clipboardManager = (ClipboardManager) getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(null, this.Q));
            v5(getString(R.string.copy_success));
        }
    }

    public final void L5() {
        this.P = new lm.d(new ArrayList());
        this.f35574p.setLayoutManager(new LinearLayoutManager(this));
        this.f35574p.setNestedScrollingEnabled(false);
        this.f35574p.setAdapter(this.P);
        this.N = new lm.b(new ArrayList());
        this.f35575q.setLayoutManager(new LinearLayoutManager(this));
        this.f35575q.setAdapter(this.N);
        this.N.c1(R.layout.view_state_empty_anchor_apply);
        this.O = new lm.c(new ArrayList());
        this.f35576r.setLayoutManager(new LinearLayoutManager(this));
        this.f35576r.setNestedScrollingEnabled(false);
        this.f35576r.setAdapter(this.O);
        this.O.c1(R.layout.view_state_empty_anchor_apply);
        this.P.r(R.id.iv_butt);
        this.P.e(new a());
        this.N.c(new q7.g() { // from class: km.q
            @Override // q7.g
            public final void a(BaseQuickAdapter baseQuickAdapter, View view, int i10) {
                this.f29571a.N5(baseQuickAdapter, view, i10);
            }
        });
        this.O.c(new b());
    }

    public final /* synthetic */ void N5(BaseQuickAdapter baseQuickAdapter, View view, int i10) {
        if (t.t0()) {
            S5(this.N.getData().get(i10));
        }
    }

    public final void O5() {
        ((m0) this.f27702e).t3(this.T);
    }

    public final void P5() {
        J5(this.A, this.D, this.G, this.J);
        J5(this.B, this.E, this.H, this.K);
        J5(this.C, this.F, this.I, this.L);
    }

    @Override // em.q.b
    public void Q2(List<InviteRankBean> list) {
        P5();
        ArrayList arrayList = list == null ? new ArrayList() : new ArrayList(list);
        I5(this.A, this.D, this.G, this.J, arrayList, 0);
        I5(this.B, this.E, this.H, this.K, arrayList, 1);
        I5(this.C, this.F, this.I, this.L, arrayList, 2);
        this.O.v1(arrayList.size() > 3 ? new ArrayList(arrayList.subList(3, arrayList.size())) : new ArrayList());
    }

    public final void Q5() {
        if (TextUtils.isEmpty(this.Q)) {
            return;
        }
        new b.C0752b(this).Y(true).r(getString(R.string.invitation_list), "Step 1: Share the link with friends for them to install, download, and log in to the App.\n\nStep 2: After inviting successfully, you will receive your reward.", "Copy link", "Share link", new e(), new f(), false).N();
    }

    public final void R5() {
        this.f35578t.setVisibility(8);
        this.f35575q.setVisibility(0);
        this.f35579u.setVisibility(8);
        this.f35580v.setBackgroundResource(R.mipmap.invite_select);
        this.f35577s.setBackgroundResource(R.mipmap.invite_no_select);
        this.f35581w.setText(getString(R.string.invitation_leaderboa));
    }

    public final void S5(InviteListBean inviteListBean) {
        Integer touid;
        if (inviteListBean == null || (touid = inviteListBean.getTouid()) == null) {
            return;
        }
        new b.C0752b(this).t(new hm.b(this, touid)).N();
    }

    public final void T5(View view) {
        this.f35584z.setImageResource(R.mipmap.iv_to_down);
        new b.C0752b(this).F(view).S(Boolean.FALSE).q0(t.i(150.0f)).s0(new d()).c(new String[]{getString(R.string.this_week_text), getString(R.string.this_month), getString(R.string.totall)}, null, new c()).N();
    }

    public final void U5() {
        this.f35578t.setVisibility(0);
        this.f35575q.setVisibility(8);
        this.f35579u.setVisibility(0);
        this.f35577s.setBackgroundResource(R.mipmap.invite_select);
        this.f35580v.setBackgroundResource(R.mipmap.invite_no_select);
        this.f35582x.setText(this.U);
    }

    @Override // em.q.b
    public void W4(List<InviteListBean> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.N.v1(new ArrayList(list));
    }

    @Override // em.q.b
    public void a1(InviteLinkBean inviteLinkBean) {
        if (inviteLinkBean == null) {
            return;
        }
        this.Q = inviteLinkBean.getUrl();
        this.R = inviteLinkBean.getImg();
        this.S = inviteLinkBean.getInviteRuleUrl();
        if (inviteLinkBean.getRules() != null) {
            this.P.v1(new ArrayList(inviteLinkBean.getRules()));
        }
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_invite_friends;
    }

    @Override // in.a
    public void g5() {
        this.f35572n = (ObservableScrollView) findViewById(R.id.osc_main);
        this.f35573o = (Topbar) findViewById(R.id.common_topbar);
        this.f35574p = (RecyclerView) findViewById(R.id.re_rule_list);
        this.f35575q = (RecyclerView) findViewById(R.id.re_list);
        this.f35576r = (RecyclerView) findViewById(R.id.ranking_list);
        this.f35577s = (LinearLayout) findViewById(R.id.lin_ranking);
        this.f35578t = (LinearLayout) findViewById(R.id.lin_ranking_main);
        this.f35579u = (LinearLayout) findViewById(R.id.lin_type);
        this.f35580v = (TextView) findViewById(R.id.tv_list);
        this.f35581w = (TextView) findViewById(R.id.tv_ranking);
        this.f35582x = (TextView) findViewById(R.id.tv_type);
        this.f35583y = (TextView) findViewById(R.id.iv_rule);
        this.f35584z = (ImageView) findViewById(R.id.iv_arrow);
        this.A = (CircleImageView) findViewById(R.id.civ_avatar1);
        this.B = (CircleImageView) findViewById(R.id.civ_avatar2);
        this.C = (CircleImageView) findViewById(R.id.civ_avatar3);
        this.D = (TextView) findViewById(R.id.tv_name1);
        this.E = (TextView) findViewById(R.id.tv_name2);
        this.F = (TextView) findViewById(R.id.tv_name3);
        this.G = (TextView) findViewById(R.id.tv_id1);
        this.H = (TextView) findViewById(R.id.tv_id2);
        this.I = (TextView) findViewById(R.id.tv_id3);
        this.J = (TextView) findViewById(R.id.tv_num1);
        this.K = (TextView) findViewById(R.id.tv_num2);
        this.L = (TextView) findViewById(R.id.tv_num3);
        this.f35580v.setOnClickListener(this);
        this.f35577s.setOnClickListener(this);
        this.f35579u.setOnClickListener(this);
        this.f35583y.setOnClickListener(this);
        String string = getString(R.string.this_week_text);
        this.U = string;
        this.f35582x.setText(string);
        this.f35584z.setImageResource(R.mipmap.iv_to_right);
    }

    @Override // in.a
    public void h5() {
        m5(false);
        t.S0(this, this.f35573o, "");
        M5();
        L5();
        R5();
        ((m0) this.f27702e).k0();
        ((m0) this.f27702e).B2();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.tv_list) {
            R5();
            ((m0) this.f27702e).B2();
            return;
        }
        if (id2 == R.id.lin_ranking) {
            U5();
            O5();
            return;
        }
        if (id2 == R.id.lin_type) {
            T5(view);
            return;
        }
        if (id2 == R.id.iv_rule && !TextUtils.isEmpty(this.S) && t.t0()) {
            Bundle bundle = new Bundle();
            bundle.putString("title", getString(R.string.rule));
            bundle.putString("url", this.S);
            p5(WebViewActivity.class, bundle);
        }
    }

    @Override // net.babycat.live.platform.widget.view.ObservableScrollView.ScrollViewListener
    public void onScrollChanged(ObservableScrollView observableScrollView, int i10, int i11, int i12, int i13) {
        this.M = i11;
        M5();
    }
}
