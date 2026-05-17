package com.google.android.gms.internal;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes.dex */
final class adr implements Runnable {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ adn f6459a;

    adr(adn adnVar) {
        this.f6459a = adnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6459a.f6450a.m7650a(new ComponentName(this.f6459a.f6450a.mo7385l(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
