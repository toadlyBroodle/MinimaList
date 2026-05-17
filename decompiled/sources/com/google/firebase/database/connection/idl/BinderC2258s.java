package com.google.firebase.database.connection.idl;

import com.google.android.gms.internal.bdc;

/* JADX INFO: renamed from: com.google.firebase.database.connection.idl.s */
/* JADX INFO: loaded from: classes.dex */
final class BinderC2258s extends AbstractBinderC2232ad {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bdc f12939a;

    BinderC2258s(C2257r c2257r, bdc bdcVar) {
        this.f12939a = bdcVar;
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2231ac
    /* JADX INFO: renamed from: a */
    public final String mo12978a() {
        return this.f12939a.mo8956a();
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2231ac
    /* JADX INFO: renamed from: b */
    public final boolean mo12979b() {
        return this.f12939a.mo8957b();
    }

    @Override // com.google.firebase.database.connection.idl.InterfaceC2231ac
    /* JADX INFO: renamed from: c */
    public final C2228a mo12980c() {
        return C2228a.m12975a(this.f12939a.mo8958c());
    }
}
