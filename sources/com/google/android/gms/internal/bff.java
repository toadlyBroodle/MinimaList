package com.google.android.gms.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class bff implements bgm {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ List f8012a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bfd f8013b;

    bff(bfd bfdVar, List list) {
        this.f8013b = bfdVar;
        this.f8012a = list;
    }

    @Override // com.google.android.gms.internal.bgm
    /* JADX INFO: renamed from: a */
    public final void mo9207a(bfa bfaVar, bln blnVar) {
        this.f8012a.addAll(this.f8013b.f8007p.m9291a(bfaVar, blnVar));
        this.f8013b.m9164a(this.f8013b.m9165a(bfaVar, -9));
    }
}
