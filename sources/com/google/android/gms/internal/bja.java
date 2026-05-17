package com.google.android.gms.internal;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
final class bja<T> implements bjc<T> {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ bjc f8242a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ boolean f8243b;

    bja(biz bizVar, bjc bjcVar, boolean z) {
        this.f8242a = bjcVar;
        this.f8243b = z;
    }

    @Override // com.google.android.gms.internal.bjc
    /* JADX INFO: renamed from: a */
    public final void mo9208a(biz<T> bizVar) {
        bizVar.m9428a(this.f8242a, true, this.f8243b);
    }
}
