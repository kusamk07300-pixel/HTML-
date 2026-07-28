package net.babycat.live.modules.message.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import f.n0;
import java.util.ArrayList;
import java.util.List;
import jg.f;
import mg.e;
import mg.g;
import net.babycat.live.model.BannerDataBean;
import net.babycat.live.model.UserInfoDataBean;
import net.babycat.live.modules.creator.ui.MyAnchorActivity;
import net.babycat.live.modules.discover.ui.HomeRankingActivity;
import net.babycat.live.modules.profile.ui.AgencyRegistrationActivity;
import net.babycat.live.modules.profile.ui.InviteFriendsActivity;
import net.babycat.live.modules.profile.ui.MyPayRewardsActivity;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import net.babycat.live.shell.WebViewActivity;
import org.litepal.LitePal;
import qmyy.babycat.live.R;
import xl.a;

/* JADX INFO: loaded from: classes4.dex */
public class ActivityCenterActivity extends in.b<bm.a> implements a.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35354n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RecyclerView f35355o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SmartRefreshLayout f35356p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35357q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f35358r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public wl.a f35359s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public UserInfoDataBean f35360t;

    public class a implements g {
        public a() {
        }

        @Override // mg.g
        public void onRefresh(f fVar) {
            ActivityCenterActivity.this.f35357q = 1;
            ActivityCenterActivity.this.D5();
        }
    }

    public class b implements e {
        public b() {
        }

        @Override // mg.e
        public void onLoadMore(f fVar) {
            if (ActivityCenterActivity.this.f35358r) {
                ActivityCenterActivity.this.f35357q++;
                ActivityCenterActivity.this.D5();
            } else {
                ActivityCenterActivity.this.v5("no data");
                ActivityCenterActivity.this.f35356p.s();
                ActivityCenterActivity.this.f35356p.S();
            }
        }
    }

    public class c implements q7.g {
        public c() {
        }

        @Override // q7.g
        public void a(@n0 BaseQuickAdapter<?, ?> baseQuickAdapter, @n0 View view, int i10) {
            BannerDataBean bannerDataBean = (BannerDataBean) baseQuickAdapter.getData().get(i10);
            if (bannerDataBean.getLinkType().intValue() == 1) {
                if (TextUtils.isEmpty(bannerDataBean.getPath())) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("title", bannerDataBean.getTitle());
                bundle.putString("url", bannerDataBean.getPath());
                ActivityCenterActivity.this.p5(WebViewActivity.class, bundle);
                return;
            }
            if (bannerDataBean.getLinkType().intValue() == 2) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("pos", 0);
                ActivityCenterActivity.this.p5(HomeRankingActivity.class, bundle2);
            } else {
                if (bannerDataBean.getLinkType().intValue() == 3) {
                    ActivityCenterActivity.this.o5(MyPayRewardsActivity.class);
                    return;
                }
                if (bannerDataBean.getLinkType().intValue() == 11) {
                    if (ActivityCenterActivity.this.f35360t.getIs_agency_host().intValue() == 1) {
                        ActivityCenterActivity.this.o5(MyAnchorActivity.class);
                    }
                } else if (bannerDataBean.getLinkType().intValue() == 7) {
                    ActivityCenterActivity.this.o5(AgencyRegistrationActivity.class);
                } else if (bannerDataBean.getLinkType().intValue() == 8) {
                    ActivityCenterActivity.this.o5(InviteFriendsActivity.class);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D5() {
        ((bm.a) this.f27702e).f1(this.f35357q);
    }

    @Override // xl.a.b
    public void D2(List<BannerDataBean> list, Boolean bool) {
        if (this.f35357q == 1) {
            this.f35359s.v1(list);
        } else {
            this.f35359s.w(list);
        }
        this.f35358r = bool.booleanValue();
        this.f35356p.s();
        this.f35356p.S();
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_live_monitor;
    }

    @Override // in.a
    public void g5() {
        this.f35354n = (Topbar) findViewById(R.id.common_topbar);
        this.f35355o = (RecyclerView) findViewById(R.id.recycler);
        this.f35356p = (SmartRefreshLayout) findViewById(R.id.normal_view);
    }

    @Override // in.a
    public void h5() {
        t.S0(this.f27688a, this.f35354n, getString(R.string.activity_center));
        this.f35360t = (UserInfoDataBean) LitePal.findFirst(UserInfoDataBean.class, true);
        this.f35359s = new wl.a(new ArrayList());
        this.f35355o.setLayoutManager(new LinearLayoutManager(this));
        this.f35355o.setAdapter(this.f35359s);
        this.f35359s.c1(R.layout.view_state_empty_anchor_apply);
        this.f35356p.d0(new a());
        this.f35356p.O(new b());
        D5();
        this.f35359s.c(new c());
    }

    @Override // in.b, ln.a
    public void k4() {
        super.k4();
        int i10 = this.f35357q;
        if (i10 != 1) {
            this.f35357q = i10 - 1;
        }
        this.f35356p.s();
        this.f35356p.S();
    }

    @Override // in.a
    public View k5() {
        return null;
    }
}
