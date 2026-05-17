package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.internal.zt */
/* JADX INFO: loaded from: classes.dex */
public final class C2107zt<V> {

    /* JADX INFO: renamed from: a */
    private final V f12735a;

    /* JADX INFO: renamed from: b */
    private final C2002vw<V> f12736b;

    /* JADX INFO: renamed from: c */
    private final String f12737c;

    private C2107zt(String str, C2002vw<V> c2002vw, V v) {
        C1221aj.m7065a(c2002vw);
        this.f12736b = c2002vw;
        this.f12735a = v;
        this.f12737c = str;
    }

    /* JADX INFO: renamed from: a */
    static C2107zt<Integer> m12773a(String str, int i, int i2) {
        return new C2107zt<>(str, C2002vw.m12481a(str, Integer.valueOf(i2)), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    static C2107zt<Long> m12774a(String str, long j, long j2) {
        return new C2107zt<>(str, C2002vw.m12482a(str, Long.valueOf(j2)), Long.valueOf(j));
    }

    /* JADX INFO: renamed from: a */
    static C2107zt<String> m12775a(String str, String str2, String str3) {
        return new C2107zt<>(str, C2002vw.m12483a(str, str3), str2);
    }

    /* JADX INFO: renamed from: a */
    static C2107zt<Boolean> m12776a(String str, boolean z, boolean z2) {
        return new C2107zt<>(str, C2002vw.m12484a(str, z2), Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: a */
    public final V m12777a(V v) {
        return v != null ? v : this.f12735a;
    }

    /* JADX INFO: renamed from: a */
    public final String m12778a() {
        return this.f12737c;
    }

    /* JADX INFO: renamed from: b */
    public final V m12779b() {
        return this.f12735a;
    }
}
