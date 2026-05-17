package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.common.q */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractBinderC1287q extends AbstractBinderC1285o {

    /* JADX INFO: renamed from: b */
    private static final WeakReference<byte[]> f5989b = new WeakReference<>(null);

    /* JADX INFO: renamed from: a */
    private WeakReference<byte[]> f5990a;

    AbstractBinderC1287q(byte[] bArr) {
        super(bArr);
        this.f5990a = f5989b;
    }

    @Override // com.google.android.gms.common.AbstractBinderC1285o
    /* JADX INFO: renamed from: c */
    final byte[] mo7234c() {
        byte[] bArrMo7235d;
        synchronized (this) {
            bArrMo7235d = this.f5990a.get();
            if (bArrMo7235d == null) {
                bArrMo7235d = mo7235d();
                this.f5990a = new WeakReference<>(bArrMo7235d);
            }
        }
        return bArrMo7235d;
    }

    /* JADX INFO: renamed from: d */
    protected abstract byte[] mo7235d();
}
