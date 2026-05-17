package com.google.android.gms.internal;

import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.xj */
/* JADX INFO: loaded from: classes.dex */
public final class C2043xj extends AbstractC2041xh<Integer, Object> {

    /* JADX INFO: renamed from: a */
    public String f12294a;

    /* JADX INFO: renamed from: b */
    public long f12295b;

    /* JADX INFO: renamed from: c */
    public String f12296c;

    /* JADX INFO: renamed from: d */
    public String f12297d;

    /* JADX INFO: renamed from: e */
    public String f12298e;

    public C2043xj() {
        this.f12294a = "E";
        this.f12295b = -1L;
        this.f12296c = "E";
        this.f12297d = "E";
        this.f12298e = "E";
    }

    public C2043xj(String str) {
        this();
        mo7932a(str);
    }

    @Override // com.google.android.gms.internal.AbstractC2041xh
    /* JADX INFO: renamed from: a */
    protected final HashMap<Integer, Object> mo7931a() {
        HashMap<Integer, Object> map = new HashMap<>();
        map.put(0, this.f12294a);
        map.put(4, this.f12298e);
        map.put(3, this.f12297d);
        map.put(2, this.f12296c);
        map.put(1, Long.valueOf(this.f12295b));
        return map;
    }

    @Override // com.google.android.gms.internal.AbstractC2041xh
    /* JADX INFO: renamed from: a */
    protected final void mo7932a(String str) {
        HashMap mapB = m12564b(str);
        if (mapB != null) {
            this.f12294a = mapB.get(0) == null ? "E" : (String) mapB.get(0);
            this.f12295b = mapB.get(1) == null ? -1L : ((Long) mapB.get(1)).longValue();
            this.f12296c = mapB.get(2) == null ? "E" : (String) mapB.get(2);
            this.f12297d = mapB.get(3) == null ? "E" : (String) mapB.get(3);
            this.f12298e = mapB.get(4) == null ? "E" : (String) mapB.get(4);
        }
    }
}
