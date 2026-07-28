package net.babycat.live.modules.profile.ui;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.c;
import com.chad.library.adapter.base.BaseQuickAdapter;
import em.g;
import f.n0;
import in.b;
import java.util.ArrayList;
import java.util.List;
import jm.m;
import net.babycat.live.model.CpRelationshipBean;
import net.babycat.live.platform.util.a0;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import ok.e;
import qmyy.babycat.live.R;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class CPRelationshipActivity extends b<m> implements g.b {
    public Topbar mCommonTopbar;
    public RecyclerView mRecycler;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c f35484n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35485o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35486p = 0;

    public class a implements q7.g {

        /* JADX INFO: renamed from: net.babycat.live.modules.profile.ui.CPRelationshipActivity$a$a, reason: collision with other inner class name */
        public class C0425a implements cf.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CpRelationshipBean f35488a;

            public C0425a(CpRelationshipBean cpRelationshipBean) {
                this.f35488a = cpRelationshipBean;
            }

            @Override // cf.c
            public void onConfirm() {
                if (CPRelationshipActivity.this.f35486p <= 0) {
                    CPRelationshipActivity.this.v5("prop error");
                    return;
                }
                CPRelationshipActivity cPRelationshipActivity = CPRelationshipActivity.this;
                cPRelationshipActivity.l2(cPRelationshipActivity.getString(R.string.loading));
                ((m) CPRelationshipActivity.this.f27702e).B(CPRelationshipActivity.this.f35486p, this.f35488a.getCpUserInfoDTO().getId().intValue());
            }
        }

        public a() {
        }

        @Override // q7.g
        public void a(@n0 BaseQuickAdapter<?, ?> baseQuickAdapter, @n0 View view, int i10) {
            CpRelationshipBean cpRelationshipBean = (CpRelationshipBean) baseQuickAdapter.getData().get(i10);
            if (CPRelationshipActivity.this.f35485o == 1) {
                new b.C0752b(CPRelationshipActivity.this).Y(true).p(CPRelationshipActivity.this.getString(R.string.point_out), CPRelationshipActivity.this.getString(R.string.cancle_cp, cpRelationshipBean.getCpUserInfoDTO().getNickname()), new C0425a(cpRelationshipBean)).N();
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("my_space_uid", cpRelationshipBean.getCpUserInfoDTO().getId().intValue());
            CPRelationshipActivity.this.p5(MySpaceActivity.class, bundle);
        }
    }

    @Override // em.g.b
    public void b0() {
        k3();
        v5(getString(R.string.use_success));
        a0.a(new b0(e.CREATE_PROPS_CP_CARD, Integer.valueOf(this.f35486p)));
        finish();
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_cp_relationship;
    }

    @Override // in.a
    public void g5() {
        this.mCommonTopbar = (Topbar) findViewById(R.id.common_topbar);
        this.mRecycler = (RecyclerView) findViewById(R.id.recycler);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.mCommonTopbar, getString(R.string.cp_relationship));
        this.f35485o = getIntent().getIntExtra("my_cp_type", 0);
        this.f35486p = getIntent().getIntExtra("my_cp_props_id", 0);
        this.f35484n = new c(new ArrayList());
        this.mRecycler.setLayoutManager(new LinearLayoutManager(this));
        this.mRecycler.setAdapter(this.f35484n);
        this.f35484n.c1(R.layout.view_state_empty_anchor_apply);
        this.f35484n.c(new a());
        ((m) this.f27702e).m0();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // em.g.b
    public void v3(List<CpRelationshipBean> list) {
        this.f35484n.v1(list);
    }
}
