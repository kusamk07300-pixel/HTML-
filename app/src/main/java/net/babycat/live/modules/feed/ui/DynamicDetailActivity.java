package net.babycat.live.modules.feed.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.f;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.gyf.immersionbar.ImmersionBar;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import f.n0;
import java.util.ArrayList;
import java.util.List;
import mg.e;
import net.babycat.live.model.DynamicCommentBean;
import net.babycat.live.model.DynamicLikeBean;
import net.babycat.live.model.DynamicListBean;
import net.babycat.live.model.UserInfoDataBean;
import net.babycat.live.modules.profile.ui.MySpaceActivity;
import net.babycat.live.platform.util.a0;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.f2;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.NineGridTestLayout;
import net.babycat.live.platform.widget.view.Topbar;
import org.litepal.LitePal;
import qmyy.babycat.live.R;
import sl.b;
import wn.d;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class DynamicDetailActivity extends in.b<ul.a> implements b.InterfaceC0665b {
    public UserInfoDataBean A;
    public f B;
    public int C;
    public DynamicListBean F;
    public String I;
    public View L;
    public View M;
    public ImageView mImageDele;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SmartRefreshLayout f35320n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Topbar f35321o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RecyclerView f35322p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public NineGridTestLayout f35323q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ImageView f35324r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f35325s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f35326t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f35327u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f35328v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f35329w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f35330x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f35331y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ImageView f35332z;
    public int D = 0;
    public List<DynamicCommentBean> E = new ArrayList();
    public int G = 1;
    public Boolean H = Boolean.FALSE;
    public boolean J = false;
    public boolean K = false;

    public class a implements e {
        public a() {
        }

        @Override // mg.e
        public void onLoadMore(jg.f fVar) {
            DynamicDetailActivity.this.G5();
        }
    }

    public class b implements q7.e {
        public b() {
        }

        @Override // q7.e
        public void a(@n0 BaseQuickAdapter baseQuickAdapter, @n0 View view, int i10) {
            DynamicCommentBean dynamicCommentBean = (DynamicCommentBean) baseQuickAdapter.getData().get(i10);
            DynamicDetailActivity.this.D = i10;
            if (view.getId() == R.id.ll_comment_like && !DynamicDetailActivity.this.K) {
                DynamicDetailActivity.this.K = true;
                if (dynamicCommentBean.getIsLike().intValue() == 1) {
                    ((ul.a) DynamicDetailActivity.this.f27702e).I1(dynamicCommentBean.getId().intValue());
                } else {
                    ((ul.a) DynamicDetailActivity.this.f27702e).Q1(dynamicCommentBean.getId().intValue());
                }
            }
        }
    }

    public class c implements cf.c {
        public c() {
        }

        @Override // cf.c
        public void onConfirm() {
            ((ul.a) DynamicDetailActivity.this.f27702e).A3(DynamicDetailActivity.this.F.getId().intValue());
        }
    }

    private void C5() {
        ((ul.a) this.f27702e).w1(this.C, this.G);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G5() {
        if (this.H.booleanValue()) {
            this.G++;
            C5();
        } else {
            this.f35320n.s();
            this.f35320n.S();
        }
    }

    private void initData() {
        d.f(this, this.f35324r, this.F.getUser().getAvatar());
        this.f35325s.setText(this.F.getUser().getNickName());
        this.f35326t.setText(this.F.getContent());
        this.f35327u.setText(f2.h(this, f2.g(this.F.getCreateTime())));
        this.f35328v.setText(String.valueOf(this.F.getLikes()));
        this.f35329w.setText(String.valueOf(this.F.getComments()));
        this.f35330x.setText(String.valueOf(this.F.getComments()));
        this.f35323q.setUrlList(this.F.getImages(), this.F.getImages());
        this.f35332z.setImageResource(this.F.getIsLike().intValue() == 1 ? R.mipmap.dy_zan : R.mipmap.dy_zan_no);
        this.B.r(R.id.ll_comment_like);
        this.B.e(new b());
    }

    @Override // sl.b.InterfaceC0665b
    public void G4() {
        int i10 = this.G;
        if (i10 != 1) {
            this.G = i10 - 1;
        }
        this.f35320n.s();
        this.f35320n.S();
    }

    public void H5() {
        this.f35331y.setText("");
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    @Override // sl.b.InterfaceC0665b
    public void I4() {
        this.K = false;
    }

    @Override // sl.b.InterfaceC0665b
    public void J4(int i10) {
        DynamicCommentBean dynamicCommentBean = this.E.get(this.D);
        if (i10 == 0) {
            dynamicCommentBean.setIsLike(1);
            dynamicCommentBean.setLikes(Integer.valueOf(dynamicCommentBean.getLikes().intValue() + 1));
        } else if (i10 == 1) {
            dynamicCommentBean.setIsLike(0);
            dynamicCommentBean.setLikes(Integer.valueOf(dynamicCommentBean.getLikes().intValue() - 1));
        }
        this.B.W0(this.D, dynamicCommentBean);
        this.K = false;
    }

    @Override // sl.b.InterfaceC0665b
    public void N2() {
        a0.a(new b0(ok.e.EVENT_DELETE_DYNAMIC, ""));
        finish();
    }

    @Override // sl.b.InterfaceC0665b
    public void X(int i10) {
        DynamicLikeBean dynamicLikeBean = new DynamicLikeBean();
        dynamicLikeBean.setType(0);
        dynamicLikeBean.setId(Integer.valueOf(this.C));
        if (i10 == 0) {
            this.F.setIsLike(1);
            this.F.setLikes(Integer.valueOf(this.F.getLikes().intValue() + 1));
            a0.a(new b0(1008, dynamicLikeBean));
        } else if (i10 == 1) {
            this.F.setIsLike(0);
            this.F.setLikes(Integer.valueOf(this.F.getLikes().intValue() - 1));
            a0.a(new b0(1009, dynamicLikeBean));
        }
        this.f35328v.setText(String.valueOf(this.F.getLikes()));
        this.f35332z.setImageResource(this.F.getIsLike().intValue() == 1 ? R.mipmap.dy_zan : R.mipmap.dy_zan_no);
        this.J = false;
    }

    @Override // sl.b.InterfaceC0665b
    public void d1(List<DynamicCommentBean> list, Boolean bool) {
        if (this.G == 1) {
            this.E.clear();
            this.E.addAll(list);
            this.B.v1(list);
        } else {
            this.B.w(list);
            this.E.addAll(list);
        }
        this.H = bool;
        this.f35320n.s();
        this.f35320n.S();
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_dynamic_detail;
    }

    @Override // sl.b.InterfaceC0665b
    public void g0() {
        this.J = false;
    }

    @Override // in.a
    public void g5() {
        this.mImageDele = (ImageView) findViewById(R.id.image_dele);
        this.f35320n = (SmartRefreshLayout) findViewById(R.id.normal_view);
        this.f35322p = (RecyclerView) findViewById(R.id.rv_list);
        this.f35321o = (Topbar) findViewById(R.id.common_topbar);
        this.f35323q = (NineGridTestLayout) findViewById(R.id.layout_nine_grid);
        this.f35324r = (ImageView) findViewById(R.id.iv_avatar);
        this.f35325s = (TextView) findViewById(R.id.tv_nickname);
        this.f35326t = (TextView) findViewById(R.id.tv_content);
        this.f35327u = (TextView) findViewById(R.id.tv_create_time);
        this.f35328v = (TextView) findViewById(R.id.tv_likes);
        this.f35329w = (TextView) findViewById(R.id.tv_comments);
        this.f35330x = (TextView) findViewById(R.id.tv_all_comments);
        this.f35331y = (TextView) findViewById(R.id.et_content);
        this.f35332z = (ImageView) findViewById(R.id.iv_like);
        this.L = findViewById(R.id.ll_like_dy);
        this.M = findViewById(R.id.tv_send);
        this.f35324r.setOnClickListener(this);
        this.mImageDele.setOnClickListener(this);
        this.L.setOnClickListener(this);
        this.M.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        ImmersionBar.with(this).statusBarColor(R.color.white).navigationBarColor(R.color.white).statusBarDarkFont(true).fitsSystemWindows(true).keyboardEnable(true).init();
        t.S0(this.f27688a, this.f35321o, getString(R.string.dynamic_details));
        this.A = (UserInfoDataBean) LitePal.findFirst(UserInfoDataBean.class, true);
        this.C = getIntent().getIntExtra("dynamic_id", 0);
        this.F = (DynamicListBean) getIntent().getSerializableExtra("dynamic_detail");
        this.B = new f(new ArrayList());
        this.f35322p.setLayoutManager(new LinearLayoutManager(this));
        this.f35322p.setAdapter(this.B);
        this.B.c1(R.layout.view_state_empty_anchor_apply);
        initData();
        C5();
        this.f35320n.j0(false);
        this.f35320n.O(new a());
        if (this.A.getIs_superadmin().intValue() == 1) {
            this.mImageDele.setVisibility(0);
        } else if (this.A.getUserId().equals(this.F.getUser().getId())) {
            this.mImageDele.setVisibility(0);
        } else {
            this.mImageDele.setVisibility(8);
        }
    }

    @Override // in.b, ln.a
    public void k4() {
        super.k4();
        int i10 = this.G;
        if (i10 != 1) {
            this.G = i10 - 1;
        }
        this.f35320n.s();
        this.f35320n.S();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.image_dele /* 2131362725 */:
                new b.C0752b(this).Y(true).N(Boolean.FALSE).r(getString(R.string.point_out), getString(R.string.delete_dynamic), getString(R.string.cancel), getString(R.string.define), new c(), null, false).N();
                break;
            case R.id.iv_avatar /* 2131362899 */:
                Bundle bundle = new Bundle();
                bundle.putInt("my_space_uid", this.F.getUser().getId().intValue());
                p5(MySpaceActivity.class, bundle);
                break;
            case R.id.ll_like_dy /* 2131363320 */:
                if (!this.J) {
                    this.J = true;
                    if (this.F.getIsLike().intValue() != 1) {
                        ((ul.a) this.f27702e).x(this.C);
                    } else {
                        ((ul.a) this.f27702e).F(this.C);
                    }
                }
                break;
            case R.id.tv_send /* 2131364588 */:
                String string = this.f35331y.getText().toString();
                this.I = string;
                if (!TextUtils.isEmpty(string.trim())) {
                    ((ul.a) this.f27702e).v1(this.C, this.I);
                } else {
                    v5(getString(R.string.please_enter_content));
                }
                break;
        }
    }

    @Override // sl.b.InterfaceC0665b
    public void t3(DynamicCommentBean dynamicCommentBean) {
        v5(getString(R.string.comment_succeeded));
        this.B.t(0, dynamicCommentBean);
        this.E.add(0, dynamicCommentBean);
        this.f35329w.setText(String.valueOf(this.F.getComments().intValue() + 1));
        this.f35330x.setText(String.valueOf(this.F.getComments().intValue() + 1));
        DynamicLikeBean dynamicLikeBean = new DynamicLikeBean();
        dynamicLikeBean.setType(0);
        dynamicLikeBean.setId(Integer.valueOf(this.C));
        a0.a(new b0(1010, dynamicLikeBean));
        H5();
        this.f35322p.scrollToPosition(0);
    }
}
