package com.google.android.gms.internal;

import com.google.android.gms.measurement.AppMeasurement;

/* JADX INFO: loaded from: classes.dex */
final class acx implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ acy f6394a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ acv f6395b;

    acx(acv acvVar, acy acyVar) {
        this.f6395b = acvVar;
        this.f6394a = acyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6395b.m7631a(this.f6394a);
        this.f6395b.f6381a = null;
        this.f6395b.mo7382i().m7667a((AppMeasurement.C2120g) null);
    }
}
