package net.babycat.live.modules.message.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bm.g;
import com.google.gson.Gson;
import com.tencent.imsdk.v2.V2TIMConversation;
import com.tencent.imsdk.v2.V2TIMValueCallback;
import com.tencent.qcloud.tuikit.timcommon.component.UnreadCountTextView;
import com.tencent.qcloud.tuikit.tuichat.bean.message.ServiceCustormMsgBean;
import com.tencent.qcloud.tuikit.tuicontact.classicui.util.ContactStartChatUtils;
import in.b;
import java.util.Date;
import java.util.List;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import ok.e;
import qmyy.babycat.live.R;
import xl.d;

/* JADX INFO: loaded from: classes4.dex */
public class SystemMessageActivity extends b<g> implements d.b {
    public TextView A;
    public TextView B;
    public UnreadCountTextView C;
    public LinearLayout D;
    public TextView E;
    public TextView F;
    public UnreadCountTextView G;
    public LinearLayout H;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35393n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f35394o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f35395p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public UnreadCountTextView f35396q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinearLayout f35397r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f35398s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f35399t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public UnreadCountTextView f35400u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinearLayout f35401v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f35402w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f35403x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public UnreadCountTextView f35404y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public LinearLayout f35405z;

    public class a implements V2TIMValueCallback<List<V2TIMConversation>> {
        public a() {
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<V2TIMConversation> list) {
            ServiceCustormMsgBean.ServiceCustormMsgBeanMessage.CustomInfoData customInfoData;
            for (V2TIMConversation v2TIMConversation : list) {
                if (v2TIMConversation.getLastMessage() != null) {
                    customInfoData = (ServiceCustormMsgBean.ServiceCustormMsgBeanMessage.CustomInfoData) new Gson().fromJson(((ServiceCustormMsgBean.ServiceCustormMsgBeanMessage) new Gson().fromJson(new String(v2TIMConversation.getLastMessage().getCustomElem().getData()), ServiceCustormMsgBean.ServiceCustormMsgBeanMessage.class)).getData(), ServiceCustormMsgBean.ServiceCustormMsgBeanMessage.CustomInfoData.class);
                    String userID = v2TIMConversation.getUserID();
                    userID.getClass();
                    switch (userID) {
                        case "service_system":
                            SystemMessageActivity systemMessageActivity = SystemMessageActivity.this;
                            systemMessageActivity.L5(systemMessageActivity.f35398s, customInfoData.getTitle(), SystemMessageActivity.this.f35399t, new Date(v2TIMConversation.getLastMessage().getTimestamp() * 1000), v2TIMConversation.getUnreadCount(), SystemMessageActivity.this.f35400u);
                            break;
                        case "service_recharge":
                            SystemMessageActivity systemMessageActivity2 = SystemMessageActivity.this;
                            systemMessageActivity2.L5(systemMessageActivity2.A, customInfoData.getTitle(), SystemMessageActivity.this.B, new Date(v2TIMConversation.getLastMessage().getTimestamp() * 1000), v2TIMConversation.getUnreadCount(), SystemMessageActivity.this.C);
                            break;
                        case "service_agency":
                            SystemMessageActivity systemMessageActivity3 = SystemMessageActivity.this;
                            systemMessageActivity3.L5(systemMessageActivity3.E, customInfoData.getTitle(), SystemMessageActivity.this.F, new Date(v2TIMConversation.getLastMessage().getTimestamp() * 1000), v2TIMConversation.getUnreadCount(), SystemMessageActivity.this.G);
                            break;
                        case "service_family":
                            SystemMessageActivity systemMessageActivity4 = SystemMessageActivity.this;
                            systemMessageActivity4.L5(systemMessageActivity4.f35402w, customInfoData.getTitle(), SystemMessageActivity.this.f35403x, new Date(v2TIMConversation.getLastMessage().getTimestamp() * 1000), v2TIMConversation.getUnreadCount(), SystemMessageActivity.this.f35404y);
                            break;
                    }
                }
            }
        }

        @Override // com.tencent.imsdk.v2.V2TIMValueCallback
        public void onError(int i10, String str) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K5() {
        /*
            r9 = this;
            java.lang.Class<net.babycat.live.model.NoticeListBean> r0 = net.babycat.live.model.NoticeListBean.class
            r1 = 1
            java.lang.Object r0 = org.litepal.LitePal.findFirst(r0, r1)
            net.babycat.live.model.NoticeListBean r0 = (net.babycat.live.model.NoticeListBean) r0
            if (r0 == 0) goto L6f
            int r7 = r0.getRedCount()
            java.util.List r2 = r0.getNotices()
            int r2 = r2.size()
            if (r2 <= 0) goto L6f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.List r3 = r0.getNotices()
            java.util.List r4 = r0.getNotices()
            int r4 = r4.size()
            int r4 = r4 - r1
            java.lang.Object r3 = r3.get(r4)
            net.babycat.live.model.NoticeChatBean r3 = (net.babycat.live.model.NoticeChatBean) r3
            java.lang.String r3 = r3.getCreate_time()
            r2.append(r3)
            java.lang.String r3 = "000"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            long r2 = java.lang.Long.parseLong(r2)
            r4 = r2
            android.widget.TextView r3 = r9.f35394o
            java.util.List r2 = r0.getNotices()
            java.util.List r0 = r0.getNotices()
            int r0 = r0.size()
            int r0 = r0 - r1
            java.lang.Object r0 = r2.get(r0)
            net.babycat.live.model.NoticeChatBean r0 = (net.babycat.live.model.NoticeChatBean) r0
            java.lang.String r0 = r0.getContent()
            r1 = r4
            android.widget.TextView r5 = r9.f35395p
            java.util.Date r6 = new java.util.Date
            r6.<init>(r1)
            com.tencent.qcloud.tuikit.timcommon.component.UnreadCountTextView r8 = r9.f35396q
            r2 = r9
            r4 = r0
            r2.L5(r3, r4, r5, r6, r7, r8)
            goto L70
        L6f:
            r2 = r9
        L70:
            com.tencent.imsdk.v2.V2TIMConversationManager r0 = com.tencent.imsdk.v2.V2TIMManager.getConversationManager()
            java.util.List<java.lang.String> r1 = ok.b.mImUidList
            net.babycat.live.modules.message.ui.SystemMessageActivity$a r3 = new net.babycat.live.modules.message.ui.SystemMessageActivity$a
            r3.<init>()
            r0.getConversationList(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.babycat.live.modules.message.ui.SystemMessageActivity.K5():void");
    }

    public final void L5(TextView textView, String str, TextView textView2, Date date, int i10, TextView textView3) {
        textView2.setText(t.X(date));
        if (!TextUtils.isEmpty(str)) {
            if (str.contains("<p>")) {
                com.zzhoujay.richtext.a.i(str).b(false).i(false).q(textView);
            } else {
                textView.setText(str);
            }
        }
        if (i10 <= 0) {
            textView3.setVisibility(8);
            return;
        }
        textView3.setVisibility(0);
        if (i10 > 99) {
            textView3.setText("99+");
            return;
        }
        textView3.setText("" + i10);
    }

    public void M5(String str, String str2) {
        ContactStartChatUtils.startChatActivity(String.valueOf(str), 1, str2, "", 1000, 0);
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_system_message;
    }

    @Override // in.a
    public void g5() {
        this.f35393n = (Topbar) findViewById(R.id.common_topbar);
        this.f35394o = (TextView) findViewById(R.id.tv_1);
        this.f35395p = (TextView) findViewById(R.id.tv_online);
        this.f35396q = (UnreadCountTextView) findViewById(R.id.unread_count_Online);
        this.f35397r = (LinearLayout) findViewById(R.id.lin_online);
        this.f35398s = (TextView) findViewById(R.id.tv_2);
        this.f35399t = (TextView) findViewById(R.id.tv_notification);
        this.f35400u = (UnreadCountTextView) findViewById(R.id.unread_count_notification);
        this.f35401v = (LinearLayout) findViewById(R.id.lin_notification);
        this.f35402w = (TextView) findViewById(R.id.tv_3);
        this.f35403x = (TextView) findViewById(R.id.tv_family);
        this.f35404y = (UnreadCountTextView) findViewById(R.id.unread_count_family);
        this.f35405z = (LinearLayout) findViewById(R.id.lin_family);
        this.A = (TextView) findViewById(R.id.tv_4);
        this.B = (TextView) findViewById(R.id.tv_recharge);
        this.C = (UnreadCountTextView) findViewById(R.id.unread_count_recharge);
        this.D = (LinearLayout) findViewById(R.id.lin_recharge);
        this.E = (TextView) findViewById(R.id.tv_5);
        this.F = (TextView) findViewById(R.id.tv_agency);
        this.G = (UnreadCountTextView) findViewById(R.id.unread_count_agency);
        this.H = (LinearLayout) findViewById(R.id.lin_recharge_agency);
        this.f35397r.setOnClickListener(this);
        this.f35401v.setOnClickListener(this);
        this.f35405z.setOnClickListener(this);
        this.D.setOnClickListener(this);
        this.H.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        m5(true);
        t.S0(this, this.f35393n, getString(R.string.system_message));
        this.f35393n.setTransparent();
        K5();
        g5();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.lin_family /* 2131363148 */:
                if (t.t0()) {
                    M5(ok.b.IM_SERVICE_FAMILY, getString(R.string.my_family));
                }
                break;
            case R.id.lin_notification /* 2131363187 */:
                if (t.t0()) {
                    M5(ok.b.IM_SERVICE_SYSTEM, getString(R.string.system_notification));
                }
                break;
            case R.id.lin_online /* 2131363191 */:
                if (t.t0()) {
                    o5(NoticeNewsActivity.class);
                }
                break;
            case R.id.lin_recharge /* 2131363203 */:
                if (t.t0()) {
                    M5(ok.b.IM_SERVICE_RECHARGE, getString(R.string.recharge_activity));
                }
                break;
            case R.id.lin_recharge_agency /* 2131363204 */:
                if (t.t0()) {
                    M5(ok.b.IM_SERVICE_AGENCY, getString(R.string.agency_assistant));
                }
                break;
        }
    }

    @Override // in.b
    public void onReceiveEvent(b0 b0Var) {
        super.onReceiveEvent(b0Var);
        int iA = b0Var.a();
        if (iA != 1035) {
            switch (iA) {
                case e.EVENT_CLEAR_UNREAD_MSG /* 1039 */:
                case e.EVENT_SYS_CHANGE_MSG /* 1040 */:
                    this.f35396q.setVisibility(8);
                    break;
            }
            return;
        }
        K5();
    }
}
