package com.google.android.gms.internal;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.android.gms.internal.iq */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1645iq {

    /* JADX INFO: renamed from: a */
    private Map<Integer, Bitmap> f10802a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    private AtomicInteger f10803b = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public final int m11537a(Bitmap bitmap) {
        if (bitmap == null) {
            C1560fm.m11610b("Bitmap is null. Skipping putting into the Memory Map.");
            return -1;
        }
        int andIncrement = this.f10803b.getAndIncrement();
        this.f10802a.put(Integer.valueOf(andIncrement), bitmap);
        return andIncrement;
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m11538a(Integer num) {
        return this.f10802a.get(num);
    }

    /* JADX INFO: renamed from: b */
    public final void m11539b(Integer num) {
        this.f10802a.remove(num);
    }
}
