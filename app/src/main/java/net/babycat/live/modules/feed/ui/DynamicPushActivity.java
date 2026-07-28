package net.babycat.live.modules.feed.ui;

import af.j;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.q0;
import cf.h;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.luck.picture.lib.basic.PictureSelector;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.entity.LocalMedia;
import f.n0;
import java.util.ArrayList;
import java.util.List;
import net.babycat.live.model.AvatarBean;
import net.babycat.live.model.StsBean;
import net.babycat.live.model.UserInfoDataBean;
import net.babycat.live.platform.util.a0;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.h2;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.GlideEngine;
import net.babycat.live.platform.widget.view.Topbar;
import org.litepal.LitePal;
import q7.e;
import qmyy.babycat.live.R;
import sl.d;
import ul.g;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class DynamicPushActivity extends in.b<g> implements d.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35336n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RecyclerView f35337o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public EditText f35338p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public q0 f35339q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List<String> f35340r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List<String> f35341s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Boolean f35342t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Boolean f35343u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f35344v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f35345w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public UserInfoDataBean f35346x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public StsBean f35347y;

    public class a implements Topbar.TopbarRightClickListener {
        public a() {
        }

        @Override // net.babycat.live.platform.widget.view.Topbar.TopbarRightClickListener
        public void rightClick() {
            DynamicPushActivity.this.G5();
        }
    }

    public class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable.toString().trim())) {
                DynamicPushActivity.this.f35336n.setRightTextBackground(R.mipmap.my_no_commint);
                DynamicPushActivity dynamicPushActivity = DynamicPushActivity.this;
                dynamicPushActivity.f35336n.setRightTextTextColor(dynamicPushActivity.getResources().getColor(R.color.second_text_color));
            } else {
                DynamicPushActivity.this.f35336n.setRightTextBackground(R.mipmap.dy_push_btn);
                DynamicPushActivity dynamicPushActivity2 = DynamicPushActivity.this;
                dynamicPushActivity2.f35336n.setRightTextTextColor(dynamicPushActivity2.getResources().getColor(R.color.white));
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class c implements e {

        public class a implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ImageView f35351a;

            public a(ImageView imageView) {
                this.f35351a = imageView;
            }

            @Override // cf.h
            public void onSrcViewUpdate(@n0 j jVar, int i10) {
                jVar.n0((ImageView) ((RelativeLayout) this.f35351a.getParent()).getChildAt(i10));
            }
        }

        public c() {
        }

        @Override // q7.e
        public void a(@n0 BaseQuickAdapter baseQuickAdapter, @n0 View view, int i10) {
            int id2 = view.getId();
            if (id2 != R.id.imgs_delete) {
                if (id2 == R.id.iv_add) {
                    net.babycat.live.platform.util.c.k(DynamicPushActivity.this, new Runnable() { // from class: vl.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f42946a.c();
                        }
                    });
                    return;
                }
                if (id2 != R.id.iv_thum) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(DynamicPushActivity.this.f35340r);
                if (DynamicPushActivity.this.f35342t.booleanValue()) {
                    arrayList.remove(arrayList.size() - 1);
                }
                ImageView imageView = (ImageView) view.findViewById(R.id.iv_thum);
                new b.C0752b(DynamicPushActivity.this).u(imageView, i10, arrayList, new a(imageView), new com.lxj.xpopup.util.e(R.mipmap.imgs_err)).N();
                return;
            }
            if (i10 > DynamicPushActivity.this.f35340r.size() - 1) {
                return;
            }
            DynamicPushActivity.this.f35340r.remove(i10);
            DynamicPushActivity.this.f35341s.remove(i10);
            if (DynamicPushActivity.this.f35340r.size() > 1) {
                if (!((String) DynamicPushActivity.this.f35340r.get(DynamicPushActivity.this.f35340r.size() - 1)).equals("")) {
                    DynamicPushActivity.this.f35340r.add("");
                }
                DynamicPushActivity.this.f35342t = Boolean.TRUE;
            } else if (DynamicPushActivity.this.f35340r.size() > 0 && !((String) DynamicPushActivity.this.f35340r.get(i10)).equals("")) {
                DynamicPushActivity.this.f35340r.add("");
            }
            DynamicPushActivity.this.f35339q.notifyDataSetChanged();
        }

        public final /* synthetic */ void c() {
            PictureSelector.create((androidx.appcompat.app.e) DynamicPushActivity.this).openGallery(SelectMimeType.ofImage()).setImageEngine(GlideEngine.createGlideEngine()).setCompressEngine(new wn.h()).setMaxSelectNum(9 - DynamicPushActivity.this.f35341s.size()).setMinSelectNum(1).isGif(false).isPreviewImage(true).forResult(188);
        }
    }

    public class d implements h2.b {
        public d() {
        }

        @Override // net.babycat.live.platform.util.h2.b
        public void a(int i10) {
            wo.b.b("上传图片中：" + i10, new Object[0]);
        }

        @Override // net.babycat.live.platform.util.h2.b
        public void b(String str) {
            wo.b.b("�ϴ�ͼƬʧ�ܣ�" + str, new Object[0]);
            DynamicPushActivity.this.k3();
        }

        @Override // net.babycat.live.platform.util.h2.b
        public void c(String str, int i10) {
            wo.b.b("�ϴ�ͼƬ��" + str, new Object[0]);
            ((g) DynamicPushActivity.this.f27702e).c(str);
        }
    }

    public DynamicPushActivity() {
        Boolean bool = Boolean.TRUE;
        this.f35342t = bool;
        this.f35343u = bool;
        this.f35344v = 0;
    }

    public final void E5() {
        this.f35339q.e(new c());
    }

    public final void F5() {
        this.f35338p.addTextChangedListener(new b());
    }

    public final void G5() {
        String string = this.f35338p.getText().toString();
        if (TextUtils.isEmpty(string.trim())) {
            v5(getString(R.string.please_enter_content));
            return;
        }
        l2(getString(R.string.uploading));
        if (this.f35341s.size() <= 0) {
            ((g) this.f27702e).V2(string, "");
            return;
        }
        this.f35343u = Boolean.TRUE;
        this.f35345w = "";
        this.f35344v = 0;
        for (String str : this.f35341s) {
            if (this.f35343u.booleanValue()) {
                if (this.f35347y == null) {
                    v5("Failed to obtain upload parameters, please try again");
                    ((g) this.f27702e).G();
                    return;
                }
                H5(str);
            }
        }
    }

    public final void H5(String str) {
        h2.a().c(this, this.f35346x.getUserId().intValue(), this.f35347y, str, 0, new d());
    }

    @Override // sl.d.b
    public void K(StsBean stsBean) {
        this.f35347y = stsBean;
    }

    @Override // sl.d.b
    public void R4() {
        k3();
        v5(getString(R.string.publish_succeeded));
        a0.a(new b0(1011));
        finish();
    }

    @Override // sl.d.b
    public void b() {
        k3();
    }

    @Override // sl.d.b
    public void c(String str) {
        this.f35344v++;
        if (!TextUtils.isEmpty(this.f35345w)) {
            str = this.f35345w + r9.b.COMMA + str;
        }
        this.f35345w = str;
        if (this.f35343u.booleanValue() && this.f35344v == this.f35341s.size()) {
            ((g) this.f27702e).V2(this.f35338p.getText().toString(), this.f35345w);
        }
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_dynamic_push;
    }

    @Override // in.a
    public void g5() {
        this.f35336n = (Topbar) findViewById(R.id.common_topbar);
        this.f35337o = (RecyclerView) findViewById(R.id.rv_imgs);
        this.f35338p = (EditText) findViewById(R.id.et_content);
    }

    @Override // in.a
    public void h5() {
        t.S0(this.f27688a, this.f35336n, "");
        this.f35336n.setRightTxtVisible();
        this.f35336n.setRightText(getString(R.string.publish));
        this.f35336n.setRightTextBackground(R.mipmap.my_no_commint);
        this.f35336n.setRightTextSize(14.0f);
        this.f35336n.setRightTextTextColor(getResources().getColor(R.color.second_text_color));
        this.f35336n.setOnTopbarRightClickListener(new a());
        this.f35346x = (UserInfoDataBean) LitePal.findFirst(UserInfoDataBean.class, true);
        ((g) this.f27702e).G();
        this.f35337o.setLayoutManager(new GridLayoutManager(this, 3));
        this.f35340r = new ArrayList();
        this.f35341s = new ArrayList();
        q0 q0Var = new q0(this.f35340r);
        this.f35339q = q0Var;
        q0Var.r(R.id.iv_thum, R.id.iv_add, R.id.imgs_delete);
        this.f35337o.setAdapter(this.f35339q);
        E5();
        F5();
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, androidx.fragment.app.d, androidx.activity.d, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == -1 && i10 == 188) {
            ArrayList<LocalMedia> arrayListObtainSelectorList = PictureSelector.obtainSelectorList(intent);
            this.f35340r.remove(r3.size() - 1);
            for (LocalMedia localMedia : arrayListObtainSelectorList) {
                if (localMedia.isCompressed()) {
                    String compressPath = localMedia.getCompressPath();
                    this.f35341s.add(compressPath);
                    this.f35340r.add(compressPath);
                } else if (localMedia.getPath().contains("content://")) {
                    String strK = t.K(this, Uri.parse(localMedia.getPath()));
                    this.f35341s.add(strK);
                    this.f35340r.add(strK);
                } else {
                    this.f35341s.add(localMedia.getPath());
                    this.f35340r.add(localMedia.getPath());
                }
            }
            if (this.f35340r.size() != 9) {
                this.f35340r.add("");
                this.f35342t = Boolean.TRUE;
            } else {
                this.f35342t = Boolean.FALSE;
            }
            this.f35339q.notifyDataSetChanged();
        }
    }

    @Override // sl.d.b
    public void r0(AvatarBean avatarBean) {
        String src;
        this.f35344v++;
        if (TextUtils.isEmpty(this.f35345w)) {
            src = avatarBean.getSrc();
        } else {
            src = this.f35345w + r9.b.COMMA + avatarBean.getSrc();
        }
        this.f35345w = src;
        if (this.f35343u.booleanValue() && this.f35344v == this.f35341s.size()) {
            ((g) this.f27702e).V2(this.f35338p.getText().toString(), this.f35345w);
        }
    }

    @Override // sl.d.b
    public void x4() {
        this.f35343u = Boolean.FALSE;
        k3();
        v5(getString(R.string.uploading_error));
    }
}
