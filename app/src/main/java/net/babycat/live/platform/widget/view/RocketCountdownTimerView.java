package net.babycat.live.platform.widget.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import f.p0;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import qmyy.babycat.live.R;
import wo.b;

/* JADX INFO: loaded from: classes3.dex */
public class RocketCountdownTimerView extends LinearLayout {
    private Handler handler;
    private Context mContext;
    private Timer timer;
    private TextView tv_day_decade;
    private TextView tv_day_unit;
    private TextView tv_hour_decade;
    private TextView tv_hour_unit;
    private TextView tv_min_decade;
    private TextView tv_min_unit;
    private TextView tv_sec_decade;
    private TextView tv_sec_unit;

    public RocketCountdownTimerView(Context context) {
        super(context);
        this.handler = new Handler() { // from class: net.babycat.live.platform.widget.view.RocketCountdownTimerView.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                RocketCountdownTimerView.this.countDown();
            }
        };
        this.mContext = context;
        initView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void countDown() {
        if (isCarry4Unit(this.tv_sec_unit) && isCarry4Decade(this.tv_sec_decade) && isCarry4Unit(this.tv_min_unit) && isCarry4Decade(this.tv_min_decade) && isCarry4Unit(this.tv_hour_unit) && isCarry4Decade(this.tv_hour_decade) && isCarry4Unit(this.tv_day_unit) && isCarry4Unit(this.tv_day_decade)) {
            b.b("充值奖励：倒计时完成", new Object[0]);
            stop();
            setTime(0L);
        }
    }

    private void initView() {
        LayoutInflater.from(this.mContext).inflate(R.layout.rocket_view_countdowntimer, this);
        this.tv_day_decade = (TextView) findViewById(R.id.tv_day_decade);
        this.tv_day_unit = (TextView) findViewById(R.id.tv_day_unit);
        this.tv_hour_decade = (TextView) findViewById(R.id.tv_hour_decade);
        this.tv_hour_unit = (TextView) findViewById(R.id.tv_hour_unit);
        this.tv_min_decade = (TextView) findViewById(R.id.tv_min_decade);
        this.tv_min_unit = (TextView) findViewById(R.id.tv_min_unit);
        this.tv_sec_decade = (TextView) findViewById(R.id.tv_sec_decade);
        this.tv_sec_unit = (TextView) findViewById(R.id.tv_sec_unit);
    }

    private boolean isCarry4Decade(TextView textView) {
        int iIntValue = Integer.valueOf(textView.getText().toString()).intValue() - 1;
        if (iIntValue < 0) {
            textView.setText("5");
            return true;
        }
        textView.setText(iIntValue + "");
        return false;
    }

    private boolean isCarry4Unit(TextView textView) {
        int iIntValue = Integer.valueOf(textView.getText().toString()).intValue() - 1;
        if (iIntValue < 0) {
            textView.setText("9");
            return true;
        }
        textView.setText(iIntValue + "");
        return false;
    }

    public void setTime(Long l10) {
        if (l10.longValue() < 0) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int days = (int) timeUnit.toDays(l10.longValue());
        int hours = (int) (timeUnit.toHours(l10.longValue()) % 24);
        int minutes = (int) (timeUnit.toMinutes(l10.longValue()) % 60);
        int seconds = (int) (timeUnit.toSeconds(l10.longValue()) % 60);
        int i10 = days / 10;
        int i11 = days - (i10 * 10);
        int i12 = hours / 10;
        int i13 = hours - (i12 * 10);
        int i14 = minutes / 10;
        int i15 = minutes - (i14 * 10);
        int i16 = seconds / 10;
        int i17 = seconds - (i16 * 10);
        this.tv_day_decade.setText(i10 + "");
        this.tv_day_unit.setText(i11 + "");
        this.tv_hour_decade.setText(i12 + "");
        this.tv_hour_unit.setText(i13 + "");
        this.tv_min_decade.setText(i14 + "");
        this.tv_min_unit.setText(i15 + "");
        this.tv_sec_decade.setText(i16 + "");
        this.tv_sec_unit.setText(i17 + "");
        b.b("充值奖励：" + i10 + " " + i11 + "：" + i12 + " " + i13 + "：" + i14 + " " + i15 + "：" + i16 + " " + i17, new Object[0]);
    }

    public void start() {
        if (this.timer == null) {
            Timer timer = new Timer();
            this.timer = timer;
            timer.schedule(new TimerTask() { // from class: net.babycat.live.platform.widget.view.RocketCountdownTimerView.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    RocketCountdownTimerView.this.handler.sendEmptyMessage(0);
                }
            }, 0L, 1000L);
        }
    }

    public void stop() {
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer = null;
        }
    }

    public RocketCountdownTimerView(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.handler = new Handler() { // from class: net.babycat.live.platform.widget.view.RocketCountdownTimerView.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                RocketCountdownTimerView.this.countDown();
            }
        };
        this.mContext = context;
        initView();
    }
}
