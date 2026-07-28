package net.babycat.live.modules.profile.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.d0;
import ao.g;
import ao.m0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.gyf.immersionbar.ImmersionBar;
import em.v;
import f.n0;
import java.util.ArrayList;
import jl.h;
import jm.w0;
import net.babycat.live.model.FamilyHomeBean;
import net.babycat.live.model.InRoombean;
import net.babycat.live.model.RoomListBean;
import net.babycat.live.model.UserInfoDataBean;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.p0;
import net.babycat.live.platform.util.x1;
import net.babycat.live.platform.widget.view.DragImageView;
import net.babycat.live.platform.widget.view.MarqueeTextview;
import net.babycat.live.shell.WebViewActivity;
import org.litepal.LitePal;
import qmyy.babycat.live.R;
import xn.e1;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class MyFamilyInfoActivity extends in.b<w0> implements v.b {
    public static final /* synthetic */ boolean W = false;
    public MarqueeTextview A;
    public TextView B;
    public TextView C;
    public ImageView D;
    public TextView E;
    public RecyclerView F;
    public RelativeLayout G;
    public x1 I;
    public UserInfoDataBean J;
    public int K;
    public int L;
    public int M;
    public d0 N;
    public h O;
    public RoomListBean P;
    public g Q;
    public m0 R;
    public View T;
    public View U;
    public View V;
    public RecyclerView mReMedal;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RecyclerView f35626n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RecyclerView f35627o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f35628p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f35629q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public MarqueeTextview f35630r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f35631s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public MarqueeTextview f35632t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f35633u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ProgressBar f35634v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f35635w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public DragImageView f35636x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RelativeLayout f35637y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ImageView f35638z;
    public String[] H = {"android.permission.RECORD_AUDIO"};
    public int S = 0;

    public class a implements q7.g {
        public a() {
        }

        @Override // q7.g
        public void a(@n0 BaseQuickAdapter<?, ?> baseQuickAdapter, @n0 View view, int i10) {
            MyFamilyInfoActivity.this.C5(((FamilyHomeBean.memberDoTo) baseQuickAdapter.getData().get(i10)).getUid().intValue());
        }
    }

    public class b implements q7.g {
        public b() {
        }

        @Override // q7.g
        public void a(@n0 BaseQuickAdapter<?, ?> baseQuickAdapter, @n0 View view, int i10) {
            MyFamilyInfoActivity.this.P = (RoomListBean) baseQuickAdapter.getData().get(i10);
            ((w0) MyFamilyInfoActivity.this.f27702e).b(MyFamilyInfoActivity.this.P.getRoomId().intValue());
        }
    }

    public class c implements q7.g {
        public c() {
        }

        @Override // q7.g
        public void a(@n0 BaseQuickAdapter<?, ?> baseQuickAdapter, @n0 View view, int i10) {
            new b.C0752b(MyFamilyInfoActivity.this).t(new xn.d(MyFamilyInfoActivity.this, (String) baseQuickAdapter.getData().get(i10), 0)).N();
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FamilyHomeBean f35642a;

        public d(FamilyHomeBean familyHomeBean) {
            this.f35642a = familyHomeBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(MyFamilyInfoActivity.this, (Class<?>) WebViewActivity.class);
            intent.putExtra("url", this.f35642a.getPolicyUrl());
            MyFamilyInfoActivity.this.startActivity(intent);
        }
    }

    public class e implements cf.f {
        public e() {
        }

        @Override // cf.f
        public void a(String str) {
            MyFamilyInfoActivity.this.P.setPassword(str);
            MyFamilyInfoActivity myFamilyInfoActivity = MyFamilyInfoActivity.this;
            myFamilyInfoActivity.q5(myFamilyInfoActivity.P);
        }
    }

    public class f implements e1.d {

        public class a implements cf.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f35646a;

            public a(int i10) {
                this.f35646a = i10;
            }

            @Override // cf.c
            public void onConfirm() {
                ((w0) MyFamilyInfoActivity.this.f27702e).I2(this.f35646a);
            }
        }

        public f() {
        }

        @Override // xn.e1.d
        public void a(int i10) {
            new b.C0752b(MyFamilyInfoActivity.this).Y(true).p(MyFamilyInfoActivity.this.getString(R.string.system_prompt), MyFamilyInfoActivity.this.getString(R.string.exit_family), new a(i10)).N();
        }
    }

    @Override // em.v.b
    public void C(FamilyHomeBean familyHomeBean) {
        if (familyHomeBean.getShowJoinFamily().intValue() == 1) {
            this.f35628p.setVisibility(0);
        } else {
            this.f35628p.setVisibility(8);
        }
        if (familyHomeBean.getIsFamilyMember().intValue() == 1) {
            this.f35636x.setVisibility(0);
            this.f35637y.setVisibility(0);
        } else {
            this.f35636x.setVisibility(8);
            this.f35637y.setVisibility(8);
        }
        if (!TextUtils.isEmpty(familyHomeBean.getPolicyUrl())) {
            this.G.setVisibility(0);
            this.G.setOnClickListener(new d(familyHomeBean));
        }
        this.S = familyHomeBean.getIsFamilyMember().intValue();
        this.K = familyHomeBean.getIsAdmin().intValue();
        wn.d.c(this, familyHomeBean.getLevelInfo().getBadge(), this.f35629q);
        wn.d.g(this, familyHomeBean.getOwner().getAvatar(), this.D);
        wn.d.n(this, this.f35638z, familyHomeBean.getBadge(), 15);
        this.A.setText(familyHomeBean.getOwner().getNickname());
        this.M = familyHomeBean.getOwner().getUid().intValue();
        this.B.setText("ID: " + familyHomeBean.getOwner().getUid());
        this.C.setText(getString(R.string.next_level) + ":" + familyHomeBean.getLevelInfo().getNextLevelName());
        this.E.setText("No." + familyHomeBean.getRank());
        this.Q.v1(familyHomeBean.getContribution());
        this.R.v1(familyHomeBean.getOwner().getMedalList());
        this.f35630r.setText(familyHomeBean.getName());
        this.f35631s.setText("ID：" + familyHomeBean.getId());
        this.f35632t.setText(familyHomeBean.getBriefing());
        this.N.v1(familyHomeBean.getFamilyUserBean());
        this.f35634v.setProgress((int) Math.floor((double) (familyHomeBean.getLevelInfo().getFirepowerRate().floatValue() * 100.0f)));
        if (p0.a()) {
            this.f35633u.setText(familyHomeBean.getLevelInfo().getNext_firepower() + "/" + familyHomeBean.getLevelInfo().getFirepower());
            this.f35635w.setText("(" + familyHomeBean.getMemberCnt().getLimit_cnt() + "/" + familyHomeBean.getMemberCnt().getCount() + ")");
        } else {
            this.f35633u.setText(familyHomeBean.getLevelInfo().getFirepower() + "/" + familyHomeBean.getLevelInfo().getNext_firepower());
            this.f35635w.setText("(" + familyHomeBean.getMemberCnt().getCount() + "/" + familyHomeBean.getMemberCnt().getLimit_cnt() + ")");
        }
        this.O.v1(familyHomeBean.getFamilyRoom());
    }

    public final void C5(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("my_space_uid", i10);
        p5(MySpaceActivity.class, bundle);
    }

    @Override // em.v.b
    public void I0() {
        v5(getString(R.string.applied_for));
    }

    @Override // em.v.b
    public void a(InRoombean inRoombean) {
        if (TextUtils.isEmpty(inRoombean.getIsLock())) {
            q5(this.P);
            return;
        }
        if (this.I.l("myRoomId").equals(String.valueOf(this.P.getRoomId()))) {
            q5(this.P);
        } else if (this.J.getIs_superadmin().intValue() == 1) {
            q5(this.P);
        } else {
            new b.C0752b(this).I(Boolean.TRUE).B(getString(R.string.new_room_password), "", "", getString(R.string.input_room_password), new e(), null, R.layout._xpopup_center_impl_confirm).N();
        }
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_my_family_info;
    }

    @Override // in.a
    public void g5() {
        this.f35626n = (RecyclerView) findViewById(R.id.rv_user_list);
        this.f35627o = (RecyclerView) findViewById(R.id.recycler);
        this.f35628p = (LinearLayout) findViewById(R.id.ll_apply_btn);
        this.f35629q = (ImageView) findViewById(R.id.iv_head);
        this.f35630r = (MarqueeTextview) findViewById(R.id.tv_name);
        this.f35631s = (TextView) findViewById(R.id.tv_id);
        this.f35632t = (MarqueeTextview) findViewById(R.id.tv_desc);
        this.f35633u = (TextView) findViewById(R.id.tv_hot_number);
        this.f35634v = (ProgressBar) findViewById(R.id.pro_level);
        this.f35635w = (TextView) findViewById(R.id.tv_member_num);
        this.f35636x = (DragImageView) findViewById(R.id.image_family_rank);
        this.f35637y = (RelativeLayout) findViewById(R.id.rl_edit);
        this.f35638z = (ImageView) findViewById(R.id.iv_bg_family);
        this.A = (MarqueeTextview) findViewById(R.id.tv_nickname);
        this.B = (TextView) findViewById(R.id.tv_uid);
        this.C = (TextView) findViewById(R.id.tv_next_level);
        this.D = (ImageView) findViewById(R.id.iv_avatar);
        this.E = (TextView) findViewById(R.id.tv_rank);
        this.F = (RecyclerView) findViewById(R.id.rv_contributor);
        this.mReMedal = (RecyclerView) findViewById(R.id.re_medal);
        this.G = (RelativeLayout) findViewById(R.id.rl_why);
        this.T = findViewById(R.id.tv_apply_join);
        this.U = findViewById(R.id.left_layout);
        this.V = findViewById(R.id.ll_member);
        this.f35631s.setOnClickListener(this);
        this.f35636x.setOnClickListener(this);
        this.f35637y.setOnClickListener(this);
        this.B.setOnClickListener(this);
        this.D.setOnClickListener(this);
        this.T.setOnClickListener(this);
        this.U.setOnClickListener(this);
        this.V.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        ImmersionBar.with(this).fitsSystemWindows(false).transparentStatusBar().statusBarDarkFont(true).init();
        this.L = getIntent().getIntExtra("family_id", -1);
        this.J = (UserInfoDataBean) LitePal.findFirst(UserInfoDataBean.class, true);
        this.I = new x1(this);
        ((w0) this.f27702e).J(this.L);
        this.N = new d0(new ArrayList());
        this.f35626n.setLayoutManager(new LinearLayoutManager(this, 0, false));
        this.f35626n.setAdapter(this.N);
        this.N.c(new a());
        this.O = new h(new ArrayList());
        this.f35627o.setLayoutManager(new GridLayoutManager(this, 2));
        this.O.T0(true);
        this.O.U0(false);
        this.O.V0(BaseQuickAdapter.AnimationType.ScaleIn);
        this.f35627o.setAdapter(this.O);
        this.O.c1(R.layout.view_state_empty_anchor_apply);
        this.O.c(new b());
        this.Q = new g(new ArrayList());
        this.F.setLayoutManager(new LinearLayoutManager(this, 0, false));
        this.F.setAdapter(this.Q);
        this.R = new m0(new ArrayList());
        this.mReMedal.setLayoutManager(new LinearLayoutManager(this, 0, false));
        this.mReMedal.setAdapter(this.R);
        this.R.c(new c());
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.image_family_rank /* 2131362736 */:
                Bundle bundle = new Bundle();
                bundle.putInt("family_status", 10);
                p5(FamilyActivity.class, bundle);
                break;
            case R.id.iv_avatar /* 2131362899 */:
                C5(this.M);
                break;
            case R.id.left_layout /* 2131363105 */:
                finish();
                break;
            case R.id.ll_member /* 2131363323 */:
                Bundle bundle2 = new Bundle();
                bundle2.putInt("family_id", this.L);
                bundle2.putInt("family_manager", this.K);
                bundle2.putInt("family_join", this.S);
                p5(MyFamilyUsersActivity.class, bundle2);
                break;
            case R.id.rl_edit /* 2131363817 */:
                new b.C0752b(this).Y(true).t(new e1(this, this.K, this.L, new f())).N();
                break;
            case R.id.tv_apply_join /* 2131364214 */:
                ((w0) this.f27702e).t4(this.L);
                break;
            case R.id.tv_id /* 2131364373 */:
                ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, String.valueOf(this.L)));
                v5(getString(R.string.copy_success));
                break;
            case R.id.tv_uid /* 2131364669 */:
                ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, String.valueOf(this.M)));
                v5(getString(R.string.copy_success));
                break;
        }
    }

    @Override // in.b
    public void onReceiveEvent(b0 b0Var) {
        super.onReceiveEvent(b0Var);
        int iA = b0Var.a();
        if (iA != 1031) {
            if (iA != 1049) {
                return;
            }
            ((w0) this.f27702e).J(this.L);
            return;
        }
        for (int i10 = 0; i10 < this.O.getData().size(); i10++) {
            if (this.O.getData().get(i10).getRoomId().equals(Integer.valueOf(Integer.parseInt((String) b0Var.b())))) {
                this.O.getData().remove(i10);
                this.O.notifyDataSetChanged();
                return;
            }
        }
    }

    @Override // em.v.b
    public void z4() {
        v5(getString(R.string.exit_successfully));
        finish();
    }
}
