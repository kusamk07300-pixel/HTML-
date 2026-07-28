package net.babycat.live.modules.creator.ui;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cl.b;
import gl.c;
import in.b;
import java.util.ArrayList;
import java.util.List;
import net.babycat.live.model.AgencySalaryBean;
import net.babycat.live.model.InitBean;
import net.babycat.live.platform.widget.view.Topbar;
import org.litepal.LitePal;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class AgencySalaryActivity extends b<c> implements b.InterfaceC0112b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35052n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RecyclerView f35053o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f35054p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f35055q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f35056r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public bl.c f35057s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public InitBean f35058t;

    @Override // in.a
    public int e5() {
        return R.layout.act_agency_salary;
    }

    @Override // in.a
    public void g5() {
        this.f35052n = (Topbar) findViewById(R.id.common_topbar);
        this.f35056r = (TextView) findViewById(R.id.tv_radio);
        this.f35055q = (TextView) findViewById(R.id.tv_host);
        this.f35054p = (TextView) findViewById(R.id.tv_salary);
        this.f35053o = (RecyclerView) findViewById(R.id.rv_list);
    }

    @Override // in.a
    public void h5() {
        m5(true);
        this.f35052n.setTransparent();
        this.f35052n.setTabBoldGone();
        this.f35058t = (InitBean) LitePal.findFirst(InitBean.class, true);
        this.f35057s = new bl.c(new ArrayList(), this.f35058t.getSetting().getAgency_mode());
        this.f35053o.setLayoutManager(new LinearLayoutManager(this));
        this.f35053o.setAdapter(this.f35057s);
        if (this.f35058t.getSetting().getAgency_mode() == 3) {
            this.f35054p.setVisibility(0);
            this.f35055q.setVisibility(0);
            this.f35056r.setVisibility(8);
            ((c) this.f27702e).M3();
            return;
        }
        this.f35054p.setVisibility(8);
        this.f35055q.setVisibility(8);
        this.f35056r.setVisibility(0);
        ((c) this.f27702e).p3();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // cl.b.InterfaceC0112b
    public void u3(List<AgencySalaryBean> list) {
        this.f35057s.v1(list);
    }
}
