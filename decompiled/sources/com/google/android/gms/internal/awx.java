package com.google.android.gms.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class awx extends awy {
    private awx(byte[] bArr) {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.awv
    /* JADX INFO: renamed from: a */
    final int mo8646a() {
        return 12;
    }

    @Override // com.google.android.gms.internal.awv
    /* JADX INFO: renamed from: a */
    final int[] mo8648a(byte[] bArr, int i) {
        int[] iArr = new int[16];
        awy.m8657e(iArr);
        awy.m8655b(iArr, this.f7513b.m8677a());
        iArr[12] = i;
        System.arraycopy(m8644a(ByteBuffer.wrap(bArr)), 0, iArr, 13, 3);
        return iArr;
    }

    @Override // com.google.android.gms.internal.awv
    /* JADX INFO: renamed from: c */
    final awz mo8651c(byte[] bArr) {
        return new awz(this, bArr, 1);
    }

    @Override // com.google.android.gms.internal.awv
    /* JADX INFO: renamed from: c */
    final void mo8652c(int[] iArr) {
        iArr[12] = iArr[12] + 1;
    }
}
