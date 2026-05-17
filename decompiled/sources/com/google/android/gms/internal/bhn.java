package com.google.android.gms.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class bhn implements bix<bhj> {

    /* JADX INFO: renamed from: b */
    private /* synthetic */ boolean f8173b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ List f8174c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ bfa f8175d;

    bhn(bhm bhmVar, boolean z, List list, bfa bfaVar) {
        this.f8173b = z;
        this.f8174c = list;
        this.f8175d = bfaVar;
    }

    @Override // com.google.android.gms.internal.bix
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean mo9333a(bhj bhjVar) {
        bhj bhjVar2 = bhjVar;
        return (bhjVar2.m9313f() || this.f8173b) && !this.f8174c.contains(Long.valueOf(bhjVar2.m9308a())) && (bhjVar2.m9309b().m9155b(this.f8175d) || this.f8175d.m9155b(bhjVar2.m9309b()));
    }
}
