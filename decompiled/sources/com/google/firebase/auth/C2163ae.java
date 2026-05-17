package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.bae;
import com.google.firebase.auth.internal.InterfaceC2178a;
import com.google.firebase.auth.internal.InterfaceC2189l;

/* JADX INFO: renamed from: com.google.firebase.auth.ae */
/* JADX INFO: loaded from: classes.dex */
final class C2163ae implements InterfaceC2178a, InterfaceC2189l {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ FirebaseAuth f12794a;

    C2163ae(FirebaseAuth firebaseAuth) {
        this.f12794a = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.InterfaceC2189l
    /* JADX INFO: renamed from: a */
    public final void mo12847a(Status status) {
        int iM6627e = status.m6627e();
        if (iM6627e == 17011 || iM6627e == 17021 || iM6627e == 17005) {
            this.f12794a.m12843c();
        }
    }

    @Override // com.google.firebase.auth.internal.InterfaceC2178a
    /* JADX INFO: renamed from: a */
    public final void mo12845a(bae baeVar, AbstractC2198l abstractC2198l) {
        this.f12794a.m12840a(abstractC2198l, baeVar, true);
    }
}
