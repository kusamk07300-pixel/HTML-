package net.babycat.live.modules.profile.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import em.j0;
import java.util.HashMap;
import jm.c2;
import net.babycat.live.platform.util.a0;
import net.babycat.live.platform.util.a2;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.n0;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class MyProfileNameActivity extends in.b<c2> implements j0.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35770n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public EditText f35771o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f35772p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f35773q;

    public class a implements Topbar.TopbarRightClickListener {
        public a() {
        }

        @Override // net.babycat.live.platform.widget.view.Topbar.TopbarRightClickListener
        public void rightClick() {
            String strTrim = MyProfileNameActivity.this.f35771o.getText().toString().trim();
            if (TextUtils.isEmpty(strTrim)) {
                MyProfileNameActivity myProfileNameActivity = MyProfileNameActivity.this;
                myProfileNameActivity.v5(myProfileNameActivity.getString(R.string.please_nickname));
            } else {
                HashMap map = new HashMap();
                map.put("nickname", strTrim);
                ((c2) MyProfileNameActivity.this.f27702e).P(map);
            }
        }
    }

    public class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MyProfileNameActivity.this.z5(editable.toString());
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
        return R.layout.activity_my_profile_name;
    }

    @Override // in.a
    public void g5() {
        this.f35770n = (Topbar) findViewById(R.id.common_topbar);
        this.f35771o = (EditText) findViewById(R.id.et_nickname);
        ImageView imageView = (ImageView) findViewById(R.id.iv_clear);
        this.f35772p = imageView;
        imageView.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.f35770n, getString(R.string.nickname));
        this.f35770n.setRightTxtVisible();
        this.f35770n.setRightText(getString(R.string.completed));
        String stringExtra = getIntent().getStringExtra("user_name");
        this.f35773q = stringExtra;
        this.f35771o.setText(stringExtra);
        z5(this.f35773q);
        this.f35770n.setOnTopbarRightClickListener(new a());
        this.f35771o.addTextChangedListener(new b());
    }

    @Override // em.j0.b
    public void j0() {
        v5(getString(R.string.modification_completed));
        a0.a(new b0(1012, this.f35771o.getText().toString().trim()));
        a2.c(getApplication(), getWindow());
        n0.n().E(this.f35771o.getText().toString().trim());
        finish();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.iv_clear) {
            return;
        }
        this.f35771o.setText("");
    }

    public final void z5(String str) {
        if (TextUtils.isEmpty(str.trim())) {
            this.f35770n.setRightTextTextColor(getResources().getColor(R.color.second_text_color));
        } else {
            this.f35770n.setRightTextTextColor(getResources().getColor(R.color.base_text_color));
        }
    }
}
