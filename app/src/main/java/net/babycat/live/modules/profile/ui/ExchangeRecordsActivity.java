package net.babycat.live.modules.profile.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.l;
import com.lxj.xpopupext.popup.TimePickerPopup;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import em.m;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import jg.f;
import jm.y;
import mg.e;
import mg.g;
import net.babycat.live.model.ExchangeLogBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.x0;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class ExchangeRecordsActivity extends in.b<y> implements m.b {
    public Topbar mCommonTopbar;
    public EditText mEdId;
    public ImageView mIvDele;
    public SmartRefreshLayout mNormalView;
    public RecyclerView mRecycler;
    public TextView mTvTime;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35542n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f35543o = x0.IMAGE_1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f35544p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f35545q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l f35546r;

    public class a implements g {
        public a() {
        }

        @Override // mg.g
        public void onRefresh(f fVar) {
            ExchangeRecordsActivity.this.f35542n = 1;
            ExchangeRecordsActivity.this.D5();
        }
    }

    public class b implements e {
        public b() {
        }

        @Override // mg.e
        public void onLoadMore(f fVar) {
            if (ExchangeRecordsActivity.this.f35545q) {
                ExchangeRecordsActivity.this.f35542n++;
                ExchangeRecordsActivity.this.D5();
            } else {
                ExchangeRecordsActivity.this.v5("no data");
                ExchangeRecordsActivity.this.mNormalView.s();
                ExchangeRecordsActivity.this.mNormalView.S();
            }
        }
    }

    public class c implements hf.e {
        public c() {
        }

        @Override // hf.e
        public void a(Date date, View view) {
            ExchangeRecordsActivity.this.f35544p = t.l0(date);
            ExchangeRecordsActivity exchangeRecordsActivity = ExchangeRecordsActivity.this;
            exchangeRecordsActivity.mTvTime.setText(exchangeRecordsActivity.f35544p);
            ExchangeRecordsActivity.this.f35542n = 1;
            ExchangeRecordsActivity.this.D5();
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
        ((y) this.f27702e).f2(this.f35542n, this.f35543o, this.f35544p);
    }

    @Override // em.m.b
    public void Y0(List<ExchangeLogBean> list, boolean z10) {
        if (this.f35542n == 1) {
            this.f35546r.v1(list);
        } else {
            this.f35546r.w(list);
        }
        this.f35545q = z10;
        this.mNormalView.s();
        this.mNormalView.S();
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_exchange_records;
    }

    @Override // in.a
    public void g5() {
        this.mCommonTopbar = (Topbar) findViewById(R.id.common_topbar);
        this.mRecycler = (RecyclerView) findViewById(R.id.recycler);
        this.mNormalView = (SmartRefreshLayout) findViewById(R.id.normal_view);
        this.mTvTime = (TextView) findViewById(R.id.tv_time);
        this.mEdId = (EditText) findViewById(R.id.ed_id);
        this.mIvDele = (ImageView) findViewById(R.id.iv_dele);
        this.mTvTime.setOnClickListener(this);
        this.mIvDele.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        m5(true);
        t.S0(this, this.mCommonTopbar, getString(R.string.exchange) + " " + getString(R.string.record));
        this.mCommonTopbar.setTabBoldGone();
        this.mCommonTopbar.setTransparent();
        this.f35546r = new l(new ArrayList());
        this.mRecycler.setLayoutManager(new LinearLayoutManager(this));
        this.mRecycler.setAdapter(this.f35546r);
        this.f35546r.c1(R.layout.view_state_empty_anchor_apply);
        this.mNormalView.d0(new a());
        this.mNormalView.O(new b());
        D5();
    }

    @Override // in.b, ln.a
    public void k4() {
        super.k4();
        int i10 = this.f35542n;
        if (i10 != 1) {
            this.f35542n = i10 - 1;
        }
        this.mNormalView.s();
        this.mNormalView.S();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 != R.id.iv_dele) {
            if (id2 != R.id.tv_time) {
                return;
            }
            new b.C0752b(this).t(new TimePickerPopup(this).a0(Calendar.getInstance()).i0(new c())).N();
        } else {
            this.f35543o = TextUtils.isEmpty(this.mEdId.getText().toString()) ? x0.IMAGE_1 : this.mEdId.getText().toString();
            this.f35542n = 1;
            D5();
        }
    }
}
