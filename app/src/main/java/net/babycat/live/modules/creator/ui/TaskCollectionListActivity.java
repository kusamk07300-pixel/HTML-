package net.babycat.live.modules.creator.ui;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl.i;
import cl.o;
import com.chad.library.adapter.base.BaseQuickAdapter;
import f.n0;
import gl.c0;
import java.util.List;
import net.babycat.live.model.AnthorHome;
import net.babycat.live.platform.util.a0;
import net.babycat.live.platform.util.b0;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.util.x0;
import net.babycat.live.platform.widget.view.Topbar;
import q7.e;
import qmyy.babycat.live.R;
import ye.b;

/* JADX INFO: loaded from: classes4.dex */
public class TaskCollectionListActivity extends in.b<c0> implements o.b {
    public Topbar mCommonTopbar;
    public RecyclerView mReList;
    public TextView mTvPrompt;
    public TextView mTvReceive;
    public TextView mTvTitle;
    public View mVBj;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i f35204p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AnthorHome.ActivityDTO f35206r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35202n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35203o = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<AnthorHome.ActivityDTO.LiveDTO> f35205q = null;

    public class a implements Topbar.TopbarRightClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35207a;

        public a(String str) {
            this.f35207a = str;
        }

        @Override // net.babycat.live.platform.widget.view.Topbar.TopbarRightClickListener
        public void rightClick() {
            if (t.t0()) {
                b.C0752b c0752bY = new b.C0752b(TaskCollectionListActivity.this).Y(true);
                TaskCollectionListActivity taskCollectionListActivity = TaskCollectionListActivity.this;
                c0752bY.t(new fl.b(taskCollectionListActivity, taskCollectionListActivity.f35202n, this.f35207a)).N();
            }
        }
    }

    public class b implements e {
        public b() {
        }

        @Override // q7.e
        public void a(@n0 BaseQuickAdapter baseQuickAdapter, @n0 View view, int i10) {
            AnthorHome.ActivityDTO.LiveDTO liveDTO = (AnthorHome.ActivityDTO.LiveDTO) baseQuickAdapter.getData().get(i10);
            if (TaskCollectionListActivity.this.f35202n == 1 && t.t0()) {
                ((c0) TaskCollectionListActivity.this.f27702e).l0(liveDTO.getId(), TaskCollectionListActivity.this.f35206r.getPkActId(), "pk");
            }
        }
    }

    @Override // cl.o.b
    public void F3(String str) {
        for (int i10 = 0; i10 < this.f35204p.getData().size(); i10++) {
            if (this.f35204p.getData().get(i10).getId().equals(str)) {
                this.f35204p.getData().get(i10).setStatus(1);
            }
        }
        int i11 = this.f35202n;
        if (i11 == 0) {
            this.f35203o = 1;
            this.f35206r.setLiveGotReward(1);
            this.mTvReceive.setBackgroundResource(R.mipmap.iv_task_graying);
            this.mTvReceive.setText(getString(R.string.complete));
            a0.a(new b0(1112, str));
        } else if (i11 == 2) {
            this.f35203o = 1;
            this.f35206r.setVoiceGotReward(1);
            this.mTvReceive.setBackgroundResource(R.mipmap.iv_task_graying);
            this.mTvReceive.setText(getString(R.string.complete));
            a0.a(new b0(ok.e.EVENT_TASK_REFRESH_DATA_VOICE, str));
        } else {
            a0.a(new b0(1113, str));
        }
        this.f35204p.notifyDataSetChanged();
    }

    @Override // in.a
    public int e5() {
        return R.layout.act_live_task;
    }

    @Override // in.a
    public void g5() {
        this.mVBj = findViewById(R.id.v_bj);
        this.mCommonTopbar = (Topbar) findViewById(R.id.common_topbar);
        this.mTvTitle = (TextView) findViewById(R.id.tv_title);
        this.mReList = (RecyclerView) findViewById(R.id.re_list);
        this.mTvReceive = (TextView) findViewById(R.id.tv_receive);
        this.mTvPrompt = (TextView) findViewById(R.id.tv_prompt);
        this.mTvReceive.setOnClickListener(this);
    }

    @Override // in.a
    public void h5() {
        String string;
        String liveActId;
        this.f35202n = getIntent().getIntExtra("type", 0);
        AnthorHome.ActivityDTO activityDTO = (AnthorHome.ActivityDTO) getIntent().getSerializableExtra("data");
        this.f35206r = activityDTO;
        int i10 = this.f35202n;
        if (i10 == 1) {
            this.f35205q = activityDTO.getPk();
            this.f35203o = this.f35206r.getLiveGotReward().intValue();
            string = getString(R.string.pk_task);
            liveActId = this.f35206r.getPkActId();
            this.mVBj.setBackgroundResource(R.mipmap.iv_pk_task_count);
            this.mTvPrompt.setVisibility(8);
            this.mTvReceive.setVisibility(8);
            this.mTvTitle.setText(this.f35206r.getPkTitle());
        } else if (i10 == 2) {
            this.f35205q = activityDTO.getVoice();
            this.f35203o = this.f35206r.getVoiceGotReward().intValue();
            string = getString(R.string.voice_host);
            liveActId = this.f35206r.getVoiceActId();
            this.mVBj.setBackgroundResource(R.mipmap.iv_live_duration_bj);
            this.mTvPrompt.setVisibility(0);
            this.mTvReceive.setVisibility(0);
            this.mTvTitle.setText(this.f35206r.getVoiceTitle());
        } else {
            this.f35205q = activityDTO.getLive();
            this.f35203o = this.f35206r.getLiveGotReward().intValue();
            string = getString(R.string.live_task);
            liveActId = this.f35206r.getLiveActId();
            this.mVBj.setBackgroundResource(R.mipmap.iv_live_duration_bj);
            this.mTvPrompt.setVisibility(0);
            this.mTvReceive.setVisibility(0);
            this.mTvTitle.setText(this.f35206r.getLiveTitle());
        }
        m5(true);
        t.S0(this, this.mCommonTopbar, string);
        this.mCommonTopbar.setTopBarWhite();
        this.mCommonTopbar.setRigtImage(R.mipmap.image_question);
        this.mCommonTopbar.setOnTopbarRightClickListener(new a(liveActId));
        this.f35204p = new i(this.f35205q, this.f35202n);
        this.mReList.setLayoutManager(new LinearLayoutManager(this));
        this.mReList.setAdapter(this.f35204p);
        this.f35204p.c1(R.layout.view_state_empty_search);
        this.f35204p.r(R.id.iv_box);
        this.f35204p.e(new b());
        if (this.f35203o == 1) {
            this.mTvReceive.setBackgroundResource(R.mipmap.iv_task_graying);
            this.mTvReceive.setText(getString(R.string.complete));
        }
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // in.b, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.tv_receive && t.t0() && this.f35203o == 0) {
            if (this.f35202n == 2) {
                ((c0) this.f27702e).l0(x0.IMAGE_1, this.f35206r.getVoiceActId(), "voice");
            } else {
                ((c0) this.f27702e).l0(x0.IMAGE_1, this.f35206r.getLiveActId(), "live");
            }
        }
    }
}
