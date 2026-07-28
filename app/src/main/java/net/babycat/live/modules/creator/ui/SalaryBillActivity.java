package net.babycat.live.modules.creator.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cl.n;
import com.lxj.xpopupext.popup.TimePickerPopup;
import gl.a0;
import hf.e;
import in.b;
import java.util.Calendar;
import java.util.Date;
import net.babycat.live.model.AnchorDayLivelogBean;
import net.babycat.live.model.InitBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.x0;
import net.babycat.live.platform.widget.view.Topbar;
import org.litepal.LitePal;
import qmyy.babycat.live.R;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class SalaryBillActivity extends b<a0> implements n.b {
    public Calendar A = Calendar.getInstance();
    public String B;
    public String C;
    public InitBean D;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35188n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f35189o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RelativeLayout f35190p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f35191q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f35192r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f35193s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LinearLayout f35194t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public LinearLayout f35195u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinearLayout f35196v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f35197w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LinearLayout f35198x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f35199y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TimePickerPopup f35200z;

    public class a implements e {
        public a() {
        }

        @Override // hf.e
        public void a(Date date, View view) {
            StringBuilder sb2;
            SalaryBillActivity.this.A.setTime(date);
            SalaryBillActivity salaryBillActivity = SalaryBillActivity.this;
            if (salaryBillActivity.A.get(2) + 1 >= 10) {
                sb2 = new StringBuilder();
                sb2.append("");
            } else {
                sb2 = new StringBuilder();
                sb2.append(x0.IMAGE_1);
            }
            sb2.append(SalaryBillActivity.this.A.get(2) + 1);
            salaryBillActivity.C = sb2.toString();
            SalaryBillActivity salaryBillActivity2 = SalaryBillActivity.this;
            salaryBillActivity2.B = String.valueOf(salaryBillActivity2.A.get(1));
            SalaryBillActivity.this.f35191q.setText(SalaryBillActivity.this.B + "/" + SalaryBillActivity.this.C);
            ((a0) SalaryBillActivity.this.f27702e).o4(SalaryBillActivity.this.B + "-" + SalaryBillActivity.this.C, "");
        }

        @Override // hf.e
        public void b(Date date) {
        }

        @Override // hf.e
        public void onCancel() {
        }
    }

    private void D5() {
        this.f35200z = new TimePickerPopup(this).a0(this.A).g0(false).f0(TimePickerPopup.Mode.YM).i0(new a());
        new b.C0752b(this).t(this.f35200z).N();
    }

    @Override // cl.n.b
    public void T2(AnchorDayLivelogBean anchorDayLivelogBean) {
        if (this.D.getSetting().getAgency_mode() != 3) {
            this.f35194t.setVisibility(8);
            this.f35196v.setVisibility(8);
            this.f35198x.setVisibility(8);
            this.f35195u.setVisibility(0);
            this.f35192r.setText("" + anchorDayLivelogBean.getDiamondSalary());
            return;
        }
        this.f35194t.setVisibility(0);
        this.f35196v.setVisibility(0);
        this.f35198x.setVisibility(0);
        this.f35195u.setVisibility(8);
        this.f35193s.setText("Lv." + anchorDayLivelogBean.getLevel());
        this.f35197w.setText(anchorDayLivelogBean.getTotal_diamond());
        this.f35199y.setText("$" + anchorDayLivelogBean.getDiamondSalary());
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_salary_bill;
    }

    @Override // in.a
    public void g5() {
        this.f35188n = (Topbar) findViewById(R.id.common_topbar);
        this.f35189o = (TextView) findViewById(R.id.tv_live_data);
        this.f35190p = (RelativeLayout) findViewById(R.id.re_salary_date);
        this.f35191q = (TextView) findViewById(R.id.tv_salary_date);
        this.f35192r = (TextView) findViewById(R.id.tv_total_salary);
        this.f35193s = (TextView) findViewById(R.id.tv_level);
        this.f35194t = (LinearLayout) findViewById(R.id.line_level);
        this.f35195u = (LinearLayout) findViewById(R.id.lin_salary_dio);
        this.f35196v = (LinearLayout) findViewById(R.id.line_diamond);
        this.f35197w = (TextView) findViewById(R.id.tv_diamond);
        this.f35198x = (LinearLayout) findViewById(R.id.lin_salary);
        this.f35199y = (TextView) findViewById(R.id.tv_salary);
        this.f35189o.setOnClickListener(this);
        this.f35190p.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        StringBuilder sb2;
        t.S0(this, this.f35188n, getString(R.string.salary_bill));
        this.f35189o.getPaint().setFlags(8);
        this.D = (InitBean) LitePal.findFirst(InitBean.class, true);
        this.A.setTime(new Date());
        this.A.add(2, -1);
        if (this.A.get(2) + 1 >= 10) {
            sb2 = new StringBuilder();
            sb2.append("");
        } else {
            sb2 = new StringBuilder();
            sb2.append(x0.IMAGE_1);
        }
        sb2.append(this.A.get(2) + 1);
        this.C = sb2.toString();
        this.B = String.valueOf(this.A.get(1));
        this.f35191q.setText(this.B + "/" + this.C);
        ((a0) this.f27702e).o4(this.B + "-" + this.C, "");
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.re_salary_date) {
            D5();
            return;
        }
        if (id2 == R.id.tv_live_data && t.t0()) {
            Bundle bundle = new Bundle();
            bundle.putString("anchor_records_years", this.B);
            bundle.putString("anchor_records_month", this.C);
            bundle.putString("anchor_records_uid", "");
            p5(AnchorRecordsActivity.class, bundle);
        }
    }
}
