package net.babycat.live.modules.profile.ui;

import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import em.d;
import jm.g;
import net.babycat.live.model.PopUpBean;
import net.babycat.live.model.UserRoleBean;
import net.babycat.live.platform.util.a0;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;
import xn.q2;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class AgentTopUpActivity extends in.b<g> implements d.b {
    public Topbar mCommonTopbar;
    public EditText mEdId;
    public EditText mEdInput;
    public ImageView mIvAvatar;
    public ImageView mIvDele;
    public ImageView mIvSeles;
    public ImageView mIvTop;
    public LinearLayout mLinOthers;
    public LinearLayout mLinSearch;
    public LinearLayout mLinUser;
    public TextView mTvAll;
    public TextView mTvConfirm;
    public TextView mTvId;
    public TextView mTvIdentity;
    public TextView mTvNames;
    public TextView mTvTotal;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Runnable f35444p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public UserRoleBean f35445q;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Integer f35442n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Handler f35443o = new Handler();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Integer f35446r = 0;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Integer numValueOf = TextUtils.isEmpty(editable.toString().trim()) ? 0 : Integer.valueOf(editable.toString().trim());
            if (numValueOf.intValue() != 0 && numValueOf.intValue() > AgentTopUpActivity.this.f35442n.intValue()) {
                AgentTopUpActivity.this.mEdInput.setText(String.valueOf(AgentTopUpActivity.this.f35442n));
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AgentTopUpActivity.this.B5(editable.toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35449a;

        public c(String str) {
            this.f35449a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            wo.b.b("host id： 输入结束", new Object[0]);
            ((g) AgentTopUpActivity.this.f27702e).P2(this.f35449a);
        }
    }

    public class d implements q2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35451a;

        public d(String str) {
            this.f35451a = str;
        }

        @Override // xn.q2.b
        public void a(String str) {
            ((g) AgentTopUpActivity.this.f27702e).E3(this.f35451a, String.valueOf(AgentTopUpActivity.this.f35445q.getUid()), str);
        }
    }

    public void B5(String str) {
        Runnable runnable = this.f35444p;
        if (runnable != null) {
            this.f35443o.removeCallbacks(runnable);
            wo.b.b("host id： handler删除监听倒计时", new Object[0]);
        }
        Handler handler = this.f35443o;
        c cVar = new c(str);
        this.f35444p = cVar;
        handler.postDelayed(cVar, 500L);
    }

    @Override // em.d.b
    public void L0() {
        this.mLinUser.setVisibility(8);
        this.mIvAvatar.setImageResource(R.mipmap.logo_blak);
        this.mTvId.setText("");
        this.mTvIdentity.setText("");
        this.f35445q = null;
    }

    @Override // em.d.b
    public void b4(UserRoleBean userRoleBean) {
        this.f35445q = userRoleBean;
        if (TextUtils.isEmpty(userRoleBean.getAvatar())) {
            this.mLinUser.setVisibility(8);
            this.mIvAvatar.setImageResource(R.mipmap.logo_blak);
            this.mTvNames.setText("");
            this.mTvId.setText("");
            this.mTvIdentity.setText("");
            return;
        }
        this.mLinUser.setVisibility(0);
        wn.d.f(this, this.mIvAvatar, userRoleBean.getAvatar());
        this.mTvNames.setText(userRoleBean.getNickname());
        this.mTvId.setText("ID:" + userRoleBean.getUid());
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_agent_top_up;
    }

    @Override // in.a
    public void g5() {
        this.mIvTop = (ImageView) findViewById(R.id.iv_top);
        this.mCommonTopbar = (Topbar) findViewById(R.id.common_topbar);
        this.mIvSeles = (ImageView) findViewById(R.id.iv_seles);
        this.mEdId = (EditText) findViewById(R.id.ed_id);
        this.mIvDele = (ImageView) findViewById(R.id.iv_dele);
        this.mLinSearch = (LinearLayout) findViewById(R.id.lin_search);
        this.mIvAvatar = (ImageView) findViewById(R.id.iv_avatar);
        this.mTvNames = (TextView) findViewById(R.id.tv_names);
        this.mTvId = (TextView) findViewById(R.id.tv_id);
        this.mTvIdentity = (TextView) findViewById(R.id.tv_identity);
        this.mLinUser = (LinearLayout) findViewById(R.id.lin_user);
        this.mLinOthers = (LinearLayout) findViewById(R.id.lin_others);
        this.mEdInput = (EditText) findViewById(R.id.ed_input);
        this.mTvAll = (TextView) findViewById(R.id.tv_all);
        this.mTvTotal = (TextView) findViewById(R.id.tv_total);
        this.mTvConfirm = (TextView) findViewById(R.id.tv_confirm);
        this.mIvDele.setOnClickListener(this);
        this.mTvAll.setOnClickListener(this);
        this.mTvConfirm.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        m5(true);
        this.mCommonTopbar.setTabBoldGone();
        this.mCommonTopbar.setTransparent();
        t.S0(this, this.mCommonTopbar, "Top up");
        ((g) this.f27702e).d2();
        this.mEdInput.addTextChangedListener(new a());
        this.mEdId.addTextChangedListener(new b());
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // em.d.b
    public void o() {
        ((g) this.f27702e).d2();
        a0.a(new b0(1107));
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.iv_dele) {
            this.mEdId.setText("");
        } else if (id2 == R.id.tv_all) {
            this.mEdInput.setText(String.valueOf(this.f35442n));
            return;
        } else if (id2 != R.id.tv_confirm) {
            return;
        }
        String strTrim = this.mEdInput.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim) || Integer.valueOf(strTrim).intValue() == 0) {
            v5(getString(R.string.exte_num));
        } else if (this.f35445q == null) {
            v5(getString(R.string.give_id));
        } else {
            new b.C0752b(this).Y(false).t(new q2(this, new d(strTrim))).N();
        }
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        ((g) this.f27702e).d2();
    }

    @Override // em.d.b
    public void u4(PopUpBean popUpBean) {
        Integer coin = popUpBean.getCoin();
        this.f35442n = coin;
        this.mTvTotal.setText(String.valueOf(coin));
    }
}
