package net.babycat.live.modules.profile.ui;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lxj.xpopupext.popup.TimePickerPopup;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import em.c;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import jg.f;
import mg.e;
import mg.g;
import net.babycat.live.model.AgentMyLogBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class AgentMyLogActivity extends in.b<jm.c> implements c.b {
    public Topbar mCommonTopbar;
    public RecyclerView mIdAgentList;
    public LinearLayout mLin3;
    public LinearLayout mLinDate;
    public LinearLayout mLinDateEnd;
    public SmartRefreshLayout mNormalView;
    public TextView mTvDate;
    public TextView mTvDateEnd;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ao.b f35433n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f35434o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f35435p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35436q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f35437r = false;

    public class a implements g {
        public a() {
        }

        @Override // mg.g
        public void onRefresh(f fVar) {
            AgentMyLogActivity.this.f35436q = 1;
            AgentMyLogActivity.this.D5();
        }
    }

    public class b implements e {
        public b() {
        }

        @Override // mg.e
        public void onLoadMore(f fVar) {
            if (AgentMyLogActivity.this.f35437r) {
                AgentMyLogActivity.this.f35436q++;
                AgentMyLogActivity.this.D5();
            } else {
                AgentMyLogActivity.this.v5("no data");
                AgentMyLogActivity.this.mNormalView.s();
                AgentMyLogActivity.this.mNormalView.S();
            }
        }
    }

    public class c implements hf.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f35440a;

        public c(int i10) {
            this.f35440a = i10;
        }

        @Override // hf.e
        public void a(Date date, View view) {
            String strL0 = t.l0(date);
            if (this.f35440a == 1) {
                AgentMyLogActivity.this.mTvDate.setText(strL0);
                AgentMyLogActivity.this.f35434o = t.l0(date);
            } else {
                AgentMyLogActivity.this.mTvDateEnd.setText(strL0);
                AgentMyLogActivity.this.f35435p = t.l0(date);
            }
            AgentMyLogActivity.this.f35436q = 1;
            AgentMyLogActivity.this.D5();
        }

        @Override // hf.e
        public void b(Date date) {
        }

        @Override // hf.e
        public void onCancel() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D5() {
        ((jm.c) this.f27702e).y1(this.f35436q, 0, this.f35434o, this.f35435p);
    }

    public void E5(int i10) {
        new b.C0752b(this).t(new TimePickerPopup(this).a0(Calendar.getInstance()).i0(new c(i10))).N();
    }

    @Override // em.c.b
    public void F2(List<AgentMyLogBean> list, boolean z10) {
        if (this.f35436q == 1) {
            this.f35433n.v1(list);
        } else {
            this.f35433n.w(list);
        }
        this.f35437r = z10;
        this.mNormalView.s();
        this.mNormalView.S();
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_agent_my_log;
    }

    @Override // in.a
    public void g5() {
        this.mCommonTopbar = (Topbar) findViewById(R.id.common_topbar);
        this.mTvDate = (TextView) findViewById(R.id.tv_date);
        this.mLinDate = (LinearLayout) findViewById(R.id.lin_date);
        this.mTvDateEnd = (TextView) findViewById(R.id.tv_date_end);
        this.mLinDateEnd = (LinearLayout) findViewById(R.id.lin_date_end);
        this.mLin3 = (LinearLayout) findViewById(R.id.lin3);
        this.mIdAgentList = (RecyclerView) findViewById(R.id.id_agent_list);
        this.mNormalView = (SmartRefreshLayout) findViewById(R.id.normal_view);
        this.mLinDate.setOnClickListener(this);
        this.mLinDateEnd.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        m5(false);
        t.S0(this, this.mCommonTopbar, getString(R.string.my_log));
        this.mCommonTopbar.setTopBarWhite();
        this.f35433n = new ao.b(new ArrayList());
        this.mIdAgentList.setLayoutManager(new LinearLayoutManager(this));
        this.mIdAgentList.setAdapter(this.f35433n);
        this.f35433n.c1(R.layout.view_state_empty_anchor_apply);
        this.mNormalView.d0(new a());
        this.mNormalView.O(new b());
        D5();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.lin_date /* 2131363141 */:
                E5(1);
                break;
            case R.id.lin_date_end /* 2131363142 */:
                E5(2);
                break;
        }
    }
}
