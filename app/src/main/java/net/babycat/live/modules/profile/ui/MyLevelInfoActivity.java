package net.babycat.live.modules.profile.ui;

import android.graphics.Color;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.g0;
import com.gyf.immersionbar.ImmersionBar;
import em.c0;
import in.b;
import java.util.ArrayList;
import java.util.List;
import jm.k1;
import net.babycat.live.model.AuthorLevelBean;
import net.babycat.live.model.ConsumptionBean;
import net.babycat.live.model.UserLevelBean;
import net.babycat.live.model.UserLevelInfoBean;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class MyLevelInfoActivity extends b<k1> implements c0.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35707n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RecyclerView f35708o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public g0 f35709p;

    @Override // em.c0.b
    public void L(UserLevelBean userLevelBean) {
        k3();
        List<ConsumptionBean.LevelInfoList> list = userLevelBean.getConsumption().getList();
        List<AuthorLevelBean.LevelInfoList> list2 = userLevelBean.getTicket().getList();
        ArrayList arrayList = new ArrayList();
        int size = list.size() > list2.size() ? list.size() : list2.size();
        int i10 = 0;
        while (i10 < size) {
            UserLevelInfoBean userLevelInfoBean = new UserLevelInfoBean();
            int i11 = i10 + 1;
            userLevelInfoBean.setLevelid(Integer.valueOf(i11));
            if (i10 < list.size()) {
                userLevelInfoBean.setLevelUser(list.get(i10).getLevel_up());
            } else {
                userLevelInfoBean.setLevelUser(-1L);
            }
            if (i10 < list2.size()) {
                userLevelInfoBean.setLevelAuthor(list2.get(i10).getLevel_up());
            } else {
                userLevelInfoBean.setLevelAuthor(-1);
            }
            arrayList.add(userLevelInfoBean);
            i10 = i11;
        }
        this.f35709p.v1(arrayList);
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_my_level_info;
    }

    @Override // in.a
    public void g5() {
        this.f35707n = (Topbar) findViewById(R.id.common_topbar);
        this.f35708o = (RecyclerView) findViewById(R.id.rv_list);
    }

    @Override // in.a
    public void h5() {
        ImmersionBar.with(this).fitsSystemWindows(false).transparentStatusBar().statusBarDarkFont(true).init();
        t.S0(this, this.f35707n, getString(R.string.my_level_info));
        this.f35707n.setBg(Color.argb(0, 255, 255, 255));
        this.f35707n.setTabBoldGone();
        this.f35709p = new g0(null);
        this.f35708o.setLayoutManager(new LinearLayoutManager(this));
        this.f35708o.setAdapter(this.f35709p);
        l2("");
        ((k1) this.f27702e).W();
    }

    @Override // in.a
    public View k5() {
        return null;
    }
}
