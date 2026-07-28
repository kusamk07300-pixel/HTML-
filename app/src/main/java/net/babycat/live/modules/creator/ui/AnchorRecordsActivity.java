package net.babycat.live.modules.creator.ui;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import cl.c;
import com.lxj.xpopupext.popup.TimePickerPopup;
import gl.e;
import in.b;
import java.util.Calendar;
import java.util.Date;
import net.babycat.live.model.AnchorDayLivelogBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.x0;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class AnchorRecordsActivity extends b<e> implements c.b {
    public String A;
    public TimePickerPopup B;
    public Calendar C = Calendar.getInstance();
    public String D = "";
    public LinearLayout E;
    public LinearLayout F;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35059n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f35060o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f35061p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f35062q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f35063r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f35064s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f35065t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f35066u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f35067v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f35068w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f35069x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f35070y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f35071z;

    public class a implements hf.e {
        public a() {
        }

        @Override // hf.e
        public void a(Date date, View view) {
            String str;
            StringBuilder sb2;
            AnchorRecordsActivity.this.C.setTime(date);
            if (AnchorRecordsActivity.this.C.get(2) + 1 >= 10) {
                str = "" + (AnchorRecordsActivity.this.C.get(2) + 1);
            } else {
                str = x0.IMAGE_1 + (AnchorRecordsActivity.this.C.get(2) + 1);
            }
            String strValueOf = String.valueOf(AnchorRecordsActivity.this.C.get(1));
            if (AnchorRecordsActivity.this.C.get(5) >= 10) {
                sb2 = new StringBuilder();
                sb2.append("");
            } else {
                sb2 = new StringBuilder();
                sb2.append(x0.IMAGE_1);
            }
            sb2.append(AnchorRecordsActivity.this.C.get(5));
            String string = sb2.toString();
            ((e) AnchorRecordsActivity.this.f27702e).R0(strValueOf + "-" + str + "-" + string, AnchorRecordsActivity.this.D);
            AnchorRecordsActivity.this.f35066u.setText(strValueOf + "-" + str + "-" + string);
        }

        @Override // hf.e
        public void b(Date date) {
        }

        @Override // hf.e
        public void onCancel() {
        }
    }

    private void A5() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(this.f35071z), Integer.parseInt(this.A) - 1, 1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Integer.parseInt(this.f35071z), Integer.parseInt(this.A) - 1, calendar.getActualMaximum(5));
        this.B = new TimePickerPopup(this).g0(false).a0(this.C).f0(TimePickerPopup.Mode.YMD).Z(calendar, calendar2).i0(new a());
        new b.C0752b(this).t(this.B).N();
    }

    @Override // cl.c.b
    public void V0(AnchorDayLivelogBean anchorDayLivelogBean) {
        this.f35067v.setText(anchorDayLivelogBean.getTicket());
        this.f35068w.setText((Integer.parseInt(anchorDayLivelogBean.getOwner_duration()) + Integer.parseInt(anchorDayLivelogBean.getDuration())) + "");
        this.f35069x.setText(anchorDayLivelogBean.getOwner_duration());
        this.f35070y.setText(anchorDayLivelogBean.getDuration());
    }

    @Override // cl.c.b
    public void e2(AnchorDayLivelogBean anchorDayLivelogBean) {
        this.f35061p.setText(anchorDayLivelogBean.getTotal_diamond());
        this.f35062q.setText(anchorDayLivelogBean.getGoldSalary());
        this.f35063r.setText(anchorDayLivelogBean.getOnlineDays());
        this.f35064s.setText(anchorDayLivelogBean.getOn_mic_time());
        this.f35065t.setText(anchorDayLivelogBean.getOn_mic_time());
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_anchor_records;
    }

    @Override // in.a
    public void g5() {
        this.f35059n = (Topbar) findViewById(R.id.common_topbar);
        this.E = (LinearLayout) findViewById(R.id.lin_top);
        this.f35060o = (TextView) findViewById(R.id.tv_date_moth);
        this.f35061p = (TextView) findViewById(R.id.tv_total_all);
        this.f35062q = (TextView) findViewById(R.id.tv_total_mic_income);
        this.f35063r = (TextView) findViewById(R.id.tv_live_days);
        this.f35064s = (TextView) findViewById(R.id.tv_live_minites_total);
        this.f35065t = (TextView) findViewById(R.id.tv_host_minutes);
        this.f35066u = (TextView) findViewById(R.id.tv_this_day);
        this.F = (LinearLayout) findViewById(R.id.ll_date);
        this.f35067v = (TextView) findViewById(R.id.tv_day_total_all);
        this.f35068w = (TextView) findViewById(R.id.tv_day_live_minites_total);
        this.f35069x = (TextView) findViewById(R.id.tv_day_live_minutes);
        this.f35070y = (TextView) findViewById(R.id.tv_day_host_minutes);
        this.F.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        StringBuilder sb2;
        String str;
        m5(true);
        t.S0(this, this.f35059n, getString(R.string.anchor_records));
        this.f35059n.setTransparent();
        this.f35059n.setTabBoldGone();
        this.f35071z = getIntent().getStringExtra("anchor_records_years");
        this.A = getIntent().getStringExtra("anchor_records_month");
        this.D = getIntent().getStringExtra("anchor_records_uid");
        this.f35060o.setText(this.f35071z + "-" + this.A);
        ((e) this.f27702e).W0(this.f35071z + "-" + this.A, this.D);
        if (this.C.get(5) >= 10) {
            sb2 = new StringBuilder();
            str = "";
        } else {
            sb2 = new StringBuilder();
            str = x0.IMAGE_1;
        }
        sb2.append(str);
        sb2.append(this.C.get(5));
        String string = sb2.toString();
        ((e) this.f27702e).R0(this.f35071z + "-" + this.A + "-" + string, this.D);
        this.f35066u.setText(this.f35071z + "-" + this.A + "-" + string);
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.ll_date) {
            return;
        }
        A5();
    }
}
