package net.babycat.live.modules.profile.ui;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cf.c;
import com.amazonaws.util.s;
import com.chad.library.adapter.base.BaseQuickAdapter;
import em.a0;
import f.n0;
import java.util.ArrayList;
import jm.i1;
import net.babycat.live.model.CurrencyRateBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import q7.g;
import qmyy.babycat.live.R;
import to.k;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class MyGoldExchangeActivity extends in.b<i1> implements a0.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35684n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f35685o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RecyclerView f35686p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ao.a0 f35687q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Boolean f35688r = Boolean.FALSE;

    public class a implements Topbar.TopbarRightClickListener {
        public a() {
        }

        @Override // net.babycat.live.platform.widget.view.Topbar.TopbarRightClickListener
        public void rightClick() {
            if (t.t0()) {
                MyGoldExchangeActivity.this.o5(ExchangeRecordsActivity.class);
            }
        }
    }

    public class b implements g {

        public class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CurrencyRateBean.QuickExchangeDTO f35691a;

            public a(CurrencyRateBean.QuickExchangeDTO quickExchangeDTO) {
                this.f35691a = quickExchangeDTO;
            }

            @Override // cf.c
            public void onConfirm() {
                MyGoldExchangeActivity myGoldExchangeActivity = MyGoldExchangeActivity.this;
                myGoldExchangeActivity.l2(myGoldExchangeActivity.getString(R.string.loading));
                ((i1) MyGoldExchangeActivity.this.f27702e).T(this.f35691a.getTicket());
            }
        }

        public b() {
        }

        @Override // q7.g
        public void a(@n0 @k BaseQuickAdapter<?, ?> baseQuickAdapter, @n0 @k View view, int i10) {
            CurrencyRateBean.QuickExchangeDTO quickExchangeDTO = (CurrencyRateBean.QuickExchangeDTO) baseQuickAdapter.getData().get(i10);
            if (!MyGoldExchangeActivity.this.f35688r.booleanValue()) {
                MyGoldExchangeActivity myGoldExchangeActivity = MyGoldExchangeActivity.this;
                myGoldExchangeActivity.v5(myGoldExchangeActivity.getString(R.string.read_and_agree_agreement_ex));
                return;
            }
            new b.C0752b(MyGoldExchangeActivity.this).p(MyGoldExchangeActivity.this.getString(R.string.point_out), MyGoldExchangeActivity.this.getString(R.string.exchange) + " " + quickExchangeDTO.getCoin() + " " + MyGoldExchangeActivity.this.getString(R.string.diamond) + s.f13035a + MyGoldExchangeActivity.this.getString(R.string.will_deduct) + " " + quickExchangeDTO.getTicket() + " " + MyGoldExchangeActivity.this.getString(R.string.gold) + s.f13035a + MyGoldExchangeActivity.this.getString(R.string.exchange_it), new a(quickExchangeDTO)).N();
        }
    }

    @Override // em.a0.b
    public void I2(CurrencyRateBean currencyRateBean) {
        this.f35685o.setText(getString(R.string.my_gold_coin) + ": " + currencyRateBean.getRealTicket());
        this.f35687q.v1(currencyRateBean.getQuickList());
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_my_gold_exchange;
    }

    @Override // in.a
    public void g5() {
        this.f35684n = (Topbar) findViewById(R.id.common_topbar);
        this.f35685o = (TextView) findViewById(R.id.tv_my_gold);
        this.f35686p = (RecyclerView) findViewById(R.id.rv_list);
    }

    @Override // in.a
    public void h5() {
        m5(true);
        t.S0(this, this.f35684n, getString(R.string.exchange));
        this.f35684n.setTabBoldGone();
        this.f35684n.setTransparent();
        this.f35684n.setRightText(getString(R.string.record));
        this.f35684n.setRightTxtVisible();
        this.f35684n.setOnTopbarRightClickListener(new a());
        this.f35687q = new ao.a0(new ArrayList());
        this.f35686p.setLayoutManager(new LinearLayoutManager(this));
        this.f35686p.setAdapter(this.f35687q);
        this.f35687q.c(new b());
        this.f35688r = Boolean.TRUE;
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // em.a0.b
    public void o() {
        k3();
        v5(getString(R.string.exchange_succeeded));
        ((i1) this.f27702e).h0();
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        ((i1) this.f27702e).h0();
    }
}
