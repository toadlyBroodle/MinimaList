package com.google.android.gms.internal;

import com.google.android.gms.measurement.AppMeasurement;

/* JADX INFO: loaded from: classes.dex */
final class aci implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ AppMeasurement.ConditionalUserProperty f6341a;

    /* JADX INFO: renamed from: b */
    private /* synthetic */ acf f6342b;

    aci(acf acfVar, AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        this.f6342b = acfVar;
        this.f6341a = conditionalUserProperty;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6342b.m7603e(this.f6341a);
    }
}
