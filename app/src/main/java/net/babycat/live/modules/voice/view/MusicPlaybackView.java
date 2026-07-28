package net.babycat.live.modules.voice.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import f.p0;
import qmyy.babycat.live.R;
import wn.d;

/* JADX INFO: loaded from: classes4.dex */
public class MusicPlaybackView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f36512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f36518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View.OnClickListener f36519h;

    public MusicPlaybackView(Context context) {
        super(context);
        this.f36518g = 0L;
        a();
    }

    public final void a() {
        this.f36512a = (TextView) findViewById(R.id.tv_name);
        d.c(getContext(), Integer.valueOf(R.mipmap.iv_dj), (ImageView) findViewById(R.id.iv_dj));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f36518g = System.currentTimeMillis();
            this.f36517f = false;
            getParent().requestDisallowInterceptTouchEvent(true);
            this.f36513b = rawX;
            this.f36514c = rawY;
            if (getParent() != null) {
                ViewGroup viewGroup = (ViewGroup) getParent();
                this.f36515d = viewGroup.getHeight();
                this.f36516e = viewGroup.getWidth();
            }
        } else if (action != 1) {
            if (action == 2) {
                boolean z10 = this.f36515d > 0 && this.f36516e > 0;
                this.f36517f = z10;
                if (z10) {
                    int i10 = rawX - this.f36513b;
                    int i11 = rawY - this.f36514c;
                    boolean z11 = ((int) Math.sqrt((double) ((i10 * i10) + (i11 * i11)))) > 0;
                    this.f36517f = z11;
                    if (z11) {
                        float x10 = getX() + i10;
                        float y10 = getY() + i11;
                        if (x10 < 0.0f) {
                            x10 = 0.0f;
                        } else if (x10 > this.f36516e - getWidth()) {
                            x10 = this.f36516e - getWidth();
                        }
                        if (y10 < 0.0f) {
                            y10 = 0.0f;
                        } else if (y10 > this.f36515d - getHeight()) {
                            y10 = this.f36515d - getHeight();
                        }
                        setX(x10);
                        setY(y10);
                        this.f36513b = rawX;
                        this.f36514c = rawY;
                    }
                }
            }
        } else if (!this.f36517f && (onClickListener = this.f36519h) != null) {
            onClickListener.onClick(this);
        }
        return true;
    }

    public void setData(String str) {
        this.f36512a.setText(str);
    }

    @Override // android.view.View
    public void setOnClickListener(@p0 View.OnClickListener onClickListener) {
        this.f36519h = onClickListener;
    }

    public MusicPlaybackView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36518g = 0L;
        LayoutInflater.from(context).inflate(R.layout.live_music_playback_view, this);
        a();
    }
}
