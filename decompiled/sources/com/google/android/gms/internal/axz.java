package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
public final class axz {

    /* JADX INFO: renamed from: a */
    private final byte[] f7563a;

    private axz(byte[] bArr, int i, int i2) {
        this.f7563a = new byte[i2];
        System.arraycopy(bArr, 0, this.f7563a, 0, i2);
    }

    /* JADX INFO: renamed from: a */
    public static axz m8676a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new axz(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m8677a() {
        byte[] bArr = new byte[this.f7563a.length];
        System.arraycopy(this.f7563a, 0, bArr, 0, this.f7563a.length);
        return bArr;
    }
}
