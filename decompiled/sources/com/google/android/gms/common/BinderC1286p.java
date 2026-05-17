package com.google.android.gms.common;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.common.p */
/* JADX INFO: loaded from: classes.dex */
final class BinderC1286p extends AbstractBinderC1285o {

    /* JADX INFO: renamed from: a */
    private final byte[] f5988a;

    BinderC1286p(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f5988a = bArr;
    }

    @Override // com.google.android.gms.common.AbstractBinderC1285o
    /* JADX INFO: renamed from: c */
    final byte[] mo7234c() {
        return this.f5988a;
    }
}
