package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class bfn implements ben {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bfd f8029a;

    bfn(bfd bfdVar) {
        this.f8029a = bfdVar;
    }

    @Override // com.google.android.gms.internal.ben
    /* JADX INFO: renamed from: a */
    public final void mo9093a(String str) {
        this.f8029a.f8001j.m9540a("Auth token changed, triggering auth token refresh", null, new Object[0]);
        this.f8029a.f7994c.mo8970c(str);
    }
}
