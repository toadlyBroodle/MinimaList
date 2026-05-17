package com.google.android.gms.internal;

import com.google.firebase.database.C2226b;
import com.google.firebase.database.C2278p;
import com.google.firebase.database.InterfaceC2276n;

/* JADX INFO: loaded from: classes.dex */
public final class bhl extends bex {

    /* JADX INFO: renamed from: a */
    private final bfd f8166a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC2276n f8167b;

    /* JADX INFO: renamed from: c */
    private final bjs f8168c;

    public bhl(bfd bfdVar, InterfaceC2276n interfaceC2276n, bjs bjsVar) {
        this.f8166a = bfdVar;
        this.f8167b = interfaceC2276n;
        this.f8168c = bjsVar;
    }

    @Override // com.google.android.gms.internal.bex
    /* JADX INFO: renamed from: a */
    public final bex mo9130a(bjs bjsVar) {
        return new bhl(this.f8166a, this.f8167b, bjsVar);
    }

    @Override // com.google.android.gms.internal.bex
    /* JADX INFO: renamed from: a */
    public final bji mo9131a(bjg bjgVar, bjs bjsVar) {
        return new bji(bjk.VALUE, this, C2278p.m13019a(C2278p.m13020a(this.f8166a, bjsVar.m9482a()), bjgVar.m9454c()), null);
    }

    @Override // com.google.android.gms.internal.bex
    /* JADX INFO: renamed from: a */
    public final bjs mo9132a() {
        return this.f8168c;
    }

    @Override // com.google.android.gms.internal.bex
    /* JADX INFO: renamed from: a */
    public final void mo9134a(bji bjiVar) {
        if (m9140c()) {
            return;
        }
        this.f8167b.mo4958a(bjiVar.m9457b());
    }

    @Override // com.google.android.gms.internal.bex
    /* JADX INFO: renamed from: a */
    public final void mo9135a(C2226b c2226b) {
        this.f8167b.mo4959a(c2226b);
    }

    @Override // com.google.android.gms.internal.bex
    /* JADX INFO: renamed from: a */
    public final boolean mo9137a(bex bexVar) {
        return (bexVar instanceof bhl) && ((bhl) bexVar).f8167b.equals(this.f8167b);
    }

    @Override // com.google.android.gms.internal.bex
    /* JADX INFO: renamed from: a */
    public final boolean mo9138a(bjk bjkVar) {
        return bjkVar == bjk.VALUE;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bhl) && ((bhl) obj).f8167b.equals(this.f8167b) && ((bhl) obj).f8166a.equals(this.f8166a) && ((bhl) obj).f8168c.equals(this.f8168c);
    }

    public final int hashCode() {
        return (((this.f8167b.hashCode() * 31) + this.f8166a.hashCode()) * 31) + this.f8168c.hashCode();
    }

    public final String toString() {
        return "ValueEventRegistration";
    }
}
