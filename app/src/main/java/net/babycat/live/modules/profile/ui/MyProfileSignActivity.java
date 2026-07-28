package net.babycat.live.modules.profile.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.tencent.qcloud.tuicore.TUIConstants;
import em.k0;
import java.util.HashMap;
import jm.g2;
import net.babycat.live.platform.util.a0;
import net.babycat.live.platform.util.a2;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class MyProfileSignActivity extends in.b<g2> implements k0.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35776n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public EditText f35777o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f35778p;

    public class a implements Topbar.TopbarRightClickListener {
        public a() {
        }

        @Override // net.babycat.live.platform.widget.view.Topbar.TopbarRightClickListener
        public void rightClick() {
            String strTrim = MyProfileSignActivity.this.f35777o.getText().toString().trim();
            if (TextUtils.isEmpty(strTrim)) {
                MyProfileSignActivity myProfileSignActivity = MyProfileSignActivity.this;
                myProfileSignActivity.v5(myProfileSignActivity.getString(R.string.plese_sign));
            } else {
                HashMap map = new HashMap();
                map.put(TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE, strTrim);
                ((g2) MyProfileSignActivity.this.f27702e).P(map);
            }
        }
    }

    public class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            MyProfileSignActivity.this.z5(editable.toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z5(String str) {
        if (TextUtils.isEmpty(str.trim())) {
            this.f35776n.setRightTextTextColor(getResources().getColor(R.color.second_text_color));
        } else {
            this.f35776n.setRightTextTextColor(getResources().getColor(R.color.base_text_color));
        }
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_my_profile_sign;
    }

    @Override // in.a
    public void g5() {
        this.f35776n = (Topbar) findViewById(R.id.common_topbar);
        this.f35777o = (EditText) findViewById(R.id.et_signature);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.f35776n, getString(R.string.sign));
        this.f35776n.setRightTxtVisible();
        this.f35776n.setRightText(getString(R.string.completed));
        String stringExtra = getIntent().getStringExtra("user_signature");
        this.f35778p = stringExtra;
        this.f35777o.setText(stringExtra);
        z5(this.f35778p);
        this.f35776n.setOnTopbarRightClickListener(new a());
        this.f35777o.addTextChangedListener(new b());
    }

    @Override // em.k0.b
    public void j0() {
        v5(getString(R.string.modification_completed));
        a0.a(new b0(1013, this.f35777o.getText().toString().trim()));
        a2.c(getApplication(), getWindow());
        finish();
    }

    @Override // in.a
    public View k5() {
        return null;
    }
}
