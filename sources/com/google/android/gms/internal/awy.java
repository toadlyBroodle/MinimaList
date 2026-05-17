package com.google.android.gms.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
abstract class awy extends awv {
    private awy(byte[] bArr) {
        super(bArr);
    }

    /* JADX INFO: renamed from: a */
    private static void m8653a(int[] iArr, int i, int i2, int i3, int i4) {
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = m8642a(iArr[i4] ^ iArr[i], 16);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = m8642a(iArr[i2] ^ iArr[i3], 12);
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = m8642a(iArr[i4] ^ iArr[i], 8);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = m8642a(iArr[i2] ^ iArr[i3], 7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m8655b(int[] iArr, byte[] bArr) {
        int[] iArrA = m8644a(ByteBuffer.wrap(bArr));
        System.arraycopy(iArrA, 0, iArr, 4, iArrA.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static void m8657e(int[] iArr) {
        System.arraycopy(f7511a, 0, iArr, 0, f7511a.length);
    }

    @Override // com.google.android.gms.internal.awv
    /* JADX INFO: renamed from: b */
    final void mo8650b(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            m8653a(iArr, 0, 4, 8, 12);
            m8653a(iArr, 1, 5, 9, 13);
            m8653a(iArr, 2, 6, 10, 14);
            m8653a(iArr, 3, 7, 11, 15);
            m8653a(iArr, 0, 5, 10, 15);
            m8653a(iArr, 1, 6, 11, 12);
            m8653a(iArr, 2, 7, 8, 13);
            m8653a(iArr, 3, 4, 9, 14);
        }
    }
}
