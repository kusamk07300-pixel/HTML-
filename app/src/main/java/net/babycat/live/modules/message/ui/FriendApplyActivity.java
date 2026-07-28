package net.babycat.live.modules.message.ui;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.e;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import f.n0;
import java.util.ArrayList;
import java.util.List;
import jg.f;
import net.babycat.live.model.FriendApplyBean;
import net.babycat.live.modules.profile.ui.MySpaceActivity;
import net.babycat.live.platform.util.a0;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import q7.g;
import qmyy.babycat.live.R;
import xl.c;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class FriendApplyActivity extends in.b<e> implements c.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<FriendApplyBean> f35372n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public wl.c f35373o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Topbar f35374p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SmartRefreshLayout f35375q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f35376r;

    public class a implements q7.e {

        /* JADX INFO: renamed from: net.babycat.live.modules.message.ui.FriendApplyActivity$a$a, reason: collision with other inner class name */
        public class C0424a implements cf.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ FriendApplyBean f35378a;

            public C0424a(FriendApplyBean friendApplyBean) {
                this.f35378a = friendApplyBean;
            }

            @Override // cf.c
            public void onConfirm() {
                FriendApplyActivity friendApplyActivity = FriendApplyActivity.this;
                friendApplyActivity.l2(friendApplyActivity.getString(R.string.loading));
                ((e) FriendApplyActivity.this.f27702e).r4(String.valueOf(this.f35378a.getUid()));
            }
        }

        public a() {
        }

        @Override // q7.e
        public void a(@n0 BaseQuickAdapter baseQuickAdapter, @n0 View view, int i10) {
            FriendApplyBean friendApplyBean = (FriendApplyBean) baseQuickAdapter.getData().get(i10);
            if (view.getId() == R.id.tv_refuse) {
                new b.C0752b(FriendApplyActivity.this).Y(true).p(FriendApplyActivity.this.getString(R.string.system_prompt), FriendApplyActivity.this.getString(R.string.refuse_with), new C0424a(friendApplyBean)).N();
            } else if (view.getId() == R.id.tv_agree) {
                FriendApplyActivity friendApplyActivity = FriendApplyActivity.this;
                friendApplyActivity.l2(friendApplyActivity.getString(R.string.loading));
                ((e) FriendApplyActivity.this.f27702e).V4(String.valueOf(friendApplyBean.getUid()));
            }
        }
    }

    public class b implements g {
        public b() {
        }

        @Override // q7.g
        public void a(@n0 BaseQuickAdapter<?, ?> baseQuickAdapter, @n0 View view, int i10) {
            FriendApplyBean friendApplyBean = (FriendApplyBean) baseQuickAdapter.getData().get(i10);
            Bundle bundle = new Bundle();
            bundle.putInt("my_space_uid", friendApplyBean.getUid());
            FriendApplyActivity.this.p5(MySpaceActivity.class, bundle);
        }
    }

    public class c implements mg.g {
        public c() {
        }

        @Override // mg.g
        public void onRefresh(@n0 f fVar) {
            ((e) FriendApplyActivity.this.f27702e).A2();
        }
    }

    public final void A5(int i10) {
        int i11 = 0;
        while (true) {
            if (i11 >= this.f35373o.getData().size()) {
                break;
            }
            if (this.f35373o.getData().get(i11).getUid() == i10) {
                this.f35373o.getData().remove(i11);
                this.f35373o.notifyItemRemoved(i11);
                wl.c cVar = this.f35373o;
                cVar.notifyItemRangeChanged(i11, cVar.getData().size() - i11);
                break;
            }
            i11++;
        }
        a0.a(new b0(ok.e.EVENT_UPDATE_FRIENDS, Integer.valueOf(this.f35373o.getData().size())));
    }

    @Override // xl.c.b
    public void L1(List<FriendApplyBean> list, boolean z10) {
        this.f35373o.v1(list);
        this.f35375q.s();
        a0.a(new b0(ok.e.EVENT_UPDATE_FRIENDS, Integer.valueOf(list == null ? 0 : list.size())));
    }

    @Override // xl.c.b
    public void d2(int i10) {
        k3();
        v5(getString(R.string.refuse_with));
        A5(i10);
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_friend_apply;
    }

    @Override // in.a
    public void g5() {
        this.f35374p = (Topbar) findViewById(R.id.toolbar).findViewById(R.id.common_topbar);
        this.f35375q = (SmartRefreshLayout) findViewById(R.id.normal_view);
        this.f35376r = (RecyclerView) findViewById(R.id.recycler);
    }

    @Override // in.a
    public void h5() {
        g5();
        t.S0(this, this.f35374p, getString(R.string.friend_application));
        this.f35375q.N(false);
        this.f35376r.setLayoutManager(new LinearLayoutManager(this));
        wl.c cVar = new wl.c(this.f35372n);
        this.f35373o = cVar;
        this.f35376r.setAdapter(cVar);
        this.f35373o.c1(R.layout.view_state_empty_anchor_apply);
        this.f35373o.r(R.id.tv_refuse, R.id.tv_agree);
        this.f35373o.e(new a());
        this.f35373o.c(new b());
        this.f35375q.d0(new c());
        ((e) this.f27702e).A2();
    }

    @Override // in.b, ln.a
    public void k4() {
        super.k4();
        this.f35375q.s();
        k3();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // xl.c.b
    public void m3(int i10) {
        k3();
        v5(getString(R.string.agree_with));
        A5(i10);
    }

    @Override // in.b, in.a, androidx.appcompat.app.e, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
