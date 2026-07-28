package net.babycat.live.platform.util;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f36833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GestureDetector f36834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView.a0 f36835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f36836d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f36837e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f36838f;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View viewFindChildViewUnder;
            super.onLongPress(motionEvent);
            if (k1.this.f36837e == null || (viewFindChildViewUnder = k1.this.f36833a.findChildViewUnder(motionEvent.getX(), motionEvent.getY())) == null) {
                return;
            }
            k1.this.f36837e.a(k1.this.f36833a.getChildLayoutPosition(viewFindChildViewUnder), viewFindChildViewUnder);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            View viewFindChildViewUnder;
            if (k1.this.f36836d == null || (viewFindChildViewUnder = k1.this.f36833a.findChildViewUnder(motionEvent.getX(), motionEvent.getY())) == null) {
                return super.onSingleTapUp(motionEvent);
            }
            k1.this.f36836d.onItemClick(k1.this.f36833a.getChildLayoutPosition(viewFindChildViewUnder), viewFindChildViewUnder);
            return true;
        }
    }

    public class b extends RecyclerView.a0 {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a0, androidx.recyclerview.widget.RecyclerView.t
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            return k1.this.f36834b.onTouchEvent(motionEvent);
        }
    }

    public interface c {
        void onItemClick(int i10, View view);
    }

    public interface d {
        void a(int i10, View view);
    }

    public k1(Context context, RecyclerView recyclerView) {
        this.f36834b = null;
        this.f36838f = context;
        this.f36833a = recyclerView;
        this.f36834b = new GestureDetector(context, new a());
        b bVar = new b();
        this.f36835c = bVar;
        this.f36833a.addOnItemTouchListener(bVar);
    }

    public void e(c cVar) {
        this.f36836d = cVar;
    }

    public void f(d dVar) {
        this.f36837e = dVar;
    }
}
