package com.google.android.gms.internal;

/* JADX INFO: loaded from: classes.dex */
final class aco implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ String f6367a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f6368b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ Object f6369c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ long f6370d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ acf f6371e;

    aco(acf acfVar, String str, String str2, Object obj, long j) {
        this.f6371e = acfVar;
        this.f6367a = str;
        this.f6368b = str2;
        this.f6369c = obj;
        this.f6370d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6371e.m7594a(this.f6367a, this.f6368b, this.f6369c, this.f6370d);
    }
}
