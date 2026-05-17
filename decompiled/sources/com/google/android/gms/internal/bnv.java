package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bnv {

    /* JADX INFO: renamed from: a */
    private final byte[] f8504a = new byte[256];

    /* JADX INFO: renamed from: b */
    private int f8505b;

    /* JADX INFO: renamed from: c */
    private int f8506c;

    public bnv(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f8504a[i] = (byte) i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            i2 = (i2 + this.f8504a[i3] + bArr[i3 % bArr.length]) & 255;
            byte b = this.f8504a[i3];
            this.f8504a[i3] = this.f8504a[i2];
            this.f8504a[i2] = b;
        }
        this.f8505b = 0;
        this.f8506c = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m9746a(byte[] bArr) {
        int i = this.f8505b;
        int i2 = this.f8506c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            i2 = (i2 + this.f8504a[i]) & 255;
            byte b = this.f8504a[i];
            this.f8504a[i] = this.f8504a[i2];
            this.f8504a[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.f8504a[(this.f8504a[i] + this.f8504a[i2]) & 255]);
        }
        this.f8505b = i;
        this.f8506c = i2;
    }
}
