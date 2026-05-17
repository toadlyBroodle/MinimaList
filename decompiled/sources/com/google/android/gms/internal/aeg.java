package com.google.android.gms.internal;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final class aeg extends AbstractC2095zh {

    /* JADX INFO: renamed from: a */
    private /* synthetic */ aef f6487a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aeg(aef aefVar, abd abdVar) {
        super(abdVar);
        this.f6487a = aefVar;
    }

    @Override // com.google.android.gms.internal.AbstractC2095zh
    /* JADX INFO: renamed from: a */
    public final void mo7674a() {
        this.f6487a.m7711y();
        this.f6487a.mo7393t().m7405E().m7412a("Sending upload intent from DelayedRunnable");
        Intent className = new Intent().setClassName(this.f6487a.mo7385l(), "com.google.android.gms.measurement.AppMeasurementReceiver");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        this.f6487a.mo7385l().sendBroadcast(className);
    }
}
