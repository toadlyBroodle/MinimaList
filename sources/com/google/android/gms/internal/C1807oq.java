package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.oq */
/* JADX INFO: loaded from: classes.dex */
@cnb
public final class C1807oq {

    /* JADX INFO: renamed from: a */
    public final int f11220a;

    /* JADX INFO: renamed from: b */
    public final int f11221b;

    /* JADX INFO: renamed from: c */
    private final int f11222c;

    private C1807oq(int i, int i2, int i3) {
        this.f11222c = i;
        this.f11221b = i2;
        this.f11220a = i3;
    }

    /* JADX INFO: renamed from: a */
    public static C1807oq m11925a() {
        return new C1807oq(0, 0, 0);
    }

    /* JADX INFO: renamed from: a */
    public static C1807oq m11926a(int i, int i2) {
        return new C1807oq(1, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static C1807oq m11927a(bxb bxbVar) {
        return bxbVar.f9250d ? new C1807oq(3, 0, 0) : bxbVar.f9255i ? new C1807oq(2, 0, 0) : bxbVar.f9254h ? m11925a() : m11926a(bxbVar.f9252f, bxbVar.f9249c);
    }

    /* JADX INFO: renamed from: b */
    public static C1807oq m11928b() {
        return new C1807oq(4, 0, 0);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m11929c() {
        return this.f11222c == 2;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m11930d() {
        return this.f11222c == 3;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m11931e() {
        return this.f11222c == 0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m11932f() {
        return this.f11222c == 4;
    }
}
