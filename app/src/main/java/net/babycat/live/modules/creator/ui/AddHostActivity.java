package net.babycat.live.modules.creator.ui;

import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cl.a;
import com.chad.library.adapter.base.BaseQuickAdapter;
import f.n0;
import java.util.ArrayList;
import java.util.List;
import net.babycat.live.model.SearchBean;
import net.babycat.live.model.UserInfoDataBean;
import net.babycat.live.modules.profile.ui.MySpaceActivity;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import q7.e;
import q7.g;
import qmyy.babycat.live.R;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class AddHostActivity extends in.b<gl.a> implements a.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public bl.a f35038n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<UserInfoDataBean> f35039o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Handler f35040p = new Handler();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Runnable f35041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Topbar f35042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public EditText f35043s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RecyclerView f35044t;

    public class a implements g {
        public a() {
        }

        @Override // q7.g
        public void a(@n0 BaseQuickAdapter<?, ?> baseQuickAdapter, @n0 View view, int i10) {
            if (t.t0()) {
                UserInfoDataBean userInfoDataBean = (UserInfoDataBean) baseQuickAdapter.getData().get(i10);
                Bundle bundle = new Bundle();
                bundle.putInt("my_space_uid", userInfoDataBean.getUserId().intValue());
                AddHostActivity.this.p5(MySpaceActivity.class, bundle);
            }
        }
    }

    public class b implements e {

        public class a implements cf.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ UserInfoDataBean f35047a;

            public a(UserInfoDataBean userInfoDataBean) {
                this.f35047a = userInfoDataBean;
            }

            @Override // cf.c
            public void onConfirm() {
                AddHostActivity addHostActivity = AddHostActivity.this;
                addHostActivity.l2(addHostActivity.getString(R.string.loading));
                ((gl.a) AddHostActivity.this.f27702e).i3(this.f35047a.getUserId().intValue());
            }
        }

        public b() {
        }

        @Override // q7.e
        public void a(@n0 BaseQuickAdapter baseQuickAdapter, @n0 View view, int i10) {
            UserInfoDataBean userInfoDataBean = (UserInfoDataBean) baseQuickAdapter.getData().get(i10);
            if (view.getId() != R.id.image_state) {
                return;
            }
            new b.C0752b(AddHostActivity.this).p(AddHostActivity.this.getString(R.string.point_out), AddHostActivity.this.getString(R.string.joined_host, userInfoDataBean.getNickname()), new a(userInfoDataBean)).N();
        }
    }

    public class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AddHostActivity.this.z5(editable.toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35050a;

        public d(String str) {
            this.f35050a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            wo.b.b("host id： 输入结束", new Object[0]);
            ((gl.a) AddHostActivity.this.f27702e).z(this.f35050a, 2);
        }
    }

    @Override // cl.a.b
    public void W(SearchBean searchBean) {
        if (TextUtils.isEmpty(searchBean.getUserinfo().getNickname())) {
            this.f35039o.clear();
            this.f35038n.notifyDataSetChanged();
        } else {
            this.f35039o.clear();
            this.f35039o.add(searchBean.getUserinfo());
            this.f35038n.v1(this.f35039o);
            this.f35038n.notifyDataSetChanged();
        }
    }

    @Override // cl.a.b
    public void a2() {
        k3();
        v5(getString(R.string.invite_success));
    }

    @Override // cl.a.b
    public void d0() {
        this.f35039o.clear();
        this.f35038n.notifyDataSetChanged();
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_add_host;
    }

    @Override // in.a
    public void g5() {
        this.f35042r = (Topbar) findViewById(R.id.common_topbar);
        this.f35043s = (EditText) findViewById(R.id.edt_id);
        this.f35044t = (RecyclerView) findViewById(R.id.host_list);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.f35042r, getString(R.string.add_host));
        bl.a aVar = new bl.a(this.f35039o);
        this.f35038n = aVar;
        aVar.T0(true);
        this.f35038n.U0(false);
        this.f35038n.V0(BaseQuickAdapter.AnimationType.SlideInBottom);
        this.f35044t.setLayoutManager(new LinearLayoutManager(this));
        this.f35044t.setAdapter(this.f35038n);
        this.f35038n.c1(R.layout.view_state_empty_anchor_apply);
        this.f35038n.c(new a());
        this.f35038n.r(R.id.image_state);
        this.f35038n.e(new b());
        this.f35043s.addTextChangedListener(new c());
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    public void z5(String str) {
        Runnable runnable = this.f35041q;
        if (runnable != null) {
            this.f35040p.removeCallbacks(runnable);
            wo.b.b("host id： handler删除监听倒计时", new Object[0]);
        }
        Handler handler = this.f35040p;
        d dVar = new d(str);
        this.f35041q = dVar;
        handler.postDelayed(dVar, 500L);
    }
}
