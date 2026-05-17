package com.google.android.gms.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ber implements biw<bln, Void> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ Map f7957a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ boolean f7958b = true;

    ber(beo beoVar, Map map, boolean z) {
        this.f7957a = map;
    }

    @Override // com.google.android.gms.internal.biw
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Void mo8856a(bfa bfaVar, bln blnVar, Void r6) {
        this.f7957a.put(bfaVar.m9154b(), blnVar.mo9563a(this.f7958b));
        return null;
    }
}
