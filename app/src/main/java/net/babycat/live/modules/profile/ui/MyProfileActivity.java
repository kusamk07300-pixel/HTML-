package net.babycat.live.modules.profile.ui;

import af.j;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.q0;
import cf.h;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.gyf.immersionbar.ImmersionBar;
import com.luck.picture.lib.basic.PictureSelector;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.interfaces.OnResultCallbackListener;
import com.lxj.xpopupext.popup.TimePickerPopup;
import em.i0;
import f.n0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jm.e2;
import net.babycat.live.model.AvatarBean;
import net.babycat.live.model.SlideBean;
import net.babycat.live.model.StsBean;
import net.babycat.live.model.UserInfoDataBean;
import net.babycat.live.platform.util.a0;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.h2;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.t0;
import net.babycat.live.platform.widget.view.GlideEngine;
import net.babycat.live.platform.widget.view.Topbar;
import org.litepal.LitePal;
import qmyy.babycat.live.R;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class MyProfileActivity extends in.b<e2> implements i0.b {
    public String A;
    public String B;
    public String C;
    public String D;
    public p001if.a E;
    public TimePickerPopup F;
    public StsBean I;
    public View J;
    public View K;
    public View L;
    public View M;
    public View N;
    public View O;
    public View P;
    public ImageView mIvCcp;
    public TextView mTvCountryName;
    public TextView mTvSex;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f35747n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RecyclerView f35748o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f35749p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f35750q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f35751r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f35752s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f35753t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Switch f35754u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q0 f35756w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public UserInfoDataBean f35759z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f35755v = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List<String> f35757x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List<SlideBean> f35758y = new ArrayList();
    public Boolean G = Boolean.TRUE;
    public int H = 0;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (compoundButton.isChecked()) {
                HashMap map = new HashMap();
                map.put("isrecord", 1);
                ((e2) MyProfileActivity.this.f27702e).U4(map, 6);
            } else {
                HashMap map2 = new HashMap();
                map2.put("isrecord", 0);
                ((e2) MyProfileActivity.this.f27702e).U4(map2, 7);
            }
        }
    }

    public class b implements q7.e {

        public class a implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ImageView f35762a;

            public a(ImageView imageView) {
                this.f35762a = imageView;
            }

            @Override // cf.h
            public void onSrcViewUpdate(@n0 j jVar, int i10) {
                jVar.n0((ImageView) ((RelativeLayout) this.f35762a.getParent()).getChildAt(i10));
            }
        }

        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            PictureSelector.create((androidx.appcompat.app.e) MyProfileActivity.this).openGallery(SelectMimeType.ofImage()).setImageEngine(GlideEngine.createGlideEngine()).setCompressEngine(new wn.h()).setMaxSelectNum(1).setMinSelectNum(1).isGif(false).isWebp(false).isPreviewImage(true).forResult(188);
        }

        @Override // q7.e
        public void a(@n0 BaseQuickAdapter baseQuickAdapter, @n0 View view, int i10) {
            int id2 = view.getId();
            if (id2 == R.id.imgs_delete) {
                if (i10 > MyProfileActivity.this.f35757x.size() - 1) {
                    return;
                }
                MyProfileActivity.this.H = i10;
                MyProfileActivity myProfileActivity = MyProfileActivity.this;
                myProfileActivity.l2(myProfileActivity.getString(R.string.deleting));
                ((e2) MyProfileActivity.this.f27702e).i2(((SlideBean) MyProfileActivity.this.f35758y.get(i10)).getId().intValue());
                return;
            }
            if (id2 == R.id.iv_add) {
                if (MyProfileActivity.this.I != null) {
                    net.babycat.live.platform.util.c.k(MyProfileActivity.this, new Runnable() { // from class: km.k0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f29540a.c();
                        }
                    });
                    return;
                } else {
                    MyProfileActivity.this.v5("Failed to obtain upload parameters, please try again");
                    ((e2) MyProfileActivity.this.f27702e).G();
                    return;
                }
            }
            if (id2 != R.id.iv_thum) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(MyProfileActivity.this.f35757x);
            if (MyProfileActivity.this.G.booleanValue()) {
                arrayList.remove(arrayList.size() - 1);
            }
            ImageView imageView = (ImageView) view.findViewById(R.id.iv_thum);
            new b.C0752b(MyProfileActivity.this).u(imageView, i10, arrayList, new a(imageView), new com.lxj.xpopup.util.e(R.mipmap.imgs_err)).N();
        }
    }

    public class c implements h2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f35764a;

        public c(int i10) {
            this.f35764a = i10;
        }

        @Override // net.babycat.live.platform.util.h2.b
        public void a(int i10) {
            wo.b.b("上传图片中：" + i10, new Object[0]);
        }

        @Override // net.babycat.live.platform.util.h2.b
        public void b(String str) {
            wo.b.b("上传图片失败：" + str, new Object[0]);
            MyProfileActivity.this.k3();
        }

        @Override // net.babycat.live.platform.util.h2.b
        public void c(String str, int i10) {
            wo.b.b("上传图片：" + str, new Object[0]);
            ((e2) MyProfileActivity.this.f27702e).R3(this.f35764a, str);
        }
    }

    public class d implements hf.a {
        public d() {
        }

        @Override // hf.a
        public void a(String str, String str2, String str3, View view) {
            t0.a(str + "-" + str2 + "-" + str3);
            MyProfileActivity.this.C = str + " " + str2 + " " + str3;
            HashMap map = new HashMap();
            map.put("location", MyProfileActivity.this.C);
            ((e2) MyProfileActivity.this.f27702e).U4(map, 4);
        }

        @Override // hf.a
        public void b(String str, String str2, String str3) {
        }

        @Override // hf.a
        public void onCancel() {
        }
    }

    public class e implements hf.e {
        public e() {
        }

        @Override // hf.e
        public void a(Date date, View view) {
            MyProfileActivity.this.D = (date.getTime() / 1000) + "";
            HashMap map = new HashMap();
            map.put("birthday", MyProfileActivity.this.D);
            ((e2) MyProfileActivity.this.f27702e).U4(map, 3);
        }

        @Override // hf.e
        public void b(Date date) {
        }

        @Override // hf.e
        public void onCancel() {
        }
    }

    public class f implements OnResultCallbackListener<LocalMedia> {
        public f() {
        }

        @Override // com.luck.picture.lib.interfaces.OnResultCallbackListener
        public void onCancel() {
        }

        @Override // com.luck.picture.lib.interfaces.OnResultCallbackListener
        public void onResult(ArrayList<LocalMedia> arrayList) {
            wo.b.b("选择照片地址--" + arrayList.get(0).getCutPath(), new Object[0]);
            MyProfileActivity myProfileActivity = MyProfileActivity.this;
            myProfileActivity.l2(myProfileActivity.getString(R.string.uploading));
            if (arrayList.get(0).isCut()) {
                MyProfileActivity.this.W5(0, arrayList.get(0).getCutPath());
            } else {
                if (!arrayList.get(0).getPath().contains("content://")) {
                    MyProfileActivity.this.W5(0, arrayList.get(0).getPath());
                    return;
                }
                MyProfileActivity.this.W5(0, t.K(MyProfileActivity.this, Uri.parse(arrayList.get(0).getPath())));
            }
        }
    }

    public class g implements cf.g {
        public g() {
        }

        @Override // cf.g
        public void a(int i10, String str) {
            MyProfileActivity.this.B = str;
            HashMap map = new HashMap();
            map.put("sex", Integer.valueOf(i10 + 1));
            ((e2) MyProfileActivity.this.f27702e).U4(map, 2);
        }
    }

    private void T5() {
        Calendar calendar = Calendar.getInstance();
        if (TextUtils.isEmpty(this.f35759z.getBirthday())) {
            calendar.set(2023, 2, 1);
        } else {
            calendar.setTimeInMillis(Long.parseLong(this.f35759z.getBirthday() + "000"));
        }
        this.F = new TimePickerPopup(this).a0(calendar).i0(new e());
    }

    private void initData() {
        if (!TextUtils.isEmpty(this.f35759z.getCountry_iso())) {
            bg.b bVarV = t.v(this, this.f35759z.getCountry_iso());
            this.mIvCcp.setImageResource(com.rilixtech.widget.countrycodepicker.c.h(bVarV));
            this.mTvCountryName.setText(bVarV.b());
        }
        this.f35748o.setLayoutManager(new GridLayoutManager(this, 3));
        this.f35757x = new ArrayList();
        q0 q0Var = new q0(this.f35757x);
        this.f35756w = q0Var;
        q0Var.r(R.id.iv_thum, R.id.iv_add, R.id.imgs_delete);
        this.f35748o.setAdapter(this.f35756w);
        ((e2) this.f27702e).t(this.f35759z.getUserId().intValue());
        R5();
        wn.d.f(this, this.f35749p, this.f35759z.getAvatar());
        this.f35750q.setText(this.f35759z.getNickname());
        this.mTvSex.setText(getString(this.f35759z.getSex() == 1 ? R.string.man : R.string.woman));
        this.f35751r.setText(t.d1(Long.parseLong(this.f35759z.getBirthday() + "000"), "yyyy-MM-dd"));
        this.f35753t.setText(this.f35759z.getSignature());
        this.f35754u.setChecked(this.f35759z.getIsrecord().intValue() == 1);
        this.f35754u.setOnCheckedChangeListener(new a());
        this.f35754u.setVisibility(0);
    }

    @Override // em.i0.b
    public void E2(SlideBean slideBean) {
        k3();
        v5(getString(R.string.add_success));
        this.f35757x.add(slideBean.getImage());
        this.f35758y.add(slideBean);
        if (this.f35757x.size() != 6) {
            this.f35757x.add("");
            this.G = Boolean.TRUE;
        } else {
            this.G = Boolean.FALSE;
        }
        this.f35756w.notifyDataSetChanged();
        a0.a(new b0(1018));
    }

    @Override // em.i0.b
    public void K(StsBean stsBean) {
        this.I = stsBean;
    }

    @Override // em.i0.b
    public void N1(int i10) {
        if (i10 != 0) {
            switch (i10) {
                case 2:
                    this.mTvSex.setText(this.B);
                    this.f35759z.setSex(this.B.equals(getString(R.string.man)) ? 1 : 2);
                    this.f35759z.save();
                    break;
                case 3:
                    this.f35751r.setText(t.d1(Long.parseLong(this.D + "000"), "yyyy-MM-dd"));
                    this.f35759z.setBirthday(this.D);
                    this.f35759z.save();
                    break;
                case 4:
                    this.f35752s.setText(this.C);
                    break;
                case 5:
                    this.f35759z.setCountry_iso(this.f35755v);
                    this.f35759z.save();
                    break;
                case 6:
                    this.f35759z.setIsrecord(1);
                    this.f35759z.save();
                    break;
                case 7:
                    this.f35759z.setIsrecord(0);
                    this.f35759z.save();
                    break;
            }
        } else {
            a0.a(new b0(1017, this.A));
            net.babycat.live.platform.util.n0.n().D(this.A);
        }
        k3();
        a0.a(new b0(1014));
    }

    public final void R5() {
        this.f35756w.e(new b());
    }

    @Override // em.i0.b
    public void S4() {
        k3();
        v5(getString(R.string.del_success));
        this.f35757x.remove(this.H);
        this.f35758y.remove(this.H);
        if (this.f35757x.size() > 1) {
            List<String> list = this.f35757x;
            if (!list.get(list.size() - 1).equals("")) {
                this.f35757x.add("");
            }
            this.G = Boolean.TRUE;
        } else if (this.f35757x.size() > 0 && !this.f35757x.get(this.H).equals("")) {
            this.f35757x.add("");
        }
        this.f35756w.notifyDataSetChanged();
        a0.a(new b0(1018));
    }

    public final void S5() {
        p001if.a aVar = new p001if.a(this);
        this.E = aVar;
        aVar.b0(new d());
    }

    @Override // em.i0.b
    public void U(AvatarBean avatarBean) {
        ((e2) this.f27702e).Z0(avatarBean.getSrc());
    }

    public final /* synthetic */ void U5() {
        PictureSelector.create((androidx.appcompat.app.e) this).openGallery(SelectMimeType.ofImage()).setImageEngine(GlideEngine.createGlideEngine()).setCropEngine(new wn.g()).setMaxSelectNum(1).setMinSelectNum(1).isGif(true).isWebp(true).isBmp(false).isPreviewImage(true).forResult(new f());
    }

    public void V5() {
        if (this.I != null) {
            net.babycat.live.platform.util.c.k(this, new Runnable() { // from class: km.j0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29536a.U5();
                }
            });
        } else {
            v5("Failed to obtain upload parameters, please try again");
            ((e2) this.f27702e).G();
        }
    }

    public final void W5(int i10, String str) {
        h2.a().d(this, this.f35759z.getUserId().intValue(), this.I, str, 0, new c(i10));
    }

    @Override // em.i0.b
    public void b() {
        k3();
    }

    @Override // em.i0.b
    public void c0() {
        k3();
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_my_profile;
    }

    @Override // em.i0.b
    public void g1(int i10, String str) {
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            ((e2) this.f27702e).Z0(str);
            return;
        }
        wn.d.o(this, this.f35749p, str, 21, 1, -1);
        this.f35759z.setAvatar(str);
        this.f35759z.save();
        this.A = str;
        HashMap map = new HashMap();
        map.put("avatar", str);
        ((e2) this.f27702e).U4(map, 0);
    }

    @Override // in.a
    public void g5() {
        this.mTvSex = (TextView) findViewById(R.id.tv_sex);
        this.f35747n = (Topbar) findViewById(R.id.common_topbar);
        this.f35748o = (RecyclerView) findViewById(R.id.rv_imgs);
        this.f35749p = (ImageView) findViewById(R.id.cv_avatar);
        this.f35750q = (TextView) findViewById(R.id.tv_nickname);
        this.f35751r = (TextView) findViewById(R.id.tv_birthday);
        this.f35752s = (TextView) findViewById(R.id.tv_location);
        this.f35753t = (TextView) findViewById(R.id.tv_signature);
        this.f35754u = (Switch) findViewById(R.id.swh_status);
        this.mIvCcp = (ImageView) findViewById(R.id.iv_ccp);
        this.mTvCountryName = (TextView) findViewById(R.id.tv_country_name);
        this.J = findViewById(R.id.ll_country);
        this.K = findViewById(R.id.ll_name);
        this.L = findViewById(R.id.ll_sign);
        this.M = findViewById(R.id.ll_upload);
        this.N = findViewById(R.id.ll_choose_sex);
        this.O = findViewById(R.id.ll_location);
        this.P = findViewById(R.id.ll_birthday);
        this.J.setOnClickListener(this);
        this.K.setOnClickListener(this);
        this.L.setOnClickListener(this);
        this.M.setOnClickListener(this);
        this.N.setOnClickListener(this);
        this.O.setOnClickListener(this);
        this.P.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        ImmersionBar.with(this).fitsSystemWindows(false).transparentStatusBar().statusBarDarkFont(true).init();
        t.S0(this, this.f35747n, getString(R.string.my_profile));
        this.f35747n.setTransparent();
        this.f35747n.setTabBoldGone();
        this.f35748o.setLayoutManager(new GridLayoutManager(this, 3));
        this.f35759z = (UserInfoDataBean) LitePal.findFirst(UserInfoDataBean.class, true);
        ((e2) this.f27702e).G();
        initData();
        S5();
        T5();
    }

    @Override // em.i0.b
    public void i(AvatarBean avatarBean) {
        t0.a("上传头像：" + avatarBean.getSrc());
        this.A = avatarBean.getSrc();
        HashMap map = new HashMap();
        map.put("avatar", this.A);
        ((e2) this.f27702e).U4(map, 0);
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
            List<String> list = this.f35757x;
            list.remove(list.size() - 1);
            l2(getString(R.string.uploading));
            for (LocalMedia localMedia : arrayListObtainSelectorList) {
                if (localMedia.isCompressed()) {
                    W5(1, localMedia.getCompressPath());
                } else if (localMedia.getPath().contains("content://")) {
                    W5(1, t.K(this, Uri.parse(localMedia.getPath())));
                } else {
                    W5(1, localMedia.getPath());
                }
            }
        }
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ll_birthday /* 2131363290 */:
                new b.C0752b(this).t(this.F).N();
                break;
            case R.id.ll_choose_sex /* 2131363298 */:
                new b.C0752b(this).f(getString(R.string.please_gender), new String[]{getString(R.string.man), getString(R.string.woman)}, new g()).N();
                break;
            case R.id.ll_location /* 2131363321 */:
                new b.C0752b(this).t(this.E).N();
                break;
            case R.id.ll_name /* 2131363325 */:
                Bundle bundle = new Bundle();
                bundle.putString("user_name", this.f35750q.getText().toString().trim());
                p5(MyProfileNameActivity.class, bundle);
                break;
            case R.id.ll_sign /* 2131363337 */:
                Bundle bundle2 = new Bundle();
                bundle2.putString("user_signature", this.f35753t.getText().toString().trim());
                p5(MyProfileSignActivity.class, bundle2);
                break;
            case R.id.ll_upload /* 2131363345 */:
                V5();
                break;
        }
    }

    @Override // in.b
    public void onReceiveEvent(b0 b0Var) {
        super.onReceiveEvent(b0Var);
        int iA = b0Var.a();
        if (iA == 1012) {
            this.f35750q.setText((String) b0Var.b());
            this.f35759z.setNickname((String) b0Var.b());
            this.f35759z.save();
            a0.a(new b0(1014));
            return;
        }
        if (iA != 1013) {
            return;
        }
        this.f35753t.setText((String) b0Var.b());
        this.f35759z.setSignature((String) b0Var.b());
        this.f35759z.save();
        a0.a(new b0(1014));
    }

    @Override // em.i0.b
    public void q0(List<SlideBean> list) {
        this.f35757x.clear();
        this.f35758y.addAll(list);
        Iterator<SlideBean> it = list.iterator();
        while (it.hasNext()) {
            this.f35757x.add(it.next().getImage());
        }
        if (this.f35757x.size() != 6) {
            this.f35757x.add("");
            this.G = Boolean.TRUE;
        } else {
            this.G = Boolean.FALSE;
        }
        this.f35756w.notifyDataSetChanged();
    }
}
