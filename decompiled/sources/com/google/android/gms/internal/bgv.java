package com.google.android.gms.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class bgv implements Callable<List<? extends bjj>> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ boolean f8125a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bfa f8126b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ beo f8127c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ long f8128d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ beo f8129e;

    /* JADX INFO: renamed from: f */
    private /* synthetic */ bgo f8130f;

    bgv(bgo bgoVar, boolean z, bfa bfaVar, beo beoVar, long j, beo beoVar2) {
        this.f8130f = bgoVar;
        this.f8125a = z;
        this.f8126b = bfaVar;
        this.f8127c = beoVar;
        this.f8128d = j;
        this.f8129e = beoVar2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<? extends bjj> call() {
        if (this.f8125a) {
            this.f8130f.f8099g.mo9366a(this.f8126b, this.f8127c, this.f8128d);
        }
        this.f8130f.f8094b.m9329a(this.f8126b, this.f8129e, Long.valueOf(this.f8128d));
        return this.f8130f.m9265a(new bht(bhw.f8191a, this.f8126b, this.f8129e));
    }
}
