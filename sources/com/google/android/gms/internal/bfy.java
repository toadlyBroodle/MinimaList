package com.google.android.gms.internal;

import com.google.firebase.database.C2226b;
import com.google.firebase.database.C2266d;

/* JADX INFO: loaded from: classes.dex */
final class bfy implements bdw {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bfa f8050a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ long f8051b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ C2266d.a f8052c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ bfd f8053d;

    bfy(bfd bfdVar, bfa bfaVar, long j, C2266d.a aVar) {
        this.f8053d = bfdVar;
        this.f8050a = bfaVar;
        this.f8051b = j;
        this.f8052c = aVar;
    }

    @Override // com.google.android.gms.internal.bdw
    /* JADX INFO: renamed from: a */
    public final void mo9046a(String str, String str2) {
        C2226b c2226bM9186b = bfd.m9186b(str, str2);
        this.f8053d.m9181a("setValue", this.f8050a, c2226bM9186b);
        this.f8053d.m9170a(this.f8051b, this.f8050a, c2226bM9186b);
        this.f8053d.m9202a(this.f8052c, c2226bM9186b, this.f8050a);
    }
}
