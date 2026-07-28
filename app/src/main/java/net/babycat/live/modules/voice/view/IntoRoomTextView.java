package net.babycat.live.modules.voice.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import f.p0;
import net.babycat.live.platform.util.t0;
import q3.k;
import qmyy.babycat.live.R;
import un.b;

/* JADX INFO: loaded from: classes4.dex */
public class IntoRoomTextView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f36379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public un.b f36380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f36381d;

    public class a implements b.InterfaceC0709b {
        public a() {
        }

        @Override // un.b.InterfaceC0709b
        public void a(un.a aVar) {
            t0.d("Post", "��ʱ��,����IDΪ" + aVar.taskNo);
            IntoRoomTextView.this.f36380c.g(aVar);
        }

        @Override // un.b.InterfaceC0709b
        public void b(un.a aVar) {
            IntoRoomTextView.this.d(aVar);
        }

        @Override // un.b.InterfaceC0709b
        public void c() {
            t0.d("Post", "��������ִ�����");
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ un.a f36383a;

        public class a extends AnimatorListenerAdapter {
            public a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IntoRoomTextView.this.f36379b.setVisibility(8);
                IntoRoomTextView.this.f36381d.setText("");
                b bVar = b.this;
                bVar.f36383a.isResult = true;
                IntoRoomTextView.this.f36380c.g(b.this.f36383a);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IntoRoomTextView.this.f36379b.setVisibility(0);
            }
        }

        public b(un.a aVar) {
            this.f36383a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            t0.d("Post", "��ʼִ������" + this.f36383a.taskNo + "���õĳ�ʱʱ��Ϊ��" + (this.f36383a.timeOut / 1000) + k.STREAMING_FORMAT_SS);
            IntoRoomTextView.this.f36380c.l(this.f36383a);
            IntoRoomTextView.this.f36381d.setText(this.f36383a.name);
            AnimatorSet animatorSetA = new rn.b().a(IntoRoomTextView.this.f36379b, IntoRoomTextView.this.f36379b);
            animatorSetA.addListener(new a());
            animatorSetA.start();
            if (this.f36383a.isTimeOut) {
                return;
            }
            t0.d("Post", "任务执行完成--------任务ID�?" + this.f36383a.taskNo);
            if (IntoRoomTextView.this.g(System.currentTimeMillis())) {
                t0.d("Post", "任务失败了，结束掉相关联正在排队的任务组");
                IntoRoomTextView.this.f36380c.d(this.f36383a.planNo);
            }
        }
    }

    public IntoRoomTextView(Context context) {
        super(context);
        this.f36378a = 0;
        this.f36379b = this;
        e();
    }

    public void d(un.a aVar) {
        new Handler().post(new b(aVar));
    }

    public final void e() {
        this.f36380c = un.b.i();
        this.f36381d = (TextView) findViewById(R.id.tv_text);
        this.f36379b.setVisibility(8);
        f();
    }

    public final void f() {
        this.f36380c.k(new a());
    }

    public boolean g(long j10) {
        return (j10 & 1) == 1;
    }

    public void setData(String str) {
        un.a aVar = new un.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        int i10 = this.f36378a;
        this.f36378a = i10 + 1;
        sb2.append(i10);
        aVar.taskNo = sb2.toString();
        aVar.name = str;
        aVar.timeOut = 15000L;
        this.f36380c.b(aVar);
    }

    public IntoRoomTextView(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36378a = 0;
        setWillNotDraw(false);
        this.f36379b = this;
        LayoutInflater.from(context).inflate(R.layout.live_identity_effects_view, this);
        e();
    }
}
