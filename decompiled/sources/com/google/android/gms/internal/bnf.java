package com.google.android.gms.internal;

import com.google.android.gms.p051b.C0965f;
import com.google.firebase.database.C2226b;
import com.google.firebase.database.C2266d;

/* JADX INFO: loaded from: classes.dex */
final class bnf implements C2266d.a {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ C0965f f8466a;

    bnf(C0965f c0965f) {
        this.f8466a = c0965f;
    }

    @Override // com.google.firebase.database.C2266d.a
    /* JADX INFO: renamed from: a */
    public final void mo9701a(C2226b c2226b, C2266d c2266d) {
        if (c2226b != null) {
            this.f8466a.m6218a((Exception) c2226b.m12968b());
        } else {
            this.f8466a.m6219a((Object) null);
        }
    }
}
