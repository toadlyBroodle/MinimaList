package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.internal.rb */
/* JADX INFO: loaded from: classes.dex */
public final class C1873rb<V> {

    /* JADX INFO: renamed from: a */
    private final V f11443a;

    /* JADX INFO: renamed from: b */
    private final C2002vw<V> f11444b;

    private C1873rb(C2002vw<V> c2002vw, V v) {
        C1221aj.m7065a(c2002vw);
        this.f11444b = c2002vw;
        this.f11443a = v;
    }

    /* JADX INFO: renamed from: a */
    static C1873rb<Float> m12199a(String str, float f, float f2) {
        return new C1873rb<>(C2002vw.m12480a(str, Float.valueOf(0.5f)), Float.valueOf(0.5f));
    }

    /* JADX INFO: renamed from: a */
    static C1873rb<Integer> m12200a(String str, int i, int i2) {
        return new C1873rb<>(C2002vw.m12481a(str, Integer.valueOf(i2)), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    static C1873rb<Long> m12201a(String str, long j, long j2) {
        return new C1873rb<>(C2002vw.m12482a(str, Long.valueOf(j2)), Long.valueOf(j));
    }

    /* JADX INFO: renamed from: a */
    static C1873rb<String> m12202a(String str, String str2, String str3) {
        return new C1873rb<>(C2002vw.m12483a(str, str3), str2);
    }

    /* JADX INFO: renamed from: a */
    static C1873rb<Boolean> m12203a(String str, boolean z, boolean z2) {
        return new C1873rb<>(C2002vw.m12484a(str, z2), Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: a */
    public final V m12204a() {
        return this.f11443a;
    }
}
