package net.babycat.live.platform.util;

import java.util.ArrayList;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<Integer> f36843a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Random f36844b = new Random();

    public int a() {
        int iNextInt;
        if (this.f36843a.size() == 6) {
            this.f36843a.clear();
        }
        do {
            iNextInt = this.f36844b.nextInt(6) + 1;
        } while (this.f36843a.contains(Integer.valueOf(iNextInt)));
        this.f36843a.add(Integer.valueOf(iNextInt));
        return iNextInt;
    }
}
