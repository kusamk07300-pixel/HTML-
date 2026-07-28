package net.babycat.live.platform.widget.chat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import ao.r;
import com.chad.library.adapter.base.BaseQuickAdapter;
import f.n0;
import f.p0;
import java.util.ArrayList;
import java.util.List;
import net.babycat.live.model.ChatListLayoutBean;
import net.babycat.live.model.InitBean;
import org.litepal.LitePal;
import q7.e;
import q7.g;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes3.dex */
public class b extends LinearLayout implements net.babycat.live.platform.widget.chat.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SmoothScrollRecyclerView f37131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f37132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<ChatListLayoutBean> f37133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InitBean f37134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ChatListLayoutBean f37135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f37136f;
    public c listener;

    public class a implements g {
        public a() {
        }

        @Override // q7.g
        public void a(@n0 BaseQuickAdapter<?, ?> baseQuickAdapter, @n0 View view, int i10) {
            c cVar;
            ChatListLayoutBean chatListLayoutBean = (ChatListLayoutBean) baseQuickAdapter.j0(i10);
            if (chatListLayoutBean == null || chatListLayoutBean.getItemType() != 1 || (cVar = b.this.listener) == null) {
                return;
            }
            cVar.a(chatListLayoutBean.getUserId().intValue());
        }
    }

    /* JADX INFO: renamed from: net.babycat.live.platform.widget.chat.b$b, reason: collision with other inner class name */
    public class C0455b implements e {
        public C0455b() {
        }

        @Override // q7.e
        public void a(@n0 BaseQuickAdapter baseQuickAdapter, @n0 View view, int i10) {
            c cVar;
            ChatListLayoutBean chatListLayoutBean = (ChatListLayoutBean) baseQuickAdapter.j0(i10);
            if (chatListLayoutBean == null || chatListLayoutBean.getUserId() == null || (cVar = b.this.listener) == null) {
                return;
            }
            cVar.a(chatListLayoutBean.getUserId().intValue());
        }
    }

    public interface c {
        void a(int i10);
    }

    public b(Context context) {
        super(context);
        this.f37136f = null;
        LayoutInflater.from(context).inflate(R.layout.live_chat_container_layout, this);
        d();
    }

    @Override // net.babycat.live.platform.widget.chat.a
    public void a() {
        this.f37132b.r1(new ArrayList());
        this.f37133c.clear();
    }

    @Override // net.babycat.live.platform.widget.chat.a
    public void b() {
        this.f37132b.notifyDataSetChanged();
        e();
    }

    @Override // net.babycat.live.platform.widget.chat.a
    public void c(c cVar) {
        this.listener = cVar;
    }

    public final void d() {
        this.f37133c = new ArrayList();
        this.f37135e = new ChatListLayoutBean();
        InitBean initBean = (InitBean) LitePal.findFirst(InitBean.class, true);
        this.f37134d = initBean;
        if (initBean != null) {
            this.f37135e.setFieldType(0);
            this.f37135e.setContent(this.f37134d.getSetting().getRoom_warning());
        }
        this.f37133c.add(this.f37135e);
        this.f37131a = (SmoothScrollRecyclerView) findViewById(R.id.chat_list);
        this.f37132b = new r(this.f37133c);
        this.f37131a.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f37131a.setAdapter(this.f37132b);
        if (this.f37131a.getRecycledViewPool() != null) {
            this.f37131a.getRecycledViewPool().n(0, 10);
        }
        this.f37132b.c(new a());
        this.f37132b.r(R.id.lin_chat_top, R.id.image_identity);
        this.f37132b.e(new C0455b());
    }

    public final void e() {
        int itemCount = this.f37132b.getItemCount() - 1;
        if (itemCount >= 0) {
            this.f37131a.scrollToPosition(itemCount);
        }
    }

    public void f() {
        this.f37133c.clear();
        if (this.f37134d != null) {
            this.f37135e.setFieldType(0);
            this.f37135e.setContent(this.f37134d.getSetting().getRoom_warning());
        }
        this.f37133c.add(this.f37135e);
        this.f37132b.r1(this.f37133c);
    }

    public Integer getFilterType() {
        return this.f37136f;
    }

    @Override // net.babycat.live.platform.widget.chat.a
    public void setChatListData(ChatListLayoutBean chatListLayoutBean) {
        Integer num = this.f37136f;
        if (num != null) {
            if (num.intValue() == 3) {
                if (chatListLayoutBean.getItemType() != 3 && chatListLayoutBean.getItemType() != 7) {
                    return;
                }
            } else if (chatListLayoutBean.getItemType() != this.f37136f.intValue()) {
                return;
            }
        }
        this.f37132b.v(chatListLayoutBean);
        e();
    }

    public void setFilterType(Integer num) {
        List<ChatListLayoutBean> list;
        this.f37136f = num;
        if (num == null || (list = this.f37133c) == null || list.isEmpty() || this.f37133c.get(0).getItemType() != 0) {
            return;
        }
        this.f37133c.remove(0);
        r rVar = this.f37132b;
        if (rVar != null) {
            rVar.notifyItemRemoved(0);
        }
    }

    @Override // net.babycat.live.platform.widget.chat.a
    public void setGameHeight(int i10) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f37131a.getLayoutParams();
        layoutParams.height = i10;
        this.f37131a.setLayoutParams(layoutParams);
    }

    @Override // net.babycat.live.platform.widget.chat.a
    public void setHeight(int i10) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f37131a.getLayoutParams();
        layoutParams.height = i10 - 100;
        this.f37131a.setLayoutParams(layoutParams);
    }

    public b(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37136f = null;
        LayoutInflater.from(context).inflate(R.layout.live_chat_container_layout, this);
        d();
    }
}
