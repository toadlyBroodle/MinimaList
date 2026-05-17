package com.google.android.gms.internal;

import com.google.firebase.database.C2226b;

/* JADX INFO: loaded from: classes.dex */
public final class bjf implements bjj {

    /* JADX INFO: renamed from: a */
    private final bfa f8249a;

    /* JADX INFO: renamed from: b */
    private final bex f8250b;

    /* JADX INFO: renamed from: c */
    private final C2226b f8251c;

    public bjf(bex bexVar, C2226b c2226b, bfa bfaVar) {
        this.f8250b = bexVar;
        this.f8249a = bfaVar;
        this.f8251c = c2226b;
    }

    @Override // com.google.android.gms.internal.bjj
    /* JADX INFO: renamed from: a */
    public final void mo9442a() {
        this.f8250b.mo9135a(this.f8251c);
    }

    @Override // com.google.android.gms.internal.bjj
    public final String toString() {
        String strValueOf = String.valueOf(this.f8249a);
        return new StringBuilder(String.valueOf(strValueOf).length() + 7).append(strValueOf).append(":CANCEL").toString();
    }
}
