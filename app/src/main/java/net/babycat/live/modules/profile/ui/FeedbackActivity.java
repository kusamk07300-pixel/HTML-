package net.babycat.live.modules.profile.ui;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.e;
import com.luck.picture.lib.basic.PictureSelector;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.entity.LocalMedia;
import em.o;
import g0.o0;
import java.util.ArrayList;
import jm.k0;
import net.babycat.live.model.AvatarBean;
import net.babycat.live.model.StsBean;
import net.babycat.live.model.UserInfoDataBean;
import net.babycat.live.model.UserReportBean;
import net.babycat.live.platform.util.h2;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.GlideEngine;
import net.babycat.live.platform.widget.view.Topbar;
import org.litepal.LitePal;
import qmyy.babycat.live.R;
import wn.d;
import wn.i;

/* JADX INFO: loaded from: classes4.dex */
public class FeedbackActivity extends in.b<k0> implements o.b {
    public Button mButTj;
    public Topbar mCommonTopbar;
    public EditText mEdCont;
    public ImageView mImageAdd;
    public ImageView mImageDelete;
    public LinearLayout mLinOff;
    public RelativeLayout mReBut;
    public TextView mTvAddtime;
    public TextView mTvCont;
    public TextView mTvUptime;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f35559n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f35560o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35561p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public UserReportBean f35562q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public UserInfoDataBean f35563r;

    public class a implements Topbar.TopbarRightClickListener {
        public a() {
        }

        @Override // net.babycat.live.platform.widget.view.Topbar.TopbarRightClickListener
        public void rightClick() {
            if (t.t0()) {
                FeedbackActivity.this.o5(FeedbackListActivity.class);
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
            FeedbackActivity.this.k3();
        }

        @Override // net.babycat.live.platform.util.h2.b
        public void c(String str, int i10) {
            wo.b.b("上传图片：" + str, new Object[0]);
            FeedbackActivity.this.f35559n = str;
            FeedbackActivity.this.k3();
        }
    }

    @Override // em.o.b
    public void Q() {
        finish();
    }

    @Override // em.o.b
    public void U(AvatarBean avatarBean) {
        this.f35559n = avatarBean.getSrc();
        k3();
    }

    @Override // em.o.b
    public void c0() {
        k3();
    }

    @Override // em.o.b
    public void d(StsBean stsBean, String str) {
        h2.a().c(this, this.f35563r.getUserId().intValue(), stsBean, str, 0, new b());
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_feedback;
    }

    @Override // in.a
    public void g5() {
        this.mCommonTopbar = (Topbar) findViewById(R.id.common_topbar);
        this.mEdCont = (EditText) findViewById(R.id.ed_cont);
        this.mImageAdd = (ImageView) findViewById(R.id.image_add);
        this.mImageDelete = (ImageView) findViewById(R.id.image_delete);
        this.mButTj = (Button) findViewById(R.id.but_tj);
        this.mReBut = (RelativeLayout) findViewById(R.id.re_but);
        this.mTvUptime = (TextView) findViewById(R.id.tv_uptime);
        this.mTvCont = (TextView) findViewById(R.id.tv_cont);
        this.mLinOff = (LinearLayout) findViewById(R.id.lin_off);
        this.mTvAddtime = (TextView) findViewById(R.id.tv_addtime);
        this.mImageAdd.setOnClickListener(this);
        this.mImageDelete.setOnClickListener(this);
        this.mButTj.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        this.f35561p = getIntent().getIntExtra(o0.CATEGORY_STATUS, 0);
        this.f35562q = (UserReportBean) getIntent().getSerializableExtra("data");
        this.f35563r = (UserInfoDataBean) LitePal.findFirst(UserInfoDataBean.class, true);
        if (this.f35561p == 0) {
            this.f35560o = getString(R.string.user_feedback);
            this.mCommonTopbar.setRightTxtVisible();
            this.mCommonTopbar.setRightText(getString(R.string.feedback_list));
            this.mCommonTopbar.setOnTopbarRightClickListener(new a());
        } else {
            this.f35560o = getString(R.string.processing_details);
            this.mReBut.setVisibility(8);
            this.mEdCont.setEnabled(false);
            this.mEdCont.setText(this.f35562q.getContent());
            this.mTvCont.setText(this.f35562q.getReContent());
            this.mTvAddtime.setText(t.d1(Long.parseLong(this.f35562q.getAddtime() + "000"), ""));
            this.mTvUptime.setText(t.d1(Long.parseLong(this.f35562q.getUptime() + "000"), ""));
            d.c(this, this.f35562q.getImg(), this.mImageAdd);
            this.mLinOff.setVisibility(0);
        }
        t.S0(this.f27688a, this.mCommonTopbar, getString(R.string.user_feedback));
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
            l2(getString(R.string.uploading));
            for (LocalMedia localMedia : arrayListObtainSelectorList) {
                if (localMedia.isCut()) {
                    ((k0) this.f27702e).d(localMedia.getCutPath());
                    d.c(this, localMedia.getCutPath(), this.mImageAdd);
                } else if (localMedia.getPath().contains("content://")) {
                    String strK = t.K(this, Uri.parse(localMedia.getPath()));
                    ((k0) this.f27702e).d(strK);
                    d.c(this, strK, this.mImageAdd);
                } else {
                    ((k0) this.f27702e).d(localMedia.getPath());
                    d.c(this, localMedia.getPath(), this.mImageAdd);
                }
            }
        }
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.but_tj) {
            if (this.f35561p == 1) {
                return;
            }
            if (TextUtils.isEmpty(this.mEdCont.getText().toString())) {
                v5(getString(R.string.input_feedback));
                return;
            } else {
                ((k0) this.f27702e).D2(this.f35559n, 0, this.mEdCont.getText().toString());
                return;
            }
        }
        if (id2 == R.id.image_add) {
            if (this.f35561p == 1) {
                return;
            }
            PictureSelector.create((e) this).openGallery(SelectMimeType.ofImage()).setImageEngine(GlideEngine.createGlideEngine()).setCropEngine(new i()).setMaxSelectNum(1).setMinSelectNum(1).isGif(false).isPreviewImage(true).forResult(188);
        } else {
            if (id2 != R.id.image_delete) {
                return;
            }
            this.mImageAdd.setImageResource(R.mipmap.image_add);
            this.mImageDelete.setVisibility(8);
            this.f35559n = "";
        }
    }
}
