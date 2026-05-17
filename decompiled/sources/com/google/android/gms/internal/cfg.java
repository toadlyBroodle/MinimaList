package com.google.android.gms.internal;

import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
final class cfg extends C1700kr<ParcelFileDescriptor> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ cff f9909a;

    cfg(cff cffVar) {
        this.f9909a = cffVar;
    }

    @Override // com.google.android.gms.internal.C1700kr, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.f9909a.m10785a();
        return super.cancel(z);
    }
}
