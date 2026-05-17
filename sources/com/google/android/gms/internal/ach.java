package com.google.android.gms.internal;

import com.google.android.gms.measurement.AppMeasurement;

/* JADX INFO: loaded from: classes.dex */
final class ach implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AppMeasurement.ConditionalUserProperty f6339a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ acf f6340b;

    ach(acf acfVar, AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        this.f6340b = acfVar;
        this.f6339a = conditionalUserProperty;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6340b.m7602d(this.f6339a);
    }
}
