package com.google.android.gms.internal;

import java.io.ByteArrayInputStream;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: com.google.android.gms.internal.ih */
/* JADX INFO: loaded from: classes.dex */
final class C1636ih<T> implements InterfaceC1674js<cch, T> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ InterfaceC1640il f10783a;

    C1636ih(C1633ie c1633ie, InterfaceC1640il interfaceC1640il) {
        this.f10783a = interfaceC1640il;
    }

    @Override // com.google.android.gms.internal.InterfaceC1674js
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo10413a(cch cchVar) {
        return this.f10783a.mo11113a(new ByteArrayInputStream(cchVar.f9801b));
    }
}
