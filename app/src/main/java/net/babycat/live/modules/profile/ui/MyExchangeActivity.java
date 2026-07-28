package net.babycat.live.modules.profile.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import em.u;
import in.b;
import jm.u0;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class MyExchangeActivity extends b<u0> implements u.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35616n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f35617o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public EditText f35618p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f35619q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f35620r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f35621s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Integer f35622t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Integer f35623u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f35624v;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Integer numValueOf = TextUtils.isEmpty(editable.toString().trim()) ? 0 : Integer.valueOf(editable.toString().trim());
            MyExchangeActivity.this.f35617o.setText(" " + (MyExchangeActivity.this.f35623u.intValue() - numValueOf.intValue()));
            MyExchangeActivity.this.f35619q.setText(String.valueOf(((float) numValueOf.intValue()) * MyExchangeActivity.this.f35621s));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_my_exchange;
    }

    @Override // in.a
    public void g5() {
        this.f35616n = (Topbar) findViewById(R.id.common_topbar);
        this.f35617o = (TextView) findViewById(R.id.tv_gold_balance);
        this.f35618p = (EditText) findViewById(R.id.et_input);
        this.f35619q = (TextView) findViewById(R.id.tv_diamond_balance);
        this.f35620r = (TextView) findViewById(R.id.tv_convertible);
        View viewFindViewById = findViewById(R.id.tv_sumbit);
        this.f35624v = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.f35616n, getString(R.string.custom_redemption));
        this.f35621s = getIntent().getFloatExtra("ex_rate", 0.0f);
        this.f35623u = Integer.valueOf(getIntent().getIntExtra("ex_ticket", 0));
        this.f35622t = Integer.valueOf(getIntent().getIntExtra("ex_min", 0));
        this.f35617o.setText(" " + this.f35623u);
        this.f35620r.setText(" " + (this.f35623u.intValue() * this.f35621s));
        this.f35618p.addTextChangedListener(new a());
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // em.u.b
    public void o() {
        v5(getString(R.string.exchange_succeeded));
        finish();
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.tv_sumbit) {
            return;
        }
        z5();
    }

    public final void z5() {
        String strTrim = this.f35618p.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim) || Integer.valueOf(strTrim).intValue() == 0) {
            v5(getString(R.string.exte_num));
            return;
        }
        if (Integer.valueOf(strTrim).intValue() >= this.f35622t.intValue()) {
            ((u0) this.f27702e).T(strTrim);
            return;
        }
        v5(getString(R.string.exte_lower) + ": " + this.f35622t);
    }
}
