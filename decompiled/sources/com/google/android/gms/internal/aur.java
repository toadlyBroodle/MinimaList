package com.google.android.gms.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class aur extends AbstractC2041xh<Integer, Long> {

    /* JADX INFO: renamed from: a */
    public Long f7315a;

    /* JADX INFO: renamed from: b */
    public Long f7316b;

    /* JADX INFO: renamed from: c */
    public Long f7317c;

    public aur() {
    }

    public aur(String str) {
        mo7932a(str);
    }

    @Override // com.google.android.gms.internal.AbstractC2041xh
    /* JADX INFO: renamed from: a */
    protected final HashMap<Integer, Long> mo7931a() {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, this.f7315a);
        map.put(1, this.f7316b);
        map.put(2, this.f7317c);
        return map;
    }

    @Override // com.google.android.gms.internal.AbstractC2041xh
    /* JADX INFO: renamed from: a */
    protected final void mo7932a(String str) {
        HashMap mapB = m12564b(str);
        if (mapB != null) {
            this.f7315a = (Long) mapB.get(0);
            this.f7316b = (Long) mapB.get(1);
            this.f7317c = (Long) mapB.get(2);
        }
    }
}
