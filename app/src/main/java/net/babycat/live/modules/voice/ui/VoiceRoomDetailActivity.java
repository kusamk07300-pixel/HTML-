package net.babycat.live.modules.voice.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.v0;
import ao.x0;
import bn.e;
import in.b;
import java.util.ArrayList;
import net.babycat.live.model.RoomDetailBean;
import net.babycat.live.platform.util.r0;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;
import vm.c;
import wn.d;

/* JADX INFO: loaded from: classes4.dex */
public class VoiceRoomDetailActivity extends b<e> implements c.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f36108n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RecyclerView f36109o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RecyclerView f36110p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f36111q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f36112r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f36113s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f36114t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f36115u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f36116v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public x0 f36117w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public v0 f36118x;

    public class a implements Topbar.TopbarRightClickListener {
        public a() {
        }

        @Override // net.babycat.live.platform.widget.view.Topbar.TopbarRightClickListener
        public void rightClick() {
            VoiceRoomDetailActivity.this.o5(RoomManagerActivity.class);
        }
    }

    @Override // vm.c.b
    public void A4(RoomDetailBean roomDetailBean) {
        d.f(this, this.f36111q, roomDetailBean.getCover());
        this.f36112r.setText(roomDetailBean.getRoom_name());
        this.f36113s.setText(getString(R.string.room_id) + "��" + roomDetailBean.getRoom_id());
        this.f36114t.setText(roomDetailBean.getTag());
        this.f36114t.setBackgroundResource(r0.g(roomDetailBean.getTag()));
        this.f36115u.setText(roomDetailBean.getMaster_info().getNickname());
        this.f36117w.v1(roomDetailBean.getManger_list());
        this.f36118x.v1(roomDetailBean.getGift_wall());
    }

    @Override // in.a
    public int e5() {
        return R.layout.activity_voice_room_detail;
    }

    @Override // in.a
    public void g5() {
        this.f36108n = (Topbar) findViewById(R.id.common_topbar);
        this.f36109o = (RecyclerView) findViewById(R.id.rv_manage_list);
        this.f36110p = (RecyclerView) findViewById(R.id.rv_gift_list);
        this.f36111q = (ImageView) findViewById(R.id.iv_avatar);
        this.f36112r = (TextView) findViewById(R.id.tv_room_name);
        this.f36113s = (TextView) findViewById(R.id.tv_room_id);
        this.f36114t = (TextView) findViewById(R.id.tv_tag);
        this.f36115u = (TextView) findViewById(R.id.tv_master);
    }

    @Override // in.a
    public void h5() {
        m5(false);
        this.f36116v = getIntent().getStringExtra("room_detail_id");
        t.S0(this, this.f36108n, getString(R.string.room_detail));
        this.f36108n.setTopBarWhite();
        this.f36108n.setRightTxtVisible();
        this.f36108n.setRightText(getString(R.string.room_manger));
        this.f36108n.setRightTextTextColor(-1);
        this.f36108n.setOnTopbarRightClickListener(new a());
        this.f36117w = new x0(new ArrayList());
        this.f36109o.setLayoutManager(new GridLayoutManager(this, 3));
        this.f36109o.setAdapter(this.f36117w);
        this.f36118x = new v0(new ArrayList());
        this.f36110p.setLayoutManager(new GridLayoutManager(this, 4));
        this.f36110p.setAdapter(this.f36118x);
        this.f36118x.c1(R.layout.view_state_empty_white);
        ((e) this.f27702e).d0(this.f36116v);
    }

    @Override // in.a
    public View k5() {
        return null;
    }
}
