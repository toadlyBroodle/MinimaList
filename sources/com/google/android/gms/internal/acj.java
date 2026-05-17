package com.google.android.gms.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class acj implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AtomicReference f6343a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ String f6344b;

    /* JADX INFO: renamed from: c */
    private /* synthetic */ String f6345c;

    /* JADX INFO: renamed from: d */
    private /* synthetic */ String f6346d;

    /* JADX INFO: renamed from: e */
    private /* synthetic */ acf f6347e;

    acj(acf acfVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f6347e = acfVar;
        this.f6343a = atomicReference;
        this.f6344b = str;
        this.f6345c = str2;
        this.f6346d = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6347e.f6329p.m7557w().m7669a(this.f6343a, this.f6344b, this.f6345c, this.f6346d);
    }
}
