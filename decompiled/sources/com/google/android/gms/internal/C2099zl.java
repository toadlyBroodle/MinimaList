package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C1221aj;

/* JADX INFO: renamed from: com.google.android.gms.internal.zl */
/* JADX INFO: loaded from: classes.dex */
final class C2099zl {

    /* JADX INFO: renamed from: a */
    final String f12677a;

    /* JADX INFO: renamed from: b */
    final String f12678b;

    /* JADX INFO: renamed from: c */
    final long f12679c;

    /* JADX INFO: renamed from: d */
    final long f12680d;

    /* JADX INFO: renamed from: e */
    final long f12681e;

    /* JADX INFO: renamed from: f */
    final long f12682f;

    /* JADX INFO: renamed from: g */
    final Long f12683g;

    /* JADX INFO: renamed from: h */
    final Long f12684h;

    /* JADX INFO: renamed from: i */
    final Boolean f12685i;

    C2099zl(String str, String str2, long j, long j2, long j3, long j4, Long l, Long l2, Boolean bool) {
        C1221aj.m7067a(str);
        C1221aj.m7067a(str2);
        C1221aj.m7074b(j >= 0);
        C1221aj.m7074b(j2 >= 0);
        C1221aj.m7074b(j4 >= 0);
        this.f12677a = str;
        this.f12678b = str2;
        this.f12679c = j;
        this.f12680d = j2;
        this.f12681e = j3;
        this.f12682f = j4;
        this.f12683g = l;
        this.f12684h = l2;
        this.f12685i = bool;
    }

    /* JADX INFO: renamed from: a */
    final C2099zl m12762a() {
        return new C2099zl(this.f12677a, this.f12678b, this.f12679c + 1, this.f12680d + 1, this.f12681e, this.f12682f, this.f12683g, this.f12684h, this.f12685i);
    }

    /* JADX INFO: renamed from: a */
    final C2099zl m12763a(long j) {
        return new C2099zl(this.f12677a, this.f12678b, this.f12679c, this.f12680d, j, this.f12682f, this.f12683g, this.f12684h, this.f12685i);
    }

    /* JADX INFO: renamed from: a */
    final C2099zl m12764a(Long l, Long l2, Boolean bool) {
        return new C2099zl(this.f12677a, this.f12678b, this.f12679c, this.f12680d, this.f12681e, this.f12682f, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    /* JADX INFO: renamed from: b */
    final C2099zl m12765b(long j) {
        return new C2099zl(this.f12677a, this.f12678b, this.f12679c, this.f12680d, this.f12681e, j, this.f12683g, this.f12684h, this.f12685i);
    }
}
