package net.babycat.live.modules.profile.ui;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.f0;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import em.z;
import java.util.ArrayList;
import java.util.List;
import jg.f;
import jm.e1;
import mg.e;
import mg.g;
import net.babycat.live.model.GiftWallBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class MyGiftWallActivity extends in.b<e1> implements z.b {
    public Topbar mCommonTopbar;
    public LinearLayout mLinBj;
    public SmartRefreshLayout mNormalView;
    public RecyclerView mRvLogList;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35678n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f35679o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35680p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f0 f35681q;

    public class a implements g {
        public a() {
        }

        @Override // mg.g
        public void onRefresh(f fVar) {
            MyGiftWallActivity.this.f35678n = 1;
            MyGiftWallActivity.this.A5();
        }
    }

    public class b implements e {
        public b() {
        }

        @Override // mg.e
        public void onLoadMore(f fVar) {
            if (MyGiftWallActivity.this.f35679o) {
                MyGiftWallActivity.this.A5();
            } else {
                MyGiftWallActivity.this.mNormalView.s();
                MyGiftWallActivity.this.mNormalView.S();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A5() {
        ((e1) this.f27702e).q0(this.f35680p, this.f35678n);
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_my_gift_wall;
    }

    @Override // in.a
    public void g5() {
        this.mCommonTopbar = (Topbar) findViewById(R.id.common_topbar);
        this.mRvLogList = (RecyclerView) findViewById(R.id.rv_log_list);
        this.mNormalView = (SmartRefreshLayout) findViewById(R.id.normal_view);
        this.mLinBj = (LinearLayout) findViewById(R.id.lin_bj);
    }

    @Override // in.a
    public void h5() {
        m5(false);
        t.S0(this, this.mCommonTopbar, getString(R.string.gift_wall));
        this.f35680p = getIntent().getIntExtra("id", 0);
        this.mCommonTopbar.setTopBarWhite();
        this.f35681q = new f0(new ArrayList());
        this.mRvLogList.setLayoutManager(new GridLayoutManager(this, 3));
        this.mRvLogList.setAdapter(this.f35681q);
        this.f35681q.c1(R.layout.view_state_empty_gift);
        this.mNormalView.d0(new a());
        this.mNormalView.O(new b());
        A5();
    }

    @Override // in.a
    public View k5() {
        return this.mLinBj;
    }

    @Override // em.z.b
    public void x2(List<GiftWallBean> list, boolean z10) {
        if (this.f35678n == 1) {
            this.f35681q.v1(list);
        } else {
            this.f35681q.w(list);
        }
        this.f35678n++;
        this.f35679o = z10;
        this.mNormalView.s();
        this.mNormalView.S();
    }
}
