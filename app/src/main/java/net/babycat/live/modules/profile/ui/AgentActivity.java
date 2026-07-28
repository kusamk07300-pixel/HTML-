package net.babycat.live.modules.profile.ui;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lxj.xpopupext.popup.TimePickerPopup;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import em.b;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import jg.f;
import mg.g;
import net.babycat.live.model.AgentHomeBean;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class AgentActivity extends in.b<jm.e> implements b.InterfaceC0290b {
    public Topbar mCommonTopbar;
    public EditText mEdUid;
    public RecyclerView mIdAgentList;
    public LinearLayout mLin3;
    public LinearLayout mLinDate;
    public LinearLayout mLinDateEnd;
    public SmartRefreshLayout mNormalView;
    public TextView mTvBalance;
    public TextView mTvCoins;
    public TextView mTvDate;
    public TextView mTvDateEnd;
    public TextView mTvSold;
    public TextView mTvTopup;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ao.a f35421n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f35422o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f35423p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35424q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f35425r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f35426s = false;

    public class a implements Topbar.TopbarRightClickListener {
        public a() {
        }

        @Override // net.babycat.live.platform.widget.view.Topbar.TopbarRightClickListener
        public void rightClick() {
            if (t.t0()) {
                AgentActivity.this.o5(AgentMyLogActivity.class);
            }
        }
    }

    public class b implements g {
        public b() {
        }

        @Override // mg.g
        public void onRefresh(f fVar) {
            AgentActivity.this.f35424q = 1;
            AgentActivity.this.E5();
        }
    }

    public class c implements mg.e {
        public c() {
        }

        @Override // mg.e
        public void onLoadMore(f fVar) {
            if (AgentActivity.this.f35426s) {
                AgentActivity.this.f35424q++;
                AgentActivity.this.E5();
            } else {
                AgentActivity.this.v5("no data");
                AgentActivity.this.mNormalView.s();
                AgentActivity.this.mNormalView.S();
            }
        }
    }

    public class d implements TextView.OnEditorActionListener {
        public d() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            if (i10 != 3) {
                return false;
            }
            AgentActivity.this.F5();
            return true;
        }
    }

    public class e implements hf.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f35431a;

        public e(int i10) {
            this.f35431a = i10;
        }

        @Override // hf.e
        public void a(Date date, View view) {
            String strL0 = t.l0(date);
            if (this.f35431a == 1) {
                AgentActivity.this.mTvDate.setText(strL0);
                AgentActivity.this.f35422o = t.l0(date);
            } else {
                AgentActivity.this.mTvDateEnd.setText(strL0);
                AgentActivity.this.f35423p = t.l0(date);
            }
            AgentActivity.this.f35424q = 1;
            AgentActivity.this.E5();
        }

        @Override // hf.e
        public void b(Date date) {
        }

        @Override // hf.e
        public void onCancel() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E5() {
        ((jm.e) this.f27702e).p1(this.f35424q, this.f35425r, this.f35422o, this.f35423p);
    }

    @Override // em.b.InterfaceC0290b
    public void E1(AgentHomeBean agentHomeBean) {
        this.mTvBalance.setText(agentHomeBean.getCoin());
        this.mTvCoins.setText(agentHomeBean.getIncomeCoins());
        E5();
    }

    public final void F5() {
        t.p0(this);
        this.f35425r = TextUtils.isEmpty(this.mEdUid.getText().toString()) ? 0 : Integer.parseInt(this.mEdUid.getText().toString());
        E5();
    }

    public void G5(int i10) {
        new b.C0752b(this).t(new TimePickerPopup(this).a0(Calendar.getInstance()).i0(new e(i10))).N();
    }

    @Override // em.b.InterfaceC0290b
    public void K0(List<AgentHomeBean.ListDTO> list, boolean z10, String str) {
        this.mTvSold.setText(str);
        if (this.f35424q == 1) {
            this.f35421n.v1(list);
        } else {
            this.f35421n.w(list);
        }
        this.f35426s = z10;
        this.mNormalView.s();
        this.mNormalView.S();
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_agent;
    }

    @Override // in.a
    public void g5() {
        this.mCommonTopbar = (Topbar) findViewById(R.id.common_topbar);
        this.mTvBalance = (TextView) findViewById(R.id.tv_balance);
        this.mTvCoins = (TextView) findViewById(R.id.tv_coins);
        this.mTvSold = (TextView) findViewById(R.id.tv_sold);
        this.mEdUid = (EditText) findViewById(R.id.ed_uid);
        this.mTvDate = (TextView) findViewById(R.id.tv_date);
        this.mLinDate = (LinearLayout) findViewById(R.id.lin_date);
        this.mTvDateEnd = (TextView) findViewById(R.id.tv_date_end);
        this.mLinDateEnd = (LinearLayout) findViewById(R.id.lin_date_end);
        this.mLin3 = (LinearLayout) findViewById(R.id.lin3);
        this.mIdAgentList = (RecyclerView) findViewById(R.id.id_agent_list);
        this.mNormalView = (SmartRefreshLayout) findViewById(R.id.normal_view);
        this.mTvTopup = (TextView) findViewById(R.id.tv_topup);
        this.mLinDate.setOnClickListener(this);
        this.mLinDateEnd.setOnClickListener(this);
        this.mTvTopup.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        m5(false);
        t.S0(this, this.mCommonTopbar, getString(R.string.agent));
        this.mCommonTopbar.setTopBarWhite();
        this.mCommonTopbar.setRightTxtVisible();
        this.mCommonTopbar.setRightText(getString(R.string.my_log));
        this.mCommonTopbar.setRightTextTextColor(-1);
        this.mCommonTopbar.setOnTopbarRightClickListener(new a());
        this.f35421n = new ao.a(new ArrayList());
        this.mIdAgentList.setLayoutManager(new LinearLayoutManager(this));
        this.mIdAgentList.setAdapter(this.f35421n);
        ((jm.e) this.f27702e).j0();
        this.mNormalView.d0(new b());
        this.mNormalView.O(new c());
        E5();
        this.mEdUid.setOnEditorActionListener(new d());
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.lin_date /* 2131363141 */:
                G5(1);
                break;
            case R.id.lin_date_end /* 2131363142 */:
                G5(2);
                break;
            case R.id.tv_topup /* 2131364650 */:
                if (t.t0()) {
                    o5(AgentTopUpActivity.class);
                }
                break;
        }
    }

    @Override // in.b
    public void onReceiveEvent(b0 b0Var) {
        super.onReceiveEvent(b0Var);
        if (b0Var.a() != 1107) {
            return;
        }
        ((jm.e) this.f27702e).j0();
        this.f35422o = "";
        this.f35423p = "";
        this.f35424q = 1;
        this.f35425r = 0;
        this.mTvDate.setText(getString(R.string.select_date));
        this.mTvDateEnd.setText(getString(R.string.select_date));
        E5();
    }
}
