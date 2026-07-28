package net.babycat.live.modules.discover.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import in.b;
import kl.i;
import net.babycat.live.model.ShopAddressListBean;
import net.babycat.live.platform.util.a0;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import ok.e;
import ol.o;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class ShopAddNewAddressActivity extends b<o> implements i.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ShopAddressListBean f35274o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Topbar f35276q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public EditText f35277r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public EditText f35278s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public EditText f35279t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ImageView f35280u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinearLayout f35281v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RelativeLayout f35282w;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35273n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35275p = 2;

    @Override // in.a
    public int e5() {
        return R.layout.act_shop_add_new_address;
    }

    @Override // in.a
    public void g5() {
        this.f35276q = (Topbar) findViewById(R.id.common_topbar);
        this.f35277r = (EditText) findViewById(R.id.et_name);
        this.f35278s = (EditText) findViewById(R.id.et_phone);
        this.f35279t = (EditText) findViewById(R.id.et_address);
        this.f35280u = (ImageView) findViewById(R.id.iv_address);
        this.f35281v = (LinearLayout) findViewById(R.id.lin_address);
        this.f35282w = (RelativeLayout) findViewById(R.id.re_save);
        this.f35281v.setOnClickListener(this);
        this.f35282w.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        g5();
        this.f35273n = getIntent().getIntExtra("type", 0);
        this.f35274o = (ShopAddressListBean) getIntent().getSerializableExtra("data");
        t.S0(this.f27688a, this.f35276q, getString(this.f35273n == 0 ? R.string.add_new_address : R.string.edit_address));
        if (this.f35273n == 1) {
            this.f35275p = this.f35274o.getIsDefault().intValue();
            this.f35277r.setText(this.f35274o.getRealName());
            this.f35278s.setText(this.f35274o.getPhone());
            this.f35279t.setText(this.f35274o.getDetail());
            this.f35280u.setImageResource(this.f35275p == 2 ? R.mipmap.shop_address_2 : R.mipmap.shop_address_1);
        }
        this.f35282w.setOnClickListener(this);
        this.f35281v.setOnClickListener(this);
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.lin_address) {
            if (this.f35275p == 2) {
                this.f35275p = 1;
            } else {
                this.f35275p = 2;
            }
            this.f35280u.setImageResource(this.f35275p == 2 ? R.mipmap.shop_address_2 : R.mipmap.shop_address_1);
            return;
        }
        if (id2 == R.id.re_save && t.t0()) {
            if (TextUtils.isEmpty(this.f35277r.getText().toString())) {
                v5(getString(R.string.enter_recipients_name));
                return;
            }
            if (TextUtils.isEmpty(this.f35278s.getText().toString())) {
                v5(getString(R.string.enter_phone));
                return;
            }
            if (TextUtils.isEmpty(this.f35279t.getText().toString())) {
                v5(getString(R.string.enter_detailed_address));
            } else if (this.f35273n == 0) {
                ((o) this.f27702e).d3(this.f35277r.getText().toString(), this.f35278s.getText().toString(), this.f35279t.getText().toString(), this.f35275p);
            } else {
                ((o) this.f27702e).C3(this.f35274o.getId().intValue(), this.f35277r.getText().toString(), this.f35278s.getText().toString(), this.f35279t.getText().toString(), this.f35275p);
            }
        }
    }

    @Override // kl.i.b
    public void v0() {
        a0.a(new b0(e.EVENT_INVITE_MY_ADDRESS));
        finish();
    }
}
