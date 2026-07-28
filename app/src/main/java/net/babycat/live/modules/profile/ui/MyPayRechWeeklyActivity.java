package net.babycat.live.modules.profile.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.t0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.gyf.immersionbar.ImmersionBar;
import em.g0;
import f.n0;
import in.b;
import java.util.ArrayList;
import java.util.List;
import jm.w1;
import net.babycat.live.model.ChargeWeekRankBean;
import net.babycat.live.platform.util.b1;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.x0;
import net.babycat.live.platform.widget.view.Topbar;
import q7.g;
import qmyy.babycat.live.R;
import wn.d;

/* JADX INFO: loaded from: classes4.dex */
public class MyPayRechWeeklyActivity extends b<w1> implements g0.b {
    public ImageView mCivTop1;
    public ImageView mCivTop2;
    public ImageView mCivTop3;
    public LinearLayout mLlTop1;
    public LinearLayout mLlTop2;
    public LinearLayout mLlTop3;
    public RecyclerView mRvList;
    public TextView mTvNameTop1;
    public TextView mTvNameTop2;
    public TextView mTvNameTop3;
    public TextView mTvTotalTop1;
    public TextView mTvTotalTop2;
    public TextView mTvTotalTop3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35730n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List<ChargeWeekRankBean> f35731o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public t0 f35732p;

    public class a implements g {
        public a() {
        }

        @Override // q7.g
        public void a(@n0 BaseQuickAdapter<?, ?> baseQuickAdapter, @n0 View view, int i10) {
            if (t.t0()) {
                ChargeWeekRankBean chargeWeekRankBean = (ChargeWeekRankBean) baseQuickAdapter.getData().get(i10);
                Bundle bundle = new Bundle();
                bundle.putInt("my_space_uid", chargeWeekRankBean.getUid().intValue());
                MyPayRechWeeklyActivity.this.p5(MySpaceActivity.class, bundle);
            }
        }
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_my_pay_weekly;
    }

    @Override // in.a
    public void g5() {
        this.mCivTop1 = (ImageView) findViewById(R.id.civ_top1);
        this.mTvNameTop1 = (TextView) findViewById(R.id.tv_name_top1);
        this.mTvTotalTop1 = (TextView) findViewById(R.id.tv_total_top1);
        this.mLlTop1 = (LinearLayout) findViewById(R.id.ll_top1);
        this.mCivTop2 = (ImageView) findViewById(R.id.civ_top2);
        this.mTvNameTop2 = (TextView) findViewById(R.id.tv_name_top2);
        this.mTvTotalTop2 = (TextView) findViewById(R.id.tv_total_top2);
        this.mLlTop2 = (LinearLayout) findViewById(R.id.ll_top2);
        this.mCivTop3 = (ImageView) findViewById(R.id.civ_top3);
        this.mTvNameTop3 = (TextView) findViewById(R.id.tv_name_top3);
        this.mTvTotalTop3 = (TextView) findViewById(R.id.tv_total_top3);
        this.mLlTop3 = (LinearLayout) findViewById(R.id.ll_top3);
        this.mRvList = (RecyclerView) findViewById(R.id.rv_list);
        this.f35730n = (Topbar) findViewById(R.id.common_topbar);
        this.mLlTop1.setOnClickListener(this);
        this.mLlTop2.setOnClickListener(this);
        this.mLlTop3.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        ImmersionBar.with(this).fitsSystemWindows(false).transparentStatusBar().statusBarDarkFont(false).init();
        t.S0(this, this.f35730n, getString(R.string.weekly_list));
        this.f35730n.setTabBoldGone();
        this.f35730n.setTopBarWhite();
        l2("");
        this.f35732p = new t0(new ArrayList());
        this.mRvList.setLayoutManager(new LinearLayoutManager(this));
        this.mRvList.setAdapter(this.f35732p);
        this.f35732p.c1(R.layout.view_state_empty_anchor_apply);
        ((w1) this.f27702e).R();
        this.f35732p.c(new a());
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ll_top1 /* 2131363341 */:
                if (t.t0() && this.f35731o.size() != 0) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("my_space_uid", this.f35731o.get(0).getUid().intValue());
                    p5(MySpaceActivity.class, bundle);
                    break;
                }
                break;
            case R.id.ll_top2 /* 2131363342 */:
                if (t.t0() && this.f35731o.size() >= 2) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("my_space_uid", this.f35731o.get(1).getUid().intValue());
                    p5(MySpaceActivity.class, bundle2);
                    break;
                }
                break;
            case R.id.ll_top3 /* 2131363343 */:
                if (t.t0() && this.f35731o.size() == 3) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("my_space_uid", this.f35731o.get(2).getUid().intValue());
                    p5(MySpaceActivity.class, bundle3);
                    break;
                }
                break;
        }
    }

    @Override // em.g0.b
    public void p0(List<ChargeWeekRankBean> list) {
        k3();
        this.f35731o.clear();
        this.mTvNameTop1.setText("");
        this.mTvTotalTop1.setText(x0.IMAGE_1);
        this.mCivTop1.setImageResource(R.mipmap.circle_logo);
        this.mTvNameTop2.setText("");
        this.mTvTotalTop2.setText(x0.IMAGE_1);
        this.mCivTop2.setImageResource(R.mipmap.circle_logo);
        this.mTvNameTop3.setText("");
        this.mTvTotalTop3.setText(x0.IMAGE_1);
        this.mCivTop3.setImageResource(R.mipmap.circle_logo);
        if (list.size() == 1) {
            this.f35731o.add(list.get(0));
            d.g(this, list.get(0).getUser().getAvatar(), this.mCivTop1);
            this.mTvNameTop1.setText(list.get(0).getUser().getNickname());
            this.mTvTotalTop1.setText(b1.a(list.get(0).getTotal().intValue()));
            list.remove(0);
            return;
        }
        if (list.size() == 2) {
            this.f35731o.add(list.get(0));
            this.f35731o.add(list.get(1));
            d.g(this, list.get(0).getUser().getAvatar(), this.mCivTop1);
            this.mTvNameTop1.setText(list.get(0).getUser().getNickname());
            this.mTvTotalTop1.setText(b1.a(list.get(0).getTotal().intValue()));
            list.remove(0);
            d.g(this, list.get(0).getUser().getAvatar(), this.mCivTop2);
            this.mTvNameTop2.setText(list.get(0).getUser().getNickname());
            this.mTvTotalTop2.setText(b1.a(list.get(0).getTotal().intValue()));
            list.remove(0);
            return;
        }
        if (list.size() >= 3) {
            this.f35731o.add(list.get(0));
            this.f35731o.add(list.get(1));
            this.f35731o.add(list.get(2));
            d.g(this, list.get(0).getUser().getAvatar(), this.mCivTop1);
            this.mTvNameTop1.setText(list.get(0).getUser().getNickname());
            this.mTvTotalTop1.setText(b1.a(list.get(0).getTotal().intValue()));
            list.remove(0);
            d.g(this, list.get(0).getUser().getAvatar(), this.mCivTop2);
            this.mTvNameTop2.setText(list.get(0).getUser().getNickname());
            this.mTvTotalTop2.setText(b1.a(list.get(0).getTotal().intValue()));
            list.remove(0);
            d.g(this, list.get(0).getUser().getAvatar(), this.mCivTop3);
            this.mTvNameTop3.setText(list.get(0).getUser().getNickname());
            this.mTvTotalTop3.setText(b1.a(list.get(0).getTotal().intValue()));
            list.remove(0);
            this.f35732p.v1(list);
        }
    }
}
