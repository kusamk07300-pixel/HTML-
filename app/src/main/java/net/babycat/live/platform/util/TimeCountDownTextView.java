package net.babycat.live.platform.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.CountDownTimer;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.text.NumberFormat;
import net.babycat.live.R;

/* JADX INFO: loaded from: classes3.dex */
public class TimeCountDownTextView extends androidx.appcompat.widget.p0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f36618g = 1800000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CountDownTimer f36619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f36620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f36621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f36622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f36623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f36624f;

    public class a extends CountDownTimer {
        public a(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            if (TimeCountDownTextView.this.f36624f != null) {
                TimeCountDownTextView.this.f36624f.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            TimeCountDownTextView.this.f36623e = j10 / 60000;
            TimeCountDownTextView.this.f36622d = (j10 % 60000) / 1000;
            TimeCountDownTextView timeCountDownTextView = TimeCountDownTextView.this;
            timeCountDownTextView.setText(Html.fromHtml(String.format(timeCountDownTextView.f36620b, TimeCountDownTextView.o(TimeCountDownTextView.this.f36623e), TimeCountDownTextView.o(TimeCountDownTextView.this.f36622d))));
        }
    }

    public interface b {
        void onFinish();
    }

    public TimeCountDownTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36619a = null;
        p(context, attributeSet);
    }

    public static String o(long j10) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMinimumIntegerDigits(2);
        numberInstance.setGroupingUsed(false);
        return numberInstance.format(j10);
    }

    public void n() {
        CountDownTimer countDownTimer = this.f36619a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f36619a = null;
            this.f36621c = 0L;
        }
    }

    public final void p(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TimeCountDownView);
        this.f36621c = (long) typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
        String string = typedArrayObtainStyledAttributes.getString(1);
        this.f36620b = string;
        if (TextUtils.isEmpty(string)) {
            this.f36620b = getContext().getString(qmyy.babycat.live.R.string.count_down_default_format);
        }
    }

    public void q(long j10, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f36620b = str;
        }
        this.f36621c = j10;
    }

    public void r() {
        TimeCountDownTextView timeCountDownTextView;
        if (this.f36621c < 0) {
            this.f36621c = 0L;
        }
        CountDownTimer countDownTimer = this.f36619a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            timeCountDownTextView = this;
        } else {
            timeCountDownTextView = this;
            timeCountDownTextView.f36619a = timeCountDownTextView.new a(this.f36621c, 1000);
        }
        timeCountDownTextView.f36619a.start();
    }

    public void setCountDownTimes(long j10) {
        this.f36621c = j10;
    }

    public void setOnCountDownFinishListener(b bVar) {
        this.f36624f = bVar;
    }

    public TimeCountDownTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f36619a = null;
        p(context, attributeSet);
    }

    public TimeCountDownTextView(Context context) {
        super(context);
        this.f36619a = null;
    }
}
