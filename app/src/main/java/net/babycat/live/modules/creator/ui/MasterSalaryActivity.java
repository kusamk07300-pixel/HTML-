package net.babycat.live.modules.creator.ui;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import cl.j;
import com.lxj.xpopupext.popup.TimePickerPopup;
import gl.s;
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
public class MasterSalaryActivity extends b<s> implements j.b {
    public String A;
    public InitBean B;
    public View C;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35131n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f35132o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f35133p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f35134q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f35135r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LinearLayout f35136s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LinearLayout f35137t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public LinearLayout f35138u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinearLayout f35139v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f35140w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TimePickerPopup f35141x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Calendar f35142y = Calendar.getInstance();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f35143z;

    public class a implements e {
        public a() {
        }

        @Override // hf.e
        public void a(Date date, View view) {
            StringBuilder sb2;
            String str;
            MasterSalaryActivity.this.f35142y.setTime(date);
            MasterSalaryActivity masterSalaryActivity = MasterSalaryActivity.this;
            if (masterSalaryActivity.f35142y.get(2) + 1 >= 10) {
                sb2 = new StringBuilder();
                str = "";
            } else {
                sb2 = new StringBuilder();
                str = x0.IMAGE_1;
            }
            sb2.append(str);
            sb2.append(MasterSalaryActivity.this.f35142y.get(2) + 1);
            masterSalaryActivity.A = sb2.toString();
            MasterSalaryActivity masterSalaryActivity2 = MasterSalaryActivity.this;
            masterSalaryActivity2.f35143z = String.valueOf(masterSalaryActivity2.f35142y.get(1));
            MasterSalaryActivity.this.f35132o.setText(MasterSalaryActivity.this.f35143z + "/" + MasterSalaryActivity.this.A);
            ((s) MasterSalaryActivity.this.f27702e).n3(MasterSalaryActivity.this.f35143z + "-" + MasterSalaryActivity.this.A);
        }

        @Override // hf.e
        public void b(Date date) {
        }

        @Override // hf.e
        public void onCancel() {
        }
    }

    private void D5() {
        this.f35141x = new TimePickerPopup(this).a0(this.f35142y).g0(false).f0(TimePickerPopup.Mode.YM).i0(new a());
        new b.C0752b(this).t(this.f35141x).N();
    }

    @Override // cl.j.b
    public void U4(AnchorDayLivelogBean anchorDayLivelogBean) {
        if (this.B.getSetting().getAgency_mode() == 3) {
            this.f35136s.setVisibility(8);
            this.f35137t.setVisibility(8);
            this.f35138u.setVisibility(8);
            this.f35139v.setVisibility(0);
            this.f35140w.setText("$" + anchorDayLivelogBean.getDiamondSalary());
            return;
        }
        this.f35136s.setVisibility(0);
        this.f35137t.setVisibility(0);
        this.f35138u.setVisibility(0);
        this.f35139v.setVisibility(8);
        this.f35133p.setText("" + anchorDayLivelogBean.getDiamondSalary());
        this.f35134q.setText("" + anchorDayLivelogBean.getDiamond());
        this.f35135r.setText("Lv." + anchorDayLivelogBean.getLevel());
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_master_salary;
    }

    @Override // in.a
    public void g5() {
        this.f35131n = (Topbar) findViewById(R.id.common_topbar);
        this.f35132o = (TextView) findViewById(R.id.tv_salary_date);
        this.f35133p = (TextView) findViewById(R.id.tv_total_salary);
        this.f35134q = (TextView) findViewById(R.id.tv_target_salary);
        this.f35135r = (TextView) findViewById(R.id.tv_level);
        this.f35136s = (LinearLayout) findViewById(R.id.line_level);
        this.f35137t = (LinearLayout) findViewById(R.id.lin_diamond_income);
        this.f35138u = (LinearLayout) findViewById(R.id.line_master_salary);
        this.f35139v = (LinearLayout) findViewById(R.id.line_diamond_salary);
        this.f35140w = (TextView) findViewById(R.id.tv_diamond_salary);
        View viewFindViewById = findViewById(R.id.re_salary_date);
        this.C = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        StringBuilder sb2;
        String str;
        t.S0(this, this.f35131n, getString(R.string.master_salary));
        this.B = (InitBean) LitePal.findFirst(InitBean.class, true);
        this.f35142y.setTime(new Date());
        this.f35142y.add(2, -1);
        if (this.f35142y.get(2) + 1 >= 10) {
            sb2 = new StringBuilder();
            str = "";
        } else {
            sb2 = new StringBuilder();
            str = x0.IMAGE_1;
        }
        sb2.append(str);
        sb2.append(this.f35142y.get(2) + 1);
        this.A = sb2.toString();
        this.f35143z = String.valueOf(this.f35142y.get(1));
        this.f35132o.setText(this.f35143z + "/" + this.A);
        ((s) this.f27702e).n3(this.f35143z + "-" + this.A);
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.re_salary_date) {
            return;
        }
        D5();
    }
}
