package com.google.android.gms.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class arx extends AbstractC2041xh<Integer, Object> {

    /* JADX INFO: renamed from: a */
    public Long f7172a;

    /* JADX INFO: renamed from: b */
    public Boolean f7173b;

    /* JADX INFO: renamed from: c */
    public Boolean f7174c;

    public arx() {
    }

    public arx(String str) {
        mo7932a(str);
    }

    @Override // com.google.android.gms.internal.AbstractC2041xh
    /* JADX INFO: renamed from: a */
    protected final HashMap<Integer, Object> mo7931a() {
        HashMap<Integer, Object> map = new HashMap<>();
        map.put(0, this.f7172a);
        map.put(1, this.f7173b);
        map.put(2, this.f7174c);
        return map;
    }

    @Override // com.google.android.gms.internal.AbstractC2041xh
    /* JADX INFO: renamed from: a */
    protected final void mo7932a(String str) {
        HashMap mapB = m12564b(str);
        if (mapB != null) {
            this.f7172a = (Long) mapB.get(0);
            this.f7173b = (Boolean) mapB.get(1);
            this.f7174c = (Boolean) mapB.get(2);
        }
    }
}
