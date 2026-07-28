package net.babycat.live.platform.util;

import java.util.ArrayList;
import java.util.List;
import net.babycat.live.model.GiftInteractRecordBean;

/* JADX INFO: loaded from: classes3.dex */
public class i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static i0 f36802c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<GiftInteractRecordBean> f36803a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<Integer> f36804b = new ArrayList();

    public static i0 d() {
        if (f36802c == null) {
            synchronized (i0.class) {
                try {
                    if (f36802c == null) {
                        f36802c = new i0();
                    }
                } finally {
                }
            }
        }
        return f36802c;
    }

    public void a(GiftInteractRecordBean giftInteractRecordBean) {
        if (giftInteractRecordBean != null) {
            this.f36803a.add(0, giftInteractRecordBean);
        }
    }

    public void b() {
        this.f36803a.clear();
        this.f36804b.clear();
    }

    public List<GiftInteractRecordBean> c() {
        return new ArrayList(this.f36803a);
    }

    public boolean e(int i10) {
        return this.f36804b.contains(Integer.valueOf(i10));
    }

    public void f(List<Integer> list) {
        this.f36804b.clear();
        if (list != null) {
            this.f36804b.addAll(list);
        }
    }
}
