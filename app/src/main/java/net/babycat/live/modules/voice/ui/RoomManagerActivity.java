package net.babycat.live.modules.voice.ui;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bn.a;
import in.b;
import java.util.ArrayList;
import net.babycat.live.platform.util.i1;
import net.babycat.live.platform.util.t;
import net.babycat.live.platform.widget.view.Topbar;
import qmyy.babycat.live.R;
import vm.a;

/* JADX INFO: loaded from: classes4.dex */
public class RoomManagerActivity extends b<a> implements a.b {
    public mm.a mAdapter;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Topbar f36106n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RecyclerView f36107o;

    @Override // in.a
    public int e5() {
        return R.layout.act_room_manger;
    }

    @Override // in.a
    public void g5() {
        this.f36106n = (Topbar) findViewById(R.id.common_topbar);
        this.f36107o = (RecyclerView) findViewById(R.id.recy_label);
    }

    @Override // in.a
    public void h5() {
        t.S0(this.f27688a, this.f36106n, getString(R.string.room_manger));
        this.mAdapter = new mm.a(new ArrayList());
        this.f36107o.addItemDecoration(new i1.a(this).d(17.0f).g(17.0f).b(268435455).f(false).a());
        this.f36107o.setLayoutManager(new GridLayoutManager(this, 5));
        this.f36107o.setAdapter(this.mAdapter);
    }

    @Override // in.a
    public View k5() {
        return null;
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z10) {
        super.onPointerCaptureChanged(z10);
    }
}
