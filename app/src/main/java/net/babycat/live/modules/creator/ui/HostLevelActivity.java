package net.babycat.live.modules.creator.ui;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl.f;
import cl.g;
import gl.m;
import in.b;
import java.util.ArrayList;
import net.babycat.live.model.AnthorHome;
import net.babycat.live.model.InitBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import org.litepal.LitePal;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class HostLevelActivity extends b<m> implements g.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35100n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RecyclerView f35101o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f35102p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f f35103q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InitBean f35104r;

    @Override // in.a
    public int e5() {
        return R.layout.act_host_level;
    }

    @Override // in.a
    public void g5() {
        this.f35100n = (Topbar) findViewById(R.id.common_topbar);
        this.f35101o = (RecyclerView) findViewById(R.id.rv_list);
        this.f35102p = (TextView) findViewById(R.id.tv_ratio_salary);
    }

    @Override // cl.g.b
    public void h0(AnthorHome anthorHome) {
        this.f35103q.v1(anthorHome.getSalarySetting());
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.f35100n, getString(R.string.salary_task));
        this.f35104r = (InitBean) LitePal.findFirst(InitBean.class, true);
        this.f35103q = new f(new ArrayList(), this.f35104r.getSetting().getAgency_mode());
        this.f35101o.setLayoutManager(new LinearLayoutManager(this));
        this.f35101o.setAdapter(this.f35103q);
        this.f35102p.setText(getString(this.f35104r.getSetting().getAgency_mode() == 3 ? R.string.salary : R.string.ratio));
        ((m) this.f27702e).M();
    }

    @Override // in.a
    public View k5() {
        return null;
    }
}
