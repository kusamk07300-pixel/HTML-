package net.babycat.live.modules.profile.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.f1;
import com.chad.library.adapter.base.BaseQuickAdapter;
import em.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jm.w2;
import net.babycat.live.model.MyTransferHomeBean;
import net.babycat.live.platform.util.k0;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.x0;
import net.babycat.live.platform.widget.view.Topbar;
import q7.g;
import qmyy.babycat.live.R;
import wn.d;
import xn.b;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class MyTransferActivity extends in.b<w2> implements p0.b {
    public TextView A;
    public MyTransferHomeBean B;
    public TextView D;
    public RecyclerView E;
    public f1 F;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f35857n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Topbar f35858o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f35859p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f35860q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f35861r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f35862s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f35863t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ImageView f35864u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinearLayout f35865v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinearLayout f35866w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public EditText f35867x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f35868y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f35869z;
    public int C = 0;
    public int G = 0;
    public List<MyTransferHomeBean.RuleListDTO> H = new ArrayList();

    public class a implements g {
        public a() {
        }

        @Override // q7.g
        public void a(BaseQuickAdapter baseQuickAdapter, View view, int i10) {
            MyTransferActivity.this.F.H1(i10);
            MyTransferActivity myTransferActivity = MyTransferActivity.this;
            myTransferActivity.G = myTransferActivity.F.G1();
        }
    }

    public class b implements Topbar.TopbarRightClickListener {
        public b() {
        }

        @Override // net.babycat.live.platform.widget.view.Topbar.TopbarRightClickListener
        public void rightClick() {
            if (t.t0()) {
                MyTransferActivity.this.o5(MyTransferRecordsActivity.class);
            }
        }
    }

    public class c implements b.InterfaceC0739b {
        public c() {
        }

        @Override // xn.b.InterfaceC0739b
        public void a(MyTransferHomeBean.AgentListDTO agentListDTO) {
            MyTransferActivity myTransferActivity = MyTransferActivity.this;
            d.f(myTransferActivity, myTransferActivity.f35860q, agentListDTO.getPortrait());
            MyTransferActivity.this.f35861r.setText(agentListDTO.getNickname());
            MyTransferActivity.this.f35862s.setText("ID：" + agentListDTO.getUserId());
            MyTransferActivity.this.C = agentListDTO.getUserId().intValue();
            MyTransferActivity.this.f35863t.setVisibility(8);
        }
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_my_transfer;
    }

    @Override // in.a
    public void g5() {
        this.E = (RecyclerView) findViewById(R.id.rlv_transfer_rule);
        this.f35857n = (ImageView) findViewById(R.id.iv_top);
        this.f35858o = (Topbar) findViewById(R.id.common_topbar);
        this.f35859p = (ImageView) findViewById(R.id.iv_seles);
        this.f35860q = (ImageView) findViewById(R.id.iv_avatar);
        this.f35861r = (TextView) findViewById(R.id.tv_agent_name);
        this.f35862s = (TextView) findViewById(R.id.tv_id);
        this.f35863t = (TextView) findViewById(R.id.tv_prompt);
        this.f35864u = (ImageView) findViewById(R.id.iv_jt);
        this.f35865v = (LinearLayout) findViewById(R.id.lin_agent);
        this.f35866w = (LinearLayout) findViewById(R.id.lin_others);
        this.f35867x = (EditText) findViewById(R.id.ed_input);
        this.f35868y = (TextView) findViewById(R.id.tv_all);
        this.f35869z = (TextView) findViewById(R.id.tv_confirm);
        this.A = (TextView) findViewById(R.id.tv_desc);
        this.f35865v.setOnClickListener(this);
        this.f35869z.setOnClickListener(this);
        this.D = (TextView) findViewById(R.id.tv_total);
        this.F = new f1(new ArrayList());
        this.E.setLayoutManager(new GridLayoutManager(this, 2));
        this.E.addItemDecoration(new k0.a(this).d(20.0f).g(20.0f).f(false).b(0).a());
        this.E.setAdapter(this.F);
        this.F.c(new a());
    }

    @Override // in.a
    public void h5() {
        m5(true);
        t.S0(this, this.f35858o, getString(R.string.transfer));
        this.f35858o.setTabBoldGone();
        this.f35858o.setTransparent();
        this.f35858o.setRightTxtVisible();
        this.f35858o.setRightText(getString(R.string.record));
        this.f35858o.setOnTopbarRightClickListener(new b());
        ((w2) this.f27702e).J3();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        MyTransferHomeBean.RuleListDTO next;
        int id2 = view.getId();
        if (id2 == R.id.lin_agent) {
            if (this.B != null && t.t0()) {
                new b.C0752b(this).t(new xn.b(this, this.B.getAgentList(), new c())).N();
                return;
            }
            return;
        }
        if (id2 == R.id.tv_confirm && t.t0()) {
            if (this.C == 0) {
                v5(getString(R.string.please_select_an_agent));
                return;
            }
            MyTransferHomeBean myTransferHomeBean = this.B;
            if (myTransferHomeBean == null || myTransferHomeBean.getRuleList() == null || this.B.getRuleList().isEmpty()) {
                v5(getString(R.string.please_select_the_amount_of_recharge));
                return;
            }
            if (this.G <= 0) {
                v5(getString(R.string.please_select_the_amount_of_recharge));
                return;
            }
            Iterator<MyTransferHomeBean.RuleListDTO> it = this.F.getData().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getId() != null && next.getId().intValue() == this.G) {
                    break;
                }
            }
            if (next != null) {
                int i10 = 0;
                int iIntValue = next.getTicket() != null ? next.getTicket().intValue() : 0;
                try {
                    String diamonds = this.B.getDiamonds();
                    if (!TextUtils.isEmpty(diamonds)) {
                        i10 = Integer.parseInt(diamonds);
                    }
                } catch (NumberFormatException e10) {
                    e10.printStackTrace();
                }
                if (iIntValue > i10) {
                    v5(getString(R.string.insufficient_balance));
                    return;
                }
            }
            l2("");
            ((w2) this.f27702e).l3(this.C, x0.IMAGE_1, next.getId().intValue());
        }
    }

    @Override // em.p0.b
    public void s2() {
        ((w2) this.f27702e).J3();
    }

    @Override // em.p0.b
    public void u1(MyTransferHomeBean myTransferHomeBean) {
        this.B = myTransferHomeBean;
        this.D.setText(myTransferHomeBean.getDiamonds());
        this.f35867x.setText("");
        if (myTransferHomeBean.getRuleList() == null || myTransferHomeBean.getRuleList().isEmpty()) {
            this.E.setVisibility(8);
            this.G = 0;
        } else {
            this.H = myTransferHomeBean.getRuleList();
            this.F.v1(new ArrayList(this.H));
            this.F.H1(0);
            this.G = this.H.get(0).getId() != null ? this.H.get(0).getId().intValue() : 0;
            this.E.setVisibility(0);
        }
        k3();
    }
}
