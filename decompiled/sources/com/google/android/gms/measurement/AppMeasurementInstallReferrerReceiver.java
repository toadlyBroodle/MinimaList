package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.aau;
import com.google.android.gms.internal.aaw;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements aaw {

    /* JADX INFO: renamed from: a */
    private aau f12762a;

    @Override // com.google.android.gms.internal.aaw
    /* JADX INFO: renamed from: a */
    public final BroadcastReceiver.PendingResult mo7452a() {
        return goAsync();
    }

    @Override // com.google.android.gms.internal.aaw
    /* JADX INFO: renamed from: a */
    public final void mo7453a(Context context, Intent intent) {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f12762a == null) {
            this.f12762a = new aau(this);
        }
        this.f12762a.m7451a(context, intent);
    }
}
