package com.google.android.gms.internal;

import com.google.android.gms.p051b.InterfaceC0961b;
import com.google.firebase.C2146a;
import com.google.firebase.p053a.p054a.C2148a;

/* JADX INFO: loaded from: classes.dex */
final class bbf implements InterfaceC0961b {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bem f7726a;

    bbf(bbe bbeVar, bem bemVar) {
        this.f7726a = bemVar;
    }

    @Override // com.google.android.gms.p051b.InterfaceC0961b
    /* JADX INFO: renamed from: a */
    public final void mo6205a(Exception exc) {
        if ((exc instanceof C2146a) || (exc instanceof C2148a)) {
            this.f7726a.mo9091a(null);
        } else {
            this.f7726a.mo9092b(exc.getMessage());
        }
    }
}
