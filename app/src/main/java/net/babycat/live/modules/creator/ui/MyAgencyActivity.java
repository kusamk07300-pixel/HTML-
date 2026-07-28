package net.babycat.live.modules.creator.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cl.k;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.gyf.immersionbar.ImmersionBar;
import com.lxj.xpopupext.popup.TimePickerPopup;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import f.n0;
import gl.u;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import net.babycat.live.model.AgencyHomeBean;
import net.babycat.live.model.HostDataBean;
import net.babycat.live.model.InitBean;
import net.babycat.live.platform.util.b1;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.x0;
import net.babycat.live.platform.widget.view.ObservableScrollView;
import net.babycat.live.platform.widget.view.Topbar;
import net.babycat.live.shell.WebViewActivity;
import org.litepal.LitePal;
import q7.g;
import qmyy.babycat.live.R;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class MyAgencyActivity extends in.b<u> implements k.b, ObservableScrollView.ScrollViewListener {
    public TextView A;
    public LinearLayout B;
    public bl.b C;
    public String F;
    public String G;
    public TimePickerPopup I;
    public Runnable K;
    public InitBean Q;
    public View S;
    public View T;
    public View U;
    public View V;
    public View W;
    public View X;
    public Topbar mCommonTopbar;
    public SmartRefreshLayout mNormalView;
    public ProgressBar mProAnchor;
    public TextView mTvGrade;
    public TextView mTvGradeEnd;
    public TextView mTvNewNum;
    public TextView mTvNext;
    public TextView mTvProgr;
    public TextView mTvSelectDate;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ObservableScrollView f35145n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RecyclerView f35146o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f35147p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f35148q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f35149r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f35150s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f35151t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public EditText f35152u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RelativeLayout f35153v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f35154w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RelativeLayout f35155x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f35156y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f35157z;
    public int D = 1;
    public boolean E = false;
    public Calendar H = Calendar.getInstance();
    public Handler J = new Handler();
    public String L = "";
    public String M = "";
    public String N = "";
    public int O = 0;
    public String P = "";
    public int R = 0;

    public class a implements g {
        public a() {
        }

        @Override // q7.g
        public void a(@n0 BaseQuickAdapter<?, ?> baseQuickAdapter, @n0 View view, int i10) {
            HostDataBean hostDataBean = (HostDataBean) baseQuickAdapter.getData().get(i10);
            if (t.t0()) {
                Bundle bundle = new Bundle();
                bundle.putString("anchor_records_years", MyAgencyActivity.this.F);
                bundle.putString("anchor_records_month", MyAgencyActivity.this.G);
                bundle.putString("anchor_records_uid", String.valueOf(hostDataBean.getUid()));
                MyAgencyActivity.this.p5(AnchorRecordsActivity.class, bundle);
            }
        }
    }

    public class b implements mg.e {
        public b() {
        }

        @Override // mg.e
        public void onLoadMore(jg.f fVar) {
            if (MyAgencyActivity.this.E) {
                MyAgencyActivity.this.I5();
            } else {
                MyAgencyActivity.this.mNormalView.s();
                MyAgencyActivity.this.mNormalView.S();
            }
        }
    }

    public class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MyAgencyActivity.this.M5(editable.toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class d implements cf.g {
        public d() {
        }

        @Override // cf.g
        public void a(int i10, String str) {
            if (i10 == 0) {
                MyAgencyActivity.this.M = "coins";
                MyAgencyActivity.this.N = "desc";
            } else if (i10 == 1) {
                MyAgencyActivity.this.M = "coins";
                MyAgencyActivity.this.N = "asc";
            } else if (i10 == 2) {
                MyAgencyActivity.this.M = "valid_days";
                MyAgencyActivity.this.N = "desc";
            } else if (i10 == 3) {
                MyAgencyActivity.this.M = "valid_days";
                MyAgencyActivity.this.N = "asc";
            }
            MyAgencyActivity.this.D = 1;
            MyAgencyActivity.this.I5();
        }
    }

    public class e implements hf.e {
        public e() {
        }

        @Override // hf.e
        public void a(Date date, View view) {
            StringBuilder sb2;
            String str;
            MyAgencyActivity.this.H.setTime(date);
            MyAgencyActivity myAgencyActivity = MyAgencyActivity.this;
            if (myAgencyActivity.H.get(2) + 1 >= 10) {
                sb2 = new StringBuilder();
                str = "";
            } else {
                sb2 = new StringBuilder();
                str = x0.IMAGE_1;
            }
            sb2.append(str);
            sb2.append(MyAgencyActivity.this.H.get(2) + 1);
            myAgencyActivity.G = sb2.toString();
            MyAgencyActivity myAgencyActivity2 = MyAgencyActivity.this;
            myAgencyActivity2.F = String.valueOf(myAgencyActivity2.H.get(1));
            MyAgencyActivity.this.mTvSelectDate.setText(MyAgencyActivity.this.F + "-" + MyAgencyActivity.this.G);
            MyAgencyActivity.this.D = 1;
            MyAgencyActivity.this.I5();
        }

        @Override // hf.e
        public void b(Date date) {
        }

        @Override // hf.e
        public void onCancel() {
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35163a;

        public f(String str) {
            this.f35163a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MyAgencyActivity.this.L = this.f35163a;
            MyAgencyActivity.this.D = 1;
            MyAgencyActivity.this.I5();
            wo.b.b("host id�� �������", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I5() {
        HashMap map = new HashMap();
        map.put("page", Integer.valueOf(this.D));
        map.put("date", this.F + this.G);
        if (!TextUtils.isEmpty(this.L)) {
            map.put("to_uid", this.L);
        }
        if (!TextUtils.isEmpty(this.M) && !TextUtils.isEmpty(this.N)) {
            map.put("field", this.M);
            map.put("sort", this.N);
        }
        ((u) this.f27702e).G2(map);
    }

    private void initData() {
        if (this.Q.getSetting().getAgency_mode() == 3) {
            this.f35153v.setVisibility(8);
            this.f35154w.setText("Total");
            this.f35155x.setVisibility(8);
            this.B.setVisibility(0);
        } else {
            this.f35153v.setVisibility(0);
            this.f35154w.setText("Current target progress");
            this.f35155x.setVisibility(0);
            this.B.setVisibility(8);
        }
        this.C = new bl.b(new ArrayList());
        this.f35146o.setLayoutManager(new LinearLayoutManager(this));
        this.C.T0(true);
        this.C.U0(false);
        this.C.V0(BaseQuickAdapter.AnimationType.ScaleIn);
        this.f35146o.setAdapter(this.C);
        this.C.c1(R.layout.view_state_empty_anchor_apply);
        this.C.c(new a());
        this.mNormalView.j0(false);
        this.mNormalView.O(new b());
        I5();
        this.f35152u.addTextChangedListener(new c());
    }

    public final void J5() {
        if (this.I == null) {
            this.I = new TimePickerPopup(this).a0(this.H).g0(false).f0(TimePickerPopup.Mode.YM).j0(this.H.get(1) - 10, this.H.get(1)).i0(new e());
        }
        new b.C0752b(this).t(this.I).N();
    }

    public final void K5() {
        new b.C0752b(this).f("", new String[]{getString(R.string.coins_descending), getString(R.string.coins_ascending), getString(R.string.valid_descending), getString(R.string.valid_ascending)}, new d()).N();
    }

    public final void L5() {
        if (this.R <= t.i(20.0f)) {
            this.mCommonTopbar.setBg(Color.argb(0, 255, 255, 255));
            this.mCommonTopbar.setTabBoldGone();
            this.mCommonTopbar.setTextTextColor(Color.parseColor("#ffffff"));
            ImmersionBar.with(this).fitsSystemWindows(false).transparentStatusBar().statusBarDarkFont(false).init();
            this.mCommonTopbar.setLeftImage(R.mipmap.live_return);
            return;
        }
        ImmersionBar.with(this).fitsSystemWindows(false).statusBarDarkFont(true).statusBarColor(R.color.white).init();
        this.mCommonTopbar.setTextTextColor(Color.parseColor("#333333"));
        this.mCommonTopbar.setTabBoldVISIBLE();
        this.mCommonTopbar.setBg(Color.argb(255, 255, 255, 255));
        this.mCommonTopbar.setLeftImage(R.mipmap.icon_back);
    }

    @Override // cl.k.b
    public void M2(AgencyHomeBean agencyHomeBean) {
        this.O = agencyHomeBean.getAgencyInfo().getId().intValue();
        this.P = agencyHomeBean.getSalaryDocUrl();
        this.f35147p.setText(agencyHomeBean.getAgencyInfo().getName());
        this.f35148q.setText(agencyHomeBean.getAgencyInfo().getId().toString());
        this.f35151t.setText(String.valueOf(agencyHomeBean.getTotalAnchor()));
        this.f35149r.setText(String.valueOf(agencyHomeBean.getNewAnchor()));
        this.f35150s.setText(agencyHomeBean.getActiveRate() + "%");
        if (this.Q.getSetting().getAgency_mode() == 3) {
            this.f35156y.setText(b1.a(agencyHomeBean.getOwnSchedule().getCurrentDiamond().intValue()));
            this.f35157z.setText(b1.a(agencyHomeBean.getOwnSchedule().getTargetDiamond().intValue()));
            this.A.setText(b1.a(agencyHomeBean.getOwnSchedule().getTotalDiamond().intValue()));
            return;
        }
        this.mTvProgr.setText(agencyHomeBean.getOwnSchedule().getTotalDiamond() + "/" + agencyHomeBean.getOwnSchedule().getTargetDiamond());
        this.mProAnchor.setProgress(agencyHomeBean.getOwnSchedule().getRate().intValue());
        this.mTvGrade.setText("Lv." + agencyHomeBean.getOwnSchedule().getCurrentLevel());
        this.mTvGradeEnd.setText("Lv." + agencyHomeBean.getOwnSchedule().getNextLevel());
        this.mTvNewNum.setText(String.valueOf(agencyHomeBean.getOwnSchedule().getCurrentDiamond()));
        this.mTvNext.setText(String.valueOf(agencyHomeBean.getOwnSchedule().getTargetDiamond()));
    }

    public void M5(String str) {
        Runnable runnable = this.K;
        if (runnable != null) {
            this.J.removeCallbacks(runnable);
            wo.b.b("host id�� handlerɾ����������ʱ", new Object[0]);
        }
        Handler handler = this.J;
        f fVar = new f(str);
        this.K = fVar;
        handler.postDelayed(fVar, 500L);
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_my_agency;
    }

    @Override // in.a
    public void g5() {
        this.f35145n = (ObservableScrollView) findViewById(R.id.osc_main);
        this.mCommonTopbar = (Topbar) findViewById(R.id.common_topbar);
        this.f35146o = (RecyclerView) findViewById(R.id.host_list);
        this.f35147p = (TextView) findViewById(R.id.tv_agenname);
        this.f35148q = (TextView) findViewById(R.id.tv_id);
        this.f35149r = (TextView) findViewById(R.id.tv_new_host);
        this.f35150s = (TextView) findViewById(R.id.tv_act_rate);
        this.f35151t = (TextView) findViewById(R.id.tv_total);
        this.mNormalView = (SmartRefreshLayout) findViewById(R.id.normal_view);
        this.f35152u = (EditText) findViewById(R.id.edt_id);
        this.mProAnchor = (ProgressBar) findViewById(R.id.pro_anchor);
        this.mTvProgr = (TextView) findViewById(R.id.tv_progr);
        this.mTvNewNum = (TextView) findViewById(R.id.tv_new_num);
        this.mTvNext = (TextView) findViewById(R.id.tv_next);
        this.mTvGrade = (TextView) findViewById(R.id.tv_grade);
        this.mTvGradeEnd = (TextView) findViewById(R.id.tv_grade_end);
        this.mTvSelectDate = (TextView) findViewById(R.id.tv_select_date);
        this.f35153v = (RelativeLayout) findViewById(R.id.rl_process);
        this.f35154w = (TextView) findViewById(R.id.tv_target_progress);
        this.f35155x = (RelativeLayout) findViewById(R.id.rl_pro);
        this.f35156y = (TextView) findViewById(R.id.master_salary);
        this.f35157z = (TextView) findViewById(R.id.host_salary);
        this.A = (TextView) findViewById(R.id.host_diamonds);
        this.B = (LinearLayout) findViewById(R.id.lin_master);
        this.S = findViewById(R.id.lin_host_manger);
        this.T = findViewById(R.id.lin_invite);
        this.U = findViewById(R.id.lin_info);
        this.V = findViewById(R.id.iv_ask);
        this.W = findViewById(R.id.lin_date);
        this.X = findViewById(R.id.lin_sort);
        this.S.setOnClickListener(this);
        this.T.setOnClickListener(this);
        this.U.setOnClickListener(this);
        this.V.setOnClickListener(this);
        this.W.setOnClickListener(this);
        this.X.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        String str;
        m5(false);
        t.S0(this, this.mCommonTopbar, getString(R.string.agency_management));
        this.f35145n.setScrollViewListener(this);
        L5();
        this.Q = (InitBean) LitePal.findFirst(InitBean.class, true);
        this.H.setTime(new Date());
        if (this.H.get(2) + 1 >= 10) {
            str = "" + (this.H.get(2) + 1);
        } else {
            str = x0.IMAGE_1 + (this.H.get(2) + 1);
        }
        this.G = str;
        this.F = String.valueOf(this.H.get(1));
        this.mTvSelectDate.setText(this.F + "-" + this.G);
        ((u) this.f27702e).H3();
        initData();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // cl.k.b
    public void o1(List<HostDataBean> list, boolean z10) {
        if (this.D == 1) {
            this.C.v1(list);
        } else {
            this.C.w(list);
        }
        this.D++;
        this.E = z10;
        this.mNormalView.s();
        this.mNormalView.S();
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_ask /* 2131362897 */:
                if (t.t0()) {
                    if (!TextUtils.isEmpty(this.P)) {
                        Bundle bundle = new Bundle();
                        bundle.putString("url", this.P);
                        p5(WebViewActivity.class, bundle);
                    } else {
                        o5(AgencySalaryActivity.class);
                    }
                }
                break;
            case R.id.lin_date /* 2131363141 */:
                J5();
                break;
            case R.id.lin_host_manger /* 2131363160 */:
                if (t.t0()) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("agencyId", this.O);
                    p5(HostManagerActivity.class, bundle2);
                }
                break;
            case R.id.lin_info /* 2131363163 */:
                if (t.t0()) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("show_quit", 0);
                    p5(MyGuildActivity.class, bundle3);
                }
                break;
            case R.id.lin_invite /* 2131363164 */:
                if (t.t0()) {
                    o5(MasterSalaryActivity.class);
                }
                break;
            case R.id.lin_sort /* 2131363220 */:
                K5();
                break;
        }
    }

    @Override // net.babycat.live.platform.widget.view.ObservableScrollView.ScrollViewListener
    public void onScrollChanged(ObservableScrollView observableScrollView, int i10, int i11, int i12, int i13) {
        this.R = i11;
        L5();
    }
}
