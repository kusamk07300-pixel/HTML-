package net.babycat.live.modules.profile.ui;

import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.e;
import cf.g;
import com.luck.picture.lib.basic.PictureSelector;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.interfaces.OnResultCallbackListener;
import em.j;
import java.util.ArrayList;
import jm.s;
import net.babycat.live.model.AvatarBean;
import net.babycat.live.model.FamilyHomeBean;
import net.babycat.live.model.StsBean;
import net.babycat.live.model.UserInfoDataBean;
import net.babycat.live.platform.util.a0;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.h2;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.x0;
import net.babycat.live.platform.widget.view.GlideEngine;
import net.babycat.live.platform.widget.view.Topbar;
import org.litepal.LitePal;
import qmyy.babycat.live.R;
import wn.d;
import wn.i;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class CreateNewsFamilyActivity extends in.b<s> implements j.b {
    public View A;
    public ImageView imgs_avatar;
    public Topbar mCommonTopbar;
    public EditText mEdBriefingView;
    public EditText mNameView;
    public TextView mTvLevelJoinView;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public EditText f35516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f35517o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f35518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f35519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f35520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f35521s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f35522t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f35523u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f35524v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f35525w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public UserInfoDataBean f35526x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public View f35527y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f35528z;

    public class a implements OnResultCallbackListener<LocalMedia> {
        public a() {
        }

        @Override // com.luck.picture.lib.interfaces.OnResultCallbackListener
        public void onCancel() {
        }

        @Override // com.luck.picture.lib.interfaces.OnResultCallbackListener
        public void onResult(ArrayList<LocalMedia> arrayList) {
            CreateNewsFamilyActivity createNewsFamilyActivity = CreateNewsFamilyActivity.this;
            createNewsFamilyActivity.l2(createNewsFamilyActivity.getString(R.string.uploading));
            if (arrayList.get(0).isCut()) {
                ((s) CreateNewsFamilyActivity.this.f27702e).d(arrayList.get(0).getCutPath());
            } else {
                if (!arrayList.get(0).getPath().contains("content://")) {
                    ((s) CreateNewsFamilyActivity.this.f27702e).d(arrayList.get(0).getPath());
                    return;
                }
                ((s) CreateNewsFamilyActivity.this.f27702e).d(t.K(CreateNewsFamilyActivity.this, Uri.parse(arrayList.get(0).getPath())));
            }
        }
    }

    public class b implements h2.b {
        public b() {
        }

        @Override // net.babycat.live.platform.util.h2.b
        public void a(int i10) {
            wo.b.b("上传图片中：" + i10, new Object[0]);
        }

        @Override // net.babycat.live.platform.util.h2.b
        public void b(String str) {
            wo.b.b("上传图片失败：" + str, new Object[0]);
            CreateNewsFamilyActivity.this.k3();
        }

        @Override // net.babycat.live.platform.util.h2.b
        public void c(String str, int i10) {
            wo.b.b("上传图片：" + str, new Object[0]);
            ((s) CreateNewsFamilyActivity.this.f27702e).c(str);
        }
    }

    public class c implements g {
        public c() {
        }

        @Override // cf.g
        public void a(int i10, String str) {
            CreateNewsFamilyActivity.this.f35520r = str;
            CreateNewsFamilyActivity.this.mTvLevelJoinView.setText(str);
            CreateNewsFamilyActivity.this.mTvLevelJoinView.setTextColor(Color.parseColor("#333333"));
        }
    }

    @Override // em.j.b
    public void A3(FamilyHomeBean familyHomeBean) {
        v5(getString(R.string.created_successfully));
        finish();
    }

    @Override // em.j.b
    public void C(FamilyHomeBean familyHomeBean) {
        String name = familyHomeBean.getName();
        this.f35519q = name;
        this.mNameView.setText(name);
        String briefing = familyHomeBean.getBriefing();
        this.f35522t = briefing;
        this.mEdBriefingView.setText(briefing);
        String badge = familyHomeBean.getBadge();
        this.f35523u = badge;
        d.f(this, this.imgs_avatar, badge);
    }

    public final void C5() {
        this.f35519q = this.mNameView.getText().toString().trim();
        this.f35522t = this.mEdBriefingView.getText().toString().trim();
        this.f35521s = this.f35516n.getText().toString().trim();
        if (TextUtils.isEmpty(this.f35523u)) {
            v5(getString(R.string.upload_family_portrait));
            return;
        }
        if (TextUtils.isEmpty(this.f35519q)) {
            v5(getString(R.string.enter_family_name));
            return;
        }
        if (TextUtils.isEmpty(this.f35520r)) {
            v5(getString(R.string.select_add_level));
            return;
        }
        if (TextUtils.isEmpty(this.f35522t)) {
            v5(getString(R.string.enter_family_declaration));
            return;
        }
        int i10 = this.f35524v;
        if (i10 == 1) {
            ((s) this.f27702e).z1(this.f35519q, this.f35523u, this.f35522t, this.f35520r, this.f35521s);
        } else if (i10 == 2) {
            ((s) this.f27702e).a1(this.f35519q, this.f35523u, this.f35522t, this.f35520r);
        }
    }

    public void D5() {
        PictureSelector.create((e) this).openGallery(SelectMimeType.ofImage()).setImageEngine(GlideEngine.createGlideEngine()).setCropEngine(new i()).setMaxSelectNum(1).setMinSelectNum(1).isGif(false).isWebp(false).isPreviewImage(true).forResult(new a());
    }

    @Override // em.j.b
    public void b() {
        k3();
    }

    @Override // em.j.b
    public void c(String str) {
        k3();
        this.f35523u = str;
        d.f(this, this.imgs_avatar, str);
    }

    @Override // em.j.b
    public void d(StsBean stsBean, String str) {
        h2.a().c(this, this.f35526x.getUserId().intValue(), stsBean, str, 0, new b());
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_create_news_family;
    }

    @Override // in.a
    public void g5() {
        this.mCommonTopbar = (Topbar) findViewById(R.id.common_topbar);
        this.mNameView = (EditText) findViewById(R.id.et_name);
        this.mTvLevelJoinView = (TextView) findViewById(R.id.tv_level_join);
        this.mEdBriefingView = (EditText) findViewById(R.id.ed_briefing);
        this.imgs_avatar = (ImageView) findViewById(R.id.imgs_avatar);
        this.f35516n = (EditText) findViewById(R.id.et_tags);
        this.f35517o = (TextView) findViewById(R.id.tv_tag);
        this.f35518p = (LinearLayout) findViewById(R.id.lin_tag);
        this.f35527y = findViewById(R.id.but_cre);
        this.f35528z = findViewById(R.id.ll_level_join);
        this.A = findViewById(R.id.frame_avatar);
        this.f35527y.setOnClickListener(this);
        this.f35528z.setOnClickListener(this);
        this.A.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        t.S0(this, this.mCommonTopbar, getString(R.string.create_family));
        m5(true);
        this.mCommonTopbar.setTransparent();
        this.mCommonTopbar.setTabBoldGone();
        this.f35526x = (UserInfoDataBean) LitePal.findFirst(UserInfoDataBean.class);
        this.f35524v = getIntent().getIntExtra("create_family_type", 1);
        int intExtra = getIntent().getIntExtra("create_family_id", 0);
        this.f35525w = intExtra;
        if (this.f35524v == 2) {
            ((s) this.f27702e).J(intExtra);
        } else {
            this.f35517o.setVisibility(8);
            this.f35518p.setVisibility(8);
        }
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // em.j.b
    public void n2(FamilyHomeBean familyHomeBean) {
        v5(getString(R.string.modification_completed));
        a0.a(new b0(ok.e.EVENT_CHANGE_FAMILY));
        finish();
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.but_cre) {
            if (t.t0()) {
                C5();
            }
        } else if (id2 == R.id.frame_avatar) {
            D5();
        } else {
            if (id2 != R.id.ll_level_join) {
                return;
            }
            new b.C0752b(this).Y(true).o0(t.L(this) / 2).f(getString(R.string.add_level), new String[]{x0.IMAGE_1, "1", "2", "3", x0.IMAGE_5, "5", x0.IMAGE_7, x0.IMAGE_8, x0.IMAGE_9, "9", "10"}, new c()).N();
        }
    }

    @Override // em.j.b
    public void r0(AvatarBean avatarBean) {
        k3();
        this.f35523u = avatarBean.getSrc();
        d.f(this, this.imgs_avatar, avatarBean.getSrc());
    }
}
