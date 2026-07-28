package net.babycat.live.modules.profile.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import em.b0;
import in.b;
import jm.m1;
import net.babycat.live.model.UserInfoDataBean;
import net.babycat.live.model.UserLevelBean;
import net.babycat.live.platform.util.r0;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.CirclePercentView;
import net.babycat.live.platform.widget.view.Topbar;
import org.litepal.LitePal;
import qmyy.babycat.live.R;
import wn.d;

/* JADX INFO: loaded from: classes4.dex */
public class MyLevelActivity extends b<m1> implements b0.b {
    public UserInfoDataBean A;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35693n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CirclePercentView f35694o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CirclePercentView f35695p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f35696q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ImageView f35697r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f35698s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f35699t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f35700u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f35701v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f35702w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f35703x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f35704y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f35705z;

    public class a implements Topbar.TopbarRightClickListener {
        public a() {
        }

        @Override // net.babycat.live.platform.widget.view.Topbar.TopbarRightClickListener
        public void rightClick() {
            MyLevelActivity.this.o5(MyLevelInfoActivity.class);
        }
    }

    @Override // em.b0.b
    public void L(UserLevelBean userLevelBean) {
        float fFloatValue = userLevelBean.getConsumption().getNext_level().getPercent().floatValue();
        float fFloatValue2 = userLevelBean.getTicket().getNext_level().getPercent().floatValue();
        this.f35694o.setPercentage(fFloatValue);
        this.f35695p.setPercentage(fFloatValue2);
        long jLongValue = userLevelBean.getConsumption().getConsumption().longValue() + userLevelBean.getConsumption().getNext_level().getNeed_sorce().longValue();
        this.f35704y.setText(userLevelBean.getConsumption().getConsumption() + "/" + jLongValue);
        long jLongValue2 = userLevelBean.getTicket().getTicket().longValue() + userLevelBean.getTicket().getNext_level().getNeed_sorce().longValue();
        this.f35705z.setText(userLevelBean.getTicket().getTicket() + "/" + jLongValue2);
        d.c(this, Integer.valueOf(r0.c(this.A.getLevel().intValue())), this.f35696q);
        d.c(this, Integer.valueOf(r0.b(this.A.getAnchor_level().intValue())), this.f35697r);
        if (userLevelBean.getConsumption().getRank().intValue() == 0) {
            this.f35698s.setText(getString(R.string.ranking, "Unplaced"));
        } else {
            this.f35698s.setText(getString(R.string.ranking, String.valueOf(userLevelBean.getConsumption().getRank())));
        }
        if (userLevelBean.getTicket().getRank().intValue() == 0) {
            this.f35699t.setText(getString(R.string.ranking, "Unplaced"));
        } else {
            this.f35699t.setText(getString(R.string.ranking, String.valueOf(userLevelBean.getTicket().getRank())));
        }
        this.f35700u.setText(getString(R.string.consumption_up, String.valueOf(userLevelBean.getConsumption().getNext_level().getNeed_sorce())));
        this.f35701v.setText(getString(R.string.income_up, String.valueOf(userLevelBean.getTicket().getNext_level().getNeed_sorce())));
        this.f35702w.setText(getString(R.string.consumption, String.valueOf(userLevelBean.getConsumption().getConsumption())));
        this.f35703x.setText(getString(R.string.income_s, String.valueOf(userLevelBean.getTicket().getTicket())));
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_my_level;
    }

    @Override // in.a
    public void g5() {
        this.f35693n = (Topbar) findViewById(R.id.common_topbar);
        this.f35694o = (CirclePercentView) findViewById(R.id.circle_progress_user);
        this.f35695p = (CirclePercentView) findViewById(R.id.circle_progress_author);
        this.f35696q = (ImageView) findViewById(R.id.iv_level);
        this.f35697r = (ImageView) findViewById(R.id.iv_level_author);
        this.f35698s = (TextView) findViewById(R.id.tv_user_rank);
        this.f35699t = (TextView) findViewById(R.id.tv_author_rank);
        this.f35700u = (TextView) findViewById(R.id.tv_user_need);
        this.f35701v = (TextView) findViewById(R.id.tv_author_need);
        this.f35702w = (TextView) findViewById(R.id.tv_user_ticket);
        this.f35703x = (TextView) findViewById(R.id.tv_author_ticket);
        this.f35704y = (TextView) findViewById(R.id.tv_user_process);
        this.f35705z = (TextView) findViewById(R.id.tv_author_process);
    }

    @Override // in.a
    public void h5() {
        m5(true);
        t.S0(this, this.f35693n, getString(R.string.my_level));
        this.f35693n.setTransparent();
        this.f35693n.setTabBoldGone();
        this.f35693n.setRigtImage(R.mipmap.what);
        this.f35693n.setOnTopbarRightClickListener(new a());
        this.A = (UserInfoDataBean) LitePal.findFirst(UserInfoDataBean.class, true);
        ((m1) this.f27702e).W();
    }

    @Override // in.a
    public View k5() {
        return null;
    }
}
