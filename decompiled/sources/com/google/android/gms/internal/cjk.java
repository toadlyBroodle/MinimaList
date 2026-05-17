package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class cjk<T> {

    /* JADX INFO: renamed from: a */
    public final T f10171a;

    /* JADX INFO: renamed from: b */
    public final C2048xo f10172b;

    /* JADX INFO: renamed from: c */
    public final C1471ce f10173c;

    /* JADX INFO: renamed from: d */
    public boolean f10174d;

    private cjk(C1471ce c1471ce) {
        this.f10174d = false;
        this.f10171a = null;
        this.f10172b = null;
        this.f10173c = c1471ce;
    }

    private cjk(T t, C2048xo c2048xo) {
        this.f10174d = false;
        this.f10171a = t;
        this.f10172b = c2048xo;
        this.f10173c = null;
    }

    /* JADX INFO: renamed from: a */
    public static <T> cjk<T> m11026a(C1471ce c1471ce) {
        return new cjk<>(c1471ce);
    }

    /* JADX INFO: renamed from: a */
    public static <T> cjk<T> m11027a(T t, C2048xo c2048xo) {
        return new cjk<>(t, c2048xo);
    }
}
