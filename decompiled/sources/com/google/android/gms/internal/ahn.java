package com.google.android.gms.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ahn extends AbstractC2041xh<Integer, Long> {

    /* JADX INFO: renamed from: a */
    public long f6787a;

    /* JADX INFO: renamed from: b */
    public long f6788b;

    public ahn() {
        this.f6787a = -1L;
        this.f6788b = -1L;
    }

    public ahn(String str) {
        this();
        mo7932a(str);
    }

    @Override // com.google.android.gms.internal.AbstractC2041xh
    /* JADX INFO: renamed from: a */
    protected final HashMap<Integer, Long> mo7931a() {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, Long.valueOf(this.f6787a));
        map.put(1, Long.valueOf(this.f6788b));
        return map;
    }

    @Override // com.google.android.gms.internal.AbstractC2041xh
    /* JADX INFO: renamed from: a */
    protected final void mo7932a(String str) {
        HashMap mapB = m12564b(str);
        if (mapB != null) {
            this.f6787a = ((Long) mapB.get(0)).longValue();
            this.f6788b = ((Long) mapB.get(1)).longValue();
        }
    }
}
