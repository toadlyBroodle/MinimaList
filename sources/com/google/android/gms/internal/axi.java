package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class axi {

    /* JADX INFO: renamed from: a */
    private final axz f7536a;

    /* JADX INFO: renamed from: b */
    private final axz f7537b;

    public axi(byte[] bArr, byte[] bArr2) {
        this.f7536a = axz.m8676a(bArr);
        this.f7537b = axz.m8676a(bArr2);
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m8665a() {
        if (this.f7536a == null) {
            return null;
        }
        return this.f7536a.m8677a();
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m8666b() {
        if (this.f7537b == null) {
            return null;
        }
        return this.f7537b.m8677a();
    }
}
