package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
@cnb
public final class bxm {

    /* JADX INFO: renamed from: a */
    private static final Object f9293a = new Object();

    /* JADX INFO: renamed from: b */
    private static bxm f9294b;

    /* JADX INFO: renamed from: c */
    private final C1657jb f9295c = new C1657jb();

    /* JADX INFO: renamed from: d */
    private final bxf f9296d = new bxf(new bww(), new bwv(), new bzl(), new ces(), new C1491cy(), new ckh(), new cet());

    /* JADX INFO: renamed from: e */
    private final String f9297e = C1657jb.m11575c();

    /* JADX INFO: renamed from: f */
    private final caj f9298f = new caj();

    /* JADX INFO: renamed from: g */
    private final cak f9299g = new cak();

    /* JADX INFO: renamed from: h */
    private final cal f9300h = new cal();

    static {
        bxm bxmVar = new bxm();
        synchronized (f9293a) {
            f9294b = bxmVar;
        }
    }

    protected bxm() {
    }

    /* JADX INFO: renamed from: a */
    public static C1657jb m10404a() {
        return m10410g().f9295c;
    }

    /* JADX INFO: renamed from: b */
    public static bxf m10405b() {
        return m10410g().f9296d;
    }

    /* JADX INFO: renamed from: c */
    public static String m10406c() {
        return m10410g().f9297e;
    }

    /* JADX INFO: renamed from: d */
    public static cak m10407d() {
        return m10410g().f9299g;
    }

    /* JADX INFO: renamed from: e */
    public static caj m10408e() {
        return m10410g().f9298f;
    }

    /* JADX INFO: renamed from: f */
    public static cal m10409f() {
        return m10410g().f9300h;
    }

    /* JADX INFO: renamed from: g */
    private static bxm m10410g() {
        bxm bxmVar;
        synchronized (f9293a) {
            bxmVar = f9294b;
        }
        return bxmVar;
    }
}
