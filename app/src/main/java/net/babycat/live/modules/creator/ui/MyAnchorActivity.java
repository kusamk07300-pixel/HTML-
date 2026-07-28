package net.babycat.live.modules.creator.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl.h;
import cl.l;
import com.lxj.xpopupext.popup.TimePickerPopup;
import gl.w;
import hf.e;
import in.b;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import net.babycat.live.model.AnthorDaySalary;
import net.babycat.live.model.AnthorHome;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.x1;
import net.babycat.live.platform.widget.view.Topbar;
import net.babycat.live.shell.WebViewActivity;
import qmyy.babycat.live.R;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class MyAnchorActivity extends b<w> implements l.b {
    public LinearLayout mAnchorUser;
    public RecyclerView mHostList;
    public ImageView mIvAsk;
    public LinearLayout mLin2;
    public LinearLayout mLin3;
    public LinearLayout mLin4;
    public LinearLayout mLinDate;
    public LinearLayout mLinDateEnd;
    public LinearLayout mLinTask;
    public LinearLayout mMyGuild;
    public RelativeLayout mR1;
    public RelativeLayout mR2;
    public RelativeLayout mReLive;
    public RelativeLayout mRePk;
    public RelativeLayout mReVoice;
    public LinearLayout mSalaryBill;
    public TextView mTvAgencyOwner;
    public TextView mTvDate;
    public TextView mTvDateEnd;
    public TextView mTvIncome;
    public TextView mTvLiveDays;
    public TextView mTvLiveHours;
    public View mV1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35165n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f35166o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h f35169r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AnthorHome.ActivityDTO f35173v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public x1 f35174w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f35175x;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f35167p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f35168q = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f35170s = 3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f35171t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f35172u = "";

    public class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f35176a;

        public a(int i10) {
            this.f35176a = i10;
        }

        @Override // hf.e
        public void a(Date date, View view) {
            String strL0 = t.l0(date);
            if (this.f35176a == 1) {
                MyAnchorActivity.this.mTvDate.setText(strL0);
                MyAnchorActivity.this.f35167p = date.getTime();
            } else {
                MyAnchorActivity.this.mTvDateEnd.setText(strL0);
                MyAnchorActivity.this.f35168q = date.getTime();
            }
            MyAnchorActivity.this.B5();
        }

        @Override // hf.e
        public void b(Date date) {
        }

        @Override // hf.e
        public void onCancel() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B5() {
        if (TimeUnit.DAYS.convert(Math.abs(this.f35167p - this.f35168q), TimeUnit.MILLISECONDS) > 30) {
            v5("only search in 30 days");
        } else {
            ((w) this.f27702e).O2(t.c1(this.f35167p), t.c1(this.f35168q));
        }
    }

    public void A5(int i10) {
        new b.C0752b(this).t(new TimePickerPopup(this).a0(Calendar.getInstance()).i0(new a(i10))).N();
    }

    @Override // cl.l.b
    public void F1(List<AnthorDaySalary> list) {
        this.f35169r.v1(list);
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_my_anchor;
    }

    @Override // in.a
    public void g5() {
        this.mIvAsk = (ImageView) findViewById(R.id.iv_ask);
        this.mMyGuild = (LinearLayout) findViewById(R.id.my_guild);
        this.mAnchorUser = (LinearLayout) findViewById(R.id.anchor_user);
        this.mSalaryBill = (LinearLayout) findViewById(R.id.salary_bill);
        this.mTvAgencyOwner = (TextView) findViewById(R.id.tv_agency_owner);
        this.mTvLiveDays = (TextView) findViewById(R.id.tv_live_days);
        this.mTvLiveHours = (TextView) findViewById(R.id.tv_live_hours);
        this.mTvIncome = (TextView) findViewById(R.id.tv_income);
        this.mTvDate = (TextView) findViewById(R.id.tv_date);
        this.mLinDate = (LinearLayout) findViewById(R.id.lin_date);
        this.mTvDateEnd = (TextView) findViewById(R.id.tv_date_end);
        this.mLinDateEnd = (LinearLayout) findViewById(R.id.lin_date_end);
        this.mHostList = (RecyclerView) findViewById(R.id.host_list);
        this.mR1 = (RelativeLayout) findViewById(R.id.f39383r1);
        this.mR2 = (RelativeLayout) findViewById(R.id.f39384r2);
        this.mLin2 = (LinearLayout) findViewById(R.id.lin2);
        this.mLin3 = (LinearLayout) findViewById(R.id.lin3);
        this.mLin4 = (LinearLayout) findViewById(R.id.lin4);
        this.mV1 = findViewById(R.id.f39386v1);
        this.f35165n = (Topbar) findViewById(R.id.common_topbar);
        this.f35166o = (TextView) findViewById(R.id.tv_live_days_target);
        this.mReLive = (RelativeLayout) findViewById(R.id.re_live);
        this.mReVoice = (RelativeLayout) findViewById(R.id.re_voice);
        this.mRePk = (RelativeLayout) findViewById(R.id.re_pk);
        this.mLinTask = (LinearLayout) findViewById(R.id.lin_task);
        this.f35175x = findViewById(R.id.diamond_rewards);
        this.mIvAsk.setOnClickListener(this);
        this.mMyGuild.setOnClickListener(this);
        this.mAnchorUser.setOnClickListener(this);
        this.mSalaryBill.setOnClickListener(this);
        this.mLinDate.setOnClickListener(this);
        this.mLinDateEnd.setOnClickListener(this);
        this.mReLive.setOnClickListener(this);
        this.mReVoice.setOnClickListener(this);
        this.mRePk.setOnClickListener(this);
        this.f35175x.setOnClickListener(this);
    }

    @Override // cl.l.b
    public void h0(AnthorHome anthorHome) {
        this.f35172u = anthorHome.getSalaryDocUrl();
        this.f35173v = anthorHome.getActivity();
        this.f35171t = anthorHome.getAgencyInfo().getAgencyId().intValue();
        this.mTvAgencyOwner.setText(anthorHome.getAgencyInfo().getName());
        this.mTvLiveDays.setText(String.valueOf(anthorHome.getTotalDiary().getDays()));
        this.f35166o.setText(String.valueOf(anthorHome.getSelfSalaryLevel().getLevelDays()));
        this.mTvLiveHours.setText(String.valueOf(anthorHome.getTotalDiary().getTotalduration()));
        this.mTvIncome.setText(String.valueOf(anthorHome.getTotalDiary().getTotalDiamond()));
        this.f35170s = anthorHome.getAgencyInfo().getType().intValue();
        if (anthorHome.getAgencyInfo().getType().intValue() == 3) {
            this.mAnchorUser.setVisibility(8);
        } else {
            this.mAnchorUser.setVisibility(0);
        }
        this.mLinTask.setVisibility(anthorHome.getActivity().getIsOpen().intValue() != 1 ? 8 : 0);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.f35165n, getString(R.string.anchor_center));
        x1 x1Var = new x1(this);
        this.f35174w = x1Var;
        x1Var.q("main_taskId", getTaskId());
        this.f35169r = new h(new ArrayList());
        this.mHostList.setLayoutManager(new LinearLayoutManager(this));
        this.mHostList.setAdapter(this.f35169r);
        this.f35167p = new Date().getTime();
        this.f35168q = new Date().getTime();
        this.mTvDate.setText(t.l0(new Date()));
        this.mTvDateEnd.setText(t.l0(new Date()));
        ((w) this.f27702e).M();
        ((w) this.f27702e).O2(t.k0(new Date()), t.k0(new Date()));
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.anchor_user /* 2131361898 */:
                if (t.t0()) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("type", 1);
                    bundle.putInt("agencyId", this.f35171t);
                    p5(HostManagerActivity.class, bundle);
                }
                break;
            case R.id.diamond_rewards /* 2131362230 */:
                if (t.t0()) {
                    o5(DiamondRewardsActivity.class);
                }
                break;
            case R.id.iv_ask /* 2131362897 */:
                if (t.t0()) {
                    if (!TextUtils.isEmpty(this.f35172u)) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("url", this.f35172u);
                        p5(WebViewActivity.class, bundle2);
                    } else {
                        o5(HostLevelActivity.class);
                    }
                }
                break;
            case R.id.lin_date /* 2131363141 */:
                A5(1);
                break;
            case R.id.lin_date_end /* 2131363142 */:
                A5(2);
                break;
            case R.id.my_guild /* 2131363504 */:
                if (t.t0()) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("show_quit", this.f35170s == 1 ? 0 : 1);
                    p5(MyGuildActivity.class, bundle3);
                }
                break;
            case R.id.re_live /* 2131363711 */:
                if (t.t0() && this.f35173v != null) {
                    Bundle bundle4 = new Bundle();
                    bundle4.putSerializable("data", this.f35173v);
                    bundle4.putInt("reward", this.f35173v.getLiveGotReward().intValue());
                    p5(TaskCollectionListActivity.class, bundle4);
                    break;
                }
                break;
            case R.id.re_pk /* 2131363720 */:
                if (t.t0() && this.f35173v != null) {
                    Bundle bundle5 = new Bundle();
                    bundle5.putInt("type", 1);
                    bundle5.putSerializable("data", this.f35173v);
                    p5(TaskCollectionListActivity.class, bundle5);
                    break;
                }
                break;
            case R.id.re_voice /* 2131363735 */:
                if (t.t0() && this.f35173v != null) {
                    Bundle bundle6 = new Bundle();
                    bundle6.putSerializable("data", this.f35173v);
                    bundle6.putInt("reward", this.f35173v.getVoiceGotReward().intValue());
                    bundle6.putInt("type", 2);
                    p5(TaskCollectionListActivity.class, bundle6);
                    break;
                }
                break;
            case R.id.salary_bill /* 2131363904 */:
                if (t.t0()) {
                    o5(SalaryBillActivity.class);
                }
                break;
        }
    }

    @Override // in.b, in.a, androidx.appcompat.app.e, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f35174w.q("main_taskId", 0);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || keyEvent.getAction() != 1) {
            return super.onKeyUp(i10, keyEvent);
        }
        this.f35174w.q("main_taskId", 0);
        finish();
        return true;
    }

    @Override // in.b
    public void onReceiveEvent(b0 b0Var) {
        super.onReceiveEvent(b0Var);
        int iA = b0Var.a();
        int i10 = 0;
        if (iA == 1112) {
            if (this.f35173v != null) {
                String str = (String) b0Var.b();
                this.f35173v.setLiveGotReward(1);
                while (i10 < this.f35173v.getLive().size()) {
                    if (this.f35173v.getLive().get(i10).getId().equals(str)) {
                        this.f35173v.getLive().get(i10).setStatus(1);
                    }
                    i10++;
                }
                return;
            }
            return;
        }
        if (iA == 1113) {
            if (this.f35173v != null) {
                String str2 = (String) b0Var.b();
                while (i10 < this.f35173v.getPk().size()) {
                    if (this.f35173v.getPk().get(i10).getId().equals(str2)) {
                        this.f35173v.getPk().get(i10).setStatus(1);
                    }
                    i10++;
                }
                return;
            }
            return;
        }
        if (iA == 1123 && this.f35173v != null) {
            String str3 = (String) b0Var.b();
            this.f35173v.setVoiceGotReward(1);
            while (i10 < this.f35173v.getVoice().size()) {
                if (this.f35173v.getVoice().get(i10).getId().equals(str3)) {
                    this.f35173v.getVoice().get(i10).setStatus(1);
                }
                i10++;
            }
        }
    }
}
