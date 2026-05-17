package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class cls implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1700kr f10310a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f10311b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ clr f10312c;

    cls(clr clrVar, C1700kr c1700kr, String str) {
        this.f10312c = clrVar;
        this.f10310a = c1700kr;
        this.f10311b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10310a.m11657b(this.f10312c.f10299d.m5509J().get(this.f10311b));
    }
}
