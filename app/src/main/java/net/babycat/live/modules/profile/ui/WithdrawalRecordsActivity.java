package net.babycat.live.modules.profile.ui;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.o1;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import em.v0;
import java.util.ArrayList;
import java.util.List;
import jg.f;
import jm.o3;
import mg.e;
import mg.g;
import net.babycat.live.model.WithdrawCashRecordBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class WithdrawalRecordsActivity extends in.b<o3> implements v0.b {
    public SmartRefreshLayout mNormalView;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35934n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RecyclerView f35935o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public o1 f35936p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35937q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f35938r = false;

    public class a implements g {
        public a() {
        }

        @Override // mg.g
        public void onRefresh(f fVar) {
            WithdrawalRecordsActivity.this.f35937q = 1;
            WithdrawalRecordsActivity.this.A5();
        }
    }

    public class b implements e {
        public b() {
        }

        @Override // mg.e
        public void onLoadMore(f fVar) {
            if (WithdrawalRecordsActivity.this.f35938r) {
                WithdrawalRecordsActivity.this.A5();
            } else {
                WithdrawalRecordsActivity.this.mNormalView.s();
                WithdrawalRecordsActivity.this.mNormalView.S();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A5() {
        ((o3) this.f27702e).j1(this.f35937q);
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_withdrawal_records;
    }

    @Override // in.a
    public void g5() {
        this.f35934n = (Topbar) findViewById(R.id.common_topbar);
        this.f35935o = (RecyclerView) findViewById(R.id.rv_log_list);
        this.mNormalView = (SmartRefreshLayout) findViewById(R.id.normal_view);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.f35934n, getString(R.string.withdrawal_records));
        this.f35936p = new o1(new ArrayList());
        this.f35935o.setLayoutManager(new LinearLayoutManager(this));
        this.f35935o.setAdapter(this.f35936p);
        this.f35936p.c1(R.layout.view_state_empty_anchor_apply);
        this.mNormalView.d0(new a());
        this.mNormalView.O(new b());
        A5();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // em.v0.b
    public void z0(List<WithdrawCashRecordBean> list, boolean z10) {
        if (this.f35937q == 1) {
            this.f35936p.v1(list);
        } else {
            this.f35936p.w(list);
        }
        this.f35937q++;
        this.f35938r = z10;
        this.mNormalView.s();
        this.mNormalView.S();
    }
}
