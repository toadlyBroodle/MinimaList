package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.an */
/* JADX INFO: loaded from: classes.dex */
final class C1099an implements InterfaceC1154co {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C1098am f5592a;

    C1099an(C1098am c1098am) {
        this.f5592a = c1098am;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1154co
    /* JADX INFO: renamed from: a */
    public final void mo6809a(boolean z) {
        this.f5592a.f5591q.sendMessage(this.f5592a.f5591q.obtainMessage(1, Boolean.valueOf(z)));
    }
}
