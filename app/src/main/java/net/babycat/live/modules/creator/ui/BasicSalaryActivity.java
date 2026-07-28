package net.babycat.live.modules.creator.ui;

import android.view.View;
import android.widget.TextView;
import cl.e;
import gl.i;
import in.b;
import net.babycat.live.model.SalaryBillBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class BasicSalaryActivity extends b<i> implements e.b {
    public TextView A;
    public TextView B;
    public SalaryBillBean C;
    public String D;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35077n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f35078o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f35079p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f35080q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f35081r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f35082s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f35083t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f35084u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f35085v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f35086w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f35087x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f35088y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f35089z;

    private void initData() {
        if (this.C == null) {
            return;
        }
        this.f35078o.setText(this.D);
        this.f35080q.setText("$" + this.C.getBaseSalary());
        this.f35081r.setText(this.C.getIncome_diamonds());
        this.f35084u.setText("$" + this.C.getSalaryBaseIncome());
        this.f35083t.setText(this.C.getSalaryBaseIncomeLevel());
        this.f35085v.setText(this.C.getSalaryBaseIncomeLevelNext());
        this.f35086w.setText("$" + this.C.getSalaryBaseIncomeNext());
        this.f35087x.setText(this.C.getSalary_balance_income_level());
        this.f35088y.setText("$" + this.C.getSalary_balance_income());
        this.f35089z.setText(this.C.getSalary_balance_income_level_next());
        this.A.setText("$" + this.C.getSalary_balance_income_next());
        this.B.setText(this.C.getBalance_diamonds());
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_basic_salary;
    }

    @Override // in.a
    public void g5() {
        this.f35077n = (Topbar) findViewById(R.id.common_topbar);
        this.f35078o = (TextView) findViewById(R.id.tv_date);
        this.f35079p = (TextView) findViewById(R.id.tv_base_salary_nav);
        this.f35080q = (TextView) findViewById(R.id.tv_base_salary);
        this.f35081r = (TextView) findViewById(R.id.tv_total_revenue);
        this.f35082s = (TextView) findViewById(R.id.tv_corresponding_gear);
        this.f35083t = (TextView) findViewById(R.id.tv_base_income);
        this.f35084u = (TextView) findViewById(R.id.tv_base_income_num);
        this.f35085v = (TextView) findViewById(R.id.tv_base_income_next);
        this.f35086w = (TextView) findViewById(R.id.tv_base_income_next_num);
        this.B = (TextView) findViewById(R.id.tv_sdiamonds);
        this.f35087x = (TextView) findViewById(R.id.tv_remaining_diamonds);
        this.f35088y = (TextView) findViewById(R.id.tv_remaining_diamonds_num);
        this.f35089z = (TextView) findViewById(R.id.tv_remaining_diamonds_next);
        this.A = (TextView) findViewById(R.id.tv_remaining_diamonds_next_num);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.f35077n, getString(R.string.basic_salary));
        this.C = (SalaryBillBean) getIntent().getSerializableExtra("basic_salary_data");
        this.D = getIntent().getStringExtra("basic_salary_years");
        initData();
    }

    @Override // in.a
    public View k5() {
        return null;
    }
}
