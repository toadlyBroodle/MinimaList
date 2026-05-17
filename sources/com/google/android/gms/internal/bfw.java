package com.google.android.gms.internal;

import com.google.firebase.database.C2226b;

/* JADX INFO: loaded from: classes.dex */
final class bfw implements bdw {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bhj f8045a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bfd f8046b;

    bfw(bfd bfdVar, bhj bhjVar) {
        this.f8046b = bfdVar;
        this.f8045a = bhjVar;
    }

    @Override // com.google.android.gms.internal.bdw
    /* JADX INFO: renamed from: a */
    public final void mo9046a(String str, String str2) {
        C2226b c2226bM9186b = bfd.m9186b(str, str2);
        this.f8046b.m9181a("Persisted write", this.f8045a.m9309b(), c2226bM9186b);
        this.f8046b.m9170a(this.f8045a.m9308a(), this.f8045a.m9309b(), c2226bM9186b);
    }
}
