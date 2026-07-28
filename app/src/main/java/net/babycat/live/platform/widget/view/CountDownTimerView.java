package net.babycat.live.platform.widget.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.timepicker.TimeModel;
import f.p0;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import qmyy.babycat.live.R;
import wo.b;

/* JADX INFO: loaded from: classes3.dex */
public class CountDownTimerView extends LinearLayout {
    private Handler handler;
    private Context mContext;
    private Timer timer;
    private long totalMillis;
    private TextView tv_hour;
    private TextView tv_minute;
    private TextView tv_second;

    public CountDownTimerView(Context context) {
        super(context);
        this.totalMillis = 0L;
        this.handler = new Handler() { // from class: net.babycat.live.platform.widget.view.CountDownTimerView.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (CountDownTimerView.this.totalMillis > 0) {
                    CountDownTimerView.this.totalMillis -= 1000;
                    CountDownTimerView.this.updateDisplay();
                    if (CountDownTimerView.this.totalMillis <= 0) {
                        CountDownTimerView.this.totalMillis = 0L;
                        CountDownTimerView.this.stop();
                        b.b("充值奖励：倒计时完成", new Object[0]);
                    }
                }
            }
        };
        this.mContext = context;
        initView();
    }

    private void initView() {
        LayoutInflater.from(this.mContext).inflate(R.layout.count_countdowntimer, this);
        this.tv_hour = (TextView) findViewById(R.id.tv_hour);
        this.tv_minute = (TextView) findViewById(R.id.tv_minute);
        this.tv_second = (TextView) findViewById(R.id.tv_second);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDisplay() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.totalMillis);
        long j10 = seconds / 3600;
        long j11 = (seconds % 3600) / 60;
        long j12 = seconds % 60;
        this.tv_hour.setText(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Long.valueOf(j10)));
        this.tv_minute.setText(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Long.valueOf(j11)));
        this.tv_second.setText(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Long.valueOf(j12)));
        b.b("充值奖励：倒计时 %02d:%02d:%02d", Long.valueOf(j10), Long.valueOf(j11), Long.valueOf(j12));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stop();
    }

    public void setTime(Long l10) {
        if (l10 == null || l10.longValue() < 0) {
            l10 = 0L;
        }
        this.totalMillis = l10.longValue();
        updateDisplay();
    }

    public void start() {
        if (this.timer != null || this.totalMillis <= 0) {
            return;
        }
        Timer timer = new Timer();
        this.timer = timer;
        timer.schedule(new TimerTask() { // from class: net.babycat.live.platform.widget.view.CountDownTimerView.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                CountDownTimerView.this.handler.sendEmptyMessage(0);
            }
        }, 0L, 1000L);
    }

    public void stop() {
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer = null;
        }
    }

    public CountDownTimerView(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.totalMillis = 0L;
        this.handler = new Handler() { // from class: net.babycat.live.platform.widget.view.CountDownTimerView.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (CountDownTimerView.this.totalMillis > 0) {
                    CountDownTimerView.this.totalMillis -= 1000;
                    CountDownTimerView.this.updateDisplay();
                    if (CountDownTimerView.this.totalMillis <= 0) {
                        CountDownTimerView.this.totalMillis = 0L;
                        CountDownTimerView.this.stop();
                        b.b("充值奖励：倒计时完成", new Object[0]);
                    }
                }
            }
        };
        this.mContext = context;
        initView();
    }
}
