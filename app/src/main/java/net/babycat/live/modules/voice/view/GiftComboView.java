package net.babycat.live.modules.voice.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import f.p0;
import java.util.List;
import net.babycat.live.model.GiftListBean;
import net.babycat.live.model.NewJoinRoomBean;
import net.babycat.live.modules.voice.view.a;
import net.babycat.live.platform.util.t0;
import qmyy.babycat.live.R;

/* JADX INFO: loaded from: classes4.dex */
public class GiftComboView extends LinearLayout {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f36358r = 200;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public QuickClickView f36359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Button f36360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f36361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewGroup f36362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ValueAnimator f36363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ValueAnimator f36364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f36365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f36366h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f36367i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f36368j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f36369k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f36370l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f36371m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public GiftListBean f36372n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f36373o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f36374p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<NewJoinRoomBean.AnchorsDTO> f36375q;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            GiftComboView.this.f36365g = Float.valueOf(String.valueOf(valueAnimator.getAnimatedValue())).floatValue();
            GiftComboView.this.f36361c.setTextSize(GiftComboView.this.f36365g);
            wo.b.b("数量2：" + GiftComboView.this.f36367i, new Object[0]);
            GiftComboView.this.f36361c.setText(String.valueOf("x" + GiftComboView.this.f36367i));
        }
    }

    public class b implements a.InterfaceC0447a {
        public b() {
        }

        @Override // net.babycat.live.modules.voice.view.a.InterfaceC0447a
        public void a(boolean z10) {
            if (!z10) {
                if (GiftComboView.this.f36362d.getAnimation() == null) {
                    GiftComboView.this.f36362d.startAnimation(AnimationUtils.loadAnimation(GiftComboView.this.getContext(), R.anim.scale_gift_layout));
                    return;
                }
                return;
            }
            GiftComboView.this.f36362d.clearAnimation();
            GiftComboView.this.f36367i = 1;
            GiftComboView.this.f36361c.setText(String.valueOf("x" + GiftComboView.this.f36367i));
            GiftComboView.this.setVisibility(8);
        }
    }

    public interface c {
        void a(String str, String str2, String str3, GiftListBean giftListBean, int i10, List<NewJoinRoomBean.AnchorsDTO> list);
    }

    public GiftComboView(Context context) {
        super(context);
        this.f36366h = 32.0f;
        this.f36367i = 1;
        this.f36369k = "";
        this.f36370l = "";
        this.f36371m = "";
        this.f36372n = null;
        this.f36373o = 0;
        this.f36374p = 0L;
        this.f36375q = null;
        i();
    }

    public final void h() {
        this.f36360b.setOnClickListener(new View.OnClickListener() { // from class: gn.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f26740a.j(view);
            }
        });
        this.f36359a.setOnAnimationListener(new b());
    }

    public final void i() {
        this.f36359a = (QuickClickView) findViewById(R.id.quick_click_view);
        this.f36360b = (Button) findViewById(R.id.my_button);
        this.f36361c = (TextView) findViewById(R.id.tv_num);
        this.f36362d = (ViewGroup) findViewById(R.id.rl_gift);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.f36366h);
        this.f36364f = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(250L).addUpdateListener(new a());
        h();
    }

    public final /* synthetic */ void j(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f36374p < 200) {
            t0.a("幸运礼物点击：太快了");
            return;
        }
        view.performHapticFeedback(3);
        this.f36374p = jCurrentTimeMillis;
        if (this.f36368j == null || TextUtils.isEmpty(this.f36369k)) {
            return;
        }
        this.f36368j.a(this.f36369k, this.f36370l, this.f36371m, this.f36372n, this.f36373o, this.f36375q);
        this.f36363e = this.f36359a.getAnimator();
        l();
        this.f36359a.b();
    }

    public void k(String str, String str2, String str3, GiftListBean giftListBean, int i10, List<NewJoinRoomBean.AnchorsDTO> list) {
        this.f36369k = str;
        this.f36370l = str2;
        this.f36371m = str3;
        this.f36372n = giftListBean;
        this.f36373o = i10;
        this.f36375q = list;
    }

    public final void l() {
        if (this.f36363e.isRunning()) {
            this.f36367i++;
        } else {
            this.f36367i = 2;
        }
        if (this.f36364f.isRunning()) {
            this.f36364f.cancel();
        }
        this.f36364f.start();
    }

    public void m() {
        this.f36359a.getAnimator().start();
    }

    public void setOnComBoClickListener(c cVar) {
        this.f36368j = cVar;
    }

    public GiftComboView(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36366h = 32.0f;
        this.f36367i = 1;
        this.f36369k = "";
        this.f36370l = "";
        this.f36371m = "";
        this.f36372n = null;
        this.f36373o = 0;
        this.f36374p = 0L;
        this.f36375q = null;
        LayoutInflater.from(context).inflate(R.layout.live_gift_combo_view, this);
        i();
    }

    public GiftComboView(Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f36366h = 32.0f;
        this.f36367i = 1;
        this.f36369k = "";
        this.f36370l = "";
        this.f36371m = "";
        this.f36372n = null;
        this.f36373o = 0;
        this.f36374p = 0L;
        this.f36375q = null;
        i();
    }
}
