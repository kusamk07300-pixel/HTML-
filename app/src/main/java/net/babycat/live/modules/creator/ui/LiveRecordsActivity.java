package net.babycat.live.modules.creator.ui;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import cl.i;
import com.lxj.xpopupext.popup.TimePickerPopup;
import gl.q;
import hf.e;
import java.util.Calendar;
import java.util.Date;
import net.babycat.live.model.LiveInfoDayBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.x0;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class LiveRecordsActivity extends in.b<q> implements i.b {
    public TextView A;
    public String B;
    public String C;
    public TimePickerPopup D;
    public TimePickerPopup E;
    public Calendar F = Calendar.getInstance();
    public Calendar G = Calendar.getInstance();
    public LinearLayout H;
    public LinearLayout I;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35116n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f35117o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f35118p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f35119q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f35120r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f35121s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f35122t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f35123u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f35124v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f35125w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f35126x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f35127y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f35128z;

    public class a implements e {
        public a() {
        }

        @Override // hf.e
        public void a(Date date, View view) {
            StringBuilder sb2;
            String str;
            LiveRecordsActivity.this.G.setTime(date);
            LiveRecordsActivity liveRecordsActivity = LiveRecordsActivity.this;
            if (liveRecordsActivity.G.get(2) + 1 >= 10) {
                sb2 = new StringBuilder();
                str = "";
            } else {
                sb2 = new StringBuilder();
                str = x0.IMAGE_1;
            }
            sb2.append(str);
            sb2.append(LiveRecordsActivity.this.G.get(2) + 1);
            liveRecordsActivity.C = sb2.toString();
            LiveRecordsActivity liveRecordsActivity2 = LiveRecordsActivity.this;
            liveRecordsActivity2.B = String.valueOf(liveRecordsActivity2.G.get(1));
            LiveRecordsActivity.this.f35117o.setText(LiveRecordsActivity.this.B + "-" + LiveRecordsActivity.this.C);
            ((q) LiveRecordsActivity.this.f27702e).x3(LiveRecordsActivity.this.B + "-" + LiveRecordsActivity.this.C);
            ((q) LiveRecordsActivity.this.f27702e).B0(LiveRecordsActivity.this.B + "-" + LiveRecordsActivity.this.C + "-01");
            LiveRecordsActivity.this.f35124v.setText(LiveRecordsActivity.this.B + "-" + LiveRecordsActivity.this.C + "-01");
        }

        @Override // hf.e
        public void b(Date date) {
        }

        @Override // hf.e
        public void onCancel() {
        }
    }

    public class b implements e {
        public b() {
        }

        @Override // hf.e
        public void a(Date date, View view) {
            String str;
            String strValueOf;
            LiveRecordsActivity.this.F.setTime(date);
            if (LiveRecordsActivity.this.F.get(2) + 1 >= 10) {
                str = "" + (LiveRecordsActivity.this.F.get(2) + 1);
            } else {
                str = x0.IMAGE_1 + (LiveRecordsActivity.this.F.get(2) + 1);
            }
            String strValueOf2 = String.valueOf(LiveRecordsActivity.this.F.get(1));
            if (LiveRecordsActivity.this.F.get(5) >= 10) {
                strValueOf = String.valueOf(LiveRecordsActivity.this.F.get(5));
            } else {
                strValueOf = x0.IMAGE_1 + LiveRecordsActivity.this.F.get(5);
            }
            ((q) LiveRecordsActivity.this.f27702e).B0(strValueOf2 + "-" + str + "-" + strValueOf);
            LiveRecordsActivity.this.f35124v.setText(strValueOf2 + "-" + str + "-" + strValueOf);
        }

        @Override // hf.e
        public void b(Date date) {
        }

        @Override // hf.e
        public void onCancel() {
        }
    }

    private void H5() {
        this.D = new TimePickerPopup(this).g0(false).a0(this.F).f0(TimePickerPopup.Mode.YMD).i0(new b());
        new b.C0752b(this).t(this.D).N();
    }

    public final void G5() {
        this.E = new TimePickerPopup(this).a0(this.G).g0(false).f0(TimePickerPopup.Mode.YM).i0(new a());
        new b.C0752b(this).t(this.E).N();
    }

    @Override // cl.i.b
    public void O1(LiveInfoDayBean liveInfoDayBean) {
        this.f35125w.setText(liveInfoDayBean.getDay_total_income());
        this.f35126x.setText(liveInfoDayBean.getDay_total_minutes());
        this.f35127y.setText(liveInfoDayBean.getDay_host_minutes());
        this.f35128z.setText(liveInfoDayBean.getDay_live_minutes());
    }

    @Override // cl.i.b
    public void Z2(LiveInfoDayBean liveInfoDayBean) {
        this.f35118p.setText(liveInfoDayBean.getMonth_gift_income());
        this.f35121s.setText(liveInfoDayBean.getMonth_total_minutes());
        this.f35122t.setText(liveInfoDayBean.getMonth_host_minutes());
        this.f35123u.setText(liveInfoDayBean.getMonth_live_minutes());
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_live_records;
    }

    @Override // in.a
    public void g5() {
        this.f35116n = (Topbar) findViewById(R.id.common_topbar);
        this.f35117o = (TextView) findViewById(R.id.tv_date_moth);
        this.f35118p = (TextView) findViewById(R.id.tv_total_all);
        this.f35119q = (TextView) findViewById(R.id.tv_total_mic_income);
        this.f35120r = (TextView) findViewById(R.id.tv_live_days);
        this.f35121s = (TextView) findViewById(R.id.tv_live_minites_total);
        this.f35122t = (TextView) findViewById(R.id.tv_live_minutes);
        this.f35123u = (TextView) findViewById(R.id.tv_host_minutes);
        this.f35124v = (TextView) findViewById(R.id.tv_this_day);
        this.f35125w = (TextView) findViewById(R.id.tv_day_total_all);
        this.f35126x = (TextView) findViewById(R.id.tv_day_live_minites_total);
        this.f35127y = (TextView) findViewById(R.id.tv_day_live_minutes);
        this.f35128z = (TextView) findViewById(R.id.tv_day_host_minutes);
        this.A = (TextView) findViewById(R.id.tv_day_live_game_minutes);
        this.H = (LinearLayout) findViewById(R.id.re_salary_date);
        this.I = (LinearLayout) findViewById(R.id.ll_date);
        this.H.setOnClickListener(this);
        this.I.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        StringBuilder sb2;
        String str;
        m5(true);
        t.S0(this, this.f35116n, getString(R.string.anchor_records));
        this.f35116n.setTransparent();
        this.f35116n.setTabBoldGone();
        this.G.setTime(new Date());
        if (this.G.get(2) + 1 >= 10) {
            sb2 = new StringBuilder();
            str = "";
        } else {
            sb2 = new StringBuilder();
            str = x0.IMAGE_1;
        }
        sb2.append(str);
        sb2.append(this.G.get(2) + 1);
        this.C = sb2.toString();
        this.B = String.valueOf(this.G.get(1));
        this.f35117o.setText(this.B + "-" + this.C);
        ((q) this.f27702e).x3(this.B + "-" + this.C);
        ((q) this.f27702e).B0(this.B + "-" + this.C + "-01");
        this.f35124v.setText(this.B + "-" + this.C + "-01");
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.ll_date) {
            H5();
        } else {
            if (id2 != R.id.re_salary_date) {
                return;
            }
            G5();
        }
    }
}
