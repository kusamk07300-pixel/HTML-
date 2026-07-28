package net.babycat.live.modules.discover.ui;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.b1;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.gyf.immersionbar.ImmersionBar;
import com.yy.yyeva.view.EvaAnimViewV3;
import f.n0;
import java.util.ArrayList;
import java.util.List;
import jl.o;
import kl.h;
import net.babycat.live.model.InRoombean;
import net.babycat.live.model.RoomListBean;
import net.babycat.live.model.SearchBean;
import net.babycat.live.model.SearchHistoryBean;
import net.babycat.live.model.UserInfoDataBean;
import net.babycat.live.modules.profile.ui.MyFamilyInfoActivity;
import net.babycat.live.modules.profile.ui.MySpaceActivity;
import net.babycat.live.platform.util.e2;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.x1;
import net.babycat.live.platform.widget.view.FlowLayoutManager;
import net.babycat.live.platform.widget.view.SpaceItemDecoration;
import ol.m;
import org.litepal.LitePal;
import qmyy.babycat.live.R;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class SearchActivity extends in.b<m> implements h.b {
    public UserInfoDataBean A;
    public SearchBean.RoominfoDTO B;
    public EditText mEdSearch;
    public EvaAnimViewV3 mEvFamilyBadge;
    public EvaAnimViewV3 mEvFamilyView;
    public TextView mFamilyName;
    public RecyclerView mHistoryList;
    public ImageView mImageDele;
    public ImageView mImageFamilyAvatar;
    public ImageView mImageFamilyBadge;
    public LinearLayout mLinFamily;
    public LinearLayout mLlLeft;
    public LinearLayout mSearchData;
    public LinearLayout mSearchHistory;
    public RecyclerView mSearchList;
    public ImageView mSvgaFamilyView;
    public TextView mTvFamilyBriefing;
    public TextView mTvSearchName;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f35251n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f35253p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public UserInfoDataBean f35254q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b1 f35256s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public x1 f35257t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Gson f35258u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public o f35259v;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String[] f35252o = {"android.permission.RECORD_AUDIO", "android.permission.CAMERA"};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List<SearchHistoryBean> f35255r = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List<UserInfoDataBean> f35260w = new ArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f35261x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f35262y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f35263z = 2;

    public class a extends TypeToken<List<SearchHistoryBean>> {
        public a() {
        }
    }

    public class b implements q7.e {
        public b() {
        }

        @Override // q7.e
        public void a(@n0 BaseQuickAdapter baseQuickAdapter, @n0 View view, int i10) {
            int id2 = view.getId();
            if (id2 == R.id.image_dele) {
                SearchActivity.this.f35255r.remove(i10);
                baseQuickAdapter.notifyDataSetChanged();
                return;
            }
            if (id2 != R.id.lin_history) {
                return;
            }
            SearchActivity searchActivity = SearchActivity.this;
            searchActivity.f35261x = ((SearchHistoryBean) searchActivity.f35255r.get(i10)).getSearch();
            SearchActivity searchActivity2 = SearchActivity.this;
            searchActivity2.f35263z = ((SearchHistoryBean) searchActivity2.f35255r.get(i10)).getType();
            SearchActivity searchActivity3 = SearchActivity.this;
            searchActivity3.mEdSearch.setText(searchActivity3.f35261x);
            int i11 = SearchActivity.this.f35263z;
            if (i11 == 1) {
                SearchActivity searchActivity4 = SearchActivity.this;
                searchActivity4.f35251n.setText(searchActivity4.getString(R.string.my_family));
                SearchActivity searchActivity5 = SearchActivity.this;
                searchActivity5.mEdSearch.setHint(searchActivity5.getString(R.string.search_id_family));
            } else if (i11 == 2) {
                SearchActivity searchActivity6 = SearchActivity.this;
                searchActivity6.f35251n.setText(searchActivity6.getString(R.string.user));
                SearchActivity searchActivity7 = SearchActivity.this;
                searchActivity7.mEdSearch.setHint(searchActivity7.getString(R.string.search_id));
            } else if (i11 == 3) {
                SearchActivity searchActivity8 = SearchActivity.this;
                searchActivity8.f35251n.setText(searchActivity8.getString(R.string.search_room));
                SearchActivity searchActivity9 = SearchActivity.this;
                searchActivity9.mEdSearch.setHint(searchActivity9.getString(R.string.search_id_room));
            }
            ((m) SearchActivity.this.f27702e).z(((SearchHistoryBean) SearchActivity.this.f35255r.get(i10)).getSearch(), ((SearchHistoryBean) SearchActivity.this.f35255r.get(i10)).getType());
        }
    }

    public class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence.length() < 2) {
                SearchActivity.this.f35253p.setVisibility(0);
                SearchActivity.this.f35260w.clear();
                SearchActivity.this.mSearchHistory.setVisibility(0);
                SearchActivity.this.mSearchData.setVisibility(8);
                SearchActivity.this.mLinFamily.setVisibility(8);
                SearchActivity.this.f35256s.notifyDataSetChanged();
                SearchActivity.this.f35259v.notifyDataSetChanged();
                return;
            }
            SearchActivity.this.f35253p.setVisibility(8);
            wo.b.b("输入内容：" + charSequence.toString(), new Object[0]);
            SearchActivity.this.f35261x = charSequence.toString();
            ((m) SearchActivity.this.f27702e).z(charSequence.toString(), SearchActivity.this.f35263z);
        }
    }

    public class d implements q7.g {
        public d() {
        }

        @Override // q7.g
        public void a(@n0 BaseQuickAdapter<?, ?> baseQuickAdapter, @n0 View view, int i10) {
            SearchActivity.this.A = (UserInfoDataBean) baseQuickAdapter.getData().get(i10);
            if (SearchActivity.this.f35263z == 3) {
                ((m) SearchActivity.this.f27702e).b(SearchActivity.this.A.getUserId().intValue());
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("my_space_uid", SearchActivity.this.A.getUserId().intValue());
            SearchActivity.this.p5(MySpaceActivity.class, bundle);
        }
    }

    public class e implements cf.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RoomListBean f35268a;

        public e(RoomListBean roomListBean) {
            this.f35268a = roomListBean;
        }

        @Override // cf.f
        public void a(String str) {
            this.f35268a.setPassword(str);
            SearchActivity.this.q5(this.f35268a);
        }
    }

    public class f implements cf.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RoomListBean f35270a;

        public f(RoomListBean roomListBean) {
            this.f35270a = roomListBean;
        }

        @Override // cf.f
        public void a(String str) {
            this.f35270a.setPassword(str);
            SearchActivity searchActivity = SearchActivity.this;
            searchActivity.w5(this.f35270a, searchActivity.f35254q);
        }
    }

    public class g implements cf.g {
        public g() {
        }

        @Override // cf.g
        public void a(int i10, String str) {
            SearchActivity.this.f35263z = i10 + 1;
            SearchActivity.this.f35251n.setText(str);
            SearchActivity searchActivity = SearchActivity.this;
            searchActivity.mEdSearch.setHint(i10 == 1 ? searchActivity.getString(R.string.search_id) : searchActivity.getString(R.string.search_id_family));
            if (i10 == 0) {
                SearchActivity searchActivity2 = SearchActivity.this;
                searchActivity2.mEdSearch.setHint(searchActivity2.getString(R.string.search_id_family));
            } else if (i10 == 1) {
                SearchActivity searchActivity3 = SearchActivity.this;
                searchActivity3.mEdSearch.setHint(searchActivity3.getString(R.string.search_id));
            } else {
                if (i10 != 2) {
                    return;
                }
                SearchActivity searchActivity4 = SearchActivity.this;
                searchActivity4.mEdSearch.setHint(searchActivity4.getString(R.string.search_id_room));
            }
        }
    }

    @Override // kl.h.b
    public void W(SearchBean searchBean) {
        this.f35262y = -1;
        if (searchBean.getType().intValue() == 1) {
            this.mTvSearchName.setText(getString(R.string.search_result) + ":" + getString(R.string.my_family));
            if (TextUtils.isEmpty(searchBean.getFamilyinfo().getFamilyName())) {
                this.f35260w.clear();
                this.mSearchHistory.setVisibility(8);
                this.mLinFamily.setVisibility(8);
                this.mSearchData.setVisibility(0);
                this.f35256s.notifyDataSetChanged();
                this.f35259v.notifyDataSetChanged();
                return;
            }
            this.f35260w.clear();
            this.f35259v.r1(this.f35260w);
            this.mSearchHistory.setVisibility(8);
            this.mSearchList.setVisibility(8);
            this.mSearchData.setVisibility(0);
            int i10 = 0;
            while (true) {
                if (i10 >= this.f35255r.size()) {
                    break;
                }
                if (this.f35255r.get(i10).getSearch().equals(this.f35261x)) {
                    this.f35255r.remove(i10);
                    break;
                }
                i10++;
            }
            SearchHistoryBean searchHistoryBean = new SearchHistoryBean();
            searchHistoryBean.setSearch(this.f35261x);
            searchHistoryBean.setType(this.f35263z);
            this.f35255r.add(0, searchHistoryBean);
            this.f35262y = searchBean.getFamilyinfo().getFamilyId().intValue();
            wn.d.f(this, this.mImageFamilyAvatar, searchBean.getFamilyinfo().getFamilyAvatar());
            this.mFamilyName.setText(searchBean.getFamilyinfo().getFamilyName());
            this.mTvFamilyBriefing.setText(searchBean.getFamilyinfo().getFamilyBriefing());
            if (TextUtils.isEmpty(searchBean.getFamilyinfo().getAvatarFrame())) {
                this.mSvgaFamilyView.setVisibility(0);
                this.mEvFamilyView.setVisibility(8);
                if (this.mEvFamilyView.isRunning()) {
                    this.mEvFamilyView.d(null);
                }
            } else if (searchBean.getFamilyinfo().getAvatarFrame().substring(searchBean.getFamilyinfo().getAvatarFrame().length() - 3).equals("mp4")) {
                this.mSvgaFamilyView.setVisibility(8);
                this.mEvFamilyView.setVisibility(0);
                e2.p(this, this.mEvFamilyView, searchBean.getFamilyinfo().getAvatarFrame());
            } else {
                this.mSvgaFamilyView.setVisibility(0);
                this.mEvFamilyView.setVisibility(8);
                if (this.mEvFamilyView.isRunning()) {
                    this.mEvFamilyView.d(null);
                }
                wn.d.c(this, searchBean.getFamilyinfo().getAvatarFrame(), this.mSvgaFamilyView);
            }
            if (TextUtils.isEmpty(searchBean.getFamilyinfo().getFamilyBadge())) {
                this.mImageFamilyBadge.setVisibility(0);
                this.mEvFamilyBadge.setVisibility(8);
                if (this.mEvFamilyBadge.isRunning()) {
                    this.mEvFamilyBadge.d(null);
                }
            } else if (searchBean.getFamilyinfo().getFamilyBadge().substring(searchBean.getFamilyinfo().getFamilyBadge().length() - 3).equals("mp4")) {
                this.mImageFamilyBadge.setVisibility(8);
                this.mEvFamilyBadge.setVisibility(0);
                e2.p(this, this.mEvFamilyBadge, searchBean.getFamilyinfo().getFamilyBadge());
            } else {
                this.mImageFamilyBadge.setVisibility(0);
                this.mEvFamilyBadge.setVisibility(8);
                if (this.mEvFamilyBadge.isRunning()) {
                    this.mEvFamilyBadge.d(null);
                }
                wn.d.c(this, searchBean.getFamilyinfo().getFamilyBadge(), this.mImageFamilyBadge);
            }
            this.mLinFamily.setVisibility(0);
            this.f35257t.s("historyData", this.f35258u.toJson(this.f35255r));
            return;
        }
        if (searchBean.getType().intValue() == 2) {
            this.mTvSearchName.setText(getString(R.string.search_result) + ":" + getString(R.string.user));
            if (TextUtils.isEmpty(searchBean.getUserinfo().getNickname())) {
                this.f35260w.clear();
                this.mSearchHistory.setVisibility(8);
                this.mLinFamily.setVisibility(8);
                this.mSearchData.setVisibility(0);
                this.f35256s.notifyDataSetChanged();
                this.f35259v.notifyDataSetChanged();
                return;
            }
            this.mLinFamily.setVisibility(8);
            this.f35260w.clear();
            this.f35260w.add(searchBean.getUserinfo());
            this.mSearchHistory.setVisibility(8);
            this.mSearchData.setVisibility(0);
            int i11 = 0;
            while (true) {
                if (i11 >= this.f35255r.size()) {
                    break;
                }
                if (this.f35255r.get(i11).getSearch().equals(this.f35261x)) {
                    this.f35255r.remove(i11);
                    break;
                }
                i11++;
            }
            SearchHistoryBean searchHistoryBean2 = new SearchHistoryBean();
            searchHistoryBean2.setSearch(this.f35261x);
            searchHistoryBean2.setType(this.f35263z);
            this.f35255r.add(0, searchHistoryBean2);
            this.f35259v.v1(this.f35260w);
            this.f35259v.notifyDataSetChanged();
            this.f35257t.s("historyData", this.f35258u.toJson(this.f35255r));
            return;
        }
        this.mTvSearchName.setText(getString(R.string.search_result) + ":" + getString(R.string.search_room));
        if (searchBean.getRoominfo().getRoomId() == null) {
            this.B = null;
            this.f35260w.clear();
            this.mSearchHistory.setVisibility(8);
            this.mLinFamily.setVisibility(8);
            this.mSearchData.setVisibility(0);
            this.f35256s.notifyDataSetChanged();
            this.f35259v.notifyDataSetChanged();
            return;
        }
        this.mLinFamily.setVisibility(8);
        this.B = searchBean.getRoominfo();
        this.f35260w.clear();
        UserInfoDataBean userInfoDataBean = new UserInfoDataBean();
        userInfoDataBean.setAvatar(searchBean.getRoominfo().getCover());
        userInfoDataBean.setUser_id(searchBean.getRoominfo().getRoomId());
        userInfoDataBean.setNickname(searchBean.getRoominfo().getRoomName());
        this.f35260w.add(userInfoDataBean);
        this.mSearchHistory.setVisibility(8);
        this.mSearchData.setVisibility(0);
        int i12 = 0;
        while (true) {
            if (i12 >= this.f35255r.size()) {
                break;
            }
            if (this.f35255r.get(i12).getSearch().equals(this.f35261x)) {
                this.f35255r.remove(i12);
                break;
            }
            i12++;
        }
        SearchHistoryBean searchHistoryBean3 = new SearchHistoryBean();
        searchHistoryBean3.setSearch(this.f35261x);
        searchHistoryBean3.setType(this.f35263z);
        this.f35255r.add(0, searchHistoryBean3);
        this.f35259v.v1(this.f35260w);
        this.f35259v.notifyDataSetChanged();
        this.f35257t.s("historyData", this.f35258u.toJson(this.f35255r));
    }

    @Override // kl.h.b
    public void a(InRoombean inRoombean) {
        if (this.B != null) {
            RoomListBean roomListBean = new RoomListBean();
            roomListBean.setRoomId(this.B.getRoomId());
            roomListBean.setChatroomId(this.B.getChatroomId());
            roomListBean.setCover(this.B.getCover());
            roomListBean.setMasterUid(this.B.getMasterUid());
            if (TextUtils.isEmpty(inRoombean.getIsLock())) {
                if (this.B.getLiveType().intValue() == 3) {
                    q5(roomListBean);
                    return;
                } else {
                    w5(roomListBean, this.f35254q);
                    return;
                }
            }
            if (this.B.getLiveType().intValue() == 3) {
                if (this.f35257t.l("myRoomId").equals(String.valueOf(roomListBean.getRoomId()))) {
                    q5(roomListBean);
                    return;
                } else {
                    new b.C0752b(this).I(Boolean.TRUE).B(getString(R.string.new_room_password), "", "", getString(R.string.input_room_password), new e(roomListBean), null, R.layout._xpopup_center_impl_confirm).N();
                    return;
                }
            }
            if (this.f35254q.getIs_superadmin().intValue() == 1) {
                w5(roomListBean, this.f35254q);
            } else {
                new b.C0752b(this).I(Boolean.TRUE).B(getString(R.string.new_room_password), "", "", getString(R.string.input_room_password), new f(roomListBean), null, R.layout._xpopup_center_impl_confirm).N();
            }
        }
    }

    @Override // kl.h.b
    public void d0() {
        this.f35260w.clear();
        this.mSearchHistory.setVisibility(8);
        this.mLinFamily.setVisibility(8);
        this.mSearchData.setVisibility(0);
        this.f35256s.notifyDataSetChanged();
        this.f35259v.notifyDataSetChanged();
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_search;
    }

    @Override // in.a
    public void g5() {
        this.mLlLeft = (LinearLayout) findViewById(R.id.ll_left);
        this.mEdSearch = (EditText) findViewById(R.id.ed_search);
        this.mImageDele = (ImageView) findViewById(R.id.image_dele);
        this.mHistoryList = (RecyclerView) findViewById(R.id.history_list);
        this.mSearchHistory = (LinearLayout) findViewById(R.id.search_history);
        this.mSearchList = (RecyclerView) findViewById(R.id.search_list);
        this.mSearchData = (LinearLayout) findViewById(R.id.search_data);
        this.mTvSearchName = (TextView) findViewById(R.id.tv_search_name);
        this.mImageFamilyAvatar = (ImageView) findViewById(R.id.image_family_avatar);
        this.mSvgaFamilyView = (ImageView) findViewById(R.id.svga_family_view);
        this.mEvFamilyView = (EvaAnimViewV3) findViewById(R.id.ev_family_view);
        this.mFamilyName = (TextView) findViewById(R.id.family_name);
        this.mImageFamilyBadge = (ImageView) findViewById(R.id.image_family_badge);
        this.mEvFamilyBadge = (EvaAnimViewV3) findViewById(R.id.ev_family_badge);
        this.mTvFamilyBriefing = (TextView) findViewById(R.id.tv_family_briefing);
        this.mLinFamily = (LinearLayout) findViewById(R.id.lin_family);
        this.f35251n = (TextView) findViewById(R.id.tv_search_type);
        this.f35253p = findViewById(R.id.in_lay);
        this.mLlLeft.setOnClickListener(this);
        this.mImageDele.setOnClickListener(this);
        this.mLinFamily.setOnClickListener(this);
        this.f35251n.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        ImmersionBar.with(this).fitsSystemWindows(false).transparentStatusBar().statusBarDarkFont(true).init();
        this.f35257t = new x1(this);
        this.f35258u = new Gson();
        String strL = this.f35257t.l("historyData");
        this.f35254q = (UserInfoDataBean) LitePal.findFirst(UserInfoDataBean.class, true);
        if (!TextUtils.isEmpty(strL)) {
            this.f35255r = (List) this.f35258u.fromJson(strL, new a().getType());
        }
        this.f35256s = new b1(this.f35255r);
        FlowLayoutManager flowLayoutManager = new FlowLayoutManager();
        this.mHistoryList.addItemDecoration(new SpaceItemDecoration(20));
        this.mHistoryList.setLayoutManager(flowLayoutManager);
        this.mHistoryList.setAdapter(this.f35256s);
        this.f35256s.r(R.id.lin_history, R.id.image_dele);
        this.f35256s.e(new b());
        this.mEdSearch.addTextChangedListener(new c());
        o oVar = new o(this.f35260w);
        this.f35259v = oVar;
        oVar.T0(true);
        this.f35259v.U0(false);
        this.f35259v.V0(BaseQuickAdapter.AnimationType.SlideInBottom);
        this.mSearchList.setLayoutManager(new LinearLayoutManager(this));
        this.mSearchList.setAdapter(this.f35259v);
        this.f35259v.c1(R.layout.view_state_empty_search);
        this.f35259v.c(new d());
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.image_dele /* 2131362725 */:
                this.f35255r.clear();
                this.f35257t.s("historyData", "");
                this.f35256s.notifyDataSetChanged();
                break;
            case R.id.lin_family /* 2131363148 */:
                if (t.t0()) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("family_id", this.f35262y);
                    p5(MyFamilyInfoActivity.class, bundle);
                }
                break;
            case R.id.ll_left /* 2131363318 */:
                finish();
                break;
            case R.id.tv_search_type /* 2131364580 */:
                new b.C0752b(this).Y(true).f("", new String[]{getString(R.string.my_family), getString(R.string.user), getString(R.string.search_room)}, new g()).N();
                break;
        }
    }
}
