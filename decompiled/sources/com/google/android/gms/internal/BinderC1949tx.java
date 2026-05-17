package com.google.android.gms.internal;

/* JADX INFO: renamed from: com.google.android.gms.internal.tx */
/* JADX INFO: loaded from: classes.dex */
final class BinderC1949tx extends AbstractBinderC1954ub {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AsyncTaskC1945tt f11624a;

    private BinderC1949tx(AsyncTaskC1945tt asyncTaskC1945tt) {
        this.f11624a = asyncTaskC1945tt;
    }

    @Override // com.google.android.gms.internal.InterfaceC1953ua
    /* JADX INFO: renamed from: a */
    public final void mo12348a(long j, long j2) {
        this.f11624a.publishProgress(Long.valueOf(j), Long.valueOf(j2));
    }
}
