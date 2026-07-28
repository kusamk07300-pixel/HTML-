package net.babycat.live.modules.profile.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.c1;
import ao.e1;
import ao.m0;
import ao.n;
import ao.o;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.gyf.immersionbar.ImmersionBar;
import com.opensource.svgaplayer.SVGAImageView;
import com.tencent.qcloud.tuikit.tuicontact.classicui.util.ContactStartChatUtils;
import com.tencent.qgame.animplayer.AnimConfig;
import com.tencent.qgame.animplayer.AnimView;
import com.tencent.qgame.animplayer.inter.IAnimListener;
import com.yy.yyeva.view.EvaAnimViewV3;
import em.o0;
import f.n0;
import f.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jm.u2;
import net.babycat.live.model.InRoombean;
import net.babycat.live.model.InitBean;
import net.babycat.live.model.RoomListBean;
import net.babycat.live.model.SlideBean;
import net.babycat.live.model.UserHomeBean;
import net.babycat.live.model.UserInfoDataBean;
import net.babycat.live.platform.util.a0;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.b1;
import net.babycat.live.platform.util.e2;
import net.babycat.live.platform.util.n1;
import net.babycat.live.platform.util.r0;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.x1;
import net.babycat.live.platform.widget.view.ObservableScrollView;
import net.babycat.live.platform.widget.view.SpaceItemDecoration;
import net.babycat.live.platform.widget.view.TagFlowLayoutManager;
import org.litepal.LitePal;
import qmyy.babycat.live.R;
import xn.s1;
import xn.y0;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class MySpaceActivity extends in.b<u2> implements o0.b, ObservableScrollView.ScrollViewListener {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final /* synthetic */ boolean f35804o0 = false;
    public ImageView A;
    public ImageView B;
    public TextView C;
    public LinearLayout D;
    public LinearLayout E;
    public ImageView F;
    public View G;
    public ImageView H;
    public EvaAnimViewV3 I;
    public ImageView J;
    public EvaAnimViewV3 K;
    public RecyclerView L;
    public RecyclerView M;
    public RecyclerView N;
    public lm.e O;
    public Boolean P = Boolean.TRUE;
    public int Q = -1;
    public int R = 0;
    public UserInfoDataBean S;
    public Boolean T;
    public Boolean U;
    public UserHomeBean V;
    public int W;
    public x1 X;
    public m0 Y;
    public e1 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f35805a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public InitBean f35806b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public c1 f35807c0;
    public TextView cp_me;
    public TextView cp_other;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public n f35808d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public o f35809e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public View f35810f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public View f35811g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public View f35812h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public View f35813i0;
    public ImageView ic_cp_lover;
    public ImageView imageMall;
    public ImageView iv_mine_header;
    public ImageView iv_spec_cp;
    public ImageView iv_to_header;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public View f35814j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public RelativeLayout f35815k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public RecyclerView f35816l0;
    public LinearLayout lin_cp_lover;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f35817m0;
    public ImageView mImageAvatar2;
    public ImageView mImageHeart;
    public ImageView mImageHy;
    public ImageView mImageId;
    public ImageView mImageSex;
    public ImageView mIvAuth;
    public ImageView mIvFollow;
    public ImageView mIvHeaderFamily;
    public ImageView mIvIso;
    public ImageView mIvVip;
    public LinearLayout mLinFamily;
    public EvaAnimViewV3 mMp4View;
    public EvaAnimViewV3 mMp4View2;
    public RelativeLayout mRe2;
    public RecyclerView mReMedal;
    public SVGAImageView mSvgaCpFull;
    public ImageView mSvgaView2;
    public RecyclerView mTagList;
    public TextView mTvFamilyMember;
    public TextView mTvFamilyName;
    public TextView mTvHy;
    public ImageView mWealthLevel;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f35818n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f35819n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f35820o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f35821p;
    public AnimView playerView;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f35822q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RelativeLayout f35823r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ObservableScrollView f35824s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f35825t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ImageView f35826u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ImageView f35827v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ImageView f35828w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f35829x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f35830y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f35831z;

    public class a implements cf.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RoomListBean f35832a;

        public a(RoomListBean roomListBean) {
            this.f35832a = roomListBean;
        }

        @Override // cf.f
        public void a(String str) {
            this.f35832a.setPassword(str);
            MySpaceActivity mySpaceActivity = MySpaceActivity.this;
            mySpaceActivity.w5(this.f35832a, mySpaceActivity.S);
        }
    }

    public class b implements cf.g {

        public class a implements cf.c {
            public a() {
            }

            @Override // cf.c
            public void onConfirm() {
                MySpaceActivity mySpaceActivity = MySpaceActivity.this;
                mySpaceActivity.l2(mySpaceActivity.getString(R.string.loading));
                MySpaceActivity.this.I5();
            }
        }

        /* JADX INFO: renamed from: net.babycat.live.modules.profile.ui.MySpaceActivity$b$b, reason: collision with other inner class name */
        public class C0428b implements cf.c {
            public C0428b() {
            }

            @Override // cf.c
            public void onConfirm() {
                ((u2) MySpaceActivity.this.f27702e).z0(MySpaceActivity.this.Q);
            }
        }

        public class c implements cf.c {
            public c() {
            }

            @Override // cf.c
            public void onConfirm() {
                ((u2) MySpaceActivity.this.f27702e).z0(MySpaceActivity.this.Q);
            }
        }

        public b() {
        }

        @Override // cf.g
        public void a(int i10, String str) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return;
                    }
                    new b.C0752b(MySpaceActivity.this).p(MySpaceActivity.this.getString(R.string.system_prompt), MySpaceActivity.this.getString(R.string.sure_pull_black), new c()).N();
                    return;
                } else {
                    if (MySpaceActivity.this.R == 1) {
                        ((u2) MySpaceActivity.this.f27702e).p2(MySpaceActivity.this.Q);
                        return;
                    }
                    if (!MySpaceActivity.this.U.booleanValue()) {
                        new b.C0752b(MySpaceActivity.this).p(MySpaceActivity.this.getString(R.string.system_prompt), MySpaceActivity.this.getString(R.string.sure_pull_black), new C0428b()).N();
                        return;
                    }
                    if (MySpaceActivity.this.V != null) {
                        b.C0752b c0752b = new b.C0752b(MySpaceActivity.this);
                        Boolean bool = Boolean.FALSE;
                        b.C0752b c0752bH = c0752b.S(bool).I(bool).H(false);
                        MySpaceActivity mySpaceActivity = MySpaceActivity.this;
                        c0752bH.t(new s1(mySpaceActivity, mySpaceActivity.V)).N();
                        return;
                    }
                    return;
                }
            }
            if (MySpaceActivity.this.R == 1) {
                if (MySpaceActivity.this.V != null) {
                    b.C0752b c0752b2 = new b.C0752b(MySpaceActivity.this);
                    Boolean bool2 = Boolean.FALSE;
                    b.C0752b c0752bH2 = c0752b2.S(bool2).I(bool2).H(false);
                    MySpaceActivity mySpaceActivity2 = MySpaceActivity.this;
                    c0752bH2.t(new s1(mySpaceActivity2, mySpaceActivity2.V)).N();
                    return;
                }
                return;
            }
            if (MySpaceActivity.this.U.booleanValue()) {
                new b.C0752b(MySpaceActivity.this).p(MySpaceActivity.this.getString(R.string.system_prompt), MySpaceActivity.this.getString(R.string.selete_friends) + "?", new a()).N();
                return;
            }
            if (MySpaceActivity.this.V != null) {
                b.C0752b c0752b3 = new b.C0752b(MySpaceActivity.this);
                Boolean bool3 = Boolean.FALSE;
                b.C0752b c0752bH3 = c0752b3.S(bool3).I(bool3).H(false);
                MySpaceActivity mySpaceActivity3 = MySpaceActivity.this;
                c0752bH3.t(new s1(mySpaceActivity3, mySpaceActivity3.V)).N();
            }
        }
    }

    public class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            MySpaceActivity.this.f35825t.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            MySpaceActivity mySpaceActivity = MySpaceActivity.this;
            mySpaceActivity.f35819n0 = mySpaceActivity.f35825t.getHeight();
            MySpaceActivity mySpaceActivity2 = MySpaceActivity.this;
            mySpaceActivity2.f35824s.setScrollViewListener(mySpaceActivity2);
        }
    }

    public class d implements q7.g {
        public d() {
        }

        @Override // q7.g
        public void a(@n0 BaseQuickAdapter<?, ?> baseQuickAdapter, @n0 View view, int i10) {
            new b.C0752b(MySpaceActivity.this).t(new xn.d(MySpaceActivity.this, (String) baseQuickAdapter.getData().get(i10), 0)).N();
        }
    }

    public class e implements q7.g {
        public e() {
        }

        @Override // q7.g
        public void a(@n0 BaseQuickAdapter<?, ?> baseQuickAdapter, @n0 View view, int i10) {
            new b.C0752b(MySpaceActivity.this).t(new xn.d(MySpaceActivity.this, ((UserHomeBean.BadgeDTO) baseQuickAdapter.getData().get(i10)).getMedal().getFile(), 0)).N();
        }
    }

    public class f implements q7.g {

        public class a implements cf.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ImageView f35842a;

            public a(ImageView imageView) {
                this.f35842a = imageView;
            }

            @Override // cf.h
            public void onSrcViewUpdate(@n0 af.j jVar, int i10) {
                jVar.n0((ImageView) ((RelativeLayout) this.f35842a.getParent()).getChildAt(i10));
            }
        }

        public f() {
        }

        @Override // q7.g
        public void a(@n0 BaseQuickAdapter<?, ?> baseQuickAdapter, @n0 View view, int i10) {
            List<?> data = baseQuickAdapter.getData();
            ArrayList arrayList = new ArrayList();
            Iterator<?> it = data.iterator();
            while (it.hasNext()) {
                arrayList.add(((SlideBean) it.next()).getImage());
            }
            ImageView imageView = (ImageView) view.findViewById(R.id.iv_photo);
            new b.C0752b(MySpaceActivity.this).u(imageView, i10, arrayList, new a(imageView), new com.lxj.xpopup.util.e(R.mipmap.imgs_err)).N();
        }
    }

    public class g implements com.opensource.svgaplayer.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35844a;

        public g(String str) {
            this.f35844a = str;
        }

        @Override // com.opensource.svgaplayer.c
        public void a(int i10, double d10) {
        }

        @Override // com.opensource.svgaplayer.c
        public void b() {
        }

        @Override // com.opensource.svgaplayer.c
        public void c() {
            wo.b.b("svga播放礼物---播放结束", new Object[0]);
            SVGAImageView sVGAImageView = MySpaceActivity.this.mSvgaCpFull;
            if (sVGAImageView != null) {
                if (sVGAImageView.q()) {
                    MySpaceActivity.this.mSvgaCpFull.F();
                }
                MySpaceActivity.this.mSvgaCpFull.setVisibility(8);
            }
            if (TextUtils.isEmpty(this.f35844a)) {
                return;
            }
            MySpaceActivity mySpaceActivity = MySpaceActivity.this;
            wn.d.c(mySpaceActivity, this.f35844a, mySpaceActivity.imageMall);
            MySpaceActivity.this.imageMall.setVisibility(0);
        }

        @Override // com.opensource.svgaplayer.c
        public void onPause() {
        }
    }

    public class h implements IAnimListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35846a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h hVar;
                MySpaceActivity mySpaceActivity;
                ImageView imageView;
                AnimView animView = MySpaceActivity.this.playerView;
                if (animView != null) {
                    animView.stopPlay();
                }
                MySpaceActivity.this.playerView.setVisibility(8);
                if (TextUtils.isEmpty(h.this.f35846a) || (imageView = (mySpaceActivity = MySpaceActivity.this).imageMall) == null) {
                    return;
                }
                wn.d.c(mySpaceActivity, hVar.f35846a, imageView);
                MySpaceActivity.this.imageMall.setVisibility(0);
            }
        }

        public h(String str) {
            this.f35846a = str;
        }

        @Override // com.tencent.qgame.animplayer.inter.IAnimListener
        public void onFailed(int i10, @p0 String str) {
            wo.b.b("vap播放礼物---结束加载失败" + str, new Object[0]);
        }

        @Override // com.tencent.qgame.animplayer.inter.IAnimListener
        public void onVideoComplete() {
            new Handler(Looper.getMainLooper()).post(new a());
        }

        @Override // com.tencent.qgame.animplayer.inter.IAnimListener
        public boolean onVideoConfigReady(@n0 AnimConfig animConfig) {
            return true;
        }

        @Override // com.tencent.qgame.animplayer.inter.IAnimListener
        public void onVideoDestroy() {
        }

        @Override // com.tencent.qgame.animplayer.inter.IAnimListener
        public void onVideoRender(int i10, @p0 AnimConfig animConfig) {
        }

        @Override // com.tencent.qgame.animplayer.inter.IAnimListener
        public void onVideoStart() {
        }
    }

    public class i implements com.opensource.svgaplayer.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35849a;

        public class a implements Animation.AnimationListener {
            public a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                i iVar;
                MySpaceActivity mySpaceActivity;
                ImageView imageView;
                SVGAImageView sVGAImageView = MySpaceActivity.this.mSvgaCpFull;
                if (sVGAImageView != null) {
                    if (sVGAImageView.q()) {
                        MySpaceActivity.this.mSvgaCpFull.F();
                        MySpaceActivity.this.mSvgaCpFull.m();
                    }
                    MySpaceActivity.this.mSvgaCpFull.setVisibility(8);
                }
                if (TextUtils.isEmpty(i.this.f35849a) || (imageView = (mySpaceActivity = MySpaceActivity.this).imageMall) == null) {
                    return;
                }
                wn.d.c(mySpaceActivity, iVar.f35849a, imageView);
                MySpaceActivity.this.imageMall.setVisibility(0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        public i(String str) {
            this.f35849a = str;
        }

        @Override // com.opensource.svgaplayer.c
        public void a(int i10, double d10) {
        }

        @Override // com.opensource.svgaplayer.c
        public void b() {
        }

        @Override // com.opensource.svgaplayer.c
        public void c() {
            wo.b.b("svga播放礼物---播放结束", new Object[0]);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(1000L);
            alphaAnimation.setFillAfter(true);
            int iM = t.M(MySpaceActivity.this);
            int iL = t.L(MySpaceActivity.this);
            MySpaceActivity.this.imageMall.getLocationOnScreen(new int[2]);
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, (r7[0] + (MySpaceActivity.this.imageMall.getWidth() / 2)) / iM, 1, (r7[1] + (MySpaceActivity.this.imageMall.getHeight() / 2)) / iL);
            scaleAnimation.setDuration(800L);
            scaleAnimation.setFillAfter(true);
            scaleAnimation.setAnimationListener(new a());
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(scaleAnimation);
            MySpaceActivity.this.mSvgaCpFull.startAnimation(animationSet);
        }

        @Override // com.opensource.svgaplayer.c
        public void onPause() {
        }
    }

    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(MySpaceActivity.this, (Class<?>) MyShopActivity.class);
            intent.putExtra("select_last_tab", true);
            MySpaceActivity.this.startActivity(intent);
        }
    }

    public class k implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ UserHomeBean f35853a;

        public k(UserHomeBean userHomeBean) {
            this.f35853a = userHomeBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Bundle bundle = new Bundle();
            bundle.putString("user_signature", this.f35853a.getSignature() != null ? this.f35853a.getSignature() : "");
            MySpaceActivity.this.p5(MyProfileSignActivity.class, bundle);
        }
    }

    public class l implements cf.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RoomListBean f35855a;

        public l(RoomListBean roomListBean) {
            this.f35855a = roomListBean;
        }

        @Override // cf.f
        public void a(String str) {
            this.f35855a.setPassword(str);
            MySpaceActivity.this.q5(this.f35855a);
        }
    }

    public MySpaceActivity() {
        Boolean bool = Boolean.FALSE;
        this.T = bool;
        this.U = bool;
        this.W = -1;
        this.f35805a0 = 0;
        this.f35817m0 = 0;
    }

    private void K5() {
        if (this.f35817m0 <= t.i(100.0f)) {
            ImmersionBar.with(this).fitsSystemWindows(false).transparentStatusBar().statusBarDarkFont(true).init();
            this.f35815k0.setBackgroundColor(Color.parseColor("#00000000"));
        } else {
            ImmersionBar.with(this).fitsSystemWindows(false).statusBarDarkFont(true).statusBarColor(R.color.white).init();
            this.f35815k0.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
    }

    private void L5() {
        ((u2) this.f27702e).t(this.Q);
        ((u2) this.f27702e).J1(String.valueOf(this.Q));
    }

    @Override // em.o0.b
    public void E0() {
        k3();
        v5(getString(R.string.approval_friends));
    }

    @Override // em.o0.b
    public void G1() {
        k3();
        v5(getString(R.string.del_success));
        this.U = Boolean.FALSE;
        M5();
    }

    public final void H5() {
        l2(getString(R.string.loading));
        ((u2) this.f27702e).K3(String.valueOf(this.Q));
    }

    public final void I5() {
        ((u2) this.f27702e).I(String.valueOf(this.Q));
    }

    public final void J5() {
        this.f35825t.getViewTreeObserver().addOnGlobalLayoutListener(new c());
    }

    public final void M5() {
        try {
            this.mImageHy.setImageResource(this.U.booleanValue() ? R.mipmap.image_hpme_chcr : R.mipmap.image_hy);
            this.mTvHy.setText(this.U.booleanValue() ? getString(R.string.chat) : getString(R.string.add_friends));
        } catch (NullPointerException unused) {
        }
    }

    @Override // em.o0.b
    public void V1(UserHomeBean userHomeBean) {
        bg.b bVarV;
        this.V = userHomeBean;
        this.Z.v1(userHomeBean.getUserTags());
        String url = userHomeBean.getHomeDress().getUrl();
        String icon = userHomeBean.getHomeDress().getIcon();
        this.W = userHomeBean.getFamilyStatus().intValue();
        if (userHomeBean.getIsrecord().intValue() == 1) {
            if (userHomeBean.getCp().getCp().size() > 0 && userHomeBean.getCp().getCp().get(0).getLevel().getLevel().intValue() > 1) {
                e2.a(this.mSvgaCpFull, userHomeBean.getCp().getCp().get(0).getLevel().getLevel().intValue(), userHomeBean.getAvatar(), userHomeBean.getCp().getCp().get(0).getUserInfo().getAvatar(), new g(icon));
                this.mSvgaCpFull.setVisibility(0);
            } else if (!TextUtils.isEmpty(url)) {
                if (userHomeBean.getHomeDress().getFileType().equals("vap")) {
                    e2.q(this, this.playerView, url);
                    this.playerView.setVisibility(0);
                    this.playerView.setAnimListener(new h(icon));
                } else if (userHomeBean.getHomeDress().getFileType().equals("svga")) {
                    e2.f(this.mSvgaCpFull, 1, url, new i(icon));
                    this.mSvgaCpFull.setVisibility(0);
                }
            }
        } else if (!TextUtils.isEmpty(icon)) {
            wn.d.c(this, icon, this.imageMall);
            this.imageMall.setVisibility(0);
        }
        if (!TextUtils.isEmpty(userHomeBean.getCountryIso()) && (bVarV = t.v(this, userHomeBean.getCountryIso())) != null) {
            wn.d.c(this, Integer.valueOf(com.rilixtech.widget.countrycodepicker.c.h(bVarV)), this.mIvIso);
            this.mIvIso.setVisibility(0);
        }
        if (userHomeBean.getCp() == null || userHomeBean.getCp().getCp().size() <= 0) {
            this.iv_spec_cp.setOnClickListener(new j());
        } else {
            this.mRe2.setVisibility(0);
            wn.d.c(this, userHomeBean.getCp().getCp().get(0).getCpFile(), this.mImageHeart);
            this.mImageHeart.setVisibility(0);
            wn.d.f(this, this.mImageAvatar2, userHomeBean.getCp().getCp().get(0).getUserInfo().getAvatar());
            String avatarFrame = userHomeBean.getCp().getCp().get(0).getUserInfo().getAvatarFrame();
            if (TextUtils.isEmpty(avatarFrame)) {
                this.mSvgaView2.setVisibility(8);
                this.mMp4View2.setVisibility(8);
            } else if (avatarFrame.substring(avatarFrame.length() - 3).equals("mp4")) {
                this.mSvgaView2.setVisibility(8);
                this.mMp4View2.setVisibility(0);
                e2.p(this, this.mMp4View2, avatarFrame);
            } else {
                this.mSvgaView2.setVisibility(0);
                this.mMp4View2.setVisibility(8);
                wn.d.c(this, avatarFrame, this.mSvgaView2);
            }
            if (TextUtils.isEmpty(avatarFrame)) {
                this.J.setVisibility(8);
                this.K.setVisibility(8);
            } else if (avatarFrame.substring(avatarFrame.length() - 3).equals("mp4")) {
                this.J.setVisibility(8);
                this.K.setVisibility(0);
                e2.p(this, this.K, avatarFrame);
            } else {
                this.J.setVisibility(0);
                this.K.setVisibility(8);
                wn.d.c(this, avatarFrame, this.J);
            }
            wn.d.c(this, userHomeBean.getCp().getCp().get(0).getCpFile(), this.ic_cp_lover);
            wn.d.g(this, userHomeBean.getCp().getCp().get(0).getUserInfo().getAvatar(), this.iv_to_header);
            this.cp_other.setText(userHomeBean.getCp().getCp().get(0).getUserInfo().getNickname());
        }
        this.f35818n.setText(b1.a(userHomeBean.getFollowTotal().intValue()));
        this.f35820o.setText(b1.a(userHomeBean.getFansTotal().intValue()));
        this.f35821p.setText(b1.a(userHomeBean.getTickettotal()));
        this.f35822q.setText(b1.a(userHomeBean.getConsumption()));
        this.T = Boolean.valueOf(userHomeBean.getIsAttention().intValue() == 1);
        this.U = Boolean.valueOf(userHomeBean.getIsFriends().intValue() == 1);
        M5();
        this.C.setText(getString(this.T.booleanValue() ? R.string.followed : R.string.follow));
        this.mIvFollow.setImageResource(userHomeBean.getIsAttention().intValue() == 1 ? R.mipmap.image_ygz : R.mipmap.iamge_add);
        this.Y.v1(userHomeBean.getBadgeList());
        wn.d.f(this, this.f35828w, userHomeBean.getAvatar());
        this.A.setImageResource(n1.b(userHomeBean.getLevelIcon()));
        this.B.setImageResource(n1.b(userHomeBean.getAnchorLevelIcon()));
        this.f35829x.setText(userHomeBean.getNickname());
        this.cp_me.setText(userHomeBean.getNickname());
        String strValueOf = TextUtils.isEmpty(userHomeBean.getGoodnum()) ? String.valueOf(userHomeBean.getUserId()) : userHomeBean.getGoodnum();
        this.mWealthLevel.setImageResource(r0.j(userHomeBean.getWealthLevel().intValue()));
        if (userHomeBean.getAuthType().intValue() > 0) {
            this.mIvAuth.setVisibility(0);
            this.mIvAuth.setImageResource(userHomeBean.getAuthType().intValue() == 1 ? R.mipmap.official_auth : R.mipmap.tradeunion_auth2);
        } else {
            this.mIvAuth.setVisibility(8);
        }
        if (TextUtils.isEmpty(userHomeBean.getColorIdIcon())) {
            this.f35830y.setText("ID:" + strValueOf);
            this.mImageId.setVisibility(8);
        } else {
            this.f35830y.setText("ID:" + strValueOf);
            this.mImageId.setVisibility(8);
            this.f35830y.setTextColor(Color.parseColor(userHomeBean.getColorId()));
            wn.d.c(this, userHomeBean.getColorIdIcon(), this.mImageId);
        }
        this.f35831z.setText(userHomeBean.getSignature().length() > 0 ? userHomeBean.getSignature() : getString(R.string.signature_reminder));
        if (this.P.booleanValue()) {
            this.f35831z.setOnClickListener(new k(userHomeBean));
        }
        this.f35809e0.v1(userHomeBean.getCars());
        this.f35808d0.v1(userHomeBean.getBadge());
        this.f35807c0.v1(userHomeBean.getGifts());
        if (userHomeBean.getFansTotal().intValue() < 1000) {
            userHomeBean.getFansTotal();
        } else {
            b1.a(userHomeBean.getFansTotal().intValue());
        }
        if (TextUtils.isEmpty(userHomeBean.getAvatarFrame())) {
            this.F.setVisibility(8);
            this.mMp4View.setVisibility(8);
        } else if (userHomeBean.getAvatarFrame().substring(userHomeBean.getAvatarFrame().length() - 3).equals("mp4")) {
            this.mMp4View.setVisibility(0);
            this.F.setVisibility(8);
            e2.p(this, this.mMp4View, userHomeBean.getAvatarFrame());
        } else {
            this.F.setVisibility(0);
            this.mMp4View.setVisibility(8);
            wn.d.c(this, userHomeBean.getAvatarFrame(), this.F);
        }
        if (TextUtils.isEmpty(userHomeBean.getAvatarFrame())) {
            this.H.setVisibility(8);
            this.I.setVisibility(8);
        } else if (userHomeBean.getAvatarFrame().substring(userHomeBean.getAvatarFrame().length() - 3).equals("mp4")) {
            this.H.setVisibility(8);
            this.I.setVisibility(0);
            e2.p(this, this.I, userHomeBean.getAvatarFrame());
        } else {
            this.H.setVisibility(0);
            this.I.setVisibility(8);
            wn.d.c(this, userHomeBean.getAvatarFrame(), this.H);
        }
        wn.d.g(this, userHomeBean.getAvatar(), this.iv_mine_header);
        if (!TextUtils.isEmpty(userHomeBean.getJctx())) {
            a0.a(new b0(1019, userHomeBean.getJctx()));
        }
        if (userHomeBean.getOnlineRoomid().intValue() != 0) {
            this.E.setVisibility(0);
        }
        if (userHomeBean.getVipLevel().intValue() == 0) {
            this.mIvVip.setVisibility(8);
        } else {
            this.mIvVip.setImageResource(r0.h(userHomeBean.getVipLevel().intValue()));
            this.mIvVip.setVisibility(0);
        }
        if (userHomeBean.getSex().intValue() == 1) {
            this.mImageSex.setImageResource(R.mipmap.iocn_nan);
        } else {
            this.mImageSex.setImageResource(R.mipmap.icon_nv);
        }
        if (!TextUtils.isEmpty(userHomeBean.getFamilyInfo().getFamilyAvatar())) {
            wn.d.n(this, this.mIvHeaderFamily, userHomeBean.getFamilyInfo().getFamilyAvatar(), 10);
        }
        this.f35805a0 = userHomeBean.getFamilyInfo().getFamilyId().intValue();
        if (TextUtils.isEmpty(userHomeBean.getFamilyInfo().getFamilyName())) {
            this.mTvFamilyName.setText(getString(R.string.no_family));
        } else {
            this.mTvFamilyName.setText(userHomeBean.getFamilyInfo().getFamilyName());
        }
        this.mTvFamilyMember.setText(userHomeBean.getFamilyInfo().getFamilyMemberJoinCnt() + "/" + userHomeBean.getFamilyInfo().getFamilyMemberCnt());
    }

    @Override // em.o0.b
    public void a(InRoombean inRoombean) {
        RoomListBean roomListBean = new RoomListBean();
        roomListBean.setRoomId(this.V.getOnlineRoomid());
        roomListBean.setMasterUid(this.V.getUserId());
        roomListBean.setCover(this.V.getAvatar());
        roomListBean.setChatroomId(this.V.getOnlineChatRoomid());
        if (TextUtils.isEmpty(inRoombean.getIsLock())) {
            if (this.V.getOnlineRoomLivetype().intValue() == 3) {
                q5(roomListBean);
                return;
            } else {
                w5(roomListBean, this.S);
                return;
            }
        }
        if (this.V.getOnlineRoomLivetype().intValue() != 3) {
            if (this.S.getIs_superadmin().intValue() == 1) {
                w5(roomListBean, this.S);
                return;
            } else {
                new b.C0752b(this).I(Boolean.TRUE).B(getString(R.string.new_room_password), "", "", getString(R.string.input_room_password), new a(roomListBean), null, R.layout._xpopup_center_impl_confirm).N();
                return;
            }
        }
        if (this.X.l("myRoomId").equals(String.valueOf(roomListBean.getRoomId()))) {
            q5(roomListBean);
        } else if (this.S.getIs_superadmin().intValue() == 1) {
            q5(roomListBean);
        } else {
            new b.C0752b(this).I(Boolean.TRUE).B(getString(R.string.new_room_password), "", "", getString(R.string.input_room_password), new l(roomListBean), null, R.layout._xpopup_center_impl_confirm).N();
        }
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_my_space;
    }

    @Override // in.a
    public void g5() {
        this.mIvIso = (ImageView) findViewById(R.id.iv_iso);
        this.mImageHy = (ImageView) findViewById(R.id.image_hy);
        this.mIvFollow = (ImageView) findViewById(R.id.iv_follow);
        this.f35815k0 = (RelativeLayout) findViewById(R.id.rl_top_nav);
        this.f35816l0 = (RecyclerView) findViewById(R.id.photo_list);
        this.f35818n = (TextView) findViewById(R.id.tv_follow_num);
        this.f35820o = (TextView) findViewById(R.id.tv_fans_num);
        this.f35821p = (TextView) findViewById(R.id.tv_received_num);
        this.f35822q = (TextView) findViewById(R.id.tv_sent_num);
        this.mImageAvatar2 = (ImageView) findViewById(R.id.image_avatar2);
        this.mSvgaView2 = (ImageView) findViewById(R.id.svga_view2);
        this.mRe2 = (RelativeLayout) findViewById(R.id.re_2);
        this.mImageHeart = (ImageView) findViewById(R.id.image_heart);
        this.mTvHy = (TextView) findViewById(R.id.tv_hy);
        this.cp_me = (TextView) findViewById(R.id.cp_me);
        this.cp_other = (TextView) findViewById(R.id.cp_other);
        this.mIvVip = (ImageView) findViewById(R.id.iv_vip);
        this.mImageSex = (ImageView) findViewById(R.id.image_sex);
        this.mMp4View = (EvaAnimViewV3) findViewById(R.id.mp4_view);
        this.mMp4View2 = (EvaAnimViewV3) findViewById(R.id.mp4_view2);
        this.f35823r = (RelativeLayout) findViewById(R.id.rl_top);
        this.f35824s = (ObservableScrollView) findViewById(R.id.osc_main);
        this.f35825t = (ImageView) findViewById(R.id.iv_top);
        this.f35826u = (ImageView) findViewById(R.id.iv_edit);
        this.f35827v = (ImageView) findViewById(R.id.iv_back);
        this.f35828w = (ImageView) findViewById(R.id.iv_header);
        this.f35829x = (TextView) findViewById(R.id.tv_nickname);
        this.f35830y = (TextView) findViewById(R.id.tv_user_id);
        this.f35831z = (TextView) findViewById(R.id.tv_sign);
        this.A = (ImageView) findViewById(R.id.iv_level);
        this.B = (ImageView) findViewById(R.id.iv_level_author);
        this.C = (TextView) findViewById(R.id.tv_follow);
        this.D = (LinearLayout) findViewById(R.id.ll_bottom);
        this.E = (LinearLayout) findViewById(R.id.lin_join);
        this.F = (ImageView) findViewById(R.id.svga_view);
        this.G = findViewById(R.id.view_bj);
        this.mImageId = (ImageView) findViewById(R.id.image_id);
        this.mReMedal = (RecyclerView) findViewById(R.id.re_medal);
        this.mTagList = (RecyclerView) findViewById(R.id.rv_tag_list);
        this.mIvAuth = (ImageView) findViewById(R.id.iv_auth);
        this.mWealthLevel = (ImageView) findViewById(R.id.wealth_level);
        this.H = (ImageView) findViewById(R.id.svga_view_mine);
        this.I = (EvaAnimViewV3) findViewById(R.id.mp4_view_mine);
        this.J = (ImageView) findViewById(R.id.svga_view_to);
        this.K = (EvaAnimViewV3) findViewById(R.id.mp4_view_to);
        this.mIvHeaderFamily = (ImageView) findViewById(R.id.iv_header_family);
        this.mTvFamilyName = (TextView) findViewById(R.id.tv_family_name);
        this.mLinFamily = (LinearLayout) findViewById(R.id.lin_family);
        this.mTvFamilyMember = (TextView) findViewById(R.id.tv_family_member);
        this.iv_mine_header = (ImageView) findViewById(R.id.iv_mine_header);
        this.iv_to_header = (ImageView) findViewById(R.id.iv_to_header);
        this.ic_cp_lover = (ImageView) findViewById(R.id.ic_cp_lover);
        this.lin_cp_lover = (LinearLayout) findViewById(R.id.lin_cp_lover);
        this.iv_spec_cp = (ImageView) findViewById(R.id.iv_spec_cp);
        this.mSvgaCpFull = (SVGAImageView) findViewById(R.id.svga_cp);
        this.playerView = (AnimView) findViewById(R.id.playerView);
        this.imageMall = (ImageView) findViewById(R.id.image_mall);
        this.L = (RecyclerView) findViewById(R.id.rv_list_mount);
        this.M = (RecyclerView) findViewById(R.id.rv_list_medal);
        this.N = (RecyclerView) findViewById(R.id.rv_list_gift);
        this.f35810f0 = findViewById(R.id.rl_back);
        this.f35811g0 = findViewById(R.id.rl_edit);
        this.f35812h0 = findViewById(R.id.iv_more);
        this.f35813i0 = findViewById(R.id.re_add);
        this.f35814j0 = findViewById(R.id.ll_follow);
        this.f35830y.setOnClickListener(this);
        this.E.setOnClickListener(this);
        this.mLinFamily.setOnClickListener(this);
        this.imageMall.setOnClickListener(this);
        this.f35810f0.setOnClickListener(this);
        this.f35811g0.setOnClickListener(this);
        this.f35812h0.setOnClickListener(this);
        this.f35813i0.setOnClickListener(this);
        this.f35814j0.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        this.Q = getIntent().getIntExtra("my_space_uid", -1);
        x1 x1Var = new x1(this);
        this.X = x1Var;
        x1Var.q("main_taskId", getTaskId());
        this.f35806b0 = (InitBean) LitePal.findFirst(InitBean.class, true);
        UserInfoDataBean userInfoDataBean = (UserInfoDataBean) LitePal.findFirst(UserInfoDataBean.class, true);
        this.S = userInfoDataBean;
        this.R = userInfoDataBean.getIs_superadmin().intValue();
        m5(false);
        if (this.S.getUserId().intValue() == this.Q) {
            this.P = Boolean.TRUE;
            this.D.setVisibility(8);
            this.E.setVisibility(8);
            this.G.setVisibility(8);
        } else {
            this.P = Boolean.FALSE;
            this.D.setVisibility(0);
            this.G.setVisibility(0);
        }
        this.f35826u.setImageResource(this.P.booleanValue() ? R.mipmap.my_edit : R.mipmap.icon_more_black);
        J5();
        K5();
        wn.d.n(this, this.iv_spec_cp, Integer.valueOf(R.mipmap.my_spec_cp), 20);
        this.Y = new m0(new ArrayList());
        this.mReMedal.setLayoutManager(new LinearLayoutManager(this, 0, false));
        this.mReMedal.setAdapter(this.Y);
        this.Z = new e1(new ArrayList());
        this.mTagList.addItemDecoration(new SpaceItemDecoration(10));
        this.mTagList.setLayoutManager(new TagFlowLayoutManager());
        this.mTagList.setAdapter(this.Z);
        L5();
        this.Y.c(new d());
        this.f35809e0 = new o(new ArrayList());
        this.L.setLayoutManager(new LinearLayoutManager(this, 0, false));
        this.L.setAdapter(this.f35809e0);
        this.f35809e0.c1(R.layout.view_state_empty_cars);
        this.f35808d0 = new n(new ArrayList());
        this.M.setLayoutManager(new LinearLayoutManager(this, 0, false));
        this.M.setAdapter(this.f35808d0);
        this.f35808d0.c1(R.layout.view_state_empty_badge);
        this.f35808d0.c(new e());
        this.f35807c0 = new c1(new ArrayList());
        this.N.setLayoutManager(new LinearLayoutManager(this, 0, false));
        this.N.setAdapter(this.f35807c0);
        this.f35807c0.c1(R.layout.view_state_empty_gift);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(0);
        this.f35816l0.setLayoutManager(linearLayoutManager);
        lm.e eVar = new lm.e(new ArrayList());
        this.O = eVar;
        this.f35816l0.setAdapter(eVar);
        this.O.c1(R.layout.view_state_empty_photo);
        this.O.c(new f());
    }

    @Override // em.o0.b
    public void j() {
        this.C.setText(getString(R.string.followed));
        this.T = Boolean.TRUE;
        this.mIvFollow.setImageResource(R.mipmap.image_ygz);
        k3();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // em.o0.b
    public void m() {
        this.C.setText(getString(R.string.follow));
        this.T = Boolean.FALSE;
        this.mIvFollow.setImageResource(R.mipmap.iamge_add);
        k3();
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.image_mall /* 2131362765 */:
                new b.C0752b(this).N(Boolean.FALSE).Y(true).t(new y0(this, this.V.getHomeDress())).N();
                break;
            case R.id.iv_more /* 2131363008 */:
                if (t.t0()) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("id", this.Q);
                    p5(MyGiftWallActivity.class, bundle);
                }
                break;
            case R.id.lin_family /* 2131363148 */:
                if (t.t0() && this.f35805a0 > 0) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("family_id", this.f35805a0);
                    p5(MyFamilyInfoActivity.class, bundle2);
                } else {
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("family_status", this.W);
                    p5(FamilyActivity.class, bundle3);
                }
                break;
            case R.id.lin_join /* 2131363167 */:
                if (t.t0() && this.V != null) {
                    if (this.X.h("voice_taskId") == 0) {
                        ((u2) this.f27702e).b(this.V.getOnlineRoomid().intValue());
                    } else {
                        this.X.q("main_taskId", 0);
                        finish();
                    }
                    break;
                }
                break;
            case R.id.ll_follow /* 2131363310 */:
                l2(getString(R.string.loading));
                if (!this.T.booleanValue()) {
                    ((u2) this.f27702e).i(this.Q);
                } else {
                    ((u2) this.f27702e).h(this.Q);
                }
                break;
            case R.id.re_add /* 2131363676 */:
                if (t.t0() && this.V != null) {
                    if (!this.U.booleanValue()) {
                        H5();
                    } else {
                        ContactStartChatUtils.startChatActivity(String.valueOf(this.Q), 1, this.V.getNickname(), "", this.f35806b0.getSetting().getVip_chat_level(), this.S.getVip_level().intValue());
                    }
                    break;
                }
                break;
            case R.id.rl_back /* 2131363809 */:
                finish();
                break;
            case R.id.rl_edit /* 2131363817 */:
                if (this.S.getUserId().intValue() != this.Q) {
                    new b.C0752b(this).f(getString(R.string.select_action), this.R == 1 ? new String[]{getString(R.string.tip_off), getString(R.string.ban)} : this.U.booleanValue() ? new String[]{getString(R.string.selete_friends), getString(R.string.tip_off), getString(R.string.pull_black)} : new String[]{getString(R.string.tip_off), getString(R.string.pull_black)}, new b()).N();
                } else {
                    o5(MyProfileActivity.class);
                }
                break;
            case R.id.tv_user_id /* 2131364676 */:
                ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, String.valueOf(this.Q)));
                v5(getString(R.string.copy_success));
                break;
        }
    }

    @Override // in.b, in.a, androidx.appcompat.app.e, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        AnimView animView = this.playerView;
        if (animView != null) {
            animView.stopPlay();
        }
        SVGAImageView sVGAImageView = this.mSvgaCpFull;
        if (sVGAImageView != null) {
            if (sVGAImageView.q()) {
                this.mSvgaCpFull.F();
            }
            this.mSvgaCpFull.m();
        }
        super.onDestroy();
        this.X.q("main_taskId", 0);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || keyEvent.getAction() != 1) {
            return super.onKeyUp(i10, keyEvent);
        }
        this.X.q("main_taskId", 0);
        finish();
        return true;
    }

    @Override // in.b
    public void onReceiveEvent(b0 b0Var) {
        super.onReceiveEvent(b0Var);
        if (this.P.booleanValue()) {
            int iA = b0Var.a();
            if (iA == 1012) {
                this.f35829x.setText((String) b0Var.b());
                return;
            }
            if (iA == 1013) {
                this.f35831z.setText((String) b0Var.b());
            } else if (iA == 1017) {
                wn.d.f(this, this.f35828w, (String) b0Var.b());
            } else {
                if (iA != 1018) {
                    return;
                }
                ((u2) this.f27702e).t(this.Q);
            }
        }
    }

    @Override // net.babycat.live.platform.widget.view.ObservableScrollView.ScrollViewListener
    public void onScrollChanged(ObservableScrollView observableScrollView, int i10, int i11, int i12, int i13) {
        this.f35817m0 = i11;
        K5();
    }

    @Override // em.o0.b
    public void q0(List<SlideBean> list) {
        this.O.v1(list);
    }
}
