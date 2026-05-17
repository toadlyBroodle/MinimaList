package com.google.android.gms.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class aea extends AbstractC2095zh {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ adz f6476a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aea(adz adzVar, abd abdVar) {
        super(abdVar);
        this.f6476a = adzVar;
    }

    @Override // com.google.android.gms.internal.AbstractC2095zh
    /* JADX INFO: renamed from: a */
    public final void mo7674a() {
        adz adzVar = this.f6476a;
        adzVar.mo7376c();
        adzVar.mo7393t().m7405E().m7413a("Session started, time", Long.valueOf(adzVar.mo7384k().mo7253b()));
        adzVar.mo7394u().f6151l.m7439a(false);
        adzVar.mo7379f().m7614a("auto", "_s", new Bundle());
        adzVar.mo7394u().f6152m.m7443a(adzVar.mo7384k().mo7252a());
    }
}
