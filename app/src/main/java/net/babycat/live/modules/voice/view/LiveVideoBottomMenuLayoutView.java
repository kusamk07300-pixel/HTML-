package net.babycat.live.modules.voice.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import f.p0;
import net.babycat.live.platform.util.t;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVideoBottomMenuLayoutView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FrameLayout f36509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f36510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f36511c;
    public ImageView imageMute;
    public ImageView imageShopping;
    public ImageView imageVideo;
    public ImageView imageWheat;
    public ImageView imageXm;
    public TextView image_chat;
    public ImageView image_chat_ic;
    public a listener;

    public interface a {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();

        void g();

        void h();

        void i();
    }

    public LiveVideoBottomMenuLayoutView(Context context) {
        super(context);
        k();
    }

    public void A(boolean z10) {
        this.imageWheat.setImageResource(z10 ? R.mipmap.live_closed_wheat_new : R.mipmap.live_open_wheat_live);
    }

    public void B() {
        this.imageWheat.setVisibility(8);
    }

    public void C(int i10) {
        this.imageWheat.setVisibility(i10 == 1 ? 0 : 8);
        this.imageVideo.setVisibility(i10 == 1 ? 0 : 8);
        this.imageXm.setVisibility(i10 == 1 ? 0 : 8);
        this.image_chat.setVisibility(i10 == 1 ? 8 : 0);
        this.image_chat_ic.setVisibility(i10 == 1 ? 0 : 8);
    }

    public final void k() {
        this.f36509a = (FrameLayout) findViewById(R.id.frame_news);
        this.f36510b = (ImageView) findViewById(R.id.image_hd);
        this.f36511c = (ImageView) findViewById(R.id.image_gift);
        this.imageXm = (ImageView) findViewById(R.id.image_xm);
        this.image_chat = (TextView) findViewById(R.id.image_chat);
        this.image_chat_ic = (ImageView) findViewById(R.id.image_chat_ic);
        this.imageMute = (ImageView) findViewById(R.id.image_mute);
        this.imageWheat = (ImageView) findViewById(R.id.image_wheat);
        this.imageVideo = (ImageView) findViewById(R.id.image_video);
        this.imageShopping = (ImageView) findViewById(R.id.image_shopping);
        this.imageVideo.setOnClickListener(new View.OnClickListener() { // from class: gn.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f26768a.l(view);
            }
        });
        this.imageXm.setOnClickListener(new View.OnClickListener() { // from class: gn.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f26801a.m(view);
            }
        });
        this.imageMute.setOnClickListener(new View.OnClickListener() { // from class: gn.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f26813a.n(view);
            }
        });
        findViewById(R.id.image_more).setOnClickListener(new View.OnClickListener() { // from class: gn.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f26815a.o(view);
            }
        });
        this.f36509a.setOnClickListener(new View.OnClickListener() { // from class: gn.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f26817a.p(view);
            }
        });
        findViewById(R.id.image_chat).setOnClickListener(new View.OnClickListener() { // from class: gn.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f26819a.q(view);
            }
        });
        findViewById(R.id.image_chat_ic).setOnClickListener(new View.OnClickListener() { // from class: gn.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f26821a.r(view);
            }
        });
        this.imageWheat.setOnClickListener(new View.OnClickListener() { // from class: gn.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f26823a.s(view);
            }
        });
        this.f36511c.setOnClickListener(new View.OnClickListener() { // from class: gn.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f26825a.t(view);
            }
        });
        this.imageShopping.setOnClickListener(new View.OnClickListener() { // from class: gn.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f26827a.u(view);
            }
        });
    }

    public final /* synthetic */ void l(View view) {
        if (t.t0()) {
            this.listener.g();
        }
    }

    public final /* synthetic */ void m(View view) {
        if (t.t0()) {
            this.listener.h();
        }
    }

    public final /* synthetic */ void n(View view) {
        if (t.t0()) {
            this.listener.e();
        }
    }

    public final /* synthetic */ void o(View view) {
        if (t.t0()) {
            this.listener.f();
        }
    }

    public final /* synthetic */ void p(View view) {
        if (t.t0()) {
            this.listener.d();
        }
    }

    public final /* synthetic */ void q(View view) {
        if (t.t0()) {
            this.listener.b();
        }
    }

    public final /* synthetic */ void r(View view) {
        if (t.t0()) {
            this.listener.b();
        }
    }

    public final /* synthetic */ void s(View view) {
        if (t.t0()) {
            this.listener.a();
        }
    }

    public void setCountNum(int i10) {
        if (i10 == 0) {
            this.f36510b.setVisibility(8);
        } else {
            this.f36510b.setVisibility(0);
        }
    }

    public final /* synthetic */ void t(View view) {
        if (t.t0()) {
            this.listener.c();
        }
    }

    public final /* synthetic */ void u(View view) {
        if (t.t0()) {
            this.listener.i();
        }
    }

    public void v(a aVar) {
        this.listener = aVar;
    }

    public void w() {
        this.f36511c.setVisibility(8);
        this.imageVideo.setVisibility(0);
    }

    public void x(int i10) {
        this.f36511c.setVisibility(i10 > 1 ? 0 : 8);
    }

    public void y(boolean z10) {
        this.imageMute.setImageResource(z10 ? R.mipmap.image_on_mute_live : R.mipmap.image_mute_live);
    }

    public void z(boolean z10) {
        this.imageVideo.setImageResource(z10 ? R.mipmap.iv_camera_off : R.mipmap.iv_camera);
    }

    public LiveVideoBottomMenuLayoutView(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.live_video_bottom_menu_layout_view, this);
        k();
    }
}
