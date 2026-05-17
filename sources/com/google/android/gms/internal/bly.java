package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class bly implements blz {

    /* JADX INFO: renamed from: b */
    private int f8399b = 0;

    /* JADX INFO: renamed from: a */
    private List<byte[]> f8398a = new ArrayList();

    bly() {
    }

    @Override // com.google.android.gms.internal.blz
    /* JADX INFO: renamed from: a */
    public final bmn mo9635a() {
        byte[] bArr = new byte[this.f8399b];
        int length = 0;
        for (int i = 0; i < this.f8398a.size(); i++) {
            byte[] bArr2 = this.f8398a.get(i);
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return new bmn(bArr);
    }

    @Override // com.google.android.gms.internal.blz
    /* JADX INFO: renamed from: a */
    public final boolean mo9636a(byte[] bArr) {
        this.f8398a.add(bArr);
        this.f8399b += bArr.length;
        return true;
    }
}
