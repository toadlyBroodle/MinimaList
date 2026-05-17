package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class bgp implements Callable<List<? extends bjj>> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ boolean f8102a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ bfa f8103b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ bln f8104c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ long f8105d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ bln f8106e;

    /* JADX INFO: renamed from: f */
    private /* synthetic */ boolean f8107f;

    /* JADX INFO: renamed from: g */
    private /* synthetic */ bgo f8108g;

    bgp(bgo bgoVar, boolean z, bfa bfaVar, bln blnVar, long j, bln blnVar2, boolean z2) {
        this.f8108g = bgoVar;
        this.f8102a = z;
        this.f8103b = bfaVar;
        this.f8104c = blnVar;
        this.f8105d = j;
        this.f8106e = blnVar2;
        this.f8107f = z2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<? extends bjj> call() {
        if (this.f8102a) {
            this.f8108g.f8099g.mo9368a(this.f8103b, this.f8104c, this.f8105d);
        }
        this.f8108g.f8094b.m9330a(this.f8103b, this.f8106e, Long.valueOf(this.f8105d), this.f8107f);
        return !this.f8107f ? Collections.emptyList() : this.f8108g.m9265a(new bhy(bhw.f8191a, this.f8103b, this.f8106e));
    }
}
