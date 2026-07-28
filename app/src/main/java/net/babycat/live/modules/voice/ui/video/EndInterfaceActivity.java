package net.babycat.live.modules.voice.ui.video;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import dn.a;
import in.b;
import net.babycat.live.model.CloseRoomBean;
import net.babycat.live.platform.util.a0;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.b1;
import qmyy.babycat.live.R;
import wn.d;
import xm.a;

/* JADX INFO: loaded from: classes4.dex */
public class EndInterfaceActivity extends b<a> implements a.b {
    public ImageView mIvAvatar;
    public LinearLayout mLinBj;
    public TextView mTvBut;
    public TextView mTvCount;
    public TextView mTvId;
    public TextView mTvLikeCount;
    public TextView mTvName;
    public TextView mTvTime;
    public TextView mTvUserCount;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CloseRoomBean f36120n;

    @Override // in.a
    public int e5() {
        return R.layout.act_end_interface;
    }

    @Override // in.a
    public void g5() {
        this.mIvAvatar = (ImageView) findViewById(R.id.iv_avatar);
        this.mTvName = (TextView) findViewById(R.id.tv_name);
        this.mTvId = (TextView) findViewById(R.id.tv_id);
        this.mTvCount = (TextView) findViewById(R.id.tv_count);
        this.mTvTime = (TextView) findViewById(R.id.tv_time);
        this.mTvUserCount = (TextView) findViewById(R.id.tv_user_count);
        this.mTvLikeCount = (TextView) findViewById(R.id.tv_like_count);
        this.mTvBut = (TextView) findViewById(R.id.tv_but);
        this.mLinBj = (LinearLayout) findViewById(R.id.lin_bj);
        this.mTvBut.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        CloseRoomBean closeRoomBean = (CloseRoomBean) getIntent().getSerializableExtra("data");
        this.f36120n = closeRoomBean;
        if (closeRoomBean == null) {
            finish();
            return;
        }
        this.mTvCount.setText(b1.a(closeRoomBean.getIncomeCount().intValue()));
        this.mTvUserCount.setText(b1.a(this.f36120n.getUserCount().intValue()));
        this.mTvLikeCount.setText(b1.a(this.f36120n.getLikeCount().intValue()));
        this.mTvTime.setText(this.f36120n.getOnlineTime());
        d.f(this, this.mIvAvatar, this.f36120n.getCover());
        this.mTvName.setText(this.f36120n.getNickname());
        v5(this.f36120n.getNoticeMsg());
        this.mTvId.setText(String.valueOf(this.f36120n.getMasterUid()));
    }

    @Override // in.a
    public View k5() {
        return this.mLinBj;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.tv_but) {
            return;
        }
        a0.a(new b0(1031, this.f36120n.getRoomId()));
        finish();
    }
}
