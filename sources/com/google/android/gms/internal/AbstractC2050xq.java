package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.xq */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2050xq<T> {

    /* JADX INFO: renamed from: a */
    private final int f12509a;

    /* JADX INFO: renamed from: b */
    private final String f12510b;

    /* JADX INFO: renamed from: c */
    private final T f12511c;

    private AbstractC2050xq(int i, String str, T t) {
        this.f12509a = i;
        this.f12510b = str;
        this.f12511c = t;
        C2063yc.m12593a().m12590a(this);
    }

    /* JADX INFO: renamed from: a */
    public static C2052xs m12579a(int i, String str, Boolean bool) {
        return new C2052xs(0, str, bool);
    }

    /* JADX INFO: renamed from: a */
    public static C2053xt m12580a(int i, String str, int i2) {
        return new C2053xt(0, str, Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: a */
    public static C2054xu m12581a(int i, String str, long j) {
        return new C2054xu(0, str, Long.valueOf(j));
    }

    /* JADX INFO: renamed from: a */
    protected abstract T mo12582a(InterfaceC2058xy interfaceC2058xy);

    /* JADX INFO: renamed from: a */
    public final String m12583a() {
        return this.f12510b;
    }

    /* JADX INFO: renamed from: b */
    public final T m12584b() {
        return this.f12511c;
    }

    /* JADX INFO: renamed from: c */
    public final int m12585c() {
        return this.f12509a;
    }
}
