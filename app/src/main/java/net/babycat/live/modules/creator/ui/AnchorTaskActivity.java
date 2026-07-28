package net.babycat.live.modules.creator.ui;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cl.d;
import gl.g;
import in.b;
import java.util.ArrayList;
import net.babycat.live.model.AnchorTaskBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class AnchorTaskActivity extends b<g> implements d.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35073n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RecyclerView f35074o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f35075p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public bl.d f35076q;

    @Override // cl.d.b
    public void S1(AnchorTaskBean anchorTaskBean) {
        this.f35076q.v1(anchorTaskBean.getList());
        this.f35075p.setText(getString(R.string.ahchor_up_task, String.valueOf(Integer.parseInt(anchorTaskBean.getSelf().getRank()) + 1), anchorTaskBean.getSelf().getTotalUp()));
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_anchor_task;
    }

    @Override // in.a
    public void g5() {
        this.f35073n = (Topbar) findViewById(R.id.common_topbar);
        this.f35075p = (TextView) findViewById(R.id.tv_rank_up);
        this.f35074o = (RecyclerView) findViewById(R.id.rv_list);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.f35073n, getString(R.string.host_tasks));
        this.f35076q = new bl.d(new ArrayList());
        this.f35074o.setLayoutManager(new LinearLayoutManager(this));
        this.f35074o.setAdapter(this.f35076q);
        ((g) this.f27702e).n1();
    }

    @Override // in.a
    public View k5() {
        return null;
    }
}
