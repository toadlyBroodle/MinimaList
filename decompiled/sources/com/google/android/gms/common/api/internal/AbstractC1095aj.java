package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.aj */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1095aj {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1093ah f5572a;

    protected AbstractC1095aj(InterfaceC1093ah interfaceC1093ah) {
        this.f5572a = interfaceC1093ah;
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo6776a();

    /* JADX INFO: renamed from: a */
    public final void m6777a(C1094ai c1094ai) {
        c1094ai.f5562f.lock();
        try {
            if (c1094ai.f5570n != this.f5572a) {
                return;
            }
            mo6776a();
        } finally {
            c1094ai.f5562f.unlock();
        }
    }
}
