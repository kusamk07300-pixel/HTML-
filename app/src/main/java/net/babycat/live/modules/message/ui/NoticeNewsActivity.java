package net.babycat.live.modules.message.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.g;
import com.chad.library.adapter.base.BaseQuickAdapter;
import f.n0;
import in.b;
import java.util.ArrayList;
import java.util.List;
import net.babycat.live.model.NoticeChatBean;
import net.babycat.live.model.NoticeListBean;
import net.babycat.live.platform.util.a0;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.x1;
import net.babycat.live.platform.widget.view.Topbar;
import net.babycat.live.shell.WebViewActivity;
import org.litepal.LitePal;
import q7.e;
import qmyy.babycat.live.R;
import xl.d;

/* JADX INFO: loaded from: classes4.dex */
public class NoticeNewsActivity extends b<g> implements d.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35386n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RecyclerView f35387o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public wl.d f35388p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<NoticeChatBean> f35389q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public NoticeListBean f35390r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public x1 f35391s;

    public class a implements e {
        public a() {
        }

        @Override // q7.e
        public void a(@n0 BaseQuickAdapter baseQuickAdapter, @n0 View view, int i10) {
            NoticeChatBean noticeChatBean = (NoticeChatBean) baseQuickAdapter.getData().get(i10);
            if (view.getId() == R.id.ll_chat && !TextUtils.isEmpty(noticeChatBean.getUrl())) {
                Bundle bundle = new Bundle();
                bundle.putString("title", NoticeNewsActivity.this.getString(R.string.official_notification));
                bundle.putString("url", noticeChatBean.getUrl());
                NoticeNewsActivity.this.p5(WebViewActivity.class, bundle);
            }
        }
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_notice_news;
    }

    @Override // in.a
    public void g5() {
        this.f35386n = (Topbar) findViewById(R.id.common_topbar);
        this.f35387o = (RecyclerView) findViewById(R.id.rv_list);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.f35386n, getString(R.string.official_notification));
        x1 x1Var = new x1(this);
        this.f35391s = x1Var;
        x1Var.q("main_taskId", getTaskId());
        NoticeListBean noticeListBean = (NoticeListBean) LitePal.findFirst(NoticeListBean.class, true);
        this.f35390r = noticeListBean;
        if (noticeListBean != null) {
            this.f35389q = noticeListBean.getNotices();
            x5();
        }
        com.zzhoujay.richtext.a.q(this);
        this.f35388p = new wl.d(this.f35389q);
        this.f35387o.setLayoutManager(new LinearLayoutManager(this));
        this.f35387o.setAdapter(this.f35388p);
        this.f35388p.c1(R.layout.view_state_empty_anchor_apply);
        this.f35388p.r(R.id.ll_chat);
        this.f35388p.e(new a());
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, in.a, androidx.appcompat.app.e, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f35391s.q("main_taskId", 0);
        com.zzhoujay.richtext.a.h(this);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || keyEvent.getAction() != 1) {
            return super.onKeyUp(i10, keyEvent);
        }
        this.f35391s.q("main_taskId", 0);
        finish();
        return true;
    }

    @Override // in.b
    public void onReceiveEvent(b0 b0Var) {
        super.onReceiveEvent(b0Var);
        if (b0Var.a() != 1035) {
            return;
        }
        this.f35388p.v((NoticeChatBean) b0Var.b());
        this.f35387o.scrollToPosition(this.f35388p.getItemCount() - 1);
        x5();
    }

    public final void x5() {
        this.f35390r.setRedCount(0);
        this.f35390r.save();
        a0.a(new b0(ok.e.EVENT_SYS_CHANGE_MSG, ""));
    }
}
