package com.google.firebase.auth.internal;

import com.google.android.gms.p051b.InterfaceC0961b;
import com.google.firebase.C2224d;

/* JADX INFO: renamed from: com.google.firebase.auth.internal.k */
/* JADX INFO: loaded from: classes.dex */
final class C2188k implements InterfaceC0961b {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ RunnableC2187j f12839a;

    C2188k(RunnableC2187j runnableC2187j) {
        this.f12839a = runnableC2187j;
    }

    @Override // com.google.android.gms.p051b.InterfaceC0961b
    /* JADX INFO: renamed from: a */
    public final void mo6205a(Exception exc) {
        if (exc instanceof C2224d) {
            C2186i.f12829c.m12548a("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f12839a.f12837a.m12882b();
        }
    }
}
