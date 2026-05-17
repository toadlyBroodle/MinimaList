package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.cd */
/* JADX INFO: loaded from: classes.dex */
final class C1143cd implements InterfaceC1145cf {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1142cc f5702a;

    C1143cd(C1142cc c1142cc) {
        this.f5702a = c1142cc;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1145cf
    /* JADX INFO: renamed from: a */
    public final void mo6923a(BasePendingResult<?> basePendingResult) {
        this.f5702a.f5699b.remove(basePendingResult);
    }
}
