package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.yc */
/* JADX INFO: loaded from: classes.dex */
public final class C2063yc {

    /* JADX INFO: renamed from: a */
    private static C2063yc f12518a;

    /* JADX INFO: renamed from: b */
    private final C2056xw f12519b = new C2056xw();

    /* JADX INFO: renamed from: c */
    private final C2057xx f12520c = new C2057xx();

    static {
        C2063yc c2063yc = new C2063yc();
        synchronized (C2063yc.class) {
            f12518a = c2063yc;
        }
    }

    private C2063yc() {
    }

    /* JADX INFO: renamed from: a */
    public static C2056xw m12593a() {
        return m12595c().f12519b;
    }

    /* JADX INFO: renamed from: b */
    public static C2057xx m12594b() {
        return m12595c().f12520c;
    }

    /* JADX INFO: renamed from: c */
    private static C2063yc m12595c() {
        C2063yc c2063yc;
        synchronized (C2063yc.class) {
            c2063yc = f12518a;
        }
        return c2063yc;
    }
}
