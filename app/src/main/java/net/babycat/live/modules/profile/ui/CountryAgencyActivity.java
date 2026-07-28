package net.babycat.live.modules.profile.ui;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.h;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import em.i;
import f.n0;
import java.util.ArrayList;
import java.util.List;
import jm.q;
import mg.g;
import net.babycat.live.model.AgencyAdminBean;
import net.babycat.live.model.AgencyAdminListBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.x0;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class CountryAgencyActivity extends in.b<q> implements i.b {
    public Topbar mCommonTopbar;
    public EditText mEdtId;
    public RecyclerView mHostList;
    public LinearLayout mLinDate;
    public SmartRefreshLayout mNormalView;
    public TextView mTvAdd;
    public TextView mTvAgencyNumber;
    public TextView mTvCountryMonth;
    public TextView mTvIncomeMonth;
    public TextView mTvIncomeThis;
    public TextView mTvRewardMonth;
    public TextView mTvRewardThis;
    public TextView mTvSelectDate;
    public TextView mTvTotalNumber;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String[] f35500n = {"Today", "This month", "Last month"};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f35501o = x0.IMAGE_1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35502p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Boolean f35503q = Boolean.FALSE;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f35504r = x0.IMAGE_1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h f35505s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f35506t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f35507u;

    public class a implements g {
        public a() {
        }

        @Override // mg.g
        public void onRefresh(jg.f fVar) {
            CountryAgencyActivity.this.f35502p = 1;
            CountryAgencyActivity.this.D5();
        }
    }

    public class b implements mg.e {
        public b() {
        }

        @Override // mg.e
        public void onLoadMore(jg.f fVar) {
            if (!CountryAgencyActivity.this.f35503q.booleanValue()) {
                CountryAgencyActivity.this.mNormalView.s();
                CountryAgencyActivity.this.mNormalView.S();
            } else {
                CountryAgencyActivity.this.f35502p++;
                CountryAgencyActivity.this.D5();
            }
        }
    }

    public class c implements TextView.OnEditorActionListener {
        public c() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            if (i10 != 3) {
                return false;
            }
            CountryAgencyActivity countryAgencyActivity = CountryAgencyActivity.this;
            countryAgencyActivity.f35504r = countryAgencyActivity.mEdtId.getText().toString();
            CountryAgencyActivity.this.f35502p = 1;
            CountryAgencyActivity.this.D5();
            ((InputMethodManager) CountryAgencyActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(CountryAgencyActivity.this.mEdtId.getWindowToken(), 0);
            return true;
        }
    }

    public class d implements q7.e {

        public class a implements cf.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AgencyAdminListBean f35512a;

            public a(AgencyAdminListBean agencyAdminListBean) {
                this.f35512a = agencyAdminListBean;
            }

            @Override // cf.c
            public void onConfirm() {
                ((q) CountryAgencyActivity.this.f27702e).S0(this.f35512a.getAgencyId().intValue());
            }
        }

        public d() {
        }

        @Override // q7.e
        public void a(@n0 BaseQuickAdapter baseQuickAdapter, @n0 View view, int i10) {
            AgencyAdminListBean agencyAdminListBean = (AgencyAdminListBean) baseQuickAdapter.getData().get(i10);
            if (view.getId() != R.id.image_dele) {
                return;
            }
            new b.C0752b(CountryAgencyActivity.this).Y(true).r(CountryAgencyActivity.this.getString(R.string.system_prompt), CountryAgencyActivity.this.getString(R.string.bd_settle), CountryAgencyActivity.this.getString(R.string.cancel), CountryAgencyActivity.this.getString(R.string.define), new a(agencyAdminListBean), null, false).N();
        }
    }

    public class e implements cf.f {
        public e() {
        }

        @Override // cf.f
        public void a(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ((q) CountryAgencyActivity.this.f27702e).q2(str);
        }
    }

    public class f implements cf.g {
        public f() {
        }

        @Override // cf.g
        public void a(int i10, String str) {
            CountryAgencyActivity.this.f35501o = i10 + "";
            CountryAgencyActivity.this.mTvSelectDate.setText(str);
            CountryAgencyActivity.this.f35502p = 1;
            CountryAgencyActivity.this.D5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D5() {
        ((q) this.f27702e).w0(this.f35502p, TextUtils.isEmpty(this.f35504r) ? x0.IMAGE_1 : this.f35504r, this.f35501o);
    }

    @Override // em.i.b
    public void L2(AgencyAdminBean agencyAdminBean) {
        this.mTvRewardMonth.setText(agencyAdminBean.getTotalsData().getTotalAgencyNum() + "");
        this.f35506t.setText(agencyAdminBean.getTotalsData().getBdIncomeLastMonth() + "$");
        this.mTvRewardThis.setText(agencyAdminBean.getTotalsData().getTotalAgencyMemberNum() + "");
        this.f35507u.setText(agencyAdminBean.getTotalsData().getBdIncomeThisMonth() + "$");
        this.mTvTotalNumber.setText(agencyAdminBean.getTotalsData().getTotalAgencyMemberNumToday() + "");
        this.mTvCountryMonth.setText(agencyAdminBean.getTotalsData().getIncomeLastMonth() + "");
        this.mTvAgencyNumber.setText(agencyAdminBean.getTotalsData().getIncomeThisMonth() + "");
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_country_agency;
    }

    @Override // em.i.b
    public void g4(List<AgencyAdminListBean> list, boolean z10) {
        if (this.f35502p == 1) {
            this.f35505s.v1(list);
        } else {
            this.f35505s.w(list);
        }
        this.f35503q = Boolean.valueOf(z10);
        this.mNormalView.s();
        this.mNormalView.S();
    }

    @Override // in.a
    public void g5() {
        this.mCommonTopbar = (Topbar) findViewById(R.id.common_topbar);
        this.mTvRewardMonth = (TextView) findViewById(R.id.tv_reward_month);
        this.mTvIncomeMonth = (TextView) findViewById(R.id.tv_income_month);
        this.mTvRewardThis = (TextView) findViewById(R.id.tv_reward_this);
        this.mTvIncomeThis = (TextView) findViewById(R.id.tv_income_this);
        this.mTvTotalNumber = (TextView) findViewById(R.id.tv_total_number);
        this.mTvCountryMonth = (TextView) findViewById(R.id.tv_country_month);
        this.mTvAgencyNumber = (TextView) findViewById(R.id.tv_Agency_number);
        this.mTvAdd = (TextView) findViewById(R.id.tv_add);
        this.mTvSelectDate = (TextView) findViewById(R.id.tv_select_date);
        this.mLinDate = (LinearLayout) findViewById(R.id.lin_date);
        this.mEdtId = (EditText) findViewById(R.id.edt_id);
        this.mHostList = (RecyclerView) findViewById(R.id.host_list);
        this.mNormalView = (SmartRefreshLayout) findViewById(R.id.normal_view);
        this.mTvAdd.setOnClickListener(this);
        this.mLinDate.setOnClickListener(this);
        this.f35506t = (TextView) findViewById(R.id.tv_db_last);
        this.f35507u = (TextView) findViewById(R.id.tv_db_this);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.mCommonTopbar, getString(R.string.country_agency));
        this.f35505s = new h(new ArrayList());
        this.mHostList.setLayoutManager(new LinearLayoutManager(this));
        this.mHostList.setAdapter(this.f35505s);
        ((q) this.f27702e).v2();
        this.mNormalView.d0(new a());
        this.mNormalView.O(new b());
        D5();
        this.mEdtId.setOnEditorActionListener(new c());
        this.f35505s.r(R.id.image_dele);
        this.f35505s.e(new d());
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.lin_date) {
            new b.C0752b(this).F(view).S(Boolean.FALSE).q0(400).c(this.f35500n, null, new f()).N();
        } else {
            if (id2 != R.id.tv_add) {
                return;
            }
            new b.C0752b(this).I(Boolean.TRUE).B(getString(R.string.add_user), "", "", getString(R.string.give_id), new e(), null, R.layout._xpopup_user_id_impl_confirm).N();
        }
    }

    @Override // em.i.b
    public void v2() {
        this.f35504r = x0.IMAGE_1;
        this.f35502p = 1;
        D5();
    }
}
